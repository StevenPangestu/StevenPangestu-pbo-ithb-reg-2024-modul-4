package Model;

import java.util.List;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap(String name, String alamat, String TTL, String tlp, String nIK, List<MatkulAjar> matkulAjar,
            String departemen, double salary) {
        super(name, alamat, TTL, tlp, nIK, matkulAjar, departemen);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "DosenTetap [salary=" + salary + ", getNIK()=" + getNIK() + ", getName()=" + getName() + ", getSalary()="
                + getSalary() + ", getMatkulAjar()=" + getMatkulAjar() + ", getAlamat()=" + getAlamat()
                + ", getDepartemen()=" + getDepartemen() + ", getTTL()=" + getTTL() + ", getTelepon()=" + getTelepon()
                + ", toString()=" + super.toString() + "]";
    }

}
