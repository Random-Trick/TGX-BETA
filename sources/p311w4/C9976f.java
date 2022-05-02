package p311w4;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p271t4.C8978a;
import p271t4.C8979b;
import p271t4.C8980c;
import p271t4.C8981d;

public final class C9976f {
    public static void m6355a(Spannable spannable, int i, int i2, C9977g gVar, C9974d dVar, Map<String, C9977g> map, int i3) {
        C9974d e;
        C9977g f;
        int i4;
        if (gVar.m6327l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.m6327l()), i, i2, 33);
        }
        if (gVar.m6320s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gVar.m6319t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gVar.m6322q()) {
            C8980c.m10783a(spannable, new ForegroundColorSpan(gVar.m6336c()), i, i2, 33);
        }
        if (gVar.m6323p()) {
            C8980c.m10783a(spannable, new BackgroundColorSpan(gVar.m6337b()), i, i2, 33);
        }
        if (gVar.m6335d() != null) {
            C8980c.m10783a(spannable, new TypefaceSpan(gVar.m6335d()), i, i2, 33);
        }
        if (gVar.m6324o() != null) {
            C9969b bVar = (C9969b) C1186a.m38185e(gVar.m6324o());
            int i5 = bVar.f32395a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = bVar.f32396b;
            }
            int i6 = bVar.f32397c;
            if (i6 == -2) {
                i6 = 1;
            }
            C8980c.m10783a(spannable, new C8981d(i5, i4, i6), i, i2, 33);
        }
        int j = gVar.m6329j();
        if (j == 2) {
            C9974d d = m6352d(dVar, map);
            if (!(d == null || (e = m6351e(d, map)) == null)) {
                if (e.m6365g() != 1 || e.m6366f(0).f32416b == null) {
                    C1230s.m37884f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) C1216l0.m37968j(e.m6366f(0).f32416b);
                    C9977g f2 = m6350f(e.f32420f, e.m6360l(), map);
                    int i7 = f2 != null ? f2.m6330i() : -1;
                    if (i7 == -1 && (f = m6350f(d.f32420f, d.m6360l(), map)) != null) {
                        i7 = f.m6330i();
                    }
                    spannable.setSpan(new C8979b(str, i7), i, i2, 33);
                }
            }
        } else if (j == 3 || j == 4) {
            spannable.setSpan(new C9968a(), i, i2, 33);
        }
        if (gVar.m6325n()) {
            C8980c.m10783a(spannable, new C8978a(), i, i2, 33);
        }
        int f3 = gVar.m6333f();
        if (f3 == 1) {
            C8980c.m10783a(spannable, new AbsoluteSizeSpan((int) gVar.m6334e(), true), i, i2, 33);
        } else if (f3 == 2) {
            C8980c.m10783a(spannable, new RelativeSizeSpan(gVar.m6334e()), i, i2, 33);
        } else if (f3 == 3) {
            C8980c.m10783a(spannable, new RelativeSizeSpan(gVar.m6334e() / 100.0f), i, i2, 33);
        }
    }

    public static String m6354b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void m6353c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static C9974d m6352d(C9974d dVar, Map<String, C9977g> map) {
        while (dVar != null) {
            C9977g f = m6350f(dVar.f32420f, dVar.m6360l(), map);
            if (f != null && f.m6329j() == 1) {
                return dVar;
            }
            dVar = dVar.f32424j;
        }
        return null;
    }

    public static C9974d m6351e(C9974d dVar, Map<String, C9977g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            C9974d dVar2 = (C9974d) arrayDeque.pop();
            C9977g f = m6350f(dVar2.f32420f, dVar2.m6360l(), map);
            if (f != null && f.m6329j() == 3) {
                return dVar2;
            }
            for (int g = dVar2.m6365g() - 1; g >= 0; g--) {
                arrayDeque.push(dVar2.m6366f(g));
            }
        }
        return null;
    }

    public static C9977g m6350f(C9977g gVar, String[] strArr, Map<String, C9977g> map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C9977g gVar2 = new C9977g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.m6338a(map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.m6338a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.m6338a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }
}
