import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.next().split("");

        int len = strs.length;
        int count =0;
        for(int i=0; i<len; i++){
            if(strs[i].equals("(")){
                for(int j=i+1; j<len; j++){
                    if(strs[j].equals(")")){
                        count++;
                    }
                }
            }
            
        }

        System.out.println(count);
    }
}