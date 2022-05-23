package m5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import j5.c;
import j5.e;
import m5.k;
import n5.a;

public class g extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new k1();
    public String M;
    public IBinder N;
    public Scope[] O;
    public Bundle P;
    public Account Q;
    public c[] R;
    public c[] S;
    public boolean T;
    public int U;
    public boolean V;
    public final String W;
    public final int f17202a;
    public final int f17203b;
    public int f17204c;

    public g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        this.f17202a = i10;
        this.f17203b = i11;
        this.f17204c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.M = "com.google.android.gms";
        } else {
            this.M = str;
        }
        if (i10 < 2) {
            this.Q = iBinder != null ? a.t(k.a.r(iBinder)) : null;
        } else {
            this.N = iBinder;
            this.Q = account;
        }
        this.O = scopeArr;
        this.P = bundle;
        this.R = cVarArr;
        this.S = cVarArr2;
        this.T = z10;
        this.U = i13;
        this.V = z11;
        this.W = str2;
    }

    @RecentlyNullable
    public final String b() {
        return this.W;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        k1.a(this, parcel, i10);
    }

    public g(int i10, String str) {
        this.f17202a = 6;
        this.f17204c = e.f15074a;
        this.f17203b = i10;
        this.T = true;
        this.W = str;
    }
}
