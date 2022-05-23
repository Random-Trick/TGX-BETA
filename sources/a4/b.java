package a4;

import a4.a;
import a7.q;
import android.util.Pair;
import c5.b0;
import c5.l0;
import c5.s;
import c5.w;
import d5.h;
import f4.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m3.q1;
import org.thunderdog.challegram.Log;
import q3.m;
import t3.i;
import t3.o;

public final class b {
    public static final byte[] f235a = l0.f0("OpusHead");

    public static final class a {
        public final int f236a;
        public int f237b;
        public int f238c;
        public long f239d;
        public final boolean f240e;
        public final b0 f241f;
        public final b0 f242g;
        public int f243h;
        public int f244i;

        public a(b0 b0Var, b0 b0Var2, boolean z10) {
            this.f242g = b0Var;
            this.f241f = b0Var2;
            this.f240e = z10;
            b0Var2.P(12);
            this.f236a = b0Var2.H();
            b0Var.P(12);
            this.f244i = b0Var.H();
            i.a(b0Var.n() != 1 ? false : true, "first_chunk must be 1");
            this.f237b = -1;
        }

        public boolean a() {
            long j10;
            int i10 = this.f237b + 1;
            this.f237b = i10;
            if (i10 == this.f236a) {
                return false;
            }
            if (this.f240e) {
                j10 = this.f241f.I();
            } else {
                j10 = this.f241f.F();
            }
            this.f239d = j10;
            if (this.f237b == this.f243h) {
                this.f238c = this.f242g.H();
                this.f242g.Q(4);
                int i11 = this.f244i - 1;
                this.f244i = i11;
                this.f243h = i11 > 0 ? this.f242g.H() - 1 : -1;
            }
            return true;
        }
    }

    public interface AbstractC0012b {
        int a();

        int b();

        int c();
    }

    public static final class c {
        public final p[] f245a;
        public q1 f246b;
        public int f247c;
        public int f248d = 0;

        public c(int i10) {
            this.f245a = new p[i10];
        }
    }

    public static final class d implements AbstractC0012b {
        public final int f249a;
        public final int f250b;
        public final b0 f251c;

        public d(a.b bVar, q1 q1Var) {
            b0 b0Var = bVar.f234b;
            this.f251c = b0Var;
            b0Var.P(12);
            int H = b0Var.H();
            if ("audio/raw".equals(q1Var.U)) {
                int X = l0.X(q1Var.f16910j0, q1Var.f16908h0);
                if (H == 0 || H % X != 0) {
                    StringBuilder sb2 = new StringBuilder(88);
                    sb2.append("Audio sample size mismatch. stsd sample size: ");
                    sb2.append(X);
                    sb2.append(", stsz sample size: ");
                    sb2.append(H);
                    s.i("AtomParsers", sb2.toString());
                    H = X;
                }
            }
            this.f249a = H == 0 ? -1 : H;
            this.f250b = b0Var.H();
        }

        @Override
        public int a() {
            return this.f249a;
        }

        @Override
        public int b() {
            return this.f250b;
        }

        @Override
        public int c() {
            int i10 = this.f249a;
            return i10 == -1 ? this.f251c.H() : i10;
        }
    }

    public static final class e implements AbstractC0012b {
        public final b0 f252a;
        public final int f253b;
        public final int f254c;
        public int f255d;
        public int f256e;

        public e(a.b bVar) {
            b0 b0Var = bVar.f234b;
            this.f252a = b0Var;
            b0Var.P(12);
            this.f254c = b0Var.H() & 255;
            this.f253b = b0Var.H();
        }

        @Override
        public int a() {
            return -1;
        }

        @Override
        public int b() {
            return this.f253b;
        }

