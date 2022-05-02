package p341y4;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p039d.C3563j;
import p103h6.C5014u;
import p217p4.C8032b;
import p271t4.C8978a;
import p271t4.C8979b;
import p271t4.C8980c;

public final class C10376f {
    public static final Pattern f33388a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern f33389b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map<String, Integer> f33390c;
    public static final Map<String, Integer> f33391d;

    public static class C10378b {
        public static final Comparator<C10378b> f33392c = C10382g.f33412a;
        public final C10379c f33393a;
        public final int f33394b;

        public static int m5218e(C10378b bVar, C10378b bVar2) {
            return Integer.compare(bVar.f33393a.f33396b, bVar2.f33393a.f33396b);
        }

        public C10378b(C10379c cVar, int i) {
            this.f33393a = cVar;
            this.f33394b = i;
        }
    }

    public static final class C10379c {
        public final String f33395a;
        public final int f33396b;
        public final String f33397c;
        public final Set<String> f33398d;

        public C10379c(String str, int i, String str2, Set<String> set) {
            this.f33396b = i;
            this.f33395a = str;
            this.f33397c = str2;
            this.f33398d = set;
        }

        public static C10379c m5217a(String str, int i) {
            String str2;
            String trim = str.trim();
            C1186a.m38189a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                str2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
            }
            String[] A0 = C1216l0.m38020A0(trim, "\\.");
            String str3 = A0[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < A0.length; i2++) {
                hashSet.add(A0[i2]);
            }
            return new C10379c(str3, i, str2, hashSet);
        }

