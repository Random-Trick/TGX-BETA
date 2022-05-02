package gd;

import android.os.Bundle;
import java.util.Objects;
import org.drinkless.p210td.libcore.telegram.TdApi;

public class C4737p7 {
    public final boolean f15935a;
    public final TdApi.MessageThreadInfo f15936b;

    public C4737p7(org.drinkless.p210td.libcore.telegram.TdApi.Message[] r9, org.drinkless.p210td.libcore.telegram.TdApi.MessageThreadInfo r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4737p7.<init>(org.drinkless.td.libcore.telegram.TdApi$Message[], org.drinkless.td.libcore.telegram.TdApi$MessageThreadInfo, boolean):void");
    }

    public static C4737p7 m26289l(Bundle bundle, String str) {
        return null;
    }

    public boolean m26300a() {
        return this.f15935a;
    }

    public long m26299b() {
        return this.f15936b.chatId;
    }

    public TdApi.DraftMessage m26298c() {
        return this.f15936b.draftMessage;
    }

    public TdApi.InputMessageContent m26297d() {
        TdApi.DraftMessage draftMessage = this.f15936b.draftMessage;
        if (draftMessage != null) {
            return draftMessage.inputMessageText;
        }
        return null;
    }

    public long m26296e() {
        return this.f15936b.replyInfo.lastMessageId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4737p7 p7Var = (C4737p7) obj;
        if (m26300a() == p7Var.m26300a()) {
            TdApi.MessageThreadInfo messageThreadInfo = this.f15936b;
            long j = messageThreadInfo.chatId;
            TdApi.MessageThreadInfo messageThreadInfo2 = p7Var.f15936b;
            if (j == messageThreadInfo2.chatId && messageThreadInfo.messageThreadId == messageThreadInfo2.messageThreadId) {
                return true;
            }
        }
        return false;
    }

    public long m26295f() {
        return this.f15936b.replyInfo.lastReadInboxMessageId;
    }

    public long m26294g() {
        return this.f15936b.messageThreadId;
    }

    public TdApi.Message[] m26293h() {
        return this.f15936b.messages;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(m26300a()), Long.valueOf(this.f15936b.chatId), Long.valueOf(this.f15936b.messageThreadId));
    }

    public TdApi.MessageReplyInfo m26292i() {
        return this.f15936b.replyInfo;
    }

    public int m26291j() {
        return this.f15936b.replyInfo.replyCount;
    }

    public boolean m26290k() {
        TdApi.MessageReplyInfo messageReplyInfo = this.f15936b.replyInfo;
        long max = Math.max(messageReplyInfo.lastReadInboxMessageId, messageReplyInfo.lastReadOutboxMessageId);
        return max != 0 && this.f15936b.replyInfo.lastMessageId > max;
    }

    public void m26288m(Bundle bundle, String str) {
    }
}
