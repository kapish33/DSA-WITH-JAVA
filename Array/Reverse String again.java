java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();

        sc.nextLine(); //only for adding sc.nextLine effective



        for (int i = 0;i<times;i++){//feeding array -->

            String str = sc.nextLine();

            int len = str.length();

            int index = 0;

            int count = -1;



            for (int j = 0;j<len;j++){//looping full [str]

                char c = str.charAt(j);

                if(c==' '){

                    for (int k  = j-1;k>=index;k--){

                        System.out.print(str.charAt(k));

                    }

                    System.out.print(" ");

                    index = j+1;

                    count = 0;

                }else {

                    count++;

                }

            }for (int last = len-1;last>=index;last--){

                System.out.print(str.charAt(last));

            }System.out.println();

        }

    }

}