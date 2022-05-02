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
    public static final AbstractC8351c f27042f = new C8349a();
    public final List<C8352d> f27043a;
    public final List<C8353c> f27044b;
    public final SparseBooleanArray f27046d = new SparseBooleanArray();
    public final Map<C8353c, C8352d> f27045c = new C6024a();
    public final C8352d f27047e = m12722a();

    public static class C8349a implements AbstractC8351c {
        @Override
        public boolean mo12707a(int i, float[] fArr) {
            return !m12711d(fArr) && !m12713b(fArr) && !m12712c(fArr);
        }

        public final boolean m12713b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean m12712c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean m12711d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    public static final class C8350b {
        public final List<C8352d> f27048a;
        public final Bitmap f27049b;
        public final List<C8353c> f27050c;
        public int f27051d = 16;
        public int f27052e = 12544;
        public int f27053f = -1;
        public final List<AbstractC8351c> f27054g;
        public Rect f27055h;

        public C8350b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f27050c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f27054g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C8348b.f27042f);
            this.f27049b = bitmap;
            this.f27048a = null;
            arrayList.add(C8353c.f27065e);
            arrayList.add(C8353c.f27066f);
            arrayList.add(C8353c.f27067g);
            arrayList.add(C8353c.f27068h);
            arrayList.add(C8353c.f27069i);
            arrayList.add(C8353c.f27070j);
        }

        public C8348b m12710a() {
            List<C8352d> list;
            AbstractC8351c[] cVarArr;
            Bitmap bitmap = this.f27049b;
            if (bitmap != null) {
                Bitmap c = m12708c(bitmap);
                Rect rect = this.f27055h;
                if (!(c == this.f27049b || rect == null)) {
                    double width = c.getWidth() / this.f27049b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), c.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), c.getHeight());
                }
                int[] b = m12709b(c);
                int i = this.f27051d;
                if (this.f27054g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<AbstractC8351c> list2 = this.f27054g;
                    cVarArr = (AbstractC8351c[]) list2.toArray(new AbstractC8351c[list2.size()]);
                }
                C8345a aVar = new C8345a(b, i, cVarArr);
                if (c != this.f27049b) {
                    c.recycle();
                }
                list = aVar.m12743d();
            } else {
                list = this.f27048a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C8348b bVar = new C8348b(list, this.f27050c);
            bVar.m12720c();
            return bVar;
        }

        public final int[] m12709b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f27055h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f27055h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f27055h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public final Bitmap m12708c(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f27052e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f27052e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f27053f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f27053f)) {
                d = i / max;
            }
            return d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }
    }

    public interface AbstractC8351c {
        boolean mo12707a(int i, float[] fArr);
    }

    public static final class C8352d {
        public final int f27056a;
        public final int f27057b;
        public final int f27058c;
        public final int f27059d;
        public final int f27060e;
        public boolean f27061f;
        public int f27062g;
        public int f27063h;
        public float[] f27064i;

        public C8352d(int i, int i2) {
            this.f27056a = Color.red(i);
            this.f27057b = Color.green(i);
            this.f27058c = Color.blue(i);
            this.f27059d = i;
            this.f27060e = i2;
        }

        public final void m12706a() {
            int i;
            int i2;
            if (!this.f27061f) {
                int g = C8929a.m10941g(-1, this.f27059d, 4.5f);
                int g2 = C8929a.m10941g(-1, this.f27059d, 3.0f);
                if (g == -1 || g2 == -1) {
                    int g3 = C8929a.m10941g(-16777216, this.f27059d, 4.5f);
                    int g4 = C8929a.m10941g(-16777216, this.f27059d, 3.0f);
                    if (g3 == -1 || g4 == -1) {
                        if (g != -1) {
                            i = C8929a.m10932p(-1, g);
                        } else {
                            i = C8929a.m10932p(-16777216, g3);
                        }
                        this.f27063h = i;
                        if (g2 != -1) {
                            i2 = C8929a.m10932p(-1, g2);
                        } else {
                            i2 = C8929a.m10932p(-16777216, g4);
                        }
                        this.f27062g = i2;
                        this.f27061f = true;
                        return;
                    }
                    this.f27063h = C8929a.m10932p(-16777216, g3);
                    this.f27062g = C8929a.m10932p(-16777216, g4);
                    this.f27061f = true;
                    return;
                }
                this.f27063h = C8929a.m10932p(-1, g);
                this.f27062g = C8929a.m10932p(-1, g2);
                this.f27061f = true;
            }
        }

        public int m12705b() {
            m12706a();
            return this.f27063h;
        }

        public float[] m12704c() {
            if (this.f27064i == null) {
                this.f27064i = new float[3];
            }
            C8929a.m10947a(this.f27056a, this.f27057b, this.f27058c, this.f27064i);
            return this.f27064i;
        }

        public int m12703d() {
            return this.f27060e;
        }

        public int m12702e() {
            return this.f27059d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8352d.class != obj.getClass()) {
                return false;
            }
            C8352d dVar = (C8352d) obj;
            return this.f27060e == dVar.f27060e && this.f27059d == dVar.f27059d;
        }

        public int m12701f() {
            m12706a();
            return this.f27062g;
        }

        public int hashCode() {
            return (this.f27059d * 31) + this.f27060e;
        }

        public String toString() {
            return C8352d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m12702e()) + "] [HSL: " + Arrays.toString(m12704c()) + "] [Population: " + this.f27060e + "] [Title Text: #" + Integer.toHexString(m12701f()) + "] [Body Text: #" + Integer.toHexString(m12705b()) + ']';
        }
    }

    public C8348b(List<C8352d> list, List<C8353c> list2) {
        this.f27043a = list;
        this.f27044b = list2;
    }

    public static C8350b m12721b(Bitmap bitmap) {
        return new C8350b(bitmap);
    }

    public final C8352d m12722a() {
        int size = this.f27043a.size();
        int i = Integer.MIN_VALUE;
        C8352d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C8352d dVar2 = this.f27043a.get(i2);
            if (dVar2.m12703d() > i) {
                i = dVar2.m12703d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public void m12720c() {
        int size = this.f27044b.size();
        for (int i = 0; i < size; i++) {
            C8353c cVar = this.f27044b.get(i);
            cVar.m12690k();
            this.f27045c.put(cVar, m12718e(cVar));
        }
        this.f27046d.clear();
    }

    public final float m12719d(C8352d dVar, C8353c cVar) {
        float[] c = dVar.m12704c();
        C8352d dVar2 = this.f27047e;
        int d = dVar2 != null ? dVar2.m12703d() : 1;
        float f = 0.0f;
        float g = cVar.m12694g() > 0.0f ? cVar.m12694g() * (1.0f - Math.abs(c[1] - cVar.m12692i())) : 0.0f;
        float a = cVar.m12700a() > 0.0f ? cVar.m12700a() * (1.0f - Math.abs(c[2] - cVar.m12693h())) : 0.0f;
        if (cVar.m12695f() > 0.0f) {
            f = cVar.m12695f() * (dVar.m12703d() / d);
        }
        return g + a + f;
    }

    public final C8352d m12718e(C8353c cVar) {
        C8352d g = m12716g(cVar);
        if (g != null && cVar.m12691j()) {
            this.f27046d.append(g.m12702e(), true);
        }
        return g;
    }

    public C8352d m12717f() {
        return m12715h(C8353c.f27067g);
    }

    public final C8352d m12716g(C8353c cVar) {
        int size = this.f27043a.size();
        float f = 0.0f;
        C8352d dVar = null;
        for (int i = 0; i < size; i++) {
            C8352d dVar2 = this.f27043a.get(i);
            if (m12714i(dVar2, cVar)) {
                float d = m12719d(dVar2, cVar);
                if (dVar == null || d > f) {
                    dVar = dVar2;
                    f = d;
                }
            }
        }
        return dVar;
    }

    public C8352d m12715h(C8353c cVar) {
        return this.f27045c.get(cVar);
    }

    public final boolean m12714i(C8352d dVar, C8353c cVar) {
        float[] c = dVar.m12704c();
        return c[1] >= cVar.m12696e() && c[1] <= cVar.m12698c() && c[2] >= cVar.m12697d() && c[2] <= cVar.m12699b() && !this.f27046d.get(dVar.m12702e());
    }
}
