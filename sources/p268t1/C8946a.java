package p268t1;

public class C8946a implements AbstractC8949d {
    public final AbstractC8949d f28820a;
    public int f28821b = 0;
    public int f28822c = -1;
    public int f28818M = -1;
    public Object f28819N = null;

    public C8946a(AbstractC8949d dVar) {
        this.f28820a = dVar;
    }

    @Override
    public void mo10851K6(int i, int i2, Object obj) {
        int i3;
        if (this.f28821b == 3) {
            int i4 = this.f28822c;
            int i5 = this.f28818M;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f28819N == obj) {
                this.f28822c = Math.min(i, i4);
                this.f28818M = Math.max(i5 + i4, i3) - this.f28822c;
                return;
            }
        }
        m10857a();
        this.f28822c = i;
        this.f28818M = i2;
        this.f28819N = obj;
        this.f28821b = 3;
    }

    @Override
    public void mo10850W1(int i, int i2) {
        int i3;
        if (this.f28821b == 1 && i >= (i3 = this.f28822c)) {
            int i4 = this.f28818M;
            if (i <= i3 + i4) {
                this.f28818M = i4 + i2;
                this.f28822c = Math.min(i, i3);
                return;
            }
        }
        m10857a();
        this.f28822c = i;
        this.f28818M = i2;
        this.f28821b = 1;
    }

    public void m10857a() {
        int i = this.f28821b;
        if (i != 0) {
            if (i == 1) {
                this.f28820a.mo10850W1(this.f28822c, this.f28818M);
            } else if (i == 2) {
                this.f28820a.mo10848m4(this.f28822c, this.f28818M);
            } else if (i == 3) {
                this.f28820a.mo10851K6(this.f28822c, this.f28818M, this.f28819N);
            }
            this.f28819N = null;
            this.f28821b = 0;
        }
    }

    @Override
    public void mo10849j0(int i, int i2) {
        m10857a();
        this.f28820a.mo10849j0(i, i2);
    }

    @Override
    public void mo10848m4(int i, int i2) {
        int i3;
        if (this.f28821b != 2 || (i3 = this.f28822c) < i || i3 > i + i2) {
            m10857a();
            this.f28822c = i;
            this.f28818M = i2;
            this.f28821b = 2;
            return;
        }
        this.f28818M += i2;
        this.f28822c = i;
    }
}
