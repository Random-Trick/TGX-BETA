package p337y0;

import android.content.res.Configuration;
import android.os.Build;

public final class C10329c {
    public static C10335g m5412a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C10335g.m5401e(configuration.getLocales()) : C10335g.m5405a(configuration.locale);
    }
}
