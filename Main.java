import java.util.Scanner;

public class Main {
    public static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length -1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
            right = mid - 1;
        }

    }
        return -1;
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("digite o numero que deseja procura");
        int x = sc.nextInt();
        int result = binarySearch(arr, x);
        System.out.println((result));
        sc.close();
    }
}


