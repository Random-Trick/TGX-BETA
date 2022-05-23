package j5;

import android.content.Context;
import android.util.Log;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public final class w {
    public static final u f15090a = new o(s.t("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    public static final u f15091b = new p(s.t("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    public static final u f15092c = new q(s.t("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    public static final u f15093d = new r(s.t("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    public static final Object f15094e = new Object();
    public static Context f15095f;

    public static synchronized void a(Context context) {
        synchronized (w.class) {
            if (f15095f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f15095f = context.getApplicationContext();
            }
        }
    }
}
