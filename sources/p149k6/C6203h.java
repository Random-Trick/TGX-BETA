package p149k6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p133j5.AbstractC5876k;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6203h extends AbstractC6749a implements AbstractC5876k {
    public static final Parcelable.Creator<C6203h> CREATOR = new C6204i();
    public final List<String> f19606a;
    public final String f19607b;

    public C6203h(List<String> list, String str) {
        this.f19606a = list;
        this.f19607b = str;
    }

    @Override
    public final Status mo952a() {
        if (this.f19607b != null) {
            return Status.f11569O;
        }
        return Status.f11573S;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19107r(parcel, 1, this.f19606a, false);
        C6752c.m19109p(parcel, 2, this.f19607b, false);
        C6752c.m19123b(parcel, a);
    }
}
