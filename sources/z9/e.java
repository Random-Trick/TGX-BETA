package z9;

import java.nio.ShortBuffer;

public class e implements a {
    public static short b(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10, int i11) {
        return shortBuffer.get(shortBuffer.position() - i11);
    }

    public static float c(int i10, int i11) {
        return i10 / i11;
    }

    @Override
    public void a(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        } else if (i12 == 1 || i12 == 2) {
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil(remaining * (i11 / i10))) - remaining;
            float c10 = c(remaining, remaining);
            float c11 = c(ceil, ceil);
            int i13 = ceil;
            int i14 = remaining;
            while (i14 > 0 && i13 > 0) {
                if (c10 >= c11) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    i14--;
                    c10 = c(i14, remaining);
                } else {
                    shortBuffer2.put(b(shortBuffer2, shortBuffer, 1, i12));
                    if (i12 == 2) {
                        shortBuffer2.put(b(shortBuffer2, shortBuffer, 2, i12));
                    }
                    i13--;
                    c11 = c(i13, ceil);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler. Channels:" + i12);
        }
    }
}
