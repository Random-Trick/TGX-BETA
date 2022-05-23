package o5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import j5.c;
import l5.l;
import m5.h;
import m5.y;
import w5.d;

public final class e extends h<a> {
    public final y f19205r0;

    public e(Context context, Looper looper, m5.e eVar, y yVar, l5.e eVar2, l lVar) {
        super(context, looper, 270, eVar, eVar2, lVar);
        this.f19205r0 = yVar;
    }

    @Override
    public final Bundle D() {
        return this.f19205r0.d();
    }

    @Override
    public final String H() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String I() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean L() {
        return true;
    }

    @Override
    public final int p() {
        return 203390000;
    }

    @Override
    public final IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override
    public final c[] z() {
        return d.f25772b;
    }
}
