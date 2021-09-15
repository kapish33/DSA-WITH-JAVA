import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        for (int t = 0;t<steps;t++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            //making and feeding array
            int[][] array= new int[row][col];
            int[] ans = new int[row];
            for (int i = 0;i<row;i++){
                int feed = -1;
                for (int j = 0;j<col;j++){
                    array[i][j]= sc.nextInt();
                    if (feed<array[i][j]){
                        feed=array[i][j];
                    }
                }ans[i]=feed;
            }//making & feeded array compleately
            for (int j = 0;j<row;j++){
                System.out.print(ans[j]+" ");
            }

//            for (int i = 0;i<row;i++){
//                for (int j = 0;j<col;j++){
//                    array[i][j]= sc.nextInt();
//                }
//            }
            System.out.println();
        }

    }
}
