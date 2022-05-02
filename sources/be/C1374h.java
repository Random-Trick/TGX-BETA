package be;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p108hb.C5070i;
import p110hd.C5088i;

public class C1374h {
    public static C1374h f4992e;
    public static final String[] f4993f = {null, "🏻", "🏼", "🏽", "🏾", "🏿"};
    public static final char[] f4994g = {9774, 10013, 9770, 9784, 10017, 9775, 9766, 9934, 9800, 9801, 9802, 9803, 9804, 9805, 9806, 9807, 9808, 9809, 9810, 9811, 9883, 9762, 9763, 10036, 12953, 12951, 9940, 10060, 11093, 9832, 10071, 10069, 10067, 10068, 8252, 8265, 9884, 12349, 9888, 9851, 10055, 10035, 10062, 9989, 10175, 9410, 9855, 9654, 9208, 9199, 9209, 9210, 9197, 9198, 9193, 9194, 9664, 9195, 9196, 10145, 11013, 11014, 11015, 8599, 8600, 8601, 8598, 8597, 8596, 8618, 8617, 10548, 10549, 8505, 12336, 10160, 10004, 10133, 10134, 10135, 10006, 169, 174, 8482, 9745, 9898, 9899, 9642, 9643, 11035, 11036, 9724, 9723, 9726, 9725, 9824, 9827, 9829, 9830, 9786, 9785, 9994, 9996, 9995, 9757, 9997, 9937, 10084, 10083, 9749, 9917, 9918, 9971, 9975, 9976, 9977, 8986, 9000, 9742, 9201, 9202, 9200, 9203, 8987, 9878, 9874, 9935, 9881, 9939, 9876, 9760, 9904, 9905, 9879, 9969, 9993, 9986, 10002, 9999, 9992, 9973, 9972, 9875, 9981, 9970, 9968, 9978, 9962, 9961, 9752, 11088, 10024, 9732, 9728, 9925, 9729, 9928, 9889, 10052, 9731, 9924, 9730, 9748, 9854, 9823, 9895};
    public static final String[][] f4995h = C1366d.f4981c;
    public static final String[][] f4996i = C1368e.f4985a;
    public final HashSet<Character> f4997a;
    public final Set<String> f4998b;
    public final Set<String> f4999c;
    public final HashMap<CharSequence, CharSequence> f5000d;

    public C1374h() {
        String[] strArr;
        char charAt;
        char[] cArr = f4994g;
        this.f4997a = new HashSet<>(cArr.length);
        int i = 0;
        for (char c : cArr) {
            this.f4997a.add(Character.valueOf(c));
        }
        Set<String> b = C1376i.m37376b();
        this.f4999c = b;
        Set<String> a = C1376i.m37377a();
        HashSet<String> hashSet = new HashSet(b.size() + a.size());
        this.f4998b = hashSet;
        hashSet.addAll(a);
        hashSet.addAll(b);
        String[] strArr2 = C1370f.f4987b;
        if (strArr2.length == C1370f.f4986a.length) {
            this.f5000d = new HashMap<>(strArr2.length);
            for (String str : hashSet) {
                int length = str.length();
                if (length > 1 && ((charAt = str.charAt(length - 1)) == 9792 || charAt == 9794)) {
                    String substring = str.substring(0, (length <= 2 || str.charAt(length + (-2)) != 8205) ? length - 1 : length - 2);
                    if (!this.f5000d.containsKey(substring)) {
                        this.f5000d.put(substring, str);
                    }
                }
            }
            while (true) {
                String[] strArr3 = C1370f.f4987b;
                if (i < strArr3.length) {
                    this.f5000d.put(C1370f.f4986a[i], strArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new RuntimeException(strArr2.length + " vs " + strArr.length);
        }
    }

    public static int m37381h() {
        int i = 0;
        for (String[] strArr : f4995h) {
            i += strArr.length;
        }
        return i;
    }

    public static C1374h m37380i() {
        if (f4992e == null) {
            f4992e = new C1374h();
        }
        return f4992e;
    }

    public static boolean m37379j(final java.lang.CharSequence r8) {
        throw new UnsupportedOperationException("Method not decompiled: be.C1374h.m37379j(java.lang.CharSequence):boolean");
    }

    public static boolean m37378k(AtomicBoolean atomicBoolean, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C5088i iVar, int i, int i2) {
        atomicBoolean.set(i == 0 && i2 == charSequence.length());
        return true;
    }

    public String m37387b(String str, String str2) {
        if (C5070i.m24061i(str2)) {
            return str;
        }
        String c = m37386c(str, str2, str2);
        if (c != null) {
            return c;
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

    public String m37386c(String str, String str2, String str3) {
        return C1376i.m37375c(str, str2.charAt(1), str3.charAt(1));
    }

    public String m37385d(String str, String str2, String[] strArr) {
        if (C5070i.m24061i(str2)) {
            return str;
        }
        if (strArr == null || strArr.length == 0) {
            return m37387b(str, str2);
        }
        String c = m37386c(str, str2, strArr[0]);
        return c != null ? c : m37387b(str, str2);
    }

    public boolean m37384e(Character ch) {
        return this.f4997a.contains(ch);
    }

    public CharSequence m37383f(CharSequence charSequence) {
        return this.f5000d.get(charSequence);
    }

    public int m37382g(String str) {
        if (this.f4998b.contains(str)) {
            return this.f4999c.contains(str) ? 2 : 1;
        }
        return 0;
    }
}
