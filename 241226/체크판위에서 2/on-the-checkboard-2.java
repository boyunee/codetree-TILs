import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        String[][] strs = new String[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                strs[i][j] = sc.next();
            }
        }
        int count = 0;
        String now = strs[0][0];
        
        for(int i=1; i<r; i++){
            if(strs[r-1][c-1].equals(now)){
                break;
            }
            for(int j=1; j<c; j++){
                if(!strs[i][j].equals(now)){
                    for(int k=i+1; k<r-1; k++){
                        for(int l = j+1; l<c-1; l++){
                            if(strs[k][l].equals(now)){
                                count++;
                            }
                        }
                    }
                }
            
            }
        }

        System.out.println(count);
    }
}