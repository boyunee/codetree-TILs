import java.util.*;
public class Main {
    public static int[] ints = new int[20];
    public static String str="";
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(change(n, b));
    }
    static String change(int n, int b){
        int cnt=0;
        while(true){
        if(n<b){
            ints[cnt++] = n;
            for(int i=ints.length -1; i>=0 ; i--){
                if(ints[i] != 0){
                    str += String.valueOf(ints[i]);
                }
                
            }
            return str;
        }
        ints[cnt++] = n % b;
        n/=b;
        }
    }
}