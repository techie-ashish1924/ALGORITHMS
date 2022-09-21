
// to find the number of subarray which multiply is less than k.

import java.util.Scanner;

public class Variable_Size_Window_713 {

    public static int Calculate(int arr[],int k)
    {
        int strt = 0;
        int end = 0;
        int ans = 0;
        int mul = 1;
        
        while(end < arr.length)
        {

            // Window grow kare........

            mul = mul * arr[end];

            // window shrink (size kam kre) kare

            while(mul >= k && strt <= end)
            {
                mul = arr[strt]/mul;
                strt++;
            }
            // calculate kare.......

            ans = ans + end - strt + 1;
            end++;
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

        System.out.println(Calculate(arr, k));
    }
    
}
