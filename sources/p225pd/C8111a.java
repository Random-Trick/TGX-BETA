package p225pd;

import android.util.SparseIntArray;
import org.thunderdog.challegram.R;

public class C8111a {
    public static final int[] f26346i = {0, R.id.theme_color_photoShadowTint1, R.id.theme_color_photoShadowTint2, R.id.theme_color_photoShadowTint3, R.id.theme_color_photoShadowTint4, R.id.theme_color_photoShadowTint5, R.id.theme_color_photoShadowTint6, R.id.theme_color_photoShadowTint7};
    public static final int[] f26347j = {0, R.id.theme_color_photoHighlightTint1, R.id.theme_color_photoHighlightTint2, R.id.theme_color_photoHighlightTint3, R.id.theme_color_photoHighlightTint4, R.id.theme_color_photoHighlightTint5, R.id.theme_color_photoHighlightTint6, R.id.theme_color_photoHighlightTint7};
    public final SparseIntArray f26348a;
    public long f26349b;
    public boolean f26350c;
    public float f26351d;
    public float f26352e;
    public float f26353f;
    public float f26354g;
    public float f26355h;

    public C8111a() {
        this.f26348a = new SparseIntArray(15);
        for (int i = 0; i < 15; i++) {
            this.f26348a.put(i, 0);
        }
    }

    public static boolean m13585a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 10 || i == 12;
    }

    public boolean m13584b(C8111a aVar) {
        if (!(aVar.f26351d == this.f26351d && aVar.f26352e == this.f26352e && aVar.f26353f == this.f26353f && aVar.f26354g == this.f26354g && aVar.f26355h == this.f26355h && aVar.f26348a.size() == this.f26348a.size())) {
            return false;
        }
        int size = aVar.f26348a.size();
        for (int i = 0; i < size; i++) {
            if (aVar.f26348a.valueAt(i) != this.f26348a.get(aVar.f26348a.keyAt(i))) {
                return false;
            }
        }
        return true;
    }

    public float m13583c() {
        return this.f26355h;
    }

    public float m13582d() {
        return this.f26352e;
    }

    public float m13581e() {
        return this.f26351d;
    }

    public float m13580f() {
        return this.f26353f;
    }

    public float m13579g() {
        return this.f26354g;
    }

    public float m13578h(int i) {
        return this.f26348a.get(i) / 100.0f;
    }

    public long m13577i() {
        return this.f26349b;
    }

    public int m13576j(int i) {
        return this.f26348a.get(i);
    }

    public boolean m13575k() {
        int size = this.f26348a.size();
        for (int i = 0; i < size; i++) {
            if (this.f26348a.valueAt(i) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean m13574l() {
        return this.f26350c;
    }

    public void m13573m(C8111a aVar) {
        this.f26350c = aVar.f26350c;
        this.f26349b = aVar.f26349b;
        int size = aVar.f26348a.size();
        for (int i = 0; i < size; i++) {
            this.f26348a.append(aVar.f26348a.keyAt(i), aVar.f26348a.valueAt(i));
        }
    }

    public void m13572n(boolean z, long j) {
        this.f26350c = z;
        this.f26349b = j;
    }

    public boolean m13571o(int i, int i2) {
        if (m13576j(i) == i2) {
            return false;
        }
        this.f26348a.put(i, i2);
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < this.f26348a.size(); i++) {
            if (i != 0) {
                sb2.append("|");
            }
            sb2.append(this.f26348a.valueAt(i));
        }
        return sb2.toString();
    }

    public C8111a(C8111a aVar) {
        this.f26348a = new SparseIntArray(aVar.f26348a.size());
        m13573m(aVar);
    }
}
