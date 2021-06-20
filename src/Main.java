import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz;

        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girin: ");
        mat =input.nextInt();

        System.out.print("Fizik Notunuzu Girin: ");
        fiz =input.nextInt();

        System.out.print("Kimya Notunuzu Girin: ");
        kim =input.nextInt();

        System.out.print("Türkçe Notunuzu Girin: ");
        tur =input.nextInt();

        System.out.print("Tarih Notunuzu Girin: ");
        tar =input.nextInt();

        System.out.print("Müzik Notunuzu Girin: ");
        muz =input.nextInt();


        double result = (mat+fiz+kim+tur+tar+muz)/6;


        String sonuc = (result>=60)? "Sınıf Geçti":"Sınıfta Kaldı";
        System.out.println("Ortalamanız: "+result+" "+ sonuc);

    }
}
