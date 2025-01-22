import java.util.Scanner;
class FeeDiscountWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        int fee = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        int discountPercent = input.nextInt();
        int discount = (fee * discountPercent) / 100;
        int discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        input.close();
    }
}
