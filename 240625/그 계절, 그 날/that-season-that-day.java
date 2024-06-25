import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        System.out.println(checkDay(Y,M,D));

    }

    public static String checkDay(int Y, int M, int D){
        if(M == 2){
            if(isLeapYear(Y)){
                if(D>0 && D<=29){
                    return "Winter";

                }else{
                    return "-1";
                }

            }else{
                if(D>0 && D<=28){
                    return "Winter";

                }else{
                    return "-1";
                }
            }
        }else if(M >=3 && M <= 5 && M != 2){
            if(M ==4){
                if(D>0 && D<=30){
                    return "Spring";

                }else{
                    return "-1";
                }
            }else{
                if(D>0 && D<=31){
                    return "Spring";

                }else{
                    return "-1";
                }

            }

        }else if(M>= 6 && M<= 8){
            if(M == 6){
                if(D>0 && D<=30){
                    return "Winter";

                }else{
                    return "-1";
                }

            }else{
                if(D>0 && D<=31){
                    return "Winter";

                }else{
                    return "-1";
                }

            }
        }
        else if(M>= 9 && M<= 11){
            if(M == 10){
                if(D>0 && D<=31){
                    return "Fall";

                }else{
                    return "-1";
                }

            }else{
                if(D>0 && D<=30){
                    return "Fall";

                }else{
                    return "-1";
                }

            }
        }else{
            return "Winter";
        }

    }
    public static boolean isLeapYear(int Y){
        if(Y % 4 == 0 ){
            if(Y % 100 == 0){
                if(Y % 400 == 0){
                    return true;
                }else{
                    return false;
                }


            }else{
                return true;

            }
        }else{
            return false;
        }
    }
}