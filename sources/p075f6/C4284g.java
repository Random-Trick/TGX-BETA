package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C4284g extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C4284g> CREATOR = new C4292j0();
    public C4288h0 f14336M;
    public final List<LocationRequest> f14337a;
    public final boolean f14338b;
    public final boolean f14339c;

    public static final class C4285a {
        public final ArrayList<LocationRequest> f14340a = new ArrayList<>();
        public boolean f14341b = false;
        public boolean f14342c = false;

        @RecentlyNonNull
        public C4285a m28301a(@RecentlyNonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f14340a.add(locationRequest);
            }
            return this;
        }

        @RecentlyNonNull
        public C4284g m28300b() {
            return new C4284g(this.f14340a, this.f14341b, this.f14342c, null);
        }

        @RecentlyNonNull
        public C4285a m28299c(boolean z) {
            this.f14341b = z;
            return this;
        }
    }

    public C4284g(List<LocationRequest> list, boolean z, boolean z2, C4288h0 h0Var) {
        this.f14337a = list;
        this.f14338b = z;
        this.f14339c = z2;
        this.f14336M = h0Var;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19106t(parcel, 1, Collections.unmodifiableList(this.f14337a), false);
        C6752c.m19123c(parcel, 2, this.f14338b);
        C6752c.m19123c(parcel, 3, this.f14339c);
        C6752c.m19111o(parcel, 5, this.f14336M, i, false);
        C6752c.m19124b(parcel, a);
    }
}
