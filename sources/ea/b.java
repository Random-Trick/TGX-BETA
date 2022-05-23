package ea;

import java.nio.ShortBuffer;

public class b implements a {
    @Override
    public void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() >= shortBuffer2.remaining()) {
            int remaining = shortBuffer.remaining() - shortBuffer2.remaining();
            shortBuffer.limit(shortBuffer.limit() - remaining);
            shortBuffer2.put(shortBuffer);
            shortBuffer.limit(shortBuffer.limit() + remaining);
            shortBuffer.position(shortBuffer.limit());
            return;
        }
        throw new IllegalArgumentException("Illegal use of CutAudioStretcher");
    }
}
