public class AgeTest
{	public static void main(String[]args){
		java.util.Scanner s  =new java.util.Scanner(System.in);
		System.out.print("���������䣺");
		int age=s.nextInt();
		if (age<0||age>150)
		{System.out.println("�Բ��������ǷǷ���");
		}else{
		if (age<=5)
		{System.out.println("Ӥ�׶�");
		}else if (age<=10)
		{System.out.println("�ٶ�");
		}else if (age<=18)
		{System.out.println("����");
		}else if (age<=35)
		{System.out.println("����");
		}else if (age<=55)
		{System.out.println("����");
		}else if (age<=150)
		{System.out.println("����");
		}}}
}