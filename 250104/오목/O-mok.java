import java.util.*;
public class Main {
    public static int[][] ints = new int[19][19];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                ints[i][j] = sc.nextInt();
            }
        }

        int[] result = new int[2];

        int isWin = 0; //0무승부, 1검은색, 2흰색
        boolean done = false;

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                if(ints[i][j] != 0){
                    //검사시작
                    int now = ints[i][j];
                    //가로일자
                    if(checkBoundary(i, j+4) && ints[i][j+1] == now){
                        for(int l=2; l<5; l++){
                            if(ints[i][j+l] != now){
                                isWin = 0;
                                break;
                            }
                            isWin = now;
                        }
                        if(isWin == now){
                            result[0] = i+1;
                            result[1] = j+3;
                            done = true;
                            break;
                        }
                    }
                    //세로일자
                    if(checkBoundary(i+4, j) && ints[i+1][j] == now){
                        for(int l=2; l<5; l++){
                            if(ints[i+l][j] != now){
                                isWin = 0;
                                break;
                            }
                            isWin = now;
                        }
                        if(isWin == now){
                            result[0] = i+3;
                            result[1] = j+1;
                            done = true;
                            break;
                        }
                    }
                    //왼쪽대각선
                    if(checkBoundary(i+4, j-4) && ints[i+1][j-1] == now){
                        for(int l=2; l<5; l++){
                            if(ints[i+l][j-l] != now){
                                isWin = 0;
                                break;
                            }
                            isWin = now;
                        }
                        if(isWin == now){
                            result[0] = i+3;
                            result[1] = j-1;
                            done = true;
                            break;
                        }
                    }
                    //오른쪽대각석
                    if(checkBoundary(i+4, j+4) && ints[i+1][j+1] == now){
                        for(int l=2; l<5; l++){
                            if(ints[i+l][j+l] != now){
                                isWin = 0;
                                break;
                            }
                            isWin = now;
                        }
                        if(isWin == now){
                            result[0] = i+3;
                            result[1] = j+3;
                            done = true;
                            break;
                        }
                    
                    }
                }
            }
            if(done){
                break;
            }
        }
        System.out.println(isWin);
        if(isWin != 0){
            System.out.println(result[0]+" "+result[1]);
        }
    }
    static boolean checkBoundary(int i, int j){
        // System.out.println(i+" "+j);
        return (i>=0 && i<=19 && j>=0 && j<=19);
    }
}