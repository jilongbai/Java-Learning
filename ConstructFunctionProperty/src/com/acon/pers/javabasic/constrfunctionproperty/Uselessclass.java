package com.acon.pers.javabasic.constrfunctionproperty;
//这个文档主要是用来验证类成员在初始化赋值与未赋值的问题
public class Uselessclass 
{
	int a;
	byte b;
	short c;
	int d;
	long e;
	
	float f = 23;
	double g = 56.90;
	String h;
	
	public Uselessclass(int d, long e, float f) 
	{
		this.d = d;
		this.e = e;
		this.f = f;
	}
}
