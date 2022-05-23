package org.thunderdog.challegram;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Message;
import ce.a0;
import ce.j0;
import db.f;
import gd.m;
import ib.i;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kb.j;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;

public class Log {
    private static final int ACTION_DELETE_ALL = 3;
    private static final int ACTION_GET_LOG_FILES = 2;
    private static final int ACTION_LOG_CLOSE = 1;
    private static final int ACTION_LOG_TO_FILE = 0;
    private static final int BLOB_CAUSE_LIMIT = 5;
    public static final String CALL_PREFIX = "call.";
    public static final String CRASH_PREFIX = "crash.";
    public static final int LEVEL_ASSERT = 0;
    public static final int LEVEL_DEBUG = 4;
    public static final int LEVEL_ERROR = 1;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_VERBOSE = 5;
    public static final int LEVEL_WARNING = 2;
    public static final String LOG_TAG = "tgx";
    public static final int RUNTIME_NOT_ASYNC = 1;
    public static final int SETTING_ANDROID_LOG = 1;
    public static final int SETTING_DISABLE_FULLY = 2;
    public static final int TAG_CRASH = 256;
    public static final int TAG_FCM = 4;
    public static final int TAG_IMAGE_LOADER = 32;
    public static final int TAG_INTRO = 16;
    public static final int TAG_MESSAGES_LOADER = 8;
    public static final int TAG_NETWORK_STATE = 1;
    public static final int TAG_SPEED_TEXT = 64;
    public static final int TAG_VOIP = 2;
    private static long capturedErrors;
    private static long capturedWarnings;
    private static boolean isCapturing;
    private static int level;
    private static boolean loaded;
    private static lb.d<c> outputListeners;
    private static m pool;
    private static int runtimeFlags;
    private static int settings;
    private static long tags;
    public static final int TAG_ACCOUNTS = 2097152;
    public static final int TAG_PLAYER = 524288;
    public static final int TAG_NDK = 1048576;
    public static final int TAG_CONTACT = 131072;
    public static final int TAG_VIDEO = 16384;
    public static final int TAG_LUX = 8192;
    public static final int TAG_COMPRESS = 65536;
    public static final int TAG_PAINT = 262144;
    public static final int TAG_VOICE = 2048;
    public static final int TAG_ROUND = 32768;
    public static final int TAG_GIF_LOADER = 512;
    public static final int TAG_YOUTUBE = 128;
    public static final int TAG_CAMERA = 1024;
    public static final int TAG_EMOJI = 4096;
    public static final int TAG_TDLIB_FILES = 536870912;
    public static final int TAG_TDLIB_OPTIONS = 1073741824;
    public static final int[] TAGS = {4, TAG_ACCOUNTS, TAG_PLAYER, TAG_NDK, TAG_CONTACT, TAG_VIDEO, TAG_LUX, TAG_COMPRESS, TAG_PAINT, TAG_VOICE, TAG_ROUND, 16, 1, 2, 8, TAG_GIF_LOADER, 32, 64, TAG_YOUTUBE, TAG_CAMERA, TAG_EMOJI, TAG_TDLIB_FILES, TAG_TDLIB_OPTIONS};

    public class a extends m {
        public a(String str) {
            super(str);
        }

        @Override
        public void f(Message message) {
            synchronized (Log.class) {
                int i10 = message.what;
                if (i10 == 0) {
                    Log.logToFileImpl(message.arg1, message.arg2, (String) message.obj);
                } else if (i10 == 1) {
                    Log.closeLogImpl();
                } else if (i10 == 2) {
                    ((j) message.obj).a(Log.getLogFilesImpl());
                } else if (i10 == 3) {
                    Object[] objArr = (Object[]) message.obj;
                    Log.deleteAllImpl((b) objArr[0], (j) objArr[1], (j) objArr[2]);
                    objArr[0] = null;
                    objArr[1] = null;
                    objArr[2] = null;
                }
            }
        }
    }

    public static class b {
        public final List<File> f19990a;
        public long f19991b;
        public long f19992c;
        public long f19993d;

        public b(List<File> list, long j10, long j11, long j12) {
            this.f19990a = list;
            this.f19991b = j10;
            this.f19992c = j11;
            this.f19993d = j12;
        }

