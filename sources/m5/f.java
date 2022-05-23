package m5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import n5.a;
import n5.c;

public class f extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new j1();
    public final int[] M;
    public final int N;
    public final int[] O;
    public final t f17195a;
    public final boolean f17196b;
    public final boolean f17197c;

    public f(@RecentlyNonNull t tVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f17195a = tVar;
        this.f17196b = z10;
        this.f17197c = z11;
        this.M = iArr;
        this.N = i10;
        this.O = iArr2;
    }

    public int b() {
        return this.N;
    }

    @RecentlyNullable
    public int[] c() {
        return this.M;
    }

    @RecentlyNullable
    public int[] d() {
        return this.O;
    }

    public boolean e() {
        return this.f17196b;
    }

    public boolean f() {
        return this.f17197c;
    }

    @RecentlyNonNull
    public t g() {
        return this.f17195a;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 1, g(), i10, false);
        c.c(parcel, 2, e());
        c.c(parcel, 3, f());
        c.l(parcel, 4, c(), false);
        c.k(parcel, 5, b());
        c.l(parcel, 6, d(), false);
        c.b(parcel, a10);
    }
}
