import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main15828 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        while (true)
        {
            int num = Integer.parseInt(br.readLine());

            if (num == -1) {
                break;
            }
            if (num == 0) {
                que.remove();
            }
            else if(size > que.size()) {
                que.add(num);
            }
        }
        if (que.isEmpty()){
            System.out.print("empty");
        }
        else {
            for (int i : que) {
                st.append(i + " ");
            }
        }
        System.out.println(st);
    }
}
