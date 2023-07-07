package general;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {10,2,13,7,6,11};
     int len=arr.length;
     int temp;
     
      for(int i=len;i>=0;i--)
      {
    	  for(int j=0;j<len-1;j++)
    	  {
    		  if(arr[j]>arr[j+1])
    		  {
    			  temp=arr[j];
    			  arr[j]=arr[j+1];
    			  arr[j+1]=temp;
    		  }
    			  
    	  }
      }
      System.out.println("Sorted elements:");
    	for(int i=0;i<len;i++)
    	{
    		System.out.print(arr[i]+"  ");
    	}
      }
	}


