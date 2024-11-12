import java.util.*;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int mini = Integer.MIN_VALUE; 
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]>mini) { mini=arr[i];}
        }
        System.out.println(mini+" ");
        sc.close();
    }   
}
