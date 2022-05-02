package nc;

import android.animation.ValueAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import be.C1357a0;
import be.C1363c0;
import be.C1369e0;
import be.C1379j0;
import be.C1389o;
import be.C1405v;
import gd.C4779t2;
import ge.C4868i;
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
import me.C6847b2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.FileProvider;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.C7907b;
import org.thunderdog.challegram.loader.ImageLoader;
import p006a5.C0176x;
import p037cb.C2064f;
import p038ce.k30;
import p082fd.C4383l;
import p082fd.C4403w;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4550f;
import p095gc.AbstractC4551g;
import p095gc.AbstractC4572y;
import p095gc.C4560o;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5068g;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.AbstractC5090k;
import p111he.AbstractC5096a;
import p118i5.C5220d;
import p129j1.C5828a;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p156kd.C6253l;
import p156kd.C6259q;
import p174m3.AbstractC6689s;
import p174m3.C6591e2;
import p174m3.C6634k;
import p174m3.C6646m;
import p174m3.C6660o1;
import p174m3.C6681q;
import p181mb.C6815f;
import p187n4.AbstractC7230t;
import p187n4.C7187g0;
import p187n4.C7190h;
import p187n4.C7235u0;
import p225pd.C8112b;
import p270t3.C8955d;
import p337y0.C10330d;
import p350yd.AbstractC10664f9;
import p350yd.C10634e9;
import p350yd.C10930q6;
import p356z4.C11253f;

public class C7389v0 {
    public static Boolean f23324a;
    public static SoftReference<TextView> f23325b;
    public static Integer f23326c;
    public static final char[] f23327d = "0123456789ABCDEF".toCharArray();
    public static C6815f<float[]> f23328e;
    public static C6815f<float[]> f23329f;
    public static C6815f<C7391b> f23330g;

    public static class C7390a {
        public final int f23331a;
        public final int f23332b;
        public final int f23333c;
        public final long f23334d;
        public final long f23335e;
        public final boolean f23336f;
        public final boolean f23337g;
        public final String f23338h;
        public final String f23339i;

        public C7390a(int i, int i2, int i3, long j, long j2, boolean z, boolean z2, String str, String str2) {
            this.f23331a = i;
            this.f23332b = i2;
            this.f23333c = i3;
            this.f23334d = j;
            this.f23335e = j2;
            this.f23336f = z;
            this.f23337g = z2;
            this.f23338h = str;
            this.f23339i = str2;
        }

        public long m16554a(TimeUnit timeUnit) {
            return timeUnit.convert(this.f23334d, TimeUnit.MILLISECONDS);
        }
    }

    public static class C7391b implements Comparator<Object> {
        public Spannable f23340a;

        public void m16553a(Spannable spannable) {
            this.f23340a = spannable;
        }

        @Override
        public int compare(Object obj, Object obj2) {
            return Integer.compare(this.f23340a.getSpanStart(obj), this.f23340a.getSpanStart(obj2));
        }
    }

