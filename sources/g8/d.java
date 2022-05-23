package g8;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import f8.a;
import java.nio.ByteBuffer;
import m5.j;
import m5.r;
import u5.b;

public class d {
    public static final j f12161a = new j("MLKitImageUtils", "");
    public static d f12162b = new d();

    @RecentlyNonNull
    public static d b() {
        return f12162b;
    }

    @RecentlyNonNull
    public b a(@RecentlyNonNull a aVar) {
        int e10 = aVar.e();
        if (e10 == -1) {
            return u5.d.x0((Bitmap) r.k(aVar.c()));
        }
        if (e10 != 17) {
            if (e10 == 35) {
                return u5.d.x0(aVar.g());
            }
            if (e10 != 842094169) {
                int e11 = aVar.e();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported image format: ");
                sb2.append(e11);
                throw new x7.a(sb2.toString(), 3);
            }
        }
        return u5.d.x0((ByteBuffer) r.k(aVar.d()));
    }

    @TargetApi(19)
    public int c(@RecentlyNonNull a aVar) {
        if (aVar.e() == -1) {
            return ((Bitmap) r.k(aVar.c())).getAllocationByteCount();
        }
        if (aVar.e() == 17 || aVar.e() == 842094169) {
            return ((ByteBuffer) r.k(aVar.d())).limit();
        }
        if (aVar.e() != 35) {
            return 0;
        }
        return (((Image.Plane[]) r.k(aVar.h()))[0].getBuffer().limit() * 3) / 2;
    }
}
