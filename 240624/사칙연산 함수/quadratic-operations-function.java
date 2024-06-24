import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();
        // if(!(o.equals("+") || o.equals("-") || o.equals("/") || o.equals("*"))){
        //     System.out.println("False");
        // }else{
            
        // }
        switch(o){
                case "+": add(a,c);
                break;
                case "-": minus(a,c);
                break;
                case "*": multiple(a,c);
                break;
                case "/": division(a,c);
                break;
                default : 
                System.out.println("False");
                break;


            }
    }
    public static void add(int a, int c){
        System.out.println(a+" + "+c+" = "+ a+c);
    }
    public static void minus(int a, int c){
        
        System.out.println(a+" - "+c+" = "+(a-c) );
    }
    public static void multiple(int a, int c){
        System.out.println(a+" * "+c+" = "+ a*c);
    }
    public static void division(int a, int c){
        System.out.println(a+" / "+c+" = "+ (int) a/c);
    }
}