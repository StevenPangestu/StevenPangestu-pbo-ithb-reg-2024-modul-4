package Model;

public class MatkulPilihan extends Matakuliah {
    private int minimumMHS;

    public MatkulPilihan(String kode, String nama, int sKS, int minimumMHS) {
        super(kode, nama, sKS);
        this.minimumMHS = minimumMHS;
    }

    public int getMinimumMHS() {
        return minimumMHS;
    }

    public void setMinimumMHS(int minimumMHS) {
        this.minimumMHS = minimumMHS;
    }

    @Override
    public String toString() {
        return "MatkulPilihan [minimumMHS=" + minimumMHS + ", getNama()=" + getNama() + ", getMinimumMHS()="
                + getMinimumMHS() + ", getKode()=" + getKode() + ", getSKS()=" + getSKS() + ", getClass()=" + getClass()
                + "]";
    }

}
