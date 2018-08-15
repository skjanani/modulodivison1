package janani;
import java.util.Scanner;
public class ModuloDivison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,n1,a,b;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
n1=ja.nextInt();
a=n%n1;
b=n/n1;
System.out.println(a);
System.out.println(b);
	}

}
