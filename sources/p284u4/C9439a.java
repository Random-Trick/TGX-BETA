package p284u4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;
import p217p4.C8032b;
import p284u4.C9441c;
import p343y6.C10422b;

public final class C9439a extends AbstractC8039e {
    public static final Pattern f30590t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f30591o;
    public final C9440b f30592p;
    public Map<String, C9441c> f30593q;
    public float f30594r = -3.4028235E38f;
    public float f30595s = -3.4028235E38f;

    public C9439a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f30591o = false;
            this.f30592p = null;
            return;
        }
        this.f30591o = true;
        String A = C1216l0.m38021A(list.get(0));
        C1186a.m38189a(A.startsWith("Format:"));
        this.f30592p = (C9440b) C1186a.m38185e(C9440b.m8641a(A));
        m8648I(new C1189b0(list.get(1)));
    }

    public static int m8653D(long j, List<Long> list, List<List<C8032b>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    public static float m8652E(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static C8032b m8651F(String str, C9441c cVar, C9441c.C9443b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        C8032b.C8034b o = new C8032b.C8034b().m13743o(spannableString);
        if (cVar != null) {
            if (cVar.f30603c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f30603c.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = cVar.f30604d;
            if (!(f3 == -3.4028235E38f || f2 == -3.4028235E38f)) {
                o.m13741q(f3 / f2, 1);
            }
            boolean z = cVar.f30605e;
            if (z && cVar.f30606f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f30606f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f30607g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f30608h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f30622a;
        if (i == -1) {
            i = cVar != null ? cVar.f30602b : -1;
        }
        o.m13742p(m8642O(i)).m13746l(m8643N(i)).m13749i(m8644M(i));
        PointF pointF = bVar.f30623b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            o.m13747k(m8652E(o.m13754d()));
            o.m13750h(m8652E(o.m13755c()), 0);
        } else {
            o.m13747k(pointF.x / f);
            o.m13750h(bVar.f30623b.y / f2, 0);
        }
        return o.m13757a();
    }

    public static Map<String, C9441c> m8646K(C1189b0 b0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C9441c.C9442a aVar = null;
        while (true) {
            String p = b0Var.m38127p();
            if (p == null || (b0Var.m38142a() != 0 && b0Var.m38135h() == 91)) {
                break;
            } else if (p.startsWith("Format:")) {
                aVar = C9441c.C9442a.m8633a(p);
            } else if (p.startsWith("Style:")) {
                if (aVar == null) {
                    C1230s.m37881i("SsaDecoder", p.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(p) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    C9441c b = C9441c.m8639b(p, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.f30601a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long m8645L(String str) {
        Matcher matcher = f30590t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) C1216l0.m37968j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C1216l0.m37968j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C1216l0.m37968j(matcher.group(3))) * 1000000) + (Long.parseLong((String) C1216l0.m37968j(matcher.group(4))) * 10000);
    }

    public static int m8644M(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i);
                C1230s.m37881i("SsaDecoder", sb2.toString());
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

    public static int m8643N(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i);
                C1230s.m37881i("SsaDecoder", sb2.toString());
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

    public static Layout.Alignment m8642O(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i);
                C1230s.m37881i("SsaDecoder", sb2.toString());
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
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1189b0 b0Var = new C1189b0(bArr, i);
        if (!this.f30591o) {
            m8648I(b0Var);
        }
        m8649H(b0Var, arrayList, arrayList2);
        return new C9444d(arrayList, arrayList2);
    }

    public final void m8650G(String str, C9440b bVar, List<List<C8032b>> list, List<Long> list2) {
        int i;
        C1186a.m38189a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f30600e);
        if (split.length != bVar.f30600e) {
            C1230s.m37881i("SsaDecoder", str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long L = m8645L(split[bVar.f30596a]);
        if (L == -9223372036854775807L) {
            C1230s.m37881i("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long L2 = m8645L(split[bVar.f30597b]);
        if (L2 == -9223372036854775807L) {
            C1230s.m37881i("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, C9441c> map = this.f30593q;
        C9441c cVar = (map == null || (i = bVar.f30598c) == -1) ? null : map.get(split[i].trim());
        String str2 = split[bVar.f30599d];
        C8032b F = m8651F(C9441c.C9443b.m8629d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, C9441c.C9443b.m8631b(str2), this.f30594r, this.f30595s);
        int D = m8653D(L2, list2, list);
        for (int D2 = m8653D(L, list2, list); D2 < D; D2++) {
            list.get(D2).add(F);
        }
    }

    public final void m8649H(C1189b0 b0Var, List<List<C8032b>> list, List<Long> list2) {
        C9440b bVar = this.f30591o ? this.f30592p : null;
        while (true) {
            String p = b0Var.m38127p();
            if (p == null) {
                return;
            }
            if (p.startsWith("Format:")) {
                bVar = C9440b.m8641a(p);
            } else if (p.startsWith("Dialogue:")) {
                if (bVar == null) {
                    C1230s.m37881i("SsaDecoder", p.length() != 0 ? "Skipping dialogue line before complete format: ".concat(p) : new String("Skipping dialogue line before complete format: "));
                } else {
                    m8650G(p, bVar, list, list2);
                }
            }
        }
    }

    public final void m8648I(C1189b0 b0Var) {
        while (true) {
            String p = b0Var.m38127p();
            if (p == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(p)) {
                m8647J(b0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(p)) {
                this.f30593q = m8646K(b0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(p)) {
                C1230s.m37884f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(p)) {
                return;
            }
        }
    }

    public final void m8647J(C1189b0 b0Var) {
        while (true) {
            String p = b0Var.m38127p();
            if (p == null) {
                return;
            }
            if (b0Var.m38142a() == 0 || b0Var.m38135h() != 91) {
                String[] split = p.split(":");
                if (split.length == 2) {
                    String c = C10422b.m5149c(split[0].trim());
                    c.hashCode();
                    if (c.equals("playresx")) {
                        this.f30594r = Float.parseFloat(split[1].trim());
                    } else if (c.equals("playresy")) {
                        try {
                            this.f30595s = Float.parseFloat(split[1].trim());
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
