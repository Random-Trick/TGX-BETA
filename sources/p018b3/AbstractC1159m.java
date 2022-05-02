package p018b3;

import android.util.Base64;
import p018b3.C1141c;
import p339y2.EnumC10354d;

public abstract class AbstractC1159m {

    public static abstract class AbstractC1160a {
        public abstract AbstractC1159m mo38262a();

        public abstract AbstractC1160a mo38261b(String str);

        public abstract AbstractC1160a mo38260c(byte[] bArr);

        public abstract AbstractC1160a mo38259d(EnumC10354d dVar);
    }

    public static AbstractC1160a m38267a() {
        return new C1141c.C1143b().mo38259d(EnumC10354d.DEFAULT);
    }

    public abstract String mo38266b();

    public abstract byte[] mo38265c();

    public abstract EnumC10354d mo38264d();

    public AbstractC1159m m38263e(EnumC10354d dVar) {
        return m38267a().mo38261b(mo38266b()).mo38259d(dVar).mo38260c(mo38265c()).mo38262a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo38266b();
        objArr[1] = mo38264d();
        objArr[2] = mo38265c() == null ? "" : Base64.encodeToString(mo38265c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
