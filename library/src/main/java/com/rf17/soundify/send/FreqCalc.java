package com.rf17.soundify.send;

public class FreqCalc {
    public static byte[] m6859a(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((int) (127.0d *
                    (1.0d - Math.sin(6.283d * ((((double) (i3 % i)) * 1.0d) / ((double) i))))));
        }
        return bArr;
    }
}
