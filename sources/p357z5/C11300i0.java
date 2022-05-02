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
    public final AbstractC11295g f36214M;
    public final int f36215a;
    public final C11296g0 f36216b;
    public final AbstractC4315v f36217c;

    public C11300i0(int i, C11296g0 g0Var, IBinder iBinder, IBinder iBinder2) {
        this.f36215a = i;
        this.f36216b = g0Var;
        AbstractC11295g gVar = null;
        this.f36217c = iBinder == null ? null : BinderC4313u.m28287s(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof AbstractC11295g) {
                gVar = (AbstractC11295g) queryLocalInterface;
            } else {
                gVar = new C11291e(iBinder2);
            }
        }
        this.f36214M = gVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f36215a);
        C6752c.m19111o(parcel, 2, this.f36216b, i, false);
        AbstractC4315v vVar = this.f36217c;
        IBinder iBinder = null;
        C6752c.m19116j(parcel, 3, vVar == null ? null : vVar.asBinder(), false);
        AbstractC11295g gVar = this.f36214M;
        if (gVar != null) {
            iBinder = gVar.asBinder();
        }
        C6752c.m19116j(parcel, 4, iBinder, false);
        C6752c.m19124b(parcel, a);
    }
}
