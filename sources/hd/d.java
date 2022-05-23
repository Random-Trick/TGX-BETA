package hd;

import java.util.Comparator;
import org.drinkless.td.libcore.telegram.TdApi;

public final class d implements Comparator {
    public static final d f12907a = new d();

    @Override
    public final int compare(Object obj, Object obj2) {
        int r10;
        r10 = e.r((TdApi.Message) obj, (TdApi.Message) obj2);
        return r10;
    }
}
