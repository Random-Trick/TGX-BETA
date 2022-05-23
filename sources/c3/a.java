package c3;

import b3.h;
import c3.f;
import java.util.Arrays;
import java.util.Objects;

public final class a extends f {
    public final Iterable<h> f4399a;
    public final byte[] f4400b;

    public static final class b extends f.a {
        public Iterable<h> f4401a;
        public byte[] f4402b;

        @Override
        public f a() {
            String str = "";
            if (this.f4401a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f4401a, this.f4402b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public f.a b(Iterable<h> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f4401a = iterable;
            return this;
        }

        @Override
        public f.a c(byte[] bArr) {
            this.f4402b = bArr;
            return this;
        }
    }

    @Override
    public Iterable<h> b() {
        return this.f4399a;
    }

    @Override
    public byte[] c() {
        return this.f4400b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4399a.equals(fVar.b())) {
            if (Arrays.equals(this.f4400b, fVar instanceof a ? ((a) fVar).f4400b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4399a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4400b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f4399a + ", extras=" + Arrays.toString(this.f4400b) + "}";
    }

    public a(Iterable<h> iterable, byte[] bArr) {
        this.f4399a = iterable;
        this.f4400b = bArr;
    }
}
