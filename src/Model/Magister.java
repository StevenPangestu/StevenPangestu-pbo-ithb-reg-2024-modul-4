package Model;

import java.util.List;

public class Magister extends Sarjana {
    private String JudulTesis;

    public Magister(String name, String alamat, String TTL, String tlp, String jurusan, String NIM,
            List<MatkulAmbil> listAmbil, String judulTesis) {
        super(name, alamat, TTL, tlp, jurusan, NIM, listAmbil);
        JudulTesis = judulTesis;
    }

    public String getJudulTesis() {
        return JudulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        JudulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return "Magister [JudulTesis=" + JudulTesis + ", getName()=" + getName() + ", getListAmbil()=" + getListAmbil()
                + ", getJurusan()=" + getJurusan() + ", getJudulTesis()=" + getJudulTesis() + ", getAlamat()="
                + getAlamat() + ", getNIM()=" + getNIM() + ", toString()=" + super.toString() + ", getTTL()=" + getTTL()
                + ", getTelepon()=" + getTelepon() + "]";
    }

}