package p126j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p126j$.util.AbstractC5468G;

public enum EnumC5705f3 {
    DISTINCT(0, r2),
    SORTED(1, r5),
    ORDERED(2, r7),
    SIZED(3, r11),
    SHORT_CIRCUIT(12, r13);
    
    static final int f18356f;
    static final int f18357g;
    static final int f18358h;
    private static final int f18359i;
    private static final int f18360j;
    private static final int f18361k;
    static final int f18362l;
    static final int f18363m;
    static final int f18364n;
    static final int f18365o;
    static final int f18366p;
    static final int f18367q;
    static final int f18368r;
    static final int f18369s;
    static final int f18370t;
    static final int f18371u;
    private final Map f18373a;
    private final int f18374b;
    private final int f18375c;
    private final int f18376d;
    private final int f18377e;

    static {
        EnumC5700e3 e3Var = EnumC5700e3.SPLITERATOR;
        C5695d3 f = m22263f(e3Var);
        EnumC5700e3 e3Var2 = EnumC5700e3.STREAM;
        f.m22283b(e3Var2);
        EnumC5700e3 e3Var3 = EnumC5700e3.OP;
        f.m22282c(e3Var3);
        C5695d3 f2 = m22263f(e3Var);
        f2.m22283b(e3Var2);
        f2.m22282c(e3Var3);
        C5695d3 f3 = m22263f(e3Var);
        f3.m22283b(e3Var2);
        f3.m22282c(e3Var3);
        EnumC5700e3 e3Var4 = EnumC5700e3.TERMINAL_OP;
        f3.m22284a(e3Var4);
        EnumC5700e3 e3Var5 = EnumC5700e3.UPSTREAM_TERMINAL_OP;
        f3.m22284a(e3Var5);
        C5695d3 f4 = m22263f(e3Var);
        f4.m22283b(e3Var2);
        f4.m22284a(e3Var3);
        m22263f(e3Var3).m22283b(e3Var4);
        f18356f = m22267b(e3Var);
        f18357g = m22267b(e3Var2);
        f18358h = m22267b(e3Var3);
        m22267b(e3Var4);
        m22267b(e3Var5);
        int i = 0;
        for (EnumC5705f3 f3Var : values()) {
            i |= f3Var.f18377e;
        }
        f18359i = i;
        int i2 = f18357g;
        f18360j = i2;
        int i3 = i2 << 1;
        f18361k = i3;
        f18362l = i2 | i3;
        EnumC5705f3 f3Var2 = DISTINCT;
        f18363m = f3Var2.f18375c;
        f18364n = f3Var2.f18376d;
        EnumC5705f3 f3Var3 = SORTED;
        f18365o = f3Var3.f18375c;
        f18366p = f3Var3.f18376d;
        EnumC5705f3 f3Var4 = ORDERED;
        f18367q = f3Var4.f18375c;
        f18368r = f3Var4.f18376d;
        EnumC5705f3 f3Var5 = SIZED;
        f18369s = f3Var5.f18375c;
        f18370t = f3Var5.f18376d;
        f18371u = SHORT_CIRCUIT.f18375c;
    }

    EnumC5705f3(int i, C5695d3 d3Var) {
        EnumC5700e3[] values;
        for (EnumC5700e3 e3Var : EnumC5700e3.values()) {
            Map map = d3Var.f18339a;
            if (map instanceof p126j$.util.Map) {
                ((p126j$.util.Map) map).putIfAbsent(e3Var, 0);
            } else {
                map.get(e3Var);
            }
        }
        this.f18373a = d3Var.f18339a;
        int i2 = i * 2;
        this.f18374b = i2;
        this.f18375c = 1 << i2;
        this.f18376d = 2 << i2;
        this.f18377e = 3 << i2;
    }

    public static int m22268a(int i, int i2) {
        return i | (i2 & (i == 0 ? f18359i : ~(((f18360j & i) << 1) | i | ((f18361k & i) >> 1))));
    }

    private static int m22267b(EnumC5700e3 e3Var) {
        EnumC5705f3[] values;
        int i = 0;
        for (EnumC5705f3 f3Var : values()) {
            i |= ((Integer) f3Var.f18373a.get(e3Var)).intValue() << f3Var.f18374b;
        }
        return i;
    }

    public static int m22266c(AbstractC5468G g) {
        int characteristics = g.characteristics();
        return ((characteristics & 4) == 0 || g.getComparator() == null) ? f18356f & characteristics : f18356f & characteristics & (-5);
    }

    private static C5695d3 m22263f(EnumC5700e3 e3Var) {
        EnumMap enumMap = new EnumMap(EnumC5700e3.class);
        C5695d3 d3Var = new C5695d3(enumMap);
        enumMap.put((EnumMap) e3Var, (EnumC5700e3) 1);
        return d3Var;
    }

    public static int m22262g(int i) {
        return i & ((~i) >> 1) & f18360j;
    }

    public boolean m22265d(int i) {
        return (i & this.f18377e) == this.f18375c;
    }

    public boolean m22264e(int i) {
        int i2 = this.f18377e;
        return (i & i2) == i2;
    }
}
