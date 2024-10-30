package Model;

public class User {
    private String nama, alamat, TTL, telepon;

    public User(String name, String alamat, String TTL, String tlp) {
        this.nama = name;
        this.alamat = alamat;
        this.TTL = TTL;
        this.telepon = tlp;
    }

    public void SetName(String newName) {
        this.nama = newName;
    }

    public String getName() {
        return this.nama;
    }

    public void SetAlamat(String newAlamat) {
        this.nama = newAlamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setTTL(String newTTL) {
        this.TTL = newTTL;
    }

    public String getTTL() {
        return this.TTL;
    }

    public void setTelepon(String newTlp) {
        this.telepon = newTlp;
    }

    public String getTelepon() {
        return this.telepon;
    }

    @Override
    public String toString() {
        return "User [nama=" + nama + ", alamat=" + alamat + ", TTL=" + TTL + ", telepon=" + telepon + ", getName()="
                + getName() + ", getAlamat()=" + getAlamat() + ", getTTL()=" + getTTL() + ", getTelepon()="
                + getTelepon() + "]";
    }

}
