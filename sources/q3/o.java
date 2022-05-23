package q3;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import q3.w;

public interface o {

    public static class a extends IOException {
        public final int f21348a;

        public a(Throwable th, int i10) {
            super(th);
            this.f21348a = i10;
        }
    }

    void a(w.a aVar);

    UUID b();

    boolean c();

    Map<String, String> d();

    void e(w.a aVar);

    boolean f(String str);

    a g();

    CryptoConfig h();

    int i();
}
