package g6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.c;

public final class g extends n5.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new j0();
    public h0 M;
    public final List<LocationRequest> f12112a;
    public final boolean f12113b;
    public final boolean f12114c;

    public static final class a {
        public final ArrayList<LocationRequest> f12115a = new ArrayList<>();
        public boolean f12116b = false;
        public boolean f12117c = false;

        @RecentlyNonNull
        public a a(@RecentlyNonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f12115a.add(locationRequest);
            }
            return this;
        }

        @RecentlyNonNull
        public g b() {
            return new g(this.f12115a, this.f12116b, this.f12117c, null);
        }

        @RecentlyNonNull
        public a c(boolean z10) {
            this.f12116b = z10;
            return this;
        }
    }

    public g(List<LocationRequest> list, boolean z10, boolean z11, h0 h0Var) {
        this.f12112a = list;
        this.f12113b = z10;
        this.f12114c = z11;
        this.M = h0Var;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, Collections.unmodifiableList(this.f12112a), false);
        c.c(parcel, 2, this.f12113b);
        c.c(parcel, 3, this.f12114c);
        c.o(parcel, 5, this.M, i10, false);
        c.b(parcel, a10);
    }
}
