import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] ints = new int[size];
        int[] count = new int[9];
        for(int i = 0; i<size; i++){
            ints[i] = sc.nextInt();
            count[ints[i]-1]++;
        }
        for(int i = 0; i<count.length; i++){
            System.out.println(count[i]);
        }

    }
}