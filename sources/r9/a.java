package r9;

import ja.j0;
import java.nio.ShortBuffer;

public interface a {
    public static final C0209a f21798a = C0209a.f21799a;

    public static final class C0209a {
        public static final C0209a f21799a = new C0209a();

        public final a a(int i10, int i11) {
            if (!j0.e(1, 2).contains(Integer.valueOf(i10))) {
                throw new IllegalStateException(("Input channel count not supported: " + i10).toString());
            } else if (!j0.e(1, 2).contains(Integer.valueOf(i11))) {
                throw new IllegalStateException(("Input channel count not supported: " + i10).toString());
            } else if (i10 < i11) {
                return new d();
            } else {
                if (i10 > i11) {
                    return new b();
                }
                return new c();
            }
        }
    }

    void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2);

    int b(int i10);
}
