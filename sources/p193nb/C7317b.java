package p193nb;

import org.drinkless.p210td.libcore.telegram.TdApi;
import p123ia.C5296i;
import qa.C8298k;

public final class C7317b {
    public static final TdApi.ChatListMain f23227a = new TdApi.ChatListMain();
    public static final TdApi.ChatListArchive f23228b = new TdApi.ChatListArchive();

    public static final TdApi.ChatPosition m17043a(TdApi.Chat chat, TdApi.ChatList chatList) {
        if (chat == null) {
            return null;
        }
        TdApi.ChatPosition[] chatPositionArr = chat.positions;
        C8298k.m12934d(chatPositionArr, "positions");
        return (TdApi.ChatPosition) C5296i.m23388t(chatPositionArr, m17039e(chatPositionArr, chatList, 0, 4, null));
    }

    public static final long m17042b(TdApi.Chat chat, TdApi.ChatList chatList) {
        TdApi.ChatPosition a = m17043a(chat, chatList);
        if (a == null) {
            return 0L;
        }
        return a.order;
    }

    public static final int m17041c(TdApi.ChatPosition[] chatPositionArr, TdApi.ChatList chatList) {
        return m17039e(chatPositionArr, chatList, 0, 4, null);
    }

    public static final int m17040d(TdApi.ChatPosition[] chatPositionArr, TdApi.ChatList chatList, int i) {
        if (chatPositionArr == null) {
            return -1;
        }
        int i2 = 0;
        if (i >= 0 && i < chatPositionArr.length) {
            if (C7321e.m17015C(chatPositionArr[i].list, chatList == null ? f23227a : chatList)) {
                return i;
            }
        }
        int length = chatPositionArr.length;
        while (i2 < length) {
            i2++;
            if (C7321e.m17015C(chatPositionArr[i2].list, chatList == null ? f23227a : chatList)) {
                return i2;
            }
        }
        return -1;
    }

    public static int m17039e(TdApi.ChatPosition[] chatPositionArr, TdApi.ChatList chatList, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            chatList = f23227a;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return m17040d(chatPositionArr, chatList, i);
    }

    public static final boolean m17038f(TdApi.Chat chat) {
        return m17042b(chat, f23228b) != 0;
    }

    public static final boolean m17037g(TdApi.Chat chat, TdApi.ChatList chatList) {
        TdApi.ChatPosition a = m17043a(chat, chatList);
        if (a == null) {
            return false;
        }
        return a.isPinned;
    }
}
