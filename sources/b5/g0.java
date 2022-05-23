package b5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class g0 {
    public static final Comparator<b> f3871h = f0.f3864a;
    public static final Comparator<b> f3872i = e0.f3859a;
    public final int f3873a;
    public int f3877e;
    public int f3878f;
    public int f3879g;
    public final b[] f3875c = new b[5];
    public final ArrayList<b> f3874b = new ArrayList<>();
    public int f3876d = -1;

    public static class b {
        public int f3880a;
        public int f3881b;
        public float f3882c;

        public b() {
        }
    }

    public g0(int i10) {
        this.f3873a = i10;
    }

    public static int g(b bVar, b bVar2) {
        return bVar.f3880a - bVar2.f3880a;
    }

    public static int h(b bVar, b bVar2) {
        return Float.compare(bVar.f3882c, bVar2.f3882c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f3879g;
        if (i11 > 0) {
            b[] bVarArr = this.f3875c;
            int i12 = i11 - 1;
            this.f3879g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f3877e;
        this.f3877e = i13 + 1;
        bVar.f3880a = i13;
        bVar.f3881b = i10;
        bVar.f3882c = f10;
        this.f3874b.add(bVar);
        this.f3878f += i10;
        while (true) {
            int i14 = this.f3878f;
            int i15 = this.f3873a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f3874b.get(0);
                int i17 = bVar2.f3881b;
                if (i17 <= i16) {
                    this.f3878f -= i17;
                    this.f3874b.remove(0);
                    int i18 = this.f3879g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f3875c;
                        this.f3879g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f3881b = i17 - i16;
                    this.f3878f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final void d() {
        if (this.f3876d != 1) {
            Collections.sort(this.f3874b, f3871h);
            this.f3876d = 1;
        }
    }

    public final void e() {
        if (this.f3876d != 0) {
            Collections.sort(this.f3874b, f3872i);
            this.f3876d = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f3878f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3874b.size(); i11++) {
            b bVar = this.f3874b.get(i11);
            i10 += bVar.f3881b;
            if (i10 >= f11) {
                return bVar.f3882c;
            }
        }
        if (this.f3874b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f3874b;
        return arrayList.get(arrayList.size() - 1).f3882c;
    }

    public void i() {
        this.f3874b.clear();
        this.f3876d = -1;
        this.f3877e = 0;
        this.f3878f = 0;
    }
}
