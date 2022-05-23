package org.thunderdog.challegram.loader;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.OperationCanceledException;
import android.provider.MediaStore;
import android.util.Size;
import ce.j0;
import ib.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import jd.w;
import ld.f;
import ld.h;
import ld.l;
import ld.o;
import ld.s;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;

public class b {
    public static b f20081d;
    public static byte[] f20082e;
    public final org.thunderdog.challegram.loader.c f20083a = new org.thunderdog.challegram.loader.c();
    public final org.thunderdog.challegram.loader.c f20084b = new org.thunderdog.challegram.loader.c();
    public final org.thunderdog.challegram.loader.c f20085c = new org.thunderdog.challegram.loader.c();

    public class a implements ImageDecoder.OnHeaderDecodedListener {
        public final boolean f20086a;
        public final h f20087b;
        public final int[] f20088c;
        public final boolean f20089d;

        public a(boolean z10, h hVar, int[] iArr, boolean z11) {
            this.f20086a = z10;
            this.f20087b = hVar;
            this.f20088c = iArr;
            this.f20089d = z11;
        }

        @Override
        public void onHeaderDecoded(android.graphics.ImageDecoder r7, android.graphics.ImageDecoder.ImageInfo r8, android.graphics.ImageDecoder.Source r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.b.a.onHeaderDecoded(android.graphics.ImageDecoder, android.graphics.ImageDecoder$ImageInfo, android.graphics.ImageDecoder$Source):void");
        }
    }

    public class C0173b implements ImageDecoder.OnHeaderDecodedListener {
        public final l f20090a;

        public C0173b(l lVar) {
            this.f20090a = lVar;
        }

