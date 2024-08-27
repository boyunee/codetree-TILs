import java.util.*;
public class Main {
    public static String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static int[] monthDays = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static int m1,m2,d1,d2;
    public static int order= 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        int day = check();
        while(day < 0){
            day += 7;
        }
        
        System.out.println(days[day]);
    }
    public static int check(){
        int d = 0;
        if((m2-m1) < 0){
            d = d2 - d1;
            while(m1 != m2){
                d += monthDays[m1];
                m1--;
            }
            return d;
        }else if((m2-m1) == 0){
            return (d2 - d1);


        }else{
            d = d2 - d1;
            while(m2 != m1){
                d += monthDays[m1];
                m1++;
            }
            return d;

        }

        
        
    }
}