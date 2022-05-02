package p311w4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p020b5.C1186a;
import p217p4.C8032b;

public final class C9974d {
    public final String f32418a;
    public final String f32419b;
    public final boolean f32420c;
    public final long f32421d;
    public final long f32422e;
    public final C9977g f32423f;
    public final String[] f32424g;
    public final String f32425h;
    public final String f32426i;
    public final C9974d f32427j;
    public final HashMap<String, Integer> f32428k;
    public final HashMap<String, Integer> f32429l;
    public List<C9974d> f32430m;

    public C9974d(String str, String str2, long j, long j2, C9977g gVar, String[] strArr, String str3, String str4, C9974d dVar) {
        this.f32418a = str;
        this.f32419b = str2;
        this.f32426i = str4;
        this.f32423f = gVar;
        this.f32424g = strArr;
        this.f32420c = str2 != null;
        this.f32421d = j;
        this.f32422e = j2;
        this.f32425h = (String) C1186a.m38188e(str3);
        this.f32427j = dVar;
        this.f32428k = new HashMap<>();
        this.f32429l = new HashMap<>();
    }

    public static C9974d m6369c(String str, long j, long j2, C9977g gVar, String[] strArr, String str2, String str3, C9974d dVar) {
        return new C9974d(str, null, j, j2, gVar, strArr, str2, str3, dVar);
    }

