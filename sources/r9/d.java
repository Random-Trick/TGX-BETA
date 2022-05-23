package r9;

import java.nio.ShortBuffer;

public class d implements a {
    @Override
    public void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i10 = 0; i10 < min; i10++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public int b(int i10) {
        return i10 * 2;
    }
}
