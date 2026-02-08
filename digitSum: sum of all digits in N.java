import java.util.Scanner;

public class merttle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input1:");
        int input1=sc.nextInt();
        int sign=1;
        if(input1<0){
            sign=-1;
        }
        int num=Math.abs(input1);
        while(num>9){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num=num/10;
            }
            num=sum;
        }
        int nums=num*sign;
        System.out.println(nums);
    }
}
