package id;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p039d.C3563j;
import p108hb.C5069h;
import p108hb.C5070i;
import p156kd.C6253l;
import p209od.C7856c;
import p225pd.C8111a;
import p254rd.C8431f;

public class C5335c extends AbstractC5333b {
    public int f17524f;
    public boolean f17525g;
    public C7856c f17526h;
    public C8431f f17527i;
    public int f17528j;
    public boolean f17529k;
    public int f17530l;
    public double f17531m;
    public double f17532n;
    public double f17533o;
    public double f17534p;
    public int f17535q;
    public int f17536r;
    public Rect f17537s;

    public C5335c(long j, String str, String str2, String str3) {
        super(j, str, str2, str3, false);
        m23203z(str3.substring(5));
    }

    public static String m23218k(String str, int i) {
        if (!new C5335c(-1L, null, null, str).m23213p() && i == 90) {
            return C5372x.m23063m(0, null, 90);
        }
        int i2 = 2;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i3);
            if (indexOf == -1 || i2 <= 0) {
                break;
            }
            i3 = indexOf + 1;
            i2--;
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (int i4 = 0; i4 < i2; i4++) {
            sb2.append(',');
        }
        sb2.append(",l:");
        sb2.append(i);
        return sb2.toString();
    }

    public static boolean m23212q(C6253l lVar) {
        return lVar != null && (lVar.m20899r() == null || lVar.m20899r().m13575k()) && ((lVar.m20912j() == null || lVar.m20912j().m14818l()) && (lVar.m20896t() == null || lVar.m20896t().m12494i()));
    }

    public static String m23210s(int i, long j, String str) {
        StringBuilder sb2 = new StringBuilder("photo");
        sb2.append(i);
        if (j != 0 || !C5070i.m24061i(str)) {
            sb2.append(",,,");
            sb2.append(j);
            if (!C5070i.m24057m(str)) {
                sb2.append(",");
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String m23209t(int i, long j, boolean z, int i2) {
        String str;
        if (z || i2 != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z) {
                sb2.append("t");
            }
            if (i2 != 0) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append("l:");
                sb2.append(i2);
            }
            str = sb2.toString();
        } else {
            str = null;
        }
        return m23210s(i, j, str);
    }

    public static String m23208u(C6253l lVar, long j) {
        StringBuilder sb2 = new StringBuilder("photo");
        sb2.append(lVar.mo20873x());
        C8111a r = lVar.m20899r();
        sb2.append(',');
        if (r != null && !r.m13575k()) {
            sb2.append(r.toString());
        }
        sb2.append(',');
        C7856c j2 = lVar.m20912j();
        if (j2 != null && !j2.m14818l()) {
            sb2.append(j2.toString());
        }
        C8431f t = lVar.m20896t();
        if (t != null && !t.m12494i()) {
            sb2.append(",p:");
            sb2.append(t.toString());
        }
        if (j != 0) {
            sb2.append(",");
            sb2.append(j);
        }
        return sb2.toString();
    }

    public static TdApi.InputFileGenerated m23206w(String str, int i) {
        return new TdApi.InputFileGenerated(str, m23210s(i, AbstractC5333b.m23224g(str), null), 0);
    }

    public static TdApi.InputFileGenerated m23205x(String str, int i, long j, boolean z, int i2) {
        return new TdApi.InputFileGenerated(str, m23209t(i, j, z, i2), 0);
    }

    public static TdApi.InputFileGenerated m23204y(C6253l lVar) {
        String B = lVar.m20953B();
        return new TdApi.InputFileGenerated(B, m23208u(lVar, AbstractC5333b.m23224g(B)), 0);
    }

    public Bitmap m23221A(Bitmap bitmap, boolean z) {
        int i;
        int i2;
        boolean z2;
        Bitmap bitmap2;
        boolean z3;
        Bitmap bitmap3;
        int i3;
        int i4;
        int i5;
        int i6;
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i7 = z ? this.f17524f : 0;
        C7856c cVar = this.f17526h;
        if (cVar != null) {
            i7 = C5069h.m24081l(i7 + cVar.m14822h(), 360);
            if (this.f17530l == 2) {
                Log.m14719i("Region reader failed, cropping in-memory", new Object[0]);
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                double d = width2;
                i6 = (int) Math.ceil(this.f17531m * d);
                i4 = (int) Math.floor(this.f17533o * d);
                double d2 = height2;
                i5 = (int) Math.ceil(this.f17532n * d2);
                i3 = (int) Math.floor(this.f17534p * d2);
            } else {
                i4 = width;
                i3 = height;
                i6 = 0;
                i5 = 0;
            }
            float c = this.f17526h.m14827c();
            if (c != 0.0f) {
                float width3 = bitmap.getWidth();
                float height3 = bitmap.getHeight();
                double radians = Math.toRadians(c);
                float abs = (float) Math.abs(Math.sin(radians));
                float abs2 = (float) Math.abs(Math.cos(radians));
                float f = (width3 * abs2) + (height3 * abs);
                float f2 = (abs * width3) + (abs2 * height3);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float max = Math.max(f / width3, f2 / height3);
                float f3 = width3 / 2.0f;
                float f4 = height3 / 2.0f;
                canvas.rotate(c, f3, f4);
                if (max != 1.0f) {
                    canvas.scale(max, max, f3, f4);
                }
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                if (this.f17527i != null) {
                    m23219j(canvas, bitmap.getWidth(), bitmap.getHeight());
                    z2 = true;
                } else {
                    z2 = false;
                }
                bitmap.recycle();
                C7389v0.m16571v2(canvas);
                i2 = i6;
                i = i5;
                bitmap2 = createBitmap;
                width = i4;
                height = i3;
                i7 = i7;
            } else {
                bitmap2 = bitmap;
                i2 = i6;
                i = i5;
                width = i4;
                height = i3;
                z2 = false;
            }
        } else {
            bitmap2 = bitmap;
            z2 = false;
            i2 = 0;
            i = 0;
        }
        if (i7 != 0) {
            matrix.setRotate(i7);
            z3 = false;
        } else {
            z3 = true;
        }
        Matrix matrix2 = z3 ? null : matrix;
        if (this.f17527i == null || z2) {
            bitmap3 = bitmap2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            m23219j(canvas2, bitmap2.getWidth(), bitmap2.getHeight());
            bitmap2.recycle();
            C7389v0.m16571v2(canvas2);
            bitmap3 = createBitmap2;
        }
        return Bitmap.createBitmap(bitmap3, i2, i, width - i2, height - i, matrix2, false);
    }

    public android.graphics.Bitmap m23220B(java.io.InputStream r17, android.graphics.BitmapFactory.Options r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5335c.m23220B(java.io.InputStream, android.graphics.BitmapFactory$Options, java.lang.String):android.graphics.Bitmap");
    }

    public final void m23219j(Canvas canvas, int i, int i2) {
        C8431f fVar = this.f17527i;
        if (fVar == null) {
            return;
        }
        if (this.f17530l == 1) {
            float width = i / this.f17537s.width();
            float height = i2 / this.f17537s.height();
            int i3 = (int) (this.f17535q * width);
            int i4 = (int) (this.f17536r * height);
            Rect rect = this.f17537s;
            this.f17527i.m12496g(canvas, -((int) (rect.left * width)), -((int) (rect.top * height)), i3, i4);
            return;
        }
        fVar.m12496g(canvas, 0, 0, i, i2);
    }

    public boolean m23217l() {
        return this.f17529k;
    }

    public C7856c m23216m() {
        C7856c cVar = this.f17526h;
        if (cVar == null || cVar.m14818l()) {
            return null;
        }
        return this.f17526h;
    }

    public C8431f m23215n() {
        C8431f fVar = this.f17527i;
        if (fVar == null || fVar.m12494i()) {
            return null;
        }
        return this.f17527i;
    }

    public int m23214o() {
        return this.f17528j;
    }

    public boolean m23213p() {
        C8431f fVar;
        C7856c cVar;
        return this.f17525g || ((fVar = this.f17527i) != null && !fVar.m12494i()) || ((cVar = this.f17526h) != null && !cVar.m14818l());
    }

    public boolean m23211r() {
        return this.f17525g;
    }

    public boolean m23207v(boolean z) {
        C8431f fVar = this.f17527i;
        if (fVar != null && !fVar.m12494i()) {
            return true;
        }
        C7856c cVar = this.f17526h;
        if (cVar == null) {
            return z && this.f17524f != 0;
        }
        return ((z ? this.f17524f : 0) + cVar.m14822h() == 0 && this.f17526h.m14827c() == 0.0f && this.f17530l != 2) ? false : true;
    }

    public final void m23203z(String str) {
        char c;
        String[] split = str.split(",", -1);
        this.f17524f = C5070i.m24051s(split[0]);
        if (split.length > 1) {
            this.f17525g = !split[1].isEmpty();
        }
        if (split.length > 2) {
            this.f17526h = C7856c.m14816n(split[2]);
        }
        if (split.length > 3) {
            for (int i = 3; i < split.length; i++) {
                String str2 = split[i];
                int indexOf = str2.indexOf(58);
                String substring = indexOf == -1 ? str2 : str2.substring(0, indexOf);
                String substring2 = (indexOf == -1 || str2.length() <= 1) ? null : str2.substring(indexOf + 1);
                substring.hashCode();
                switch (substring.hashCode()) {
                    case 108:
                        if (substring.equals("l")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 112:
                        if (substring.equals("p")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case C3563j.f11937H0:
                        if (substring.equals("t")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        this.f17528j = C5070i.m24051s(substring2);
                        break;
                    case 1:
                        this.f17527i = C8431f.m12488o(substring2);
                        break;
                    case 2:
                        this.f17529k = true;
                        break;
                }
            }
        }
    }
}
