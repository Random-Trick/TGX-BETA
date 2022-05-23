package b3;

import b3.m;
import java.util.Arrays;
import java.util.Objects;
import y2.d;

public final class c extends m {
    public final String f3720a;
    public final byte[] f3721b;
    public final d f3722c;

    public static final class b extends m.a {
        public String f3723a;
        public byte[] f3724b;
        public d f3725c;

        @Override
        public m a() {
            String str = "";
            if (this.f3723a == null) {
                str = str + " backendName";
            }
            if (this.f3725c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.f3723a, this.f3724b, this.f3725c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public m.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f3723a = str;
            return this;
        }

        @Override
        public m.a c(byte[] bArr) {
            this.f3724b = bArr;
            return this;
        }

        @Override
        public m.a d(d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f3725c = dVar;
            return this;
        }
    }

    @Override
    public String b() {
        return this.f3720a;
    }

    @Override
    public byte[] c() {
        return this.f3721b;
    }

    @Override
    public d d() {
        return this.f3722c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f3720a.equals(mVar.b())) {
            if (Arrays.equals(this.f3721b, mVar instanceof c ? ((c) mVar).f3721b : mVar.c()) && this.f3722c.equals(mVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3720a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3721b)) * 1000003) ^ this.f3722c.hashCode();
    }

    public c(String str, byte[] bArr, d dVar) {
        this.f3720a = str;
        this.f3721b = bArr;
        this.f3722c = dVar;
    }
}
