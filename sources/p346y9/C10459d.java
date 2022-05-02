package p346y9;

import java.nio.ShortBuffer;

public class C10459d implements AbstractC10456a {
    @Override
    public void mo5080a(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i == i2) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }
}
