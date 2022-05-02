package p163l5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import p118i5.C5219c;
import p118i5.C5221e;
import p163l5.AbstractC6355k;
import p176m5.AbstractC6749a;

public class C6343g extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C6343g> CREATOR = new C6358k1();
    public String f19934M;
    public IBinder f19935N;
    public Scope[] f19936O;
    public Bundle f19937P;
    public Account f19938Q;
    public C5219c[] f19939R;
    public C5219c[] f19940S;
    public boolean f19941T;
    public int f19942U;
    public boolean f19943V;
    public final String f19944W;
    public final int f19945a;
    public final int f19946b;
    public int f19947c;

    public C6343g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C5219c[] cVarArr, C5219c[] cVarArr2, boolean z, int i4, boolean z2, String str2) {
        this.f19945a = i;
        this.f19946b = i2;
        this.f19947c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f19934M = "com.google.android.gms";
        } else {
            this.f19934M = str;
        }
        if (i < 2) {
            this.f19938Q = iBinder != null ? BinderC6319a.m20674t(AbstractC6355k.AbstractBinderC6356a.m20565s(iBinder)) : null;
        } else {
            this.f19935N = iBinder;
            this.f19938Q = account;
        }
        this.f19936O = scopeArr;
        this.f19937P = bundle;
        this.f19939R = cVarArr;
        this.f19940S = cVarArr2;
        this.f19941T = z;
        this.f19942U = i4;
        this.f19943V = z2;
        this.f19944W = str2;
    }

    @RecentlyNullable
    public final String m20588b() {
        return this.f19944W;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C6358k1.m20556a(this, parcel, i);
    }

    public C6343g(int i, String str) {
        this.f19945a = 6;
        this.f19947c = C5221e.f17368a;
        this.f19946b = i;
        this.f19941T = true;
        this.f19944W = str;
    }
}
