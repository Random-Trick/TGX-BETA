package p174m3;

import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.voip.VoIPController;
import p006a5.AbstractC0117b;
import p006a5.C0162p;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p187n4.C7233t0;
import p356z4.AbstractC11265j;

public class C6634k implements AbstractC6648m1 {
    public final C0162p f20734a;
    public final long f20735b;
    public final long f20736c;
    public final long f20737d;
    public final long f20738e;
    public final int f20739f;
    public final boolean f20740g;
    public final long f20741h;
    public final boolean f20742i;
    public int f20743j;
    public boolean f20744k;

    public C6634k() {
        this(new C0162p(true, Log.TAG_COMPRESS), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public static void m19753j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        C1186a.m38188b(z, sb2.toString());
    }

    public static int m19751l(int i) {
        switch (i) {
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
    public void mo19674a() {
        m19750m(true);
    }

    @Override
    public boolean mo19673b() {
        return this.f20742i;
    }

    @Override
    public long mo19672c() {
        return this.f20741h;
    }

    @Override
    public void mo19671d() {
        m19750m(false);
    }

    @Override
    public void mo19670e(AbstractC6696s2[] s2VarArr, C7233t0 t0Var, AbstractC11265j[] jVarArr) {
        int i = this.f20739f;
        if (i == -1) {
            i = m19752k(s2VarArr, jVarArr);
        }
        this.f20743j = i;
        this.f20734a.m42184h(i);
    }

    @Override
    public void mo19669f() {
        m19750m(true);
    }

    @Override
    public boolean mo19668g(long j, float f, boolean z, long j2) {
        long X = C1216l0.m37989X(j, f);
        long j3 = z ? this.f20738e : this.f20737d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || X >= j3 || (!this.f20740g && this.f20734a.m42186f() >= this.f20743j);
    }

    @Override
    public boolean mo19667h(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f20734a.m42186f() >= this.f20743j;
        long j3 = this.f20735b;
        if (f > 1.0f) {
            j3 = Math.min(C1216l0.m37994S(j3, f), this.f20736c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            if (!this.f20740g && z2) {
                z = false;
            }
            this.f20744k = z;
            if (!z && j2 < 500000) {
                C1230s.m37881i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f20736c || z2) {
            this.f20744k = false;
        }
        return this.f20744k;
    }

    @Override
    public AbstractC0117b mo19666i() {
        return this.f20734a;
    }

    public int m19752k(AbstractC6696s2[] s2VarArr, AbstractC11265j[] jVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < s2VarArr.length; i2++) {
            if (jVarArr[i2] != null) {
                i += m19751l(s2VarArr[i2].mo19431k());
            }
        }
        return Math.max(13107200, i);
    }

    public final void m19750m(boolean z) {
        int i = this.f20739f;
        if (i == -1) {
            i = 13107200;
        }
        this.f20743j = i;
        this.f20744k = false;
        if (z) {
            this.f20734a.m42185g();
        }
    }

    public C6634k(C0162p pVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m19753j(i3, 0, "bufferForPlaybackMs", "0");
        m19753j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m19753j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m19753j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m19753j(i2, i, "maxBufferMs", "minBufferMs");
        m19753j(i6, 0, "backBufferDurationMs", "0");
        this.f20734a = pVar;
        this.f20735b = C1216l0.m37953q0(i);
        this.f20736c = C1216l0.m37953q0(i2);
        this.f20737d = C1216l0.m37953q0(i3);
        this.f20738e = C1216l0.m37953q0(i4);
        this.f20739f = i5;
        this.f20743j = i5 == -1 ? 13107200 : i5;
        this.f20740g = z;
        this.f20741h = C1216l0.m37953q0(i6);
        this.f20742i = z2;
    }
}
