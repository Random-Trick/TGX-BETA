package q3;

import c5.l0;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.UUID;

public final class h0 implements CryptoConfig {
    public static final boolean f21318d;
    public final UUID f21319a;
    public final byte[] f21320b;
    public final boolean f21321c;

    static {
        boolean z10;
        if ("Amazon".equals(l0.f4843c)) {
            String str = l0.f4844d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f21318d = z10;
            }
        }
        z10 = false;
        f21318d = z10;
    }

    public h0(UUID uuid, byte[] bArr, boolean z10) {
        this.f21319a = uuid;
        this.f21320b = bArr;
        this.f21321c = z10;
    }
}
