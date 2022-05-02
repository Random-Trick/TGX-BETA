package p328x6;

import android.app.Activity;
import android.content.Context;
import p328x6.AbstractC10138q;

public abstract class AbstractC10105a {
    public static final AbstractC10105a f32803a = m6018d();

    public static AbstractC10105a m6019a() {
        return f32803a;
    }

    public static AbstractC10105a m6018d() {
        try {
            try {
                return (AbstractC10105a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(AbstractC10105a.class).newInstance();
            } catch (IllegalAccessException e) {
                throw new IllegalStateException(e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (ClassNotFoundException unused) {
            return new C10107c();
        }
    }

    public abstract AbstractC10108d mo6013b(Context context, String str, AbstractC10138q.AbstractC10139a aVar, AbstractC10138q.AbstractC10140b bVar);

    public abstract AbstractC10111f mo6012c(Activity activity, AbstractC10108d dVar, boolean z);
}
