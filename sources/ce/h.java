package ce;

import id.i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class h {
    public static h f5259e;
    public static final String[] f5260f = {null, "🏻", "🏼", "🏽", "🏾", "🏿"};
    public static final char[] f5261g = {9774, 10013, 9770, 9784, 10017, 9775, 9766, 9934, 9800, 9801, 9802, 9803, 9804, 9805, 9806, 9807, 9808, 9809, 9810, 9811, 9883, 9762, 9763, 10036, 12953, 12951, 9940, 10060, 11093, 9832, 10071, 10069, 10067, 10068, 8252, 8265, 9884, 12349, 9888, 9851, 10055, 10035, 10062, 9989, 10175, 9410, 9855, 9654, 9208, 9199, 9209, 9210, 9197, 9198, 9193, 9194, 9664, 9195, 9196, 10145, 11013, 11014, 11015, 8599, 8600, 8601, 8598, 8597, 8596, 8618, 8617, 10548, 10549, 8505, 12336, 10160, 10004, 10133, 10134, 10135, 10006, 169, 174, 8482, 9745, 9898, 9899, 9642, 9643, 11035, 11036, 9724, 9723, 9726, 9725, 9824, 9827, 9829, 9830, 9786, 9785, 9994, 9996, 9995, 9757, 9997, 9937, 10084, 10083, 9749, 9917, 9918, 9971, 9975, 9976, 9977, 8986, 9000, 9742, 9201, 9202, 9200, 9203, 8987, 9878, 9874, 9935, 9881, 9939, 9876, 9760, 9904, 9905, 9879, 9969, 9993, 9986, 10002, 9999, 9992, 9973, 9972, 9875, 9981, 9970, 9968, 9978, 9962, 9961, 9752, 11088, 10024, 9732, 9728, 9925, 9729, 9928, 9889, 10052, 9731, 9924, 9730, 9748, 9854, 9823, 9895};
    public static final String[][] f5262h = d.f5248c;
    public static final String[][] f5263i = e.f5252a;
    public final HashSet<Character> f5264a;
    public final Set<String> f5265b;
    public final Set<String> f5266c;
    public final HashMap<CharSequence, CharSequence> f5267d;

    public h() {
        String[] strArr;
        char charAt;
        char[] cArr = f5261g;
        this.f5264a = new HashSet<>(cArr.length);
        int i10 = 0;
        for (char c10 : cArr) {
            this.f5264a.add(Character.valueOf(c10));
        }
        Set<String> b10 = i.b();
        this.f5266c = b10;
        Set<String> a10 = i.a();
        HashSet<String> hashSet = new HashSet(b10.size() + a10.size());
        this.f5265b = hashSet;
        hashSet.addAll(a10);
        hashSet.addAll(b10);
        String[] strArr2 = f.f5254b;
        if (strArr2.length == f.f5253a.length) {
            this.f5267d = new HashMap<>(strArr2.length);
            for (String str : hashSet) {
                int length = str.length();
                if (length > 1 && ((charAt = str.charAt(length - 1)) == 9792 || charAt == 9794)) {
                    String substring = str.substring(0, (length <= 2 || str.charAt(length + (-2)) != 8205) ? length - 1 : length - 2);
                    if (!this.f5267d.containsKey(substring)) {
                        this.f5267d.put(substring, str);
                    }
                }
            }
            while (true) {
                String[] strArr3 = f.f5254b;
                if (i10 < strArr3.length) {
                    this.f5267d.put(f.f5253a[i10], strArr3[i10]);
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new RuntimeException(strArr2.length + " vs " + strArr.length);
        }
    }

    public static int h() {
        int i10 = 0;
        for (String[] strArr : f5262h) {
            i10 += strArr.length;
        }
        return i10;
    }

    public static h i() {
        if (f5259e == null) {
            f5259e = new h();
        }
        return f5259e;
    }

    public static boolean j(final java.lang.CharSequence r8) {
        throw new UnsupportedOperationException("Method not decompiled: ce.h.j(java.lang.CharSequence):boolean");
    }

    public static boolean k(AtomicBoolean atomicBoolean, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, i iVar, int i10, int i11) {
        atomicBoolean.set(i10 == 0 && i11 == charSequence.length());
        return true;
    }

    public String b(String str, String str2) {
        if (ib.i.i(str2)) {
            return str;
        }
        String c10 = c(str, str2, str2);
        if (c10 != null) {
            return c10;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (str.charAt(length) != 8205);
        if (length != -1) {
            sb2.append((CharSequence) str, 0, length);
            sb2.append(str2);
            sb2.append((CharSequence) str, length, str.length());
        } else {
            sb2.append(str);
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public String c(String str, String str2, String str3) {
        return i.c(str, str2.charAt(1), str3.charAt(1));
    }

    public String d(String str, String str2, String[] strArr) {
        if (ib.i.i(str2)) {
            return str;
        }
        if (strArr == null || strArr.length == 0) {
            return b(str, str2);
        }
        String c10 = c(str, str2, strArr[0]);
        return c10 != null ? c10 : b(str, str2);
    }

    public boolean e(Character ch) {
        return this.f5264a.contains(ch);
    }

    public CharSequence f(CharSequence charSequence) {
        return this.f5267d.get(charSequence);
    }

    public int g(String str) {
        if (this.f5265b.contains(str)) {
            return this.f5266c.contains(str) ? 2 : 1;
        }
        return 0;
    }
}
