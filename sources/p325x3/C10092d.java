package p325x3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;
import p270t3.C8972r;

public final class C10092d implements AbstractC8960h {
    public final long f32782a;
    public final AbstractC8960h f32783b;

    public class C10093a implements AbstractC3470g {
        public final AbstractC3470g f32784a;

        public C10093a(AbstractC3470g gVar) {
            this.f32784a = gVar;
        }

        @Override
        public long mo1126d() {
            return this.f32784a.mo1126d();
        }

        @Override
        public boolean mo1125g() {
            return this.f32784a.mo1125g();
        }

        @Override
        public AbstractC3470g.C3471a mo1123i(long j) {
            AbstractC3470g.C3471a i = this.f32784a.mo1123i(j);
            C8972r rVar = i.f11469a;
            C8972r rVar2 = new C8972r(rVar.f28862a, rVar.f28863b + C10092d.this.f32782a);
            C8972r rVar3 = i.f11470b;
            return new AbstractC3470g.C3471a(rVar2, new C8972r(rVar3.f28862a, rVar3.f28863b + C10092d.this.f32782a));
        }
    }

    public C10092d(long j, AbstractC8960h hVar) {
        this.f32782a = j;
        this.f32783b = hVar;
    }

    @Override
    public void mo6042a(AbstractC3470g gVar) {
        this.f32783b.mo6042a(new C10093a(gVar));
    }

    @Override
    public void mo6040m() {
        this.f32783b.mo6040m();
    }

    @Override
    public AbstractC8974t mo6039r(int i, int i2) {
        return this.f32783b.mo6039r(i, i2);
    }
}
