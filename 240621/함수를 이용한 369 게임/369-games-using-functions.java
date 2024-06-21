import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        isHaveThreeSixNine(n,m);
    }
    public static void isHaveThreeSixNine(int n , int m){
        String str ="";
        int count =0;
        for(int i=n; i<=m; i++){
            if(isThreeMulitple(i)){
                count++;
                
            }else{
                str = Integer.toString(i);

                if(str.contains("3") || str.contains("6") || str.contains("9")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isThreeMulitple(int i){
        if(i % 3 == 0){
            return true;
        }else{
            return false;
        }
    }

}