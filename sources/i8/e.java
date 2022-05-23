package i8;

import h8.h;

public final class e extends h {
    @Override
    public a c(a aVar, int i10, int i11, j jVar) {
        if (i10 <= 0 || i11 <= 0) {
            throw h.a();
        }
        a aVar2 = new a(i10, i11);
        int i12 = i10 * 2;
        float[] fArr = new float[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            float f10 = i13 + 0.5f;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = (i14 / 2) + 0.5f;
                fArr[i14 + 1] = f10;
            }
            jVar.f(fArr);
            h.a(aVar, fArr);
            for (int i15 = 0; i15 < i12; i15 += 2) {
                try {
                    if (aVar.d((int) fArr[i15], (int) fArr[i15 + 1])) {
                        aVar2.i(i15 / 2, i13);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw h.a();
                }
            }
        }
        return aVar2;
    }
}
