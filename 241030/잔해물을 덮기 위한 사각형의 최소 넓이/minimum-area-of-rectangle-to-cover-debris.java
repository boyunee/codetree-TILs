import java.util.*;
public class Main {
    public static int[][] ints = new int[2000][2000];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        lining(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        liningM(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        int xMin =2000, xMax=0, yMin=2000, yMax=0;
        for(int i=0; i<ints.length; i++){
            for(int j=0; j<ints.length; j++){
                if(ints[i][j] == 1){
                    if(i < xMin){
                        xMin = i;
                    }
                    if(i > xMax){
                        xMax = i;
                    }
                    if(j < yMin){
                        yMin = j;
                    }
                    if(j > yMax){
                        yMax = j;
                    }
                    
                }
                
            }
        }
        System.out.println((xMax - xMin) * (yMax - yMin));

    }
    static void lining(int x1, int y1, int x2, int y2){
        for(int i=x1; i<=x2; i++){
            for(int j=y1; j<=y2; j++){
                ints[i+1000][j+1000] = 1;
            }
        }
    }

    static void liningM(int x1, int y1, int x2, int y2){
        for(int i=x1; i<=x2; i++){
            for(int j=y1; j<=y2; j++){
                ints[i+1000][j+1000] = 0;
            }
        }
    }
    
}