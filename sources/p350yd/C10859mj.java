package p350yd;

import org.drinkless.p210td.libcore.telegram.TdApi;

public class C10859mj {
    public static boolean m2998a(long j, TdApi.Chat chat) {
        if (chat != null) {
            return false;
        }
        throw new IllegalStateException("updateChat not received for id: " + j);
    }

    public static boolean m2997b(long j, TdApi.Chat chat, TdApi.Update update) {
        if (chat != null) {
            return false;
        }
        throw new IllegalStateException("updateChat not received for id: " + j + ", cannot process update " + update.getClass().getName());
    }
}
