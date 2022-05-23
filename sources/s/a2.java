package s;

import r.a;
import w.f;
import y.j0;
import y.n2;
import y.z0;

public final class a2 extends l0 {
    public static final a2 f21949c = new a2(new f());
    public final f f21950b;

    public a2(f fVar) {
        this.f21950b = fVar;
    }

    @Override
    public void a(n2<?> n2Var, j0.a aVar) {
        super.a(n2Var, aVar);
        if (n2Var instanceof z0) {
            z0 z0Var = (z0) n2Var;
            a.C0201a aVar2 = new a.C0201a();
            if (z0Var.O()) {
                this.f21950b.a(z0Var.G(), aVar2);
            }
            aVar.e(aVar2.c());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
