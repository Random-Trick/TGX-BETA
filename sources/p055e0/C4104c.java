package p055e0;

import android.os.Build;
import p336y.AbstractC10268n0;
import p336y.AbstractC10311w1;
import p336y.C10245j0;

public final class C4104c implements AbstractC10311w1 {
    public static boolean m28907a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean m28906b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean m28904d() {
        return m28906b() || m28907a();
    }

    public boolean m28905c(AbstractC10268n0.AbstractC10269a<?> aVar) {
        return aVar != C10245j0.f33024g;
    }
}
