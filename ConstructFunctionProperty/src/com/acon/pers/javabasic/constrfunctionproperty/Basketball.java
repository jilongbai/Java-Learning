package com.acon.pers.javabasic.constrfunctionproperty;

public class Basketball extends ball
{
	private int volumn;
	
	public Basketball(String name, String color, int hardness, int radius, int volumn)
	{ 
		super(name, color, hardness, radius);
		this.volumn = volumn;
	}
	
	//此处我们对比就可以发现普通的方法是有返回值，包括void返回类型
	public void bouncing()
	{
		System.out.println("The "+this.name + " is bouncing.\n");
	}
	
	public void deflate()
	{
		System.out.println("The "+ this.color +" " + this.name + " which volumn is " + this.volumn + " is deflated.\n");
	}
	
	public void inflate()
	{
		System.out.println("The "+ this.color +" " + this.name + " which volumn is " + this.volumn + " is inflating.\n");
	}
}
