package p328x6;

import android.os.IBinder;
import java.lang.reflect.Field;
import p328x6.AbstractC10141r;

public final class BinderC10144s<T> extends AbstractC10141r.AbstractBinderC10142a {
    public final T f32850a;

    public BinderC10144s(T t) {
        this.f32850a = t;
    }

    public static <T> T m5905s(AbstractC10141r rVar) {
        if (rVar instanceof BinderC10144s) {
            return ((BinderC10144s) rVar).f32850a;
        }
        IBinder asBinder = rVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (NullPointerException e3) {
                    throw new IllegalArgumentException("Binder object is null.", e3);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    public static <T> AbstractC10141r m5904t(T t) {
        return new BinderC10144s(t);
    }
}
