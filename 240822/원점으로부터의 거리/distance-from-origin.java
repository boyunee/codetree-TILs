import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cordinate[] cordinates = new Cordinate[n];
        for(int i =0; i<n; i++){
            cordinates[i] = new Cordinate(sc.nextInt(), sc.nextInt(), i+1);
        }
        

        Arrays.sort(cordinates, Comparator.comparing((Cordinate cd) -> Math.abs(cd.x) + Math.abs(cd.y))
        .thenComparing(cd -> cd.order));

        for(int i =0; i<n; i++){
            System.out.println(cordinates[i].order);
        }



    }
}
class Cordinate{
    int x;
    int y;
    int order;

    public Cordinate(int x, int y, int order){
        this.x = x;
        this.y = y;
        this.order = order;
    }
}