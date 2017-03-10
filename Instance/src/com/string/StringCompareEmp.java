package com.string;

/**
 * 
 * @author will.chen
 * 实例名称：字符串的比较
 * 使用函数：compareTo(), compareToIgnoreCase()和compareTo(Object String)
 * 比较两个字符串，并返回ASCII的值
 */

public class StringCompareEmp {
	public static void main(String[] args){
		String str = "Hello World";
		String str2 = "hello world";
		Object objStr = str;
		
		str.compareTo(str2);
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(objStr.toString()));
		
	}
}
