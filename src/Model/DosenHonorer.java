package Model;

import java.util.List;

public class DosenHonorer extends Dosen {
    private double honorPerSKS;

    public DosenHonorer(String name, String alamat, String TTL, String tlp, String nIK, List<MatkulAjar> matkulAjar,
            String departemen, double honorPerSKS) {
        super(name, alamat, TTL, tlp, nIK, matkulAjar, departemen);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return "DosenHonorer [honorPerSKS=" + honorPerSKS + ", getNIK()=" + getNIK() + ", getName()=" + getName()
                + ", getHonorPerSKS()=" + getHonorPerSKS() + ", getMatkulAjar()=" + getMatkulAjar() + ", getAlamat()="
                + getAlamat() + ", getDepartemen()=" + getDepartemen() + ", getTTL()=" + getTTL() + ", getTelepon()="
                + getTelepon() + ", toString()=" + super.toString() + "]";
    }

}
