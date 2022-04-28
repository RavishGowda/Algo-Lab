import java.util.Random;
import java.util.Scanner;
 
/**
 * Write a program to sort an array of numbers using a Selection Sort
 * Also known as an Exchange Sort
 *
 * @author http://learn-java-by-example.com
 *
 */
public class SortingTechnique {
 
   public static void main(String[] args) {
 
      // Create an array of random numbers to sort
 
      int[] data = generateData();
      
      
 
      // Display the unsorted data
 
      System.out.println("Unsorted data:");
      printArray(data);
 
      // Sort the array
      long start = System.nanoTime();

      selectionSort(data);

      long end = System.nanoTime();

      float sec=(end-start)/ 1000000000F;

 
     
 
      // Display the sorted data
 
      System.out.println(" Selection Sorted data:");
      printArray(data);
      System.out.println("\nThe time taken to sort is "+sec+"s");
     
      long start1 = System.nanoTime();

      insertionSort(data);

      long end1 = System.nanoTime();

      float sec1=(end1-start1)/ 1000000000F;
      
      System.out.println("Insertion Sorted data:");
      printArray(data);
      System.out.println("\nThe time taken to sort is "+sec1+"s");
      
      long start2 = System.nanoTime();

      mergesort(data,0,data.length-1);

      long end2 = System.nanoTime();

      float sec2=(end2-start2)/ 1000000000F;
      System.out.println("merge Sorted data:");
      printArray(data);
      System.out.println("\nThe time taken to sort is "+sec2+"s");
      
      
      
      
      
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
     
	   Scanner in = new Scanner(System.in);

	       System.out.print("Enter the number of elements to be sorted: ");

	   int n = in.nextInt();
	   Random random = new Random();
 
      int[] data = new int[10];
      for (int i=0; i<n; i++) {
         data[i] = random.nextInt(100);
      }
      return data;
   }
 
   public static void insertionSort(int[] data) {
	    for (int i = 1; i < data.length; i++) {
	        int current = data[i];
	        int j = i - 1;
	        while(j >= 0 && current < data[j]) {
	        	data[j+1] = data[j];
	            j--;
	        }
	        // at this point we've exited, so j is either -1
	        // or it's at the first element where current >= a[j]
	        data[j+1] = current;
	    }
	}
   
   //merge sort
   
   static void mergesort(int a[], int low, int high)

   {

   int mid;

   if(low < high)

   {

   mid = (low+high)/2;

   mergesort(a, low, mid);

   mergesort(a, mid+1, high);

   merge(a, low, mid, high);

   }

   }

   static void merge(int a[], int low, int mid, int high)

   {

   int i, j, h, k, b[]= new int[100000];

   h=low; i=low; j=mid+1;

   while((h<=mid) && (j<=high))

   {

   if(a[h] < a[j])

   {

   b[i]=a[h];

   h=h+1;

   }

   else

   {

   b[i] = a[j];

   j=j+1;

   }

   i = i+1;

   }

   if(h > mid)

   {

   for(k=j; k<=high; k++)

   {

   b[i]=a[k];

   i= i+1;

   }

   }

   else

   {

   for(k=h;k<=mid;k++)

   {

   b[i]=a[k];

   i= i+1;

   }

   }

   for(k=low; k<= high; k++)

   a[k] = b[k];

   }
   
   private static void printArray(int[] data) {
      for (int i=0; i<data.length; i++) {
         System.out.print(data[i]);
         System.out.print(", ");
      }
      System.out.println();
   }
   
   
   
   
}
