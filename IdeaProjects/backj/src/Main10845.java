import java.io.*;
import java.util.LinkedList;


public class Main10845{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < N; i++){
            list.add(i, i+1);
        }

        int a;
        while (list.size() >= 2){
           //bw.write(String.format("%d ", list.get(0)));
           System.out.printf("%d ", list.get(0));
            list.remove(0);

            if (list.size() >= 2){
                a = list.get(0);
                list.remove(0);
                list.addLast(a);
            }
        }
       System.out.print(list.get(0));

    }
}
