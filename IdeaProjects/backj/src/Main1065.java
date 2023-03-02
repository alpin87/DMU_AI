import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1065 {

    public static int suy(int num){
        int cnt = 0;

        if (num < 100){
            return num;
        }
        else {
            cnt = 99;
            for (int i = 100; i <= num; i++) {
                int q = i / 100;
                int w = (i / 10) % 10;
                int e = i % 10;

                if ((q - w) == (w - e)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(suy(Integer.parseInt(br.readLine())));


    }
}