package a4;

import c5.b0;
import f4.a;
import java.util.ArrayList;
import java.util.List;
import l4.c;
import m3.k2;
import t3.g;
import t3.q;

public final class m {
    public static final z6.m f349d = z6.m.d(':');
    public static final z6.m f350e = z6.m.d('*');
    public final List<a> f351a = new ArrayList();
    public int f352b = 0;
    public int f353c;

    public static final class a {
        public final int f354a;
        public final long f355b;
        public final int f356c;

        public a(int i10, long j10, int i11) {
            this.f354a = i10;
            this.f355b = j10;
            this.f356c = i11;
        }
    }

    public static int b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
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
                throw k2.a("Invalid SEF name", null);
        }
    }

    public static c f(b0 b0Var, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = f350e.f(b0Var.A(i10));
        for (int i11 = 0; i11 < f10.size(); i11++) {
            List<String> f11 = f349d.f(f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new c.b(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
                } catch (NumberFormatException e10) {
                    throw k2.a(null, e10);
                }
            } else {
                throw k2.a(null, null);
            }
        }
        return new c(arrayList);
    }

    public final void a(g gVar, q qVar) {
        b0 b0Var = new b0(8);
        gVar.readFully(b0Var.d(), 0, 8);
        this.f353c = b0Var.q() + 8;
        if (b0Var.n() != 1397048916) {
            qVar.f22899a = 0L;
            return;
        }
        qVar.f22899a = gVar.r() - (this.f353c - 12);
        this.f352b = 2;
    }

    public int c(g gVar, q qVar, List<a.b> list) {
        int i10 = this.f352b;
        long j10 = 0;
        if (i10 == 0) {
            long a10 = gVar.a();
            if (a10 != -1 && a10 >= 8) {
                j10 = a10 - 8;
            }
            qVar.f22899a = j10;
            this.f352b = 1;
        } else if (i10 == 1) {
            a(gVar, qVar);
        } else if (i10 == 2) {
            d(gVar, qVar);
        } else if (i10 == 3) {
            e(gVar, list);
            qVar.f22899a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public final void d(g gVar, q qVar) {
        long a10 = gVar.a();
        int i10 = (this.f353c - 12) - 8;
        b0 b0Var = new b0(i10);
        gVar.readFully(b0Var.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            b0Var.Q(2);
            short s10 = b0Var.s();
            if (s10 == 2192 || s10 == 2816 || s10 == 2817 || s10 == 2819 || s10 == 2820) {
                this.f351a.add(new a(s10, (a10 - this.f353c) - b0Var.q(), b0Var.q()));
            } else {
                b0Var.Q(8);
            }
        }
        if (this.f351a.isEmpty()) {
            qVar.f22899a = 0L;
            return;
        }
        this.f352b = 3;
        qVar.f22899a = this.f351a.get(0).f355b;
    }

    public final void e(g gVar, List<a.b> list) {
        long r10 = gVar.r();
        int a10 = (int) ((gVar.a() - gVar.r()) - this.f353c);
        b0 b0Var = new b0(a10);
        gVar.readFully(b0Var.d(), 0, a10);
        for (int i10 = 0; i10 < this.f351a.size(); i10++) {
            a aVar = this.f351a.get(i10);
            b0Var.P((int) (aVar.f355b - r10));
            b0Var.Q(4);
            int q10 = b0Var.q();
            int b10 = b(b0Var.A(q10));
            int i11 = aVar.f356c - (q10 + 8);
            if (b10 == 2192) {
                list.add(f(b0Var, i11));
            } else if (!(b10 == 2816 || b10 == 2817 || b10 == 2819 || b10 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f351a.clear();
        this.f352b = 0;
    }
}
