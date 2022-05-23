package y0;

import android.content.res.Configuration;
import android.os.Build;

public final class c {
    public static g a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? g.e(configuration.getLocales()) : g.a(configuration.locale);
    }
}
