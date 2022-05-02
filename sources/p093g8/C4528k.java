package p093g8;

import java.util.EnumMap;
import java.util.Map;

public final class C4528k {
    public final String f14929a;
    public final byte[] f14930b;
    public final int f14931c;
    public C4530m[] f14932d;
    public final EnumC4518a f14933e;
    public Map<EnumC4529l, Object> f14934f;
    public final long f14935g;

    public C4528k(String str, byte[] bArr, C4530m[] mVarArr, EnumC4518a aVar) {
        this(str, bArr, mVarArr, aVar, System.currentTimeMillis());
    }

    public C4530m[] m27492a() {
        return this.f14932d;
    }

    public String m27491b() {
        return this.f14929a;
    }

    public void m27490c(EnumC4529l lVar, Object obj) {
        if (this.f14934f == null) {
            this.f14934f = new EnumMap(EnumC4529l.class);
        }
        this.f14934f.put(lVar, obj);
    }

    public String toString() {
        return this.f14929a;
    }

    public C4528k(String str, byte[] bArr, C4530m[] mVarArr, EnumC4518a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, mVarArr, aVar, j);
    }

    public C4528k(String str, byte[] bArr, int i, C4530m[] mVarArr, EnumC4518a aVar, long j) {
        this.f14929a = str;
        this.f14930b = bArr;
        this.f14931c = i;
        this.f14932d = mVarArr;
        this.f14933e = aVar;
        this.f14934f = null;
        this.f14935g = j;
    }
}
