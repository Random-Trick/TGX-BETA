package p005a4;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thunderdog.challegram.Log;
import p005a4.AbstractC0082a;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p032c5.C1604a;
import p032c5.C1608c;
import p032c5.C1610e;
import p032c5.C1616h;
import p073f4.C4260a;
import p162l4.C6308a;
import p162l4.C6317e;
import p174m3.C6600g1;
import p230q3.C8201m;
import p270t3.C8962i;
import p270t3.C8969o;
import p343y6.AbstractC10430f;
import p358z6.AbstractC11396q;

public final class C0085b {
    public static final byte[] f284a = C1216l0.m37980e0("OpusHead");

    public static final class C0086a {
        public final int f285a;
        public int f286b;
        public int f287c;
        public long f288d;
        public final boolean f289e;
        public final C1189b0 f290f;
        public final C1189b0 f291g;
        public int f292h;
        public int f293i;

        public C0086a(C1189b0 b0Var, C1189b0 b0Var2, boolean z) {
            this.f291g = b0Var;
            this.f290f = b0Var2;
            this.f289e = z;
            b0Var2.m38147P(12);
            this.f285a = b0Var2.m38155H();
            b0Var.m38147P(12);
            this.f293i = b0Var.m38155H();
            C8962i.m10831a(b0Var.m38132n() != 1 ? false : true, "first_chunk must be 1");
            this.f286b = -1;
        }

        public boolean m42385a() {
            long j;
            int i = this.f286b + 1;
            this.f286b = i;
            if (i == this.f285a) {
                return false;
            }
            if (this.f289e) {
                j = this.f290f.m38154I();
            } else {
                j = this.f290f.m38157F();
            }
            this.f288d = j;
            if (this.f286b == this.f292h) {
                this.f287c = this.f291g.m38155H();
                this.f291g.m38146Q(4);
                int i2 = this.f293i - 1;
                this.f293i = i2;
                this.f292h = i2 > 0 ? this.f291g.m38155H() - 1 : -1;
            }
            return true;
        }
    }

    public interface AbstractC0087b {
        int mo42384a();

        int mo42383b();

        int mo42382c();
    }

    public static final class C0088c {
        public final C0112p[] f294a;
        public C6600g1 f295b;
        public int f296c;
        public int f297d = 0;

        public C0088c(int i) {
            this.f294a = new C0112p[i];
        }
    }

    public static final class C0089d implements AbstractC0087b {
        public final int f298a;
        public final int f299b;
        public final C1189b0 f300c;

        public C0089d(AbstractC0082a.C0084b bVar, C6600g1 g1Var) {
            C1189b0 b0Var = bVar.f283b;
            this.f300c = b0Var;
            b0Var.m38147P(12);
            int H = b0Var.m38155H();
            if ("audio/raw".equals(g1Var.f20575U)) {
                int W = C1216l0.m37993W(g1Var.f20593j0, g1Var.f20591h0);
                if (H == 0 || H % W != 0) {
                    StringBuilder sb2 = new StringBuilder(88);
                    sb2.append("Audio sample size mismatch. stsd sample size: ");
                    sb2.append(W);
                    sb2.append(", stsz sample size: ");
                    sb2.append(H);
                    C1230s.m37884i("AtomParsers", sb2.toString());
                    H = W;
                }
            }
            this.f298a = H == 0 ? -1 : H;
            this.f299b = b0Var.m38155H();
        }

        @Override
        public int mo42384a() {
            return this.f298a;
        }

        @Override
        public int mo42383b() {
            return this.f299b;
        }

        @Override
        public int mo42382c() {
            int i = this.f298a;
            return i == -1 ? this.f300c.m38155H() : i;
        }
    }

    public static final class C0090e implements AbstractC0087b {
        public final C1189b0 f301a;
        public final int f302b;
        public final int f303c;
        public int f304d;
        public int f305e;

        public C0090e(AbstractC0082a.C0084b bVar) {
            C1189b0 b0Var = bVar.f283b;
            this.f301a = b0Var;
            b0Var.m38147P(12);
            this.f303c = b0Var.m38155H() & 255;
            this.f302b = b0Var.m38155H();
        }

