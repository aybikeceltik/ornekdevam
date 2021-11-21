package com.bilgeadam.ornek;

public class RelationalOrnek {

    public static void main(String[] args) {

        // == ! = > >= < <=

        int sayi1 = 9;
        int sayi2 = 9;

        String isim1 = "Aybike";
        String isim2 = "Aybike";

        String isim3 = new String("Larin");
        String isim4= new String("Larin");

         if(sayi1 == sayi2)
             System.out.println("Eşittir");
         else
             System.out.println("Eşit degildir");
         if(isim1 == isim2)
             System.out.println("İsimler Eşit");
         else
             System.out.println("İsimler Eşit degildir");
        System.out.println("İsim3:" + isim3);
        if (isim3 == isim4)
            System.out.println("Obje İsimler eşit");
        else
            System.out.println("Obje İsimler eşit degil");

        // stringde == degerine bakmaz memory deki adresine bakar
        // Önemli --> String ifadeler == ile degil equals metodu ile kontrol edilir.
        // Stringde aquals oluşturulma biçimnde bagımsız olarak dogru calışır

        if (isim3.equals(isim4))
            System.out.println("equals İsimler eşit");
        else
            System.out.println("equals İsimler eşit degil");

    }

}