        public boolean a() {
            return this.f19990a.isEmpty();
        }
    }

    public interface c {
        void D6(int i10, int i11, String str, Throwable th);

        void Q6();
    }

    public static class d {
        public final String f19994a;
        public final String f19995b;
        public final String f19996c;
        public final StackTraceElement[] f19997d;
        public final d f19998e;

        public d(String str, String str2, String str3, StackTraceElement[] stackTraceElementArr, d dVar) {
            this.f19994a = str;
            this.f19995b = str2;
            this.f19996c = str3;
            this.f19997d = stackTraceElementArr;
            this.f19998e = dVar;
        }

        public static void a(StringBuilder sb2, d dVar, int i10) {
            if (i10 > 0) {
                sb2.append("\n\n=== Cause #");
                sb2.append(i10);
                sb2.append("===\n");
            }
            sb2.append(dVar.f19994a);
            if (!i.i(dVar.f19995b) || !i.i(dVar.f19996c)) {
                sb2.append(": ");
                if (!i.i(dVar.f19995b)) {
                    sb2.append(dVar.f19995b);
                    if (!i.i(dVar.f19996c)) {
                        sb2.append(" | ");
                        sb2.append(dVar.f19996c);
                    }
                } else if (!i.i(dVar.f19996c)) {
                    sb2.append(dVar.f19996c);
                }
            }
            sb2.append("\nStack trace:\n");
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(dVar.f19997d);
            sb2.append(Log.getStackTrace(runtimeException));
            d dVar2 = dVar.f19998e;
            if (dVar2 != null) {
                a(sb2, dVar2, i10 + 1);
            }
        }

