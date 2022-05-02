package p018b3;

import java.util.Objects;
import p018b3.AbstractC1157l;
import p339y2.AbstractC10353c;
import p339y2.AbstractC10355e;
import p339y2.C10352b;

public final class C1138b extends AbstractC1157l {
    public final AbstractC1159m f4349a;
    public final String f4350b;
    public final AbstractC10353c<?> f4351c;
    public final AbstractC10355e<?, byte[]> f4352d;
    public final C10352b f4353e;

    public static final class C1140b extends AbstractC1157l.AbstractC1158a {
        public AbstractC1159m f4354a;
        public String f4355b;
        public AbstractC10353c<?> f4356c;
        public AbstractC10355e<?, byte[]> f4357d;
        public C10352b f4358e;

        @Override
        public AbstractC1157l mo38270a() {
            String str = "";
            if (this.f4354a == null) {
                str = str + " transportContext";
            }
            if (this.f4355b == null) {
                str = str + " transportName";
            }
            if (this.f4356c == null) {
                str = str + " event";
            }
            if (this.f4357d == null) {
                str = str + " transformer";
            }
            if (this.f4358e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C1138b(this.f4354a, this.f4355b, this.f4356c, this.f4357d, this.f4358e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC1157l.AbstractC1158a mo38269b(C10352b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f4358e = bVar;
            return this;
        }

        @Override
        public AbstractC1157l.AbstractC1158a mo38268c(AbstractC10353c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f4356c = cVar;
            return this;
        }

        @Override
        public AbstractC1157l.AbstractC1158a mo38267d(AbstractC10355e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f4357d = eVar;
            return this;
        }

        @Override
        public AbstractC1157l.AbstractC1158a mo38266e(AbstractC1159m mVar) {
            Objects.requireNonNull(mVar, "Null transportContext");
            this.f4354a = mVar;
            return this;
        }

        @Override
        public AbstractC1157l.AbstractC1158a mo38265f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f4355b = str;
            return this;
        }
    }

    @Override
    public C10352b mo38276b() {
        return this.f4353e;
    }

    @Override
    public AbstractC10353c<?> mo38275c() {
        return this.f4351c;
    }

    @Override
    public AbstractC10355e<?, byte[]> mo38273e() {
        return this.f4352d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1157l)) {
            return false;
        }
        AbstractC1157l lVar = (AbstractC1157l) obj;
        return this.f4349a.equals(lVar.mo38272f()) && this.f4350b.equals(lVar.mo38271g()) && this.f4351c.equals(lVar.mo38275c()) && this.f4352d.equals(lVar.mo38273e()) && this.f4353e.equals(lVar.mo38276b());
    }

    @Override
    public AbstractC1159m mo38272f() {
        return this.f4349a;
    }

    @Override
    public String mo38271g() {
        return this.f4350b;
    }

    public int hashCode() {
        return ((((((((this.f4349a.hashCode() ^ 1000003) * 1000003) ^ this.f4350b.hashCode()) * 1000003) ^ this.f4351c.hashCode()) * 1000003) ^ this.f4352d.hashCode()) * 1000003) ^ this.f4353e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f4349a + ", transportName=" + this.f4350b + ", event=" + this.f4351c + ", transformer=" + this.f4352d + ", encoding=" + this.f4353e + "}";
    }

    public C1138b(AbstractC1159m mVar, String str, AbstractC10353c<?> cVar, AbstractC10355e<?, byte[]> eVar, C10352b bVar) {
        this.f4349a = mVar;
        this.f4350b = str;
        this.f4351c = cVar;
        this.f4352d = eVar;
        this.f4353e = bVar;
    }
}
