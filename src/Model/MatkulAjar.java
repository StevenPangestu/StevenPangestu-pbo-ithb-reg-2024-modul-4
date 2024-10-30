package Model;

import java.util.List;

public class MatkulAjar {
    private Matakuliah matkul;
    private List<PresensiStaff> presensi;

    public MatkulAjar(Matakuliah matkul, List<PresensiStaff> presensi) {
        this.matkul = matkul;
        this.presensi = presensi;
    }

    public Matakuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(Matakuliah matkul) {
        this.matkul = matkul;
    }

    public List<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        return "MatkulAjar [matkul=" + matkul + ", presensi=" + presensi + ", getMatkul()=" + getMatkul()
                + ", getPresensi()=" + getPresensi() + ", getClass()=" + getClass() + "]";
    }

}
