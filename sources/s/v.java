package s;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.s;
import androidx.camera.core.s1;
import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.f;
import t.m0;
import y.c0;
import y.f0;
import y.g0;
import y.z;

public final class v implements z {
    public final g0 f22311a;
    public final m0 f22313c;
    public final List<String> f22314d;
    public final Map<String, j0> f22315e = new HashMap();
    public final f0 f22312b = new f0(1);

    public v(Context context, g0 g0Var, s sVar) {
        this.f22311a = g0Var;
        this.f22313c = m0.b(context, g0Var.c());
        this.f22314d = d(h1.b(this, sVar));
    }

    @Override
    public Set<String> a() {
        return new LinkedHashSet(this.f22314d);
    }

    @Override
    public c0 b(String str) {
        if (this.f22314d.contains(str)) {
            return new g0(this.f22313c, str, e(str), this.f22312b, this.f22311a.b(), this.f22311a.c());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final List<String> d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (g(str)) {
                arrayList.add(str);
            } else {
                t1.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public j0 e(String str) {
        try {
            j0 j0Var = this.f22315e.get(str);
            if (j0Var != null) {
                return j0Var;
            }
            j0 j0Var2 = new j0(str, this.f22313c);
            this.f22315e.put(str, j0Var2);
            return j0Var2;
        } catch (f e10) {
            throw j1.a(e10);
        }
    }

    public m0 c() {
        return this.f22313c;
    }

    public final boolean g(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f22313c.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (f e10) {
            throw new s1(j1.a(e10));
        }
    }
}
