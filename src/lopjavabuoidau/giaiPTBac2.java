/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopjavabuoidau;
import java.util.Scanner;
/**
 *
 * @author tuandung
 */
public class giaiPTBac2 {
    public static void main(String[] args){
        double a ,b, c;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap he so a");
        a=nhap.nextDouble();
        System.out.println("nhap he so b");
        b=nhap.nextDouble();
        System.out.println("nhap he so c");
        c=nhap.nextDouble(); 
    giai(a,b,c);
    }
    public static void giai(double a, double b, double c){
        if(a==0){
             if(b==0)
                System.out.println("Phương trình vô nghiệm!");
             else
                 System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
         }
        double delta=b*b-4*a*c;
        double x1;
        double x2;
        if(delta>0){
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và X2 = " + x2);
        } 
        else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } 
        else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    
}
