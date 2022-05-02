package p050da;

import java.nio.ShortBuffer;

public class C3931b implements AbstractC3930a {
    @Override
    public void mo29594a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i) {
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
