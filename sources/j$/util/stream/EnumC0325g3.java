package j$.util.stream;

import j$.util.H;
import java.util.EnumMap;
import java.util.Map;

public enum EnumC0325g3 {
    DISTINCT(0, r2),
    SORTED(1, r5),
    ORDERED(2, r7),
    SIZED(3, r11),
    SHORT_CIRCUIT(12, r13);
    
    static final int f14751f;
    static final int f14752g;
    static final int f14753h;
    private static final int f14754i;
    private static final int f14755j;
    private static final int f14756k;
    static final int f14757l;
    static final int f14758m;
    static final int f14759n;
    static final int f14760o;
    static final int f14761p;
    static final int f14762q;
    static final int f14763r;
    static final int f14764s;
    static final int f14765t;
    static final int f14766u;
    private final Map f14768a;
    private final int f14769b;
    private final int f14770c;
    private final int f14771d;
    private final int f14772e;

    static {
        EnumC0320f3 f3Var = EnumC0320f3.SPLITERATOR;
        C0315e3 f10 = f(f3Var);
        EnumC0320f3 f3Var2 = EnumC0320f3.STREAM;
        f10.b(f3Var2);
        EnumC0320f3 f3Var3 = EnumC0320f3.OP;
        f10.c(f3Var3);
        C0315e3 f11 = f(f3Var);
        f11.b(f3Var2);
        f11.c(f3Var3);
        C0315e3 f12 = f(f3Var);
        f12.b(f3Var2);
        f12.c(f3Var3);
        EnumC0320f3 f3Var4 = EnumC0320f3.TERMINAL_OP;
        f12.a(f3Var4);
        EnumC0320f3 f3Var5 = EnumC0320f3.UPSTREAM_TERMINAL_OP;
        f12.a(f3Var5);
        C0315e3 f13 = f(f3Var);
        f13.b(f3Var2);
        f13.a(f3Var3);
        f(f3Var3).b(f3Var4);
        f14751f = b(f3Var);
        f14752g = b(f3Var2);
        f14753h = b(f3Var3);
        b(f3Var4);
        b(f3Var5);
        int i10 = 0;
        for (EnumC0325g3 g3Var : values()) {
            i10 |= g3Var.f14772e;
        }
        f14754i = i10;
        int i11 = f14752g;
        f14755j = i11;
        int i12 = i11 << 1;
        f14756k = i12;
        f14757l = i11 | i12;
        EnumC0325g3 g3Var2 = DISTINCT;
        f14758m = g3Var2.f14770c;
        f14759n = g3Var2.f14771d;
        EnumC0325g3 g3Var3 = SORTED;
        f14760o = g3Var3.f14770c;
        f14761p = g3Var3.f14771d;
        EnumC0325g3 g3Var4 = ORDERED;
        f14762q = g3Var4.f14770c;
        f14763r = g3Var4.f14771d;
        EnumC0325g3 g3Var5 = SIZED;
        f14764s = g3Var5.f14770c;
        f14765t = g3Var5.f14771d;
        f14766u = SHORT_CIRCUIT.f14770c;
    }

    EnumC0325g3(int i10, C0315e3 e3Var) {
        EnumC0320f3[] values;
        for (EnumC0320f3 f3Var : EnumC0320f3.values()) {
            Map map = e3Var.f14738a;
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).putIfAbsent(f3Var, 0);
            } else {
                map.get(f3Var);
            }
        }
        this.f14768a = e3Var.f14738a;
        int i11 = i10 * 2;
        this.f14769b = i11;
        this.f14770c = 1 << i11;
        this.f14771d = 2 << i11;
        this.f14772e = 3 << i11;
    }

    public static int a(int i10, int i11) {
        return i10 | (i11 & (i10 == 0 ? f14754i : ~(((f14755j & i10) << 1) | i10 | ((f14756k & i10) >> 1))));
    }

    private static int b(EnumC0320f3 f3Var) {
        EnumC0325g3[] values;
        int i10 = 0;
        for (EnumC0325g3 g3Var : values()) {
            i10 |= ((Integer) g3Var.f14768a.get(f3Var)).intValue() << g3Var.f14769b;
        }
        return i10;
    }

    public static int c(H h10) {
        int characteristics = h10.characteristics();
        return ((characteristics & 4) == 0 || h10.getComparator() == null) ? f14751f & characteristics : f14751f & characteristics & (-5);
    }

    private static C0315e3 f(EnumC0320f3 f3Var) {
        C0315e3 e3Var = new C0315e3(new EnumMap(EnumC0320f3.class));
        e3Var.b(f3Var);
        return e3Var;
    }

    public static int g(int i10) {
        return i10 & ((~i10) >> 1) & f14755j;
    }

    public final boolean d(int i10) {
        return (i10 & this.f14772e) == this.f14770c;
    }

    public final boolean e(int i10) {
        int i11 = this.f14772e;
        return (i10 & i11) == i11;
    }
}
