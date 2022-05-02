package p091g6;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import p103h6.AbstractC4995e;
import p103h6.C5013t;
import p119i6.C5245f;
import p163l5.C6378r;
import p272t5.AbstractC8985c;
import p272t5.BinderC8986d;

public final class C4501q implements AbstractC8985c {
    public final ViewGroup f14866a;
    public final AbstractC4995e f14867b;
    public View f14868c;

    public C4501q(ViewGroup viewGroup, AbstractC4995e eVar) {
        this.f14867b = (AbstractC4995e) C6378r.m20507k(eVar);
        this.f14866a = (ViewGroup) C6378r.m20507k(viewGroup);
    }

    public final void m27512a(AbstractC4490f fVar) {
        try {
            this.f14867b.mo24327f1(new BinderC4500p(this, fVar));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10767c() {
        try {
            this.f14867b.mo24329c();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10766f() {
        try {
            this.f14867b.mo24328f();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10765g() {
        try {
            this.f14867b.mo24326g();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10764i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C5013t.m24320a(bundle, bundle2);
            this.f14867b.mo24325i(bundle2);
            C5013t.m24320a(bundle2, bundle);
            this.f14868c = (View) BinderC8986d.m10762t(this.f14867b.mo24324r());
            this.f14866a.removeAllViews();
            this.f14866a.addView(this.f14868c);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }
}