        @Override
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            imageDecoder.setAllocator(1);
            if (this.f20090a.K()) {
                imageDecoder.setMutableRequired(true);
            }
            int z10 = this.f20090a.I() ? 36 : this.f20090a.z();
            int width = imageInfo.getSize().getWidth();
            int height = imageInfo.getSize().getHeight();
            if (z10 != 0) {
                float f10 = z10;
                float f11 = width;
                float f12 = height;
                float min = Math.min(f10 / f11, f10 / f12);
                if (min < 1.0f) {
                    width = (int) (f11 * min);
                    height = (int) (f12 * min);
                    imageDecoder.setTargetSize(width, height);
                }
            }
            if (this.f20090a.P() && width != height) {
                if (width > height) {
                    int i10 = width / 2;
                    int i11 = height / 2;
                    imageDecoder.setCrop(new Rect(i10 - i11, 0, i10 + i11 + (height % 2), height));
                    return;
                }
                int i12 = height / 2;
                int i13 = width / 2;
                imageDecoder.setCrop(new Rect(0, i12 - i13, width, i12 + i13 + (width % 2)));
            }
        }
    }

    public interface c {
        void b(boolean z10, Bitmap bitmap);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        if (Math.max(i10, i11) <= i13) {
            return 1;
        }
        return i10 > i11 ? i10 / i12 : i11 / i13;
    }

    public static int b(BitmapFactory.Options options, int i10, int i11) {
        return a(options.outWidth, options.outHeight, i10, i11);
    }

    public static int c(int i10, int i11, int i12, int i13) {
        if (i11 > i13 || i10 > i13) {
            return Math.max(1, Math.max(i10 / i12, i11 / i13) - 1);
        }
        return 1;
    }

    public static Bitmap d(Bitmap bitmap) {
        return (!v0.A1(bitmap) || bitmap.getWidth() == bitmap.getHeight()) ? bitmap : w.D(bitmap);
    }

    public static Bitmap e(String str, BitmapFactory.Options options) {
        try {
            InputStream o22 = v0.o2(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(o22, null, options);
            if (o22 != null) {
                o22.close();
            }
            return decodeStream;
        } catch (Throwable th) {
            Log.e("Error decoding file", th, new Object[0]);
            return null;
        }
    }

    public static Bitmap f(String str, int i10) {
        String b12 = v0.b1(str);
        Bitmap bitmap = null;
        if (i.i(b12)) {
            return null;
        }
        long createLottieDecoder = N.createLottieDecoder(str, b12, null, 0);
        if (createLottieDecoder == 0) {
            return null;
        }
        int[] iArr = new int[2];
        N.getLottieSize(createLottieDecoder, iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            N.destroyLottieDecoder(createLottieDecoder);
            return null;
        }
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i10 != 0 && Math.max(i11, i12) > i10) {
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float min = Math.min(f10 / f11, f10 / f12);
            i11 = (int) (f11 * min);
            i12 = (int) (f12 * min);
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            if (N.getLottieFrame(createLottieDecoder, createBitmap, 0L)) {
                bitmap = createBitmap;
            } else {
                createBitmap.recycle();
            }
        } catch (Throwable th) {
            Log.e("Cannot create bitmap", th, new Object[0]);
        }
        N.destroyLottieDecoder(createLottieDecoder);
        return bitmap;
    }

    public static Bitmap g(String str, int i10, int i11, int i12) {
        String b12 = v0.b1(str);
        if (i.i(b12)) {
            return null;
        }
        if (i12 != 0 && Math.max(i10, i11) > i12) {
            float f10 = i12;
            float f11 = i10;
            float f12 = i11;
            float min = Math.min(f10 / f11, f10 / f12);
            i10 = (int) (f11 * min);
            i11 = (int) (f12 * min);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        if (N.decodeLottieFirstFrame(str, b12, createBitmap)) {
            return createBitmap;
        }
        createBitmap.recycle();
        return null;
    }

    public static BitmapFactory.Options h(String str) {
        if (str == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        i(str, options);
        return options;
    }

    public static void i(java.lang.String r11, android.graphics.BitmapFactory.Options r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.b.i(java.lang.String, android.graphics.BitmapFactory$Options):void");
    }

    public static BitmapFactory.Options j(String str) {
        if (str == null) {
            return null;
        }
        if (!fd.a.b()) {
            return h(str);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        File file = new File(str);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
            MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
            N.loadWebpImage(null, map, map.limit(), options, true);
            randomAccessFile.close();
            return options;
        } catch (Throwable th) {
            Log.w(32, "Cannot get WebP bounds, file: %s", th, str);
            return null;
        }
    }

    public static b k() {
        if (f20081d == null) {
            f20081d = new b();
        }
        return f20081d;
    }

    public static Bitmap m(byte[] bArr, int i10, boolean z10, boolean z11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i10 != 0) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = (options.outWidth == 0 || options.outHeight == 0) ? 1 : b(options, i10, i10);
        } else {
            options.inSampleSize = 1;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            if (i10 > 0 && Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight()) > i10 && z11) {
                decodeByteArray = v(decodeByteArray, i10, i10, false);
            }
            if (z10 && (decodeByteArray.getWidth() < 100 || decodeByteArray.getHeight() < 100)) {
                v0.r(decodeByteArray, 3, 1);
            } else if (fd.a.f11884f) {
                N.pinBitmapIfNeeded(decodeByteArray);
            }
        }
        return decodeByteArray;
    }

    public static android.graphics.Bitmap p(ld.h r22, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.b.p(ld.h, java.lang.String):android.graphics.Bitmap");
    }

    public static Bitmap v(Bitmap bitmap, int i10, int i11, boolean z10) {
        return w(bitmap, i10, i11, z10, false, true);
    }

    public static android.graphics.Bitmap w(android.graphics.Bitmap r3, int r4, int r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.b.w(android.graphics.Bitmap, int, int, boolean, boolean, boolean):android.graphics.Bitmap");
    }

    public static Bitmap x(Bitmap bitmap, int i10, int i11) {
        if (v0.A1(bitmap) && i10 > 0 && i11 > 0 && (bitmap.getWidth() > i10 || bitmap.getHeight() > i11)) {
            float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            Bitmap bitmap2 = null;
            try {
                bitmap2 = v(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), false);
            } catch (Throwable unused) {
            }
            if (!(bitmap2 == null || bitmap == bitmap2)) {
                bitmap.recycle();
                return bitmap2;
            }
        }
        return bitmap;
    }

    public void l(Runnable runnable) {
        this.f20083a.e(runnable, 0L);
    }

    public final void n(h hVar, byte[] bArr, c cVar) {
        boolean z10 = false;
        Bitmap m10 = m(bArr, hVar.z(), !hVar.M() && hVar.z0(), true);
        if (!(m10 == null || !hVar.P() || m10.getWidth() == m10.getHeight())) {
            m10 = w.D(m10);
        }
        if (m10 != null) {
            z10 = true;
        }
        cVar.b(z10, m10);
    }

    public final void o(h hVar, c cVar) {
        Bitmap bitmap;
        try {
            InputStream openInputStream = j0.n().getContentResolver().openInputStream(Uri.parse(hVar.q()));
            bitmap = BitmapFactory.decodeStream(openInputStream);
            if (openInputStream != null) {
                openInputStream.close();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            bitmap = null;
        }
        boolean z10 = false;
        if (bitmap != null) {
            int i10 = (hVar.N() || !fd.a.f11884f) ? 0 : 1;
            if (hVar.P()) {
                bitmap = d(bitmap);
            }
            if (!hVar.M() && hVar.z0() && hVar.N()) {
                v0.r(bitmap, hVar.h(), i10 ^ 1);
            } else if (i10 != 0) {
                N.pinBitmapIfNeeded(bitmap);
            }
        }
        if (bitmap != null) {
            z10 = true;
        }
        cVar.b(z10, bitmap);
    }

    public void q(org.thunderdog.challegram.loader.a aVar, h hVar, String str, c cVar) {
        org.thunderdog.challegram.loader.c cVar2 = hVar.i() != null ? this.f20085c : ((hVar instanceof s) || (hVar instanceof o) || ((hVar instanceof l) && ((l) hVar).e1())) ? this.f20084b : this.f20083a;
        if (Thread.currentThread() != cVar2) {
            cVar2.i(aVar, hVar, str, cVar);
        } else if (!aVar.g()) {
            byte[] i10 = hVar.i();
            if (i10 != null) {
                n(hVar, i10, cVar);
            } else if (hVar instanceof f) {
                n(hVar, ((f) hVar).D0().N, cVar);
            } else if (hVar instanceof o) {
                r((o) hVar, cVar);
            } else if (hVar instanceof s) {
                u((s) hVar, cVar);
            } else {
                if (hVar instanceof l) {
                    l lVar = (l) hVar;
                    if (lVar.f1()) {
                        t(aVar, lVar, cVar);
                        return;
                    }
                }
                if (hVar.L()) {
                    s(hVar, cVar);
                } else if (hVar.H()) {
                    o(hVar, cVar);
                } else {
                    Bitmap p10 = p(hVar, str);
                    cVar.b(p10 != null, p10);
                }
            }
        }
    }

    public final void r(o oVar, c cVar) {
        byte[] a10 = yd.b.a(oVar.D0());
        if (a10 == null || a10.length == 0) {
            cVar.b(false, null);
        } else {
            n(oVar, a10, cVar);
        }
    }

    public final void s(h hVar, c cVar) {
        Bitmap j10 = nd.b.j(hVar.z(), hVar.P(), hVar.q());
        cVar.b(j10 != null, j10);
    }

    public final void t(org.thunderdog.challegram.loader.a aVar, l lVar, c cVar) {
        MediaMetadataRetriever mediaMetadataRetriever;
        long K0 = lVar.K0();
        BitmapFactory.Options options = new BitmapFactory.Options();
        int z10 = lVar.z();
        boolean z11 = true;
        options.inSampleSize = z10 == 0 ? 1 : Math.max(1, Math.round(521.0f / z10));
        options.inDither = false;
        options.inPurgeable = !lVar.N() && fd.a.f11884f;
        options.inPreferredConfig = !lVar.N() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Bitmap bitmap = null;
        if (lVar.e1()) {
            try {
                mediaMetadataRetriever = v0.p2(lVar.q());
                try {
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null && !extractMetadata.isEmpty() && i.m(extractMetadata)) {
                        lVar.q0(i.s(extractMetadata));
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                mediaMetadataRetriever = null;
            }
            v0.H(mediaMetadataRetriever);
            if (lVar.P0() > 0) {
                bitmap = x(v0.T2(lVar.q(), lVar.P0(), z10, z10, new int[1]), z10, z10);
                if (lVar.P()) {
                    bitmap = d(bitmap);
                }
            }
            if (!v0.A1(bitmap)) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(j0.n().getContentResolver(), K0, 1, options);
            }
        } else if (Build.VERSION.SDK_INT >= 29) {
            try {
                bitmap = j0.n().getContentResolver().loadThumbnail(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, K0), new Size(Log.TAG_GIF_LOADER, Log.TAG_GIF_LOADER), aVar.f());
            } catch (OperationCanceledException | IOException unused3) {
            }
            if (bitmap == null) {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(j0.n().getContentResolver(), K0, 1, options);
            }
            if (bitmap == null) {
                try {
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new File(lVar.q())), new C0173b(lVar));
                } catch (IOException e10) {
                    Log.i(32, "#%s: Couldn't load file: %d", e10, lVar.toString());
                }
            }
        } else {
            bitmap = MediaStore.Images.Thumbnails.getThumbnail(j0.n().getContentResolver(), K0, 1, options);
        }
        if (bitmap == null) {
            bitmap = e(lVar.q(), options);
        }
        if (bitmap != null) {
            if (!lVar.M() && lVar.z0() && lVar.N()) {
                v0.r(bitmap, lVar.h(), !options.inPurgeable ? 1 : 0);
            } else if (options.inPurgeable) {
                N.pinBitmapIfNeeded(bitmap);
            }
        }
        if (bitmap == null) {
            z11 = false;
        }
        cVar.b(z11, bitmap);
    }

    public final void u(s sVar, c cVar) {
        int F0 = sVar.F0();
        int E0 = sVar.E0();
        boolean z10 = true;
        int[] iArr = new int[1];
        Bitmap T2 = v0.T2(sVar.q(), sVar.D0(), F0, E0, iArr);
        if (iArr[0] != 0) {
            sVar.K0(iArr[0]);
        }
        Bitmap x10 = x(T2, F0, E0);
        if (sVar.P()) {
            x10 = d(x10);
        }
        if (x10 == null) {
            z10 = false;
        }
        cVar.b(z10, x10);
    }
}
