package m3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import o4.l0;

public final class x2 extends a {
    public final int O;
    public final int P;
    public final int[] Q;
    public final int[] R;
    public final o3[] S;
    public final Object[] T;
    public final HashMap<Object, Integer> U = new HashMap<>();

    public x2(Collection<? extends h2> collection, l0 l0Var) {
        super(false, l0Var);
        int i10 = 0;
        int size = collection.size();
        this.Q = new int[size];
        this.R = new int[size];
        this.S = new o3[size];
        this.T = new Object[size];
        int i11 = 0;
        int i12 = 0;
        for (h2 h2Var : collection) {
            this.S[i12] = h2Var.b();
            this.R[i12] = i10;
            this.Q[i12] = i11;
            i10 += this.S[i12].t();
            i11 += this.S[i12].m();
            this.T[i12] = h2Var.a();
            HashMap<Object, Integer> hashMap = this.U;
            Object obj = this.T[i12];
            i12++;
            hashMap.put(obj, Integer.valueOf(i12));
        }
        this.O = i10;
        this.P = i11;
    }

    @Override
    public Object C(int i10) {
        return this.T[i10];
    }

    @Override
    public int E(int i10) {
        return this.Q[i10];
    }

    @Override
    public int F(int i10) {
        return this.R[i10];
    }

    @Override
    public o3 I(int i10) {
        return this.S[i10];
    }

    public List<o3> J() {
        return Arrays.asList(this.S);
    }

    @Override
    public int m() {
        return this.P;
    }

    @Override
    public int t() {
        return this.O;
    }

    @Override
    public int x(Object obj) {
        Integer num = this.U.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public int y(int i10) {
        return c5.l0.h(this.Q, i10 + 1, false, false);
    }

    @Override
    public int z(int i10) {
        return c5.l0.h(this.R, i10 + 1, false, false);
    }
}
