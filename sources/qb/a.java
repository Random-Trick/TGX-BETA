package qb;

import ia.q;

public final class a extends b {
    public int f21491b;
    public boolean f21492c;

    @Override
    public void a(float f10) {
        if (!this.f21492c) {
            int i10 = 1;
            this.f21492c = true;
            int i11 = this.f21491b;
            if (1 <= i11) {
                while (true) {
                    qa.a<q> b10 = b();
                    if (b10 != null) {
                        b10.b();
                    }
                    if (i10 != i11) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean c() {
        return this.f21492c;
    }

    public final b e(int i10) {
        f(i10);
        this.f21492c = false;
        return this;
    }

    public final void f(int i10) {
        if (i10 > 1000) {
            i10 = 1000;
        }
        this.f21491b = i10;
    }
}
