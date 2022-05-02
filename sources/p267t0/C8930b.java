package p267t0;

import android.graphics.Insets;
import android.graphics.Rect;

public final class C8930b {
    public static final C8930b f28790e = new C8930b(0, 0, 0, 0);
    public final int f28791a;
    public final int f28792b;
    public final int f28793c;
    public final int f28794d;

    public C8930b(int i, int i2, int i3, int i4) {
        this.f28791a = i;
        this.f28792b = i2;
        this.f28793c = i3;
        this.f28794d = i4;
    }

    public static C8930b m10931a(C8930b bVar, C8930b bVar2) {
        return m10930b(Math.max(bVar.f28791a, bVar2.f28791a), Math.max(bVar.f28792b, bVar2.f28792b), Math.max(bVar.f28793c, bVar2.f28793c), Math.max(bVar.f28794d, bVar2.f28794d));
    }

    public static C8930b m10930b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f28790e;
        }
        return new C8930b(i, i2, i3, i4);
    }

    public static C8930b m10929c(Rect rect) {
        return m10930b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C8930b m10928d(Insets insets) {
        return m10930b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets m10927e() {
        return Insets.of(this.f28791a, this.f28792b, this.f28793c, this.f28794d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8930b.class != obj.getClass()) {
            return false;
        }
        C8930b bVar = (C8930b) obj;
        return this.f28794d == bVar.f28794d && this.f28791a == bVar.f28791a && this.f28793c == bVar.f28793c && this.f28792b == bVar.f28792b;
    }

    public int hashCode() {
        return (((((this.f28791a * 31) + this.f28792b) * 31) + this.f28793c) * 31) + this.f28794d;
    }

    public String toString() {
        return "Insets{left=" + this.f28791a + ", top=" + this.f28792b + ", right=" + this.f28793c + ", bottom=" + this.f28794d + '}';
    }
}
