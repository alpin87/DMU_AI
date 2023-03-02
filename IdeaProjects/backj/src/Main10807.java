import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main10807 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int count = 0;

        for (int i = 0; i < a; i++)
        {
            arr[i] = sc.nextInt();
        }


        int b = sc.nextInt();

        for (int i =0; i < arr.length; i++){
            if (b == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
