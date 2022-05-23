package zd;

import org.drinkless.td.libcore.telegram.TdApi;

public class kj {
    public static boolean a(long j10, TdApi.Chat chat) {
        if (chat != null) {
            return false;
        }
        throw new IllegalStateException("updateChat not received for id: " + j10);
    }

    public static boolean b(long j10, TdApi.Chat chat, TdApi.Update update) {
        if (chat != null) {
            return false;
        }
        throw new IllegalStateException("updateChat not received for id: " + j10 + ", cannot process update " + update.getClass().getName());
    }
}
