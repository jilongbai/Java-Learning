package com.magadistudio.triangle;

//java中的函数也叫方法，方法逻辑意义代表的就是一个事物可以执行的操作
//处我们做的只是一个模型，而没有具体去定义一个事物
//这是一种哲学思想
class TriangleObject
{
	//Java语言是一种哲学思想，模拟一个事物，其属性一般有静态属性和动态属性，只要两个属性模拟出来就可以模拟这个事物
	//a,b,c是TriangleObject这一事物的静态属性
	int a;
	int b;
	int c;
	
	//下面的两个函数则是TriangleObject该事物的动态属性
	//不用定义形参，因为下面的函数是隶属于某一事物，该事物已经对一些参数做了定义，可以直接用，而不用再次输入参数
	int perimeter()
	{
		return a + b +c;
	}
	
	double area()
	{
		double p = (a+b+c) / 2;
		
		//return sqrt(p*(p-a)*(p-b)*(p-c));
		//注意此处的sqrt的函数在C语言中需要调用相应的库函数，而Java中则通过另外一种方式进行包含
		//Java中math这个大工具里边的小工具sqrt
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}

public class Triangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int i;		
		//int * p = (int *)malloc(sizeof(int));
		//C语言中生成一个事物的方法
		//TriangleObject * q = (TriangleObject *)malloc(sizeof(TriangleObject));
		//Java中生成一个事物的方法则是直接用new来代替上面的malloc函数
		
		TriangleObject s = new TriangleObject();
		
		s.a = 3;
		s.b = 4;
		s.c = 5;
		
		//Java中的printf函数
		System.out.printf("The perimeter is :%d, The area is %f.",s.perimeter(), s.area());
	}

}




















