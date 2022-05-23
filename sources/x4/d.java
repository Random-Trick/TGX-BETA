package x4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c5.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import q4.b;

public final class d {
    public final String f26010a;
    public final String f26011b;
    public final boolean f26012c;
    public final long f26013d;
    public final long f26014e;
    public final g f26015f;
    public final String[] f26016g;
    public final String f26017h;
    public final String f26018i;
    public final d f26019j;
    public final HashMap<String, Integer> f26020k;
    public final HashMap<String, Integer> f26021l;
    public List<d> f26022m;

    public d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f26010a = str;
        this.f26011b = str2;
        this.f26018i = str4;
        this.f26015f = gVar;
        this.f26016g = strArr;
        this.f26012c = str2 != null;
        this.f26013d = j10;
        this.f26014e = j11;
        this.f26017h = (String) a.e(str3);
        this.f26019j = dVar;
        this.f26020k = new HashMap<>();
        this.f26021l = new HashMap<>();
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        a[] aVarArr;
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    public static SpannableStringBuilder k(String str, Map<String, b.C0195b> map) {
        if (!map.containsKey(str)) {
            b.C0195b bVar = new b.C0195b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) a.e(map.get(str).e());
    }

    public void a(d dVar) {
        if (this.f26022m == null) {
            this.f26022m = new ArrayList();
        }
        this.f26022m.add(dVar);
    }

    public final void b(Map<String, g> map, b.C0195b bVar, int i10, int i11, int i12) {
        g f10 = f.f(this.f26015f, this.f26016g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f26019j, map, i12);
            if ("p".equals(this.f26010a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    bVar.m((f10.k() * (-90.0f)) / 100.0f);
                }
                if (f10.m() != null) {
                    bVar.p(f10.m());
                }
                if (f10.h() != null) {
                    bVar.j(f10.h());
                }
            }
        }
    }

    public d f(int i10) {
        List<d> list = this.f26022m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f26022m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<b> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f26017h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f26017h, treeMap);
        o(j10, map, map2, this.f26017h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) a.e(map2.get(pair.first));
                arrayList2.add(new b.C0195b().f(decodeByteArray).k(eVar.f26024b).l(0).h(eVar.f26025c, 0).i(eVar.f26027e).n(eVar.f26028f).g(eVar.f26029g).r(eVar.f26032j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) a.e(map2.get(entry.getKey()));
            b.C0195b bVar = (b.C0195b) entry.getValue();
            e((SpannableStringBuilder) a.e(bVar.e()));
            bVar.h(eVar2.f26025c, eVar2.f26026d);
            bVar.i(eVar2.f26027e);
            bVar.k(eVar2.f26024b);
            bVar.n(eVar2.f26028f);
            bVar.q(eVar2.f26031i, eVar2.f26030h);
            bVar.r(eVar2.f26032j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f26010a);
        boolean equals2 = "div".equals(this.f26010a);
        if (z10 || equals || (equals2 && this.f26018i != null)) {
            long j10 = this.f26013d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f26014e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f26022m != null) {
            for (int i10 = 0; i10 < this.f26022m.size(); i10++) {
                this.f26022m.get(i10).i(treeSet, z10 || equals);
            }
        }
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            i10++;
            jArr[i10] = it.next().longValue();
        }
        return jArr;
    }

    public String[] l() {
        return this.f26016g;
    }

    public boolean m(long j10) {
        long j11 = this.f26013d;
        return (j11 == -9223372036854775807L && this.f26014e == -9223372036854775807L) || (j11 <= j10 && this.f26014e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f26014e) || (j11 <= j10 && j10 < this.f26014e));
    }

    public final void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f26017h)) {
            str = this.f26017h;
        }
        if (!m(j10) || !"div".equals(this.f26010a) || this.f26018i == null) {
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).n(j10, str, list);
            }
            return;
        }
        list.add(new Pair<>(str, this.f26018i));
    }

    public final void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, b.C0195b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f26017h) ? str : this.f26017h;
            Iterator<Map.Entry<String, Integer>> it = this.f26021l.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, Integer> next = it.next();
                    String key = next.getKey();
                    int intValue = this.f26020k.containsKey(key) ? this.f26020k.get(key).intValue() : 0;
                    int intValue2 = next.getValue().intValue();
                    if (intValue != intValue2) {
                        b(map, (b.C0195b) a.e(map3.get(key)), intValue, intValue2, ((e) a.e(map2.get(str2))).f26032j);
                    }
                }
            }
            for (i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j10, boolean z10, String str, Map<String, b.C0195b> map) {
        this.f26020k.clear();
        this.f26021l.clear();
        if (!"metadata".equals(this.f26010a)) {
            if (!"".equals(this.f26017h)) {
                str = this.f26017h;
            }
            if (this.f26012c && z10) {
                k(str, map).append((CharSequence) a.e(this.f26011b));
            } else if ("br".equals(this.f26010a) && z10) {
                k(str, map).append('\n');
            } else if (m(j10)) {
                for (Map.Entry<String, b.C0195b> entry : map.entrySet()) {
                    this.f26020k.put(entry.getKey(), Integer.valueOf(((CharSequence) a.e(entry.getValue().e())).length()));
                }
                boolean equals = "p".equals(this.f26010a);
                for (int i10 = 0; i10 < g(); i10++) {
                    f(i10).p(j10, z10 || equals, str, map);
                }
                if (equals) {
                    f.c(k(str, map));
                }
                for (Map.Entry<String, b.C0195b> entry2 : map.entrySet()) {
                    this.f26021l.put(entry2.getKey(), Integer.valueOf(((CharSequence) a.e(entry2.getValue().e())).length()));
                }
            }
        }
    }
}
