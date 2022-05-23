package o7;

import java.util.Objects;
import o7.l;

public final class a extends l {
    public final String f19267a;
    public final long f19268b;
    public final long f19269c;

    public static final class b extends l.a {
        public String f19270a;
        public Long f19271b;
        public Long f19272c;

        @Override
        public l a() {
            String str = "";
            if (this.f19270a == null) {
                str = str + " token";
            }
            if (this.f19271b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f19272c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f19270a, this.f19271b.longValue(), this.f19272c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public l.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f19270a = str;
            return this;
        }

        @Override
        public l.a c(long j10) {
            this.f19272c = Long.valueOf(j10);
            return this;
        }

        @Override
        public l.a d(long j10) {
            this.f19271b = Long.valueOf(j10);
            return this;
        }
    }

    @Override
    public String b() {
        return this.f19267a;
    }

    @Override
    public long c() {
        return this.f19269c;
    }

    @Override
    public long d() {
        return this.f19268b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f19267a.equals(lVar.b()) && this.f19268b == lVar.d() && this.f19269c == lVar.c();
    }

    public int hashCode() {
        long j10 = this.f19268b;
        long j11 = this.f19269c;
        return ((((this.f19267a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f19267a + ", tokenExpirationTimestamp=" + this.f19268b + ", tokenCreationTimestamp=" + this.f19269c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f19267a = str;
        this.f19268b = j10;
        this.f19269c = j11;
    }
}
