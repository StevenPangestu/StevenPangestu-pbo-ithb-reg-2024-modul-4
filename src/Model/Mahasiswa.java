package Model;

public class Mahasiswa extends User {
    private String jurusan, NIM;

    public Mahasiswa(String name, String alamat, String TTL, String tlp, String jurusan, String NIM) {
        super(name, alamat, TTL, tlp);
        this.jurusan = jurusan;
        this.NIM = NIM;
    }

    public void setJurusan(String newJurusan) {
        this.jurusan = newJurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNIM(String newNIM) {
        this.NIM = newNIM;
    }

    public String getNIM() {
        return NIM;
    }

    @Override
    public String toString() {
        return "Mahasiswa [jurusan=" + jurusan + ", NIM=" + NIM + ", getName()=" + getName() + ", getJurusan()="
                + getJurusan() + ", getAlamat()=" + getAlamat() + ", getNIM()=" + getNIM() + ", getTTL()=" + getTTL()
                + ", getTelepon()=" + getTelepon() + "]";
    }

}
