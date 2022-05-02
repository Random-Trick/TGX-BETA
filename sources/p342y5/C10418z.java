package p342y5;

import java.io.PrintStream;

public final class C10418z {
    public static final AbstractC10412t f33484a;

    static {
        AbstractC10412t tVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                tVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C10415w() : new C10416x();
            } else {
                tVar = new C10417y();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = C10416x.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th.printStackTrace(System.err);
            tVar = new C10416x();
        }
        f33484a = tVar;
        if (num != null) {
            num.intValue();
        }
    }

    public static void m5154a(Throwable th, Throwable th2) {
        f33484a.mo5155a(th, th2);
    }
}
