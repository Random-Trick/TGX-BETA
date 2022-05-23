package c5;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {
    public static Method f4796a;

    public static IBinder a(Bundle bundle, String str) {
        if (l0.f4841a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    public static IBinder b(Bundle bundle, String str) {
        Method method = f4796a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f4796a = method2;
                method2.setAccessible(true);
                method = f4796a;
            } catch (NoSuchMethodException e10) {
                s.g("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            s.g("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }
}
