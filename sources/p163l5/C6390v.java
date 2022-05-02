package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public class C6390v extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C6390v> CREATOR = new C6320a0();
    public final int f20037a;
    @Nullable
    public List<C6371p> f20038b;

    public C6390v(int i, @Nullable List<C6371p> list) {
        this.f20037a = i;
        this.f20038b = list;
    }

    public final int m20485b() {
        return this.f20037a;
    }

    @RecentlyNullable
    public final List<C6371p> m20484c() {
        return this.f20038b;
    }

    public final void m20483d(@RecentlyNonNull C6371p pVar) {
        if (this.f20038b == null) {
            this.f20038b = new ArrayList();
        }
        this.f20038b.add(pVar);
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f20037a);
        C6752c.m19106t(parcel, 2, this.f20038b, false);
        C6752c.m19124b(parcel, a);
    }
}
