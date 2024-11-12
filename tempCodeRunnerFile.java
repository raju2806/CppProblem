import java.util.Scanner;
public class tempCodeRunnerFile {
        public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of first Array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){arr[i]=sc.nextInt();}

        System.out.println("Enter the size of Second Array: ");
        int n1= sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i=0; i<n1; i++){arr1[i]=sc.nextInt();}


        int[] arr2 = new int[n];
        int k=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n1; j++)
            {
                if(arr[i]==arr1[j])
                {
                    arr2[k] = arr[i];
                    k++;
                }
            }
        }

        for(int i=0; i<k; i++)
        {
            System.out.println(arr2[i]+" ");
        }
        sc.close();
    }
} 