    public static boolean m16758A(File file, String str) {
        try {
            return m16700O1(file, str, false) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int m16757A0(Location location) {
        if (!location.hasBearing()) {
            return 0;
        }
        int l = C5069h.m24081l(Math.round(location.getBearing()), 360);
        if (l != 0) {
            return l;
        }
        return 360;
    }

    public static boolean m16756A1(Bitmap bitmap) {
        return bitmap != null && !bitmap.isRecycled();
    }

    public static String m16755A2(String str, String str2) {
        String g;
        if (!C5070i.m24061i(str2) && (g = C1369e0.m37392g(str2)) != null) {
            return g;
        }
        try {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        } catch (Throwable th) {
            Log.m14710w("Cannot resolver mimeType, path: %s", th, str);
            return null;
        }
    }

    public static boolean m16754B(Uri uri) {
        try {
            InputStream o2 = m16599o2(uri.toString());
            if (o2 != null) {
                o2.close();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int m16753B0(Bitmap bitmap, int i) {
        return m16564x1(i) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public static boolean m16752B1(AudioManager audioManager) {
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

    public static int[] m16751B2(C6815f<int[]> fVar, int i) {
        int[] a = fVar.m18901a();
        if (a == null) {
            return new int[i];
        }
        for (int i2 = 0; i2 < a.length; i2++) {
            a[i2] = 0;
        }
        return a;
    }

    public static boolean m16750C(String str) {
        try {
            return new File(str).canRead();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Location m16749C0(Context context, boolean z) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                if (locationManager.isProviderEnabled("gps")) {
                    return locationManager.getLastKnownLocation("gps");
                }
                if (!z || !locationManager.isProviderEnabled("network")) {
                    return null;
                }
                return locationManager.getLastKnownLocation("network");
            }
        } catch (SecurityException unused) {
        } catch (Throwable th) {
            Log.m14710w("Error getting last known location", th, new Object[0]);
        }
        return null;
    }

    public static void m16748C1(String str, int i, AbstractC5918j jVar, boolean z) {
        if (m16698P(str, i, jVar) && z) {
            if (i == 0) {
                C1379j0.m37292y0(R.string.PhotoHasBeenSavedToGallery, 0);
            } else if (i == 1) {
                C1379j0.m37292y0(R.string.VideoHasBeenSavedToGallery, 0);
            } else if (i == 2) {
                C1379j0.m37292y0(R.string.GifHasBeenSavedToGallery, 0);
            }
        }
    }

    public static int m16747C2(int i, int i2) {
        if (i2 % 90 != 0) {
            Log.m14709w("Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i2));
            return 0;
        }
        int i3 = i2 % 360;
        while (i3 < 0) {
            i3 += 90;
            switch (i) {
                case 2:
                    i = 5;
                    break;
                case 3:
                case 8:
                    i = 6;
                    break;
                case 4:
                    i = 7;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 1;
                    break;
                case 7:
                    i = 2;
                    break;
                default:
                    i = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (i) {
                case 2:
                    i = 7;
                    break;
                case 3:
                    i = 8;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 2;
                    break;
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                case 8:
                    i = 1;
                    break;
                default:
                    i = 6;
                    break;
            }
        }
        return i;
    }

    public static boolean m16746D(TdApi.InputFile inputFile) {
        return false;
    }

    public static long m16745D0(String str) {
        if (C5070i.m24061i(str)) {
            return 0L;
        }
        if (str.startsWith("content://")) {
            return System.currentTimeMillis();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return Files.getLastModifiedTime(Paths.get(new File(str.startsWith("file://") ? str.substring(7) : str).toURI()), new LinkOption[0]).to(TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                Log.m14725e("Cannot determine last modified time v2", th, new Object[0]);
            }
        }
        try {
            return new File(str).lastModified();
        } catch (Throwable th2) {
            Log.m14725e("Cannot determine last modified time", th2, new Object[0]);
            return 0L;
        }
    }

    public static void m16744D1(String str, int i, boolean z, AbstractC5918j jVar, boolean z2) {
        if (z2) {
            m16702O(str, i, z, jVar);
        }
    }

    public static void m16743D2(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean m16742E(Context context) {
        return Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static int m16741E0(Paint.FontMetricsInt fontMetricsInt) {
        return Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent) + fontMetricsInt.leading;
    }

    public static void m16740E1(File file, String str, Uri uri) {
        if (uri != null) {
            C1379j0.m37315n().getContentResolver().delete(uri, null, null);
        }
        C5068g.m24099d(file);
    }

    public static void m16739E2(final Bitmap bitmap, final boolean z) {
        if (Build.VERSION.SDK_INT < 23 || !m16662Y1("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    C7389v0.m16724I1(bitmap);
                }
            });
        } else {
            m16563x2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z2) {
                    C7389v0.m16728H1(bitmap, z, z2);
                }
            });
        }
    }

    public static void m16738F(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                Log.m14708w(th);
            }
        }
    }

    public static long m16737F0(Cursor cursor, int i) {
        try {
            return cursor.getLong(i);
        } catch (Throwable unused) {
            return cursor.getInt(i);
        }
    }

    public static void m16736F1(AbstractC5917i iVar, int i, boolean z) {
        if (iVar != null) {
            iVar.mo1322a(z);
        }
    }

    public static void m16735F2(File file) {
        Uri fromFile;
        if (file != null && (fromFile = Uri.fromFile(file)) != null) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            C1379j0.m37309q().sendBroadcast(intent);
        }
    }

    public static void m16734G(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th) {
                Log.m14708w(th);
            }
        }
    }

    public static String m16733G0() {
        return C5070i.m24073E(Build.MANUFACTURER, C4403w.m27913Y1());
    }

    public static void m16732G1(Runnable runnable, int i, boolean z) {
        if (z) {
            runnable.run();
        }
    }

    public static void m16731G2(AbstractC5917i iVar, boolean z) {
        if (iVar != null) {
            iVar.mo1322a(z);
        }
    }

    public static void m16730H(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                Log.m14708w(th);
            }
        }
    }

    public static String m16729H0(double d, double d2, int i, boolean z, int i2, int i3) {
        int i4 = C1357a0.m37542h() >= 2.0f ? 2 : 1;
        int i5 = i2 / i4;
        int i6 = i3 / i4;
        if (i5 > 640 || i6 > 320) {
            float f = i5;
            float f2 = i6;
            float min = Math.min(640.0f / f, 320.0f / f2);
            i5 = (int) (f * min);
            i6 = (int) (f2 * min);
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[7];
        objArr[0] = Double.valueOf(d);
        objArr[1] = Double.valueOf(d2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(i5);
        objArr[4] = Integer.valueOf(i6);
        objArr[5] = Integer.valueOf(i4);
        objArr[6] = z ? "&style=element:geometry%7Ccolor:0x212121&style=element:labels.icon%7Cvisibility:off&style=element:labels.text.fill%7Ccolor:0x757575&style=element:labels.text.stroke%7Ccolor:0x212121&style=feature:administrative%7Celement:geometry%7Ccolor:0x757575&style=feature:administrative.country%7Celement:labels.text.fill%7Ccolor:0x9e9e9e&style=feature:administrative.land_parcel%7Cvisibility:off&style=feature:administrative.locality%7Celement:labels.text.fill%7Ccolor:0xbdbdbd&style=feature:poi%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:poi.park%7Celement:geometry%7Ccolor:0x181818&style=feature:poi.park%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:poi.park%7Celement:labels.text.stroke%7Ccolor:0x1b1b1b&style=feature:road%7Celement:geometry.fill%7Ccolor:0x2c2c2c&style=feature:road%7Celement:labels.text.fill%7Ccolor:0x8a8a8a&style=feature:road.arterial%7Celement:geometry%7Ccolor:0x373737&style=feature:road.highway%7Celement:geometry%7Ccolor:0x3c3c3c&style=feature:road.highway.controlled_access%7Celement:geometry%7Ccolor:0x4e4e4e&style=feature:road.local%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:transit%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:water%7Celement:geometry%7Ccolor:0x000000&style=feature:water%7Celement:labels.text.fill%7Ccolor:0x3d3d3d" : "";
        return String.format(locale, "https://maps.googleapis.com/maps/api/staticmap?format=jpg&center=%f,%f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&sensor=false%s", objArr);
    }

    public static void m16728H1(Bitmap bitmap, boolean z, boolean z2) {
        if (z2) {
            m16739E2(bitmap, z);
        }
    }

    public static boolean m16727H2(byte[] bArr, int[] iArr, int i) {
        int i2 = iArr[1];
        boolean z = false;
        if (i2 <= 0) {
            return false;
        }
        int i3 = iArr[0];
        if (iArr[2] == 1) {
            z = true;
        }
        m16671V2(i, bArr, i3, i2, z);
        return true;
    }

    public static boolean m16726I(Bitmap bitmap, int i, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            fileOutputStream.close();
            return compress;
        } catch (Throwable th) {
            Log.m14710w("Failed to compress bitmap", th, new Object[0]);
            return false;
        }
    }

    public static String m16725I0(C10930q6 q6Var, double d, double d2, int i, boolean z, int i2, int i3, int[] iArr) {
        int i4 = C1357a0.m37542h() >= 2.0f ? 2 : 1;
        float f = 640;
        float f2 = 320;
        float min = Math.min(Math.min(i2 / i4, 640) / f, Math.min(i3 / i4, 320) / f2);
        int i5 = (int) (f * min);
        int i6 = (int) (f2 * min);
        int i7 = i5 - (i5 % 2);
        int i8 = i6 - (i6 % 2);
        Locale locale = Locale.US;
        Object[] objArr = new Object[8];
        objArr[0] = Double.valueOf(d);
        objArr[1] = Double.valueOf(d2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(i7);
        objArr[4] = Integer.valueOf(i8);
        objArr[5] = Integer.valueOf(i4);
        objArr[6] = q6Var.m2797J9();
        objArr[7] = z ? "&style=element:geometry%7Ccolor:0x212121&style=element:labels.icon%7Cvisibility:off&style=element:labels.text.fill%7Ccolor:0x757575&style=element:labels.text.stroke%7Ccolor:0x212121&style=feature:administrative%7Celement:geometry%7Ccolor:0x757575&style=feature:administrative.country%7Celement:labels.text.fill%7Ccolor:0x9e9e9e&style=feature:administrative.land_parcel%7Cvisibility:off&style=feature:administrative.locality%7Celement:labels.text.fill%7Ccolor:0xbdbdbd&style=feature:poi%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:poi.park%7Celement:geometry%7Ccolor:0x181818&style=feature:poi.park%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:poi.park%7Celement:labels.text.stroke%7Ccolor:0x1b1b1b&style=feature:road%7Celement:geometry.fill%7Ccolor:0x2c2c2c&style=feature:road%7Celement:labels.text.fill%7Ccolor:0x8a8a8a&style=feature:road.arterial%7Celement:geometry%7Ccolor:0x373737&style=feature:road.highway%7Celement:geometry%7Ccolor:0x3c3c3c&style=feature:road.highway.controlled_access%7Celement:geometry%7Ccolor:0x4e4e4e&style=feature:road.local%7Celement:labels.text.fill%7Ccolor:0x616161&style=feature:transit%7Celement:labels.text.fill%7Ccolor:0x757575&style=feature:water%7Celement:geometry%7Ccolor:0x000000&style=feature:water%7Celement:labels.text.fill%7Ccolor:0x3d3d3d" : "";
        String format = String.format(locale, "https://maps.googleapis.com/maps/api/staticmap?format=jpg&center=%f,%f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&sensor=false&language=%s%s", objArr);
        if (iArr != null) {
            iArr[0] = i7 * i4;
            iArr[1] = i8 * i4;
        }
        return format;
    }

    public static void m16724I1(android.graphics.Bitmap r5) {
        throw new UnsupportedOperationException("Method not decompiled: nc.C7389v0.m16724I1(android.graphics.Bitmap):void");
    }

    public static byte[] m16723I2(byte[] bArr) {
        return m16657a0(bArr, "SHA-1");
    }

    public static Bitmap.CompressFormat m16722J(boolean z) {
        if (!z) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.PNG;
    }

    public static String m16721J0() {
        String u1 = C4403w.m27821u1(R.string.MarketUrl, new Object[0]);
        return C1363c0.m37457Q(u1) ? u1 : "https://play.google.com/store/apps/details?id=org.thunderdog.challegram";
    }

    public static String m16719J2(String str) {
        return m16661Z(str, "SHA-256");
    }

    public static Locale m16718K(String str) {
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

    public static synchronized int m16717K0() {
        synchronized (C7389v0.class) {
            Integer num = f23326c;
            if (num != null) {
                return num.intValue();
            }
            int V = m16674V();
            f23326c = Integer.valueOf(V);
            return V;
        }
    }

    public static File m16715K2(String str) {
        File file;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                file = C1379j0.m37315n().getDataDir();
            } else {
                file = C1379j0.m37315n().getFilesDir().getParentFile();
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
            Log.m14725e("Cannot retrieve shared prefs file", th, new Object[0]);
            return null;
        }
    }

    public static Uri m16714L(File file) {
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        try {
            return FileProvider.m14750e(C1379j0.m37315n(), "org.thunderdog.challegram.provider", file);
        } catch (Throwable th) {
            Log.m14725e("Can't create content uri for path", th, new Object[0]);
            return null;
        }
    }

    public static C7390a m16713L0(String str) {
        String str2;
        String str3;
        try {
            MediaMetadataRetriever p2 = m16595p2(str);
            if (p2 == null) {
                return null;
            }
            boolean equalsIgnoreCase = "yes".equalsIgnoreCase(p2.extractMetadata(17));
            boolean equalsIgnoreCase2 = "yes".equalsIgnoreCase(p2.extractMetadata(16));
            long w = C5070i.m24047w(p2.extractMetadata(9));
            long w2 = C5070i.m24047w(p2.extractMetadata(20));
            int s = equalsIgnoreCase ? C5070i.m24051s(p2.extractMetadata(18)) : 0;
            int s2 = equalsIgnoreCase ? C5070i.m24051s(p2.extractMetadata(19)) : 0;
            int s3 = (Build.VERSION.SDK_INT < 17 || !equalsIgnoreCase) ? 0 : C5070i.m24051s(p2.extractMetadata(24));
            if (equalsIgnoreCase) {
                str3 = null;
                str2 = null;
            } else {
                String extractMetadata = p2.extractMetadata(7);
                String extractMetadata2 = p2.extractMetadata(2);
                if (C5070i.m24061i(extractMetadata2)) {
                    extractMetadata2 = p2.extractMetadata(3);
                }
                if (C5070i.m24061i(extractMetadata2)) {
                    extractMetadata2 = p2.extractMetadata(13);
                }
                str3 = extractMetadata;
                str2 = extractMetadata2;
            }
            m16730H(p2);
            return new C7390a(s, s2, s3, w, w2, equalsIgnoreCase, equalsIgnoreCase2, str3, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m16712L1(final C6253l lVar, final AbstractC5918j jVar, boolean z, Bitmap bitmap) {
        if (bitmap != null) {
            C6259q.m20786c().m20785d(lVar, bitmap);
        }
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                AbstractC5918j.this.mo1330a(lVar);
            }
        });
    }

    public static boolean m16711L2(String str) {
        AbstractView$OnTouchListenerC7889a E;
        return Build.VERSION.SDK_INT >= 23 && (E = C1379j0.m37366E()) != null && E.shouldShowRequestPermissionRationale(str);
    }

    public static boolean m16710M(Context context, Uri uri, File file) {
        String scheme = uri.getScheme();
        scheme.hashCode();
        if (scheme.equals("file")) {
            return C5068g.m24102a(new File(uri.getPath()), file);
        }
        if (scheme.equals("content")) {
            long j = 0;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                AbstractC4537a0 j2 = C4560o.m27370j(openInputStream);
                try {
                    AbstractC4572y d = C4560o.m27376d(file);
                    AbstractC4550f a = C4560o.m27379a(d);
                    while (true) {
                        try {
                            long s = j2.mo5028s(a.mo27336a(), 20480L);
                            if (s == -1) {
                                break;
                            }
                            j += s;
                        } catch (Throwable th) {
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    a.flush();
                    a.close();
                    if (d != null) {
                        d.close();
                    }
                    j2.close();
                    Log.m14719i("Copied %d bytes: %s to %s", Long.valueOf(j), uri, file);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return true;
                } catch (Throwable th3) {
                    if (j2 != null) {
                        try {
                            j2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                Log.m14725e("Unable to copy file", th5, new Object[0]);
                return false;
            }
        } else {
            throw new UnsupportedOperationException(uri.getScheme());
        }
    }

    public static String m16709M0(String str, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) C1379j0.m37315n().getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, C4403w.m27869i1(i), 2));
        }
        return str;
    }

    public static void m16707M2(InputStream inputStream) {
        int read = inputStream.read();
        int i = 0;
        while (i < read) {
            long skip = inputStream.skip(read - i);
            if (skip == -1) {
                break;
            }
            i = (int) (i + skip);
        }
        if (i < read) {
            throw new IllegalArgumentException();
        }
    }

    public static void m16706N(String str, int i) {
        m16702O(str, i, true, null);
    }

    public static String m16705N0() {
        return m16709M0("other", R.string.NotificationChannelOther);
    }

    public static void m16704N1(File file, final AbstractC5918j jVar, boolean z) {
        final C6253l lVar;
        int i;
        int i2;
        if (!file.exists()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5918j.this.mo1330a(null);
                }
            });
            return;
        }
        if (z) {
            C7390a L0 = m16713L0(file.getPath());
            if (L0 != null) {
                lVar = new C6253l(-1L, file.getPath(), file.lastModified(), L0.f23331a, L0.f23332b, -1L, false);
                lVar.m20839i1();
                lVar.m20838j1(L0.m16554a(TimeUnit.MILLISECONDS), "video/mov");
                lVar.m20835m1();
                lVar.mo20874q0(L0.f23333c);
            } else {
                lVar = null;
            }
        } else {
            int t0 = m16581t0(file.getPath());
            int S0 = m16685S0(t0);
            BitmapFactory.Options h = C7907b.m14365h(file.getPath());
            if (!m16624i1(t0) || S0 != 0) {
                i = h.outWidth;
                i2 = h.outHeight;
            } else {
                i = h.outHeight;
                i2 = h.outWidth;
            }
            C6253l lVar2 = new C6253l(-1L, file.getPath(), file.lastModified(), i, i2, -1L, false);
            lVar2.m20908l0();
            lVar2.m20926b0();
            lVar2.m20839i1();
            lVar2.mo20767t0(C8112b.m13490o0());
            lVar2.mo20874q0(S0);
            lVar = lVar2;
        }
        if (lVar != null) {
            ImageLoader.m14392e().m14390g(lVar, new C7907b.AbstractC7910c() {
                @Override
                public final void mo14348b(boolean z2, Bitmap bitmap) {
                    C7389v0.m16712L1(C6253l.this, jVar, z2, bitmap);
                }
            });
        } else {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5918j.this.mo1330a(null);
                }
            });
        }
    }

    public static void m16703N2(Service service, int i, Notification notification) {
        if (notification != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 26 || !C5070i.m24061i(notification.getChannelId())) {
                if (i2 >= 29) {
                    int i3 = 0;
                    switch (i) {
                        case 2147483643:
                            i3 = 1;
                            break;
                        case 2147483644:
                        case 2147483645:
                            i3 = 4;
                            break;
                        case 2147483646:
                            i3 = 8;
                            break;
                        case Integer.MAX_VALUE:
                            i3 = 2;
                            break;
                    }
                    if (i3 != 0) {
                        service.startForeground(i, notification, i3);
                        return;
                    }
                }
                service.startForeground(i, notification);
                return;
            }
            throw new IllegalArgumentException("id == " + i);
        }
        throw new IllegalArgumentException();
    }

    public static void m16702O(final String str, final int i, final boolean z, final AbstractC5918j<File> jVar) {
        if (Build.VERSION.SDK_INT >= 23 && m16665X1("android.permission.WRITE_EXTERNAL_STORAGE")) {
            m16563x2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z2) {
                    C7389v0.m16744D1(str, i, z, jVar, z2);
                }
            });
        } else if (str != null && !str.isEmpty()) {
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    C7389v0.m16748C1(str, i, jVar, z);
                }
            });
        }
    }

    public static String m16701O0(Uri uri, String str) {
        Cursor query;
        try {
            query = C1379j0.m37309q().getContentResolver().query(uri, new String[]{"title"}, null, null, null);
        } catch (Throwable th) {
            try {
                Log.m14725e("Couldn't get ringtone name for %s", th, uri);
            } catch (Throwable th2) {
                Log.m14725e("Error querying %s", th2, uri);
            }
        }
        if (query == null || !query.moveToFirst()) {
            if (query != null) {
                query.close();
            }
            return str;
        }
        String string = query.getString(0);
        Log.m14719i("Success: %s -> %s", uri, string);
        query.close();
        return string;
    }

    public static Uri m16700O1(File file, String str, boolean z) {
        if (Build.VERSION.SDK_INT >= 24 || (!z && !"application/vnd.android.package-archive".equals(str))) {
            return m16714L(file);
        }
        return Uri.fromFile(file);
    }

    public static void m16699O2(Service service, boolean z, int... iArr) {
        NotificationManager notificationManager;
        service.stopForeground(z);
        if (z && Build.VERSION.SDK_INT >= 28 && (notificationManager = (NotificationManager) service.getSystemService("notification")) != null) {
            for (int i : iArr) {
                notificationManager.cancel(i);
            }
        }
    }

    public static boolean m16698P(String str, int i, AbstractC5918j<File> jVar) {
        File g0 = m16633g0(str, i);
        if (g0 != null) {
            try {
                if (C5068g.m24102a(new File(str), g0)) {
                    m16610m(g0);
                    if (jVar == null) {
                        return true;
                    }
                    jVar.mo1330a(g0);
                    return true;
                }
                Log.m14709w("Cannot copy file to gallery", new Object[0]);
            } catch (Throwable th) {
                Log.m14710w("Cannot save file to gallery", th, new Object[0]);
            }
        }
        return false;
    }

    public static String m16697P0(String str, String str2) {
        return C5070i.m24061i(str) ? str : m16701O0(Uri.parse(str), str2);
    }

    public static float m16696P1(Layout layout) {
        float f = 0.0f;
        if (layout == null) {
            return 0.0f;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, layout.getLineWidth(i));
        }
        return f;
    }

    public static String m16695P2(int i) {
        return m16691Q2(C5063c.m24136j(i), C5063c.m24135k(i), C5063c.m24134l(i));
    }

    public static Layout m16694Q(CharSequence charSequence, int i, TextPaint textPaint) {
        return m16690R(charSequence, i, textPaint, Layout.Alignment.ALIGN_NORMAL);
    }

    public static File m16693Q0() {
        File file = new File(m16601o0(false), "ringtones");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        throw new IllegalStateException();
    }

    public static String m16692Q1(String str) {
        return m16661Z(str, "MD5");
    }

    public static java.lang.String m16691Q2(int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: nc.C7389v0.m16691Q2(int, int, int):java.lang.String");
    }

    public static Layout m16690R(CharSequence charSequence, int i, TextPaint textPaint, Layout.Alignment alignment) {
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(charSequence, textPaint);
        if (isBoring == null || isBoring.width > i) {
            return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i, alignment, 1.0f, 0.0f, false);
        }
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, isBoring, false);
    }

    @Deprecated
    public static int m16689R0(String str) {
        return m16685S0(m16581t0(str));
    }

    public static float m16688R1(CharSequence charSequence, int i, int i2, Paint paint) {
        float f = 0.0f;
        if (C5070i.m24061i(charSequence)) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spannable)) {
            return m16684S1(charSequence, i, i2, paint);
        }
        Spannable spannable = (Spannable) charSequence;
        AbstractC5090k[] kVarArr = (AbstractC5090k[]) spannable.getSpans(i, i2, AbstractC5090k.class);
        if (kVarArr == null || kVarArr.length == 0) {
            return m16684S1(charSequence, i, i2, paint);
        }
        if (kVarArr.length > 1) {
            C7391b U0 = m16677U0();
            U0.m16553a(spannable);
            Arrays.sort(kVarArr, U0);
        }
        for (AbstractC5090k kVar : kVarArr) {
            int spanStart = spannable.getSpanStart(kVar);
            if (i < spanStart) {
                f += m16684S1(charSequence, i, spanStart, paint);
            }
            f += kVar.mo23967b(paint);
            i = spannable.getSpanEnd(kVar);
        }
        return i < i2 ? f + m16684S1(charSequence, i, i2, paint) : f;
    }

    public static void m16687R2(final File file, final boolean z, final AbstractC5918j<C6253l> jVar) {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                C7389v0.m16704N1(file, jVar, z);
            }
        });
    }

    public static byte[] m16686S(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (b == 61) {
                    int i2 = i + 1;
                    int digit = Character.digit((char) bArr[i2], 16);
                    i = i2 + 1;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i], 16)));
                } else {
                    byteArrayOutputStream.write(b);
                }
                i++;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e) {
            Log.m14708w(e);
            return null;
        }
    }

    @Deprecated
    public static int m16685S0(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static float m16684S1(CharSequence charSequence, int i, int i2, Paint paint) {
        int i3 = i2 - i;
        if (charSequence == null || charSequence.length() == 0 || i3 <= 0) {
            return 0.0f;
        }
        if (paint == null) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 23 && C1363c0.m37467G(charSequence, i, i2) != 2) {
            return paint.getRunAdvance(charSequence, i, i2, 0, charSequence.length(), false, i2);
        } else {
            float[] r2 = m16587r2(i3, true);
            paint.getTextWidths(charSequence, i, i2, r2);
            return C5062b.m24176F(r2, i3);
        }
    }

    public static android.graphics.Bitmap m16683S2(java.lang.String r3, android.graphics.Rect r4, android.graphics.BitmapFactory.Options r5) {
        throw new UnsupportedOperationException("Method not decompiled: nc.C7389v0.m16683S2(java.lang.String, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static void m16682T(final File file) {
        if (file != null) {
            if (m16584s1(file)) {
                C5068g.m24099d(file);
            } else {
                MediaScannerConnection.scanFile(C1379j0.m37315n(), new String[]{file.getPath()}, null, new MediaScannerConnection.OnScanCompletedListener() {
                    @Override
                    public final void onScanCompleted(String str, Uri uri) {
                        C7389v0.m16740E1(file, str, uri);
                    }
                });
            }
        }
    }

    public static String m16681T0(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (Character.charCount(codePointAt) != 1 || codePointAt != 46) {
                break;
            }
            i2++;
        }
        int i3 = length - i2;
        if (i3 <= 0) {
            return "file";
        }
        StringBuilder sb2 = new StringBuilder(i3);
        sb2.append((CharSequence) str, i2, length);
        int length2 = sb2.length();
        while (i < length2) {
            int codePointAt2 = sb2.codePointAt(i);
            int charCount = Character.charCount(codePointAt2);
            if (charCount == 1 && (codePointAt2 == 47 || codePointAt2 == 92)) {
                sb2.setCharAt(i, '_');
            }
            i += charCount;
        }
        return str;
    }

    public static float m16680T1(CharSequence charSequence, Paint paint) {
        if (C5070i.m24061i(charSequence)) {
            return 0.0f;
        }
        return m16684S1(charSequence, 0, charSequence.length(), paint);
    }

    public static Bitmap m16679T2(String str, long j, int i, int i2, int[] iArr) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever = m16595p2(str);
            if (iArr != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 17) {
                        iArr[0] = C5070i.m24051s(mediaMetadataRetriever.extractMetadata(24));
                    }
                } catch (IllegalArgumentException | RuntimeException unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 27 && Math.min(i, i2) > 0) {
                if (Math.max(i, i2) < Math.max(C5070i.m24051s(mediaMetadataRetriever.extractMetadata(18)), C5070i.m24051s(mediaMetadataRetriever.extractMetadata(19)))) {
                    bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, j == -1 ? 2 : 1, i, i2);
                }
            }
            if (bitmap == null) {
                bitmap = j == -1 ? mediaMetadataRetriever.getFrameAtTime() : mediaMetadataRetriever.getFrameAtTime(j, 1);
            }
        } catch (IllegalArgumentException | RuntimeException unused2) {
            mediaMetadataRetriever = null;
        }
        m16730H(mediaMetadataRetriever);
        return bitmap;
    }

    public static boolean m16678U(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return C1379j0.m37315n().deleteSharedPreferences(str);
            }
            File K2 = m16715K2(str);
            return K2 != null && K2.delete();
        } catch (Throwable unused) {
            Log.m14724e("Cannot delete shared preferences, name:%s", str);
            return false;
        }
    }

    public static C7391b m16677U0() {
        if (f23330g == null) {
            synchronized (C7389v0.class) {
                if (f23330g == null) {
                    f23330g = new C6815f<>();
                }
            }
        }
        C7391b a = f23330g.m18901a();
        if (a != null) {
            return a;
        }
        C7391b bVar = new C7391b();
        f23330g.m18900b(bVar);
        return bVar;
    }

    public static boolean m16676U1(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        if (file.isDirectory()) {
            return m16672V1(file, file2);
        }
        if (C5068g.m24102a(file, file2)) {
            return file.delete();
        }
        Log.m14709w("Cannot copy file", new Object[0]);
        return false;
    }

    public static java.lang.String m16675U2(android.net.Uri r9) {
        throw new UnsupportedOperationException("Method not decompiled: nc.C7389v0.m16675U2(android.net.Uri):java.lang.String");
    }

    public static int m16674V() {
        if (Build.VERSION.SDK_INT < 17) {
            return 0;
        }
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

    public static long m16673V0(StatFs statFs) {
        long blockSize;
        long blockCount;
        if (Build.VERSION.SDK_INT >= 19) {
            blockSize = statFs.getBlockSizeLong();
            blockCount = statFs.getBlockCountLong();
        } else {
            blockSize = statFs.getBlockSize();
            blockCount = statFs.getBlockCount();
        }
        return blockSize * blockCount;
    }

    public static boolean m16672V1(File file, File file2) {
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            if (file.delete()) {
                return true;
            }
            Log.m14709w("Unable to delete media directory", new Object[0]);
            return false;
        } else if (!file2.mkdirs() && !file2.exists()) {
            Log.m14709w("Failed to create output directory", new Object[0]);
            return false;
        } else if (!file2.isDirectory()) {
            Log.m14709w("Output directory is not a directory", new Object[0]);
            return false;
        } else {
            int i = 0;
            for (File file3 : listFiles) {
                if (m16676U1(file3, new File(file2, file3.getName()))) {
                    i++;
                }
            }
            return i == listFiles.length && file.delete();
        }
    }

    public static void m16671V2(int i, byte[] bArr, int i2, int i3, boolean z) {
        int i4;
        if (!z) {
            i2 += i3 - 1;
            i4 = -1;
        } else {
            i4 = 1;
        }
        int i5 = 0;
        while (true) {
            i3--;
            if (i3 > 0) {
                bArr[i2] = (byte) ((i >> i5) & 255);
                i5 += 8;
                i2 += i4;
            } else {
                return;
            }
        }
    }

    public static boolean m16670W(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 17) {
            return packageManager.hasSystemFeature("android.hardware.camera.any");
        }
        return packageManager.hasSystemFeature("android.hardware.camera");
    }

    public static long m16669W0(List<File> list) {
        long j = 0;
        if (list != null && !list.isEmpty()) {
            for (File file : list) {
                j += file.length();
            }
        }
        return j;
    }

    public static void m16668W1() {
        File n0;
        File X0 = m16666X0();
        if (X0.exists() && (n0 = m16605n0(true)) != null && !n0.equals(X0)) {
            m16672V1(X0, n0);
        }
    }

    public static boolean m16667X(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static File m16666X0() {
        return new File(m16601o0(true), "media");
    }

    public static boolean m16665X1(String str) {
        AbstractView$OnTouchListenerC7889a E;
        return (Build.VERSION.SDK_INT < 23 || (E = C1379j0.m37366E()) == null || E.checkSelfPermission(str) == 0) ? false : true;
    }

    public static float m16664Y(double d, double d2, double d3, double d4) {
        return Math.abs(m16651b2(d, d2).distanceTo(m16651b2(d3, d4)));
    }

    public static Uri m16663Y0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        return parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
    }

    public static boolean m16662Y1(String... strArr) {
        AbstractView$OnTouchListenerC7889a E;
        if (Build.VERSION.SDK_INT >= 23 && (E = C1379j0.m37366E()) != null) {
            for (String str : strArr) {
                if (E.checkSelfPermission(str) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String m16661Z(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return m16594q(MessageDigest.getInstance(str2).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static CharSequence m16660Z0(C10930q6 q6Var) {
        return C4403w.m27919X(q6Var) + " (cfee902)\nAndroid " + C2064f.m35725a() + "(" + Build.VERSION.SDK_INT + ")\n" + Build.BRAND + " " + Build.MODEL + " (" + Build.DISPLAY + ")";
    }

    public static AbstractC6689s m16659Z1(Context context, boolean z) {
        return new AbstractC6689s.C6691b(context, new C6646m(context).m19675j((z || C4868i.m24726c2().m24663k1(128L)) ? 2 : 1), new C7190h(context, new C8955d().m10835d(true))).m19554r(new C11253f(context)).m19555q(new C6634k()).m19564h();
    }

    public static byte[] m16657a0(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return MessageDigest.getInstance(str).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static int m16656a1(Bitmap bitmap, int i) {
        return m16564x1(i) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public static Location m16655a2() {
        Location location = new Location("network");
        location.setTime(System.currentTimeMillis());
        if (Build.VERSION.SDK_INT >= 17) {
            location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        }
        return location;
    }

    public static Matrix m16653b0(int i, int i2, int i3) {
        if (i3 == 0 || i3 == 1) {
            return null;
        }
        Matrix matrix = new Matrix();
        m16649c0(i, i2, i3, matrix);
        return matrix;
    }

    public static String m16652b1(String str) {
        try {
            AbstractC4551g b = C4560o.m27378b(C4560o.m27370j(new GZIPInputStream(new FileInputStream(new File(str)))));
            String T = b.mo27337T(C5070i.f17083a);
            b.close();
            return T;
        } catch (Throwable th) {
            Log.m14712w(Log.TAG_GIF_LOADER, "Cannot decode GZip, path: %s", th, str);
            return null;
        }
    }

    public static Location m16651b2(double d, double d2) {
        Location a2 = m16655a2();
        a2.setLatitude(d);
        a2.setLongitude(d2);
        return a2;
    }

    public static void m16649c0(int i, int i2, int i3, Matrix matrix) {
        matrix.reset();
        switch (i3) {
            case 2:
                matrix.postScale(-1.0f, 1.0f, i / 2.0f, i2 / 2.0f);
                return;
            case 3:
                matrix.postRotate(180.0f);
                return;
            case 4:
                matrix.postScale(1.0f, -1.0f, i / 2.0f, i2 / 2.0f);
                return;
            case 5:
                matrix.postScale(-1.0f, 1.0f, i / 2.0f, i2 / 2.0f);
                matrix.postRotate(270.0f);
                return;
            case 6:
                matrix.postRotate(90.0f);
                return;
            case 7:
                matrix.postScale(-1.0f, 1.0f, i, i2 / 2.0f);
                matrix.postRotate(90.0f);
                return;
            case 8:
                matrix.postRotate(270.0f);
                return;
            default:
                return;
        }
    }

    public static String m16648c1(int i) {
        String upperCase = Integer.toHexString(i).toUpperCase();
        if (upperCase.length() != 1) {
            return upperCase;
        }
        return "0" + upperCase;
    }

    public static File m16647c2(File file, String str) {
        String v0 = m16573v0(str);
        if (C5070i.m24061i(v0)) {
            return m16643d2(file, str, null);
        }
        return m16643d2(file, str.substring(0, (str.length() - v0.length()) - 1), v0);
    }

    public static int m16645d0(int i) {
        switch (i) {
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

    public static boolean m16644d1() {
        return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(C1379j0.m37309q().getContentResolver(), "airplane_mode_on", 0) != 0 : Settings.System.getInt(C1379j0.m37309q().getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static File m16643d2(File file, String str, String str2) {
        File file2;
        int i = 0;
        do {
            StringBuilder sb2 = new StringBuilder(str);
            if (i != 0) {
                sb2.append(" (");
                sb2.append(i);
                sb2.append(")");
            }
            if (!C5070i.m24061i(str2)) {
                sb2.append(".");
                sb2.append(str2);
            }
            file2 = new File(file, sb2.toString());
            i++;
        } while (file2.exists());
        return file2;
    }

    public static String m16641e0(float f, boolean z) {
        int i = (int) f;
        if (f == i) {
            return String.valueOf(i);
        }
        return z ? String.valueOf(f) : String.format(Locale.US, "%.2f", Float.valueOf(f));
    }

    public static boolean m16640e1(InputStream inputStream) {
        int read;
        StringBuilder sb2 = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            sb2.append((char) inputStream.read());
        }
        String sb3 = sb2.toString();
        if (sb3.startsWith("GIF")) {
            m16579t2(inputStream);
            m16579t2(inputStream);
            int read2 = inputStream.read();
            boolean z = (read2 & Log.TAG_YOUTUBE) != 0;
            int i2 = 2 << (read2 & 7);
            inputStream.read();
            inputStream.read();
            if (z) {
                int i3 = i2 * 3;
                while (i3 > 0) {
                    long j = i3;
                    long skip = inputStream.skip(j);
                    if (skip <= 0) {
                        break;
                    }
                    i3 = (int) (j - skip);
                }
                if (i3 != 0) {
                    throw new IllegalArgumentException();
                }
            }
            while (inputStream.read() == 33 && (read = inputStream.read()) != 249) {
                if (read == 255) {
                    return true;
                }
                m16707M2(inputStream);
            }
            return false;
        }
        throw new IllegalArgumentException("Unknown file id: " + sb3);
    }

    public static C6660o1 m16639e2(Uri uri) {
        return new C6660o1.C6663c().m19633e(uri).m19637a();
    }

    public static void m16637f0() {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                System.gc();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean m16636f1() {
        Boolean bool = f23324a;
        if (bool == null) {
            bool = Boolean.valueOf(m16632g1());
            f23324a = bool;
        }
        return bool.booleanValue();
    }

    public static AbstractC7230t m16635f2(int i, int i2) {
        return new C7187g0.C7189b(new C10634e9.C10635a()).m17423b(m16639e2(C10634e9.C10637c.m4406a(i, i2)));
    }

    public static File m16633g0(String str, int i) {
        return m16625i0(false, str, i);
    }

    public static boolean m16632g1() {
        try {
            String installerPackageName = C1379j0.m37315n().getPackageManager().getInstallerPackageName(C1379j0.m37315n().getPackageName());
            if (C5070i.m24061i(installerPackageName)) {
                return true;
            }
            Log.m14714v("Installer package: %s", installerPackageName);
            return !"com.android.vending".equals(installerPackageName);
        } catch (Throwable th) {
            Log.m14715v("Unable to determine installer package", th, new Object[0]);
            return false;
        }
    }

    public static AbstractC7230t m16631g2(int i, TdApi.File file) {
        if (file == null) {
            throw new IllegalArgumentException();
        } else if (file.f25373id != -1 || C5070i.m24061i(file.local.path)) {
            return new C7187g0.C7189b(new C10634e9.C10635a()).m17423b(m16639e2(C10634e9.C10637c.m4404c(i, file)));
        } else {
            return m16623i2(new File(file.local.path));
        }
    }

    public static File m16629h0(boolean z, String str) {
        return m16643d2(m16605n0(z), m16561y0(), str);
    }

    public static boolean m16628h1(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static AbstractC7230t m16627h2(int i, TdApi.Message message) {
        return m16631g2(i, C4779t2.m25494j1(message));
    }

    public static File m16625i0(boolean z, String str, int i) {
        if (i == 0) {
            return m16617k0();
        }
        try {
            File n0 = m16605n0(z);
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
            String v0 = m16573v0(str);
            if (v0 == null) {
                v0 = i == 2 ? "gif" : "mp4";
            }
            return new File(n0, "VID_" + format + "." + v0);
        } catch (Throwable th) {
            Log.m14710w("Cannot generate picture path", th, new Object[0]);
            return null;
        }
    }

    public static boolean m16624i1(int i) {
        return i == 5 || i == 6 || i == 7 || i == 8;
    }

    public static AbstractC7230t m16623i2(File file) {
        return new C7187g0.C7189b(new C0176x.C0178b()).m17423b(m16639e2(Uri.fromFile(file)));
    }

    public static File m16621j0(boolean z, boolean z2) {
        return z2 ? m16609m0(z) : m16613l0(z);
    }

    public static boolean m16620j1() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static String m16619j2(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        while (true) {
            String readlink = C7888N.readlink(str);
            if (C5070i.m24061i(readlink) || readlink.equals(str)) {
                try {
                    String canonicalPath = new File(str).getCanonicalPath();
                    return !C5070i.m24061i(canonicalPath) ? canonicalPath : str;
                } catch (Exception unused) {
                    return str.replace("/./", "/");
                }
            } else {
                str = readlink;
            }
        }
    }

    public static File m16617k0() {
        return m16613l0(false);
    }

    public static boolean m16616k1(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static void m16615k2(RecyclerView.AbstractC0890h<?> hVar, int i) {
        int D = hVar.mo6153D();
        if (i == D) {
            if (i != 0) {
                hVar.m39309L(0, D);
            }
        } else if (i == 0) {
            hVar.m39308M(0, D);
        } else if (D == 0) {
            hVar.m39307N(0, i);
        } else {
            hVar.m39307N(0, i);
            hVar.m39307N(0, D);
        }
    }

    public static File m16613l0(boolean z) {
        return m16629h0(z, "jpg");
    }

    public static boolean m16612l1(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return C5220d.m23604p().mo23585i(context) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void m16611l2(RecyclerView.AbstractC0890h<?> hVar, int i, int i2) {
        int D = hVar.mo6153D();
        int max = Math.max(0, D - i2);
        if (i == D) {
            if (i != 0) {
                hVar.m39309L(i2, max);
            }
        } else if (i == 0) {
            hVar.m39308M(0, D);
        } else if (D == 0) {
            hVar.m39307N(0, i);
        } else {
            hVar.m39307N(Math.min(i2, max), i);
            hVar.m39308M(i2, max);
        }
    }

    public static void m16610m(File file) {
        if (file != null) {
            m16735F2(file);
        }
    }

    public static File m16609m0(boolean z) {
        return m16629h0(z, "mp4");
    }

    public static boolean m16608m1(int i, KeyEvent keyEvent) {
        return i != 0 ? i == 6 : keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    public static void m16607m2(AbstractC10664f9 f9Var, String str, File file, String str2, int i) {
        String v0 = m16573v0(file.getPath());
        if (C5070i.m24061i(str2)) {
            str2 = m16755A2(file.getPath(), v0);
        }
        if ((!C5070i.m24061i(v0) && C1369e0.m37395d(v0)) || (!C5070i.m24061i(str2) && C1369e0.m37394e(str2))) {
            k30 k30Var = new k30(f9Var.mo4347s(), f9Var.mo4348c());
            k30Var.m9476Ad(k30.C2608a.m34035f(str, file.getPath(), str2).m34033h(i));
            C1379j0.m37345W(k30Var);
        } else if (!C1405v.m37103r(file, str2)) {
            String z2 = m16555z2(file.getPath());
            if (C5070i.m24061i(z2) || C5070i.m24067c(str2, z2)) {
                C1379j0.m37292y0(R.string.NoAppToOpen, 0);
            } else {
                m16607m2(f9Var, str, file, z2, i);
            }
        }
    }

    public static void m16606n(String str) {
        if (str != null) {
            m16610m(new File(str));
        }
    }

    public static File m16605n0(boolean z) {
        File file;
        if (!z) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram X");
                if (!z || file == null) {
                    file = new File(m16601o0(!z), "media");
                }
                if (!file.mkdirs() && !file.exists()) {
                    Log.m14709w("Failed to create album directory", new Object[0]);
                }
                return file;
            }
            Log.m14709w("External storage is not mounted READ/WRITE.", new Object[0]);
        }
        file = null;
        if (!z) {
        }
        file = new File(m16601o0(!z), "media");
        if (!file.mkdirs()) {
            Log.m14709w("Failed to create album directory", new Object[0]);
        }
        return file;
    }

    public static boolean m16604n1(float f, float f2, float f3, float f4, float f5) {
        return Math.pow((double) (f - f3), 2.0d) + Math.pow((double) (f2 - f4), 2.0d) < ((double) (f5 * f5));
    }

    public static void m16603n2(AbstractC10664f9 f9Var, TdApi.Video video) {
        m16607m2(f9Var, C5070i.m24061i(video.fileName) ? "video/mp4".equals(video.mimeType) ? "video.mp4" : "video/quicktime".equals(video.mimeType) ? "video.mov" : "" : video.fileName, new File(video.video.local.path), video.mimeType, 0);
    }

    public static void m16602o(CountDownLatch countDownLatch) {
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable th) {
                Log.m14718i(th);
                throw new RuntimeException(th);
            }
        }
    }

    public static File m16601o0(boolean z) {
        File file = null;
        if (z) {
            file = C1379j0.m37309q().getExternalFilesDir(null);
        }
        return file != null ? file : C1379j0.m37309q().getFilesDir();
    }

    public static boolean m16600o1(float f, float f2, float f3, float f4, float f5) {
        return f3 >= f - f5 && f3 <= f + f5 && f4 >= f2 - f5 && f4 <= f2 + f5;
    }

    public static InputStream m16599o2(String str) {
        if (!str.startsWith("content://")) {
            return new FileInputStream(str);
        }
        InputStream openInputStream = C1379j0.m37309q().getContentResolver().openInputStream(Uri.parse(str));
        if (openInputStream != null) {
            return openInputStream;
        }
        throw new IllegalArgumentException("getContentResolver().openInputStream() failed for path: " + str);
    }

    public static boolean m16598p(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        if (countDownLatch == null) {
            return false;
        }
        try {
            return countDownLatch.await(j, timeUnit);
        } catch (Throwable th) {
            Log.m14718i(th);
            throw new RuntimeException(th);
        }
    }

    public static long m16597p0() {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong();
            j2 = statFs.getAvailableBlocksLong();
        } else {
            j = statFs.getBlockSize();
            j2 = statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    public static boolean m16596p1(Uri uri) {
        String j2 = m16619j2(uri.getPath());
        return !C5070i.m24061i(j2) && j2.startsWith(C1379j0.m37315n().getFilesDir().getPath());
    }

    public static MediaMetadataRetriever m16595p2(String str) {
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
                mediaMetadataRetriever.setDataSource(C1379j0.m37309q(), Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            return mediaMetadataRetriever;
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            m16730H(mediaMetadataRetriever2);
            throw th;
        }
    }

    public static String m16594q(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb2.append((CharSequence) Integer.toHexString((b & 255) | Log.TAG_CRASH), 1, 3);
        }
        return sb2.toString();
    }

    public static String m16593q0(Context context, Uri uri, String str, String[] strArr) {
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
            Log.m14710w("Cannot get data column", th, new Object[0]);
            return null;
        }
    }

    public static boolean m16592q1(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1204607085:
                if (str.equals("localhost")) {
                    c = 0;
                    break;
                }
                break;
            case 57585:
                if (str.equals("::1")) {
                    c = 1;
                    break;
                }
                break;
            case 1505998205:
                if (str.equals("127.0.0.1")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static int m16591q2(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            i2--;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (bArr[i] & 255) | (i4 << 8);
            i += i3;
        }
    }

    public static boolean m16590r(Bitmap bitmap, int i, int i2) {
        return m16756A1(bitmap) && C7888N.blurBitmap(bitmap, i, i2, 0) == 0;
    }

    public static Locale m16589r0(String str) {
        if ("zz".equals(str)) {
            return C1379j0.m37372B().getConfiguration().locale;
        }
        return m16718K(str);
    }

    public static boolean m16588r1(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static float[] m16587r2(int i, boolean z) {
        if (i < 1 || i > 3) {
            C6815f<float[]> fVar = f23329f;
            if (fVar == null) {
                synchronized (C7389v0.class) {
                    if (f23329f == null) {
                        f23329f = new C6815f<>();
                    }
                    fVar = f23329f;
                }
            }
            float[] a = fVar.m18901a();
            if ((a != null && a.length >= i) || !z) {
                return a;
            }
            float[] fArr = new float[Math.max(i, 100)];
            fVar.m18900b(fArr);
            return fArr;
        }
        C6815f<float[]> fVar2 = f23328e;
        if (fVar2 == null) {
            synchronized (C7389v0.class) {
                if (f23328e == null) {
                    f23328e = new C6815f<>();
                }
                fVar2 = f23328e;
            }
        }
        float[] a2 = fVar2.m18901a();
        if (a2 != null || !z) {
            return a2;
        }
        float[] fArr2 = new float[3];
        fVar2.m18900b(fArr2);
        return fArr2;
    }

    public static String m16586s(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        if (bArr.length > 16) {
            String t = m16582t(bArr);
            for (int i = 0; i < 32; i++) {
                if (i != 0) {
                    if (i % 8 == 0) {
                        sb2.append('\n');
                    } else if (i % 4 == 0) {
                        sb2.append(' ');
                    }
                }
                int i2 = i * 2;
                sb2.append(t.substring(i2, i2 + 2));
                sb2.append(' ');
            }
            sb2.append("\n");
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = (i3 * 4) + 16;
                byte b = bArr[i4];
                byte b2 = bArr[i4 + 1];
                byte b3 = bArr[i4 + 2];
                byte b4 = bArr[i4 + 3];
            }
        }
        return sb2.toString();
    }

    public static String m16585s0(int i) {
        if (Build.VERSION.SDK_INT >= 14) {
            return GLUtils.getEGLErrorString(i);
        }
        switch (i) {
            case 12288:
                return "EGL_SUCCESS";
            case 12289:
                return "EGL_NOT_INITIALIZED";
            case 12290:
                return "EGL_BAD_ACCESS";
            case 12291:
                return "EGL_BAD_ALLOC";
            case 12292:
                return "EGL_BAD_ATTRIBUTE";
            case 12293:
                return "EGL_BAD_CONFIG";
            case 12294:
                return "EGL_BAD_CONTEXT";
            case 12295:
                return "EGL_BAD_CURRENT_SURFACE";
            case 12296:
                return "EGL_BAD_DISPLAY";
            case 12297:
                return "EGL_BAD_MATCH";
            case 12298:
                return "EGL_BAD_NATIVE_PIXMAP";
            case 12299:
                return "EGL_BAD_NATIVE_WINDOW";
            case 12300:
                return "EGL_BAD_PARAMETER";
            case 12301:
                return "EGL_BAD_SURFACE";
            case 12302:
                return "EGL_CONTEXT_LOST";
            default:
                return "0x" + Integer.toHexString(i);
        }
    }

    public static boolean m16584s1(File file) {
        return m16580t1(file.getPath());
    }

    public static void m16583s2(File file, int i) {
        try {
            C5828a aVar = new C5828a(file);
            aVar.m22032b0("Orientation", String.valueOf(i));
            aVar.m22039W();
        } catch (Throwable th) {
            Log.m14725e("Unable to update exif orientation for path: %s", th, file.getPath());
        }
    }

    public static String m16582t(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f23327d;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static int m16581t0(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: nc.C7389v0.m16581t0(java.lang.String):int");
    }

    public static boolean m16580t1(String str) {
        return str.startsWith(m16605n0(true).getPath());
    }

    public static int m16579t2(InputStream inputStream) {
        return (inputStream.read() << 8) | inputStream.read();
    }

    public static long m16578u(long j, long j2) {
        return m16574v((int) (j * 3.141592653589793d), j2);
    }

    public static int m16577u0(byte[] bArr, int[] iArr) {
        int i;
        int q2;
        int i2;
        if (bArr == null) {
            return 0;
        }
        int i3 = 0;
        while (i3 + 3 < bArr.length) {
            int i4 = i3 + 1;
            if ((bArr[i3] & 255) == 255) {
                boolean z = bArr[i4] & 255;
                if (z != 255) {
                    i4++;
                    if (!(z == 216 || z == 1)) {
                        if (z != 217 && z != 218) {
                            int q22 = m16591q2(bArr, i4, 2, false);
                            if (q22 >= 2 && (i2 = i4 + q22) <= bArr.length) {
                                if (z == 225 && q22 >= 8 && m16591q2(bArr, i4 + 2, 4, false) == 1165519206 && m16591q2(bArr, i4 + 6, 2, false) == 0) {
                                    i3 = i4 + 8;
                                    i = q22 - 8;
                                    break;
                                }
                                i3 = i2;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
                i3 = i4;
            }
            i3 = i4;
        }
        i = 0;
        if (i <= 8 || ((q2 = m16591q2(bArr, i3, 4, false)) != 1229531648 && q2 != 1296891946)) {
            return 0;
        }
        boolean z2 = q2 == 1229531648;
        int q23 = m16591q2(bArr, i3 + 4, 4, z2) + 2;
        if (q23 >= 10 && q23 <= i) {
            int i5 = i3 + q23;
            int i6 = i - q23;
            int q24 = m16591q2(bArr, i5 - 2, 2, z2);
            while (true) {
                q24--;
                if (q24 <= 0 || i6 < 12) {
                    break;
                } else if (m16591q2(bArr, i5, 2, z2) == 274) {
                    if (iArr != null) {
                        iArr[0] = i5 + 8;
                        iArr[1] = 2;
                        int i7 = z2 ? 1 : 0;
                        char c = z2 ? 1 : 0;
                        iArr[2] = i7;
                    }
                    return m16591q2(bArr, i5 + 8, 2, z2);
                } else {
                    i5 += 12;
                    i6 -= 12;
                }
            }
        }
        return 0;
    }

    public static boolean m16576u1(C6591e2 e2Var) {
        return (e2Var instanceof C6681q) && ((C6681q) e2Var).f20908M == 1;
    }

    public static void m16575u2(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static long m16574v(int i, long j) {
        long ceil = j <= 0 ? 10L : (long) Math.ceil(j / i);
        if (ceil <= 10) {
            ceil = (long) Math.ceil(ceil * C1357a0.m37542h());
        }
        return Math.max(ValueAnimator.getFrameDelay(), ceil);
    }

    public static String m16573v0(String str) {
        String x0 = m16565x0(str);
        int lastIndexOf = x0.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        String substring = x0.substring(lastIndexOf + 1);
        return substring.toLowerCase().equals("crdownload") ? m16573v0(x0.substring(0, lastIndexOf)) : substring;
    }

    public static boolean m16572v1() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C1379j0.m37315n().getSystemService("connectivity");
            if (Build.VERSION.SDK_INT >= 28) {
                return !connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasCapability(18);
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isRoaming();
        } catch (Throwable th) {
            Log.m14725e("Unable to detect roaming", th, new Object[0]);
            return false;
        }
    }

    public static void m16571v2(Canvas canvas) {
        if (canvas != null) {
            try {
                canvas.setBitmap(null);
            } catch (Throwable unused) {
            }
        }
    }

    public static int m16570w(long j) {
        return (int) Math.round(j / 1000.0d);
    }

    public static ArrayList<String> m16569w0(String str, boolean z) {
        File[] externalFilesDirs;
        ArrayList<String> arrayList = null;
        int i = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : C1379j0.m37315n().getExternalFilesDirs(null)) {
                String str2 = file.getPath().split("/Android")[0];
                String a = C10330d.m5411a(file);
                if (("mounted".equals(a) || "mounted_ro".equals(a)) && !C5070i.m24067c(str, str2)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(str2);
                }
            }
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
                    if (!C5070i.m24067c(str, str4)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(str4);
                    }
                }
            }
        }
        if (z && arrayList != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                while (i < arrayList.size()) {
                    if (!arrayList.get(i).toLowerCase().matches(".*[0-9a-f]{4}[-][0-9a-f]{4}")) {
                        i--;
                        arrayList.remove(i);
                    }
                    i++;
                }
            } else {
                while (i < arrayList.size()) {
                    if (!arrayList.get(i).toLowerCase().contains("ext") && !arrayList.get(i).toLowerCase().contains("sdcard")) {
                        i--;
                        arrayList.remove(i);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static boolean m16568w1(float f) {
        return C5069h.m24082k(f, 180.0f) == 90.0f;
    }

    public static void m16567w2(RecyclerView.AbstractC0890h<?> hVar, int i) {
        int D = hVar.mo6153D();
        if (i == D) {
            if (i != 0) {
                hVar.m39309L(0, D);
            }
        } else if (i == 0) {
            hVar.m39308M(0, D);
        } else if (D == 0) {
            hVar.m39307N(0, i);
        } else if (D > i) {
            hVar.m39308M(i, D - i);
            hVar.m39309L(0, i);
        } else {
            hVar.m39307N(D, i - D);
            hVar.m39309L(0, D);
        }
    }

    public static int m16566x(CharSequence charSequence, int i, float f) {
        SoftReference<TextView> softReference = f23325b;
        TextView textView = softReference != null ? softReference.get() : null;
        if (textView == null) {
            textView = new C6847b2(C1379j0.m37366E());
            textView.setTypeface(C1389o.m37258k());
            textView.setPadding(0, 0, 0, 0);
        }
        textView.setText(charSequence);
        textView.setTextSize(1, f);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    public static String m16565x0(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : str;
    }

    public static boolean m16564x1(int i) {
        return C5069h.m24081l(i, 180) == 90;
    }

    public static void m16563x2(String[] strArr, final AbstractC5917i iVar) {
        AbstractView$OnTouchListenerC7889a E;
        if (Build.VERSION.SDK_INT >= 23 && (E = C1379j0.m37366E()) != null) {
            E.m14575J2(strArr, new AbstractC5096a() {
                @Override
                public final void mo4252o1(int i, boolean z) {
                    C7389v0.m16736F1(AbstractC5917i.this, i, z);
                }
            });
        }
    }

    public static int m16562y(CharSequence charSequence, int i, float f, HashMap<CharSequence, int[]> hashMap) {
        if (i <= 0) {
            return 0;
        }
        int[] iArr = hashMap != null ? hashMap.get(charSequence) : null;
        if (iArr == null || iArr[0] != i) {
            if (iArr == null) {
                iArr = new int[2];
                if (hashMap != null) {
                    hashMap.put(charSequence, iArr);
                }
            }
            iArr[0] = i;
            iArr[1] = m16566x(charSequence, i, f);
        }
        return iArr[1];
    }

    public static String m16561y0() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
    }

    public static boolean m16560y1(String str) {
        if (C5070i.m24061i(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("screencapture") || lowerCase.contains("screenshot") || lowerCase.contains("экран");
    }

    public static boolean m16559y2(final Runnable runnable, String... strArr) {
        if (strArr == null || strArr.length == 0 || Build.VERSION.SDK_INT < 23 || !m16662Y1(strArr)) {
            return false;
        }
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
        if (E == null) {
            return true;
        }
        E.m14575J2(strArr, new AbstractC5096a() {
            @Override
            public final void mo4252o1(int i, boolean z) {
                C7389v0.m16732G1(runnable, i, z);
            }
        });
        return true;
    }

    public static boolean m16558z() {
        return Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageLegacy() || Environment.isExternalStorageManager();
    }

    public static long m16557z0(StatFs statFs) {
        long blockSize;
        long availableBlocks;
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return blockSize * availableBlocks;
    }

    public static boolean m16556z1(C6591e2 e2Var) {
        return (e2Var instanceof C6681q) && ((C6681q) e2Var).f20908M == 0 && (e2Var.getCause() instanceof C7235u0);
    }

    public static String m16555z2(String str) {
        return m16755A2(str, m16573v0(str));
    }
}
