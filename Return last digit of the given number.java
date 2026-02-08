import java.util.Scanner;

public class merttle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input1:");
        int input1 = sc.nextInt();
        int num=Math.abs(input1);
        int ldig=num%10;
        System.out.println(ldig);
    }
}
