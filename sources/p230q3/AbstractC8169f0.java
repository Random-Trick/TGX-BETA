package p230q3;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p230q3.C8201m;

public interface AbstractC8169f0 {

    public static final class C8170a {
        public final byte[] f26457a;
        public final String f26458b;
        public final int f26459c;

        public C8170a(byte[] bArr, String str, int i) {
            this.f26457a = bArr;
            this.f26458b = str;
            this.f26459c = i;
        }

        public byte[] m13332a() {
            return this.f26457a;
        }

        public String m13331b() {
            return this.f26458b;
        }
    }

    public interface AbstractC8171b {
        void mo13268a(AbstractC8169f0 f0Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface AbstractC8172c {
        AbstractC8169f0 mo13254a(UUID uuid);
    }

    public static final class C8173d {
        public final byte[] f26460a;
        public final String f26461b;

        public C8173d(byte[] bArr, String str) {
            this.f26460a = bArr;
            this.f26461b = str;
        }

        public byte[] m13330a() {
            return this.f26460a;
        }

        public String m13329b() {
            return this.f26461b;
        }
    }

    void mo13251a();

    void mo13250b(AbstractC8171b bVar);

    Map<String, String> mo13249c(byte[] bArr);

    C8173d mo13248d();

    CryptoConfig mo13247e(byte[] bArr);

    byte[] mo13246f();

    boolean mo13245g(byte[] bArr, String str);

    void mo13244h(byte[] bArr, byte[] bArr2);

    void mo13243i(byte[] bArr);

    byte[] mo13242j(byte[] bArr, byte[] bArr2);

    void mo13241k(byte[] bArr);

    C8170a mo13240l(byte[] bArr, List<C8201m.C8203b> list, int i, HashMap<String, String> hashMap);

    int mo13239m();
}
