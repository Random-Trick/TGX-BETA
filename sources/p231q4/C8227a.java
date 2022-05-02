package p231q4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p039d.C3563j;
import p217p4.AbstractC8041f;
import p217p4.AbstractC8047k;
import p217p4.C8032b;
import p217p4.C8046j;

public final class C8227a extends AbstractC8236e {
    public final int f26607h;
    public final int f26608i;
    public final int f26609j;
    public final long f26610k;
    public List<C8032b> f26613n;
    public List<C8032b> f26614o;
    public int f26615p;
    public int f26616q;
    public boolean f26617r;
    public boolean f26618s;
    public byte f26619t;
    public byte f26620u;
    public boolean f26622w;
    public long f26623x;
    public static final int[] f26604y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] f26605z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] f26598A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] f26599B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, C3563j.f11927F0, C3563j.f11932G0, C3563j.f11937H0, C3563j.f11942I0, C3563j.f11947J0, C3563j.f11952K0, C3563j.f11957L0, C3563j.f11962M0, C3563j.f11967N0, 231, 247, 209, 241, 9632};
    public static final int[] f26600C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] f26601D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] f26602E = {195, 227, 205, 204, 236, 210, 242, 213, 245, C3563j.f11972O0, 125, 92, 94, 95, C3563j.f11977P0, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] f26603F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final C1189b0 f26606g = new C1189b0();
    public final ArrayList<C8228a> f26611l = new ArrayList<>();
    public C8228a f26612m = new C8228a(0, 4);
    public int f26621v = 0;

    public static final class C8228a {
        public final List<C8229a> f26624a = new ArrayList();
        public final List<SpannableString> f26625b = new ArrayList();
        public final StringBuilder f26626c = new StringBuilder();
        public int f26627d;
        public int f26628e;
        public int f26629f;
        public int f26630g;
        public int f26631h;

        public static class C8229a {
            public final int f26632a;
            public final boolean f26633b;
            public int f26634c;

            public C8229a(int i, boolean z, int i2) {
                this.f26632a = i;
                this.f26633b = z;
                this.f26634c = i2;
            }
        }

        public C8228a(int i, int i2) {
            m13120j(i);
            this.f26631h = i2;
        }

        public static void m13116n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        public static void m13115o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        public static void m13113q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void m13125e(char c) {
            if (this.f26626c.length() < 32) {
                this.f26626c.append(c);
            }
        }

        public void m13124f() {
            int length = this.f26626c.length();
            if (length > 0) {
                this.f26626c.delete(length - 1, length);
                for (int size = this.f26624a.size() - 1; size >= 0; size--) {
                    C8229a aVar = this.f26624a.get(size);
                    int i = aVar.f26634c;
                    if (i == length) {
                        aVar.f26634c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public C8032b m13123g(int i) {
            float f;
            int i2 = this.f26628e + this.f26629f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f26625b.size(); i4++) {
                spannableStringBuilder.append(C1216l0.m38011G0(this.f26625b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(C1216l0.m38011G0(m13122h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f26630g != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
                    i = (this.f26630g != 2 || i5 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.f26627d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f26630g == 1) {
                i6 -= this.f26631h - 1;
            }
            return new C8032b.C8034b().m13742o(spannableStringBuilder).m13741p(Layout.Alignment.ALIGN_NORMAL).m13749h(i6, 1).m13746k(f).m13745l(i).m13756a();
        }

        public final SpannableString m13122h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f26626c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f26624a.size()) {
                C8229a aVar = this.f26624a.get(i);
                boolean z2 = aVar.f26633b;
                int i7 = aVar.f26632a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C8227a.f26598A[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f26634c;
                i++;
                if (i8 != (i < this.f26624a.size() ? this.f26624a.get(i).f26634c : length)) {
                    if (i2 != -1 && !z2) {
                        m13113q(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        m13115o(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        m13116n(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                m13113q(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                m13115o(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                m13116n(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean m13121i() {
            return this.f26624a.isEmpty() && this.f26625b.isEmpty() && this.f26626c.length() == 0;
        }

        public void m13120j(int i) {
            this.f26630g = i;
            this.f26624a.clear();
            this.f26625b.clear();
            this.f26626c.setLength(0);
            this.f26627d = 15;
            this.f26628e = 0;
            this.f26629f = 0;
        }

        public void m13119k() {
            this.f26625b.add(m13122h());
            this.f26626c.setLength(0);
            this.f26624a.clear();
            int min = Math.min(this.f26631h, this.f26627d);
            while (this.f26625b.size() >= min) {
                this.f26625b.remove(0);
            }
        }

        public void m13118l(int i) {
            this.f26630g = i;
        }

        public void m13117m(int i) {
            this.f26631h = i;
        }

        public void m13114p(int i, boolean z) {
            this.f26624a.add(new C8229a(i, z, this.f26626c.length()));
        }
    }

    public C8227a(String str, int i, long j) {
        this.f26610k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f26607h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f26609j = 0;
            this.f26608i = 0;
        } else if (i == 2) {
            this.f26609j = 1;
            this.f26608i = 0;
        } else if (i == 3) {
            this.f26609j = 0;
            this.f26608i = 1;
        } else if (i != 4) {
            C1230s.m37884i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f26609j = 0;
            this.f26608i = 0;
        } else {
            this.f26609j = 1;
            this.f26608i = 1;
        }
        m13143O(0);
        m13144N();
        this.f26622w = true;
        this.f26623x = -9223372036854775807L;
    }

    public static boolean m13156B(byte b) {
        return (b & 224) == 0;
    }

    public static boolean m13155C(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    public static boolean m13154D(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    public static boolean m13153E(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    public static boolean m13152F(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    public static boolean m13151G(byte b) {
        return (b & 240) == 16;
    }

    public static boolean m13149I(byte b) {
        return (b & 247) == 20;
    }

    public static boolean m13148J(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    public static boolean m13147K(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    public static boolean m13146L(byte b) {
        return 1 <= b && b <= 15;
    }

    public static char m13138r(byte b) {
        return (char) f26599B[(b & Byte.MAX_VALUE) - 32];
    }

    public static int m13137s(byte b) {
        return (b >> 3) & 1;
    }

    public static char m13135u(byte b) {
        return (char) f26601D[b & 31];
    }

    public static char m13134v(byte b) {
        return (char) f26602E[b & 31];
    }

    public static char m13133w(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m13135u(b2);
        }
        return m13134v(b2);
    }

    public static char m13132x(byte b) {
        return (char) f26600C[b & 15];
    }

    public final void m13157A(byte b, byte b2) {
        int i = f26604y[b & 7];
        boolean z = false;
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f26612m.f26627d) {
            if (this.f26615p != 1 && !this.f26612m.m13121i()) {
                C8228a aVar = new C8228a(this.f26615p, this.f26616q);
                this.f26612m = aVar;
                this.f26611l.add(aVar);
            }
            this.f26612m.f26627d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        if ((b2 & 1) == 1) {
            z = true;
        }
        int i2 = (b2 >> 1) & 7;
        this.f26612m.m13114p(z2 ? 8 : i2, z);
        if (z2) {
            this.f26612m.f26628e = f26605z[i2];
        }
    }

    public final boolean m13150H(boolean z, byte b, byte b2) {
        if (!z || !m13151G(b)) {
            this.f26618s = false;
        } else if (this.f26618s && this.f26619t == b && this.f26620u == b2) {
            this.f26618s = false;
            return true;
        } else {
            this.f26618s = true;
            this.f26619t = b;
            this.f26620u = b2;
        }
        return false;
    }

    public final void m13145M(byte b, byte b2) {
        if (m13146L(b)) {
            this.f26622w = false;
        } else if (m13149I(b)) {
            if (!(b2 == 32 || b2 == 47)) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f26622w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f26622w = true;
        }
    }

    public final void m13144N() {
        this.f26612m.m13120j(this.f26615p);
        this.f26611l.clear();
        this.f26611l.add(this.f26612m);
    }

    public final void m13143O(int i) {
        int i2 = this.f26615p;
        if (i2 != i) {
            this.f26615p = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f26611l.size(); i3++) {
                    this.f26611l.get(i3).m13118l(i);
                }
                return;
            }
            m13144N();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f26613n = Collections.emptyList();
            }
        }
    }

    public final void m13142P(int i) {
        this.f26616q = i;
        this.f26612m.m13117m(i);
    }

    public final boolean m13141Q() {
        return (this.f26610k == -9223372036854775807L || this.f26623x == -9223372036854775807L || m13064l() - this.f26623x < this.f26610k) ? false : true;
    }

    public final boolean m13140R(byte b) {
        if (m13156B(b)) {
            this.f26621v = m13137s(b);
        }
        return this.f26621v == this.f26609j;
    }

    @Override
    public void mo13074a() {
    }

    @Override
    public String mo13105b() {
        return "Cea608Decoder";
    }

    @Override
    public void mo13073c(long j) {
        super.mo13073c(j);
    }

    @Override
    public void flush() {
        super.flush();
        this.f26613n = null;
        this.f26614o = null;
        m13143O(0);
        m13142P(4);
        m13144N();
        this.f26617r = false;
        this.f26618s = false;
        this.f26619t = (byte) 0;
        this.f26620u = (byte) 0;
        this.f26621v = 0;
        this.f26622w = true;
        this.f26623x = -9223372036854775807L;
    }

    @Override
    public AbstractC8041f mo13069g() {
        List<C8032b> list = this.f26613n;
        this.f26614o = list;
        return new C8240f((List) C1186a.m38188e(list));
    }

    @Override
    public void mo13068h(p217p4.C8046j r10) {
        throw new UnsupportedOperationException("Method not decompiled: p231q4.C8227a.mo13068h(p4.j):void");
    }

    @Override
    public C8046j mo13067i() {
        return super.mo13071e();
    }

    @Override
    public AbstractC8047k mo13072d() {
        AbstractC8047k k;
        AbstractC8047k j = super.mo13072d();
        if (j != null) {
            return j;
        }
        if (!m13141Q() || (k = m13065k()) == null) {
            return null;
        }
        this.f26613n = Collections.emptyList();
        this.f26623x = -9223372036854775807L;
        k.m13720e(m13064l(), mo13069g(), Long.MAX_VALUE);
        return k;
    }

    @Override
    public boolean mo13063m() {
        return this.f26613n != this.f26614o;
    }

    @Override
    public void mo13062n(C8046j jVar) {
        super.mo13070f(jVar);
    }

    public final List<C8032b> m13136t() {
        int size = this.f26611l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C8032b g = this.f26611l.get(i2).m13123g(Integer.MIN_VALUE);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.f26165R);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C8032b bVar = (C8032b) arrayList.get(i3);
            if (bVar != null) {
                if (bVar.f26165R != i) {
                    bVar = (C8032b) C1186a.m38188e(this.f26611l.get(i3).m13123g(i));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    public final void m13131y(byte b) {
        this.f26612m.m13125e(' ');
        this.f26612m.m13114p((b >> 1) & 7, (b & 1) == 1);
    }

    public final void m13130z(byte b) {
        if (b == 32) {
            m13143O(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m13143O(1);
                    m13142P(2);
                    return;
                case 38:
                    m13143O(1);
                    m13142P(3);
                    return;
                case 39:
                    m13143O(1);
                    m13142P(4);
                    return;
                default:
                    int i = this.f26615p;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f26613n = Collections.emptyList();
                                    int i2 = this.f26615p;
                                    if (i2 == 1 || i2 == 3) {
                                        m13144N();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i == 1 && !this.f26612m.m13121i()) {
                                        this.f26612m.m13119k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    m13144N();
                                    return;
                                case 47:
                                    this.f26613n = m13136t();
                                    m13144N();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f26612m.m13124f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            m13143O(3);
        }
    }
}
