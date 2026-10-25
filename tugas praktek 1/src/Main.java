class Menu0045 {
    private String nama;
    private double hargaMenu;

    public Menu0045(String nama, double hargaMenu) {
        this.nama = nama;
        setHargaMenu(hargaMenu);
    }

    public String getNama() { return nama; }
    public double getHargaMenu() { return hargaMenu; }

    public void setHargaMenu(double hargaMenu) {
        if (hargaMenu >= 0) this.hargaMenu = hargaMenu;
    }
}

class Pesanan0045 {
    private String id;
    private Menu0045 menu;
    private int jumlah;

    public Pesanan0045(String id, Menu0045 menu, int jumlah) {
        this.id = id;
        this.menu = menu;
        setJumlah(jumlah);
    }

    public void setJumlah(int jumlah) {
        if (jumlah > 0) this.jumlah = jumlah;
    }

    public double hitungTotal() {
        return menu.getHargaMenu() * jumlah;
    }

    public void cetakNota() {
        System.out.println("ID: " + id + " | " + menu.getNama() + " x" + jumlah + " = Rp " + hitungTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Menu0045 m1 = new Menu0045("Ricebowl Beef Teriyaki", 32000);
        Menu0045 m2 = new Menu0045("Es Teh", 5000);

        Pesanan0045 p1 = new Pesanan0045("P1", m1, 2);
        Pesanan0045 p2 = new Pesanan0045("P2", m2, 3);

        p1.cetakNota();
        p2.cetakNota();
    }
}