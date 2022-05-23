package hd;

import android.os.Bundle;
import java.util.Objects;
import org.drinkless.td.libcore.telegram.TdApi;

public class p7 {
    public final boolean f13349a;
    public final TdApi.MessageThreadInfo f13350b;

    public p7(org.drinkless.td.libcore.telegram.TdApi.Message[] r9, org.drinkless.td.libcore.telegram.TdApi.MessageThreadInfo r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: hd.p7.<init>(org.drinkless.td.libcore.telegram.TdApi$Message[], org.drinkless.td.libcore.telegram.TdApi$MessageThreadInfo, boolean):void");
    }

    public static p7 l(Bundle bundle, String str) {
        return null;
    }

    public boolean a() {
        return this.f13349a;
    }

    public long b() {
        return this.f13350b.chatId;
    }

    public TdApi.DraftMessage c() {
        return this.f13350b.draftMessage;
    }

    public TdApi.InputMessageContent d() {
        TdApi.DraftMessage draftMessage = this.f13350b.draftMessage;
        if (draftMessage != null) {
            return draftMessage.inputMessageText;
        }
        return null;
    }

    public long e() {
        return this.f13350b.replyInfo.lastMessageId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p7 p7Var = (p7) obj;
        if (a() == p7Var.a()) {
            TdApi.MessageThreadInfo messageThreadInfo = this.f13350b;
            long j10 = messageThreadInfo.chatId;
            TdApi.MessageThreadInfo messageThreadInfo2 = p7Var.f13350b;
            if (j10 == messageThreadInfo2.chatId && messageThreadInfo.messageThreadId == messageThreadInfo2.messageThreadId) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f13350b.replyInfo.lastReadInboxMessageId;
    }

    public long g() {
        return this.f13350b.messageThreadId;
    }

    public TdApi.Message[] h() {
        return this.f13350b.messages;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(a()), Long.valueOf(this.f13350b.chatId), Long.valueOf(this.f13350b.messageThreadId));
    }

    public TdApi.MessageReplyInfo i() {
        return this.f13350b.replyInfo;
    }

    public int j() {
        return this.f13350b.replyInfo.replyCount;
    }

    public boolean k() {
        TdApi.MessageReplyInfo messageReplyInfo = this.f13350b.replyInfo;
        long max = Math.max(messageReplyInfo.lastReadInboxMessageId, messageReplyInfo.lastReadOutboxMessageId);
        return max != 0 && this.f13350b.replyInfo.lastMessageId > max;
    }

    public void m(Bundle bundle, String str) {
    }
}
