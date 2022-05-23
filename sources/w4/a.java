package w4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c5.b0;
import c5.s;
import c5.t;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q4.b;
import q4.e;
import q4.f;

public final class a extends e {
    public static final Pattern f25762q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern f25763r = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f25764o = new StringBuilder();
    public final ArrayList<String> f25765p = new ArrayList<>();

    public a() {
        super("SubripDecoder");
    }

    public static float E(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long F(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) c5.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) c5.a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        t tVar = new t();
        b0 b0Var = new b0(bArr, i10);
        while (true) {
            String p10 = b0Var.p();
            int i11 = 0;
            if (p10 == null) {
                break;
            } else if (p10.length() != 0) {
                try {
                    Integer.parseInt(p10);
                    String p11 = b0Var.p();
                    if (p11 == null) {
                        s.i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f25762q.matcher(p11);
                    if (matcher.matches()) {
                        tVar.a(F(matcher, 1));
                        tVar.a(F(matcher, 6));
                        this.f25764o.setLength(0);
                        this.f25765p.clear();
                        for (String p12 = b0Var.p(); !TextUtils.isEmpty(p12); p12 = b0Var.p()) {
                            if (this.f25764o.length() > 0) {
                                this.f25764o.append("<br>");
                            }
                            this.f25764o.append(G(p12, this.f25765p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f25764o.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f25765p.size()) {
                                break;
                            }
                            String str2 = this.f25765p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(D(fromHtml, str));
                        arrayList.add(b.f21377a0);
                    } else {
                        s.i("SubripDecoder", p11.length() != 0 ? "Skipping invalid timing: ".concat(p11) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    s.i("SubripDecoder", p10.length() != 0 ? "Skipping invalid index: ".concat(p10) : new String("Skipping invalid index: "));
                }
            }
        }
        return new b((b[]) arrayList.toArray(new b[0]), tVar.d());
    }

    public final b D(Spanned spanned, String str) {
        char c10;
        char c11;
        b.C0195b o10 = new b.C0195b().o(spanned);
        if (str == null) {
            return o10.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            o10.l(0);
        } else if (c10 == 3 || c10 == 4 || c10 == 5) {
            o10.l(2);
        } else {
            o10.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            o10.i(2);
        } else if (c11 == 3 || c11 == 4 || c11 == 5) {
            o10.i(0);
        } else {
            o10.i(1);
        }
        return o10.k(E(o10.d())).h(E(o10.c()), 0).a();
    }

    public final String G(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f25763r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }
}
