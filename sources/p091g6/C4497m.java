package p091g6;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import p103h6.AbstractC4991c;
import p103h6.C5013t;
import p119i6.C5245f;
import p163l5.C6378r;
import p272t5.AbstractC8985c;
import p272t5.BinderC8986d;

public final class C4497m implements AbstractC8985c {
    public final ViewGroup f14857a;
    public final AbstractC4991c f14858b;
    public View f14859c;

    public C4497m(ViewGroup viewGroup, AbstractC4991c cVar) {
        this.f14858b = (AbstractC4991c) C6378r.m20507k(cVar);
        this.f14857a = (ViewGroup) C6378r.m20507k(viewGroup);
    }

    public final void m27515a(AbstractC4489e eVar) {
        try {
            this.f14858b.mo24287x1(new BinderC4496l(this, eVar));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10767c() {
        try {
            this.f14858b.mo24292c();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10766f() {
        try {
            this.f14858b.mo24291f();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10765g() {
        try {
            this.f14858b.mo24290g();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10764i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C5013t.m24320a(bundle, bundle2);
            this.f14858b.mo24289i(bundle2);
            C5013t.m24320a(bundle2, bundle);
            this.f14859c = (View) BinderC8986d.m10762t(this.f14858b.mo24288r());
            this.f14857a.removeAllViews();
            this.f14857a.addView(this.f14859c);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }
}
