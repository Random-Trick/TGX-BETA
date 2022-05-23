package c1;

import android.os.Build;
import android.view.DisplayCutout;
import b1.d;

public final class c {
    public final Object f4238a;

    public c(Object obj) {
        this.f4238a = obj;
    }

    public static c e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c(obj);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4238a).getSafeInsetBottom();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4238a).getSafeInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4238a).getSafeInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4238a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return d.a(this.f4238a, ((c) obj).f4238a);
    }

    public int hashCode() {
        Object obj = this.f4238a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f4238a + "}";
    }
}
