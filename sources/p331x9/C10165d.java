package p331x9;

import android.opengl.EGL14;
import android.view.Surface;
import p064e9.C4166a;
import p137j9.C5905d;
import p250r9.AbstractC8412h;
import p250r9.C8413i;
import p289u9.AbstractC9461b;
import p289u9.AbstractC9475i;
import p289u9.AbstractC9480j;
import qa.C8298k;

public final class C10165d implements AbstractC9480j<Long, AbstractC9461b, C8413i, AbstractC8412h> {
    public final AbstractC9461b.C9462a f32886b = AbstractC9461b.f30688a;
    public final C4166a f32887c = new C4166a(EGL14.EGL_NO_CONTEXT, 1);
    public C5905d f32888d;

    @Override
    public void mo5861a() {
        C5905d dVar = this.f32888d;
        if (dVar == null) {
            C8298k.m12924n("surface");
        }
        dVar.mo21864d();
        this.f32887c.m28634g();
    }

    public AbstractC9461b.C9462a mo5860e() {
        return this.f32886b;
    }

    public void mo5856i(AbstractC8412h hVar) {
        C8298k.m12933e(hVar, "next");
        AbstractC9480j.C9481a.m8557a(this, hVar);
        C4166a aVar = this.f32887c;
        Surface b = hVar.mo12548b();
        C8298k.m12935c(b);
        C5905d dVar = new C5905d(aVar, b, false);
        this.f32888d = dVar;
        dVar.m21867c();
    }

    @Override
    public AbstractC9475i<C8413i> mo5858g(AbstractC9475i.C9477b<Long> bVar, boolean z) {
        C8298k.m12933e(bVar, "state");
        if (bVar instanceof AbstractC9475i.C9476a) {
            return new AbstractC9475i.C9476a(C8413i.f27318e.m12542a());
        }
        C5905d dVar = this.f32888d;
        if (dVar == null) {
            C8298k.m12924n("surface");
        }
        dVar.m21866e(bVar.m8558a().longValue() * 1000);
        C5905d dVar2 = this.f32888d;
        if (dVar2 == null) {
            C8298k.m12924n("surface");
        }
        dVar2.m21865f();
        return new AbstractC9475i.C9477b(C8413i.f27318e.m12542a());
    }
}
