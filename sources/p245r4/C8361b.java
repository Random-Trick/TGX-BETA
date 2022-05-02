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
    public static final byte[] f27078h = {0, 7, 8, 15};
    public static final byte[] f27079i = {0, 119, -120, -1};
    public static final byte[] f27080j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f27081a;
    public final Paint f27082b;
    public final Canvas f27083c = new Canvas();
    public final C8363b f27084d = new C8363b(719, 575, 0, 719, 0, 575);
    public final C8362a f27085e = new C8362a(0, m12672c(), m12671d(), m12670e());
    public final C8369h f27086f;
    public Bitmap f27087g;

    public static final class C8362a {
        public final int f27088a;
        public final int[] f27089b;
        public final int[] f27090c;
        public final int[] f27091d;

        public C8362a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f27088a = i;
            this.f27089b = iArr;
            this.f27090c = iArr2;
            this.f27091d = iArr3;
        }
    }

    public static final class C8363b {
        public final int f27092a;
        public final int f27093b;
        public final int f27094c;
        public final int f27095d;
        public final int f27096e;
        public final int f27097f;

        public C8363b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f27092a = i;
            this.f27093b = i2;
            this.f27094c = i3;
            this.f27095d = i4;
            this.f27096e = i5;
            this.f27097f = i6;
        }
    }

    public static final class C8364c {
        public final int f27098a;
        public final boolean f27099b;
        public final byte[] f27100c;
        public final byte[] f27101d;

        public C8364c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f27098a = i;
            this.f27099b = z;
            this.f27100c = bArr;
            this.f27101d = bArr2;
        }
    }

    public static final class C8365d {
        public final int f27102a;
        public final int f27103b;
        public final int f27104c;
        public final SparseArray<C8366e> f27105d;

        public C8365d(int i, int i2, int i3, SparseArray<C8366e> sparseArray) {
            this.f27102a = i;
            this.f27103b = i2;
            this.f27104c = i3;
            this.f27105d = sparseArray;
        }
    }

    public static final class C8366e {
        public final int f27106a;
        public final int f27107b;

        public C8366e(int i, int i2) {
            this.f27106a = i;
            this.f27107b = i2;
        }
    }

    public static final class C8367f {
        public final int f27108a;
        public final boolean f27109b;
        public final int f27110c;
        public final int f27111d;
        public final int f27112e;
        public final int f27113f;
        public final int f27114g;
        public final int f27115h;
        public final int f27116i;
        public final int f27117j;
        public final SparseArray<C8368g> f27118k;

        public C8367f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C8368g> sparseArray) {
            this.f27108a = i;
            this.f27109b = z;
            this.f27110c = i2;
            this.f27111d = i3;
            this.f27112e = i4;
            this.f27113f = i5;
            this.f27114g = i6;
            this.f27115h = i7;
            this.f27116i = i8;
            this.f27117j = i9;
            this.f27118k = sparseArray;
        }

        public void m12656a(C8367f fVar) {
            SparseArray<C8368g> sparseArray = fVar.f27118k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f27118k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    public static final class C8368g {
        public final int f27119a;
        public final int f27120b;
        public final int f27121c;
        public final int f27122d;
        public final int f27123e;
        public final int f27124f;

        public C8368g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f27119a = i;
            this.f27120b = i2;
            this.f27121c = i3;
            this.f27122d = i4;
            this.f27123e = i5;
            this.f27124f = i6;
        }
    }

    public static final class C8369h {
        public final int f27125a;
        public final int f27126b;
        public final SparseArray<C8367f> f27127c = new SparseArray<>();
        public final SparseArray<C8362a> f27128d = new SparseArray<>();
        public final SparseArray<C8364c> f27129e = new SparseArray<>();
        public final SparseArray<C8362a> f27130f = new SparseArray<>();
        public final SparseArray<C8364c> f27131g = new SparseArray<>();
        public C8363b f27132h;
        public C8365d f27133i;

        public C8369h(int i, int i2) {
            this.f27125a = i;
            this.f27126b = i2;
        }

        public void m12655a() {
            this.f27127c.clear();
            this.f27128d.clear();
            this.f27129e.clear();
            this.f27130f.clear();
            this.f27131g.clear();
            this.f27132h = null;
            this.f27133i = null;
        }
    }

    public C8361b(int i, int i2) {
        Paint paint = new Paint();
        this.f27081a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f27082b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f27086f = new C8369h(i, i2);
    }

    public static byte[] m12674a(int i, int i2, C1187a0 a0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) a0Var.m38173h(i2);
        }
        return bArr;
    }

    public static int[] m12672c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] m12671d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m12669f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m12669f(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    public static int[] m12670e() {
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
                iArr[i] = m12669f(63, i3, i4, i2);
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
                    iArr[i] = m12669f(255, i8, i9, i7 + i6);
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
                        iArr[i] = m12669f(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m12669f(255, i14, i15, i10 + i7);
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
                    iArr[i] = m12669f(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    public static int m12669f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int m12668g(p020b5.C1187a0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: p245r4.C8361b.m12668g(b5.a0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int m12667h(p020b5.C1187a0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: p245r4.C8361b.m12667h(b5.a0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int m12666i(C1187a0 a0Var, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        boolean z;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte h = a0Var.m38173h(8);
            if (h != 0) {
                z = z2;
                i3 = 1;
            } else if (!a0Var.m38174g()) {
                int h2 = a0Var.m38173h(7);
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
                i3 = a0Var.m38173h(7);
                h = a0Var.m38173h(8);
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

    public static void m12665j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C1187a0 a0Var = new C1187a0(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (a0Var.m38179b() != 0) {
            int h = a0Var.m38173h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArr5 == null ? f27079i : bArr5;
                        } else if (i == 2) {
                            bArr3 = bArr7 == null ? f27078h : bArr7;
                        } else {
                            bArr2 = null;
                            i4 = m12668g(a0Var, iArr, bArr2, i4, i5, paint, canvas);
                            a0Var.m38178c();
                            continue;
                        }
                        bArr2 = bArr3;
                        i4 = m12668g(a0Var, iArr, bArr2, i4, i5, paint, canvas);
                        a0Var.m38178c();
                        continue;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArr6 == null ? f27080j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i4 = m12667h(a0Var, iArr, bArr4, i4, i5, paint, canvas);
                        a0Var.m38178c();
                        continue;
                    case 18:
                        i4 = m12666i(a0Var, iArr, null, i4, i5, paint, canvas);
                        continue;
                    default:
                        switch (h) {
                            case Log.TAG_IMAGE_LOADER:
                                bArr7 = m12674a(4, 4, a0Var);
                                continue;
                            case 33:
                                bArr5 = m12674a(4, 8, a0Var);
                                continue;
                            case 34:
                                bArr6 = m12674a(16, 8, a0Var);
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

    public static void m12664k(C8364c cVar, C8362a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f27091d;
        } else if (i == 2) {
            iArr = aVar.f27090c;
        } else {
            iArr = aVar.f27089b;
        }
        int[] iArr2 = iArr;
        m12665j(cVar.f27100c, iArr2, i, i2, i3, paint, canvas);
        m12665j(cVar.f27101d, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    public static C8362a m12663l(C1187a0 a0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int h = a0Var.m38173h(8);
        a0Var.m38163r(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m12672c();
        int[] d = m12671d();
        int[] e = m12670e();
        while (i9 > 0) {
            int h2 = a0Var.m38173h(i7);
            int h3 = a0Var.m38173h(i7);
            int i10 = i9 - 2;
            int[] iArr = (h3 & Log.TAG_YOUTUBE) != 0 ? c : (h3 & 64) != 0 ? d : e;
            if ((h3 & 1) != 0) {
                i5 = a0Var.m38173h(i7);
                i4 = a0Var.m38173h(i7);
                i3 = a0Var.m38173h(i7);
                i2 = a0Var.m38173h(i7);
                i6 = i10 - 4;
            } else {
                i5 = a0Var.m38173h(6) << i8;
                i4 = a0Var.m38173h(4) << 4;
                i3 = a0Var.m38173h(4) << 4;
                i2 = a0Var.m38173h(i8) << 6;
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
            iArr[h2] = m12669f((byte) (255 - (i2 & 255)), C1216l0.m37956p((int) (d2 + (1.402d * d3)), 0, 255), C1216l0.m37956p((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C1216l0.m37956p((int) (d2 + (d4 * 1.772d)), 0, 255));
            i7 = 8;
            i8 = 2;
        }
        return new C8362a(h, c, d, e);
    }

    public static C8363b m12662m(C1187a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        a0Var.m38163r(4);
        boolean g = a0Var.m38174g();
        a0Var.m38163r(3);
        int h = a0Var.m38173h(16);
        int h2 = a0Var.m38173h(16);
        if (g) {
            int h3 = a0Var.m38173h(16);
            int h4 = a0Var.m38173h(16);
            int h5 = a0Var.m38173h(16);
            i = a0Var.m38173h(16);
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

    public static C8364c m12661n(C1187a0 a0Var) {
        byte[] bArr;
        int h = a0Var.m38173h(16);
        a0Var.m38163r(4);
        int h2 = a0Var.m38173h(2);
        boolean g = a0Var.m38174g();
        a0Var.m38163r(1);
        byte[] bArr2 = C1216l0.f4531f;
        if (h2 == 1) {
            a0Var.m38163r(a0Var.m38173h(8) * 16);
        } else if (h2 == 0) {
            int h3 = a0Var.m38173h(16);
            int h4 = a0Var.m38173h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                a0Var.m38170k(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                a0Var.m38170k(bArr, 0, h4);
                return new C8364c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C8364c(h, g, bArr2, bArr);
    }

    public static C8365d m12660o(C1187a0 a0Var, int i) {
        int h = a0Var.m38173h(8);
        int h2 = a0Var.m38173h(4);
        int h3 = a0Var.m38173h(2);
        a0Var.m38163r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = a0Var.m38173h(8);
            a0Var.m38163r(8);
            i2 -= 6;
            sparseArray.put(h4, new C8366e(a0Var.m38173h(16), a0Var.m38173h(16)));
        }
        return new C8365d(h, h2, h3, sparseArray);
    }

    public static C8367f m12659p(C1187a0 a0Var, int i) {
        int i2;
        int i3;
        int h = a0Var.m38173h(8);
        a0Var.m38163r(4);
        boolean g = a0Var.m38174g();
        a0Var.m38163r(3);
        int i4 = 16;
        int h2 = a0Var.m38173h(16);
        int h3 = a0Var.m38173h(16);
        int h4 = a0Var.m38173h(3);
        int h5 = a0Var.m38173h(3);
        int i5 = 2;
        a0Var.m38163r(2);
        int h6 = a0Var.m38173h(8);
        int h7 = a0Var.m38173h(8);
        int h8 = a0Var.m38173h(4);
        int h9 = a0Var.m38173h(2);
        a0Var.m38163r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = a0Var.m38173h(i4);
            int h11 = a0Var.m38173h(i5);
            int h12 = a0Var.m38173h(i5);
            int h13 = a0Var.m38173h(12);
            h9 = h9;
            a0Var.m38163r(4);
            int h14 = a0Var.m38173h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = a0Var.m38173h(8);
                i2 = a0Var.m38173h(8);
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

    public static void m12658q(C1187a0 a0Var, C8369h hVar) {
        C8367f fVar;
        int h = a0Var.m38173h(8);
        int h2 = a0Var.m38173h(16);
        int h3 = a0Var.m38173h(16);
        int d = a0Var.m38177d() + h3;
        if (h3 * 8 > a0Var.m38179b()) {
            C1230s.m37881i("DvbParser", "Data field length exceeds limit");
            a0Var.m38163r(a0Var.m38179b());
            return;
        }
        switch (h) {
            case 16:
                if (h2 == hVar.f27125a) {
                    C8365d dVar = hVar.f27133i;
                    C8365d o = m12660o(a0Var, h3);
                    if (o.f27104c == 0) {
                        if (!(dVar == null || dVar.f27103b == o.f27103b)) {
                            hVar.f27133i = o;
                            break;
                        }
                    } else {
                        hVar.f27133i = o;
                        hVar.f27127c.clear();
                        hVar.f27128d.clear();
                        hVar.f27129e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C8365d dVar2 = hVar.f27133i;
                if (h2 == hVar.f27125a && dVar2 != null) {
                    C8367f p = m12659p(a0Var, h3);
                    if (dVar2.f27104c == 0 && (fVar = hVar.f27127c.get(p.f27108a)) != null) {
                        p.m12656a(fVar);
                    }
                    hVar.f27127c.put(p.f27108a, p);
                    break;
                }
                break;
            case 18:
                if (h2 != hVar.f27125a) {
                    if (h2 == hVar.f27126b) {
                        C8362a l = m12663l(a0Var, h3);
                        hVar.f27130f.put(l.f27088a, l);
                        break;
                    }
                } else {
                    C8362a l2 = m12663l(a0Var, h3);
                    hVar.f27128d.put(l2.f27088a, l2);
                    break;
                }
                break;
            case 19:
                if (h2 != hVar.f27125a) {
                    if (h2 == hVar.f27126b) {
                        C8364c n = m12661n(a0Var);
                        hVar.f27131g.put(n.f27098a, n);
                        break;
                    }
                } else {
                    C8364c n2 = m12661n(a0Var);
                    hVar.f27129e.put(n2.f27098a, n2);
                    break;
                }
                break;
            case 20:
                if (h2 == hVar.f27125a) {
                    hVar.f27132h = m12662m(a0Var);
                    break;
                }
                break;
        }
        a0Var.m38162s(d - a0Var.m38177d());
    }

    public List<C8032b> m12673b(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<C8368g> sparseArray;
        C1187a0 a0Var = new C1187a0(bArr, i);
        while (a0Var.m38179b() >= 48 && a0Var.m38173h(8) == 15) {
            m12658q(a0Var, this.f27086f);
        }
        C8369h hVar = this.f27086f;
        C8365d dVar = hVar.f27133i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C8363b bVar = hVar.f27132h;
        if (bVar == null) {
            bVar = this.f27084d;
        }
        Bitmap bitmap = this.f27087g;
        if (!(bitmap != null && bVar.f27092a + 1 == bitmap.getWidth() && bVar.f27093b + 1 == this.f27087g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f27092a + 1, bVar.f27093b + 1, Bitmap.Config.ARGB_8888);
            this.f27087g = createBitmap;
            this.f27083c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C8366e> sparseArray2 = dVar.f27105d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f27083c.save();
            C8366e valueAt = sparseArray2.valueAt(i4);
            C8367f fVar = this.f27086f.f27127c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f27106a + bVar.f27094c;
            int i6 = valueAt.f27107b + bVar.f27096e;
            this.f27083c.clipRect(i5, i6, Math.min(fVar.f27110c + i5, bVar.f27095d), Math.min(fVar.f27111d + i6, bVar.f27097f));
            C8362a aVar = this.f27086f.f27128d.get(fVar.f27114g);
            if (aVar == null && (aVar = this.f27086f.f27130f.get(fVar.f27114g)) == null) {
                aVar = this.f27085e;
            }
            SparseArray<C8368g> sparseArray3 = fVar.f27118k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C8368g valueAt2 = sparseArray3.valueAt(i7);
                C8364c cVar = this.f27086f.f27129e.get(keyAt);
                C8364c cVar2 = cVar == null ? this.f27086f.f27131g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m12664k(cVar2, aVar, fVar.f27113f, valueAt2.f27121c + i5, i6 + valueAt2.f27122d, cVar2.f27099b ? null : this.f27081a, this.f27083c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f27109b) {
                int i8 = fVar.f27113f;
                if (i8 == 3) {
                    i2 = aVar.f27091d[fVar.f27115h];
                } else if (i8 == 2) {
                    i2 = aVar.f27090c[fVar.f27116i];
                } else {
                    i2 = aVar.f27089b[fVar.f27117j];
                }
                this.f27082b.setColor(i2);
                this.f27083c.drawRect(i5, i6, fVar.f27110c + i5, fVar.f27111d + i6, this.f27082b);
            }
            arrayList.add(new C8032b.C8034b().m13752f(Bitmap.createBitmap(this.f27087g, i5, i6, fVar.f27110c, fVar.f27111d)).m13747k(i5 / bVar.f27092a).m13746l(0).m13750h(i6 / bVar.f27093b, 0).m13749i(0).m13744n(fVar.f27110c / bVar.f27092a).m13751g(fVar.f27111d / bVar.f27093b).m13757a());
            this.f27083c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f27083c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void m12657r() {
        this.f27086f.m12655a();
    }
}
