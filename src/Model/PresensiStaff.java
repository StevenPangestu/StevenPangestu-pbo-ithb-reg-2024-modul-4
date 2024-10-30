package Model;

public class PresensiStaff extends PresensiMahasiswa {
    private String jamPresensi;

    public PresensiStaff(String tgl, int status, String jam) {
        super(tgl, status);
        this.jamPresensi = jam;
    }

    public String getJam() {
        return this.jamPresensi;
    }

    public void setJam(String setJam) {
        this.jamPresensi = setJam;
    }

    @Override
    public String toString() {
        return "PresensiStaff [jamPresensi=" + jamPresensi + ", getTanggal()=" + getTanggal() + ", getJam()=" + getJam()
                + ", getStatus()=" + getStatus() + ", isHadir()=" + isHadir() + "]";
    }
}
