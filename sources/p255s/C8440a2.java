package p255s;

import p240r.C8333a;
import p306w.C9928f;
import p336y.AbstractC10273n2;
import p336y.C10245j0;
import p336y.C10324z0;

public final class C8440a2 extends C8517l0 {
    public static final C8440a2 f27403c = new C8440a2(new C9928f());
    public final C9928f f27404b;

    public C8440a2(C9928f fVar) {
        this.f27404b = fVar;
    }

    @Override
    public void mo5633a(AbstractC10273n2<?> n2Var, C10245j0.C10246a aVar) {
        super.mo5633a(n2Var, aVar);
        if (n2Var instanceof C10324z0) {
            C10324z0 z0Var = (C10324z0) n2Var;
            C8333a.C8334a aVar2 = new C8333a.C8334a();
            if (z0Var.m5442O()) {
                this.f27404b.m6472a(z0Var.m5450G(), aVar2);
            }
            aVar.m5645e(aVar2.m12792c());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
