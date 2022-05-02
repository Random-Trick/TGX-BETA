package p242r1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p143k0.C6024a;
import p267t0.C8929a;

public final class C8348b {
    public static final AbstractC8351c f27039f = new C8349a();
    public final List<C8352d> f27040a;
    public final List<C8353c> f27041b;
    public final SparseBooleanArray f27043d = new SparseBooleanArray();
    public final Map<C8353c, C8352d> f27042c = new C6024a();
    public final C8352d f27044e = m12723a();

    public static class C8349a implements AbstractC8351c {
        @Override
        public boolean mo12708a(int i, float[] fArr) {
            return !m12712d(fArr) && !m12714b(fArr) && !m12713c(fArr);
        }

        public final boolean m12714b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean m12713c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean m12712d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    public static final class C8350b {
        public final List<C8352d> f27045a;
        public final Bitmap f27046b;
        public final List<C8353c> f27047c;
        public int f27048d = 16;
        public int f27049e = 12544;
        public int f27050f = -1;
        public final List<AbstractC8351c> f27051g;
        public Rect f27052h;

        public C8350b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f27047c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f27051g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C8348b.f27039f);
            this.f27046b = bitmap;
            this.f27045a = null;
            arrayList.add(C8353c.f27062e);
            arrayList.add(C8353c.f27063f);
            arrayList.add(C8353c.f27064g);
            arrayList.add(C8353c.f27065h);
            arrayList.add(C8353c.f27066i);
            arrayList.add(C8353c.f27067j);
        }

