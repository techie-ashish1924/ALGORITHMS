import java.util.Scanner;

public class Insertion_Sort {

    // SWAP METHOD

    // public static void Swap(int arr[],int f,int l)
    // {
        // int temp = arr[f];
        // arr[f] = arr[l];
        // arr[l] = temp;
    // }

    // INSERTION SORT METHOD

    public static void insertion_sort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int j = i-1;
            int data = arr[i];
            while(arr[j]  >= data && j>=0)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = data;
            
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

        insertion_sort(arr);
        Display(arr);

    }
    
}
