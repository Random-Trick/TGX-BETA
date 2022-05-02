package p236q9;

import java.nio.ShortBuffer;
import org.thunderdog.challegram.Log;

public class C8283b implements AbstractC8281a {
    @Override
    public void mo12951a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        int i;
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i2 = 0; i2 < min; i2++) {
            int i3 = shortBuffer.get() + Log.TAG_ROUND;
            int i4 = shortBuffer.get() + Log.TAG_ROUND;
            int i5 = 65535;
            if (i3 < 32768 || i4 < 32768) {
                i = (i3 * i4) / Log.TAG_ROUND;
            } else {
                i = (((i3 + i4) * 2) - ((i3 * i4) / Log.TAG_ROUND)) - 65535;
            }
            if (i != 65536) {
                i5 = i;
            }
            shortBuffer2.put((short) (i5 - Log.TAG_ROUND));
        }
    }

    @Override
    public int mo12950b(int i) {
        return i / 2;
    }
}
