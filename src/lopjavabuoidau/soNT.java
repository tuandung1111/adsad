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
public class soNT {
    
    public static void  main(String[] args){
        boolean isNT=true;
        int nhap;
        Scanner scanner = new Scanner(System.in);// khai bao scanner
        nhap = scanner.nextInt();
        for(int i=2; i<nhap ;i++){
          if(nhap%i==0){
              isNT=false;
             break;
          }  
        };
        if(isNT){
   System.out.println("So : " +nhap +" la so nguyen to");
  }else{
   System.out.println("So : " +nhap +" khong phai la so nguyen to");
        
    }
}
}
