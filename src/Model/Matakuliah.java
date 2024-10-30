package Model;

public class Matakuliah {

    private String kode, nama;
    private int SKS;

    public Matakuliah(String kode, String nama, int sKS) {
        this.kode = kode;
        this.nama = nama;
        SKS = sKS;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int sKS) {
        SKS = sKS;
    }

    @Override
    public String toString() {
        return "Matakuliah [kode=" + kode + ", nama=" + nama + ", SKS=" + SKS + ", getKode()=" + getKode()
                + ", getNama()=" + getNama() + ", getSKS()=" + getSKS() + ", getClass()=" + getClass() + "]";
    }

}
