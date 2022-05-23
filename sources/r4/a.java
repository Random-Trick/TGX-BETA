package r4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c5.b0;
import c5.l0;
import c5.s;
import d.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q4.b;
import q4.f;
import q4.k;

public final class a extends e {
    public final int f21655h;
    public final int f21656i;
    public final int f21657j;
    public final long f21658k;
    public List<b> f21661n;
    public List<b> f21662o;
    public int f21663p;
    public int f21664q;
    public boolean f21665r;
    public boolean f21666s;
    public byte f21667t;
    public byte f21668u;
    public boolean f21670w;
    public long f21671x;
    public static final int[] f21652y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] f21653z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, j.F0, j.G0, j.H0, j.I0, j.J0, j.K0, j.L0, j.M0, j.N0, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, j.O0, 125, 92, 94, 95, j.P0, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final b0 f21654g = new b0();
    public final ArrayList<C0204a> f21659l = new ArrayList<>();
    public C0204a f21660m = new C0204a(0, 4);
    public int f21669v = 0;

    public static final class C0204a {
        public final List<C0205a> f21672a = new ArrayList();
        public final List<SpannableString> f21673b = new ArrayList();
        public final StringBuilder f21674c = new StringBuilder();
        public int f21675d;
        public int f21676e;
        public int f21677f;
        public int f21678g;
        public int f21679h;

        public static class C0205a {
            public final int f21680a;
            public final boolean f21681b;
            public int f21682c;

            public C0205a(int i10, boolean z10, int i11) {
                this.f21680a = i10;
                this.f21681b = z10;
                this.f21682c = i11;
            }
        }

        public C0204a(int i10, int i11) {
            j(i10);
            this.f21679h = i11;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
            }
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f21674c.length() < 32) {
                this.f21674c.append(c10);
            }
        }

        public void f() {
            int length = this.f21674c.length();
            if (length > 0) {
                this.f21674c.delete(length - 1, length);
                for (int size = this.f21672a.size() - 1; size >= 0; size--) {
                    C0205a aVar = this.f21672a.get(size);
                    int i10 = aVar.f21682c;
                    if (i10 == length) {
                        aVar.f21682c = i10 - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public b g(int i10) {
            float f10;
            int i11 = this.f21676e + this.f21677f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f21673b.size(); i13++) {
                spannableStringBuilder.append(l0.H0(this.f21673b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(l0.H0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f21678g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f21678g != 2 || i14 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f21675d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f21678g == 1) {
                i15 -= this.f21679h - 1;
            }
            return new b.C0195b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f10).l(i10).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21674c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            int i15 = -1;
            boolean z10 = false;
            while (i10 < this.f21672a.size()) {
                C0205a aVar = this.f21672a.get(i10);
                boolean z11 = aVar.f21681b;
                int i16 = aVar.f21680a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = aVar.f21682c;
                i10++;
                if (i17 != (i10 < this.f21672a.size() ? this.f21672a.get(i10).f21682c : length)) {
                    if (i11 != -1 && !z11) {
                        q(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        o(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i13, i17, i14);
                        i14 = i15;
                        i13 = i17;
                    }
                }
            }
            if (!(i11 == -1 || i11 == length)) {
                q(spannableStringBuilder, i11, length);
            }
            if (!(i12 == -1 || i12 == length)) {
                o(spannableStringBuilder, i12, length);
            }
            if (i13 != length) {
                n(spannableStringBuilder, i13, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f21672a.isEmpty() && this.f21673b.isEmpty() && this.f21674c.length() == 0;
        }

        public void j(int i10) {
            this.f21678g = i10;
            this.f21672a.clear();
            this.f21673b.clear();
            this.f21674c.setLength(0);
            this.f21675d = 15;
            this.f21676e = 0;
            this.f21677f = 0;
        }

        public void k() {
            this.f21673b.add(h());
            this.f21674c.setLength(0);
            this.f21672a.clear();
            int min = Math.min(this.f21679h, this.f21675d);
            while (this.f21673b.size() >= min) {
                this.f21673b.remove(0);
            }
        }

        public void l(int i10) {
            this.f21678g = i10;
        }

        public void m(int i10) {
            this.f21679h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f21672a.add(new C0205a(i10, z10, this.f21674c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f21658k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f21655h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f21657j = 0;
            this.f21656i = 0;
        } else if (i10 == 2) {
            this.f21657j = 1;
            this.f21656i = 0;
        } else if (i10 == 3) {
            this.f21657j = 0;
            this.f21656i = 1;
        } else if (i10 != 4) {
            s.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f21657j = 0;
            this.f21656i = 0;
        } else {
            this.f21657j = 1;
            this.f21656i = 1;
        }
        O(0);
        N();
        this.f21670w = true;
        this.f21671x = -9223372036854775807L;
    }

    public static boolean B(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    public static boolean I(byte b10) {
        return (b10 & 247) == 20;
    }

    public static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    public static char r(byte b10) {
        return (char) B[(b10 & Byte.MAX_VALUE) - 32];
    }

    public static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    public static char u(byte b10) {
        return (char) D[b10 & 31];
    }

    public static char v(byte b10) {
        return (char) E[b10 & 31];
    }

    public static char w(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return u(b11);
        }
        return v(b11);
    }

    public static char x(byte b10) {
        return (char) C[b10 & 15];
    }

    public final void A(byte b10, byte b11) {
        int i10 = f21652y[b10 & 7];
        boolean z10 = false;
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f21660m.f21675d) {
            if (this.f21663p != 1 && !this.f21660m.i()) {
                C0204a aVar = new C0204a(this.f21663p, this.f21664q);
                this.f21660m = aVar;
                this.f21659l.add(aVar);
            }
            this.f21660m.f21675d = i10;
        }
        boolean z11 = (b11 & 16) == 16;
        if ((b11 & 1) == 1) {
            z10 = true;
        }
        int i11 = (b11 >> 1) & 7;
        this.f21660m.p(z11 ? 8 : i11, z10);
        if (z11) {
            this.f21660m.f21676e = f21653z[i11];
        }
    }

    public final boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f21666s = false;
        } else if (this.f21666s && this.f21667t == b10 && this.f21668u == b11) {
            this.f21666s = false;
            return true;
        } else {
            this.f21666s = true;
            this.f21667t = b10;
            this.f21668u = b11;
        }
        return false;
    }

    public final void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f21670w = false;
        } else if (I(b10)) {
            if (!(b11 == 32 || b11 == 47)) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f21670w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f21670w = true;
        }
    }

    public final void N() {
        this.f21660m.j(this.f21663p);
        this.f21659l.clear();
        this.f21659l.add(this.f21660m);
    }

    public final void O(int i10) {
        int i11 = this.f21663p;
        if (i11 != i10) {
            this.f21663p = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f21659l.size(); i12++) {
                    this.f21659l.get(i12).l(i10);
                }
                return;
            }
            N();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f21661n = Collections.emptyList();
            }
        }
    }

    public final void P(int i10) {
        this.f21664q = i10;
        this.f21660m.m(i10);
    }

    public final boolean Q() {
        return (this.f21658k == -9223372036854775807L || this.f21671x == -9223372036854775807L || l() - this.f21671x < this.f21658k) ? false : true;
    }

    public final boolean R(byte b10) {
        if (B(b10)) {
            this.f21669v = s(b10);
        }
        return this.f21669v == this.f21657j;
    }

    @Override
    public void a() {
    }

    @Override
    public String b() {
        return "Cea608Decoder";
    }

    @Override
    public void c(long j10) {
        super.c(j10);
    }

    @Override
    public void flush() {
        super.flush();
        this.f21661n = null;
        this.f21662o = null;
        O(0);
        P(4);
        N();
        this.f21665r = false;
        this.f21666s = false;
        this.f21667t = (byte) 0;
        this.f21668u = (byte) 0;
        this.f21669v = 0;
        this.f21670w = true;
        this.f21671x = -9223372036854775807L;
    }

    @Override
    public f g() {
        List<b> list = this.f21661n;
        this.f21662o = list;
        return new f((List) c5.a.e(list));
    }

    @Override
    public void h(q4.j r10) {
        throw new UnsupportedOperationException("Method not decompiled: r4.a.h(q4.j):void");
    }

    @Override
    public q4.j i() {
        return super.e();
    }

    @Override
    public k d() {
        k k10;
        k j10 = super.d();
        if (j10 != null) {
            return j10;
        }
        if (!Q() || (k10 = k()) == null) {
            return null;
        }
        this.f21661n = Collections.emptyList();
        this.f21671x = -9223372036854775807L;
        k10.e(l(), g(), Long.MAX_VALUE);
        return k10;
    }

    @Override
    public boolean m() {
        return this.f21661n != this.f21662o;
    }

    @Override
    public void n(q4.j jVar) {
        super.f(jVar);
    }

    public final List<b> t() {
        int size = this.f21659l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            b g10 = this.f21659l.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.R);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.R != i10) {
                    bVar = (b) c5.a.e(this.f21659l.get(i12).g(i10));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    public final void y(byte b10) {
        this.f21660m.e(' ');
        this.f21660m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    public final void z(byte b10) {
        if (b10 == 32) {
            O(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    O(1);
                    P(2);
                    return;
                case 38:
                    O(1);
                    P(3);
                    return;
                case 39:
                    O(1);
                    P(4);
                    return;
                default:
                    int i10 = this.f21663p;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case 44:
                                    this.f21661n = Collections.emptyList();
                                    int i11 = this.f21663p;
                                    if (i11 == 1 || i11 == 3) {
                                        N();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i10 == 1 && !this.f21660m.i()) {
                                        this.f21660m.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    N();
                                    return;
                                case 47:
                                    this.f21661n = t();
                                    N();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f21660m.f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            O(3);
        }
    }
}
