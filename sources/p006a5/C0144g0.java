package p006a5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C0144g0 {
    public static final Comparator<C0146b> f517h = C0140f0.f510a;
    public static final Comparator<C0146b> f518i = C0138e0.f505a;
    public final int f519a;
    public int f523e;
    public int f524f;
    public int f525g;
    public final C0146b[] f521c = new C0146b[5];
    public final ArrayList<C0146b> f520b = new ArrayList<>();
    public int f522d = -1;

    public static class C0146b {
        public int f526a;
        public int f527b;
        public float f528c;

        public C0146b() {
        }
    }

    public C0144g0(int i) {
        this.f519a = i;
    }

    public static int m42214g(C0146b bVar, C0146b bVar2) {
        return bVar.f526a - bVar2.f526a;
    }

    public static int m42213h(C0146b bVar, C0146b bVar2) {
        return Float.compare(bVar.f528c, bVar2.f528c);
    }

    public void m42218c(int i, float f) {
        C0146b bVar;
        m42217d();
        int i2 = this.f525g;
        if (i2 > 0) {
            C0146b[] bVarArr = this.f521c;
            int i3 = i2 - 1;
            this.f525g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C0146b();
        }
        int i4 = this.f523e;
        this.f523e = i4 + 1;
        bVar.f526a = i4;
        bVar.f527b = i;
        bVar.f528c = f;
        this.f520b.add(bVar);
        this.f524f += i;
        while (true) {
            int i5 = this.f524f;
            int i6 = this.f519a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C0146b bVar2 = this.f520b.get(0);
                int i8 = bVar2.f527b;
                if (i8 <= i7) {
                    this.f524f -= i8;
                    this.f520b.remove(0);
                    int i9 = this.f525g;
                    if (i9 < 5) {
                        C0146b[] bVarArr2 = this.f521c;
                        this.f525g = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f527b = i8 - i7;
                    this.f524f -= i7;
                }
            } else {
                return;
            }
        }
    }

    public final void m42217d() {
        if (this.f522d != 1) {
            Collections.sort(this.f520b, f517h);
            this.f522d = 1;
        }
    }

    public final void m42216e() {
        if (this.f522d != 0) {
            Collections.sort(this.f520b, f518i);
            this.f522d = 0;
        }
    }

    public float m42215f(float f) {
        m42216e();
        float f2 = f * this.f524f;
        int i = 0;
        for (int i2 = 0; i2 < this.f520b.size(); i2++) {
            C0146b bVar = this.f520b.get(i2);
            i += bVar.f527b;
            if (i >= f2) {
                return bVar.f528c;
            }
        }
        if (this.f520b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C0146b> arrayList = this.f520b;
        return arrayList.get(arrayList.size() - 1).f528c;
    }

    public void m42212i() {
        this.f520b.clear();
        this.f522d = -1;
        this.f523e = 0;
        this.f524f = 0;
    }
}
