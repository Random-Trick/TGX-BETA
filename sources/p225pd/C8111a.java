package p225pd;

import android.util.SparseIntArray;
import org.thunderdog.challegram.R;

public class C8111a {
    public static final int[] f26349i = {0, R.id.theme_color_photoShadowTint1, R.id.theme_color_photoShadowTint2, R.id.theme_color_photoShadowTint3, R.id.theme_color_photoShadowTint4, R.id.theme_color_photoShadowTint5, R.id.theme_color_photoShadowTint6, R.id.theme_color_photoShadowTint7};
    public static final int[] f26350j = {0, R.id.theme_color_photoHighlightTint1, R.id.theme_color_photoHighlightTint2, R.id.theme_color_photoHighlightTint3, R.id.theme_color_photoHighlightTint4, R.id.theme_color_photoHighlightTint5, R.id.theme_color_photoHighlightTint6, R.id.theme_color_photoHighlightTint7};
    public final SparseIntArray f26351a;
    public long f26352b;
    public boolean f26353c;
    public float f26354d;
    public float f26355e;
    public float f26356f;
    public float f26357g;
    public float f26358h;

    public C8111a() {
        this.f26351a = new SparseIntArray(15);
        for (int i = 0; i < 15; i++) {
            this.f26351a.put(i, 0);
        }
    }

    public static boolean m13584a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 10 || i == 12;
    }

    public boolean m13583b(C8111a aVar) {
        if (!(aVar.f26354d == this.f26354d && aVar.f26355e == this.f26355e && aVar.f26356f == this.f26356f && aVar.f26357g == this.f26357g && aVar.f26358h == this.f26358h && aVar.f26351a.size() == this.f26351a.size())) {
            return false;
        }
        int size = aVar.f26351a.size();
        for (int i = 0; i < size; i++) {
            if (aVar.f26351a.valueAt(i) != this.f26351a.get(aVar.f26351a.keyAt(i))) {
                return false;
            }
        }
        return true;
    }

    public float m13582c() {
        return this.f26358h;
    }

    public float m13581d() {
        return this.f26355e;
    }

    public float m13580e() {
        return this.f26354d;
    }

    public float m13579f() {
        return this.f26356f;
    }

    public float m13578g() {
        return this.f26357g;
    }

    public float m13577h(int i) {
        return this.f26351a.get(i) / 100.0f;
    }

    public long m13576i() {
        return this.f26352b;
    }

    public int m13575j(int i) {
        return this.f26351a.get(i);
    }

    public boolean m13574k() {
        int size = this.f26351a.size();
        for (int i = 0; i < size; i++) {
            if (this.f26351a.valueAt(i) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean m13573l() {
        return this.f26353c;
    }

    public void m13572m(C8111a aVar) {
        this.f26353c = aVar.f26353c;
        this.f26352b = aVar.f26352b;
        int size = aVar.f26351a.size();
        for (int i = 0; i < size; i++) {
            this.f26351a.append(aVar.f26351a.keyAt(i), aVar.f26351a.valueAt(i));
        }
    }

    public void m13571n(boolean z, long j) {
        this.f26353c = z;
        this.f26352b = j;
    }

    public boolean m13570o(int i, int i2) {
        if (m13575j(i) == i2) {
            return false;
        }
        this.f26351a.put(i, i2);
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < this.f26351a.size(); i++) {
            if (i != 0) {
                sb2.append("|");
            }
            sb2.append(this.f26351a.valueAt(i));
        }
        return sb2.toString();
    }

    public C8111a(C8111a aVar) {
        this.f26351a = new SparseIntArray(aVar.f26351a.size());
        m13572m(aVar);
    }
}
