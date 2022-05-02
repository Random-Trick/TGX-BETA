package p174m3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p020b5.C1216l0;
import p187n4.AbstractC7214n0;

public final class C6676o2 extends AbstractC6553a {
    public final int f20895O;
    public final int f20896P;
    public final int[] f20897Q;
    public final int[] f20898R;
    public final AbstractC6604g3[] f20899S;
    public final Object[] f20900T;
    public final HashMap<Object, Integer> f20901U = new HashMap<>();

    public C6676o2(Collection<? extends AbstractC6716x1> collection, AbstractC7214n0 n0Var) {
        super(false, n0Var);
        int i = 0;
        int size = collection.size();
        this.f20897Q = new int[size];
        this.f20898R = new int[size];
        this.f20899S = new AbstractC6604g3[size];
        this.f20900T = new Object[size];
        int i2 = 0;
        int i3 = 0;
        for (AbstractC6716x1 x1Var : collection) {
            this.f20899S[i3] = x1Var.mo19182b();
            this.f20898R[i3] = i;
            this.f20897Q[i3] = i2;
            i += this.f20899S[i3].mo17297v();
            i2 += this.f20899S[i3].mo17300m();
            this.f20900T[i3] = x1Var.mo19183a();
            HashMap<Object, Integer> hashMap = this.f20901U;
            Object obj = this.f20900T[i3];
            i3++;
            hashMap.put(obj, Integer.valueOf(i3));
        }
        this.f20895O = i;
        this.f20896P = i2;
    }

    @Override
    public int mo17344A(int i) {
        return C1216l0.m37975h(this.f20897Q, i + 1, false, false);
    }

    @Override
    public int mo17343B(int i) {
        return C1216l0.m37975h(this.f20898R, i + 1, false, false);
    }

    @Override
    public Object mo17342E(int i) {
        return this.f20900T[i];
    }

    @Override
    public int mo17341G(int i) {
        return this.f20897Q[i];
    }

    @Override
    public int mo17340H(int i) {
        return this.f20898R[i];
    }

    @Override
    public AbstractC6604g3 mo17339K(int i) {
        return this.f20899S[i];
    }

    public List<AbstractC6604g3> m19586L() {
        return Arrays.asList(this.f20899S);
    }

    @Override
    public int mo17300m() {
        return this.f20896P;
    }

    @Override
    public int mo17297v() {
        return this.f20895O;
    }

    @Override
    public int mo17338z(Object obj) {
        Integer num = this.f20901U.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
