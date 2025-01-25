import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] salary=new double[10];
        double[] yearOfservice=new double[10];
        double[] bonus=new double[10];
        double[] newSalary=new double[10];
        for(int i=0;i<10;i++){
            while(true){
                System.out.println("Enter salary for "+(i+1)+" Employee: ");
                salary[i]=sc.nextDouble();
                if(salary[i]<=0){
                    System.out.println("Plz enter positive salary");
                    continue;
                }
                System.out.println("Enter year of service for "+(i+1)+" Employee: ");
                bonus[i]=sc.nextDouble();
                if(yearOfservice[i]<0){
                    System.out.println("Plz enter positive no of year");
                    continue;
                }
                break;
            }
        }
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for(int i=0;i<10;i++){
            if(yearOfservice[i]>5) bonus[i]=salary[i]*0.05;
            else bonus[i]=salary[i]*0.02;
            newSalary[i]=salary[i]+bonus[i];

            totalBonus+=bonus[i];
            totalOldSalary+=salary[i];
            totalNewSalary+=newSalary[i];
        }
        System.out.println("Total bonus is: "+totalBonus);
        System.out.println("Total old salary is: "+totalOldSalary);
        System.out.println("Total new salary is: "+totalNewSalary);
    }
}
