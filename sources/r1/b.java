package r1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class b {
    public static final c f21614f = new a();
    public final List<d> f21615a;
    public final List<r1.c> f21616b;
    public final SparseBooleanArray f21618d = new SparseBooleanArray();
    public final Map<r1.c, d> f21617c = new k0.a();
    public final d f21619e = a();

    public static class a implements c {
        @Override
        public boolean a(int i10, float[] fArr) {
            return !d(fArr) && !b(fArr) && !c(fArr);
        }

        public final boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    public static final class C0203b {
        public final List<d> f21620a;
        public final Bitmap f21621b;
        public final List<r1.c> f21622c;
        public int f21623d = 16;
        public int f21624e = 12544;
        public int f21625f = -1;
        public final List<c> f21626g;
        public Rect f21627h;

        public C0203b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f21622c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f21626g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f21614f);
            this.f21621b = bitmap;
            this.f21620a = null;
            arrayList.add(r1.c.f21637e);
            arrayList.add(r1.c.f21638f);
            arrayList.add(r1.c.f21639g);
            arrayList.add(r1.c.f21640h);
            arrayList.add(r1.c.f21641i);
            arrayList.add(r1.c.f21642j);
        }

        public b a() {
            List<d> list;
            c[] cVarArr;
            Bitmap bitmap = this.f21621b;
            if (bitmap != null) {
                Bitmap c10 = c(bitmap);
                Rect rect = this.f21627h;
                if (!(c10 == this.f21621b || rect == null)) {
                    double width = c10.getWidth() / this.f21621b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), c10.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), c10.getHeight());
                }
                int[] b10 = b(c10);
                int i10 = this.f21623d;
                if (this.f21626g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.f21626g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                r1.a aVar = new r1.a(b10, i10, cVarArr);
                if (c10 != this.f21621b) {
                    c10.recycle();
                }
                list = aVar.d();
            } else {
                list = this.f21620a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            b bVar = new b(list, this.f21622c);
            bVar.c();
            return bVar;
        }

        public final int[] b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f21627h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f21627h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i10 = 0; i10 < height2; i10++) {
                Rect rect2 = this.f21627h;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * width2, width2);
            }
            return iArr2;
        }

        public final Bitmap c(Bitmap bitmap) {
            int max;
            int i10;
            double d10 = -1.0d;
            if (this.f21624e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i11 = this.f21624e;
                if (width > i11) {
                    d10 = Math.sqrt(i11 / width);
                }
            } else if (this.f21625f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i10 = this.f21625f)) {
                d10 = i10 / max;
            }
            return d10 <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d10), (int) Math.ceil(bitmap.getHeight() * d10), false);
        }
    }

    public interface c {
        boolean a(int i10, float[] fArr);
    }

    public static final class d {
        public final int f21628a;
        public final int f21629b;
        public final int f21630c;
        public final int f21631d;
        public final int f21632e;
        public boolean f21633f;
        public int f21634g;
        public int f21635h;
        public float[] f21636i;

        public d(int i10, int i11) {
            this.f21628a = Color.red(i10);
            this.f21629b = Color.green(i10);
            this.f21630c = Color.blue(i10);
            this.f21631d = i10;
            this.f21632e = i11;
        }

        public final void a() {
            int i10;
            int i11;
            if (!this.f21633f) {
                int g10 = t0.a.g(-1, this.f21631d, 4.5f);
                int g11 = t0.a.g(-1, this.f21631d, 3.0f);
                if (g10 == -1 || g11 == -1) {
                    int g12 = t0.a.g(-16777216, this.f21631d, 4.5f);
                    int g13 = t0.a.g(-16777216, this.f21631d, 3.0f);
                    if (g12 == -1 || g13 == -1) {
                        if (g10 != -1) {
                            i10 = t0.a.p(-1, g10);
                        } else {
                            i10 = t0.a.p(-16777216, g12);
                        }
                        this.f21635h = i10;
                        if (g11 != -1) {
                            i11 = t0.a.p(-1, g11);
                        } else {
                            i11 = t0.a.p(-16777216, g13);
                        }
                        this.f21634g = i11;
                        this.f21633f = true;
                        return;
                    }
                    this.f21635h = t0.a.p(-16777216, g12);
                    this.f21634g = t0.a.p(-16777216, g13);
                    this.f21633f = true;
                    return;
                }
                this.f21635h = t0.a.p(-1, g10);
                this.f21634g = t0.a.p(-1, g11);
                this.f21633f = true;
            }
        }

        public int b() {
            a();
            return this.f21635h;
        }

        public float[] c() {
            if (this.f21636i == null) {
                this.f21636i = new float[3];
            }
            t0.a.a(this.f21628a, this.f21629b, this.f21630c, this.f21636i);
            return this.f21636i;
        }

        public int d() {
            return this.f21632e;
        }

        public int e() {
            return this.f21631d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f21632e == dVar.f21632e && this.f21631d == dVar.f21631d;
        }

        public int f() {
            a();
            return this.f21634g;
        }

        public int hashCode() {
            return (this.f21631d * 31) + this.f21632e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.f21632e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    public b(List<d> list, List<r1.c> list2) {
        this.f21615a = list;
        this.f21616b = list2;
    }

    public static C0203b b(Bitmap bitmap) {
        return new C0203b(bitmap);
    }

    public final d a() {
        int size = this.f21615a.size();
        int i10 = Integer.MIN_VALUE;
        d dVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = this.f21615a.get(i11);
            if (dVar2.d() > i10) {
                i10 = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public void c() {
        int size = this.f21616b.size();
        for (int i10 = 0; i10 < size; i10++) {
            r1.c cVar = this.f21616b.get(i10);
            cVar.k();
            this.f21617c.put(cVar, e(cVar));
        }
        this.f21618d.clear();
    }

    public final float d(d dVar, r1.c cVar) {
        float[] c10 = dVar.c();
        d dVar2 = this.f21619e;
        int d10 = dVar2 != null ? dVar2.d() : 1;
        float f10 = 0.0f;
        float g10 = cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(c10[1] - cVar.i())) : 0.0f;
        float a10 = cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(c10[2] - cVar.h())) : 0.0f;
        if (cVar.f() > 0.0f) {
            f10 = cVar.f() * (dVar.d() / d10);
        }
        return g10 + a10 + f10;
    }

    public final d e(r1.c cVar) {
        d g10 = g(cVar);
        if (g10 != null && cVar.j()) {
            this.f21618d.append(g10.e(), true);
        }
        return g10;
    }

    public d f() {
        return h(r1.c.f21639g);
    }

    public final d g(r1.c cVar) {
        int size = this.f21615a.size();
        float f10 = 0.0f;
        d dVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = this.f21615a.get(i10);
            if (i(dVar2, cVar)) {
                float d10 = d(dVar2, cVar);
                if (dVar == null || d10 > f10) {
                    dVar = dVar2;
                    f10 = d10;
                }
            }
        }
        return dVar;
    }

    public d h(r1.c cVar) {
        return this.f21617c.get(cVar);
    }

    public final boolean i(d dVar, r1.c cVar) {
        float[] c10 = dVar.c();
        return c10[1] >= cVar.e() && c10[1] <= cVar.c() && c10[2] >= cVar.d() && c10[2] <= cVar.b() && !this.f21618d.get(dVar.e());
    }
}
