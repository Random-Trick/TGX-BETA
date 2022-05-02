package p018b3;

import java.util.Arrays;
import java.util.Objects;
import p018b3.AbstractC1159m;
import p339y2.EnumC10354d;

public final class C1141c extends AbstractC1159m {
    public final String f4359a;
    public final byte[] f4360b;
    public final EnumC10354d f4361c;

    public static final class C1143b extends AbstractC1159m.AbstractC1160a {
        public String f4362a;
        public byte[] f4363b;
        public EnumC10354d f4364c;

        @Override
        public AbstractC1159m mo38259a() {
            String str = "";
            if (this.f4362a == null) {
                str = str + " backendName";
            }
            if (this.f4364c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C1141c(this.f4362a, this.f4363b, this.f4364c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC1159m.AbstractC1160a mo38258b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f4362a = str;
            return this;
        }

        @Override
        public AbstractC1159m.AbstractC1160a mo38257c(byte[] bArr) {
            this.f4363b = bArr;
            return this;
        }

        @Override
        public AbstractC1159m.AbstractC1160a mo38256d(EnumC10354d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f4364c = dVar;
            return this;
        }
    }

    @Override
    public String mo38263b() {
        return this.f4359a;
    }

    @Override
    public byte[] mo38262c() {
        return this.f4360b;
    }

    @Override
    public EnumC10354d mo38261d() {
        return this.f4361c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1159m)) {
            return false;
        }
        AbstractC1159m mVar = (AbstractC1159m) obj;
        if (this.f4359a.equals(mVar.mo38263b())) {
            if (Arrays.equals(this.f4360b, mVar instanceof C1141c ? ((C1141c) mVar).f4360b : mVar.mo38262c()) && this.f4361c.equals(mVar.mo38261d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4359a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4360b)) * 1000003) ^ this.f4361c.hashCode();
    }

    public C1141c(String str, byte[] bArr, EnumC10354d dVar) {
        this.f4359a = str;
        this.f4360b = bArr;
        this.f4361c = dVar;
    }
}
