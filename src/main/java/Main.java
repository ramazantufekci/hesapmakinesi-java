import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesap Makinesi");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("5. Üs Alma");
        System.out.println("6. Karekök Alma");
        System.out.println("7. Türev Alma");
        System.out.println("8. Integral Alma");
        System.out.println("9. Faktöriyel Hesaplama");
        System.out.println("10. Mod Alma");
        System.out.println("11. Mutlak Değer Hesaplama");
        System.out.println("0. Çıkış");

        while(true){
            System.out.print("İşlem seçiniz: ");
            int secim = scanner.nextInt();

            if (secim == 0){
                System.out.println("Çıkış Yapılıyor ....");
                break;
            }
            switch (secim){
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    karekokAlma();
                    break;
                case 7:
                    turevAlma();
                    break;
                case 8:
                    integralAlma();
                    break;
                case 9:
                    faktoriyelHesaplama();
                    break;
                case 10:
                    modAlma();
                    break;
                case 11:
                    mutlakDegerAlma();
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }

    private static void toplama() {
        // Toplama işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Toplanacak sayı adedini giriniz: ");
        int adet = scanner.nextInt();

        int toplam = 0;
        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();
            toplam += sayi;
        }

        System.out.println("Toplam: " + toplam);
        main(new String[]{});
    }

    private static void cikarma() {
        // Çıkarma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çıkartılacak sayı adedini giriniz: ");
        int adet = scanner.nextInt();

        System.out.print("Birinci sayıyı giriniz: ");
        int toplam = scanner.nextInt();

        for (int i = 1; i < adet; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();
            toplam -= sayi;
        }

        System.out.println("Sonuç: " + toplam);
        main(new String[]{});
    }

    private static void carpma() {
        // Çarpma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çarpılacak sayı adedini giriniz: ");
        int adet = scanner.nextInt();

        int carpim = 1; // Çarpma işlemine başlangıç değeri 1 olmalı

        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();
            carpim *= sayi;
        }

        System.out.println("Sonuç: " + carpim);
        main(new String[]{});
    }

    private static void bolme() {
        // Bölme işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bölünecek sayıyı giriniz: ");
        double bolunen = scanner.nextDouble();

        System.out.print("Bölen sayıyı giriniz: ");
        double bolen = scanner.nextDouble();

        if (bolen != 0) {
            double sonuc = bolunen / bolen;
            System.out.println("Sonuç: " + sonuc);
        } else {
            System.out.println("Bölme işlemi sıfıra bölme hatası verir. Lütfen geçerli bir bölen girin.");
        }
        main(new String[]{});
    }

    private static void usAlma() {
        // Üs alma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        double taban = scanner.nextDouble();

        System.out.print("Üs sayısını giriniz: ");
        double us = scanner.nextDouble();

        double sonuc = Math.pow(taban, us);

        System.out.println("Sonuç: " + sonuc);
        main(new String[]{});
    }

    private static void karekokAlma() {
        // Karekök alma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Karekök alınacak sayıyı giriniz: ");
        double sayi = scanner.nextDouble();

        if (sayi >= 0) {
            double sonuc = Math.sqrt(sayi);
            System.out.println("Sonuç: " + sonuc);
        } else {
            System.out.println("Negatif sayının karekökü alınamaz. Lütfen geçerli bir sayı girin.");
        }
        main(new String[]{});
    }

    private static void turevAlma() {
        // Türev alma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Türevini almak istediğiniz terimin katsayısını giriniz: ");
        double katsayi = scanner.nextDouble();

        System.out.print("Türevini almak istediğiniz terimin üssünü giriniz: ");
        double us = scanner.nextDouble();

        // Örnek olarak, basit bir terim türevi alma işlemi: katsayı * us
        double turev = katsayi * us;

        System.out.println("Sonuç (terimin türevi): " + turev);
        main(new String[]{});
    }

    private static void integralAlma() {
        // Integral alma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("İntegralini almak istediğiniz terimin katsayısını giriniz: ");
        double katsayi = scanner.nextDouble();

        System.out.print("İntegralini almak istediğiniz terimin üssünü giriniz: ");
        double us = scanner.nextDouble();

        // Örnek olarak, basit bir terim integral alma işlemi: (katsayı / (us + 1)) * x^(us + 1)
        double integral = (katsayi / (us + 1)) * Math.pow(2, us + 1); // 2 yerine x alınabilir.

        System.out.println("Sonuç (terimin integrali): " + integral);
        main(new String[]{});
    }

    private static void faktoriyelHesaplama() {
        // Faktöriyel hesaplama işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayının faktöriyeli tanımsızdır. Lütfen geçerli bir sayı girin.");
        } else {
            long faktoriyel = 1;

            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }

            System.out.println(sayi + "! = " + faktoriyel);
        }
        main(new String[]{});
    }

    private static void modAlma() {
        // Mod alma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Modunu almak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.print("Modunu almak istediğiniz mod değerini giriniz: ");
        int mod = scanner.nextInt();

        if (mod <= 0) {
            System.out.println("Mod değeri sıfırdan büyük olmalıdır. Lütfen geçerli bir mod değeri girin.");
        } else {
            int sonuc = sayi % mod;
            System.out.println("Sonuç: " + sonuc);
        }
        main(new String[]{});
    }

    private static void mutlakDegerAlma() {
        // Mutlak değer alma işlemi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mutlak değerini almak istediğiniz sayıyı giriniz: ");
        double sayi = scanner.nextDouble();

        double mutlakDeger = Math.abs(sayi);

        System.out.println("Sonuç: " + mutlakDeger);
        main(new String[]{});
    }
}
