package u5;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import j5.h;
import m5.r;

public abstract class f<T> {
    public final String f23577a;
    public T f23578b;

    public static class a extends Exception {
        public a(@RecentlyNonNull String str) {
            super(str);
        }

        public a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    public f(@RecentlyNonNull String str) {
        this.f23577a = str;
    }

    @RecentlyNonNull
    public abstract T a(@RecentlyNonNull IBinder iBinder);

    @RecentlyNonNull
    public final T b(@RecentlyNonNull Context context) {
        if (this.f23578b == null) {
            r.k(context);
            Context d10 = h.d(context);
            if (d10 != null) {
                try {
                    this.f23578b = a((IBinder) d10.getClassLoader().loadClass(this.f23577a).newInstance());
                } catch (ClassNotFoundException e10) {
                    throw new a("Could not load creator class.", e10);
                } catch (IllegalAccessException e11) {
                    throw new a("Could not access creator.", e11);
                } catch (InstantiationException e12) {
                    throw new a("Could not instantiate creator.", e12);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.f23578b;
    }
}
