package p230q3;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.UUID;
import p020b5.C1216l0;

public final class C8181g0 implements CryptoConfig {
    public static final boolean f26493d;
    public final UUID f26494a;
    public final byte[] f26495b;
    public final boolean f26496c;

    static {
        boolean z;
        if ("Amazon".equals(C1216l0.f4528c)) {
            String str = C1216l0.f4529d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f26493d = z;
            }
        }
        z = false;
        f26493d = z;
    }

    public C8181g0(UUID uuid, byte[] bArr, boolean z) {
        this.f26494a = uuid;
        this.f26495b = bArr;
        this.f26496c = z;
    }
}
