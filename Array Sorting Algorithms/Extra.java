import java.util.Scanner;

public class Extra {

    public static int Count(int arr[][],int i,int j,int ans)
    {
        if(i == arr.length && j== arr[0].length)
        {
            return ans;
        }
        if(arr[i+1][j] > arr[i][j+1] && i<arr.length-2 && j<arr[0].length-2)
        {
            ans  = Count(arr,i+1,j,ans++);
        }
        
        if(arr[i+1][j] < arr[i][j+1] && i<arr.length-2 && j<arr[0].length-2)
        {
            ans = Count(arr,i,j+1,ans++);
        }
        
        else{
            return 0;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-->0)
	    {
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        int arr[][] = new int[n][m];
	        
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                arr[i][j] = sc.nextInt();
	            }
	        }

            System.out.println(Count(arr, 0,0, 0));
	    }
    }
    
}
