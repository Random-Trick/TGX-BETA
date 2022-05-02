package org.thunderdog.challegram;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Message;
import be.C1357a0;
import be.C1379j0;
import ge.C4868i;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nc.C7370m;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p037cb.C2064f;
import p082fd.C4384m;
import p108hb.C5063c;
import p108hb.C5070i;
import p139jb.AbstractC5918j;
import p154kb.C6227d;
import p181mb.C6810a;
import p316w9.C10007i;

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
    private static C6227d<AbstractC7880c> outputListeners;
    private static C4384m pool;
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

    public class C7878a extends C4384m {
        public C7878a(String str) {
            super(str);
        }

        @Override
        public void mo3052f(Message message) {
            synchronized (Log.class) {
                int i = message.what;
                if (i == 0) {
                    Log.logToFileImpl(message.arg1, message.arg2, (String) message.obj);
                } else if (i == 1) {
                    Log.closeLogImpl();
                } else if (i == 2) {
                    ((AbstractC5918j) message.obj).mo1330a(Log.getLogFilesImpl());
                } else if (i == 3) {
                    Object[] objArr = (Object[]) message.obj;
                    Log.deleteAllImpl((C7879b) objArr[0], (AbstractC5918j) objArr[1], (AbstractC5918j) objArr[2]);
                    objArr[0] = null;
                    objArr[1] = null;
                    objArr[2] = null;
                }
            }
        }
    }

    public static class C7879b {
        public final List<File> f25451a;
        public long f25452b;
        public long f25453c;
        public long f25454d;

        public C7879b(List<File> list, long j, long j2, long j3) {
            this.f25451a = list;
            this.f25452b = j;
            this.f25453c = j2;
            this.f25454d = j3;
        }

        public boolean m14707a() {
            return this.f25451a.isEmpty();
        }
    }

    public interface AbstractC7880c {
        void mo14706G6(int i, int i2, String str, Throwable th);

        void mo14705Q6();
    }

    public static class C7881d {
        public final String f25455a;
        public final String f25456b;
        public final String f25457c;
        public final StackTraceElement[] f25458d;
        public final C7881d f25459e;

        public C7881d(String str, String str2, String str3, StackTraceElement[] stackTraceElementArr, C7881d dVar) {
            this.f25455a = str;
            this.f25456b = str2;
            this.f25457c = str3;
            this.f25458d = stackTraceElementArr;
            this.f25459e = dVar;
        }

        public static void m14704a(StringBuilder sb2, C7881d dVar, int i) {
            if (i > 0) {
                sb2.append("\n\n=== Cause #");
                sb2.append(i);
                sb2.append("===\n");
            }
            sb2.append(dVar.f25455a);
            if (!C5070i.m24061i(dVar.f25456b) || !C5070i.m24061i(dVar.f25457c)) {
                sb2.append(": ");
                if (!C5070i.m24061i(dVar.f25456b)) {
                    sb2.append(dVar.f25456b);
                    if (!C5070i.m24061i(dVar.f25457c)) {
                        sb2.append(" | ");
                        sb2.append(dVar.f25457c);
                    }
                } else if (!C5070i.m24061i(dVar.f25457c)) {
                    sb2.append(dVar.f25457c);
                }
            }
            sb2.append("\nStack trace:\n");
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(dVar.f25458d);
            sb2.append(Log.getStackTrace(runtimeException));
            C7881d dVar2 = dVar.f25459e;
            if (dVar2 != null) {
                m14704a(sb2, dVar2, i + 1);
            }
        }

        public boolean equals(Object obj) {
            C7881d dVar;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7881d)) {
                return false;
            }
            C7881d dVar2 = (C7881d) obj;
            if (C5070i.m24067c(this.f25455a, dVar2.f25455a) && C5070i.m24067c(this.f25456b, dVar2.f25456b) && C5070i.m24067c(this.f25457c, dVar2.f25457c) && Arrays.equals(this.f25458d, dVar2.f25458d)) {
                C7881d dVar3 = this.f25459e;
                if (dVar3 == null && dVar2.f25459e == null) {
                    return true;
                }
                if (dVar3 != null && (dVar = dVar2.f25459e) != null && dVar3.equals(dVar)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            m14704a(sb2, this, 0);
            return sb2.toString();
        }
    }

    public static void m14740a(int i, String str, Object... objArr) {
        log(i, 0, str, objArr);
    }

    public static void addOutputListener(AbstractC7880c cVar) {
        if (outputListeners == null) {
            synchronized (Log.class) {
                if (outputListeners == null) {
                    outputListeners = new C6227d<>(true);
                }
            }
        }
        outputListeners.add(cVar);
    }

    public static int blobSize(Throwable th) {
        return blobSize(th, true);
    }

    public static void bug(String str, Object... objArr) {
        m14725e(str, generateException(3), objArr);
    }

    public static boolean checkLogLevel(int i) {
        return i <= getLogLevel();
    }

    private static boolean checkPermission(int i, long j) {
        if (!loaded) {
            load();
        }
        if (isCapturing || level >= j) {
            if (i != 0) {
                long j2 = i;
                if ((tags & j2) == j2 || j <= 2) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean checkSetting(int i) {
        if (!loaded) {
            load();
        }
        return (settings & i) == i;
    }

    public static void close() {
        boolean z;
        C4384m mVar;
        synchronized (Log.class) {
            z = true;
            if (!isCapturing) {
                if ((runtimeFlags & 1) != 0 || (mVar = pool) == null) {
                    closeLogImpl();
                } else {
                    mVar.m28050h(Message.obtain(mVar.m28053d(), 1), 0L);
                }
                z = false;
            }
        }
        if (z) {
            endCapture();
        }
    }

    public static native void closeLogImpl();

    public static void critical(String str, Object... objArr) {
        log(0, 1, str, objArr);
    }

    public static void m14733d(int i, String str, Object... objArr) {
        log(i, 4, str, objArr);
    }

    public static void deleteAll(C7879b bVar, AbstractC5918j<C7879b> jVar, AbstractC5918j<C7879b> jVar2) {
        C4384m mVar;
        close();
        synchronized (Log.class) {
            if ((runtimeFlags & 1) != 0 || preparePool() == null || (mVar = pool) == null) {
                deleteAllImpl(bVar, jVar, jVar2);
            } else {
                mVar.m28050h(Message.obtain(mVar.m28053d(), 3, new Object[]{bVar, jVar, jVar2}), 0L);
            }
        }
    }

    public static void deleteAllImpl(C7879b bVar, AbstractC5918j<C7879b> jVar, AbstractC5918j<C7879b> jVar2) {
        for (int size = bVar.f25451a.size() - 1; size >= 0; size--) {
            File file = bVar.f25451a.get(size);
            long length = file.length();
            boolean startsWith = file.getName().startsWith(CRASH_PREFIX);
            if (file.delete()) {
                if (startsWith) {
                    bVar.f25453c--;
                } else {
                    bVar.f25452b--;
                }
                bVar.f25454d -= length;
                bVar.f25451a.remove(size);
                if (jVar2 != null) {
                    jVar2.mo1330a(bVar);
                }
            }
        }
        if (jVar != null) {
            jVar.mo1330a(getLogFilesImpl());
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

    public static void m14727e(int i, String str, Object... objArr) {
        log(i, 1, str, objArr);
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

    private static int getAndroidPriority(int i) {
        if (i == 0) {
            return 7;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 2;
        }
        throw new AssertionError(i);
    }

    public static long getCapturedErrors() {
        return capturedErrors;
    }

    public static long getCapturedWarnings() {
        return capturedWarnings;
    }

    private static native String getDeviceInformation();

    public static String getDeviceInformationString() {
        return String.format(Locale.US, "App: %s\nSDK: %d (%s)\nManufacturer: %s\nModel: %s\nBrand: %s\nDisplay: %s\nProduct: %s\nFingerprint: %s\nScreen: %dx%d (%f)\n", "0.24.6.1506-arm64-v8a", Integer.valueOf(Build.VERSION.SDK_INT), C2064f.m35725a(), Build.MANUFACTURER, Build.MODEL, Build.BRAND, Build.DISPLAY, Build.PRODUCT, Build.FINGERPRINT, Integer.valueOf(C1357a0.m37551D()), Integer.valueOf(C1357a0.m37553B()), Float.valueOf(C1357a0.m37542h()));
    }

    public static File getLogDir() {
        File file = new File(C1379j0.m37315n().getFilesDir(), "logs");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        android.util.Log.e(LOG_TAG, "Couldn't open logs directory: " + file.getAbsolutePath());
        return null;
    }

    public static C7879b getLogFiles() {
        C7879b logFilesImpl;
        synchronized (Log.class) {
            logFilesImpl = getLogFilesImpl();
        }
        return logFilesImpl;
    }

    public static C7879b getLogFilesImpl() {
        File[] listFiles;
        File logDir = getLogDir();
        if (logDir == null || (listFiles = logDir.listFiles()) == null) {
            return null;
        }
        Arrays.sort(listFiles, C7370m.f23296a);
        ArrayList arrayList = new ArrayList(listFiles.length);
        long j = 0;
        long j2 = 0;
        for (File file : listFiles) {
            String name = file.getName();
            if (!name.startsWith("tdlib_log.txt")) {
                arrayList.add(file);
                if (name.startsWith(CRASH_PREFIX)) {
                    j2++;
                } else {
                    j++;
                }
            }
        }
        return new C7879b(arrayList, j, j2, C7389v0.m16669W0(arrayList));
    }

    public static int getLogLevel() {
        if (!loaded) {
            load();
        }
        return level;
    }

    public static native String getLogTag(int i);

    public static native String getLogTagDescription(int i);

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

    public static void m14721i(int i, String str, Object... objArr) {
        log(i, 3, str, objArr);
    }

    public static void initLibraries(Context context) {
    }

    public static boolean isCapturing() {
        boolean z;
        synchronized (Log.class) {
            z = isCapturing;
        }
        return z;
    }

    public static boolean isEnabled(int i) {
        if (!loaded) {
            load();
        }
        long j = i;
        return (tags & j) == j;
    }

    public static int lambda$getLogFilesImpl$0(File file, File file2) {
        int i = (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? 1 : -1;
    }

    private static void load() {
        if (!loaded) {
            C7888N.init();
            load(C4868i.m24726c2().m24637n3());
        }
    }

    public static void log(int i, int i2, String str, Throwable th, Object... objArr) {
        String str2;
        String str3;
        if (!loaded) {
            load();
        }
        boolean checkPermission = checkPermission(i, i2);
        if (checkPermission) {
            if (objArr.length != 0) {
                str = String.format(Locale.US, str, objArr);
            }
            if ((settings & 1) != 0) {
                int androidPriority = getAndroidPriority(i2);
                String logTag = i != 0 ? getLogTag(i) : null;
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
                logToFile(i, i2, str2, (runtimeFlags & 1) == 0);
                if (isCapturing) {
                    if (i2 == 1) {
                        capturedErrors++;
                    } else if (i2 == 2) {
                        capturedWarnings++;
                    }
                }
            }
            notifyOutputListeners(i, i2, str, th);
            if (i2 == 0 && !isCapturing) {
                throw new AssertionError(str);
            }
        }
    }

    public static void logExternally(String str, Throwable th) {
    }

    private static void logToFile(int i, int i2, String str, boolean z) {
        preparePool();
        C4384m mVar = pool;
        if (mVar == null || !z) {
            synchronized (Log.class) {
                logToFileImpl(i, i2, str);
            }
            return;
        }
        mVar.m28050h(Message.obtain(mVar.m28053d(), 0, i, i2, str), 0L);
    }

    public static native void logToFileImpl(int i, int i2, String str);

    public static boolean needLog(int i, int i2) {
        return isEnabled(i) && checkLogLevel(i2);
    }

    public static boolean needMeasureLaunchSpeed() {
        return checkLogLevel(5);
    }

    private static void notifyLogFilesAltered() {
        if (hasListeners()) {
            Iterator<AbstractC7880c> it = outputListeners.iterator();
            while (it.hasNext()) {
                it.next().mo14705Q6();
            }
        }
    }

    private static void notifyOutputListeners(int i, int i2, String str, Throwable th) {
        if (hasListeners()) {
            Iterator<AbstractC7880c> it = outputListeners.iterator();
            while (it.hasNext()) {
                it.next().mo14706G6(i, i2, str, th);
            }
        }
    }

    private static C4384m preparePool() {
        File logDir;
        if (pool == null) {
            synchronized (Log.class) {
                if (pool == null && (logDir = getLogDir()) != null) {
                    pool = new C7878a("Log");
                    String property = System.getProperty("os.arch");
                    if (property == null) {
                        property = "";
                    }
                    setInternalValues(logDir.getAbsolutePath(), property, "0.24.6.1506-arm64-v8a", 1506, Build.VERSION.SDK_INT, C2064f.m35725a(), Build.MODEL, Build.BRAND, Build.DISPLAY, Build.PRODUCT, Build.MANUFACTURER, Build.FINGERPRINT, C1357a0.m37551D(), C1357a0.m37553B(), C1357a0.m37542h());
                }
            }
        }
        return pool;
    }

    public static void removeOutputListener(AbstractC7880c cVar) {
        if (hasListeners()) {
            outputListeners.remove(cVar);
        }
    }

    private static void resetCapturedCounters() {
        capturedErrors = 0L;
        capturedWarnings = 0L;
    }

    public static void setEnabled(int i, boolean z) {
        setEnabledTags(C5063c.m24137i(tags, i, z));
    }

    public static void setEnabledTags(long j) {
        if (tags != j) {
            tags = j;
            setLogTagsImpl(j);
            C4868i.m24726c2().m24566w3("log_tags", j);
        }
    }

    private static native void setInternalValues(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, int i4, float f);

    public static void setLogLevel(int i) {
        if (getLogLevel() != i) {
            level = i;
            setLogLevelImpl(i);
            setThirdPartyLogLevels(i);
            C4868i.m24726c2().m24581u3("log_level", i);
        }
    }

    private static native void setLogLevelImpl(int i);

    private static native void setLogTagsImpl(long j);

    public static void setRuntimeFlag(int i, boolean z) {
        synchronized (Log.class) {
            int i2 = runtimeFlags;
            if (z != ((i2 & i) == i)) {
                runtimeFlags = C5063c.m24138h(i2, i, z);
            }
        }
    }

    public static void setSetting(int i, boolean z) {
        if (z != checkSetting(i)) {
            settings = C5063c.m24138h(settings, i, z);
            C4868i.m24726c2().m24581u3("log_settings", i);
        }
    }

    private static void setThirdPartyLogLevels(int i) {
        if (i == 2) {
            C10007i.m6264f(2);
        } else if (i == 3 || i == 4) {
            C10007i.m6264f(1);
        } else if (i != 5) {
            C10007i.m6264f(3);
        } else {
            C10007i.m6264f(0);
        }
    }

    public static boolean startCapture() {
        boolean z;
        synchronized (Log.class) {
            if (!isCapturing) {
                isCapturing = startCaptureImpl();
            }
            z = isCapturing;
        }
        return z;
    }

    private static native boolean startCaptureImpl();

    public static C7881d throwableFromBlob(C6810a aVar) {
        String q = aVar.m18922q();
        String q2 = aVar.m18935d() ? aVar.m18922q() : null;
        String q3 = aVar.m18935d() ? aVar.m18922q() : null;
        int m = aVar.m18926m();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[m];
        for (int i = 0; i < m; i++) {
            String str = "";
            String q4 = aVar.m18935d() ? aVar.m18922q() : str;
            String q5 = aVar.m18935d() ? aVar.m18922q() : str;
            if (aVar.m18935d()) {
                str = aVar.m18922q();
            }
            stackTraceElementArr[i] = new StackTraceElement(q4, q5, str, aVar.m18926m());
        }
        return new C7881d(q, q2, q3, stackTraceElementArr, aVar.m18935d() ? throwableFromBlob(aVar) : null);
    }

    public static void toBlob(Throwable th, C6810a aVar) {
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
        boolean z = true;
        for (Class<?> cls2 : clsArr) {
            if (z) {
                z = false;
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
        C1379j0.m37290z0(sb3, 1);
        m14738a("%s", sb3);
    }

    public static void m14716v(int i, String str, Object... objArr) {
        log(i, 5, str, objArr);
    }

    public static void m14711w(int i, String str, Object... objArr) {
        log(i, 2, str, objArr);
    }

    public static void m14741a(int i, String str, Throwable th, Object... objArr) {
        log(i, 0, str, th, objArr);
    }

    private static int blobSize(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        int x = C6810a.m18915x(th.getClass().getName(), true) + 1 + C6810a.m18915x(th.getMessage(), false) + 1 + C6810a.m18915x(C5070i.m24067c(th.getMessage(), th.getLocalizedMessage()) ? null : th.getLocalizedMessage(), false) + 4;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            x += C6810a.m18915x(stackTraceElement.getClassName(), false) + 1 + 1 + C6810a.m18915x(stackTraceElement.getMethodName(), false) + 1 + C6810a.m18915x(stackTraceElement.getFileName(), false) + 4;
        }
        if (z) {
            int i = 5;
            do {
                Throwable cause = th.getCause();
                if (cause == th) {
                    cause = null;
                }
                if (cause != null && i - 1 == 0) {
                    while (cause.getCause() != null && cause.getCause() != cause) {
                        cause = cause.getCause();
                    }
                }
                th = cause;
                x++;
                if (th == null) {
                    break;
                }
                x += blobSize(th, false);
            } while (i > 0);
        }
        return x;
    }

    public static void critical(int i, String str, Object... objArr) {
        log(i, 1, str, objArr);
    }

    public static void m14734d(int i, String str, Throwable th, Object... objArr) {
        log(i, 4, str, th, objArr);
    }

    public static void m14728e(int i, String str, Throwable th, Object... objArr) {
        log(i, 1, str, th, objArr);
    }

    public static RuntimeException generateException(int i) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length - i;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
            e.setStackTrace(stackTraceElementArr);
            return e;
        }
    }

    public static RuntimeException generateSingleLineException(int i) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            e.setStackTrace(new StackTraceElement[]{e.getStackTrace()[i]});
            return e;
        }
    }

    public static void m14722i(int i, String str, Throwable th, Object... objArr) {
        log(i, 3, str, th, objArr);
    }

    private static void toBlob(Throwable th, C6810a aVar, boolean z) {
        aVar.m18941L(th.getClass().getName());
        String message = th.getMessage();
        boolean z2 = !C5070i.m24061i(message);
        aVar.m18952A(z2);
        if (z2) {
            aVar.m18941L(message);
        }
        String localizedMessage = th.getLocalizedMessage();
        boolean z3 = !C5070i.m24061i(localizedMessage) && !localizedMessage.equals(message);
        aVar.m18952A(z3);
        if (z3) {
            aVar.m18941L(localizedMessage);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        aVar.m18945H(stackTrace.length);
        if (stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                boolean z4 = !C5070i.m24061i(className);
                String methodName = stackTraceElement.getMethodName();
                boolean z5 = !C5070i.m24061i(methodName);
                String fileName = stackTraceElement.getFileName();
                boolean z6 = !C5070i.m24061i(fileName);
                int lineNumber = stackTraceElement.getLineNumber();
                aVar.m18952A(z4);
                if (z4) {
                    aVar.m18941L(className);
                }
                aVar.m18952A(z5);
                if (z5) {
                    aVar.m18941L(methodName);
                }
                aVar.m18952A(z6);
                if (z6) {
                    aVar.m18941L(fileName);
                }
                aVar.m18945H(lineNumber);
            }
        }
        if (z) {
            int i = 5;
            do {
                Throwable cause = th.getCause();
                if (cause == th) {
                    cause = null;
                }
                if (cause != null && i - 1 == 0) {
                    while (cause.getCause() != null && cause.getCause() != cause) {
                        cause = cause.getCause();
                    }
                }
                th = cause;
                aVar.m18952A(th != null);
                if (th != null) {
                    toBlob(th, aVar, false);
                } else {
                    return;
                }
            } while (i > 0);
        }
    }

    private static void toStringBuilder(Throwable th, StringBuilder sb2, int i) {
        if (i != 0) {
            sb2.append('\n');
        }
        sb2.append("=== ");
        if (i != 0) {
            sb2.append("Cause #");
            sb2.append(i);
        } else {
            sb2.append("Stack Trace Dump");
        }
        sb2.append(" ===\n");
        String message = th.getMessage();
        if (!C5070i.m24061i(message)) {
            sb2.append(message);
            sb2.append('\n');
        }
        sb2.append(getStackTrace(th));
        Throwable cause = th.getCause();
        if (cause != null && sb2.length() > 0) {
            toStringBuilder(cause, sb2, i + 1);
        }
    }

    public static void m14717v(int i, String str, Throwable th, Object... objArr) {
        log(i, 5, str, th, objArr);
    }

    public static void m14712w(int i, String str, Throwable th, Object... objArr) {
        log(i, 2, str, th, objArr);
    }

    public static void m14738a(String str, Object... objArr) {
        log(0, 0, str, objArr);
    }

    public static void critical(int i, String str, Throwable th, Object... objArr) {
        log(i, 1, str, th, objArr);
    }

    public static void m14731d(String str, Object... objArr) {
        log(0, 4, str, objArr);
    }

    public static void m14725e(String str, Throwable th, Object... objArr) {
        log(0, 1, str, th, objArr);
    }

    public static void m14719i(String str, Object... objArr) {
        log(0, 3, str, objArr);
    }

    public static void m14714v(String str, Object... objArr) {
        log(0, 5, str, objArr);
    }

    public static void m14709w(String str, Object... objArr) {
        log(0, 2, str, objArr);
    }

    public static void critical(String str, Throwable th, Object... objArr) {
        log(0, 1, str, th, objArr);
    }

    public static void m14732d(String str, Throwable th, Object... objArr) {
        log(0, 4, str, th, objArr);
    }

    public static void m14723e(Throwable th) {
        log(0, 1, "", th, new Object[0]);
    }

    public static void getLogFiles(AbstractC5918j<C7879b> jVar) {
        preparePool();
        C4384m mVar = pool;
        if (mVar != null) {
            mVar.m28050h(Message.obtain(mVar.m28053d(), 2, jVar), 0L);
            return;
        }
        synchronized (Log.class) {
            jVar.mo1330a(getLogFilesImpl());
        }
    }

    public static void m14720i(String str, Throwable th, Object... objArr) {
        log(0, 3, str, th, objArr);
    }

    public static void load(SharedPreferences sharedPreferences) {
        if (!loaded) {
            C7888N.init();
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

    public static void m14715v(String str, Throwable th, Object... objArr) {
        log(0, 5, str, th, objArr);
    }

    public static void m14710w(String str, Throwable th, Object... objArr) {
        log(0, 2, str, th, objArr);
    }

    public static void critical(Throwable th) {
        log(0, 1, "", th, new Object[0]);
    }

    public static void m14730d(Throwable th) {
        log(0, 4, "", th, new Object[0]);
    }

    public static void m14726e(int i, Throwable th) {
        log(i, 1, "", th, new Object[0]);
    }

    public static void m14718i(Throwable th) {
        log(0, 3, "", th, new Object[0]);
    }

    public static void m14713v(Throwable th) {
        log(0, 5, "", th, new Object[0]);
    }

    public static void m14708w(Throwable th) {
        log(0, 2, "", th, new Object[0]);
    }

    public static void m14724e(String str, Object... objArr) {
        log(0, 1, str, objArr);
    }

    public static void log(int i, int i2, String str, Object... objArr) {
        log(i, i2, str, null, objArr);
    }

    public static void log(int i, String str, Object... objArr) {
        log(0, i, str, objArr);
    }
}
