package hd;

import gd.w;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import vc.v2;
import zd.o6;

public class p1 {
    public static TdApi.SponsoredMessage a(o6 o6Var) {
        return b(o6Var);
    }

    public static TdApi.SponsoredMessage b(o6 o6Var) {
        TdApi.SponsoredMessage sponsoredMessage = new TdApi.SponsoredMessage();
        sponsoredMessage.sponsorChatId = o6Var.fa();
        sponsoredMessage.messageId = 1L;
        sponsoredMessage.content = new TdApi.MessageText(new TdApi.FormattedText("Test ad message (from user/channel)", null), null);
        return sponsoredMessage;
    }

    public static TdApi.Message c(long j10, int i10, TdApi.SponsoredMessage sponsoredMessage, o6 o6Var) {
        TdApi.MessageText messageText = (TdApi.MessageText) sponsoredMessage.content;
        TdApi.WebPage webPage = new TdApi.WebPage();
        messageText.webPage = webPage;
        webPage.type = "telegram_adx";
        webPage.url = "";
        TdApi.Message message = new TdApi.Message();
        message.senderId = o6Var.Ab(sponsoredMessage.sponsorChatId);
        message.content = messageText;
        message.authorSignature = w.i1(R.string.SponsoredSign);
        message.f19946id = sponsoredMessage.messageId;
        message.date = i10;
        message.isOutgoing = false;
        message.canBeSaved = true;
        message.chatId = j10;
        message.isChannelPost = o6Var.O6(j10);
        return message;
    }

    public static s4 d(v2 v2Var, long j10, int i10, TdApi.SponsoredMessage sponsoredMessage) {
        return new h6(v2Var, c(j10, i10, sponsoredMessage, v2Var.r0().c()), sponsoredMessage);
    }
}
