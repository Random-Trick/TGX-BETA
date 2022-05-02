package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Status;
import p133j5.AbstractC5876k;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C4289i extends AbstractC6749a implements AbstractC5876k {
    @RecentlyNonNull
    public static final Parcelable.Creator<C4289i> CREATOR = new C4294k0();
    public final Status f14346a;
    public final C4291j f14347b;

    public C4289i(@RecentlyNonNull Status status, C4291j jVar) {
        this.f14346a = status;
        this.f14347b = jVar;
    }

    @Override
    @RecentlyNonNull
    public Status mo952a() {
        return this.f14346a;
    }

    @RecentlyNullable
    public C4291j m28296b() {
        return this.f14347b;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19110o(parcel, 1, mo952a(), i, false);
        C6752c.m19110o(parcel, 2, m28296b(), i, false);
        C6752c.m19123b(parcel, a);
    }
}
