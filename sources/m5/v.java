package m5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import n5.a;
import n5.c;

public class v extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<v> CREATOR = new a0();
    public final int f17272a;
    @Nullable
    public List<p> f17273b;

    public v(int i10, @Nullable List<p> list) {
        this.f17272a = i10;
        this.f17273b = list;
    }

    public final int b() {
        return this.f17272a;
    }

    @RecentlyNullable
    public final List<p> c() {
        return this.f17273b;
    }

    public final void d(@RecentlyNonNull p pVar) {
        if (this.f17273b == null) {
            this.f17273b = new ArrayList();
        }
        this.f17273b.add(pVar);
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f17272a);
        c.t(parcel, 2, this.f17273b, false);
        c.b(parcel, a10);
    }
}
