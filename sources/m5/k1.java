package m5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import n5.b;
import n5.c;

public final class k1 implements Parcelable.Creator<g> {
    public static void a(g gVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, gVar.f17202a);
        c.k(parcel, 2, gVar.f17203b);
        c.k(parcel, 3, gVar.f17204c);
        c.p(parcel, 4, gVar.M, false);
        c.j(parcel, 5, gVar.N, false);
        c.s(parcel, 6, gVar.O, i10, false);
        c.d(parcel, 7, gVar.P, false);
        c.o(parcel, 8, gVar.Q, i10, false);
        c.s(parcel, 10, gVar.R, i10, false);
        c.s(parcel, 11, gVar.S, i10, false);
        c.c(parcel, 12, gVar.T);
        c.k(parcel, 13, gVar.U);
        c.c(parcel, 14, gVar.V);
        c.p(parcel, 15, gVar.b(), false);
        c.b(parcel, a10);
    }

    @Override
    public final g createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        j5.c[] cVarArr = null;
        j5.c[] cVarArr2 = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    i10 = b.s(parcel, q10);
                    break;
                case 2:
                    i11 = b.s(parcel, q10);
                    break;
                case 3:
                    i12 = b.s(parcel, q10);
                    break;
                case 4:
                    str = b.e(parcel, q10);
                    break;
                case 5:
                    iBinder = b.r(parcel, q10);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.h(parcel, q10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel, q10);
                    break;
                case 8:
                    account = (Account) b.d(parcel, q10, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.w(parcel, q10);
                    break;
                case 10:
                    cVarArr = (j5.c[]) b.h(parcel, q10, j5.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (j5.c[]) b.h(parcel, q10, j5.c.CREATOR);
                    break;
                case 12:
                    z10 = b.l(parcel, q10);
                    break;
                case 13:
                    i13 = b.s(parcel, q10);
                    break;
                case 14:
                    z11 = b.l(parcel, q10);
                    break;
                case 15:
                    str2 = b.e(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z10, i13, z11, str2);
    }

    @Override
    public final g[] newArray(int i10) {
        return new g[i10];
    }
}
