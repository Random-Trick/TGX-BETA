package p188n5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p118i5.C5219c;
import p148k5.AbstractC6101e;
import p148k5.AbstractC6134l;
import p163l5.AbstractC6346h;
import p163l5.C6336e;
import p163l5.C6397y;
import p299v5.C9844d;

public final class C7247e extends AbstractC6346h<C7243a> {
    public final C6397y f23065r0;

    public C7247e(Context context, Looper looper, C6336e eVar, C6397y yVar, AbstractC6101e eVar2, AbstractC6134l lVar) {
        super(context, looper, 270, eVar, eVar2, lVar);
        this.f23065r0 = yVar;
    }

    @Override
    public final Bundle mo943D() {
        return this.f23065r0.m20471d();
    }

    @Override
    public final String mo942H() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String mo941I() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean mo17208L() {
        return true;
    }

    @Override
    public final int mo939p() {
        return 203390000;
    }

    @Override
    public final IInterface mo938w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C7243a ? (C7243a) queryLocalInterface : new C7243a(iBinder);
    }

    @Override
    public final C5219c[] mo937z() {
        return C9844d.f32124b;
    }
}
