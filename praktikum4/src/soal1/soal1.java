package soal1;

class HewanPeliharaan {
    private String nama;
    private String ras;
    public HewanPeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }
}

public class soal1 {
    public static void main(String[] args) {
        HewanPeliharaan hewan = new HewanPeliharaan("Kucing Anggora", "Leo");
        hewan.display();
    }
}