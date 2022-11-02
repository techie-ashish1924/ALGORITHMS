import java.util.Scanner;

public class Selection_Sort {

    // swap function

    public static void Swap(int arr[],int f,int l)
    {
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    // selection sort method

    public static void selection_sort(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            int ind = i;
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[j] < arr[ind])
                {
                    ind = j;
                } 
            }    
            if(ind != i)
            {
                Swap(arr, i, ind);
            }
        }
    }

    // Display method

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
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

        selection_sort(arr);
        Display(arr);
    }
    
}
