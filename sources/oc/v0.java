package oc;

import android.animation.ValueAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b5.x;
import ce.a0;
import ce.c0;
import ce.e0;
import ce.j0;
import ce.v;
import de.l30;
import gd.l;
import gd.w;
import hc.o;
import hc.y;
import hd.t2;
import ib.c;
import ib.g;
import ib.h;
import ib.i;
import id.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import kb.j;
import ld.q;
import m3.m;
import m3.o2;
import m3.s;
import m3.y1;
import nb.f;
import ne.b2;
import o4.e0;
import o4.s0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.FileProvider;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.loader.b;
import t3.d;
import zd.c9;
import zd.d9;
import zd.o6;

public class v0 {
    public static Boolean f19435a;
    public static SoftReference<TextView> f19436b;
    public static Integer f19437c;
    public static final char[] f19438d = "0123456789ABCDEF".toCharArray();
    public static f<float[]> f19439e;
    public static f<float[]> f19440f;
    public static f<b> f19441g;

    public static class a {
        public final int f19442a;
        public final int f19443b;
        public final int f19444c;
        public final long f19445d;
        public final long f19446e;
        public final boolean f19447f;
        public final boolean f19448g;
        public final String f19449h;
        public final String f19450i;

        public a(int i10, int i11, int i12, long j10, long j11, boolean z10, boolean z11, String str, String str2) {
            this.f19442a = i10;
            this.f19443b = i11;
            this.f19444c = i12;
            this.f19445d = j10;
            this.f19446e = j11;
            this.f19447f = z10;
            this.f19448g = z11;
            this.f19449h = str;
            this.f19450i = str2;
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(this.f19445d, TimeUnit.MILLISECONDS);
        }
    }

    public static class b implements Comparator<Object> {
        public Spannable f19451a;

        public void a(Spannable spannable) {
            this.f19451a = spannable;
        }

        @Override
        public int compare(Object obj, Object obj2) {
            return Integer.compare(this.f19451a.getSpanStart(obj), this.f19451a.getSpanStart(obj2));
        }
    }

    public static boolean A(File file, String str) {
        try {
            return O1(file, str, false) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int A0(Location location) {
        if (!location.hasBearing()) {
            return 0;
        }
        int l10 = h.l(Math.round(location.getBearing()), 360);
        if (l10 != 0) {
            return l10;
        }
        return 360;
    }

    public static boolean A1(Bitmap bitmap) {
        return bitmap != null && !bitmap.isRecycled();
    }

    public static String A2(String str, String str2) {
        String g10;
        if (!i.i(str2) && (g10 = e0.g(str2)) != null) {
            return g10;
        }
        try {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        } catch (Throwable th) {
            Log.w("Cannot resolver mimeType, path: %s", th, str);
            return null;
        }
    }

    public static boolean B(Uri uri) {
        try {
            InputStream o22 = o2(uri.toString());
            if (o22 != null) {
                o22.close();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int B0(Bitmap bitmap, int i10) {
        return x1(i10) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public static boolean B1(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 23) {
            return audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn();
        }
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        if (!(devices == null || devices.length == 0)) {
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3 || type == 4 || type == 7 || type == 8 || type == 22) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] B2(f<int[]> fVar, int i10) {
        int[] a10 = fVar.a();
        if (a10 == null) {
            return new int[i10];
        }
        for (int i11 = 0; i11 < a10.length; i11++) {
            a10[i11] = 0;
        }
        return a10;
    }

    public static boolean C(String str) {
        try {
            return new File(str).canRead();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static Location C0(Context context, boolean z10) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                if (locationManager.isProviderEnabled("gps")) {
                    return locationManager.getLastKnownLocation("gps");
                }
                if (!z10 || !locationManager.isProviderEnabled("network")) {
                    return null;
                }
                return locationManager.getLastKnownLocation("network");
            }
        } catch (SecurityException unused) {
        } catch (Throwable th) {
            Log.w("Error getting last known location", th, new Object[0]);
        }
        return null;
    }

    public static void C1(String str, int i10, j jVar, boolean z10) {
        if (P(str, i10, jVar) && z10) {
            if (i10 == 0) {
                j0.y0(R.string.PhotoHasBeenSavedToGallery, 0);
            } else if (i10 == 1) {
                j0.y0(R.string.VideoHasBeenSavedToGallery, 0);
            } else if (i10 == 2) {
                j0.y0(R.string.GifHasBeenSavedToGallery, 0);
            }
        }
    }

    public static int C2(int i10, int i11) {
        if (i11 % 90 != 0) {
            Log.w("Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i11));
            return 0;
        }
        int i12 = i11 % 360;
        while (i12 < 0) {
            i12 += 90;
            switch (i10) {
                case 2:
                    i10 = 5;
                    break;
                case 3:
                case 8:
                    i10 = 6;
                    break;
                case 4:
                    i10 = 7;
                    break;
                case 5:
                    i10 = 4;
                    break;
                case 6:
                    i10 = 1;
                    break;
                case 7:
                    i10 = 2;
                    break;
                default:
                    i10 = 8;
                    break;
            }
        }
        while (i12 > 0) {
            i12 -= 90;
            switch (i10) {
                case 2:
                    i10 = 7;
                    break;
                case 3:
                    i10 = 8;
                    break;
                case 4:
                    i10 = 5;
                    break;
                case 5:
                    i10 = 2;
                    break;
                case 6:
                    i10 = 3;
                    break;
                case 7:
                    i10 = 4;
                    break;
                case 8:
                    i10 = 1;
                    break;
                default:
                    i10 = 6;
                    break;
            }
        }
        return i10;
    }

    public static boolean D(TdApi.InputFile inputFile) {
        return true;
    }

    public static long D0(String str) {
        if (i.i(str)) {
            return 0L;
        }
        if (str.startsWith("content://")) {
            return System.currentTimeMillis();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return Files.getLastModifiedTime(Paths.get(new File(str.startsWith("file://") ? str.substring(7) : str).toURI()), new LinkOption[0]).to(TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                Log.e("Cannot determine last modified time v2", th, new Object[0]);
            }
        }
        try {
            return new File(str).lastModified();
        } catch (Throwable th2) {
            Log.e("Cannot determine last modified time", th2, new Object[0]);
            return 0L;
        }
    }

    public static void D1(String str, int i10, boolean z10, j jVar, boolean z11) {
        if (z11) {
            O(str, i10, z10, jVar);
        }
    }

    public static void D2(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean E(Context context) {
        return Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static int E0(Paint.FontMetricsInt fontMetricsInt) {
        return Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent) + fontMetricsInt.leading;
    }

    public static void E1(File file, String str, Uri uri) {
        if (uri != null) {
            j0.n().getContentResolver().delete(uri, null, null);
        }
        g.d(file);
    }

    public static void E2(final Bitmap bitmap, final boolean z10) {
        if (Build.VERSION.SDK_INT < 23 || !Y1("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    v0.I1(bitmap);
                }
            });
        } else {
            x2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new kb.i() {
                @Override
                public final void a(boolean z11) {
                    v0.H1(bitmap, z10, z11);
                }
            });
        }
    }

    public static void F(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                Log.w(th);
            }
        }
    }

    public static long F0(Cursor cursor, int i10) {
        try {
            return cursor.getLong(i10);
        } catch (Throwable unused) {
            return cursor.getInt(i10);
        }
    }

    public static void F1(kb.i iVar, int i10, boolean z10) {
        if (iVar != null) {
            iVar.a(z10);
        }
    }

    public static void F2(File file) {
        Uri fromFile;
        if (file != null && (fromFile = Uri.fromFile(file)) != null) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            j0.q().sendBroadcast(intent);
        }
    }