        public static C10379c m5216b() {
            return new C10379c("", 0, "", Collections.emptySet());
        }
    }

    public static final class C10380d implements Comparable<C10380d> {
        public final int f33399a;
        public final C10374d f33400b;

        public C10380d(int i, C10374d dVar) {
            this.f33399a = i;
            this.f33400b = dVar;
        }

        public int compareTo(C10380d dVar) {
            return Integer.compare(this.f33399a, dVar.f33399a);
        }
    }

    public static final class C10381e {
        public CharSequence f33403c;
        public long f33401a = 0;
        public long f33402b = 0;
        public int f33404d = 2;
        public float f33405e = -3.4028235E38f;
        public int f33406f = 1;
        public int f33407g = 0;
        public float f33408h = -3.4028235E38f;
        public int f33409i = Integer.MIN_VALUE;
        public float f33410j = 1.0f;
        public int f33411k = Integer.MIN_VALUE;

        public static float m5213b(float f, int i) {
            int i2 = (f > (-3.4028235E38f) ? 1 : (f == (-3.4028235E38f) ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment m5212c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            StringBuilder sb2 = new StringBuilder(34);
                            sb2.append("Unknown textAlignment: ");
                            sb2.append(i);
                            C1230s.m37881i("WebvttCueParser", sb2.toString());
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float m5211d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        public static float m5210e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int m5209f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public C10375e m5214a() {
            return new C10375e(m5208g().m13757a(), this.f33401a, this.f33402b);
        }

        public C8032b.C8034b m5208g() {
            float f = this.f33408h;
            if (f == -3.4028235E38f) {
                f = m5210e(this.f33404d);
            }
            int i = this.f33409i;
            if (i == Integer.MIN_VALUE) {
                i = m5209f(this.f33404d);
            }
            C8032b.C8034b r = new C8032b.C8034b().m13742p(m5212c(this.f33404d)).m13750h(m5213b(this.f33405e, this.f33406f), this.f33406f).m13749i(this.f33407g).m13747k(f).m13746l(i).m13744n(Math.min(this.f33410j, m5211d(i, f))).m13740r(this.f33411k);
            CharSequence charSequence = this.f33403c;
            if (charSequence != null) {
                r.m13743o(charSequence);
            }
            return r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f33390c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f33391d = Collections.unmodifiableMap(hashMap2);
    }

    public static void m5245a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f33390c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f33391d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    public static void m5244b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 33);
                sb2.append("ignoring unsupported entity: '&");
                sb2.append(str);
                sb2.append(";'");
                C1230s.m37881i("WebvttCueParser", sb2.toString());
                return;
        }
    }

    public static void m5243c(SpannableStringBuilder spannableStringBuilder, String str, C10379c cVar, List<C10378b> list, List<C10374d> list2) {
        int i = m5237i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C10378b.f33392c);
        int i2 = cVar.f33396b;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(((C10378b) arrayList.get(i4)).f33393a.f33395a)) {
                C10378b bVar = (C10378b) arrayList.get(i4);
                int g = m5239g(m5237i(list2, str, bVar.f33393a), i, 1);
                int i5 = bVar.f33393a.f33396b - i3;
                int i6 = bVar.f33394b - i3;
                CharSequence subSequence = spannableStringBuilder.subSequence(i5, i6);
                spannableStringBuilder.delete(i5, i6);
                spannableStringBuilder.setSpan(new C8979b(subSequence.toString(), g), i2, i5, 33);
                i3 += subSequence.length();
                i2 = i5;
            }
        }
    }

    public static void m5242d(String str, C10379c cVar, List<C10378b> list, SpannableStringBuilder spannableStringBuilder, List<C10374d> list2) {
        int i = cVar.f33396b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f33395a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                break;
            case C3563j.f11942I0:
                if (str2.equals(C5014u.f16932a)) {
                    c = 4;
                    break;
                }
                break;
            case C3563j.f11947J0:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                m5245a(spannableStringBuilder, cVar.f33398d, i, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                m5243c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<C10380d> h = m5238h(list2, str, cVar);
        for (int i2 = 0; i2 < h.size(); i2++) {
            m5241e(spannableStringBuilder, h.get(i2).f33400b, i, length);
        }
    }

    public static void m5241e(SpannableStringBuilder spannableStringBuilder, C10374d dVar, int i, int i2) {
        if (dVar != null) {
            if (dVar.m5263i() != -1) {
                C8980c.m10783a(spannableStringBuilder, new StyleSpan(dVar.m5263i()), i, i2, 33);
            }
            if (dVar.m5260l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.m5259m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.m5261k()) {
                C8980c.m10783a(spannableStringBuilder, new ForegroundColorSpan(dVar.m5269c()), i, i2, 33);
            }
            if (dVar.m5262j()) {
                C8980c.m10783a(spannableStringBuilder, new BackgroundColorSpan(dVar.m5271a()), i, i2, 33);
            }
            if (dVar.m5268d() != null) {
                C8980c.m10783a(spannableStringBuilder, new TypefaceSpan(dVar.m5268d()), i, i2, 33);
            }
            int f = dVar.m5266f();
            if (f == 1) {
                C8980c.m10783a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.m5267e(), true), i, i2, 33);
            } else if (f == 2) {
                C8980c.m10783a(spannableStringBuilder, new RelativeSizeSpan(dVar.m5267e()), i, i2, 33);
            } else if (f == 3) {
                C8980c.m10783a(spannableStringBuilder, new RelativeSizeSpan(dVar.m5267e() / 100.0f), i, i2, 33);
            }
            if (dVar.m5270b()) {
                spannableStringBuilder.setSpan(new C8978a(), i, i2, 33);
            }
        }
    }

    public static int m5240f(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    public static int m5239g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    public static List<C10380d> m5238h(List<C10374d> list, String str, C10379c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C10374d dVar = list.get(i);
            int h = dVar.m5264h(str, cVar.f33395a, cVar.f33398d, cVar.f33397c);
            if (h > 0) {
                arrayList.add(new C10380d(h, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int m5237i(List<C10374d> list, String str, C10379c cVar) {
        List<C10380d> h = m5238h(list, str, cVar);
        for (int i = 0; i < h.size(); i++) {
            C10374d dVar = h.get(i).f33400b;
            if (dVar.m5265g() != -1) {
                return dVar.m5265g();
            }
        }
        return -1;
    }

    public static String m5236j(String str) {
        String trim = str.trim();
        C1186a.m38189a(!trim.isEmpty());
        return C1216l0.m38018B0(trim, "[ \\.]")[0];
    }

    public static boolean m5235k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c = 2;
                    break;
                }
                break;
            case C3563j.f11942I0:
                if (str.equals(C5014u.f16932a)) {
                    c = 3;
                    break;
                }
                break;
            case C3563j.f11947J0:
                if (str.equals("v")) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static C8032b m5234l(CharSequence charSequence) {
        C10381e eVar = new C10381e();
        eVar.f33403c = charSequence;
        return eVar.m5208g().m13757a();
    }

    public static C10375e m5233m(C1189b0 b0Var, List<C10374d> list) {
        String p = b0Var.m38127p();
        if (p == null) {
            return null;
        }
        Pattern pattern = f33388a;
        Matcher matcher = pattern.matcher(p);
        if (matcher.matches()) {
            return m5232n(null, matcher, b0Var, list);
        }
        String p2 = b0Var.m38127p();
        if (p2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(p2);
        if (matcher2.matches()) {
            return m5232n(p.trim(), matcher2, b0Var, list);
        }
        return null;
    }

    public static C10375e m5232n(String str, Matcher matcher, C1189b0 b0Var, List<C10374d> list) {
        C10381e eVar = new C10381e();
        try {
            eVar.f33401a = C10384i.m5202c((String) C1186a.m38185e(matcher.group(1)));
            eVar.f33402b = C10384i.m5202c((String) C1186a.m38185e(matcher.group(2)));
            m5230p((String) C1186a.m38185e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String p = b0Var.m38127p();
            while (!TextUtils.isEmpty(p)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(p.trim());
                p = b0Var.m38127p();
            }
            eVar.f33403c = m5229q(str, sb2.toString(), list);
            return eVar.m5214a();
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            C1230s.m37881i("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    public static C8032b.C8034b m5231o(String str) {
        C10381e eVar = new C10381e();
        m5230p(str, eVar);
        return eVar.m5208g();
    }

    public static void m5230p(String str, C10381e eVar) {
        Matcher matcher = f33389b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C1186a.m38185e(matcher.group(1));
            String str3 = (String) C1186a.m38185e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m5227s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f33404d = m5224v(str3);
                } else if ("position".equals(str2)) {
                    m5225u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f33410j = C10384i.m5203b(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f33411k = m5223w(str3);
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(str2);
                    sb2.append(":");
                    sb2.append(str3);
                    C1230s.m37881i("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                C1230s.m37881i("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    public static SpannedString m5229q(String str, String str2, List<C10374d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m5244b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m5240f(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String j = m5236j(substring);
                        if (m5235k(j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C10379c cVar = (C10379c) arrayDeque.pop();
                                    m5242d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C10378b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f33395a.equals(j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C10379c.m5217a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m5242d(str, (C10379c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m5242d(str, C10379c.m5216b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int m5228r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                C1230s.m37881i("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    public static void m5227s(String str, C10381e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f33407g = m5228r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f33405e = C10384i.m5203b(str);
            eVar.f33406f = 0;
            return;
        }
        eVar.f33405e = Integer.parseInt(str);
        eVar.f33406f = 1;
    }

    public static int m5226t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                C1230s.m37881i("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    public static void m5225u(String str, C10381e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f33409i = m5226t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f33408h = C10384i.m5203b(str);
    }

    public static int m5224v(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                C1230s.m37881i("WebvttCueParser", str.length() != 0 ? "Invalid alignment value: ".concat(str) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    public static int m5223w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        C1230s.m37881i("WebvttCueParser", str.length() != 0 ? "Invalid 'vertical' value: ".concat(str) : new String("Invalid 'vertical' value: "));
        return Integer.MIN_VALUE;
    }
}
