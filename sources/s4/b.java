package s4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c5.a0;
import c5.l0;
import c5.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import q4.b;

public final class b {
    public static final byte[] f22471h = {0, 7, 8, 15};
    public static final byte[] f22472i = {0, 119, -120, -1};
    public static final byte[] f22473j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f22474a;
    public final Paint f22475b;
    public final Canvas f22476c = new Canvas();
    public final C0211b f22477d = new C0211b(719, 575, 0, 719, 0, 575);
    public final a f22478e = new a(0, c(), d(), e());
    public final h f22479f;
    public Bitmap f22480g;

    public static final class a {
        public final int f22481a;
        public final int[] f22482b;
        public final int[] f22483c;
        public final int[] f22484d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f22481a = i10;
            this.f22482b = iArr;
            this.f22483c = iArr2;
            this.f22484d = iArr3;
        }
    }

    public static final class C0211b {
        public final int f22485a;
        public final int f22486b;
        public final int f22487c;
        public final int f22488d;
        public final int f22489e;
        public final int f22490f;

        public C0211b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f22485a = i10;
            this.f22486b = i11;
            this.f22487c = i12;
            this.f22488d = i13;
            this.f22489e = i14;
            this.f22490f = i15;
        }
    }

    public static final class c {
        public final int f22491a;
        public final boolean f22492b;
        public final byte[] f22493c;
        public final byte[] f22494d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f22491a = i10;
            this.f22492b = z10;
            this.f22493c = bArr;
            this.f22494d = bArr2;
        }
    }

    public static final class d {
        public final int f22495a;
        public final int f22496b;
        public final int f22497c;
        public final SparseArray<e> f22498d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f22495a = i10;
            this.f22496b = i11;
            this.f22497c = i12;
            this.f22498d = sparseArray;
        }
    }

    public static final class e {
        public final int f22499a;
        public final int f22500b;

        public e(int i10, int i11) {
            this.f22499a = i10;
            this.f22500b = i11;
        }
    }

    public static final class f {
        public final int f22501a;
        public final boolean f22502b;
        public final int f22503c;
        public final int f22504d;
        public final int f22505e;
        public final int f22506f;
        public final int f22507g;
        public final int f22508h;
        public final int f22509i;
        public final int f22510j;
        public final SparseArray<g> f22511k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f22501a = i10;
            this.f22502b = z10;
            this.f22503c = i11;
            this.f22504d = i12;
            this.f22505e = i13;
            this.f22506f = i14;
            this.f22507g = i15;
            this.f22508h = i16;
            this.f22509i = i17;
            this.f22510j = i18;
            this.f22511k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f22511k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f22511k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    public static final class g {
        public final int f22512a;
        public final int f22513b;
        public final int f22514c;
        public final int f22515d;
        public final int f22516e;
        public final int f22517f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f22512a = i10;
            this.f22513b = i11;
            this.f22514c = i12;
            this.f22515d = i13;
            this.f22516e = i14;
            this.f22517f = i15;
        }
    }

    public static final class h {
        public final int f22518a;
        public final int f22519b;
        public final SparseArray<f> f22520c = new SparseArray<>();
        public final SparseArray<a> f22521d = new SparseArray<>();
        public final SparseArray<c> f22522e = new SparseArray<>();
        public final SparseArray<a> f22523f = new SparseArray<>();
        public final SparseArray<c> f22524g = new SparseArray<>();
        public C0211b f22525h;
        public d f22526i;

        public h(int i10, int i11) {
            this.f22518a = i10;
            this.f22519b = i11;
        }

        public void a() {
            this.f22520c.clear();
            this.f22521d.clear();
            this.f22522e.clear();
            this.f22523f.clear();
            this.f22524g.clear();
            this.f22525h = null;
            this.f22526i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f22474a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f22475b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f22479f = new h(i10, i11);
    }

    public static byte[] a(int i10, int i11, a0 a0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) a0Var.h(i11);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = 127;
                int i12 = (i10 & 1) != 0 ? 127 : 0;
                int i13 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = f(255, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[Log.TAG_CRASH];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 255;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = f(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                int i15 = 170;
                int i16 = 85;
                if (i14 == 0) {
                    int i17 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i18 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = f(255, i17, i18, i16 + i15);
                } else if (i14 != 8) {
                    int i19 = 43;
                    if (i14 == 128) {
                        int i20 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i21 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        int i22 = i19 + 127;
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i20, i21, i22 + i16);
                    } else if (i14 == 136) {
                        int i23 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i24 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i23, i24, i19 + i16);
                    }
                } else {
                    int i25 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i26 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = f(127, i25, i26, i16 + i15);
                }
            }
        }
        return iArr;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int g(c5.a0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.b.g(c5.a0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int h(c5.a0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.b.h(c5.a0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int i(a0 a0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        boolean z10;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            byte h10 = a0Var.h(8);
            if (h10 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (!a0Var.g()) {
                int h11 = a0Var.h(7);
                if (h11 != 0) {
                    z10 = z11;
                    i12 = h11;
                    h10 = 0;
                } else {
                    h10 = 0;
                    z10 = true;
                    i12 = 0;
                }
            } else {
                z10 = z11;
                i12 = a0Var.h(7);
                h10 = a0Var.h(8);
            }
            if (!(i12 == 0 || paint == null)) {
                if (bArr != null) {
                    h10 = bArr[h10];
                }
                paint.setColor(iArr[h10]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    public static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        a0 a0Var = new a0(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (a0Var.b() != 0) {
            int h10 = a0Var.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i10 == 3) {
                            bArr3 = bArr5 == null ? f22472i : bArr5;
                        } else if (i10 == 2) {
                            bArr3 = bArr7 == null ? f22471h : bArr7;
                        } else {
                            bArr2 = null;
                            i13 = g(a0Var, iArr, bArr2, i13, i14, paint, canvas);
                            a0Var.c();
                            continue;
                        }
                        bArr2 = bArr3;
                        i13 = g(a0Var, iArr, bArr2, i13, i14, paint, canvas);
                        a0Var.c();
                        continue;
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f22473j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = h(a0Var, iArr, bArr4, i13, i14, paint, canvas);
                        a0Var.c();
                        continue;
                    case 18:
                        i13 = i(a0Var, iArr, null, i13, i14, paint, canvas);
                        continue;
                    default:
                        switch (h10) {
                            case Log.TAG_IMAGE_LOADER:
                                bArr7 = a(4, 4, a0Var);
                                continue;
                            case 33:
                                bArr5 = a(4, 8, a0Var);
                                continue;
                            case 34:
                                bArr6 = a(16, 8, a0Var);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    public static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f22484d;
        } else if (i10 == 2) {
            iArr = aVar.f22483c;
        } else {
            iArr = aVar.f22482b;
        }
        int[] iArr2 = iArr;
        j(cVar.f22493c, iArr2, i10, i11, i12, paint, canvas);
        j(cVar.f22494d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    public static a l(a0 a0Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int h10 = a0Var.h(8);
        a0Var.r(8);
        int i17 = 2;
        int i18 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i18 > 0) {
            int h11 = a0Var.h(i16);
            int h12 = a0Var.h(i16);
            int i19 = i18 - 2;
            int[] iArr = (h12 & Log.TAG_YOUTUBE) != 0 ? c10 : (h12 & 64) != 0 ? d10 : e10;
            if ((h12 & 1) != 0) {
                i14 = a0Var.h(i16);
                i13 = a0Var.h(i16);
                i12 = a0Var.h(i16);
                i11 = a0Var.h(i16);
                i15 = i19 - 4;
            } else {
                i14 = a0Var.h(6) << i17;
                i13 = a0Var.h(4) << 4;
                i12 = a0Var.h(4) << 4;
                i11 = a0Var.h(i17) << 6;
                i15 = i19 - 2;
            }
            if (i14 == 0) {
                i13 = 0;
                i12 = 0;
                i11 = 255;
            }
            i18 = i15;
            double d11 = i14;
            h10 = h10;
            double d12 = i13 - 128;
            double d13 = i12 - 128;
            iArr[h11] = f((byte) (255 - (i11 & 255)), l0.p((int) (d11 + (1.402d * d12)), 0, 255), l0.p((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), l0.p((int) (d11 + (d13 * 1.772d)), 0, 255));
            i16 = 8;
            i17 = 2;
        }
        return new a(h10, c10, d10, e10);
    }

    public static C0211b m(a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        a0Var.r(4);
        boolean g10 = a0Var.g();
        a0Var.r(3);
        int h10 = a0Var.h(16);
        int h11 = a0Var.h(16);
        if (g10) {
            int h12 = a0Var.h(16);
            int h13 = a0Var.h(16);
            int h14 = a0Var.h(16);
            i10 = a0Var.h(16);
            i12 = h13;
            i11 = h14;
            i13 = h12;
        } else {
            i12 = h10;
            i10 = h11;
            i13 = 0;
            i11 = 0;
        }
        return new C0211b(h10, h11, i13, i12, i11, i10);
    }

    public static c n(a0 a0Var) {
        byte[] bArr;
        int h10 = a0Var.h(16);
        a0Var.r(4);
        int h11 = a0Var.h(2);
        boolean g10 = a0Var.g();
        a0Var.r(1);
        byte[] bArr2 = l0.f4846f;
        if (h11 == 1) {
            a0Var.r(a0Var.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = a0Var.h(16);
            int h13 = a0Var.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                a0Var.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                a0Var.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    public static d o(a0 a0Var, int i10) {
        int h10 = a0Var.h(8);
        int h11 = a0Var.h(4);
        int h12 = a0Var.h(2);
        a0Var.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = a0Var.h(8);
            a0Var.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(a0Var.h(16), a0Var.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    public static f p(a0 a0Var, int i10) {
        int i11;
        int i12;
        int h10 = a0Var.h(8);
        a0Var.r(4);
        boolean g10 = a0Var.g();
        a0Var.r(3);
        int i13 = 16;
        int h11 = a0Var.h(16);
        int h12 = a0Var.h(16);
        int h13 = a0Var.h(3);
        int h14 = a0Var.h(3);
        int i14 = 2;
        a0Var.r(2);
        int h15 = a0Var.h(8);
        int h16 = a0Var.h(8);
        int h17 = a0Var.h(4);
        int h18 = a0Var.h(2);
        a0Var.r(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int h19 = a0Var.h(i13);
            int h20 = a0Var.h(i14);
            int h21 = a0Var.h(i14);
            int h22 = a0Var.h(12);
            h18 = h18;
            a0Var.r(4);
            int h23 = a0Var.h(12);
            i15 -= 6;
            if (h20 == 1 || h20 == 2) {
                i15 -= 2;
                i12 = a0Var.h(8);
                i11 = a0Var.h(8);
            } else {
                i12 = 0;
                i11 = 0;
            }
            sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
            i14 = 2;
            i13 = 16;
        }
        return new f(h10, g10, h11, h12, h13, h14, h15, h16, h17, h18, sparseArray);
    }

    public static void q(a0 a0Var, h hVar) {
        f fVar;
        int h10 = a0Var.h(8);
        int h11 = a0Var.h(16);
        int h12 = a0Var.h(16);
        int d10 = a0Var.d() + h12;
        if (h12 * 8 > a0Var.b()) {
            s.i("DvbParser", "Data field length exceeds limit");
            a0Var.r(a0Var.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f22518a) {
                    d dVar = hVar.f22526i;
                    d o10 = o(a0Var, h12);
                    if (o10.f22497c == 0) {
                        if (!(dVar == null || dVar.f22496b == o10.f22496b)) {
                            hVar.f22526i = o10;
                            break;
                        }
                    } else {
                        hVar.f22526i = o10;
                        hVar.f22520c.clear();
                        hVar.f22521d.clear();
                        hVar.f22522e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f22526i;
                if (h11 == hVar.f22518a && dVar2 != null) {
                    f p10 = p(a0Var, h12);
                    if (dVar2.f22497c == 0 && (fVar = hVar.f22520c.get(p10.f22501a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f22520c.put(p10.f22501a, p10);
                    break;
                }
                break;
            case 18:
                if (h11 != hVar.f22518a) {
                    if (h11 == hVar.f22519b) {
                        a l10 = l(a0Var, h12);
                        hVar.f22523f.put(l10.f22481a, l10);
                        break;
                    }
                } else {
                    a l11 = l(a0Var, h12);
                    hVar.f22521d.put(l11.f22481a, l11);
                    break;
                }
                break;
            case 19:
                if (h11 != hVar.f22518a) {
                    if (h11 == hVar.f22519b) {
                        c n10 = n(a0Var);
                        hVar.f22524g.put(n10.f22491a, n10);
                        break;
                    }
                } else {
                    c n11 = n(a0Var);
                    hVar.f22522e.put(n11.f22491a, n11);
                    break;
                }
                break;
            case 20:
                if (h11 == hVar.f22518a) {
                    hVar.f22525h = m(a0Var);
                    break;
                }
                break;
        }
        a0Var.s(d10 - a0Var.d());
    }

    public List<q4.b> b(byte[] bArr, int i10) {
        int i11;
        int i12;
        SparseArray<g> sparseArray;
        a0 a0Var = new a0(bArr, i10);
        while (a0Var.b() >= 48 && a0Var.h(8) == 15) {
            q(a0Var, this.f22479f);
        }
        h hVar = this.f22479f;
        d dVar = hVar.f22526i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0211b bVar = hVar.f22525h;
        if (bVar == null) {
            bVar = this.f22477d;
        }
        Bitmap bitmap = this.f22480g;
        if (!(bitmap != null && bVar.f22485a + 1 == bitmap.getWidth() && bVar.f22486b + 1 == this.f22480g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f22485a + 1, bVar.f22486b + 1, Bitmap.Config.ARGB_8888);
            this.f22480g = createBitmap;
            this.f22476c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f22498d;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f22476c.save();
            e valueAt = sparseArray2.valueAt(i13);
            f fVar = this.f22479f.f22520c.get(sparseArray2.keyAt(i13));
            int i14 = valueAt.f22499a + bVar.f22487c;
            int i15 = valueAt.f22500b + bVar.f22489e;
            this.f22476c.clipRect(i14, i15, Math.min(fVar.f22503c + i14, bVar.f22488d), Math.min(fVar.f22504d + i15, bVar.f22490f));
            a aVar = this.f22479f.f22521d.get(fVar.f22507g);
            if (aVar == null && (aVar = this.f22479f.f22523f.get(fVar.f22507g)) == null) {
                aVar = this.f22478e;
            }
            SparseArray<g> sparseArray3 = fVar.f22511k;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g valueAt2 = sparseArray3.valueAt(i16);
                c cVar = this.f22479f.f22522e.get(keyAt);
                c cVar2 = cVar == null ? this.f22479f.f22524g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i12 = i16;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f22506f, valueAt2.f22514c + i14, i15 + valueAt2.f22515d, cVar2.f22492b ? null : this.f22474a, this.f22476c);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f22502b) {
                int i17 = fVar.f22506f;
                if (i17 == 3) {
                    i11 = aVar.f22484d[fVar.f22508h];
                } else if (i17 == 2) {
                    i11 = aVar.f22483c[fVar.f22509i];
                } else {
                    i11 = aVar.f22482b[fVar.f22510j];
                }
                this.f22475b.setColor(i11);
                this.f22476c.drawRect(i14, i15, fVar.f22503c + i14, fVar.f22504d + i15, this.f22475b);
            }
            arrayList.add(new b.C0195b().f(Bitmap.createBitmap(this.f22480g, i14, i15, fVar.f22503c, fVar.f22504d)).k(i14 / bVar.f22485a).l(0).h(i15 / bVar.f22486b, 0).i(0).n(fVar.f22503c / bVar.f22485a).g(fVar.f22504d / bVar.f22486b).a());
            this.f22476c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f22476c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f22479f.a();
    }
}