    public static void G(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th) {
                Log.w(th);
            }
        }
    }

    public static String G0() {
        return i.E(Build.MANUFACTURER, w.Y1());
    }

    public static void G1(Runnable runnable, int i10, boolean z10) {
        if (z10) {
            runnable.run();
        }
    }

    public static void G2(kb.i iVar, boolean z10) {
        if (iVar != null) {
            iVar.a(z10);
        }
    }

    public static void H(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                Log.w(th);
            }
        }
    }

    public static String H0(double d10, double d11, int i10, boolean z10, int i11, int i12) {
        int i13 = a0.h() >= 2.0f ? 2 : 1;
        int i14 = i11 / i13;
        int i15 = i12 / i13;
        if (i14 > 640 || i15 > 320) {
            float f10 = i14;
            float f11 = i15;
            float min = Math.min(640.0f / f10, 320.0f / f11);
            i14 = (int) (f10 * min);
            i15 = (int) (f11 * min);
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[7];
        objArr[0] = Double.valueOf(d10);
        objArr[1] = Double.valueOf(d11);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Integer.valueOf(i14);
        objArr[4] = Integer.valueOf(i15);
        objArr[5] = Integer.valueOf(i13);
        objArr[6] = z10 ? "&style=element:geometry%7Ccolor:0x212121&style=element:labels.icon%7Cvisibility:off&style=element:labels.text.fill%7Ccolor:0x757575&style=element:labels.text.stroke%7Ccolor:0x212121&style=feature:administrative%7Celement:geometry%7Ccolor:0x757575&style=feature:administrative.country%7Celement:labels.text.fill%7Ccolor:0x9e9e9e&style=feature:administrative.land_parcel%7Cvisibility:off&style=feature:administrative.locality%7Celement:labels.text.fill%7Ccolor:0xbdbdbd&style=feature:poi%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:poi.park%7Celement:geometry%7Ccolor:0x181818&style=feature:poi.park%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:poi.park%7Celement:labels.text.stroke%7Ccolor:0x1b1b1b&style=feature:road%7Celement:geometry.fill%7Ccolor:0x2c2c2c&style=feature:road%7Celement:labels.text.fill%7Ccolor:0x8a8a8a&style=feature:road.arterial%7Celement:geometry%7Ccolor:0x373737&style=feature:road.highway%7Celement:geometry%7Ccolor:0x3c3c3c&style=feature:road.highway.controlled_access%7Celement:geometry%7Ccolor:0x4e4e4e&style=feature:road.local%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:transit%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:water%7Celement:geometry%7Ccolor:0x000000&style=feature:water%7Celement:labels.text.fill%7Ccolor:0x3d3d3d" : "";
        return String.format(locale, "https://maps.googleapis.com/maps/api/staticmap?format=jpg&center=%f,%f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&sensor=false%s", objArr);
    }

    public static void H1(Bitmap bitmap, boolean z10, boolean z11) {
        if (z11) {
            E2(bitmap, z10);
        }
    }

    public static boolean H2(byte[] bArr, int[] iArr, int i10) {
        int i11 = iArr[1];
        boolean z10 = false;
        if (i11 <= 0) {
            return false;
        }
        int i12 = iArr[0];
        if (iArr[2] == 1) {
            z10 = true;
        }
        V2(i10, bArr, i12, i11, z10);
        return true;
    }

    public static boolean I(Bitmap bitmap, int i10, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, i10, fileOutputStream);
            fileOutputStream.close();
            return compress;
        } catch (Throwable th) {
            Log.w("Failed to compress bitmap", th, new Object[0]);
            return false;
        }
    }

    public static String I0(o6 o6Var, double d10, double d11, int i10, boolean z10, int i11, int i12, int[] iArr) {
        int i13 = a0.h() >= 2.0f ? 2 : 1;
        float f10 = 640;
        float f11 = 320;
        float min = Math.min(Math.min(i11 / i13, 640) / f10, Math.min(i12 / i13, 320) / f11);
        int i14 = (int) (f10 * min);
        int i15 = (int) (f11 * min);
        int i16 = i14 - (i14 % 2);
        int i17 = i15 - (i15 % 2);
        Locale locale = Locale.US;
        Object[] objArr = new Object[8];
        objArr[0] = Double.valueOf(d10);
        objArr[1] = Double.valueOf(d11);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Integer.valueOf(i16);
        objArr[4] = Integer.valueOf(i17);
        objArr[5] = Integer.valueOf(i13);
        objArr[6] = o6Var.N9();
        objArr[7] = z10 ? "&style=element:geometry%7Ccolor:0x212121&style=element:labels.icon%7Cvisibility:off&style=element:labels.text.fill%7Ccolor:0x757575&style=element:labels.text.stroke%7Ccolor:0x212121&style=feature:administrative%7Celement:geometry%7Ccolor:0x757575&style=feature:administrative.country%7Celement:labels.text.fill%7Ccolor:0x9e9e9e&style=feature:administrative.land_parcel%7Cvisibility:off&style=feature:administrative.locality%7Celement:labels.text.fill%7Ccolor:0xbdbdbd&style=feature:poi%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:poi.park%7Celement:geometry%7Ccolor:0x181818&style=feature:poi.park%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:poi.park%7Celement:labels.text.stroke%7Ccolor:0x1b1b1b&style=feature:road%7Celement:geometry.fill%7Ccolor:0x2c2c2c&style=feature:road%7Celement:labels.text.fill%7Ccolor:0x8a8a8a&style=feature:road.arterial%7Celement:geometry%7Ccolor:0x373737&style=feature:road.highway%7Celement:geometry%7Ccolor:0x3c3c3c&style=feature:road.highway.controlled_access%7Celement:geometry%7Ccolor:0x4e4e4e&style=feature:road.local%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:transit%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:water%7Celement:geometry%7Ccolor:0x000000&style=feature:water%7Celement:labels.text.fill%7Ccolor:0x3d3d3d" : "";
        String format = String.format(locale, "https://maps.googleapis.com/maps/api/staticmap?format=jpg&center=%f,%f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&sensor=false&language=%s%s", objArr);
        if (iArr != null) {
            iArr[0] = i16 * i13;
            iArr[1] = i17 * i13;
        }
        return format;
    }

    public static void I1(android.graphics.Bitmap r5) {
        throw new UnsupportedOperationException("Method not decompiled: oc.v0.I1(android.graphics.Bitmap):void");
    }

    public static byte[] I2(byte[] bArr) {
        return a0(bArr, "SHA-1");
    }

    public static Bitmap.CompressFormat J(boolean z10) {
        if (!z10) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.PNG;
    }

    public static String J0() {
        String u12 = w.u1(R.string.MarketUrl, new Object[0]);
        return c0.Q(u12) ? u12 : "https://play.google.com/store/apps/details?id=org.thunderdog.challegram";
    }

    public static String J2(String str) {
        return Z(str, "SHA-256");
    }

    public static Locale K(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("_", 3);
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        if (split.length == 2) {
            return new Locale(split[0], split[1]);
        }
        if (split.length == 3) {
            return new Locale(split[0], split[1], split[2]);
        }
        return null;
    }

    public static synchronized int K0() {
        synchronized (v0.class) {
            Integer num = f19437c;
            if (num != null) {
                return num.intValue();
            }
            int V = V();
            f19437c = Integer.valueOf(V);
            return V;
        }
    }

    public static File K2(String str) {
        File file;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                file = j0.n().getDataDir();
            } else {
                file = j0.n().getFilesDir().getParentFile();
            }
            File file2 = new File(file, "shared_prefs");
            if (!file2.exists()) {
                return null;
            }
            File file3 = new File(file2, str + ".xml");
            if (file3.exists()) {
                return file3;
            }
            return null;
        } catch (Throwable th) {
            Log.e("Cannot retrieve shared prefs file", th, new Object[0]);
            return null;
        }
    }

    public static Uri L(File file) {
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        try {
            return FileProvider.e(j0.n(), "org.thunderdog.challegram.provider", file);
        } catch (Throwable th) {
            Log.e("Can't create content uri for path", th, new Object[0]);
            return null;
        }
    }

    public static a L0(String str) {
        String str2;
        String str3;
        try {
            MediaMetadataRetriever p22 = p2(str);
            if (p22 != null) {
                boolean equalsIgnoreCase = "yes".equalsIgnoreCase(p22.extractMetadata(17));
                boolean equalsIgnoreCase2 = "yes".equalsIgnoreCase(p22.extractMetadata(16));
                long w10 = i.w(p22.extractMetadata(9));
                long w11 = i.w(p22.extractMetadata(20));
                int s10 = equalsIgnoreCase ? i.s(p22.extractMetadata(18)) : 0;
                int s11 = equalsIgnoreCase ? i.s(p22.extractMetadata(19)) : 0;
                int s12 = equalsIgnoreCase ? i.s(p22.extractMetadata(24)) : 0;
                if (equalsIgnoreCase) {
                    str3 = null;
                    str2 = null;
                } else {
                    String extractMetadata = p22.extractMetadata(7);
                    String extractMetadata2 = p22.extractMetadata(2);
                    if (i.i(extractMetadata2)) {
                        extractMetadata2 = p22.extractMetadata(3);
                    }
                    if (i.i(extractMetadata2)) {
                        extractMetadata2 = p22.extractMetadata(13);
                    }
                    str3 = extractMetadata;
                    str2 = extractMetadata2;
                }
                H(p22);
                return new a(s10, s11, s12, w10, w11, equalsIgnoreCase, equalsIgnoreCase2, str3, str2);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void L1(final ld.l lVar, final j jVar, boolean z10, Bitmap bitmap) {
        if (bitmap != null) {
            q.c().d(lVar, bitmap);
        }
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j.this.a(lVar);
            }
        });
    }

    public static boolean L2(String str) {
        org.thunderdog.challegram.a E;
        return Build.VERSION.SDK_INT >= 23 && (E = j0.E()) != null && E.shouldShowRequestPermissionRationale(str);
    }

    public static boolean M(Context context, Uri uri, File file) {
        String scheme = uri.getScheme();
        scheme.hashCode();
        if (scheme.equals("file")) {
            return g.a(new File(uri.getPath()), file);
        }
        if (scheme.equals("content")) {
            long j10 = 0;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                hc.a0 j11 = o.j(openInputStream);
                try {
                    y d10 = o.d(file);
                    hc.f a10 = o.a(d10);
                    while (true) {
                        try {
                            long A = j11.A(a10.a(), 20480L);
                            if (A == -1) {
                                break;
                            }
                            j10 += A;
                        } catch (Throwable th) {
                            if (a10 != null) {
                                try {
                                    a10.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    a10.flush();
                    a10.close();
                    if (d10 != null) {
                        d10.close();
                    }
                    j11.close();
                    Log.i("Copied %d bytes: %s to %s", Long.valueOf(j10), uri, file);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return true;
                } catch (Throwable th3) {
                    if (j11 != null) {
                        try {
                            j11.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                Log.e("Unable to copy file", th5, new Object[0]);
                return false;
            }
        } else {
            throw new UnsupportedOperationException(uri.getScheme());
        }
    }

    public static String M0(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) j0.n().getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, w.i1(i10), 2));
        }
        return str;
    }

    public static void M2(InputStream inputStream) {
        int read = inputStream.read();
        int i10 = 0;
        while (i10 < read) {
            long skip = inputStream.skip(read - i10);
            if (skip == -1) {
                break;
            }
            i10 = (int) (i10 + skip);
        }
        if (i10 < read) {
            throw new IllegalArgumentException();
        }
    }

    public static void N(String str, int i10) {
        O(str, i10, true, null);
    }

    public static String N0() {
        return M0("other", R.string.NotificationChannelOther);
    }

    public static void N1(File file, final j jVar, boolean z10) {
        final ld.l lVar;
        int i10;
        int i11;
        if (!file.exists()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    j.this.a(null);
                }
            });
            return;
        }
        if (z10) {
            a L0 = L0(file.getPath());
            if (L0 != null) {
                lVar = new ld.l(-1L, file.getPath(), file.lastModified(), L0.f19442a, L0.f19443b, -1L, false);
                lVar.i1();
                lVar.j1(L0.a(TimeUnit.MILLISECONDS), "video/mov");
                lVar.m1();
                lVar.q0(L0.f19444c);
            } else {
                lVar = null;
            }
        } else {
            int t02 = t0(file.getPath());
            int S0 = S0(t02);
            BitmapFactory.Options h10 = org.thunderdog.challegram.loader.b.h(file.getPath());
            if (!i1(t02) || S0 != 0) {
                i10 = h10.outWidth;
                i11 = h10.outHeight;
            } else {
                i10 = h10.outHeight;
                i11 = h10.outWidth;
            }
            ld.l lVar2 = new ld.l(-1L, file.getPath(), file.lastModified(), i10, i11, -1L, false);
            lVar2.l0();
            lVar2.b0();
            lVar2.i1();
            lVar2.t0(qd.b.o0());
            lVar2.q0(S0);
            lVar = lVar2;
        }
        if (lVar != null) {
            ImageLoader.e().g(lVar, new b.c() {
                @Override
                public final void b(boolean z11, Bitmap bitmap) {
                    v0.L1(ld.l.this, jVar, z11, bitmap);
                }
            });
        } else {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    j.this.a(null);
                }
            });
        }
    }

    public static void N2(Service service, int i10, Notification notification) {
        if (notification != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 26 || !i.i(notification.getChannelId())) {
                if (i11 >= 29) {
                    int i12 = 0;
                    switch (i10) {
                        case 2147483643:
                            i12 = 1;
                            break;
                        case 2147483644:
                        case 2147483645:
                            i12 = 4;
                            break;
                        case 2147483646:
                            i12 = 8;
                            break;
                        case Integer.MAX_VALUE:
                            i12 = 2;
                            break;
                    }
                    if (i12 != 0) {
                        service.startForeground(i10, notification, i12);
                        return;
                    }
                }
                service.startForeground(i10, notification);
                return;
            }
            throw new IllegalArgumentException("id == " + i10);
        }
        throw new IllegalArgumentException();
    }

    public static void O(final String str, final int i10, final boolean z10, final j<File> jVar) {
        if (Build.VERSION.SDK_INT >= 23 && X1("android.permission.WRITE_EXTERNAL_STORAGE")) {
            x2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new kb.i() {
                @Override
                public final void a(boolean z11) {
                    v0.D1(str, i10, z10, jVar, z11);
                }
            });
        } else if (str != null && !str.isEmpty()) {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    v0.C1(str, i10, jVar, z10);
                }
            });
        }
    }

    public static String O0(Uri uri, String str) {
        Cursor query;
        try {
            query = j0.q().getContentResolver().query(uri, new String[]{"title"}, null, null, null);
        } catch (Throwable th) {
            try {
                Log.e("Couldn't get ringtone name for %s", th, uri);
            } catch (Throwable th2) {
                Log.e("Error querying %s", th2, uri);
            }
        }
        if (query == null || !query.moveToFirst()) {
            if (query != null) {
                query.close();
            }
            return str;
        }
        String string = query.getString(0);
        Log.i("Success: %s -> %s", uri, string);
        query.close();
        return string;
    }

    public static Uri O1(File file, String str, boolean z10) {
        if (Build.VERSION.SDK_INT >= 24 || (!z10 && !"application/vnd.android.package-archive".equals(str))) {
            return L(file);
        }
        return Uri.fromFile(file);
    }

    public static void O2(Service service, boolean z10, int... iArr) {
        NotificationManager notificationManager;
        service.stopForeground(z10);
        if (z10 && Build.VERSION.SDK_INT >= 28 && (notificationManager = (NotificationManager) service.getSystemService("notification")) != null) {
            for (int i10 : iArr) {
                notificationManager.cancel(i10);
            }
        }
    }

    public static boolean P(String str, int i10, j<File> jVar) {
        File g02 = g0(str, i10);
        if (g02 != null) {
            try {
                if (g.a(new File(str), g02)) {
                    m(g02);
                    if (jVar == null) {
                        return true;
                    }
                    jVar.a(g02);
                    return true;
                }
                Log.w("Cannot copy file to gallery", new Object[0]);
            } catch (Throwable th) {
                Log.w("Cannot save file to gallery", th, new Object[0]);
            }
        }
        return false;
    }

    public static String P0(String str, String str2) {
        return i.i(str) ? str : O0(Uri.parse(str), str2);
    }

    public static float P1(Layout layout) {
        float f10 = 0.0f;
        if (layout == null) {
            return 0.0f;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, layout.getLineWidth(i10));
        }
        return f10;
    }

    public static String P2(int i10) {
        return Q2(c.j(i10), c.k(i10), c.l(i10));
    }

    public static Layout Q(CharSequence charSequence, int i10, TextPaint textPaint) {
        return R(charSequence, i10, textPaint, Layout.Alignment.ALIGN_NORMAL);
    }

    public static File Q0() {
        File file = new File(o0(false), "ringtones");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        throw new IllegalStateException();
    }

    public static String Q1(String str) {
        return Z(str, "MD5");
    }

    public static java.lang.String Q2(int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: oc.v0.Q2(int, int, int):java.lang.String");
    }

    public static Layout R(CharSequence charSequence, int i10, TextPaint textPaint, Layout.Alignment alignment) {
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(charSequence, textPaint);
        if (isBoring == null || isBoring.width > i10) {
            return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i10, alignment, 1.0f, 0.0f, false);
        }
        return new BoringLayout(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, isBoring, false);
    }

    @Deprecated
    public static int R0(String str) {
        return S0(t0(str));
    }

    public static float R1(CharSequence charSequence, int i10, int i11, Paint paint) {
        float f10 = 0.0f;
        if (i.i(charSequence)) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spannable)) {
            return S1(charSequence, i10, i11, paint);
        }
        Spannable spannable = (Spannable) charSequence;
        k[] kVarArr = (k[]) spannable.getSpans(i10, i11, k.class);
        if (kVarArr == null || kVarArr.length == 0) {
            return S1(charSequence, i10, i11, paint);
        }
        if (kVarArr.length > 1) {
            b U0 = U0();
            U0.a(spannable);
            Arrays.sort(kVarArr, U0);
        }
        for (k kVar : kVarArr) {
            int spanStart = spannable.getSpanStart(kVar);
            if (i10 < spanStart) {
                f10 += S1(charSequence, i10, spanStart, paint);
            }
            f10 += kVar.b(paint);
            i10 = spannable.getSpanEnd(kVar);
        }
        return i10 < i11 ? f10 + S1(charSequence, i10, i11, paint) : f10;
    }

    public static void R2(final File file, final boolean z10, final j<ld.l> jVar) {
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                v0.N1(file, jVar, z10);
            }
        });
    }

    public static byte[] S(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i10 = 0;
            while (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (b10 == 61) {
                    int i11 = i10 + 1;
                    int digit = Character.digit((char) bArr[i11], 16);
                    i10 = i11 + 1;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i10], 16)));
                } else {
                    byteArrayOutputStream.write(b10);
                }
                i10++;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e10) {
            Log.w(e10);
            return null;
        }
    }

    @Deprecated
    public static int S0(int i10) {
        if (i10 == 3) {
            return 180;
        }
        if (i10 != 6) {
            return i10 != 8 ? 0 : 270;
        }
        return 90;
    }

    public static float S1(CharSequence charSequence, int i10, int i11, Paint paint) {
        int i12 = i11 - i10;
        if (charSequence == null || charSequence.length() == 0 || i12 <= 0) {
            return 0.0f;
        }
        if (paint == null) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 23 && c0.G(charSequence, i10, i11) != 2) {
            return paint.getRunAdvance(charSequence, i10, i11, 0, charSequence.length(), false, i11);
        } else {
            float[] r22 = r2(i12, true);
            paint.getTextWidths(charSequence, i10, i11, r22);
            return ib.b.F(r22, i12);
        }
    }

    public static android.graphics.Bitmap S2(java.lang.String r3, android.graphics.Rect r4, android.graphics.BitmapFactory.Options r5) {
        throw new UnsupportedOperationException("Method not decompiled: oc.v0.S2(java.lang.String, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static void T(final File file) {
        if (file != null) {
            if (s1(file)) {
                g.d(file);
            } else {
                MediaScannerConnection.scanFile(j0.n(), new String[]{file.getPath()}, null, new MediaScannerConnection.OnScanCompletedListener() {
                    @Override
                    public final void onScanCompleted(String str, Uri uri) {
                        v0.E1(file, str, uri);
                    }
                });
            }
        }
    }

    public static String T0(String str) {
        if (i.i(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            if (Character.charCount(codePointAt) != 1 || codePointAt != 46) {
                break;
            }
            i11++;
        }
        int i12 = length - i11;
        if (i12 <= 0) {
            return "file";
        }
        StringBuilder sb2 = new StringBuilder(i12);
        sb2.append((CharSequence) str, i11, length);
        int length2 = sb2.length();
        while (i10 < length2) {
            int codePointAt2 = sb2.codePointAt(i10);
            int charCount = Character.charCount(codePointAt2);
            if (charCount == 1 && (codePointAt2 == 47 || codePointAt2 == 92)) {
                sb2.setCharAt(i10, '_');
            }
            i10 += charCount;
        }
        return str;
    }

    public static float T1(CharSequence charSequence, Paint paint) {
        if (i.i(charSequence)) {
            return 0.0f;
        }
        return S1(charSequence, 0, charSequence.length(), paint);
    }

    public static Bitmap T2(String str, long j10, int i10, int i11, int[] iArr) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever = p2(str);
            if (iArr != null) {
                try {
                    iArr[0] = i.s(mediaMetadataRetriever.extractMetadata(24));
                } catch (IllegalArgumentException | RuntimeException unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 27 && Math.min(i10, i11) > 0) {
                if (Math.max(i10, i11) < Math.max(i.s(mediaMetadataRetriever.extractMetadata(18)), i.s(mediaMetadataRetriever.extractMetadata(19)))) {
                    bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, j10 == -1 ? 2 : 1, i10, i11);
                }
            }
            if (bitmap == null) {
                bitmap = j10 == -1 ? mediaMetadataRetriever.getFrameAtTime() : mediaMetadataRetriever.getFrameAtTime(j10, 1);
            }
        } catch (IllegalArgumentException | RuntimeException unused2) {
            mediaMetadataRetriever = null;
        }
        H(mediaMetadataRetriever);
        return bitmap;
    }

    public static boolean U(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return j0.n().deleteSharedPreferences(str);
            }
            File K2 = K2(str);
            return K2 != null && K2.delete();
        } catch (Throwable unused) {
            Log.e("Cannot delete shared preferences, name:%s", str);
            return false;
        }
    }

    public static b U0() {
        if (f19441g == null) {
            synchronized (v0.class) {
                if (f19441g == null) {
                    f19441g = new f<>();
                }
            }
        }
        b a10 = f19441g.a();
        if (a10 != null) {
            return a10;
        }
        b bVar = new b();
        f19441g.b(bVar);
        return bVar;
    }

    public static boolean U1(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        if (file.isDirectory()) {
            return V1(file, file2);
        }
        if (g.a(file, file2)) {
            return file.delete();
        }
        Log.w("Cannot copy file", new Object[0]);
        return false;
    }

    public static java.lang.String U2(android.net.Uri r9) {
        throw new UnsupportedOperationException("Method not decompiled: oc.v0.U2(android.net.Uri):java.lang.String");
    }

    public static int V() {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        if (iArr[0] != 0) {
            return iArr[0];
        }
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr2 = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (iArr3[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        GLES20.glGetIntegerv(3379, iArr, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
        return iArr[0];
    }

    public static long V0(StatFs statFs) {
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static boolean V1(File file, File file2) {
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            if (file.delete()) {
                return true;
            }
            Log.w("Unable to delete media directory", new Object[0]);
            return false;
        } else if (!file2.mkdirs() && !file2.exists()) {
            Log.w("Failed to create output directory", new Object[0]);
            return false;
        } else if (!file2.isDirectory()) {
            Log.w("Output directory is not a directory", new Object[0]);
            return false;
        } else {
            int i10 = 0;
            for (File file3 : listFiles) {
                if (U1(file3, new File(file2, file3.getName()))) {
                    i10++;
                }
            }
            return i10 == listFiles.length && file.delete();
        }
    }

    public static void V2(int i10, byte[] bArr, int i11, int i12, boolean z10) {
        int i13;
        if (!z10) {
            i11 += i12 - 1;
            i13 = -1;
        } else {
            i13 = 1;
        }
        int i14 = 0;
        while (true) {
            i12--;
            if (i12 > 0) {
                bArr[i11] = (byte) ((i10 >> i14) & 255);
                i14 += 8;
                i11 += i13;
            } else {
                return;
            }
        }
    }

    public static boolean W(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    public static long W0(List<File> list) {
        long j10 = 0;
        if (list != null && !list.isEmpty()) {
            for (File file : list) {
                j10 += file.length();
            }
        }
        return j10;
    }

    public static void W1() {
        File n02;
        File X0 = X0();
        if (X0.exists() && (n02 = n0(true)) != null && !n02.equals(X0)) {
            V1(X0, n02);
        }
    }

    public static boolean X(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static File X0() {
        return new File(o0(true), "media");
    }

    public static boolean X1(String str) {
        org.thunderdog.challegram.a E;
        return (Build.VERSION.SDK_INT < 23 || (E = j0.E()) == null || E.checkSelfPermission(str) == 0) ? false : true;
    }

    public static float Y(double d10, double d11, double d12, double d13) {
        return Math.abs(b2(d10, d11).distanceTo(b2(d12, d13)));
    }

    public static Uri Y0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        return parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
    }

    public static boolean Y1(String... strArr) {
        org.thunderdog.challegram.a E;
        if (Build.VERSION.SDK_INT >= 23 && (E = j0.E()) != null) {
            for (String str : strArr) {
                if (E.checkSelfPermission(str) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String Z(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return q(MessageDigest.getInstance(str2).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static CharSequence Z0(o6 o6Var) {
        return w.X(o6Var) + " (7d1fbd0d)\nAndroid " + db.f.a() + "(" + Build.VERSION.SDK_INT + ")\n" + Build.BRAND + " " + Build.MODEL + " (" + Build.DISPLAY + ")";
    }

    public static s Z1(Context context, boolean z10) {
        return new s.b(context, new m(context).j((z10 || he.i.c2().k1(128L)) ? 2 : 1), new o4.g(context, new d().d(true))).o(new a5.l(context)).n(new m3.k()).g();
    }

    public static byte[] a0(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return MessageDigest.getInstance(str).digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int a1(Bitmap bitmap, int i10) {
        return x1(i10) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public static Location a2() {
        Location location = new Location("network");
        location.setTime(System.currentTimeMillis());
        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        return location;
    }

    public static Matrix b0(int i10, int i11, int i12) {
        if (i12 == 0 || i12 == 1) {
            return null;
        }
        Matrix matrix = new Matrix();
        c0(i10, i11, i12, matrix);
        return matrix;
    }

    public static String b1(String str) {
        try {
            hc.g b10 = o.b(o.j(new GZIPInputStream(new FileInputStream(new File(str)))));
            String U = b10.U(i.f14176a);
            b10.close();
            return U;
        } catch (Throwable th) {
            Log.w(Log.TAG_GIF_LOADER, "Cannot decode GZip, path: %s", th, str);
            return null;
        }
    }

    public static Location b2(double d10, double d11) {
        Location a22 = a2();
        a22.setLatitude(d10);
        a22.setLongitude(d11);
        return a22;
    }

    public static void c0(int i10, int i11, int i12, Matrix matrix) {
        matrix.reset();
        switch (i12) {
            case 2:
                matrix.postScale(-1.0f, 1.0f, i10 / 2.0f, i11 / 2.0f);
                return;
            case 3:
                matrix.postRotate(180.0f);
                return;
            case 4:
                matrix.postScale(1.0f, -1.0f, i10 / 2.0f, i11 / 2.0f);
                return;
            case 5:
                matrix.postScale(-1.0f, 1.0f, i10 / 2.0f, i11 / 2.0f);
                matrix.postRotate(270.0f);
                return;
            case 6:
                matrix.postRotate(90.0f);
                return;
            case 7:
                matrix.postScale(-1.0f, 1.0f, i10, i11 / 2.0f);
                matrix.postRotate(90.0f);
                return;
            case 8:
                matrix.postRotate(270.0f);
                return;
            default:
                return;
        }
    }

    public static String c1(int i10) {
        String upperCase = Integer.toHexString(i10).toUpperCase();
        if (upperCase.length() != 1) {
            return upperCase;
        }
        return "0" + upperCase;
    }

    public static File c2(File file, String str) {
        String v02 = v0(str);
        if (i.i(v02)) {
            return d2(file, str, null);
        }
        return d2(file, str.substring(0, (str.length() - v02.length()) - 1), v02);
    }

    public static int d0(int i10) {
        switch (i10) {
            case 2:
                return 1;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 6;
            case 6:
                return 5;
            case 7:
                return 8;
            case 8:
                return 7;
            default:
                return 2;
        }
    }

    public static boolean d1() {
        return Settings.Global.getInt(j0.q().getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static File d2(File file, String str, String str2) {
        File file2;
        int i10 = 0;
        do {
            StringBuilder sb2 = new StringBuilder(str);
            if (i10 != 0) {
                sb2.append(" (");
                sb2.append(i10);
                sb2.append(")");
            }
            if (!i.i(str2)) {
                sb2.append(".");
                sb2.append(str2);
            }
            file2 = new File(file, sb2.toString());
            i10++;
        } while (file2.exists());
        return file2;
    }

    public static String e0(float f10, boolean z10) {
        int i10 = (int) f10;
        return f10 == ((float) i10) ? String.valueOf(i10) : z10 ? String.valueOf(f10) : String.format(Locale.US, "%.2f", Float.valueOf(f10));
    }

    public static boolean e1(InputStream inputStream) {
        int read;
        StringBuilder sb2 = new StringBuilder(6);
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) inputStream.read());
        }
        String sb3 = sb2.toString();
        if (sb3.startsWith("GIF")) {
            t2(inputStream);
            t2(inputStream);
            int read2 = inputStream.read();
            boolean z10 = (read2 & Log.TAG_YOUTUBE) != 0;
            int i11 = 2 << (read2 & 7);
            inputStream.read();
            inputStream.read();
            if (z10) {
                int i12 = i11 * 3;
                while (i12 > 0) {
                    long j10 = i12;
                    long skip = inputStream.skip(j10);
                    if (skip <= 0) {
                        break;
                    }
                    i12 = (int) (j10 - skip);
                }
                if (i12 != 0) {
                    throw new IllegalArgumentException();
                }
            }
            while (inputStream.read() == 33 && (read = inputStream.read()) != 249) {
                if (read == 255) {
                    return true;
                }
                M2(inputStream);
            }
            return false;
        }
        throw new IllegalArgumentException("Unknown file id: " + sb3);
    }

    public static y1 e2(Uri uri) {
        return new y1.c().e(uri).a();
    }

    public static void f0() {
    }

    public static boolean f1() {
        Boolean bool = f19435a;
        if (bool == null) {
            bool = Boolean.valueOf(g1());
            f19435a = bool;
        }
        return bool.booleanValue();
    }

    public static o4.s f2(int i10, int i11) {
        return new e0.b(new c9.a()).b(e2(c9.c.a(i10, i11)));
    }

    public static File g0(String str, int i10) {
        return i0(false, str, i10);
    }

    public static boolean g1() {
        try {
            String installerPackageName = j0.n().getPackageManager().getInstallerPackageName(j0.n().getPackageName());
            if (i.i(installerPackageName)) {
                return true;
            }
            Log.v("Installer package: %s", installerPackageName);
            return !"com.android.vending".equals(installerPackageName);
        } catch (Throwable th) {
            Log.v("Unable to determine installer package", th, new Object[0]);
            return false;
        }
    }

    public static o4.s g2(int i10, TdApi.File file) {
        if (file == null) {
            throw new IllegalArgumentException();
        } else if (file.f19913id != -1 || i.i(file.local.path)) {
            return new e0.b(new c9.a()).b(e2(c9.c.c(i10, file)));
        } else {
            return i2(new File(file.local.path));
        }
    }

    public static File h0(boolean z10, String str) {
        return d2(n0(z10), y0(), str);
    }

    public static boolean h1(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static o4.s h2(int i10, TdApi.Message message) {
        return g2(i10, t2.j1(message));
    }

    public static File i0(boolean z10, String str, int i10) {
        if (i10 == 0) {
            return k0();
        }
        try {
            File n02 = n0(z10);
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
            String v02 = v0(str);
            if (v02 == null) {
                v02 = i10 == 2 ? "gif" : "mp4";
            }
            return new File(n02, "VID_" + format + "." + v02);
        } catch (Throwable th) {
            Log.w("Cannot generate picture path", th, new Object[0]);
            return null;
        }
    }

    public static boolean i1(int i10) {
        return i10 == 5 || i10 == 6 || i10 == 7 || i10 == 8;
    }

    public static o4.s i2(File file) {
        return new e0.b(new x.b()).b(e2(Uri.fromFile(file)));
    }

    public static File j0(boolean z10, boolean z11) {
        return z11 ? m0(z10) : l0(z10);
    }

    public static boolean j1() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static String j2(String str) {
        if (i.i(str)) {
            return str;
        }
        while (true) {
            String readlink = N.readlink(str);
            if (i.i(readlink) || readlink.equals(str)) {
                try {
                    String canonicalPath = new File(str).getCanonicalPath();
                    return !i.i(canonicalPath) ? canonicalPath : str;
                } catch (Exception unused) {
                    return str.replace("/./", "/");
                }
            } else {
                str = readlink;
            }
        }
    }

    public static File k0() {
        return l0(false);
    }

    public static boolean k1(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static void k2(RecyclerView.h<?> hVar, int i10) {
        int D = hVar.D();
        if (i10 == D) {
            if (i10 != 0) {
                hVar.L(0, D);
            }
        } else if (i10 == 0) {
            hVar.M(0, D);
        } else if (D == 0) {
            hVar.N(0, i10);
        } else {
            hVar.N(0, i10);
            hVar.N(0, D);
        }
    }

    public static File l0(boolean z10) {
        return h0(z10, "jpg");
    }

    public static boolean l1(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return j5.d.p().i(context) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void l2(RecyclerView.h<?> hVar, int i10, int i11) {
        int D = hVar.D();
        int max = Math.max(0, D - i11);
        if (i10 == D) {
            if (i10 != 0) {
                hVar.L(i11, max);
            }
        } else if (i10 == 0) {
            hVar.M(0, D);
        } else if (D == 0) {
            hVar.N(0, i10);
        } else {
            hVar.N(Math.min(i11, max), i10);
            hVar.M(i11, max);
        }
    }

    public static void m(File file) {
        if (file != null) {
            F2(file);
        }
    }

    public static File m0(boolean z10) {
        return h0(z10, "mp4");
    }

    public static boolean m1(int i10, KeyEvent keyEvent) {
        return i10 != 0 ? i10 == 6 : keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    public static void m2(d9 d9Var, String str, File file, String str2, int i10) {
        String v02 = v0(file.getPath());
        if (i.i(str2)) {
            str2 = A2(file.getPath(), v02);
        }
        if ((!i.i(v02) && ce.e0.d(v02)) || (!i.i(str2) && ce.e0.e(str2))) {
            l30 l30Var = new l30(d9Var.t(), d9Var.c());
            l30Var.Ad(l30.a.f(str, file.getPath(), str2).h(i10));
            j0.W(l30Var);
        } else if (!v.r(file, str2)) {
            String z22 = z2(file.getPath());
            if (i.i(z22) || i.c(str2, z22)) {
                j0.y0(R.string.NoAppToOpen, 0);
            } else {
                m2(d9Var, str, file, z22, i10);
            }
        }
    }

    public static void n(String str) {
        if (str != null) {
            m(new File(str));
        }
    }

    public static File n0(boolean z10) {
        File file;
        if (!z10) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram X");
                if (!z10 || file == null) {
                    file = new File(o0(!z10), "media");
                }
                if (!file.mkdirs() && !file.exists()) {
                    Log.w("Failed to create album directory", new Object[0]);
                }
                return file;
            }
            Log.w("External storage is not mounted READ/WRITE.", new Object[0]);
        }
        file = null;
        if (!z10) {
        }
        file = new File(o0(!z10), "media");
        if (!file.mkdirs()) {
            Log.w("Failed to create album directory", new Object[0]);
        }
        return file;
    }

    public static boolean n1(float f10, float f11, float f12, float f13, float f14) {
        return Math.pow((double) (f10 - f12), 2.0d) + Math.pow((double) (f11 - f13), 2.0d) < ((double) (f14 * f14));
    }

    public static void n2(d9 d9Var, TdApi.Video video) {
        m2(d9Var, i.i(video.fileName) ? "video/mp4".equals(video.mimeType) ? "video.mp4" : "video/quicktime".equals(video.mimeType) ? "video.mov" : "" : video.fileName, new File(video.video.local.path), video.mimeType, 0);
    }

    public static void o(CountDownLatch countDownLatch) {
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable th) {
                Log.i(th);
                throw new RuntimeException(th);
            }
        }
    }

    public static File o0(boolean z10) {
        File file = null;
        if (z10) {
            file = j0.q().getExternalFilesDir(null);
        }
        return file != null ? file : j0.q().getFilesDir();
    }

    public static boolean o1(float f10, float f11, float f12, float f13, float f14) {
        return f12 >= f10 - f14 && f12 <= f10 + f14 && f13 >= f11 - f14 && f13 <= f11 + f14;
    }

    public static InputStream o2(String str) {
        if (!str.startsWith("content://")) {
            return new FileInputStream(str);
        }
        InputStream openInputStream = j0.q().getContentResolver().openInputStream(Uri.parse(str));
        if (openInputStream != null) {
            return openInputStream;
        }
        throw new IllegalArgumentException("getContentResolver().openInputStream() failed for path: " + str);
    }

    public static boolean p(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        if (countDownLatch == null) {
            return false;
        }
        try {
            return countDownLatch.await(j10, timeUnit);
        } catch (Throwable th) {
            Log.i(th);
            throw new RuntimeException(th);
        }
    }

    public static long p0() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static boolean p1(Uri uri) {
        String j22 = j2(uri.getPath());
        return !i.i(j22) && j22.startsWith(j0.n().getFilesDir().getPath());
    }

    public static MediaMetadataRetriever p2(String str) {
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (str.startsWith("content://")) {
                mediaMetadataRetriever.setDataSource(j0.q(), Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            return mediaMetadataRetriever;
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            H(mediaMetadataRetriever2);
            throw th;
        }
    }

    public static String q(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append((CharSequence) Integer.toHexString((b10 & 255) | Log.TAG_CRASH), 1, 3);
        }
        return sb2.toString();
    }

    public static String q0(Context context, Uri uri, String str, String[] strArr) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null && query.moveToFirst()) {
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                query.close();
                return string;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            Log.w("Cannot get data column", th, new Object[0]);
            return null;
        }
    }

    public static boolean q1(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1204607085:
                if (str.equals("localhost")) {
                    c10 = 0;
                    break;
                }
                break;
            case 57585:
                if (str.equals("::1")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1505998205:
                if (str.equals("127.0.0.1")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static int q2(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i10 += i11 - 1;
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i13 = 0;
        while (true) {
            i11--;
            if (i11 <= 0) {
                return i13;
            }
            i13 = (bArr[i10] & 255) | (i13 << 8);
            i10 += i12;
        }
    }

    public static boolean r(Bitmap bitmap, int i10, int i11) {
        return A1(bitmap) && N.blurBitmap(bitmap, i10, i11, 0) == 0;
    }

    public static Locale r0(String str) {
        if ("zz".equals(str)) {
            return j0.B().getConfiguration().locale;
        }
        return K(str);
    }

    public static boolean r1(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static float[] r2(int i10, boolean z10) {
        if (i10 < 1 || i10 > 3) {
            f<float[]> fVar = f19440f;
            if (fVar == null) {
                synchronized (v0.class) {
                    if (f19440f == null) {
                        f19440f = new f<>();
                    }
                    fVar = f19440f;
                }
            }
            float[] a10 = fVar.a();
            if ((a10 != null && a10.length >= i10) || !z10) {
                return a10;
            }
            float[] fArr = new float[Math.max(i10, 100)];
            fVar.b(fArr);
            return fArr;
        }
        f<float[]> fVar2 = f19439e;
        if (fVar2 == null) {
            synchronized (v0.class) {
                if (f19439e == null) {
                    f19439e = new f<>();
                }
                fVar2 = f19439e;
            }
        }
        float[] a11 = fVar2.a();
        if (a11 != null || !z10) {
            return a11;
        }
        float[] fArr2 = new float[3];
        fVar2.b(fArr2);
        return fArr2;
    }

    public static String s(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        if (bArr.length > 16) {
            String t10 = t(bArr);
            for (int i10 = 0; i10 < 32; i10++) {
                if (i10 != 0) {
                    if (i10 % 8 == 0) {
                        sb2.append('\n');
                    } else if (i10 % 4 == 0) {
                        sb2.append(' ');
                    }
                }
                int i11 = i10 * 2;
                sb2.append(t10.substring(i11, i11 + 2));
                sb2.append(' ');
            }
            sb2.append("\n");
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = (i12 * 4) + 16;
                byte b10 = bArr[i13];
                byte b11 = bArr[i13 + 1];
                byte b12 = bArr[i13 + 2];
                byte b13 = bArr[i13 + 3];
            }
        }
        return sb2.toString();
    }

    public static String s0(int i10) {
        return GLUtils.getEGLErrorString(i10);
    }

    public static boolean s1(File file) {
        return t1(file.getPath());
    }

    public static void s2(File file, int i10) {
        try {
            j1.a aVar = new j1.a(file);
            aVar.b0("Orientation", String.valueOf(i10));
            aVar.W();
        } catch (Throwable th) {
            Log.e("Unable to update exif orientation for path: %s", th, file.getPath());
        }
    }

    public static String t(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f19438d;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static int t0(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: oc.v0.t0(java.lang.String):int");
    }

    public static boolean t1(String str) {
        return str.startsWith(n0(true).getPath());
    }

    public static int t2(InputStream inputStream) {
        return (inputStream.read() << 8) | inputStream.read();
    }

    public static long u(long j10, long j11) {
        return v((int) (j10 * 3.141592653589793d), j11);
    }

    public static int u0(byte[] bArr, int[] iArr) {
        int i10;
        int q22;
        int i11;
        if (bArr == null) {
            return 0;
        }
        int i12 = 0;
        while (i12 + 3 < bArr.length) {
            int i13 = i12 + 1;
            if ((bArr[i12] & 255) == 255) {
                boolean z10 = bArr[i13] & 255;
                if (z10 != 255) {
                    i13++;
                    if (!(z10 == 216 || z10 == 1)) {
                        if (z10 != 217 && z10 != 218) {
                            int q23 = q2(bArr, i13, 2, false);
                            if (q23 >= 2 && (i11 = i13 + q23) <= bArr.length) {
                                if (z10 == 225 && q23 >= 8 && q2(bArr, i13 + 2, 4, false) == 1165519206 && q2(bArr, i13 + 6, 2, false) == 0) {
                                    i12 = i13 + 8;
                                    i10 = q23 - 8;
                                    break;
                                }
                                i12 = i11;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
                i12 = i13;
            }
            i12 = i13;
        }
        i10 = 0;
        if (i10 <= 8 || ((q22 = q2(bArr, i12, 4, false)) != 1229531648 && q22 != 1296891946)) {
            return 0;
        }
        boolean z11 = q22 == 1229531648;
        int q24 = q2(bArr, i12 + 4, 4, z11) + 2;
        if (q24 >= 10 && q24 <= i10) {
            int i14 = i12 + q24;
            int i15 = i10 - q24;
            int q25 = q2(bArr, i14 - 2, 2, z11);
            while (true) {
                q25--;
                if (q25 <= 0 || i15 < 12) {
                    break;
                } else if (q2(bArr, i14, 2, z11) == 274) {
                    if (iArr != null) {
                        iArr[0] = i14 + 8;
                        iArr[1] = 2;
                        int i16 = z11 ? 1 : 0;
                        char c10 = z11 ? 1 : 0;
                        iArr[2] = i16;
                    }
                    return q2(bArr, i14 + 8, 2, z11);
                } else {
                    i14 += 12;
                    i15 -= 12;
                }
            }
        }
        return 0;
    }

    public static boolean u1(o2 o2Var) {
        return (o2Var instanceof m3.q) && ((m3.q) o2Var).M == 1;
    }

    public static void u2(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static long v(int i10, long j10) {
        long ceil = j10 <= 0 ? 10L : (long) Math.ceil(j10 / i10);
        if (ceil <= 10) {
            ceil = (long) Math.ceil(ceil * a0.h());
        }
        return Math.max(ValueAnimator.getFrameDelay(), ceil);
    }

    public static String v0(String str) {
        String x02 = x0(str);
        int lastIndexOf = x02.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        String substring = x02.substring(lastIndexOf + 1);
        return substring.toLowerCase().equals("crdownload") ? v0(x02.substring(0, lastIndexOf)) : substring;
    }

    public static boolean v1() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) j0.n().getSystemService("connectivity");
            if (Build.VERSION.SDK_INT >= 28) {
                return !connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasCapability(18);
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isRoaming();
        } catch (Throwable th) {
            Log.e("Unable to detect roaming", th, new Object[0]);
            return false;
        }
    }

    public static void v2(Canvas canvas) {
        if (canvas != null) {
            try {
                canvas.setBitmap(null);
            } catch (Throwable unused) {
            }
        }
    }

    public static int w(long j10) {
        return (int) Math.round(j10 / 1000.0d);
    }

    public static ArrayList<String> w0(String str, boolean z10) {
        ArrayList<String> arrayList = null;
        File[] externalFilesDirs = j0.n().getExternalFilesDirs(null);
        int length = externalFilesDirs.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= length) {
                break;
            }
            File file = externalFilesDirs[i11];
            String str2 = file.getPath().split("/Android")[0];
            String a10 = y0.d.a(file);
            if (!"mounted".equals(a10) && !"mounted_ro".equals(a10)) {
                z11 = false;
            }
            if (z11 && !i.c(str, str2)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(str2);
            }
            i11++;
        }
        if (arrayList == null) {
            StringBuilder sb2 = new StringBuilder();
            try {
                Process start = new ProcessBuilder(new String[0]).command("mount | grep /dev/block/vold").redirectErrorStream(true).start();
                start.waitFor();
                InputStream inputStream = start.getInputStream();
                byte[] bArr = new byte[Log.TAG_CAMERA];
                while (inputStream.read(bArr) != -1) {
                    sb2.append(new String(bArr));
                }
                inputStream.close();
            } catch (Throwable unused) {
            }
            String sb3 = sb2.toString();
            if (!sb3.trim().isEmpty()) {
                for (String str3 : sb3.split("\n")) {
                    String str4 = str3.split(" ")[2];
                    if (!i.c(str, str4)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(str4);
                    }
                }
            }
        }
        if (z10 && arrayList != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                while (i10 < arrayList.size()) {
                    if (!arrayList.get(i10).toLowerCase().matches(".*[0-9a-f]{4}[-][0-9a-f]{4}")) {
                        i10--;
                        arrayList.remove(i10);
                    }
                    i10++;
                }
            } else {
                while (i10 < arrayList.size()) {
                    if (!arrayList.get(i10).toLowerCase().contains("ext") && !arrayList.get(i10).toLowerCase().contains("sdcard")) {
                        i10--;
                        arrayList.remove(i10);
                    }
                    i10++;
                }
            }
        }
        return arrayList;
    }

    public static boolean w1(float f10) {
        return h.k(f10, 180.0f) == 90.0f;
    }

    public static void w2(RecyclerView.h<?> hVar, int i10) {
        int D = hVar.D();
        if (i10 == D) {
            if (i10 != 0) {
                hVar.L(0, D);
            }
        } else if (i10 == 0) {
            hVar.M(0, D);
        } else if (D == 0) {
            hVar.N(0, i10);
        } else if (D > i10) {
            hVar.M(i10, D - i10);
            hVar.L(0, i10);
        } else {
            hVar.N(D, i10 - D);
            hVar.L(0, D);
        }
    }

    public static int x(CharSequence charSequence, int i10, float f10) {
        SoftReference<TextView> softReference = f19436b;
        TextView textView = softReference != null ? softReference.get() : null;
        if (textView == null) {
            textView = new b2(j0.E());
            textView.setTypeface(ce.o.k());
            textView.setPadding(0, 0, 0, 0);
        }
        textView.setText(charSequence);
        textView.setTextSize(1, f10);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    public static String x0(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : str;
    }

    public static boolean x1(int i10) {
        return h.l(i10, 180) == 90;
    }

    public static void x2(String[] strArr, final kb.i iVar) {
        org.thunderdog.challegram.a E;
        if (Build.VERSION.SDK_INT >= 23 && (E = j0.E()) != null) {
            E.K2(strArr, new ie.a() {
                @Override
                public final void l1(int i10, boolean z10) {
                    v0.F1(kb.i.this, i10, z10);
                }
            });
        }
    }

    public static int y(CharSequence charSequence, int i10, float f10, HashMap<CharSequence, int[]> hashMap) {
        if (i10 <= 0) {
            return 0;
        }
        int[] iArr = hashMap != null ? hashMap.get(charSequence) : null;
        if (iArr == null || iArr[0] != i10) {
            if (iArr == null) {
                iArr = new int[2];
                if (hashMap != null) {
                    hashMap.put(charSequence, iArr);
                }
            }
            iArr[0] = i10;
            iArr[1] = x(charSequence, i10, f10);
        }
        return iArr[1];
    }

    public static String y0() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
    }

    public static boolean y1(String str) {
        if (i.i(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("screencapture") || lowerCase.contains("screenshot") || lowerCase.contains("экран");
    }

    public static boolean y2(final Runnable runnable, String... strArr) {
        if (strArr == null || strArr.length == 0 || Build.VERSION.SDK_INT < 23 || !Y1(strArr)) {
            return false;
        }
        org.thunderdog.challegram.a E = j0.E();
        if (E == null) {
            return true;
        }
        E.K2(strArr, new ie.a() {
            @Override
            public final void l1(int i10, boolean z10) {
                v0.G1(runnable, i10, z10);
            }
        });
        return true;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageLegacy() || Environment.isExternalStorageManager();
    }

    public static long z0(StatFs statFs) {
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static boolean z1(o2 o2Var) {
        return (o2Var instanceof m3.q) && ((m3.q) o2Var).M == 0 && (o2Var.getCause() instanceof s0);
    }

    public static String z2(String str) {
        return A2(str, v0(str));
    }
}
