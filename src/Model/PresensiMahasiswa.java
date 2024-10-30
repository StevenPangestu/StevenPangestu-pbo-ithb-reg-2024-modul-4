package Model;

public class PresensiMahasiswa {
    private String tanggal;
    private int status;

    public PresensiMahasiswa(String tgl, int status) {
        this.tanggal = tgl;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String isHadir() {
        // kalo 1 = hadir, 0 = alpha
        if (status == 0) {
            return "ALPHA";
        }
        return "HADIR";
    }
}
