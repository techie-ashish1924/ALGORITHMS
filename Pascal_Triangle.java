import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Pascal_Triangle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col = 0;
        int str=0;
        while(col < n)
        {
            // int nu = col;

            int i = 0;
            int ncr = 1;
            while(i <= str)
            {
                System.out.print(ncr + " ");
                ncr = ((col-i)*ncr)/(i+1);
                i++;
            }
            System.out.println();
            col++;
            str++;
        }


    }
    
}
