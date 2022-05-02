package p317wa;

import p123ia.AbstractC5286d0;
import p153ka.C6223c;
import p251ra.AbstractC8415a;
import qa.C8294g;

public class C10019e implements Iterable<Integer>, AbstractC8415a {
    public static final C10020a f32626M = new C10020a(null);
    public final int f32627a;
    public final int f32628b;
    public final int f32629c;

    public static final class C10020a {
        public C10020a() {
        }

        public C10020a(C8294g gVar) {
            this();
        }

        public final C10019e m6207a(int i, int i2, int i3) {
            return new C10019e(i, i2, i3);
        }
    }

    public C10019e(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f32627a = i;
            this.f32628b = C6223c.m21038c(i, i2, i3);
            this.f32629c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10019e) {
            if (!isEmpty() || !((C10019e) obj).isEmpty()) {
                C10019e eVar = (C10019e) obj;
                if (!(this.f32627a == eVar.f32627a && this.f32628b == eVar.f32628b && this.f32629c == eVar.f32629c)) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f32627a * 31) + this.f32628b) * 31) + this.f32629c;
    }

    public boolean isEmpty() {
        if (this.f32629c > 0) {
            if (this.f32627a > this.f32628b) {
                return true;
            }
        } else if (this.f32627a < this.f32628b) {
            return true;
        }
        return false;
    }

    public final int m6211r() {
        return this.f32627a;
    }

    public final int m6210s() {
        return this.f32628b;
    }

    public final int m6209t() {
        return this.f32629c;
    }

    public String toString() {
        int i;
        StringBuilder sb2;
        if (this.f32629c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f32627a);
            sb2.append("..");
            sb2.append(this.f32628b);
            sb2.append(" step ");
            i = this.f32629c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f32627a);
            sb2.append(" downTo ");
            sb2.append(this.f32628b);
            sb2.append(" step ");
            i = -this.f32629c;
        }
        sb2.append(i);
        return sb2.toString();
    }

    public AbstractC5286d0 iterator() {
        return new C10021f(this.f32627a, this.f32628b, this.f32629c);
    }
}
