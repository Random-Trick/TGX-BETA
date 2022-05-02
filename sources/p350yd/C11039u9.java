package p350yd;

import gd.C4779t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p139jb.AbstractC5918j;
import p154kb.C6226c;
import p154kb.C6227d;
import p154kb.C6231f;
import p154kb.C6233h;
import p193nb.C7321e;
import p350yd.C10930q6;

public class C11039u9 {
    public final C10930q6 f35418a;
    public final Map<String, List<TdApi.Message>> f35417A = new HashMap();
    public final C6227d<AbstractC10748j1> f35419b = new C6227d<>();
    public final C6227d<AbstractC10701h1> f35420c = new C6227d<>();
    public final C6227d<AbstractC10747j0> f35421d = new C6227d<>();
    public final C6233h<String, AbstractC10700h0> f35422e = new C6233h<>(true);
    public final C6227d<AbstractC10817l1> f35423f = new C6227d<>(true);
    public final C6227d<AbstractC10986s1> f35424g = new C6227d<>(true);
    public final C6227d<AbstractC10551b> f35425h = new C6227d<>();
    public final C6227d<AbstractC10861n0> f35426i = new C6227d<>(true);
    public final C6227d<AbstractC10924q0> f35427j = new C6227d<>();
    public final C6227d<AbstractC10573c> f35428k = new C6227d<>(true);
    public final C6227d<AbstractC10816l0> f35429l = new C6227d<>(true);
    public final C6227d<AbstractC11041ub> f35430m = new C6227d<>(true);
    public final C6227d<AbstractC10903p0> f35431n = new C6227d<>(true);
    public final C6227d<AbstractC10790k0> f35432o = new C6227d<>(true);
    public final C6227d<AbstractC10883o1> f35433p = new C6227d<>();
    public final C6227d<AbstractC10574c0> f35434q = new C6227d<>(true);
    public final C6227d<AbstractC10925q1> f35435r = new C6227d<>(true);
    public final C6227d<AbstractC10964r0> f35436s = new C6227d<>(true);
    public final C6227d<AbstractC10524a> f35437t = new C6227d<>(true);
    public final C6231f<AbstractC10748j1> f35438u = new C6231f<>();
    public final C6231f<AbstractC10701h1> f35439v = new C6231f<>();
    public final C6231f<AbstractC10747j0> f35440w = new C6231f<>();
    public final C6231f<AbstractC10817l1> f35441x = new C6231f<>(true);
    public final C6226c<AbstractC10985s0> f35442y = new C6226c<>();
    public final C6231f<AbstractC10839m1> f35443z = new C6231f<>();

    public C11039u9(C10930q6 q6Var) {
        this.f35418a = q6Var;
    }

