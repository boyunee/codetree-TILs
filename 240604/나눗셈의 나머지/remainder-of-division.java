import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int share = a;
        int restNum = 0;
        int[] count = new int[b];
        while(share >1){
            restNum = share%b;
            share /= b;
            count[restNum]++;
        }
        int result = 0;
        for(int i =0; i<b; i++){
            result += Math.pow(count[i],2);
        }
        System.out.println(result);
    }
}