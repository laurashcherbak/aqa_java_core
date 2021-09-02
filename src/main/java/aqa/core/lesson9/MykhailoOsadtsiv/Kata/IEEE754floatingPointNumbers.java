package aqa.core.lesson9.MykhailoOsadtsiv.Kata;
//Сам не осилив
public class IEEE754floatingPointNumbers {
    public static void main(String[] args) {
        double b = 1.3;
        System.out.println(doubleToIEEE_754(b));
    }

    public static String doubleToIEEE_754(final double d) {
        final long n = Double.doubleToRawLongBits(d);
        final StringBuilder sb = new StringBuilder(String.format("%64s", Long.toBinaryString(n)).replace(' ', '0'));
        sb.insert(12, " ");
        sb.insert(1, " ");
        return sb.toString();
    }
    public static String floatToIEEE_754(final float f) {
        final int n = Float.floatToRawIntBits(f);
        final StringBuilder sb = new StringBuilder(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        sb.insert(9, " ");
        sb.insert(1, " ");
        return sb.toString();
    }
}
