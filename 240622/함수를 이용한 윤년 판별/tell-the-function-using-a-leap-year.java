import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(leapYear(year));

         
    }
    public static String leapYear(int year){
        if(year % 4 == 0){
            if( year % 100 == 0 && year % 400 != 0){
                return "false";
            }
            return "true";
        }else{
            return "false";
        }
    }
}