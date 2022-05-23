package aa;

import o9.b;

public class a implements d {
    public final int f690a;
    public final int f691b;

    public a(int i10, int i11) {
        this.f690a = i10;
        this.f691b = i11;
    }

    @Override
    public b a(b bVar) {
        int i10;
        int i11;
        if (bVar.b() <= this.f690a && bVar.a() <= this.f691b) {
            return bVar;
        }
        float b10 = bVar.b() / bVar.a();
        if (bVar.a() / this.f691b >= bVar.b() / this.f690a) {
            i10 = this.f691b;
            i11 = (int) (i10 * b10);
        } else {
            i11 = this.f690a;
            i10 = (int) (i11 / b10);
        }
        if (i11 % 2 != 0) {
            i11--;
        }
        if (i10 % 2 != 0) {
            i10--;
        }
        return new b(i11, i10);
    }
}
