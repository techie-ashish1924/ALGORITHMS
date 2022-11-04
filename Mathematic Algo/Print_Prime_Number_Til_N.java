import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Print_Prime_Number_Til_N {

    // is prime function

    public static boolean IsPrime(int n)
    {
        int div = 2;

        while(div * div <= n)
        {
            if(n%div == 0)
            {
                return false;
            }
            div++;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if(IsPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    
}
