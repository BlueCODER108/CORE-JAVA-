import java.util.Scanner;
class Todoscan2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Value: ");
		int a= sc.nextInt();

		Scanner sx = new Scanner(System.in);
		System.out.println("Enter the Second Value: ");
		int b= sx.nextInt();


		int c= a+b;
		System.out.println("The First Value is : " +a);
		System.out.println("The Second Value is : " +b);

		System.out.println("The Sum of the both the values is : " +c);

	}
}
