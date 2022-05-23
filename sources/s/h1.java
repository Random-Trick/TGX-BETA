package s;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.r;
import androidx.camera.core.s;
import androidx.camera.core.s1;
import androidx.camera.core.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t.f;
import t.m0;
import y.a0;

public class h1 {
    public static String a(m0 m0Var, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) m0Var.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) m0Var.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    public static List<String> b(v vVar, s sVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(vVar.c().d());
            if (sVar == null) {
                for (String str2 : asList) {
                    arrayList.add(str2);
                }
                return arrayList;
            }
            try {
                str = a(vVar.c(), sVar.d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : asList) {
                if (!str3.equals(str)) {
                    arrayList2.add(vVar.e(str3));
                }
            }
            Iterator<r> it = sVar.b(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add(((a0) it.next()).a());
            }
            return arrayList;
        } catch (u e10) {
            throw new s1(e10);
        } catch (f e11) {
            throw new s1(j1.a(e11));
        }
    }
}
