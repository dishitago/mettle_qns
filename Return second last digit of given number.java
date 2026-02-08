import java.util.Scanner;

public class merttle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input1:");
        int input1 = sc.nextInt();
        int nums=Math.abs(input1);
        if(nums<10){
            System.out.println("-1");
        }else{
            int ldig=(nums/10)%10;
            System.out.println(ldig);
        }
    }
}
