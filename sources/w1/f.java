package w1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class f {
    public final String f25695a;
    public final Map<String, a> f25696b;
    public final Set<b> f25697c;
    public final Set<d> f25698d;

    public static class a {
        public final String f25699a;
        public final String f25700b;
        public final int f25701c;
        public final boolean f25702d;
        public final int f25703e;
        public final String f25704f;
        public final int f25705g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f25699a = str;
            this.f25700b = str2;
            this.f25702d = z10;
            this.f25703e = i10;
            this.f25701c = a(str2);
            this.f25704f = str3;
            this.f25705g = i11;
        }

        public static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25703e != aVar.f25703e || !this.f25699a.equals(aVar.f25699a) || this.f25702d != aVar.f25702d) {
                return false;
            }
            if (this.f25705g == 1 && aVar.f25705g == 2 && (str3 = this.f25704f) != null && !str3.equals(aVar.f25704f)) {
                return false;
            }
            if (this.f25705g == 2 && aVar.f25705g == 1 && (str2 = aVar.f25704f) != null && !str2.equals(this.f25704f)) {
                return false;
            }
            int i10 = this.f25705g;
            return (i10 == 0 || i10 != aVar.f25705g || ((str = this.f25704f) == null ? aVar.f25704f == null : str.equals(aVar.f25704f))) && this.f25701c == aVar.f25701c;
        }

        public int hashCode() {
            return (((((this.f25699a.hashCode() * 31) + this.f25701c) * 31) + (this.f25702d ? 1231 : 1237)) * 31) + this.f25703e;
        }

        public String toString() {
            return "Column{name='" + this.f25699a + "', type='" + this.f25700b + "', affinity='" + this.f25701c + "', notNull=" + this.f25702d + ", primaryKeyPosition=" + this.f25703e + ", defaultValue='" + this.f25704f + "'}";
        }
    }

    public static class b {
        public final String f25706a;
        public final String f25707b;
        public final String f25708c;
        public final List<String> f25709d;
        public final List<String> f25710e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f25706a = str;
            this.f25707b = str2;
            this.f25708c = str3;
            this.f25709d = Collections.unmodifiableList(list);
            this.f25710e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25706a.equals(bVar.f25706a) && this.f25707b.equals(bVar.f25707b) && this.f25708c.equals(bVar.f25708c) && this.f25709d.equals(bVar.f25709d)) {
                return this.f25710e.equals(bVar.f25710e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f25706a.hashCode() * 31) + this.f25707b.hashCode()) * 31) + this.f25708c.hashCode()) * 31) + this.f25709d.hashCode()) * 31) + this.f25710e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f25706a + "', onDelete='" + this.f25707b + "', onUpdate='" + this.f25708c + "', columnNames=" + this.f25709d + ", referenceColumnNames=" + this.f25710e + '}';
        }
    }

    public static class c implements Comparable<c> {
        public final String M;
        public final int f25711a;
        public final int f25712b;
        public final String f25713c;

        public c(int i10, int i11, String str, String str2) {
            this.f25711a = i10;
            this.f25712b = i11;
            this.f25713c = str;
            this.M = str2;
        }

        public int compareTo(c cVar) {
            int i10 = this.f25711a - cVar.f25711a;
            return i10 == 0 ? this.f25712b - cVar.f25712b : i10;
        }
    }

    public static class d {
        public final String f25714a;
        public final boolean f25715b;
        public final List<String> f25716c;

        public d(String str, boolean z10, List<String> list) {
            this.f25714a = str;
            this.f25715b = z10;
            this.f25716c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f25715b != dVar.f25715b || !this.f25716c.equals(dVar.f25716c)) {
                return false;
            }
            if (this.f25714a.startsWith("index_")) {
                return dVar.f25714a.startsWith("index_");
            }
            return this.f25714a.equals(dVar.f25714a);
        }

        public int hashCode() {
            return ((((this.f25714a.startsWith("index_") ? -1184239155 : this.f25714a.hashCode()) * 31) + (this.f25715b ? 1 : 0)) * 31) + this.f25716c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f25714a + "', unique=" + this.f25715b + ", columns=" + this.f25716c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f25695a = str;
        this.f25696b = Collections.unmodifiableMap(map);
        this.f25697c = Collections.unmodifiableSet(set);
        this.f25698d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(x1.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    public static Map<String, a> b(x1.b bVar, String str) {
        Cursor T = bVar.T("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (T.getColumnCount() > 0) {
                int columnIndex = T.getColumnIndex("name");
                int columnIndex2 = T.getColumnIndex("type");
                int columnIndex3 = T.getColumnIndex("notnull");
                int columnIndex4 = T.getColumnIndex("pk");
                int columnIndex5 = T.getColumnIndex("dflt_value");
                while (T.moveToNext()) {
                    String string = T.getString(columnIndex);
                    hashMap.put(string, new a(string, T.getString(columnIndex2), T.getInt(columnIndex3) != 0, T.getInt(columnIndex4), T.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            T.close();
        }
    }

    public static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<b> d(x1.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor T = bVar.T("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = T.getColumnIndex("id");
            int columnIndex2 = T.getColumnIndex("seq");
            int columnIndex3 = T.getColumnIndex("table");
            int columnIndex4 = T.getColumnIndex("on_delete");
            int columnIndex5 = T.getColumnIndex("on_update");
            List<c> c10 = c(T);
            int count = T.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                T.moveToPosition(i10);
                if (T.getInt(columnIndex2) == 0) {
                    int i11 = T.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c10) {
                        if (cVar.f25711a == i11) {
                            arrayList.add(cVar.f25713c);
                            arrayList2.add(cVar.M);
                        }
                    }
                    hashSet.add(new b(T.getString(columnIndex3), T.getString(columnIndex4), T.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            T.close();
        }
    }

    public static d e(x1.b bVar, String str, boolean z10) {
        Cursor T = bVar.T("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = T.getColumnIndex("seqno");
            int columnIndex2 = T.getColumnIndex("cid");
            int columnIndex3 = T.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                TreeMap treeMap = new TreeMap();
                while (T.moveToNext()) {
                    if (T.getInt(columnIndex2) >= 0) {
                        int i10 = T.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i10), T.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z10, arrayList);
            }
            return null;
        } finally {
            T.close();
        }
    }

    public static Set<d> f(x1.b bVar, String str) {
        Cursor T = bVar.T("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = T.getColumnIndex("name");
            int columnIndex2 = T.getColumnIndex("origin");
            int columnIndex3 = T.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                HashSet hashSet = new HashSet();
                while (T.moveToNext()) {
                    if ("c".equals(T.getString(columnIndex2))) {
                        String string = T.getString(columnIndex);
                        boolean z10 = true;
                        if (T.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d e10 = e(bVar, string, z10);
                        if (e10 == null) {
                            return null;
                        }
                        hashSet.add(e10);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            T.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f25695a;
        if (str == null ? fVar.f25695a != null : !str.equals(fVar.f25695a)) {
            return false;
        }
        Map<String, a> map = this.f25696b;
        if (map == null ? fVar.f25696b != null : !map.equals(fVar.f25696b)) {
            return false;
        }
        Set<b> set2 = this.f25697c;
        if (set2 == null ? fVar.f25697c != null : !set2.equals(fVar.f25697c)) {
            return false;
        }
        Set<d> set3 = this.f25698d;
        if (set3 == null || (set = fVar.f25698d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f25695a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f25696b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f25697c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "TableInfo{name='" + this.f25695a + "', columns=" + this.f25696b + ", foreignKeys=" + this.f25697c + ", indices=" + this.f25698d + '}';
    }
}
