package Model;

import java.util.*;

public class Dosen extends Staff {
    private List<MatkulAjar> matkulAjar;
    private String departemen;

    public Dosen(String name, String alamat, String TTL, String tlp, String nIK, List<MatkulAjar> matkulAjar,
            String departemen) {
        super(name, alamat, TTL, tlp, nIK);
        this.matkulAjar = matkulAjar;
        this.departemen = departemen;
    }

    public List<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(List<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return "Dosen [matkulAjar=" + matkulAjar + ", departemen=" + departemen + ", getNIK()=" + getNIK()
                + ", getName()=" + getName() + ", toString()=" + super.toString() + ", getMatkulAjar()="
                + getMatkulAjar() + ", getAlamat()=" + getAlamat() + ", getDepartemen()=" + getDepartemen()
                + ", getTTL()=" + getTTL() + ", getTelepon()=" + getTelepon() + "]";
    }
}