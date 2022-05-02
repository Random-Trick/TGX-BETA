package p088g3;

import android.content.Context;
import android.os.Build;
import p100h3.AbstractC4934g;
import p100h3.AbstractC4950s;
import p100h3.C4926a;
import p100h3.C4932e;
import p116i3.AbstractC5179c;
import p146k3.AbstractC6045a;

public abstract class AbstractC4470h {
    public static AbstractC4950s m27551a(Context context, AbstractC5179c cVar, AbstractC4934g gVar, AbstractC6045a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C4932e(context, cVar, gVar);
        }
        return new C4926a(context, cVar, aVar, gVar);
    }
}
