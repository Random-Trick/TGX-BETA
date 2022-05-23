package e0;

import android.os.Build;
import y.j0;
import y.n0;
import y.w1;

public final class c implements w1 {
    public static boolean a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d() {
        return b() || a();
    }

    public boolean c(n0.a<?> aVar) {
        return aVar != j0.f26321g;
    }
}
