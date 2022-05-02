package p082fd;

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

public class C4386n {
    public static C4386n f14536k;
    public float f14537a = 1.0f;
    public short f14538b = 4;
    public short f14539c = 32;
    public float f14540d = 0.5f;
    public int f14541e = 1000;
    public float f14542f = 0.5f;
    public short f14543g = 4;
    public int f14544h = 32;
    public Pattern f14545i = Pattern.compile("\\n\\r?\\n\\Z", 32);
    public Pattern f14546j = Pattern.compile("\\A\\r?\\n\\r?\\n", 32);

    public static class C4387a {
        public static final int[] f14547a;

        static {
            int[] iArr = new int[EnumC4390d.values().length];
            f14547a = iArr;
            try {
                iArr[EnumC4390d.INSERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14547a[EnumC4390d.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14547a[EnumC4390d.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class C4388b {
        public EnumC4390d f14548a;
        public String f14549b;

        public C4388b(EnumC4390d dVar, String str) {
            this.f14548a = dVar;
            this.f14549b = str;
        }

        public boolean equals(Object obj) {
            try {
                if (((C4388b) obj).f14548a == this.f14548a) {
                    return ((C4388b) obj).f14549b.equals(this.f14549b);
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        public String toString() {
            String replace = this.f14549b.replace('\n', (char) 182);
            return "Diff(" + this.f14548a + ",\"" + replace + "\")";
        }
    }

    public static class C4389c {
        public String f14550a;
        public String f14551b;
        public List<String> f14552c;

        public C4389c(String str, String str2, List<String> list) {
            this.f14550a = str;
            this.f14551b = str2;
            this.f14552c = list;
        }
    }

    public enum EnumC4390d {
        DELETE,
        INSERT,
        EQUAL
    }

    public static C4386n m28033s() {
        if (f14536k == null) {
            synchronized (C4386n.class) {
                if (f14536k == null) {
                    f14536k = new C4386n();
                }
            }
        }
        return f14536k;
    }

    public void m28051a(LinkedList<C4388b> linkedList, List<String> list) {
        Iterator<C4388b> it = linkedList.iterator();
        while (it.hasNext()) {
            C4388b next = it.next();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < next.f14549b.length(); i++) {
                sb2.append(list.get(next.f14549b.charAt(i)));
            }
            next.f14549b = sb2.toString();
        }
    }

    public void m28050b(java.util.LinkedList<p082fd.C4386n.C4388b> r15) {
        throw new UnsupportedOperationException("Method not decompiled: p082fd.C4386n.m28050b(java.util.LinkedList):void");
    }

    public void m28049c(LinkedList<C4388b> linkedList) {
        if (!linkedList.isEmpty()) {
            Stack stack = new Stack();
            ListIterator<C4388b> listIterator = linkedList.listIterator();
            C4388b next = listIterator.next();
            String str = null;
            boolean z = false;
            int i = 0;
            int i2 = 0;
            while (next != null) {
                if (next.f14548a == EnumC4390d.EQUAL) {
                    stack.push(next);
                    str = next.f14549b;
                    i2 = i;
                    i = 0;
                } else {
                    i += next.f14549b.length();
                    if (str != null && str.length() <= i2 && str.length() <= i) {
                        while (next != stack.lastElement()) {
                            next = listIterator.previous();
                        }
                        listIterator.next();
                        listIterator.set(new C4388b(EnumC4390d.DELETE, str));
                        listIterator.add(new C4388b(EnumC4390d.INSERT, str));
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
                            } while (((C4388b) stack.lastElement()) != listIterator.previous());
                        }
                        z = true;
                        str = null;
                        i = 0;
                        i2 = 0;
                    }
                }
                next = listIterator.hasNext() ? listIterator.next() : null;
            }
            if (z) {
                m28050b(linkedList);
            }
            m28048d(linkedList);
        }
    }

    public void m28048d(java.util.LinkedList<p082fd.C4386n.C4388b> r15) {
        throw new UnsupportedOperationException("Method not decompiled: p082fd.C4386n.m28048d(java.util.LinkedList):void");
    }

    public final int m28047e(String str, String str2) {
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
            return (this.f14545i.matcher(str).find() || this.f14546j.matcher(str2).find()) ? 4 : 3;
        }
        return 2;
    }

    public int m28046f(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return min;
    }

    public int m28045g(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int min = Math.min(length, length2);
        for (int i = 1; i <= min; i++) {
            if (str.charAt(length - i) != str2.charAt(length2 - i)) {
                return i - 1;
            }
        }
        return min;
    }

    public LinkedList<C4388b> m28044h(String str, String str2, boolean z) {
        List<String> list;
        boolean z2 = z;
        LinkedList<C4388b> linkedList = new LinkedList<>();
        if (str.length() == 0) {
            linkedList.add(new C4388b(EnumC4390d.INSERT, str2));
            return linkedList;
        }
        String str3 = str2;
        if (str2.length() == 0) {
            linkedList.add(new C4388b(EnumC4390d.DELETE, str));
            return linkedList;
        }
        String str4 = str;
        String str5 = str.length() > str2.length() ? str4 : str3;
        String str6 = str.length() > str2.length() ? str3 : str4;
        int indexOf = str5.indexOf(str6);
        if (indexOf != -1) {
            EnumC4390d dVar = str.length() > str2.length() ? EnumC4390d.DELETE : EnumC4390d.INSERT;
            linkedList.add(new C4388b(dVar, str5.substring(0, indexOf)));
            linkedList.add(new C4388b(EnumC4390d.EQUAL, str6));
            linkedList.add(new C4388b(dVar, str5.substring(indexOf + str6.length())));
            return linkedList;
        }
        String[] j = m28042j(str, str2);
        if (j != null) {
            String str7 = j[0];
            String str8 = j[1];
            String str9 = j[2];
            String str10 = j[3];
            String str11 = j[4];
            LinkedList<C4388b> o = m28037o(str7, str9, z2);
            LinkedList<C4388b> o2 = m28037o(str8, str10, z2);
            o.add(new C4388b(EnumC4390d.EQUAL, str11));
            o.addAll(o2);
            return o;
        }
        if (z2 && (str.length() < 100 || str2.length() < 100)) {
            z2 = false;
        }
        if (z2) {
            C4389c l = m28040l(str, str2);
            str4 = l.f14550a;
            String str12 = l.f14551b;
            list = l.f14552c;
            str3 = str12;
        } else {
            list = null;
        }
        LinkedList<C4388b> p = m28036p(str4, str3);
        if (p == null) {
            p = new LinkedList<>();
            p.add(new C4388b(EnumC4390d.DELETE, str4));
            p.add(new C4388b(EnumC4390d.INSERT, str3));
        }
        if (z2) {
            m28051a(p, list);
            m28049c(p);
            p.add(new C4388b(EnumC4390d.EQUAL, ""));
            ListIterator<C4388b> listIterator = p.listIterator();
            C4388b next = listIterator.next();
            String str13 = "";
            String str14 = str13;
            int i = 0;
            int i2 = 0;
            while (next != null) {
                int i3 = C4387a.f14547a[next.f14548a.ordinal()];
                if (i3 == 1) {
                    i++;
                    str13 = str13 + next.f14549b;
                } else if (i3 == 2) {
                    i2++;
                    str14 = str14 + next.f14549b;
                } else if (i3 == 3) {
                    if (i2 >= 1 && i >= 1) {
                        listIterator.previous();
                        for (int i4 = 0; i4 < i2 + i; i4++) {
                            listIterator.previous();
                            listIterator.remove();
                        }
                        Iterator<C4388b> it = m28037o(str14, str13, false).iterator();
                        while (it.hasNext()) {
                            listIterator.add(it.next());
                        }
                    }
                    str13 = "";
                    str14 = str13;
                    i = 0;
                    i2 = 0;
                }
                next = listIterator.hasNext() ? listIterator.next() : null;
            }
            p.removeLast();
        }
        return p;
    }

    public long m28043i(int i, int i2) {
        return (i << 32) + i2;
    }

    public String[] m28042j(String str, String str2) {
        String str3 = str.length() > str2.length() ? str : str2;
        String str4 = str.length() > str2.length() ? str2 : str;
        if (str3.length() < 10 || str4.length() < 1) {
            return null;
        }
        String[] k = m28041k(str3, str4, (str3.length() + 3) / 4);
        String[] k2 = m28041k(str3, str4, (str3.length() + 1) / 2);
        if (k == null && k2 == null) {
            return null;
        }
        if (k2 != null && (k == null || k[4].length() <= k2[4].length())) {
            k = k2;
        }
        return str.length() > str2.length() ? k : new String[]{k[2], k[3], k[0], k[1], k[4]};
    }

    public final String[] m28041k(String str, String str2, int i) {
        String substring = str.substring(i, (str.length() / 4) + i);
        int i2 = -1;
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        int i3 = -1;
        while (true) {
            i3 = str2.indexOf(substring, i3 + 1);
            if (i3 == i2) {
                break;
            }
            int f = m28046f(str.substring(i), str2.substring(i3));
            int g = m28045g(str.substring(0, i), str2.substring(0, i3));
            if (str3.length() < g + f) {
                StringBuilder sb2 = new StringBuilder();
                int i4 = i3 - g;
                sb2.append(str2.substring(i4, i3));
                int i5 = i3 + f;
                sb2.append(str2.substring(i3, i5));
                str3 = sb2.toString();
                String substring2 = str.substring(0, i - g);
                str5 = str.substring(i + f);
                str6 = str2.substring(0, i4);
                str7 = str2.substring(i5);
                str4 = substring2;
            }
            i2 = -1;
        }
        if (str3.length() >= str.length() / 2) {
            return new String[]{str4, str5, str6, str7, str3};
        }
        return null;
    }

    public C4389c m28040l(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add("");
        return new C4389c(m28039m(str, arrayList, hashMap), m28039m(str2, arrayList, hashMap), arrayList);
    }

    public final String m28039m(String str, List<String> list, Map<String, Integer> map) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        int i2 = -1;
        while (i2 < str.length() - 1) {
            i2 = str.indexOf(10, i);
            if (i2 == -1) {
                i2 = str.length() - 1;
            }
            int i3 = i2 + 1;
            String substring = str.substring(i, i3);
            if (map.containsKey(substring)) {
                sb2.append((char) map.get(substring).intValue());
            } else {
                list.add(substring);
                map.put(substring, Integer.valueOf(list.size() - 1));
                sb2.append((char) (list.size() - 1));
            }
            i = i3;
        }
        return sb2.toString();
    }

    public LinkedList<C4388b> m28038n(String str, String str2) {
        return m28037o(str, str2, true);
    }

    public LinkedList<C4388b> m28037o(String str, String str2, boolean z) {
        if (str.equals(str2)) {
            LinkedList<C4388b> linkedList = new LinkedList<>();
            linkedList.add(new C4388b(EnumC4390d.EQUAL, str));
            return linkedList;
        }
        int f = m28046f(str, str2);
        String substring = str.substring(0, f);
        String substring2 = str.substring(f);
        String substring3 = str2.substring(f);
        int g = m28045g(substring2, substring3);
        String substring4 = substring2.substring(substring2.length() - g);
        LinkedList<C4388b> h = m28044h(substring2.substring(0, substring2.length() - g), substring3.substring(0, substring3.length() - g), z);
        if (substring.length() != 0) {
            h.addFirst(new C4388b(EnumC4390d.EQUAL, substring));
        }
        if (substring4.length() != 0) {
            h.addLast(new C4388b(EnumC4390d.EQUAL, substring4));
        }
        m28050b(h);
        return h;
    }

    public java.util.LinkedList<p082fd.C4386n.C4388b> m28036p(java.lang.String r29, java.lang.String r30) {
        throw new UnsupportedOperationException("Method not decompiled: p082fd.C4386n.m28036p(java.lang.String, java.lang.String):java.util.LinkedList");
    }

    public LinkedList<C4388b> m28035q(List<Set<Long>> list, String str, String str2) {
        EnumC4390d dVar;
        LinkedList<C4388b> linkedList = new LinkedList<>();
        int length = str.length();
        int length2 = str2.length();
        EnumC4390d dVar2 = null;
        for (int size = list.size() - 2; size >= 0; size--) {
            while (true) {
                if (list.get(size).contains(Long.valueOf(m28043i(length - 1, length2)))) {
                    length--;
                    dVar = EnumC4390d.DELETE;
                    if (dVar2 == dVar) {
                        linkedList.getFirst().f14549b = str.charAt(length) + linkedList.getFirst().f14549b;
                    } else {
                        linkedList.addFirst(new C4388b(dVar, str.substring(length, length + 1)));
                    }
                } else if (list.get(size).contains(Long.valueOf(m28043i(length, length2 - 1)))) {
                    length2--;
                    dVar = EnumC4390d.INSERT;
                    if (dVar2 == dVar) {
                        linkedList.getFirst().f14549b = str2.charAt(length2) + linkedList.getFirst().f14549b;
                    } else {
                        linkedList.addFirst(new C4388b(dVar, str2.substring(length2, length2 + 1)));
                    }
                } else {
                    length--;
                    length2--;
                    EnumC4390d dVar3 = EnumC4390d.EQUAL;
                    if (dVar2 == dVar3) {
                        linkedList.getFirst().f14549b = str.charAt(length) + linkedList.getFirst().f14549b;
                    } else {
                        linkedList.addFirst(new C4388b(dVar3, str.substring(length, length + 1)));
                    }
                    dVar2 = dVar3;
                }
            }
            dVar2 = dVar;
        }
        return linkedList;
    }

    public LinkedList<C4388b> m28034r(List<Set<Long>> list, String str, String str2) {
        EnumC4390d dVar;
        LinkedList<C4388b> linkedList = new LinkedList<>();
        int length = str.length();
        int length2 = str2.length();
        EnumC4390d dVar2 = null;
        for (int size = list.size() - 2; size >= 0; size--) {
            while (true) {
                if (list.get(size).contains(Long.valueOf(m28043i(length - 1, length2)))) {
                    length--;
                    dVar = EnumC4390d.DELETE;
                    if (dVar2 == dVar) {
                        StringBuilder sb2 = new StringBuilder();
                        C4388b last = linkedList.getLast();
                        sb2.append(last.f14549b);
                        sb2.append(str.charAt((str.length() - length) - 1));
                        last.f14549b = sb2.toString();
                    } else {
                        linkedList.addLast(new C4388b(dVar, str.substring((str.length() - length) - 1, str.length() - length)));
                    }
                } else if (list.get(size).contains(Long.valueOf(m28043i(length, length2 - 1)))) {
                    length2--;
                    dVar = EnumC4390d.INSERT;
                    if (dVar2 == dVar) {
                        StringBuilder sb3 = new StringBuilder();
                        C4388b last2 = linkedList.getLast();
                        sb3.append(last2.f14549b);
                        sb3.append(str2.charAt((str2.length() - length2) - 1));
                        last2.f14549b = sb3.toString();
                    } else {
                        linkedList.addLast(new C4388b(dVar, str2.substring((str2.length() - length2) - 1, str2.length() - length2)));
                    }
                } else {
                    length--;
                    length2--;
                    EnumC4390d dVar3 = EnumC4390d.EQUAL;
                    if (dVar2 == dVar3) {
                        StringBuilder sb4 = new StringBuilder();
                        C4388b last3 = linkedList.getLast();
                        sb4.append(last3.f14549b);
                        sb4.append(str.charAt((str.length() - length) - 1));
                        last3.f14549b = sb4.toString();
                    } else {
                        linkedList.addLast(new C4388b(dVar3, str.substring((str.length() - length) - 1, str.length() - length)));
                    }
                    dVar2 = dVar3;
                }
            }
            dVar2 = dVar;
        }
        return linkedList;
    }
}
