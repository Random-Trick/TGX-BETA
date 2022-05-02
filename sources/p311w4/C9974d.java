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
    public final String f32415a;
    public final String f32416b;
    public final boolean f32417c;
    public final long f32418d;
    public final long f32419e;
    public final C9977g f32420f;
    public final String[] f32421g;
    public final String f32422h;
    public final String f32423i;
    public final C9974d f32424j;
    public final HashMap<String, Integer> f32425k;
    public final HashMap<String, Integer> f32426l;
    public List<C9974d> f32427m;

    public C9974d(String str, String str2, long j, long j2, C9977g gVar, String[] strArr, String str3, String str4, C9974d dVar) {
        this.f32415a = str;
        this.f32416b = str2;
        this.f32423i = str4;
        this.f32420f = gVar;
        this.f32421g = strArr;
        this.f32417c = str2 != null;
        this.f32418d = j;
        this.f32419e = j2;
        this.f32422h = (String) C1186a.m38185e(str3);
        this.f32424j = dVar;
        this.f32425k = new HashMap<>();
        this.f32426l = new HashMap<>();
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
            bVar.m13743o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C1186a.m38185e(map.get(str).m13753e());
    }

    public void m6371a(C9974d dVar) {
        if (this.f32427m == null) {
            this.f32427m = new ArrayList();
        }
        this.f32427m.add(dVar);
    }

    public final void m6370b(Map<String, C9977g> map, C8032b.C8034b bVar, int i, int i2, int i3) {
        C9977g f = C9976f.m6350f(this.f32420f, this.f32421g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.m13753e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.m13743o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f != null) {
            C9976f.m6355a(spannableStringBuilder2, i, i2, f, this.f32424j, map, i3);
            if ("p".equals(this.f32415a)) {
                if (f.m6328k() != Float.MAX_VALUE) {
                    bVar.m13745m((f.m6328k() * (-90.0f)) / 100.0f);
                }
                if (f.m6326m() != null) {
                    bVar.m13742p(f.m6326m());
                }
                if (f.m6331h() != null) {
                    bVar.m13748j(f.m6331h());
                }
            }
        }
    }

    public C9974d m6366f(int i) {
        List<C9974d> list = this.f32427m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int m6365g() {
        List<C9974d> list = this.f32427m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<C8032b> m6364h(long j, Map<String, C9977g> map, Map<String, C9975e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m6358n(j, this.f32422h, arrayList);
        TreeMap treeMap = new TreeMap();
        m6356p(j, false, this.f32422h, treeMap);
        m6357o(j, map, map2, this.f32422h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C9975e eVar = (C9975e) C1186a.m38185e(map2.get(pair.first));
                arrayList2.add(new C8032b.C8034b().m13752f(decodeByteArray).m13747k(eVar.f32429b).m13746l(0).m13750h(eVar.f32430c, 0).m13749i(eVar.f32432e).m13744n(eVar.f32433f).m13751g(eVar.f32434g).m13740r(eVar.f32437j).m13757a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C9975e eVar2 = (C9975e) C1186a.m38185e(map2.get(entry.getKey()));
            C8032b.C8034b bVar = (C8032b.C8034b) entry.getValue();
            m6367e((SpannableStringBuilder) C1186a.m38185e(bVar.m13753e()));
            bVar.m13750h(eVar2.f32430c, eVar2.f32431d);
            bVar.m13749i(eVar2.f32432e);
            bVar.m13747k(eVar2.f32429b);
            bVar.m13744n(eVar2.f32433f);
            bVar.m13741q(eVar2.f32436i, eVar2.f32435h);
            bVar.m13740r(eVar2.f32437j);
            arrayList2.add(bVar.m13757a());
        }
        return arrayList2;
    }

    public final void m6363i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f32415a);
        boolean equals2 = "div".equals(this.f32415a);
        if (z || equals || (equals2 && this.f32423i != null)) {
            long j = this.f32418d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f32419e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f32427m != null) {
            for (int i = 0; i < this.f32427m.size(); i++) {
                this.f32427m.get(i).m6363i(treeSet, z || equals);
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
        return this.f32421g;
    }

    public boolean m6359m(long j) {
        long j2 = this.f32418d;
        return (j2 == -9223372036854775807L && this.f32419e == -9223372036854775807L) || (j2 <= j && this.f32419e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f32419e) || (j2 <= j && j < this.f32419e));
    }

    public final void m6358n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f32422h)) {
            str = this.f32422h;
        }
        if (!m6359m(j) || !"div".equals(this.f32415a) || this.f32423i == null) {
            for (int i = 0; i < m6365g(); i++) {
                m6366f(i).m6358n(j, str, list);
            }
            return;
        }
        list.add(new Pair<>(str, this.f32423i));
    }

    public final void m6357o(long j, Map<String, C9977g> map, Map<String, C9975e> map2, String str, Map<String, C8032b.C8034b> map3) {
        int i;
        if (m6359m(j)) {
            String str2 = "".equals(this.f32422h) ? str : this.f32422h;
            Iterator<Map.Entry<String, Integer>> it = this.f32426l.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, Integer> next = it.next();
                    String key = next.getKey();
                    int intValue = this.f32425k.containsKey(key) ? this.f32425k.get(key).intValue() : 0;
                    int intValue2 = next.getValue().intValue();
                    if (intValue != intValue2) {
                        m6370b(map, (C8032b.C8034b) C1186a.m38185e(map3.get(key)), intValue, intValue2, ((C9975e) C1186a.m38185e(map2.get(str2))).f32437j);
                    }
                }
            }
            for (i = 0; i < m6365g(); i++) {
                m6366f(i).m6357o(j, map, map2, str2, map3);
            }
        }
    }

    public final void m6356p(long j, boolean z, String str, Map<String, C8032b.C8034b> map) {
        this.f32425k.clear();
        this.f32426l.clear();
        if (!"metadata".equals(this.f32415a)) {
            if (!"".equals(this.f32422h)) {
                str = this.f32422h;
            }
            if (this.f32417c && z) {
                m6361k(str, map).append((CharSequence) C1186a.m38185e(this.f32416b));
            } else if ("br".equals(this.f32415a) && z) {
                m6361k(str, map).append('\n');
            } else if (m6359m(j)) {
                for (Map.Entry<String, C8032b.C8034b> entry : map.entrySet()) {
                    this.f32425k.put(entry.getKey(), Integer.valueOf(((CharSequence) C1186a.m38185e(entry.getValue().m13753e())).length()));
                }
                boolean equals = "p".equals(this.f32415a);
                for (int i = 0; i < m6365g(); i++) {
                    m6366f(i).m6356p(j, z || equals, str, map);
                }
                if (equals) {
                    C9976f.m6353c(m6361k(str, map));
                }
                for (Map.Entry<String, C8032b.C8034b> entry2 : map.entrySet()) {
                    this.f32426l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C1186a.m38185e(entry2.getValue().m13753e())).length()));
                }
            }
        }
    }
}
