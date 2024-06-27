import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] ints = new int[]{a,b};
        calculate(ints);
        System.out.println(ints[0]+" "+ints[1]);

    }
    public static void calculate(int[] ints){
        if(ints[0]> ints[1]){
            ints[0] *=2;
            ints[1] +=10;
        }else{
            ints[1] *=2;
            ints[0] +=10;
        }
    }
}