        @Override
        public int mo42384a() {
            return -1;
        }

        @Override
        public int mo42383b() {
            return this.f302b;
        }

        @Override
        public int mo42382c() {
            int i = this.f303c;
            if (i == 8) {
                return this.f301a.m38159D();
            }
            if (i == 16) {
                return this.f301a.m38153J();
            }
            int i2 = this.f304d;
            this.f304d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f305e & 15;
            }
            int D = this.f301a.m38159D();
            this.f305e = D;
            return (D & 240) >> 4;
        }
    }

    public static final class C0091f {
        public final int f306a;
        public final long f307b;
        public final int f308c;

        public C0091f(int i, long j, int i2) {
            this.f306a = i;
            this.f307b = j;
            this.f308c = i2;
        }
    }

    public static List<C0114r> m42415A(AbstractC0082a.C0083a aVar, C8969o oVar, long j, C8201m mVar, boolean z, boolean z2, AbstractC10430f<C0111o, C0111o> fVar) {
        C0111o apply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.f282d.size(); i++) {
            AbstractC0082a.C0083a aVar2 = aVar.f282d.get(i);
            if (aVar2.f279a == 1953653099 && (apply = fVar.apply(m42386z(aVar2, (AbstractC0082a.C0084b) C1186a.m38188e(aVar.m42416g(1836476516)), j, mVar, z, z2))) != null) {
                arrayList.add(m42390v(apply, (AbstractC0082a.C0083a) C1186a.m38188e(((AbstractC0082a.C0083a) C1186a.m38188e(((AbstractC0082a.C0083a) C1186a.m38188e(aVar2.m42417f(1835297121))).m42417f(1835626086))).m42417f(1937007212)), oVar));
            }
        }
        return arrayList;
    }

    public static Pair<C4260a, C4260a> m42414B(AbstractC0082a.C0084b bVar) {
        C1189b0 b0Var = bVar.f283b;
        b0Var.m38147P(8);
        C4260a aVar = null;
        C4260a aVar2 = null;
        while (b0Var.m38145a() >= 8) {
            int e = b0Var.m38141e();
            int n = b0Var.m38132n();
            int n2 = b0Var.m38132n();
            if (n2 == 1835365473) {
                b0Var.m38147P(e);
                aVar = m42413C(b0Var, e + n);
            } else if (n2 == 1936553057) {
                b0Var.m38147P(e);
                aVar2 = m42391u(b0Var, e + n);
            }
            b0Var.m38147P(e + n);
        }
        return Pair.create(aVar, aVar2);
    }

    public static C4260a m42413C(C1189b0 b0Var, int i) {
        b0Var.m38146Q(8);
        m42407e(b0Var);
        while (b0Var.m38141e() < i) {
            int e = b0Var.m38141e();
            int n = b0Var.m38132n();
            if (b0Var.m38132n() == 1768715124) {
                b0Var.m38147P(e);
                return m42400l(b0Var, e + n);
            }
            b0Var.m38147P(e + n);
        }
        return null;
    }

    public static void m42412D(C1189b0 b0Var, int i, int i2, int i3, int i4, int i5, C8201m mVar, C0088c cVar, int i6) {
        C8201m mVar2;
        int i7;
        int i8;
        float f;
        byte[] bArr;
        List<byte[]> list;
        String str;
        int i9 = i2;
        int i10 = i3;
        C8201m mVar3 = mVar;
        C0088c cVar2 = cVar;
        b0Var.m38147P(i9 + 8 + 8);
        b0Var.m38146Q(16);
        int J = b0Var.m38153J();
        int J2 = b0Var.m38153J();
        b0Var.m38146Q(50);
        int e = b0Var.m38141e();
        int i11 = i;
        if (i11 == 1701733238) {
            Pair<Integer, C0112p> s = m42393s(b0Var, i9, i10);
            if (s != null) {
                i11 = ((Integer) s.first).intValue();
                mVar3 = mVar3 == null ? null : mVar3.m13217b(((C0112p) s.second).f429b);
                cVar2.f294a[i6] = (C0112p) s.second;
            }
            b0Var.m38147P(e);
        }
        String str2 = "video/3gpp";
        String str3 = i11 == 1831958048 ? "video/mpeg" : i11 == 1211250227 ? str2 : null;
        float f2 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        ByteBuffer byteBuffer = null;
        boolean z = false;
        while (true) {
            if (e - i9 >= i10) {
                mVar2 = mVar3;
                break;
            }
            b0Var.m38147P(e);
            int e2 = b0Var.m38141e();
            String str5 = str2;
            int n = b0Var.m38132n();
            if (n == 0) {
                mVar2 = mVar3;
                if (b0Var.m38141e() - i9 == i10) {
                    break;
                }
            } else {
                mVar2 = mVar3;
            }
            C8962i.m10831a(n > 0, "childAtomSize must be positive");
            int n2 = b0Var.m38132n();
            if (n2 == 1635148611) {
                C8962i.m10831a(str3 == null, null);
                b0Var.m38147P(e2 + 8);
                C1604a b = C1604a.m36296b(b0Var);
                list2 = b.f5875a;
                cVar2.f296c = b.f5876b;
                if (!z) {
                    f2 = b.f5879e;
                }
                str4 = b.f5880f;
                str = "video/avc";
            } else if (n2 == 1752589123) {
                C8962i.m10831a(str3 == null, null);
                b0Var.m38147P(e2 + 8);
                C1616h a = C1616h.m36231a(b0Var);
                list2 = a.f5957a;
                cVar2.f296c = a.f5958b;
                if (!z) {
                    f2 = a.f5961e;
                }
                str4 = a.f5962f;
                str = "video/hevc";
            } else {
                if (n2 == 1685480259 || n2 == 1685485123) {
                    i7 = J2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    C1610e a2 = C1610e.m36253a(b0Var);
                    if (a2 != null) {
                        str4 = a2.f5932c;
                        str3 = "video/dolby-vision";
                    }
                } else if (n2 == 1987076931) {
                    C8962i.m10831a(str3 == null, null);
                    str = i11 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (n2 == 1635135811) {
                    C8962i.m10831a(str3 == null, null);
                    str = "video/av01";
                } else if (n2 == 1668050025) {
                    ByteBuffer a3 = byteBuffer == null ? m42411a() : byteBuffer;
                    a3.position(21);
                    a3.putShort(b0Var.m38120z());
                    a3.putShort(b0Var.m38120z());
                    byteBuffer = a3;
                    i7 = J2;
                    i8 = i11;
                    e += n;
                    i9 = i2;
                    i10 = i3;
                    cVar2 = cVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i11 = i8;
                    J2 = i7;
                } else if (n2 == 1835295606) {
                    ByteBuffer a4 = byteBuffer == null ? m42411a() : byteBuffer;
                    short z2 = b0Var.m38120z();
                    short z3 = b0Var.m38120z();
                    short z4 = b0Var.m38120z();
                    i8 = i11;
                    short z5 = b0Var.m38120z();
                    short z6 = b0Var.m38120z();
                    list2 = list2;
                    short z7 = b0Var.m38120z();
                    bArr2 = bArr2;
                    short z8 = b0Var.m38120z();
                    f2 = f2;
                    short z9 = b0Var.m38120z();
                    long F = b0Var.m38157F();
                    long F2 = b0Var.m38157F();
                    i7 = J2;
                    a4.position(1);
                    a4.putShort(z6);
                    a4.putShort(z7);
                    a4.putShort(z2);
                    a4.putShort(z3);
                    a4.putShort(z4);
                    a4.putShort(z5);
                    a4.putShort(z8);
                    a4.putShort(z9);
                    a4.putShort((short) (F / 10000));
                    a4.putShort((short) (F2 / 10000));
                    byteBuffer = a4;
                    e += n;
                    i9 = i2;
                    i10 = i3;
                    cVar2 = cVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i11 = i8;
                    J2 = i7;
                } else {
                    i7 = J2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    if (n2 == 1681012275) {
                        C8962i.m10831a(str3 == null, null);
                        str3 = str5;
                    } else if (n2 == 1702061171) {
                        C8962i.m10831a(str3 == null, null);
                        Pair<String, byte[]> i16 = m42403i(b0Var, e2);
                        str3 = (String) i16.first;
                        byte[] bArr3 = (byte[]) i16.second;
                        list2 = bArr3 != null ? AbstractC11396q.m767E(bArr3) : list;
                        bArr2 = bArr;
                        f2 = f;
                        e += n;
                        i9 = i2;
                        i10 = i3;
                        cVar2 = cVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i11 = i8;
                        J2 = i7;
                    } else if (n2 == 1885434736) {
                        f2 = m42395q(b0Var, e2);
                        list2 = list;
                        bArr2 = bArr;
                        z = true;
                        e += n;
                        i9 = i2;
                        i10 = i3;
                        cVar2 = cVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i11 = i8;
                        J2 = i7;
                    } else if (n2 == 1937126244) {
                        bArr2 = m42394r(b0Var, e2, n);
                        list2 = list;
                        f2 = f;
                        e += n;
                        i9 = i2;
                        i10 = i3;
                        cVar2 = cVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i11 = i8;
                        J2 = i7;
                    } else if (n2 == 1936995172) {
                        int D = b0Var.m38159D();
                        b0Var.m38146Q(3);
                        if (D == 0) {
                            int D2 = b0Var.m38159D();
                            if (D2 == 0) {
                                i12 = 0;
                            } else if (D2 == 1) {
                                i12 = 1;
                            } else if (D2 == 2) {
                                i12 = 2;
                            } else if (D2 == 3) {
                                i12 = 3;
                            }
                        }
                    } else if (n2 == 1668246642) {
                        int n3 = b0Var.m38132n();
                        if (n3 == 1852009592 || n3 == 1852009571) {
                            int J3 = b0Var.m38153J();
                            int J4 = b0Var.m38153J();
                            b0Var.m38146Q(2);
                            boolean z10 = n == 19 && (b0Var.m38159D() & Log.TAG_YOUTUBE) != 0;
                            i13 = C1608c.m36291b(J3);
                            i14 = z10 ? 1 : 2;
                            i15 = C1608c.m36290c(J4);
                        } else {
                            String valueOf = String.valueOf(AbstractC0082a.m42422a(n3));
                            C1230s.m37884i("AtomParsers", valueOf.length() != 0 ? "Unsupported color type: ".concat(valueOf) : new String("Unsupported color type: "));
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f2 = f;
                e += n;
                i9 = i2;
                i10 = i3;
                cVar2 = cVar;
                str2 = str5;
                mVar3 = mVar2;
                i11 = i8;
                J2 = i7;
            }
            str3 = str;
            i7 = J2;
            i8 = i11;
            e += n;
            i9 = i2;
            i10 = i3;
            cVar2 = cVar;
            str2 = str5;
            mVar3 = mVar2;
            i11 = i8;
            J2 = i7;
        }
        int i17 = J2;
        byte[] bArr4 = bArr2;
        float f3 = f2;
        List<byte[]> list3 = list2;
        byte[] bArr5 = null;
        if (str3 != null) {
            C6600g1.C6602b M = new C6600g1.C6602b().m19877R(i4).m19859e0(str3).m19886I(str4).m19849j0(J).m19878Q(i17).m19867a0(f3).m19861d0(i5).m19865b0(bArr4).m19853h0(i12).m19875T(list3).m19882M(mVar2);
            int i18 = i13;
            int i19 = i14;
            int i20 = i15;
            if (!(i18 == -1 && i19 == -1 && i20 == -1 && byteBuffer == null)) {
                if (byteBuffer != null) {
                    bArr5 = byteBuffer.array();
                }
                M.m19885J(new C1608c(i18, i19, i20, bArr5));
            }
            cVar.f295b = M.m19890E();
        }
    }

    public static ByteBuffer m42411a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean m42410b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[C1216l0.m37959p(4, 0, length)] && jArr[C1216l0.m37959p(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    public static int m42409c(C1189b0 b0Var, int i, int i2, int i3) {
        int e = b0Var.m38141e();
        C8962i.m10831a(e >= i2, null);
        while (e - i2 < i3) {
            b0Var.m38147P(e);
            int n = b0Var.m38132n();
            C8962i.m10831a(n > 0, "childAtomSize must be positive");
            if (b0Var.m38132n() == i) {
                return e;
            }
            e += n;
        }
        return -1;
    }

    public static int m42408d(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void m42407e(C1189b0 b0Var) {
        int e = b0Var.m38141e();
        b0Var.m38146Q(4);
        if (b0Var.m38132n() != 1751411826) {
            e += 4;
        }
        b0Var.m38147P(e);
    }

    public static void m42406f(p020b5.C1189b0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, p230q3.C8201m r29, p005a4.C0085b.C0088c r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0085b.m42406f(b5.b0, int, int, int, int, java.lang.String, boolean, q3.m, a4.b$c, int):void");
    }

    public static Pair<Integer, C0112p> m42405g(C1189b0 b0Var, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            b0Var.m38147P(i3);
            int n = b0Var.m38132n();
            int n2 = b0Var.m38132n();
            if (n2 == 1718775137) {
                num = Integer.valueOf(b0Var.m38132n());
            } else if (n2 == 1935894637) {
                b0Var.m38146Q(4);
                str = b0Var.m38162A(4);
            } else if (n2 == 1935894633) {
                i4 = i3;
                i5 = n;
            }
            i3 += n;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C8962i.m10831a(num != null, "frma atom is mandatory");
        C8962i.m10831a(i4 != -1, "schi atom is mandatory");
        C0112p t = m42392t(b0Var, i4, i5, str);
        if (t != null) {
            z = true;
        }
        C8962i.m10831a(z, "tenc atom is mandatory");
        return Pair.create(num, (C0112p) C1216l0.m37971j(t));
    }

    public static Pair<long[], long[]> m42404h(AbstractC0082a.C0083a aVar) {
        AbstractC0082a.C0084b g = aVar.m42416g(1701606260);
        if (g == null) {
            return null;
        }
        C1189b0 b0Var = g.f283b;
        b0Var.m38147P(8);
        int c = AbstractC0082a.m42420c(b0Var.m38132n());
        int H = b0Var.m38155H();
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        for (int i = 0; i < H; i++) {
            jArr[i] = c == 1 ? b0Var.m38154I() : b0Var.m38157F();
            jArr2[i] = c == 1 ? b0Var.m38123w() : b0Var.m38132n();
            if (b0Var.m38120z() == 1) {
                b0Var.m38146Q(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> m42403i(C1189b0 b0Var, int i) {
        b0Var.m38147P(i + 8 + 4);
        b0Var.m38146Q(1);
        m42402j(b0Var);
        b0Var.m38146Q(2);
        int D = b0Var.m38159D();
        if ((D & Log.TAG_YOUTUBE) != 0) {
            b0Var.m38146Q(2);
        }
        if ((D & 64) != 0) {
            b0Var.m38146Q(b0Var.m38153J());
        }
        if ((D & 32) != 0) {
            b0Var.m38146Q(2);
        }
        b0Var.m38146Q(1);
        m42402j(b0Var);
        String e = C1234w.m37869e(b0Var.m38159D());
        if ("audio/mpeg".equals(e) || "audio/vnd.dts".equals(e) || "audio/vnd.dts.hd".equals(e)) {
            return Pair.create(e, null);
        }
        b0Var.m38146Q(12);
        b0Var.m38146Q(1);
        int j = m42402j(b0Var);
        byte[] bArr = new byte[j];
        b0Var.m38136j(bArr, 0, j);
        return Pair.create(e, bArr);
    }

    public static int m42402j(C1189b0 b0Var) {
        int D = b0Var.m38159D();
        int i = D & 127;
        while ((D & Log.TAG_YOUTUBE) == 128) {
            D = b0Var.m38159D();
            i = (i << 7) | (D & 127);
        }
        return i;
    }

    public static int m42401k(C1189b0 b0Var) {
        b0Var.m38147P(16);
        return b0Var.m38132n();
    }

    public static C4260a m42400l(C1189b0 b0Var, int i) {
        b0Var.m38146Q(8);
        ArrayList arrayList = new ArrayList();
        while (b0Var.m38141e() < i) {
            C4260a.AbstractC4262b c = C0101h.m42324c(b0Var);
            if (c != null) {
                arrayList.add(c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4260a(arrayList);
    }

    public static Pair<Long, String> m42399m(C1189b0 b0Var) {
        int i = 8;
        b0Var.m38147P(8);
        int c = AbstractC0082a.m42420c(b0Var.m38132n());
        b0Var.m38146Q(c == 0 ? 8 : 16);
        long F = b0Var.m38157F();
        if (c == 0) {
            i = 4;
        }
        b0Var.m38146Q(i);
        int J = b0Var.m38153J();
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) (((J >> 10) & 31) + 96));
        sb2.append((char) (((J >> 5) & 31) + 96));
        sb2.append((char) ((J & 31) + 96));
        return Pair.create(Long.valueOf(F), sb2.toString());
    }

    public static C4260a m42398n(AbstractC0082a.C0083a aVar) {
        AbstractC0082a.C0084b g = aVar.m42416g(1751411826);
        AbstractC0082a.C0084b g2 = aVar.m42416g(1801812339);
        AbstractC0082a.C0084b g3 = aVar.m42416g(1768715124);
        if (g == null || g2 == null || g3 == null || m42401k(g.f283b) != 1835299937) {
            return null;
        }
        C1189b0 b0Var = g2.f283b;
        b0Var.m38147P(12);
        int n = b0Var.m38132n();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            int n2 = b0Var.m38132n();
            b0Var.m38146Q(4);
            strArr[i] = b0Var.m38162A(n2 - 8);
        }
        C1189b0 b0Var2 = g3.f283b;
        b0Var2.m38147P(8);
        ArrayList arrayList = new ArrayList();
        while (b0Var2.m38145a() > 8) {
            int e = b0Var2.m38141e();
            int n3 = b0Var2.m38132n();
            int n4 = b0Var2.m38132n() - 1;
            if (n4 < 0 || n4 >= n) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Skipped metadata with unknown key index: ");
                sb2.append(n4);
                C1230s.m37884i("AtomParsers", sb2.toString());
            } else {
                C6308a f = C0101h.m42321f(b0Var2, e + n3, strArr[n4]);
                if (f != null) {
                    arrayList.add(f);
                }
            }
            b0Var2.m38147P(e + n3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4260a(arrayList);
    }

    public static void m42397o(C1189b0 b0Var, int i, int i2, int i3, C0088c cVar) {
        b0Var.m38147P(i2 + 8 + 8);
        if (i == 1835365492) {
            b0Var.m38122x();
            String x = b0Var.m38122x();
            if (x != null) {
                cVar.f295b = new C6600g1.C6602b().m19877R(i3).m19859e0(x).m19890E();
            }
        }
    }

    public static long m42396p(C1189b0 b0Var) {
        int i = 8;
        b0Var.m38147P(8);
        if (AbstractC0082a.m42420c(b0Var.m38132n()) != 0) {
            i = 16;
        }
        b0Var.m38146Q(i);
        return b0Var.m38157F();
    }

    public static float m42395q(C1189b0 b0Var, int i) {
        b0Var.m38147P(i + 8);
        return b0Var.m38155H() / b0Var.m38155H();
    }

    public static byte[] m42394r(C1189b0 b0Var, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            b0Var.m38147P(i3);
            int n = b0Var.m38132n();
            if (b0Var.m38132n() == 1886547818) {
                return Arrays.copyOfRange(b0Var.m38142d(), i3, n + i3);
            }
            i3 += n;
        }
        return null;
    }

    public static Pair<Integer, C0112p> m42393s(C1189b0 b0Var, int i, int i2) {
        Pair<Integer, C0112p> g;
        int e = b0Var.m38141e();
        while (e - i < i2) {
            b0Var.m38147P(e);
            int n = b0Var.m38132n();
            C8962i.m10831a(n > 0, "childAtomSize must be positive");
            if (b0Var.m38132n() == 1936289382 && (g = m42405g(b0Var, e, n)) != null) {
                return g;
            }
            e += n;
        }
        return null;
    }

    public static C0112p m42392t(C1189b0 b0Var, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            b0Var.m38147P(i5);
            int n = b0Var.m38132n();
            if (b0Var.m38132n() == 1952804451) {
                int c = AbstractC0082a.m42420c(b0Var.m38132n());
                b0Var.m38146Q(1);
                if (c == 0) {
                    b0Var.m38146Q(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int D = b0Var.m38159D();
                    i4 = (D & 240) >> 4;
                    i3 = D & 15;
                }
                boolean z = b0Var.m38159D() == 1;
                int D2 = b0Var.m38159D();
                byte[] bArr2 = new byte[16];
                b0Var.m38136j(bArr2, 0, 16);
                if (z && D2 == 0) {
                    int D3 = b0Var.m38159D();
                    bArr = new byte[D3];
                    b0Var.m38136j(bArr, 0, D3);
                }
                return new C0112p(z, str, D2, bArr2, i4, i3, bArr);
            }
            i5 += n;
        }
    }

    public static C4260a m42391u(C1189b0 b0Var, int i) {
        b0Var.m38146Q(12);
        while (b0Var.m38141e() < i) {
            int e = b0Var.m38141e();
            int n = b0Var.m38132n();
            if (b0Var.m38132n() != 1935766900) {
                b0Var.m38147P(e + n);
            } else if (n < 14) {
                return null;
            } else {
                b0Var.m38146Q(5);
                int D = b0Var.m38159D();
                if (D != 12 && D != 13) {
                    return null;
                }
                float f = D == 12 ? 240.0f : 120.0f;
                b0Var.m38146Q(1);
                return new C4260a(new C6317e(f, b0Var.m38159D()));
            }
        }
        return null;
    }

    public static p005a4.C0114r m42390v(p005a4.C0111o r37, p005a4.AbstractC0082a.C0083a r38, p270t3.C8969o r39) {
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0085b.m42390v(a4.o, a4.a$a, t3.o):a4.r");
    }

    public static C0088c m42389w(C1189b0 b0Var, int i, int i2, String str, C8201m mVar, boolean z) {
        int i3;
        b0Var.m38147P(12);
        int n = b0Var.m38132n();
        C0088c cVar = new C0088c(n);
        for (int i4 = 0; i4 < n; i4++) {
            int e = b0Var.m38141e();
            int n2 = b0Var.m38132n();
            C8962i.m10831a(n2 > 0, "childAtomSize must be positive");
            int n3 = b0Var.m38132n();
            if (n3 == 1635148593 || n3 == 1635148595 || n3 == 1701733238 || n3 == 1831958048 || n3 == 1836070006 || n3 == 1752589105 || n3 == 1751479857 || n3 == 1932670515 || n3 == 1211250227 || n3 == 1987063864 || n3 == 1987063865 || n3 == 1635135537 || n3 == 1685479798 || n3 == 1685479729 || n3 == 1685481573 || n3 == 1685481521) {
                i3 = e;
                m42412D(b0Var, n3, i3, n2, i, i2, mVar, cVar, i4);
            } else if (n3 == 1836069985 || n3 == 1701733217 || n3 == 1633889587 || n3 == 1700998451 || n3 == 1633889588 || n3 == 1835823201 || n3 == 1685353315 || n3 == 1685353317 || n3 == 1685353320 || n3 == 1685353324 || n3 == 1685353336 || n3 == 1935764850 || n3 == 1935767394 || n3 == 1819304813 || n3 == 1936684916 || n3 == 1953984371 || n3 == 778924082 || n3 == 778924083 || n3 == 1835557169 || n3 == 1835560241 || n3 == 1634492771 || n3 == 1634492791 || n3 == 1970037111 || n3 == 1332770163 || n3 == 1716281667) {
                i3 = e;
                m42406f(b0Var, n3, e, n2, i, str, z, mVar, cVar, i4);
            } else {
                if (n3 == 1414810956 || n3 == 1954034535 || n3 == 2004251764 || n3 == 1937010800 || n3 == 1664495672) {
                    m42388x(b0Var, n3, e, n2, i, str, cVar);
                } else if (n3 == 1835365492) {
                    m42397o(b0Var, n3, e, i, cVar);
                } else if (n3 == 1667329389) {
                    cVar.f295b = new C6600g1.C6602b().m19877R(i).m19859e0("application/x-camera-motion").m19890E();
                }
                i3 = e;
            }
            b0Var.m38147P(i3 + n2);
        }
        return cVar;
    }

    public static void m42388x(C1189b0 b0Var, int i, int i2, int i3, int i4, String str, C0088c cVar) {
        b0Var.m38147P(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        AbstractC11396q qVar = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                b0Var.m38136j(bArr, 0, i5);
                qVar = AbstractC11396q.m767E(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                cVar.f297d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f295b = new C6600g1.C6602b().m19877R(i4).m19859e0(str2).m19873V(str).m19851i0(j).m19875T(qVar).m19890E();
    }

    public static C0091f m42387y(C1189b0 b0Var) {
        boolean z;
        int i = 8;
        b0Var.m38147P(8);
        int c = AbstractC0082a.m42420c(b0Var.m38132n());
        b0Var.m38146Q(c == 0 ? 8 : 16);
        int n = b0Var.m38132n();
        b0Var.m38146Q(4);
        int e = b0Var.m38141e();
        if (c == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (b0Var.m38142d()[e + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            b0Var.m38146Q(i);
        } else {
            long F = c == 0 ? b0Var.m38157F() : b0Var.m38154I();
            if (F != 0) {
                j = F;
            }
        }
        b0Var.m38146Q(16);
        int n2 = b0Var.m38132n();
        int n3 = b0Var.m38132n();
        b0Var.m38146Q(4);
        int n4 = b0Var.m38132n();
        int n5 = b0Var.m38132n();
        if (n2 == 0 && n3 == 65536 && n4 == -65536 && n5 == 0) {
            i2 = 90;
        } else if (n2 == 0 && n3 == -65536 && n4 == 65536 && n5 == 0) {
            i2 = 270;
        } else if (n2 == -65536 && n3 == 0 && n4 == 0 && n5 == -65536) {
            i2 = 180;
        }
        return new C0091f(n, j, i2);
    }

    public static C0111o m42386z(AbstractC0082a.C0083a aVar, AbstractC0082a.C0084b bVar, long j, C8201m mVar, boolean z, boolean z2) {
        long j2;
        AbstractC0082a.C0084b bVar2;
        long[] jArr;
        long[] jArr2;
        AbstractC0082a.C0083a f;
        Pair<long[], long[]> h;
        AbstractC0082a.C0083a aVar2 = (AbstractC0082a.C0083a) C1186a.m38188e(aVar.m42417f(1835297121));
        int d = m42408d(m42401k(((AbstractC0082a.C0084b) C1186a.m38188e(aVar2.m42416g(1751411826))).f283b));
        if (d == -1) {
            return null;
        }
        C0091f y = m42387y(((AbstractC0082a.C0084b) C1186a.m38188e(aVar.m42416g(1953196132))).f283b);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = y.f307b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long p = m42396p(bVar2.f283b);
        if (j2 != -9223372036854775807L) {
            j3 = C1216l0.m37940y0(j2, 1000000L, p);
        }
        long j4 = j3;
        Pair<Long, String> m = m42399m(((AbstractC0082a.C0084b) C1186a.m38188e(aVar2.m42416g(1835296868))).f283b);
        C0088c w = m42389w(((AbstractC0082a.C0084b) C1186a.m38188e(((AbstractC0082a.C0083a) C1186a.m38188e(((AbstractC0082a.C0083a) C1186a.m38188e(aVar2.m42417f(1835626086))).m42417f(1937007212))).m42416g(1937011556))).f283b, y.f306a, y.f308c, (String) m.second, mVar, z2);
        if (z || (f = aVar.m42417f(1701082227)) == null || (h = m42404h(f)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr2 = (long[]) h.first;
            jArr = (long[]) h.second;
        }
        if (w.f295b == null) {
            return null;
        }
        return new C0111o(y.f306a, d, ((Long) m.first).longValue(), p, j4, w.f295b, w.f297d, w.f294a, w.f296c, jArr2, jArr);
    }
}
