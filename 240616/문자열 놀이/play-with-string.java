import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        
        int query=0;
        int a ,b=0;
        String c, d="";
        for(int i=0; i<n; i++){
            char[] chars = str.toCharArray();
            query = sc.nextInt();
            if(query ==1){
                a = sc.nextInt();
                b = sc.nextInt();
                char temp = chars[a-1];
                chars[a-1] = chars[b-1];
                chars[b-1] = temp;
                str = String.valueOf(chars);
                System.out.println(str);
            }else if(query == 2){
                c = sc.next();
                d = sc.next();
                int index = 0;
                while((index = str.indexOf(c, index)) != -1){
                    chars[index] = d.charAt(0);
                    index++;
                }
                str = String.valueOf(chars);
                System.out.println(str);



            }
            

        }
    }
}