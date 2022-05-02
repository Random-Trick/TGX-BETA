package p097h0;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.AbstractC0687y1;
import androidx.camera.view.C0714b;
import p351z.C11202l;

public class C4908i extends AbstractC0687y1 {
    public static final PointF f16760d = new PointF(2.0f, 2.0f);
    public final C0714b f16761b;
    public Matrix f16762c;

    public C4908i(C0714b bVar) {
        this.f16761b = bVar;
    }

    public void m24456a(Size size, int i) {
        C11202l.m1236a();
        synchronized (this) {
            if (!(size.getWidth() == 0 || size.getHeight() == 0)) {
                this.f16762c = this.f16761b.m40471c(size, i);
                return;
            }
            this.f16762c = null;
        }
    }
}
