package p030c3;

import java.util.Arrays;
import java.util.Objects;
import p018b3.AbstractC1150h;
import p030c3.AbstractC1539f;

public final class C1532a extends AbstractC1539f {
    public final Iterable<AbstractC1150h> f5481a;
    public final byte[] f5482b;

    public static final class C1534b extends AbstractC1539f.AbstractC1540a {
        public Iterable<AbstractC1150h> f5483a;
        public byte[] f5484b;

        @Override
        public AbstractC1539f mo36511a() {
            String str = "";
            if (this.f5483a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C1532a(this.f5483a, this.f5484b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC1539f.AbstractC1540a mo36510b(Iterable<AbstractC1150h> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f5483a = iterable;
            return this;
        }

        @Override
        public AbstractC1539f.AbstractC1540a mo36509c(byte[] bArr) {
            this.f5484b = bArr;
            return this;
        }
    }

    @Override
    public Iterable<AbstractC1150h> mo36513b() {
        return this.f5481a;
    }

    @Override
    public byte[] mo36512c() {
        return this.f5482b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1539f)) {
            return false;
        }
        AbstractC1539f fVar = (AbstractC1539f) obj;
        if (this.f5481a.equals(fVar.mo36513b())) {
            if (Arrays.equals(this.f5482b, fVar instanceof C1532a ? ((C1532a) fVar).f5482b : fVar.mo36512c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5481a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5482b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5481a + ", extras=" + Arrays.toString(this.f5482b) + "}";
    }

    public C1532a(Iterable<AbstractC1150h> iterable, byte[] bArr) {
        this.f5481a = iterable;
        this.f5482b = bArr;
    }
}
