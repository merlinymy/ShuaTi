package Y2021.M11.Mengyu.temp.Questions;

public class LC136_1 {
    //given two integers, how many bits are different
    public int differentBits (int a, int b) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((a^b) != 0) {
                count++;
            }
            a >>= 1;
            b >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        LC136_1 test = new LC136_1();
        System.out.println(test.differentBits(a,b));
    }
}
