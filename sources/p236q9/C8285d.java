package p236q9;

import java.nio.ShortBuffer;

public class C8285d implements AbstractC8281a {
    @Override
    public void mo12951a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i = 0; i < min; i++) {
            short s = shortBuffer.get();
            shortBuffer2.put(s);
            shortBuffer2.put(s);
        }
    }

    @Override
    public int mo12950b(int i) {
        return i * 2;
    }
}
