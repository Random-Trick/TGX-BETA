package h0;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.x1;
import androidx.camera.view.b;
import z.l;

public class i extends x1 {
    public static final PointF f12429d = new PointF(2.0f, 2.0f);
    public final b f12430b;
    public Matrix f12431c;

    public i(b bVar) {
        this.f12430b = bVar;
    }

    public void a(Size size, int i10) {
        l.a();
        synchronized (this) {
            if (!(size.getWidth() == 0 || size.getHeight() == 0)) {
                this.f12431c = this.f12430b.c(size, i10);
                return;
            }
            this.f12431c = null;
        }
    }
}
