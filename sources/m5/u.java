package m5;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import j5.j;

public class u {
    public final Resources f17269a;
    public final String f17270b;

    public u(@RecentlyNonNull Context context) {
        r.k(context);
        Resources resources = context.getResources();
        this.f17269a = resources;
        this.f17270b = resources.getResourcePackageName(j.a_res_0x7f0e120a);
    }

    @RecentlyNullable
    public String a(@RecentlyNonNull String str) {
        int identifier = this.f17269a.getIdentifier(str, "string", this.f17270b);
        if (identifier == 0) {
            return null;
        }
        return this.f17269a.getString(identifier);
    }
}
