package ac;

import java.net.Proxy;
import ra.k;
import ub.b0;
import ub.w;

public final class i {
    public static final i f736a = new i();

    public final String a(b0 b0Var, Proxy.Type type) {
        k.e(b0Var, "request");
        k.e(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b0Var.g());
        sb2.append(' ');
        i iVar = f736a;
        if (iVar.b(b0Var, type)) {
            sb2.append(b0Var.i());
        } else {
            sb2.append(iVar.c(b0Var.i()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final boolean b(b0 b0Var, Proxy.Type type) {
        return !b0Var.f() && type == Proxy.Type.HTTP;
    }

    public final String c(w wVar) {
        k.e(wVar, "url");
        String d10 = wVar.d();
        String f10 = wVar.f();
        if (f10 == null) {
            return d10;
        }
        return d10 + '?' + f10;
    }
}
