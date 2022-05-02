package p321x;

import androidx.camera.core.AbstractC0560f0;
import java.util.Set;
import p321x.C10061j;
import p336y.AbstractC10268n0;
import p336y.AbstractC10277o1;
import p336y.AbstractC10325z1;
import p336y.C10284p1;
import p336y.C10300t1;
import p336y.C10321y1;

public class C10061j implements AbstractC10325z1 {
    public final AbstractC10268n0 f32732w;

    public static final class C10062a implements AbstractC0560f0<C10061j> {
        public final C10284p1 f32733a = C10284p1.m5569J();

        public static C10062a m6089e(final AbstractC10268n0 n0Var) {
            final C10062a aVar = new C10062a();
            n0Var.mo5439g("camera2.captureRequest.option.", new AbstractC10268n0.AbstractC10270b() {
                @Override
                public final boolean mo5577a(AbstractC10268n0.AbstractC10269a aVar2) {
                    boolean f;
                    f = C10061j.C10062a.m6088f(C10061j.C10062a.this, n0Var, aVar2);
                    return f;
                }
            });
            return aVar;
        }

        public static boolean m6088f(C10062a aVar, AbstractC10268n0 n0Var, AbstractC10268n0.AbstractC10269a aVar2) {
            aVar.mo6092a().mo5565y(aVar2, n0Var.mo5423d(aVar2), n0Var.mo5424c(aVar2));
            return true;
        }

        @Override
        public AbstractC10277o1 mo6092a() {
            return this.f32733a;
        }

        public C10061j m6090d() {
            return new C10061j(C10300t1.m5524H(this.f32733a));
        }
    }

    public C10061j(AbstractC10268n0 n0Var) {
        this.f32732w = n0Var;
    }

    @Override
    public Object mo5426a(AbstractC10268n0.AbstractC10269a aVar, Object obj) {
        return C10321y1.m5462g(this, aVar, obj);
    }

    @Override
    public Set mo5425b() {
        return C10321y1.m5464e(this);
    }

    @Override
    public Object mo5424c(AbstractC10268n0.AbstractC10269a aVar) {
        return C10321y1.m5463f(this, aVar);
    }

    @Override
    public AbstractC10268n0.EnumC10271c mo5423d(AbstractC10268n0.AbstractC10269a aVar) {
        return C10321y1.m5466c(this, aVar);
    }

    @Override
    public boolean mo5422e(AbstractC10268n0.AbstractC10269a aVar) {
        return C10321y1.m5468a(this, aVar);
    }

    @Override
    public void mo5439g(String str, AbstractC10268n0.AbstractC10270b bVar) {
        C10321y1.m5467b(this, str, bVar);
    }

    @Override
    public AbstractC10268n0 mo5421k() {
        return this.f32732w;
    }

    @Override
    public Set mo5436l(AbstractC10268n0.AbstractC10269a aVar) {
        return C10321y1.m5465d(this, aVar);
    }

    @Override
    public Object mo5427x(AbstractC10268n0.AbstractC10269a aVar, AbstractC10268n0.EnumC10271c cVar) {
        return C10321y1.m5461h(this, aVar, cVar);
    }
}
