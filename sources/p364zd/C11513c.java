package p364zd;

import android.graphics.Color;
import java.util.Arrays;
import p108hb.C5064d;

public class C11513c {
    public boolean f36555a;
    public int f36556b;
    public final float[] f36557c;

    public C11513c(int i) {
        this(i, false, null);
    }

    public boolean m350a(int i, float f) {
        float[] fArr = this.f36557c;
        if (fArr[i] == f) {
            return false;
        }
        fArr[i] = f;
        this.f36556b = Color.HSVToColor(Color.alpha(this.f36556b), this.f36557c);
        return true;
    }

    public void m349b(int i) {
        if (C5064d.m24130b(255, this.f36556b) == C5064d.m24130b(255, i)) {
            this.f36556b = i;
        } else if (this.f36556b != i) {
            this.f36556b = i;
            float[] fArr = this.f36557c;
            float f = fArr[0];
            Color.colorToHSV(i, fArr);
            float[] fArr2 = this.f36557c;
            if (fArr2[0] != f) {
                float f2 = fArr2[0];
                fArr2[0] = f;
                if (Color.HSVToColor(Color.alpha(i), this.f36557c) != i) {
                    this.f36557c[0] = f2;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11513c)) {
            return false;
        }
        C11513c cVar = (C11513c) obj;
        return this.f36556b == cVar.f36556b && Arrays.equals(this.f36557c, cVar.f36557c);
    }

    public C11513c(int i, C11513c cVar) {
        this(i, true, cVar);
    }

    public C11513c(int i, boolean z, C11513c cVar) {
        float[] fArr = new float[3];
        this.f36557c = fArr;
        this.f36555a = z;
        if (!z || cVar == null) {
            this.f36556b = i;
            Color.colorToHSV(i, fArr);
            return;
        }
        this.f36556b = cVar.f36556b;
        float[] fArr2 = cVar.f36557c;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        m349b(i);
    }
}
