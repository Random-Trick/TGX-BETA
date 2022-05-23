package jd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import d.j;
import ib.h;
import ib.i;
import ld.l;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import qd.a;
import sd.f;

public class c extends b {
    public int f15210f;
    public boolean f15211g;
    public pd.c f15212h;
    public f f15213i;
    public int f15214j;
    public boolean f15215k;
    public int f15216l;
    public double f15217m;
    public double f15218n;
    public double f15219o;
    public double f15220p;
    public int f15221q;
    public int f15222r;
    public Rect f15223s;

    public c(long j10, String str, String str2, String str3) {
        super(j10, str, str2, str3, false);
        z(str3.substring(5));
    }

    public static String k(String str, int i10) {
        if (!new c(-1L, null, null, str).p() && i10 == 90) {
            return x.m(0, null, 90);
        }
        int i11 = 2;
        int i12 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i12);
            if (indexOf == -1 || i11 <= 0) {
                break;
            }
            i12 = indexOf + 1;
            i11--;
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(',');
        }
        sb2.append(",l:");
        sb2.append(i10);
        return sb2.toString();
    }

    public static boolean q(l lVar) {
        return lVar != null && (lVar.r() == null || lVar.r().k()) && ((lVar.j() == null || lVar.j().l()) && (lVar.t() == null || lVar.t().i()));
    }

    public static String s(int i10, long j10, String str) {
        StringBuilder sb2 = new StringBuilder("photo");
        sb2.append(i10);
        if (j10 != 0 || !i.i(str)) {
            sb2.append(",,,");
            sb2.append(j10);
            if (!i.m(str)) {
                sb2.append(",");
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String t(int i10, long j10, boolean z10, int i11) {
        String str;
        if (z10 || i11 != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                sb2.append("t");
            }
            if (i11 != 0) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append("l:");
                sb2.append(i11);
            }
            str = sb2.toString();
        } else {
            str = null;
        }
        return s(i10, j10, str);
    }

    public static String u(l lVar, long j10) {
        StringBuilder sb2 = new StringBuilder("photo");
        sb2.append(lVar.x());
        a r10 = lVar.r();
        sb2.append(',');
        if (r10 != null && !r10.k()) {
            sb2.append(r10.toString());
        }
        sb2.append(',');
        pd.c j11 = lVar.j();
        if (j11 != null && !j11.l()) {
            sb2.append(j11.toString());
        }
        f t10 = lVar.t();
        if (t10 != null && !t10.i()) {
            sb2.append(",p:");
            sb2.append(t10.toString());
        }
        if (j10 != 0) {
            sb2.append(",");
            sb2.append(j10);
        }
        return sb2.toString();
    }

    public static TdApi.InputFileGenerated w(String str, int i10) {
        return new TdApi.InputFileGenerated(str, s(i10, b.g(str), null), 0);
    }

    public static TdApi.InputFileGenerated x(String str, int i10, long j10, boolean z10, int i11) {
        return new TdApi.InputFileGenerated(str, t(i10, j10, z10, i11), 0);
    }

    public static TdApi.InputFileGenerated y(l lVar) {
        String B = lVar.B();
        return new TdApi.InputFileGenerated(B, u(lVar, b.g(B)), 0);
    }

    public Bitmap A(Bitmap bitmap, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        Bitmap bitmap2;
        boolean z12;
        Bitmap bitmap3;
        int i12;
        int i13;
        int i14;
        int i15;
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i16 = z10 ? this.f15210f : 0;
        pd.c cVar = this.f15212h;
        if (cVar != null) {
            i16 = h.l(i16 + cVar.h(), 360);
            if (this.f15216l == 2) {
                Log.i("Region reader failed, cropping in-memory", new Object[0]);
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                double d10 = width2;
                i15 = (int) Math.ceil(this.f15217m * d10);
                i13 = (int) Math.floor(this.f15219o * d10);
                double d11 = height2;
                i14 = (int) Math.ceil(this.f15218n * d11);
                i12 = (int) Math.floor(this.f15220p * d11);
            } else {
                i13 = width;
                i12 = height;
                i15 = 0;
                i14 = 0;
            }
            float c10 = this.f15212h.c();
            if (c10 != 0.0f) {
                float width3 = bitmap.getWidth();
                float height3 = bitmap.getHeight();
                double radians = Math.toRadians(c10);
                float abs = (float) Math.abs(Math.sin(radians));
                float abs2 = (float) Math.abs(Math.cos(radians));
                float f10 = (width3 * abs2) + (height3 * abs);
                float f11 = (abs * width3) + (abs2 * height3);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float max = Math.max(f10 / width3, f11 / height3);
                float f12 = width3 / 2.0f;
                float f13 = height3 / 2.0f;
                canvas.rotate(c10, f12, f13);
                if (max != 1.0f) {
                    canvas.scale(max, max, f12, f13);
                }
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                if (this.f15213i != null) {
                    j(canvas, bitmap.getWidth(), bitmap.getHeight());
                    z11 = true;
                } else {
                    z11 = false;
                }
                bitmap.recycle();
                v0.v2(canvas);
                i11 = i15;
                i10 = i14;
                bitmap2 = createBitmap;
                width = i13;
                height = i12;
                i16 = i16;
            } else {
                bitmap2 = bitmap;
                i11 = i15;
                i10 = i14;
                width = i13;
                height = i12;
                z11 = false;
            }
        } else {
            bitmap2 = bitmap;
            z11 = false;
            i11 = 0;
            i10 = 0;
        }
        if (i16 != 0) {
            matrix.setRotate(i16);
            z12 = false;
        } else {
            z12 = true;
        }
        Matrix matrix2 = z12 ? null : matrix;
        if (this.f15213i == null || z11) {
            bitmap3 = bitmap2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            j(canvas2, bitmap2.getWidth(), bitmap2.getHeight());
            bitmap2.recycle();
            v0.v2(canvas2);
            bitmap3 = createBitmap2;
        }
        return Bitmap.createBitmap(bitmap3, i11, i10, width - i11, height - i10, matrix2, false);
    }

    public android.graphics.Bitmap B(java.io.InputStream r17, android.graphics.BitmapFactory.Options r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: jd.c.B(java.io.InputStream, android.graphics.BitmapFactory$Options, java.lang.String):android.graphics.Bitmap");
    }

    public final void j(Canvas canvas, int i10, int i11) {
        f fVar = this.f15213i;
        if (fVar == null) {
            return;
        }
        if (this.f15216l == 1) {
            float width = i10 / this.f15223s.width();
            float height = i11 / this.f15223s.height();
            int i12 = (int) (this.f15221q * width);
            int i13 = (int) (this.f15222r * height);
            Rect rect = this.f15223s;
            this.f15213i.g(canvas, -((int) (rect.left * width)), -((int) (rect.top * height)), i12, i13);
            return;
        }
        fVar.g(canvas, 0, 0, i10, i11);
    }

    public boolean l() {
        return this.f15215k;
    }

    public pd.c m() {
        pd.c cVar = this.f15212h;
        if (cVar == null || cVar.l()) {
            return null;
        }
        return this.f15212h;
    }

    public f n() {
        f fVar = this.f15213i;
        if (fVar == null || fVar.i()) {
            return null;
        }
        return this.f15213i;
    }

    public int o() {
        return this.f15214j;
    }

    public boolean p() {
        f fVar;
        pd.c cVar;
        return this.f15211g || ((fVar = this.f15213i) != null && !fVar.i()) || ((cVar = this.f15212h) != null && !cVar.l());
    }

    public boolean r() {
        return this.f15211g;
    }

    public boolean v(boolean z10) {
        f fVar = this.f15213i;
        if (fVar != null && !fVar.i()) {
            return true;
        }
        pd.c cVar = this.f15212h;
        if (cVar == null) {
            return z10 && this.f15210f != 0;
        }
        return ((z10 ? this.f15210f : 0) + cVar.h() == 0 && this.f15212h.c() == 0.0f && this.f15216l != 2) ? false : true;
    }

    public final void z(String str) {
        char c10;
        String[] split = str.split(",", -1);
        this.f15210f = i.s(split[0]);
        if (split.length > 1) {
            this.f15211g = !split[1].isEmpty();
        }
        if (split.length > 2) {
            this.f15212h = pd.c.n(split[2]);
        }
        if (split.length > 3) {
            for (int i10 = 3; i10 < split.length; i10++) {
                String str2 = split[i10];
                int indexOf = str2.indexOf(58);
                String substring = indexOf == -1 ? str2 : str2.substring(0, indexOf);
                String substring2 = (indexOf == -1 || str2.length() <= 1) ? null : str2.substring(indexOf + 1);
                substring.hashCode();
                switch (substring.hashCode()) {
                    case 108:
                        if (substring.equals("l")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 112:
                        if (substring.equals("p")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case j.H0:
                        if (substring.equals("t")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        this.f15214j = i.s(substring2);
                        break;
                    case 1:
                        this.f15213i = f.o(substring2);
                        break;
                    case 2:
                        this.f15215k = true;
                        break;
                }
            }
        }
    }
}
