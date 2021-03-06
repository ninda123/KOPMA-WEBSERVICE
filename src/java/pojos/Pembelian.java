package pojos;
// Generated Nov 6, 2018 10:13:30 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Pembelian generated by hbm2java
 */
@Entity
@Table(name="Pembelian"
    ,catalog="db165314102"
)
public class Pembelian  implements java.io.Serializable {


     private String idBarang;
     private String kodeUnik;
     private double jumlahPembayaran;
     private String statusPembayaran;

    public Pembelian() {
    }

    public Pembelian(String idBarang, String kodeUnik, double jumlahPembayaran, String statusPembayaran) {
       this.idBarang = idBarang;
       this.kodeUnik = kodeUnik;
       this.jumlahPembayaran = jumlahPembayaran;
       this.statusPembayaran = statusPembayaran;
    }
   
     @Id 

    
    @Column(name="ID_Barang", unique=true, nullable=false, length=9)
    public String getIdBarang() {
        return this.idBarang;
    }
    
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    
    @Column(name="kodeUnik", nullable=false, length=12)
    public String getKodeUnik() {
        return this.kodeUnik;
    }
    
    public void setKodeUnik(String kodeUnik) {
        this.kodeUnik = kodeUnik;
    }

    
    @Column(name="jumlahPembayaran", nullable=false, precision=22, scale=0)
    public double getJumlahPembayaran() {
        return this.jumlahPembayaran;
    }
    
    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }

    
    @Column(name="statusPembayaran", nullable=false, length=12)
    public String getStatusPembayaran() {
        return this.statusPembayaran;
    }
    
    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }




}


