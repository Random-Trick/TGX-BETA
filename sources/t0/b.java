package t0;

import android.graphics.Insets;
import android.graphics.Rect;

public final class b {
    public static final b f22833e = new b(0, 0, 0, 0);
    public final int f22834a;
    public final int f22835b;
    public final int f22836c;
    public final int f22837d;

    public b(int i10, int i11, int i12, int i13) {
        this.f22834a = i10;
        this.f22835b = i11;
        this.f22836c = i12;
        this.f22837d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f22834a, bVar2.f22834a), Math.max(bVar.f22835b, bVar2.f22835b), Math.max(bVar.f22836c, bVar2.f22836c), Math.max(bVar.f22837d, bVar2.f22837d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f22833e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f22834a, this.f22835b, this.f22836c, this.f22837d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22837d == bVar.f22837d && this.f22834a == bVar.f22834a && this.f22836c == bVar.f22836c && this.f22835b == bVar.f22835b;
    }

    public int hashCode() {
        return (((((this.f22834a * 31) + this.f22835b) * 31) + this.f22836c) * 31) + this.f22837d;
    }

    public String toString() {
        return "Insets{left=" + this.f22834a + ", top=" + this.f22835b + ", right=" + this.f22836c + ", bottom=" + this.f22837d + '}';
    }
}
