package Demo;

public class ReverseAndSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Integer [] a = {4,2,3,12,8,10,42};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]+" ");
		}
		
		for(int x=0;x<=a.length;x++) {
			for(int b=x+1;b<=a.length-1;b++) {
				int temp1 = 0;  
				if(a[x]<a[b]) {
					temp1 = a[x];
					a[x]=a[b];
					a[b]=temp1;	
				//System.out.print(temp1+" ");
				}		
				
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
