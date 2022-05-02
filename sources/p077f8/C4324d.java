package p077f8;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;
import java.nio.ByteBuffer;
import p063e8.C4164a;
import p163l5.C6352j;
import p163l5.C6378r;

public class C4324d {
    public static final C6352j f14392a = new C6352j("MLKitImageUtils", "");
    public static C4324d f14393b = new C4324d();

    @RecentlyNonNull
    public static C4324d m28272b() {
        return f14393b;
    }

    @androidx.annotation.RecentlyNonNull
    public p272t5.AbstractC8983b m28273a(@androidx.annotation.RecentlyNonNull p063e8.C4164a r4) {
        throw new UnsupportedOperationException("Method not decompiled: p077f8.C4324d.m28273a(e8.a):t5.b");
    }

    @TargetApi(19)
    public int m28271c(@RecentlyNonNull C4164a aVar) {
        if (aVar.m28641e() == -1) {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((Bitmap) C6378r.m20506k(aVar.m28643c())).getAllocationByteCount();
            }
            return ((Bitmap) C6378r.m20506k(aVar.m28643c())).getByteCount();
        } else if (aVar.m28641e() == 17 || aVar.m28641e() == 842094169) {
            return ((ByteBuffer) C6378r.m20506k(aVar.m28642d())).limit();
        } else {
            if (aVar.m28641e() != 35) {
                return 0;
            }
            return (((Image.Plane[]) C6378r.m20506k(aVar.m28638h()))[0].getBuffer().limit() * 3) / 2;
        }
    }
}
