package d6;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class h0<K, V> implements Map.Entry<K, V> {
    @Override
    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (n.a(getKey(), entry.getKey()) && n.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public abstract K getKey();

    @Override
    public abstract V getValue();

    @Override
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        int i10 = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
