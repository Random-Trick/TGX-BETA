package p293v;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p336y.AbstractC10311w1;

public class C9816k implements AbstractC10311w1 {
    public static boolean m6811e() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean m6810f() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean m6809g() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean m6808h() {
        return m6810f() || m6809g() || m6811e();
    }

    public List<Size> m6815a(String str, int i) {
        if (m6810f()) {
            return m6813c(str, i);
        }
        if (m6809g()) {
            return m6812d(str, i);
        }
        if (m6811e()) {
            return m6814b(str, i);
        }
        C0662u1.m40643k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    public final List<Size> m6814b(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i == 34 || i == 35)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    public final List<Size> m6813c(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    public final List<Size> m6812d(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }
}
