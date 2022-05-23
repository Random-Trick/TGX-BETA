package ld;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class y {
    public Reference<x> f16429a;

    public y(x xVar) {
        this.f16429a = new WeakReference(xVar);
    }

    public void a(h hVar, boolean z10, Bitmap bitmap) {
        x xVar = this.f16429a.get();
        if (xVar != null) {
            xVar.d0(hVar, z10, bitmap);
        }
    }

    public void b(h hVar, float f10) {
        x xVar = this.f16429a.get();
        if (xVar != null) {
            xVar.n5(hVar, f10);
        }
    }
}
