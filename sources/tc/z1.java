package tc;

import ce.a0;
import hd.t2;
import ib.i;
import ld.j;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class z1 {
    public final TdApi.Venue f23379a;
    public final int f23380b;
    public final j f23381c;
    public String f23382d;

    public z1(o6 o6Var, TdApi.InlineQueryResultVenue inlineQueryResultVenue, TdApi.Location location) {
        this(o6Var, inlineQueryResultVenue.venue, location);
        this.f23382d = inlineQueryResultVenue.f19928id;
    }

    public TdApi.InputMessageVenue a() {
        return new TdApi.InputMessageVenue(this.f23379a);
    }

    public String b() {
        return this.f23379a.address;
    }

    public j c() {
        return this.f23381c;
    }

    public double d() {
        return this.f23379a.location.latitude;
    }

    public double e() {
        return this.f23379a.location.longitude;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof z1)) {
            z1 z1Var = (z1) obj;
            if (i.c(z1Var.f23379a.f19980id, this.f23379a.f19980id) && i.c(z1Var.f23379a.provider, this.f23379a.provider)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f23379a.title;
    }

    public z1(o6 o6Var, TdApi.Venue venue, TdApi.Location location) {
        this.f23379a = venue;
        if (location != null) {
            TdApi.Location location2 = venue.location;
            this.f23380b = (int) v0.Y(location2.latitude, location2.longitude, location.latitude, location.longitude);
        } else {
            this.f23380b = 0;
        }
        String x12 = t2.x1(venue);
        if (x12 != null) {
            j jVar = new j(o6Var, x12, new TdApi.FileTypeThumbnail());
            this.f23381c = jVar;
            jVar.t0(a0.i(40.0f));
            jVar.s0(1);
            return;
        }
        this.f23381c = null;
    }
}
