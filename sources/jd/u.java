package jd;

import java.util.Comparator;

public final class u implements Comparator {
    public static final u f15295a = new u();

    @Override
    public final int compare(Object obj, Object obj2) {
        return ((String) obj).compareToIgnoreCase((String) obj2);
    }
}
