package p230q3;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.UUID;
import p020b5.C1216l0;

public final class C8181g0 implements CryptoConfig {
    public static final boolean f26496d;
    public final UUID f26497a;
    public final byte[] f26498b;
    public final boolean f26499c;

    static {
        boolean z;
        if ("Amazon".equals(C1216l0.f4528c)) {
            String str = C1216l0.f4529d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f26496d = z;
            }
        }
        z = false;
        f26496d = z;
    }

    public C8181g0(UUID uuid, byte[] bArr, boolean z) {
        this.f26497a = uuid;
        this.f26498b = bArr;
        this.f26499c = z;
    }
}
