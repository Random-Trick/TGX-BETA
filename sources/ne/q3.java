package ne;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ce.j0;
import org.thunderdog.challegram.R;

@TargetApi(21)
public final class q3 extends ImageView {
    public c f18345a = c.OFF;
    public kb.b f18346b;

    public class a extends kb.b {
        public final c M;

        public a(c cVar) {
            this.M = cVar;
        }

        @Override
        public void b() {
            if (q3.this.f18346b == this) {
                q3.this.setState(this.M);
            }
        }
    }

    public static class b {
        public static final int[] f18347a;

        static {
            int[] iArr = new int[c.values().length];
            f18347a = iArr;
            try {
                iArr[c.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18347a[c.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18347a[c.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        OFF,
        ON,
        ERROR
    }

    public q3(Context context) {
        super(context);
    }

    public static int c(c cVar, c cVar2, boolean z10) {
        int i10 = b.f18347a[cVar2.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return z10 ? cVar == c.OFF ? R.drawable.swirl_draw_on_animation : cVar == c.ERROR ? R.drawable.swirl_error_state_to_fp_animation : R.drawable.swirl_fingerprint : R.drawable.swirl_fingerprint;
            }
            if (i10 == 3) {
                return z10 ? cVar == c.ON ? R.drawable.swirl_fp_to_error_state_animation : cVar == c.OFF ? R.drawable.swirl_error_on_animation : R.drawable.swirl_error : R.drawable.swirl_error;
            }
            throw new IllegalArgumentException("Unknown state: " + cVar2);
        } else if (!z10) {
            return 0;
        } else {
            if (cVar == c.ON) {
                return R.drawable.swirl_draw_off_animation;
            }
            if (cVar == c.ERROR) {
                return R.drawable.swirl_error_off_animation;
            }
            return 0;
        }
    }

    public void d() {
        if (this.f18345a == c.OFF) {
            setState(c.ON);
        }
    }

    public void e(c cVar, boolean z10) {
        if (cVar != this.f18345a) {
            kb.b bVar = this.f18346b;
            if (bVar != null) {
                removeCallbacks(bVar);
            }
            int c10 = c(this.f18345a, cVar, z10);
            if (c10 == 0) {
                setImageDrawable(null);
            } else {
                Drawable g10 = ce.c.g(getResources(), c10);
                setImageDrawable(g10);
                if (g10 instanceof Animatable) {
                    ((Animatable) g10).start();
                }
            }
            this.f18345a = cVar;
        }
    }

    public void f(int i10) {
        if (this.f18345a != c.OFF) {
            return;
        }
        if (i10 > 0) {
            j0.e0(new Runnable() {
                @Override
                public final void run() {
                    q3.this.d();
                }
            }, i10);
        } else {
            setState(c.ON);
        }
    }

    public void g(boolean z10) {
        c cVar = this.f18345a;
        c cVar2 = c.ERROR;
        if (cVar != cVar2) {
            kb.b bVar = this.f18346b;
            if (bVar != null) {
                bVar.c();
                this.f18346b = null;
            }
            c cVar3 = this.f18345a;
            setState(cVar2);
            if (!z10) {
                a aVar = new a(cVar3);
                this.f18346b = aVar;
                aVar.e(j0.o());
                j0.e0(this.f18346b, 1000L);
            }
        }
    }

    public c getState() {
        return this.f18345a;
    }

    public void setState(c cVar) {
        e(cVar, true);
    }
}
