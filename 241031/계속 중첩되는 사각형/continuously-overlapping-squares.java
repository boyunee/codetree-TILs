import java.util.*;
public class Main {
    public static int[][] ints = new int[201][201];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            if(i%2==0){
                lineRed(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            }else{
                lineBlue(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
        }

        int count=0;
        for(int i=0; i<ints.length; i++){
            for(int j=0; j<ints.length; j++){
                if(ints[i][j] == 2){
                    count++;
                    // System.out.println((i-100)+" "+(j-100));
                }
            }
        }
        System.out.println(count);
    }
    static void lineRed(int x1, int y1, int x2, int y2){
        for(int i=x1+100; i<x2+100; i++){
            for(int j=y1+100; j<y2+100; j++){
                ints[i][j] = 1;
            }
        }
    }
    static void lineBlue(int x1, int y1, int x2, int y2){
        for(int i=x1+100; i<x2+100; i++){
            for(int j=y1+100; j<y2+100; j++){
                ints[i][j] = 2;
            }
        }

    }

}