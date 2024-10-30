package Model;

public class Mahasiswa extends User {
    private String jurusan, NIM;

    public Mahasiswa(String name, String alamat, String TTL, String tlp, String jurusan, String NIM) {
        super(name, alamat, TTL, tlp);
        this.jurusan = jurusan;
        this.NIM = NIM;
    }

    void setJurusan(String newJurusan) {
        this.jurusan = newJurusan;
    }

    String getJurusan() {
        return jurusan;
    }

    void setNIM(String newNIM) {
        this.NIM = newNIM;
    }

    public String getNIM() {
        return NIM;
    }
}
