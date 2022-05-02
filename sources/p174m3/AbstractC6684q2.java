package p174m3;

import android.os.Bundle;
import p174m3.AbstractC6609h;

public abstract class AbstractC6684q2 implements AbstractC6609h {
    public static final AbstractC6609h.AbstractC6610a<AbstractC6684q2> f20917a = C6680p2.f20906a;

    public static AbstractC6684q2 m19575b(Bundle bundle) {
        int i = bundle.getInt(m19574c(0), -1);
        if (i == 0) {
            return C6631j1.f20729M.mo998a(bundle);
        }
        if (i == 1) {
            return C6579c2.f20500c.mo998a(bundle);
        }
        if (i == 2) {
            return C6557a3.f20405M.mo998a(bundle);
        }
        if (i == 3) {
            return C6592e3.f20525M.mo998a(bundle);
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("Encountered unknown rating type: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static String m19574c(int i) {
        return Integer.toString(i, 36);
    }
}
