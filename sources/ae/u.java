package ae;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ce.y;
import ib.c;
import ib.d;
import java.lang.ref.WeakReference;
import ud.b;
import ud.m;
import ud.s;
import ud.v2;

public class u {
    public final int f1058a;
    public int f1059b;
    public final WeakReference<Object> f1060c;
    public int f1061d;
    public int f1062e;
    public float f1063f = 1.0f;

    public u(int i10, int i11, Object obj) {
        this.f1058a = i10;
        this.f1059b = i11;
        this.f1060c = new WeakReference<>(obj);
    }

    public boolean a(boolean z10) {
        Object obj = this.f1060c.get();
        if (obj == null) {
            return false;
        }
        boolean z11 = obj instanceof View;
        if (z10 && ((this.f1061d & 1) != 0 || (z11 && ((View) obj).getParent() == null))) {
            return true;
        }
        switch (this.f1058a) {
            case 0:
                if (!(obj instanceof t)) {
                    if (z11) {
                        ((View) obj).invalidate();
                        break;
                    }
                } else {
                    ((t) obj).c(z10);
                    break;
                }
                break;
            case 1:
                if (c() && z11) {
                    ((View) obj).setBackgroundColor(b());
                    break;
                }
                break;
            case 2:
                if (c()) {
                    if (!(obj instanceof TextView)) {
                        if (!(obj instanceof v2)) {
                            if (obj instanceof b) {
                                ((b) obj).setColor(b());
                                break;
                            }
                        } else {
                            ((v2) obj).setTextColor(b());
                            break;
                        }
                    } else {
                        ((TextView) obj).setTextColor(b());
                        break;
                    }
                }
                break;
            case 3:
                if (c() && (obj instanceof TextView)) {
                    ((TextView) obj).setHintTextColor(b());
                    break;
                }
                break;
            case 4:
                if (c() && (obj instanceof TextView)) {
                    ((TextView) obj).setHighlightColor(b());
                    break;
                }
                break;
            case 5:
                if (c() && (obj instanceof Paint)) {
                    ((Paint) obj).setColor(b());
                    break;
                }
                break;
            case 6:
                if (c()) {
                    if (!(obj instanceof Paint)) {
                        if (!(obj instanceof ImageView)) {
                            if (obj instanceof Drawable) {
                                ((Drawable) obj).setColorFilter(y.z(b()));
                                break;
                            }
                        } else {
                            ((ImageView) obj).setColorFilter(b());
                            break;
                        }
                    } else {
                        ((Paint) obj).setColorFilter(y.z(b()));
                        break;
                    }
                }
                break;
            case 7:
                if (c()) {
                    if (!(obj instanceof ImageView)) {
                        if (obj instanceof Drawable) {
                            ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(b(), PorterDuff.Mode.MULTIPLY));
                            break;
                        }
                    } else {
                        ((ImageView) obj).setColorFilter(new PorterDuffColorFilter(b(), PorterDuff.Mode.MULTIPLY));
                        break;
                    }
                }
                break;
            case 8:
                if (c() || z.u().s(this.f1062e)) {
                    if (!(obj instanceof m)) {
                        if (obj instanceof s) {
                            ((s) obj).B1(b(), j.L(this.f1062e));
                            break;
                        }
                    } else {
                        ((m) obj).U1(b(), j.L(this.f1062e));
                        break;
                    }
                }
                break;
            case 9:
                if (c() && (obj instanceof TextView)) {
                    ((TextView) obj).setLinkTextColor(b());
                    break;
                }
                break;
        }
        return true;
    }

    public final int b() {
        int L = j.L(this.f1059b);
        if ((this.f1061d & 2) != 0) {
            L = d.a(j.f0(), L);
        }
        float f10 = this.f1063f;
        return f10 != 1.0f ? d.a(f10, L) : L;
    }

    public final boolean c() {
        return z.u().s(this.f1059b);
    }

    public boolean d() {
        return this.f1060c.get() == null;
    }

    public u e(float f10) {
        this.f1063f = f10;
        return this;
    }

    public u f(int i10) {
        this.f1062e = i10;
        return this;
    }

    public void g(boolean z10) {
        this.f1061d = c.h(this.f1061d, 2, z10);
    }

    public void h(int i10) {
        this.f1059b = i10;
    }

    public boolean i(Object obj) {
        return obj != null && obj.equals(this.f1060c.get());
    }

    public boolean j(Object obj, int i10) {
        return obj != null && obj.equals(this.f1060c.get()) && this.f1058a == i10;
    }
}
