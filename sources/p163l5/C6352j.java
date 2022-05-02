package p163l5;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public final class C6352j {
    public final String f19961a;
    public final String f19962b;

    public C6352j(@RecentlyNonNull String str, String str2) {
        C6378r.m20506l(str, "log tag cannot be null");
        C6378r.m20515c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f19961a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f19962b = null;
        } else {
            this.f19962b = str2;
        }
    }

    public boolean m20573a(int i) {
        return Log.isLoggable(this.f19961a, i);
    }

    public void m20572b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (m20573a(3)) {
            Log.d(str, m20567g(str2));
        }
    }

    public void m20571c(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (m20573a(6)) {
            Log.e(str, m20567g(str2));
        }
    }

    public void m20570d(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (m20573a(6)) {
            Log.e(str, m20567g(str2), th);
        }
    }

    public void m20569e(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (m20573a(2)) {
            Log.v(str, m20567g(str2));
        }
    }

    public void m20568f(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (m20573a(5)) {
            Log.w(str, m20567g(str2));
        }
    }

    public final String m20567g(String str) {
        String str2 = this.f19962b;
        return str2 == null ? str : str2.concat(str);
    }
}
