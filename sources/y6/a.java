package y6;

import android.app.Activity;
import android.content.Context;
import y6.q;

public abstract class a {
    public static final a f26584a = d();

    public static a a() {
        return f26584a;
    }

    public static a d() {
        try {
            try {
                return (a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(a.class).newInstance();
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            return new c();
        }
    }

    public abstract d b(Context context, String str, q.a aVar, q.b bVar);

    public abstract f c(Activity activity, d dVar, boolean z10);
}
