package p080fb;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.thunderdog.challegram.Log;
import p037cb.C2065g;
import p108hb.C5063c;

public class C4336c {
    public final AbstractC4337a f14406a;
    public Runnable f14407b;
    public boolean f14408c;
    public int f14409d;
    public int f14410e;
    public int f14411f;
    public int f14412g;
    public int f14413h;
    public float f14414i;
    public float f14415j;
    public float f14416k;
    public float f14417l;

    public interface AbstractC4337a {
        boolean mo7429B(float f, float f2);

        void mo7428C(View view, float f, float f2);

        void mo7427F(View view, float f, float f2);

        boolean mo7426K4();

        boolean mo7425W6(float f, float f2);

        void mo7424Z4(View view, float f, float f2);

        void mo7419f3(View view, float f, float f2);

        long getLongPressDuration();

        boolean mo7418n0(View view, float f, float f2);

        void mo7417o2(View view, float f, float f2);

        void mo7416p(View view, float f, float f2);

        boolean mo7415z4(View view, float f, float f2);

        void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4);
    }

    public C4336c(AbstractC4337a aVar) {
        this.f14406a = aVar;
    }

    public void m28250c(View view) {
        if ((this.f14413h & 2) == 0) {
            return;
        }
        if (this.f14406a.mo7415z4(view, this.f14414i, this.f14415j)) {
            this.f14413h &= -3;
            this.f14407b = null;
            m28249d(view, this.f14414i, this.f14415j);
            return;
        }
        this.f14413h |= 8;
    }

    public void m28251b(View view, float f, float f2) {
        m28247f(view, f, f2);
    }

    public final void m28249d(View view, float f, float f2) {
        this.f14416k = f;
        this.f14417l = f2;
        if (this.f14406a.mo7425W6(f, f2)) {
            C2065g.m35723b(view, true, this.f14406a.mo7426K4());
        } else {
            view.performHapticFeedback(0);
        }
        int i = this.f14413h | 4;
        this.f14413h = i;
        int i2 = i & (-9);
        this.f14413h = i2;
        this.f14413h = i2 & (-3);
        this.f14407b = null;
    }

    public boolean m28248e(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int i = this.f14413h;
                if ((i & 1) != 0) {
                    if ((i & 4) != 0) {
                        this.f14406a.mo7416p(view, x, y);
                        this.f14413h &= -5;
                    } else {
                        this.f14406a.mo7428C(view, x, y);
                        if ((this.f14413h & Log.TAG_CRASH) == 0) {
                            C2065g.m35722c(view);
                        }
                    }
                    m28247f(view, x, y);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3 && (this.f14413h & 1) != 0) {
                    m28247f(view, x, y);
                    return true;
                }
            } else if ((this.f14413h & 1) != 0) {
                this.f14406a.mo7424Z4(view, x, y);
                if ((this.f14413h & 4) != 0) {
                    this.f14406a.mo7414z6(view, motionEvent, x, y, this.f14416k, this.f14417l);
                } else if (Math.max(Math.abs(this.f14414i - x), Math.abs(this.f14415j - y)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                    m28247f(view, x, y);
                }
                return true;
            }
            return (this.f14413h & 1) != 0;
        }
        m28247f(view, x, y);
        if ((this.f14408c && (x < this.f14409d || x > this.f14411f || y < this.f14410e || y > this.f14412g)) || !this.f14406a.mo7418n0(view, x, y)) {
            return false;
        }
        this.f14413h |= 1;
        this.f14414i = x;
        this.f14415j = y;
        this.f14406a.mo7419f3(view, x, y);
        if (this.f14406a.mo7429B(x, y)) {
            m28246g(view);
        }
        return true;
    }

    public final void m28247f(View view, float f, float f2) {
        int i = this.f14413h;
        if ((i & 2) != 0) {
            this.f14413h = i & (-3);
            Runnable runnable = this.f14407b;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f14407b = null;
            } else {
                throw new AssertionError();
            }
        }
        int i2 = this.f14413h;
        if ((i2 & 8) != 0) {
            this.f14413h = i2 & (-9);
            this.f14406a.mo7427F(view, f, f2);
        }
        if ((this.f14413h & 4) != 0) {
            this.f14406a.mo7416p(view, f, f2);
            this.f14413h &= -5;
        }
        if ((this.f14413h & 1) != 0) {
            this.f14406a.mo7417o2(view, f, f2);
            this.f14413h &= -2;
        }
    }

    public final void m28246g(final View view) {
        if (view == null) {
            return;
        }
        if (this.f14407b == null) {
            this.f14413h |= 2;
            Runnable aVar = new Runnable() {
                @Override
                public final void run() {
                    C4336c.this.m28250c(view);
                }
            };
            this.f14407b = aVar;
            view.postDelayed(aVar, this.f14406a.getLongPressDuration());
            return;
        }
        throw new AssertionError();
    }

    public C4336c m28245h(boolean z) {
        this.f14413h = C5063c.m24139h(this.f14413h, Log.TAG_CRASH, z);
        return this;
    }
}
