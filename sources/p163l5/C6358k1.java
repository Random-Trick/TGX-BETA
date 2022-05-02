package p163l5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p118i5.C5219c;
import p176m5.C6750b;
import p176m5.C6752c;

public final class C6358k1 implements Parcelable.Creator<C6343g> {
    public static void m20555a(C6343g gVar, Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, gVar.f19945a);
        C6752c.m19114k(parcel, 2, gVar.f19946b);
        C6752c.m19114k(parcel, 3, gVar.f19947c);
        C6752c.m19109p(parcel, 4, gVar.f19934M, false);
        C6752c.m19115j(parcel, 5, gVar.f19935N, false);
        C6752c.m19106s(parcel, 6, gVar.f19936O, i, false);
        C6752c.m19121d(parcel, 7, gVar.f19937P, false);
        C6752c.m19110o(parcel, 8, gVar.f19938Q, i, false);
        C6752c.m19106s(parcel, 10, gVar.f19939R, i, false);
        C6752c.m19106s(parcel, 11, gVar.f19940S, i, false);
        C6752c.m19122c(parcel, 12, gVar.f19941T);
        C6752c.m19114k(parcel, 13, gVar.f19942U);
        C6752c.m19122c(parcel, 14, gVar.f19943V);
        C6752c.m19109p(parcel, 15, gVar.m20587b(), false);
        C6752c.m19123b(parcel, a);
    }

    @Override
    public final C6343g createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C5219c[] cVarArr = null;
        C5219c[] cVarArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    i = C6750b.m19132s(parcel, q);
                    break;
                case 2:
                    i2 = C6750b.m19132s(parcel, q);
                    break;
                case 3:
                    i3 = C6750b.m19132s(parcel, q);
                    break;
                case 4:
                    str = C6750b.m19146e(parcel, q);
                    break;
                case 5:
                    iBinder = C6750b.m19133r(parcel, q);
                    break;
                case 6:
                    scopeArr = (Scope[]) C6750b.m19143h(parcel, q, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C6750b.m19150a(parcel, q);
                    break;
                case 8:
                    account = (Account) C6750b.m19147d(parcel, q, Account.CREATOR);
                    break;
                case 9:
                default:
                    C6750b.m19128w(parcel, q);
                    break;
                case 10:
                    cVarArr = (C5219c[]) C6750b.m19143h(parcel, q, C5219c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (C5219c[]) C6750b.m19143h(parcel, q, C5219c.CREATOR);
                    break;
                case 12:
                    z = C6750b.m19139l(parcel, q);
                    break;
                case 13:
                    i4 = C6750b.m19132s(parcel, q);
                    break;
                case 14:
                    z2 = C6750b.m19139l(parcel, q);
                    break;
                case 15:
                    str2 = C6750b.m19146e(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C6343g(i, i2, i3, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z, i4, z2, str2);
    }

    @Override
    public final C6343g[] newArray(int i) {
        return new C6343g[i];
    }
}
