import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1159 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int[] arr = new int[26];

        for (int i = 0; i < a; i++){
            String s = br.readLine().toLowerCase();
            int b = s.charAt(0) - 'a';
            arr[b]++;
        }

        String result = "";

        for (int i=0; i<arr.length; i++){
            if (arr[i] >= 5){
                result += String.valueOf((char)(i + 'a'));
            }
        }

        if (result.equals("")){
            result = "PREDAJA";
        }
        System.out.println(result);
    }
}
