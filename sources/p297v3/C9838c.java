package p297v3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import com.google.android.exoplayer2.extractor.C3466d;
import com.google.android.exoplayer2.extractor.C3468e;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p073f4.C4260a;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8966m;
import p270t3.C8971q;

public final class C9838c implements AbstractC8958f {
    public static final AbstractC8965l f32099o = C9837b.f32098b;
    public final byte[] f32100a;
    public final C1189b0 f32101b;
    public final boolean f32102c;
    public final C8966m.C8967a f32103d;
    public AbstractC8960h f32104e;
    public AbstractC8974t f32105f;
    public int f32106g;
    public C4260a f32107h;
    public FlacStreamMetadata f32108i;
    public int f32109j;
    public int f32110k;
    public C9834a f32111l;
    public int f32112m;
    public long f32113n;

    public C9838c() {
        this(0);
    }

    public static AbstractC8958f[] m6772k() {
        return new AbstractC8958f[]{new C9838c()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f32106g = 0;
        } else {
            C9834a aVar = this.f32111l;
            if (aVar != null) {
                aVar.m30496h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f32113n = j3;
        this.f32112m = 0;
        this.f32101b.m38148L(0);
    }

    public final long m6776d(C1189b0 b0Var, boolean z) {
        boolean z2;
        C1186a.m38185e(this.f32108i);
        int e = b0Var.m38138e();
        while (e <= b0Var.m38137f() - 16) {
            b0Var.m38144P(e);
            if (C8966m.m10821d(b0Var, this.f32108i, this.f32110k, this.f32103d)) {
                b0Var.m38144P(e);
                return this.f32103d.f28851a;
            }
            e++;
        }
        if (z) {
            while (e <= b0Var.m38137f() - this.f32109j) {
                b0Var.m38144P(e);
                boolean z3 = false;
                try {
                    z2 = C8966m.m10821d(b0Var, this.f32108i, this.f32110k, this.f32103d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (b0Var.m38138e() <= b0Var.m38137f()) {
                    z3 = z2;
                }
                if (z3) {
                    b0Var.m38144P(e);
                    return this.f32103d.f28851a;
                }
                e++;
            }
            b0Var.m38144P(b0Var.m38137f());
            return -1L;
        }
        b0Var.m38144P(e);
        return -1L;
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        int i = this.f32106g;
        if (i == 0) {
            m6769n(gVar);
            return 0;
        } else if (i == 1) {
            m6773i(gVar);
            return 0;
        } else if (i == 2) {
            m6767p(gVar);
            return 0;
        } else if (i == 3) {
            m6768o(gVar);
            return 0;
        } else if (i == 4) {
            m6775g(gVar);
            return 0;
        } else if (i == 5) {
            return m6770m(gVar, qVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f32104e = hVar;
        this.f32105f = hVar.mo6039r(0, 1);
        hVar.mo6040m();
    }

    public final void m6775g(AbstractC8959g gVar) {
        this.f32110k = C3466d.m30460b(gVar);
        ((AbstractC8960h) C1216l0.m37968j(this.f32104e)).mo6042a(m6774h(gVar.mo6043r(), gVar.mo6046a()));
        this.f32106g = 5;
    }

    public final AbstractC3470g m6774h(long j, long j2) {
        C1186a.m38185e(this.f32108i);
        FlacStreamMetadata flacStreamMetadata = this.f32108i;
        if (flacStreamMetadata.seekTable != null) {
            return new C3468e(flacStreamMetadata, j);
        }
        if (j2 == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new AbstractC3470g.C3472b(flacStreamMetadata.getDurationUs());
        }
        C9834a aVar = new C9834a(flacStreamMetadata, this.f32110k, j, j2);
        this.f32111l = aVar;
        return aVar.m30502b();
    }

    public final void m6773i(AbstractC8959g gVar) {
        byte[] bArr = this.f32100a;
        gVar.mo10806q(bArr, 0, bArr.length);
        gVar.mo10809m();
        this.f32106g = 2;
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        C3466d.m30459c(gVar, false);
        return C3466d.m30461a(gVar);
    }

    public final void m6771l() {
        ((AbstractC8974t) C1216l0.m37968j(this.f32105f)).mo10794e((this.f32113n * 1000000) / ((FlacStreamMetadata) C1216l0.m37968j(this.f32108i)).sampleRate, 1, this.f32112m, 0, null);
    }

    public final int m6770m(AbstractC8959g gVar, C8971q qVar) {
        boolean z;
        C1186a.m38185e(this.f32105f);
        C1186a.m38185e(this.f32108i);
        C9834a aVar = this.f32111l;
        if (aVar != null && aVar.m30500d()) {
            return this.f32111l.m30501c(gVar, qVar);
        }
        if (this.f32113n == -1) {
            this.f32113n = C8966m.m10816i(gVar, this.f32108i);
            return 0;
        }
        int f = this.f32101b.m38137f();
        if (f < 32768) {
            int b = gVar.mo4414b(this.f32101b.m38139d(), f, Log.TAG_ROUND - f);
            z = b == -1;
            if (!z) {
                this.f32101b.m38145O(f + b);
            } else if (this.f32101b.m38142a() == 0) {
                m6771l();
                return -1;
            }
        } else {
            z = false;
        }
        int e = this.f32101b.m38138e();
        int i = this.f32112m;
        int i2 = this.f32109j;
        if (i < i2) {
            C1189b0 b0Var = this.f32101b;
            b0Var.m38143Q(Math.min(i2 - i, b0Var.m38142a()));
        }
        long d = m6776d(this.f32101b, z);
        int e2 = this.f32101b.m38138e() - e;
        this.f32101b.m38144P(e);
        this.f32105f.mo10796c(this.f32101b, e2);
        this.f32112m += e2;
        if (d != -1) {
            m6771l();
            this.f32112m = 0;
            this.f32113n = d;
        }
        if (this.f32101b.m38142a() < 16) {
            int a = this.f32101b.m38142a();
            System.arraycopy(this.f32101b.m38139d(), this.f32101b.m38138e(), this.f32101b.m38139d(), 0, a);
            this.f32101b.m38144P(0);
            this.f32101b.m38145O(a);
        }
        return 0;
    }

    public final void m6769n(AbstractC8959g gVar) {
        this.f32107h = C3466d.m30458d(gVar, !this.f32102c);
        this.f32106g = 1;
    }

    public final void m6768o(AbstractC8959g gVar) {
        C3466d.C3467a aVar = new C3466d.C3467a(this.f32108i);
        boolean z = false;
        while (!z) {
            z = C3466d.m30457e(gVar, aVar);
            this.f32108i = (FlacStreamMetadata) C1216l0.m37968j(aVar.f11462a);
        }
        C1186a.m38185e(this.f32108i);
        this.f32109j = Math.max(this.f32108i.minFrameSize, 6);
        ((AbstractC8974t) C1216l0.m37968j(this.f32105f)).mo10798a(this.f32108i.getFormat(this.f32100a, this.f32107h));
        this.f32106g = 4;
    }

    public final void m6767p(AbstractC8959g gVar) {
        C3466d.m30452j(gVar);
        this.f32106g = 3;
    }

    public C9838c(int i) {
        this.f32100a = new byte[42];
        this.f32101b = new C1189b0(new byte[Log.TAG_ROUND], 0);
        this.f32102c = (i & 1) == 0 ? false : true;
        this.f32103d = new C8966m.C8967a();
        this.f32106g = 0;
    }
}
