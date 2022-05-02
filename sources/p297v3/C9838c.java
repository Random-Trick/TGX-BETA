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
    public static final AbstractC8965l f32102o = C9837b.f32101b;
    public final byte[] f32103a;
    public final C1189b0 f32104b;
    public final boolean f32105c;
    public final C8966m.C8967a f32106d;
    public AbstractC8960h f32107e;
    public AbstractC8974t f32108f;
    public int f32109g;
    public C4260a f32110h;
    public FlacStreamMetadata f32111i;
    public int f32112j;
    public int f32113k;
    public C9834a f32114l;
    public int f32115m;
    public long f32116n;

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
            this.f32109g = 0;
        } else {
            C9834a aVar = this.f32114l;
            if (aVar != null) {
                aVar.m30498h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f32116n = j3;
        this.f32115m = 0;
        this.f32104b.m38151L(0);
    }

    public final long m6776d(C1189b0 b0Var, boolean z) {
        boolean z2;
        C1186a.m38188e(this.f32111i);
        int e = b0Var.m38141e();
        while (e <= b0Var.m38140f() - 16) {
            b0Var.m38147P(e);
            if (C8966m.m10820d(b0Var, this.f32111i, this.f32113k, this.f32106d)) {
                b0Var.m38147P(e);
                return this.f32106d.f28854a;
            }
            e++;
        }
        if (z) {
            while (e <= b0Var.m38140f() - this.f32112j) {
                b0Var.m38147P(e);
                boolean z3 = false;
                try {
                    z2 = C8966m.m10820d(b0Var, this.f32111i, this.f32113k, this.f32106d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (b0Var.m38141e() <= b0Var.m38140f()) {
                    z3 = z2;
                }
                if (z3) {
                    b0Var.m38147P(e);
                    return this.f32106d.f28854a;
                }
                e++;
            }
            b0Var.m38147P(b0Var.m38140f());
            return -1L;
        }
        b0Var.m38147P(e);
        return -1L;
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        int i = this.f32109g;
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
        this.f32107e = hVar;
        this.f32108f = hVar.mo6039r(0, 1);
        hVar.mo6040m();
    }

    public final void m6775g(AbstractC8959g gVar) {
        this.f32113k = C3466d.m30462b(gVar);
        ((AbstractC8960h) C1216l0.m37971j(this.f32107e)).mo6042a(m6774h(gVar.mo6043r(), gVar.mo6046a()));
        this.f32109g = 5;
    }

    public final AbstractC3470g m6774h(long j, long j2) {
        C1186a.m38188e(this.f32111i);
        FlacStreamMetadata flacStreamMetadata = this.f32111i;
        if (flacStreamMetadata.seekTable != null) {
            return new C3468e(flacStreamMetadata, j);
        }
        if (j2 == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new AbstractC3470g.C3472b(flacStreamMetadata.getDurationUs());
        }
        C9834a aVar = new C9834a(flacStreamMetadata, this.f32113k, j, j2);
        this.f32114l = aVar;
        return aVar.m30504b();
    }

    public final void m6773i(AbstractC8959g gVar) {
        byte[] bArr = this.f32103a;
        gVar.mo10805q(bArr, 0, bArr.length);
        gVar.mo10808m();
        this.f32109g = 2;
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        C3466d.m30461c(gVar, false);
        return C3466d.m30463a(gVar);
    }

    public final void m6771l() {
        ((AbstractC8974t) C1216l0.m37971j(this.f32108f)).mo10793e((this.f32116n * 1000000) / ((FlacStreamMetadata) C1216l0.m37971j(this.f32111i)).sampleRate, 1, this.f32115m, 0, null);
    }

    public final int m6770m(AbstractC8959g gVar, C8971q qVar) {
        boolean z;
        C1186a.m38188e(this.f32108f);
        C1186a.m38188e(this.f32111i);
        C9834a aVar = this.f32114l;
        if (aVar != null && aVar.m30502d()) {
            return this.f32114l.m30503c(gVar, qVar);
        }
        if (this.f32116n == -1) {
            this.f32116n = C8966m.m10815i(gVar, this.f32111i);
            return 0;
        }
        int f = this.f32104b.m38140f();
        if (f < 32768) {
            int b = gVar.mo4414b(this.f32104b.m38142d(), f, Log.TAG_ROUND - f);
            z = b == -1;
            if (!z) {
                this.f32104b.m38148O(f + b);
            } else if (this.f32104b.m38145a() == 0) {
                m6771l();
                return -1;
            }
        } else {
            z = false;
        }
        int e = this.f32104b.m38141e();
        int i = this.f32115m;
        int i2 = this.f32112j;
        if (i < i2) {
            C1189b0 b0Var = this.f32104b;
            b0Var.m38146Q(Math.min(i2 - i, b0Var.m38145a()));
        }
        long d = m6776d(this.f32104b, z);
        int e2 = this.f32104b.m38141e() - e;
        this.f32104b.m38147P(e);
        this.f32108f.mo10795c(this.f32104b, e2);
        this.f32115m += e2;
        if (d != -1) {
            m6771l();
            this.f32115m = 0;
            this.f32116n = d;
        }
        if (this.f32104b.m38145a() < 16) {
            int a = this.f32104b.m38145a();
            System.arraycopy(this.f32104b.m38142d(), this.f32104b.m38141e(), this.f32104b.m38142d(), 0, a);
            this.f32104b.m38147P(0);
            this.f32104b.m38148O(a);
        }
        return 0;
    }

    public final void m6769n(AbstractC8959g gVar) {
        this.f32110h = C3466d.m30460d(gVar, !this.f32105c);
        this.f32109g = 1;
    }

    public final void m6768o(AbstractC8959g gVar) {
        C3466d.C3467a aVar = new C3466d.C3467a(this.f32111i);
        boolean z = false;
        while (!z) {
            z = C3466d.m30459e(gVar, aVar);
            this.f32111i = (FlacStreamMetadata) C1216l0.m37971j(aVar.f11462a);
        }
        C1186a.m38188e(this.f32111i);
        this.f32112j = Math.max(this.f32111i.minFrameSize, 6);
        ((AbstractC8974t) C1216l0.m37971j(this.f32108f)).mo10797a(this.f32111i.getFormat(this.f32103a, this.f32110h));
        this.f32109g = 4;
    }

    public final void m6767p(AbstractC8959g gVar) {
        C3466d.m30454j(gVar);
        this.f32109g = 3;
    }

    public C9838c(int i) {
        this.f32103a = new byte[42];
        this.f32104b = new C1189b0(new byte[Log.TAG_ROUND], 0);
        this.f32105c = (i & 1) == 0 ? false : true;
        this.f32106d = new C8966m.C8967a();
        this.f32109g = 0;
    }
}
