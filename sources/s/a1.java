package s;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import b1.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.m0;
import y.g2;
import y.n2;
import y.y;

public final class a1 implements y {
    public final Map<String, i2> f21947a;
    public final c f21948b;

    public class a implements c {
        @Override
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public a1(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    @Override
    public g2 a(String str, int i10, Size size) {
        i2 i2Var = this.f21947a.get(str);
        if (i2Var != null) {
            return i2Var.L(i10, size);
        }
        return null;
    }

    @Override
    public Map<n2<?>, Size> b(String str, List<g2> list, List<n2<?>> list2) {
        h.b(!list2.isEmpty(), "No new use cases to be bound.");
        i2 i2Var = this.f21947a.get(str);
        if (i2Var != null) {
            return i2Var.y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    public final void c(Context context, m0 m0Var, Set<String> set) {
        h.e(context);
        for (String str : set) {
            this.f21947a.put(str, new i2(context, str, m0Var, this.f21948b));
        }
    }

    public a1(Context context, c cVar, Object obj, Set<String> set) {
        m0 m0Var;
        this.f21947a = new HashMap();
        h.e(cVar);
        this.f21948b = cVar;
        if (obj instanceof m0) {
            m0Var = (m0) obj;
        } else {
            m0Var = m0.a(context);
        }
        c(context, m0Var, set);
    }
}
