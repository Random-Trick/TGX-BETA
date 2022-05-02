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
import be.C1379j0;
import id.C5365w;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import md.C6820b;
import nc.C7389v0;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import p067ed.C4183a;
import p108hb.C5070i;
import p156kd.C6243f;
import p156kd.C6246h;
import p156kd.C6253l;
import p156kd.C6256o;
import p156kd.C6261s;
import p335xd.C10187b;

public class C7907b {
    public static C7907b f25602d;
    public static byte[] f25603e;
    public final C7911c f25604a = new C7911c();
    public final C7911c f25605b = new C7911c();
    public final C7911c f25606c = new C7911c();

    public class C7908a implements ImageDecoder.OnHeaderDecodedListener {
        public final boolean f25607a;
        public final C6246h f25608b;
        public final int[] f25609c;
        public final boolean f25610d;

        public C7908a(boolean z, C6246h hVar, int[] iArr, boolean z2) {
            this.f25607a = z;
            this.f25608b = hVar;
            this.f25609c = iArr;
            this.f25610d = z2;
        }

        @Override
        public void onHeaderDecoded(android.graphics.ImageDecoder r7, android.graphics.ImageDecoder.ImageInfo r8, android.graphics.ImageDecoder.Source r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.C7907b.C7908a.onHeaderDecoded(android.graphics.ImageDecoder, android.graphics.ImageDecoder$ImageInfo, android.graphics.ImageDecoder$Source):void");
        }
    }

    public class C7909b implements ImageDecoder.OnHeaderDecodedListener {
        public final C6253l f25611a;

        public C7909b(C6253l lVar) {
            this.f25611a = lVar;
        }

