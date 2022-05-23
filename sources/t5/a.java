package t5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.RecentlyNonNull;

public class a {
    @RecentlyNonNull
    public final Context f22932a;

    public a(@RecentlyNonNull Context context) {
        this.f22932a = context;
    }

    public int a(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f22932a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    public ApplicationInfo b(@RecentlyNonNull String str, int i10) {
        return this.f22932a.getPackageManager().getApplicationInfo(str, i10);
    }

    @RecentlyNonNull
    public CharSequence c(@RecentlyNonNull String str) {
        return this.f22932a.getPackageManager().getApplicationLabel(this.f22932a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    public PackageInfo d(@RecentlyNonNull String str, int i10) {
        return this.f22932a.getPackageManager().getPackageInfo(str, i10);
    }
}
