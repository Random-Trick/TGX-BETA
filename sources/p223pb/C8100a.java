package p223pb;

import p107ha.C5060q;
import pa.AbstractC8077a;

public final class C8100a extends AbstractC8101b {
    public int f26305b;
    public boolean f26306c;

    @Override
    public void mo13605a(float f) {
        if (!this.f26306c) {
            int i = 1;
            this.f26306c = true;
            int i2 = this.f26305b;
            if (1 <= i2) {
                while (true) {
                    AbstractC8077a<C5060q> b = m13604b();
                    if (b != null) {
                        b.mo4925b();
                    }
                    if (i != i2) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean mo13603c() {
        return this.f26306c;
    }

    public final AbstractC8101b m13607e(int i) {
        m13606f(i);
        this.f26306c = false;
        return this;
    }

    public final void m13606f(int i) {
        if (i > 1000) {
            i = 1000;
        }
        this.f26305b = i;
    }
}
