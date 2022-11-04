import java.util.Scanner;

public class Quick_Sort {

    // DISPLAY FUNCTION

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // SWAP FUNCTION

    public static void Swap(int arr[],int f,int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    // PARTITION FUNCTION

    public static int Partition(int arr[],int si,int ei)
    {
        int pi = si;
        int key = arr[ei];

        for (int i = si; i < ei; i++) 
        {
            if(arr[i] < key)
            {
                Swap(arr, pi, i);
                pi++;
            }
        }
        Swap(arr, pi, ei);

        return pi;
    }

    // QUICK SORT FUNCTION

    public static void quicksort(int arr[],int si,int ei)
    {
        if(si>ei)
        {
            return;
        }
        int ind = Partition(arr, si, ei);
        quicksort(arr, 0, ind-1);
        quicksort(arr, ind+1, ei);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n-1);

        Display(arr);
    }
    
}
