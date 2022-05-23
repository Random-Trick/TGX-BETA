package ae;

import android.graphics.Color;
import ib.d;
import java.util.Arrays;

public class c {
    public boolean f823a;
    public int f824b;
    public final float[] f825c;

    public c(int i10) {
        this(i10, false, null);
    }

    public boolean a(int i10, float f10) {
        float[] fArr = this.f825c;
        if (fArr[i10] == f10) {
            return false;
        }
        fArr[i10] = f10;
        this.f824b = Color.HSVToColor(Color.alpha(this.f824b), this.f825c);
        return true;
    }

    public void b(int i10) {
        if (d.b(255, this.f824b) == d.b(255, i10)) {
            this.f824b = i10;
        } else if (this.f824b != i10) {
            this.f824b = i10;
            float[] fArr = this.f825c;
            float f10 = fArr[0];
            Color.colorToHSV(i10, fArr);
            float[] fArr2 = this.f825c;
            if (fArr2[0] != f10) {
                float f11 = fArr2[0];
                fArr2[0] = f10;
                if (Color.HSVToColor(Color.alpha(i10), this.f825c) != i10) {
                    this.f825c[0] = f11;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f824b == cVar.f824b && Arrays.equals(this.f825c, cVar.f825c);
    }

    public c(int i10, c cVar) {
        this(i10, true, cVar);
    }

    public c(int i10, boolean z10, c cVar) {
        float[] fArr = new float[3];
        this.f825c = fArr;
        this.f823a = z10;
        if (!z10 || cVar == null) {
            this.f824b = i10;
            Color.colorToHSV(i10, fArr);
            return;
        }
        this.f824b = cVar.f824b;
        float[] fArr2 = cVar.f825c;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        b(i10);
    }
}
