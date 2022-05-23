package u5;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Field;
import m5.r;
import u5.b;

public final class d<T> extends b.a {
    public final T f23576a;

    public d(T t10) {
        this.f23576a = t10;
    }

    @RecentlyNonNull
    public static <T> T t(@RecentlyNonNull b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).f23576a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            r.k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @RecentlyNonNull
    public static <T> b x0(@RecentlyNonNull T t10) {
        return new d(t10);
    }
}
