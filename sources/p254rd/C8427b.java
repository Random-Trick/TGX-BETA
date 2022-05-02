package p254rd;

import android.graphics.Path;
import java.io.RandomAccessFile;
import java.util.Arrays;
import p039d.C3563j;
import p124ib.C5319b;
import p181mb.C6810a;

public class C8427b {
    public final C8434g f27352a;
    public final Path f27353b;
    public int f27354c;
    public int f27355d;
    public final C5319b f27356e;

    public C8427b(C8434g gVar) {
        this.f27352a = gVar;
        this.f27353b = new Path();
        this.f27354c = gVar.f27370b;
        this.f27355d = gVar.f27371c;
        this.f27356e = new C5319b((int) C3563j.f11957L0);
    }

    public final void m12520a(int i, float f, float f2) {
        this.f27356e.m23293a(i);
        this.f27356e.m23293a(this.f27352a.m12466i(f));
        this.f27356e.m23293a(this.f27352a.m12465j(f2));
    }

    public final void m12519b(int i, float f, float f2, float f3, float f4) {
        this.f27356e.m23293a(i);
        this.f27356e.m23293a(this.f27352a.m12466i(f));
        this.f27356e.m23293a(this.f27352a.m12465j(f2));
        this.f27356e.m23293a(this.f27352a.m12466i(f3));
        this.f27356e.m23293a(this.f27352a.m12465j(f4));
    }

    public final void m12518c(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        this.f27356e.m23293a(i);
        this.f27356e.m23293a(this.f27352a.m12466i(f));
        this.f27356e.m23293a(this.f27352a.m12465j(f2));
        this.f27356e.m23293a(this.f27352a.m12466i(f3));
        this.f27356e.m23293a(this.f27352a.m12465j(f4));
        this.f27356e.m23293a(this.f27352a.m12466i(f5));
        this.f27356e.m23293a(this.f27352a.m12465j(f6));
    }

    public boolean m12517d(C8427b bVar) {
        C5319b bVar2;
        return bVar == this || (bVar2 = bVar.f27356e) == this.f27356e || (bVar2.m23287g() == this.f27356e.m23287g() && Arrays.equals(bVar.f27356e.m23289e(), this.f27356e.m23289e()));
    }

    public void m12516e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f27353b.cubicTo(f, f2, f3, f4, f5, f6);
        m12518c(3, f, f2, f3, f4, f5, f6);
    }

    public int m12515f() {
        return this.f27356e.m23287g();
    }

    public int m12514g() {
        int g = this.f27356e.m23287g();
        return C6810a.m18916w(g) + (g * 4);
    }

    public Path m12513h(int i, int i2) {
        if (!(this.f27354c == i && this.f27355d == i2)) {
            this.f27354c = i;
            this.f27355d = i2;
            m12509l(i, i2);
        }
        return this.f27353b;
    }

    public void m12512i(float f, float f2) {
        this.f27353b.lineTo(f, f2);
        m12520a(1, f, f2);
    }

    public void m12511j(float f, float f2) {
        this.f27353b.moveTo(f, f2);
        m12520a(0, f, f2);
    }

    public void m12510k(float f, float f2, float f3, float f4) {
        this.f27353b.quadTo(f, f2, f3, f4);
        m12519b(2, f, f2, f3, f4);
    }

    public final void m12509l(int i, int i2) {
        int i3;
        this.f27353b.reset();
        int g = this.f27356e.m23287g();
        int i4 = 0;
        while (i4 < g) {
            int i5 = i4 + 1;
            int d = (int) this.f27356e.m23290d(i4);
            if (d == 0) {
                int i6 = i5 + 1;
                i3 = i6 + 1;
                this.f27353b.moveTo(i * this.f27356e.m23290d(i5), i2 * this.f27356e.m23290d(i6));
            } else if (d == 1) {
                int i7 = i5 + 1;
                i3 = i7 + 1;
                this.f27353b.lineTo(i * this.f27356e.m23290d(i5), i2 * this.f27356e.m23290d(i7));
            } else if (d == 2) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                i4 = i10 + 1;
                float f = i;
                float f2 = i2;
                this.f27353b.quadTo(this.f27356e.m23290d(i5) * f, this.f27356e.m23290d(i8) * f2, f * this.f27356e.m23290d(i9), f2 * this.f27356e.m23290d(i10));
            } else if (d == 3) {
                int i11 = i5 + 1;
                float d2 = this.f27356e.m23290d(i5);
                int i12 = i11 + 1;
                float d3 = this.f27356e.m23290d(i11);
                int i13 = i12 + 1;
                float d4 = this.f27356e.m23290d(i12);
                int i14 = i13 + 1;
                float d5 = this.f27356e.m23290d(i13);
                int i15 = i14 + 1;
                float d6 = this.f27356e.m23290d(i14);
                i4 = i15 + 1;
                float d7 = this.f27356e.m23290d(i15);
                float f3 = i;
                float f4 = f3 * d2;
                float f5 = i2;
                this.f27353b.cubicTo(f4, f5 * d3, f3 * d4, f5 * d5, f3 * d6, f5 * d7);
            } else {
                throw new IllegalArgumentException("type == " + d);
            }
            i4 = i3;
        }
    }

    public void m12508m(RandomAccessFile randomAccessFile) {
        int g = this.f27356e.m23287g();
        C6810a.m18939N(randomAccessFile, g);
        for (int i = 0; i < g; i++) {
            randomAccessFile.writeFloat(this.f27356e.m23290d(i));
        }
    }

    public void m12507n(C6810a aVar) {
        int g = this.f27356e.m23287g();
        aVar.m18940M(g);
        for (int i = 0; i < g; i++) {
            aVar.m18947F(this.f27356e.m23290d(i));
        }
    }

    public void m12506o() {
        this.f27356e.m23285i();
    }

    public C8427b(C8434g gVar, C6810a aVar) {
        this.f27352a = gVar;
        this.f27353b = new Path();
        int s = aVar.m18920s();
        float[] fArr = new float[s];
        for (int i = 0; i < s; i++) {
            fArr[i] = aVar.m18928k();
        }
        this.f27356e = new C5319b(fArr);
    }

    public C8427b(C8434g gVar, RandomAccessFile randomAccessFile) {
        this.f27352a = gVar;
        this.f27353b = new Path();
        int t = C6810a.m18919t(randomAccessFile);
        float[] fArr = new float[t];
        for (int i = 0; i < t; i++) {
            fArr[i] = randomAccessFile.readFloat();
        }
        this.f27356e = new C5319b(fArr);
    }
}
