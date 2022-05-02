package p364zd;

import android.graphics.Color;
import java.util.Arrays;
import p108hb.C5064d;

public class C11513c {
    public boolean f36557a;
    public int f36558b;
    public final float[] f36559c;

    public C11513c(int i) {
        this(i, false, null);
    }

    public boolean m350a(int i, float f) {
        float[] fArr = this.f36559c;
        if (fArr[i] == f) {
            return false;
        }
        fArr[i] = f;
        this.f36558b = Color.HSVToColor(Color.alpha(this.f36558b), this.f36559c);
        return true;
    }

    public void m349b(int i) {
        if (C5064d.m24131b(255, this.f36558b) == C5064d.m24131b(255, i)) {
            this.f36558b = i;
        } else if (this.f36558b != i) {
            this.f36558b = i;
            float[] fArr = this.f36559c;
            float f = fArr[0];
            Color.colorToHSV(i, fArr);
            float[] fArr2 = this.f36559c;
            if (fArr2[0] != f) {
                float f2 = fArr2[0];
                fArr2[0] = f;
                if (Color.HSVToColor(Color.alpha(i), this.f36559c) != i) {
                    this.f36559c[0] = f2;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11513c)) {
            return false;
        }
        C11513c cVar = (C11513c) obj;
        return this.f36558b == cVar.f36558b && Arrays.equals(this.f36559c, cVar.f36559c);
    }

    public C11513c(int i, C11513c cVar) {
        this(i, true, cVar);
    }

    public C11513c(int i, boolean z, C11513c cVar) {
        float[] fArr = new float[3];
        this.f36559c = fArr;
        this.f36557a = z;
        if (!z || cVar == null) {
            this.f36558b = i;
            Color.colorToHSV(i, fArr);
            return;
        }
        this.f36558b = cVar.f36558b;
        float[] fArr2 = cVar.f36559c;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        m349b(i);
    }
}
