import java.util.*;
public class Main {
    public static int n,m;
    public static int[] ints;
    public static int sum =0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        calculate();
        System.out.println(sum);

        

    }
    public static void calculate(){
        while(m>= 1){
            sum();
            if(m % 2 ==0){
                m/=2;
            }else{
                m-=1;
            }

        }

    }
    public static void sum(){
        sum += ints[m-1];
    }
}