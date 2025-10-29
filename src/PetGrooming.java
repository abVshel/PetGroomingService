/**
 * Program PetGrooming dengan fitur diskon pelanggan tetap
 */
public class PetGrooming {
    private static final double PRICE_BATH = 30000;
    private static final double PRICE_TRIM = 45000;
    private static final double PRICE_FULL = 70000;

    public static void main(String[] args) {
        String ownerName = "Lupus";
        String namaHewan = "Kucing";
        String jenisLayanan = "Mandi";
        boolean pelangganTetap = true;
        double harga = 0;

        if (jenisLayanan.equals("Mandi")) {
            harga = PRICE_BATH;
        } else if (jenisLayanan.equals("Potong Bulu")) {
            harga = PRICE_TRIM;
        } else if (jenisLayanan.equals("Lengkap")) {
            harga = PRICE_FULL;
        }

        // === fitur tambahan: diskon pelanggan tetap ===
        if (pelangganTetap) {
            harga = harga * 0.9; // Diskon 10%
        }

        System.out.println("=== Pet Grooming Service ===");
        System.out.println("Pemilik : " + ownerName);
        System.out.println("Hewan   : " + namaHewan);
        System.out.println("Layanan : " + jenisLayanan);
        System.out.println("Total   : Rp" + harga);
        System.out.println("Terimakasih");
    }
}