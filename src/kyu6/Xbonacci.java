package kyu6;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n == 0) return new double[0];
        double[] res = new double[n];
        if (n < s.length) {
            for (int i = 0; i < n; i++) {
                res[i] = s[i];
            }
            return res;
        }
        res[0] = s[0];
        res[1] = s[1];
        res[2] = s[2];
        for (int i = 3; i < n; i++){
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
        }
        return res;
    }
}
