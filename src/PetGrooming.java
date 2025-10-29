/**
 * Program PetGrooming digunakan untuk menghitung biaya layanan grooming hewan peliharaan.
 * Program ini menentukan harga berdasarkan jenis layanan yang dipilih oleh pengguna.
 *
 * @author Kira
 * @version 1.0
 */
public class PetGrooming {
    /** Harga untuk layanan mandi */
    private static final double PRICE_BATH = 30000;
    /** Harga untuk layanan potong bulu */
    private static final double PRICE_TRIM = 45000;
    /** Harga untuk layanan lengkap (mandi + potong bulu) */
    private static final double PRICE_FULL = 70000;

    /**
     * Metode utama program yang menampilkan nota layanan grooming.
     * Di dalamnya terdapat logika pemilihan harga berdasarkan jenis layanan.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        String ownerName = "Lupus";
        String namaHewan = "Kucing";
        String jenisLayanan = "Lengkap";
        double harga = 0;

        if (jenisLayanan.equals("Mandi")) {
            harga = PRICE_BATH;
        } else if (jenisLayanan.equals("Potong Bulu")) {
            harga = PRICE_TRIM;
        } else if (jenisLayanan.equals("Lengkap")) {
            harga = PRICE_FULL;
        }

        System.out.println("=== Pet Grooming Service ===");
        System.out.println("Pemilik : " + ownerName);
        System.out.println("Hewan   : " + namaHewan);
        System.out.println("Layanan : " + jenisLayanan);
        System.out.println("Total   : Rp" + harga);
    }
}
