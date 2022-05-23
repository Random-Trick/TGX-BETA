package h8;

import java.util.EnumMap;
import java.util.Map;

public final class k {
    public final String f12613a;
    public final byte[] f12614b;
    public final int f12615c;
    public m[] f12616d;
    public final a f12617e;
    public Map<l, Object> f12618f;
    public final long f12619g;

    public k(String str, byte[] bArr, m[] mVarArr, a aVar) {
        this(str, bArr, mVarArr, aVar, System.currentTimeMillis());
    }

    public m[] a() {
        return this.f12616d;
    }

    public String b() {
        return this.f12613a;
    }

    public void c(l lVar, Object obj) {
        if (this.f12618f == null) {
            this.f12618f = new EnumMap(l.class);
        }
        this.f12618f.put(lVar, obj);
    }

    public String toString() {
        return this.f12613a;
    }

    public k(String str, byte[] bArr, m[] mVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, mVarArr, aVar, j10);
    }

    public k(String str, byte[] bArr, int i10, m[] mVarArr, a aVar, long j10) {
        this.f12613a = str;
        this.f12614b = bArr;
        this.f12615c = i10;
        this.f12616d = mVarArr;
        this.f12617e = aVar;
        this.f12618f = null;
        this.f12619g = j10;
    }
}
