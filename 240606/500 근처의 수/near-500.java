import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] ints = new int[10];
        for( int i=0; i<10; i++){
            ints[i] = sc.nextInt();

        }
        int min = 0;
        int max = 1000;
        for(int i =0; i<10; i++){
            if(ints[i] <500 && ints[i] > min){
                min = ints[i];
                
            }
            if(ints[i] > 500 && ints[i] < max){
                max = ints[i];
            }
        }
        System.out.println(min + " " + max);

    }
}