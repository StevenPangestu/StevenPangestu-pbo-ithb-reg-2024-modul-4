package Controller;

import Model.*;
import java.util.List;

public class Controller {
    private List<User> users;

    public Controller(List<User> user) {
        this.users = user;
    }

    public String printData(String nama) {

        for (User user2 : users) {
            if (user2.getName().equalsIgnoreCase(nama)) {
                return "Name :  " + user2.getName() + "\nAlamat : " + user2.getAlamat() + "\nTTL : " + user2.getTTL()
                        + "\nStatus : " + user2.getClass().getSimpleName();
            }
        }
        return "User tidak ada";
    }

    public String NilaiAkhir(String NIM, String kodeMK) {

        for (User user2 : users) {
            if (users instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) user2;
                if (mhs.getNIM().equals(NIM)) {
                    if (mhs instanceof Sarjana) {
                        Sarjana mhsSarjana = (Sarjana) mhs;

                        for (MatkulAmbil matkulAmbil : mhsSarjana.getListAmbil()) {
                            if (matkulAmbil.getMatkul().getKode() == kodeMK) {
                                double NA = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;
                                return "Nilai Akhir : " + NA;
                            }
                        }
                    } else if (mhs instanceof Doktor) {
                        Doktor mhsDoktor = (Doktor) mhs;
                        return "Nilai Akhir : "
                                + (mhsDoktor.getSidang1() + mhsDoktor.getSidang2() + mhsDoktor.getSidang3()) / 3.0;
                    }
                }
            }

        }
        return "User tidak ada";
    }

    public String NilaiRata(String kodeMK) {
        double totalNilai = 0;
        int bykMhs = 0;

        for (User user : users) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) users;
                if (mhs instanceof Sarjana) {
                    Sarjana mhSarjana = (Sarjana) mhs;

                    for (MatkulAmbil matkul : mhSarjana.getListAmbil()) {
                        if (matkul.getMatkul().getKode().equals(kodeMK)) {
                            totalNilai += (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3.0;
                            bykMhs++;
                        }
                    }
                } else if (mhs instanceof Doktor) {
                    Doktor mhsDoktor = (Doktor) mhs;

                    totalNilai += (mhsDoktor.getSidang1() + mhsDoktor.getSidang2() + mhsDoktor.getSidang3()) / 3.0;
                    bykMhs++;
                }
            }
        }
        if (bykMhs == 0) {
            return "Tidak ada mahasiswa";
        } else {
            double rataRata = totalNilai / bykMhs;
            return "Rata Rata NA : " + rataRata;
        }
    }

    public String bykMhsTidakLulus(String kodeMK) {
        int bykMhs = 0;
        int MhsTidakLulus = 0;
        String namaMK = " ";

        for (User user : users) {
            if (user instanceof Sarjana) {
                Sarjana mhSarjana = (Sarjana) user;

                for (MatkulAmbil matkul : mhSarjana.getListAmbil()) {
                    if (matkul.getMatkul().getKode().equals(kodeMK)) {
                        namaMK = matkul.getMatkul().getNama();
                        double NA = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3.0;

                        if (NA < 56) {
                            MhsTidakLulus++;
                        }
                        bykMhs++;
                    }
                }
            } else if (user instanceof Doktor) {
                Doktor mhsDoktor = (Doktor) user;

                double NA = (mhsDoktor.getSidang1() + mhsDoktor.getSidang2() + mhsDoktor.getSidang3()) / 3.0;

                if (NA < 56) {
                    MhsTidakLulus++;
                }
                bykMhs++;
            }
        }
        return "<" + MhsTidakLulus + "> dari <" + bykMhs + "> mahasiswa tidak lulus matakuliah <" + namaMK + ">";
    }

    public String printMKDiambil(String NIM) {
        String result = "";

        for (User user : users) {

            if (user instanceof Mahasiswa) {

                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa.getNIM().equals(NIM)) {

                    if (mahasiswa instanceof Sarjana) {

                        Sarjana mhsSarjana = (Sarjana) mahasiswa;

                        for (MatkulAmbil matkulAmbil : mhsSarjana.getListAmbil()) {

                            result += matkulAmbil.getMatkul().getNama() + " (Total Presensi: "
                                    + matkulAmbil.getPresensi().size() + "), ";

                        }

                        return "Matkul Diambil : " + result;

                    } else {

                        return "Mahasiswa bukan dari program Sarjana";

                    }
                }
            }
        }
        return "Mahasiswa tidak ada";
    }

    public String totalJamDosen(String NIK) {
        for (User user : users) {
            if (user instanceof Dosen) {
                Dosen dosen = (Dosen) user;
                if (dosen.getNIK().equals(NIK)) {
                    int totalJam = 0;
                    for (MatkulAjar matkul : dosen.getMatkulAjar()) {
                        for (PresensiStaff presensi : matkul.getPresensiStaff()) {
                            if (presensi.getStatus() == 1) {
                                totalJam += matkul.getMatkul().getSKS();
                            }
                        }
                    }
                    return "Total jam megajar : " + totalJam;
                }

            }

        }
        return "Dosen tidak ditemukan";
    }

    public String printGaji(String NIK) {
        double gaji = 0;
        for (User user : users) {
            if (user instanceof Karyawan) {
                Karyawan karyawan = (Karyawan) user;

                if (karyawan.getNIK().equals(NIK)) {
                    gaji = karyawan.getUnit() / 22 * karyawan.getSalary();
                    return "Gaji karyawan : " + gaji;
                }

            } else if (user instanceof DosenTetap) {
                DosenTetap DosenTetap = (DosenTetap) user;

                if (DosenTetap.getNIK().equals(NIK)) {
                    gaji = DosenTetap.getUnit() * 25000 + DosenTetap.getSalary();
                    return "Gaji Dosen Tetap : " + gaji;
                }
            } else if (user instanceof DosenHonorer) {
                DosenHonorer dosenHonor = (DosenHonorer) user;

                if (dosenHonor.getNIK().equals(NIK)) {
                    gaji = dosenHonor.getUnit() * dosenHonor.getHonorPerSKS();
                    return "Gaji Dosen Honorer : " + gaji;
                }
            }
        }
        return "User tidak ditemukan";
    }
}
