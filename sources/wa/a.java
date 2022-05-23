package wa;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import ra.k;

public final class a extends va.a {
    @Override
    public Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.d(current, "current()");
        return current;
    }
}
