import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();

        }
        makeAbs(ints);
        for(int i=0; i<n; i++){
            System.out.print(ints[i]+ " ");

        }

    }
    public static void makeAbs(int[] ints){
        for(int i=0; i<ints.length; i++){
            ints[i] = Math.abs(ints[i]);
        }
    }
    
}
class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}