        @Override
        public int c() {
            int i10 = this.f254c;
            if (i10 == 8) {
                return this.f252a.D();
            }
            if (i10 == 16) {
                return this.f252a.J();
            }
            int i11 = this.f255d;
            this.f255d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f256e & 15;
            }
            int D = this.f252a.D();
            this.f256e = D;
            return (D & 240) >> 4;
        }
    }

    public static final class f {
        public final int f257a;
        public final long f258b;
        public final int f259c;

        public f(int i10, long j10, int i11) {
            this.f257a = i10;
            this.f258b = j10;
            this.f259c = i11;
        }
    }

    public static List<r> A(a.C0011a aVar, o oVar, long j10, m mVar, boolean z10, boolean z11, z6.f<o, o> fVar) {
        o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar.f233d.size(); i10++) {
            a.C0011a aVar2 = aVar.f233d.get(i10);
            if (aVar2.f230a == 1953653099 && (apply = fVar.apply(z(aVar2, (a.b) c5.a.e(aVar.g(1836476516)), j10, mVar, z10, z11))) != null) {
                arrayList.add(v(apply, (a.C0011a) c5.a.e(((a.C0011a) c5.a.e(((a.C0011a) c5.a.e(aVar2.f(1835297121))).f(1835626086))).f(1937007212)), oVar));
            }
        }
        return arrayList;
    }

    public static Pair<f4.a, f4.a> B(a.b bVar) {
        b0 b0Var = bVar.f234b;
        b0Var.P(8);
        f4.a aVar = null;
        f4.a aVar2 = null;
        while (b0Var.a() >= 8) {
            int e10 = b0Var.e();
            int n10 = b0Var.n();
            int n11 = b0Var.n();
            if (n11 == 1835365473) {
                b0Var.P(e10);
                aVar = C(b0Var, e10 + n10);
            } else if (n11 == 1936553057) {
                b0Var.P(e10);
                aVar2 = u(b0Var, e10 + n10);
            }
            b0Var.P(e10 + n10);
        }
        return Pair.create(aVar, aVar2);
    }

    public static f4.a C(b0 b0Var, int i10) {
        b0Var.Q(8);
        e(b0Var);
        while (b0Var.e() < i10) {
            int e10 = b0Var.e();
            int n10 = b0Var.n();
            if (b0Var.n() == 1768715124) {
                b0Var.P(e10);
                return l(b0Var, e10 + n10);
            }
            b0Var.P(e10 + n10);
        }
        return null;
    }

    public static void D(b0 b0Var, int i10, int i11, int i12, int i13, int i14, m mVar, c cVar, int i15) {
        m mVar2;
        int i16;
        int i17;
        float f10;
        byte[] bArr;
        List<byte[]> list;
        String str;
        int i18 = i11;
        int i19 = i12;
        m mVar3 = mVar;
        c cVar2 = cVar;
        b0Var.P(i18 + 8 + 8);
        b0Var.Q(16);
        int J = b0Var.J();
        int J2 = b0Var.J();
        b0Var.Q(50);
        int e10 = b0Var.e();
        int i20 = i10;
        if (i20 == 1701733238) {
            Pair<Integer, p> s10 = s(b0Var, i18, i19);
            if (s10 != null) {
                i20 = ((Integer) s10.first).intValue();
                mVar3 = mVar3 == null ? null : mVar3.b(((p) s10.second).f370b);
                cVar2.f245a[i15] = (p) s10.second;
            }
            b0Var.P(e10);
        }
        String str2 = "video/3gpp";
        String str3 = i20 == 1831958048 ? "video/mpeg" : i20 == 1211250227 ? str2 : null;
        float f11 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        ByteBuffer byteBuffer = null;
        boolean z10 = false;
        while (true) {
            if (e10 - i18 >= i19) {
                mVar2 = mVar3;
                break;
            }
            b0Var.P(e10);
            int e11 = b0Var.e();
            String str5 = str2;
            int n10 = b0Var.n();
            if (n10 == 0) {
                mVar2 = mVar3;
                if (b0Var.e() - i18 == i19) {
                    break;
                }
            } else {
                mVar2 = mVar3;
            }
            i.a(n10 > 0, "childAtomSize must be positive");
            int n11 = b0Var.n();
            if (n11 == 1635148611) {
                i.a(str3 == null, null);
                b0Var.P(e11 + 8);
                d5.a b10 = d5.a.b(b0Var);
                list2 = b10.f6199a;
                cVar2.f247c = b10.f6200b;
                if (!z10) {
                    f11 = b10.f6203e;
                }
                str4 = b10.f6204f;
                str = "video/avc";
            } else if (n11 == 1752589123) {
                i.a(str3 == null, null);
                b0Var.P(e11 + 8);
                h a10 = h.a(b0Var);
                list2 = a10.f6262a;
                cVar2.f247c = a10.f6263b;
                if (!z10) {
                    f11 = a10.f6266e;
                }
                str4 = a10.f6267f;
                str = "video/hevc";
            } else {
                if (n11 == 1685480259 || n11 == 1685485123) {
                    i16 = J2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    d5.e a11 = d5.e.a(b0Var);
                    if (a11 != null) {
                        str4 = a11.f6241c;
                        str3 = "video/dolby-vision";
                    }
                } else if (n11 == 1987076931) {
                    i.a(str3 == null, null);
                    str = i20 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (n11 == 1635135811) {
                    i.a(str3 == null, null);
                    str = "video/av01";
                } else if (n11 == 1668050025) {
                    ByteBuffer a12 = byteBuffer == null ? a() : byteBuffer;
                    a12.position(21);
                    a12.putShort(b0Var.z());
                    a12.putShort(b0Var.z());
                    byteBuffer = a12;
                    i16 = J2;
                    i17 = i20;
                    e10 += n10;
                    i18 = i11;
                    i19 = i12;
                    cVar2 = cVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i20 = i17;
                    J2 = i16;
                } else if (n11 == 1835295606) {
                    ByteBuffer a13 = byteBuffer == null ? a() : byteBuffer;
                    short z11 = b0Var.z();
                    short z12 = b0Var.z();
                    short z13 = b0Var.z();
                    i17 = i20;
                    short z14 = b0Var.z();
                    short z15 = b0Var.z();
                    list2 = list2;
                    short z16 = b0Var.z();
                    bArr2 = bArr2;
                    short z17 = b0Var.z();
                    f11 = f11;
                    short z18 = b0Var.z();
                    long F = b0Var.F();
                    long F2 = b0Var.F();
                    i16 = J2;
                    a13.position(1);
                    a13.putShort(z15);
                    a13.putShort(z16);
                    a13.putShort(z11);
                    a13.putShort(z12);
                    a13.putShort(z13);
                    a13.putShort(z14);
                    a13.putShort(z17);
                    a13.putShort(z18);
                    a13.putShort((short) (F / 10000));
                    a13.putShort((short) (F2 / 10000));
                    byteBuffer = a13;
                    e10 += n10;
                    i18 = i11;
                    i19 = i12;
                    cVar2 = cVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i20 = i17;
                    J2 = i16;
                } else {
                    i16 = J2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    if (n11 == 1681012275) {
                        i.a(str3 == null, null);
                        str3 = str5;
                    } else if (n11 == 1702061171) {
                        i.a(str3 == null, null);
                        Pair<String, byte[]> i25 = i(b0Var, e11);
                        str3 = (String) i25.first;
                        byte[] bArr3 = (byte[]) i25.second;
                        list2 = bArr3 != null ? q.E(bArr3) : list;
                        bArr2 = bArr;
                        f11 = f10;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        cVar2 = cVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        J2 = i16;
                    } else if (n11 == 1885434736) {
                        f11 = q(b0Var, e11);
                        list2 = list;
                        bArr2 = bArr;
                        z10 = true;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        cVar2 = cVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        J2 = i16;
                    } else if (n11 == 1937126244) {
                        bArr2 = r(b0Var, e11, n10);
                        list2 = list;
                        f11 = f10;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        cVar2 = cVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i20 = i17;
                        J2 = i16;
                    } else if (n11 == 1936995172) {
                        int D = b0Var.D();
                        b0Var.Q(3);
                        if (D == 0) {
                            int D2 = b0Var.D();
                            if (D2 == 0) {
                                i21 = 0;
                            } else if (D2 == 1) {
                                i21 = 1;
                            } else if (D2 == 2) {
                                i21 = 2;
                            } else if (D2 == 3) {
                                i21 = 3;
                            }
                        }
                    } else if (n11 == 1668246642) {
                        int n12 = b0Var.n();
                        if (n12 == 1852009592 || n12 == 1852009571) {
                            int J3 = b0Var.J();
                            int J4 = b0Var.J();
                            b0Var.Q(2);
                            boolean z19 = n10 == 19 && (b0Var.D() & Log.TAG_YOUTUBE) != 0;
                            i22 = d5.c.b(J3);
                            i23 = z19 ? 1 : 2;
                            i24 = d5.c.c(J4);
                        } else {
                            String valueOf = String.valueOf(a4.a.a(n12));
                            s.i("AtomParsers", valueOf.length() != 0 ? "Unsupported color type: ".concat(valueOf) : new String("Unsupported color type: "));
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f11 = f10;
                e10 += n10;
                i18 = i11;
                i19 = i12;
                cVar2 = cVar;
                str2 = str5;
                mVar3 = mVar2;
                i20 = i17;
                J2 = i16;
            }
            str3 = str;
            i16 = J2;
            i17 = i20;
            e10 += n10;
            i18 = i11;
            i19 = i12;
            cVar2 = cVar;
            str2 = str5;
            mVar3 = mVar2;
            i20 = i17;
            J2 = i16;
        }
        int i26 = J2;
        byte[] bArr4 = bArr2;
        float f12 = f11;
        List<byte[]> list3 = list2;
        byte[] bArr5 = null;
        if (str3 != null) {
            q1.b M = new q1.b().R(i13).e0(str3).I(str4).j0(J).Q(i26).a0(f12).d0(i14).b0(bArr4).h0(i21).T(list3).M(mVar2);
            int i27 = i22;
            int i28 = i23;
            int i29 = i24;
            if (!(i27 == -1 && i28 == -1 && i29 == -1 && byteBuffer == null)) {
                if (byteBuffer != null) {
                    bArr5 = byteBuffer.array();
                }
                M.J(new d5.c(i27, i28, i29, bArr5));
            }
            cVar.f246b = M.E();
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[l0.p(4, 0, length)] && jArr[l0.p(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    public static int c(b0 b0Var, int i10, int i11, int i12) {
        int e10 = b0Var.e();
        i.a(e10 >= i11, null);
        while (e10 - i11 < i12) {
            b0Var.P(e10);
            int n10 = b0Var.n();
            i.a(n10 > 0, "childAtomSize must be positive");
            if (b0Var.n() == i10) {
                return e10;
            }
            e10 += n10;
        }
        return -1;
    }

    public static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(b0 b0Var) {
        int e10 = b0Var.e();
        b0Var.Q(4);
        if (b0Var.n() != 1751411826) {
            e10 += 4;
        }
        b0Var.P(e10);
    }

    public static void f(c5.b0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, q3.m r29, a4.b.c r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: a4.b.f(c5.b0, int, int, int, int, java.lang.String, boolean, q3.m, a4.b$c, int):void");
    }

    public static Pair<Integer, p> g(b0 b0Var, int i10, int i11) {
        int i12 = i10 + 8;
        boolean z10 = false;
        String str = null;
        Integer num = null;
        int i13 = -1;
        int i14 = 0;
        while (i12 - i10 < i11) {
            b0Var.P(i12);
            int n10 = b0Var.n();
            int n11 = b0Var.n();
            if (n11 == 1718775137) {
                num = Integer.valueOf(b0Var.n());
            } else if (n11 == 1935894637) {
                b0Var.Q(4);
                str = b0Var.A(4);
            } else if (n11 == 1935894633) {
                i13 = i12;
                i14 = n10;
            }
            i12 += n10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        i.a(num != null, "frma atom is mandatory");
        i.a(i13 != -1, "schi atom is mandatory");
        p t10 = t(b0Var, i13, i14, str);
        if (t10 != null) {
            z10 = true;
        }
        i.a(z10, "tenc atom is mandatory");
        return Pair.create(num, (p) l0.j(t10));
    }

    public static Pair<long[], long[]> h(a.C0011a aVar) {
        a.b g10 = aVar.g(1701606260);
        if (g10 == null) {
            return null;
        }
        b0 b0Var = g10.f234b;
        b0Var.P(8);
        int c10 = a4.a.c(b0Var.n());
        int H = b0Var.H();
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        for (int i10 = 0; i10 < H; i10++) {
            jArr[i10] = c10 == 1 ? b0Var.I() : b0Var.F();
            jArr2[i10] = c10 == 1 ? b0Var.w() : b0Var.n();
            if (b0Var.z() == 1) {
                b0Var.Q(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> i(b0 b0Var, int i10) {
        b0Var.P(i10 + 8 + 4);
        b0Var.Q(1);
        j(b0Var);
        b0Var.Q(2);
        int D = b0Var.D();
        if ((D & Log.TAG_YOUTUBE) != 0) {
            b0Var.Q(2);
        }
        if ((D & 64) != 0) {
            b0Var.Q(b0Var.J());
        }
        if ((D & 32) != 0) {
            b0Var.Q(2);
        }
        b0Var.Q(1);
        j(b0Var);
        String c10 = w.c(b0Var.D());
        if ("audio/mpeg".equals(c10) || "audio/vnd.dts".equals(c10) || "audio/vnd.dts.hd".equals(c10)) {
            return Pair.create(c10, null);
        }
        b0Var.Q(12);
        b0Var.Q(1);
        int j10 = j(b0Var);
        byte[] bArr = new byte[j10];
        b0Var.j(bArr, 0, j10);
        return Pair.create(c10, bArr);
    }

    public static int j(b0 b0Var) {
        int D = b0Var.D();
        int i10 = D & 127;
        while ((D & Log.TAG_YOUTUBE) == 128) {
            D = b0Var.D();
            i10 = (i10 << 7) | (D & 127);
        }
        return i10;
    }

    public static int k(b0 b0Var) {
        b0Var.P(16);
        return b0Var.n();
    }

    public static f4.a l(b0 b0Var, int i10) {
        b0Var.Q(8);
        ArrayList arrayList = new ArrayList();
        while (b0Var.e() < i10) {
            a.b c10 = h.c(b0Var);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f4.a(arrayList);
    }

    public static Pair<Long, String> m(b0 b0Var) {
        int i10 = 8;
        b0Var.P(8);
        int c10 = a4.a.c(b0Var.n());
        b0Var.Q(c10 == 0 ? 8 : 16);
        long F = b0Var.F();
        if (c10 == 0) {
            i10 = 4;
        }
        b0Var.Q(i10);
        int J = b0Var.J();
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) (((J >> 10) & 31) + 96));
        sb2.append((char) (((J >> 5) & 31) + 96));
        sb2.append((char) ((J & 31) + 96));
        return Pair.create(Long.valueOf(F), sb2.toString());
    }

    public static f4.a n(a.C0011a aVar) {
        a.b g10 = aVar.g(1751411826);
        a.b g11 = aVar.g(1801812339);
        a.b g12 = aVar.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || k(g10.f234b) != 1835299937) {
            return null;
        }
        b0 b0Var = g11.f234b;
        b0Var.P(12);
        int n10 = b0Var.n();
        String[] strArr = new String[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            int n11 = b0Var.n();
            b0Var.Q(4);
            strArr[i10] = b0Var.A(n11 - 8);
        }
        b0 b0Var2 = g12.f234b;
        b0Var2.P(8);
        ArrayList arrayList = new ArrayList();
        while (b0Var2.a() > 8) {
            int e10 = b0Var2.e();
            int n12 = b0Var2.n();
            int n13 = b0Var2.n() - 1;
            if (n13 < 0 || n13 >= n10) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Skipped metadata with unknown key index: ");
                sb2.append(n13);
                s.i("AtomParsers", sb2.toString());
            } else {
                l4.a f10 = h.f(b0Var2, e10 + n12, strArr[n13]);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            b0Var2.P(e10 + n12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f4.a(arrayList);
    }

    public static void o(b0 b0Var, int i10, int i11, int i12, c cVar) {
        b0Var.P(i11 + 8 + 8);
        if (i10 == 1835365492) {
            b0Var.x();
            String x10 = b0Var.x();
            if (x10 != null) {
                cVar.f246b = new q1.b().R(i12).e0(x10).E();
            }
        }
    }

    public static long p(b0 b0Var) {
        int i10 = 8;
        b0Var.P(8);
        if (a4.a.c(b0Var.n()) != 0) {
            i10 = 16;
        }
        b0Var.Q(i10);
        return b0Var.F();
    }

    public static float q(b0 b0Var, int i10) {
        b0Var.P(i10 + 8);
        return b0Var.H() / b0Var.H();
    }

    public static byte[] r(b0 b0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            b0Var.P(i12);
            int n10 = b0Var.n();
            if (b0Var.n() == 1886547818) {
                return Arrays.copyOfRange(b0Var.d(), i12, n10 + i12);
            }
            i12 += n10;
        }
        return null;
    }

    public static Pair<Integer, p> s(b0 b0Var, int i10, int i11) {
        Pair<Integer, p> g10;
        int e10 = b0Var.e();
        while (e10 - i10 < i11) {
            b0Var.P(e10);
            int n10 = b0Var.n();
            i.a(n10 > 0, "childAtomSize must be positive");
            if (b0Var.n() == 1936289382 && (g10 = g(b0Var, e10, n10)) != null) {
                return g10;
            }
            e10 += n10;
        }
        return null;
    }

    public static p t(b0 b0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            b0Var.P(i14);
            int n10 = b0Var.n();
            if (b0Var.n() == 1952804451) {
                int c10 = a4.a.c(b0Var.n());
                b0Var.Q(1);
                if (c10 == 0) {
                    b0Var.Q(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int D = b0Var.D();
                    i13 = (D & 240) >> 4;
                    i12 = D & 15;
                }
                boolean z10 = b0Var.D() == 1;
                int D2 = b0Var.D();
                byte[] bArr2 = new byte[16];
                b0Var.j(bArr2, 0, 16);
                if (z10 && D2 == 0) {
                    int D3 = b0Var.D();
                    bArr = new byte[D3];
                    b0Var.j(bArr, 0, D3);
                }
                return new p(z10, str, D2, bArr2, i13, i12, bArr);
            }
            i14 += n10;
        }
    }

    public static f4.a u(b0 b0Var, int i10) {
        b0Var.Q(12);
        while (b0Var.e() < i10) {
            int e10 = b0Var.e();
            int n10 = b0Var.n();
            if (b0Var.n() != 1935766900) {
                b0Var.P(e10 + n10);
            } else if (n10 < 14) {
                return null;
            } else {
                b0Var.Q(5);
                int D = b0Var.D();
                if (D != 12 && D != 13) {
                    return null;
                }
                float f10 = D == 12 ? 240.0f : 120.0f;
                b0Var.Q(1);
                return new f4.a(new l4.e(f10, b0Var.D()));
            }
        }
        return null;
    }

    public static a4.r v(a4.o r37, a4.a.C0011a r38, t3.o r39) {
        throw new UnsupportedOperationException("Method not decompiled: a4.b.v(a4.o, a4.a$a, t3.o):a4.r");
    }

    public static c w(b0 b0Var, int i10, int i11, String str, m mVar, boolean z10) {
        int i12;
        b0Var.P(12);
        int n10 = b0Var.n();
        c cVar = new c(n10);
        for (int i13 = 0; i13 < n10; i13++) {
            int e10 = b0Var.e();
            int n11 = b0Var.n();
            i.a(n11 > 0, "childAtomSize must be positive");
            int n12 = b0Var.n();
            if (n12 == 1635148593 || n12 == 1635148595 || n12 == 1701733238 || n12 == 1831958048 || n12 == 1836070006 || n12 == 1752589105 || n12 == 1751479857 || n12 == 1932670515 || n12 == 1211250227 || n12 == 1987063864 || n12 == 1987063865 || n12 == 1635135537 || n12 == 1685479798 || n12 == 1685479729 || n12 == 1685481573 || n12 == 1685481521) {
                i12 = e10;
                D(b0Var, n12, i12, n11, i10, i11, mVar, cVar, i13);
            } else if (n12 == 1836069985 || n12 == 1701733217 || n12 == 1633889587 || n12 == 1700998451 || n12 == 1633889588 || n12 == 1835823201 || n12 == 1685353315 || n12 == 1685353317 || n12 == 1685353320 || n12 == 1685353324 || n12 == 1685353336 || n12 == 1935764850 || n12 == 1935767394 || n12 == 1819304813 || n12 == 1936684916 || n12 == 1953984371 || n12 == 778924082 || n12 == 778924083 || n12 == 1835557169 || n12 == 1835560241 || n12 == 1634492771 || n12 == 1634492791 || n12 == 1970037111 || n12 == 1332770163 || n12 == 1716281667) {
                i12 = e10;
                f(b0Var, n12, e10, n11, i10, str, z10, mVar, cVar, i13);
            } else {
                if (n12 == 1414810956 || n12 == 1954034535 || n12 == 2004251764 || n12 == 1937010800 || n12 == 1664495672) {
                    x(b0Var, n12, e10, n11, i10, str, cVar);
                } else if (n12 == 1835365492) {
                    o(b0Var, n12, e10, i10, cVar);
                } else if (n12 == 1667329389) {
                    cVar.f246b = new q1.b().R(i10).e0("application/x-camera-motion").E();
                }
                i12 = e10;
            }
            b0Var.P(i12 + n11);
        }
        return cVar;
    }

    public static void x(b0 b0Var, int i10, int i11, int i12, int i13, String str, c cVar) {
        b0Var.P(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        q qVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                b0Var.j(bArr, 0, i14);
                qVar = q.E(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                cVar.f248d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f246b = new q1.b().R(i13).e0(str2).V(str).i0(j10).T(qVar).E();
    }

    public static f y(b0 b0Var) {
        boolean z10;
        int i10 = 8;
        b0Var.P(8);
        int c10 = a4.a.c(b0Var.n());
        b0Var.Q(c10 == 0 ? 8 : 16);
        int n10 = b0Var.n();
        b0Var.Q(4);
        int e10 = b0Var.e();
        if (c10 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (b0Var.d()[e10 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            b0Var.Q(i10);
        } else {
            long F = c10 == 0 ? b0Var.F() : b0Var.I();
            if (F != 0) {
                j10 = F;
            }
        }
        b0Var.Q(16);
        int n11 = b0Var.n();
        int n12 = b0Var.n();
        b0Var.Q(4);
        int n13 = b0Var.n();
        int n14 = b0Var.n();
        if (n11 == 0 && n12 == 65536 && n13 == -65536 && n14 == 0) {
            i11 = 90;
        } else if (n11 == 0 && n12 == -65536 && n13 == 65536 && n14 == 0) {
            i11 = 270;
        } else if (n11 == -65536 && n12 == 0 && n13 == 0 && n14 == -65536) {
            i11 = 180;
        }
        return new f(n10, j10, i11);
    }

    public static o z(a.C0011a aVar, a.b bVar, long j10, m mVar, boolean z10, boolean z11) {
        long j11;
        a.b bVar2;
        long[] jArr;
        long[] jArr2;
        a.C0011a f10;
        Pair<long[], long[]> h10;
        a.C0011a aVar2 = (a.C0011a) c5.a.e(aVar.f(1835297121));
        int d10 = d(k(((a.b) c5.a.e(aVar2.g(1751411826))).f234b));
        if (d10 == -1) {
            return null;
        }
        f y10 = y(((a.b) c5.a.e(aVar.g(1953196132))).f234b);
        long j12 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = y10.f258b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long p10 = p(bVar2.f234b);
        if (j11 != -9223372036854775807L) {
            j12 = l0.z0(j11, 1000000L, p10);
        }
        long j13 = j12;
        Pair<Long, String> m10 = m(((a.b) c5.a.e(aVar2.g(1835296868))).f234b);
        c w10 = w(((a.b) c5.a.e(((a.C0011a) c5.a.e(((a.C0011a) c5.a.e(aVar2.f(1835626086))).f(1937007212))).g(1937011556))).f234b, y10.f257a, y10.f259c, (String) m10.second, mVar, z11);
        if (z10 || (f10 = aVar.f(1701082227)) == null || (h10 = h(f10)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr2 = (long[]) h10.first;
            jArr = (long[]) h10.second;
        }
        if (w10.f246b == null) {
            return null;
        }
        return new o(y10.f257a, d10, ((Long) m10.first).longValue(), p10, j13, w10.f246b, w10.f248d, w10.f245a, w10.f247c, jArr2, jArr);
    }
}
