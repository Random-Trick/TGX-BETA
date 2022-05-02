package p255s;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.C0653t;
import androidx.camera.core.C0656t1;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p266t.C8887f;
import p266t.C8906m0;
import p336y.AbstractC10208c0;
import p336y.AbstractC10228g0;
import p336y.AbstractC10322z;
import p336y.C10222f0;

public final class C8579v implements AbstractC10322z {
    public final AbstractC10228g0 f27798a;
    public final C8906m0 f27800c;
    public final List<String> f27801d;
    public final Map<String, C8505j0> f27802e = new HashMap();
    public final C10222f0 f27799b = new C10222f0(1);

    public C8579v(Context context, AbstractC10228g0 g0Var, C0653t tVar) {
        this.f27798a = g0Var;
        this.f27800c = C8906m0.m10979b(context, g0Var.mo5688c());
        this.f27801d = m12046d(C8491h1.m12320b(this, tVar));
    }

    @Override
    public Set<String> mo5460a() {
        return new LinkedHashSet(this.f27801d);
    }

    @Override
    public AbstractC10208c0 mo5459b(String str) {
        if (this.f27801d.contains(str)) {
            return new C8474g0(this.f27800c, str, m12045e(str), this.f27799b, this.f27798a.mo5689b(), this.f27798a.mo5688c());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final List<String> m12046d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (m12043g(str)) {
                arrayList.add(str);
            } else {
                C0662u1.m40656a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public C8505j0 m12045e(String str) {
        try {
            C8505j0 j0Var = this.f27802e.get(str);
            if (j0Var != null) {
                return j0Var;
            }
            C8505j0 j0Var2 = new C8505j0(str, this.f27800c);
            this.f27802e.put(str, j0Var2);
            return j0Var2;
        } catch (C8887f e) {
            throw C8507j1.m12248a(e);
        }
    }

    public C8906m0 mo5458c() {
        return this.f27800c;
    }

    public final boolean m12043g(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f27800c.m10978c(str).m10951a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C8887f e) {
            throw new C0656t1(C8507j1.m12248a(e));
        }
    }
}
