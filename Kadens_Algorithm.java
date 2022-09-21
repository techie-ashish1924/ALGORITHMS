import java.util.Scanner;

// Kaden 's Algorith   -> It is used to find the continous subarray with any condition.

public class Kadens_Algorithm {

    public static int Kaden(int arr[])
    {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ans = Math.max(sum, ans);
            if(sum < 0)
            {
                sum = 0;
            }
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

        System.out.println(Kaden(arr));
    }
    
}
