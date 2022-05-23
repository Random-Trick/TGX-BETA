package t5;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

public class b {
    public static b f22933b = new b();
    public a f22934a = null;

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        return f22933b.b(context);
    }

    @RecentlyNonNull
    public final synchronized a b(@RecentlyNonNull Context context) {
        if (this.f22934a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f22934a = new a(context);
        }
        return this.f22934a;
    }
}
