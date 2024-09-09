import java.util.*;
public class Main {
    public static int cnt=0;

    public static int[] result = new int[20];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ToBinary(n);
        for(int i=cnt-1; i>=0; i--){
            System.out.print(result[i]);
        }
        // System.out.print(result[0]);
        
    }
    static void ToBinary(int n){
        while(true){
            if(n < 2){
            result[cnt++] = n;
            break;
            }
            result[cnt++] = n % 2;
            n/= 2;
        }
    
    }
}