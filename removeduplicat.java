import java.util.Scanner;

public class removeduplicat{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array: ");
    int n = sc.nextInt(); 
    int[] arr = new int[n];
    for (int i=0; i<n; i++) {arr[i]= sc.nextInt();}   
    int[] temp = new int[n];
    int k=0;
    for(int j=0;j<n-1;j++)
    {
        if(arr[j]!=arr[j+1])
        {
            temp[k]=arr[j];
            k++;
        }
    }
    temp[k]=arr[n-1];
    for(int j=0; j<=k; j++) {System.out.println(temp[j]);}
    }
}