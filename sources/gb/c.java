package gb;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import db.g;
import org.thunderdog.challegram.Log;

public class c {
    public final a f12175a;
    public Runnable f12176b;
    public boolean f12177c;
    public int f12178d;
    public int f12179e;
    public int f12180f;
    public int f12181g;
    public int f12182h;
    public float f12183i;
    public float f12184j;
    public float f12185k;
    public float f12186l;

    public interface a {
        boolean B(float f10, float f11);

        void C(View view, float f10, float f11);

        boolean E4();

        void G(View view, float f10, float f11);

        void U2(View view, float f10, float f11);

        void U4(View view, float f10, float f11);

        boolean X6(float f10, float f11);

        long getLongPressDuration();

        boolean m0(View view, float f10, float f11);

        void o(View view, float f10, float f11);

        void o2(View view, float f10, float f11);

        boolean s4(View view, float f10, float f11);

        void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13);
    }

    public c(a aVar) {
        this.f12175a = aVar;
    }

    public void c(View view) {
        if ((this.f12182h & 2) == 0) {
            return;
        }
        if (this.f12175a.s4(view, this.f12183i, this.f12184j)) {
            this.f12182h &= -3;
            this.f12176b = null;
            d(view, this.f12183i, this.f12184j);
            return;
        }
        this.f12182h |= 8;
    }

    public void b(View view, float f10, float f11) {
        f(view, f10, f11);
    }

    public final void d(View view, float f10, float f11) {
        this.f12185k = f10;
        this.f12186l = f11;
        if (this.f12175a.X6(f10, f11)) {
            g.b(view, true, this.f12175a.E4());
        } else {
            view.performHapticFeedback(0);
        }
        this.f12182h = (this.f12182h | 4) & (-9) & (-3);
        this.f12176b = null;
    }

    public boolean e(View view, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int i10 = this.f12182h;
                if ((i10 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        this.f12175a.o(view, x10, y10);
                        this.f12182h &= -5;
                    } else {
                        this.f12175a.C(view, x10, y10);
                        if ((this.f12182h & Log.TAG_CRASH) == 0) {
                            g.c(view);
                        }
                    }
                    f(view, x10, y10);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3 && (this.f12182h & 1) != 0) {
                    f(view, x10, y10);
                    return true;
                }
            } else if ((this.f12182h & 1) != 0) {
                this.f12175a.U4(view, x10, y10);
                if ((this.f12182h & 4) != 0) {
                    this.f12175a.z6(view, motionEvent, x10, y10, this.f12185k, this.f12186l);
                } else if (Math.max(Math.abs(this.f12183i - x10), Math.abs(this.f12184j - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                    f(view, x10, y10);
                }
                return true;
            }
            return (this.f12182h & 1) != 0;
        }
        f(view, x10, y10);
        if ((this.f12177c && (x10 < this.f12178d || x10 > this.f12180f || y10 < this.f12179e || y10 > this.f12181g)) || !this.f12175a.m0(view, x10, y10)) {
            return false;
        }
        this.f12182h |= 1;
        this.f12183i = x10;
        this.f12184j = y10;
        this.f12175a.U2(view, x10, y10);
        if (this.f12175a.B(x10, y10)) {
            g(view);
        }
        return true;
    }

    public final void f(View view, float f10, float f11) {
        int i10 = this.f12182h;
        if ((i10 & 2) != 0) {
            this.f12182h = i10 & (-3);
            Runnable runnable = this.f12176b;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f12176b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i11 = this.f12182h;
        if ((i11 & 8) != 0) {
            this.f12182h = i11 & (-9);
            this.f12175a.G(view, f10, f11);
        }
        if ((this.f12182h & 4) != 0) {
            this.f12175a.o(view, f10, f11);
            this.f12182h &= -5;
        }
        if ((this.f12182h & 1) != 0) {
            this.f12175a.o2(view, f10, f11);
            this.f12182h &= -2;
        }
    }

    public final void g(final View view) {
        if (view == null) {
            return;
        }
        if (this.f12176b == null) {
            this.f12182h |= 2;
            Runnable aVar = new Runnable() {
                @Override
                public final void run() {
                    c.this.c(view);
                }
            };
            this.f12176b = aVar;
            view.postDelayed(aVar, this.f12175a.getLongPressDuration());
            return;
        }
        throw new AssertionError();
    }

    public c h(boolean z10) {
        this.f12182h = ib.c.h(this.f12182h, Log.TAG_CRASH, z10);
        return this;
    }
}
