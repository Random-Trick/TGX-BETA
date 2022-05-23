package ob;

import ja.i;
import org.drinkless.td.libcore.telegram.TdApi;
import ra.k;

public final class b {
    public static final TdApi.ChatListMain f19338a = new TdApi.ChatListMain();
    public static final TdApi.ChatListArchive f19339b = new TdApi.ChatListArchive();

    public static final TdApi.ChatPosition a(TdApi.Chat chat, TdApi.ChatList chatList) {
        if (chat == null) {
            return null;
        }
        TdApi.ChatPosition[] chatPositionArr = chat.positions;
        k.d(chatPositionArr, "positions");
        return (TdApi.ChatPosition) i.t(chatPositionArr, e(chatPositionArr, chatList, 0, 4, null));
    }

    public static final long b(TdApi.Chat chat, TdApi.ChatList chatList) {
        TdApi.ChatPosition a10 = a(chat, chatList);
        if (a10 != null) {
            return a10.order;
        }
        return 0L;
    }

    public static final int c(TdApi.ChatPosition[] chatPositionArr, TdApi.ChatList chatList) {
        return e(chatPositionArr, chatList, 0, 4, null);
    }

    public static final int d(TdApi.ChatPosition[] chatPositionArr, TdApi.ChatList chatList, int i10) {
        if (chatPositionArr == null) {
            return -1;
        }
        if (i10 >= 0 && i10 < chatPositionArr.length) {
            if (e.E(chatPositionArr[i10].list, chatList == null ? f19338a : chatList)) {
                return i10;
            }
        }
        int length = chatPositionArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e.E(chatPositionArr[i11].list, chatList == null ? f19338a : chatList)) {
                return i11;
            }
        }
        return -1;
    }

    public static int e(TdApi.ChatPosition[] chatPositionArr, TdApi.ChatList chatList, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            chatList = f19338a;
        }
        if ((i11 & 4) != 0) {
            i10 = -1;
        }
        return d(chatPositionArr, chatList, i10);
    }

    public static final boolean f(TdApi.Chat chat) {
        return b(chat, f19339b) != 0;
    }

    public static final boolean g(TdApi.Chat chat, TdApi.ChatList chatList) {
        TdApi.ChatPosition a10 = a(chat, chatList);
        if (a10 != null) {
            return a10.isPinned;
        }
        return false;
    }
}
