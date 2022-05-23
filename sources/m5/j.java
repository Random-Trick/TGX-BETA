package m5;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public final class j {
    public final String f17217a;
    public final String f17218b;

    public j(@RecentlyNonNull String str, String str2) {
        r.l(str, "log tag cannot be null");
        r.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f17217a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f17218b = null;
        } else {
            this.f17218b = str2;
        }
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f17217a, i10);
    }

    public void b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (a(6)) {
            Log.e(str, g(str2), th);
        }
    }

    public void e(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }

    public final String g(String str) {
        String str2 = this.f17218b;
        return str2 == null ? str : str2.concat(str);
    }
}
