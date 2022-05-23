package org.drinkmore;

import androidx.annotation.Keep;
import hd.t2;
import he.i;
import java.util.Locale;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;

public class Tracer {

    public final class a implements Runnable {
        public final Throwable f19981a;
        public final int f19982b;

        public a(Throwable th, Throwable th2) {
            this.f19982b = th2;
            this.f19981a = th;
        }

        public final void a(Throwable th) {
            Tracer.r(th);
        }

        public final void b(Throwable th) {
            Tracer.r(th);
        }

        public final void c(Throwable th) {
            Tracer.r(th);
        }

        public final void d(Throwable th) {
            Tracer.r(th);
        }

        @Override
        public void run() {
            int i10 = this.f19982b;
            if (i10 == 100) {
                org.drinkmore.a.b(this.f19981a);
            } else if (i10 != 101) {
                switch (i10) {
                    case 0:
                        org.drinkmore.a.a(this.f19981a);
                        return;
                    case 1:
                        a(this.f19981a);
                        return;
                    case 2:
                        throw new a.b(this.f19981a.getClass().getSimpleName() + ": " + this.f19981a.getMessage());
                    case 3:
                        c(this.f19981a);
                        return;
                    case 4:
                        throw new a.c(this.f19981a.getMessage());
                    case 5:
                        b(this.f19981a);
                        return;
                    case 6:
                        d(this.f19981a);
                        return;
                    case 7:
                        Tracer.r(this.f19981a);
                        return;
                    case 8:
                        throw new a.d(this.f19981a.getMessage());
                    default:
                        return;
                }
            } else {
                Tracer.r(this.f19981a);
            }
        }
    }

    public static void b(IllegalArgumentException illegalArgumentException, int i10) {
        Log.e("Restore count: %d", Integer.valueOf(i10));
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(illegalArgumentException.getMessage() + ", saveCount = " + i10);
        illegalArgumentException2.setStackTrace(illegalArgumentException.getStackTrace());
        h(illegalArgumentException2);
    }

    public static String c(String str) {
        return String.format(Locale.US, "Client fatal error (%d): [ 0][t 1][%d][Tracer.cpp:15][!Td]\t%s\n", Long.valueOf(Client.f()), Long.valueOf(System.currentTimeMillis()), str);
    }

    public static void d(Throwable th) {
        e(th, 2);
    }

    public static void e(Throwable th, int i10) {
        new Thread(new a(th, i10), "Application fatal error thread").start();
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(Throwable th) {
        e(th, 1);
    }

    public static void g(Throwable th) {
        e(th, 5);
    }

    public static void h(Throwable th) {
        e(th, 7);
    }

    public static void i(int i10, Class<? extends TdApi.Function> cls, TdApi.Error error, StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls != null ? cls.getSimpleName() : "unknown");
        sb2.append(": ");
        sb2.append(t2.z5(error));
        String sb3 = sb2.toString();
        i.c2().V5(i10, sb3, 8);
        if (stackTraceElementArr != null) {
            a.c cVar = new a.c(sb3);
            cVar.setStackTrace(stackTraceElementArr);
            e(cVar, 3);
            return;
        }
        e(new a.c(sb3), 3);
    }

    public static void j(Throwable th) {
        e(th, 3);
    }

    public static void k(String str) {
        e(new AssertionError(str), 8);
    }

    public static void l(Throwable th) {
        e(th, 6);
    }

    public static void m(String str) {
        e(new AssertionError(str), 100);
    }

    public static void n(String str) {
        e(new AssertionError(str), 101);
    }

    public static void o(String str) {
        N.onFatalError(str, 100);
    }

    @Keep
    public static void onFatalError(String str, int i10) {
        e(new AssertionError(str), i10);
    }

    public static void p(String str) {
        N.onFatalError(str, 101);
    }

    public static void q(String str) {
        N.throwDirect(str);
    }

    public static void r(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
            stackTraceElementArr[0] = new StackTraceElement("org.drinkmore.Tracer", "throwError", "Tracer.java", 49);
            th.setStackTrace(stackTraceElementArr);
        }
        if (th instanceof org.drinkmore.a) {
            throw ((org.drinkmore.a) th);
        }
        RuntimeException runtimeException = new RuntimeException(c(th.getClass().getSimpleName() + ": " + th.getMessage()), th.getCause());
        runtimeException.setStackTrace(th.getStackTrace());
        throw runtimeException;
    }
}
