package p261s5;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

public class C8645b {
    public static C8645b f27973b = new C8645b();
    public C8644a f27974a = null;

    @RecentlyNonNull
    public static C8644a m11820a(@RecentlyNonNull Context context) {
        return f27973b.m11819b(context);
    }

    @RecentlyNonNull
    public final synchronized C8644a m11819b(@RecentlyNonNull Context context) {
        if (this.f27974a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f27974a = new C8644a(context);
        }
        return this.f27974a;
    }
}
