import java.io.BufferedReader;
import java.util.*;

public class Main1822 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        TreeSet<Integer> ts = new TreeSet<Integer>();

        for (int i = 0; i<a; i++){
            ts.add(sc.nextInt());
        }
        for (int j = 0; j<b; j++){
            int n = sc.nextInt();
            if (ts.contains(n))
                ts.remove(n);
        }
        System.out.println(ts.size());
        for (Integer c : ts){
            System.out.print(c + " ");
        }

    }
}
