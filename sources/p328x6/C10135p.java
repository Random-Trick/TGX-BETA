package p328x6;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.AbstractC3514b;
import p328x6.AbstractC10114g;
import p328x6.AbstractC10116h;

public final class C10135p implements AbstractC3514b {
    public AbstractC10108d f32843a;
    public AbstractC10111f f32844b;

    public class BinderC10136a extends AbstractC10116h.AbstractBinderC10117a {
        public final AbstractC3514b.AbstractC3518d f32845a;

        public BinderC10136a(AbstractC3514b.AbstractC3518d dVar) {
            this.f32845a = dVar;
        }

        @Override
        public final void mo5922a() {
            this.f32845a.mo30250l();
        }

        @Override
        public final void mo5921b() {
            this.f32845a.mo30254c();
        }

        @Override
        public final void mo5920e() {
            this.f32845a.mo30252i();
        }

        @Override
        public final void mo5919l() {
            this.f32845a.mo30251k();
        }

        @Override
        public final void mo5918o(String str) {
            this.f32845a.mo30253g(str);
        }

        @Override
        public final void mo5917w0(String str) {
            AbstractC3514b.EnumC3515a aVar;
            try {
                aVar = AbstractC3514b.EnumC3515a.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                aVar = AbstractC3514b.EnumC3515a.UNKNOWN;
            }
            this.f32845a.mo30249m(aVar);
        }
    }

    public class BinderC10137b extends AbstractC10114g.AbstractBinderC10115a {
        public final AbstractC3514b.AbstractC3517c f32847a;

        public BinderC10137b(AbstractC3514b.AbstractC3517c cVar) {
            this.f32847a = cVar;
        }

        @Override
        public final void mo5916a() {
            this.f32847a.mo30255j();
        }

        @Override
        public final void mo5915b() {
            this.f32847a.mo30257f();
        }

        @Override
        public final void mo5914d(boolean z) {
            this.f32847a.mo30258b(z);
        }

        @Override
        public final void mo5913e() {
            this.f32847a.mo30259a();
        }

        @Override
        public final void mo5912m(int i) {
            this.f32847a.mo30256h(i);
        }
    }

    public C10135p(AbstractC10108d dVar, AbstractC10111f fVar) {
        this.f32843a = (AbstractC10108d) C10106b.m6016b(dVar, "connectionClient cannot be null");
        this.f32844b = (AbstractC10111f) C10106b.m6016b(fVar, "embeddedPlayer cannot be null");
    }

    public final Bundle m5949A() {
        try {
            return this.f32844b.mo6009C();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final View m5948a() {
        try {
            return (View) BinderC10144s.m5905s(this.f32844b.mo6005P());
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5947b() {
        try {
            this.f32844b.mo5997b();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5946c(Configuration configuration) {
        try {
            this.f32844b.mo6001T(configuration);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5945d(boolean z) {
        try {
            this.f32844b.mo5996d(z);
            this.f32843a.mo5975d(z);
            this.f32843a.mo5910l();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final boolean m5944e(int i, KeyEvent keyEvent) {
        try {
            return this.f32844b.mo5993f0(i, keyEvent);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final boolean m5943f(Bundle bundle) {
        try {
            return this.f32844b.mo6007K(bundle);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5942g() {
        try {
            this.f32844b.mo5998a();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5941h(String str) {
        mo5933p(str, 0);
    }

    @Override
    public final void mo5940i(boolean z) {
        try {
            this.f32844b.mo6006N0(z);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5939j(AbstractC3514b.AbstractC3518d dVar) {
        try {
            this.f32844b.mo5986x(new BinderC10136a(dVar));
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5938k(int i) {
        try {
            this.f32844b.mo5990m(i);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final boolean mo5937l() {
        try {
            return this.f32844b.mo5994e();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5936m(AbstractC3514b.EnumC3519e eVar) {
        try {
            this.f32844b.mo5989o(eVar.name());
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5935n(int i) {
        try {
            this.f32844b.mo6002S0(i);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5934o(AbstractC3514b.AbstractC3517c cVar) {
        try {
            this.f32844b.mo6004Q(new BinderC10137b(cVar));
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final void mo5933p(String str, int i) {
        try {
            this.f32844b.mo6003R0(str, i);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final int mo5932q() {
        try {
            return this.f32844b.mo5991k1();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    @Override
    public final int mo5931r() {
        try {
            return this.f32844b.mo6010B1();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5930s() {
        try {
            this.f32844b.mo5987u0();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5929t(boolean z) {
        try {
            this.f32844b.mo5985z1(z);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final boolean m5928u(int i, KeyEvent keyEvent) {
        try {
            return this.f32844b.mo5999X0(i, keyEvent);
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5927v() {
        try {
            this.f32844b.mo6008H0();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5926w() {
        try {
            this.f32844b.mo6000U0();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5925x() {
        try {
            this.f32844b.mo5995d1();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5924y() {
        try {
            this.f32844b.mo5988t1();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }

    public final void m5923z() {
        try {
            this.f32844b.mo5992k0();
        } catch (RemoteException e) {
            throw new C10127n(e);
        }
    }
}
