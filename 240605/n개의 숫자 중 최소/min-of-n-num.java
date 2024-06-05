import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ints = new int[N];

        for(int i=0; i<N; i++){
            ints[i] = sc.nextInt();
        }
        int min = ints[0];
        for(int i =0; i<N; i++){
            if(min > ints[i]){
                min = ints[i];
            }

        }
        int count = 0;
        for(int i =0; i<N; i++){
            if(ints[i] == min){
                count++;
            }

        }



        System.out.println(min+" "+count);
    }
}