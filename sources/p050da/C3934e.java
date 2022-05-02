package p050da;

import java.nio.ShortBuffer;

public class C3934e implements AbstractC3930a {
    @Override
    public void mo29596a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i) {
        if (shortBuffer.remaining() <= shortBuffer2.remaining()) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioStretcher");
    }
}
