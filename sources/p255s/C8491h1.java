package p255s;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.AbstractC0642r;
import androidx.camera.core.C0653t;
import androidx.camera.core.C0656t1;
import androidx.camera.core.C0664v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p266t.C8887f;
import p266t.C8906m0;
import p336y.AbstractC10194a0;

public class C8491h1 {
    public static String m12322a(C8906m0 m0Var, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) m0Var.m10979c("0").m10952a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) m0Var.m10979c("1").m10952a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    public static List<String> m12321b(C8579v vVar, C0653t tVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(vVar.mo5458c().m10978d());
            if (tVar == null) {
                for (String str2 : asList) {
                    arrayList.add(str2);
                }
                return arrayList;
            }
            try {
                str = m12322a(vVar.mo5458c(), tVar.m40667d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : asList) {
                if (!str3.equals(str)) {
                    arrayList2.add(vVar.m12046e(str3));
                }
            }
            Iterator<AbstractC0642r> it = tVar.m40669b(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC10194a0) it.next()).mo5778a());
            }
            return arrayList;
        } catch (C0664v e) {
            throw new C0656t1(e);
        } catch (C8887f e2) {
            throw new C0656t1(C8507j1.m12249a(e2));
        }
    }
}
