package p223pb;

import p107ha.C5060q;
import pa.AbstractC8077a;

public final class C8100a extends AbstractC8101b {
    public int f26308b;
    public boolean f26309c;

    @Override
    public void mo13604a(float f) {
        if (!this.f26309c) {
            int i = 1;
            this.f26309c = true;
            int i2 = this.f26308b;
            if (1 <= i2) {
                while (true) {
                    AbstractC8077a<C5060q> b = m13603b();
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
    public boolean mo13602c() {
        return this.f26309c;
    }

    public final AbstractC8101b m13606e(int i) {
        m13605f(i);
        this.f26309c = false;
        return this;
    }

    public final void m13605f(int i) {
        if (i > 1000) {
            i = 1000;
        }
        this.f26308b = i;
    }
}
