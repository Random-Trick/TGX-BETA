package z9;

import java.nio.ShortBuffer;

public class c implements a {
    public static float b(int i10, int i11) {
        return i10 / i11;
    }

    @Override
    public void a(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        } else if (i12 == 1 || i12 == 2) {
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil(remaining * (i11 / i10));
            int i13 = remaining - ceil;
            float b10 = b(ceil, ceil);
            float b11 = b(i13, i13);
            int i14 = ceil;
            int i15 = i13;
            while (i14 > 0 && i15 > 0) {
                if (b10 >= b11) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    i14--;
                    b10 = b(i14, ceil);
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i15--;
                    b11 = b(i15, i13);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler. Channels:" + i12);
        }
    }
}
