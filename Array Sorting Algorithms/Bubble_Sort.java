import java.util.Scanner;

public class Bubble_Sort {

    public static void bubble_sort(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }        
            }
        }
    }

    // Display method
    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr);
        Display(arr);
    }
}
