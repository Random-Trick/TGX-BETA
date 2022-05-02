package p028c1;

import android.os.Build;
import android.view.DisplayCutout;
import p016b1.C1128d;

public final class C1439c {
    public final Object f5264a;

    public C1439c(Object obj) {
        this.f5264a = obj;
    }

    public static C1439c m36918e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1439c(obj);
    }

    public int m36922a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5264a).getSafeInsetBottom();
        }
        return 0;
    }

    public int m36921b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5264a).getSafeInsetLeft();
        }
        return 0;
    }

    public int m36920c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5264a).getSafeInsetRight();
        }
        return 0;
    }

    public int m36919d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5264a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1439c.class != obj.getClass()) {
            return false;
        }
        return C1128d.m38333a(this.f5264a, ((C1439c) obj).f5264a);
    }

    public int hashCode() {
        Object obj = this.f5264a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f5264a + "}";
    }
}
