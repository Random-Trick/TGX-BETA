package p310w3;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p020b5.C1189b0;
import p270t3.C8957e;

public final class C9964d extends AbstractC9965e {
    public long f32383b = -9223372036854775807L;
    public long[] f32384c = new long[0];
    public long[] f32385d = new long[0];

    public C9964d() {
        super(new C8957e());
    }

    public static Boolean m6400g(C1189b0 b0Var) {
        boolean z = true;
        if (b0Var.m38159D() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Object m6399h(C1189b0 b0Var, int i) {
        if (i == 0) {
            return m6397j(b0Var);
        }
        if (i == 1) {
            return m6400g(b0Var);
        }
        if (i == 2) {
            return m6393n(b0Var);
        }
        if (i == 3) {
            return m6395l(b0Var);
        }
        if (i == 8) {
            return m6396k(b0Var);
        }
        if (i == 10) {
            return m6394m(b0Var);
        }
        if (i != 11) {
            return null;
        }
        return m6398i(b0Var);
    }

    public static Date m6398i(C1189b0 b0Var) {
        Date date = new Date((long) m6397j(b0Var).doubleValue());
        b0Var.m38146Q(2);
        return date;
    }

    public static Double m6397j(C1189b0 b0Var) {
        return Double.valueOf(Double.longBitsToDouble(b0Var.m38123w()));
    }

    public static HashMap<String, Object> m6396k(C1189b0 b0Var) {
        int H = b0Var.m38155H();
        HashMap<String, Object> hashMap = new HashMap<>(H);
        for (int i = 0; i < H; i++) {
            String n = m6393n(b0Var);
            Object h = m6399h(b0Var, m6392o(b0Var));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> m6395l(C1189b0 b0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n = m6393n(b0Var);
            int o = m6392o(b0Var);
            if (o == 9) {
                return hashMap;
            }
            Object h = m6399h(b0Var, o);
            if (h != null) {
                hashMap.put(n, h);
            }
        }
    }

    public static ArrayList<Object> m6394m(C1189b0 b0Var) {
        int H = b0Var.m38155H();
        ArrayList<Object> arrayList = new ArrayList<>(H);
        for (int i = 0; i < H; i++) {
            Object h = m6399h(b0Var, m6392o(b0Var));
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    public static String m6393n(C1189b0 b0Var) {
        int J = b0Var.m38153J();
        int e = b0Var.m38141e();
        b0Var.m38146Q(J);
        return new String(b0Var.m38142d(), e, J);
    }

    public static int m6392o(C1189b0 b0Var) {
        return b0Var.m38159D();
    }

    @Override
    public boolean mo6390b(C1189b0 b0Var) {
        return true;
    }

    @Override
    public boolean mo6389c(C1189b0 b0Var, long j) {
        if (!(m6392o(b0Var) == 2 && "onMetaData".equals(m6393n(b0Var)) && m6392o(b0Var) == 8)) {
            return false;
        }
        HashMap<String, Object> k = m6396k(b0Var);
        Object obj = k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f32383b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f32384c = new long[size];
                this.f32385d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f32384c = new long[0];
                        this.f32385d = new long[0];
                        break;
                    }
                    this.f32384c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f32385d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long m6403d() {
        return this.f32383b;
    }

    public long[] m6402e() {
        return this.f32385d;
    }

    public long[] m6401f() {
        return this.f32384c;
    }
}
