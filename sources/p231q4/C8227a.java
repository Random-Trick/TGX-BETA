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
    public final int f26604h;
    public final int f26605i;
    public final int f26606j;
    public final long f26607k;
    public List<C8032b> f26610n;
    public List<C8032b> f26611o;
    public int f26612p;
    public int f26613q;
    public boolean f26614r;
    public boolean f26615s;
    public byte f26616t;
    public byte f26617u;
    public boolean f26619w;
    public long f26620x;
    public static final int[] f26601y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] f26602z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] f26595A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] f26596B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, C3563j.f11927F0, C3563j.f11932G0, C3563j.f11937H0, C3563j.f11942I0, C3563j.f11947J0, C3563j.f11952K0, C3563j.f11957L0, C3563j.f11962M0, C3563j.f11967N0, 231, 247, 209, 241, 9632};
    public static final int[] f26597C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] f26598D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] f26599E = {195, 227, 205, 204, 236, 210, 242, 213, 245, C3563j.f11972O0, 125, 92, 94, 95, C3563j.f11977P0, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] f26600F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final C1189b0 f26603g = new C1189b0();
    public final ArrayList<C8228a> f26608l = new ArrayList<>();
    public C8228a f26609m = new C8228a(0, 4);
    public int f26618v = 0;

    public static final class C8228a {
        public final List<C8229a> f26621a = new ArrayList();
        public final List<SpannableString> f26622b = new ArrayList();
        public final StringBuilder f26623c = new StringBuilder();
        public int f26624d;
        public int f26625e;
        public int f26626f;
        public int f26627g;
        public int f26628h;

        public static class C8229a {
            public final int f26629a;
            public final boolean f26630b;
            public int f26631c;

            public C8229a(int i, boolean z, int i2) {
                this.f26629a = i;
                this.f26630b = z;
                this.f26631c = i2;
            }
        }

        public C8228a(int i, int i2) {
            m13121j(i);
            this.f26628h = i2;
        }

        public static void m13117n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        public static void m13116o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        public static void m13114q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void m13126e(char c) {
            if (this.f26623c.length() < 32) {
                this.f26623c.append(c);
            }
        }

        public void m13125f() {
            int length = this.f26623c.length();
            if (length > 0) {
                this.f26623c.delete(length - 1, length);
                for (int size = this.f26621a.size() - 1; size >= 0; size--) {
                    C8229a aVar = this.f26621a.get(size);
                    int i = aVar.f26631c;
                    if (i == length) {
                        aVar.f26631c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public C8032b m13124g(int i) {
            float f;
            int i2 = this.f26625e + this.f26626f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f26622b.size(); i4++) {
                spannableStringBuilder.append(C1216l0.m38008G0(this.f26622b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(C1216l0.m38008G0(m13123h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f26627g != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
                    i = (this.f26627g != 2 || i5 <= 0) ? 0 : 2;
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
            int i6 = this.f26624d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f26627g == 1) {
                i6 -= this.f26628h - 1;
            }
            return new C8032b.C8034b().m13743o(spannableStringBuilder).m13742p(Layout.Alignment.ALIGN_NORMAL).m13750h(i6, 1).m13747k(f).m13746l(i).m13757a();
        }

        public final SpannableString m13123h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f26623c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f26621a.size()) {
                C8229a aVar = this.f26621a.get(i);
                boolean z2 = aVar.f26630b;
                int i7 = aVar.f26629a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C8227a.f26595A[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f26631c;
                i++;
                if (i8 != (i < this.f26621a.size() ? this.f26621a.get(i).f26631c : length)) {
                    if (i2 != -1 && !z2) {
                        m13114q(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        m13116o(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        m13117n(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                m13114q(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                m13116o(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                m13117n(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean m13122i() {
            return this.f26621a.isEmpty() && this.f26622b.isEmpty() && this.f26623c.length() == 0;
        }

        public void m13121j(int i) {
            this.f26627g = i;
            this.f26621a.clear();
            this.f26622b.clear();
            this.f26623c.setLength(0);
            this.f26624d = 15;
            this.f26625e = 0;
            this.f26626f = 0;
        }

        public void m13120k() {
            this.f26622b.add(m13123h());
            this.f26623c.setLength(0);
            this.f26621a.clear();
            int min = Math.min(this.f26628h, this.f26624d);
            while (this.f26622b.size() >= min) {
                this.f26622b.remove(0);
            }
        }

        public void m13119l(int i) {
            this.f26627g = i;
        }

        public void m13118m(int i) {
            this.f26628h = i;
        }

        public void m13115p(int i, boolean z) {
            this.f26621a.add(new C8229a(i, z, this.f26623c.length()));
        }
    }

    public C8227a(String str, int i, long j) {
        this.f26607k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f26604h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f26606j = 0;
            this.f26605i = 0;
        } else if (i == 2) {
            this.f26606j = 1;
            this.f26605i = 0;
        } else if (i == 3) {
            this.f26606j = 0;
            this.f26605i = 1;
        } else if (i != 4) {
            C1230s.m37881i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f26606j = 0;
            this.f26605i = 0;
        } else {
            this.f26606j = 1;
            this.f26605i = 1;
        }
        m13144O(0);
        m13145N();
        this.f26619w = true;
        this.f26620x = -9223372036854775807L;
    }

    public static boolean m13157B(byte b) {
        return (b & 224) == 0;
    }

    public static boolean m13156C(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    public static boolean m13155D(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    public static boolean m13154E(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    public static boolean m13153F(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    public static boolean m13152G(byte b) {
        return (b & 240) == 16;
    }

    public static boolean m13150I(byte b) {
        return (b & 247) == 20;
    }

    public static boolean m13149J(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    public static boolean m13148K(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    public static boolean m13147L(byte b) {
        return 1 <= b && b <= 15;
    }

    public static char m13139r(byte b) {
        return (char) f26596B[(b & Byte.MAX_VALUE) - 32];
    }

    public static int m13138s(byte b) {
        return (b >> 3) & 1;
    }

    public static char m13136u(byte b) {
        return (char) f26598D[b & 31];
    }

    public static char m13135v(byte b) {
        return (char) f26599E[b & 31];
    }

    public static char m13134w(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m13136u(b2);
        }
        return m13135v(b2);
    }

    public static char m13133x(byte b) {
        return (char) f26597C[b & 15];
    }

    public final void m13158A(byte b, byte b2) {
        int i = f26601y[b & 7];
        boolean z = false;
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f26609m.f26624d) {
            if (this.f26612p != 1 && !this.f26609m.m13122i()) {
                C8228a aVar = new C8228a(this.f26612p, this.f26613q);
                this.f26609m = aVar;
                this.f26608l.add(aVar);
            }
            this.f26609m.f26624d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        if ((b2 & 1) == 1) {
            z = true;
        }
        int i2 = (b2 >> 1) & 7;
        this.f26609m.m13115p(z2 ? 8 : i2, z);
        if (z2) {
            this.f26609m.f26625e = f26602z[i2];
        }
    }

    public final boolean m13151H(boolean z, byte b, byte b2) {
        if (!z || !m13152G(b)) {
            this.f26615s = false;
        } else if (this.f26615s && this.f26616t == b && this.f26617u == b2) {
            this.f26615s = false;
            return true;
        } else {
            this.f26615s = true;
            this.f26616t = b;
            this.f26617u = b2;
        }
        return false;
    }

    public final void m13146M(byte b, byte b2) {
        if (m13147L(b)) {
            this.f26619w = false;
        } else if (m13150I(b)) {
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
                                this.f26619w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f26619w = true;
        }
    }

    public final void m13145N() {
        this.f26609m.m13121j(this.f26612p);
        this.f26608l.clear();
        this.f26608l.add(this.f26609m);
    }

    public final void m13144O(int i) {
        int i2 = this.f26612p;
        if (i2 != i) {
            this.f26612p = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f26608l.size(); i3++) {
                    this.f26608l.get(i3).m13119l(i);
                }
                return;
            }
            m13145N();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f26610n = Collections.emptyList();
            }
        }
    }

    public final void m13143P(int i) {
        this.f26613q = i;
        this.f26609m.m13118m(i);
    }

    public final boolean m13142Q() {
        return (this.f26607k == -9223372036854775807L || this.f26620x == -9223372036854775807L || m13065l() - this.f26620x < this.f26607k) ? false : true;
    }

    public final boolean m13141R(byte b) {
        if (m13157B(b)) {
            this.f26618v = m13138s(b);
        }
        return this.f26618v == this.f26606j;
    }

    @Override
    public void mo13075a() {
    }

    @Override
    public String mo13106b() {
        return "Cea608Decoder";
    }

    @Override
    public void mo13074c(long j) {
        super.mo13074c(j);
    }

    @Override
    public void flush() {
        super.flush();
        this.f26610n = null;
        this.f26611o = null;
        m13144O(0);
        m13143P(4);
        m13145N();
        this.f26614r = false;
        this.f26615s = false;
        this.f26616t = (byte) 0;
        this.f26617u = (byte) 0;
        this.f26618v = 0;
        this.f26619w = true;
        this.f26620x = -9223372036854775807L;
    }

    @Override
    public AbstractC8041f mo13070g() {
        List<C8032b> list = this.f26610n;
        this.f26611o = list;
        return new C8240f((List) C1186a.m38185e(list));
    }

    @Override
    public void mo13069h(p217p4.C8046j r10) {
        throw new UnsupportedOperationException("Method not decompiled: p231q4.C8227a.mo13069h(p4.j):void");
    }

    @Override
    public C8046j mo13068i() {
        return super.mo13072e();
    }

    @Override
    public AbstractC8047k mo13073d() {
        AbstractC8047k k;
        AbstractC8047k j = super.mo13073d();
        if (j != null) {
            return j;
        }
        if (!m13142Q() || (k = m13066k()) == null) {
            return null;
        }
        this.f26610n = Collections.emptyList();
        this.f26620x = -9223372036854775807L;
        k.m13721e(m13065l(), mo13070g(), Long.MAX_VALUE);
        return k;
    }

    @Override
    public boolean mo13064m() {
        return this.f26610n != this.f26611o;
    }

    @Override
    public void mo13063n(C8046j jVar) {
        super.mo13071f(jVar);
    }

    public final List<C8032b> m13137t() {
        int size = this.f26608l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C8032b g = this.f26608l.get(i2).m13124g(Integer.MIN_VALUE);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.f26162R);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C8032b bVar = (C8032b) arrayList.get(i3);
            if (bVar != null) {
                if (bVar.f26162R != i) {
                    bVar = (C8032b) C1186a.m38185e(this.f26608l.get(i3).m13124g(i));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    public final void m13132y(byte b) {
        this.f26609m.m13126e(' ');
        this.f26609m.m13115p((b >> 1) & 7, (b & 1) == 1);
    }

    public final void m13131z(byte b) {
        if (b == 32) {
            m13144O(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m13144O(1);
                    m13143P(2);
                    return;
                case 38:
                    m13144O(1);
                    m13143P(3);
                    return;
                case 39:
                    m13144O(1);
                    m13143P(4);
                    return;
                default:
                    int i = this.f26612p;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f26610n = Collections.emptyList();
                                    int i2 = this.f26612p;
                                    if (i2 == 1 || i2 == 3) {
                                        m13145N();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i == 1 && !this.f26609m.m13122i()) {
                                        this.f26609m.m13120k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    m13145N();
                                    return;
                                case 47:
                                    this.f26610n = m13137t();
                                    m13145N();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f26609m.m13125f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            m13144O(3);
        }
    }
}
