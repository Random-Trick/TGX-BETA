package p118i5;

import android.content.Context;
import android.util.Log;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public final class C5239w {
    public static final AbstractBinderC5237u f17387a = new BinderC5231o(AbstractBinderC5235s.m23562t("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    public static final AbstractBinderC5237u f17388b = new BinderC5232p(AbstractBinderC5235s.m23562t("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    public static final AbstractBinderC5237u f17389c = new BinderC5233q(AbstractBinderC5235s.m23562t("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    public static final AbstractBinderC5237u f17390d = new BinderC5234r(AbstractBinderC5235s.m23562t("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    public static final Object f17391e = new Object();
    public static Context f17392f;

    public static synchronized void m23559a(Context context) {
        synchronized (C5239w.class) {
            if (f17392f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f17392f = context.getApplicationContext();
            }
        }
    }
}
