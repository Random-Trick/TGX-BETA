package h6;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import i6.u;
import j6.f;
import java.util.ArrayList;
import java.util.List;
import u5.a;
import u5.d;
import u5.e;

public final class r extends a<q> {
    public final ViewGroup f12577e;
    public final Context f12578f;
    public e<q> f12579g;
    public final StreetViewPanoramaOptions f12580h;
    public final List<f> f12581i = new ArrayList();

    public r(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f12577e = viewGroup;
        this.f12578f = context;
        this.f12580h = streetViewPanoramaOptions;
    }

    @Override
    public final void a(e<q> eVar) {
        this.f12579g = eVar;
        n();
    }

    public final void n() {
        if (this.f12579g != null && b() == null) {
            try {
                d.a(this.f12578f);
                this.f12579g.a(new q(this.f12577e, u.a(this.f12578f).X(d.x0(this.f12578f), this.f12580h)));
                for (f fVar : this.f12581i) {
                    b().a(fVar);
                }
                this.f12581i.clear();
            } catch (RemoteException e10) {
                throw new f(e10);
            } catch (j5.f unused) {
            }
        }
    }
}
