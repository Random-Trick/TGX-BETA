package p105h8;

import p093g8.C4525h;

public final class C5026e extends AbstractC5029h {
    @Override
    public C5022a mo24255c(C5022a aVar, int i, int i2, C5031j jVar) {
        if (i <= 0 || i2 <= 0) {
            throw C4525h.m27496a();
        }
        C5022a aVar2 = new C5022a(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            jVar.m24244f(fArr);
            AbstractC5029h.m24257a(aVar, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (aVar.m24281d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        aVar2.m24276i(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C4525h.m27496a();
                }
            }
        }
        return aVar2;
    }
}
