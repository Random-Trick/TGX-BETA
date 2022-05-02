package p346y9;

import java.nio.ShortBuffer;

public class C10458c implements AbstractC10456a {
    public static float m5081b(int i, int i2) {
        return i / i2;
    }

    @Override
    public void mo5080a(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i < i2) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        } else if (i3 == 1 || i3 == 2) {
            int remaining = shortBuffer.remaining() / i3;
            int ceil = (int) Math.ceil(remaining * (i2 / i));
            int i4 = remaining - ceil;
            float b = m5081b(ceil, ceil);
            float b2 = m5081b(i4, i4);
            int i5 = ceil;
            int i6 = i4;
            while (i5 > 0 && i6 > 0) {
                if (b >= b2) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i3 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    i5--;
                    b = m5081b(i5, ceil);
                } else {
                    shortBuffer.position(shortBuffer.position() + i3);
                    i6--;
                    b2 = m5081b(i6, i4);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler. Channels:" + i3);
        }
    }
}
