//introduce scanner class with data type input

import java.util.Scanner;  //Scanner package

public class DataInputOutput
{		String ssn;
		String FN;
		String LS;
		int age;
		double salary;

	public static void main(String[] args)
	{
		Scanner zeal = new Scanner(System.in);
		/* zeal is reference variable for Scanner tye belongs to Scanner class object */


		System.out.print("Enter social security number  :  \n");
		String ssn = zeal.next();

		System.out.print("Enter First Name				:  \n");
		String FN =zeal.next();

		System.out.print("Enter last Name				:  \n");
		String LS=zeal.next();

		System.out.print("Enter age 					:  \n");
		int age=zeal.nextInt();

		System.out.print("Enter Salery					:  \n");
		double salary=zeal.nextDouble();


       	System.out.println(ssn);
		System.out.println(FN);
		System.out.println(LS);
		System.out.println(age);
		System.out.println(salary);

	}
}