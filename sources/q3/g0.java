package q3;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n3.p1;
import q3.m;

public interface g0 {

    public static final class a {
        public final byte[] f21272a;
        public final String f21273b;
        public final int f21274c;

        public a(byte[] bArr, String str, int i10) {
            this.f21272a = bArr;
            this.f21273b = str;
            this.f21274c = i10;
        }

        public byte[] a() {
            return this.f21272a;
        }

        public String b() {
            return this.f21273b;
        }
    }

    public interface b {
        void a(g0 g0Var, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    public interface c {
        g0 a(UUID uuid);
    }

    public static final class d {
        public final byte[] f21275a;
        public final String f21276b;

        public d(byte[] bArr, String str) {
            this.f21275a = bArr;
            this.f21276b = str;
        }

        public byte[] a() {
            return this.f21275a;
        }

        public String b() {
            return this.f21276b;
        }
    }

    void a();

    void b(b bVar);

    Map<String, String> c(byte[] bArr);

    void d(byte[] bArr, p1 p1Var);

    d e();

    CryptoConfig f(byte[] bArr);

    byte[] g();

    boolean h(byte[] bArr, String str);

    void i(byte[] bArr, byte[] bArr2);

    void j(byte[] bArr);

    byte[] k(byte[] bArr, byte[] bArr2);

    void l(byte[] bArr);

    a m(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap);

    int n();
}
