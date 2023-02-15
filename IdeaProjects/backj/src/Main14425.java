import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main14425 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < a; i++){
            map.put(br.readLine(), 0);  //br버퍼배열의 첫줄 0번쨰부터 입력
        }
        int count = 0;
        for (int j = 0; j < b; j++){
            if (map.containsKey(br.readLine())) count++;

        }
        System.out.println(count);

    }
}
