package p346y9;

import java.nio.ShortBuffer;

public class C10460e implements AbstractC10456a {
    public static short m5079b(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i, int i2) {
        return shortBuffer.get(shortBuffer.position() - i2);
    }

    public static float m5078c(int i, int i2) {
        return i / i2;
    }

    @Override
    public void mo5080a(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i > i2) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        } else if (i3 == 1 || i3 == 2) {
            int remaining = shortBuffer.remaining() / i3;
            int ceil = ((int) Math.ceil(remaining * (i2 / i))) - remaining;
            float c = m5078c(remaining, remaining);
            float c2 = m5078c(ceil, ceil);
            int i4 = ceil;
            int i5 = remaining;
            while (i5 > 0 && i4 > 0) {
                if (c >= c2) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i3 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    i5--;
                    c = m5078c(i5, remaining);
                } else {
                    shortBuffer2.put(m5079b(shortBuffer2, shortBuffer, 1, i3));
                    if (i3 == 2) {
                        shortBuffer2.put(m5079b(shortBuffer2, shortBuffer, 2, i3));
                    }
                    i4--;
                    c2 = m5078c(i4, ceil);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler. Channels:" + i3);
        }
    }
}
