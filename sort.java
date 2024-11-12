import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int k=0; k<n-1; k++)
        {
            for(int j=0; j<n-k-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }    
        }
        for(int x:arr)
        {
            System.out.println(x +" ");
        }
        sc.close();
    }
}
