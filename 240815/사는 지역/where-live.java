import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RegionList[] regionLists = new RegionList[n];
        for(int i=0; i<n; i++){
            regionLists[i] = new RegionList(sc.next(), sc.next(), sc.next());
        }

        Arrays.sort(regionLists, Comparator.comparing(region -> region.name));
        System.out.println("name "+regionLists[n-1].name);
        System.out.println("addr "+regionLists[n-1].addr);
        System.out.println("city "+regionLists[n-1].city);
        
        

    }
}
class RegionList{
    String name;
    String addr;
    String city;

    public RegionList(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    

}