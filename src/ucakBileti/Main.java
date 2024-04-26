package ucakBileti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance;
        int age;
        int type;
        double perkm = 0.10;
        boolean falseinput = false;

        System.out.print("Mesafeyi km türünden giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1:Tek Yön, 2:Gidiş Dönüş): ");
        type = input.nextInt();

        double total;
        total = (distance * perkm);

        // Yaşa göre indirim kontrolü
        if (age < 12) {
            total *= 0.5; // 12 yaşından küçükse %50 indirim yap
        } else if (age >= 12 && age < 24 ){
            total *= 0.9;
        } else if (age > 65){
            total *= 0.7;
        }
        // Yolculuk tipine göre indirim kontrolü
        if (type == 2) {
            total *= 0.8 * 2;  // Gidiş-dönüşse %20 indirim yap

        } else if (type != 1 ){
            System.out.println("Hatalı Giriş Yaptınız! ");
            falseinput = true;
        }
        if (!falseinput) {
            System.out.println("Toplam tutar: " + total);
        }
    }
}
