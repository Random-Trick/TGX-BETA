package p357z5;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p075f6.AbstractBinderC4273a0;
import p075f6.AbstractBinderC4317x;
import p075f6.AbstractC4275b0;
import p075f6.AbstractC4318y;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C11321x extends AbstractC6749a {
    public static final Parcelable.Creator<C11321x> CREATOR = new C11322y();
    public final PendingIntent f36244M;
    public final AbstractC4318y f36245N;
    public final AbstractC11295g f36246O;
    public final int f36247a;
    public final C11319v f36248b;
    public final AbstractC4275b0 f36249c;

    public C11321x(int i, C11319v vVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f36247a = i;
        this.f36248b = vVar;
        AbstractC11295g gVar = null;
        this.f36249c = iBinder == null ? null : AbstractBinderC4273a0.m28309s(iBinder);
        this.f36244M = pendingIntent;
        this.f36245N = iBinder2 == null ? null : AbstractBinderC4317x.m28284s(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof AbstractC11295g) {
                gVar = (AbstractC11295g) queryLocalInterface;
            } else {
                gVar = new C11291e(iBinder3);
            }
        }
        this.f36246O = gVar;
    }

    public static C11321x m895b(AbstractC4275b0 b0Var, AbstractC11295g gVar) {
        if (gVar == null) {
            gVar = null;
        }
        return new C11321x(2, null, b0Var, null, null, gVar);
    }

    public static C11321x m894c(AbstractC4318y yVar, AbstractC11295g gVar) {
        if (gVar == null) {
            gVar = null;
        }
        return new C11321x(2, null, null, null, yVar, gVar);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f36247a);
        C6752c.m19110o(parcel, 2, this.f36248b, i, false);
        AbstractC4275b0 b0Var = this.f36249c;
        IBinder iBinder = null;
        C6752c.m19115j(parcel, 3, b0Var == null ? null : b0Var.asBinder(), false);
        C6752c.m19110o(parcel, 4, this.f36244M, i, false);
        AbstractC4318y yVar = this.f36245N;
        C6752c.m19115j(parcel, 5, yVar == null ? null : yVar.asBinder(), false);
        AbstractC11295g gVar = this.f36246O;
        if (gVar != null) {
            iBinder = gVar.asBinder();
        }
        C6752c.m19115j(parcel, 6, iBinder, false);
        C6752c.m19123b(parcel, a);
    }
}
