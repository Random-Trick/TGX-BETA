package p245r4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import p020b5.C1187a0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p217p4.C8032b;

public final class C8361b {
    public static final byte[] f27081h = {0, 7, 8, 15};
    public static final byte[] f27082i = {0, 119, -120, -1};
    public static final byte[] f27083j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f27084a;
    public final Paint f27085b;
    public final Canvas f27086c = new Canvas();
    public final C8363b f27087d = new C8363b(719, 575, 0, 719, 0, 575);
    public final C8362a f27088e = new C8362a(0, m12671c(), m12670d(), m12669e());
    public final C8369h f27089f;
    public Bitmap f27090g;

    public static final class C8362a {
        public final int f27091a;
        public final int[] f27092b;
        public final int[] f27093c;
        public final int[] f27094d;

        public C8362a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f27091a = i;
            this.f27092b = iArr;
            this.f27093c = iArr2;
            this.f27094d = iArr3;
        }
    }

    public static final class C8363b {
        public final int f27095a;
        public final int f27096b;
        public final int f27097c;
        public final int f27098d;
        public final int f27099e;
        public final int f27100f;

        public C8363b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f27095a = i;
            this.f27096b = i2;
            this.f27097c = i3;
            this.f27098d = i4;
            this.f27099e = i5;
            this.f27100f = i6;
        }
    }

    public static final class C8364c {
        public final int f27101a;
        public final boolean f27102b;
        public final byte[] f27103c;
        public final byte[] f27104d;

        public C8364c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f27101a = i;
            this.f27102b = z;
            this.f27103c = bArr;
            this.f27104d = bArr2;
        }
    }

    public static final class C8365d {
        public final int f27105a;
        public final int f27106b;
        public final int f27107c;
        public final SparseArray<C8366e> f27108d;

        public C8365d(int i, int i2, int i3, SparseArray<C8366e> sparseArray) {
            this.f27105a = i;
            this.f27106b = i2;
            this.f27107c = i3;
            this.f27108d = sparseArray;
        }
    }

    public static final class C8366e {
        public final int f27109a;
        public final int f27110b;

        public C8366e(int i, int i2) {
            this.f27109a = i;
            this.f27110b = i2;
        }
    }

    public static final class C8367f {
        public final int f27111a;
        public final boolean f27112b;
        public final int f27113c;
        public final int f27114d;
        public final int f27115e;
        public final int f27116f;
        public final int f27117g;
        public final int f27118h;
        public final int f27119i;
        public final int f27120j;
        public final SparseArray<C8368g> f27121k;

        public C8367f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C8368g> sparseArray) {
            this.f27111a = i;
            this.f27112b = z;
            this.f27113c = i2;
            this.f27114d = i3;
            this.f27115e = i4;
            this.f27116f = i5;
            this.f27117g = i6;
            this.f27118h = i7;
            this.f27119i = i8;
            this.f27120j = i9;
            this.f27121k = sparseArray;
        }

        public void m12655a(C8367f fVar) {
            SparseArray<C8368g> sparseArray = fVar.f27121k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f27121k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    public static final class C8368g {
        public final int f27122a;
        public final int f27123b;
        public final int f27124c;
        public final int f27125d;
        public final int f27126e;
        public final int f27127f;

        public C8368g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f27122a = i;
            this.f27123b = i2;
            this.f27124c = i3;
            this.f27125d = i4;
            this.f27126e = i5;
            this.f27127f = i6;
        }
    }

    public static final class C8369h {
        public final int f27128a;
        public final int f27129b;
        public final SparseArray<C8367f> f27130c = new SparseArray<>();
        public final SparseArray<C8362a> f27131d = new SparseArray<>();
        public final SparseArray<C8364c> f27132e = new SparseArray<>();
        public final SparseArray<C8362a> f27133f = new SparseArray<>();
        public final SparseArray<C8364c> f27134g = new SparseArray<>();
        public C8363b f27135h;
        public C8365d f27136i;

        public C8369h(int i, int i2) {
            this.f27128a = i;
            this.f27129b = i2;
        }

        public void m12654a() {
            this.f27130c.clear();
            this.f27131d.clear();
            this.f27132e.clear();
            this.f27133f.clear();
            this.f27134g.clear();
            this.f27135h = null;
            this.f27136i = null;
        }
    }

    public C8361b(int i, int i2) {
        Paint paint = new Paint();
        this.f27084a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f27085b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f27089f = new C8369h(i, i2);
    }

    public static byte[] m12673a(int i, int i2, C1187a0 a0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) a0Var.m38176h(i2);
        }
        return bArr;
    }

    public static int[] m12671c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] m12670d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m12668f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m12668f(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    public static int[] m12669e() {
        int[] iArr = new int[Log.TAG_CRASH];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m12668f(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m12668f(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m12668f(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m12668f(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m12668f(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    public static int m12668f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int m12667g(p020b5.C1187a0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: p245r4.C8361b.m12667g(b5.a0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int m12666h(p020b5.C1187a0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: p245r4.C8361b.m12666h(b5.a0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int m12665i(C1187a0 a0Var, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        boolean z;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte h = a0Var.m38176h(8);
            if (h != 0) {
                z = z2;
                i3 = 1;
            } else if (!a0Var.m38177g()) {
                int h2 = a0Var.m38176h(7);
                if (h2 != 0) {
                    z = z2;
                    i3 = h2;
                    h = 0;
                } else {
                    h = 0;
                    z = true;
                    i3 = 0;
                }
            } else {
                z = z2;
                i3 = a0Var.m38176h(7);
                h = a0Var.m38176h(8);
            }
            if (!(i3 == 0 || paint == null)) {
                if (bArr != null) {
                    h = bArr[h];
                }
                paint.setColor(iArr[h]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    public static void m12664j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C1187a0 a0Var = new C1187a0(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (a0Var.m38182b() != 0) {
            int h = a0Var.m38176h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArr5 == null ? f27082i : bArr5;
                        } else if (i == 2) {
                            bArr3 = bArr7 == null ? f27081h : bArr7;
                        } else {
                            bArr2 = null;
                            i4 = m12667g(a0Var, iArr, bArr2, i4, i5, paint, canvas);
                            a0Var.m38181c();
                            continue;
                        }
                        bArr2 = bArr3;
                        i4 = m12667g(a0Var, iArr, bArr2, i4, i5, paint, canvas);
                        a0Var.m38181c();
                        continue;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArr6 == null ? f27083j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i4 = m12666h(a0Var, iArr, bArr4, i4, i5, paint, canvas);
                        a0Var.m38181c();
                        continue;
                    case 18:
                        i4 = m12665i(a0Var, iArr, null, i4, i5, paint, canvas);
                        continue;
                    default:
                        switch (h) {
                            case Log.TAG_IMAGE_LOADER:
                                bArr7 = m12673a(4, 4, a0Var);
                                continue;
                            case 33:
                                bArr5 = m12673a(4, 8, a0Var);
                                continue;
                            case 34:
                                bArr6 = m12673a(16, 8, a0Var);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }

    public static void m12663k(C8364c cVar, C8362a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f27094d;
        } else if (i == 2) {
            iArr = aVar.f27093c;
        } else {
            iArr = aVar.f27092b;
        }
        int[] iArr2 = iArr;
        m12664j(cVar.f27103c, iArr2, i, i2, i3, paint, canvas);
        m12664j(cVar.f27104d, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    public static C8362a m12662l(C1187a0 a0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int h = a0Var.m38176h(8);
        a0Var.m38166r(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m12671c();
        int[] d = m12670d();
        int[] e = m12669e();
        while (i9 > 0) {
            int h2 = a0Var.m38176h(i7);
            int h3 = a0Var.m38176h(i7);
            int i10 = i9 - 2;
            int[] iArr = (h3 & Log.TAG_YOUTUBE) != 0 ? c : (h3 & 64) != 0 ? d : e;
            if ((h3 & 1) != 0) {
                i5 = a0Var.m38176h(i7);
                i4 = a0Var.m38176h(i7);
                i3 = a0Var.m38176h(i7);
                i2 = a0Var.m38176h(i7);
                i6 = i10 - 4;
            } else {
                i5 = a0Var.m38176h(6) << i8;
                i4 = a0Var.m38176h(4) << 4;
                i3 = a0Var.m38176h(4) << 4;
                i2 = a0Var.m38176h(i8) << 6;
                i6 = i10 - 2;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            i9 = i6;
            double d2 = i5;
            h = h;
            double d3 = i4 - 128;
            double d4 = i3 - 128;
            iArr[h2] = m12668f((byte) (255 - (i2 & 255)), C1216l0.m37959p((int) (d2 + (1.402d * d3)), 0, 255), C1216l0.m37959p((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C1216l0.m37959p((int) (d2 + (d4 * 1.772d)), 0, 255));
            i7 = 8;
            i8 = 2;
        }
        return new C8362a(h, c, d, e);
    }

    public static C8363b m12661m(C1187a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        a0Var.m38166r(4);
        boolean g = a0Var.m38177g();
        a0Var.m38166r(3);
        int h = a0Var.m38176h(16);
        int h2 = a0Var.m38176h(16);
        if (g) {
            int h3 = a0Var.m38176h(16);
            int h4 = a0Var.m38176h(16);
            int h5 = a0Var.m38176h(16);
            i = a0Var.m38176h(16);
            i3 = h4;
            i2 = h5;
            i4 = h3;
        } else {
            i3 = h;
            i = h2;
            i4 = 0;
            i2 = 0;
        }
        return new C8363b(h, h2, i4, i3, i2, i);
    }

    public static C8364c m12660n(C1187a0 a0Var) {
        byte[] bArr;
        int h = a0Var.m38176h(16);
        a0Var.m38166r(4);
        int h2 = a0Var.m38176h(2);
        boolean g = a0Var.m38177g();
        a0Var.m38166r(1);
        byte[] bArr2 = C1216l0.f4531f;
        if (h2 == 1) {
            a0Var.m38166r(a0Var.m38176h(8) * 16);
        } else if (h2 == 0) {
            int h3 = a0Var.m38176h(16);
            int h4 = a0Var.m38176h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                a0Var.m38173k(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                a0Var.m38173k(bArr, 0, h4);
                return new C8364c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C8364c(h, g, bArr2, bArr);
    }

    public static C8365d m12659o(C1187a0 a0Var, int i) {
        int h = a0Var.m38176h(8);
        int h2 = a0Var.m38176h(4);
        int h3 = a0Var.m38176h(2);
        a0Var.m38166r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = a0Var.m38176h(8);
            a0Var.m38166r(8);
            i2 -= 6;
            sparseArray.put(h4, new C8366e(a0Var.m38176h(16), a0Var.m38176h(16)));
        }
        return new C8365d(h, h2, h3, sparseArray);
    }

    public static C8367f m12658p(C1187a0 a0Var, int i) {
        int i2;
        int i3;
        int h = a0Var.m38176h(8);
        a0Var.m38166r(4);
        boolean g = a0Var.m38177g();
        a0Var.m38166r(3);
        int i4 = 16;
        int h2 = a0Var.m38176h(16);
        int h3 = a0Var.m38176h(16);
        int h4 = a0Var.m38176h(3);
        int h5 = a0Var.m38176h(3);
        int i5 = 2;
        a0Var.m38166r(2);
        int h6 = a0Var.m38176h(8);
        int h7 = a0Var.m38176h(8);
        int h8 = a0Var.m38176h(4);
        int h9 = a0Var.m38176h(2);
        a0Var.m38166r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = a0Var.m38176h(i4);
            int h11 = a0Var.m38176h(i5);
            int h12 = a0Var.m38176h(i5);
            int h13 = a0Var.m38176h(12);
            h9 = h9;
            a0Var.m38166r(4);
            int h14 = a0Var.m38176h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = a0Var.m38176h(8);
                i2 = a0Var.m38176h(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            sparseArray.put(h10, new C8368g(h11, h12, h13, h14, i3, i2));
            i5 = 2;
            i4 = 16;
        }
        return new C8367f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
    }

    public static void m12657q(C1187a0 a0Var, C8369h hVar) {
        C8367f fVar;
        int h = a0Var.m38176h(8);
        int h2 = a0Var.m38176h(16);
        int h3 = a0Var.m38176h(16);
        int d = a0Var.m38180d() + h3;
        if (h3 * 8 > a0Var.m38182b()) {
            C1230s.m37884i("DvbParser", "Data field length exceeds limit");
            a0Var.m38166r(a0Var.m38182b());
            return;
        }
        switch (h) {
            case 16:
                if (h2 == hVar.f27128a) {
                    C8365d dVar = hVar.f27136i;
                    C8365d o = m12659o(a0Var, h3);
                    if (o.f27107c == 0) {
                        if (!(dVar == null || dVar.f27106b == o.f27106b)) {
                            hVar.f27136i = o;
                            break;
                        }
                    } else {
                        hVar.f27136i = o;
                        hVar.f27130c.clear();
                        hVar.f27131d.clear();
                        hVar.f27132e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C8365d dVar2 = hVar.f27136i;
                if (h2 == hVar.f27128a && dVar2 != null) {
                    C8367f p = m12658p(a0Var, h3);
                    if (dVar2.f27107c == 0 && (fVar = hVar.f27130c.get(p.f27111a)) != null) {
                        p.m12655a(fVar);
                    }
                    hVar.f27130c.put(p.f27111a, p);
                    break;
                }
                break;
            case 18:
                if (h2 != hVar.f27128a) {
                    if (h2 == hVar.f27129b) {
                        C8362a l = m12662l(a0Var, h3);
                        hVar.f27133f.put(l.f27091a, l);
                        break;
                    }
                } else {
                    C8362a l2 = m12662l(a0Var, h3);
                    hVar.f27131d.put(l2.f27091a, l2);
                    break;
                }
                break;
            case 19:
                if (h2 != hVar.f27128a) {
                    if (h2 == hVar.f27129b) {
                        C8364c n = m12660n(a0Var);
                        hVar.f27134g.put(n.f27101a, n);
                        break;
                    }
                } else {
                    C8364c n2 = m12660n(a0Var);
                    hVar.f27132e.put(n2.f27101a, n2);
                    break;
                }
                break;
            case 20:
                if (h2 == hVar.f27128a) {
                    hVar.f27135h = m12661m(a0Var);
                    break;
                }
                break;
        }
        a0Var.m38165s(d - a0Var.m38180d());
    }

    public List<C8032b> m12672b(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<C8368g> sparseArray;
        C1187a0 a0Var = new C1187a0(bArr, i);
        while (a0Var.m38182b() >= 48 && a0Var.m38176h(8) == 15) {
            m12657q(a0Var, this.f27089f);
        }
        C8369h hVar = this.f27089f;
        C8365d dVar = hVar.f27136i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C8363b bVar = hVar.f27135h;
        if (bVar == null) {
            bVar = this.f27087d;
        }
        Bitmap bitmap = this.f27090g;
        if (!(bitmap != null && bVar.f27095a + 1 == bitmap.getWidth() && bVar.f27096b + 1 == this.f27090g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f27095a + 1, bVar.f27096b + 1, Bitmap.Config.ARGB_8888);
            this.f27090g = createBitmap;
            this.f27086c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C8366e> sparseArray2 = dVar.f27108d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f27086c.save();
            C8366e valueAt = sparseArray2.valueAt(i4);
            C8367f fVar = this.f27089f.f27130c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f27109a + bVar.f27097c;
            int i6 = valueAt.f27110b + bVar.f27099e;
            this.f27086c.clipRect(i5, i6, Math.min(fVar.f27113c + i5, bVar.f27098d), Math.min(fVar.f27114d + i6, bVar.f27100f));
            C8362a aVar = this.f27089f.f27131d.get(fVar.f27117g);
            if (aVar == null && (aVar = this.f27089f.f27133f.get(fVar.f27117g)) == null) {
                aVar = this.f27088e;
            }
            SparseArray<C8368g> sparseArray3 = fVar.f27121k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C8368g valueAt2 = sparseArray3.valueAt(i7);
                C8364c cVar = this.f27089f.f27132e.get(keyAt);
                C8364c cVar2 = cVar == null ? this.f27089f.f27134g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m12663k(cVar2, aVar, fVar.f27116f, valueAt2.f27124c + i5, i6 + valueAt2.f27125d, cVar2.f27102b ? null : this.f27084a, this.f27086c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f27112b) {
                int i8 = fVar.f27116f;
                if (i8 == 3) {
                    i2 = aVar.f27094d[fVar.f27118h];
                } else if (i8 == 2) {
                    i2 = aVar.f27093c[fVar.f27119i];
                } else {
                    i2 = aVar.f27092b[fVar.f27120j];
                }
                this.f27085b.setColor(i2);
                this.f27086c.drawRect(i5, i6, fVar.f27113c + i5, fVar.f27114d + i6, this.f27085b);
            }
            arrayList.add(new C8032b.C8034b().m13751f(Bitmap.createBitmap(this.f27090g, i5, i6, fVar.f27113c, fVar.f27114d)).m13746k(i5 / bVar.f27095a).m13745l(0).m13749h(i6 / bVar.f27096b, 0).m13748i(0).m13743n(fVar.f27113c / bVar.f27095a).m13750g(fVar.f27114d / bVar.f27096b).m13756a());
            this.f27086c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f27086c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void m12656r() {
        this.f27089f.m12654a();
    }
}
