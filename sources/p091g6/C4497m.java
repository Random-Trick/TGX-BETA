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
        this.f14858b = (AbstractC4991c) C6378r.m20506k(cVar);
        this.f14857a = (ViewGroup) C6378r.m20506k(viewGroup);
    }

    public final void m27513a(AbstractC4489e eVar) {
        try {
            this.f14858b.mo24286x1(new BinderC4496l(this, eVar));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10768c() {
        try {
            this.f14858b.mo24291c();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10767f() {
        try {
            this.f14858b.mo24290f();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10766g() {
        try {
            this.f14858b.mo24289g();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Override
    public final void mo10765i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C5013t.m24319a(bundle, bundle2);
            this.f14858b.mo24288i(bundle2);
            C5013t.m24319a(bundle2, bundle);
            this.f14859c = (View) BinderC8986d.m10763t(this.f14858b.mo24287r());
            this.f14857a.removeAllViews();
            this.f14857a.addView(this.f14859c);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }
}
