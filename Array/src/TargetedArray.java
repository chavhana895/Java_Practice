
public class TargetedArray 
{
	public static void main(String[] args) {
		
		int a[]= {2,3,1,2,3,6,3,4,14};
		
		int tar=3;
		int k=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==tar) {
				k=i;
				break;
			}
		}
			int count=0;
		for (int j = 0; j <=k; j++) {
			if(tar>a[j]) {
				count++;
			}
		}
		if(count==k) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
			
		}
			
		}


