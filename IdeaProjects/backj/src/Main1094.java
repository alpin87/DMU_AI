import java.util.Scanner;

public class Main1094 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;
        int st = 64;

        while (x>0){
            if(st>x){
                st /= 2;
            }
            else{
                count++;
                x-=st;
            }
        }
        System.out.print(count);


    }
}
