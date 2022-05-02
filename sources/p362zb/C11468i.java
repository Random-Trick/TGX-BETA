package p362zb;

import java.net.Proxy;
import p278tb.C9069b0;
import p278tb.C9125w;
import qa.C8298k;

public final class C11468i {
    public static final C11468i f36444a = new C11468i();

    public final String m526a(C9069b0 b0Var, Proxy.Type type) {
        C8298k.m12933e(b0Var, "request");
        C8298k.m12933e(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b0Var.m10560g());
        sb2.append(' ');
        C11468i iVar = f36444a;
        if (iVar.m525b(b0Var, type)) {
            sb2.append(b0Var.m10558i());
        } else {
            sb2.append(iVar.m524c(b0Var.m10558i()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final boolean m525b(C9069b0 b0Var, Proxy.Type type) {
        return !b0Var.m10561f() && type == Proxy.Type.HTTP;
    }

    public final String m524c(C9125w wVar) {
        C8298k.m12933e(wVar, "url");
        String d = wVar.m10350d();
        String f = wVar.m10348f();
        if (f == null) {
            return d;
        }
        return d + '?' + f;
    }
}
