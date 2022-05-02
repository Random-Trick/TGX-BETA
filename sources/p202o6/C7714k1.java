package p202o6;

import java.util.HashMap;
import java.util.Map;

public final class C7714k1 {
    public final Map f24739a = new HashMap();

    public final synchronized double m15186a(String str) {
        Double d = (Double) this.f24739a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public final synchronized double m15185b(String str, C7666b2 b2Var) {
        double d;
        d = (((C7659a1) b2Var).f24560h + 1.0d) / ((C7659a1) b2Var).f24561i;
        this.f24739a.put(str, Double.valueOf(d));
        return d;
    }

    public final synchronized void m15184c(String str) {
        this.f24739a.put(str, Double.valueOf(0.0d));
    }
}
