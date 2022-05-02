package va;

import java.util.Random;
import p126j$.util.concurrent.ThreadLocalRandom;
import qa.C8298k;
import ua.AbstractC9483a;

public final class C9900a extends AbstractC9483a {
    @Override
    public Random mo6669e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C8298k.m12934d(current, "current()");
        return current;
    }
}
