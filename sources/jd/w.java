package jd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PostProcessor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import ce.c0;
import ce.j0;
import gd.l;
import gd.m;
import gd.w;
import hc.g;
import hc.o;
import hc.y;
import hd.t2;
import ib.h;
import ib.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jd.e0;
import ld.k;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ub.b0;
import ub.d0;
import ub.e0;
import ub.f;
import ub.z;
import zd.o6;

public final class w {
    public static final int f15297i;
    public final o6 f15298a;
    public m f15299b;
    public m f15300c;
    public e0 f15301d;
    public z f15303f;
    public ThreadPoolExecutor f15305h;
    public final HashMap<Long, jd.b> f15302e = new HashMap<>();
    public final HashMap<Long, ub.e> f15304g = new HashMap<>();

    public class a implements f {
        public final long f15306a;
        public final String f15307b;
        public final String f15308c;
        public final boolean f15309d;

        public a(long j10, String str, String str2, boolean z10) {
            this.f15306a = j10;
            this.f15307b = str;
            this.f15308c = str2;
            this.f15309d = z10;
        }

        @Override
        public void a(ub.e eVar, IOException iOException) {
            if (!eVar.m() && !w.this.z0(this.f15306a, this.f15307b, this.f15308c, this.f15309d)) {
                Log.i(32, "Failed to load http file: %s", iOException, this.f15307b);
                w wVar = w.this;
                long j10 = this.f15306a;
                wVar.N(j10, new TdApi.Error(-1, "HTTP Error: " + Log.toString(iOException)));
            }
        }

        @Override
        public void b(ub.e eVar, d0 d0Var) {
            g s10;
            y d10;
            hc.f a10;
            if (d0Var.G0()) {
                e0 m10 = d0Var.m();
                if (m10 == null) {
                    if (!w.this.z0(this.f15306a, this.f15307b, this.f15308c, this.f15309d)) {
                        w.this.N(this.f15306a, new TdApi.Error(-2, "HTTP responseBody is null"));
                    }
                } else if (this.f15309d) {
                    w.this.N(this.f15306a, new TdApi.Error(-3, "Preprocessing failed"));
                } else {
                    File file = new File(this.f15308c);
                    long j10 = 0;
                    boolean z10 = true;
                    try {
                        s10 = m10.s();
                        d10 = o.d(file);
                        a10 = o.a(d10);
                    } catch (IOException e10) {
                        Log.e(32, "Couldn't load HTTP file, url:%s", e10, this.f15307b);
                    }
                    try {
                        long m11 = m10.m();
                        while (true) {
                            long A = s10.A(a10.a(), 2048L);
                            if (A == -1) {
                                break;
                            }
                            j10 += A;
                            w.this.f15298a.v4().o(new TdApi.SetFileGenerationProgress(this.f15306a, (int) m11, (int) j10), w.this.f15298a.yc());
                        }
                        a10.close();
                        if (d10 != null) {
                            d10.close();
                        }
                        s10.close();
                        z10 = false;
                        if (!z10 || !w.this.z0(this.f15306a, this.f15307b, this.f15308c, this.f15309d)) {
                            w.this.N(this.f15306a, z10 ? new TdApi.Error() : null);
                        }
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
            } else if (!w.this.z0(this.f15306a, this.f15307b, this.f15308c, this.f15309d)) {
                w wVar = w.this;
                long j11 = this.f15306a;
                wVar.N(j11, new TdApi.Error(-2, "HTTP status code: " + d0Var.A0()));
            }
        }
    }

    public class b implements ImageDecoder.OnHeaderDecodedListener {
        public final jd.c f15311a;
        public final int f15312b;
        public final boolean f15313c;

        public class a implements PostProcessor {
            public final boolean f15315a;
            public final sd.f f15316b;
            public final int f15317c;
            public final int f15318d;

            public a(boolean z10, sd.f fVar, int i10, int i11) {
                this.f15315a = z10;
                this.f15316b = fVar;
                this.f15317c = i10;
                this.f15318d = i11;
            }

            @Override
            public int onPostProcess(Canvas canvas) {
                if (this.f15315a) {
                    canvas.drawColor(-1, PorterDuff.Mode.DST_OVER);
                }
                sd.f fVar = this.f15316b;
                if (fVar == null) {
                    return 0;
                }
                fVar.g(canvas, 0, 0, this.f15317c, this.f15318d);
                return 0;
            }
        }

        public b(jd.c cVar, int i10, boolean z10) {
            this.f15311a = cVar;
            this.f15312b = i10;
            this.f15313c = z10;
        }

        @Override
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            int width = imageInfo.getSize().getWidth();
            int height = imageInfo.getSize().getHeight();
            imageDecoder.setAllocator(1);
            if (!this.f15311a.r()) {
                int i10 = this.f15312b;
                imageDecoder.setTargetSampleSize(org.thunderdog.challegram.loader.b.a(width, height, i10, i10));
                imageDecoder.setUnpremultipliedRequired(true);
            }
            sd.f n10 = this.f15311a.n();
            boolean z10 = this.f15313c && !this.f15311a.l();
            if (n10 != null || z10) {
                imageDecoder.setPostProcessor(new a(z10, n10, width, height));
            }
        }
    }

