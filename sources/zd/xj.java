package zd;

import ie.a1;
import java.util.Comparator;
import org.drinkless.td.libcore.telegram.TdApi;

public class xj implements Comparator<a1> {
    public final Comparator<TdApi.User> f28696a;

    public xj(Comparator<TdApi.User> comparator) {
        this.f28696a = comparator;
    }

    public int compare(a1 a1Var, a1 a1Var2) {
        if (a1Var == null && a1Var2 == null) {
            return 0;
        }
        if (a1Var == null) {
            return -1;
        }
        if (a1Var2 == null) {
            return 1;
        }
        return this.f28696a.compare(a1Var.c(), a1Var2.c());
    }
}
