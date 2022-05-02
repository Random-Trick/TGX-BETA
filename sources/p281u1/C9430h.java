package p281u1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p323x1.AbstractC10072d;
import p323x1.AbstractC10073e;

public class C9430h implements AbstractC10073e, AbstractC10072d {
    public static final TreeMap<Integer, C9430h> f30536R = new TreeMap<>();
    public final String[] f30537M;
    public final byte[][] f30538N;
    public final int[] f30539O;
    public final int f30540P;
    public int f30541Q;
    public volatile String f30542a;
    public final long[] f30543b;
    public final double[] f30544c;

    public C9430h(int i) {
        this.f30540P = i;
        int i2 = i + 1;
        this.f30539O = new int[i2];
        this.f30543b = new long[i2];
        this.f30544c = new double[i2];
        this.f30537M = new String[i2];
        this.f30538N = new byte[i2];
    }

    public static void m8684A0() {
        TreeMap<Integer, C9430h> treeMap = f30536R;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                size--;
                if (size > 0) {
                    it.next();
                    it.remove();
                } else {
                    return;
                }
            }
        }
    }

    public static C9430h m8682y0(String str, int i) {
        TreeMap<Integer, C9430h> treeMap = f30536R;
        synchronized (treeMap) {
            Map.Entry<Integer, C9430h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C9430h value = ceilingEntry.getValue();
                value.m8681z0(str, i);
                return value;
            }
            C9430h hVar = new C9430h(i);
            hVar.m8681z0(str, i);
            return hVar;
        }
    }

    public void m8683B0() {
        TreeMap<Integer, C9430h> treeMap = f30536R;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f30540P), this);
            m8684A0();
        }
    }

    @Override
    public void mo5376J(int i, long j) {
        this.f30539O[i] = 2;
        this.f30543b[i] = j;
    }

    @Override
    public void mo5375N(int i, byte[] bArr) {
        this.f30539O[i] = 5;
        this.f30538N[i] = bArr;
    }

    @Override
    public void close() {
    }

    @Override
    public void mo5374d0(int i) {
        this.f30539O[i] = 1;
    }

    @Override
    public void mo6071m(AbstractC10072d dVar) {
        for (int i = 1; i <= this.f30541Q; i++) {
            int i2 = this.f30539O[i];
            if (i2 == 1) {
                dVar.mo5374d0(i);
            } else if (i2 == 2) {
                dVar.mo5376J(i, this.f30543b[i]);
            } else if (i2 == 3) {
                dVar.mo5372z(i, this.f30544c[i]);
            } else if (i2 == 4) {
                dVar.mo5373q(i, this.f30537M[i]);
            } else if (i2 == 5) {
                dVar.mo5375N(i, this.f30538N[i]);
            }
        }
    }

    @Override
    public void mo5373q(int i, String str) {
        this.f30539O[i] = 4;
        this.f30537M[i] = str;
    }

    @Override
    public String mo6070t() {
        return this.f30542a;
    }

    @Override
    public void mo5372z(int i, double d) {
        this.f30539O[i] = 3;
        this.f30544c[i] = d;
    }

    public void m8681z0(String str, int i) {
        this.f30542a = str;
        this.f30541Q = i;
    }
}
