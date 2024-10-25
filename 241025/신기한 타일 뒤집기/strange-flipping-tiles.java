import java.util.*;
public class Main {
    public static String[] strs = new String[200000];
    public static int current = 100000;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            line(sc.nextInt(), sc.next());
        }
        
        int white =0;
        int black = 0;
        for(int i=0; i<strs.length; i++){
            if(strs[i]==null){
                continue;
            }
            if(strs[i].endsWith("W")){
                white++;
            }else{
                black++;
            }
        }


        System.out.println(white+" "+black);
    }
    static void line(int x, String direction){
        if(direction.equals("R")){
            for(int i=current; i<current+x; i++){
                strs[i] += "B";
            }
            current = current+x-1;
        }else{
            for(int i=current; i>current-x; i--){
                strs[i] = "W";
            }
            current = current-x+1;
        }
    }

}