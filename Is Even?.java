import java.io.*;
import java.util.*;
class UserMainCode{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input1:");
        int input1 = sc.nextInt();
        if(input1%2==0){
            System.out.println("2");
        }else{
            System.out.println("1");
        }
    }
}
