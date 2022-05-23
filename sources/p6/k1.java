package p6;

import java.util.HashMap;
import java.util.Map;

public final class k1 {
    public final Map f20693a = new HashMap();

    public final synchronized double a(String str) {
        Double d10 = (Double) this.f20693a.get(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    public final synchronized double b(String str, b2 b2Var) {
        double d10;
        d10 = (((a1) b2Var).f20534h + 1.0d) / ((a1) b2Var).f20535i;
        this.f20693a.put(str, Double.valueOf(d10));
        return d10;
    }

    public final synchronized void c(String str) {
        this.f20693a.put(str, Double.valueOf(0.0d));
    }
}
