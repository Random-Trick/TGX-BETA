package p048d8;

import android.content.Context;
import p009a8.AbstractC0211e;
import p009a8.C0218i;
import p033c6.C1686cb;
import p033c6.C1863ob;
import p035c8.C2035c;
import p118i5.C5221e;

public final class C3905f extends AbstractC0211e<C2035c, C3908i> {
    public final C0218i f13189b;

    public C3905f(C0218i iVar) {
        this.f13189b = iVar;
    }

    @Override
    public final C3908i mo29615a(C2035c cVar) {
        AbstractC3909j jVar;
        C2035c cVar2 = cVar;
        Context b = this.f13189b.m42081b();
        C1686cb b2 = C1863ob.m35968b(C3901b.m29619d());
        if (C3912m.m29607a(b) || C5221e.m23587h().m23593b(b) >= 204500000) {
            jVar = new C3912m(b, cVar2, b2);
        } else {
            jVar = new C3914o(b, cVar2, b2);
        }
        return new C3908i(this.f13189b, cVar2, jVar, b2);
    }
}
