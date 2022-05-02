package p272t5;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import p118i5.C5224h;
import p163l5.C6378r;

public abstract class AbstractC8988f<T> {
    public final String f28889a;
    public T f28890b;

    public static class C8989a extends Exception {
        public C8989a(@RecentlyNonNull String str) {
            super(str);
        }

        public C8989a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    public AbstractC8988f(@RecentlyNonNull String str) {
        this.f28889a = str;
    }

    @RecentlyNonNull
    public abstract T mo10761a(@RecentlyNonNull IBinder iBinder);

    @RecentlyNonNull
    public final T m10760b(@RecentlyNonNull Context context) {
        if (this.f28890b == null) {
            C6378r.m20507k(context);
            Context d = C5224h.m23575d(context);
            if (d != null) {
                try {
                    this.f28890b = mo10761a((IBinder) d.getClassLoader().loadClass(this.f28889a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C8989a("Could not load creator class.", e);
                } catch (IllegalAccessException e2) {
                    throw new C8989a("Could not access creator.", e2);
                } catch (InstantiationException e3) {
                    throw new C8989a("Could not instantiate creator.", e3);
                }
            } else {
                throw new C8989a("Could not get remote context.");
            }
        }
        return this.f28890b;
    }
}
