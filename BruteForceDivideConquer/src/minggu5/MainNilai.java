package minggu5;

public class MainNilai {
    public static void main(String[] args) {
        Nilai[] mhs = new Nilai[8];
        mhs[0] = new Nilai("Ahmad", 78, 82);
        mhs[1] = new Nilai("Budi", 85, 88);
        mhs[2] = new Nilai("Cindy", 90, 87);
        mhs[3] = new Nilai("Dian", 76, 79);
        mhs[4] = new Nilai("Eko", 92, 95);
        mhs[5] = new Nilai("Fajar", 88, 85);
        mhs[6] = new Nilai("Gina", 80, 83);
        mhs[7] = new Nilai("Hadi", 82, 84);

        double[] daftarUTS = new double[8];
        double[] daftarUAS = new double[8];
        for (int i = 0; i < 8; i++) {
            daftarUTS[i] = mhs[i].uts;
            daftarUAS[i] = mhs[i].uas;
        }

        Nilai n = new Nilai("", 0, 0);

        System.out.println("==== HASIL PERHITUNGAN NILAI MAHASISWA ====");
        
        double max = n.maxUTS(daftarUTS, 0, daftarUTS.length - 1);
        System.out.println("Nilai UTS Tertinggi (Divide & Conquer) : " + max);

        double min = n.minUTS(daftarUTS, 0, daftarUTS.length - 1);
        System.out.println("Nilai UTS Terendah (Divide & Conquer)  : " + min);

        double rata = n.rataUAS(daftarUAS);
        System.out.println("Rata-rata UAS (Brute Force)            : " + rata);
    }
}

