package com.acon.pers.javabasic.constrfunctionproperty;

//注意此处的雷鸣ball其实是不合乎规范的，首字母应该大写Ball,这才是正确的形式
public class ball 
{
	//下面几个成员属性的访问控制符必须为public，否则在子类继承中不能使用，尤其是当在继承的子类中重写方法的时候，如果此处定义的访问控制符为Private,则重写的时候回有error警告
	public String name;
	public String color;
	public int hardness;
	public int radius;
	
	//注意，此处构造函数是没有任何返回值的，包括void类型的返回值也没有
	public ball(String name, String color, int hardness, int radius) 
	{
		this.name = name;
		this.color = color;
		this.hardness = hardness;
		this.radius = radius;
	}
	
	
	//此处我们对比就可以发现普通的方法是有返回值，包括void返回类型
	public void bouncing()
	{
		System.out.println("The "+this.name + " is bouncing.\n");
	}
	
	public void deflate()
	{
		System.out.println("The "+ this.color +" " + this.name + " is deflated.\n");
	}
	
	public void inflate()
	{
		System.out.println("The "+this.hardness + " hardness of the "+ this.name + " is inflating.\n");
	}
}
