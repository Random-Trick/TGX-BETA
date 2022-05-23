package lb;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class a<T> {
    public static Reference a(b bVar, Object obj) {
        return new WeakReference(obj);
    }
}
