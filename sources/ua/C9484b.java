package ua;

import java.util.Random;
import qa.C8298k;

public final class C9484b extends AbstractC9483a {
    public final C9485a f30719c = new C9485a();

    public static final class C9485a extends ThreadLocal<Random> {
        public Random initialValue() {
            return new Random();
        }
    }

    @Override
    public Random mo6669e() {
        Random random = this.f30719c.get();
        C8298k.m12934d(random, "implStorage.get()");
        return random;
    }
}
