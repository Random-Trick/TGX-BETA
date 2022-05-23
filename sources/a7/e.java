package a7;

import java.util.Map;
import javax.annotation.CheckForNull;
import z6.i;

public abstract class e<K, V> implements Map.Entry<K, V> {
    @Override
    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return i.a(getKey(), entry.getKey()) && i.a(getValue(), entry.getValue());
    }

    @Override
    public abstract K getKey();

    @Override
    public abstract V getValue();

    @Override
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        int i10 = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
