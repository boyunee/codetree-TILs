import java.util.*;
public class Main {
    public static int[][] ints = new int[200][200];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            lining(sc.nextInt(), sc.nextInt());
        }

        int count=0;
        for(int i=0; i<ints.length; i++){
            for(int j=0; j<ints.length; j++){
                if(ints[i][j] ==1){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
    static void lining(int x1, int y1){
        for(int i=x1; i<x1+8; i++){
            for(int j=y1; j<y1+8; j++){
                ints[i+100][j+100] = 1;
            }
        }
    }

}