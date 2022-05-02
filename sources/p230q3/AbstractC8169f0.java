package p230q3;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p230q3.C8201m;

public interface AbstractC8169f0 {

    public static final class C8170a {
        public final byte[] f26460a;
        public final String f26461b;
        public final int f26462c;

        public C8170a(byte[] bArr, String str, int i) {
            this.f26460a = bArr;
            this.f26461b = str;
            this.f26462c = i;
        }

        public byte[] m13331a() {
            return this.f26460a;
        }

        public String m13330b() {
            return this.f26461b;
        }
    }

    public interface AbstractC8171b {
        void mo13267a(AbstractC8169f0 f0Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface AbstractC8172c {
        AbstractC8169f0 mo13253a(UUID uuid);
    }

    public static final class C8173d {
        public final byte[] f26463a;
        public final String f26464b;

        public C8173d(byte[] bArr, String str) {
            this.f26463a = bArr;
            this.f26464b = str;
        }

        public byte[] m13329a() {
            return this.f26463a;
        }

        public String m13328b() {
            return this.f26464b;
        }
    }

    void mo13250a();

    void mo13249b(AbstractC8171b bVar);

    Map<String, String> mo13248c(byte[] bArr);

    C8173d mo13247d();

    CryptoConfig mo13246e(byte[] bArr);

    byte[] mo13245f();

    boolean mo13244g(byte[] bArr, String str);

    void mo13243h(byte[] bArr, byte[] bArr2);

    void mo13242i(byte[] bArr);

    byte[] mo13241j(byte[] bArr, byte[] bArr2);

    void mo13240k(byte[] bArr);

    C8170a mo13239l(byte[] bArr, List<C8201m.C8203b> list, int i, HashMap<String, String> hashMap);

    int mo13238m();
}
