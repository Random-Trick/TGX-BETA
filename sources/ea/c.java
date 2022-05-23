package ea;

import java.nio.ShortBuffer;

public class c implements a {
    @Override
    public void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() < shortBuffer2.remaining()) {
            a.f11433c.a(shortBuffer, shortBuffer2, i10);
        } else if (shortBuffer.remaining() > shortBuffer2.remaining()) {
            a.f11432b.a(shortBuffer, shortBuffer2, i10);
        } else {
            a.f11431a.a(shortBuffer, shortBuffer2, i10);
        }
    }
}
