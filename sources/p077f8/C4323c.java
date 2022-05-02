package p077f8;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;
import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;
import p063e8.C4164a;
import p163l5.C6378r;
import p314w7.C9987a;

public class C4323c {
    public static final C4323c f14391a = new C4323c();

    @RecentlyNonNull
    public static ByteBuffer m28281a(@RecentlyNonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    public static C4323c m28278d() {
        return f14391a;
    }

    @RecentlyNonNull
    public static ByteBuffer m28276f(@RecentlyNonNull ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2;
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        if (z) {
            byteBuffer2 = ByteBuffer.allocate(limit);
        } else {
            byteBuffer2 = ByteBuffer.allocateDirect(limit);
        }
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 < i) {
                byteBuffer2.put(i3, byteBuffer.get(i3));
                i3++;
            }
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            byteBuffer2.put(i + i4, byteBuffer.get(((i4 % 2) * i2) + i + (i4 / 2)));
        }
        return byteBuffer2;
    }

    public static Bitmap m28275g(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    @TargetApi(19)
    public static final void m28274h(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit != 0) {
            int i5 = i / (i2 / limit);
            int i6 = 0;
            for (int i7 = 0; i7 < limit; i7++) {
                int i8 = i6;
                for (int i9 = 0; i9 < i5; i9++) {
                    bArr[i3] = buffer.get(i8);
                    i3 += i4;
                    i8 += plane.getPixelStride();
                }
                i6 += plane.getRowStride();
            }
        }
    }

    public Bitmap m28280b(@RecentlyNonNull Image image, int i) {
        C6378r.m20515b(image.getFormat() == 256, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        return m28275g(BitmapFactory.decodeByteArray(bArr, 0, remaining), i, image.getWidth(), image.getHeight());
    }

    public ByteBuffer m28279c(@RecentlyNonNull C4164a aVar, boolean z) {
        ByteBuffer byteBuffer;
        int e = aVar.m28641e();
        if (e == -1) {
            Bitmap bitmap = (Bitmap) C6378r.m20506k(aVar.m28643c());
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(height / 2.0d);
            int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i;
            if (z) {
                byteBuffer = ByteBuffer.allocate(ceil2);
            } else {
                byteBuffer = ByteBuffer.allocateDirect(ceil2);
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < height; i4++) {
                for (int i5 = 0; i5 < width; i5++) {
                    int i6 = iArr[i2];
                    int i7 = (i6 >> 16) & 255;
                    int i8 = (i6 >> 8) & 255;
                    int i9 = i6 & 255;
                    int i10 = (((((i7 * (-38)) - (i8 * 74)) + (i9 * 112)) + Log.TAG_YOUTUBE) >> 8) + Log.TAG_YOUTUBE;
                    int i11 = (((((i7 * 112) - (i8 * 94)) - (i9 * 18)) + Log.TAG_YOUTUBE) >> 8) + Log.TAG_YOUTUBE;
                    i3++;
                    byteBuffer.put(i3, (byte) Math.min(255, (((((i7 * 66) + (i8 * 129)) + (i9 * 25)) + Log.TAG_YOUTUBE) >> 8) + 16));
                    if (i4 % 2 == 0 && i2 % 2 == 0) {
                        int i12 = i + 1;
                        byteBuffer.put(i, (byte) Math.min(255, i11));
                        i = i12 + 1;
                        byteBuffer.put(i12, (byte) Math.min(255, i10));
                    }
                    i2++;
                }
            }
            return byteBuffer;
        } else if (e != 17) {
            if (e != 35) {
                if (e == 842094169) {
                    return m28276f((ByteBuffer) C6378r.m20506k(aVar.m28642d()), z);
                }
                throw new C9987a("Unsupported image format", 13);
            } else if (Build.VERSION.SDK_INT >= 19) {
                return m28277e((Image.Plane[]) C6378r.m20506k(aVar.m28638h()), aVar.m28636j(), aVar.m28640f());
            } else {
                throw new C9987a("Unsupported image format", 13);
            }
        } else if (z) {
            return m28281a((ByteBuffer) C6378r.m20506k(aVar.m28642d()));
        } else {
            return (ByteBuffer) C6378r.m20506k(aVar.m28642d());
        }
    }

    @RecentlyNonNull
    public ByteBuffer m28277e(@RecentlyNonNull Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[i4 + i4 + i3];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i5 = (i3 + i3) / 4;
        boolean z = buffer2.remaining() == i5 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            m28274h(planeArr[0], i, i2, bArr, 0, 1);
            m28274h(planeArr[1], i, i2, bArr, i3 + 1, 2);
            m28274h(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
