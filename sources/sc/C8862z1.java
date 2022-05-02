package sc;

import be.C1357a0;
import gd.C4779t2;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5070i;
import p156kd.C6251j;
import p350yd.C10930q6;

public class C8862z1 {
    public final TdApi.Venue f28613a;
    public final int f28614b;
    public final C6251j f28615c;
    public String f28616d;

    public C8862z1(C10930q6 q6Var, TdApi.InlineQueryResultVenue inlineQueryResultVenue, TdApi.Location location) {
        this(q6Var, inlineQueryResultVenue.venue, location);
        this.f28616d = inlineQueryResultVenue.f25391id;
    }

    public TdApi.InputMessageVenue m11087a() {
        return new TdApi.InputMessageVenue(this.f28613a);
    }

    public String m11086b() {
        return this.f28613a.address;
    }

    public C6251j m11085c() {
        return this.f28615c;
    }

    public double m11084d() {
        return this.f28613a.location.latitude;
    }

    public double m11083e() {
        return this.f28613a.location.longitude;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C8862z1)) {
            C8862z1 z1Var = (C8862z1) obj;
            if (C5070i.m24068c(z1Var.f28613a.f25443id, this.f28613a.f25443id) && C5070i.m24068c(z1Var.f28613a.provider, this.f28613a.provider)) {
                return true;
            }
        }
        return false;
    }

    public String m11082f() {
        return this.f28613a.title;
    }

    public C8862z1(C10930q6 q6Var, TdApi.Venue venue, TdApi.Location location) {
        this.f28613a = venue;
        if (location != null) {
            TdApi.Location location2 = venue.location;
            this.f28614b = (int) C7389v0.m16664Y(location2.latitude, location2.longitude, location.latitude, location.longitude);
        } else {
            this.f28614b = 0;
        }
        String x1 = C4779t2.m25397x1(venue);
        if (x1 != null) {
            C6251j jVar = new C6251j(q6Var, x1, new TdApi.FileTypeThumbnail());
            this.f28615c = jVar;
            jVar.mo20768t0(C1357a0.m37544i(40.0f));
            jVar.m20898s0(1);
            return;
        }
        this.f28615c = null;
    }
}
