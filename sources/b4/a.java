package b4;

import c5.l0;
import com.google.android.exoplayer2.extractor.g;
import java.io.EOFException;
import java.io.IOException;
import t3.i;
import t3.r;

public final class a implements g {
    public final f f3754a;
    public final long f3755b;
    public final long f3756c;
    public final i f3757d;
    public int f3758e;
    public long f3759f;
    public long f3760g;
    public long f3761h;
    public long f3762i;
    public long f3763j;
    public long f3764k;
    public long f3765l;

    public final class b implements g {
        public b() {
        }

        @Override
        public long d() {
            return a.this.f3757d.b(a.this.f3759f);
        }

        @Override
        public boolean g() {
            return true;
        }

        @Override
        public g.a i(long j10) {
            return new g.a(new r(j10, l0.q((a.this.f3755b + ((a.this.f3757d.c(j10) * (a.this.f3756c - a.this.f3755b)) / a.this.f3759f)) - 30000, a.this.f3755b, a.this.f3756c - 1)));
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        c5.a.a(j10 >= 0 && j11 > j10);
        this.f3757d = iVar;
        this.f3755b = j10;
        this.f3756c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f3759f = j13;
            this.f3758e = 4;
        } else {
            this.f3758e = 0;
        }
        this.f3754a = new f();
    }

    @Override
    public long a(t3.g gVar) {
        int i10 = this.f3758e;
        if (i10 == 0) {
            long r10 = gVar.r();
            this.f3760g = r10;
            this.f3758e = 1;
            long j10 = this.f3756c - 65307;
            if (j10 > r10) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(gVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f3758e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(gVar);
            this.f3758e = 4;
            return -(this.f3764k + 2);
        }
        this.f3759f = j(gVar);
        this.f3758e = 4;
        return this.f3760g;
    }

    @Override
    public void c(long j10) {
        this.f3761h = l0.q(j10, 0L, this.f3759f - 1);
        this.f3758e = 2;
        this.f3762i = this.f3755b;
        this.f3763j = this.f3756c;
        this.f3764k = 0L;
        this.f3765l = this.f3759f;
    }

    public b b() {
        if (this.f3759f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(t3.g gVar) {
        if (this.f3762i == this.f3763j) {
            return -1L;
        }
        long r10 = gVar.r();
        if (!this.f3754a.d(gVar, this.f3763j)) {
            long j10 = this.f3762i;
            if (j10 != r10) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f3754a.a(gVar, false);
        gVar.m();
        long j11 = this.f3761h;
        f fVar = this.f3754a;
        long j12 = fVar.f3785c;
        long j13 = j11 - j12;
        int i10 = fVar.f3790h + fVar.f3791i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        int i11 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
        if (i11 < 0) {
            this.f3763j = r10;
            this.f3765l = j12;
        } else {
            this.f3762i = gVar.r() + i10;
            this.f3764k = this.f3754a.f3785c;
        }
        long j14 = this.f3763j;
        long j15 = this.f3762i;
        if (j14 - j15 < 100000) {
            this.f3763j = j15;
            return j15;
        }
        long j16 = i10 * (i11 <= 0 ? 2L : 1L);
        long j17 = this.f3763j;
        long j18 = this.f3762i;
        return l0.q((gVar.r() - j16) + ((j13 * (j17 - j18)) / (this.f3765l - this.f3764k)), j18, j17 - 1);
    }

    public long j(t3.g gVar) {
        this.f3754a.b();
        if (this.f3754a.c(gVar)) {
            this.f3754a.a(gVar, false);
            f fVar = this.f3754a;
            gVar.n(fVar.f3790h + fVar.f3791i);
            long j10 = this.f3754a.f3785c;
            while (true) {
                f fVar2 = this.f3754a;
                if ((fVar2.f3784b & 4) == 4 || !fVar2.c(gVar) || gVar.r() >= this.f3756c || !this.f3754a.a(gVar, true)) {
                    break;
                }
                f fVar3 = this.f3754a;
                if (!i.e(gVar, fVar3.f3790h + fVar3.f3791i)) {
                    break;
                }
                j10 = this.f3754a.f3785c;
            }
            return j10;
        }
        throw new EOFException();
    }

    public final void k(t3.g gVar) {
        while (true) {
            this.f3754a.c(gVar);
            this.f3754a.a(gVar, false);
            f fVar = this.f3754a;
            if (fVar.f3785c > this.f3761h) {
                gVar.m();
                return;
            }
            gVar.n(fVar.f3790h + fVar.f3791i);
            this.f3762i = gVar.r();
            this.f3764k = this.f3754a.f3785c;
        }
    }
}
