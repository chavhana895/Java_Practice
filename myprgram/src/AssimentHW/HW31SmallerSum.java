package AssimentHW;

public class HW31SmallerSum {

	public static void main(String[] args) {
		int arr[]= {5,1,3,4,7};
		int ans = 0; 
		int val=12;
		int n=3;
		for (int i = 0; i < arr.length; i++) 
		{	  
			for (int j = i+1; j < arr.length; j++) 
		    { 
		         for (int k = j+1; k < arr.length; k++)
		         {
		        	 if (arr[i] + arr[j] + arr[k] < val)
		        	 {
		        		 System.out.println(arr[i]+" "+ arr[j]+ " "+arr[k]);
		              
		                   ans++;
		        	 }
		          }
		       } 
		    } 
		  System.out.println(ans);

	}

}
