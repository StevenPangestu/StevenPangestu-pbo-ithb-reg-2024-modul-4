package Model;

import java.util.*;

public class Sarjana extends Mahasiswa {
    private List<MatkulAmbil> listAmbil;

    public Sarjana(String name, String alamat, String TTL, String tlp, String jurusan, String NIM,
            List<MatkulAmbil> listAmbil) {
        super(name, alamat, TTL, tlp, jurusan, NIM);
        this.listAmbil = listAmbil;
    }

    public List<MatkulAmbil> getListAmbil() {
        return listAmbil;
    }

    public void setListAmbil(List<MatkulAmbil> listAmbil) {
        this.listAmbil = listAmbil;
    }

    @Override
    public String toString() {
        return "Sarjana [listAmbil=" + listAmbil + ", getName()=" + getName() + ", getListAmbil()=" + getListAmbil()
                + ", getJurusan()=" + getJurusan() + ", getAlamat()=" + getAlamat() + ", getNIM()=" + getNIM()
                + ", getTTL()=" + getTTL() + ", getTelepon()=" + getTelepon() + ", toString()=" + super.toString()
                + "]";
    }

}