        @Override
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            imageDecoder.setAllocator(1);
            if (this.f25611a.m20945K()) {
                imageDecoder.setMutableRequired(true);
            }
            int z = this.f25611a.m20946I() ? 36 : this.f25611a.m20886z();
            int width = imageInfo.getSize().getWidth();
            int height = imageInfo.getSize().getHeight();
            if (z != 0) {
                float f = z;
                float f2 = width;
                float f3 = height;
                float min = Math.min(f / f2, f / f3);
                if (min < 1.0f) {
                    width = (int) (f2 * min);
                    height = (int) (f3 * min);
                    imageDecoder.setTargetSize(width, height);
                }
            }
            if (this.f25611a.m20940P() && width != height) {
                if (width > height) {
                    int i = width / 2;
                    int i2 = height / 2;
                    imageDecoder.setCrop(new Rect(i - i2, 0, i + i2 + (height % 2), height));
                    return;
                }
                int i3 = height / 2;
                int i4 = width / 2;
                imageDecoder.setCrop(new Rect(0, i3 - i4, width, i3 + i4 + (width % 2)));
            }
        }
    }

    public interface AbstractC7910c {
        void mo14348b(boolean z, Bitmap bitmap);
    }

    public static int m14372a(int i, int i2, int i3, int i4) {
        if (Math.max(i, i2) <= i4) {
            return 1;
        }
        return i > i2 ? i / i3 : i2 / i4;
    }

    public static int m14371b(BitmapFactory.Options options, int i, int i2) {
        return m14372a(options.outWidth, options.outHeight, i, i2);
    }

    public static int m14370c(int i, int i2, int i3, int i4) {
        if (i2 > i4 || i > i4) {
            return Math.max(1, Math.max(i / i3, i2 / i4) - 1);
        }
        return 1;
    }

    public static Bitmap m14369d(Bitmap bitmap) {
        return (!C7389v0.m16756A1(bitmap) || bitmap.getWidth() == bitmap.getHeight()) ? bitmap : C5365w.m23147D(bitmap);
    }

    public static Bitmap m14368e(String str, BitmapFactory.Options options) {
        try {
            InputStream o2 = C7389v0.m16599o2(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(o2, null, options);
            if (o2 != null) {
                o2.close();
            }
            return decodeStream;
        } catch (Throwable th) {
            Log.m14725e("Error decoding file", th, new Object[0]);
            return null;
        }
    }

    public static Bitmap m14367f(String str, int i) {
        String b1 = C7389v0.m16652b1(str);
        Bitmap bitmap = null;
        if (C5070i.m24061i(b1)) {
            return null;
        }
        long createLottieDecoder = C7888N.createLottieDecoder(str, b1, null, 0);
        if (createLottieDecoder == 0) {
            return null;
        }
        int[] iArr = new int[2];
        C7888N.getLottieSize(createLottieDecoder, iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            C7888N.destroyLottieDecoder(createLottieDecoder);
            return null;
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i != 0 && Math.max(i2, i3) > i) {
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float min = Math.min(f / f2, f / f3);
            i2 = (int) (f2 * min);
            i3 = (int) (f3 * min);
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            if (C7888N.getLottieFrame(createLottieDecoder, createBitmap, 0L)) {
                bitmap = createBitmap;
            } else {
                createBitmap.recycle();
            }
        } catch (Throwable th) {
            Log.m14725e("Cannot create bitmap", th, new Object[0]);
        }
        C7888N.destroyLottieDecoder(createLottieDecoder);
        return bitmap;
    }

    public static Bitmap m14366g(String str, int i, int i2, int i3) {
        String b1 = C7389v0.m16652b1(str);
        if (C5070i.m24061i(b1)) {
            return null;
        }
        if (i3 != 0 && Math.max(i, i2) > i3) {
            float f = i3;
            float f2 = i;
            float f3 = i2;
            float min = Math.min(f / f2, f / f3);
            i = (int) (f2 * min);
            i2 = (int) (f3 * min);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        if (C7888N.decodeLottieFirstFrame(str, b1, createBitmap)) {
            return createBitmap;
        }
        createBitmap.recycle();
        return null;
    }

    public static BitmapFactory.Options m14365h(String str) {
        if (str == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        m14364i(str, options);
        return options;
    }

    public static void m14364i(java.lang.String r11, android.graphics.BitmapFactory.Options r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.C7907b.m14364i(java.lang.String, android.graphics.BitmapFactory$Options):void");
    }

    public static BitmapFactory.Options m14363j(String str) {
        if (str == null) {
            return null;
        }
        if (!C4183a.m28615b()) {
            return m14365h(str);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        File file = new File(str);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
            MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
            C7888N.loadWebpImage(null, map, map.limit(), options, true);
            randomAccessFile.close();
            return options;
        } catch (Throwable th) {
            Log.m14712w(32, "Cannot get WebP bounds, file: %s", th, str);
            return null;
        }
    }

    public static C7907b m14362k() {
        if (f25602d == null) {
            f25602d = new C7907b();
        }
        return f25602d;
    }

    public static Bitmap m14360m(byte[] bArr, int i, boolean z, boolean z2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i != 0) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = (options.outWidth == 0 || options.outHeight == 0) ? 1 : m14371b(options, i, i);
        } else {
            options.inSampleSize = 1;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            if (i > 0 && Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight()) > i && z2) {
                decodeByteArray = m14351v(decodeByteArray, i, i, false);
            }
            if (z && (decodeByteArray.getWidth() < 100 || decodeByteArray.getHeight() < 100)) {
                C7389v0.m16590r(decodeByteArray, 3, 1);
            } else if (C4183a.f14088f) {
                C7888N.pinBitmapIfNeeded(decodeByteArray);
            }
        }
        return decodeByteArray;
    }

    public static android.graphics.Bitmap m14357p(p156kd.C6246h r22, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.C7907b.m14357p(kd.h, java.lang.String):android.graphics.Bitmap");
    }

    public static Bitmap m14351v(Bitmap bitmap, int i, int i2, boolean z) {
        return m14350w(bitmap, i, i2, z, false, true);
    }

    public static android.graphics.Bitmap m14350w(android.graphics.Bitmap r3, int r4, int r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.loader.C7907b.m14350w(android.graphics.Bitmap, int, int, boolean, boolean, boolean):android.graphics.Bitmap");
    }

    public static Bitmap m14349x(Bitmap bitmap, int i, int i2) {
        if (C7389v0.m16756A1(bitmap) && i > 0 && i2 > 0 && (bitmap.getWidth() > i || bitmap.getHeight() > i2)) {
            float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            Bitmap bitmap2 = null;
            try {
                bitmap2 = m14351v(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), false);
            } catch (Throwable unused) {
            }
            if (!(bitmap2 == null || bitmap == bitmap2)) {
                bitmap.recycle();
                return bitmap2;
            }
        }
        return bitmap;
    }

    public void m14361l(Runnable runnable) {
        this.f25604a.m28052e(runnable, 0L);
    }

    public final void m14359n(C6246h hVar, byte[] bArr, AbstractC7910c cVar) {
        boolean z = false;
        Bitmap m = m14360m(bArr, hVar.m20886z(), !hVar.m20943M() && hVar.m20885z0(), true);
        if (!(m == null || !hVar.m20940P() || m.getWidth() == m.getHeight())) {
            m = C5365w.m23147D(m);
        }
        if (m != null) {
            z = true;
        }
        cVar.mo14348b(z, m);
    }

    public final void m14358o(C6246h hVar, AbstractC7910c cVar) {
        Bitmap bitmap;
        try {
            InputStream openInputStream = C1379j0.m37315n().getContentResolver().openInputStream(Uri.parse(hVar.mo20875q()));
            bitmap = BitmapFactory.decodeStream(openInputStream);
            if (openInputStream != null) {
                openInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            bitmap = null;
        }
        boolean z = false;
        if (bitmap != null) {
            int i = (hVar.m20942N() || !C4183a.f14088f) ? 0 : 1;
            if (hVar.m20940P()) {
                bitmap = m14369d(bitmap);
            }
            if (!hVar.m20943M() && hVar.m20885z0() && hVar.m20942N()) {
                C7389v0.m16590r(bitmap, hVar.m20916h(), i ^ 1);
            } else if (i != 0) {
                C7888N.pinBitmapIfNeeded(bitmap);
            }
        }
        if (bitmap != null) {
            z = true;
        }
        cVar.mo14348b(z, bitmap);
    }

    public void m14356q(C7906a aVar, C6246h hVar, String str, AbstractC7910c cVar) {
        C7911c cVar2 = hVar.m20914i() != null ? this.f25606c : ((hVar instanceof C6261s) || (hVar instanceof C6256o) || ((hVar instanceof C6253l) && ((C6253l) hVar).m20843e1())) ? this.f25605b : this.f25604a;
        if (Thread.currentThread() != cVar2) {
            cVar2.m14347i(aVar, hVar, str, cVar);
        } else if (!aVar.m14378g()) {
            byte[] i = hVar.m20914i();
            if (i != null) {
                m14359n(hVar, i, cVar);
            } else if (hVar instanceof C6243f) {
                m14359n(hVar, ((C6243f) hVar).m20973D0().f19261N, cVar);
            } else if (hVar instanceof C6256o) {
                m14355r((C6256o) hVar, cVar);
            } else if (hVar instanceof C6261s) {
                m14352u((C6261s) hVar, cVar);
            } else {
                if (hVar instanceof C6253l) {
                    C6253l lVar = (C6253l) hVar;
                    if (lVar.m20842f1()) {
                        m14353t(aVar, lVar, cVar);
                        return;
                    }
                }
                if (hVar.m20944L()) {
                    m14354s(hVar, cVar);
                } else if (hVar.m20947H()) {
                    m14358o(hVar, cVar);
                } else {
                    Bitmap p = m14357p(hVar, str);
                    cVar.mo14348b(p != null, p);
                }
            }
        }
    }

    public final void m14355r(C6256o oVar, AbstractC7910c cVar) {
        byte[] a = C10187b.m5804a(oVar.m20826D0());
        if (a == null || a.length == 0) {
            cVar.mo14348b(false, null);
        } else {
            m14359n(oVar, a, cVar);
        }
    }

    public final void m14354s(C6246h hVar, AbstractC7910c cVar) {
        Bitmap j = C6820b.m18882j(hVar.m20886z(), hVar.m20940P(), hVar.mo20875q());
        cVar.mo14348b(j != null, j);
    }

    public final void m14353t(C7906a aVar, C6253l lVar, AbstractC7910c cVar) {
        MediaMetadataRetriever mediaMetadataRetriever;
        long K0 = lVar.m20863K0();
        BitmapFactory.Options options = new BitmapFactory.Options();
        int z = lVar.m20886z();
        boolean z2 = true;
        options.inSampleSize = z == 0 ? 1 : Math.max(1, Math.round(521.0f / z));
        options.inDither = false;
        options.inPurgeable = !lVar.m20942N() && C4183a.f14088f;
        options.inPreferredConfig = !lVar.m20942N() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Bitmap bitmap = null;
        if (lVar.m20843e1()) {
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    mediaMetadataRetriever = C7389v0.m16595p2(lVar.mo20875q());
                    try {
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                        if (extractMetadata != null && !extractMetadata.isEmpty() && C5070i.m24057m(extractMetadata)) {
                            lVar.mo20874q0(C5070i.m24051s(extractMetadata));
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    mediaMetadataRetriever = null;
                }
                C7389v0.m16730H(mediaMetadataRetriever);
            }
            if (lVar.m20858P0() > 0) {
                bitmap = m14349x(C7389v0.m16679T2(lVar.mo20875q(), lVar.m20858P0(), z, z, new int[1]), z, z);
                if (lVar.m20940P()) {
                    bitmap = m14369d(bitmap);
                }
            }
            if (!C7389v0.m16756A1(bitmap)) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(C1379j0.m37315n().getContentResolver(), K0, 1, options);
            }
        } else if (Build.VERSION.SDK_INT >= 29) {
            try {
                bitmap = C1379j0.m37315n().getContentResolver().loadThumbnail(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, K0), new Size(Log.TAG_GIF_LOADER, Log.TAG_GIF_LOADER), aVar.m14379f());
            } catch (OperationCanceledException | IOException unused3) {
            }
            if (bitmap == null) {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(C1379j0.m37315n().getContentResolver(), K0, 1, options);
            }
            if (bitmap == null) {
                try {
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new File(lVar.mo20875q())), new C7909b(lVar));
                } catch (IOException e) {
                    Log.m14722i(32, "#%s: Couldn't load file: %d", e, lVar.toString());
                }
            }
        } else {
            bitmap = MediaStore.Images.Thumbnails.getThumbnail(C1379j0.m37315n().getContentResolver(), K0, 1, options);
        }
        if (bitmap == null) {
            bitmap = m14368e(lVar.mo20875q(), options);
        }
        if (bitmap != null) {
            if (!lVar.m20943M() && lVar.m20885z0() && lVar.m20942N()) {
                C7389v0.m16590r(bitmap, lVar.m20916h(), !options.inPurgeable ? 1 : 0);
            } else if (options.inPurgeable) {
                C7888N.pinBitmapIfNeeded(bitmap);
            }
        }
        if (bitmap == null) {
            z2 = false;
        }
        cVar.mo14348b(z2, bitmap);
    }

    public final void m14352u(C6261s sVar, AbstractC7910c cVar) {
        int F0 = sVar.m20774F0();
        int E0 = sVar.m20775E0();
        boolean z = true;
        int[] iArr = new int[1];
        Bitmap T2 = C7389v0.m16679T2(sVar.mo20875q(), sVar.m20776D0(), F0, E0, iArr);
        if (iArr[0] != 0) {
            sVar.m20769K0(iArr[0]);
        }
        Bitmap x = m14349x(T2, F0, E0);
        if (sVar.m20940P()) {
            x = m14369d(x);
        }
        if (x == null) {
            z = false;
        }
        cVar.mo14348b(z, x);
    }
}
