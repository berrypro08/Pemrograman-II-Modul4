package soal2;

import java.util.Scanner;
class Hewanpeliharaan {
    private String nama;
    private String ras;

    public Hewanpeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
class Kucing extends Hewanpeliharaan {
    private String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnaBulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}
class Anjing extends Hewanpeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }
    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i] + (i < kemampuan.length - 1 ? " " : ""));
        }
        System.out.println();
    }
}

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        switch (pilihan) {
            case 1:
                System.out.print("Nama hewan peliharaan: ");
                String namaKucing = scanner.nextLine();
                System.out.print("Ras: ");
                String rasKucing = scanner.nextLine();
                System.out.print("Warna Bulu: ");
                String warnaBuluKucing = scanner.nextLine();
                Kucing kucing = new Kucing(rasKucing, namaKucing, warnaBuluKucing);
                kucing.displayDetailKucing();
                break;
            case 2:
                System.out.print("Nama hewan peliharaan: ");
                String namaAnjing = scanner.nextLine();
                System.out.print("Ras: ");
                String rasAnjing = scanner.nextLine();
                System.out.print("Warna Bulu: ");
                String warnaBuluAnjing = scanner.nextLine();
                System.out.print("Kemampuan : ");
                String inputKemampuan = scanner.nextLine();
                String[] kemampuan = inputKemampuan.split(",\\s*");
                Anjing anjing = new Anjing(namaAnjing, rasAnjing, warnaBuluAnjing, kemampuan);
                anjing.displayDetailAnjing();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        scanner.close();
    }
}