
// to find the maximum sum of subarray of length k.

import java.util.Scanner;

public class Fixed_Window {

    public static int Maximum_Sum(int arr[],int k)
    {
        int ans = Integer.MIN_VALUE;

        // for first window 

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        ans = sum;
        // System.out.println(ans);

        // for all subarray

        for (int i = k; i < arr.length; i++) {
            
            sum += arr[i];
            sum -= arr[i-k];

            ans = Math.max(ans,sum);
        }

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int k = sc.nextInt();

       System.out.println( Maximum_Sum(arr, k));
    }
    
}
