import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
   
    public static void main(String[] args) {
        
        /** @TayTayTay54 */
        
        int mat,fiz,kim,tur,tar,muz;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        tur = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tar = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        muz = input.nextInt();

        double ortalama = (mat + fiz + kim + tur + tar + muz) / 6;
        System.out.print(ortalama >= 60 ? "Ortalama="+ortalama+ " Sınıfı Geçti" :
                "Ortalama="+ortalama+ " Sınıfta Kaldı");
    }
}
