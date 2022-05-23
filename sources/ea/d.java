package ea;

import java.nio.ShortBuffer;
import java.util.Random;

public class d implements a {
    public static final Random f11434d = new Random();

    public static short b() {
        return (short) f11434d.nextInt(300);
    }

    public static float c(int i10, int i11) {
        return i10 / i11;
    }

    @Override
    public void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() >= shortBuffer2.remaining()) {
            throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT");
        } else if (i10 == 1 || i10 == 2) {
            int remaining = shortBuffer.remaining() / i10;
            int floor = (int) Math.floor((shortBuffer2.remaining() - shortBuffer.remaining()) / i10);
            float c10 = c(remaining, remaining);
            float c11 = c(floor, floor);
            int i11 = remaining;
            while (i11 > 0 && floor > 0) {
                if (c10 >= c11) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i10 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    i11--;
                    c10 = c(i11, remaining);
                } else {
                    shortBuffer2.put(b());
                    if (i10 == 2) {
                        shortBuffer2.put(b());
                    }
                    floor--;
                    c11 = c(floor, remaining);
                }
            }
        } else {
            throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT. Channels:" + i10);
        }
    }
}
