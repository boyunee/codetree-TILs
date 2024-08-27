import java.util.*;
public class Main {
    public static int a,b,c;
    public static int time;
    public static int day=11;
    public static int hour=11;
    public static int minute=11;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(calculateTime());

    }
    public static int calculateTime(){
        while(true){
            if(day==a && hour==b && minute==c){
                return time;
            }
            time++;
            minute++;
            if(minute > 59){
                hour++;
                minute=0;
            }
            if(hour > 23){
                day++;
                hour=0;
            }
            
        }
    }
}