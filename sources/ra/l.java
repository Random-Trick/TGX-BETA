package ra;

import java.io.Serializable;

public abstract class l<R> implements h<R>, Serializable {
    public final int f21814a;

    public l(int i10) {
        this.f21814a = i10;
    }

    public String toString() {
        String e10 = t.e(this);
        k.d(e10, "renderLambdaToString(this)");
        return e10;
    }
}
