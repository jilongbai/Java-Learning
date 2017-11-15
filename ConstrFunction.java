/* ******************************************************************************
 * ������������
 * com+��˾��+������Ŀ(��private��individual��personal����˵��)+��Ŀ��+ģ����
 * ******************************************************************************/
package com.acon.pers.javabasic.constrfunction;

class A
{
	//���ʿ��Ʒ���public/private/protect/default
	private int i;     //˽�г�Աi
	private int j; 
	
	public A()   //�޲εĹ��캯����Java�����п��Թ���ܶ๹�캯��
	{
		System.out.printf("This is a construct function without any arguments!\n");
	}
	
	public A(int a, int b)   //�вεĹ��캯��
	{
		i = a;
		j = b;
		System.out.printf("This is a construct function with two arguments.!\n");
	}
	
	public void show()
	{
		System.out.printf("i = %d, j = %d.\n", i, j);
	}
	
	//ͨ�����ⲿ�ṩ��ť�ķ�ʽ���������ڲ���˽�г�Ա���и�ֵ�������ͱ�֤���ڲ����ݵİ�ȫ�ԣ����ᱻ�ⲿ�ƻ�
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
		//A aa = new A(1, 2);  //error,���ϱߵ�aa��һ�ֲ�����
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
		ִ�н�����£�
		This is a construct function without any arguments!
		This is a construct function without any arguments!
		This is a construct function with two arguments.!
		i = 23, j = 23.
		i = 1, j = 2.
		i = 6, j = 0.
		i = 12, j = 678.
		������
		(1)�ɼ����κ�һ�����������ʱ��һ������ø���Ĺ��캯������ʹ����û���Լ�
		   ���ɹ��캯����Java������Ҳ���Զ�Ϊ��������Ĭ�ϵĹ��캯��
		(2)�������������������˶��ٸ����캯��������������������ʱ��ֻ���������һ��
		   ���캯�������������һ����Java���������Լ�ȥ���ж�
		(3)
		*****************************************************************************/
	}

}