    public static void m1976A2(TdApi.UpdateNewMessage updateNewMessage, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4051E2(updateNewMessage.message);
            }
        }
    }

    public static void m1974B0(TdApi.UpdateAnimatedEmojiMessageClicked updateAnimatedEmojiMessageClicked, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4043c6(updateAnimatedEmojiMessageClicked.chatId, updateAnimatedEmojiMessageClicked.messageId, updateAnimatedEmojiMessageClicked.sticker);
            }
        }
    }

    public static void m1973B1(TdApi.UpdateChatTitle updateChatTitle, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4061i5(updateChatTitle.chatId, updateChatTitle.title);
            }
        }
    }

    public static void m1967D(Iterator<AbstractC10817l1> it, long j) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo3246x1(j);
            }
        }
    }

    public static void m1965D1(long j, int i, boolean z, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4060m0(j, i, z);
            }
        }
    }

    public static void m1963E(Iterator<AbstractC10817l1> it, TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo3248E5(notificationSettingsScope);
            }
        }
    }

    public static void m1958F0(TdApi.Call call, Iterator<AbstractC10574c0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().m4528f(call);
            }
        }
    }

    public static void m1957F1(long j, int i, boolean z, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4074G5(j, i, z);
            }
        }
    }

    public static void m1949H1(long j, TdApi.VideoChat videoChat, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4055u3(j, videoChat);
            }
        }
    }

    public static void m1946I0(TdApi.UpdateChatActionBar updateChatActionBar, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4068W(updateChatActionBar.chatId, updateChatActionBar.actionBar);
            }
        }
    }

    public static void m1935L(Iterator<AbstractC10817l1> it, long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo3247l4(j, chatNotificationSettings);
            }
        }
    }

    public static void m1934L0(TdApi.UpdateChatAvailableReactions updateChatAvailableReactions, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4076B4(updateChatAvailableReactions.chatId, updateChatAvailableReactions.availableReactions);
            }
        }
    }

    public static void m1931M(Iterator<AbstractC10817l1> it, TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo3249D2(notificationSettingsScope, scopeNotificationSettings);
            }
        }
    }

    public static void m1922O0(long j, String str, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4057s4(j, str);
            }
        }
    }

    public static void m1912Q2(TdApi.ChatNearby[] chatNearbyArr, Iterator<AbstractC10790k0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().m3311a(chatNearbyArr);
            }
        }
    }

    public static void m1910R0(long j, TdApi.DraftMessage draftMessage, List<C10930q6.C10938h> list, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                AbstractC10747j0 next = it.next();
                next.mo4065c2(j, draftMessage);
                if (list != null) {
                    for (C10930q6.C10938h hVar : list) {
                        C10930q6.C10937g gVar = hVar.f35143c;
                        next.mo4053w6(j, gVar.f35139a, gVar.m2129b(), gVar.m2127d(), gVar.m2128c());
                    }
                }
            }
        }
    }

    public static void m1905S1(TdApi.GroupCall groupCall, Iterator<AbstractC10574c0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().m4527g(groupCall);
            }
        }
    }

    public static void m1899U1(int i, TdApi.GroupCallParticipant groupCallParticipant, Iterator<AbstractC10574c0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().m4526h(i, groupCallParticipant);
            }
        }
    }

    public static void m1897V0(TdApi.UpdateChatHasProtectedContent updateChatHasProtectedContent, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4059q6(updateChatHasProtectedContent.chatId, updateChatHasProtectedContent.hasProtectedContent);
            }
        }
    }

    public static void m1891X0(TdApi.UpdateChatHasScheduledMessages updateChatHasScheduledMessages, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4072K3(updateChatHasScheduledMessages.chatId, updateChatHasScheduledMessages.hasScheduledMessages);
            }
        }
    }

    public static void m1888Y0(long j, boolean z, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4054w1(j, z);
            }
        }
    }

    public static void m1887Y1(TdApi.UpdateMessageContent updateMessageContent, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4041l0(updateMessageContent.chatId, updateMessageContent.messageId, updateMessageContent.newContent);
            }
        }
    }

    public static void m1881a1(long j, boolean z, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4070R1(j, z);
            }
        }
    }

    public static void m1880a2(TdApi.UpdateMessageContentOpened updateMessageContentOpened, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4038z5(updateMessageContentOpened.chatId, updateMessageContentOpened.messageId);
            }
        }
    }

    public static void m1873c1(long j, TdApi.Message message, List<C10930q6.C10938h> list, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                AbstractC10747j0 next = it.next();
                next.mo4067Y(j, message);
                if (list != null) {
                    for (C10930q6.C10938h hVar : list) {
                        C10930q6.C10937g gVar = hVar.f35143c;
                        next.mo4053w6(j, gVar.f35139a, gVar.m2129b(), gVar.m2127d(), gVar.m2128c());
                    }
                }
            }
        }
    }

    public static void m1872c2(TdApi.UpdateMessageEdited updateMessageEdited, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4039r5(updateMessageEdited.chatId, updateMessageEdited.messageId, updateMessageEdited.editDate, updateMessageEdited.replyMarkup);
            }
        }
    }

    public static void m1864e2(TdApi.UpdateMessageInteractionInfo updateMessageInteractionInfo, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4047T0(updateMessageInteractionInfo.chatId, updateMessageInteractionInfo.messageId, updateMessageInteractionInfo.interactionInfo);
            }
        }
    }

    public static void m1861f1(long j, int i, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4063e7(j, i);
            }
        }
    }

    public static void m1856g2(TdApi.UpdateMessageIsPinned updateMessageIsPinned, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4045V1(updateMessageIsPinned.chatId, updateMessageIsPinned.messageId, updateMessageIsPinned.isPinned);
            }
        }
    }

    public static void m1849i1(long j, int i, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4071L0(j, i);
            }
        }
    }

    public static void m1848i2(TdApi.UpdateMessageLiveLocationViewed updateMessageLiveLocationViewed, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4049J5(updateMessageLiveLocationViewed.chatId, updateMessageLiveLocationViewed.messageId);
            }
        }
    }

    public static void m1844j2(TdApi.UpdateMessageMentionRead updateMessageMentionRead, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4046V(updateMessageMentionRead.chatId, updateMessageMentionRead.messageId);
            }
        }
    }

    public static void m1841k1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4062h1(j, chatJoinRequestsInfo);
            }
        }
    }

    public static void m1833m1(long j, TdApi.ChatPermissions chatPermissions, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4056t7(j, chatPermissions);
            }
        }
    }

    public static void m1832m2(long j, long j2, Iterator<AbstractC10701h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4251s3(j, j2);
            }
        }
    }

    public static void m1824o2(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4048R3(updateMessageSendAcknowledged.chatId, updateMessageSendAcknowledged.messageId);
            }
        }
    }

    public static void m1821p1(TdApi.UpdateChatPhoto updateChatPhoto, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4064c4(updateChatPhoto.chatId, updateChatPhoto.photo);
            }
        }
    }

    public static void m1817q1(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4053w6(j, chatPosition, z, z2, z3);
            }
        }
    }

    public static void m1816q2(TdApi.UpdateMessageSendFailed updateMessageSendFailed, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4042k5(updateMessageSendFailed.message, updateMessageSendFailed.oldMessageId, updateMessageSendFailed.errorCode, updateMessageSendFailed.errorMessage);
            }
        }
    }

    public static void m1815r(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar, AbstractC10700h0 h0Var) {
        h0Var.mo3012T1(g8Var, chat, i, gVar);
        h0Var.mo3009i(g8Var, 2);
    }

    public static void m1811s(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar, AbstractC10700h0 h0Var) {
        h0Var.mo3011e4(g8Var, chat, i, gVar);
        h0Var.mo3009i(g8Var, 1);
    }

    public static void m1809s1(TdApi.UpdateChatReadInbox updateChatReadInbox, boolean z, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4069V5(updateChatReadInbox.chatId, updateChatReadInbox.lastReadInboxMessageId, updateChatReadInbox.unreadCount, z);
            }
        }
    }

    public static void m1808s2(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4044X1(updateMessageSendSucceeded.message, updateMessageSendSucceeded.oldMessageId);
            }
        }
    }

    public static void m1807t(C10930q6.C10938h hVar, AbstractC10700h0 h0Var) {
        h0Var.mo3010g1(hVar.f35141a, hVar.f35142b, 3);
    }

    public static void m1803u(C10930q6.C10938h hVar, AbstractC10700h0 h0Var) {
        h0Var.mo3010g1(hVar.f35141a, hVar.f35142b, 2);
    }

    public static void m1800u2(TdApi.UpdateMessageUnreadReactions updateMessageUnreadReactions, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4040p1(updateMessageUnreadReactions.chatId, updateMessageUnreadReactions.messageId, updateMessageUnreadReactions.unreadReactions, updateMessageUnreadReactions.unreadReactionCount);
            }
        }
    }

    public static void m1797v1(TdApi.UpdateChatReadOutbox updateChatReadOutbox, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4052y1(updateChatReadOutbox.chatId, updateChatReadOutbox.lastReadOutboxMessageId);
            }
        }
    }

    public static void m1795w(C10684g8 g8Var, TdApi.Chat chat, int i, int i2, C10930q6.C10937g gVar, AbstractC10700h0 h0Var) {
        h0Var.mo3007n7(g8Var, chat, i, i2, gVar);
        h0Var.mo3009i(g8Var, 8);
    }

    public static void m1792w2(TdApi.UpdateDeleteMessages updateDeleteMessages, Iterator<AbstractC10748j1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4050H(updateDeleteMessages.chatId, updateDeleteMessages.messageIds);
            }
        }
    }

    public static void m1791x(C10684g8 g8Var, TdApi.Chat chat, boolean z, AbstractC10700h0 h0Var) {
        h0Var.mo3010g1(g8Var, chat, z ? 4 : 1);
    }

    public static void m1788x2(int i, byte[] bArr, Iterator<AbstractC10574c0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().m4525i(i, bArr);
            }
        }
    }

    public static void m1787y(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar, AbstractC10700h0 h0Var) {
        h0Var.mo3008m5(g8Var, chat, i, gVar);
        h0Var.mo3009i(g8Var, 4);
    }

    public static void m1785y1(TdApi.UpdateChatReplyMarkup updateChatReplyMarkup, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4075C5(updateChatReplyMarkup.chatId, updateChatReplyMarkup.replyMarkupMessageId);
            }
        }
    }

    public static void m1781z1(TdApi.UpdateChatTheme updateChatTheme, Iterator<AbstractC10747j0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo4073H0(updateChatTheme.chatId, updateChatTheme.themeName);
            }
        }
    }

    public void m1978A0(TdApi.UpdateAnimatedEmojiMessageClicked updateAnimatedEmojiMessageClicked) {
        m1974B0(updateAnimatedEmojiMessageClicked, this.f35419b.iterator());
        m1974B0(updateAnimatedEmojiMessageClicked, this.f35438u.m21020d(Long.valueOf(updateAnimatedEmojiMessageClicked.chatId)));
    }

    public void m1977A1(TdApi.UpdateChatTheme updateChatTheme, final TdApi.Chat chat, C10684g8[] g8VarArr) {
        m1781z1(updateChatTheme, this.f35421d.iterator());
        m1781z1(updateChatTheme, this.f35440w.m21020d(Long.valueOf(updateChatTheme.chatId)));
        if (g8VarArr != null) {
            for (final C10684g8 g8Var : g8VarArr) {
                m1819q(g8Var, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        ((AbstractC10700h0) obj).mo3010g1(C10684g8.this, chat, 5);
                    }
                });
            }
        }
    }

    public void m1975B(TdApi.Session session) {
        Iterator<AbstractC10925q1> it = this.f35435r.iterator();
        while (it.hasNext()) {
            it.next().mo2957E6(this.f35418a, session);
        }
    }

    public void m1972B2(long j) {
        m1967D(this.f35423f.iterator(), j);
        m1967D(this.f35441x.m21020d(Long.valueOf(j)), j);
    }

    public void m1971C(int i) {
        Iterator<AbstractC10524a> it = this.f35437t.iterator();
        while (it.hasNext()) {
            it.next().mo4826g(i);
        }
    }

    public void m1970C0(boolean z) {
        Iterator<AbstractC11041ub> it = this.f35430m.iterator();
        while (it.hasNext()) {
            it.next().mo1779G0(z);
        }
    }

    public void m1969C1(TdApi.UpdateChatTitle updateChatTitle, final TdApi.Chat chat, C10684g8[] g8VarArr) {
        m1973B1(updateChatTitle, this.f35421d.iterator());
        m1973B1(updateChatTitle, this.f35440w.m21020d(Long.valueOf(updateChatTitle.chatId)));
        if (g8VarArr != null) {
            for (final C10684g8 g8Var : g8VarArr) {
                m1819q(g8Var, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        ((AbstractC10700h0) obj).mo3010g1(C10684g8.this, chat, 0);
                    }
                });
            }
        }
    }

    public void m1968C2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        m1963E(this.f35423f.iterator(), notificationSettingsScope);
    }

    public void m1966D0(String str) {
        Iterator<AbstractC10573c> it = this.f35428k.iterator();
        while (it.hasNext()) {
            it.next().mo4530O2(str);
        }
    }

    public void m1964D2() {
        Iterator<AbstractC10817l1> it = this.f35423f.iterator();
        while (it.hasNext()) {
            it.next().mo3245z0();
        }
    }

    public void m1962E0(TdApi.AuthorizationState authorizationState) {
        Iterator<AbstractC10573c> it = this.f35428k.iterator();
        while (it.hasNext()) {
            it.next().mo4529Z6(authorizationState);
        }
    }

    public void m1961E1(TdApi.UpdateChatUnreadMentionCount updateChatUnreadMentionCount, boolean z) {
        m1965D1(updateChatUnreadMentionCount.chatId, updateChatUnreadMentionCount.unreadMentionCount, z, this.f35421d.iterator());
        long j = updateChatUnreadMentionCount.chatId;
        m1965D1(j, updateChatUnreadMentionCount.unreadMentionCount, z, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1960E2(TdApi.UpdateChatNotificationSettings updateChatNotificationSettings) {
        m1935L(this.f35423f.iterator(), updateChatNotificationSettings.chatId, updateChatNotificationSettings.notificationSettings);
        m1935L(this.f35441x.m21020d(Long.valueOf(updateChatNotificationSettings.chatId)), updateChatNotificationSettings.chatId, updateChatNotificationSettings.notificationSettings);
    }

    public void m1959F(TdApi.ChatList chatList, boolean z, int i, int i2, int i3) {
        Iterator<AbstractC10903p0> it = this.f35431n.iterator();
        while (it.hasNext()) {
            it.next().mo2962n4(chatList, z, i, i2, i3);
        }
    }

    public void m1956F2(TdApi.UpdateScopeNotificationSettings updateScopeNotificationSettings) {
        m1931M(this.f35423f.iterator(), updateScopeNotificationSettings.scope, updateScopeNotificationSettings.notificationSettings);
    }

    public void m1955G(int i) {
        Iterator<AbstractC10925q1> it = this.f35435r.iterator();
        while (it.hasNext()) {
            it.next().mo2954c3(this.f35418a, i);
        }
    }

    public void m1954G0(TdApi.UpdateCall updateCall) {
        m1958F0(updateCall.call, this.f35434q.iterator());
    }

    public void m1953G1(TdApi.UpdateChatUnreadReactionCount updateChatUnreadReactionCount, boolean z) {
        m1957F1(updateChatUnreadReactionCount.chatId, updateChatUnreadReactionCount.unreadReactionCount, z, this.f35421d.iterator());
        long j = updateChatUnreadReactionCount.chatId;
        m1957F1(j, updateChatUnreadReactionCount.unreadReactionCount, z, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1952G2(TdApi.Poll poll) {
        Iterator<AbstractC10839m1> d = this.f35443z.m21020d(Long.valueOf(poll.f25416id));
        if (d != null) {
            while (d.hasNext()) {
                d.next().mo3047N6(poll);
            }
        }
    }

    public void m1951H(TdApi.ChatList chatList, int i, int i2) {
        Iterator<AbstractC10903p0> it = this.f35431n.iterator();
        while (it.hasNext()) {
            it.next().mo2963S(chatList, i, i2);
        }
    }

    public void m1950H0(TdApi.UpdateChatActionBar updateChatActionBar) {
        m1946I0(updateChatActionBar, this.f35421d.iterator());
        m1946I0(updateChatActionBar, this.f35440w.m21020d(Long.valueOf(updateChatActionBar.chatId)));
    }

    public void m1948H2(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        Iterator<AbstractC10883o1> it = this.f35433p.iterator();
        while (it.hasNext()) {
            it.next().mo2964a2(userPrivacySetting, userPrivacySettingRules);
        }
    }

    public void m1947I(TdApi.Session session) {
        Iterator<AbstractC10925q1> it = this.f35435r.iterator();
        while (it.hasNext()) {
            it.next().mo2956O5(this.f35418a, session);
        }
    }

    public void m1945I1(TdApi.UpdateChatVideoChat updateChatVideoChat) {
        m1949H1(updateChatVideoChat.chatId, updateChatVideoChat.videoChat, this.f35421d.iterator());
        long j = updateChatVideoChat.chatId;
        m1949H1(j, updateChatVideoChat.videoChat, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1944I2(TdApi.UpdateRecentStickers updateRecentStickers) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2038H4(updateRecentStickers.stickerIds, updateRecentStickers.isAttached);
        }
    }

    public void m1943J(boolean z) {
        Iterator<AbstractC10925q1> it = this.f35435r.iterator();
        while (it.hasNext()) {
            it.next().mo2953c7(this.f35418a, z);
        }
    }

    public void m1942J0(final C10684g8 g8Var, final TdApi.Chat chat, final int i, final C10930q6.C10937g gVar) {
        m1819q(g8Var, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C11039u9.m1815r(C10684g8.this, chat, i, gVar, (AbstractC10700h0) obj);
            }
        });
    }

    public void m1941J1(int i, int i2) {
        Iterator<AbstractC10861n0> it = this.f35426i.iterator();
        while (it.hasNext()) {
            it.next().mo2996e0(i, i2);
        }
    }

    public void m1940J2(TdApi.UpdateSavedAnimations updateSavedAnimations) {
        Iterator<AbstractC10551b> it = this.f35425h.iterator();
        while (it.hasNext()) {
            it.next().mo4616F1(updateSavedAnimations.animationIds);
        }
    }

    public void m1939K(TdApi.Session session) {
        Iterator<AbstractC10925q1> it = this.f35435r.iterator();
        while (it.hasNext()) {
            it.next().mo2955X0(this.f35418a, session);
        }
    }

    public void m1938K0(TdApi.UpdateChatAvailableReactions updateChatAvailableReactions) {
        m1934L0(updateChatAvailableReactions, this.f35421d.iterator());
        m1934L0(updateChatAvailableReactions, this.f35440w.m21020d(Long.valueOf(updateChatAvailableReactions.chatId)));
    }

    public void m1937K1(TdApi.NetworkType networkType) {
        Iterator<AbstractC10861n0> it = this.f35426i.iterator();
        while (it.hasNext()) {
            it.next().mo2995m3(networkType);
        }
    }

    public void m1936K2(TdApi.StickerSet stickerSet) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2035d5(stickerSet);
        }
    }

    public void m1933L1(boolean z) {
        Iterator<AbstractC11041ub> it = this.f35430m.iterator();
        while (it.hasNext()) {
            it.next().mo1776q3(z);
        }
    }

    public void m1932L2(TdApi.UpdateSuggestedActions updateSuggestedActions) {
        Iterator<AbstractC11041ub> it = this.f35430m.iterator();
        while (it.hasNext()) {
            it.next().mo1778Q2(updateSuggestedActions.addedActions, updateSuggestedActions.removedActions);
        }
    }

    public void m1930M0(final C10684g8 g8Var, final TdApi.Chat chat, final int i, final C10930q6.C10937g gVar) {
        m1819q(g8Var, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C11039u9.m1811s(C10684g8.this, chat, i, gVar, (AbstractC10700h0) obj);
            }
        });
    }

    public void m1929M1(TdApi.UpdateFavoriteStickers updateFavoriteStickers) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2033j3(updateFavoriteStickers.stickerIds);
        }
    }

    public void m1928M2(String str, TdApi.LanguagePackInfo languagePackInfo) {
        Iterator<AbstractC11041ub> it = this.f35430m.iterator();
        while (it.hasNext()) {
            it.next().mo1777g(str, languagePackInfo);
        }
    }

    public final void m1927N(TdApi.StickerSetInfo stickerSetInfo) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2036Z(stickerSetInfo);
        }
    }

    public void m1926N0(long j, String str) {
        m1922O0(j, str, this.f35421d.iterator());
        m1922O0(j, str, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1925N1(TdApi.UpdateFile updateFile) {
        Iterator<AbstractC10985s0> d = this.f35442y.m21020d(Integer.valueOf(updateFile.file.f25376id));
        if (d != null) {
            while (d.hasNext()) {
                d.next().mo2039h2(updateFile);
            }
        }
    }

    public void m1924N2(boolean z) {
        Iterator<AbstractC11041ub> it = this.f35430m.iterator();
        while (it.hasNext()) {
            it.next().mo1775r7(z);
        }
    }

    public final void m1923O(TdApi.StickerSetInfo stickerSetInfo) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2031y0(stickerSetInfo);
        }
    }

    public void m1921O1(TdApi.UpdateFileAddedToDownloads updateFileAddedToDownloads) {
        Iterator<AbstractC10964r0> it = this.f35436s.iterator();
        while (it.hasNext()) {
            it.next().m2054b(updateFileAddedToDownloads.fileDownload, updateFileAddedToDownloads.counts);
        }
    }

    public void m1920O2(TdApi.UpdateTrendingStickerSets updateTrendingStickerSets, int i) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2037U3(updateTrendingStickerSets.stickerSets, i);
        }
    }

    public final void m1919P(TdApi.StickerSetInfo stickerSetInfo) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2034f6(stickerSetInfo);
        }
    }

    public void m1918P0(TdApi.UpdateChatDefaultDisableNotification updateChatDefaultDisableNotification) {
        Iterator<AbstractC10747j0> it = this.f35421d.iterator();
        while (it.hasNext()) {
            it.next().mo4058s2(updateChatDefaultDisableNotification.chatId, updateChatDefaultDisableNotification.defaultDisableNotification);
        }
        Iterator<AbstractC10747j0> d = this.f35440w.m21020d(Long.valueOf(updateChatDefaultDisableNotification.chatId));
        if (d != null) {
            while (d.hasNext()) {
                d.next().mo4058s2(updateChatDefaultDisableNotification.chatId, updateChatDefaultDisableNotification.defaultDisableNotification);
            }
        }
    }

    public void m1917P1(TdApi.UpdateFileDownload updateFileDownload) {
        Iterator<AbstractC10964r0> it = this.f35436s.iterator();
        while (it.hasNext()) {
            it.next().m2053c(updateFileDownload.fileId, updateFileDownload.completeDate, updateFileDownload.isPaused, updateFileDownload.counts);
        }
    }

    public void m1916P2(TdApi.UpdateUsersNearby updateUsersNearby) {
        m1912Q2(updateUsersNearby.usersNearby, this.f35432o.iterator());
    }

    public void m1915Q() {
        Iterator<AbstractC10816l0> it = this.f35429l.iterator();
        while (it.hasNext()) {
            it.next().mo1407c();
        }
    }

    public void m1914Q0(TdApi.UpdateChatMessageSender updateChatMessageSender) {
        Iterator<AbstractC10747j0> it = this.f35421d.iterator();
        while (it.hasNext()) {
            it.next().mo4066a0(updateChatMessageSender.chatId, updateChatMessageSender.messageSenderId);
        }
        Iterator<AbstractC10747j0> d = this.f35440w.m21020d(Long.valueOf(updateChatMessageSender.chatId));
        if (d != null) {
            while (d.hasNext()) {
                d.next().mo4066a0(updateChatMessageSender.chatId, updateChatMessageSender.messageSenderId);
            }
        }
    }

    public void m1913Q1(TdApi.UpdateFileDownloads updateFileDownloads) {
        Iterator<AbstractC10964r0> it = this.f35436s.iterator();
        while (it.hasNext()) {
            it.next().m2052d(updateFileDownloads.totalSize, updateFileDownloads.totalCount, updateFileDownloads.downloadedSize);
        }
    }

    public void m1911R() {
        Iterator<AbstractC10816l0> it = this.f35429l.iterator();
        while (it.hasNext()) {
            it.next().mo1411a();
        }
    }

    public void m1909R1(TdApi.UpdateFileRemovedFromDownloads updateFileRemovedFromDownloads) {
        Iterator<AbstractC10964r0> it = this.f35436s.iterator();
        while (it.hasNext()) {
            it.next().m2055a(updateFileRemovedFromDownloads.fileId, updateFileRemovedFromDownloads.counts);
        }
    }

    public void m1908R2(boolean z) {
        Iterator<AbstractC11041ub> it = this.f35430m.iterator();
        while (it.hasNext()) {
            it.next().mo1774t4(z);
        }
    }

    public void m1907S(boolean z) {
        Iterator<AbstractC10816l0> it = this.f35429l.iterator();
        while (it.hasNext()) {
            it.next().mo1409b(z);
        }
    }

    public void m1906S0(TdApi.UpdateChatDraftMessage updateChatDraftMessage, List<C10930q6.C10938h> list) {
        m1910R0(updateChatDraftMessage.chatId, updateChatDraftMessage.draftMessage, list, this.f35421d.iterator());
        long j = updateChatDraftMessage.chatId;
        m1910R0(j, updateChatDraftMessage.draftMessage, list, this.f35440w.m21020d(Long.valueOf(j)));
        if (list != null) {
            for (final C10930q6.C10938h hVar : list) {
                hVar.f35141a.m4306G(hVar.f35142b, hVar.f35143c);
                m1819q(hVar.f35141a, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        C11039u9.m1807t(C10930q6.C10938h.this, (AbstractC10700h0) obj);
                    }
                });
            }
        }
    }

    public void m1904T(AbstractC10573c cVar) {
        this.f35428k.remove(cVar);
    }

    public void m1903T0(TdApi.UpdateChatFilters updateChatFilters) {
    }

    public void m1902T1(TdApi.UpdateGroupCall updateGroupCall) {
        m1905S1(updateGroupCall.groupCall, this.f35434q.iterator());
    }

    public void m1901U(int i, AbstractC10985s0 s0Var) {
        this.f35442y.m21017g(Integer.valueOf(i), s0Var);
    }

    public void m1900U0(TdApi.UpdateChatHasProtectedContent updateChatHasProtectedContent) {
        m1897V0(updateChatHasProtectedContent, this.f35421d.iterator());
        m1897V0(updateChatHasProtectedContent, this.f35440w.m21020d(Long.valueOf(updateChatHasProtectedContent.chatId)));
    }

    public void m1898V(AbstractC11041ub ubVar) {
        this.f35430m.remove(ubVar);
    }

    public void m1896V1(TdApi.UpdateGroupCallParticipant updateGroupCallParticipant) {
        m1899U1(updateGroupCallParticipant.groupCallId, updateGroupCallParticipant.participant, this.f35434q.iterator());
    }

    public void m1895W(long j, AbstractC10839m1 m1Var) {
        this.f35443z.m21017g(Long.valueOf(j), m1Var);
    }

    public void m1894W0(TdApi.UpdateChatHasScheduledMessages updateChatHasScheduledMessages) {
        m1891X0(updateChatHasScheduledMessages, this.f35421d.iterator());
        m1891X0(updateChatHasScheduledMessages, this.f35440w.m21020d(Long.valueOf(updateChatHasScheduledMessages.chatId)));
    }

    public void m1893W1(TdApi.UpdateInstalledStickerSets updateInstalledStickerSets) {
        Iterator<AbstractC10986s1> it = this.f35424g.iterator();
        while (it.hasNext()) {
            it.next().mo2032k(updateInstalledStickerSets.stickerSetIds, updateInstalledStickerSets.isMasks);
        }
    }

    public void m1892X(AbstractC10903p0 p0Var) {
        this.f35431n.remove(p0Var);
    }

    public void m1890X1(TdApi.UpdateMessageContent updateMessageContent) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> list = map.get(updateMessageContent.chatId + "_" + updateMessageContent.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.content = updateMessageContent.newContent;
            }
        }
        m1887Y1(updateMessageContent, this.f35419b.iterator());
        m1887Y1(updateMessageContent, this.f35438u.m21020d(Long.valueOf(updateMessageContent.chatId)));
    }

    public final void m1889Y(long j, TdApi.Message message) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> remove = map.remove(message.chatId + "_" + j);
        if (!(remove == null || remove.isEmpty())) {
            Map<String, List<TdApi.Message>> map2 = this.f35417A;
            map2.put(message.chatId + "_" + message.f25409id, remove);
            for (TdApi.Message message2 : remove) {
                C7321e.m16913s(message, message2);
            }
        }
    }

    public void m1886Z(AbstractC10551b bVar) {
        this.f35425h.add(bVar);
    }

    public void m1885Z0(TdApi.UpdateChatIsBlocked updateChatIsBlocked) {
        m1888Y0(updateChatIsBlocked.chatId, updateChatIsBlocked.isBlocked, this.f35421d.iterator());
        long j = updateChatIsBlocked.chatId;
        m1888Y0(j, updateChatIsBlocked.isBlocked, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1884Z1(TdApi.UpdateMessageContentOpened updateMessageContentOpened) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> list = map.get(updateMessageContentOpened.chatId + "_" + updateMessageContentOpened.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                C4779t2.m25498i5(message);
            }
        }
        m1880a2(updateMessageContentOpened, this.f35419b.iterator());
        m1880a2(updateMessageContentOpened, this.f35438u.m21020d(Long.valueOf(updateMessageContentOpened.chatId)));
    }

    public void m1882a0(Object obj) {
        synchronized (this) {
            if (obj instanceof AbstractC10748j1) {
                this.f35419b.add((AbstractC10748j1) obj);
            }
            if (obj instanceof AbstractC10701h1) {
                this.f35420c.add((AbstractC10701h1) obj);
            }
            if (obj instanceof AbstractC10747j0) {
                this.f35421d.add((AbstractC10747j0) obj);
            }
            if (obj instanceof AbstractC10817l1) {
                this.f35423f.add((AbstractC10817l1) obj);
            }
            if (obj instanceof AbstractC10986s1) {
                this.f35424g.add((AbstractC10986s1) obj);
            }
            if (obj instanceof AbstractC10551b) {
                this.f35425h.add((AbstractC10551b) obj);
            }
            if (obj instanceof AbstractC10861n0) {
                this.f35426i.add((AbstractC10861n0) obj);
            }
            if (obj instanceof AbstractC10924q0) {
                this.f35427j.add((AbstractC10924q0) obj);
            }
            if (obj instanceof AbstractC11041ub) {
                this.f35430m.add((AbstractC11041ub) obj);
            }
            if (obj instanceof AbstractC10903p0) {
                this.f35431n.add((AbstractC10903p0) obj);
            }
            if (obj instanceof AbstractC10790k0) {
                this.f35432o.add((AbstractC10790k0) obj);
            }
            if (obj instanceof AbstractC10524a) {
                this.f35437t.add((AbstractC10524a) obj);
            }
            if (obj instanceof AbstractC10883o1) {
                this.f35433p.add((AbstractC10883o1) obj);
            }
            if (obj instanceof AbstractC10574c0) {
                this.f35434q.add((AbstractC10574c0) obj);
            }
            if (obj instanceof AbstractC10925q1) {
                this.f35435r.add((AbstractC10925q1) obj);
            }
        }
    }

    public void m1878b0(AbstractC10524a aVar) {
        this.f35437t.add(aVar);
    }

    public void m1877b1(TdApi.UpdateChatIsMarkedAsUnread updateChatIsMarkedAsUnread) {
        m1881a1(updateChatIsMarkedAsUnread.chatId, updateChatIsMarkedAsUnread.isMarkedAsUnread, this.f35421d.iterator());
        long j = updateChatIsMarkedAsUnread.chatId;
        m1881a1(j, updateChatIsMarkedAsUnread.isMarkedAsUnread, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1876b2(TdApi.UpdateMessageEdited updateMessageEdited) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> list = map.get(updateMessageEdited.chatId + "_" + updateMessageEdited.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.editDate = updateMessageEdited.editDate;
                message.replyMarkup = updateMessageEdited.replyMarkup;
            }
        }
        m1872c2(updateMessageEdited, this.f35419b.iterator());
        m1872c2(updateMessageEdited, this.f35438u.m21020d(Long.valueOf(updateMessageEdited.chatId)));
    }

    public void m1874c0(TdApi.ChatList chatList, AbstractC10700h0 h0Var) {
        this.f35422e.m21022b(C4779t2.m25457o4(chatList), h0Var);
    }

    public void m1870d0(long j, AbstractC10747j0 j0Var) {
        this.f35440w.m21022b(Long.valueOf(j), j0Var);
    }

    public void m1869d1(TdApi.UpdateChatLastMessage updateChatLastMessage, List<C10930q6.C10938h> list) {
        m1873c1(updateChatLastMessage.chatId, updateChatLastMessage.lastMessage, list, this.f35421d.iterator());
        long j = updateChatLastMessage.chatId;
        m1873c1(j, updateChatLastMessage.lastMessage, list, this.f35440w.m21020d(Long.valueOf(j)));
        if (list != null) {
            for (final C10930q6.C10938h hVar : list) {
                hVar.f35141a.m4306G(hVar.f35142b, hVar.f35143c);
                m1819q(hVar.f35141a, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        C11039u9.m1803u(C10930q6.C10938h.this, (AbstractC10700h0) obj);
                    }
                });
            }
        }
    }

    public void m1868d2(TdApi.UpdateMessageInteractionInfo updateMessageInteractionInfo) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> list = map.get(updateMessageInteractionInfo.chatId + "_" + updateMessageInteractionInfo.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.interactionInfo = updateMessageInteractionInfo.interactionInfo;
            }
        }
        m1864e2(updateMessageInteractionInfo, this.f35419b.iterator());
        m1864e2(updateMessageInteractionInfo, this.f35438u.m21020d(Long.valueOf(updateMessageInteractionInfo.chatId)));
    }

    public void m1866e0(AbstractC10861n0 n0Var) {
        this.f35426i.add(n0Var);
    }

    public void m1865e1(final C10684g8 g8Var, final int i, final int i2) {
        m1819q(g8Var, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                ((AbstractC10700h0) obj).mo3013I5(C10684g8.this, i, i2);
            }
        });
    }

    public void m1862f0(long j, AbstractC10701h1 h1Var) {
        this.f35439v.m21022b(Long.valueOf(j), h1Var);
    }

    public void m1860f2(TdApi.UpdateMessageIsPinned updateMessageIsPinned) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> list = map.get(updateMessageIsPinned.chatId + "_" + updateMessageIsPinned.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.isPinned = updateMessageIsPinned.isPinned;
            }
        }
        m1856g2(updateMessageIsPinned, this.f35419b.iterator());
        m1856g2(updateMessageIsPinned, this.f35438u.m21020d(Long.valueOf(updateMessageIsPinned.chatId)));
    }

    public void m1858g0(long j, AbstractC10748j1 j1Var) {
        this.f35438u.m21022b(Long.valueOf(j), j1Var);
    }

    public void m1857g1(TdApi.UpdateChatMessageTtl updateChatMessageTtl) {
        m1861f1(updateChatMessageTtl.chatId, updateChatMessageTtl.messageTtl, this.f35421d.iterator());
        long j = updateChatMessageTtl.chatId;
        m1861f1(j, updateChatMessageTtl.messageTtl, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1854h0(AbstractC10883o1 o1Var) {
        this.f35433p.add(o1Var);
    }

    public void m1853h1(final C10684g8 g8Var, final TdApi.Chat chat, final int i, final int i2, final C10930q6.C10937g gVar) {
        m1819q(g8Var, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C11039u9.m1795w(C10684g8.this, chat, i, i2, gVar, (AbstractC10700h0) obj);
            }
        });
    }

    public void m1852h2(TdApi.UpdateMessageLiveLocationViewed updateMessageLiveLocationViewed) {
        m1848i2(updateMessageLiveLocationViewed, this.f35419b.iterator());
        m1848i2(updateMessageLiveLocationViewed, this.f35438u.m21020d(Long.valueOf(updateMessageLiveLocationViewed.chatId)));
    }

    public void m1850i0(AbstractC10925q1 q1Var) {
        this.f35435r.add(q1Var);
    }

    public void m1846j0(long j, AbstractC10817l1 l1Var) {
        this.f35441x.m21022b(Long.valueOf(j), l1Var);
    }

    public void m1845j1(TdApi.UpdateChatOnlineMemberCount updateChatOnlineMemberCount) {
        m1849i1(updateChatOnlineMemberCount.chatId, updateChatOnlineMemberCount.onlineMemberCount, this.f35421d.iterator());
        long j = updateChatOnlineMemberCount.chatId;
        m1849i1(j, updateChatOnlineMemberCount.onlineMemberCount, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1843k(AbstractC10573c cVar) {
        this.f35428k.add(cVar);
    }

    public void m1842k0(AbstractC10817l1 l1Var) {
        this.f35423f.add(l1Var);
    }

    public void m1840k2(TdApi.UpdateMessageMentionRead updateMessageMentionRead, boolean z, boolean z2) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> list = map.get(updateMessageMentionRead.chatId + "_" + updateMessageMentionRead.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.containsUnreadMention = false;
            }
        }
        m1844j2(updateMessageMentionRead, this.f35419b.iterator());
        m1844j2(updateMessageMentionRead, this.f35438u.m21020d(Long.valueOf(updateMessageMentionRead.chatId)));
        if (z) {
            m1965D1(updateMessageMentionRead.chatId, updateMessageMentionRead.unreadMentionCount, z2, this.f35421d.iterator());
            long j = updateMessageMentionRead.chatId;
            m1965D1(j, updateMessageMentionRead.unreadMentionCount, z2, this.f35440w.m21020d(Long.valueOf(j)));
        }
    }

    public void m1839l(AbstractC10816l0 l0Var) {
        this.f35429l.add(l0Var);
        if (!this.f35418a.m2848G6() || !this.f35418a.m2673R6()) {
            if (this.f35418a.m2219u7()) {
                l0Var.mo1407c();
            }
        } else if (this.f35418a.m2331n7()) {
            l0Var.mo1409b(false);
        }
    }

    public void m1838l0(AbstractC10986s1 s1Var) {
        this.f35424g.add(s1Var);
    }

    public void m1837l1(TdApi.UpdateChatPendingJoinRequests updateChatPendingJoinRequests) {
        m1841k1(updateChatPendingJoinRequests.chatId, updateChatPendingJoinRequests.pendingJoinRequests, this.f35421d.iterator());
        long j = updateChatPendingJoinRequests.chatId;
        m1841k1(j, updateChatPendingJoinRequests.pendingJoinRequests, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1836l2(long j, long j2) {
        m1832m2(j, j2, this.f35420c.iterator());
        m1832m2(j, j2, this.f35439v.m21020d(Long.valueOf(j)));
    }

    public void m1835m(int i, AbstractC10985s0 s0Var) {
        this.f35442y.m21022b(Integer.valueOf(i), s0Var);
    }

    public void m1834m0(TdApi.Message message) {
        String str = message.chatId + "_" + message.f25409id;
        List<TdApi.Message> list = this.f35417A.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f35417A.put(str, list);
        }
        list.add(message);
    }

    public void m1831n(AbstractC11041ub ubVar) {
        this.f35430m.add(ubVar);
    }

    public void m1830n0(AbstractC10524a aVar) {
        this.f35437t.remove(aVar);
    }

    public void m1829n1(TdApi.UpdateChatPermissions updateChatPermissions) {
        m1833m1(updateChatPermissions.chatId, updateChatPermissions.permissions, this.f35421d.iterator());
        long j = updateChatPermissions.chatId;
        m1833m1(j, updateChatPermissions.permissions, this.f35440w.m21020d(Long.valueOf(j)));
    }

    public void m1828n2(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged) {
        m1824o2(updateMessageSendAcknowledged, this.f35419b.iterator());
        m1824o2(updateMessageSendAcknowledged, this.f35438u.m21020d(Long.valueOf(updateMessageSendAcknowledged.chatId)));
    }

    public void m1827o(long j, AbstractC10839m1 m1Var) {
        this.f35443z.m21022b(Long.valueOf(j), m1Var);
    }

    public void m1826o0(Object obj) {
        synchronized (this) {
            if (obj instanceof AbstractC10748j1) {
                this.f35419b.remove((AbstractC10748j1) obj);
            }
            if (obj instanceof AbstractC10701h1) {
                this.f35420c.remove((AbstractC10701h1) obj);
            }
            if (obj instanceof AbstractC10747j0) {
                this.f35421d.remove((AbstractC10747j0) obj);
            }
            if (obj instanceof AbstractC10817l1) {
                this.f35423f.remove((AbstractC10817l1) obj);
            }
            if (obj instanceof AbstractC10986s1) {
                this.f35424g.remove((AbstractC10986s1) obj);
            }
            if (obj instanceof AbstractC10986s1) {
                this.f35425h.remove((AbstractC10551b) obj);
            }
            if (obj instanceof AbstractC10861n0) {
                this.f35426i.remove((AbstractC10861n0) obj);
            }
            if (obj instanceof AbstractC10924q0) {
                this.f35427j.remove((AbstractC10924q0) obj);
            }
            if (obj instanceof AbstractC11041ub) {
                this.f35430m.remove((AbstractC11041ub) obj);
            }
            if (obj instanceof AbstractC10903p0) {
                this.f35431n.remove((AbstractC10903p0) obj);
            }
            if (obj instanceof AbstractC10790k0) {
                this.f35432o.remove((AbstractC10790k0) obj);
            }
            if (obj instanceof AbstractC10524a) {
                this.f35437t.remove((AbstractC10524a) obj);
            }
            if (obj instanceof AbstractC10883o1) {
                this.f35433p.remove((AbstractC10883o1) obj);
            }
            if (obj instanceof AbstractC10574c0) {
                this.f35434q.remove((AbstractC10574c0) obj);
            }
            if (obj instanceof AbstractC10925q1) {
                this.f35435r.remove((AbstractC10925q1) obj);
            }
        }
    }

    public void m1825o1(TdApi.UpdateChatPhoto updateChatPhoto) {
        m1821p1(updateChatPhoto, this.f35421d.iterator());
        m1821p1(updateChatPhoto, this.f35440w.m21020d(Long.valueOf(updateChatPhoto.chatId)));
    }

    public void m1823p(AbstractC10903p0 p0Var) {
        this.f35431n.add(p0Var);
    }

    public void m1822p0(TdApi.ChatList chatList, AbstractC10700h0 h0Var) {
        this.f35422e.m21017g(C4779t2.m25457o4(chatList), h0Var);
    }

    public void m1820p2(TdApi.UpdateMessageSendFailed updateMessageSendFailed) {
        m1889Y(updateMessageSendFailed.oldMessageId, updateMessageSendFailed.message);
        m1816q2(updateMessageSendFailed, this.f35419b.iterator());
        m1816q2(updateMessageSendFailed, this.f35438u.m21020d(Long.valueOf(updateMessageSendFailed.message.chatId)));
    }

    public final void m1819q(C10684g8 g8Var, AbstractC5918j<AbstractC10700h0> jVar) {
        Iterator<AbstractC10700h0> d = this.f35422e.m21020d(C4779t2.m25457o4(g8Var.m4290j()));
        if (d != null) {
            while (d.hasNext()) {
                jVar.mo1330a(d.next());
            }
        }
    }

    public void m1818q0(long j, AbstractC10747j0 j0Var) {
        this.f35440w.m21017g(Long.valueOf(j), j0Var);
    }

    public void m1814r0(AbstractC10861n0 n0Var) {
        this.f35426i.remove(n0Var);
    }

    public void m1813r1(TdApi.UpdateChatPosition updateChatPosition, C10930q6.C10938h hVar) {
        boolean b = hVar.f35143c.m2129b();
        boolean d = hVar.f35143c.m2127d();
        boolean c = hVar.f35143c.m2128c();
        m1817q1(updateChatPosition.chatId, updateChatPosition.position, b, d, c, this.f35421d.iterator());
        long j = updateChatPosition.chatId;
        m1817q1(j, updateChatPosition.position, b, d, c, this.f35440w.m21020d(Long.valueOf(j)));
        hVar.f35141a.m4306G(hVar.f35142b, hVar.f35143c);
    }

    public void m1812r2(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        m1889Y(updateMessageSendSucceeded.oldMessageId, updateMessageSendSucceeded.message);
        m1808s2(updateMessageSendSucceeded, this.f35419b.iterator());
        m1808s2(updateMessageSendSucceeded, this.f35438u.m21020d(Long.valueOf(updateMessageSendSucceeded.message.chatId)));
    }

    public void m1810s0(long j, AbstractC10701h1 h1Var) {
        this.f35439v.m21017g(Long.valueOf(j), h1Var);
    }

    public void m1806t0(long j, AbstractC10748j1 j1Var) {
        this.f35438u.m21017g(Long.valueOf(j), j1Var);
    }

    public void m1805t1(TdApi.UpdateChatReadInbox updateChatReadInbox, final boolean z, final TdApi.Chat chat, C10684g8[] g8VarArr) {
        m1809s1(updateChatReadInbox, z, this.f35421d.iterator());
        m1809s1(updateChatReadInbox, z, this.f35440w.m21020d(Long.valueOf(updateChatReadInbox.chatId)));
        if (g8VarArr != null) {
            for (final C10684g8 g8Var : g8VarArr) {
                m1819q(g8Var, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        C11039u9.m1791x(C10684g8.this, chat, z, (AbstractC10700h0) obj);
                    }
                });
            }
        }
    }

    public void m1804t2(TdApi.UpdateMessageUnreadReactions updateMessageUnreadReactions) {
        Map<String, List<TdApi.Message>> map = this.f35417A;
        List<TdApi.Message> list = map.get(updateMessageUnreadReactions.chatId + "_" + updateMessageUnreadReactions.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.unreadReactions = updateMessageUnreadReactions.unreadReactions;
            }
        }
        m1800u2(updateMessageUnreadReactions, this.f35419b.iterator());
        m1800u2(updateMessageUnreadReactions, this.f35438u.m21020d(Long.valueOf(updateMessageUnreadReactions.chatId)));
    }

    public void m1802u0(AbstractC10883o1 o1Var) {
        this.f35433p.remove(o1Var);
    }

    public void m1801u1(TdApi.UpdateChatReadOutbox updateChatReadOutbox) {
        m1797v1(updateChatReadOutbox, this.f35421d.iterator());
        m1797v1(updateChatReadOutbox, this.f35440w.m21020d(Long.valueOf(updateChatReadOutbox.chatId)));
    }

    public void m1798v0(AbstractC10925q1 q1Var) {
        this.f35435r.remove(q1Var);
    }

    public void m1796v2(TdApi.UpdateDeleteMessages updateDeleteMessages) {
        m1792w2(updateDeleteMessages, this.f35419b.iterator());
        m1792w2(updateDeleteMessages, this.f35438u.m21020d(Long.valueOf(updateDeleteMessages.chatId)));
    }

    public void m1794w0(long j, AbstractC10817l1 l1Var) {
        this.f35441x.m21017g(Long.valueOf(j), l1Var);
    }

    public void m1793w1(final C10684g8 g8Var, final TdApi.Chat chat, final int i, final C10930q6.C10937g gVar) {
        m1819q(g8Var, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C11039u9.m1787y(C10684g8.this, chat, i, gVar, (AbstractC10700h0) obj);
            }
        });
    }

    public void m1790x0(AbstractC10817l1 l1Var) {
        this.f35423f.remove(l1Var);
    }

    public void m1789x1(TdApi.UpdateChatReplyMarkup updateChatReplyMarkup) {
        m1785y1(updateChatReplyMarkup, this.f35421d.iterator());
        m1785y1(updateChatReplyMarkup, this.f35440w.m21020d(Long.valueOf(updateChatReplyMarkup.chatId)));
    }

    public void m1786y0(AbstractC10986s1 s1Var) {
        this.f35424g.remove(s1Var);
    }

    public void m1784y2(TdApi.UpdateNewCallSignalingData updateNewCallSignalingData) {
        m1788x2(updateNewCallSignalingData.callId, updateNewCallSignalingData.data, this.f35434q.iterator());
    }

    public void m1782z0(TdApi.Message message) {
        String str = message.chatId + "_" + message.f25409id;
        List<TdApi.Message> list = this.f35417A.get(str);
        if (list != null && list.remove(message) && list.isEmpty()) {
            this.f35417A.remove(str);
        }
    }

    public void m1780z2(TdApi.UpdateNewMessage updateNewMessage) {
        m1976A2(updateNewMessage, this.f35419b.iterator());
        m1976A2(updateNewMessage, this.f35438u.m21020d(Long.valueOf(updateNewMessage.message.chatId)));
    }
}
