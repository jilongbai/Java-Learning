package com.acon.pers.javabasic.constrfunctionproperty;

public class Basketball extends ball
{
	private int volumn;
	
	public Basketball(String name, String color, int hardness, int radius, int volumn)
	{ 
		super(name, color, hardness, radius);
		this.volumn = volumn;
	}
	
	//�˴����ǶԱȾͿ��Է�����ͨ�ķ������з���ֵ������void��������
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
