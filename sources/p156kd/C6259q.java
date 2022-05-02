package p156kd;

import android.graphics.Bitmap;
import java.util.HashMap;
import nc.C7389v0;

public class C6259q {
    public static C6259q f19777b;
    public HashMap<C6246h, Bitmap> f19778a;

    public static C6259q m20786c() {
        if (f19777b == null) {
            synchronized (C6259q.class) {
                if (f19777b == null) {
                    f19777b = new C6259q();
                }
            }
        }
        return f19777b;
    }

    public void m20788a(C6246h hVar) {
        Bitmap e = m20784e(hVar);
        if (C7389v0.m16756A1(e)) {
            e.recycle();
        }
    }

    public Bitmap m20787b(C6246h hVar) {
        HashMap<C6246h, Bitmap> hashMap = this.f19778a;
        if (hashMap != null) {
            return hashMap.get(hVar);
        }
        return null;
    }

    public void m20785d(C6246h hVar, Bitmap bitmap) {
        if (this.f19778a == null) {
            this.f19778a = new HashMap<>();
        }
        this.f19778a.put(hVar, bitmap);
    }

    public Bitmap m20784e(C6246h hVar) {
        HashMap<C6246h, Bitmap> hashMap = this.f19778a;
        if (hashMap != null) {
            return hashMap.remove(hVar);
        }
        return null;
    }
}
