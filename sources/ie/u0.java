package ie;

import gd.w;
import ib.i;
import java.util.ArrayList;
import java.util.List;

public class u0 {
    public final List<String> f14291a;

    public u0(int i10) {
        this.f14291a = new ArrayList(i10);
    }

    public static String[] c(int... iArr) {
        String[] strArr = new String[iArr.length];
        int i10 = 0;
        for (int i11 : iArr) {
            i10++;
            strArr[i10] = w.i1(i11);
        }
        return strArr;
    }

    public void a(int i10) {
        b(w.i1(i10));
    }

    public void b(String str) {
        this.f14291a.add(str);
    }

    public String[] d() {
        return (String[]) this.f14291a.toArray(new String[0]);
    }

    public int e(String str) {
        return this.f14291a.indexOf(str);
    }

    public boolean f() {
        return this.f14291a.isEmpty();
    }

    public String g(String str, String str2) {
        return i.n(str, str2, this.f14291a);
    }
}
