import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main9655 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        bw.write((a % 2 == 1 ? "SK" : "CY"));
        bw.flush();
        bw.close();
        br.close();
    }
}
