import java.util.Scanner;

public class Power_In_logn {

    public static int Power(int a,int b)
    {
        if(b ==0 )
        {
            return 1;
        }

        int ans = Power(a, b/2);
        ans = ans * ans;

        if(b%2 == 1)
        {
            ans = ans * a;
        }

        return ans;
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Power(a, b));
    }
    
}
