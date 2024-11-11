import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] ints = new int[n][n];
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n; j++){
                ints[i][j] = sc.nextInt();
            
            }
        }

        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};

        
        int result = 0;
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n; j++){
                int count = 0;
                int k =4;
                while(k-- > 0){
                    if(i+dx[k]>=0 && i+dx[k]<n && j+dy[k]>=0 && j+dy[k]<n){
                        if(ints[i+dx[k]][j+dy[k]] == 1){
                            count++;
                        }
                    }
                    
                }
                if(count >= 3){
                    result++;
                }
                
            }
        }

        System.out.println(result);

    }
}