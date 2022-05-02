package ge;

import android.annotation.SuppressLint;
import android.os.Process;
import be.C1379j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.Log;
import p082fd.C4403w;
import p108hb.C5070i;

public class C4859b {
    public static C4859b f16588d;
    public C4860a f16589a = new C4860a();
    public Thread.UncaughtExceptionHandler f16590b;
    public volatile boolean f16591c;

    public static class C4860a implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread thread, Throwable th) {
            C4859b.m24989d().m24988e(thread, th);
        }
    }

    public static String m24990c(long j) {
        return Log.CRASH_PREFIX + "0.24.6.1507-arm64-v8a." + j + ".log";
    }

    public static C4859b m24989d() {
        if (f16588d == null) {
            f16588d = new C4859b();
        }
        return f16588d;
    }

    public final File m24991b(long j) {
        String str;
        String path = C1379j0.m37318n().getFilesDir().getPath();
        if (path.charAt(path.length() - 1) == '/') {
            str = path + "logs/" + m24990c(j);
        } else {
            str = path + "/logs/" + m24990c(j);
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            return file;
        }
        return null;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void m24988e(Thread thread, Throwable th) {
        m24987f(null, thread, th);
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void m24987f(String str, Thread thread, Throwable th) {
        if (!this.f16591c) {
            this.f16591c = true;
            if (th != null) {
                th.printStackTrace();
            }
            Log.setRuntimeFlag(1, true);
            StringBuilder sb2 = new StringBuilder();
            try {
                long e1 = C4868i.m24727c2().m24712e1("crash_id_release", 0L) + 1;
                File b = m24991b(e1);
                sb2.append(Log.getDeviceInformationString());
                sb2.append("\n\nCrashed on: ");
                sb2.append(C4403w.m27981I(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
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
                if (b == null) {
                    Log.m14727e((int) Log.TAG_CRASH, "crashFile == null", new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(b);
                        fileOutputStream.write(sb3.getBytes(C5070i.f17083a));
                        fileOutputStream.close();
                        C4868i.m24727c2().m24567w3("crash_id_release", e1);
                    } catch (IOException e) {
                        Log.m14712w(Log.TAG_CRASH, "Cannot save crash file", e, new Object[0]);
                    }
                }
                Log.m14728e(Log.TAG_CRASH, "Application crashed", th, new Object[0]);
            } catch (Throwable th2) {
                try {
                    Log.m14728e(Log.TAG_CRASH, "Unable to build crash: %s", th2, sb2.toString());
                } catch (Throwable unused) {
                }
            }
            Log.setRuntimeFlag(1, false);
            this.f16591c = false;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16590b;
            if (uncaughtExceptionHandler == null || th == null) {
                Process.killProcess(Process.myPid());
                System.exit(10);
                return;
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.f16590b.uncaughtException(thread, th);
            Thread.setDefaultUncaughtExceptionHandler(this.f16589a);
        }
    }

    public void m24986g() {
        if (this.f16590b == null) {
            this.f16590b = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this.f16589a);
    }

    public void m24985h(long j) {
        C4868i.m24727c2().m24567w3("crash_id_reported_release", j);
    }
}
