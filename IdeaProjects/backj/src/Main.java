import java.util.*;

public class Main{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[10];

        int i = 0;

        while (a > 0) {
            array[i] = a % 10;
            a /= 10;
            i++;
        }
        Arrays.sort(array);

        for (int j=9; j >9-i; j--){
            System.out.print(array[j]);
        }
    }

}
