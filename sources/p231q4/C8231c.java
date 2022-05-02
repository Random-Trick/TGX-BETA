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
    public final C1189b0 f26633g = new C1189b0();
    public final C1187a0 f26634h = new C1187a0();
    public int f26635i = -1;
    public final boolean f26636j;
    public final int f26637k;
    public final C8233b[] f26638l;
    public C8233b f26639m;
    public List<C8032b> f26640n;
    public List<C8032b> f26641o;
    public C8234c f26642p;
    public int f26643q;

    public static final class C8232a {
        public static final Comparator<C8232a> f26644c = C8230b.f26632a;
        public final C8032b f26645a;
        public final int f26646b;

        public C8232a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C8032b.C8034b n = new C8032b.C8034b().m13743o(charSequence).m13742p(alignment).m13750h(f, i).m13749i(i2).m13747k(f2).m13746l(i3).m13744n(f3);
            if (z) {
                n.m13739s(i4);
            }
            this.f26645a = n.m13757a();
            this.f26646b = i5;
        }

        public static int m13093c(C8232a aVar, C8232a aVar2) {
            return Integer.compare(aVar2.f26646b, aVar.f26646b);
        }
    }

    public static final class C8233b {
        public static final int[] f26650D;
        public static final int[] f26653G;
        public static final int f26655x;
        public static final int f26656y;
        public final List<SpannableString> f26658a = new ArrayList();
        public final SpannableStringBuilder f26659b = new SpannableStringBuilder();
        public boolean f26660c;
        public boolean f26661d;
        public int f26662e;
        public boolean f26663f;
        public int f26664g;
        public int f26665h;
        public int f26666i;
        public int f26667j;
        public boolean f26668k;
        public int f26669l;
        public int f26670m;
        public int f26671n;
        public int f26672o;
        public int f26673p;
        public int f26674q;
        public int f26675r;
        public int f26676s;
        public int f26677t;
        public int f26678u;
        public int f26679v;
        public static final int f26654w = m13085h(2, 2, 2, 0);
        public static final int[] f26657z = {0, 0, 0, 0, 0, 2, 0};
        public static final int[] f26647A = {0, 0, 0, 0, 0, 0, 2};
        public static final int[] f26648B = {3, 3, 3, 3, 3, 3, 1};
        public static final boolean[] f26649C = {false, false, false, true, true, true, false};
        public static final int[] f26651E = {0, 1, 2, 3, 4, 3, 4};
        public static final int[] f26652F = {0, 0, 0, 0, 0, 3, 3};

        static {
            int h = m13085h(0, 0, 0, 0);
            f26655x = h;
            int h2 = m13085h(0, 0, 0, 3);
            f26656y = h2;
            f26650D = new int[]{h, h2, h, h, h2, h, h};
            f26653G = new int[]{h, h, h, h, h, h2, h2};
        }

        public C8233b() {
            m13081l();
        }

        public static int m13086g(int i, int i2, int i3) {
            return m13085h(i, i2, i3, 0);
        }

        public static int m13085h(int r4, int r5, int r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: p231q4.C8231c.C8233b.m13085h(int, int, int, int):int");
        }

        public void m13092a(char c) {
            if (c == '\n') {
                this.f26658a.add(m13089d());
                this.f26659b.clear();
                if (this.f26673p != -1) {
                    this.f26673p = 0;
                }
                if (this.f26674q != -1) {
                    this.f26674q = 0;
                }
                if (this.f26675r != -1) {
                    this.f26675r = 0;
                }
                if (this.f26677t != -1) {
                    this.f26677t = 0;
                }
                while (true) {
                    if ((this.f26668k && this.f26658a.size() >= this.f26667j) || this.f26658a.size() >= 15) {
                        this.f26658a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f26659b.append(c);
            }
        }

        public void m13091b() {
            int length = this.f26659b.length();
            if (length > 0) {
                this.f26659b.delete(length - 1, length);
            }
        }

        public p231q4.C8231c.C8232a m13090c() {
            throw new UnsupportedOperationException("Method not decompiled: p231q4.C8231c.C8233b.m13090c():q4.c$a");
        }

        public SpannableString m13089d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f26659b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f26673p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f26673p, length, 33);
                }
                if (this.f26674q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f26674q, length, 33);
                }
                if (this.f26675r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f26676s), this.f26675r, length, 33);
                }
                if (this.f26677t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f26678u), this.f26677t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void m13088e() {
            this.f26658a.clear();
            this.f26659b.clear();
            this.f26673p = -1;
            this.f26674q = -1;
            this.f26675r = -1;
            this.f26677t = -1;
            this.f26679v = 0;
        }

        public void m13087f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f26660c = true;
            this.f26661d = z;
            this.f26668k = z2;
            this.f26662e = i;
            this.f26663f = z4;
            this.f26664g = i2;
            this.f26665h = i3;
            this.f26666i = i6;
            int i9 = i4 + 1;
            if (this.f26667j != i9) {
                this.f26667j = i9;
                while (true) {
                    if ((!z2 || this.f26658a.size() < this.f26667j) && this.f26658a.size() < 15) {
                        break;
                    }
                    this.f26658a.remove(0);
                }
            }
            if (!(i7 == 0 || this.f26670m == i7)) {
                this.f26670m = i7;
                int i10 = i7 - 1;
                m13076q(f26650D[i10], f26656y, f26649C[i10], 0, f26647A[i10], f26648B[i10], f26657z[i10]);
            }
            if (i8 != 0 && this.f26671n != i8) {
                this.f26671n = i8;
                int i11 = i8 - 1;
                m13080m(0, 1, 1, false, false, f26652F[i11], f26651E[i11]);
                m13079n(f26654w, f26653G[i11], f26655x);
            }
        }

        public boolean m13084i() {
            return this.f26660c;
        }

        public boolean m13083j() {
            return !m13084i() || (this.f26658a.isEmpty() && this.f26659b.length() == 0);
        }

        public boolean m13082k() {
            return this.f26661d;
        }

        public void m13081l() {
            m13088e();
            this.f26660c = false;
            this.f26661d = false;
            this.f26662e = 4;
            this.f26663f = false;
            this.f26664g = 0;
            this.f26665h = 0;
            this.f26666i = 0;
            this.f26667j = 15;
            this.f26668k = true;
            this.f26669l = 0;
            this.f26670m = 0;
            this.f26671n = 0;
            int i = f26655x;
            this.f26672o = i;
            this.f26676s = f26654w;
            this.f26678u = i;
        }

        public void m13080m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f26673p != -1) {
                if (!z) {
                    this.f26659b.setSpan(new StyleSpan(2), this.f26673p, this.f26659b.length(), 33);
                    this.f26673p = -1;
                }
            } else if (z) {
                this.f26673p = this.f26659b.length();
            }
            if (this.f26674q != -1) {
                if (!z2) {
                    this.f26659b.setSpan(new UnderlineSpan(), this.f26674q, this.f26659b.length(), 33);
                    this.f26674q = -1;
                }
            } else if (z2) {
                this.f26674q = this.f26659b.length();
            }
        }

        public void m13079n(int i, int i2, int i3) {
            if (!(this.f26675r == -1 || this.f26676s == i)) {
                this.f26659b.setSpan(new ForegroundColorSpan(this.f26676s), this.f26675r, this.f26659b.length(), 33);
            }
            if (i != f26654w) {
                this.f26675r = this.f26659b.length();
                this.f26676s = i;
            }
            if (!(this.f26677t == -1 || this.f26678u == i2)) {
                this.f26659b.setSpan(new BackgroundColorSpan(this.f26678u), this.f26677t, this.f26659b.length(), 33);
            }
            if (i2 != f26655x) {
                this.f26677t = this.f26659b.length();
                this.f26678u = i2;
            }
        }

        public void m13078o(int i, int i2) {
            if (this.f26679v != i) {
                m13092a('\n');
            }
            this.f26679v = i;
        }

        public void m13077p(boolean z) {
            this.f26661d = z;
        }

        public void m13076q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f26672o = i;
            this.f26669l = i6;
        }
    }

    public static final class C8234c {
        public final int f26680a;
        public final int f26681b;
        public final byte[] f26682c;
        public int f26683d = 0;

        public C8234c(int i, int i2) {
            this.f26680a = i;
            this.f26681b = i2;
            this.f26682c = new byte[(i2 * 2) - 1];
        }
    }

    public C8231c(int i, List<byte[]> list) {
        boolean z = true;
        this.f26637k = i == -1 ? 1 : i;
        this.f26636j = (list == null || !C1194e.m38091f(list)) ? false : z;
        this.f26638l = new C8233b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f26638l[i2] = new C8233b();
        }
        this.f26639m = this.f26638l[0];
    }

    public final void m13113A(int i) {
        if (i == 160) {
            this.f26639m.m13092a((char) 13252);
            return;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid G3 character: ");
        sb2.append(i);
        C1230s.m37881i("Cea708Decoder", sb2.toString());
        this.f26639m.m13092a('_');
    }

    public final void m13112B() {
        this.f26639m.m13080m(this.f26634h.m38173h(4), this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38174g(), this.f26634h.m38174g(), this.f26634h.m38173h(3), this.f26634h.m38173h(3));
    }

    public final void m13111C() {
        int h = C8233b.m13085h(this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2));
        int h2 = C8233b.m13085h(this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2));
        this.f26634h.m38163r(2);
        this.f26639m.m13079n(h, h2, C8233b.m13086g(this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2)));
    }

    public final void m13110D() {
        this.f26634h.m38163r(4);
        int h = this.f26634h.m38173h(4);
        this.f26634h.m38163r(2);
        this.f26639m.m13078o(h, this.f26634h.m38173h(6));
    }

    public final void m13109E() {
        int h = C8233b.m13085h(this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2));
        int h2 = this.f26634h.m38173h(2);
        int g = C8233b.m13086g(this.f26634h.m38173h(2), this.f26634h.m38173h(2), this.f26634h.m38173h(2));
        if (this.f26634h.m38174g()) {
            h2 |= 4;
        }
        boolean g2 = this.f26634h.m38174g();
        int h3 = this.f26634h.m38173h(2);
        int h4 = this.f26634h.m38173h(2);
        int h5 = this.f26634h.m38173h(2);
        this.f26634h.m38163r(8);
        this.f26639m.m13076q(h, g, g2, h2, h3, h4, h5);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    public final void m13108F() {
        C8234c cVar = this.f26642p;
        int i = cVar.f26683d;
        int i2 = cVar.f26681b;
        if (i != (i2 * 2) - 1) {
            int i3 = cVar.f26680a;
            StringBuilder sb2 = new StringBuilder((int) C3563j.f11932G0);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i2 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i);
            sb2.append(" (sequence number ");
            sb2.append(i3);
            sb2.append(");");
            C1230s.m37888b("Cea708Decoder", sb2.toString());
        }
        C1187a0 a0Var = this.f26634h;
        C8234c cVar2 = this.f26642p;
        a0Var.m38166o(cVar2.f26682c, cVar2.f26683d);
        int h = this.f26634h.m38173h(3);
        int h2 = this.f26634h.m38173h(5);
        if (h == 7) {
            this.f26634h.m38163r(2);
            h = this.f26634h.m38173h(6);
            if (h < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(h);
                C1230s.m37881i("Cea708Decoder", sb3.toString());
            }
        }
        if (h2 == 0) {
            if (h != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(h);
                sb4.append(") when blockSize is 0");
                C1230s.m37881i("Cea708Decoder", sb4.toString());
            }
        } else if (h == this.f26637k) {
            boolean z = false;
            while (this.f26634h.m38179b() > 0) {
                int h3 = this.f26634h.m38173h(8);
                if (h3 == 16) {
                    int h4 = this.f26634h.m38173h(8);
                    if (h4 <= 31) {
                        m13101u(h4);
                    } else {
                        if (h4 <= 127) {
                            m13096z(h4);
                        } else if (h4 <= 159) {
                            m13100v(h4);
                        } else if (h4 <= 255) {
                            m13113A(h4);
                        } else {
                            StringBuilder sb5 = new StringBuilder(37);
                            sb5.append("Invalid extended command: ");
                            sb5.append(h4);
                            C1230s.m37881i("Cea708Decoder", sb5.toString());
                        }
                        z = true;
                    }
                } else if (h3 <= 31) {
                    m13103s(h3);
                } else {
                    if (h3 <= 127) {
                        m13098x(h3);
                    } else if (h3 <= 159) {
                        m13102t(h3);
                    } else if (h3 <= 255) {
                        m13097y(h3);
                    } else {
                        StringBuilder sb6 = new StringBuilder(33);
                        sb6.append("Invalid base command: ");
                        sb6.append(h3);
                        C1230s.m37881i("Cea708Decoder", sb6.toString());
                    }
                    z = true;
                }
            }
            if (z) {
                this.f26640n = m13104r();
            }
        }
    }

    public final void m13107G() {
        for (int i = 0; i < 8; i++) {
            this.f26638l[i].m13081l();
        }
    }

    @Override
    public void mo13075a() {
        super.mo13075a();
    }

    @Override
    public String mo13106b() {
        return "Cea708Decoder";
    }

    @Override
    public void mo13074c(long j) {
        super.mo13074c(j);
    }

    @Override
    public void flush() {
        super.flush();
        this.f26640n = null;
        this.f26641o = null;
        this.f26643q = 0;
        this.f26639m = this.f26638l[0];
        m13107G();
        this.f26642p = null;
    }

    @Override
    public AbstractC8041f mo13070g() {
        List<C8032b> list = this.f26640n;
        this.f26641o = list;
        return new C8240f((List) C1186a.m38185e(list));
    }

    @Override
    public void mo13069h(C8046j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C1186a.m38185e(jVar.f26132c);
        this.f26633g.m38146N(byteBuffer.array(), byteBuffer.limit());
        while (this.f26633g.m38142a() >= 3) {
            int D = this.f26633g.m38156D() & 7;
            int i = D & 3;
            boolean z = false;
            boolean z2 = (D & 4) == 4;
            byte D2 = (byte) this.f26633g.m38156D();
            byte D3 = (byte) this.f26633g.m38156D();
            if (i == 2 || i == 3) {
                if (z2) {
                    if (i == 3) {
                        m13105q();
                        int i2 = (D2 & 192) >> 6;
                        int i3 = this.f26635i;
                        if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                            m13107G();
                            int i4 = this.f26635i;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i4);
                            sb2.append(" current=");
                            sb2.append(i2);
                            C1230s.m37881i("Cea708Decoder", sb2.toString());
                        }
                        this.f26635i = i2;
                        int i5 = D2 & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        C8234c cVar = new C8234c(i2, i5);
                        this.f26642p = cVar;
                        byte[] bArr = cVar.f26682c;
                        int i6 = cVar.f26683d;
                        cVar.f26683d = i6 + 1;
                        bArr[i6] = D3;
                    } else {
                        if (i == 2) {
                            z = true;
                        }
                        C1186a.m38189a(z);
                        C8234c cVar2 = this.f26642p;
                        if (cVar2 == null) {
                            C1230s.m37887c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f26682c;
                            int i7 = cVar2.f26683d;
                            int i8 = i7 + 1;
                            cVar2.f26683d = i8;
                            bArr2[i7] = D2;
                            cVar2.f26683d = i8 + 1;
                            bArr2[i8] = D3;
                        }
                    }
                    C8234c cVar3 = this.f26642p;
                    if (cVar3.f26683d == (cVar3.f26681b * 2) - 1) {
                        m13105q();
                    }
                }
            }
        }
    }

    @Override
    public C8046j mo13068i() {
        return super.mo13072e();
    }

    @Override
    public AbstractC8047k mo13067j() {
        return super.mo13073d();
    }

    @Override
    public boolean mo13064m() {
        return this.f26640n != this.f26641o;
    }

    @Override
    public void mo13063n(C8046j jVar) {
        super.mo13071f(jVar);
    }

    public final void m13105q() {
        if (this.f26642p != null) {
            m13108F();
            this.f26642p = null;
        }
    }

    public final List<C8032b> m13104r() {
        C8232a c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f26638l[i].m13083j() && this.f26638l[i].m13082k() && (c = this.f26638l[i].m13090c()) != null) {
                arrayList.add(c);
            }
        }
        Collections.sort(arrayList, C8232a.f26644c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C8232a) arrayList.get(i2)).f26645a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void m13103s(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f26640n = m13104r();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m13107G();
                    return;
                case 13:
                    this.f26639m.m13092a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb2.append(i);
                        C1230s.m37881i("Cea708Decoder", sb2.toString());
                        this.f26634h.m38163r(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Invalid C0 command: ");
                        sb3.append(i);
                        C1230s.m37881i("Cea708Decoder", sb3.toString());
                        return;
                    } else {
                        StringBuilder sb4 = new StringBuilder(54);
                        sb4.append("Currently unsupported COMMAND_P16 Command: ");
                        sb4.append(i);
                        C1230s.m37881i("Cea708Decoder", sb4.toString());
                        this.f26634h.m38163r(16);
                        return;
                    }
            }
        } else {
            this.f26639m.m13091b();
        }
    }

    public final void m13102t(int i) {
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
                if (this.f26643q != i3) {
                    this.f26643q = i3;
                    this.f26639m = this.f26638l[i3];
                    return;
                }
                return;
            case 136:
                while (i2 <= 8) {
                    if (this.f26634h.m38174g()) {
                        this.f26638l[8 - i2].m13088e();
                    }
                    i2++;
                }
                return;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f26634h.m38174g()) {
                        this.f26638l[8 - i4].m13077p(true);
                    }
                }
                return;
            case 138:
                while (i2 <= 8) {
                    if (this.f26634h.m38174g()) {
                        this.f26638l[8 - i2].m13077p(false);
                    }
                    i2++;
                }
                return;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f26634h.m38174g()) {
                        this.f26638l[8 - i5].m13077p(!bVar.m13082k());
                    }
                }
                return;
            case 140:
                while (i2 <= 8) {
                    if (this.f26634h.m38174g()) {
                        this.f26638l[8 - i2].m13081l();
                    }
                    i2++;
                }
                return;
            case 141:
                this.f26634h.m38163r(8);
                return;
            case 142:
                return;
            case 143:
                m13107G();
                return;
            case 144:
                if (!this.f26639m.m13084i()) {
                    this.f26634h.m38163r(16);
                    return;
                } else {
                    m13112B();
                    return;
                }
            case 145:
                if (!this.f26639m.m13084i()) {
                    this.f26634h.m38163r(24);
                    return;
                } else {
                    m13111C();
                    return;
                }
            case 146:
                if (!this.f26639m.m13084i()) {
                    this.f26634h.m38163r(16);
                    return;
                } else {
                    m13110D();
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
                C1230s.m37881i("Cea708Decoder", sb2.toString());
                return;
            case 151:
                if (!this.f26639m.m13084i()) {
                    this.f26634h.m38163r(32);
                    return;
                } else {
                    m13109E();
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
                m13099w(i6);
                if (this.f26643q != i6) {
                    this.f26643q = i6;
                    this.f26639m = this.f26638l[i6];
                    return;
                }
                return;
        }
    }

    public final void m13101u(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f26634h.m38163r(8);
            } else if (i <= 23) {
                this.f26634h.m38163r(16);
            } else if (i <= 31) {
                this.f26634h.m38163r(24);
            }
        }
    }

    public final void m13100v(int i) {
        if (i <= 135) {
            this.f26634h.m38163r(32);
        } else if (i <= 143) {
            this.f26634h.m38163r(40);
        } else if (i <= 159) {
            this.f26634h.m38163r(2);
            this.f26634h.m38163r(this.f26634h.m38173h(6) * 8);
        }
    }

    public final void m13099w(int i) {
        C8233b bVar = this.f26638l[i];
        this.f26634h.m38163r(2);
        boolean g = this.f26634h.m38174g();
        boolean g2 = this.f26634h.m38174g();
        boolean g3 = this.f26634h.m38174g();
        int h = this.f26634h.m38173h(3);
        boolean g4 = this.f26634h.m38174g();
        int h2 = this.f26634h.m38173h(7);
        int h3 = this.f26634h.m38173h(8);
        int h4 = this.f26634h.m38173h(4);
        int h5 = this.f26634h.m38173h(4);
        this.f26634h.m38163r(2);
        int h6 = this.f26634h.m38173h(6);
        this.f26634h.m38163r(2);
        bVar.m13087f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f26634h.m38173h(3), this.f26634h.m38173h(3));
    }

    public final void m13098x(int i) {
        if (i == 127) {
            this.f26639m.m13092a((char) 9835);
        } else {
            this.f26639m.m13092a((char) (i & 255));
        }
    }

    public final void m13097y(int i) {
        this.f26639m.m13092a((char) (i & 255));
    }

    public final void m13096z(int i) {
        if (i == 32) {
            this.f26639m.m13092a(' ');
        } else if (i == 33) {
            this.f26639m.m13092a((char) 160);
        } else if (i == 37) {
            this.f26639m.m13092a((char) 8230);
        } else if (i == 42) {
            this.f26639m.m13092a((char) 352);
        } else if (i == 44) {
            this.f26639m.m13092a((char) 338);
        } else if (i == 63) {
            this.f26639m.m13092a((char) 376);
        } else if (i == 57) {
            this.f26639m.m13092a((char) 8482);
        } else if (i == 58) {
            this.f26639m.m13092a((char) 353);
        } else if (i == 60) {
            this.f26639m.m13092a((char) 339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f26639m.m13092a((char) 9608);
                    return;
                case 49:
                    this.f26639m.m13092a((char) 8216);
                    return;
                case 50:
                    this.f26639m.m13092a((char) 8217);
                    return;
                case 51:
                    this.f26639m.m13092a((char) 8220);
                    return;
                case 52:
                    this.f26639m.m13092a((char) 8221);
                    return;
                case 53:
                    this.f26639m.m13092a((char) 8226);
                    return;
                default:
                    switch (i) {
                        case C3563j.f11947J0:
                            this.f26639m.m13092a((char) 8539);
                            return;
                        case C3563j.f11952K0:
                            this.f26639m.m13092a((char) 8540);
                            return;
                        case C3563j.f11957L0:
                            this.f26639m.m13092a((char) 8541);
                            return;
                        case C3563j.f11962M0:
                            this.f26639m.m13092a((char) 8542);
                            return;
                        case C3563j.f11967N0:
                            this.f26639m.m13092a((char) 9474);
                            return;
                        case C3563j.f11972O0:
                            this.f26639m.m13092a((char) 9488);
                            return;
                        case C3563j.f11977P0:
                            this.f26639m.m13092a((char) 9492);
                            return;
                        case 125:
                            this.f26639m.m13092a((char) 9472);
                            return;
                        case 126:
                            this.f26639m.m13092a((char) 9496);
                            return;
                        case 127:
                            this.f26639m.m13092a((char) 9484);
                            return;
                        default:
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Invalid G2 character: ");
                            sb2.append(i);
                            C1230s.m37881i("Cea708Decoder", sb2.toString());
                            return;
                    }
            }
        } else {
            this.f26639m.m13092a((char) 8480);
        }
    }
}
