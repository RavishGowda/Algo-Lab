import java.util.Random;
import java.util.*;

public class Binary_Search
{
	public static int binarySearch(int search, int[] array, int start, int end){
		
		int middle = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		
		if (search < array[middle]){
			return binarySearch(search, array, start, middle - 1);
		}
		
		if (search > array[middle]){
			return binarySearch(search, array, middle + 1, end);
		}
		
		if (search == array[middle]){
			return middle;
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Binary_Search b=new Binary_Search();
		
		int[] data = generateData();
			
		System.out.println("Unsorted data:");
	      printArray(data);
	      selectionSort(data);
	 	 
	      // Display the sorted data

	      System.out.println("Sorted data:");
	      printArray(data);
	      
	      
	
			

         Scanner sc=new Scanner(System.in);
            System.out.println("Enter the key element");
            int key=sc.nextInt();
            
           
            
            int result=binarySearch(key,data,0,data.length-1);
            int pos=result+1;
			
			if(result==-1)
				System.out.println("Not found");
			else
				System.out.println("Element found at index "+pos);
			
		

	}
	
	

	public static void selectionSort(int[] data){  
	       for (int i = 0; i < data.length - 1; i++)  
	       {  
	           int index = i;  
	           for (int j = i + 1; j < data.length; j++){  
	               if (data[j] < data[index]){  
	                   index = j;//searching for lowest index  
	               }  
	           }  
	           int smallerNumber = data[index];   
	           data[index] = data[i];  
	           data[i] = smallerNumber;  
	       }  
	   } 

       
     
  
	
	
	
	private static int[] generateData() {
	      Random random = new Random();
	 
	      int[] data = new int[10];
	      for (int i=0; i<data.length; i++) {
	         data[i] = random.nextInt(100);
	      }
	      return data;
	   }
	
	 private static void printArray(int[] data) {
	      for (int i=0; i<data.length; i++) {
	         System.out.print(data[i]);
	         System.out.print(", ");
	      }
	      System.out.println();
	   }
	 
}


