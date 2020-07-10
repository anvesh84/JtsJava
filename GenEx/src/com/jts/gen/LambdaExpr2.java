import java.util.Scanner;

interface ICalc {
	int sum(int x,int y);
}


public class LambdaExpr2 {

	public static void main(String[] args) {
		ICalc c1=(a,b) ->(a+b);
		int a,b;
		System.out.println("Enter 2 Nos  ");
		Scanner scr=new Scanner(System.in);
		a=scr.nextInt();
		b=scr.nextInt();
		System.out.println("Sum is " +c1.sum(a,b));
	}
}
