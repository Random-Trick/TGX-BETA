package p281u1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p323x1.AbstractC10072d;
import p323x1.AbstractC10073e;

public class C9430h implements AbstractC10073e, AbstractC10072d {
    public static final TreeMap<Integer, C9430h> f30533R = new TreeMap<>();
    public final String[] f30534M;
    public final byte[][] f30535N;
    public final int[] f30536O;
    public final int f30537P;
    public int f30538Q;
    public volatile String f30539a;
    public final long[] f30540b;
    public final double[] f30541c;

    public C9430h(int i) {
        this.f30537P = i;
        int i2 = i + 1;
        this.f30536O = new int[i2];
        this.f30540b = new long[i2];
        this.f30541c = new double[i2];
        this.f30534M = new String[i2];
        this.f30535N = new byte[i2];
    }

    public static void m8684A0() {
        TreeMap<Integer, C9430h> treeMap = f30533R;
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
        TreeMap<Integer, C9430h> treeMap = f30533R;
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
        TreeMap<Integer, C9430h> treeMap = f30533R;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f30537P), this);
            m8684A0();
        }
    }

    @Override
    public void mo5376J(int i, long j) {
        this.f30536O[i] = 2;
        this.f30540b[i] = j;
    }

    @Override
    public void mo5375N(int i, byte[] bArr) {
        this.f30536O[i] = 5;
        this.f30535N[i] = bArr;
    }

    @Override
    public void close() {
    }

    @Override
    public void mo5374d0(int i) {
        this.f30536O[i] = 1;
    }

    @Override
    public void mo6071m(AbstractC10072d dVar) {
        for (int i = 1; i <= this.f30538Q; i++) {
            int i2 = this.f30536O[i];
            if (i2 == 1) {
                dVar.mo5374d0(i);
            } else if (i2 == 2) {
                dVar.mo5376J(i, this.f30540b[i]);
            } else if (i2 == 3) {
                dVar.mo5372z(i, this.f30541c[i]);
            } else if (i2 == 4) {
                dVar.mo5373q(i, this.f30534M[i]);
            } else if (i2 == 5) {
                dVar.mo5375N(i, this.f30535N[i]);
            }
        }
    }

    @Override
    public void mo5373q(int i, String str) {
        this.f30536O[i] = 4;
        this.f30534M[i] = str;
    }

    @Override
    public String mo6070t() {
        return this.f30539a;
    }

    @Override
    public void mo5372z(int i, double d) {
        this.f30536O[i] = 3;
        this.f30541c[i] = d;
    }

    public void m8681z0(String str, int i) {
        this.f30539a = str;
        this.f30538Q = i;
    }
}
