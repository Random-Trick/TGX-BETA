package va;

import java.util.Random;
import ra.k;

public final class b extends va.a {
    public final a f24806c = new a();

    public static final class a extends ThreadLocal<Random> {
        public Random initialValue() {
            return new Random();
        }
    }

    @Override
    public Random e() {
        Random random = this.f24806c.get();
        k.d(random, "implStorage.get()");
        return random;
    }
}
