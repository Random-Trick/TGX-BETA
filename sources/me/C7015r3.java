package me;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import be.C1362c;
import be.C1379j0;
import org.thunderdog.challegram.R;
import p139jb.AbstractRunnableC5910b;

@TargetApi(21)
public final class C7015r3 extends ImageView {
    public EnumC7018c f22236a = EnumC7018c.OFF;
    public AbstractRunnableC5910b f22237b;

    public class C7016a extends AbstractRunnableC5910b {
        public final EnumC7018c f22238M;

        public C7016a(EnumC7018c cVar) {
            this.f22238M = cVar;
        }

        @Override
        public void mo1364b() {
            if (C7015r3.this.f22237b == this) {
                C7015r3.this.setState(this.f22238M);
            }
        }
    }

    public static class C7017b {
        public static final int[] f22240a;

        static {
            int[] iArr = new int[EnumC7018c.values().length];
            f22240a = iArr;
            try {
                iArr[EnumC7018c.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22240a[EnumC7018c.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22240a[EnumC7018c.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum EnumC7018c {
        OFF,
        ON,
        ERROR
    }

    public C7015r3(Context context) {
        super(context);
    }

    public static int m18095c(EnumC7018c cVar, EnumC7018c cVar2, boolean z) {
        int i = C7017b.f22240a[cVar2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z ? cVar == EnumC7018c.OFF ? R.drawable.swirl_draw_on_animation : cVar == EnumC7018c.ERROR ? R.drawable.swirl_error_state_to_fp_animation : R.drawable.swirl_fingerprint : R.drawable.swirl_fingerprint;
            }
            if (i == 3) {
                return z ? cVar == EnumC7018c.ON ? R.drawable.swirl_fp_to_error_state_animation : cVar == EnumC7018c.OFF ? R.drawable.swirl_error_on_animation : R.drawable.swirl_error : R.drawable.swirl_error;
            }
            throw new IllegalArgumentException("Unknown state: " + cVar2);
        } else if (!z) {
            return 0;
        } else {
            if (cVar == EnumC7018c.ON) {
                return R.drawable.swirl_draw_off_animation;
            }
            if (cVar == EnumC7018c.ERROR) {
                return R.drawable.swirl_error_off_animation;
            }
            return 0;
        }
    }

    public void m18094d() {
        if (this.f22236a == EnumC7018c.OFF) {
            setState(EnumC7018c.ON);
        }
    }

    public void m18093e(EnumC7018c cVar, boolean z) {
        if (cVar != this.f22236a) {
            AbstractRunnableC5910b bVar = this.f22237b;
            if (bVar != null) {
                removeCallbacks(bVar);
            }
            int c = m18095c(this.f22236a, cVar, z);
            if (c == 0) {
                setImageDrawable(null);
            } else {
                Drawable g = C1362c.m37482g(getResources(), c);
                setImageDrawable(g);
                if (g instanceof Animatable) {
                    ((Animatable) g).start();
                }
            }
            this.f22236a = cVar;
        }
    }

    public void m18092f(int i) {
        if (this.f22236a != EnumC7018c.OFF) {
            return;
        }
        if (i > 0) {
            C1379j0.m37332e0(new Runnable() {
                @Override
                public final void run() {
                    C7015r3.this.m18094d();
                }
            }, i);
        } else {
            setState(EnumC7018c.ON);
        }
    }

    public void m18091g(boolean z) {
        EnumC7018c cVar = this.f22236a;
        EnumC7018c cVar2 = EnumC7018c.ERROR;
        if (cVar != cVar2) {
            AbstractRunnableC5910b bVar = this.f22237b;
            if (bVar != null) {
                bVar.m21857c();
                this.f22237b = null;
            }
            EnumC7018c cVar3 = this.f22236a;
            setState(cVar2);
            if (!z) {
                C7016a aVar = new C7016a(cVar3);
                this.f22237b = aVar;
                aVar.m21855e(C1379j0.m37313o());
                C1379j0.m37332e0(this.f22237b, 1000L);
            }
        }
    }

    public EnumC7018c getState() {
        return this.f22236a;
    }

    public void setState(EnumC7018c cVar) {
        m18093e(cVar, true);
    }
}
