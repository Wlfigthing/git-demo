package com.example.designspringboot.Design.Express;

import java.util.HashMap;


/**
 *	变量的解析器
 * @author Administrator
 *
 */
public class VarExpression extends Expression {

	private String key; // key=a,key=b,key=c

	public VarExpression(String key) {
		this.key = key;
	}

	//
	// interpreter 根据变量的名称返回对应的值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
