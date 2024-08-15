import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RaniyDay[] datas = new RaniyDay[n];
        for(int i=0; i<n; i++){
            datas[i] = new RaniyDay(LocalDate.parse(sc.next()), sc.next(), sc.next());
        }

        Arrays.sort(datas, Comparator.comparing((RaniyDay raniyDay) -> !raniyDay.weather.equals("Rain"))
        .thenComparing(raniyDay -> raniyDay.date));

        System.out.println(datas[0].date+" "+datas[0].day+" "+datas[0].weather);

        // for(int i=0; i<n; i++){
        //     System.out.println(datas[i].date+" "+datas[i].day+" "+datas[i].weather);
        // }

    }
}
class RaniyDay{
    LocalDate date;
    String day;
    String weather;

    public RaniyDay(LocalDate date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}