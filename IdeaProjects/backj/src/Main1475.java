import java.util.*;
import java.io.*;

public class Main1475 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader nu = new BufferedReader(new InputStreamReader(System.in));
        String a =  nu.readLine();
        int cnt[] = new int[10];
        int an = 0;

        for (int i = 0; i < a.length(); i++){
            cnt[a.charAt(i)-'0']++;
        }

        int s = 0;
        for (int i = 0; i < 10; i++){
            if (i==6 || i == 9){
                s += cnt[i];
                continue;
            }
            an=Math.max(an, cnt[i]);
        }
        if (s%2==0){
            an=Math.max(an, s/2);
        }
        else{
            an = Math.max(an, s/2+1);
        }
        System.out.print(an);

      }
    }

