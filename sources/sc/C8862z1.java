package sc;

import be.C1357a0;
import gd.C4779t2;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5070i;
import p156kd.C6251j;
import p350yd.C10930q6;

public class C8862z1 {
    public final TdApi.Venue f28610a;
    public final int f28611b;
    public final C6251j f28612c;
    public String f28613d;

    public C8862z1(C10930q6 q6Var, TdApi.InlineQueryResultVenue inlineQueryResultVenue, TdApi.Location location) {
        this(q6Var, inlineQueryResultVenue.venue, location);
        this.f28613d = inlineQueryResultVenue.f25388id;
    }

    public TdApi.InputMessageVenue m11088a() {
        return new TdApi.InputMessageVenue(this.f28610a);
    }

    public String m11087b() {
        return this.f28610a.address;
    }

    public C6251j m11086c() {
        return this.f28612c;
    }

    public double m11085d() {
        return this.f28610a.location.latitude;
    }

    public double m11084e() {
        return this.f28610a.location.longitude;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C8862z1)) {
            C8862z1 z1Var = (C8862z1) obj;
            if (C5070i.m24067c(z1Var.f28610a.f25440id, this.f28610a.f25440id) && C5070i.m24067c(z1Var.f28610a.provider, this.f28610a.provider)) {
                return true;
            }
        }
        return false;
    }

    public String m11083f() {
        return this.f28610a.title;
    }

    public C8862z1(C10930q6 q6Var, TdApi.Venue venue, TdApi.Location location) {
        this.f28610a = venue;
        if (location != null) {
            TdApi.Location location2 = venue.location;
            this.f28611b = (int) C7389v0.m16664Y(location2.latitude, location2.longitude, location.latitude, location.longitude);
        } else {
            this.f28611b = 0;
        }
        String x1 = C4779t2.m25396x1(venue);
        if (x1 != null) {
            C6251j jVar = new C6251j(q6Var, x1, new TdApi.FileTypeThumbnail());
            this.f28612c = jVar;
            jVar.mo20767t0(C1357a0.m37541i(40.0f));
            jVar.m20897s0(1);
            return;
        }
        this.f28612c = null;
    }
}
