package d6;

import java.util.Map;

public final class m0 extends q0<Map.Entry> {
    public final u0 N;

    public m0(u0 u0Var) {
        super(u0Var, null);
        this.N = u0Var;
    }

    @Override
    public final Map.Entry a(int i10) {
        return new s0(this.N, i10);
    }
}
