package m3;

import a5.r;
import b5.b;
import b5.p;
import c5.a;
import c5.l0;
import c5.s;
import o4.r0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.voip.VoIPController;

public class k implements w1 {
    public final p f16748a;
    public final long f16749b;
    public final long f16750c;
    public final long f16751d;
    public final long f16752e;
    public final int f16753f;
    public final boolean f16754g;
    public final long f16755h;
    public final boolean f16756i;
    public int f16757j;
    public boolean f16758k;

    public k() {
        this(new p(true, Log.TAG_COMPRESS), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public static void j(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        a.b(z10, sb2.toString());
    }

    public static int l(int i10) {
        switch (i10) {
            case VoIPController.ERROR_PRIVACY:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return Log.TAG_CONTACT;
        }
    }

    @Override
    public void a() {
        m(true);
    }

    @Override
    public boolean b() {
        return this.f16756i;
    }

    @Override
    public void c(b3[] b3VarArr, r0 r0Var, r[] rVarArr) {
        int i10 = this.f16753f;
        if (i10 == -1) {
            i10 = k(b3VarArr, rVarArr);
        }
        this.f16757j = i10;
        this.f16748a.h(i10);
    }

    @Override
    public long d() {
        return this.f16755h;
    }

    @Override
    public void e() {
        m(false);
    }

    @Override
    public void f() {
        m(true);
    }

    @Override
    public boolean g(long j10, float f10, boolean z10, long j11) {
        long Y = l0.Y(j10, f10);
        long j12 = z10 ? this.f16752e : this.f16751d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || Y >= j12 || (!this.f16754g && this.f16748a.f() >= this.f16757j);
    }

    @Override
    public boolean h(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f16748a.f() >= this.f16757j;
        long j12 = this.f16749b;
        if (f10 > 1.0f) {
            j12 = Math.min(l0.T(j12, f10), this.f16750c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f16754g && z11) {
                z10 = false;
            }
            this.f16758k = z10;
            if (!z10 && j11 < 500000) {
                s.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f16750c || z11) {
            this.f16758k = false;
        }
        return this.f16758k;
    }

    @Override
    public b i() {
        return this.f16748a;
    }

    public int k(b3[] b3VarArr, r[] rVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < b3VarArr.length; i11++) {
            if (rVarArr[i11] != null) {
                i10 += l(b3VarArr[i11].k());
            }
        }
        return Math.max(13107200, i10);
    }

    public final void m(boolean z10) {
        int i10 = this.f16753f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f16757j = i10;
        this.f16758k = false;
        if (z10) {
            this.f16748a.g();
        }
    }

    public k(p pVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j(i12, 0, "bufferForPlaybackMs", "0");
        j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i11, i10, "maxBufferMs", "minBufferMs");
        j(i15, 0, "backBufferDurationMs", "0");
        this.f16748a = pVar;
        this.f16749b = l0.r0(i10);
        this.f16750c = l0.r0(i11);
        this.f16751d = l0.r0(i12);
        this.f16752e = l0.r0(i13);
        this.f16753f = i14;
        this.f16757j = i14 == -1 ? 13107200 : i14;
        this.f16754g = z10;
        this.f16755h = l0.r0(i15);
        this.f16756i = z11;
    }
}
