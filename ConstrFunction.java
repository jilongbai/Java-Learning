/* ******************************************************************************
 * 包的命名规则：
 * com+公司名+个体项目(用private，individual，personal等来说明)+项目名+模块名
 * ******************************************************************************/
package com.acon.pers.javabasic.constrfunction;

class A
{
	//访问控制符：public/private/protect/default
	private int i;     //私有成员i
	private int j; 
	
	public A()   //无参的构造函数，Java的类中可以构造很多构造函数
	{
		System.out.printf("This is a construct function without any arguments!\n");
	}
	
	public A(int a, int b)   //有参的构造函数
	{
		i = a;
		j = b;
		System.out.printf("This is a construct function with two arguments.!\n");
	}
	
	public void show()
	{
		System.out.printf("i = %d, j = %d.\n", i, j);
	}
	
	//通过向外部提供按钮的方式，来给类内部的私有成员进行赋值，这样就保证了内部数据的安全性，不会被外部破坏
	public void set(int a, int b)   
	{
		i = a;
		j = b;
	}

}

class B
{
	private int i;
	private int j;
	
	public void set(int a, int b)
	{
		i = a;
		j = b;
		System.out.printf("i = %d, j = %d.\n", i, j);
	}
}
public class ConstrFunction
{
	public static void main(String[] args) 
	{
		A aa = new A();
		//A aa = new A(1, 2);  //error,与上边的aa这一局部变量
		A bb = new A();
		A cc = new A(3, 5);
		B dd = new B();
		dd.set(23,23);
		aa.set(1, 2);
		aa.show();
		bb.set(6, 0);
		bb.show();
		cc.set(12, 678);
		cc.show();
		/*****************************************************************************
		执行结果如下：
		This is a construct function without any arguments!
		This is a construct function without any arguments!
		This is a construct function with two arguments.!
		i = 23, j = 23.
		i = 1, j = 2.
		i = 6, j = 0.
		i = 12, j = 678.
		分析：
		(1)可见，任何一个类对象被生成时，一定会调用该类的构造函数，即使我们没有自己
		   生成构造函数，Java编译器也会自动为我们生成默认的构造函数
		(2)无论我们在类中生成了多少个构造函数，我们在生成类对象的时候只会调用其中一个
		   构造函数，具体调用哪一个，Java编译器会自己去做判断
		(3)
		*****************************************************************************/
	}

}
