import java.util.*;

public class Main {
    public static int m1,d1,m2,d2;
    public static int days=1;
    public static int[] monthDays = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        System.out.println(calculateDays());

    }
    public static int calculateDays(){
        while(true){
            if(m1==m2 && d1==d2){
                return days;
            }
            days++;
            d1++;
            if(d1 > monthDays[m1]){
                m1++;
                d1=1;
            }

        }
    }
}