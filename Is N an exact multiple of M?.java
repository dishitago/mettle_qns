import java.util.Scanner;

public class merttle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2=sc.nextInt();
        if(input1%input2==0){
            System.out.println("2");
        }else if(input1%input2==0){
            System.out.println("1");
        }else{
            System.out.println("3");
        }
    }
}
