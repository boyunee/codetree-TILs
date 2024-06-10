import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] ints = new int[4][4];
        int[] sums = new int[4];
        for(int i =0; i<4; i++){
            for(int j=0; j<4; j++){
                ints[i][j] = sc.nextInt();
                sums[i] += ints[i][j];
            }
        }
        for(int i =0; i<4; i++){
            System.out.println(sums[i]);
        }

    }
}