import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) {
        System.out.println("Selamat datang kalkulator konversi");
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu~");
            System.out.println("0. KELUAR");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                case 1:
                    hitungBinerDesimal();
                    break;
                case 2:
                    hitungDesimalBiner();
                    break;
                case 3:
                    hitungBinerHexa();
                    break;
                case 4:
                    hitungHexaBiner();
                    break;
                case 5:
                    hitungDesimalHexa();
                    break;
                case 6:
                    hitungHexaDesimal();
                    break;
                default:
                    System.out.println("Masukkan angka 0-6!");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }

    static void hitungBinerDesimal() {
        System.out.print("Masukkan bilangan biner: ");
        Scanner input = new Scanner(System.in);
        String biner = input.nextLine();
        int desimal = Integer.parseInt(biner, 2);
        System.out.println("Desimal: " + desimal);
    }

    static void hitungDesimalBiner() {
        System.out.print("Masukkan bilangan desimal: ");
        Scanner input = new Scanner(System.in);
        int bilanganDesimal = input.nextInt();
        String binerResult = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Hasil konversi: " + binerResult);
    }

    static void hitungBinerHexa() {
        System.out.print("Masukkan bilangan biner: ");
        Scanner input = new Scanner(System.in);
        String binerToHex = input.nextLine();
        int desimalFromBinary = Integer.parseInt(binerToHex, 2);
        String hexResult = Integer.toHexString(desimalFromBinary);
        System.out.println("Hasil konversi: " + hexResult);
    }

    static void hitungHexaBiner() {
        System.out.print("Masukkan bilangan heksadesimal: ");
        Scanner input = new Scanner(System.in);
        String hexToBinary = input.nextLine();
        int desimalFromHex = Integer.parseInt(hexToBinary, 16);
        String binaryResult = Integer.toBinaryString(desimalFromHex);
        System.out.println("Hasil konversi: " + binaryResult);
    }

    static void hitungDesimalHexa() {
        System.out.print("Masukkan bilangan desimal: ");
        Scanner input = new Scanner(System.in);
        int desimalToHex = input.nextInt();
        String hexResultFromDecimal = Integer.toHexString(desimalToHex);
        System.out.println("Hasil konversi: " + hexResultFromDecimal);
    }

    static void hitungHexaDesimal() {
        System.out.print("Masukkan bilangan heksadesimal: ");
        Scanner input = new Scanner(System.in);
        String hexToDecimal = input.nextLine();
        int desimalFromHexadecimal = Integer.parseInt(hexToDecimal, 16);
        System.out.println("Hasil konversi: " + desimalFromHexadecimal);
    }
}