import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main2751 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // Stringbuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라
        // 기존의 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다.
        int a = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<a; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list); // 내림차순으로 사용 sort 사용시 시간초과

        for (Integer c : list){
            sb.append(c).append("\n");
        }

        System.out.println(sb);
    }
}

