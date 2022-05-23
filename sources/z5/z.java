package z5;

import java.io.PrintStream;

public final class z {
    public static final t f27002a;

    static {
        t tVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e10) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e10.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                tVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new w() : new x();
            } else {
                tVar = new y();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = x.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th.printStackTrace(System.err);
            tVar = new x();
        }
        f27002a = tVar;
        if (num != null) {
            num.intValue();
        }
    }

    public static void a(Throwable th, Throwable th2) {
        f27002a.a(th, th2);
    }
}
