package id;

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
import be.C1363c0;
import be.C1379j0;
import gd.C4779t2;
import ge.C4868i;
import id.C5340e0;
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
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.C7907b;
import p067ed.C4184b;
import p082fd.C4383l;
import p082fd.C4384m;
import p082fd.C4403w;
import p095gc.AbstractC4550f;
import p095gc.AbstractC4551g;
import p095gc.AbstractC4572y;
import p095gc.C4560o;
import p108hb.C5063c;
import p108hb.C5069h;
import p108hb.C5070i;
import p156kd.C6244g;
import p156kd.C6252k;
import p254rd.C8431f;
import p278tb.AbstractC9080e;
import p278tb.AbstractC9081e0;
import p278tb.AbstractC9084f;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p278tb.C9132z;
import p350yd.C10930q6;
import p364zd.C11514c0;
import p364zd.C11541z;

public final class C5365w {
    public static final int f17629i;
    public final C10930q6 f17630a;
    public C4384m f17631b;
    public C4384m f17632c;
    public C5340e0 f17633d;
    public C9132z f17635f;
    public ThreadPoolExecutor f17637h;
    public final HashMap<Long, AbstractC5333b> f17634e = new HashMap<>();
    public final HashMap<Long, AbstractC9080e> f17636g = new HashMap<>();

    public class C5366a implements AbstractC9084f {
        public final long f17638a;
        public final String f17639b;
        public final String f17640c;
        public final boolean f17641d;

        public C5366a(long j, String str, String str2, boolean z) {
            this.f17638a = j;
            this.f17639b = str;
            this.f17640c = str2;
            this.f17641d = z;
        }

        @Override
        public void mo10487a(AbstractC9080e eVar, C9078d0 d0Var) {
            AbstractC4551g t;
            AbstractC4572y d;
            AbstractC4550f a;
            if (d0Var.m10522G0()) {
                AbstractC9081e0 m = d0Var.m10513m();
                if (m == null) {
                    if (!C5365w.this.m23069z0(this.f17638a, this.f17639b, this.f17640c, this.f17641d)) {
                        C5365w.this.m23133N(this.f17638a, new TdApi.Error(-2, "HTTP responseBody is null"));
                    }
                } else if (this.f17641d) {
                    C5365w.this.m23133N(this.f17638a, new TdApi.Error(-3, "Preprocessing failed"));
                } else {
                    File file = new File(this.f17640c);
                    long j = 0;
                    boolean z = true;
                    try {
                        t = m.mo527t();
                        d = C4560o.m27376d(file);
                        a = C4560o.m27379a(d);
                    } catch (IOException e) {
                        Log.m14728e(32, "Couldn't load HTTP file, url:%s", e, this.f17639b);
                    }
                    try {
                        long m2 = m.mo528m();
                        while (true) {
                            long s = t.mo5028s(a.mo27336a(), 2048L);
                            if (s == -1) {
                                break;
                            }
                            j += s;
                            C5365w.this.f17630a.m2270r4().m14783o(new TdApi.SetFileGenerationProgress(this.f17638a, (int) m2, (int) j), C5365w.this.f17630a.m2214uc());
                        }
                        a.close();
                        if (d != null) {
                            d.close();
                        }
                        t.close();
                        z = false;
                        if (!z || !C5365w.this.m23069z0(this.f17638a, this.f17639b, this.f17640c, this.f17641d)) {
                            C5365w.this.m23133N(this.f17638a, z ? new TdApi.Error() : null);
                        }
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
            } else if (!C5365w.this.m23069z0(this.f17638a, this.f17639b, this.f17640c, this.f17641d)) {
                C5365w wVar = C5365w.this;
                long j2 = this.f17638a;
                wVar.m23133N(j2, new TdApi.Error(-2, "HTTP status code: " + d0Var.m10528A0()));
            }
        }

        @Override
        public void mo10486b(AbstractC9080e eVar, IOException iOException) {
            if (!eVar.mo5004m() && !C5365w.this.m23069z0(this.f17638a, this.f17639b, this.f17640c, this.f17641d)) {
                Log.m14722i(32, "Failed to load http file: %s", iOException, this.f17639b);
                C5365w wVar = C5365w.this;
                long j = this.f17638a;
                wVar.m23133N(j, new TdApi.Error(-1, "HTTP Error: " + Log.toString(iOException)));
            }
        }
    }

    public class C5367b implements ImageDecoder.OnHeaderDecodedListener {
        public final C5335c f17643a;
        public final int f17644b;
        public final boolean f17645c;

        public class C5368a implements PostProcessor {
            public final boolean f17647a;
            public final C8431f f17648b;
            public final int f17649c;
            public final int f17650d;

            public C5368a(boolean z, C8431f fVar, int i, int i2) {
                this.f17647a = z;
                this.f17648b = fVar;
                this.f17649c = i;
                this.f17650d = i2;
            }

            @Override
            public int onPostProcess(Canvas canvas) {
                if (this.f17647a) {
                    canvas.drawColor(-1, PorterDuff.Mode.DST_OVER);
                }
                C8431f fVar = this.f17648b;
                if (fVar == null) {
                    return 0;
                }
                fVar.m12496g(canvas, 0, 0, this.f17649c, this.f17650d);
                return 0;
            }
        }

        public C5367b(C5335c cVar, int i, boolean z) {
            this.f17643a = cVar;
            this.f17644b = i;
            this.f17645c = z;
        }

        @Override
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            int width = imageInfo.getSize().getWidth();
            int height = imageInfo.getSize().getHeight();
            imageDecoder.setAllocator(1);
            if (!this.f17643a.m23211r()) {
                int i = this.f17644b;
                imageDecoder.setTargetSampleSize(C7907b.m14372a(width, height, i, i));
                imageDecoder.setUnpremultipliedRequired(true);
            }
            C8431f n = this.f17643a.m23215n();
            boolean z = this.f17645c && !this.f17643a.m23217l();
            if (n != null || z) {
                imageDecoder.setPostProcessor(new C5368a(z, n, width, height));
            }
        }
    }

