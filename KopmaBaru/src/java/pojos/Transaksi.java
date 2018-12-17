package pojos;
// Generated Dec 6, 2018 10:52:41 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Transaksi generated by hbm2java
 */
public class Transaksi  implements java.io.Serializable {


     private String idBarang;
     private String kodeUnik;
     private double jumlahPembayaran;
     private String statusPembayaran;
     private Date tanggalTransaksi;

    public Transaksi() {
    }

    public Transaksi(String idBarang, String kodeUnik, double jumlahPembayaran, String statusPembayaran, Date tanggalTransaksi) {
       this.idBarang = idBarang;
       this.kodeUnik = kodeUnik;
       this.jumlahPembayaran = jumlahPembayaran;
       this.statusPembayaran = statusPembayaran;
       this.tanggalTransaksi = tanggalTransaksi;
    }
   
    public String getIdBarang() {
        return this.idBarang;
    }
    
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }
    public String getKodeUnik() {
        return this.kodeUnik;
    }
    
    public void setKodeUnik(String kodeUnik) {
        this.kodeUnik = kodeUnik;
    }
    public double getJumlahPembayaran() {
        return this.jumlahPembayaran;
    }
    
    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }
    public String getStatusPembayaran() {
        return this.statusPembayaran;
    }
    
    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
    public Date getTanggalTransaksi() {
        return this.tanggalTransaksi;
    }
    
    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }




}


