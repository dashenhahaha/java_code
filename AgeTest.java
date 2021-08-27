public class AgeTest
{	public static void main(String[]args){
		java.util.Scanner s  =new java.util.Scanner(System.in);
		System.out.print("请输入年龄：");
		int age=s.nextInt();
		if (age<0||age>150)
		{System.out.println("对不起，年龄是非法的");
		}else{
		if (age<=5)
		{System.out.println("婴幼儿");
		}else if (age<=10)
		{System.out.println("少儿");
		}else if (age<=18)
		{System.out.println("少年");
		}else if (age<=35)
		{System.out.println("青年");
		}else if (age<=55)
		{System.out.println("中年");
		}else if (age<=150)
		{System.out.println("老年");
		}}}
}