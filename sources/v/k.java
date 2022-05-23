package v;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y.w1;

public class k implements w1 {
    public static boolean e() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean f() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean g() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean h() {
        return f() || g() || e();
    }

    public List<Size> a(String str, int i10) {
        if (f()) {
            return c(str, i10);
        }
        if (g()) {
            return d(str, i10);
        }
        if (e()) {
            return b(str, i10);
        }
        t1.k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    public final List<Size> b(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i10 == 34 || i10 == 35)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    public final List<Size> c(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    public final List<Size> d(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }
}
