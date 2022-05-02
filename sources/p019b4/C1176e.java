package p019b4;

import java.util.Arrays;
import p020b5.C1186a;
import p020b5.C1189b0;
import p270t3.AbstractC8959g;
import p270t3.C8962i;

public final class C1176e {
    public final C1177f f4426a = new C1177f();
    public final C1189b0 f4427b = new C1189b0(new byte[65025], 0);
    public int f4428c = -1;
    public int f4429d;
    public boolean f4430e;

    public final int m38225a(int i) {
        int i2;
        int i3 = 0;
        this.f4429d = 0;
        do {
            int i4 = this.f4429d;
            int i5 = i + i4;
            C1177f fVar = this.f4426a;
            if (i5 >= fVar.f4437g) {
                break;
            }
            int[] iArr = fVar.f4440j;
            this.f4429d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public C1177f m38224b() {
        return this.f4426a;
    }

    public C1189b0 m38223c() {
        return this.f4427b;
    }

    public boolean m38222d(AbstractC8959g gVar) {
        int i;
        C1186a.m38187f(gVar != null);
        if (this.f4430e) {
            this.f4430e = false;
            this.f4427b.m38151L(0);
        }
        while (!this.f4430e) {
            if (this.f4428c < 0) {
                if (!this.f4426a.m38217c(gVar) || !this.f4426a.m38219a(gVar, true)) {
                    return false;
                }
                C1177f fVar = this.f4426a;
                int i2 = fVar.f4438h;
                if ((fVar.f4432b & 1) == 1 && this.f4427b.m38140f() == 0) {
                    i2 += m38225a(0);
                    i = this.f4429d + 0;
                } else {
                    i = 0;
                }
                if (!C8962i.m10827e(gVar, i2)) {
                    return false;
                }
                this.f4428c = i;
            }
            int a = m38225a(this.f4428c);
            int i3 = this.f4428c + this.f4429d;
            if (a > 0) {
                C1189b0 b0Var = this.f4427b;
                b0Var.m38143c(b0Var.m38140f() + a);
                if (!C8962i.m10828d(gVar, this.f4427b.m38142d(), this.f4427b.m38140f(), a)) {
                    return false;
                }
                C1189b0 b0Var2 = this.f4427b;
                b0Var2.m38148O(b0Var2.m38140f() + a);
                this.f4430e = this.f4426a.f4440j[i3 + (-1)] != 255;
            }
            if (i3 == this.f4426a.f4437g) {
                i3 = -1;
            }
            this.f4428c = i3;
        }
        return true;
    }

    public void m38221e() {
        this.f4426a.m38218b();
        this.f4427b.m38151L(0);
        this.f4428c = -1;
        this.f4430e = false;
    }

    public void m38220f() {
        if (this.f4427b.m38142d().length != 65025) {
            C1189b0 b0Var = this.f4427b;
            b0Var.m38149N(Arrays.copyOf(b0Var.m38142d(), Math.max(65025, this.f4427b.m38140f())), this.f4427b.m38140f());
        }
    }
}
