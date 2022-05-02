package p268t1;

public class C8946a implements AbstractC8949d {
    public final AbstractC8949d f28823a;
    public int f28824b = 0;
    public int f28825c = -1;
    public int f28821M = -1;
    public Object f28822N = null;

    public C8946a(AbstractC8949d dVar) {
        this.f28823a = dVar;
    }

    @Override
    public void mo10850K6(int i, int i2, Object obj) {
        int i3;
        if (this.f28824b == 3) {
            int i4 = this.f28825c;
            int i5 = this.f28821M;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f28822N == obj) {
                this.f28825c = Math.min(i, i4);
                this.f28821M = Math.max(i5 + i4, i3) - this.f28825c;
                return;
            }
        }
        m10856a();
        this.f28825c = i;
        this.f28821M = i2;
        this.f28822N = obj;
        this.f28824b = 3;
    }

    @Override
    public void mo10849W1(int i, int i2) {
        int i3;
        if (this.f28824b == 1 && i >= (i3 = this.f28825c)) {
            int i4 = this.f28821M;
            if (i <= i3 + i4) {
                this.f28821M = i4 + i2;
                this.f28825c = Math.min(i, i3);
                return;
            }
        }
        m10856a();
        this.f28825c = i;
        this.f28821M = i2;
        this.f28824b = 1;
    }

    public void m10856a() {
        int i = this.f28824b;
        if (i != 0) {
            if (i == 1) {
                this.f28823a.mo10849W1(this.f28825c, this.f28821M);
            } else if (i == 2) {
                this.f28823a.mo10847m4(this.f28825c, this.f28821M);
            } else if (i == 3) {
                this.f28823a.mo10850K6(this.f28825c, this.f28821M, this.f28822N);
            }
            this.f28822N = null;
            this.f28824b = 0;
        }
    }

    @Override
    public void mo10848j0(int i, int i2) {
        m10856a();
        this.f28823a.mo10848j0(i, i2);
    }

    @Override
    public void mo10847m4(int i, int i2) {
        int i3;
        if (this.f28824b != 2 || (i3 = this.f28825c) < i || i3 > i + i2) {
            m10856a();
            this.f28825c = i;
            this.f28821M = i2;
            this.f28824b = 2;
            return;
        }
        this.f28821M += i2;
        this.f28825c = i;
    }
}
