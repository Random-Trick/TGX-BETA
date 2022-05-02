package p050da;

import java.nio.ShortBuffer;
import java.util.Random;

public class C3933d implements AbstractC3930a {
    public static final Random f13261d = new Random();

    public static short m29598b() {
        return (short) f13261d.nextInt(300);
    }

    public static float m29597c(int i, int i2) {
        return i / i2;
    }

    @Override
    public void mo29596a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i) {
        if (shortBuffer.remaining() >= shortBuffer2.remaining()) {
            throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT");
        } else if (i == 1 || i == 2) {
            int remaining = shortBuffer.remaining() / i;
            int floor = (int) Math.floor((shortBuffer2.remaining() - shortBuffer.remaining()) / i);
            float c = m29597c(remaining, remaining);
            float c2 = m29597c(floor, floor);
            int i2 = remaining;
            while (i2 > 0 && floor > 0) {
                if (c >= c2) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    i2--;
                    c = m29597c(i2, remaining);
                } else {
                    shortBuffer2.put(m29598b());
                    if (i == 2) {
                        shortBuffer2.put(m29598b());
                    }
                    floor--;
                    c2 = m29597c(floor, remaining);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT. Channels:" + i);
        }
    }
}
