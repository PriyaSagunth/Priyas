import java.util.Scanner;
public class Digit {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  the number : ");
		int n=s.nextInt();
		int count=0;
		while(n!=0){
			n /=10;
			count++;
		}
			
			System.out.println(count);
		}
}
