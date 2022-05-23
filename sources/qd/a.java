package qd;

import android.util.SparseIntArray;
import org.thunderdog.challegram.R;

public class a {
    public static final int[] f21532i = {0, R.id.theme_color_photoShadowTint1, R.id.theme_color_photoShadowTint2, R.id.theme_color_photoShadowTint3, R.id.theme_color_photoShadowTint4, R.id.theme_color_photoShadowTint5, R.id.theme_color_photoShadowTint6, R.id.theme_color_photoShadowTint7};
    public static final int[] f21533j = {0, R.id.theme_color_photoHighlightTint1, R.id.theme_color_photoHighlightTint2, R.id.theme_color_photoHighlightTint3, R.id.theme_color_photoHighlightTint4, R.id.theme_color_photoHighlightTint5, R.id.theme_color_photoHighlightTint6, R.id.theme_color_photoHighlightTint7};
    public final SparseIntArray f21534a;
    public long f21535b;
    public boolean f21536c;
    public float f21537d;
    public float f21538e;
    public float f21539f;
    public float f21540g;
    public float f21541h;

    public a() {
        this.f21534a = new SparseIntArray(15);
        for (int i10 = 0; i10 < 15; i10++) {
            this.f21534a.put(i10, 0);
        }
    }

    public static boolean a(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 10 || i10 == 12;
    }

    public boolean b(a aVar) {
        if (!(aVar.f21537d == this.f21537d && aVar.f21538e == this.f21538e && aVar.f21539f == this.f21539f && aVar.f21540g == this.f21540g && aVar.f21541h == this.f21541h && aVar.f21534a.size() == this.f21534a.size())) {
            return false;
        }
        int size = aVar.f21534a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (aVar.f21534a.valueAt(i10) != this.f21534a.get(aVar.f21534a.keyAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public float c() {
        return this.f21541h;
    }

    public float d() {
        return this.f21538e;
    }

    public float e() {
        return this.f21537d;
    }

    public float f() {
        return this.f21539f;
    }

    public float g() {
        return this.f21540g;
    }

    public float h(int i10) {
        return this.f21534a.get(i10) / 100.0f;
    }

    public long i() {
        return this.f21535b;
    }

    public int j(int i10) {
        return this.f21534a.get(i10);
    }

    public boolean k() {
        int size = this.f21534a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f21534a.valueAt(i10) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean l() {
        return this.f21536c;
    }

    public void m(a aVar) {
        this.f21536c = aVar.f21536c;
        this.f21535b = aVar.f21535b;
        int size = aVar.f21534a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f21534a.append(aVar.f21534a.keyAt(i10), aVar.f21534a.valueAt(i10));
        }
    }

    public void n(boolean z10, long j10) {
        this.f21536c = z10;
        this.f21535b = j10;
    }

    public boolean o(int i10, int i11) {
        if (j(i10) == i11) {
            return false;
        }
        this.f21534a.put(i10, i11);
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f21534a.size(); i10++) {
            if (i10 != 0) {
                sb2.append("|");
            }
            sb2.append(this.f21534a.valueAt(i10));
        }
        return sb2.toString();
    }

    public a(a aVar) {
        this.f21534a = new SparseIntArray(aVar.f21534a.size());
        m(aVar);
    }
}
