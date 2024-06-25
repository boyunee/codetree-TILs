import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        if(check(M,D)){
            System.out.println("Yes");
        }else{System.out.println("No");}

    }
    public static boolean check(int M, int D){
        if((M == 1) || (M == 3) || (M == 5) || (M == 7) || (M == 8) 
        || (M == 10) || (M == 12) ){
            if(D>0 && D<=31){
                return true;
            }else{
                return false;
            }

        }else if((M == 4) || (M == 6) || (M == 9) || (M == 11)){
            if(D>0 && D<=30){
                return true;
            }else{
                return false;
            }
            
        }else if(M == 2){
            if(D>0 && D<=28){
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
}