package p005a4;

import java.util.ArrayList;
import java.util.List;
import p020b5.C1189b0;
import p073f4.C4260a;
import p162l4.C6312c;
import p174m3.C6556a2;
import p270t3.AbstractC8959g;
import p270t3.C8971q;
import p343y6.C10438l;

public final class C0108m {
    public static final C10438l f408d = C10438l.m5115d(':');
    public static final C10438l f409e = C10438l.m5115d('*');
    public final List<C0109a> f410a = new ArrayList();
    public int f411b = 0;
    public int f412c;

    public static final class C0109a {
        public final int f413a;
        public final long f414b;
        public final int f415c;

        public C0109a(int i, long j, int i2) {
            this.f413a = i;
            this.f414b = j;
            this.f415c = i2;
        }
    }

    public static int m42280b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw C6556a2.m20113a("Invalid SEF name", null);
        }
    }

    public static C6312c m42276f(C1189b0 b0Var, int i) {
        ArrayList arrayList = new ArrayList();
        List<String> f = f409e.m5113f(b0Var.m38162A(i));
        for (int i2 = 0; i2 < f.size(); i2++) {
            List<String> f2 = f408d.m5113f(f.get(i2));
            if (f2.size() == 3) {
                try {
                    arrayList.add(new C6312c.C6314b(Long.parseLong(f2.get(0)), Long.parseLong(f2.get(1)), 1 << (Integer.parseInt(f2.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw C6556a2.m20113a(null, e);
                }
            } else {
                throw C6556a2.m20113a(null, null);
            }
        }
        return new C6312c(arrayList);
    }

    public final void m42281a(AbstractC8959g gVar, C8971q qVar) {
        C1189b0 b0Var = new C1189b0(8);
        gVar.readFully(b0Var.m38142d(), 0, 8);
        this.f412c = b0Var.m38129q() + 8;
        if (b0Var.m38132n() != 1397048916) {
            qVar.f28860a = 0L;
            return;
        }
        qVar.f28860a = gVar.mo6043r() - (this.f412c - 12);
        this.f411b = 2;
    }

    public int m42279c(AbstractC8959g gVar, C8971q qVar, List<C4260a.AbstractC4262b> list) {
        int i = this.f411b;
        long j = 0;
        if (i == 0) {
            long a = gVar.mo6046a();
            if (a != -1 && a >= 8) {
                j = a - 8;
            }
            qVar.f28860a = j;
            this.f411b = 1;
        } else if (i == 1) {
            m42281a(gVar, qVar);
        } else if (i == 2) {
            m42278d(gVar, qVar);
        } else if (i == 3) {
            m42277e(gVar, list);
            qVar.f28860a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public final void m42278d(AbstractC8959g gVar, C8971q qVar) {
        long a = gVar.mo6046a();
        int i = (this.f412c - 12) - 8;
        C1189b0 b0Var = new C1189b0(i);
        gVar.readFully(b0Var.m38142d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            b0Var.m38146Q(2);
            short s = b0Var.m38127s();
            if (s == 2192 || s == 2816 || s == 2817 || s == 2819 || s == 2820) {
                this.f410a.add(new C0109a(s, (a - this.f412c) - b0Var.m38129q(), b0Var.m38129q()));
            } else {
                b0Var.m38146Q(8);
            }
        }
        if (this.f410a.isEmpty()) {
            qVar.f28860a = 0L;
            return;
        }
        this.f411b = 3;
        qVar.f28860a = this.f410a.get(0).f414b;
    }

    public final void m42277e(AbstractC8959g gVar, List<C4260a.AbstractC4262b> list) {
        long r = gVar.mo6043r();
        int a = (int) ((gVar.mo6046a() - gVar.mo6043r()) - this.f412c);
        C1189b0 b0Var = new C1189b0(a);
        gVar.readFully(b0Var.m38142d(), 0, a);
        for (int i = 0; i < this.f410a.size(); i++) {
            C0109a aVar = this.f410a.get(i);
            b0Var.m38147P((int) (aVar.f414b - r));
            b0Var.m38146Q(4);
            int q = b0Var.m38129q();
            int b = m42280b(b0Var.m38162A(q));
            int i2 = aVar.f415c - (q + 8);
            if (b == 2192) {
                list.add(m42276f(b0Var, i2));
            } else if (!(b == 2816 || b == 2817 || b == 2819 || b == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    public void m42275g() {
        this.f410a.clear();
        this.f411b = 0;
    }
}
