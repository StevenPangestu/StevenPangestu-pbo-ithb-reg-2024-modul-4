package Model;

public class User {
    private String nama, alamat, TTL, telepon;

    public User(String name, String alamat, String TTL, String tlp) {
        this.nama = name;
        this.alamat = alamat;
        this.TTL = TTL;
        this.telepon = tlp;
    }

    void SetName(String newName) {
        this.nama = newName;
    }

    String getName() {
        return this.nama;
    }

    void SetAlamat(String newAlamat) {
        this.nama = newAlamat;
    }

    String getAlamat() {
        return this.alamat;
    }

    void setTTL(String newTTL) {
        this.TTL = newTTL;
    }

    String getTTL() {
        return this.TTL;
    }

    void setTelepon(String newTlp) {
        this.telepon = newTlp;
    }

    String getTelepon() {
        return this.telepon;
    }

    @Override
    public String toString() {
        return "User [nama=" + nama + ", alamat=" + alamat + ", TTL=" + TTL + ", telepon=" + telepon + ", getName()="
                + getName() + ", getAlamat()=" + getAlamat() + ", getTTL()=" + getTTL() + ", getTelepon()="
                + getTelepon() + "]";
    }

}
