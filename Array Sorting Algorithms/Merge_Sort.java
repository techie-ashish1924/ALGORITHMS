import java.util.Scanner;

public class Merge_Sort {

    // TWO ARRAY MERGE FUNCTION 

    public static int[] Merge(int arr1[],int arr2[])
    {
        int i=0;
        int j=0;
        int ind=0;
        int ans[] = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                ans[ind++] = arr1[i++];
            }
            else{
                ans[ind++] = arr2[j++];
            }
        }

        while(i<arr1.length)
        {
            ans[ind++] = arr1[i++];
        }

        while(j<arr2.length)
        {
            ans[ind++] = arr2[j++];
        }

        return ans;
    }

    // MERGE SORT FUNCTION

    public static int[] merge_sort(int arr[],int si,int ei)
    {

        // BASE CASE

        if(si == ei)
        {
            int bs[] = new int[1];
            bs[0] = arr[si];
            return bs;
        }

        int mid = (si+ei)/2;

        int []fs = merge_sort(arr, 0, mid);
        int []ss = merge_sort(arr, mid+1, ei);

        return Merge(fs, ss);
    }

    // DISPLAY FUNCTION

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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int answer[] = merge_sort(arr, 0,n-1);

        Display(answer);

        
    }
    
    
}
