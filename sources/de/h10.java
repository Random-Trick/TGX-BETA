package de;

import java.util.Comparator;
import org.drinkless.td.libcore.telegram.TdApi;

public final class h10 implements Comparator {
    public static final h10 f8161a = new h10();

    @Override
    public final int compare(Object obj, Object obj2) {
        int ag;
        ag = j10.ag((TdApi.Message) obj, (TdApi.Message) obj2);
        return ag;
    }
}
