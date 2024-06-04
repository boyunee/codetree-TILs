import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        char[] chars = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean same = false;
        for(int i =0;i<chars.length; i++){
            if(Objects.equals(input, String.valueOf(chars[i]))){
                System.out.println(i);
                same = true;
                break;
            }
        }
        if(!same){
            System.out.println("None");
        }
    }
}