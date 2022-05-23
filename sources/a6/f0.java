package a6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import g6.s0;
import j5.c;
import k5.f;
import m5.e;
import m5.h;

public class f0 extends h<i> {
    public final String f559r0;
    public final z<i> f560s0 = new e0(this);

    public f0(Context context, Looper looper, f.b bVar, f.c cVar, String str, e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.f559r0 = str;
    }

    @Override
    public final Bundle D() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f559r0);
        return bundle;
    }

    @Override
    public final String H() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    public final String I() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override
    public final int p() {
        return 11717000;
    }

    @Override
    public final IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new h(iBinder);
    }

    @Override
    public final c[] z() {
        return s0.f12151f;
    }
}
