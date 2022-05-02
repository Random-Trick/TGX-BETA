package p267t0;

import android.graphics.Insets;
import android.graphics.Rect;

public final class C8930b {
    public static final C8930b f28787e = new C8930b(0, 0, 0, 0);
    public final int f28788a;
    public final int f28789b;
    public final int f28790c;
    public final int f28791d;

    public C8930b(int i, int i2, int i3, int i4) {
        this.f28788a = i;
        this.f28789b = i2;
        this.f28790c = i3;
        this.f28791d = i4;
    }

    public static C8930b m10932a(C8930b bVar, C8930b bVar2) {
        return m10931b(Math.max(bVar.f28788a, bVar2.f28788a), Math.max(bVar.f28789b, bVar2.f28789b), Math.max(bVar.f28790c, bVar2.f28790c), Math.max(bVar.f28791d, bVar2.f28791d));
    }

    public static C8930b m10931b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f28787e;
        }
        return new C8930b(i, i2, i3, i4);
    }

    public static C8930b m10930c(Rect rect) {
        return m10931b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C8930b m10929d(Insets insets) {
        return m10931b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets m10928e() {
        return Insets.of(this.f28788a, this.f28789b, this.f28790c, this.f28791d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8930b.class != obj.getClass()) {
            return false;
        }
        C8930b bVar = (C8930b) obj;
        return this.f28791d == bVar.f28791d && this.f28788a == bVar.f28788a && this.f28790c == bVar.f28790c && this.f28789b == bVar.f28789b;
    }

    public int hashCode() {
        return (((((this.f28788a * 31) + this.f28789b) * 31) + this.f28790c) * 31) + this.f28791d;
    }

    public String toString() {
        return "Insets{left=" + this.f28788a + ", top=" + this.f28789b + ", right=" + this.f28790c + ", bottom=" + this.f28791d + '}';
    }
}
