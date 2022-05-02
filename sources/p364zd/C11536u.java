package p364zd;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import be.C1410y;
import java.lang.ref.WeakReference;
import p108hb.C5063c;
import p108hb.C5064d;
import td.AbstractC9321v2;
import td.C9239m;
import td.C9289s;
import td.View$OnClickListenerC9150b;

public class C11536u {
    public final int f36975a;
    public int f36976b;
    public final WeakReference<Object> f36977c;
    public int f36978d;
    public int f36979e;
    public float f36980f = 1.0f;

    public C11536u(int i, int i2, Object obj) {
        this.f36975a = i;
        this.f36976b = i2;
        this.f36977c = new WeakReference<>(obj);
    }

    public boolean m89a(boolean z) {
        Object obj = this.f36977c.get();
        if (obj == null) {
            return false;
        }
        boolean z2 = obj instanceof View;
        if (z && ((this.f36978d & 1) != 0 || (z2 && ((View) obj).getParent() == null))) {
            return true;
        }
        switch (this.f36975a) {
            case 0:
                if (!(obj instanceof AbstractC11535t)) {
                    if (z2) {
                        ((View) obj).invalidate();
                        break;
                    }
                } else {
                    ((AbstractC11535t) obj).mo90c(z);
                    break;
                }
                break;
            case 1:
                if (m87c() && z2) {
                    ((View) obj).setBackgroundColor(m88b());
                    break;
                }
                break;
            case 2:
                if (m87c()) {
                    if (!(obj instanceof TextView)) {
                        if (!(obj instanceof AbstractC9321v2)) {
                            if (obj instanceof View$OnClickListenerC9150b) {
                                ((View$OnClickListenerC9150b) obj).setColor(m88b());
                                break;
                            }
                        } else {
                            ((AbstractC9321v2) obj).setTextColor(m88b());
                            break;
                        }
                    } else {
                        ((TextView) obj).setTextColor(m88b());
                        break;
                    }
                }
                break;
            case 3:
                if (m87c() && (obj instanceof TextView)) {
                    ((TextView) obj).setHintTextColor(m88b());
                    break;
                }
                break;
            case 4:
                if (m87c() && (obj instanceof TextView)) {
                    ((TextView) obj).setHighlightColor(m88b());
                    break;
                }
                break;
            case 5:
                if (m87c() && (obj instanceof Paint)) {
                    ((Paint) obj).setColor(m88b());
                    break;
                }
                break;
            case 6:
                if (m87c()) {
                    if (!(obj instanceof Paint)) {
                        if (!(obj instanceof ImageView)) {
                            if (obj instanceof Drawable) {
                                ((Drawable) obj).setColorFilter(C1410y.m37004z(m88b()));
                                break;
                            }
                        } else {
                            ((ImageView) obj).setColorFilter(m88b());
                            break;
                        }
                    } else {
                        ((Paint) obj).setColorFilter(C1410y.m37004z(m88b()));
                        break;
                    }
                }
                break;
            case 7:
                if (m87c()) {
                    if (!(obj instanceof ImageView)) {
                        if (obj instanceof Drawable) {
                            ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(m88b(), PorterDuff.Mode.MULTIPLY));
                            break;
                        }
                    } else {
                        ((ImageView) obj).setColorFilter(new PorterDuffColorFilter(m88b(), PorterDuff.Mode.MULTIPLY));
                        break;
                    }
                }
                break;
            case 8:
                if (m87c() || C11541z.m7t().m9r(this.f36979e)) {
                    if (!(obj instanceof C9239m)) {
                        if (obj instanceof C9289s) {
                            ((C9289s) obj).m9630E1(m88b(), C11524j.m228N(this.f36979e));
                            break;
                        }
                    } else {
                        ((C9239m) obj).m9829T1(m88b(), C11524j.m228N(this.f36979e));
                        break;
                    }
                }
                break;
            case 9:
                if (m87c() && (obj instanceof TextView)) {
                    ((TextView) obj).setLinkTextColor(m88b());
                    break;
                }
                break;
        }
        return true;
    }

    public final int m88b() {
        int N = C11524j.m228N(this.f36976b);
        if ((this.f36978d & 2) != 0) {
            N = C5064d.m24132a(C11524j.m180h0(), N);
        }
        float f = this.f36980f;
        return f != 1.0f ? C5064d.m24132a(f, N) : N;
    }

    public final boolean m87c() {
        return C11541z.m7t().m9r(this.f36976b);
    }

    public boolean m86d() {
        return this.f36977c.get() == null;
    }

    public C11536u m85e(float f) {
        this.f36980f = f;
        return this;
    }

    public C11536u m84f(int i) {
        this.f36979e = i;
        return this;
    }

    public void m83g(boolean z) {
        this.f36978d = C5063c.m24139h(this.f36978d, 2, z);
    }

    public void m82h(int i) {
        this.f36976b = i;
    }

    public boolean m81i(Object obj) {
        return obj != null && obj.equals(this.f36977c.get());
    }

    public boolean m80j(Object obj, int i) {
        return obj != null && obj.equals(this.f36977c.get()) && this.f36975a == i;
    }
}
