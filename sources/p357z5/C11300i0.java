package p357z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p075f6.AbstractC4315v;
import p075f6.BinderC4313u;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C11300i0 extends AbstractC6749a {
    public static final Parcelable.Creator<C11300i0> CREATOR = new C11302j0();
    public final AbstractC11295g f36211M;
    public final int f36212a;
    public final C11296g0 f36213b;
    public final AbstractC4315v f36214c;

    public C11300i0(int i, C11296g0 g0Var, IBinder iBinder, IBinder iBinder2) {
        this.f36212a = i;
        this.f36213b = g0Var;
        AbstractC11295g gVar = null;
        this.f36214c = iBinder == null ? null : BinderC4313u.m28285s(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof AbstractC11295g) {
                gVar = (AbstractC11295g) queryLocalInterface;
            } else {
                gVar = new C11291e(iBinder2);
            }
        }
        this.f36211M = gVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f36212a);
        C6752c.m19110o(parcel, 2, this.f36213b, i, false);
        AbstractC4315v vVar = this.f36214c;
        IBinder iBinder = null;
        C6752c.m19115j(parcel, 3, vVar == null ? null : vVar.asBinder(), false);
        AbstractC11295g gVar = this.f36211M;
        if (gVar != null) {
            iBinder = gVar.asBinder();
        }
        C6752c.m19115j(parcel, 4, iBinder, false);
        C6752c.m19123b(parcel, a);
    }
}
