package ub;

import ac.f;
import ia.h;
import ja.h0;
import ja.n;
import java.util.LinkedHashMap;
import java.util.Map;
import ra.k;
import ub.v;
import vb.b;

public final class b0 {
    public d f23737a;
    public final w f23738b;
    public final String f23739c;
    public final v f23740d;
    public final c0 f23741e;
    public final Map<Class<?>, Object> f23742f;

    public b0(w wVar, String str, v vVar, c0 c0Var, Map<Class<?>, ? extends Object> map) {
        k.e(wVar, "url");
        k.e(str, "method");
        k.e(vVar, "headers");
        k.e(map, "tags");
        this.f23738b = wVar;
        this.f23739c = str;
        this.f23740d = vVar;
        this.f23741e = c0Var;
        this.f23742f = map;
    }

    public final c0 a() {
        return this.f23741e;
    }

    public final d b() {
        d dVar = this.f23737a;
        if (dVar != null) {
            return dVar;
        }
        d b10 = d.f23755p.b(this.f23740d);
        this.f23737a = b10;
        return b10;
    }

    public final Map<Class<?>, Object> c() {
        return this.f23742f;
    }

    public final String d(String str) {
        k.e(str, "name");
        return this.f23740d.f(str);
    }

    public final v e() {
        return this.f23740d;
    }

    public final boolean f() {
        return this.f23738b.i();
    }

    public final String g() {
        return this.f23739c;
    }

    public final a h() {
        return new a(this);
    }

    public final w i() {
        return this.f23738b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f23739c);
        sb2.append(", url=");
        sb2.append(this.f23738b);
        if (this.f23740d.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (h<? extends String, ? extends String> hVar : this.f23740d) {
                i10++;
                if (i10 < 0) {
                    n.n();
                }
                h<? extends String, ? extends String> hVar2 = hVar;
                String a10 = hVar2.a();
                String b10 = hVar2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a10);
                sb2.append(':');
                sb2.append(b10);
            }
            sb2.append(']');
        }
        if (!this.f23742f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f23742f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static class a {
        public w f23743a;
        public String f23744b;
        public v.a f23745c;
        public c0 f23746d;
        public Map<Class<?>, Object> f23747e;

        public a() {
            this.f23747e = new LinkedHashMap();
            this.f23744b = "GET";
            this.f23745c = new v.a();
        }

        public b0 a() {
            w wVar = this.f23743a;
            if (wVar != null) {
                return new b0(wVar, this.f23744b, this.f23745c.d(), this.f23746d, b.O(this.f23747e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a b(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            this.f23745c.g(str, str2);
            return this;
        }

        public a c(v vVar) {
            k.e(vVar, "headers");
            this.f23745c = vVar.m();
            return this;
        }

        public a d(String str, c0 c0Var) {
            k.e(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ f.d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!f.a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f23744b = str;
                this.f23746d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a e(String str) {
            k.e(str, "name");
            this.f23745c.f(str);
            return this;
        }

        public a f(String str) {
            k.e(str, "url");
            if (ab.n.v(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = str.substring(3);
                k.d(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                str = sb2.toString();
            } else if (ab.n.v(str, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = str.substring(4);
                k.d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                str = sb3.toString();
            }
            return g(w.f23940l.d(str));
        }

        public a g(w wVar) {
            k.e(wVar, "url");
            this.f23743a = wVar;
            return this;
        }

        public a(b0 b0Var) {
            Map<Class<?>, Object> map;
            k.e(b0Var, "request");
            this.f23747e = new LinkedHashMap();
            this.f23743a = b0Var.i();
            this.f23744b = b0Var.g();
            this.f23746d = b0Var.a();
            if (b0Var.c().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = h0.n(b0Var.c());
            }
            this.f23747e = map;
            this.f23745c = b0Var.e().m();
        }
    }
}
