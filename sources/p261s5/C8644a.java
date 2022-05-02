package p261s5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.RecentlyNonNull;

public class C8644a {
    @RecentlyNonNull
    public final Context f27975a;

    public C8644a(@RecentlyNonNull Context context) {
        this.f27975a = context;
    }

    public int m11823a(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f27975a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    public ApplicationInfo m11822b(@RecentlyNonNull String str, int i) {
        return this.f27975a.getPackageManager().getApplicationInfo(str, i);
    }

    @RecentlyNonNull
    public CharSequence m11821c(@RecentlyNonNull String str) {
        return this.f27975a.getPackageManager().getApplicationLabel(this.f27975a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    public PackageInfo m11820d(@RecentlyNonNull String str, int i) {
        return this.f27975a.getPackageManager().getPackageInfo(str, i);
    }
}
