/**
 * 
 */
package com.sarya.spring.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author Sarang Lohar
 * 
 *         Expression interface
 * 
 *         SpelExpression class
 * 
 *         ExpressionParser interface
 * 
 *         SpelExpressionParser class
 * 
 *         EvaluationContext interface *
 * 
 *         StandardEvaluationContext class
 * 
 *         most notably method invocation and basic string templating
 *         functionality.
 *
 */
public class TestSPEL {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		System.out.println(parser.parseExpression("new String('sarang')").getValue());

		Expression exp = parser.parseExpression("'Hello SPEL'");
		String message = (String) exp.getValue();
		System.out.println(message);
		// OR
		System.out.println(parser.parseExpression("'Hello SPEL'").getValue());
		System.out.println("______________________");

		parser = new SpelExpressionParser();
		exp = parser.parseExpression("'Welcome SPEL'.concat('!')");
		message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'Hello World'.bytes.length");
		int length = (Integer) exp.getValue();
		System.out.println(length);

		exp = parser.parseExpression("new String('hello world').toUpperCase()");
		message = exp.getValue(String.class);
		System.out.println(message);

		parser = new SpelExpressionParser();

		// arithmetic operator
		System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());
		System.out.println(parser.parseExpression("10 * 10/2").getValue());
		System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());

		// logical operator
		System.out.println(parser.parseExpression("true and true").getValue());

		// Relational operator
		System.out.println(parser.parseExpression("'sonoo'.length()==5").getValue());

		// OR

		Calculation calculation = new Calculation();
		StandardEvaluationContext context1 = new StandardEvaluationContext(calculation);

		ExpressionParser parser2 = new SpelExpressionParser();
		parser2.parseExpression("number").setValue(context1, "5");

		System.out.println(calculation.cube());
	}
}

class Calculation {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int cube() {
		return number * number * number;
	}
}
