package p063e8;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;
import p009a8.AbstractC0217h;
import p046d6.C3768p7;
import p046d6.C3786r7;
import p077f8.C4323c;
import p163l5.C6378r;

@Immutable
public class C4164a implements AbstractC0217h {
    public volatile Bitmap f14060a;
    public volatile ByteBuffer f14061b;
    public volatile C4165b f14062c;
    public final int f14063d;
    public final int f14064e;
    public final int f14065f;
    public final int f14066g;

    public C4164a(Bitmap bitmap, int i) {
        this.f14060a = (Bitmap) C6378r.m20507k(bitmap);
        this.f14063d = bitmap.getWidth();
        this.f14064e = bitmap.getHeight();
        this.f14065f = i;
        this.f14066g = -1;
    }

    public static C4164a m28647a(@RecentlyNonNull byte[] bArr, int i, int i2, int i3, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C4164a aVar = new C4164a(ByteBuffer.wrap((byte[]) C6378r.m20507k(bArr)), i, i2, i3, i4);
        m28637k(i4, 2, elapsedRealtime, i2, i, bArr.length, i3);
        return aVar;
    }

    public static C4164a m28646b(@RecentlyNonNull Image image, int i) {
        boolean z;
        int i2;
        C4164a aVar;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C6378r.m20506l(image, "Please provide a valid image");
        boolean z2 = true;
        if (i == 0 || i == 90 || i == 180) {
            i2 = i;
            z = true;
        } else if (i == 270) {
            z = true;
            i2 = 270;
        } else {
            i2 = i;
            z = false;
        }
        C6378r.m20516b(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (!(image.getFormat() == 256 || image.getFormat() == 35)) {
            z2 = false;
        }
        C6378r.m20516b(z2, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            aVar = new C4164a(C4323c.m28280d().m28282b(image, i2), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new C4164a(image, image.getWidth(), image.getHeight(), i2);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i3 = limit;
        C4164a aVar2 = aVar;
        m28637k(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i3, i2);
        return aVar2;
    }

    public static void m28637k(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        C3786r7.m29759a(C3768p7.m29775b("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    @RecentlyNullable
    public Bitmap m28645c() {
        return this.f14060a;
    }

    @RecentlyNullable
    public ByteBuffer m28644d() {
        return this.f14061b;
    }

    public int m28643e() {
        return this.f14066g;
    }

    public int m28642f() {
        return this.f14064e;
    }

    @RecentlyNullable
    public Image m28641g() {
        if (this.f14062c == null) {
            return null;
        }
        return this.f14062c.m28636a();
    }

    @RecentlyNullable
    public Image.Plane[] m28640h() {
        if (this.f14062c == null) {
            return null;
        }
        return this.f14062c.m28635b();
    }

    public int m28639i() {
        return this.f14065f;
    }

    public int m28638j() {
        return this.f14063d;
    }

    public C4164a(Image image, int i, int i2, int i3) {
        C6378r.m20507k(image);
        this.f14062c = new C4165b(image);
        this.f14063d = i;
        this.f14064e = i2;
        this.f14065f = i3;
        this.f14066g = 35;
    }

    public C4164a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i4 != 842094169) {
            if (i4 == 17) {
                i4 = 17;
            } else {
                z = false;
            }
        }
        C6378r.m20517a(z);
        this.f14061b = (ByteBuffer) C6378r.m20507k(byteBuffer);
        byteBuffer.rewind();
        this.f14063d = i;
        this.f14064e = i2;
        this.f14065f = i3;
        this.f14066g = i4;
    }
}
