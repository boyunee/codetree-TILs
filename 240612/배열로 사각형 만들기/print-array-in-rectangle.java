public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = 5;
        int[][] ints = new int[5][5];
        for(int i=0; i<5; i++){
            ints[0][i] = 1;
            ints[i][0] = 1;
        }

        for(int i=1; i<5; i++){
            for(int j=1 ; j<5; j++){
                ints[i][j] = ints[i-1][j] + ints[i][j-1];
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0 ; j<5; j++){
                System.out.print(ints[i][j] + " ");
                if(j == 4){
                    System.out.println("");
                }
            }
        }
    }
}