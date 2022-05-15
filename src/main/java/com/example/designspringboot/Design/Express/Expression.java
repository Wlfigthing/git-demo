package com.example.designspringboot.Design.Express;

import java.util.HashMap;

/**
 * 抽象表达式，通过HashMap键值对，可以获取到变量的值
 * 
 * @author Administrator
 *
 */
public abstract class Expression {

	// HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
