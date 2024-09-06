import java.util.*;
public class Main {
    public static int m1,d1,m2,d2;
    public static String A;
    public static int days = 0;
    public static int[] months = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        A = sc.next();
        
        int check = check();
        
        int index = Arrays.asList(week).indexOf(A);
        System.out.println(index);
        if(check < index){
            System.out.println((check - index) / 7);
        }else{
            System.out.println((check - index) / 7 + 1);
        }
        


    }
    static int check() {
        
        while(true){
            if(m1==m2 && d1==d2){
            return days;
        }
            d1++;
            days++;
        if(d1 > months[m1]){
            d1 = 1;
            m1++;
        }
        }
    }

}