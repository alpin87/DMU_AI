import java.io.*;

public class Main9659 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long q = Long.parseLong(br.readLine());

        if (q % 2 == 1){
            bw.write("SK");
        }
        else{
            bw.write("CY");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