        public boolean equals(Object obj) {
            d dVar;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar2 = (d) obj;
            if (i.c(this.f19994a, dVar2.f19994a) && i.c(this.f19995b, dVar2.f19995b) && i.c(this.f19996c, dVar2.f19996c) && Arrays.equals(this.f19997d, dVar2.f19997d)) {
                d dVar3 = this.f19998e;
                if (dVar3 == null && dVar2.f19998e == null) {
                    return true;
                }
                if (dVar3 != null && (dVar = dVar2.f19998e) != null && dVar3.equals(dVar)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a(sb2, this, 0);
            return sb2.toString();
        }
    }

    public static void a(int i10, String str, Object... objArr) {
        log(i10, 0, str, objArr);
    }

    public static void addOutputListener(c cVar) {
        if (outputListeners == null) {
            synchronized (Log.class) {
                if (outputListeners == null) {
                    outputListeners = new lb.d<>(true);
                }
            }
        }
        outputListeners.add(cVar);
    }

    public static int blobSize(Throwable th) {
        return blobSize(th, true);
    }

    public static void bug(String str, Object... objArr) {
        e(str, generateException(3), objArr);
    }

    public static boolean checkLogLevel(int i10) {
        return i10 <= getLogLevel();
    }

    private static boolean checkPermission(int i10, long j10) {
        if (!loaded) {
            load();
        }
        if (isCapturing || level >= j10) {
            if (i10 != 0) {
                long j11 = i10;
                if ((tags & j11) == j11 || j10 <= 2) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean checkSetting(int i10) {
        if (!loaded) {
            load();
        }
        return (settings & i10) == i10;
    }

    public static void close() {
        boolean z10;
        m mVar;
        synchronized (Log.class) {
            z10 = true;
            if (!isCapturing) {
                if ((runtimeFlags & 1) != 0 || (mVar = pool) == null) {
                    closeLogImpl();
                } else {
                    mVar.h(Message.obtain(mVar.d(), 1), 0L);
                }
                z10 = false;
            }
        }
        if (z10) {
            endCapture();
        }
    }

    public static native void closeLogImpl();

    public static void critical(String str, Object... objArr) {
        log(0, 1, str, objArr);
    }

    public static void d(int i10, String str, Object... objArr) {
        log(i10, 4, str, objArr);
    }

    public static void deleteAll(b bVar, j<b> jVar, j<b> jVar2) {
        m mVar;
        close();
        synchronized (Log.class) {
            if ((runtimeFlags & 1) != 0 || preparePool() == null || (mVar = pool) == null) {
                deleteAllImpl(bVar, jVar, jVar2);
            } else {
                mVar.h(Message.obtain(mVar.d(), 3, new Object[]{bVar, jVar, jVar2}), 0L);
            }
        }
    }

    public static void deleteAllImpl(b bVar, j<b> jVar, j<b> jVar2) {
        for (int size = bVar.f19990a.size() - 1; size >= 0; size--) {
            File file = bVar.f19990a.get(size);
            long length = file.length();
            boolean startsWith = file.getName().startsWith(CRASH_PREFIX);
            if (file.delete()) {
                if (startsWith) {
                    bVar.f19992c--;
                } else {
                    bVar.f19991b--;
                }
                bVar.f19993d -= length;
                bVar.f19990a.remove(size);
                if (jVar2 != null) {
                    jVar2.a(bVar);
                }
            }
        }
        if (jVar != null) {
            jVar.a(getLogFilesImpl());
        }
    }

    public static boolean deleteFile(File file) {
        boolean delete;
        if (isCapturing()) {
            return false;
        }
        close();
        synchronized (Log.class) {
            delete = file.delete();
        }
        if (delete) {
            notifyLogFilesAltered();
        }
        return delete;
    }

    public static void e(int i10, String str, Object... objArr) {
        log(i10, 1, str, objArr);
    }

    public static String endCapture() {
        synchronized (Log.class) {
            String str = null;
            if (!isCapturing) {
                return null;
            }
            isCapturing = false;
            resetCapturedCounters();
            String endCaptureImpl = endCaptureImpl();
            if (!endCaptureImpl.isEmpty()) {
                str = endCaptureImpl;
            }
            return str;
        }
    }

    private static native String endCaptureImpl();

    public static void fixme() {
        throw new AssertionError("FIXME");
    }

    public static RuntimeException generateException() {
        return generateException(1);
    }

    public static RuntimeException generateSingleLineException() {
        return generateException(1);
    }

    private static int getAndroidPriority(int i10) {
        if (i10 == 0) {
            return 7;
        }
        if (i10 == 1) {
            return 6;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 2;
        }
        throw new AssertionError(i10);
    }

    public static long getCapturedErrors() {
        return capturedErrors;
    }

    public static long getCapturedWarnings() {
        return capturedWarnings;
    }

    private static native String getDeviceInformation();

    public static String getDeviceInformationString() {
        return String.format(Locale.US, "App: %s\nSDK: %d (%s)\nManufacturer: %s\nModel: %s\nBrand: %s\nDisplay: %s\nProduct: %s\nFingerprint: %s\nScreen: %dx%d (%f)\n", "0.24.8.1519-arm64-v8a", Integer.valueOf(Build.VERSION.SDK_INT), f.a(), Build.MANUFACTURER, Build.MODEL, Build.BRAND, Build.DISPLAY, Build.PRODUCT, Build.FINGERPRINT, Integer.valueOf(a0.D()), Integer.valueOf(a0.B()), Float.valueOf(a0.h()));
    }

    public static File getLogDir() {
        File file = new File(j0.n().getFilesDir(), "logs");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        android.util.Log.e(LOG_TAG, "Couldn't open logs directory: " + file.getAbsolutePath());
        return null;
    }

    public static b getLogFiles() {
        b logFilesImpl;
        synchronized (Log.class) {
            logFilesImpl = getLogFilesImpl();
        }
        return logFilesImpl;
    }

    public static b getLogFilesImpl() {
        File[] listFiles;
        File logDir = getLogDir();
        if (logDir == null || (listFiles = logDir.listFiles()) == null) {
            return null;
        }
        Arrays.sort(listFiles, oc.m.f19408a);
        ArrayList arrayList = new ArrayList(listFiles.length);
        long j10 = 0;
        long j11 = 0;
        for (File file : listFiles) {
            String name = file.getName();
            if (!name.startsWith("tdlib_log.txt")) {
                arrayList.add(file);
                if (name.startsWith(CRASH_PREFIX)) {
                    j11++;
                } else {
                    j10++;
                }
            }
        }
        return new b(arrayList, j10, j11, v0.W0(arrayList));
    }

    public static int getLogLevel() {
        if (!loaded) {
            load();
        }
        return level;
    }

    public static native String getLogTag(int i10);

    public static native String getLogTagDescription(int i10);

    public static String getStackTrace(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            return stringWriter2;
        } catch (IOException unused) {
            return null;
        }
    }

    private static boolean hasListeners() {
        if (outputListeners != null) {
            return true;
        }
        synchronized (Log.class) {
            return outputListeners != null;
        }
    }

    public static void i(int i10, String str, Object... objArr) {
        log(i10, 3, str, objArr);
    }

    public static void initLibraries(Context context) {
    }

    public static boolean isCapturing() {
        boolean z10;
        synchronized (Log.class) {
            z10 = isCapturing;
        }
        return z10;
    }

    public static boolean isEnabled(int i10) {
        if (!loaded) {
            load();
        }
        long j10 = i10;
        return (tags & j10) == j10;
    }

    public static int lambda$getLogFilesImpl$0(File file, File file2) {
        int i10 = (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        return i10 < 0 ? 1 : -1;
    }

    private static void load() {
        if (!loaded) {
            N.init();
            load(he.i.c2().n3());
        }
    }

    public static void log(int i10, int i11, String str, Throwable th, Object... objArr) {
        String str2;
        String str3;
        if (!loaded) {
            load();
        }
        boolean checkPermission = checkPermission(i10, i11);
        if (checkPermission) {
            if (objArr.length != 0) {
                str = String.format(Locale.US, str, objArr);
            }
            if ((settings & 1) != 0) {
                int androidPriority = getAndroidPriority(i11);
                String logTag = i10 != 0 ? getLogTag(i10) : null;
                if (logTag != null) {
                    str3 = "[" + logTag + "] " + str;
                } else {
                    str3 = str;
                }
                if (checkPermission) {
                    if (th != null) {
                        switch (androidPriority) {
                            case 2:
                                android.util.Log.v(LOG_TAG, str3, th);
                                break;
                            case 3:
                                android.util.Log.d(LOG_TAG, str3, th);
                                break;
                            case 4:
                                android.util.Log.i(LOG_TAG, str3, th);
                                break;
                            case 5:
                                android.util.Log.w(LOG_TAG, str3, th);
                                break;
                            case 6:
                            case 7:
                                android.util.Log.e(LOG_TAG, str3, th);
                                break;
                        }
                    } else {
                        android.util.Log.println(androidPriority, LOG_TAG, str3);
                    }
                }
            }
            if (checkPermission && ((settings & 2) == 0 || isCapturing)) {
                if (th != null) {
                    StringBuilder sb2 = new StringBuilder(str);
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    toStringBuilder(th, sb2);
                    str2 = sb2.toString();
                } else {
                    str2 = str;
                }
                logToFile(i10, i11, str2, (runtimeFlags & 1) == 0);
                if (isCapturing) {
                    if (i11 == 1) {
                        capturedErrors++;
                    } else if (i11 == 2) {
                        capturedWarnings++;
                    }
                }
            }
            notifyOutputListeners(i10, i11, str, th);
            if (i11 == 0 && !isCapturing) {
                throw new AssertionError(str);
            }
        }
    }

    public static void logExternally(String str, Throwable th) {
    }

    private static void logToFile(int i10, int i11, String str, boolean z10) {
        preparePool();
        m mVar = pool;
        if (mVar == null || !z10) {
            synchronized (Log.class) {
                logToFileImpl(i10, i11, str);
            }
            return;
        }
        mVar.h(Message.obtain(mVar.d(), 0, i10, i11, str), 0L);
    }

    public static native void logToFileImpl(int i10, int i11, String str);

    public static boolean needLog(int i10, int i11) {
        return isEnabled(i10) && checkLogLevel(i11);
    }

    public static boolean needMeasureLaunchSpeed() {
        return checkLogLevel(5);
    }

    private static void notifyLogFilesAltered() {
        if (hasListeners()) {
            Iterator<c> it = outputListeners.iterator();
            while (it.hasNext()) {
                it.next().Q6();
            }
        }
    }

    private static void notifyOutputListeners(int i10, int i11, String str, Throwable th) {
        if (hasListeners()) {
            Iterator<c> it = outputListeners.iterator();
            while (it.hasNext()) {
                it.next().D6(i10, i11, str, th);
            }
        }
    }

    private static m preparePool() {
        File logDir;
        if (pool == null) {
            synchronized (Log.class) {
                if (pool == null && (logDir = getLogDir()) != null) {
                    pool = new a("Log");
                    String property = System.getProperty("os.arch");
                    if (property == null) {
                        property = "";
                    }
                    setInternalValues(logDir.getAbsolutePath(), property, "0.24.8.1519-arm64-v8a", 1519, Build.VERSION.SDK_INT, f.a(), Build.MODEL, Build.BRAND, Build.DISPLAY, Build.PRODUCT, Build.MANUFACTURER, Build.FINGERPRINT, a0.D(), a0.B(), a0.h());
                }
            }
        }
        return pool;
    }

    public static void removeOutputListener(c cVar) {
        if (hasListeners()) {
            outputListeners.remove(cVar);
        }
    }

    private static void resetCapturedCounters() {
        capturedErrors = 0L;
        capturedWarnings = 0L;
    }

    public static void setEnabled(int i10, boolean z10) {
        setEnabledTags(ib.c.i(tags, i10, z10));
    }

    public static void setEnabledTags(long j10) {
        if (tags != j10) {
            tags = j10;
            setLogTagsImpl(j10);
            he.i.c2().w3("log_tags", j10);
        }
    }

    private static native void setInternalValues(String str, String str2, String str3, int i10, int i11, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, int i13, float f10);

    public static void setLogLevel(int i10) {
        if (getLogLevel() != i10) {
            level = i10;
            setLogLevelImpl(i10);
            setThirdPartyLogLevels(i10);
            he.i.c2().u3("log_level", i10);
        }
    }

    private static native void setLogLevelImpl(int i10);

    private static native void setLogTagsImpl(long j10);

    public static void setRuntimeFlag(int i10, boolean z10) {
        synchronized (Log.class) {
            int i11 = runtimeFlags;
            if (z10 != ((i11 & i10) == i10)) {
                runtimeFlags = ib.c.h(i11, i10, z10);
            }
        }
    }

    public static void setSetting(int i10, boolean z10) {
        if (z10 != checkSetting(i10)) {
            settings = ib.c.h(settings, i10, z10);
            he.i.c2().u3("log_settings", i10);
        }
    }

    private static void setThirdPartyLogLevels(int i10) {
        if (i10 == 2) {
            x9.i.f(2);
        } else if (i10 == 3 || i10 == 4) {
            x9.i.f(1);
        } else if (i10 != 5) {
            x9.i.f(3);
        } else {
            x9.i.f(0);
        }
    }

    public static boolean startCapture() {
        boolean z10;
        synchronized (Log.class) {
            if (!isCapturing) {
                isCapturing = startCaptureImpl();
            }
            z10 = isCapturing;
        }
        return z10;
    }

    private static native boolean startCaptureImpl();

    public static d throwableFromBlob(nb.a aVar) {
        String q10 = aVar.q();
        String q11 = aVar.d() ? aVar.q() : null;
        String q12 = aVar.d() ? aVar.q() : null;
        int m10 = aVar.m();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[m10];
        for (int i10 = 0; i10 < m10; i10++) {
            String str = "";
            String q13 = aVar.d() ? aVar.q() : str;
            String q14 = aVar.d() ? aVar.q() : str;
            if (aVar.d()) {
                str = aVar.q();
            }
            stackTraceElementArr[i10] = new StackTraceElement(q13, q14, str, aVar.m());
        }
        return new d(q10, q11, q12, stackTraceElementArr, aVar.d() ? throwableFromBlob(aVar) : null);
    }

    public static void toBlob(Throwable th, nb.a aVar) {
        toBlob(th, aVar, true);
    }

    public static String toString(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        toStringBuilder(th, sb2);
        return sb2.toString();
    }

    public static void toStringBuilder(Throwable th, StringBuilder sb2) {
        toStringBuilder(th, sb2, 0);
    }

    public static void unexpectedTdlibResponse(TdApi.Object object, Class<? extends TdApi.Function> cls, Class<?>... clsArr) {
        StringBuilder sb2 = new StringBuilder("Unexpected TDLib response");
        if (cls != null) {
            sb2.append(" for ");
            sb2.append(cls.getName());
        }
        sb2.append(". Expected: ");
        boolean z10 = true;
        for (Class<?> cls2 : clsArr) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cls2.getName());
        }
        sb2.append(" but received: ");
        Object obj = object;
        if (object == null) {
            obj = "null";
        }
        sb2.append(obj);
        String sb3 = sb2.toString();
        j0.z0(sb3, 1);
        a("%s", sb3);
    }

    public static void v(int i10, String str, Object... objArr) {
        log(i10, 5, str, objArr);
    }

    public static void w(int i10, String str, Object... objArr) {
        log(i10, 2, str, objArr);
    }

    public static void a(int i10, String str, Throwable th, Object... objArr) {
        log(i10, 0, str, th, objArr);
    }

    private static int blobSize(Throwable th, boolean z10) {
        StackTraceElement[] stackTrace;
        int x10 = nb.a.x(th.getClass().getName(), true) + 1 + nb.a.x(th.getMessage(), false) + 1 + nb.a.x(i.c(th.getMessage(), th.getLocalizedMessage()) ? null : th.getLocalizedMessage(), false) + 4;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            x10 += nb.a.x(stackTraceElement.getClassName(), false) + 1 + 1 + nb.a.x(stackTraceElement.getMethodName(), false) + 1 + nb.a.x(stackTraceElement.getFileName(), false) + 4;
        }
        if (z10) {
            int i10 = 5;
            do {
                Throwable cause = th.getCause();
                if (cause == th) {
                    cause = null;
                }
                if (cause != null && i10 - 1 == 0) {
                    while (cause.getCause() != null && cause.getCause() != cause) {
                        cause = cause.getCause();
                    }
                }
                th = cause;
                x10++;
                if (th == null) {
                    break;
                }
                x10 += blobSize(th, false);
            } while (i10 > 0);
        }
        return x10;
    }

    public static void critical(int i10, String str, Object... objArr) {
        log(i10, 1, str, objArr);
    }

    public static void d(int i10, String str, Throwable th, Object... objArr) {
        log(i10, 4, str, th, objArr);
    }

    public static void e(int i10, String str, Throwable th, Object... objArr) {
        log(i10, 1, str, th, objArr);
    }

    public static RuntimeException generateException(int i10) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e10) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            int length = stackTrace.length - i10;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
            e10.setStackTrace(stackTraceElementArr);
            return e10;
        }
    }

    public static RuntimeException generateSingleLineException(int i10) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e10) {
            e10.setStackTrace(new StackTraceElement[]{e10.getStackTrace()[i10]});
            return e10;
        }
    }

    public static void i(int i10, String str, Throwable th, Object... objArr) {
        log(i10, 3, str, th, objArr);
    }

    private static void toBlob(Throwable th, nb.a aVar, boolean z10) {
        aVar.L(th.getClass().getName());
        String message = th.getMessage();
        boolean z11 = !i.i(message);
        aVar.A(z11);
        if (z11) {
            aVar.L(message);
        }
        String localizedMessage = th.getLocalizedMessage();
        boolean z12 = !i.i(localizedMessage) && !localizedMessage.equals(message);
        aVar.A(z12);
        if (z12) {
            aVar.L(localizedMessage);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        aVar.H(stackTrace.length);
        if (stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                boolean z13 = !i.i(className);
                String methodName = stackTraceElement.getMethodName();
                boolean z14 = !i.i(methodName);
                String fileName = stackTraceElement.getFileName();
                boolean z15 = !i.i(fileName);
                int lineNumber = stackTraceElement.getLineNumber();
                aVar.A(z13);
                if (z13) {
                    aVar.L(className);
                }
                aVar.A(z14);
                if (z14) {
                    aVar.L(methodName);
                }
                aVar.A(z15);
                if (z15) {
                    aVar.L(fileName);
                }
                aVar.H(lineNumber);
            }
        }
        if (z10) {
            int i10 = 5;
            do {
                Throwable cause = th.getCause();
                if (cause == th) {
                    cause = null;
                }
                if (cause != null && i10 - 1 == 0) {
                    while (cause.getCause() != null && cause.getCause() != cause) {
                        cause = cause.getCause();
                    }
                }
                th = cause;
                aVar.A(th != null);
                if (th != null) {
                    toBlob(th, aVar, false);
                } else {
                    return;
                }
            } while (i10 > 0);
        }
    }

    private static void toStringBuilder(Throwable th, StringBuilder sb2, int i10) {
        if (i10 != 0) {
            sb2.append('\n');
        }
        sb2.append("=== ");
        if (i10 != 0) {
            sb2.append("Cause #");
            sb2.append(i10);
        } else {
            sb2.append("Stack Trace Dump");
        }
        sb2.append(" ===\n");
        String message = th.getMessage();
        if (!i.i(message)) {
            sb2.append(message);
            sb2.append('\n');
        }
        sb2.append(getStackTrace(th));
        Throwable cause = th.getCause();
        if (cause != null && sb2.length() > 0) {
            toStringBuilder(cause, sb2, i10 + 1);
        }
    }

    public static void v(int i10, String str, Throwable th, Object... objArr) {
        log(i10, 5, str, th, objArr);
    }

    public static void w(int i10, String str, Throwable th, Object... objArr) {
        log(i10, 2, str, th, objArr);
    }

    public static void a(String str, Object... objArr) {
        log(0, 0, str, objArr);
    }

    public static void critical(int i10, String str, Throwable th, Object... objArr) {
        log(i10, 1, str, th, objArr);
    }

    public static void d(String str, Object... objArr) {
        log(0, 4, str, objArr);
    }

    public static void e(String str, Throwable th, Object... objArr) {
        log(0, 1, str, th, objArr);
    }

    public static void i(String str, Object... objArr) {
        log(0, 3, str, objArr);
    }

    public static void v(String str, Object... objArr) {
        log(0, 5, str, objArr);
    }

    public static void w(String str, Object... objArr) {
        log(0, 2, str, objArr);
    }

    public static void critical(String str, Throwable th, Object... objArr) {
        log(0, 1, str, th, objArr);
    }

    public static void d(String str, Throwable th, Object... objArr) {
        log(0, 4, str, th, objArr);
    }

    public static void e(Throwable th) {
        log(0, 1, "", th, new Object[0]);
    }

    public static void getLogFiles(j<b> jVar) {
        preparePool();
        m mVar = pool;
        if (mVar != null) {
            mVar.h(Message.obtain(mVar.d(), 2, jVar), 0L);
            return;
        }
        synchronized (Log.class) {
            jVar.a(getLogFilesImpl());
        }
    }

    public static void i(String str, Throwable th, Object... objArr) {
        log(0, 3, str, th, objArr);
    }

    public static void load(SharedPreferences sharedPreferences) {
        if (!loaded) {
            N.init();
            if (sharedPreferences == null) {
                settings = 1;
                level = 5;
                tags = 1048832L;
            } else {
                settings = sharedPreferences.getInt("log_settings", 0);
                level = sharedPreferences.getInt("log_level", 2);
                tags = sharedPreferences.getLong("log_tags", 2097412L);
            }
            setLogLevelImpl(level);
            setLogTagsImpl(tags);
            setThirdPartyLogLevels(level);
            loaded = true;
        }
    }

    public static void v(String str, Throwable th, Object... objArr) {
        log(0, 5, str, th, objArr);
    }

    public static void w(String str, Throwable th, Object... objArr) {
        log(0, 2, str, th, objArr);
    }

    public static void critical(Throwable th) {
        log(0, 1, "", th, new Object[0]);
    }

    public static void d(Throwable th) {
        log(0, 4, "", th, new Object[0]);
    }

    public static void e(int i10, Throwable th) {
        log(i10, 1, "", th, new Object[0]);
    }

    public static void i(Throwable th) {
        log(0, 3, "", th, new Object[0]);
    }

    public static void v(Throwable th) {
        log(0, 5, "", th, new Object[0]);
    }

    public static void w(Throwable th) {
        log(0, 2, "", th, new Object[0]);
    }

    public static void e(String str, Object... objArr) {
        log(0, 1, str, objArr);
    }

    public static void log(int i10, int i11, String str, Object... objArr) {
        log(i10, i11, str, null, objArr);
    }

    public static void log(int i10, String str, Object... objArr) {
        log(0, i10, str, objArr);
    }
}
