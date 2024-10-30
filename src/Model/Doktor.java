package Model;

public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    private int sidang1, sidang2, sidang3;

    public Doktor(String name, String alamat, String TTL, String tlp, String jurusan, String NIM, String judulDisertasi,
            int sidang1, int sidang2, int sidang3) {
        super(name, alamat, TTL, tlp, jurusan, NIM);
        this.judulDisertasi = judulDisertasi;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }

    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }

    @Override
    public String toString() {
        return "Doktor [judulDisertasi=" + judulDisertasi + ", sidang1=" + sidang1 + ", sidang2=" + sidang2
                + ", sidang3=" + sidang3 + ", getName()=" + getName() + ", getJurusan()=" + getJurusan()
                + ", getAlamat()=" + getAlamat() + ", getJudulDisertasi()=" + getJudulDisertasi() + ", getNIM()="
                + getNIM() + ", getTTL()=" + getTTL() + ", getSidang1()=" +     getSidang1() + ", getTelepon()="
                + getTelepon() + ", getSidang2()=" + getSidang2() + ", getSidang3()=" + getSidang3() + "]";
    }

}