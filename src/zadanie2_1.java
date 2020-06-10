//вариант 1
import java.util.Scanner;
public class zadanie2_1 {
    private static Scanner scann;
    public static void main(String[] args) throws java.io.IOException{
        int []a= new int[5];
        int n=5;
        int sum=0;
        int sr = 0;
        scann = new Scanner(System.in);
        System.setOut(new java.io.PrintStream(System.out, true,"Cp866"));
        System.out.println("Vvedite 5 elementov massiva");
        for(int i=0; i <a.length; i++){
            int b=i+1;
            System.out.print("Vvedite "+b+" element massiva:");
            a[i]=scann.nextInt();
            sum+=a[i];
            sr=sum/n;
        }
        System.out.println("Srednee arifmeticheskoe znachenie elementov massiva: "+sr);
    }
}