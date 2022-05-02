package org.drinkmore;

import androidx.annotation.Keep;
import gd.C4779t2;
import ge.C4868i;
import java.util.Locale;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.AbstractC7870a;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;

public class Tracer {

    public final class RunnableC7869a implements Runnable {
        public final Throwable f25441a;
        public final int f25442b;

        public RunnableC7869a(Throwable th, Throwable th2) {
            this.f25442b = th2;
            this.f25441a = th;
        }

        public final void m14761a(Throwable th) {
            Tracer.m14762r(th);
        }

        public final void m14760b(Throwable th) {
            Tracer.m14762r(th);
        }

        public final void m14759c(Throwable th) {
            Tracer.m14762r(th);
        }

        public final void m14758d(Throwable th) {
            Tracer.m14762r(th);
        }

        @Override
        public void run() {
            int i = this.f25442b;
            if (i == 100) {
                AbstractC7870a.m14756b(this.f25441a);
            } else if (i != 101) {
                switch (i) {
                    case 0:
                        AbstractC7870a.m14757a(this.f25441a);
                        return;
                    case 1:
                        m14761a(this.f25441a);
                        return;
                    case 2:
                        throw new AbstractC7870a.C7872b(this.f25441a.getClass().getSimpleName() + ": " + this.f25441a.getMessage());
                    case 3:
                        m14759c(this.f25441a);
                        return;
                    case 4:
                        throw new AbstractC7870a.C7873c(this.f25441a.getMessage());
                    case 5:
                        m14760b(this.f25441a);
                        return;
                    case 6:
                        m14758d(this.f25441a);
                        return;
                    case 7:
                        Tracer.m14762r(this.f25441a);
                        return;
                    case 8:
                        throw new AbstractC7870a.C7874d(this.f25441a.getMessage());
                    default:
                        return;
                }
            } else {
                Tracer.m14762r(this.f25441a);
            }
        }
    }

    public static void m14778b(IllegalArgumentException illegalArgumentException, int i) {
        Log.m14724e("Restore count: %d", Integer.valueOf(i));
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(illegalArgumentException.getMessage() + ", saveCount = " + i);
        illegalArgumentException2.setStackTrace(illegalArgumentException.getStackTrace());
        m14772h(illegalArgumentException2);
    }

    public static String m14777c(String str) {
        return String.format(Locale.US, "Client fatal error (%d): [ 0][t 1][%d][Tracer.cpp:15][!Td]\t%s\n", Long.valueOf(Client.m14792f()), Long.valueOf(System.currentTimeMillis()), str);
    }

    public static void m14776d(Throwable th) {
        m14775e(th, 2);
    }

    public static void m14775e(Throwable th, int i) {
        new Thread(new RunnableC7869a(th, i), "Application fatal error thread").start();
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void m14774f(Throwable th) {
        m14775e(th, 1);
    }

    public static void m14773g(Throwable th) {
        m14775e(th, 5);
    }

    public static void m14772h(Throwable th) {
        m14775e(th, 7);
    }

    public static void m14771i(int i, Class<? extends TdApi.Function> cls, TdApi.Error error, StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls != null ? cls.getSimpleName() : "unknown");
        sb2.append(": ");
        sb2.append(C4779t2.m25378z5(error));
        String sb3 = sb2.toString();
        C4868i.m24726c2().m24774V5(i, sb3, 8);
        if (stackTraceElementArr != null) {
            AbstractC7870a.C7873c cVar = new AbstractC7870a.C7873c(sb3);
            cVar.setStackTrace(stackTraceElementArr);
            m14775e(cVar, 3);
            return;
        }
        m14775e(new AbstractC7870a.C7873c(sb3), 3);
    }

    public static void m14770j(Throwable th) {
        m14775e(th, 3);
    }

    public static void m14769k(String str) {
        m14775e(new AssertionError(str), 8);
    }

    public static void m14768l(Throwable th) {
        m14775e(th, 6);
    }

    public static void m14767m(String str) {
        m14775e(new AssertionError(str), 100);
    }

    public static void m14766n(String str) {
        m14775e(new AssertionError(str), 101);
    }

    public static void m14765o(String str) {
        C7888N.onFatalError(str, 100);
    }

    @Keep
    public static void onFatalError(String str, int i) {
        m14775e(new AssertionError(str), i);
    }

    public static void m14764p(String str) {
        C7888N.onFatalError(str, 101);
    }

    public static void m14763q(String str) {
        C7888N.throwDirect(str);
    }

    public static void m14762r(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
            stackTraceElementArr[0] = new StackTraceElement("org.drinkmore.Tracer", "throwError", "Tracer.java", 49);
            th.setStackTrace(stackTraceElementArr);
        }
        if (th instanceof AbstractC7870a) {
            throw ((AbstractC7870a) th);
        }
        RuntimeException runtimeException = new RuntimeException(m14777c(th.getClass().getSimpleName() + ": " + th.getMessage()), th.getCause());
        runtimeException.setStackTrace(th.getStackTrace());
        throw runtimeException;
    }
}
