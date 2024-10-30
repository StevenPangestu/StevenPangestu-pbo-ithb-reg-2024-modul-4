package Model;

import java.util.*;

public class MatkulAmbil {
    private Matakuliah matkul;
    private List<PresensiMahasiswa> presensi;
    private int n1, n2, n3;

    public MatkulAmbil(Matakuliah matkul, List<PresensiMahasiswa> presensi, int n1, int n2, int n3) {
        this.matkul = matkul;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Matakuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(Matakuliah matkul) {
        this.matkul = matkul;
    }

    public List<PresensiMahasiswa> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<PresensiMahasiswa> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil [matkul=" + matkul + ", presensi=" + presensi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3
                + ", getMatkul()=" + getMatkul() + ", getPresensi()=" + getPresensi() + ", getN1()=" + getN1()
                + ", getN2()=" + getN2() + ", getN3()=" + getN3() + "]";
    }

}