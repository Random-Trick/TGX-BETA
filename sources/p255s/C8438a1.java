package p255s;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p016b1.C1132h;
import p266t.C8906m0;
import p336y.AbstractC10231g2;
import p336y.AbstractC10273n2;
import p336y.AbstractC10318y;

public final class C8438a1 implements AbstractC10318y {
    public final Map<String, C8502i2> f27404a;
    public final AbstractC8447c f27405b;

    public class C8439a implements AbstractC8447c {
        @Override
        public CamcorderProfile mo12444a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override
        public boolean mo12443b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public C8438a1(Context context, Object obj, Set<String> set) {
        this(context, new C8439a(), obj, set);
    }

    @Override
    public AbstractC10231g2 mo5478a(String str, int i, Size size) {
        C8502i2 i2Var = this.f27404a.get(str);
        if (i2Var != null) {
            return i2Var.m12290L(i, size);
        }
        return null;
    }

    @Override
    public Map<AbstractC10273n2<?>, Size> mo5477b(String str, List<AbstractC10231g2> list, List<AbstractC10273n2<?>> list2) {
        C1132h.m38328b(!list2.isEmpty(), "No new use cases to be bound.");
        C8502i2 i2Var = this.f27404a.get(str);
        if (i2Var != null) {
            return i2Var.m12265y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    public final void m12446c(Context context, C8906m0 m0Var, Set<String> set) {
        C1132h.m38325e(context);
        for (String str : set) {
            this.f27404a.put(str, new C8502i2(context, str, m0Var, this.f27405b));
        }
    }

    public C8438a1(Context context, AbstractC8447c cVar, Object obj, Set<String> set) {
        C8906m0 m0Var;
        this.f27404a = new HashMap();
        C1132h.m38325e(cVar);
        this.f27405b = cVar;
        if (obj instanceof C8906m0) {
            m0Var = (C8906m0) obj;
        } else {
            m0Var = C8906m0.m10980a(context);
        }
        m12446c(context, m0Var, set);
    }
}
