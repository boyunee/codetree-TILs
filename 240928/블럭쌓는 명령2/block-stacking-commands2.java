import java.util.*;
public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ints = new int[n];
        int k = sc.nextInt();
        for(int i=0; i<k; i++){
            block(sc.nextInt(), sc.nextInt());
        }
        
        int max = 0;
        for(int i=0; i<n; i++){
            if(ints[i] > max){
                max = ints[i];
            }
        }
        System.out.println(max);
        
    }
    static void block(int a, int b){
        for(int i=a-1; i<=b-1; i++){
            ints[i] +=1;
        }
    }
}