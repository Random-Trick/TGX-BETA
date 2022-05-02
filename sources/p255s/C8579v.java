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
    public final AbstractC10228g0 f27795a;
    public final C8906m0 f27797c;
    public final List<String> f27798d;
    public final Map<String, C8505j0> f27799e = new HashMap();
    public final C10222f0 f27796b = new C10222f0(1);

    public C8579v(Context context, AbstractC10228g0 g0Var, C0653t tVar) {
        this.f27795a = g0Var;
        this.f27797c = C8906m0.m10980b(context, g0Var.mo5688c());
        this.f27798d = m12047d(C8491h1.m12321b(this, tVar));
    }

    @Override
    public Set<String> mo5460a() {
        return new LinkedHashSet(this.f27798d);
    }

    @Override
    public AbstractC10208c0 mo5459b(String str) {
        if (this.f27798d.contains(str)) {
            return new C8474g0(this.f27797c, str, m12046e(str), this.f27796b, this.f27795a.mo5689b(), this.f27795a.mo5688c());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final List<String> m12047d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (m12044g(str)) {
                arrayList.add(str);
            } else {
                C0662u1.m40653a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public C8505j0 m12046e(String str) {
        try {
            C8505j0 j0Var = this.f27799e.get(str);
            if (j0Var != null) {
                return j0Var;
            }
            C8505j0 j0Var2 = new C8505j0(str, this.f27797c);
            this.f27799e.put(str, j0Var2);
            return j0Var2;
        } catch (C8887f e) {
            throw C8507j1.m12249a(e);
        }
    }

    public C8906m0 mo5458c() {
        return this.f27797c;
    }

    public final boolean m12044g(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f27797c.m10979c(str).m10952a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C8887f e) {
            throw new C0656t1(C8507j1.m12249a(e));
        }
    }
}
