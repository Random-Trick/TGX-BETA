package ld;

import android.graphics.Bitmap;
import java.util.HashMap;
import oc.v0;

public class q {
    public static q f16420b;
    public HashMap<h, Bitmap> f16421a;

    public static q c() {
        if (f16420b == null) {
            synchronized (q.class) {
                if (f16420b == null) {
                    f16420b = new q();
                }
            }
        }
        return f16420b;
    }

    public void a(h hVar) {
        Bitmap e10 = e(hVar);
        if (v0.A1(e10)) {
            e10.recycle();
        }
    }

    public Bitmap b(h hVar) {
        HashMap<h, Bitmap> hashMap = this.f16421a;
        if (hashMap != null) {
            return hashMap.get(hVar);
        }
        return null;
    }

    public void d(h hVar, Bitmap bitmap) {
        if (this.f16421a == null) {
            this.f16421a = new HashMap<>();
        }
        this.f16421a.put(hVar, bitmap);
    }

    public Bitmap e(h hVar) {
        HashMap<h, Bitmap> hashMap = this.f16421a;
        if (hashMap != null) {
            return hashMap.remove(hVar);
        }
        return null;
    }
}
