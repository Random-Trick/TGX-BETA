package p261s5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.RecentlyNonNull;

public class C8644a {
    @RecentlyNonNull
    public final Context f27972a;

    public C8644a(@RecentlyNonNull Context context) {
        this.f27972a = context;
    }

    public int m11824a(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f27972a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    public ApplicationInfo m11823b(@RecentlyNonNull String str, int i) {
        return this.f27972a.getPackageManager().getApplicationInfo(str, i);
    }

    @RecentlyNonNull
    public CharSequence m11822c(@RecentlyNonNull String str) {
        return this.f27972a.getPackageManager().getApplicationLabel(this.f27972a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    public PackageInfo m11821d(@RecentlyNonNull String str, int i) {
        return this.f27972a.getPackageManager().getPackageInfo(str, i);
    }
}
