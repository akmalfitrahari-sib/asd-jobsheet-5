package minggu5;

public class Nilai {
    public String nama;
    public double uts, uas;

    public Nilai(String nama, double uts, double uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }

    public double maxUTS(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lmax = maxUTS(arr, l, mid);
        double rmax = maxUTS(arr, mid + 1, r);
        return (lmax > rmax) ? lmax : rmax;
    }

    public double minUTS(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lmin = minUTS(arr, l, mid);
        double rmin = minUTS(arr, mid + 1, r);
        return (lmin < rmin) ? lmin : rmin;
    }

    public double rataUAS(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
}
