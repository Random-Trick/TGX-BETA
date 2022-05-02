package p163l5;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p118i5.C5226j;

public class C6387u {
    public final Resources f20034a;
    public final String f20035b;

    public C6387u(@RecentlyNonNull Context context) {
        C6378r.m20506k(context);
        Resources resources = context.getResources();
        this.f20034a = resources;
        this.f20035b = resources.getResourcePackageName(C5226j.a_res_0x7f0e11fe);
    }

    @RecentlyNullable
    public String m20486a(@RecentlyNonNull String str) {
        int identifier = this.f20034a.getIdentifier(str, "string", this.f20035b);
        if (identifier == 0) {
            return null;
        }
        return this.f20034a.getString(identifier);
    }
}
