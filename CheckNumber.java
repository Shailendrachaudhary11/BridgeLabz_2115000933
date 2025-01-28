import java.util.*;
public class CheckNumber {
    public static int checkNumber(int num){
        if(num==0) return 0;
        else if(num<0) return -1;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be check: ");
        int num=sc.nextInt();
        int ans=checkNumber(num);
        System.out.println(ans);
    }
}
