import java.util.*;
public class Main {
    public static int[] ints = new int[201];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            draw(sc.nextInt(), sc.nextInt());
        }

        int max =0;
        for(int i=0; i<ints.length; i++){
            if(ints[i] > max){
                max = ints[i];
            }
        }
        System.out.println(max);
    }
    static void draw(int x1, int x2){
        for(int i=x1; i<x2; i++){
            ints[i+100] +=1;
        }
    }
}