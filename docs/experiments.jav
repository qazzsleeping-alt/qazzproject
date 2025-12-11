import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nama anda: ");
            String nama = scanner.nextLine();

            System.out.println("Hi " + nama + "!");
            System.out.println("Selamat datang ke program Java!");
            System.out.println("Sila tentukan pilihan menu :");
            System.out.println("1 = Eclipse Airfront");
            System.out.println("2 = Pilihan 2");
            System.out.print("Masukkan nilai pilihan anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.println("Anda memilih pilihan 1");
                System.out.println("Eclipse Airfront: https://qazzsleeping-alt.github.io/qazzproject/published/airplane.html");
            
            } else if (pilihan == 2) {
                System.out.println("Anda memilih pilihan 2");
                System.out.println("Pilihan 2");
            
            } else {
                System.out.println("Pilihan anda tidak sah");
                System.out.println("Sila cuba lagi : https://qazzsleeping-alt.github.io/qazzproject/docs/index.html");
            }
        }

}
