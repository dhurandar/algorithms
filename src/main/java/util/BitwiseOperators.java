package util;

import static java.util.Arrays.copyOf;

/**
 * Created by rsingh13.
 */
public class BitwiseOperators {

    public static byte[] xor(byte[] left, byte[] right)
    {
        if (left == null || right == null)
            return null;
        if (left.length > right.length)
        {
            byte[] swap = left;
            left = right;
            right = swap;
        }

        // left.length is now <= right.length
        byte[] out = copyOf(right, right.length);
        for (int i = 0; i < left.length; i++)
        {
            out[i] = (byte)((left[i] & 0xFF) ^ (right[i] & 0xFF));
        }
        return out;
    }

    /**
     * A simple method to test whats the behavior when you do (& 0xFF)
     */
    public final static  void why0xFF() {
        int digit = -4;
        int digit2 = 9;

        int xor = digit ^ digit2;

        System.out.println( xor + " ==== ");

        int signed = digit & 0xFF;
        int signed1 = digit2 & 0xFF;

        int xor1 = signed ^ signed1;

        System.out.println(xor1);
    }

}
