package r9;

import java.nio.ShortBuffer;
import org.thunderdog.challegram.Log;

public class b implements a {
    @Override
    public void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        int i10;
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            int i12 = shortBuffer.get() + Log.TAG_ROUND;
            int i13 = shortBuffer.get() + Log.TAG_ROUND;
            int i14 = 65535;
            if (i12 < 32768 || i13 < 32768) {
                i10 = (i12 * i13) / Log.TAG_ROUND;
            } else {
                i10 = (((i12 + i13) * 2) - ((i12 * i13) / Log.TAG_ROUND)) - 65535;
            }
            if (i10 != 65536) {
                i14 = i10;
            }
            shortBuffer2.put((short) (i14 - Log.TAG_ROUND));
        }
    }

    @Override
    public int b(int i10) {
        return i10 / 2;
    }
}
