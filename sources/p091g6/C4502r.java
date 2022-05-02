package p091g6;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import java.util.ArrayList;
import java.util.List;
import p103h6.C5014u;
import p118i5.C5222f;
import p119i6.C5245f;
import p272t5.AbstractC8982a;
import p272t5.AbstractC8987e;
import p272t5.BinderC8986d;

public final class C4502r extends AbstractC8982a<C4501q> {
    public final ViewGroup f14869e;
    public final Context f14870f;
    public AbstractC8987e<C4501q> f14871g;
    public final StreetViewPanoramaOptions f14872h;
    public final List<AbstractC4490f> f14873i = new ArrayList();

    public C4502r(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f14869e = viewGroup;
        this.f14870f = context;
        this.f14872h = streetViewPanoramaOptions;
    }

    @Override
    public final void mo10781a(AbstractC8987e<C4501q> eVar) {
        this.f14871g = eVar;
        m27511n();
    }

    public final void m27511n() {
        if (this.f14871g != null && m10780b() == null) {
            try {
                C4488d.m27520a(this.f14870f);
                this.f14871g.mo10759a(new C4501q(this.f14869e, C5014u.m24316a(this.f14870f).mo24313B0(BinderC8986d.m10763E0(this.f14870f), this.f14872h)));
                for (AbstractC4490f fVar : this.f14873i) {
                    m10780b().m27512a(fVar);
                }
                this.f14873i.clear();
            } catch (RemoteException e) {
                throw new C5245f(e);
            } catch (C5222f unused) {
            }
        }
    }
}
