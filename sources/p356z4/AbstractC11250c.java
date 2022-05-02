package p356z4;

import java.util.Arrays;
import p020b5.C1186a;
import p174m3.C6600g1;
import p187n4.C7227r0;

public abstract class AbstractC11250c implements AbstractC11265j {
    public final C7227r0 f36035a;
    public final int f36036b;
    public final int[] f36037c;
    public final int f36038d;
    public final C6600g1[] f36039e;
    public final long[] f36040f;
    public int f36041g;

    public AbstractC11250c(C7227r0 r0Var, int[] iArr, int i) {
        int i2 = 0;
        C1186a.m38187f(iArr.length > 0);
        this.f36038d = i;
        this.f36035a = (C7227r0) C1186a.m38188e(r0Var);
        int length = iArr.length;
        this.f36036b = length;
        this.f36039e = new C6600g1[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f36039e[i3] = r0Var.m17272b(iArr[i3]);
        }
        Arrays.sort(this.f36039e, C11249b.f36034a);
        this.f36037c = new int[this.f36036b];
        while (true) {
            int i4 = this.f36036b;
            if (i2 < i4) {
                this.f36037c[i2] = r0Var.m17271c(this.f36039e[i2]);
                i2++;
            } else {
                this.f36040f = new long[i4];
                return;
            }
        }
    }

    public static int m1115n(C6600g1 g1Var, C6600g1 g1Var2) {
        return g1Var2.f20571Q - g1Var.f20571Q;
    }

    @Override
    public final C7227r0 mo1010a() {
        return this.f36035a;
    }

    @Override
    public void mo1029c(boolean z) {
        C11264i.m1031b(this, z);
    }

    @Override
    public final C6600g1 mo1009d(int i) {
        return this.f36039e[i];
    }

    @Override
    public void mo1028e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC11250c cVar = (AbstractC11250c) obj;
        return this.f36035a == cVar.f36035a && Arrays.equals(this.f36037c, cVar.f36037c);
    }

    @Override
    public final int mo1008f(int i) {
        return this.f36037c[i];
    }

    @Override
    public final C6600g1 mo1027g() {
        return this.f36039e[mo1021b()];
    }

    @Override
    public void mo1026h() {
    }

    public int hashCode() {
        if (this.f36041g == 0) {
            this.f36041g = (System.identityHashCode(this.f36035a) * 31) + Arrays.hashCode(this.f36037c);
        }
        return this.f36041g;
    }

    @Override
    public void mo1025i(float f) {
    }

    @Override
    public void mo1024j() {
        C11264i.m1032a(this);
    }

    @Override
    public void mo1023k() {
        C11264i.m1030c(this);
    }

    @Override
    public final int mo1007l(int i) {
        for (int i2 = 0; i2 < this.f36036b; i2++) {
            if (this.f36037c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override
    public final int length() {
        return this.f36037c.length;
    }
}
