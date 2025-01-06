import java.util.*;
public class Main {
    public static int[] dx = {0,1,1,1};
    public static int[] dy = {1,1,0,-1};
    public static int n,m;

    public static boolean IfRange(int x, int y){
        return (x>=0) && (x<n) && (y>=0) && (y<m);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][] chars = new char[n][m];

        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                chars[i][j] = str.charAt(j);
            }
        }

        

        int count =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                if(chars[i][j] == 'L'){
                    
                    for(int l=0; l<4; l++){
                        if(!IfRange(i+2*dx[l], j+2*dy[l])) {
                            
                            continue;
                        }
                        if(chars[i+dx[l]][j+dy[l]]=='E' && chars[i+2*dx[l]][j+2*dy[l]]=='E'){
                            // System.out.println(chars[i][j]+" 위치는 "+i+","+j);
                            count++;
                        }
                    }
                }else if(chars[i][j] == 'E'){
                    for(int l=0; l<4; l++){
                        if(!IfRange(i+2*dx[l], j+2*dy[l])) continue;
                        if(chars[i+dx[l]][j+dy[l]]=='E' && chars[i+2*dx[l]][j+2*dy[l]]=='L'){
                            count++;
                        }
                    }

                }
            }
        }
        System.out.println(count);




    }
}