import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] ints = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j =0 ; j<3; j++){
                ints[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j =0 ; j<3; j++){
                ints[i][j] *= sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j =0 ; j<3; j++){
                System.out.print(ints[i][j]+ " ");
                if(j==2){
                    System.out.println("");
                }
            }
        }
    }
}