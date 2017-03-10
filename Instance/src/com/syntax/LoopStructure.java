package com.syntax;

public class LoopStructure {

	/**
	 * 三种循环：
	 * 		for循环
	 * 			一般循环
	 * 			增强循环：主要用于数组的遍历中
	 * 		while() 
	 * 		do...while()
	 * 	
	 * 		while循环中括号内部的表达式为布尔表达式，应该填写true or false
	 * 
	 * 
	 */
	
	public static void main(String[] args){
		continueKeyword();
	}
	
	
	/**
	 * 语法结构：
	 * 	while(boolean){
	 * 		//循环内容
	 * 	}
	 */
	public static void whileLoop(){
		//打印0-9的值
		int i = 0;
		while(i < 10) {
			System.out.println("value of i : " + i);
			i++;
		}
	}
	
	/**
	 * 语法结构：
	 * 		do{
	 * 			//循环内容
	 * 		}while(boolean);
	 * 
	 * 只有此循环语句后面是加分号，其他的循环语句代码块后面不加分号
	 * 这个和while的不同之处在于 此循环是先执行 后判定对错
	 * 
	 */
	public static void doWhileLoop(){
		//打印11到20的值
		int i = 10;
		do{
			i++;
			System.out.println("value of i : " + i);
		}while(i < 20);
		
	}
	
	/**
	 * For循环：
	 * 	语法结构：
	 * 		for(初始化值;布尔表达式; 更新) {
	 * 			//循环语句
	 * 		}
	 * 
	 * 执行步骤：
	 * 	1. 初始化执行步骤，但是要先申明变量类型，就像例子中的int，可以申明多个循环变量，但是也可以不申明
	 * 	2. 然后检测第二个参数-布尔表达式， 当此值为true的时候，才会执行接下来的循环语句。
	 * 	3. 每次执行一次以后，就会更新循环控制变量，就是第三个值
	 * 	4. 然后在此检测布尔表达式，依次循环第二和第三步骤
	 * 
	 */
	public static void forLoop(){
		//打印21到30的值
		for(int i=21; i<=30; i++){
			System.out.println(i);
		}
	}
	
	/**
	 * 增强For循环：
	 * 	历史：在Java5之后出现的
	 * 	用处：主要用于数组的遍历
	 * 	语法格式：
	 * 		for(申明语句 : 表达式){
	 * 			//执行语句
	 * 		}
	 * 	申明语句：在此循环中什么新的局部变量，和数组元素中的类型匹配
	 * 		作用于：每个局部变量的作用域在每个循环语句块中，其值此时和数据元素相等
	 * 	表达式：就是要访问的数组名，或者返回值为数组的方法	
	 * 
	 */
	
	public static void forLoopPlus(){
		int[] numbers = {10, 20, 30, 40, 50};
		
		for(int x : numbers ){
			System.out.print(x + ",");
		}
		
		System.out.println();
		
		String[] names = {"James", "Larry", "Tom", "Lacy"};
		for(String name : names ) {
			System.out.println(name + ",");
		}
	}
	
	/**
	 * break关键字：
	 * 	作用范围： 作用于循环语句和switch语句中，用来跳出整个语句块
	 * 	作用：跳出循环，执行下一个语句
	 * 
	 */
	public static void breakKeyWord() {
		int[] numbers = {10, 20, 30, 40, 50};
		
		for( int number : numbers) {
			if(number == 40){
				break;//当number为40的时候跳出循环，就是不执行50的打印
			}
			System.out.print(number + ",");
		}
	}
	
	/**
	 * continue关键字
	 * 	作用范围： 用于所有的循环控制结构中
	 * 	作用： 跳出此代码块内部的循环，进行下一个循环
	 * 		语句区别：
	 * 		For循环：continue语句执行后跳转到循环控制变量更新语句
	 * 		While和do...While中：跳转到boolean表达式判断语句
	 * 
	 */
	public static void continueKeyword(){
		int[] numbers = {10, 20, 30, 40, 50};
		
		for( int number : numbers ){
			if( number == 30 ){
				continue;
			}
			System.out.print(number + ",");
		}
	}
	
}
