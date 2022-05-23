package xa;

import ja.d0;
import la.c;
import ra.g;

public class e implements Iterable<Integer>, sa.a {
    public static final a M = new a(null);
    public final int f26191a;
    public final int f26192b;
    public final int f26193c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final e a(int i10, int i11, int i12) {
            return new e(i10, i11, i12);
        }
    }

    public e(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f26191a = i10;
            this.f26192b = c.c(i10, i11, i12);
            this.f26193c = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (!(this.f26191a == eVar.f26191a && this.f26192b == eVar.f26192b && this.f26193c == eVar.f26193c)) {
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
        return (((this.f26191a * 31) + this.f26192b) * 31) + this.f26193c;
    }

    public boolean isEmpty() {
        if (this.f26193c > 0) {
            if (this.f26191a > this.f26192b) {
                return true;
            }
        } else if (this.f26191a < this.f26192b) {
            return true;
        }
        return false;
    }

    public final int r() {
        return this.f26191a;
    }

    public final int s() {
        return this.f26192b;
    }

    public final int t() {
        return this.f26193c;
    }

    public String toString() {
        int i10;
        StringBuilder sb2;
        if (this.f26193c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f26191a);
            sb2.append("..");
            sb2.append(this.f26192b);
            sb2.append(" step ");
            i10 = this.f26193c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f26191a);
            sb2.append(" downTo ");
            sb2.append(this.f26192b);
            sb2.append(" step ");
            i10 = -this.f26193c;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public d0 iterator() {
        return new f(this.f26191a, this.f26192b, this.f26193c);
    }
}
