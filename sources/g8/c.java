package g8;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import f8.a;
import java.nio.ByteBuffer;
import m5.r;
import org.thunderdog.challegram.Log;

public class c {
    public static final c f12160a = new c();

    @RecentlyNonNull
    public static ByteBuffer a(@RecentlyNonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    public static c d() {
        return f12160a;
    }

    @RecentlyNonNull
    public static ByteBuffer f(@RecentlyNonNull ByteBuffer byteBuffer, boolean z10) {
        ByteBuffer byteBuffer2;
        int i10;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i11 = limit / 6;
        if (z10) {
            byteBuffer2 = ByteBuffer.allocate(limit);
        } else {
            byteBuffer2 = ByteBuffer.allocateDirect(limit);
        }
        int i12 = 0;
        while (true) {
            i10 = i11 * 4;
            if (i12 < i10) {
                byteBuffer2.put(i12, byteBuffer.get(i12));
                i12++;
            }
        }
        for (int i13 = 0; i13 < i11 + i11; i13++) {
            byteBuffer2.put(i10 + i13, byteBuffer.get(((i13 % 2) * i11) + i10 + (i13 / 2)));
        }
        return byteBuffer2;
    }

    public static Bitmap g(Bitmap bitmap, int i10, int i11, int i12) {
        if (i10 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    @TargetApi(19)
    public static final void h(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit != 0) {
            int i14 = i10 / (i11 / limit);
            int i15 = 0;
            for (int i16 = 0; i16 < limit; i16++) {
                int i17 = i15;
                for (int i18 = 0; i18 < i14; i18++) {
                    bArr[i12] = buffer.get(i17);
                    i12 += i13;
                    i17 += plane.getPixelStride();
                }
                i15 += plane.getRowStride();
            }
        }
    }

    public Bitmap b(@RecentlyNonNull Image image, int i10) {
        r.b(image.getFormat() == 256, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        return g(BitmapFactory.decodeByteArray(bArr, 0, remaining), i10, image.getWidth(), image.getHeight());
    }

    public ByteBuffer c(@RecentlyNonNull a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        int e10 = aVar.e();
        if (e10 == -1) {
            Bitmap bitmap = (Bitmap) r.k(aVar.c());
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(height / 2.0d);
            int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i10;
            if (z10) {
                byteBuffer = ByteBuffer.allocate(ceil2);
            } else {
                byteBuffer = ByteBuffer.allocateDirect(ceil2);
            }
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < height; i13++) {
                for (int i14 = 0; i14 < width; i14++) {
                    int i15 = iArr[i11];
                    int i16 = (i15 >> 16) & 255;
                    int i17 = (i15 >> 8) & 255;
                    int i18 = i15 & 255;
                    int i19 = (((((i16 * (-38)) - (i17 * 74)) + (i18 * 112)) + Log.TAG_YOUTUBE) >> 8) + Log.TAG_YOUTUBE;
                    int i20 = (((((i16 * 112) - (i17 * 94)) - (i18 * 18)) + Log.TAG_YOUTUBE) >> 8) + Log.TAG_YOUTUBE;
                    i12++;
                    byteBuffer.put(i12, (byte) Math.min(255, (((((i16 * 66) + (i17 * 129)) + (i18 * 25)) + Log.TAG_YOUTUBE) >> 8) + 16));
                    if (i13 % 2 == 0 && i11 % 2 == 0) {
                        int i21 = i10 + 1;
                        byteBuffer.put(i10, (byte) Math.min(255, i20));
                        i10 = i21 + 1;
                        byteBuffer.put(i21, (byte) Math.min(255, i19));
                    }
                    i11++;
                }
            }
            return byteBuffer;
        } else if (e10 != 17) {
            if (e10 == 35) {
                return e((Image.Plane[]) r.k(aVar.h()), aVar.j(), aVar.f());
            }
            if (e10 == 842094169) {
                return f((ByteBuffer) r.k(aVar.d()), z10);
            }
            throw new x7.a("Unsupported image format", 13);
        } else if (z10) {
            return a((ByteBuffer) r.k(aVar.d()));
        } else {
            return (ByteBuffer) r.k(aVar.d());
        }
    }

    @RecentlyNonNull
    public ByteBuffer e(@RecentlyNonNull Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        byte[] bArr = new byte[i13 + i13 + i12];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i14 = (i12 + i12) / 4;
        boolean z10 = buffer2.remaining() == i14 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z10) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer3.get(bArr, i12 + 1, i14 - 1);
        } else {
            h(planeArr[0], i10, i11, bArr, 0, 1);
            h(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            h(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
