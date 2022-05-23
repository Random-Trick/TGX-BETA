package v4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c5.b0;
import c5.l0;
import c5.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q4.b;
import q4.e;
import q4.f;
import v4.c;

public final class a extends e {
    public static final Pattern f24699t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f24700o;
    public final b f24701p;
    public Map<String, c> f24702q;
    public float f24703r = -3.4028235E38f;
    public float f24704s = -3.4028235E38f;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f24700o = false;
            this.f24701p = null;
            return;
        }
        this.f24700o = true;
        String A = l0.A(list.get(0));
        c5.a.a(A.startsWith("Format:"));
        this.f24701p = (b) c5.a.e(b.a(A));
        I(new b0(list.get(1)));
    }

    public static int D(long j10, List<Long> list, List<List<b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    public static float E(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static b F(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        b.C0195b o10 = new b.C0195b().o(spannableString);
        if (cVar != null) {
            if (cVar.f24712c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f24712c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f24713d;
            if (!(f12 == -3.4028235E38f || f11 == -3.4028235E38f)) {
                o10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f24714e;
            if (z10 && cVar.f24715f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f24715f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f24716g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f24717h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f24731a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f24711b : -1;
        }
        o10.p(O(i10)).l(N(i10)).i(M(i10));
        PointF pointF = bVar.f24732b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            o10.k(E(o10.d()));
            o10.h(E(o10.c()), 0);
        } else {
            o10.k(pointF.x / f10);
            o10.h(bVar.f24732b.y / f11, 0);
        }
        return o10.a();
    }

    public static Map<String, c> K(b0 b0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String p10 = b0Var.p();
            if (p10 == null || (b0Var.a() != 0 && b0Var.h() == 91)) {
                break;
            } else if (p10.startsWith("Format:")) {
                aVar = c.a.a(p10);
            } else if (p10.startsWith("Style:")) {
                if (aVar == null) {
                    s.i("SsaDecoder", p10.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(p10) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    c b10 = c.b(p10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f24710a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long L(String str) {
        Matcher matcher = f24699t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) l0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) l0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) l0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) l0.j(matcher.group(4))) * 10000);
    }

    public static int M(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                s.i("SsaDecoder", sb2.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int N(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                s.i("SsaDecoder", sb2.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static Layout.Alignment O(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                s.i("SsaDecoder", sb2.toString());
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0 b0Var = new b0(bArr, i10);
        if (!this.f24700o) {
            I(b0Var);
        }
        H(b0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }

    public final void G(String str, b bVar, List<List<b>> list, List<Long> list2) {
        int i10;
        c5.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f24709e);
        if (split.length != bVar.f24709e) {
            s.i("SsaDecoder", str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long L = L(split[bVar.f24705a]);
        if (L == -9223372036854775807L) {
            s.i("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long L2 = L(split[bVar.f24706b]);
        if (L2 == -9223372036854775807L) {
            s.i("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, c> map = this.f24702q;
        c cVar = (map == null || (i10 = bVar.f24707c) == -1) ? null : map.get(split[i10].trim());
        String str2 = split[bVar.f24708d];
        b F = F(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f24703r, this.f24704s);
        int D = D(L2, list2, list);
        for (int D2 = D(L, list2, list); D2 < D; D2++) {
            list.get(D2).add(F);
        }
    }

    public final void H(b0 b0Var, List<List<b>> list, List<Long> list2) {
        b bVar = this.f24700o ? this.f24701p : null;
        while (true) {
            String p10 = b0Var.p();
            if (p10 == null) {
                return;
            }
            if (p10.startsWith("Format:")) {
                bVar = b.a(p10);
            } else if (p10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    s.i("SsaDecoder", p10.length() != 0 ? "Skipping dialogue line before complete format: ".concat(p10) : new String("Skipping dialogue line before complete format: "));
                } else {
                    G(p10, bVar, list, list2);
                }
            }
        }
    }

    public final void I(b0 b0Var) {
        while (true) {
            String p10 = b0Var.p();
            if (p10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(p10)) {
                J(b0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(p10)) {
                this.f24702q = K(b0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(p10)) {
                s.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(p10)) {
                return;
            }
        }
    }

    public final void J(b0 b0Var) {
        while (true) {
            String p10 = b0Var.p();
            if (p10 == null) {
                return;
            }
            if (b0Var.a() == 0 || b0Var.h() != 91) {
                String[] split = p10.split(":");
                if (split.length == 2) {
                    String c10 = z6.b.c(split[0].trim());
                    c10.hashCode();
                    if (c10.equals("playresx")) {
                        this.f24703r = Float.parseFloat(split[1].trim());
                    } else if (c10.equals("playresy")) {
                        try {
                            this.f24704s = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
