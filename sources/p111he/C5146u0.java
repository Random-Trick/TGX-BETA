package p111he;

import java.util.ArrayList;
import java.util.List;
import p082fd.C4403w;
import p108hb.C5070i;

public class C5146u0 {
    public final List<String> f17233a;

    public C5146u0(int i) {
        this.f17233a = new ArrayList(i);
    }

    public static String[] m23815c(int... iArr) {
        String[] strArr = new String[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            i++;
            strArr[i] = C4403w.m27871i1(i2);
        }
        return strArr;
    }

    public void m23817a(int i) {
        m23816b(C4403w.m27871i1(i));
    }

    public void m23816b(String str) {
        this.f17233a.add(str);
    }

    public String[] m23814d() {
        return (String[]) this.f17233a.toArray(new String[0]);
    }

    public int m23813e(String str) {
        return this.f17233a.indexOf(str);
    }

    public boolean m23812f() {
        return this.f17233a.isEmpty();
    }

    public String m23811g(String str, String str2) {
        return C5070i.m24057n(str, str2, this.f17233a);
    }
}