    public static C9974d m6368d(String str) {
        return new C9974d(null, C9976f.m6354b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void m6367e(SpannableStringBuilder spannableStringBuilder) {
        C9968a[] aVarArr;
        for (C9968a aVar : (C9968a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C9968a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    public static SpannableStringBuilder m6361k(String str, Map<String, C8032b.C8034b> map) {
        if (!map.containsKey(str)) {
            C8032b.C8034b bVar = new C8032b.C8034b();
            bVar.m13742o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C1186a.m38188e(map.get(str).m13752e());
    }

    public void m6371a(C9974d dVar) {
        if (this.f32430m == null) {
            this.f32430m = new ArrayList();
        }
        this.f32430m.add(dVar);
    }

    public final void m6370b(Map<String, C9977g> map, C8032b.C8034b bVar, int i, int i2, int i3) {
        C9977g f = C9976f.m6350f(this.f32423f, this.f32424g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.m13752e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.m13742o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f != null) {
            C9976f.m6355a(spannableStringBuilder2, i, i2, f, this.f32427j, map, i3);
            if ("p".equals(this.f32418a)) {
                if (f.m6328k() != Float.MAX_VALUE) {
                    bVar.m13744m((f.m6328k() * (-90.0f)) / 100.0f);
                }
                if (f.m6326m() != null) {
                    bVar.m13741p(f.m6326m());
                }
                if (f.m6331h() != null) {
                    bVar.m13747j(f.m6331h());
                }
            }
        }
    }

    public C9974d m6366f(int i) {
        List<C9974d> list = this.f32430m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int m6365g() {
        List<C9974d> list = this.f32430m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<C8032b> m6364h(long j, Map<String, C9977g> map, Map<String, C9975e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m6358n(j, this.f32425h, arrayList);
        TreeMap treeMap = new TreeMap();
        m6356p(j, false, this.f32425h, treeMap);
        m6357o(j, map, map2, this.f32425h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C9975e eVar = (C9975e) C1186a.m38188e(map2.get(pair.first));
                arrayList2.add(new C8032b.C8034b().m13751f(decodeByteArray).m13746k(eVar.f32432b).m13745l(0).m13749h(eVar.f32433c, 0).m13748i(eVar.f32435e).m13743n(eVar.f32436f).m13750g(eVar.f32437g).m13739r(eVar.f32440j).m13756a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C9975e eVar2 = (C9975e) C1186a.m38188e(map2.get(entry.getKey()));
            C8032b.C8034b bVar = (C8032b.C8034b) entry.getValue();
            m6367e((SpannableStringBuilder) C1186a.m38188e(bVar.m13752e()));
            bVar.m13749h(eVar2.f32433c, eVar2.f32434d);
            bVar.m13748i(eVar2.f32435e);
            bVar.m13746k(eVar2.f32432b);
            bVar.m13743n(eVar2.f32436f);
            bVar.m13740q(eVar2.f32439i, eVar2.f32438h);
            bVar.m13739r(eVar2.f32440j);
            arrayList2.add(bVar.m13756a());
        }
        return arrayList2;
    }

    public final void m6363i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f32418a);
        boolean equals2 = "div".equals(this.f32418a);
        if (z || equals || (equals2 && this.f32426i != null)) {
            long j = this.f32421d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f32422e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f32430m != null) {
            for (int i = 0; i < this.f32430m.size(); i++) {
                this.f32430m.get(i).m6363i(treeSet, z || equals);
            }
        }
    }

    public long[] m6362j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m6363i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            i++;
            jArr[i] = it.next().longValue();
        }
        return jArr;
    }

    public String[] m6360l() {
        return this.f32424g;
    }

    public boolean m6359m(long j) {
        long j2 = this.f32421d;
        return (j2 == -9223372036854775807L && this.f32422e == -9223372036854775807L) || (j2 <= j && this.f32422e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f32422e) || (j2 <= j && j < this.f32422e));
    }

    public final void m6358n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f32425h)) {
            str = this.f32425h;
        }
        if (!m6359m(j) || !"div".equals(this.f32418a) || this.f32426i == null) {
            for (int i = 0; i < m6365g(); i++) {
                m6366f(i).m6358n(j, str, list);
            }
            return;
        }
        list.add(new Pair<>(str, this.f32426i));
    }

    public final void m6357o(long j, Map<String, C9977g> map, Map<String, C9975e> map2, String str, Map<String, C8032b.C8034b> map3) {
        int i;
        if (m6359m(j)) {
            String str2 = "".equals(this.f32425h) ? str : this.f32425h;
            Iterator<Map.Entry<String, Integer>> it = this.f32429l.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, Integer> next = it.next();
                    String key = next.getKey();
                    int intValue = this.f32428k.containsKey(key) ? this.f32428k.get(key).intValue() : 0;
                    int intValue2 = next.getValue().intValue();
                    if (intValue != intValue2) {
                        m6370b(map, (C8032b.C8034b) C1186a.m38188e(map3.get(key)), intValue, intValue2, ((C9975e) C1186a.m38188e(map2.get(str2))).f32440j);
                    }
                }
            }
            for (i = 0; i < m6365g(); i++) {
                m6366f(i).m6357o(j, map, map2, str2, map3);
            }
        }
    }

    public final void m6356p(long j, boolean z, String str, Map<String, C8032b.C8034b> map) {
        this.f32428k.clear();
        this.f32429l.clear();
        if (!"metadata".equals(this.f32418a)) {
            if (!"".equals(this.f32425h)) {
                str = this.f32425h;
            }
            if (this.f32420c && z) {
                m6361k(str, map).append((CharSequence) C1186a.m38188e(this.f32419b));
            } else if ("br".equals(this.f32418a) && z) {
                m6361k(str, map).append('\n');
            } else if (m6359m(j)) {
                for (Map.Entry<String, C8032b.C8034b> entry : map.entrySet()) {
                    this.f32428k.put(entry.getKey(), Integer.valueOf(((CharSequence) C1186a.m38188e(entry.getValue().m13752e())).length()));
                }
                boolean equals = "p".equals(this.f32418a);
                for (int i = 0; i < m6365g(); i++) {
                    m6366f(i).m6356p(j, z || equals, str, map);
                }
                if (equals) {
                    C9976f.m6353c(m6361k(str, map));
                }
                for (Map.Entry<String, C8032b.C8034b> entry2 : map.entrySet()) {
                    this.f32429l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C1186a.m38188e(entry2.getValue().m13752e())).length()));
                }
            }
        }
    }
}
