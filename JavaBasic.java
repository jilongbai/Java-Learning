package com.magadistudio.javabasic;

public class JavaBasic 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Javaʹ��Unicode����
		int i = 47;
		
		System.out.printf("i = %d.\n", i);       //%d:��ʾ��ʮ���Ʊ�ʾ
		System.out.printf("i = %X.\n", i);       //%X:��ʾ��16���Ʊ�ʾ����Ϊ�Ǵ�д��X������F�ô�д
		System.out.printf("i = %x.\n", i);       //%x:��ʾ��16���Ʊ�ʾ����Ϊ�Ǵ�д��x������f��Сд
		System.out.printf("i = %#x.\n", i);      //%#x:��Ȼ��ʾ����16�������������ǰ��Ӧ�ü���0x,����x��Сд������0xҲ��Сд 
		System.out.printf("i = %#X.\n", i);      //%#X:��Ȼ��ʾ����16�������������ǰ��Ӧ�ü���0X,����x�Ǵ�д������0XҲ�Ǵ�д 
		
		char ch1 = '��';
		char ch2 = '\u4e2d';   //'��'��Unicode�������'\u4e2d'
		
		System.out.printf("ch1 = %c.\n", ch1);
		System.out.printf("ch2 = %c.\n", ch2);
		
		//if (2)  //error:type mismatch:cannot convert from int to boolean,Ҳ����˵�˴�������һ�����ʽ��������C������ֻҪ����0����Ϊ��true,
			      //��Java���ǲ������
		
		if (i > 0)
		{ 
			System.out.printf("The conditon of if instruction must be an xepression.\n");
		}

		/********************************************************************************************
			���������£�
			i = 47.
			i = 2F.
			i = 2f.
			i = 0x2f.
			i = 0X2F.
			ch1 = ��.
			ch2 = ��.
			The conditon of if instruction must be an xepression.
		 ***************************************************************************************/
	}

}
