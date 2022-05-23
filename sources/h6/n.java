package h6;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import i6.c;
import i6.u;
import j6.f;
import java.util.ArrayList;
import java.util.List;
import u5.a;
import u5.d;
import u5.e;

public final class n extends a<m> {
    public final ViewGroup f12568e;
    public final Context f12569f;
    public e<m> f12570g;
    public final GoogleMapOptions f12571h;
    public final List<e> f12572i = new ArrayList();

    public n(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f12568e = viewGroup;
        this.f12569f = context;
        this.f12571h = googleMapOptions;
    }

    @Override
    public final void a(e<m> eVar) {
        this.f12570g = eVar;
        n();
    }

    public final void n() {
        if (this.f12570g != null && b() == null) {
            try {
                d.a(this.f12569f);
                c e12 = u.a(this.f12569f).e1(d.x0(this.f12569f), this.f12571h);
                if (e12 != null) {
                    this.f12570g.a(new m(this.f12568e, e12));
                    for (e eVar : this.f12572i) {
                        b().a(eVar);
                    }
                    this.f12572i.clear();
                }
            } catch (RemoteException e10) {
                throw new f(e10);
            } catch (j5.f unused) {
            }
        }
    }

    public final void o(e eVar) {
        if (b() != null) {
            b().a(eVar);
        } else {
            this.f12572i.add(eVar);
        }
    }
}
