# Priyas
import java.util.Scanner;
public class OddOrEven
{
public static void main(String[] args)
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int a=s.nextInt();
	if(a%2 ==0)
	{
		System.out.println("You entered an EVEN Number. ");
	}
	else
	{
		System.out.println("You entered a Odd Number. ");
	}
 }
}
