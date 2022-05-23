package sd;

import android.graphics.Path;
import d.j;
import java.io.RandomAccessFile;
import java.util.Arrays;
import nb.a;

public class b {
    public final g f22711a;
    public final Path f22712b;
    public int f22713c;
    public int f22714d;
    public final jb.b f22715e;

    public b(g gVar) {
        this.f22711a = gVar;
        this.f22712b = new Path();
        this.f22713c = gVar.f22729b;
        this.f22714d = gVar.f22730c;
        this.f22715e = new jb.b((int) j.L0);
    }

    public final void a(int i10, float f10, float f11) {
        this.f22715e.a(i10);
        this.f22715e.a(this.f22711a.i(f10));
        this.f22715e.a(this.f22711a.j(f11));
    }

    public final void b(int i10, float f10, float f11, float f12, float f13) {
        this.f22715e.a(i10);
        this.f22715e.a(this.f22711a.i(f10));
        this.f22715e.a(this.f22711a.j(f11));
        this.f22715e.a(this.f22711a.i(f12));
        this.f22715e.a(this.f22711a.j(f13));
    }

    public final void c(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f22715e.a(i10);
        this.f22715e.a(this.f22711a.i(f10));
        this.f22715e.a(this.f22711a.j(f11));
        this.f22715e.a(this.f22711a.i(f12));
        this.f22715e.a(this.f22711a.j(f13));
        this.f22715e.a(this.f22711a.i(f14));
        this.f22715e.a(this.f22711a.j(f15));
    }

    public boolean d(b bVar) {
        jb.b bVar2;
        return bVar == this || (bVar2 = bVar.f22715e) == this.f22715e || (bVar2.g() == this.f22715e.g() && Arrays.equals(bVar.f22715e.e(), this.f22715e.e()));
    }

    public void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f22712b.cubicTo(f10, f11, f12, f13, f14, f15);
        c(3, f10, f11, f12, f13, f14, f15);
    }

    public int f() {
        return this.f22715e.g();
    }

    public int g() {
        int g10 = this.f22715e.g();
        return a.w(g10) + (g10 * 4);
    }

    public Path h(int i10, int i11) {
        if (!(this.f22713c == i10 && this.f22714d == i11)) {
            this.f22713c = i10;
            this.f22714d = i11;
            l(i10, i11);
        }
        return this.f22712b;
    }

    public void i(float f10, float f11) {
        this.f22712b.lineTo(f10, f11);
        a(1, f10, f11);
    }

    public void j(float f10, float f11) {
        this.f22712b.moveTo(f10, f11);
        a(0, f10, f11);
    }

    public void k(float f10, float f11, float f12, float f13) {
        this.f22712b.quadTo(f10, f11, f12, f13);
        b(2, f10, f11, f12, f13);
    }

    public final void l(int i10, int i11) {
        int i12;
        this.f22712b.reset();
        int g10 = this.f22715e.g();
        int i13 = 0;
        while (i13 < g10) {
            int i14 = i13 + 1;
            int d10 = (int) this.f22715e.d(i13);
            if (d10 == 0) {
                int i15 = i14 + 1;
                i12 = i15 + 1;
                this.f22712b.moveTo(i10 * this.f22715e.d(i14), i11 * this.f22715e.d(i15));
            } else if (d10 == 1) {
                int i16 = i14 + 1;
                i12 = i16 + 1;
                this.f22712b.lineTo(i10 * this.f22715e.d(i14), i11 * this.f22715e.d(i16));
            } else if (d10 == 2) {
                int i17 = i14 + 1;
                int i18 = i17 + 1;
                int i19 = i18 + 1;
                i13 = i19 + 1;
                float f10 = i10;
                float f11 = i11;
                this.f22712b.quadTo(this.f22715e.d(i14) * f10, this.f22715e.d(i17) * f11, f10 * this.f22715e.d(i18), f11 * this.f22715e.d(i19));
            } else if (d10 == 3) {
                int i20 = i14 + 1;
                float d11 = this.f22715e.d(i14);
                int i21 = i20 + 1;
                float d12 = this.f22715e.d(i20);
                int i22 = i21 + 1;
                float d13 = this.f22715e.d(i21);
                int i23 = i22 + 1;
                float d14 = this.f22715e.d(i22);
                int i24 = i23 + 1;
                float d15 = this.f22715e.d(i23);
                i13 = i24 + 1;
                float d16 = this.f22715e.d(i24);
                float f12 = i10;
                float f13 = f12 * d11;
                float f14 = i11;
                this.f22712b.cubicTo(f13, f14 * d12, f12 * d13, f14 * d14, f12 * d15, f14 * d16);
            } else {
                throw new IllegalArgumentException("type == " + d10);
            }
            i13 = i12;
        }
    }

    public void m(RandomAccessFile randomAccessFile) {
        int g10 = this.f22715e.g();
        a.N(randomAccessFile, g10);
        for (int i10 = 0; i10 < g10; i10++) {
            randomAccessFile.writeFloat(this.f22715e.d(i10));
        }
    }

    public void n(a aVar) {
        int g10 = this.f22715e.g();
        aVar.M(g10);
        for (int i10 = 0; i10 < g10; i10++) {
            aVar.F(this.f22715e.d(i10));
        }
    }

    public void o() {
        this.f22715e.i();
    }

    public b(g gVar, a aVar) {
        this.f22711a = gVar;
        this.f22712b = new Path();
        int s10 = aVar.s();
        float[] fArr = new float[s10];
        for (int i10 = 0; i10 < s10; i10++) {
            fArr[i10] = aVar.k();
        }
        this.f22715e = new jb.b(fArr);
    }

    public b(g gVar, RandomAccessFile randomAccessFile) {
        this.f22711a = gVar;
        this.f22712b = new Path();
        int t10 = a.t(randomAccessFile);
        float[] fArr = new float[t10];
        for (int i10 = 0; i10 < t10; i10++) {
            fArr[i10] = randomAccessFile.readFloat();
        }
        this.f22715e = new jb.b(fArr);
    }
}
