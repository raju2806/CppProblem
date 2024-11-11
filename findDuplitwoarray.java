import java.util.Scanner;

public class findDuplitwoarray {
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


        int[] arr2 = new int[n+n];
        int k=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n1; j++)
            {
                if(arr[i]==arr1[j])
                {
                    arr2[k] = arr[i];
                    k++;
                    arr1[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        System.out.println("Value of K: "+ k);
        for(int i=0; i<k; i++)
        {
            System.out.println(arr2[i]+" ");
        }
    }
} 


// import java.util.Scanner;

// public class FindCommonElementsSimple {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the size of the first array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements of the first array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the size of the second array: ");
//         int n1 = sc.nextInt();
//         int[] arr1 = new int[n1];
//         System.out.println("Enter elements of the second array:");
//         for (int i = 0; i < n1; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         System.out.println("Common elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n1; j++) {
//                 if (arr[i] == arr1[j]) {
//                     System.out.print(arr[i] + " ");
//                     arr1[j] = Integer.MIN_VALUE;  // Mark as "visited"
//                     break;
//                 }
//             }
//         }
//     }
// }


// import java.util.Scanner;

// public class FindCommonElements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the size of the first array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements of the first array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the size of the second array: ");
//         int n1 = sc.nextInt();
//         int[] arr1 = new int[n1];
//         System.out.println("Enter elements of the second array:");
//         for (int i = 0; i < n1; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         int[] result = new int[Math.min(n, n1)];
//         int resultCount = 0;

//         // Find common elements
//         for (int i = 0; i < n; i++) {
//             boolean foundInSecondArray = false;

//             for (int j = 0; j < n1; j++) {
//                 if (arr[i] == arr1[j]) {
//                     foundInSecondArray = true;
//                     break;
//                 }
//             }

//             if (foundInSecondArray && !isInArray(result, resultCount, arr[i])) {
//                 result[resultCount++] = arr[i];
//             }
//         }

//         System.out.println("Common elements:");
//         for (int i = 0; i < resultCount; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }

//     // Helper function to check if element is already in result array
//     private static boolean isInArray(int[] array, int size, int value) {
//         for (int i = 0; i < size; i++) {
//             if (array[i] == value) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
