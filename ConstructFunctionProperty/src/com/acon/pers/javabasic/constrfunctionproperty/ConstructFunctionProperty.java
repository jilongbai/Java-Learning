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
		 * �������������Ϊ��a = 0 , b = 0, c = 0 , d = 90, e = 99999 , f = 99.0, g = 56.9 , h = null
		 * �ɴ˿����ܽ᣺
		 * (1)��һ�����󴴽�ʱ��������и������͵ĳ�Ա�����Զ����г�ʼ����ֵ
		 * (2)����ڶ����ʱ�򲻳�ʼ������ϵͳ���Զ�Ϊ����г�ʼ��
		 * (3)�����ͬʱ����ֵҲ�ǿ��Ե�
		 * (4)�����ͬʱ����ֵҲ�ǿ��Եģ�����������캯���ı��˶��帳��ֵ��������ݳ�Ա����ֵΪ���캯���ı���֮����Ǹ�ֵ
		 * */
		System.out.println("a = " + u.a + " , b = " + u.b + ", c = "+ u.c + " , d = " + u.d + ", e = "+ u.e +  " , f = " + u.f + ", g = "+ u.g +  " , h = " + u.h + "\n");
	}

}
