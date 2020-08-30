/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;
import java.util.Scanner;
/**
 *
 * @author tuandung
 */
public class menuChucNangc2 {
    public static void main(String[] args){
        int choice=0;
        do{
            outPutChoice();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Vui long nhập vào một số nguyên");
                    Scanner scanner1 = new Scanner(System.in);
                    int num = scanner1.nextInt();
                    if(soNT(num)==true){
                        System.out.println("Đây là số NT");
                    }else{
                        System.out.println("Đây ko phải là số NT");
                    }
                    break;
                case 2:
                    System.out.println("Vui long nhập vào một số nguyên");
                    Scanner scanner2 = new Scanner(System.in);
                    int num2 = scanner2.nextInt();
                    if(soHoanHao(num2)==true){
                        System.out.println("Đây là số hoàn hảo");
                    }else{
                        System.out.println("Đây ko phải là số hoàn hảo");
                    }
                    break;
                case 3:
                    System.out.println("Vui long nhập vào một số nguyên");
                    Scanner scanner3 = new Scanner(System.in);
                    int num3 = scanner3.nextInt();
                    if(num3%2==0){
                        System.out.println("Là số chẵn");
                    }else{
                        System.out.println("Là số lẻ");
                    }
                    break;
                case 4:
                    System.out.println("Vui long nhập vào một số nguyên");
                    Scanner scanner4 = new Scanner(System.in);
                    int num4 = scanner4.nextInt();
                    int giaiThua = 1;
                    for(int i=1; i<=num4;i++){
                       giaiThua*=i;
                    }
                    System.out.println("Giai thua cua "+num4+" là:"+giaiThua);
                    break;
                case 5:
                    int a, b ,c;
                    Scanner nhap = new Scanner(System.in);
                    System.out.println("nhap vao so thu 1:");
                    a = nhap.nextInt();
                    System.out.println("nhap vao so thu 2:");
                    b = nhap.nextInt();
                    System.out.println("nhap vao so thu 3:");
                    c = nhap.nextInt();
                    giai(a,b,c);
                    break;
                case 6:
                    System.out.println("thoat");
                    break;
            }
        }while(choice!=6);
 
    }
    public static void outPutChoice(){
        System.out.println("vui long chon");
        System.out.println("1. so nguyen to");
        System.out.println("2. so hoan hao");
        System.out.println("3. so chan le");
        System.out.println("4. tinh giai thua");
        System.out.println("5. trung binh cong");
        System.out.println("6. thoat");
    }
    public static boolean soNT(int num){
        for(int i = 2;i<num;i++){
           if(num%i==0){
              return false;
           }
        }
        return true;
    }
    
    public static boolean soHoanHao(int num){
       int tong=0;
       for(int i=1;i<num;i++){
         if(num%i==0){
            tong = tong+i;
         }
       }
       
       //so hoan hao
       if(tong==num){
         return true;
       }
       
       return false;
    }
     public static void giai(int a, int b, int c){
         if(a>0) {
             System.out.println("trung binh cong "+(a+b+c)/3);
         }
     }
}
