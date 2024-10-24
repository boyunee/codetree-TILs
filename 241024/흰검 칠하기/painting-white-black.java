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
        int gray = 0;
        for(int i=0; i<strs.length; i++){
            if(strs[i]==null){
                continue;
            }
            if(strs[i].length()>= 4){
                if(checkGray(strs[i])){
                    gray++;
                }else{
                    if(strs[i].endsWith("W")){
                    white++;
                }else{
                    black++;
                }
                }

                }

            else{
                if(strs[i].endsWith("W")){
                    white++;
                }else{
                    black++;
                }
            }
        }


        System.out.println(white+" "+black+" "+gray);
    }
    static void line(int x, String direction){
        if(direction.equals("R")){
            for(int i=current; i<current+x; i++){
                strs[i] += "B";
            }
            current = current+x-1;
        }else{
            for(int i=current; i>current-x; i--){
                strs[i] += "W";
            }
            current = current-x+1;
        }
    }
    static boolean checkGray(String str){
        int w=0,b=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'W'){
                w++;
            }else{
                b++;
            }
        }
        if(w >=2 && b>=2){
            return true;
        }else{
            return false;
        }
    }
}