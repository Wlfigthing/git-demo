package com.example.designspringboot.Design.Express;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

	private Expression expression;

	public Calculator(String expStr) { // expStr = a+b

		Stack<Expression> stack = new Stack<>();
		char[] charArray = expStr.toCharArray();// [a, +, b]

		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': //
				left = stack.pop();// ��stackȡ��left => "a"
				right = new VarExpression(String.valueOf(charArray[++i]));// ȡ���ұ��ʽ "b"
				stack.push(new AddExpression(left, right));// Ȼ����ݵõ�left �� right ���� AddExpresson����stack
				break;
			case '-': // 
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				//�����һ�� Var �ʹ���Ҫ�� VarExpression ���󣬲�push�� stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}
}