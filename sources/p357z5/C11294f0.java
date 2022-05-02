package p357z5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p075f6.C4310s0;
import p118i5.C5219c;
import p133j5.AbstractC5867f;
import p163l5.AbstractC6346h;
import p163l5.C6336e;

public class C11294f0 extends AbstractC6346h<AbstractC11299i> {
    public final String f36204r0;
    public final AbstractC11323z<AbstractC11299i> f36205s0 = new C11292e0(this);

    public C11294f0(Context context, Looper looper, AbstractC5867f.AbstractC5869b bVar, AbstractC5867f.AbstractC5870c cVar, String str, C6336e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.f36204r0 = str;
    }

    @Override
    public final Bundle mo943D() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f36204r0);
        return bundle;
    }

    @Override
    public final String mo942H() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    public final String mo941I() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override
    public final int mo939p() {
        return 11717000;
    }

    @Override
    public final IInterface mo938w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof AbstractC11299i) {
            return (AbstractC11299i) queryLocalInterface;
        }
        return new C11297h(iBinder);
    }

    @Override
    public final C5219c[] mo937z() {
        return C4310s0.f14382f;
    }
}
