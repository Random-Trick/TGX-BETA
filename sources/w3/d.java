package w3;

import c5.b0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t3.e;

public final class d extends e {
    public long f25752b = -9223372036854775807L;
    public long[] f25753c = new long[0];
    public long[] f25754d = new long[0];

    public d() {
        super(new e());
    }

    public static Boolean g(b0 b0Var) {
        boolean z10 = true;
        if (b0Var.D() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static Object h(b0 b0Var, int i10) {
        if (i10 == 0) {
            return j(b0Var);
        }
        if (i10 == 1) {
            return g(b0Var);
        }
        if (i10 == 2) {
            return n(b0Var);
        }
        if (i10 == 3) {
            return l(b0Var);
        }
        if (i10 == 8) {
            return k(b0Var);
        }
        if (i10 == 10) {
            return m(b0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return i(b0Var);
    }

    public static Date i(b0 b0Var) {
        Date date = new Date((long) j(b0Var).doubleValue());
        b0Var.Q(2);
        return date;
    }

    public static Double j(b0 b0Var) {
        return Double.valueOf(Double.longBitsToDouble(b0Var.w()));
    }

    public static HashMap<String, Object> k(b0 b0Var) {
        int H = b0Var.H();
        HashMap<String, Object> hashMap = new HashMap<>(H);
        for (int i10 = 0; i10 < H; i10++) {
            String n10 = n(b0Var);
            Object h10 = h(b0Var, o(b0Var));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> l(b0 b0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n10 = n(b0Var);
            int o10 = o(b0Var);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(b0Var, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    public static ArrayList<Object> m(b0 b0Var) {
        int H = b0Var.H();
        ArrayList<Object> arrayList = new ArrayList<>(H);
        for (int i10 = 0; i10 < H; i10++) {
            Object h10 = h(b0Var, o(b0Var));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    public static String n(b0 b0Var) {
        int J = b0Var.J();
        int e10 = b0Var.e();
        b0Var.Q(J);
        return new String(b0Var.d(), e10, J);
    }

    public static int o(b0 b0Var) {
        return b0Var.D();
    }

    @Override
    public boolean b(b0 b0Var) {
        return true;
    }

    @Override
    public boolean c(b0 b0Var, long j10) {
        if (!(o(b0Var) == 2 && "onMetaData".equals(n(b0Var)) && b0Var.a() != 0 && o(b0Var) == 8)) {
            return false;
        }
        HashMap<String, Object> k10 = k(b0Var);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f25752b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f25753c = new long[size];
                this.f25754d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f25753c = new long[0];
                        this.f25754d = new long[0];
                        break;
                    }
                    this.f25753c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f25754d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f25752b;
    }

    public long[] e() {
        return this.f25754d;
    }

    public long[] f() {
        return this.f25753c;
    }
}
