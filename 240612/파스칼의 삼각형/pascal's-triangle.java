import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ints = new int[n][n];
        for(int i =0; i<n ; i++){
            ints[i][0] = 1;
        }
    
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                ints[i][j] = ints[i-1][j-1] + ints[i-1][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                if(j == n-1){
                    if(ints[i][j] == 0){
                        System.out.print(" "+"\n");
                    }else{
                        System.out.print(ints[i][j]+ "\n");
                    }
                    
                }else if(ints[i][j] == 0){
                    System.out.print("  ");
                }
                else{
                    System.out.print(ints[i][j]+ " ");
                }

                
                
                
                
                
            }
        }
    }
}