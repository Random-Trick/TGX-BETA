package j6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import n5.a;
import n5.c;
import u5.b;

public final class e extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new l();
    public a M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public LatLng f15101a;
    public String f15102b;
    public String f15103c;

    public e() {
        this.N = 0.5f;
        this.O = 1.0f;
        this.Q = true;
        this.R = false;
        this.S = 0.0f;
        this.T = 0.5f;
        this.U = 0.0f;
        this.V = 1.0f;
    }

    @RecentlyNonNull
    public e b(float f10) {
        this.V = f10;
        return this;
    }

    @RecentlyNonNull
    public e c(float f10, float f11) {
        this.N = f10;
        this.O = f11;
        return this;
    }

    public float d() {
        return this.V;
    }

    public float e() {
        return this.N;
    }

    public float f() {
        return this.O;
    }

    public float g() {
        return this.T;
    }

    public float h() {
        return this.U;
    }

    @RecentlyNonNull
    public LatLng i() {
        return this.f15101a;
    }

    public float j() {
        return this.S;
    }

    @RecentlyNullable
    public String k() {
        return this.f15103c;
    }

    @RecentlyNullable
    public String l() {
        return this.f15102b;
    }

    public float m() {
        return this.W;
    }

    @RecentlyNonNull
    public e n(a aVar) {
        this.M = aVar;
        return this;
    }

    public boolean o() {
        return this.P;
    }

    public boolean p() {
        return this.R;
    }

    public boolean q() {
        return this.Q;
    }

    @RecentlyNonNull
    public e r(@RecentlyNonNull LatLng latLng) {
        if (latLng != null) {
            this.f15101a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @RecentlyNonNull
    public e s(float f10) {
        this.W = f10;
        return this;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 2, i(), i10, false);
        c.p(parcel, 3, l(), false);
        c.p(parcel, 4, k(), false);
        a aVar = this.M;
        c.j(parcel, 5, aVar == null ? null : aVar.a().asBinder(), false);
        c.h(parcel, 6, e());
        c.h(parcel, 7, f());
        c.c(parcel, 8, o());
        c.c(parcel, 9, q());
        c.c(parcel, 10, p());
        c.h(parcel, 11, j());
        c.h(parcel, 12, g());
        c.h(parcel, 13, h());
        c.h(parcel, 14, d());
        c.h(parcel, 15, m());
        c.b(parcel, a10);
    }

    public e(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16) {
        this.N = 0.5f;
        this.O = 1.0f;
        this.Q = true;
        this.R = false;
        this.S = 0.0f;
        this.T = 0.5f;
        this.U = 0.0f;
        this.V = 1.0f;
        this.f15101a = latLng;
        this.f15102b = str;
        this.f15103c = str2;
        if (iBinder == null) {
            this.M = null;
        } else {
            this.M = new a(b.a.r(iBinder));
        }
        this.N = f10;
        this.O = f11;
        this.P = z10;
        this.Q = z11;
        this.R = z12;
        this.S = f12;
        this.T = f13;
        this.U = f14;
        this.V = f15;
        this.W = f16;
    }
}
