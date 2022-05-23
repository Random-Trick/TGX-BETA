package z4;

import android.text.TextUtils;
import c5.a;
import c5.b0;
import c5.f;
import c5.l0;
import c5.s;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z6.b;

public final class c {
    public static final Pattern f26883c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern f26884d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final b0 f26885a = new b0();
    public final StringBuilder f26886b = new StringBuilder();

    public static boolean b(b0 b0Var) {
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        byte[] d10 = b0Var.d();
        if (e10 + 2 > f10) {
            return false;
        }
        int i10 = e10 + 1;
        if (d10[e10] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (d10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10) {
                b0Var.Q(f10 - b0Var.e());
                return true;
            } else if (((char) d10[i11]) == '*' && ((char) d10[i12]) == '/') {
                i11 = i12 + 1;
                f10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    public static boolean c(b0 b0Var) {
        char k10 = k(b0Var, b0Var.e());
        if (k10 != '\t' && k10 != '\n' && k10 != '\f' && k10 != '\r' && k10 != ' ') {
            return false;
        }
        b0Var.Q(1);
        return true;
    }

    public static void e(String str, d dVar) {
        Matcher matcher = f26884d.matcher(b.c(str));
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("Invalid font-size: '");
            sb2.append(str);
            sb2.append("'.");
            s.i("WebvttCssParser", sb2.toString());
            return;
        }
        String str2 = (String) a.e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.t(3);
                break;
            case 1:
                dVar.t(2);
                break;
            case 2:
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) a.e(matcher.group(1))));
    }

    public static String f(b0 b0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        while (e10 < f10 && !z10) {
            char c10 = (char) b0Var.d()[e10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                e10++;
                sb2.append(c10);
            }
        }
        b0Var.Q(e10 - b0Var.e());
        return sb2.toString();
    }

    public static String g(b0 b0Var, StringBuilder sb2) {
        n(b0Var);
        if (b0Var.a() == 0) {
            return null;
        }
        String f10 = f(b0Var, sb2);
        if (!"".equals(f10)) {
            return f10;
        }
        StringBuilder sb3 = new StringBuilder(1);
        sb3.append((char) b0Var.D());
        return sb3.toString();
    }

    public static String h(b0 b0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int e10 = b0Var.e();
            String g10 = g(b0Var, sb2);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                b0Var.P(e10);
                z10 = true;
            } else {
                sb3.append(g10);
            }
        }
        return sb3.toString();
    }

    public static String i(b0 b0Var, StringBuilder sb2) {
        n(b0Var);
        if (b0Var.a() < 5 || !"::cue".equals(b0Var.A(5))) {
            return null;
        }
        int e10 = b0Var.e();
        String g10 = g(b0Var, sb2);
        if (g10 == null) {
            return null;
        }
        if ("{".equals(g10)) {
            b0Var.P(e10);
            return "";
        }
        String l10 = "(".equals(g10) ? l(b0Var) : null;
        if (!")".equals(g(b0Var, sb2))) {
            return null;
        }
        return l10;
    }

    public static void j(b0 b0Var, d dVar, StringBuilder sb2) {
        n(b0Var);
        String f10 = f(b0Var, sb2);
        if (!"".equals(f10) && ":".equals(g(b0Var, sb2))) {
            n(b0Var);
            String h10 = h(b0Var, sb2);
            if (h10 != null && !"".equals(h10)) {
                int e10 = b0Var.e();
                String g10 = g(b0Var, sb2);
                if (!";".equals(g10)) {
                    if ("}".equals(g10)) {
                        b0Var.P(e10);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f10)) {
                    dVar.q(f.b(h10));
                } else if ("background-color".equals(f10)) {
                    dVar.n(f.b(h10));
                } else {
                    boolean z10 = true;
                    if ("ruby-position".equals(f10)) {
                        if ("over".equals(h10)) {
                            dVar.v(1);
                        } else if ("under".equals(h10)) {
                            dVar.v(2);
                        }
                    } else if ("text-combine-upright".equals(f10)) {
                        if (!"all".equals(h10) && !h10.startsWith("digits")) {
                            z10 = false;
                        }
                        dVar.p(z10);
                    } else if ("text-decoration".equals(f10)) {
                        if ("underline".equals(h10)) {
                            dVar.A(true);
                        }
                    } else if ("font-family".equals(f10)) {
                        dVar.r(h10);
                    } else if ("font-weight".equals(f10)) {
                        if ("bold".equals(h10)) {
                            dVar.o(true);
                        }
                    } else if ("font-style".equals(f10)) {
                        if ("italic".equals(h10)) {
                            dVar.u(true);
                        }
                    } else if ("font-size".equals(f10)) {
                        e(h10, dVar);
                    }
                }
            }
        }
    }

    public static char k(b0 b0Var, int i10) {
        return (char) b0Var.d()[i10];
    }

    public static String l(b0 b0Var) {
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        boolean z10 = false;
        while (e10 < f10 && !z10) {
            e10++;
            z10 = ((char) b0Var.d()[e10]) == ')';
        }
        return b0Var.A((e10 - 1) - b0Var.e()).trim();
    }

    public static void m(b0 b0Var) {
        do {
        } while (!TextUtils.isEmpty(b0Var.p()));
    }

    public static void n(b0 b0Var) {
        while (true) {
            for (boolean z10 = true; b0Var.a() > 0 && z10; z10 = false) {
                if (c(b0Var) || b(b0Var)) {
                }
            }
            return;
        }
    }

    public final void a(d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f26883c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.z((String) a.e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] B0 = l0.B0(str, "\\.");
            String str2 = B0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.y(str2.substring(0, indexOf2));
                dVar.x(str2.substring(indexOf2 + 1));
            } else {
                dVar.y(str2);
            }
            if (B0.length > 1) {
                dVar.w((String[]) l0.w0(B0, 1, B0.length));
            }
        }
    }

    public List<d> d(b0 b0Var) {
        this.f26886b.setLength(0);
        int e10 = b0Var.e();
        m(b0Var);
        this.f26885a.N(b0Var.d(), b0Var.e());
        this.f26885a.P(e10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f26885a, this.f26886b);
            if (i10 == null || !"{".equals(g(this.f26885a, this.f26886b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int e11 = this.f26885a.e();
                String g10 = g(this.f26885a, this.f26886b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f26885a.P(e11);
                    j(this.f26885a, dVar, this.f26886b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
