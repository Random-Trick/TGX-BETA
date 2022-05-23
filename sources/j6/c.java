package j6;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.io.IOException;
import m5.r;
import n5.a;
import r5.j;

public final class c extends a {
    public String f15099a;
    public static final String f15098b = c.class.getSimpleName();
    @RecentlyNonNull
    public static final Parcelable.Creator<c> CREATOR = new k();

    public c(@RecentlyNonNull String str) {
        r.l(str, "json must not be null");
        this.f15099a = str;
    }

    @RecentlyNonNull
    public static c b(@RecentlyNonNull Context context, int i10) {
        try {
            return new c(new String(j.c(context.getResources().openRawResource(i10)), "UTF-8"));
        } catch (IOException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
            sb2.append("Failed to read resource ");
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(valueOf);
            throw new Resources.NotFoundException(sb2.toString());
        }
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = n5.c.a(parcel);
        n5.c.p(parcel, 2, this.f15099a, false);
        n5.c.b(parcel, a10);
    }
}
