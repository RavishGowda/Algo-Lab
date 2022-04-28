
class mode{
	int a,b,c;
		void caluclate() {
			
			for(int i=1;i<=10;i++)
			{ 		
			a=7*i+5;
			b=7*i+i;
			
		
				System.out.println(i+"\t"+a+"\t"+b);
				
				
				
			}
			if(a==b)
			{
				c=a;
				System.out.println("\nn0\t"+c); 
			}
			
			
				
				
				
			
			
		}
}



public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mode m=new mode();
		m.caluclate();
		
	}

}
