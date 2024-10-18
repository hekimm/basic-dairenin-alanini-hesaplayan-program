/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        double alan,daireDilimininAlani,cevre,pi=3.14,yaricap,alfa;
        int islem;
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap = scanner.nextDouble();
        
           if (yaricap <= 0) {
          System.out.println("Geçersiz yarıçap değeri. Yarıçap pozitif bir sayı olmalıdır.");
        } else {
              System.out.println("İşlem seçiniz: 1-->Daire cevresi ve alani , 2--> Ölçüsü alfa olan daire diliminin alanı: ");
        islem = scanner.nextInt();
        if(islem == 1 ){
        alan = pi*(yaricap*yaricap);
        cevre = 2*pi*yaricap;
        
        System.out.println("Alan : " + alan);
 
        System.out.println("Çevre : " + cevre);
        }
        else if(islem ==2){
            System.out.println("Daire diliminin merkez açısının ölçüsünü giriniz: ");
            alfa =scanner.nextDouble();
            daireDilimininAlani = (pi*(yaricap*yaricap)*alfa)/360;
            System.out.println("Dairenin " + alfa + " merkez açı ölçülü alanı " + daireDilimininAlani);
        }
        
        else {
    System.out.println("Geçersiz işlem girdiniz. Lütfen 1 veya 2 giriniz.");
}
        }

       

        
        
        
        
        
        
    }
}
