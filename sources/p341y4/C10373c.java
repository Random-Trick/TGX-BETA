package p341y4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1196f;
import p020b5.C1216l0;
import p020b5.C1230s;
import p343y6.C10422b;

public final class C10373c {
    public static final Pattern f33367c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern f33368d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final C1189b0 f33369a = new C1189b0();
    public final StringBuilder f33370b = new StringBuilder();

    public static boolean m5286b(C1189b0 b0Var) {
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        byte[] d = b0Var.m38142d();
        if (e + 2 > f) {
            return false;
        }
        int i = e + 1;
        if (d[e] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (d[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= f) {
                b0Var.m38146Q(f - b0Var.m38141e());
                return true;
            } else if (((char) d[i2]) == '*' && ((char) d[i3]) == '/') {
                i2 = i3 + 1;
                f = i2;
            } else {
                i2 = i3;
            }
        }
    }

    public static boolean m5285c(C1189b0 b0Var) {
        char k = m5277k(b0Var, b0Var.m38141e());
        if (k != '\t' && k != '\n' && k != '\f' && k != '\r' && k != ' ') {
            return false;
        }
        b0Var.m38146Q(1);
        return true;
    }

    public static void m5283e(String str, C10374d dVar) {
        Matcher matcher = f33368d.matcher(C10422b.m5149c(str));
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("Invalid font-size: '");
            sb2.append(str);
            sb2.append("'.");
            C1230s.m37884i("WebvttCssParser", sb2.toString());
            return;
        }
        String str2 = (String) C1186a.m38188e(matcher.group(2));
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                dVar.m5252t(3);
                break;
            case 1:
                dVar.m5252t(2);
                break;
            case 2:
                dVar.m5252t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.m5253s(Float.parseFloat((String) C1186a.m38188e(matcher.group(1))));
    }

    public static String m5282f(C1189b0 b0Var, StringBuilder sb2) {
        boolean z = false;
        sb2.setLength(0);
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        while (e < f && !z) {
            char c = (char) b0Var.m38142d()[e];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                e++;
                sb2.append(c);
            }
        }
        b0Var.m38146Q(e - b0Var.m38141e());
        return sb2.toString();
    }

    public static String m5281g(C1189b0 b0Var, StringBuilder sb2) {
        m5274n(b0Var);
        if (b0Var.m38145a() == 0) {
            return null;
        }
        String f = m5282f(b0Var, sb2);
        if (!"".equals(f)) {
            return f;
        }
        StringBuilder sb3 = new StringBuilder(1);
        sb3.append((char) b0Var.m38159D());
        return sb3.toString();
    }

    public static String m5280h(C1189b0 b0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int e = b0Var.m38141e();
            String g = m5281g(b0Var, sb2);
            if (g == null) {
                return null;
            }
            if ("}".equals(g) || ";".equals(g)) {
                b0Var.m38147P(e);
                z = true;
            } else {
                sb3.append(g);
            }
        }
        return sb3.toString();
    }

    public static String m5279i(C1189b0 b0Var, StringBuilder sb2) {
        m5274n(b0Var);
        if (b0Var.m38145a() < 5 || !"::cue".equals(b0Var.m38162A(5))) {
            return null;
        }
        int e = b0Var.m38141e();
        String g = m5281g(b0Var, sb2);
        if (g == null) {
            return null;
        }
        if ("{".equals(g)) {
            b0Var.m38147P(e);
            return "";
        }
        String l = "(".equals(g) ? m5276l(b0Var) : null;
        if (!")".equals(m5281g(b0Var, sb2))) {
            return null;
        }
        return l;
    }

    public static void m5278j(C1189b0 b0Var, C10374d dVar, StringBuilder sb2) {
        m5274n(b0Var);
        String f = m5282f(b0Var, sb2);
        if (!"".equals(f) && ":".equals(m5281g(b0Var, sb2))) {
            m5274n(b0Var);
            String h = m5280h(b0Var, sb2);
            if (h != null && !"".equals(h)) {
                int e = b0Var.m38141e();
                String g = m5281g(b0Var, sb2);
                if (!";".equals(g)) {
                    if ("}".equals(g)) {
                        b0Var.m38147P(e);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f)) {
                    dVar.m5255q(C1196f.m38089b(h));
                } else if ("background-color".equals(f)) {
                    dVar.m5258n(C1196f.m38089b(h));
                } else {
                    boolean z = true;
                    if ("ruby-position".equals(f)) {
                        if ("over".equals(h)) {
                            dVar.m5250v(1);
                        } else if ("under".equals(h)) {
                            dVar.m5250v(2);
                        }
                    } else if ("text-combine-upright".equals(f)) {
                        if (!"all".equals(h) && !h.startsWith("digits")) {
                            z = false;
                        }
                        dVar.m5256p(z);
                    } else if ("text-decoration".equals(f)) {
                        if ("underline".equals(h)) {
                            dVar.m5273A(true);
                        }
                    } else if ("font-family".equals(f)) {
                        dVar.m5254r(h);
                    } else if ("font-weight".equals(f)) {
                        if ("bold".equals(h)) {
                            dVar.m5257o(true);
                        }
                    } else if ("font-style".equals(f)) {
                        if ("italic".equals(h)) {
                            dVar.m5251u(true);
                        }
                    } else if ("font-size".equals(f)) {
                        m5283e(h, dVar);
                    }
                }
            }
        }
    }

    public static char m5277k(C1189b0 b0Var, int i) {
        return (char) b0Var.m38142d()[i];
    }

    public static String m5276l(C1189b0 b0Var) {
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        boolean z = false;
        while (e < f && !z) {
            e++;
            z = ((char) b0Var.m38142d()[e]) == ')';
        }
        return b0Var.m38162A((e - 1) - b0Var.m38141e()).trim();
    }

    public static void m5275m(C1189b0 b0Var) {
        do {
        } while (!TextUtils.isEmpty(b0Var.m38130p()));
    }

    public static void m5274n(C1189b0 b0Var) {
        while (true) {
            for (boolean z = true; b0Var.m38145a() > 0 && z; z = false) {
                if (m5285c(b0Var) || m5286b(b0Var)) {
                }
            }
            return;
        }
    }

    public final void m5287a(C10374d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f33367c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.m5246z((String) C1186a.m38188e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] A0 = C1216l0.m38023A0(str, "\\.");
            String str2 = A0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.m5247y(str2.substring(0, indexOf2));
                dVar.m5248x(str2.substring(indexOf2 + 1));
            } else {
                dVar.m5247y(str2);
            }
            if (A0.length > 1) {
                dVar.m5249w((String[]) C1216l0.m37946v0(A0, 1, A0.length));
            }
        }
    }

    public List<C10374d> m5284d(C1189b0 b0Var) {
        this.f33370b.setLength(0);
        int e = b0Var.m38141e();
        m5275m(b0Var);
        this.f33369a.m38149N(b0Var.m38142d(), b0Var.m38141e());
        this.f33369a.m38147P(e);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i = m5279i(this.f33369a, this.f33370b);
            if (i == null || !"{".equals(m5281g(this.f33369a, this.f33370b))) {
                return arrayList;
            }
            C10374d dVar = new C10374d();
            m5287a(dVar, i);
            String str = null;
            boolean z = false;
            while (!z) {
                int e2 = this.f33369a.m38141e();
                String g = m5281g(this.f33369a, this.f33370b);
                boolean z2 = g == null || "}".equals(g);
                if (!z2) {
                    this.f33369a.m38147P(e2);
                    m5278j(this.f33369a, dVar, this.f33370b);
                }
                str = g;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
