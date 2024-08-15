import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Bomb bomb = new Bomb(sc.next(), sc.next().charAt(0), sc.nextInt());
        System.out.println("code : "+ bomb.code);
        System.out.println("color : "+ bomb.color);
        System.out.println("second : "+ bomb.second);
    }
};
class Bomb{
    String code;
    char color;
    int second;
    public Bomb(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}