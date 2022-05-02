package p005a4;

import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C0114r {
    public final C0111o f451a;
    public final int f452b;
    public final long[] f453c;
    public final int[] f454d;
    public final int f455e;
    public final long[] f456f;
    public final int[] f457g;
    public final long f458h;

    public C0114r(C0111o oVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C1186a.m38189a(iArr.length == jArr2.length);
        C1186a.m38189a(jArr.length == jArr2.length);
        C1186a.m38189a(iArr2.length == jArr2.length ? true : z);
        this.f451a = oVar;
        this.f453c = jArr;
        this.f454d = iArr;
        this.f455e = i;
        this.f456f = jArr2;
        this.f457g = iArr2;
        this.f458h = j;
        this.f452b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | Log.TAG_TDLIB_FILES;
        }
    }

    public int m42258a(long j) {
        for (int i = C1216l0.m37970i(this.f456f, j, true, false); i >= 0; i--) {
            if ((this.f457g[i] & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    public int m42257b(long j) {
        for (int e = C1216l0.m37978e(this.f456f, j, true, false); e < this.f456f.length; e++) {
            if ((this.f457g[e] & 1) != 0) {
                return e;
            }
        }
        return -1;
    }
}