    public class c implements ImageDecoder.OnHeaderDecodedListener {
        public c() {
        }

        @Override
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            float width = imageInfo.getSize().getWidth();
            float height = imageInfo.getSize().getHeight();
            float min = Math.min(90.0f / width, 90.0f / height);
            if (min < 1.0f) {
                imageDecoder.setTargetSize((int) (width * min), (int) (height * min));
            }
        }
    }

    public interface d {
        String a(String str, String str2);
    }

    public static class e extends m {
        public final w M;

        public e(w wVar) {
            super("FileGenQueue");
            this.M = wVar;
        }

        @Override
        public void f(Message message) {
            this.M.v0(message);
        }
    }

    static {
        f15297i = fd.b.f11906c ? 92 : 89;
    }

    public w(o6 o6Var) {
        this.f15298a = o6Var;
    }

    public static Bitmap A0(Bitmap bitmap, int i10) {
        if (h.l(i10, 360) == 0 || !v0.A1(bitmap)) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public static Bitmap D(Bitmap bitmap) {
        Bitmap bitmap2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == height) {
            return bitmap;
        }
        if (width >= height) {
            bitmap2 = Bitmap.createBitmap(bitmap, (width / 2) - (height / 2), 0, height, height);
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, (height / 2) - (width / 2), width, width);
        }
        bitmap.recycle();
        return bitmap2;
    }

    public static String X(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"maps.googleapis.com".equals(parse.getHost())) {
                return null;
            }
            if (i.i(parse.getQueryParameter("key"))) {
                return str;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int a0(Map.Entry entry, Map.Entry entry2) {
        return ((String) ((List) entry.getValue()).get(0)).compareToIgnoreCase((String) ((List) entry2.getValue()).get(0));
    }

    public void b0(java.lang.String r13, long r14, java.lang.String r16, int r17, java.lang.String r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.b0(java.lang.String, long, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    public void c0(java.lang.String r13, long r14, java.lang.String r16, java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.c0(java.lang.String, long, java.lang.String, java.lang.String):void");
    }

    public static String d0(int i10, String str, String str2) {
        if (str2 == null) {
            return x.m(0, null, i10);
        }
        if (str2.startsWith("photo")) {
            return jd.c.k(str2, i10);
        }
        return null;
    }

    public static String e0(int i10, String str, String str2) {
        if (str2 == null || str2.startsWith("video")) {
            return x.m(1, str2, i10);
        }
        return null;
    }

    public static String f0(int i10, String str, String str2) {
        String z22 = v0.z2(str);
        if (!i.i(z22)) {
            if (z22.startsWith("video/") && (str2 == null || str2.startsWith("video"))) {
                return x.m(1, str2, i10);
            }
            if (z22.startsWith("image/")) {
                if (str2 == null) {
                    return jd.c.t(0, 0L, true, i10);
                }
                if (str2.startsWith("photo")) {
                    return jd.c.k(str2, i10);
                }
            }
            if (z22.startsWith("audio/") && str2 == null) {
                return x.m(2, null, i10);
            }
            z22.startsWith("application/pdf");
        }
        return null;
    }

    public static String i0(int i10, String str, String str2) {
        return str2 != null ? jd.c.k(str2, i10) : jd.c.t(0, 0L, true, i10);
    }

    public void j0(long j10, String str, String str2, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.f15298a.v4().o(new TdApi.FinishFileGeneration(j10, (TdApi.Error) object), this.f15298a.yc());
        } else if (constructor == 1172082922) {
            G(j10, str, ((TdApi.LanguagePackStrings) object).strings, str2);
        }
    }

    public static int k0(TdApi.LanguagePackString languagePackString, TdApi.LanguagePackString languagePackString2) {
        int d10 = w.b.d(languagePackString);
        int d11 = w.b.d(languagePackString2);
        if (d10 != d11) {
            return Integer.compare(d10, d11);
        }
        return languagePackString.key.compareTo(languagePackString2.key);
    }

    public void l0(org.drinkless.td.libcore.telegram.TdApi.LanguagePackString[] r18, java.lang.String r19, java.lang.String r20, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.l0(org.drinkless.td.libcore.telegram.TdApi$LanguagePackString[], java.lang.String, java.lang.String, long):void");
    }

    public void m0(java.lang.String r19, int r20, int r21, java.lang.String r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.m0(java.lang.String, int, int, java.lang.String, long):void");
    }

    public void n0(java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.n0(java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public static void p0(String str) {
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            Log.e("Cannot delete target file, but we don't need it now. Bad things may happen in future", new Object[0]);
        }
    }

    public static void q0(ld.k r5, android.graphics.Bitmap r6) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.q0(ld.k, android.graphics.Bitmap):void");
    }

    public static TdApi.InputThumbnail s0(TdApi.InputFile inputFile, int i10, int i11, int i12) {
        if (inputFile == null) {
            return null;
        }
        if (Math.max(i11, i12) > i10) {
            if (i11 != 0) {
                if (i12 != 0) {
                    float f10 = i10;
                    float f11 = i11;
                    float f12 = i12;
                    float min = Math.min(f10 / f11, f10 / f12);
                    i11 = (int) (f11 * min);
                    i10 = (int) (f12 * min);
                }
                return new TdApi.InputThumbnail(inputFile, i10, i12);
            }
            i12 = i10;
        }
        i10 = i11;
        return new TdApi.InputThumbnail(inputFile, i10, i12);
    }

    public static TdApi.InputFileGenerated t0(TdApi.InputFile inputFile, TdApi.File file, d dVar) {
        TdApi.RemoteFile remoteFile;
        try {
            try {
                switch (inputFile.getConstructor()) {
                    case TdApi.InputFileGenerated.CONSTRUCTOR:
                        TdApi.InputFileGenerated inputFileGenerated = (TdApi.InputFileGenerated) inputFile;
                        String str = inputFileGenerated.originalPath;
                        try {
                            String a10 = !i.i(inputFileGenerated.conversion) ? dVar.a(str, inputFileGenerated.conversion) : null;
                            file = str;
                            inputFile = a10;
                        } catch (Throwable unused) {
                            file = str;
                            Log.w("unable to create thumbnail conversion: %s", new Object[]{inputFile});
                            inputFile = 0;
                            if (!i.i(file)) {
                                break;
                            }
                            return null;
                        }
                    case TdApi.InputFileRemote.CONSTRUCTOR:
                        if (file != 0 && (remoteFile = file.remote) != null && i.c(((TdApi.InputFileRemote) inputFile).f19932id, remoteFile.f19958id) && t2.T2(file)) {
                            String str2 = file.local.path;
                            inputFile = dVar.a(str2, null);
                            file = str2;
                            break;
                        }
                        inputFile = 0;
                        file = 0;
                        break;
                    case TdApi.InputFileId.CONSTRUCTOR:
                        if (file != 0 && ((TdApi.InputFileId) inputFile).f19931id == file.f19913id && t2.T2(file)) {
                            String str3 = file.local.path;
                            inputFile = dVar.a(str3, null);
                            file = str3;
                            break;
                        }
                        inputFile = 0;
                        file = 0;
                        break;
                    case TdApi.InputFileLocal.CONSTRUCTOR:
                        String str4 = ((TdApi.InputFileLocal) inputFile).path;
                        inputFile = dVar.a(str4, null);
                        file = str4;
                        break;
                    default:
                        inputFile = 0;
                        file = 0;
                        break;
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            file = null;
        }
        if (!i.i(file) || i.i(inputFile)) {
            return null;
        }
        return new TdApi.InputFileGenerated(file, inputFile, 0);
    }

    public static Bitmap u0(Bitmap bitmap, int i10) {
        Matrix b02 = v0.b0(bitmap.getWidth(), bitmap.getHeight(), i10);
        if (b02 == null) {
            return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), b02, true);
            bitmap.recycle();
            return createBitmap;
        } catch (Throwable unused) {
            Log.e(32, "Cannot orient bitmap: %d, size: %dx%d", Integer.valueOf(i10), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            return bitmap;
        }
    }

    public static void v(StringBuilder sb2, Map<?, List<String>> map) {
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        for (Map.Entry entry : arrayList) {
            Collections.sort((List) entry.getValue(), u.f15295a);
        }
        Collections.sort(arrayList, v.f15296a);
        for (Map.Entry entry2 : arrayList) {
            boolean z10 = true;
            for (String str : (List) entry2.getValue()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(str);
            }
            sb2.append(": ");
            Object key = entry2.getKey();
            sb2.append(key instanceof Integer ? c0.C(((Integer) key).intValue(), true) : key instanceof Float ? v0.e0(((Float) key).floatValue(), true) : (String) key);
            sb2.append("\n");
        }
    }

    public final void A(final String str, final String str2, final long j10, final String str3) {
        if (Thread.currentThread() != w0()) {
            w0().h(Message.obtain(w0().d(), 7, ib.c.m(j10), ib.c.n(j10), new Object[]{str, str2, str3}), 0L);
        } else {
            W().execute(new Runnable() {
                @Override
                public final void run() {
                    w.this.c0(str, j10, str3, str2);
                }
            });
        }
    }

    public <T extends TdApi.InputMessageContent> T B(T t10, boolean z10) {
        return (T) C(t10, z10, null);
    }

    public void B0(final k kVar, final Bitmap bitmap) {
        if (kVar != null) {
            ld.g.k().b(kVar, bitmap);
            org.thunderdog.challegram.loader.b.k().l(new Runnable() {
                @Override
                public final void run() {
                    w.q0(k.this, bitmap);
                }
            });
        }
    }

    public <T extends org.drinkless.td.libcore.telegram.TdApi.InputMessageContent> T C(T r8, boolean r9, org.drinkless.td.libcore.telegram.TdApi.File r10) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.C(org.drinkless.td.libcore.telegram.TdApi$InputMessageContent, boolean, org.drinkless.td.libcore.telegram.TdApi$File):org.drinkless.td.libcore.telegram.TdApi$InputMessageContent");
    }

    public final void C0(long j10, String str, String str2, String str3) {
        jd.b bVar;
        m mVar;
        String str4;
        int i10;
        if (str3.equals("#url#")) {
            E(j10, str, str2);
        } else if (str3.startsWith("language_export_")) {
            F(j10, str3.substring(16), str2);
        } else if (str3.startsWith("round")) {
            org.thunderdog.challegram.a E = j0.E();
            if (E != null) {
                E.Z0().d1(str3, j10, str2);
            } else {
                I(str, str3, j10, -3, "Video is no longer recording");
            }
        } else if (str3.startsWith("asthumb")) {
            O(str, str3, j10, str2);
        } else if (str3.startsWith("copy")) {
            A(str, str3, j10, str2);
        } else {
            String str5 = null;
            int i11 = 2;
            int i12 = 0;
            if (str3.startsWith("theme_export_")) {
                String[] split = str3.substring(str3.indexOf(95, 13) + 1).split(",");
                int s10 = i.s(split[0]);
                int s11 = split.length > 1 ? i.s(split[1]) : 0;
                if (ae.z.A(s10) || ib.c.b(s11, 1) || ae.c0.f(s10, R.id.theme_property_parentTheme) != 0.0f) {
                    H(j10, s10, s11, split.length > 2 ? split[2] : null, str2);
                    return;
                }
                I(str, str3, j10, -3, "Invalid theme, id: " + s10 + ", flags: " + s11);
            } else if (str3.startsWith("content://")) {
                z(str, str3, j10, str2);
            } else {
                if (str3.startsWith("pthumb")) {
                    str5 = "pthumb";
                } else if (str3.startsWith("vthumb")) {
                    str5 = "vthumb";
                } else if (str3.startsWith("mthumb")) {
                    str5 = "mthumb";
                }
                if (str5 != null) {
                    String substring = str3.substring(str5.length());
                    int i13 = 0;
                    for (int i14 = 0; i14 < substring.length() && Character.isDigit(substring.charAt(i14)); i14++) {
                        i13++;
                    }
                    if (i13 > 0) {
                        i10 = i.s(substring.substring(0, i13));
                        str4 = substring.substring(i13);
                    } else {
                        str4 = substring;
                        i10 = 90;
                    }
                    if (str5.equals("pthumb")) {
                        i11 = 0;
                    } else if (str5.equals("vthumb")) {
                        i11 = 1;
                    }
                    int i15 = i10;
                    x xVar = new x(j10, str, str2, i11, str4);
                    if (!str4.isEmpty() && i11 == 1) {
                        g0.y(xVar, str4);
                    }
                    T(xVar, str, i15);
                    return;
                }
                if (str3.startsWith("avatar")) {
                    bVar = new jd.d(j10, str, str2, str3);
                    mVar = w0();
                    i12 = 3;
                } else if (str3.startsWith("photo")) {
                    try {
                        jd.c cVar = new jd.c(j10, str, str2, str3);
                        int o10 = cVar.o();
                        mVar = (o10 <= 0 || o10 > 320) ? w0() : D0();
                        bVar = cVar;
                    } catch (Throwable th) {
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(i.i(str3) ? 0 : str3.length());
                        objArr[1] = str3;
                        Log.e("Unable to process input conversion: %d %s", th, objArr);
                        I(str, str3, j10, -2, "Incorrect conversion input: " + str3);
                        return;
                    }
                } else if (!str3.startsWith("video")) {
                    Log.w("Unknown conversion task: %s", str3);
                    I(str, str3, j10, -2, "Unknown conversion: " + str3);
                    return;
                } else if (this.f15298a.tc().P(str, str3)) {
                    I(str, str3, j10, -2, "Failing video generation because previous attempt did not finish.");
                    return;
                } else {
                    this.f15298a.tc().a0(str, str3);
                    bVar = new g0(j10, str, str2, str3);
                    mVar = G0().n();
                }
                this.f15302e.put(Long.valueOf(j10), bVar);
                mVar.h(Message.obtain(mVar.d(), i12, bVar), 0L);
            }
        }
    }

    public final m D0() {
        if (this.f15300c == null) {
            synchronized (this) {
                if (this.f15300c == null) {
                    this.f15300c = new e(this);
                }
            }
        }
        return this.f15300c;
    }

    public final void E(long j10, String str, String str2) {
        ub.e v10 = V().v(new b0.a().f(str).a());
        synchronized (this) {
            this.f15304g.put(Long.valueOf(j10), v10);
        }
        v10.s(r0(j10, str, str2, false));
    }

    public void E0(TdApi.UpdateFileGenerationStart updateFileGenerationStart) {
        synchronized (this) {
            C0(updateFileGenerationStart.generationId, updateFileGenerationStart.originalPath, updateFileGenerationStart.destinationPath, updateFileGenerationStart.conversion);
        }
    }

    public final void F(final long j10, String str, final String str2) {
        final String substring = str.substring(str.indexOf(95) + 1);
        this.f15298a.v4().o(new TdApi.GetLanguagePackStrings(substring, null), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                w.this.j0(j10, substring, str2, object);
            }
        });
    }

    public void F0(TdApi.UpdateFileGenerationStop updateFileGenerationStop) {
        synchronized (this) {
            w(updateFileGenerationStop.generationId);
        }
    }

    public final void G(final long j10, final String str, final TdApi.LanguagePackString[] languagePackStringArr, final String str2) {
        if (Thread.currentThread() != w0()) {
            w0().h(Message.obtain(w0().d(), 8, ib.c.m(j10), ib.c.n(j10), new Object[]{str, languagePackStringArr, str2}), 0L);
        } else {
            W().execute(new Runnable() {
                @Override
                public final void run() {
                    w.this.l0(languagePackStringArr, str2, str, j10);
                }
            });
        }
    }

    public final e0 G0() {
        if (this.f15301d == null) {
            synchronized (this) {
                if (this.f15301d == null) {
                    this.f15301d = new e0(this.f15298a);
                }
            }
        }
        return this.f15301d;
    }

    public final void H(final long j10, final int i10, final int i11, final String str, final String str2) {
        if (Thread.currentThread() != w0()) {
            w0().h(Message.obtain(w0().d(), 9, ib.c.m(j10), ib.c.n(j10), new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), str, str2}), 0L);
        } else {
            W().execute(new Runnable() {
                @Override
                public final void run() {
                    w.this.m0(str2, i10, i11, str, j10);
                }
            });
        }
    }

    public void I(String str, String str2, long j10, int i10, String str3) {
        M(str, str2, j10, new TdApi.Error(i10, str3));
    }

    public void J(jd.b bVar, int i10, String str) {
        M(bVar.f(), bVar.f15204c, bVar.f15202a, new TdApi.Error(i10, str));
    }

    public void K(String str, String str2, long j10) {
        M(str, str2, j10, null);
    }

    public void L(jd.b bVar) {
        M(bVar.f(), bVar.f15204c, bVar.d(), null);
    }

    public final void M(String str, String str2, long j10, TdApi.Error error) {
        synchronized (this) {
            this.f15302e.remove(Long.valueOf(j10));
            this.f15298a.v4().o(new TdApi.FinishFileGeneration(j10, error), this.f15298a.yc());
            this.f15298a.tc().s(str, str2);
        }
    }

    public final void N(long j10, TdApi.Error error) {
        synchronized (this) {
            this.f15304g.remove(Long.valueOf(j10));
            this.f15298a.v4().o(new TdApi.FinishFileGeneration(j10, error), this.f15298a.yc());
        }
    }

    public final void O(final String str, final String str2, final long j10, final String str3) {
        if (Thread.currentThread() != w0()) {
            w0().h(Message.obtain(w0().d(), 10, ib.c.m(j10), ib.c.n(j10), new Object[]{str, str2, str3}), 0L);
        } else {
            W().execute(new Runnable() {
                @Override
                public final void run() {
                    w.this.n0(str, str3, str2, j10);
                }
            });
        }
    }

    public final void P(x xVar, String str, int i10) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever = v0.p2(str);
            try {
                byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
                if (embeddedPicture != null && embeddedPicture.length > 0) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, options);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = org.thunderdog.challegram.loader.b.b(options, i10, i10);
                    bitmap = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, options);
                }
            } catch (RuntimeException unused) {
            }
        } catch (RuntimeException unused2) {
            mediaMetadataRetriever = null;
        }
        Bitmap bitmap2 = bitmap;
        v0.H(mediaMetadataRetriever);
        if (bitmap2 == null) {
            J(xVar, -2, "Could not get frame");
            return;
        }
        if (Math.max(bitmap2.getWidth(), bitmap2.getHeight()) > i10) {
            bitmap2 = org.thunderdog.challegram.loader.b.w(bitmap2, i10, i10, false, true, true);
        }
        int j10 = xVar.j();
        if (j10 != 0) {
            bitmap2 = A0(bitmap2, j10);
        }
        x(xVar, bitmap2, 89, false);
    }

    public final void Q(jd.d dVar) {
        String f10 = dVar.f();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        org.thunderdog.challegram.loader.b.e(f10, options);
        options.inSampleSize = org.thunderdog.challegram.loader.b.b(options, 640, 640);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = null;
        try {
            InputStream o22 = v0.o2(f10);
            bitmap = BitmapFactory.decodeStream(o22, null, options);
            if (o22 != null) {
                o22.close();
            }
        } catch (Throwable th) {
            Log.e("Cannot compress photo", th, new Object[0]);
        }
        if (bitmap == null) {
            J(dVar, -2, "bitmap == null");
            return;
        }
        Bitmap u02 = u0(bitmap, v0.t0(f10));
        if (u02.getWidth() != u02.getHeight()) {
            u02 = D(u02);
        }
        Bitmap bitmap2 = u02;
        if (Math.max(bitmap2.getWidth(), bitmap2.getHeight()) > 640) {
            bitmap2 = org.thunderdog.challegram.loader.b.w(bitmap2, 640, 640, false, true, true);
        }
        x(dVar, bitmap2, 89, false);
    }

    public final void R(jd.c cVar) {
        final Bitmap bitmap;
        boolean z10;
        InputStream o22;
        ImageDecoder.Source source;
        String f10 = cVar.f();
        Uri parse = f10.startsWith("content://") ? Uri.parse(f10) : null;
        boolean y12 = v0.y1(f10);
        boolean z11 = false;
        final boolean z12 = cVar.l() || (!y12 && Z(f10, parse));
        int o10 = cVar.o() != 0 ? cVar.o() : 1280;
        boolean z13 = he.i.c2().R2() && cVar.p();
        if (Build.VERSION.SDK_INT < 28 || o10 > 320 || cVar.m() != null || cVar.n() != null) {
            bitmap = null;
        } else {
            if (parse != null) {
                source = ImageDecoder.createSource(j0.n().getContentResolver(), parse);
            } else {
                source = ImageDecoder.createSource(new File(f10));
            }
            bitmap = ImageDecoder.decodeBitmap(source, new b(cVar, o10, z12));
        }
        if (bitmap == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            if (!cVar.r()) {
                o22 = v0.o2(f10);
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(o22, null, options);
                    options.inSampleSize = org.thunderdog.challegram.loader.b.c(options.outWidth, options.outHeight, o10, o10);
                    if (o22 != null) {
                        o22.close();
                    }
                } finally {
                }
            }
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            o22 = v0.o2(f10);
            try {
                bitmap = cVar.B(o22, options, f10);
                if (o22 != null) {
                    o22.close();
                }
                z10 = true;
            } finally {
            }
        } else {
            z10 = false;
        }
        if (bitmap == null) {
            J(cVar, -2, "Original image has failed to read");
            return;
        }
        if (cVar.v(z10)) {
            Bitmap A = cVar.A(bitmap, z10);
            if (A == null) {
                bitmap.recycle();
                J(cVar, -2, "processedBitmap == null");
                return;
            } else if (A != bitmap) {
                bitmap.recycle();
                bitmap = A;
            }
        }
        Bitmap w10 = Math.max(bitmap.getWidth(), bitmap.getHeight()) > o10 ? org.thunderdog.challegram.loader.b.w(bitmap, o10, o10, false, true, !z13) : bitmap;
        if (z12 && !cVar.l()) {
            try {
                if (w10.isMutable()) {
                    Canvas canvas = new Canvas(w10);
                    canvas.drawColor(-1, PorterDuff.Mode.DST_OVER);
                    v0.v2(canvas);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(w10.getWidth(), w10.getHeight(), w10.getConfig());
                    Canvas canvas2 = new Canvas(createBitmap);
                    canvas2.drawBitmap(w10, 0.0f, 0.0f, (Paint) null);
                    canvas2.drawColor(-1, PorterDuff.Mode.DST_OVER);
                    try {
                        v0.v2(canvas2);
                        if (!z13) {
                            v0.u2(bitmap);
                        }
                    } catch (Throwable unused) {
                    }
                    w10 = createBitmap;
                }
            } catch (Throwable unused2) {
            }
        }
        int i10 = cVar.r() ? 100 : y12 ? 92 : f15297i;
        if (z12 && cVar.l()) {
            z11 = true;
        }
        x(cVar, w10, i10, z11);
        if (z13) {
            l.a().c(new Runnable() {
                @Override
                public final void run() {
                    v0.E2(bitmap, z12);
                }
            }, 750);
        }
    }

    public final void S(x xVar, String str, int i10) {
        ImageDecoder.Source source;
        Bitmap bitmap = null;
        Uri parse = str.startsWith("content://") ? Uri.parse(str) : null;
        boolean Z = Z(str, parse);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (parse != null) {
                    source = ImageDecoder.createSource(j0.n().getContentResolver(), parse);
                } else {
                    source = ImageDecoder.createSource(new File(str));
                }
                x(xVar, ImageDecoder.decodeBitmap(source, new c()), 89, Z);
            } catch (Throwable th) {
                Log.e("Cannot compress photo", th, new Object[0]);
                J(xVar, -2, "Cannot compress photo, see logs for details");
            }
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            options.inJustDecodeBounds = true;
            if (parse != null) {
                InputStream openInputStream = j0.q().getContentResolver().openInputStream(parse);
                try {
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                } catch (Throwable th2) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } else {
                org.thunderdog.challegram.loader.b.e(str, options);
            }
            options.inSampleSize = org.thunderdog.challegram.loader.b.b(options, 90, 90);
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                InputStream o22 = v0.o2(str);
                bitmap = BitmapFactory.decodeStream(o22, null, options);
                if (o22 != null) {
                    o22.close();
                }
            } catch (Throwable th4) {
                Log.e("Cannot compress photo", th4, new Object[0]);
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                J(xVar, -2, "bitmap == null");
                return;
            }
            if (Math.max(bitmap2.getWidth(), bitmap2.getHeight()) > 90) {
                bitmap2 = org.thunderdog.challegram.loader.b.w(bitmap2, 90, 90, false, true, true);
            }
            x(xVar, u0(bitmap2, v0.t0(str)), 89, Z);
        }
    }

    public final void T(x xVar, String str, int i10) {
        if (Thread.currentThread() != w0()) {
            w0().h(Message.obtain(w0().d(), 1, i10, 0, new Object[]{xVar, str}), 0L);
            return;
        }
        try {
            int l10 = xVar.l();
            if (l10 == 0) {
                S(xVar, str, i10);
            } else if (l10 == 1) {
                U(xVar, str, i10);
            } else if (l10 == 2) {
                P(xVar, str, i10);
            } else {
                throw new IllegalArgumentException("type == " + xVar.l());
            }
        } catch (Throwable th) {
            Log.e("Cannot generate thumb type:%d", th, Integer.valueOf(xVar.l()));
            J(xVar, -2, "Failed to generate thumb, see logs for details");
        }
    }

    public final void U(jd.x r8, java.lang.String r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.U(jd.x, java.lang.String, int):void");
    }

    public final z V() {
        if (this.f15303f == null) {
            synchronized (this) {
                if (this.f15303f == null) {
                    z.a aVar = new z.a();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    this.f15303f = aVar.b(10L, timeUnit).H(10L, timeUnit).G(10L, TimeUnit.MINUTES).a();
                }
            }
        }
        return this.f15303f;
    }

    public ThreadPoolExecutor W() {
        if (this.f15305h == null) {
            synchronized (this) {
                if (this.f15305h == null) {
                    this.f15305h = new ThreadPoolExecutor(1, 4, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
                }
            }
        }
        return this.f15305h;
    }

    public e0.c Y(String str) {
        return G0().m(str);
    }

    public final boolean Z(String str, Uri uri) {
        try {
            String v02 = v0.v0(str);
            if (!"png".equals(v02) && !"webp".equals(v02)) {
                if (uri == null) {
                    return false;
                }
                String queryParameter = uri.getQueryParameter("mimeType");
                if (queryParameter != null && (queryParameter.equals("image/webp") || queryParameter.equals("image/png"))) {
                    return true;
                }
                String queryParameter2 = uri.getQueryParameter("fileName");
                if (queryParameter2 != null) {
                    queryParameter2 = v0.v0(queryParameter2);
                }
                if (queryParameter2 == null) {
                    return false;
                }
                if (!queryParameter2.equals("webp")) {
                    if (!queryParameter2.equals("png")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            Log.e(th);
            return false;
        }
    }

    public final f r0(long j10, String str, String str2, boolean z10) {
        return new a(j10, str, str2, z10);
    }

    public final void v0(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            jd.c cVar = (jd.c) message.obj;
            try {
                R(cVar);
            } catch (Throwable th) {
                Log.e("Cannot generate photo", th, new Object[0]);
                J(cVar, -1, "Unknown error, see logs for details");
            }
        } else if (i10 == 1) {
            Object[] objArr = (Object[]) message.obj;
            T((x) objArr[0], (String) objArr[1], message.arg1);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i10 != 3) {
            switch (i10) {
                case 5:
                    Object[] objArr2 = (Object[]) message.obj;
                    E(ib.c.f(message.arg1, message.arg2), (String) objArr2[0], (String) objArr2[1]);
                    objArr2[0] = null;
                    objArr2[1] = null;
                    return;
                case 6:
                    Object[] objArr3 = (Object[]) message.obj;
                    z((String) objArr3[0], (String) objArr3[1], ib.c.f(message.arg1, message.arg2), (String) objArr3[2]);
                    objArr3[0] = null;
                    objArr3[1] = null;
                    return;
                case 7:
                    Object[] objArr4 = (Object[]) message.obj;
                    A((String) objArr4[0], (String) objArr4[1], ib.c.f(message.arg1, message.arg2), (String) objArr4[2]);
                    objArr4[0] = null;
                    objArr4[1] = null;
                    return;
                case 8:
                    Object[] objArr5 = (Object[]) message.obj;
                    G(ib.c.f(message.arg1, message.arg2), (String) objArr5[0], (TdApi.LanguagePackString[]) objArr5[1], (String) objArr5[2]);
                    objArr5[0] = null;
                    objArr5[1] = null;
                    objArr5[2] = null;
                    return;
                case 9:
                    Object[] objArr6 = (Object[]) message.obj;
                    H(ib.c.f(message.arg1, message.arg2), ((Integer) objArr6[0]).intValue(), ((Integer) objArr6[1]).intValue(), (String) objArr6[2], (String) objArr6[3]);
                    objArr6[0] = null;
                    objArr6[1] = null;
                    objArr6[2] = null;
                    return;
                case 10:
                    Object[] objArr7 = (Object[]) message.obj;
                    O((String) objArr7[0], (String) objArr7[1], ib.c.f(message.arg1, message.arg2), (String) objArr7[2]);
                    objArr7[0] = null;
                    objArr7[1] = null;
                    return;
                default:
                    return;
            }
        } else {
            jd.d dVar = (jd.d) message.obj;
            try {
                Q(dVar);
            } catch (Throwable th2) {
                Log.e("Cannot generate avatar", th2, new Object[0]);
                J(dVar, -1, "Unknown error, see logs for details");
            }
        }
    }

    public final void w(long j10) {
        ub.e remove = this.f15304g.remove(Long.valueOf(j10));
        if (remove != null) {
            remove.cancel();
        }
        jd.b bVar = this.f15302e.get(Long.valueOf(j10));
        if (bVar != null) {
            this.f15302e.remove(Long.valueOf(j10));
            bVar.b();
        }
    }

    public final m w0() {
        if (this.f15299b == null) {
            synchronized (this) {
                if (this.f15299b == null) {
                    this.f15299b = new e(this);
                }
            }
        }
        return this.f15299b;
    }

    public final void x(jd.b bVar, Bitmap bitmap, int i10, boolean z10) {
        boolean z11 = true;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(bVar.c());
            z11 = true ^ bitmap.compress(v0.J(z10), i10, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            Log.e("Cannot compress image", th, new Object[0]);
        }
        if (z11) {
            J(bVar, -2, "Image has failed to compress");
        } else {
            L(bVar);
        }
    }

    public final boolean x0(long j10, String str, String str2, String str3, boolean z10) {
        if (i.i(str2)) {
            return false;
        }
        ub.e v10 = V().v(new b0.a().f(str2).a());
        synchronized (this) {
            if (this.f15304g.remove(Long.valueOf(j10)) == null) {
                return false;
            }
            this.f15304g.put(Long.valueOf(j10), v10);
            Log.i(32, "Redirecting HTTP request...\nurl:%s\nnewUrl:%s", str, str2);
            v10.s(r0(j10, str2, str3, z10));
            return true;
        }
    }

    public boolean y(long r19, java.lang.String r21, hc.a0 r22, java.lang.String r23, int r24, java.util.concurrent.atomic.AtomicBoolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: jd.w.y(long, java.lang.String, hc.a0, java.lang.String, int, java.util.concurrent.atomic.AtomicBoolean):boolean");
    }

    public void y0(final String str) {
        if (str != null) {
            org.thunderdog.challegram.loader.b.k().l(new Runnable() {
                @Override
                public final void run() {
                    w.p0(str);
                }
            });
        }
    }

    public final void z(final String str, final String str2, final long j10, final String str3) {
        if (Thread.currentThread() != w0()) {
            w0().h(Message.obtain(w0().d(), 6, ib.c.m(j10), ib.c.n(j10), new Object[]{str, str2, str3}), 0L);
            return;
        }
        int lastIndexOf = str2.lastIndexOf(44);
        final String substring = str2.substring(0, lastIndexOf);
        String substring2 = str2.substring(lastIndexOf + 1);
        int indexOf = substring2.indexOf(95);
        if (indexOf != -1) {
            substring2 = substring2.substring(0, indexOf);
        }
        final int s10 = i.s(substring2);
        W().execute(new Runnable() {
            @Override
            public final void run() {
                w.this.b0(substring, j10, str3, s10, str, str2);
            }
        });
    }

    public final boolean z0(long j10, String str, String str2, boolean z10) {
        return x0(j10, str, X(str), str2, z10);
    }
}
