import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] ints = new int[2][4];
        
        
        double totalSum = 0;

        for(int i=0; i<2; i++){
            double H_mean =0;
            for(int j=0; j<4; j++){
            
                ints[i][j] = sc.nextInt();
                H_mean += ints[i][j];
                totalSum += ints[i][j];
                if(j == 3){
                    System.out.print(H_mean / 4+" ");
                }


            }

        }
        System.out.println("");
        for(int i =0; i<4; i++){
            double V_mean = 0;
            V_mean = (ints[0][i] + ints[1][i]) / 2;
            System.out.print(V_mean + " ");

        }
        System.out.println("");
        System.out.println(totalSum / 8);
    }
}