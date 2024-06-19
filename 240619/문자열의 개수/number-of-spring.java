import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str,result="";

        int count =0;
        while(sc.hasNext()){
            str = sc.next();
            
            if(str.equals("0")){
                break;
            }else{
                count++;
                if(count % 2 != 0){
result += str+",";
                }
                

            }

        }
        System.out.println(count);
        String[] strings = result.split(",");
        for(int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        
    }
}