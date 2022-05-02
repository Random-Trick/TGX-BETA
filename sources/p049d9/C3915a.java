package p049d9;

import java.math.BigInteger;
import java.util.Arrays;
import p258s2.C8630c;

public class C3915a {
    public byte[] f13219a = new byte[0];
    public AbstractC3925j[] f13220b = null;

    public abstract class AbstractC3916a implements AbstractC3925j {
        public AbstractC3916a() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AbstractC3925j jVar = (AbstractC3925j) obj;
            return clear() == jVar.clear() && mo29597a() == jVar.mo29597a();
        }

        public String toString() {
            return "P(" + clear() + "|" + mo29597a() + ")";
        }

        public AbstractC3916a(C3915a aVar, AbstractC3916a aVar2) {
            this();
        }
    }

    public class C3917b extends AbstractC3916a {
        public byte f13222b;
        public byte f13223c;

        public C3917b(int i, long j) {
            super(C3915a.this, null);
            this.f13222b = (byte) i;
            this.f13223c = (byte) j;
        }

        @Override
        public long mo29597a() {
            return this.f13223c;
        }

        @Override
        public int clear() {
            return this.f13222b;
        }
    }

    public class C3918c extends AbstractC3916a {
        public byte f13225b;
        public int f13226c;

        public C3918c(int i, long j) {
            super(C3915a.this, null);
            this.f13225b = (byte) i;
            this.f13226c = (int) j;
        }

        @Override
        public long mo29597a() {
            return this.f13226c;
        }

        @Override
        public int clear() {
            return this.f13225b;
        }
    }

    public class C3919d extends AbstractC3916a {
        public byte f13228b;
        public long f13229c;

        public C3919d(int i, long j) {
            super(C3915a.this, null);
            this.f13228b = (byte) i;
            this.f13229c = j;
        }

        @Override
        public long mo29597a() {
            return this.f13229c;
        }

        @Override
        public int clear() {
            return this.f13228b;
        }
    }

    public class C3920e extends AbstractC3916a {
        public byte f13231b;
        public short f13232c;

        public C3920e(int i, long j) {
            super(C3915a.this, null);
            this.f13231b = (byte) i;
            this.f13232c = (short) j;
        }

        @Override
        public long mo29597a() {
            return this.f13232c;
        }

        @Override
        public int clear() {
            return this.f13231b;
        }
    }

    public class C3921f extends AbstractC3916a {
        public int f13234b;
        public byte f13235c;

        public C3921f(int i, long j) {
            super(C3915a.this, null);
            this.f13234b = i;
            this.f13235c = (byte) j;
        }

        @Override
        public long mo29597a() {
            return this.f13235c;
        }

        @Override
        public int clear() {
            return this.f13234b;
        }
    }

    public class C3922g extends AbstractC3916a {
        public int f13237b;
        public int f13238c;

        public C3922g(int i, long j) {
            super(C3915a.this, null);
            this.f13237b = i;
            this.f13238c = (int) j;
        }

        @Override
        public long mo29597a() {
            return this.f13238c;
        }

        @Override
        public int clear() {
            return this.f13237b;
        }
    }

    public class C3923h extends AbstractC3916a {
        public int f13240b;
        public long f13241c;

        public C3923h(int i, long j) {
            super(C3915a.this, null);
            this.f13240b = i;
            this.f13241c = j;
        }

        @Override
        public long mo29597a() {
            return this.f13241c;
        }

        @Override
        public int clear() {
            return this.f13240b;
        }
    }

    public class C3924i extends AbstractC3916a {
        public int f13243b;
        public short f13244c;

        public C3924i(int i, long j) {
            super(C3915a.this, null);
            this.f13243b = i;
            this.f13244c = (short) j;
        }

        @Override
        public long mo29597a() {
            return this.f13244c;
        }

        @Override
        public int clear() {
            return this.f13243b;
        }
    }

    public interface AbstractC3925j {
        long mo29597a();

        int clear();
    }

    public class C3926k extends AbstractC3916a {
        public short f13246b;
        public byte f13247c;

        public C3926k(int i, long j) {
            super(C3915a.this, null);
            this.f13246b = (short) i;
            this.f13247c = (byte) j;
        }

        @Override
        public long mo29597a() {
            return this.f13247c;
        }

        @Override
        public int clear() {
            return this.f13246b;
        }
    }

    public class C3927l extends AbstractC3916a {
        public short f13249b;
        public int f13250c;

        public C3927l(int i, long j) {
            super(C3915a.this, null);
            this.f13249b = (short) i;
            this.f13250c = (int) j;
        }

        @Override
        public long mo29597a() {
            return this.f13250c;
        }

        @Override
        public int clear() {
            return this.f13249b;
        }
    }

    public class C3928m extends AbstractC3916a {
        public short f13252b;
        public long f13253c;

        public C3928m(int i, long j) {
            super(C3915a.this, null);
            this.f13252b = (short) i;
            this.f13253c = j;
        }

        @Override
        public long mo29597a() {
            return this.f13253c;
        }

        @Override
        public int clear() {
            return this.f13252b;
        }
    }

    public class C3929n extends AbstractC3916a {
        public short f13255b;
        public short f13256c;

        public C3929n(int i, long j) {
            super(C3915a.this, null);
            this.f13255b = (short) i;
            this.f13256c = (short) j;
        }

        @Override
        public long mo29597a() {
            return this.f13256c;
        }

        @Override
        public int clear() {
            return this.f13255b;
        }
    }

    public AbstractC3925j m29599a(int i, long j) {
        if (i <= 127) {
            if (j <= 127) {
                return new C3917b(i, j);
            }
            if (j <= 32767) {
                return new C3920e(i, j);
            }
            if (j <= 2147483647L) {
                return new C3918c(i, j);
            }
            return new C3919d(i, j);
        } else if (i <= 32767) {
            if (j <= 127) {
                return new C3926k(i, j);
            }
            if (j <= 32767) {
                return new C3929n(i, j);
            }
            if (j <= 2147483647L) {
                return new C3927l(i, j);
            }
            return new C3928m(i, j);
        } else if (j <= 127) {
            return new C3921f(i, j);
        } else {
            if (j <= 32767) {
                return new C3924i(i, j);
            }
            if (j <= 2147483647L) {
                return new C3922g(i, j);
            }
            return new C3923h(i, j);
        }
    }

    public int m29598b() {
        int length = this.f13219a.length;
        AbstractC3925j[] jVarArr = this.f13220b;
        return (jVarArr == null || jVarArr.length <= 0) ? length : length + 2 + (jVarArr.length * 6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3915a aVar = (C3915a) obj;
        if (!new BigInteger(this.f13219a).equals(new BigInteger(aVar.f13219a))) {
            return false;
        }
        AbstractC3925j[] jVarArr = this.f13220b;
        AbstractC3925j[] jVarArr2 = aVar.f13220b;
        return jVarArr == null ? jVarArr2 == null : Arrays.equals(jVarArr, jVarArr2);
    }

    public int hashCode() {
        byte[] bArr = this.f13219a;
        int i = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        AbstractC3925j[] jVarArr = this.f13220b;
        if (jVarArr != null) {
            i = Arrays.hashCode(jVarArr);
        }
        return hashCode + i;
    }

    public String toString() {
        return "Entry{iv=" + C8630c.m11880b(this.f13219a) + ", pairs=" + Arrays.toString(this.f13220b) + '}';
    }
}
