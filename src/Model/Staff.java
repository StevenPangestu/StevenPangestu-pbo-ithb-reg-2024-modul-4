package Model;

public class Staff extends User {
    private String NIK;

    public Staff(String name, String alamat, String TTL, String tlp, String nIK) {
        super(name, alamat, TTL, tlp);
        NIK = nIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    @Override
    public String toString() {
        return "Staff [NIK=" + NIK + ", getNIK()=" + getNIK() + ", getName()=" + getName() + ", getAlamat()="
                + getAlamat() + ", getTTL()=" + getTTL() + ", getTelepon()=" + getTelepon() + "]";
    }

}
