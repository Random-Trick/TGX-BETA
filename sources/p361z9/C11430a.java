package p361z9;

import p192n9.C7310b;

public class C11430a implements AbstractC11433d {
    public final int f36394a;
    public final int f36395b;

    public C11430a(int i, int i2) {
        this.f36394a = i;
        this.f36395b = i2;
    }

    @Override
    public C7310b mo662a(C7310b bVar) {
        int i;
        int i2;
        if (bVar.m17065b() <= this.f36394a && bVar.m17066a() <= this.f36395b) {
            return bVar;
        }
        float b = bVar.m17065b() / bVar.m17066a();
        if (bVar.m17066a() / this.f36395b >= bVar.m17065b() / this.f36394a) {
            i = this.f36395b;
            i2 = (int) (i * b);
        } else {
            i2 = this.f36394a;
            i = (int) (i2 / b);
        }
        if (i2 % 2 != 0) {
            i2--;
        }
        if (i % 2 != 0) {
            i--;
        }
        return new C7310b(i2, i);
    }
}
