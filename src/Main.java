import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.*;

public class Main {
    public static void main(String[] args) {
        Matakuliah matkul1 = new Matakuliah("MK-001", "Algoritma", 3);
        Matakuliah matkul2 = new MatkulPilihan("MK-002", "Artificial Inteligence", 3, 5);

        PresensiMahasiswa presensi1 = new PresensiMahasiswa("2024-01-01", 0);
        PresensiMahasiswa presensi2 = new PresensiMahasiswa("2024-01-02", 1);
        List<PresensiMahasiswa> presensiList = new ArrayList<>(Arrays.asList(presensi1, presensi2));

        MatkulAmbil matkulAmbil1 = new MatkulAmbil(matkul1, presensiList, 70, 75, 100);
        MatkulAmbil matkulAmbil2 = new MatkulAmbil(matkul2, presensiList, 78, 89, 76);
        List<MatkulAmbil> matkulAmbilList = new ArrayList<>(Arrays.asList(matkulAmbil1, matkulAmbil2));

        Sarjana mhsSarjana = new Sarjana("Alfons", "Bandung", "2005-01-01", "08123456789",
                "Informatika", "1123099", matkulAmbilList);
        Magister mhsMagister = new Magister("Luis", "Bandung", "2099-01-01", "08123456780",
                "Sistem Informasi", "1123077", matkulAmbilList, "AI in Healthcare");

        PresensiStaff presensiStaff1 = new PresensiStaff("2024-01-01", 0, "08:00");
        List<PresensiStaff> presensiStaffList = new ArrayList<>(Arrays.asList(presensiStaff1));

        MatkulAjar matkulAjar1 = new MatkulAjar(matkul1, presensiStaffList);
        List<MatkulAjar> matkulAjarList = new ArrayList<>(Arrays.asList(matkulAjar1));

        DosenTetap dosenTetap = new DosenTetap("Dosen Tetap 1", "Surabaya", "1975-01-01", "08123456781", "NIK001",
                matkulAjarList, "Informatika", 10000000);
        DosenHonorer dosenHonorer = new DosenHonorer("Dosen Honor 1", "Yogyakarta", "1980-01-01", "08123456782",
                "NIK002", matkulAjarList, "Sistem Informasi", 300000);

        Karyawan karyawan = new Karyawan("Staff 1", "Malang", "1985-01-01", "08123456783", "NIK003", 5000000,
                presensiStaffList);

        System.out.println(matkulAmbil1.toString());

    }
}