    public class C5369c implements ImageDecoder.OnHeaderDecodedListener {
        public C5369c() {
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

    public interface AbstractC5370d {
        String mo23068a(String str, String str2);
    }

    public static class C5371e extends C4384m {
        public final C5365w f17653M;

        public C5371e(C5365w wVar) {
            super("FileGenQueue");
            this.f17653M = wVar;
        }

        @Override
        public void mo3052f(Message message) {
            this.f17653M.m23077v0(message);
        }
    }

    static {
        f17629i = C4184b.f14110c ? 92 : 89;
    }

    public C5365w(C10930q6 q6Var) {
        this.f17630a = q6Var;
    }

    public static Bitmap m23152A0(Bitmap bitmap, int i) {
        if (C5069h.m24081l(i, 360) == 0 || !C7389v0.m16756A1(bitmap)) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.postRotate(i);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public static Bitmap m23147D(Bitmap bitmap) {
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

    public static String m23123X(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"maps.googleapis.com".equals(parse.getHost())) {
                return null;
            }
            if (C5070i.m24061i(parse.getQueryParameter("key"))) {
                return str;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int m23119a0(Map.Entry entry, Map.Entry entry2) {
        return ((String) ((List) entry.getValue()).get(0)).compareToIgnoreCase((String) ((List) entry2.getValue()).get(0));
    }

    public void m23117b0(java.lang.String r13, long r14, java.lang.String r16, int r17, java.lang.String r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23117b0(java.lang.String, long, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    public void m23115c0(java.lang.String r13, long r14, java.lang.String r16, java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23115c0(java.lang.String, long, java.lang.String, java.lang.String):void");
    }

    public static String m23113d0(int i, String str, String str2) {
        if (str2 == null) {
            return C5372x.m23063m(0, null, i);
        }
        if (str2.startsWith("photo")) {
            return C5335c.m23218k(str2, i);
        }
        return null;
    }

    public static String m23111e0(int i, String str, String str2) {
        if (str2 == null || str2.startsWith("video")) {
            return C5372x.m23063m(1, str2, i);
        }
        return null;
    }

    public static String m23109f0(int i, String str, String str2) {
        String z2 = C7389v0.m16555z2(str);
        if (!C5070i.m24061i(z2)) {
            if (z2.startsWith("video/") && (str2 == null || str2.startsWith("video"))) {
                return C5372x.m23063m(1, str2, i);
            }
            if (z2.startsWith("image/")) {
                if (str2 == null) {
                    return C5335c.m23209t(0, 0L, true, i);
                }
                if (str2.startsWith("photo")) {
                    return C5335c.m23218k(str2, i);
                }
            }
            if (z2.startsWith("audio/") && str2 == null) {
                return C5372x.m23063m(2, null, i);
            }
            z2.startsWith("application/pdf");
        }
        return null;
    }

    public static String m23103i0(int i, String str, String str2) {
        return str2 != null ? C5335c.m23218k(str2, i) : C5335c.m23209t(0, 0L, true, i);
    }

    public void m23101j0(long j, String str, String str2, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.f17630a.m2270r4().m14783o(new TdApi.FinishFileGeneration(j, (TdApi.Error) object), this.f17630a.m2214uc());
        } else if (constructor == 1172082922) {
            m23141G(j, str, ((TdApi.LanguagePackStrings) object).strings, str2);
        }
    }

    public static int m23099k0(TdApi.LanguagePackString languagePackString, TdApi.LanguagePackString languagePackString2) {
        int d = C4403w.C4405b.m27796d(languagePackString);
        int d2 = C4403w.C4405b.m27796d(languagePackString2);
        if (d != d2) {
            return Integer.compare(d, d2);
        }
        return languagePackString.key.compareTo(languagePackString2.key);
    }

    public void m23097l0(org.drinkless.p210td.libcore.telegram.TdApi.LanguagePackString[] r18, java.lang.String r19, java.lang.String r20, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23097l0(org.drinkless.td.libcore.telegram.TdApi$LanguagePackString[], java.lang.String, java.lang.String, long):void");
    }

    public void m23095m0(java.lang.String r19, int r20, int r21, java.lang.String r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23095m0(java.lang.String, int, int, java.lang.String, long):void");
    }

    public void m23093n0(java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23093n0(java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public static void m23089p0(String str) {
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            Log.m14724e("Cannot delete target file, but we don't need it now. Bad things may happen in future", new Object[0]);
        }
    }

    public static void m23087q0(p156kd.C6252k r5, android.graphics.Bitmap r6) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23087q0(kd.k, android.graphics.Bitmap):void");
    }

    public static TdApi.InputThumbnail m23083s0(TdApi.InputFile inputFile, int i, int i2, int i3) {
        if (inputFile == null) {
            return null;
        }
        if (Math.max(i2, i3) > i) {
            if (i2 != 0) {
                if (i3 != 0) {
                    float f = i;
                    float f2 = i2;
                    float f3 = i3;
                    float min = Math.min(f / f2, f / f3);
                    i2 = (int) (f2 * min);
                    i = (int) (f3 * min);
                }
                return new TdApi.InputThumbnail(inputFile, i, i3);
            }
            i3 = i;
        }
        i = i2;
        return new TdApi.InputThumbnail(inputFile, i, i3);
    }

    public static TdApi.InputFileGenerated m23081t0(TdApi.InputFile inputFile, TdApi.File file, AbstractC5370d dVar) {
        TdApi.RemoteFile remoteFile;
        try {
            try {
                switch (inputFile.getConstructor()) {
                    case TdApi.InputFileGenerated.CONSTRUCTOR:
                        TdApi.InputFileGenerated inputFileGenerated = (TdApi.InputFileGenerated) inputFile;
                        String str = inputFileGenerated.originalPath;
                        try {
                            String a = !C5070i.m24061i(inputFileGenerated.conversion) ? dVar.mo23068a(str, inputFileGenerated.conversion) : null;
                            file = str;
                            inputFile = a;
                        } catch (Throwable unused) {
                            file = str;
                            Log.m14709w("unable to create thumbnail conversion: %s", new Object[]{inputFile});
                            inputFile = 0;
                            if (!C5070i.m24061i(file)) {
                                break;
                            }
                            return null;
                        }
                    case TdApi.InputFileRemote.CONSTRUCTOR:
                        if (file != 0 && (remoteFile = file.remote) != null && C5070i.m24067c(((TdApi.InputFileRemote) inputFile).f25392id, remoteFile.f25417id) && C4779t2.m25598T2(file)) {
                            String str2 = file.local.path;
                            inputFile = dVar.mo23068a(str2, null);
                            file = str2;
                            break;
                        }
                        inputFile = 0;
                        file = 0;
                        break;
                    case TdApi.InputFileId.CONSTRUCTOR:
                        if (file != 0 && ((TdApi.InputFileId) inputFile).f25391id == file.f25373id && C4779t2.m25598T2(file)) {
                            String str3 = file.local.path;
                            inputFile = dVar.mo23068a(str3, null);
                            file = str3;
                            break;
                        }
                        inputFile = 0;
                        file = 0;
                        break;
                    case TdApi.InputFileLocal.CONSTRUCTOR:
                        String str4 = ((TdApi.InputFileLocal) inputFile).path;
                        inputFile = dVar.mo23068a(str4, null);
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
        if (!C5070i.m24061i(file) || C5070i.m24061i(inputFile)) {
            return null;
        }
        return new TdApi.InputFileGenerated(file, inputFile, 0);
    }

    public static Bitmap m23079u0(Bitmap bitmap, int i) {
        Matrix b0 = C7389v0.m16653b0(bitmap.getWidth(), bitmap.getHeight(), i);
        if (b0 == null) {
            return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), b0, true);
            bitmap.recycle();
            return createBitmap;
        } catch (Throwable unused) {
            Log.m14727e(32, "Cannot orient bitmap: %d, size: %dx%d", Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            return bitmap;
        }
    }

    public static void m23078v(StringBuilder sb2, Map<?, List<String>> map) {
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        for (Map.Entry entry : arrayList) {
            Collections.sort((List) entry.getValue(), C5352j.f17597a);
        }
        Collections.sort(arrayList, C5353k.f17598a);
        for (Map.Entry entry2 : arrayList) {
            boolean z = true;
            for (String str : (List) entry2.getValue()) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(str);
            }
            sb2.append(": ");
            Object key = entry2.getKey();
            sb2.append(key instanceof Integer ? C1363c0.m37471C(((Integer) key).intValue(), true) : key instanceof Float ? C7389v0.m16641e0(((Float) key).floatValue(), true) : (String) key);
            sb2.append("\n");
        }
    }

    public final void m23153A(final String str, final String str2, final long j, final String str3) {
        if (Thread.currentThread() != m23075w0()) {
            m23075w0().m28050h(Message.obtain(m23075w0().m28053d(), 7, C5063c.m24133m(j), C5063c.m24132n(j), new Object[]{str, str2, str3}), 0L);
        } else {
            m23124W().execute(new Runnable() {
                @Override
                public final void run() {
                    C5365w.this.m23115c0(str, j, str3, str2);
                }
            });
        }
    }

    public <T extends TdApi.InputMessageContent> T m23151B(T t, boolean z) {
        return (T) m23149C(t, z, null);
    }

    public void m23150B0(final C6252k kVar, final Bitmap bitmap) {
        if (kVar != null) {
            C6244g.m20960k().m20969b(kVar, bitmap);
            C7907b.m14362k().m14361l(new Runnable() {
                @Override
                public final void run() {
                    C5365w.m23087q0(C6252k.this, bitmap);
                }
            });
        }
    }

    public <T extends org.drinkless.p210td.libcore.telegram.TdApi.InputMessageContent> T m23149C(T r8, boolean r9, org.drinkless.p210td.libcore.telegram.TdApi.File r10) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23149C(org.drinkless.td.libcore.telegram.TdApi$InputMessageContent, boolean, org.drinkless.td.libcore.telegram.TdApi$File):org.drinkless.td.libcore.telegram.TdApi$InputMessageContent");
    }

    public final void m23148C0(long j, String str, String str2, String str3) {
        AbstractC5333b bVar;
        C4384m mVar;
        String str4;
        int i;
        if (str3.equals("#url#")) {
            m23145E(j, str, str2);
        } else if (str3.startsWith("language_export_")) {
            m23143F(j, str3.substring(16), str2);
        } else if (str3.startsWith("round")) {
            AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
            if (E != null) {
                E.m14529V0().m6901e1(str3, j, str2);
            } else {
                m23137J(str, str3, j, -3, "Video is no longer recording");
            }
        } else if (str3.startsWith("asthumb")) {
            m23132O(str, str3, j, str2);
        } else if (str3.startsWith("copy")) {
            m23153A(str, str3, j, str2);
        } else {
            String str5 = null;
            int i2 = 2;
            int i3 = 0;
            if (str3.startsWith("theme_export_")) {
                String[] split = str3.substring(str3.indexOf(95, 13) + 1).split(",");
                int s = C5070i.m24051s(split[0]);
                int s2 = split.length > 1 ? C5070i.m24051s(split[1]) : 0;
                if (C11541z.m1y(s) || C5063c.m24144b(s2, 1) || C11514c0.m343f(s, R.id.theme_property_parentTheme) != 0.0f) {
                    m23139H(j, s, s2, split.length > 2 ? split[2] : null, str2);
                    return;
                }
                m23137J(str, str3, j, -3, "Invalid theme, id: " + s + ", flags: " + s2);
            } else if (str3.startsWith("content://")) {
                m23070z(str, str3, j, str2);
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
                    int i4 = 0;
                    for (int i5 = 0; i5 < substring.length() && Character.isDigit(substring.charAt(i5)); i5++) {
                        i4++;
                    }
                    if (i4 > 0) {
                        i = C5070i.m24051s(substring.substring(0, i4));
                        str4 = substring.substring(i4);
                    } else {
                        str4 = substring;
                        i = 90;
                    }
                    if (str5.equals("pthumb")) {
                        i2 = 0;
                    } else if (str5.equals("vthumb")) {
                        i2 = 1;
                    }
                    int i6 = i;
                    C5372x xVar = new C5372x(j, str, str2, i2, str4);
                    if (!str4.isEmpty() && i2 == 1) {
                        C5349g0.m23154y(xVar, str4);
                    }
                    m23127T(xVar, str, i6);
                    return;
                }
                if (str3.startsWith("avatar")) {
                    bVar = new C5337d(j, str, str2, str3);
                    mVar = m23075w0();
                    i3 = 3;
                } else if (str3.startsWith("photo")) {
                    try {
                        C5335c cVar = new C5335c(j, str, str2, str3);
                        int o = cVar.m23214o();
                        mVar = (o <= 0 || o > 320) ? m23075w0() : m23146D0();
                        bVar = cVar;
                    } catch (Throwable th) {
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(C5070i.m24061i(str3) ? 0 : str3.length());
                        objArr[1] = str3;
                        Log.m14725e("Unable to process input conversion: %d %s", th, objArr);
                        m23137J(str, str3, j, -2, "Incorrect conversion input: " + str3);
                        return;
                    }
                } else if (!str3.startsWith("video")) {
                    Log.m14709w("Unknown conversion task: %s", str3);
                    m23137J(str, str3, j, -2, "Unknown conversion: " + str3);
                    return;
                } else if (this.f17630a.m2294pc().m4141P(str, str3)) {
                    m23137J(str, str3, j, -2, "Failing video generation because previous attempt did not finish.");
                    return;
                } else {
                    this.f17630a.m2294pc().m4130a0(str, str3);
                    bVar = new C5349g0(j, str, str2, str3);
                    mVar = m23140G0().m23188n();
                }
                this.f17634e.put(Long.valueOf(j), bVar);
                mVar.m28050h(Message.obtain(mVar.m28053d(), i3, bVar), 0L);
            }
        }
    }

    public final C4384m m23146D0() {
        if (this.f17632c == null) {
            synchronized (this) {
                if (this.f17632c == null) {
                    this.f17632c = new C5371e(this);
                }
            }
        }
        return this.f17632c;
    }

    public final void m23145E(long j, String str, String str2) {
        AbstractC9080e v = m23125V().m10268v(new C9069b0.C9070a().m10553f(str).m10558a());
        synchronized (this) {
            this.f17636g.put(Long.valueOf(j), v);
        }
        v.mo4997t(m23085r0(j, str, str2, false));
    }

    public void m23144E0(TdApi.UpdateFileGenerationStart updateFileGenerationStart) {
        synchronized (this) {
            m23148C0(updateFileGenerationStart.generationId, updateFileGenerationStart.originalPath, updateFileGenerationStart.destinationPath, updateFileGenerationStart.conversion);
        }
    }

    public final void m23143F(final long j, String str, final String str2) {
        final String substring = str.substring(str.indexOf(95) + 1);
        this.f17630a.m2270r4().m14783o(new TdApi.GetLanguagePackStrings(substring, null), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C5365w.this.m23101j0(j, substring, str2, object);
            }
        });
    }

    public void m23142F0(TdApi.UpdateFileGenerationStop updateFileGenerationStop) {
        synchronized (this) {
            m23076w(updateFileGenerationStop.generationId);
        }
    }

    public final void m23141G(final long j, final String str, final TdApi.LanguagePackString[] languagePackStringArr, final String str2) {
        if (Thread.currentThread() != m23075w0()) {
            m23075w0().m28050h(Message.obtain(m23075w0().m28053d(), 8, C5063c.m24133m(j), C5063c.m24132n(j), new Object[]{str, languagePackStringArr, str2}), 0L);
        } else {
            m23124W().execute(new Runnable() {
                @Override
                public final void run() {
                    C5365w.this.m23097l0(languagePackStringArr, str2, str, j);
                }
            });
        }
    }

    public final C5340e0 m23140G0() {
        if (this.f17633d == null) {
            synchronized (this) {
                if (this.f17633d == null) {
                    this.f17633d = new C5340e0(this.f17630a);
                }
            }
        }
        return this.f17633d;
    }

    public final void m23139H(final long j, final int i, final int i2, final String str, final String str2) {
        if (Thread.currentThread() != m23075w0()) {
            m23075w0().m28050h(Message.obtain(m23075w0().m28053d(), 9, C5063c.m24133m(j), C5063c.m24132n(j), new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str2}), 0L);
        } else {
            m23124W().execute(new Runnable() {
                @Override
                public final void run() {
                    C5365w.this.m23095m0(str2, i, i2, str, j);
                }
            });
        }
    }

    public void m23138I(AbstractC5333b bVar, int i, String str) {
        m23134M(bVar.m23225f(), bVar.f17518c, bVar.f17516a, new TdApi.Error(i, str));
    }

    public void m23137J(String str, String str2, long j, int i, String str3) {
        m23134M(str, str2, j, new TdApi.Error(i, str3));
    }

    public void m23136K(AbstractC5333b bVar) {
        m23134M(bVar.m23225f(), bVar.f17518c, bVar.m23227d(), null);
    }

    public void m23135L(String str, String str2, long j) {
        m23134M(str, str2, j, null);
    }

    public final void m23134M(String str, String str2, long j, TdApi.Error error) {
        synchronized (this) {
            this.f17634e.remove(Long.valueOf(j));
            this.f17630a.m2270r4().m14783o(new TdApi.FinishFileGeneration(j, error), this.f17630a.m2214uc());
            this.f17630a.m2294pc().m4097s(str, str2);
        }
    }

    public final void m23133N(long j, TdApi.Error error) {
        synchronized (this) {
            this.f17636g.remove(Long.valueOf(j));
            this.f17630a.m2270r4().m14783o(new TdApi.FinishFileGeneration(j, error), this.f17630a.m2214uc());
        }
    }

    public final void m23132O(final String str, final String str2, final long j, final String str3) {
        if (Thread.currentThread() != m23075w0()) {
            m23075w0().m28050h(Message.obtain(m23075w0().m28053d(), 10, C5063c.m24133m(j), C5063c.m24132n(j), new Object[]{str, str2, str3}), 0L);
        } else {
            m23124W().execute(new Runnable() {
                @Override
                public final void run() {
                    C5365w.this.m23093n0(str, str3, str2, j);
                }
            });
        }
    }

    public final void m23131P(C5372x xVar, String str, int i) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever = C7389v0.m16595p2(str);
            try {
                byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
                if (embeddedPicture != null && embeddedPicture.length > 0) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, options);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = C7907b.m14371b(options, i, i);
                    bitmap = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, options);
                }
            } catch (RuntimeException unused) {
            }
        } catch (RuntimeException unused2) {
            mediaMetadataRetriever = null;
        }
        Bitmap bitmap2 = bitmap;
        C7389v0.m16730H(mediaMetadataRetriever);
        if (bitmap2 == null) {
            m23138I(xVar, -2, "Could not get frame");
            return;
        }
        if (Math.max(bitmap2.getWidth(), bitmap2.getHeight()) > i) {
            bitmap2 = C7907b.m14350w(bitmap2, i, i, false, true, true);
        }
        int j = xVar.m23066j();
        if (j != 0) {
            bitmap2 = m23152A0(bitmap2, j);
        }
        m23074x(xVar, bitmap2, 89, false);
    }

    public final void m23130Q(C5337d dVar) {
        String f = dVar.m23225f();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        C7907b.m14368e(f, options);
        options.inSampleSize = C7907b.m14371b(options, 640, 640);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = null;
        try {
            InputStream o2 = C7389v0.m16599o2(f);
            bitmap = BitmapFactory.decodeStream(o2, null, options);
            if (o2 != null) {
                o2.close();
            }
        } catch (Throwable th) {
            Log.m14725e("Cannot compress photo", th, new Object[0]);
        }
        if (bitmap == null) {
            m23138I(dVar, -2, "bitmap == null");
            return;
        }
        Bitmap u0 = m23079u0(bitmap, C7389v0.m16581t0(f));
        if (u0.getWidth() != u0.getHeight()) {
            u0 = m23147D(u0);
        }
        Bitmap bitmap2 = u0;
        if (Math.max(bitmap2.getWidth(), bitmap2.getHeight()) > 640) {
            bitmap2 = C7907b.m14350w(bitmap2, 640, 640, false, true, true);
        }
        m23074x(dVar, bitmap2, 89, false);
    }

    public final void m23129R(C5335c cVar) {
        final Bitmap bitmap;
        boolean z;
        InputStream o2;
        ImageDecoder.Source source;
        String f = cVar.m23225f();
        Uri parse = f.startsWith("content://") ? Uri.parse(f) : null;
        boolean y1 = C7389v0.m16560y1(f);
        boolean z2 = false;
        final boolean z3 = cVar.m23217l() || (!y1 && m23121Z(f, parse));
        int o = cVar.m23214o() != 0 ? cVar.m23214o() : 1280;
        boolean z4 = C4868i.m24726c2().m24805R2() && cVar.m23213p();
        if (Build.VERSION.SDK_INT < 28 || o > 320 || cVar.m23216m() != null || cVar.m23215n() != null) {
            bitmap = null;
        } else {
            if (parse != null) {
                source = ImageDecoder.createSource(C1379j0.m37315n().getContentResolver(), parse);
            } else {
                source = ImageDecoder.createSource(new File(f));
            }
            bitmap = ImageDecoder.decodeBitmap(source, new C5367b(cVar, o, z3));
        }
        if (bitmap == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            if (!cVar.m23211r()) {
                o2 = C7389v0.m16599o2(f);
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(o2, null, options);
                    options.inSampleSize = C7907b.m14370c(options.outWidth, options.outHeight, o, o);
                    if (o2 != null) {
                        o2.close();
                    }
                } finally {
                }
            }
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            o2 = C7389v0.m16599o2(f);
            try {
                bitmap = cVar.m23220B(o2, options, f);
                if (o2 != null) {
                    o2.close();
                }
                z = true;
            } finally {
            }
        } else {
            z = false;
        }
        if (bitmap == null) {
            m23138I(cVar, -2, "Original image has failed to read");
            return;
        }
        if (cVar.m23207v(z)) {
            Bitmap A = cVar.m23221A(bitmap, z);
            if (A == null) {
                bitmap.recycle();
                m23138I(cVar, -2, "processedBitmap == null");
                return;
            } else if (A != bitmap) {
                bitmap.recycle();
                bitmap = A;
            }
        }
        Bitmap w = Math.max(bitmap.getWidth(), bitmap.getHeight()) > o ? C7907b.m14350w(bitmap, o, o, false, true, !z4) : bitmap;
        if (z3 && !cVar.m23217l()) {
            try {
                if (w.isMutable()) {
                    Canvas canvas = new Canvas(w);
                    canvas.drawColor(-1, PorterDuff.Mode.DST_OVER);
                    C7389v0.m16571v2(canvas);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(w.getWidth(), w.getHeight(), w.getConfig());
                    Canvas canvas2 = new Canvas(createBitmap);
                    canvas2.drawBitmap(w, 0.0f, 0.0f, (Paint) null);
                    canvas2.drawColor(-1, PorterDuff.Mode.DST_OVER);
                    try {
                        C7389v0.m16571v2(canvas2);
                        if (!z4) {
                            C7389v0.m16575u2(bitmap);
                        }
                    } catch (Throwable unused) {
                    }
                    w = createBitmap;
                }
            } catch (Throwable unused2) {
            }
        }
        int i = cVar.m23211r() ? 100 : y1 ? 92 : f17629i;
        if (z3 && cVar.m23217l()) {
            z2 = true;
        }
        m23074x(cVar, w, i, z2);
        if (z4) {
            C4383l.m28059a().m28057c(new Runnable() {
                @Override
                public final void run() {
                    C7389v0.m16739E2(bitmap, z3);
                }
            }, 750);
        }
    }

    public final void m23128S(C5372x xVar, String str, int i) {
        ImageDecoder.Source source;
        Bitmap bitmap = null;
        Uri parse = str.startsWith("content://") ? Uri.parse(str) : null;
        boolean Z = m23121Z(str, parse);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (parse != null) {
                    source = ImageDecoder.createSource(C1379j0.m37315n().getContentResolver(), parse);
                } else {
                    source = ImageDecoder.createSource(new File(str));
                }
                m23074x(xVar, ImageDecoder.decodeBitmap(source, new C5369c()), 89, Z);
            } catch (Throwable th) {
                Log.m14725e("Cannot compress photo", th, new Object[0]);
                m23138I(xVar, -2, "Cannot compress photo, see logs for details");
            }
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            options.inJustDecodeBounds = true;
            if (parse != null) {
                InputStream openInputStream = C1379j0.m37309q().getContentResolver().openInputStream(parse);
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
                C7907b.m14368e(str, options);
            }
            options.inSampleSize = C7907b.m14371b(options, 90, 90);
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                InputStream o2 = C7389v0.m16599o2(str);
                bitmap = BitmapFactory.decodeStream(o2, null, options);
                if (o2 != null) {
                    o2.close();
                }
            } catch (Throwable th4) {
                Log.m14725e("Cannot compress photo", th4, new Object[0]);
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                m23138I(xVar, -2, "bitmap == null");
                return;
            }
            if (Math.max(bitmap2.getWidth(), bitmap2.getHeight()) > 90) {
                bitmap2 = C7907b.m14350w(bitmap2, 90, 90, false, true, true);
            }
            m23074x(xVar, m23079u0(bitmap2, C7389v0.m16581t0(str)), 89, Z);
        }
    }

    public final void m23127T(C5372x xVar, String str, int i) {
        if (Thread.currentThread() != m23075w0()) {
            m23075w0().m28050h(Message.obtain(m23075w0().m28053d(), 1, i, 0, new Object[]{xVar, str}), 0L);
            return;
        }
        try {
            int l = xVar.m23064l();
            if (l == 0) {
                m23128S(xVar, str, i);
            } else if (l == 1) {
                m23126U(xVar, str, i);
            } else if (l == 2) {
                m23131P(xVar, str, i);
            } else {
                throw new IllegalArgumentException("type == " + xVar.m23064l());
            }
        } catch (Throwable th) {
            Log.m14725e("Cannot generate thumb type:%d", th, Integer.valueOf(xVar.m23064l()));
            m23138I(xVar, -2, "Failed to generate thumb, see logs for details");
        }
    }

    public final void m23126U(id.C5372x r8, java.lang.String r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23126U(id.x, java.lang.String, int):void");
    }

    public final C9132z m23125V() {
        if (this.f17635f == null) {
            synchronized (this) {
                if (this.f17635f == null) {
                    C9132z.C9133a aVar = new C9132z.C9133a();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    this.f17635f = aVar.m10254b(10L, timeUnit).m10256H(10L, timeUnit).m10257G(10L, TimeUnit.MINUTES).m10255a();
                }
            }
        }
        return this.f17635f;
    }

    public ThreadPoolExecutor m23124W() {
        if (this.f17637h == null) {
            synchronized (this) {
                if (this.f17637h == null) {
                    this.f17637h = new ThreadPoolExecutor(1, 4, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
                }
            }
        }
        return this.f17637h;
    }

    public C5340e0.C5343c m23122Y(String str) {
        return m23140G0().m23189m(str);
    }

    public final boolean m23121Z(String str, Uri uri) {
        try {
            String v0 = C7389v0.m16573v0(str);
            if (!"png".equals(v0) && !"webp".equals(v0)) {
                if (uri == null) {
                    return false;
                }
                String queryParameter = uri.getQueryParameter("mimeType");
                if (queryParameter != null && (queryParameter.equals("image/webp") || queryParameter.equals("image/png"))) {
                    return true;
                }
                String queryParameter2 = uri.getQueryParameter("fileName");
                if (queryParameter2 != null) {
                    queryParameter2 = C7389v0.m16573v0(queryParameter2);
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
            Log.m14723e(th);
            return false;
        }
    }

    public final AbstractC9084f m23085r0(long j, String str, String str2, boolean z) {
        return new C5366a(j, str, str2, z);
    }

    public final void m23077v0(Message message) {
        int i = message.what;
        if (i == 0) {
            C5335c cVar = (C5335c) message.obj;
            try {
                m23129R(cVar);
            } catch (Throwable th) {
                Log.m14725e("Cannot generate photo", th, new Object[0]);
                m23138I(cVar, -1, "Unknown error, see logs for details");
            }
        } else if (i == 1) {
            Object[] objArr = (Object[]) message.obj;
            m23127T((C5372x) objArr[0], (String) objArr[1], message.arg1);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i != 3) {
            switch (i) {
                case 5:
                    Object[] objArr2 = (Object[]) message.obj;
                    m23145E(C5063c.m24140f(message.arg1, message.arg2), (String) objArr2[0], (String) objArr2[1]);
                    objArr2[0] = null;
                    objArr2[1] = null;
                    return;
                case 6:
                    Object[] objArr3 = (Object[]) message.obj;
                    m23070z((String) objArr3[0], (String) objArr3[1], C5063c.m24140f(message.arg1, message.arg2), (String) objArr3[2]);
                    objArr3[0] = null;
                    objArr3[1] = null;
                    return;
                case 7:
                    Object[] objArr4 = (Object[]) message.obj;
                    m23153A((String) objArr4[0], (String) objArr4[1], C5063c.m24140f(message.arg1, message.arg2), (String) objArr4[2]);
                    objArr4[0] = null;
                    objArr4[1] = null;
                    return;
                case 8:
                    Object[] objArr5 = (Object[]) message.obj;
                    m23141G(C5063c.m24140f(message.arg1, message.arg2), (String) objArr5[0], (TdApi.LanguagePackString[]) objArr5[1], (String) objArr5[2]);
                    objArr5[0] = null;
                    objArr5[1] = null;
                    objArr5[2] = null;
                    return;
                case 9:
                    Object[] objArr6 = (Object[]) message.obj;
                    m23139H(C5063c.m24140f(message.arg1, message.arg2), ((Integer) objArr6[0]).intValue(), ((Integer) objArr6[1]).intValue(), (String) objArr6[2], (String) objArr6[3]);
                    objArr6[0] = null;
                    objArr6[1] = null;
                    objArr6[2] = null;
                    return;
                case 10:
                    Object[] objArr7 = (Object[]) message.obj;
                    m23132O((String) objArr7[0], (String) objArr7[1], C5063c.m24140f(message.arg1, message.arg2), (String) objArr7[2]);
                    objArr7[0] = null;
                    objArr7[1] = null;
                    return;
                default:
                    return;
            }
        } else {
            C5337d dVar = (C5337d) message.obj;
            try {
                m23130Q(dVar);
            } catch (Throwable th2) {
                Log.m14725e("Cannot generate avatar", th2, new Object[0]);
                m23138I(dVar, -1, "Unknown error, see logs for details");
            }
        }
    }

    public final void m23076w(long j) {
        AbstractC9080e remove = this.f17636g.remove(Long.valueOf(j));
        if (remove != null) {
            remove.cancel();
        }
        AbstractC5333b bVar = this.f17634e.get(Long.valueOf(j));
        if (bVar != null) {
            this.f17634e.remove(Long.valueOf(j));
            bVar.m23229b();
        }
    }

    public final C4384m m23075w0() {
        if (this.f17631b == null) {
            synchronized (this) {
                if (this.f17631b == null) {
                    this.f17631b = new C5371e(this);
                }
            }
        }
        return this.f17631b;
    }

    public final void m23074x(AbstractC5333b bVar, Bitmap bitmap, int i, boolean z) {
        boolean z2 = true;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(bVar.m23228c());
            z2 = true ^ bitmap.compress(C7389v0.m16722J(z), i, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            Log.m14725e("Cannot compress image", th, new Object[0]);
        }
        if (z2) {
            m23138I(bVar, -2, "Image has failed to compress");
        } else {
            m23136K(bVar);
        }
    }

    public final boolean m23073x0(long j, String str, String str2, String str3, boolean z) {
        if (C5070i.m24061i(str2)) {
            return false;
        }
        AbstractC9080e v = m23125V().m10268v(new C9069b0.C9070a().m10553f(str2).m10558a());
        synchronized (this) {
            if (this.f17636g.remove(Long.valueOf(j)) == null) {
                return false;
            }
            this.f17636g.put(Long.valueOf(j), v);
            Log.m14721i(32, "Redirecting HTTP request...\nurl:%s\nnewUrl:%s", str, str2);
            v.mo4997t(m23085r0(j, str2, str3, z));
            return true;
        }
    }

    public boolean m23072y(long r19, java.lang.String r21, p095gc.AbstractC4537a0 r22, java.lang.String r23, int r24, java.util.concurrent.atomic.AtomicBoolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5365w.m23072y(long, java.lang.String, gc.a0, java.lang.String, int, java.util.concurrent.atomic.AtomicBoolean):boolean");
    }

    public void m23071y0(final String str) {
        if (str != null) {
            C7907b.m14362k().m14361l(new Runnable() {
                @Override
                public final void run() {
                    C5365w.m23089p0(str);
                }
            });
        }
    }

    public final void m23070z(final String str, final String str2, final long j, final String str3) {
        if (Thread.currentThread() != m23075w0()) {
            m23075w0().m28050h(Message.obtain(m23075w0().m28053d(), 6, C5063c.m24133m(j), C5063c.m24132n(j), new Object[]{str, str2, str3}), 0L);
            return;
        }
        int lastIndexOf = str2.lastIndexOf(44);
        final String substring = str2.substring(0, lastIndexOf);
        String substring2 = str2.substring(lastIndexOf + 1);
        int indexOf = substring2.indexOf(95);
        if (indexOf != -1) {
            substring2 = substring2.substring(0, indexOf);
        }
        final int s = C5070i.m24051s(substring2);
        m23124W().execute(new Runnable() {
            @Override
            public final void run() {
                C5365w.this.m23117b0(substring, j, str3, s, str, str2);
            }
        });
    }

    public final boolean m23069z0(long j, String str, String str2, boolean z) {
        return m23073x0(j, str, m23123X(str), str2, z);
    }
}
