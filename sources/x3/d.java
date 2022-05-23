package x3;

import com.google.android.exoplayer2.extractor.g;
import t3.h;
import t3.r;
import t3.t;

public final class d implements h {
    public final long f25978a;
    public final h f25979b;

    public class a implements g {
        public final g f25980a;

        public a(g gVar) {
            this.f25980a = gVar;
        }

        @Override
        public long d() {
            return this.f25980a.d();
        }

        @Override
        public boolean g() {
            return this.f25980a.g();
        }

        @Override
        public g.a i(long j10) {
            g.a i10 = this.f25980a.i(j10);
            r rVar = i10.f5580a;
            r rVar2 = new r(rVar.f22901a, rVar.f22902b + d.this.f25978a);
            r rVar3 = i10.f5581b;
            return new g.a(rVar2, new r(rVar3.f22901a, rVar3.f22902b + d.this.f25978a));
        }
    }

    public d(long j10, h hVar) {
        this.f25978a = j10;
        this.f25979b = hVar;
    }

    @Override
    public void a(g gVar) {
        this.f25979b.a(new a(gVar));
    }

    @Override
    public void k() {
        this.f25979b.k();
    }

    @Override
    public t q(int i10, int i11) {
        return this.f25979b.q(i10, i11);
    }
}
