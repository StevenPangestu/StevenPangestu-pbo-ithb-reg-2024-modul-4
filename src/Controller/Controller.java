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

        for (User user : users) {

            if (user instanceof Mahasiswa) {

                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa.getNIM().equals(NIM)) {

                    if (mahasiswa instanceof Sarjana) {

                        Sarjana sarjana = (Sarjana) mahasiswa;

                        for (MatkulAmbil matkulAmbil : sarjana.getListAmbil()) {

                            if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {

                                double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3())
                                        / 3.0;

                                return "Nilai Akhir: " + nilaiAkhir;

                            }

                        }

                    } else if (mahasiswa instanceof Doktor) {

                        Doktor doktor = (Doktor) mahasiswa;

                        double nilaiAkhir = (doktor.getSidang1() + doktor.getSidang2() + doktor.getSidang3()) / 3.0;

                        return "Nilai Akhir: " + nilaiAkhir;

                    }

                }

            }

        }

        return "User tidak ada";

    }

    public String printRataRataNilaiAkhir(String kodeMK) {

        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        for (User user : users) {

            if (user instanceof Mahasiswa) {

                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa instanceof Sarjana) {

                    Sarjana sarjana = (Sarjana) mahasiswa;

                    for (MatkulAmbil matkulAmbil : sarjana.getListAmbil()) {

                        if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {

                            totalNilai += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;
                            jumlahMahasiswa++;

                        }

                    }

                } else if (mahasiswa instanceof Doktor) {

                    Doktor doktor = (Doktor) mahasiswa;

                    totalNilai += (doktor.getSidang1() + doktor.getSidang2() + doktor.getSidang3())
                            / 3.0;

                    jumlahMahasiswa++;

                }

            }

        }

        if (jumlahMahasiswa == 0) {

            return "Tidak ada mahasiswa yang mengambil matkul ini";

        }

        double rataRata = totalNilai / jumlahMahasiswa;

        return "Rata-Rata Nilai Akhir: " + rataRata;

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
