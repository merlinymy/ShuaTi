package Y2021.M11.Mengyu.temp.Questions;

public class LC231PowerOfTwo {
    public boolean powerOfTwo (int n) {

        if (n == 1) return true;
        if (n % 2 != 0 ) return false;

        return powerOfTwo(n / 2);
    }
    public boolean powerOfTwoWhileLoop (int n) {
        while (n> 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
    public boolean powerOfTwoBinarySearch (int n) {
        int start = 1;
        while (start < n) {
            start *= 2;
        }
        if (start == n) return true;
        return false;
    }
    public boolean powerOfTwoBit (int n) {
        return n > 0 && (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        int a = 1;
        LC231PowerOfTwo test = new LC231PowerOfTwo();
        System.out.println(test.powerOfTwoBit(a));
    }
}
