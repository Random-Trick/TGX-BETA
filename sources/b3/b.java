package b3;

import b3.l;
import java.util.Objects;
import y2.c;
import y2.e;

public final class b extends l {
    public final m f3710a;
    public final String f3711b;
    public final c<?> f3712c;
    public final e<?, byte[]> f3713d;
    public final y2.b f3714e;

    public static final class C0052b extends l.a {
        public m f3715a;
        public String f3716b;
        public c<?> f3717c;
        public e<?, byte[]> f3718d;
        public y2.b f3719e;

        @Override
        public l a() {
            String str = "";
            if (this.f3715a == null) {
                str = str + " transportContext";
            }
            if (this.f3716b == null) {
                str = str + " transportName";
            }
            if (this.f3717c == null) {
                str = str + " event";
            }
            if (this.f3718d == null) {
                str = str + " transformer";
            }
            if (this.f3719e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f3715a, this.f3716b, this.f3717c, this.f3718d, this.f3719e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public l.a b(y2.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f3719e = bVar;
            return this;
        }

        @Override
        public l.a c(c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f3717c = cVar;
            return this;
        }

        @Override
        public l.a d(e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f3718d = eVar;
            return this;
        }

        @Override
        public l.a e(m mVar) {
            Objects.requireNonNull(mVar, "Null transportContext");
            this.f3715a = mVar;
            return this;
        }

        @Override
        public l.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f3716b = str;
            return this;
        }
    }

    @Override
    public y2.b b() {
        return this.f3714e;
    }

    @Override
    public c<?> c() {
        return this.f3712c;
    }

    @Override
    public e<?, byte[]> e() {
        return this.f3713d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f3710a.equals(lVar.f()) && this.f3711b.equals(lVar.g()) && this.f3712c.equals(lVar.c()) && this.f3713d.equals(lVar.e()) && this.f3714e.equals(lVar.b());
    }

    @Override
    public m f() {
        return this.f3710a;
    }

    @Override
    public String g() {
        return this.f3711b;
    }

    public int hashCode() {
        return ((((((((this.f3710a.hashCode() ^ 1000003) * 1000003) ^ this.f3711b.hashCode()) * 1000003) ^ this.f3712c.hashCode()) * 1000003) ^ this.f3713d.hashCode()) * 1000003) ^ this.f3714e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f3710a + ", transportName=" + this.f3711b + ", event=" + this.f3712c + ", transformer=" + this.f3713d + ", encoding=" + this.f3714e + "}";
    }

    public b(m mVar, String str, c<?> cVar, e<?, byte[]> eVar, y2.b bVar) {
        this.f3710a = mVar;
        this.f3711b = str;
        this.f3712c = cVar;
        this.f3713d = eVar;
        this.f3714e = bVar;
    }
}
