package he;

import android.annotation.SuppressLint;
import android.os.Process;
import ce.j0;
import gd.w;
import ib.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.Log;

public class b {
    public static b f13806d;
    public a f13807a = new a();
    public Thread.UncaughtExceptionHandler f13808b;
    public volatile boolean f13809c;

    public static class a implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread thread, Throwable th) {
            b.d().e(thread, th);
        }
    }

    public static String c(long j10) {
        return Log.CRASH_PREFIX + "0.24.8.1519-arm64-v8a." + j10 + ".log";
    }

    public static b d() {
        if (f13806d == null) {
            f13806d = new b();
        }
        return f13806d;
    }

    public final File b(long j10) {
        String str;
        String path = j0.n().getFilesDir().getPath();
        if (path.charAt(path.length() - 1) == '/') {
            str = path + "logs/" + c(j10);
        } else {
            str = path + "/logs/" + c(j10);
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            return file;
        }
        return null;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void e(Thread thread, Throwable th) {
        f(null, thread, th);
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void f(String str, Thread thread, Throwable th) {
        if (!this.f13809c) {
            this.f13809c = true;
            if (th != null) {
                th.printStackTrace();
            }
            Log.setRuntimeFlag(1, true);
            StringBuilder sb2 = new StringBuilder();
            try {
                long e12 = i.c2().e1("crash_id_release", 0L) + 1;
                File b10 = b(e12);
                sb2.append(Log.getDeviceInformationString());
                sb2.append("\n\nCrashed on: ");
                sb2.append(w.I(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
                sb2.append("\nCrash comment: ");
                if (str == null) {
                    str = "Uncaught crash";
                }
                sb2.append(str);
                sb2.append("\nCrashed Thread: ");
                sb2.append(thread == null ? "null" : thread.getName());
                sb2.append("\n\n");
                sb2.append(Log.toString(th));
                String sb3 = sb2.toString();
                if (b10 == null) {
                    Log.e((int) Log.TAG_CRASH, "crashFile == null", new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(b10);
                        fileOutputStream.write(sb3.getBytes(i.f14176a));
                        fileOutputStream.close();
                        i.c2().w3("crash_id_release", e12);
                    } catch (IOException e10) {
                        Log.w(Log.TAG_CRASH, "Cannot save crash file", e10, new Object[0]);
                    }
                }
                Log.e(Log.TAG_CRASH, "Application crashed", th, new Object[0]);
            } catch (Throwable th2) {
                try {
                    Log.e(Log.TAG_CRASH, "Unable to build crash: %s", th2, sb2.toString());
                } catch (Throwable unused) {
                }
            }
            Log.setRuntimeFlag(1, false);
            this.f13809c = false;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13808b;
            if (uncaughtExceptionHandler == null || th == null) {
                Process.killProcess(Process.myPid());
                System.exit(10);
                return;
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.f13808b.uncaughtException(thread, th);
            Thread.setDefaultUncaughtExceptionHandler(this.f13807a);
        }
    }

    public void g() {
        if (this.f13808b == null) {
            this.f13808b = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this.f13807a);
    }

    public void h(long j10) {
        i.c2().w3("crash_id_reported_release", j10);
    }
}
