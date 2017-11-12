package com.magadistudio.triangle;

//java�еĺ���Ҳ�з����������߼��������ľ���һ���������ִ�еĲ���
//����������ֻ��һ��ģ�ͣ���û�о���ȥ����һ������
//����һ����ѧ˼��
class TriangleObject
{
	//Java������һ����ѧ˼�룬ģ��һ�����������һ���о�̬���ԺͶ�̬���ԣ�ֻҪ��������ģ������Ϳ���ģ���������
	//a,b,c��TriangleObject��һ����ľ�̬����
	int a;
	int b;
	int c;
	
	//�����������������TriangleObject������Ķ�̬����
	//���ö����βΣ���Ϊ����ĺ�����������ĳһ����������Ѿ���һЩ�������˶��壬����ֱ���ã��������ٴ��������
	int perimeter()
	{
		return a + b +c;
	}
	
	double area()
	{
		double p = (a+b+c) / 2;
		
		//return sqrt(p*(p-a)*(p-b)*(p-c));
		//ע��˴���sqrt�ĺ�����C��������Ҫ������Ӧ�Ŀ⺯������Java����ͨ������һ�ַ�ʽ���а���
		//Java��math����󹤾���ߵ�С����sqrt
		
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
		//C����������һ������ķ���
		//TriangleObject * q = (TriangleObject *)malloc(sizeof(TriangleObject));
		//Java������һ������ķ�������ֱ����new�����������malloc����
		
		TriangleObject s = new TriangleObject();
		
		s.a = 3;
		s.b = 4;
		s.c = 5;
		
		//Java�е�printf����
		System.out.printf("The perimeter is :%d, The area is %f.",s.perimeter(), s.area());
	}

}




















