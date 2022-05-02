package p119i6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import p176m5.AbstractC6749a;
import p176m5.C6752c;
import p272t5.AbstractC8983b;

public final class C5244e extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C5244e> CREATOR = new C5251l();
    public C5240a f17398M;
    public float f17399N;
    public float f17400O;
    public boolean f17401P;
    public boolean f17402Q;
    public boolean f17403R;
    public float f17404S;
    public float f17405T;
    public float f17406U;
    public float f17407V;
    public float f17408W;
    public LatLng f17409a;
    public String f17410b;
    public String f17411c;

    public C5244e() {
        this.f17399N = 0.5f;
        this.f17400O = 1.0f;
        this.f17402Q = true;
        this.f17403R = false;
        this.f17404S = 0.0f;
        this.f17405T = 0.5f;
        this.f17406U = 0.0f;
        this.f17407V = 1.0f;
    }

    @RecentlyNonNull
    public C5244e m23545b(float f) {
        this.f17407V = f;
        return this;
    }

    @RecentlyNonNull
    public C5244e m23544c(float f, float f2) {
        this.f17399N = f;
        this.f17400O = f2;
        return this;
    }

    public float m23543d() {
        return this.f17407V;
    }

    public float m23542e() {
        return this.f17399N;
    }

    public float m23541f() {
        return this.f17400O;
    }

    public float m23540g() {
        return this.f17405T;
    }

    public float m23539h() {
        return this.f17406U;
    }

    @RecentlyNonNull
    public LatLng m23538i() {
        return this.f17409a;
    }

    public float m23537j() {
        return this.f17404S;
    }

    @RecentlyNullable
    public String m23536k() {
        return this.f17411c;
    }

    @RecentlyNullable
    public String m23535l() {
        return this.f17410b;
    }

    public float m23534m() {
        return this.f17408W;
    }

    @RecentlyNonNull
    public C5244e m23533n(C5240a aVar) {
        this.f17398M = aVar;
        return this;
    }

    public boolean m23532o() {
        return this.f17401P;
    }

    public boolean m23531p() {
        return this.f17403R;
    }

    public boolean m23530q() {
        return this.f17402Q;
    }

    @RecentlyNonNull
    public C5244e m23529r(@RecentlyNonNull LatLng latLng) {
        if (latLng != null) {
            this.f17409a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @RecentlyNonNull
    public C5244e m23528s(float f) {
        this.f17408W = f;
        return this;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19110o(parcel, 2, m23538i(), i, false);
        C6752c.m19109p(parcel, 3, m23535l(), false);
        C6752c.m19109p(parcel, 4, m23536k(), false);
        C5240a aVar = this.f17398M;
        C6752c.m19115j(parcel, 5, aVar == null ? null : aVar.m23557a().asBinder(), false);
        C6752c.m19117h(parcel, 6, m23542e());
        C6752c.m19117h(parcel, 7, m23541f());
        C6752c.m19122c(parcel, 8, m23532o());
        C6752c.m19122c(parcel, 9, m23530q());
        C6752c.m19122c(parcel, 10, m23531p());
        C6752c.m19117h(parcel, 11, m23537j());
        C6752c.m19117h(parcel, 12, m23540g());
        C6752c.m19117h(parcel, 13, m23539h());
        C6752c.m19117h(parcel, 14, m23543d());
        C6752c.m19117h(parcel, 15, m23534m());
        C6752c.m19123b(parcel, a);
    }

    public C5244e(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f17399N = 0.5f;
        this.f17400O = 1.0f;
        this.f17402Q = true;
        this.f17403R = false;
        this.f17404S = 0.0f;
        this.f17405T = 0.5f;
        this.f17406U = 0.0f;
        this.f17407V = 1.0f;
        this.f17409a = latLng;
        this.f17410b = str;
        this.f17411c = str2;
        if (iBinder == null) {
            this.f17398M = null;
        } else {
            this.f17398M = new C5240a(AbstractC8983b.AbstractBinderC8984a.m10769s(iBinder));
        }
        this.f17399N = f;
        this.f17400O = f2;
        this.f17401P = z;
        this.f17402Q = z2;
        this.f17403R = z3;
        this.f17404S = f3;
        this.f17405T = f4;
        this.f17406U = f5;
        this.f17407V = f6;
        this.f17408W = f7;
    }
}
