
// Sieve of Eratosthenes
// Prime Sieve Algorithm

import java.util.Scanner;

public class Prime_Sieve_Algorithm_ForPrimenumber {

    public static void Prime_Sieve(int n)
    {
        /*  kisi index par false set hai us index ko prime number 
         consider karenge */ 

         /*  kisi index par true set hai us index ko not prime number 
 consider karenge */ 

        
        
        boolean []arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < arr.length; i++) 
        {
            if(arr[i] == false)
            {
                for (int j = 2; i*j <= n; j++) 
                {
                    arr[i*j] = true;   // not prime set kiye hai.
                }
            }
            
        }

        // display prime number

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == false)
            {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Prime_Sieve(n);
    }
    
}
