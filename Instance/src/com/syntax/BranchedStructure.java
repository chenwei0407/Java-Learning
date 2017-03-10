package com.syntax;

public class BranchedStructure {

	public static void main(String[] args){
		ifElseStatement();
	}
	/**
	 * if语句
	 * 语句结构：
	 * 	if(boolean){
	 * 		//执行语句
	 * 	}
	 * 
	 * 作用：如果boolean表达式里的条件为true，执行代码块中的语句
	 * 
	 */
	public static void ifStatement(){
		int x = 10;
		if( x < 20 ){
			System.out.println("This is a IF statement！");
		}
	}
	
	/**
	 * if...else 语句
	 * 语法结构：
	 * 	if(boolean) {
	 * 		//执行语句，如果boolean为true
	 * 	} else {
	 * 		//执行语句，如果boolean为false
	 * 	}
	 * 
	 */
	public static void ifElseStatement(){
		int x = 30;
		
		if( x < 20) {
			System.out.println("This is a IF statement");
		} else {
			System.out.println("This is an ELSE statement");
		}
	}
	
	/**
	 * if...else if ...else语句
	 */
	public static void ifElseifElse(){
		
	}
}
