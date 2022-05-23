package y6;

import android.os.IBinder;
import java.lang.reflect.Field;
import y6.r;

public final class s<T> extends r.a {
    public final T f26631a;

    public s(T t10) {
        this.f26631a = t10;
    }

    public static <T> T r(r rVar) {
        if (rVar instanceof s) {
            return ((s) rVar).f26631a;
        }
        IBinder asBinder = rVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (IllegalArgumentException e11) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e11);
                } catch (NullPointerException e12) {
                    throw new IllegalArgumentException("Binder object is null.", e12);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    public static <T> r t(T t10) {
        return new s(t10);
    }
}
