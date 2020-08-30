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
public class soHoanHao {
    public static void main(String[] args){
    int nhap;
    int tong=0;
    while(true){
    System.out.print("Nhap vao : ");
    Scanner input=new Scanner(System.in);
    nhap = input.nextInt();
    input.nextLine();
    for(int i=1; i<nhap; i++) {
    if(nhap%i==0) {
    tong+=i;
       }
    }
				
    if(tong==nhap){
	System.out.println("So "+nhap+" la so hoan hao");
   }else {
        System.out.println("So "+nhap+" khong la so hoan hao");
      }
   }
}
}
