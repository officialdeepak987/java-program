import java.util.Scanner;
public class factor{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter any number ");
        int num = sc.nextInt();
        int i=1,fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+ num +"is = " +fact);
    }
}