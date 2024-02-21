import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true)	//infinite loop
		{
			System.out.println("enter + for addition");
			System.out.println("enter - for subtraction");
			System.out.println("enter * for multiplication");
			System.out.println("enter / for division");
			System.out.println("enter 0 for exit");
			System.out.println("enter any choice given above");
			String choice=sc.next();
			char ch=choice.charAt(0);
			
			switch(ch)
			{
				case '+':
					System.out.println("enter any two numbers");
					int a=sc.nextInt();
					int b=sc.nextInt();
					int result=a+b;
					System.out.println("addition="+result);
					break;
				case '-':
					System.out.println("enter any two numbers");
					a=sc.nextInt();
					b=sc.nextInt();
					result=a-b;
					System.out.println("subtraction="+result);
					break;
				case '*':
					System.out.println("enter any two numbers");
					a=sc.nextInt();
					b=sc.nextInt();
					result=a*b;
					System.out.println("multiplication="+result);
					break;
				case '/':
					System.out.println("enter any two numbers");
					a=sc.nextInt();
					b=sc.nextInt();
					result=a/b;
					System.out.println("devision="+result);
					break;
				case '0':
					System.exit(0);
					break;
				default:
					System.out.println("please choose correct choice given above");
			}
		}
	}
}
