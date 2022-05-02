package p254rd;

import android.graphics.Path;
import java.io.RandomAccessFile;
import java.util.Arrays;
import p039d.C3563j;
import p124ib.C5319b;
import p181mb.C6810a;

public class C8427b {
    public final C8434g f27355a;
    public final Path f27356b;
    public int f27357c;
    public int f27358d;
    public final C5319b f27359e;

    public C8427b(C8434g gVar) {
        this.f27355a = gVar;
        this.f27356b = new Path();
        this.f27357c = gVar.f27373b;
        this.f27358d = gVar.f27374c;
        this.f27359e = new C5319b((int) C3563j.f11957L0);
    }

    public final void m12519a(int i, float f, float f2) {
        this.f27359e.m23294a(i);
        this.f27359e.m23294a(this.f27355a.m12465i(f));
        this.f27359e.m23294a(this.f27355a.m12464j(f2));
    }

    public final void m12518b(int i, float f, float f2, float f3, float f4) {
        this.f27359e.m23294a(i);
        this.f27359e.m23294a(this.f27355a.m12465i(f));
        this.f27359e.m23294a(this.f27355a.m12464j(f2));
        this.f27359e.m23294a(this.f27355a.m12465i(f3));
        this.f27359e.m23294a(this.f27355a.m12464j(f4));
    }

    public final void m12517c(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        this.f27359e.m23294a(i);
        this.f27359e.m23294a(this.f27355a.m12465i(f));
        this.f27359e.m23294a(this.f27355a.m12464j(f2));
        this.f27359e.m23294a(this.f27355a.m12465i(f3));
        this.f27359e.m23294a(this.f27355a.m12464j(f4));
        this.f27359e.m23294a(this.f27355a.m12465i(f5));
        this.f27359e.m23294a(this.f27355a.m12464j(f6));
    }

    public boolean m12516d(C8427b bVar) {
        C5319b bVar2;
        return bVar == this || (bVar2 = bVar.f27359e) == this.f27359e || (bVar2.m23288g() == this.f27359e.m23288g() && Arrays.equals(bVar.f27359e.m23290e(), this.f27359e.m23290e()));
    }

    public void m12515e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f27356b.cubicTo(f, f2, f3, f4, f5, f6);
        m12517c(3, f, f2, f3, f4, f5, f6);
    }

    public int m12514f() {
        return this.f27359e.m23288g();
    }

    public int m12513g() {
        int g = this.f27359e.m23288g();
        return C6810a.m18917w(g) + (g * 4);
    }

    public Path m12512h(int i, int i2) {
        if (!(this.f27357c == i && this.f27358d == i2)) {
            this.f27357c = i;
            this.f27358d = i2;
            m12508l(i, i2);
        }
        return this.f27356b;
    }

    public void m12511i(float f, float f2) {
        this.f27356b.lineTo(f, f2);
        m12519a(1, f, f2);
    }

    public void m12510j(float f, float f2) {
        this.f27356b.moveTo(f, f2);
        m12519a(0, f, f2);
    }

    public void m12509k(float f, float f2, float f3, float f4) {
        this.f27356b.quadTo(f, f2, f3, f4);
        m12518b(2, f, f2, f3, f4);
    }

    public final void m12508l(int i, int i2) {
        int i3;
        this.f27356b.reset();
        int g = this.f27359e.m23288g();
        int i4 = 0;
        while (i4 < g) {
            int i5 = i4 + 1;
            int d = (int) this.f27359e.m23291d(i4);
            if (d == 0) {
                int i6 = i5 + 1;
                i3 = i6 + 1;
                this.f27356b.moveTo(i * this.f27359e.m23291d(i5), i2 * this.f27359e.m23291d(i6));
            } else if (d == 1) {
                int i7 = i5 + 1;
                i3 = i7 + 1;
                this.f27356b.lineTo(i * this.f27359e.m23291d(i5), i2 * this.f27359e.m23291d(i7));
            } else if (d == 2) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                i4 = i10 + 1;
                float f = i;
                float f2 = i2;
                this.f27356b.quadTo(this.f27359e.m23291d(i5) * f, this.f27359e.m23291d(i8) * f2, f * this.f27359e.m23291d(i9), f2 * this.f27359e.m23291d(i10));
            } else if (d == 3) {
                int i11 = i5 + 1;
                float d2 = this.f27359e.m23291d(i5);
                int i12 = i11 + 1;
                float d3 = this.f27359e.m23291d(i11);
                int i13 = i12 + 1;
                float d4 = this.f27359e.m23291d(i12);
                int i14 = i13 + 1;
                float d5 = this.f27359e.m23291d(i13);
                int i15 = i14 + 1;
                float d6 = this.f27359e.m23291d(i14);
                i4 = i15 + 1;
                float d7 = this.f27359e.m23291d(i15);
                float f3 = i;
                float f4 = f3 * d2;
                float f5 = i2;
                this.f27356b.cubicTo(f4, f5 * d3, f3 * d4, f5 * d5, f3 * d6, f5 * d7);
            } else {
                throw new IllegalArgumentException("type == " + d);
            }
            i4 = i3;
        }
    }

    public void m12507m(RandomAccessFile randomAccessFile) {
        int g = this.f27359e.m23288g();
        C6810a.m18940N(randomAccessFile, g);
        for (int i = 0; i < g; i++) {
            randomAccessFile.writeFloat(this.f27359e.m23291d(i));
        }
    }

    public void m12506n(C6810a aVar) {
        int g = this.f27359e.m23288g();
        aVar.m18941M(g);
        for (int i = 0; i < g; i++) {
            aVar.m18948F(this.f27359e.m23291d(i));
        }
    }

    public void m12505o() {
        this.f27359e.m23286i();
    }

    public C8427b(C8434g gVar, C6810a aVar) {
        this.f27355a = gVar;
        this.f27356b = new Path();
        int s = aVar.m18921s();
        float[] fArr = new float[s];
        for (int i = 0; i < s; i++) {
            fArr[i] = aVar.m18929k();
        }
        this.f27359e = new C5319b(fArr);
    }

    public C8427b(C8434g gVar, RandomAccessFile randomAccessFile) {
        this.f27355a = gVar;
        this.f27356b = new Path();
        int t = C6810a.m18920t(randomAccessFile);
        float[] fArr = new float[t];
        for (int i = 0; i < t; i++) {
            fArr[i] = randomAccessFile.readFloat();
        }
        this.f27359e = new C5319b(fArr);
    }
}
