import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int int1 =sc.nextInt();
        int int2 = sc.nextInt();
        int[][] ints = new int[int1][int2];
        int num =0;
        for(int i=0; i<int1; i++){
            for(int j=0; j<int2; j++){
                num += 1;
                ints[i][j] = num;
                System.out.print(ints[i][j] + " ");
                if(j== int2 -1){
                    System.out.println("");
                }
            }
        }
    }
}