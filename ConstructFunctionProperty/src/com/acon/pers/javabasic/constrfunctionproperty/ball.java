package com.acon.pers.javabasic.constrfunctionproperty;

//ע��˴�������ball��ʵ�ǲ��Ϻ��淶�ģ�����ĸӦ�ô�дBall,�������ȷ����ʽ
public class ball 
{
	//���漸����Ա���Եķ��ʿ��Ʒ�����Ϊpublic������������̳��в���ʹ�ã������ǵ��ڼ̳е���������д������ʱ������˴�����ķ��ʿ��Ʒ�ΪPrivate,����д��ʱ�����error����
	public String name;
	public String color;
	public int hardness;
	public int radius;
	
	//ע�⣬�˴����캯����û���κη���ֵ�ģ�����void���͵ķ���ֵҲû��
	public ball(String name, String color, int hardness, int radius) 
	{
		this.name = name;
		this.color = color;
		this.hardness = hardness;
		this.radius = radius;
	}
	
	
	//�˴����ǶԱȾͿ��Է�����ͨ�ķ������з���ֵ������void��������
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
