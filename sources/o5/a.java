package o5;

import android.os.IBinder;
import android.os.Parcel;
import m5.v;
import w5.c;

public final class a extends w5.a {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void E1(v vVar) {
        Parcel q10 = q();
        c.c(q10, vVar);
        x0(1, q10);
    }
}
