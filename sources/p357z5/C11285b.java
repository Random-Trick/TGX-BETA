package p357z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p133j5.AbstractC5876k;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C11285b extends AbstractC6749a implements AbstractC5876k {
    public final Status f36204a;
    public static final C11285b f36203b = new C11285b(Status.f11569O);
    public static final Parcelable.Creator<C11285b> CREATOR = new C11287c();

    public C11285b(Status status) {
        this.f36204a = status;
    }

    @Override
    public final Status mo952a() {
        return this.f36204a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19111o(parcel, 1, this.f36204a, i, false);
        C6752c.m19124b(parcel, a);
    }
}
