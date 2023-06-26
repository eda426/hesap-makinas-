import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int say1,say2,sec;
        Scanner gir=new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz:");
        say1= gir.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        say2= gir.nextInt();
        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme");
        System.out.println("Lütfen yapmak isteğiniz işlemi seçiniz:");
        sec=gir.nextInt();

        switch (sec)
        {
            case 1:
                System.out.println("Toplam:"+(say1+say2));
                break;

            case 2:
                System.out.println("Cıkarma:"+(say1-say2));break;
            case 3:
                System.out.println("Carpma:"+(say1*say2));break;
            case 4:
                System.out.println("Bolme:"+(say1/say2));break;

            default:
                System.out.println("Herhangi bir değer girilmedi");

    }
    }
}