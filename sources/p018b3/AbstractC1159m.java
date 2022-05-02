package p018b3;

import android.util.Base64;
import p018b3.C1141c;
import p339y2.EnumC10354d;

public abstract class AbstractC1159m {

    public static abstract class AbstractC1160a {
        public abstract AbstractC1159m mo38259a();

        public abstract AbstractC1160a mo38258b(String str);

        public abstract AbstractC1160a mo38257c(byte[] bArr);

        public abstract AbstractC1160a mo38256d(EnumC10354d dVar);
    }

    public static AbstractC1160a m38264a() {
        return new C1141c.C1143b().mo38256d(EnumC10354d.DEFAULT);
    }

    public abstract String mo38263b();

    public abstract byte[] mo38262c();

    public abstract EnumC10354d mo38261d();

    public AbstractC1159m m38260e(EnumC10354d dVar) {
        return m38264a().mo38258b(mo38263b()).mo38256d(dVar).mo38257c(mo38262c()).mo38259a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo38263b();
        objArr[1] = mo38261d();
        objArr[2] = mo38262c() == null ? "" : Base64.encodeToString(mo38262c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
