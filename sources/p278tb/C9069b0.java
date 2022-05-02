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
    public C9075d f29066a;
    public final C9125w f29067b;
    public final String f29068c;
    public final C9122v f29069d;
    public final AbstractC9072c0 f29070e;
    public final Map<Class<?>, Object> f29071f;

    public C9069b0(C9125w wVar, String str, C9122v vVar, AbstractC9072c0 c0Var, Map<Class<?>, ? extends Object> map) {
        C8298k.m12933e(wVar, "url");
        C8298k.m12933e(str, "method");
        C8298k.m12933e(vVar, "headers");
        C8298k.m12933e(map, "tags");
        this.f29067b = wVar;
        this.f29068c = str;
        this.f29069d = vVar;
        this.f29070e = c0Var;
        this.f29071f = map;
    }

    public final AbstractC9072c0 m10566a() {
        return this.f29070e;
    }

    public final C9075d m10565b() {
        C9075d dVar = this.f29066a;
        if (dVar != null) {
            return dVar;
        }
        C9075d b = C9075d.f29084p.m10528b(this.f29069d);
        this.f29066a = b;
        return b;
    }

    public final Map<Class<?>, Object> m10564c() {
        return this.f29071f;
    }

    public final String m10563d(String str) {
        C8298k.m12933e(str, "name");
        return this.f29069d.m10372h(str);
    }

    public final C9122v m10562e() {
        return this.f29069d;
    }

    public final boolean m10561f() {
        return this.f29067b.m10345i();
    }

    public final String m10560g() {
        return this.f29068c;
    }

    public final C9070a m10559h() {
        return new C9070a(this);
    }

    public final C9125w m10558i() {
        return this.f29067b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f29068c);
        sb2.append(", url=");
        sb2.append(this.f29067b);
        if (this.f29069d.size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (C5048h<? extends String, ? extends String> hVar : this.f29069d) {
                i++;
                if (i < 0) {
                    C5304n.m23359n();
                }
                C5048h<? extends String, ? extends String> hVar2 = hVar;
                String a = hVar2.m24197a();
                String b = hVar2.m24196b();
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(a);
                sb2.append(':');
                sb2.append(b);
            }
            sb2.append(']');
        }
        if (!this.f29071f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f29071f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static class C9070a {
        public C9125w f29072a;
        public String f29073b;
        public C9122v.C9123a f29074c;
        public AbstractC9072c0 f29075d;
        public Map<Class<?>, Object> f29076e;

        public C9070a() {
            this.f29076e = new LinkedHashMap();
            this.f29073b = "GET";
            this.f29074c = new C9122v.C9123a();
        }

        public C9069b0 m10557a() {
            C9125w wVar = this.f29072a;
            if (wVar != null) {
                return new C9069b0(wVar, this.f29073b, this.f29074c.m10364d(), this.f29075d, C9489b.m8530O(this.f29076e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public C9070a m10556b(String str, String str2) {
            C8298k.m12933e(str, "name");
            C8298k.m12933e(str2, "value");
            this.f29074c.m10361g(str, str2);
            return this;
        }

        public C9070a m10555c(C9122v vVar) {
            C8298k.m12933e(vVar, "headers");
            this.f29074c = vVar.m10370m();
            return this;
        }

        public C9070a m10554d(String str, AbstractC9072c0 c0Var) {
            C8298k.m12933e(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ C11465f.m540d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!C11465f.m543a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f29073b = str;
                this.f29075d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public C9070a m10553e(String str) {
            C8298k.m12933e(str, "name");
            this.f29074c.m10362f(str);
            return this;
        }

        public C9070a m10552f(String str) {
            C8298k.m12933e(str, "url");
            if (C11451n.m623v(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = str.substring(3);
                C8298k.m12934d(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                str = sb2.toString();
            } else if (C11451n.m623v(str, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = str.substring(4);
                C8298k.m12934d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                str = sb3.toString();
            }
            return m10551g(C9125w.f29339l.m10302d(str));
        }

        public C9070a m10551g(C9125w wVar) {
            C8298k.m12933e(wVar, "url");
            this.f29072a = wVar;
            return this;
        }

        public C9070a(C9069b0 b0Var) {
            Map<Class<?>, Object> map;
            C8298k.m12933e(b0Var, "request");
            this.f29076e = new LinkedHashMap();
            this.f29072a = b0Var.m10558i();
            this.f29073b = b0Var.m10560g();
            this.f29075d = b0Var.m10566a();
            if (b0Var.m10564c().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = C5295h0.m23414n(b0Var.m10564c());
            }
            this.f29076e = map;
            this.f29074c = b0Var.m10562e().m10370m();
        }
    }
}
