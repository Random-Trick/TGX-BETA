package gd;

import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p291uc.C9678w2;
import p350yd.C10930q6;

public class C4731p1 {
    public static TdApi.SponsoredMessage m26310a(C10930q6 q6Var) {
        return m26309b(q6Var);
    }

    public static TdApi.SponsoredMessage m26309b(C10930q6 q6Var) {
        TdApi.SponsoredMessage sponsoredMessage = new TdApi.SponsoredMessage();
        sponsoredMessage.sponsorChatId = q6Var.m2519ba();
        sponsoredMessage.messageId = 1L;
        sponsoredMessage.content = new TdApi.MessageText(new TdApi.FormattedText("Test ad message (from user/channel)", null), null);
        return sponsoredMessage;
    }

    public static TdApi.Message m26308c(long j, int i, TdApi.SponsoredMessage sponsoredMessage, C10930q6 q6Var) {
        TdApi.MessageText messageText = (TdApi.MessageText) sponsoredMessage.content;
        TdApi.WebPage webPage = new TdApi.WebPage();
        messageText.webPage = webPage;
        webPage.type = "telegram_adx";
        webPage.url = "";
        TdApi.Message message = new TdApi.Message();
        message.senderId = q6Var.m2183wb(sponsoredMessage.sponsorChatId);
        message.content = messageText;
        message.authorSignature = C4403w.m27871i1(R.string.SponsoredSign);
        message.f25409id = sponsoredMessage.messageId;
        message.date = i;
        message.isOutgoing = false;
        message.canBeSaved = true;
        message.chatId = j;
        message.isChannelPost = q6Var.m2784K6(j);
        return message;
    }

    public static AbstractC4761s4 m26307d(C9678w2 w2Var, long j, int i, TdApi.SponsoredMessage sponsoredMessage) {
        return new C4656h6(w2Var, m26308c(j, i, sponsoredMessage, w2Var.m7645r0().mo4348c()), sponsoredMessage);
    }
}
