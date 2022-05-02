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
    public C5244e m23546b(float f) {
        this.f17407V = f;
        return this;
    }

    @RecentlyNonNull
    public C5244e m23545c(float f, float f2) {
        this.f17399N = f;
        this.f17400O = f2;
        return this;
    }

    public float m23544d() {
        return this.f17407V;
    }

    public float m23543e() {
        return this.f17399N;
    }

    public float m23542f() {
        return this.f17400O;
    }

    public float m23541g() {
        return this.f17405T;
    }

    public float m23540h() {
        return this.f17406U;
    }

    @RecentlyNonNull
    public LatLng m23539i() {
        return this.f17409a;
    }

    public float m23538j() {
        return this.f17404S;
    }

    @RecentlyNullable
    public String m23537k() {
        return this.f17411c;
    }

    @RecentlyNullable
    public String m23536l() {
        return this.f17410b;
    }

    public float m23535m() {
        return this.f17408W;
    }

    @RecentlyNonNull
    public C5244e m23534n(C5240a aVar) {
        this.f17398M = aVar;
        return this;
    }

    public boolean m23533o() {
        return this.f17401P;
    }

    public boolean m23532p() {
        return this.f17403R;
    }

    public boolean m23531q() {
        return this.f17402Q;
    }

    @RecentlyNonNull
    public C5244e m23530r(@RecentlyNonNull LatLng latLng) {
        if (latLng != null) {
            this.f17409a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @RecentlyNonNull
    public C5244e m23529s(float f) {
        this.f17408W = f;
        return this;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19111o(parcel, 2, m23539i(), i, false);
        C6752c.m19110p(parcel, 3, m23536l(), false);
        C6752c.m19110p(parcel, 4, m23537k(), false);
        C5240a aVar = this.f17398M;
        C6752c.m19116j(parcel, 5, aVar == null ? null : aVar.m23558a().asBinder(), false);
        C6752c.m19118h(parcel, 6, m23543e());
        C6752c.m19118h(parcel, 7, m23542f());
        C6752c.m19123c(parcel, 8, m23533o());
        C6752c.m19123c(parcel, 9, m23531q());
        C6752c.m19123c(parcel, 10, m23532p());
        C6752c.m19118h(parcel, 11, m23538j());
        C6752c.m19118h(parcel, 12, m23541g());
        C6752c.m19118h(parcel, 13, m23540h());
        C6752c.m19118h(parcel, 14, m23544d());
        C6752c.m19118h(parcel, 15, m23535m());
        C6752c.m19124b(parcel, a);
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
            this.f17398M = new C5240a(AbstractC8983b.AbstractBinderC8984a.m10768s(iBinder));
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
