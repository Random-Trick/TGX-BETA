package p298v4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1230s;
import p020b5.C1231t;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C9839a extends AbstractC8039e {
    public static final Pattern f32114q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern f32115r = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f32116o = new StringBuilder();
    public final ArrayList<String> f32117p = new ArrayList<>();

    public C9839a() {
        super("SubripDecoder");
    }

    public static float m6765E(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long m6764F(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) C1186a.m38185e(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) C1186a.m38185e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C1231t tVar = new C1231t();
        C1189b0 b0Var = new C1189b0(bArr, i);
        while (true) {
            String p = b0Var.m38127p();
            int i2 = 0;
            if (p == null) {
                break;
            } else if (p.length() != 0) {
                try {
                    Integer.parseInt(p);
                    String p2 = b0Var.m38127p();
                    if (p2 == null) {
                        C1230s.m37881i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f32114q.matcher(p2);
                    if (matcher.matches()) {
                        tVar.m37879a(m6764F(matcher, 1));
                        tVar.m37879a(m6764F(matcher, 6));
                        this.f32116o.setLength(0);
                        this.f32117p.clear();
                        for (String p3 = b0Var.m38127p(); !TextUtils.isEmpty(p3); p3 = b0Var.m38127p()) {
                            if (this.f32116o.length() > 0) {
                                this.f32116o.append("<br>");
                            }
                            this.f32116o.append(m6763G(p3, this.f32117p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f32116o.toString());
                        String str = null;
                        while (true) {
                            if (i2 >= this.f32117p.size()) {
                                break;
                            }
                            String str2 = this.f32117p.get(i2);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m6766D(fromHtml, str));
                        arrayList.add(C8032b.f26155a0);
                    } else {
                        C1230s.m37881i("SubripDecoder", p2.length() != 0 ? "Skipping invalid timing: ".concat(p2) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    C1230s.m37881i("SubripDecoder", p.length() != 0 ? "Skipping invalid index: ".concat(p) : new String("Skipping invalid index: "));
                }
            }
        }
        return new C9840b((C8032b[]) arrayList.toArray(new C8032b[0]), tVar.m37876d());
    }

    public final C8032b m6766D(Spanned spanned, String str) {
        char c;
        char c2;
        C8032b.C8034b o = new C8032b.C8034b().m13743o(spanned);
        if (str == null) {
            return o.m13757a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            o.m13746l(0);
        } else if (c == 3 || c == 4 || c == 5) {
            o.m13746l(2);
        } else {
            o.m13746l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            o.m13749i(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            o.m13749i(0);
        } else {
            o.m13749i(1);
        }
        return o.m13747k(m6765E(o.m13754d())).m13750h(m6765E(o.m13755c()), 0).m13757a();
    }

    public final String m6763G(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f32115r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i += length;
        }
        return sb2.toString();
    }
}
