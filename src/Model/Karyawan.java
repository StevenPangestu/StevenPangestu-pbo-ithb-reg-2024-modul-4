package Model;

import java.util.*;

public class Karyawan extends Staff {
    private int Salary;
    private List<PresensiStaff> PresensiKaryawan;

    public Karyawan(String name, String alamat, String TTL, String tlp, String nik, int salary,
            List<PresensiStaff> presensiKaryawan) {
        super(name, alamat, TTL, tlp, nik);
        Salary = salary;
        PresensiKaryawan = presensiKaryawan;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public List<PresensiStaff> getPresensiKaryawan() {
        return PresensiKaryawan;
    }

    public void setPresensiKaryawan(List<PresensiStaff> presensiKaryawan) {
        PresensiKaryawan = presensiKaryawan;
    }

    @Override
    public String toString() {
        return "Karyawan [Salary=" + Salary + ", PresensiKaryawan=" + PresensiKaryawan + ", getNIK()=" + getNIK()
                + ", getName()=" + getName() + ", toString()=" + super.toString() + ", getSalary()=" + getSalary()
                + ", getAlamat()=" + getAlamat() + ", getPresensiKaryawan()=" + getPresensiKaryawan() + ", getTTL()="
                + getTTL() + ", getTelepon()=" + getTelepon() + "]";
    }

}