        public C8348b m12711a() {
            List<C8352d> list;
            AbstractC8351c[] cVarArr;
            Bitmap bitmap = this.f27046b;
            if (bitmap != null) {
                Bitmap c = m12709c(bitmap);
                Rect rect = this.f27052h;
                if (!(c == this.f27046b || rect == null)) {
                    double width = c.getWidth() / this.f27046b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), c.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), c.getHeight());
                }
                int[] b = m12710b(c);
                int i = this.f27048d;
                if (this.f27051g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<AbstractC8351c> list2 = this.f27051g;
                    cVarArr = (AbstractC8351c[]) list2.toArray(new AbstractC8351c[list2.size()]);
                }
                C8345a aVar = new C8345a(b, i, cVarArr);
                if (c != this.f27046b) {
                    c.recycle();
                }
                list = aVar.m12744d();
            } else {
                list = this.f27045a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C8348b bVar = new C8348b(list, this.f27047c);
            bVar.m12721c();
            return bVar;
        }

        public final int[] m12710b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f27052h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f27052h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f27052h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public final Bitmap m12709c(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f27049e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f27049e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f27050f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f27050f)) {
                d = i / max;
            }
            return d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }
    }

    public interface AbstractC8351c {
        boolean mo12708a(int i, float[] fArr);
    }

    public static final class C8352d {
        public final int f27053a;
        public final int f27054b;
        public final int f27055c;
        public final int f27056d;
        public final int f27057e;
        public boolean f27058f;
        public int f27059g;
        public int f27060h;
        public float[] f27061i;

        public C8352d(int i, int i2) {
            this.f27053a = Color.red(i);
            this.f27054b = Color.green(i);
            this.f27055c = Color.blue(i);
            this.f27056d = i;
            this.f27057e = i2;
        }

        public final void m12707a() {
            int i;
            int i2;
            if (!this.f27058f) {
                int g = C8929a.m10942g(-1, this.f27056d, 4.5f);
                int g2 = C8929a.m10942g(-1, this.f27056d, 3.0f);
                if (g == -1 || g2 == -1) {
                    int g3 = C8929a.m10942g(-16777216, this.f27056d, 4.5f);
                    int g4 = C8929a.m10942g(-16777216, this.f27056d, 3.0f);
                    if (g3 == -1 || g4 == -1) {
                        if (g != -1) {
                            i = C8929a.m10933p(-1, g);
                        } else {
                            i = C8929a.m10933p(-16777216, g3);
                        }
                        this.f27060h = i;
                        if (g2 != -1) {
                            i2 = C8929a.m10933p(-1, g2);
                        } else {
                            i2 = C8929a.m10933p(-16777216, g4);
                        }
                        this.f27059g = i2;
                        this.f27058f = true;
                        return;
                    }
                    this.f27060h = C8929a.m10933p(-16777216, g3);
                    this.f27059g = C8929a.m10933p(-16777216, g4);
                    this.f27058f = true;
                    return;
                }
                this.f27060h = C8929a.m10933p(-1, g);
                this.f27059g = C8929a.m10933p(-1, g2);
                this.f27058f = true;
            }
        }

        public int m12706b() {
            m12707a();
            return this.f27060h;
        }

        public float[] m12705c() {
            if (this.f27061i == null) {
                this.f27061i = new float[3];
            }
            C8929a.m10948a(this.f27053a, this.f27054b, this.f27055c, this.f27061i);
            return this.f27061i;
        }

        public int m12704d() {
            return this.f27057e;
        }

        public int m12703e() {
            return this.f27056d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8352d.class != obj.getClass()) {
                return false;
            }
            C8352d dVar = (C8352d) obj;
            return this.f27057e == dVar.f27057e && this.f27056d == dVar.f27056d;
        }

        public int m12702f() {
            m12707a();
            return this.f27059g;
        }

        public int hashCode() {
            return (this.f27056d * 31) + this.f27057e;
        }

        public String toString() {
            return C8352d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m12703e()) + "] [HSL: " + Arrays.toString(m12705c()) + "] [Population: " + this.f27057e + "] [Title Text: #" + Integer.toHexString(m12702f()) + "] [Body Text: #" + Integer.toHexString(m12706b()) + ']';
        }
    }

    public C8348b(List<C8352d> list, List<C8353c> list2) {
        this.f27040a = list;
        this.f27041b = list2;
    }

    public static C8350b m12722b(Bitmap bitmap) {
        return new C8350b(bitmap);
    }

    public final C8352d m12723a() {
        int size = this.f27040a.size();
        int i = Integer.MIN_VALUE;
        C8352d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C8352d dVar2 = this.f27040a.get(i2);
            if (dVar2.m12704d() > i) {
                i = dVar2.m12704d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public void m12721c() {
        int size = this.f27041b.size();
        for (int i = 0; i < size; i++) {
            C8353c cVar = this.f27041b.get(i);
            cVar.m12691k();
            this.f27042c.put(cVar, m12719e(cVar));
        }
        this.f27043d.clear();
    }

    public final float m12720d(C8352d dVar, C8353c cVar) {
        float[] c = dVar.m12705c();
        C8352d dVar2 = this.f27044e;
        int d = dVar2 != null ? dVar2.m12704d() : 1;
        float f = 0.0f;
        float g = cVar.m12695g() > 0.0f ? cVar.m12695g() * (1.0f - Math.abs(c[1] - cVar.m12693i())) : 0.0f;
        float a = cVar.m12701a() > 0.0f ? cVar.m12701a() * (1.0f - Math.abs(c[2] - cVar.m12694h())) : 0.0f;
        if (cVar.m12696f() > 0.0f) {
            f = cVar.m12696f() * (dVar.m12704d() / d);
        }
        return g + a + f;
    }

    public final C8352d m12719e(C8353c cVar) {
        C8352d g = m12717g(cVar);
        if (g != null && cVar.m12692j()) {
            this.f27043d.append(g.m12703e(), true);
        }
        return g;
    }

    public C8352d m12718f() {
        return m12716h(C8353c.f27064g);
    }

    public final C8352d m12717g(C8353c cVar) {
        int size = this.f27040a.size();
        float f = 0.0f;
        C8352d dVar = null;
        for (int i = 0; i < size; i++) {
            C8352d dVar2 = this.f27040a.get(i);
            if (m12715i(dVar2, cVar)) {
                float d = m12720d(dVar2, cVar);
                if (dVar == null || d > f) {
                    dVar = dVar2;
                    f = d;
                }
            }
        }
        return dVar;
    }

    public C8352d m12716h(C8353c cVar) {
        return this.f27042c.get(cVar);
    }

    public final boolean m12715i(C8352d dVar, C8353c cVar) {
        float[] c = dVar.m12705c();
        return c[1] >= cVar.m12697e() && c[1] <= cVar.m12699c() && c[2] >= cVar.m12698d() && c[2] <= cVar.m12700b() && !this.f27043d.get(dVar.m12703e());
    }
}
