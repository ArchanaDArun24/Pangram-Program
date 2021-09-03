//pangram program in java
package String;
import java.util.*;
public class PangramProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		x=x.replace(" ", "");
		x=x.toUpperCase();
		System.out.println(x);
		char y[]=x.toCharArray();
		int size=x.length();
		char a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
		while(i!=size)
		{
			int index=y[i]-65;
			a[index]=1;
			++i;
		}
		i=0;
		while(i!=26)
		{
			if(a[i]==1)
			{
				++i;
			}
			else
			{
				System.out.println("non-pangram");
				System.exit(0);
			}
		}
		System.out.println("pangram");
	}
}
