package p119i6;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.io.IOException;
import p163l5.C6378r;
import p176m5.AbstractC6749a;
import p176m5.C6752c;
import p232q5.C8250j;

public final class C5242c extends AbstractC6749a {
    public String f17396a;
    public static final String f17395b = C5242c.class.getSimpleName();
    @RecentlyNonNull
    public static final Parcelable.Creator<C5242c> CREATOR = new C5250k();

    public C5242c(@RecentlyNonNull String str) {
        C6378r.m20506l(str, "json must not be null");
        this.f17396a = str;
    }

    @RecentlyNonNull
    public static C5242c m23554b(@RecentlyNonNull Context context, int i) {
        try {
            return new C5242c(new String(C8250j.m13039c(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
            sb2.append("Failed to read resource ");
            sb2.append(i);
            sb2.append(": ");
            sb2.append(valueOf);
            throw new Resources.NotFoundException(sb2.toString());
        }
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19110p(parcel, 2, this.f17396a, false);
        C6752c.m19124b(parcel, a);
    }
}
