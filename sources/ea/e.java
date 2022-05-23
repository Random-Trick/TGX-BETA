package ea;

import java.nio.ShortBuffer;

public class e implements a {
    @Override
    public void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() <= shortBuffer2.remaining()) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioStretcher");
    }
}
