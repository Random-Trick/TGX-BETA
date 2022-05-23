package ne;

import android.view.View;
import db.b;
import eb.k;
import ld.p;

public class j3 implements k.b {
    public k M;
    public boolean N;
    public final View f18159a;
    public final p f18160b;
    public float f18161c;

    public interface a {
        void i(float f10);
    }

    public j3(View view, p pVar) {
        this.f18159a = view;
        this.f18160b = pVar;
    }

    public float a() {
        return this.f18161c;
    }

    public boolean b() {
        return this.N;
    }

    public final void c(float f10) {
        if (this.f18161c != f10) {
            this.f18161c = f10;
            this.f18159a.invalidate();
            View view = this.f18159a;
            if (view instanceof a) {
                ((a) view).i(f10);
            }
        }
    }

    public void d(boolean z10, boolean z11) {
        if (this.N != z10) {
            this.N = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.M == null) {
                    this.M = new k(0, this, b.f7287b, 180L, this.f18161c);
                }
                this.M.i(f10);
                return;
            }
            k kVar = this.M;
            if (kVar != null) {
                kVar.l(f10);
            }
            c(f10);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        c(f10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }
}
