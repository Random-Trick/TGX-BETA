package e9;

import java.math.BigInteger;
import java.util.Arrays;

public class a {
    public byte[] f11392a = new byte[0];
    public j[] f11393b = null;

    public abstract class AbstractC0095a implements j {
        public AbstractC0095a() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            j jVar = (j) obj;
            return clear() == jVar.clear() && a() == jVar.a();
        }

        public String toString() {
            return "P(" + clear() + "|" + a() + ")";
        }

        public AbstractC0095a(a aVar, AbstractC0095a aVar2) {
            this();
        }
    }

    public class b extends AbstractC0095a {
        public byte f11395b;
        public byte f11396c;

        public b(int i10, long j10) {
            super(a.this, null);
            this.f11395b = (byte) i10;
            this.f11396c = (byte) j10;
        }

        @Override
        public long a() {
            return this.f11396c;
        }

        @Override
        public int clear() {
            return this.f11395b;
        }
    }

    public class c extends AbstractC0095a {
        public byte f11398b;
        public int f11399c;

        public c(int i10, long j10) {
            super(a.this, null);
            this.f11398b = (byte) i10;
            this.f11399c = (int) j10;
        }

        @Override
        public long a() {
            return this.f11399c;
        }

        @Override
        public int clear() {
            return this.f11398b;
        }
    }

    public class d extends AbstractC0095a {
        public byte f11401b;
        public long f11402c;

        public d(int i10, long j10) {
            super(a.this, null);
            this.f11401b = (byte) i10;
            this.f11402c = j10;
        }

        @Override
        public long a() {
            return this.f11402c;
        }

        @Override
        public int clear() {
            return this.f11401b;
        }
    }

    public class e extends AbstractC0095a {
        public byte f11404b;
        public short f11405c;

        public e(int i10, long j10) {
            super(a.this, null);
            this.f11404b = (byte) i10;
            this.f11405c = (short) j10;
        }

        @Override
        public long a() {
            return this.f11405c;
        }

        @Override
        public int clear() {
            return this.f11404b;
        }
    }

    public class f extends AbstractC0095a {
        public int f11407b;
        public byte f11408c;

        public f(int i10, long j10) {
            super(a.this, null);
            this.f11407b = i10;
            this.f11408c = (byte) j10;
        }

        @Override
        public long a() {
            return this.f11408c;
        }

        @Override
        public int clear() {
            return this.f11407b;
        }
    }

    public class g extends AbstractC0095a {
        public int f11410b;
        public int f11411c;

        public g(int i10, long j10) {
            super(a.this, null);
            this.f11410b = i10;
            this.f11411c = (int) j10;
        }

        @Override
        public long a() {
            return this.f11411c;
        }

        @Override
        public int clear() {
            return this.f11410b;
        }
    }

    public class h extends AbstractC0095a {
        public int f11413b;
        public long f11414c;

        public h(int i10, long j10) {
            super(a.this, null);
            this.f11413b = i10;
            this.f11414c = j10;
        }

        @Override
        public long a() {
            return this.f11414c;
        }

        @Override
        public int clear() {
            return this.f11413b;
        }
    }

    public class i extends AbstractC0095a {
        public int f11416b;
        public short f11417c;

        public i(int i10, long j10) {
            super(a.this, null);
            this.f11416b = i10;
            this.f11417c = (short) j10;
        }

        @Override
        public long a() {
            return this.f11417c;
        }

        @Override
        public int clear() {
            return this.f11416b;
        }
    }

    public interface j {
        long a();

        int clear();
    }

    public class k extends AbstractC0095a {
        public short f11419b;
        public byte f11420c;

        public k(int i10, long j10) {
            super(a.this, null);
            this.f11419b = (short) i10;
            this.f11420c = (byte) j10;
        }

        @Override
        public long a() {
            return this.f11420c;
        }

        @Override
        public int clear() {
            return this.f11419b;
        }
    }

    public class l extends AbstractC0095a {
        public short f11422b;
        public int f11423c;

        public l(int i10, long j10) {
            super(a.this, null);
            this.f11422b = (short) i10;
            this.f11423c = (int) j10;
        }

        @Override
        public long a() {
            return this.f11423c;
        }

        @Override
        public int clear() {
            return this.f11422b;
        }
    }

    public class m extends AbstractC0095a {
        public short f11425b;
        public long f11426c;

        public m(int i10, long j10) {
            super(a.this, null);
            this.f11425b = (short) i10;
            this.f11426c = j10;
        }

        @Override
        public long a() {
            return this.f11426c;
        }

        @Override
        public int clear() {
            return this.f11425b;
        }
    }

    public class n extends AbstractC0095a {
        public short f11428b;
        public short f11429c;

        public n(int i10, long j10) {
            super(a.this, null);
            this.f11428b = (short) i10;
            this.f11429c = (short) j10;
        }

        @Override
        public long a() {
            return this.f11429c;
        }

        @Override
        public int clear() {
            return this.f11428b;
        }
    }

    public j a(int i10, long j10) {
        if (i10 <= 127) {
            if (j10 <= 127) {
                return new b(i10, j10);
            }
            if (j10 <= 32767) {
                return new e(i10, j10);
            }
            if (j10 <= 2147483647L) {
                return new c(i10, j10);
            }
            return new d(i10, j10);
        } else if (i10 <= 32767) {
            if (j10 <= 127) {
                return new k(i10, j10);
            }
            if (j10 <= 32767) {
                return new n(i10, j10);
            }
            if (j10 <= 2147483647L) {
                return new l(i10, j10);
            }
            return new m(i10, j10);
        } else if (j10 <= 127) {
            return new f(i10, j10);
        } else {
            if (j10 <= 32767) {
                return new i(i10, j10);
            }
            if (j10 <= 2147483647L) {
                return new g(i10, j10);
            }
            return new h(i10, j10);
        }
    }

    public int b() {
        int length = this.f11392a.length;
        j[] jVarArr = this.f11393b;
        return (jVarArr == null || jVarArr.length <= 0) ? length : length + 2 + (jVarArr.length * 6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!new BigInteger(this.f11392a).equals(new BigInteger(aVar.f11392a))) {
            return false;
        }
        j[] jVarArr = this.f11393b;
        j[] jVarArr2 = aVar.f11393b;
        return jVarArr == null ? jVarArr2 == null : Arrays.equals(jVarArr, jVarArr2);
    }

    public int hashCode() {
        byte[] bArr = this.f11392a;
        int i10 = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        j[] jVarArr = this.f11393b;
        if (jVarArr != null) {
            i10 = Arrays.hashCode(jVarArr);
        }
        return hashCode + i10;
    }

    public String toString() {
        return "Entry{iv=" + s2.c.b(this.f11392a) + ", pairs=" + Arrays.toString(this.f11393b) + '}';
    }
}
