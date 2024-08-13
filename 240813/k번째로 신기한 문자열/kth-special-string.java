import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        
        ArrayList<String> strs = new ArrayList<>();
        for(int i=0; i<n; i++){
            String str = sc.next();
            if(str.startsWith(T)){
                strs.add(str);
            }
        }
        Collections.sort(strs);
        System.out.println(strs.get(k-1));
    }
}