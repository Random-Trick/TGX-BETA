package p231q4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1194e;
import p020b5.C1230s;
import p039d.C3563j;
import p217p4.AbstractC8041f;
import p217p4.AbstractC8047k;
import p217p4.C8032b;
import p217p4.C8046j;

public final class C8231c extends AbstractC8236e {
    public final C1189b0 f26636g = new C1189b0();
    public final C1187a0 f26637h = new C1187a0();
    public int f26638i = -1;
    public final boolean f26639j;
    public final int f26640k;
    public final C8233b[] f26641l;
    public C8233b f26642m;
    public List<C8032b> f26643n;
    public List<C8032b> f26644o;
    public C8234c f26645p;
    public int f26646q;

    public static final class C8232a {
        public static final Comparator<C8232a> f26647c = C8230b.f26635a;
        public final C8032b f26648a;
        public final int f26649b;

        public C8232a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C8032b.C8034b n = new C8032b.C8034b().m13742o(charSequence).m13741p(alignment).m13749h(f, i).m13748i(i2).m13746k(f2).m13745l(i3).m13743n(f3);
            if (z) {
                n.m13738s(i4);
            }
            this.f26648a = n.m13756a();
            this.f26649b = i5;
        }

        public static int m13092c(C8232a aVar, C8232a aVar2) {
            return Integer.compare(aVar2.f26649b, aVar.f26649b);
        }
    }

    public static final class C8233b {
        public static final int[] f26653D;
        public static final int[] f26656G;
        public static final int f26658x;
        public static final int f26659y;
        public final List<SpannableString> f26661a = new ArrayList();
        public final SpannableStringBuilder f26662b = new SpannableStringBuilder();
        public boolean f26663c;
        public boolean f26664d;
        public int f26665e;
        public boolean f26666f;
        public int f26667g;
        public int f26668h;
        public int f26669i;
        public int f26670j;
        public boolean f26671k;
        public int f26672l;
        public int f26673m;
        public int f26674n;
        public int f26675o;
        public int f26676p;
        public int f26677q;
        public int f26678r;
        public int f26679s;
        public int f26680t;
        public int f26681u;
        public int f26682v;
        public static final int f26657w = m13084h(2, 2, 2, 0);
        public static final int[] f26660z = {0, 0, 0, 0, 0, 2, 0};
        public static final int[] f26650A = {0, 0, 0, 0, 0, 0, 2};
        public static final int[] f26651B = {3, 3, 3, 3, 3, 3, 1};
        public static final boolean[] f26652C = {false, false, false, true, true, true, false};
        public static final int[] f26654E = {0, 1, 2, 3, 4, 3, 4};
        public static final int[] f26655F = {0, 0, 0, 0, 0, 3, 3};

        static {
            int h = m13084h(0, 0, 0, 0);
            f26658x = h;
            int h2 = m13084h(0, 0, 0, 3);
            f26659y = h2;
            f26653D = new int[]{h, h2, h, h, h2, h, h};
            f26656G = new int[]{h, h, h, h, h, h2, h2};
        }

        public C8233b() {
            m13080l();
        }

        public static int m13085g(int i, int i2, int i3) {
            return m13084h(i, i2, i3, 0);
        }

        public static int m13084h(int r4, int r5, int r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: p231q4.C8231c.C8233b.m13084h(int, int, int, int):int");
        }

        public void m13091a(char c) {
            if (c == '\n') {
                this.f26661a.add(m13088d());
                this.f26662b.clear();
                if (this.f26676p != -1) {
                    this.f26676p = 0;
                }
                if (this.f26677q != -1) {
                    this.f26677q = 0;
                }
                if (this.f26678r != -1) {
                    this.f26678r = 0;
                }
                if (this.f26680t != -1) {
                    this.f26680t = 0;
                }
                while (true) {
                    if ((this.f26671k && this.f26661a.size() >= this.f26670j) || this.f26661a.size() >= 15) {
                        this.f26661a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f26662b.append(c);
            }
        }

        public void m13090b() {
            int length = this.f26662b.length();
            if (length > 0) {
                this.f26662b.delete(length - 1, length);
            }
        }

        public p231q4.C8231c.C8232a m13089c() {
            throw new UnsupportedOperationException("Method not decompiled: p231q4.C8231c.C8233b.m13089c():q4.c$a");
        }

        public SpannableString m13088d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f26662b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f26676p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f26676p, length, 33);
                }
                if (this.f26677q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f26677q, length, 33);
                }
                if (this.f26678r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f26679s), this.f26678r, length, 33);
                }
                if (this.f26680t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f26681u), this.f26680t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void m13087e() {
            this.f26661a.clear();
            this.f26662b.clear();
            this.f26676p = -1;
            this.f26677q = -1;
            this.f26678r = -1;
            this.f26680t = -1;
            this.f26682v = 0;
        }

        public void m13086f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f26663c = true;
            this.f26664d = z;
            this.f26671k = z2;
            this.f26665e = i;
            this.f26666f = z4;
            this.f26667g = i2;
            this.f26668h = i3;
            this.f26669i = i6;
            int i9 = i4 + 1;
            if (this.f26670j != i9) {
                this.f26670j = i9;
                while (true) {
                    if ((!z2 || this.f26661a.size() < this.f26670j) && this.f26661a.size() < 15) {
                        break;
                    }
                    this.f26661a.remove(0);
                }
            }
            if (!(i7 == 0 || this.f26673m == i7)) {
                this.f26673m = i7;
                int i10 = i7 - 1;
                m13075q(f26653D[i10], f26659y, f26652C[i10], 0, f26650A[i10], f26651B[i10], f26660z[i10]);
            }
            if (i8 != 0 && this.f26674n != i8) {
                this.f26674n = i8;
                int i11 = i8 - 1;
                m13079m(0, 1, 1, false, false, f26655F[i11], f26654E[i11]);
                m13078n(f26657w, f26656G[i11], f26658x);
            }
        }

        public boolean m13083i() {
            return this.f26663c;
        }

        public boolean m13082j() {
            return !m13083i() || (this.f26661a.isEmpty() && this.f26662b.length() == 0);
        }

        public boolean m13081k() {
            return this.f26664d;
        }

        public void m13080l() {
            m13087e();
            this.f26663c = false;
            this.f26664d = false;
            this.f26665e = 4;
            this.f26666f = false;
            this.f26667g = 0;
            this.f26668h = 0;
            this.f26669i = 0;
            this.f26670j = 15;
            this.f26671k = true;
            this.f26672l = 0;
            this.f26673m = 0;
            this.f26674n = 0;
            int i = f26658x;
            this.f26675o = i;
            this.f26679s = f26657w;
            this.f26681u = i;
        }

        public void m13079m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f26676p != -1) {
                if (!z) {
                    this.f26662b.setSpan(new StyleSpan(2), this.f26676p, this.f26662b.length(), 33);
                    this.f26676p = -1;
                }
            } else if (z) {
                this.f26676p = this.f26662b.length();
            }
            if (this.f26677q != -1) {
                if (!z2) {
                    this.f26662b.setSpan(new UnderlineSpan(), this.f26677q, this.f26662b.length(), 33);
                    this.f26677q = -1;
                }
            } else if (z2) {
                this.f26677q = this.f26662b.length();
            }
        }

        public void m13078n(int i, int i2, int i3) {
            if (!(this.f26678r == -1 || this.f26679s == i)) {
                this.f26662b.setSpan(new ForegroundColorSpan(this.f26679s), this.f26678r, this.f26662b.length(), 33);
            }
            if (i != f26657w) {
                this.f26678r = this.f26662b.length();
                this.f26679s = i;
            }
            if (!(this.f26680t == -1 || this.f26681u == i2)) {
                this.f26662b.setSpan(new BackgroundColorSpan(this.f26681u), this.f26680t, this.f26662b.length(), 33);
            }
            if (i2 != f26658x) {
                this.f26680t = this.f26662b.length();
                this.f26681u = i2;
            }
        }

        public void m13077o(int i, int i2) {
            if (this.f26682v != i) {
                m13091a('\n');
            }
            this.f26682v = i;
        }

        public void m13076p(boolean z) {
            this.f26664d = z;
        }

        public void m13075q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f26675o = i;
            this.f26672l = i6;
        }
    }

    public static final class C8234c {
        public final int f26683a;
        public final int f26684b;
        public final byte[] f26685c;
        public int f26686d = 0;

        public C8234c(int i, int i2) {
            this.f26683a = i;
            this.f26684b = i2;
            this.f26685c = new byte[(i2 * 2) - 1];
        }
    }

    public C8231c(int i, List<byte[]> list) {
        boolean z = true;
        this.f26640k = i == -1 ? 1 : i;
        this.f26639j = (list == null || !C1194e.m38094f(list)) ? false : z;
        this.f26641l = new C8233b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f26641l[i2] = new C8233b();
        }
        this.f26642m = this.f26641l[0];
    }

    public final void m13112A(int i) {
        if (i == 160) {
            this.f26642m.m13091a((char) 13252);
            return;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid G3 character: ");
        sb2.append(i);
        C1230s.m37884i("Cea708Decoder", sb2.toString());
        this.f26642m.m13091a('_');
    }

    public final void m13111B() {
        this.f26642m.m13079m(this.f26637h.m38176h(4), this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38177g(), this.f26637h.m38177g(), this.f26637h.m38176h(3), this.f26637h.m38176h(3));
    }

    public final void m13110C() {
        int h = C8233b.m13084h(this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2));
        int h2 = C8233b.m13084h(this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2));
        this.f26637h.m38166r(2);
        this.f26642m.m13078n(h, h2, C8233b.m13085g(this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2)));
    }

    public final void m13109D() {
        this.f26637h.m38166r(4);
        int h = this.f26637h.m38176h(4);
        this.f26637h.m38166r(2);
        this.f26642m.m13077o(h, this.f26637h.m38176h(6));
    }

    public final void m13108E() {
        int h = C8233b.m13084h(this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2));
        int h2 = this.f26637h.m38176h(2);
        int g = C8233b.m13085g(this.f26637h.m38176h(2), this.f26637h.m38176h(2), this.f26637h.m38176h(2));
        if (this.f26637h.m38177g()) {
            h2 |= 4;
        }
        boolean g2 = this.f26637h.m38177g();
        int h3 = this.f26637h.m38176h(2);
        int h4 = this.f26637h.m38176h(2);
        int h5 = this.f26637h.m38176h(2);
        this.f26637h.m38166r(8);
        this.f26642m.m13075q(h, g, g2, h2, h3, h4, h5);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    public final void m13107F() {
        C8234c cVar = this.f26645p;
        int i = cVar.f26686d;
        int i2 = cVar.f26684b;
        if (i != (i2 * 2) - 1) {
            int i3 = cVar.f26683a;
            StringBuilder sb2 = new StringBuilder((int) C3563j.f11932G0);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i2 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i);
            sb2.append(" (sequence number ");
            sb2.append(i3);
            sb2.append(");");
            C1230s.m37891b("Cea708Decoder", sb2.toString());
        }
        C1187a0 a0Var = this.f26637h;
        C8234c cVar2 = this.f26645p;
        a0Var.m38169o(cVar2.f26685c, cVar2.f26686d);
        int h = this.f26637h.m38176h(3);
        int h2 = this.f26637h.m38176h(5);
        if (h == 7) {
            this.f26637h.m38166r(2);
            h = this.f26637h.m38176h(6);
            if (h < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(h);
                C1230s.m37884i("Cea708Decoder", sb3.toString());
            }
        }
        if (h2 == 0) {
            if (h != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(h);
                sb4.append(") when blockSize is 0");
                C1230s.m37884i("Cea708Decoder", sb4.toString());
            }
        } else if (h == this.f26640k) {
            boolean z = false;
            while (this.f26637h.m38182b() > 0) {
                int h3 = this.f26637h.m38176h(8);
                if (h3 == 16) {
                    int h4 = this.f26637h.m38176h(8);
                    if (h4 <= 31) {
                        m13100u(h4);
                    } else {
                        if (h4 <= 127) {
                            m13095z(h4);
                        } else if (h4 <= 159) {
                            m13099v(h4);
                        } else if (h4 <= 255) {
                            m13112A(h4);
                        } else {
                            StringBuilder sb5 = new StringBuilder(37);
                            sb5.append("Invalid extended command: ");
                            sb5.append(h4);
                            C1230s.m37884i("Cea708Decoder", sb5.toString());
                        }
                        z = true;
                    }
                } else if (h3 <= 31) {
                    m13102s(h3);
                } else {
                    if (h3 <= 127) {
                        m13097x(h3);
                    } else if (h3 <= 159) {
                        m13101t(h3);
                    } else if (h3 <= 255) {
                        m13096y(h3);
                    } else {
                        StringBuilder sb6 = new StringBuilder(33);
                        sb6.append("Invalid base command: ");
                        sb6.append(h3);
                        C1230s.m37884i("Cea708Decoder", sb6.toString());
                    }
                    z = true;
                }
            }
            if (z) {
                this.f26643n = m13103r();
            }
        }
    }

    public final void m13106G() {
        for (int i = 0; i < 8; i++) {
            this.f26641l[i].m13080l();
        }
    }

    @Override
    public void mo13074a() {
        super.mo13074a();
    }

    @Override
    public String mo13105b() {
        return "Cea708Decoder";
    }

    @Override
    public void mo13073c(long j) {
        super.mo13073c(j);
    }

    @Override
    public void flush() {
        super.flush();
        this.f26643n = null;
        this.f26644o = null;
        this.f26646q = 0;
        this.f26642m = this.f26641l[0];
        m13106G();
        this.f26645p = null;
    }

    @Override
    public AbstractC8041f mo13069g() {
        List<C8032b> list = this.f26643n;
        this.f26644o = list;
        return new C8240f((List) C1186a.m38188e(list));
    }

    @Override
    public void mo13068h(C8046j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C1186a.m38188e(jVar.f26135c);
        this.f26636g.m38149N(byteBuffer.array(), byteBuffer.limit());
        while (this.f26636g.m38145a() >= 3) {
            int D = this.f26636g.m38159D() & 7;
            int i = D & 3;
            boolean z = false;
            boolean z2 = (D & 4) == 4;
            byte D2 = (byte) this.f26636g.m38159D();
            byte D3 = (byte) this.f26636g.m38159D();
            if (i == 2 || i == 3) {
                if (z2) {
                    if (i == 3) {
                        m13104q();
                        int i2 = (D2 & 192) >> 6;
                        int i3 = this.f26638i;
                        if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                            m13106G();
                            int i4 = this.f26638i;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i4);
                            sb2.append(" current=");
                            sb2.append(i2);
                            C1230s.m37884i("Cea708Decoder", sb2.toString());
                        }
                        this.f26638i = i2;
                        int i5 = D2 & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        C8234c cVar = new C8234c(i2, i5);
                        this.f26645p = cVar;
                        byte[] bArr = cVar.f26685c;
                        int i6 = cVar.f26686d;
                        cVar.f26686d = i6 + 1;
                        bArr[i6] = D3;
                    } else {
                        if (i == 2) {
                            z = true;
                        }
                        C1186a.m38192a(z);
                        C8234c cVar2 = this.f26645p;
                        if (cVar2 == null) {
                            C1230s.m37890c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f26685c;
                            int i7 = cVar2.f26686d;
                            int i8 = i7 + 1;
                            cVar2.f26686d = i8;
                            bArr2[i7] = D2;
                            cVar2.f26686d = i8 + 1;
                            bArr2[i8] = D3;
                        }
                    }
                    C8234c cVar3 = this.f26645p;
                    if (cVar3.f26686d == (cVar3.f26684b * 2) - 1) {
                        m13104q();
                    }
                }
            }
        }
    }

    @Override
    public C8046j mo13067i() {
        return super.mo13071e();
    }

    @Override
    public AbstractC8047k mo13066j() {
        return super.mo13072d();
    }

    @Override
    public boolean mo13063m() {
        return this.f26643n != this.f26644o;
    }

    @Override
    public void mo13062n(C8046j jVar) {
        super.mo13070f(jVar);
    }

    public final void m13104q() {
        if (this.f26645p != null) {
            m13107F();
            this.f26645p = null;
        }
    }

    public final List<C8032b> m13103r() {
        C8232a c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f26641l[i].m13082j() && this.f26641l[i].m13081k() && (c = this.f26641l[i].m13089c()) != null) {
                arrayList.add(c);
            }
        }
        Collections.sort(arrayList, C8232a.f26647c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C8232a) arrayList.get(i2)).f26648a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void m13102s(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f26643n = m13103r();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m13106G();
                    return;
                case 13:
                    this.f26642m.m13091a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb2.append(i);
                        C1230s.m37884i("Cea708Decoder", sb2.toString());
                        this.f26637h.m38166r(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Invalid C0 command: ");
                        sb3.append(i);
                        C1230s.m37884i("Cea708Decoder", sb3.toString());
                        return;
                    } else {
                        StringBuilder sb4 = new StringBuilder(54);
                        sb4.append("Currently unsupported COMMAND_P16 Command: ");
                        sb4.append(i);
                        C1230s.m37884i("Cea708Decoder", sb4.toString());
                        this.f26637h.m38166r(16);
                        return;
                    }
            }
        } else {
            this.f26642m.m13090b();
        }
    }

    public final void m13101t(int i) {
        C8233b bVar;
        int i2 = 1;
        switch (i) {
            case Log.TAG_YOUTUBE:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.f26646q != i3) {
                    this.f26646q = i3;
                    this.f26642m = this.f26641l[i3];
                    return;
                }
                return;
            case 136:
                while (i2 <= 8) {
                    if (this.f26637h.m38177g()) {
                        this.f26641l[8 - i2].m13087e();
                    }
                    i2++;
                }
                return;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f26637h.m38177g()) {
                        this.f26641l[8 - i4].m13076p(true);
                    }
                }
                return;
            case 138:
                while (i2 <= 8) {
                    if (this.f26637h.m38177g()) {
                        this.f26641l[8 - i2].m13076p(false);
                    }
                    i2++;
                }
                return;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f26637h.m38177g()) {
                        this.f26641l[8 - i5].m13076p(!bVar.m13081k());
                    }
                }
                return;
            case 140:
                while (i2 <= 8) {
                    if (this.f26637h.m38177g()) {
                        this.f26641l[8 - i2].m13080l();
                    }
                    i2++;
                }
                return;
            case 141:
                this.f26637h.m38166r(8);
                return;
            case 142:
                return;
            case 143:
                m13106G();
                return;
            case 144:
                if (!this.f26642m.m13083i()) {
                    this.f26637h.m38166r(16);
                    return;
                } else {
                    m13111B();
                    return;
                }
            case 145:
                if (!this.f26642m.m13083i()) {
                    this.f26637h.m38166r(24);
                    return;
                } else {
                    m13110C();
                    return;
                }
            case 146:
                if (!this.f26642m.m13083i()) {
                    this.f26637h.m38166r(16);
                    return;
                } else {
                    m13109D();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid C1 command: ");
                sb2.append(i);
                C1230s.m37884i("Cea708Decoder", sb2.toString());
                return;
            case 151:
                if (!this.f26642m.m13083i()) {
                    this.f26637h.m38166r(32);
                    return;
                } else {
                    m13108E();
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
                int i6 = i - 152;
                m13098w(i6);
                if (this.f26646q != i6) {
                    this.f26646q = i6;
                    this.f26642m = this.f26641l[i6];
                    return;
                }
                return;
        }
    }

    public final void m13100u(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f26637h.m38166r(8);
            } else if (i <= 23) {
                this.f26637h.m38166r(16);
            } else if (i <= 31) {
                this.f26637h.m38166r(24);
            }
        }
    }

    public final void m13099v(int i) {
        if (i <= 135) {
            this.f26637h.m38166r(32);
        } else if (i <= 143) {
            this.f26637h.m38166r(40);
        } else if (i <= 159) {
            this.f26637h.m38166r(2);
            this.f26637h.m38166r(this.f26637h.m38176h(6) * 8);
        }
    }

    public final void m13098w(int i) {
        C8233b bVar = this.f26641l[i];
        this.f26637h.m38166r(2);
        boolean g = this.f26637h.m38177g();
        boolean g2 = this.f26637h.m38177g();
        boolean g3 = this.f26637h.m38177g();
        int h = this.f26637h.m38176h(3);
        boolean g4 = this.f26637h.m38177g();
        int h2 = this.f26637h.m38176h(7);
        int h3 = this.f26637h.m38176h(8);
        int h4 = this.f26637h.m38176h(4);
        int h5 = this.f26637h.m38176h(4);
        this.f26637h.m38166r(2);
        int h6 = this.f26637h.m38176h(6);
        this.f26637h.m38166r(2);
        bVar.m13086f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f26637h.m38176h(3), this.f26637h.m38176h(3));
    }

    public final void m13097x(int i) {
        if (i == 127) {
            this.f26642m.m13091a((char) 9835);
        } else {
            this.f26642m.m13091a((char) (i & 255));
        }
    }

    public final void m13096y(int i) {
        this.f26642m.m13091a((char) (i & 255));
    }

    public final void m13095z(int i) {
        if (i == 32) {
            this.f26642m.m13091a(' ');
        } else if (i == 33) {
            this.f26642m.m13091a((char) 160);
        } else if (i == 37) {
            this.f26642m.m13091a((char) 8230);
        } else if (i == 42) {
            this.f26642m.m13091a((char) 352);
        } else if (i == 44) {
            this.f26642m.m13091a((char) 338);
        } else if (i == 63) {
            this.f26642m.m13091a((char) 376);
        } else if (i == 57) {
            this.f26642m.m13091a((char) 8482);
        } else if (i == 58) {
            this.f26642m.m13091a((char) 353);
        } else if (i == 60) {
            this.f26642m.m13091a((char) 339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f26642m.m13091a((char) 9608);
                    return;
                case 49:
                    this.f26642m.m13091a((char) 8216);
                    return;
                case 50:
                    this.f26642m.m13091a((char) 8217);
                    return;
                case 51:
                    this.f26642m.m13091a((char) 8220);
                    return;
                case 52:
                    this.f26642m.m13091a((char) 8221);
                    return;
                case 53:
                    this.f26642m.m13091a((char) 8226);
                    return;
                default:
                    switch (i) {
                        case C3563j.f11947J0:
                            this.f26642m.m13091a((char) 8539);
                            return;
                        case C3563j.f11952K0:
                            this.f26642m.m13091a((char) 8540);
                            return;
                        case C3563j.f11957L0:
                            this.f26642m.m13091a((char) 8541);
                            return;
                        case C3563j.f11962M0:
                            this.f26642m.m13091a((char) 8542);
                            return;
                        case C3563j.f11967N0:
                            this.f26642m.m13091a((char) 9474);
                            return;
                        case C3563j.f11972O0:
                            this.f26642m.m13091a((char) 9488);
                            return;
                        case C3563j.f11977P0:
                            this.f26642m.m13091a((char) 9492);
                            return;
                        case 125:
                            this.f26642m.m13091a((char) 9472);
                            return;
                        case 126:
                            this.f26642m.m13091a((char) 9496);
                            return;
                        case 127:
                            this.f26642m.m13091a((char) 9484);
                            return;
                        default:
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Invalid G2 character: ");
                            sb2.append(i);
                            C1230s.m37884i("Cea708Decoder", sb2.toString());
                            return;
                    }
            }
        } else {
            this.f26642m.m13091a((char) 8480);
        }
    }
}
