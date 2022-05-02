package p278tb;

import java.util.LinkedHashMap;
import java.util.Map;
import p107ha.C5048h;
import p123ia.C5295h0;
import p123ia.C5304n;
import p278tb.C9122v;
import p290ub.C9489b;
import p362zb.C11465f;
import qa.C8298k;
import za.C11451n;

public final class C9069b0 {
    public C9075d f29063a;
    public final C9125w f29064b;
    public final String f29065c;
    public final C9122v f29066d;
    public final AbstractC9072c0 f29067e;
    public final Map<Class<?>, Object> f29068f;

    public C9069b0(C9125w wVar, String str, C9122v vVar, AbstractC9072c0 c0Var, Map<Class<?>, ? extends Object> map) {
        C8298k.m12934e(wVar, "url");
        C8298k.m12934e(str, "method");
        C8298k.m12934e(vVar, "headers");
        C8298k.m12934e(map, "tags");
        this.f29064b = wVar;
        this.f29065c = str;
        this.f29066d = vVar;
        this.f29067e = c0Var;
        this.f29068f = map;
    }

    public final AbstractC9072c0 m10567a() {
        return this.f29067e;
    }

    public final C9075d m10566b() {
        C9075d dVar = this.f29063a;
        if (dVar != null) {
            return dVar;
        }
        C9075d b = C9075d.f29081p.m10529b(this.f29066d);
        this.f29063a = b;
        return b;
    }

    public final Map<Class<?>, Object> m10565c() {
        return this.f29068f;
    }

    public final String m10564d(String str) {
        C8298k.m12934e(str, "name");
        return this.f29066d.m10373h(str);
    }

    public final C9122v m10563e() {
        return this.f29066d;
    }

    public final boolean m10562f() {
        return this.f29064b.m10346i();
    }

    public final String m10561g() {
        return this.f29065c;
    }

    public final C9070a m10560h() {
        return new C9070a(this);
    }

    public final C9125w m10559i() {
        return this.f29064b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f29065c);
        sb2.append(", url=");
        sb2.append(this.f29064b);
        if (this.f29066d.size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (C5048h<? extends String, ? extends String> hVar : this.f29066d) {
                i++;
                if (i < 0) {
                    C5304n.m23358n();
                }
                C5048h<? extends String, ? extends String> hVar2 = hVar;
                String a = hVar2.m24196a();
                String b = hVar2.m24195b();
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(a);
                sb2.append(':');
                sb2.append(b);
            }
            sb2.append(']');
        }
        if (!this.f29068f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f29068f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C8298k.m12935d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static class C9070a {
        public C9125w f29069a;
        public String f29070b;
        public C9122v.C9123a f29071c;
        public AbstractC9072c0 f29072d;
        public Map<Class<?>, Object> f29073e;

        public C9070a() {
            this.f29073e = new LinkedHashMap();
            this.f29070b = "GET";
            this.f29071c = new C9122v.C9123a();
        }

        public C9069b0 m10558a() {
            C9125w wVar = this.f29069a;
            if (wVar != null) {
                return new C9069b0(wVar, this.f29070b, this.f29071c.m10365d(), this.f29072d, C9489b.m8530O(this.f29073e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public C9070a m10557b(String str, String str2) {
            C8298k.m12934e(str, "name");
            C8298k.m12934e(str2, "value");
            this.f29071c.m10362g(str, str2);
            return this;
        }

        public C9070a m10556c(C9122v vVar) {
            C8298k.m12934e(vVar, "headers");
            this.f29071c = vVar.m10371m();
            return this;
        }

        public C9070a m10555d(String str, AbstractC9072c0 c0Var) {
            C8298k.m12934e(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ C11465f.m540d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!C11465f.m543a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f29070b = str;
                this.f29072d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public C9070a m10554e(String str) {
            C8298k.m12934e(str, "name");
            this.f29071c.m10363f(str);
            return this;
        }

        public C9070a m10553f(String str) {
            C8298k.m12934e(str, "url");
            if (C11451n.m623v(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = str.substring(3);
                C8298k.m12935d(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                str = sb2.toString();
            } else if (C11451n.m623v(str, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = str.substring(4);
                C8298k.m12935d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                str = sb3.toString();
            }
            return m10552g(C9125w.f29336l.m10303d(str));
        }

        public C9070a m10552g(C9125w wVar) {
            C8298k.m12934e(wVar, "url");
            this.f29069a = wVar;
            return this;
        }

        public C9070a(C9069b0 b0Var) {
            Map<Class<?>, Object> map;
            C8298k.m12934e(b0Var, "request");
            this.f29073e = new LinkedHashMap();
            this.f29069a = b0Var.m10559i();
            this.f29070b = b0Var.m10561g();
            this.f29072d = b0Var.m10567a();
            if (b0Var.m10565c().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = C5295h0.m23413n(b0Var.m10565c());
            }
            this.f29073e = map;
            this.f29071c = b0Var.m10563e().m10371m();
        }
    }
}
