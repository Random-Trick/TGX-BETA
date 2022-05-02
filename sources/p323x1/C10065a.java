package p323x1;

public final class C10065a implements AbstractC10073e {
    public final String f32734a;
    public final Object[] f32735b;

    public C10065a(String str, Object[] objArr) {
        this.f32734a = str;
        this.f32735b = objArr;
    }

    public static void m6085a(AbstractC10072d dVar, int i, Object obj) {
        if (obj == null) {
            dVar.mo5374d0(i);
        } else if (obj instanceof byte[]) {
            dVar.mo5375N(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.mo5372z(i, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.mo5372z(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.mo5376J(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.mo5376J(i, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.mo5376J(i, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.mo5376J(i, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.mo5373q(i, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.mo5376J(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void m6084b(AbstractC10072d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m6085a(dVar, i, obj);
            }
        }
    }

    @Override
    public void mo6071m(AbstractC10072d dVar) {
        m6084b(dVar, this.f32735b);
    }

    @Override
    public String mo6070t() {
        return this.f32734a;
    }

    public C10065a(String str) {
        this(str, null);
    }
}
