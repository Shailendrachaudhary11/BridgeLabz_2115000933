import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxDigit=10,index=0,largest=-1,secondLargest=-1;
        int[] digits=new int[maxDigit];

        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        while(number!=0 && index<maxDigit){
            digits[index++]=number%10;
            number=number/10;
        }
        // find find largest
        for(int i=0;i<10;i++){
            if(digits[i]>largest) largest=digits[i];
        }
        // find second largest
        for(int i=0;i<10;i++){
            if(digits[i]>secondLargest && digits[i]!=largest) secondLargest=digits[i];
        }
        if(largest==-1 || secondLargest==-1){
            System.out.println("There is not enough data to find largest and secondLargest number");
        }

        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit is: "+secondLargest);

    }
}
