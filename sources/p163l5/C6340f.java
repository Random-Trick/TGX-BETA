package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public class C6340f extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C6340f> CREATOR = new C6354j1();
    public final int[] f19924M;
    public final int f19925N;
    public final int[] f19926O;
    public final C6384t f19927a;
    public final boolean f19928b;
    public final boolean f19929c;

    public C6340f(@RecentlyNonNull C6384t tVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f19927a = tVar;
        this.f19928b = z;
        this.f19929c = z2;
        this.f19924M = iArr;
        this.f19925N = i;
        this.f19926O = iArr2;
    }

    public int m20594b() {
        return this.f19925N;
    }

    @RecentlyNullable
    public int[] m20593c() {
        return this.f19924M;
    }

    @RecentlyNullable
    public int[] m20592d() {
        return this.f19926O;
    }

    public boolean m20591e() {
        return this.f19928b;
    }

    public boolean m20590f() {
        return this.f19929c;
    }

    @RecentlyNonNull
    public C6384t m20589g() {
        return this.f19927a;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19111o(parcel, 1, m20589g(), i, false);
        C6752c.m19123c(parcel, 2, m20591e());
        C6752c.m19123c(parcel, 3, m20590f());
        C6752c.m19114l(parcel, 4, m20593c(), false);
        C6752c.m19115k(parcel, 5, m20594b());
        C6752c.m19114l(parcel, 6, m20592d(), false);
        C6752c.m19124b(parcel, a);
    }
}
