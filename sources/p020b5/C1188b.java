package p020b5;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class C1188b {
    public static Method f4473a;

    public static IBinder m38164a(Bundle bundle, String str) {
        if (C1216l0.f4526a >= 18) {
            return bundle.getBinder(str);
        }
        return m38163b(bundle, str);
    }

    public static IBinder m38163b(Bundle bundle, String str) {
        Method method = f4473a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f4473a = method2;
                method2.setAccessible(true);
                method = f4473a;
            } catch (NoSuchMethodException e) {
                C1230s.m37886g("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            C1230s.m37886g("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}
