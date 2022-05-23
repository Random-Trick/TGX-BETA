package a4;

import c5.a;
import c5.l0;
import org.thunderdog.challegram.Log;

public final class r {
    public final o f392a;
    public final int f393b;
    public final long[] f394c;
    public final int[] f395d;
    public final int f396e;
    public final long[] f397f;
    public final int[] f398g;
    public final long f399h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length == jArr2.length ? true : z10);
        this.f392a = oVar;
        this.f394c = jArr;
        this.f395d = iArr;
        this.f396e = i10;
        this.f397f = jArr2;
        this.f398g = iArr2;
        this.f399h = j10;
        this.f393b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | Log.TAG_TDLIB_FILES;
        }
    }

    public int a(long j10) {
        for (int i10 = l0.i(this.f397f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f398g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = l0.e(this.f397f, j10, true, false); e10 < this.f397f.length; e10++) {
            if ((this.f398g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
