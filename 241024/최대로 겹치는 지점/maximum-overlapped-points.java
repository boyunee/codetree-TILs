import java.util.*;
public class Main {
    public static int[] ints = new int[101];
    public static int min =0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index =0;
        for(int i=0; i<n; i++){
            index = line(sc.nextInt(), sc.nextInt());

        }
        System.out.println(index);

        
    }
    static int line(int x1, int x2){
        for(int i=x1; i<=x2; i++){
            ints[i] +=1;
            if(min < ints[i]){
                min = ints[i];
            }

        }
        return min;
    }
}