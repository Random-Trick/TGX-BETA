package p272t5;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Field;
import p163l5.C6378r;
import p272t5.AbstractC8983b;

public final class BinderC8986d<T> extends AbstractC8983b.AbstractBinderC8984a {
    public final T f28888a;

    public BinderC8986d(T t) {
        this.f28888a = t;
    }

    @RecentlyNonNull
    public static <T> AbstractC8983b m10763E0(@RecentlyNonNull T t) {
        return new BinderC8986d(t);
    }

    @RecentlyNonNull
    public static <T> T m10762t(@RecentlyNonNull AbstractC8983b bVar) {
        if (bVar instanceof BinderC8986d) {
            return ((BinderC8986d) bVar).f28888a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C6378r.m20507k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
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
}
