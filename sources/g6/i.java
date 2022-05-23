package g6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Status;
import k5.k;
import n5.a;
import n5.c;

public final class i extends a implements k {
    @RecentlyNonNull
    public static final Parcelable.Creator<i> CREATOR = new k0();
    public final Status f12121a;
    public final j f12122b;

    public i(@RecentlyNonNull Status status, j jVar) {
        this.f12121a = status;
        this.f12122b = jVar;
    }

    @Override
    @RecentlyNonNull
    public Status a() {
        return this.f12121a;
    }

    @RecentlyNullable
    public j b() {
        return this.f12122b;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 1, a(), i10, false);
        c.o(parcel, 2, b(), i10, false);
        c.b(parcel, a10);
    }
}
