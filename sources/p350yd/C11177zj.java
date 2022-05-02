package p350yd;

import java.util.Comparator;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p111he.AbstractC5098a1;

public class C11177zj implements Comparator<AbstractC5098a1> {
    public final Comparator<TdApi.User> f35833a;

    public C11177zj(Comparator<TdApi.User> comparator) {
        this.f35833a = comparator;
    }

    public int compare(AbstractC5098a1 a1Var, AbstractC5098a1 a1Var2) {
        if (a1Var == null && a1Var2 == null) {
            return 0;
        }
        if (a1Var == null) {
            return -1;
        }
        if (a1Var2 == null) {
            return 1;
        }
        return this.f35833a.compare(a1Var.mo23961c(), a1Var2.mo23961c());
    }
}
