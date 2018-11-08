package pojos;
// Generated Nov 6, 2018 10:13:30 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Pegawai generated by hbm2java
 */
@Entity
@Table(name="Pegawai"
    ,catalog="db165314102"
)
public class Pegawai  implements java.io.Serializable {


     private String idPegawai;
     private String nama;
     private String noTelp;
     private String alamat;
     private String username;
     private String password;

    public Pegawai() {
    }

    public Pegawai(String idPegawai, String nama, String noTelp, String alamat, String username, String password) {
       this.idPegawai = idPegawai;
       this.nama = nama;
       this.noTelp = noTelp;
       this.alamat = alamat;
       this.username = username;
       this.password = password;
    }
   
     @Id 

    
    @Column(name="ID_Pegawai", unique=true, nullable=false, length=9)
    public String getIdPegawai() {
        return this.idPegawai;
    }
    
    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    
    @Column(name="nama", nullable=false, length=50)
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    
    @Column(name="noTelp", nullable=false, length=20)
    public String getNoTelp() {
        return this.noTelp;
    }
    
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    
    @Column(name="alamat", nullable=false, length=100)
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    @Column(name="username", nullable=false, length=50)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false, length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


