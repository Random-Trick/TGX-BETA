package m5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import n5.a;
import n5.c;

public class t extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<t> CREATOR = new a1();
    public final int M;
    public final int N;
    public final int f17266a;
    public final boolean f17267b;
    public final boolean f17268c;

    public t(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f17266a = i10;
        this.f17267b = z10;
        this.f17268c = z11;
        this.M = i11;
        this.N = i12;
    }

    public int b() {
        return this.M;
    }

    public int c() {
        return this.N;
    }

    public boolean d() {
        return this.f17267b;
    }

    public boolean e() {
        return this.f17268c;
    }

    public int f() {
        return this.f17266a;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, f());
        c.c(parcel, 2, d());
        c.c(parcel, 3, e());
        c.k(parcel, 4, b());
        c.k(parcel, 5, c());
        c.b(parcel, a10);
    }
}
