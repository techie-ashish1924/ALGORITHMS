import java.util.Scanner;

// https://hack.codingblocks.com/app/contests/3504/1065/problem

// The first line contains the number of test cases T. First 
// line of each test case contains an integer N denoting the 
// number of elements. Second line of each test case contains N 
// integers, a1, a2, a3….aN, where ai denotes the ith element of the array.

// piegon hole algo is used to find the total number of sub array where sum of
// all elements of subarray is divisible by total no of elements of array


public class Piegon_Hole_Algorithm {

    public static int fact(int n)
    {
        int mul = 1;
        while(n > 0)
        {
            mul = mul * n;
            n--;
        }
        return mul;
    }

    public static long Divisible_SubArray(long arr[])
    {

        int n = arr.length;
        int sum_arr[] = new int[n+1];
        sum_arr[0] = 1;
        long sum =0;
        for (int i = 0; i < arr.length; i++) {
            
            sum = sum + arr[i];
            int ind = (int) sum % n;
            if(ind < 0)
            {
                ind = ind + n;
            }
            sum_arr[ind]++;
        }

        long result = 0;

        for (int i = 0; i < sum_arr.length; i++) {
            
            if(sum_arr[i] >= 2)
            {
                // result = result + fact(sum_arr[i])/(fact(sum_arr[i] - 2) * fact(2));

                result = result + sum_arr[i] * (sum_arr[i] -1)/2;

            }
        }


        // for (int i = 0; i < sum_arr.length; i++) {
            // System.out.println(sum_arr[i]);
        // }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0)
        {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
           System.out.println( Divisible_SubArray(arr));
            test--;

        }
        

    }
    
}
