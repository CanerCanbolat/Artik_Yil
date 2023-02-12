import java.util.Scanner;
public class Artik_yil {
    public static void main (String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.println("\nARTIK YIL HESAPLAMA PROGRAMI\n");

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil%4 == 0 && yil%100 == 0 && yil%400 == 0){
            System.out.println("\nBu Bir Artık Yıldır");
        }else{
            System.out.println("\nBu Bir Artık Yıl Değildir");
        }
    }
}
