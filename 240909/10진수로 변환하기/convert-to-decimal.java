import java.util.*;
public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ints = new int[str.length()];
        String[] strs = str.split("");
        for(int i=0; i< str.length(); i++){
            ints[i] = Integer.parseInt(strs[i]);
            // System.out.print(ints[i]);
        }
        System.out.println(check());

    }
    static int check(){
        int result =0; 
        int count =0;
        for(int i=ints.length - 1; i>=0;i--){
            result += ints[i] * Math.pow(2, count++);
        }
        return result;
    }
}