package gd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

public class n {
    public static n f12302k;
    public float f12303a = 1.0f;
    public short f12304b = 4;
    public short f12305c = 32;
    public float f12306d = 0.5f;
    public int f12307e = 1000;
    public float f12308f = 0.5f;
    public short f12309g = 4;
    public int f12310h = 32;
    public Pattern f12311i = Pattern.compile("\\n\\r?\\n\\Z", 32);
    public Pattern f12312j = Pattern.compile("\\A\\r?\\n\\r?\\n", 32);

    public static class a {
        public static final int[] f12313a;

        static {
            int[] iArr = new int[d.values().length];
            f12313a = iArr;
            try {
                iArr[d.INSERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12313a[d.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12313a[d.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {
        public d f12314a;
        public String f12315b;

        public b(d dVar, String str) {
            this.f12314a = dVar;
            this.f12315b = str;
        }

        public boolean equals(Object obj) {
            try {
                if (((b) obj).f12314a == this.f12314a) {
                    return ((b) obj).f12315b.equals(this.f12315b);
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        public String toString() {
            String replace = this.f12315b.replace('\n', (char) 182);
            return "Diff(" + this.f12314a + ",\"" + replace + "\")";
        }
    }

    public static class c {
        public String f12316a;
        public String f12317b;
        public List<String> f12318c;

        public c(String str, String str2, List<String> list) {
            this.f12316a = str;
            this.f12317b = str2;
            this.f12318c = list;
        }
    }

    public enum d {
        DELETE,
        INSERT,
        EQUAL
    }

    public static n s() {
        if (f12302k == null) {
            synchronized (n.class) {
                if (f12302k == null) {
                    f12302k = new n();
                }
            }
        }
        return f12302k;
    }

    public void a(LinkedList<b> linkedList, List<String> list) {
        Iterator<b> it = linkedList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < next.f12315b.length(); i10++) {
                sb2.append(list.get(next.f12315b.charAt(i10)));
            }
            next.f12315b = sb2.toString();
        }
    }

    public void b(java.util.LinkedList<gd.n.b> r15) {
        throw new UnsupportedOperationException("Method not decompiled: gd.n.b(java.util.LinkedList):void");
    }

    public void c(LinkedList<b> linkedList) {
        if (!linkedList.isEmpty()) {
            Stack stack = new Stack();
            ListIterator<b> listIterator = linkedList.listIterator();
            b next = listIterator.next();
            String str = null;
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            while (next != null) {
                if (next.f12314a == d.EQUAL) {
                    stack.push(next);
                    str = next.f12315b;
                    i11 = i10;
                    i10 = 0;
                } else {
                    i10 += next.f12315b.length();
                    if (str != null && str.length() <= i11 && str.length() <= i10) {
                        while (next != stack.lastElement()) {
                            next = listIterator.previous();
                        }
                        listIterator.next();
                        listIterator.set(new b(d.DELETE, str));
                        listIterator.add(new b(d.INSERT, str));
                        stack.pop();
                        if (!stack.empty()) {
                            stack.pop();
                        }
                        if (stack.empty()) {
                            while (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                        } else {
                            do {
                            } while (((b) stack.lastElement()) != listIterator.previous());
                        }
                        z10 = true;
                        str = null;
                        i10 = 0;
                        i11 = 0;
                    }
                }
                next = listIterator.hasNext() ? listIterator.next() : null;
            }
            if (z10) {
                b(linkedList);
            }
            d(linkedList);
        }
    }

    public void d(java.util.LinkedList<gd.n.b> r15) {
        throw new UnsupportedOperationException("Method not decompiled: gd.n.d(java.util.LinkedList):void");
    }

    public final int e(String str, String str2) {
        if (str.length() == 0 || str2.length() == 0) {
            return 5;
        }
        if (Character.isLetterOrDigit(str.charAt(str.length() - 1)) && Character.isLetterOrDigit(str2.charAt(0))) {
            return 0;
        }
        if (!Character.isWhitespace(str.charAt(str.length() - 1)) && !Character.isWhitespace(str2.charAt(0))) {
            return 1;
        }
        if (Character.getType(str.charAt(str.length() - 1)) == 15 || Character.getType(str2.charAt(0)) == 15) {
            return (this.f12311i.matcher(str).find() || this.f12312j.matcher(str2).find()) ? 4 : 3;
        }
        return 2;
    }

    public int f(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i10 = 0; i10 < min; i10++) {
            if (str.charAt(i10) != str2.charAt(i10)) {
                return i10;
            }
        }
        return min;
    }

    public int g(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int min = Math.min(length, length2);
        for (int i10 = 1; i10 <= min; i10++) {
            if (str.charAt(length - i10) != str2.charAt(length2 - i10)) {
                return i10 - 1;
            }
        }
        return min;
    }

    public LinkedList<b> h(String str, String str2, boolean z10) {
        List<String> list;
        boolean z11 = z10;
        LinkedList<b> linkedList = new LinkedList<>();
        if (str.length() == 0) {
            linkedList.add(new b(d.INSERT, str2));
            return linkedList;
        }
        String str3 = str2;
        if (str2.length() == 0) {
            linkedList.add(new b(d.DELETE, str));
            return linkedList;
        }
        String str4 = str;
        String str5 = str.length() > str2.length() ? str4 : str3;
        String str6 = str.length() > str2.length() ? str3 : str4;
        int indexOf = str5.indexOf(str6);
        if (indexOf != -1) {
            d dVar = str.length() > str2.length() ? d.DELETE : d.INSERT;
            linkedList.add(new b(dVar, str5.substring(0, indexOf)));
            linkedList.add(new b(d.EQUAL, str6));
            linkedList.add(new b(dVar, str5.substring(indexOf + str6.length())));
            return linkedList;
        }
        String[] j10 = j(str, str2);
        if (j10 != null) {
            String str7 = j10[0];
            String str8 = j10[1];
            String str9 = j10[2];
            String str10 = j10[3];
            String str11 = j10[4];
            LinkedList<b> o10 = o(str7, str9, z11);
            LinkedList<b> o11 = o(str8, str10, z11);
            o10.add(new b(d.EQUAL, str11));
            o10.addAll(o11);
            return o10;
        }
        if (z11 && (str.length() < 100 || str2.length() < 100)) {
            z11 = false;
        }
        if (z11) {
            c l10 = l(str, str2);
            str4 = l10.f12316a;
            String str12 = l10.f12317b;
            list = l10.f12318c;
            str3 = str12;
        } else {
            list = null;
        }
        LinkedList<b> p10 = p(str4, str3);
        if (p10 == null) {
            p10 = new LinkedList<>();
            p10.add(new b(d.DELETE, str4));
            p10.add(new b(d.INSERT, str3));
        }
        if (z11) {
            a(p10, list);
            c(p10);
            p10.add(new b(d.EQUAL, ""));
            ListIterator<b> listIterator = p10.listIterator();
            b next = listIterator.next();
            String str13 = "";
            String str14 = str13;
            int i10 = 0;
            int i11 = 0;
            while (next != null) {
                int i12 = a.f12313a[next.f12314a.ordinal()];
                if (i12 == 1) {
                    i10++;
                    str13 = str13 + next.f12315b;
                } else if (i12 == 2) {
                    i11++;
                    str14 = str14 + next.f12315b;
                } else if (i12 == 3) {
                    if (i11 >= 1 && i10 >= 1) {
                        listIterator.previous();
                        for (int i13 = 0; i13 < i11 + i10; i13++) {
                            listIterator.previous();
                            listIterator.remove();
                        }
                        Iterator<b> it = o(str14, str13, false).iterator();
                        while (it.hasNext()) {
                            listIterator.add(it.next());
                        }
                    }
                    str13 = "";
                    str14 = str13;
                    i10 = 0;
                    i11 = 0;
                }
                next = listIterator.hasNext() ? listIterator.next() : null;
            }
            p10.removeLast();
        }
        return p10;
    }

    public long i(int i10, int i11) {
        return (i10 << 32) + i11;
    }

    public String[] j(String str, String str2) {
        String str3 = str.length() > str2.length() ? str : str2;
        String str4 = str.length() > str2.length() ? str2 : str;
        if (str3.length() < 10 || str4.length() < 1) {
            return null;
        }
        String[] k10 = k(str3, str4, (str3.length() + 3) / 4);
        String[] k11 = k(str3, str4, (str3.length() + 1) / 2);
        if (k10 == null && k11 == null) {
            return null;
        }
        if (k11 != null && (k10 == null || k10[4].length() <= k11[4].length())) {
            k10 = k11;
        }
        return str.length() > str2.length() ? k10 : new String[]{k10[2], k10[3], k10[0], k10[1], k10[4]};
    }

    public final String[] k(String str, String str2, int i10) {
        String substring = str.substring(i10, (str.length() / 4) + i10);
        int i11 = -1;
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        int i12 = -1;
        while (true) {
            i12 = str2.indexOf(substring, i12 + 1);
            if (i12 == i11) {
                break;
            }
            int f10 = f(str.substring(i10), str2.substring(i12));
            int g10 = g(str.substring(0, i10), str2.substring(0, i12));
            if (str3.length() < g10 + f10) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = i12 - g10;
                sb2.append(str2.substring(i13, i12));
                int i14 = i12 + f10;
                sb2.append(str2.substring(i12, i14));
                str3 = sb2.toString();
                String substring2 = str.substring(0, i10 - g10);
                str5 = str.substring(i10 + f10);
                str6 = str2.substring(0, i13);
                str7 = str2.substring(i14);
                str4 = substring2;
            }
            i11 = -1;
        }
        if (str3.length() >= str.length() / 2) {
            return new String[]{str4, str5, str6, str7, str3};
        }
        return null;
    }

    public c l(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add("");
        return new c(m(str, arrayList, hashMap), m(str2, arrayList, hashMap), arrayList);
    }

    public final String m(String str, List<String> list, Map<String, Integer> map) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = -1;
        while (i11 < str.length() - 1) {
            i11 = str.indexOf(10, i10);
            if (i11 == -1) {
                i11 = str.length() - 1;
            }
            int i12 = i11 + 1;
            String substring = str.substring(i10, i12);
            if (map.containsKey(substring)) {
                sb2.append((char) map.get(substring).intValue());
            } else {
                list.add(substring);
                map.put(substring, Integer.valueOf(list.size() - 1));
                sb2.append((char) (list.size() - 1));
            }
            i10 = i12;
        }
        return sb2.toString();
    }

    public LinkedList<b> n(String str, String str2) {
        return o(str, str2, true);
    }

    public LinkedList<b> o(String str, String str2, boolean z10) {
        if (str.equals(str2)) {
            LinkedList<b> linkedList = new LinkedList<>();
            linkedList.add(new b(d.EQUAL, str));
            return linkedList;
        }
        int f10 = f(str, str2);
        String substring = str.substring(0, f10);
        String substring2 = str.substring(f10);
        String substring3 = str2.substring(f10);
        int g10 = g(substring2, substring3);
        String substring4 = substring2.substring(substring2.length() - g10);
        LinkedList<b> h10 = h(substring2.substring(0, substring2.length() - g10), substring3.substring(0, substring3.length() - g10), z10);
        if (substring.length() != 0) {
            h10.addFirst(new b(d.EQUAL, substring));
        }
        if (substring4.length() != 0) {
            h10.addLast(new b(d.EQUAL, substring4));
        }
        b(h10);
        return h10;
    }

    public java.util.LinkedList<gd.n.b> p(java.lang.String r29, java.lang.String r30) {
        throw new UnsupportedOperationException("Method not decompiled: gd.n.p(java.lang.String, java.lang.String):java.util.LinkedList");
    }

    public LinkedList<b> q(List<Set<Long>> list, String str, String str2) {
        d dVar;
        LinkedList<b> linkedList = new LinkedList<>();
        int length = str.length();
        int length2 = str2.length();
        d dVar2 = null;
        for (int size = list.size() - 2; size >= 0; size--) {
            while (true) {
                if (list.get(size).contains(Long.valueOf(i(length - 1, length2)))) {
                    length--;
                    dVar = d.DELETE;
                    if (dVar2 == dVar) {
                        linkedList.getFirst().f12315b = str.charAt(length) + linkedList.getFirst().f12315b;
                    } else {
                        linkedList.addFirst(new b(dVar, str.substring(length, length + 1)));
                    }
                } else if (list.get(size).contains(Long.valueOf(i(length, length2 - 1)))) {
                    length2--;
                    dVar = d.INSERT;
                    if (dVar2 == dVar) {
                        linkedList.getFirst().f12315b = str2.charAt(length2) + linkedList.getFirst().f12315b;
                    } else {
                        linkedList.addFirst(new b(dVar, str2.substring(length2, length2 + 1)));
                    }
                } else {
                    length--;
                    length2--;
                    d dVar3 = d.EQUAL;
                    if (dVar2 == dVar3) {
                        linkedList.getFirst().f12315b = str.charAt(length) + linkedList.getFirst().f12315b;
                    } else {
                        linkedList.addFirst(new b(dVar3, str.substring(length, length + 1)));
                    }
                    dVar2 = dVar3;
                }
            }
            dVar2 = dVar;
        }
        return linkedList;
    }

    public LinkedList<b> r(List<Set<Long>> list, String str, String str2) {
        d dVar;
        LinkedList<b> linkedList = new LinkedList<>();
        int length = str.length();
        int length2 = str2.length();
        d dVar2 = null;
        for (int size = list.size() - 2; size >= 0; size--) {
            while (true) {
                if (list.get(size).contains(Long.valueOf(i(length - 1, length2)))) {
                    length--;
                    dVar = d.DELETE;
                    if (dVar2 == dVar) {
                        StringBuilder sb2 = new StringBuilder();
                        b last = linkedList.getLast();
                        sb2.append(last.f12315b);
                        sb2.append(str.charAt((str.length() - length) - 1));
                        last.f12315b = sb2.toString();
                    } else {
                        linkedList.addLast(new b(dVar, str.substring((str.length() - length) - 1, str.length() - length)));
                    }
                } else if (list.get(size).contains(Long.valueOf(i(length, length2 - 1)))) {
                    length2--;
                    dVar = d.INSERT;
                    if (dVar2 == dVar) {
                        StringBuilder sb3 = new StringBuilder();
                        b last2 = linkedList.getLast();
                        sb3.append(last2.f12315b);
                        sb3.append(str2.charAt((str2.length() - length2) - 1));
                        last2.f12315b = sb3.toString();
                    } else {
                        linkedList.addLast(new b(dVar, str2.substring((str2.length() - length2) - 1, str2.length() - length2)));
                    }
                } else {
                    length--;
                    length2--;
                    d dVar3 = d.EQUAL;
                    if (dVar2 == dVar3) {
                        StringBuilder sb4 = new StringBuilder();
                        b last3 = linkedList.getLast();
                        sb4.append(last3.f12315b);
                        sb4.append(str.charAt((str.length() - length) - 1));
                        last3.f12315b = sb4.toString();
                    } else {
                        linkedList.addLast(new b(dVar3, str.substring((str.length() - length) - 1, str.length() - length)));
                    }
                    dVar2 = dVar3;
                }
            }
            dVar2 = dVar;
        }
        return linkedList;
    }
}
