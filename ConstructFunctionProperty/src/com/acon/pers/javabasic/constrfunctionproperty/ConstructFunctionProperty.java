package com.acon.pers.javabasic.constrfunctionproperty;


public class ConstructFunctionProperty 
{

	public static void main(String[] args)
	{
		ball b = new ball("basketball", "blue", 20, 25);
		
		b.bouncing();
		
		b.deflate();
		
		b.inflate();
		
		Basketball basket = new Basketball("basketball", "Brown", 20, 25, 99);
		
		basket.deflate();
		
		Uselessclass u = new Uselessclass(90, 99999, 99);

		/*
		 * 下列语句输出结果为：a = 0 , b = 0, c = 0 , d = 90, e = 99999 , f = 99.0, g = 56.9 , h = null
		 * 由此可以总结：
		 * (1)当一个对象创建时，会对其中各种类型的成员变量自动进行初始化赋值
		 * (2)如果在定义的时候不初始化，则系统会自动为其进行初始化
		 * (3)定义的同时赋初值也是可以的
		 * (4)定义的同时赋初值也是可以的，但是如果构造函数改变了定义赋初值，则该数据成员最终值为构造函数改变了之后的那个值
		 * */
		System.out.println("a = " + u.a + " , b = " + u.b + ", c = "+ u.c + " , d = " + u.d + ", e = "+ u.e +  " , f = " + u.f + ", g = "+ u.g +  " , h = " + u.h + "\n");
	}

}
