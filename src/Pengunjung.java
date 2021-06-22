import java.util.Date;

public class Pengunjung {

    private int idCustomer;
    private String namaCustomer;
    private String jenisLaptop;
    private String keluhan;
    private String tambahanCheck;
    private Date tglAntarLaptop;
    private Date tglAmbilLaptop;
    private String biaya;

    public Pengunjung() {

    }

    public void pengunjungDatang(){

    }

    public void checkDeviceCustomer(){

    }

    public void eksekusiDevice(){

    }

    public void checkUlangDevice(){

    }

    public Pengunjung(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Pengunjung(int idCustomer, String namaCustomer, String jenisLaptop, String keluhan, String tambahanCheck, Date tglAntarLaptop, Date tglAmbilLaptop, String biaya) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.jenisLaptop = jenisLaptop;
        this.keluhan = keluhan;
        this.tambahanCheck = tambahanCheck;
        this.tglAntarLaptop = tglAntarLaptop;
        this.tglAmbilLaptop = tglAmbilLaptop;
        this.biaya = biaya;
    }

    public Pengunjung(int idCustomer, String namaCustomer, String jenisLaptop) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.jenisLaptop = jenisLaptop;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getJenisLaptop() {
        return jenisLaptop;
    }

    public void setJenisLaptop(String jenisLaptop) {
        this.jenisLaptop = jenisLaptop;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public String getTambahanCheck() {
        return tambahanCheck;
    }

    public void setTambahanCheck(String tambahanCheck) {
        this.tambahanCheck = tambahanCheck;
    }

    public Date getTglAntarLaptop() {
        return tglAntarLaptop;
    }

    public void setTglAntarLaptop(Date tglAntarLaptop) {
        this.tglAntarLaptop = tglAntarLaptop;
    }

    public Date getTglAmbilLaptop() {
        return tglAmbilLaptop;
    }

    public void setTglAmbilLaptop(Date tglAmbilLaptop) {
        this.tglAmbilLaptop = tglAmbilLaptop;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }
}
