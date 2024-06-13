import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];
        boolean check = false;

        for(int i=0; i<10; i++){
            strings[i] = sc.nextLine();
        }
        String find = sc.nextLine();
        for(int i=0; i<10; i++){
            if(strings[i].endsWith(find)){
                check = true;
                System.out.println(strings[i]);
            }
        }
        if(!check){
            System.out.println("None");
        }
    }
}