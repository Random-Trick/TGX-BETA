package p091g6;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.List;
import p103h6.AbstractC4991c;
import p103h6.C5014u;
import p118i5.C5222f;
import p119i6.C5245f;
import p272t5.AbstractC8982a;
import p272t5.AbstractC8987e;
import p272t5.BinderC8986d;

public final class C4498n extends AbstractC8982a<C4497m> {
    public final ViewGroup f14860e;
    public final Context f14861f;
    public AbstractC8987e<C4497m> f14862g;
    public final GoogleMapOptions f14863h;
    public final List<AbstractC4489e> f14864i = new ArrayList();

    public C4498n(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f14860e = viewGroup;
        this.f14861f = context;
        this.f14863h = googleMapOptions;
    }

    @Override
    public final void mo10781a(AbstractC8987e<C4497m> eVar) {
        this.f14862g = eVar;
        m27514n();
    }

    public final void m27514n() {
        if (this.f14862g != null && m10780b() == null) {
            try {
                C4488d.m27520a(this.f14861f);
                AbstractC4991c g1 = C5014u.m24316a(this.f14861f).mo24311g1(BinderC8986d.m10763E0(this.f14861f), this.f14863h);
                if (g1 != null) {
                    this.f14862g.mo10759a(new C4497m(this.f14860e, g1));
                    for (AbstractC4489e eVar : this.f14864i) {
                        m10780b().m27515a(eVar);
                    }
                    this.f14864i.clear();
                }
            } catch (RemoteException e) {
                throw new C5245f(e);
            } catch (C5222f unused) {
            }
        }
    }

    public final void m27513o(AbstractC4489e eVar) {
        if (m10780b() != null) {
            m10780b().m27515a(eVar);
        } else {
            this.f14864i.add(eVar);
        }
    }
}
