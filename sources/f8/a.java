package f8;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import b8.h;
import e6.p7;
import e6.r7;
import g8.c;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;
import m5.r;

@Immutable
public class a implements h {
    public volatile Bitmap f11856a;
    public volatile ByteBuffer f11857b;
    public volatile b f11858c;
    public final int f11859d;
    public final int f11860e;
    public final int f11861f;
    public final int f11862g;

    public a(Bitmap bitmap, int i10) {
        this.f11856a = (Bitmap) r.k(bitmap);
        this.f11859d = bitmap.getWidth();
        this.f11860e = bitmap.getHeight();
        this.f11861f = i10;
        this.f11862g = -1;
    }

    public static a a(@RecentlyNonNull byte[] bArr, int i10, int i11, int i12, int i13) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(ByteBuffer.wrap((byte[]) r.k(bArr)), i10, i11, i12, i13);
        k(i13, 2, elapsedRealtime, i11, i10, bArr.length, i12);
        return aVar;
    }

    public static a b(@RecentlyNonNull Image image, int i10) {
        boolean z10;
        int i11;
        a aVar;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r.l(image, "Please provide a valid image");
        boolean z11 = true;
        if (i10 == 0 || i10 == 90 || i10 == 180) {
            i11 = i10;
            z10 = true;
        } else if (i10 == 270) {
            z10 = true;
            i11 = 270;
        } else {
            i11 = i10;
            z10 = false;
        }
        r.b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (!(image.getFormat() == 256 || image.getFormat() == 35)) {
            z11 = false;
        }
        r.b(z11, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            aVar = new a(c.d().b(image, i11), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new a(image, image.getWidth(), image.getHeight(), i11);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i12 = limit;
        a aVar2 = aVar;
        k(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i12, i11);
        return aVar2;
    }

    public static void k(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        r7.a(p7.b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    @RecentlyNullable
    public Bitmap c() {
        return this.f11856a;
    }

    @RecentlyNullable
    public ByteBuffer d() {
        return this.f11857b;
    }

    public int e() {
        return this.f11862g;
    }

    public int f() {
        return this.f11860e;
    }

    @RecentlyNullable
    public Image g() {
        if (this.f11858c == null) {
            return null;
        }
        return this.f11858c.a();
    }

    @RecentlyNullable
    public Image.Plane[] h() {
        if (this.f11858c == null) {
            return null;
        }
        return this.f11858c.b();
    }

    public int i() {
        return this.f11861f;
    }

    public int j() {
        return this.f11859d;
    }

    public a(Image image, int i10, int i11, int i12) {
        r.k(image);
        this.f11858c = new b(image);
        this.f11859d = i10;
        this.f11860e = i11;
        this.f11861f = i12;
        this.f11862g = 35;
    }

    public a(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        boolean z10 = true;
        if (i13 != 842094169) {
            if (i13 == 17) {
                i13 = 17;
            } else {
                z10 = false;
            }
        }
        r.a(z10);
        this.f11857b = (ByteBuffer) r.k(byteBuffer);
        byteBuffer.rewind();
        this.f11859d = i10;
        this.f11860e = i11;
        this.f11861f = i12;
        this.f11862g = i13;
    }
}
