package p156kd;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class C6267y {
    public Reference<AbstractC6266x> f19786a;

    public C6267y(AbstractC6266x xVar) {
        this.f19786a = new WeakReference(xVar);
    }

    public void m20750a(C6246h hVar, boolean z, Bitmap bitmap) {
        AbstractC6266x xVar = this.f19786a.get();
        if (xVar != null) {
            xVar.mo14384k0(hVar, z, bitmap);
        }
    }

    public void m20749b(C6246h hVar, float f) {
        AbstractC6266x xVar = this.f19786a.get();
        if (xVar != null) {
            xVar.mo14383q5(hVar, f);
        }
    }
}
