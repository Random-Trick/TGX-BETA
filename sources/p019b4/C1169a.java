package p019b4;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import java.io.EOFException;
import java.io.IOException;
import p020b5.C1186a;
import p020b5.C1216l0;
import p270t3.AbstractC8959g;
import p270t3.C8962i;
import p270t3.C8972r;

public final class C1169a implements AbstractC1178g {
    public final C1177f f4402a;
    public final long f4403b;
    public final long f4404c;
    public final AbstractC1180i f4405d;
    public int f4406e;
    public long f4407f;
    public long f4408g;
    public long f4409h;
    public long f4410i;
    public long f4411j;
    public long f4412k;
    public long f4413l;

    public final class C1171b implements AbstractC3470g {
        public C1171b() {
        }

        @Override
        public long mo1126d() {
            return C1169a.this.f4405d.m38209b(C1169a.this.f4407f);
        }

        @Override
        public boolean mo1125g() {
            return true;
        }

        @Override
        public AbstractC3470g.C3471a mo1123i(long j) {
            return new AbstractC3470g.C3471a(new C8972r(j, C1216l0.m37954q((C1169a.this.f4403b + ((C1169a.this.f4405d.m38208c(j) * (C1169a.this.f4404c - C1169a.this.f4403b)) / C1169a.this.f4407f)) - 30000, C1169a.this.f4403b, C1169a.this.f4404c - 1)));
        }
    }

    public C1169a(AbstractC1180i iVar, long j, long j2, long j3, long j4, boolean z) {
        C1186a.m38189a(j >= 0 && j2 > j);
        this.f4405d = iVar;
        this.f4403b = j;
        this.f4404c = j2;
        if (j3 == j2 - j || z) {
            this.f4407f = j4;
            this.f4406e = 4;
        } else {
            this.f4406e = 0;
        }
        this.f4402a = new C1177f();
    }

    @Override
    public long mo38201a(AbstractC8959g gVar) {
        int i = this.f4406e;
        if (i == 0) {
            long r = gVar.mo6043r();
            this.f4408g = r;
            this.f4406e = 1;
            long j = this.f4404c - 65307;
            if (j > r) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = m38233i(gVar);
                if (i2 != -1) {
                    return i2;
                }
                this.f4406e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m38231k(gVar);
            this.f4406e = 4;
            return -(this.f4412k + 2);
        }
        this.f4407f = m38232j(gVar);
        this.f4406e = 4;
        return this.f4408g;
    }

    @Override
    public void mo38199c(long j) {
        this.f4409h = C1216l0.m37954q(j, 0L, this.f4407f - 1);
        this.f4406e = 2;
        this.f4410i = this.f4403b;
        this.f4411j = this.f4404c;
        this.f4412k = 0L;
        this.f4413l = this.f4407f;
    }

    public C1171b mo38200b() {
        if (this.f4407f != 0) {
            return new C1171b();
        }
        return null;
    }

    public final long m38233i(AbstractC8959g gVar) {
        if (this.f4410i == this.f4411j) {
            return -1L;
        }
        long r = gVar.mo6043r();
        if (!this.f4402a.m38213d(gVar, this.f4411j)) {
            long j = this.f4410i;
            if (j != r) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f4402a.m38216a(gVar, false);
        gVar.mo10809m();
        long j2 = this.f4409h;
        C1177f fVar = this.f4402a;
        long j3 = fVar.f4433c;
        long j4 = j2 - j3;
        int i = fVar.f4438h + fVar.f4439i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i2 < 0) {
            this.f4411j = r;
            this.f4413l = j3;
        } else {
            this.f4410i = gVar.mo6043r() + i;
            this.f4412k = this.f4402a.f4433c;
        }
        long j5 = this.f4411j;
        long j6 = this.f4410i;
        if (j5 - j6 < 100000) {
            this.f4411j = j6;
            return j6;
        }
        long j7 = i * (i2 <= 0 ? 2L : 1L);
        long j8 = this.f4411j;
        long j9 = this.f4410i;
        return C1216l0.m37954q((gVar.mo6043r() - j7) + ((j4 * (j8 - j9)) / (this.f4413l - this.f4412k)), j9, j8 - 1);
    }

    public long m38232j(AbstractC8959g gVar) {
        this.f4402a.m38215b();
        if (this.f4402a.m38214c(gVar)) {
            this.f4402a.m38216a(gVar, false);
            C1177f fVar = this.f4402a;
            gVar.mo10808n(fVar.f4438h + fVar.f4439i);
            long j = this.f4402a.f4433c;
            while (true) {
                C1177f fVar2 = this.f4402a;
                if ((fVar2.f4432b & 4) == 4 || !fVar2.m38214c(gVar) || gVar.mo6043r() >= this.f4404c || !this.f4402a.m38216a(gVar, true)) {
                    break;
                }
                C1177f fVar3 = this.f4402a;
                if (!C8962i.m10828e(gVar, fVar3.f4438h + fVar3.f4439i)) {
                    break;
                }
                j = this.f4402a.f4433c;
            }
            return j;
        }
        throw new EOFException();
    }

    public final void m38231k(AbstractC8959g gVar) {
        while (true) {
            this.f4402a.m38214c(gVar);
            this.f4402a.m38216a(gVar, false);
            C1177f fVar = this.f4402a;
            if (fVar.f4433c > this.f4409h) {
                gVar.mo10809m();
                return;
            }
            gVar.mo10808n(fVar.f4438h + fVar.f4439i);
            this.f4410i = gVar.mo6043r();
            this.f4412k = this.f4402a.f4433c;
        }
    }
}
