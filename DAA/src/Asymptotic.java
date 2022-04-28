import java.lang.*;
import java.util.Scanner;
class Caluclate{
		
	void caluclate() {
		int f=1;
		for(int i=1;i<2;i=i+10)
		{
			System.out.print("\t"+i+"\t"+(i*i)+"\t\t"+(Math.log(i))+"\t\t");
			System.out.print("\t\t\t"+(i * Math.log(i))+"\t\t"+(Math.pow(2, i))+"\t");
			
			f *=i;
			System.out.print(" \t\t\t\t"+f+"\n");
		
		}
		for(int i=2;i<=100;i=i+10)
		{
			System.out.print("\t"+i+"\t"+(i*i)+"\t\t"+(Math.log(i))+"\t");
			System.out.print("\t"+(i * Math.log(i))+"\t"+(Math.pow(2, i))+"\t");
			
			f *=i;
			System.out.print(" \t\t\t"+f+"\n");
			
		}
		for(int j=1000;j<=2000;j=j+2000)
		{
			System.out.print("\t"+j+"\t"+(j*j)+"\t"+(Math.log(j))+"\t"+(j * Math.log(j))+"\t"+(Math.pow(2, j))+"\t");
			f *=j;
			System.out.print("\t"+f);
			
		}
			
	}
	

	
	/*void calnfac() {
		int f=1;
		for(int i=1;i<=100;i=i+10)
			{
				
			}
		for(int i=1;i<=100;i=i+10)
			
		
		for(int j=1000;j<=2000;j=j+2000)
		{
			
		}
		
		for(int j=1000;j<=2000;j=j+2000)
			
	}*/
	
}

public class Asymptotic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caluclate c=new Caluclate();
		
		c.caluclate();
		
		
	}

}
