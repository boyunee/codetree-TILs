import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] ints = new int[size];
        for(int i = 0; i<size; i++){
            ints[i] = sc.nextInt();
            ints[i] *= ints[i];
            System.out.print(ints[i]+ " ");
        }
    }
}