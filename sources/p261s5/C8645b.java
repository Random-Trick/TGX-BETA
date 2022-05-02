package p261s5;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

public class C8645b {
    public static C8645b f27976b = new C8645b();
    public C8644a f27977a = null;

    @RecentlyNonNull
    public static C8644a m11819a(@RecentlyNonNull Context context) {
        return f27976b.m11818b(context);
    }

    @RecentlyNonNull
    public final synchronized C8644a m11818b(@RecentlyNonNull Context context) {
        if (this.f27977a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f27977a = new C8644a(context);
        }
        return this.f27977a;
    }
}
