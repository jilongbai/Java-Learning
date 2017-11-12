package com.magadistudio.javabasic;

public class JavaBasic 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Java使用Unicode编码
		int i = 47;
		
		System.out.printf("i = %d.\n", i);       //%d:表示用十进制表示
		System.out.printf("i = %X.\n", i);       //%X:表示用16进制表示，因为是大写的X，所以F用大写
		System.out.printf("i = %x.\n", i);       //%x:表示用16进制表示，因为是大写的x，所以f用小写
		System.out.printf("i = %#x.\n", i);      //%#x:依然表示是用16进制输出，但是前边应该加上0x,由于x是小写，所以0x也是小写 
		System.out.printf("i = %#X.\n", i);      //%#X:依然表示是用16进制输出，但是前边应该加上0X,由于x是大写，所以0X也是大写 
		
		char ch1 = '中';
		char ch2 = '\u4e2d';   //'中'的Unicode编码就是'\u4e2d'
		
		System.out.printf("ch1 = %c.\n", ch1);
		System.out.printf("ch2 = %c.\n", ch2);
		
		//if (2)  //error:type mismatch:cannot convert from int to boolean,也就是说此处必须是一个表达式，而不像C语言中只要大于0就认为是true,
			      //在Java中是不允许的
		
		if (i > 0)
		{ 
			System.out.printf("The conditon of if instruction must be an xepression.\n");
		}

		/********************************************************************************************
			编译结果如下：
			i = 47.
			i = 2F.
			i = 2f.
			i = 0x2f.
			i = 0X2F.
			ch1 = 中.
			ch2 = 中.
			The conditon of if instruction must be an xepression.
		 ***************************************************************************************/
	}

}
