package u1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import x1.d;
import x1.e;

public class h implements e, d {
    public static final TreeMap<Integer, h> R = new TreeMap<>();
    public final String[] M;
    public final byte[][] N;
    public final int[] O;
    public final int P;
    public int Q;
    public volatile String f23520a;
    public final long[] f23521b;
    public final double[] f23522c;

    public h(int i10) {
        this.P = i10;
        int i11 = i10 + 1;
        this.O = new int[i11];
        this.f23521b = new long[i11];
        this.f23522c = new double[i11];
        this.M = new String[i11];
        this.N = new byte[i11];
    }

    public static void A0() {
        TreeMap<Integer, h> treeMap = R;
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

    public static h y0(String str, int i10) {
        TreeMap<Integer, h> treeMap = R;
        synchronized (treeMap) {
            Map.Entry<Integer, h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                h value = ceilingEntry.getValue();
                value.z0(str, i10);
                return value;
            }
            h hVar = new h(i10);
            hVar.z0(str, i10);
            return hVar;
        }
    }

    public void B0() {
        TreeMap<Integer, h> treeMap = R;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.P), this);
            A0();
        }
    }

    @Override
    public void K(int i10, long j10) {
        this.O[i10] = 2;
        this.f23521b[i10] = j10;
    }

    @Override
    public void O(int i10, byte[] bArr) {
        this.O[i10] = 5;
        this.N[i10] = bArr;
    }

    @Override
    public void close() {
    }

    @Override
    public void f0(int i10) {
        this.O[i10] = 1;
    }

    @Override
    public void m(d dVar) {
        for (int i10 = 1; i10 <= this.Q; i10++) {
            int i11 = this.O[i10];
            if (i11 == 1) {
                dVar.f0(i10);
            } else if (i11 == 2) {
                dVar.K(i10, this.f23521b[i10]);
            } else if (i11 == 3) {
                dVar.y(i10, this.f23522c[i10]);
            } else if (i11 == 4) {
                dVar.q(i10, this.M[i10]);
            } else if (i11 == 5) {
                dVar.O(i10, this.N[i10]);
            }
        }
    }

    @Override
    public void q(int i10, String str) {
        this.O[i10] = 4;
        this.M[i10] = str;
    }

    @Override
    public String s() {
        return this.f23520a;
    }

    @Override
    public void y(int i10, double d10) {
        this.O[i10] = 3;
        this.f23522c[i10] = d10;
    }

    public void z0(String str, int i10) {
        this.f23520a = str;
        this.Q = i10;
    }
}
