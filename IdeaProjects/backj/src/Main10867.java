import java.util.*;

public class Main10867 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        //중복제거 해쉬셋


        for (int i = 0; i < c; i++) {
            hs.add(sc.nextInt());
        }

        //입력끝난 해쉬셋을 array배열에 입력
        ArrayList<Integer> arrayList = new ArrayList<Integer>(hs);
        Collections.sort(arrayList);

        StringBuilder q = new StringBuilder();
        for (int i : arrayList){
            q.append(i).append(" ");
        }
        System.out.println(q.toString());

    }
}
