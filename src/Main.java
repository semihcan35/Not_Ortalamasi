import java.util.Scanner;

    public class Main {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);


        public static void main(String[] args) {
            int mat, fizik, kimya, turkce, tarih, muzik;
            Scanner input = new Scanner(System.in);

            System.out.print("Matematik dersinizin not ortalamanızı giriniz:");
            mat = input.nextInt();

            System.out.print("Fizik dersinizin not ortalamanızı giriniz:");
            fizik = input.nextInt();

            System.out.print("Kimya dersinizin not ortalamanızı giriniz:");
            kimya = input.nextInt();

            System.out.print("Turkce dersinizin not ortalamanızı giriniz:");
            turkce = input.nextInt();

            System.out.print("Tarih dersinizin not ortalamanızı giriniz:");
            tarih = input.nextInt();

            System.out.print("Müzik dersinizin not ortalamanızı giriniz:");
            muzik = input.nextInt();

            double sonuc= (mat + fizik + kimya + turkce + tarih + muzik)/6;
            boolean degerlendirme = sonuc >=60;
            String degerlendirme2 = degerlendirme ? "Başarılı" : "Başarısız";
            System.out.println("Not ortalamanız: "  + sonuc + " " + degerlendirme2);

        }
    }
