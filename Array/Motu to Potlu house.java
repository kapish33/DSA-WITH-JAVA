import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        if(times<5){
            System.out.println(1);
        }else {
            if (times%5==0){
                System.out.println(times/5);
            }else {
                System.out.println((times/5)+1);
            }
        }
    }
}
