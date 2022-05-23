package r4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c5.a0;
import c5.b0;
import c5.e;
import c5.s;
import d.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import q4.b;
import q4.f;
import q4.k;

public final class c extends e {
    public final b0 f21684g = new b0();
    public final a0 f21685h = new a0();
    public int f21686i = -1;
    public final boolean f21687j;
    public final int f21688k;
    public final b[] f21689l;
    public b f21690m;
    public List<q4.b> f21691n;
    public List<q4.b> f21692o;
    public C0206c f21693p;
    public int f21694q;

    public static final class a {
        public static final Comparator<a> f21695c = r4.b.f21683a;
        public final q4.b f21696a;
        public final int f21697b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0195b n10 = new b.C0195b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f21696a = n10.a();
            this.f21697b = i14;
        }

        public static int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f21697b, aVar.f21697b);
        }
    }

    public static final class b {
        public static final int[] D;
        public static final int[] G;
        public static final int f21699x;
        public static final int f21700y;
        public final List<SpannableString> f21702a = new ArrayList();
        public final SpannableStringBuilder f21703b = new SpannableStringBuilder();
        public boolean f21704c;
        public boolean f21705d;
        public int f21706e;
        public boolean f21707f;
        public int f21708g;
        public int f21709h;
        public int f21710i;
        public int f21711j;
        public boolean f21712k;
        public int f21713l;
        public int f21714m;
        public int f21715n;
        public int f21716o;
        public int f21717p;
        public int f21718q;
        public int f21719r;
        public int f21720s;
        public int f21721t;
        public int f21722u;
        public int f21723v;
        public static final int f21698w = h(2, 2, 2, 0);
        public static final int[] f21701z = {0, 0, 0, 0, 0, 2, 0};
        public static final int[] A = {0, 0, 0, 0, 0, 0, 2};
        public static final int[] B = {3, 3, 3, 3, 3, 3, 1};
        public static final boolean[] C = {false, false, false, true, true, true, false};
        public static final int[] E = {0, 1, 2, 3, 4, 3, 4};
        public static final int[] F = {0, 0, 0, 0, 0, 3, 3};

        static {
            int h10 = h(0, 0, 0, 0);
            f21699x = h10;
            int h11 = h(0, 0, 0, 3);
            f21700y = h11;
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        public static int h(int r4, int r5, int r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: r4.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == '\n') {
                this.f21702a.add(d());
                this.f21703b.clear();
                if (this.f21717p != -1) {
                    this.f21717p = 0;
                }
                if (this.f21718q != -1) {
                    this.f21718q = 0;
                }
                if (this.f21719r != -1) {
                    this.f21719r = 0;
                }
                if (this.f21721t != -1) {
                    this.f21721t = 0;
                }
                while (true) {
                    if ((this.f21712k && this.f21702a.size() >= this.f21711j) || this.f21702a.size() >= 15) {
                        this.f21702a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f21703b.append(c10);
            }
        }

        public void b() {
            int length = this.f21703b.length();
            if (length > 0) {
                this.f21703b.delete(length - 1, length);
            }
        }

        public r4.c.a c() {
            throw new UnsupportedOperationException("Method not decompiled: r4.c.b.c():r4.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21703b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f21717p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f21717p, length, 33);
                }
                if (this.f21718q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f21718q, length, 33);
                }
                if (this.f21719r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f21720s), this.f21719r, length, 33);
                }
                if (this.f21721t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f21722u), this.f21721t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f21702a.clear();
            this.f21703b.clear();
            this.f21717p = -1;
            this.f21718q = -1;
            this.f21719r = -1;
            this.f21721t = -1;
            this.f21723v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f21704c = true;
            this.f21705d = z10;
            this.f21712k = z11;
            this.f21706e = i10;
            this.f21707f = z13;
            this.f21708g = i11;
            this.f21709h = i12;
            this.f21710i = i15;
            int i18 = i13 + 1;
            if (this.f21711j != i18) {
                this.f21711j = i18;
                while (true) {
                    if ((!z11 || this.f21702a.size() < this.f21711j) && this.f21702a.size() < 15) {
                        break;
                    }
                    this.f21702a.remove(0);
                }
            }
            if (!(i16 == 0 || this.f21714m == i16)) {
                this.f21714m = i16;
                int i19 = i16 - 1;
                q(D[i19], f21700y, C[i19], 0, A[i19], B[i19], f21701z[i19]);
            }
            if (i17 != 0 && this.f21715n != i17) {
                this.f21715n = i17;
                int i20 = i17 - 1;
                m(0, 1, 1, false, false, F[i20], E[i20]);
                n(f21698w, G[i20], f21699x);
            }
        }

        public boolean i() {
            return this.f21704c;
        }

        public boolean j() {
            return !i() || (this.f21702a.isEmpty() && this.f21703b.length() == 0);
        }

        public boolean k() {
            return this.f21705d;
        }

        public void l() {
            e();
            this.f21704c = false;
            this.f21705d = false;
            this.f21706e = 4;
            this.f21707f = false;
            this.f21708g = 0;
            this.f21709h = 0;
            this.f21710i = 0;
            this.f21711j = 15;
            this.f21712k = true;
            this.f21713l = 0;
            this.f21714m = 0;
            this.f21715n = 0;
            int i10 = f21699x;
            this.f21716o = i10;
            this.f21720s = f21698w;
            this.f21722u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f21717p != -1) {
                if (!z10) {
                    this.f21703b.setSpan(new StyleSpan(2), this.f21717p, this.f21703b.length(), 33);
                    this.f21717p = -1;
                }
            } else if (z10) {
                this.f21717p = this.f21703b.length();
            }
            if (this.f21718q != -1) {
                if (!z11) {
                    this.f21703b.setSpan(new UnderlineSpan(), this.f21718q, this.f21703b.length(), 33);
                    this.f21718q = -1;
                }
            } else if (z11) {
                this.f21718q = this.f21703b.length();
            }
        }

        public void n(int i10, int i11, int i12) {
            if (!(this.f21719r == -1 || this.f21720s == i10)) {
                this.f21703b.setSpan(new ForegroundColorSpan(this.f21720s), this.f21719r, this.f21703b.length(), 33);
            }
            if (i10 != f21698w) {
                this.f21719r = this.f21703b.length();
                this.f21720s = i10;
            }
            if (!(this.f21721t == -1 || this.f21722u == i11)) {
                this.f21703b.setSpan(new BackgroundColorSpan(this.f21722u), this.f21721t, this.f21703b.length(), 33);
            }
            if (i11 != f21699x) {
                this.f21721t = this.f21703b.length();
                this.f21722u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f21723v != i10) {
                a('\n');
            }
            this.f21723v = i10;
        }

        public void p(boolean z10) {
            this.f21705d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f21716o = i10;
            this.f21713l = i15;
        }
    }

    public static final class C0206c {
        public final int f21724a;
        public final int f21725b;
        public final byte[] f21726c;
        public int f21727d = 0;

        public C0206c(int i10, int i11) {
            this.f21724a = i10;
            this.f21725b = i11;
            this.f21726c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f21688k = i10 == -1 ? 1 : i10;
        this.f21687j = (list == null || !e.f(list)) ? false : z10;
        this.f21689l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f21689l[i11] = new b();
        }
        this.f21690m = this.f21689l[0];
    }

    public final void A(int i10) {
        if (i10 == 160) {
            this.f21690m.a((char) 13252);
            return;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid G3 character: ");
        sb2.append(i10);
        s.i("Cea708Decoder", sb2.toString());
        this.f21690m.a('_');
    }

    public final void B() {
        this.f21690m.m(this.f21685h.h(4), this.f21685h.h(2), this.f21685h.h(2), this.f21685h.g(), this.f21685h.g(), this.f21685h.h(3), this.f21685h.h(3));
    }

    public final void C() {
        int h10 = b.h(this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2));
        int h11 = b.h(this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2));
        this.f21685h.r(2);
        this.f21690m.n(h10, h11, b.g(this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2)));
    }

    public final void D() {
        this.f21685h.r(4);
        int h10 = this.f21685h.h(4);
        this.f21685h.r(2);
        this.f21690m.o(h10, this.f21685h.h(6));
    }

    public final void E() {
        int h10 = b.h(this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2));
        int h11 = this.f21685h.h(2);
        int g10 = b.g(this.f21685h.h(2), this.f21685h.h(2), this.f21685h.h(2));
        if (this.f21685h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f21685h.g();
        int h12 = this.f21685h.h(2);
        int h13 = this.f21685h.h(2);
        int h14 = this.f21685h.h(2);
        this.f21685h.r(8);
        this.f21690m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    public final void F() {
        C0206c cVar = this.f21693p;
        int i10 = cVar.f21727d;
        int i11 = cVar.f21725b;
        if (i10 != (i11 * 2) - 1) {
            int i12 = cVar.f21724a;
            StringBuilder sb2 = new StringBuilder((int) j.G0);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i11 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i10);
            sb2.append(" (sequence number ");
            sb2.append(i12);
            sb2.append(");");
            s.b("Cea708Decoder", sb2.toString());
        }
        a0 a0Var = this.f21685h;
        C0206c cVar2 = this.f21693p;
        a0Var.o(cVar2.f21726c, cVar2.f21727d);
        int h10 = this.f21685h.h(3);
        int h11 = this.f21685h.h(5);
        if (h10 == 7) {
            this.f21685h.r(2);
            h10 = this.f21685h.h(6);
            if (h10 < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(h10);
                s.i("Cea708Decoder", sb3.toString());
            }
        }
        if (h11 == 0) {
            if (h10 != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(h10);
                sb4.append(") when blockSize is 0");
                s.i("Cea708Decoder", sb4.toString());
            }
        } else if (h10 == this.f21688k) {
            boolean z10 = false;
            int e10 = this.f21685h.e() + (h11 * 8);
            while (this.f21685h.b() > 0 && this.f21685h.e() < e10) {
                int h12 = this.f21685h.h(8);
                if (h12 == 16) {
                    int h13 = this.f21685h.h(8);
                    if (h13 <= 31) {
                        u(h13);
                    } else {
                        if (h13 <= 127) {
                            z(h13);
                        } else if (h13 <= 159) {
                            v(h13);
                        } else if (h13 <= 255) {
                            A(h13);
                        } else {
                            StringBuilder sb5 = new StringBuilder(37);
                            sb5.append("Invalid extended command: ");
                            sb5.append(h13);
                            s.i("Cea708Decoder", sb5.toString());
                        }
                        z10 = true;
                    }
                } else if (h12 <= 31) {
                    s(h12);
                } else {
                    if (h12 <= 127) {
                        x(h12);
                    } else if (h12 <= 159) {
                        t(h12);
                    } else if (h12 <= 255) {
                        y(h12);
                    } else {
                        StringBuilder sb6 = new StringBuilder(33);
                        sb6.append("Invalid base command: ");
                        sb6.append(h12);
                        s.i("Cea708Decoder", sb6.toString());
                    }
                    z10 = true;
                }
            }
            if (z10) {
                this.f21691n = r();
            }
        }
    }

    public final void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f21689l[i10].l();
        }
    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public String b() {
        return "Cea708Decoder";
    }

    @Override
    public void c(long j10) {
        super.c(j10);
    }

    @Override
    public void flush() {
        super.flush();
        this.f21691n = null;
        this.f21692o = null;
        this.f21694q = 0;
        this.f21690m = this.f21689l[0];
        G();
        this.f21693p = null;
    }

    @Override
    public f g() {
        List<q4.b> list = this.f21691n;
        this.f21692o = list;
        return new f((List) c5.a.e(list));
    }

    @Override
    public void h(q4.j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) c5.a.e(jVar.f20488c);
        this.f21684g.N(byteBuffer.array(), byteBuffer.limit());
        while (this.f21684g.a() >= 3) {
            int D = this.f21684g.D() & 7;
            int i10 = D & 3;
            boolean z10 = false;
            boolean z11 = (D & 4) == 4;
            byte D2 = (byte) this.f21684g.D();
            byte D3 = (byte) this.f21684g.D();
            if (i10 == 2 || i10 == 3) {
                if (z11) {
                    if (i10 == 3) {
                        q();
                        int i11 = (D2 & 192) >> 6;
                        int i12 = this.f21686i;
                        if (!(i12 == -1 || i11 == (i12 + 1) % 4)) {
                            G();
                            int i13 = this.f21686i;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i13);
                            sb2.append(" current=");
                            sb2.append(i11);
                            s.i("Cea708Decoder", sb2.toString());
                        }
                        this.f21686i = i11;
                        int i14 = D2 & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        C0206c cVar = new C0206c(i11, i14);
                        this.f21693p = cVar;
                        byte[] bArr = cVar.f21726c;
                        int i15 = cVar.f21727d;
                        cVar.f21727d = i15 + 1;
                        bArr[i15] = D3;
                    } else {
                        if (i10 == 2) {
                            z10 = true;
                        }
                        c5.a.a(z10);
                        C0206c cVar2 = this.f21693p;
                        if (cVar2 == null) {
                            s.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f21726c;
                            int i16 = cVar2.f21727d;
                            int i17 = i16 + 1;
                            cVar2.f21727d = i17;
                            bArr2[i16] = D2;
                            cVar2.f21727d = i17 + 1;
                            bArr2[i17] = D3;
                        }
                    }
                    C0206c cVar3 = this.f21693p;
                    if (cVar3.f21727d == (cVar3.f21725b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override
    public q4.j i() {
        return super.e();
    }

    @Override
    public k j() {
        return super.d();
    }

    @Override
    public boolean m() {
        return this.f21691n != this.f21692o;
    }

    @Override
    public void n(q4.j jVar) {
        super.f(jVar);
    }

    public final void q() {
        if (this.f21693p != null) {
            F();
            this.f21693p = null;
        }
    }

    public final List<q4.b> r() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f21689l[i10].j() && this.f21689l[i10].k() && (c10 = this.f21689l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f21695c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f21696a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void s(int i10) {
        if (i10 == 0) {
            return;
        }
        if (i10 == 3) {
            this.f21691n = r();
        } else if (i10 != 8) {
            switch (i10) {
                case 12:
                    G();
                    return;
                case 13:
                    this.f21690m.a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb2.append(i10);
                        s.i("Cea708Decoder", sb2.toString());
                        this.f21685h.r(8);
                        return;
                    } else if (i10 < 24 || i10 > 31) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Invalid C0 command: ");
                        sb3.append(i10);
                        s.i("Cea708Decoder", sb3.toString());
                        return;
                    } else {
                        StringBuilder sb4 = new StringBuilder(54);
                        sb4.append("Currently unsupported COMMAND_P16 Command: ");
                        sb4.append(i10);
                        s.i("Cea708Decoder", sb4.toString());
                        this.f21685h.r(16);
                        return;
                    }
            }
        } else {
            this.f21690m.b();
        }
    }

    public final void t(int i10) {
        b bVar;
        int i11 = 1;
        switch (i10) {
            case Log.TAG_YOUTUBE:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f21694q != i12) {
                    this.f21694q = i12;
                    this.f21690m = this.f21689l[i12];
                    return;
                }
                return;
            case 136:
                while (i11 <= 8) {
                    if (this.f21685h.g()) {
                        this.f21689l[8 - i11].e();
                    }
                    i11++;
                }
                return;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f21685h.g()) {
                        this.f21689l[8 - i13].p(true);
                    }
                }
                return;
            case 138:
                while (i11 <= 8) {
                    if (this.f21685h.g()) {
                        this.f21689l[8 - i11].p(false);
                    }
                    i11++;
                }
                return;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f21685h.g()) {
                        this.f21689l[8 - i14].p(!bVar.k());
                    }
                }
                return;
            case 140:
                while (i11 <= 8) {
                    if (this.f21685h.g()) {
                        this.f21689l[8 - i11].l();
                    }
                    i11++;
                }
                return;
            case 141:
                this.f21685h.r(8);
                return;
            case 142:
                return;
            case 143:
                G();
                return;
            case 144:
                if (!this.f21690m.i()) {
                    this.f21685h.r(16);
                    return;
                } else {
                    B();
                    return;
                }
            case 145:
                if (!this.f21690m.i()) {
                    this.f21685h.r(24);
                    return;
                } else {
                    C();
                    return;
                }
            case 146:
                if (!this.f21690m.i()) {
                    this.f21685h.r(16);
                    return;
                } else {
                    D();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid C1 command: ");
                sb2.append(i10);
                s.i("Cea708Decoder", sb2.toString());
                return;
            case 151:
                if (!this.f21690m.i()) {
                    this.f21685h.r(32);
                    return;
                } else {
                    E();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                w(i15);
                if (this.f21694q != i15) {
                    this.f21694q = i15;
                    this.f21690m = this.f21689l[i15];
                    return;
                }
                return;
        }
    }

    public final void u(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f21685h.r(8);
            } else if (i10 <= 23) {
                this.f21685h.r(16);
            } else if (i10 <= 31) {
                this.f21685h.r(24);
            }
        }
    }

    public final void v(int i10) {
        if (i10 <= 135) {
            this.f21685h.r(32);
        } else if (i10 <= 143) {
            this.f21685h.r(40);
        } else if (i10 <= 159) {
            this.f21685h.r(2);
            this.f21685h.r(this.f21685h.h(6) * 8);
        }
    }

    public final void w(int i10) {
        b bVar = this.f21689l[i10];
        this.f21685h.r(2);
        boolean g10 = this.f21685h.g();
        boolean g11 = this.f21685h.g();
        boolean g12 = this.f21685h.g();
        int h10 = this.f21685h.h(3);
        boolean g13 = this.f21685h.g();
        int h11 = this.f21685h.h(7);
        int h12 = this.f21685h.h(8);
        int h13 = this.f21685h.h(4);
        int h14 = this.f21685h.h(4);
        this.f21685h.r(2);
        int h15 = this.f21685h.h(6);
        this.f21685h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f21685h.h(3), this.f21685h.h(3));
    }

    public final void x(int i10) {
        if (i10 == 127) {
            this.f21690m.a((char) 9835);
        } else {
            this.f21690m.a((char) (i10 & 255));
        }
    }

    public final void y(int i10) {
        this.f21690m.a((char) (i10 & 255));
    }

    public final void z(int i10) {
        if (i10 == 32) {
            this.f21690m.a(' ');
        } else if (i10 == 33) {
            this.f21690m.a((char) 160);
        } else if (i10 == 37) {
            this.f21690m.a((char) 8230);
        } else if (i10 == 42) {
            this.f21690m.a((char) 352);
        } else if (i10 == 44) {
            this.f21690m.a((char) 338);
        } else if (i10 == 63) {
            this.f21690m.a((char) 376);
        } else if (i10 == 57) {
            this.f21690m.a((char) 8482);
        } else if (i10 == 58) {
            this.f21690m.a((char) 353);
        } else if (i10 == 60) {
            this.f21690m.a((char) 339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f21690m.a((char) 9608);
                    return;
                case 49:
                    this.f21690m.a((char) 8216);
                    return;
                case 50:
                    this.f21690m.a((char) 8217);
                    return;
                case 51:
                    this.f21690m.a((char) 8220);
                    return;
                case 52:
                    this.f21690m.a((char) 8221);
                    return;
                case 53:
                    this.f21690m.a((char) 8226);
                    return;
                default:
                    switch (i10) {
                        case j.J0:
                            this.f21690m.a((char) 8539);
                            return;
                        case j.K0:
                            this.f21690m.a((char) 8540);
                            return;
                        case j.L0:
                            this.f21690m.a((char) 8541);
                            return;
                        case j.M0:
                            this.f21690m.a((char) 8542);
                            return;
                        case j.N0:
                            this.f21690m.a((char) 9474);
                            return;
                        case j.O0:
                            this.f21690m.a((char) 9488);
                            return;
                        case j.P0:
                            this.f21690m.a((char) 9492);
                            return;
                        case 125:
                            this.f21690m.a((char) 9472);
                            return;
                        case 126:
                            this.f21690m.a((char) 9496);
                            return;
                        case 127:
                            this.f21690m.a((char) 9484);
                            return;
                        default:
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Invalid G2 character: ");
                            sb2.append(i10);
                            s.i("Cea708Decoder", sb2.toString());
                            return;
                    }
            }
        } else {
            this.f21690m.a((char) 8480);
        }
    }
}
