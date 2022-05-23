package zd;

import hd.t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kb.j;
import lb.c;
import lb.d;
import lb.f;
import lb.h;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class s9 {
    public final o6 f28376a;
    public final Map<String, List<TdApi.Message>> A = new HashMap();
    public final d<h1> f28377b = new d<>();
    public final d<f1> f28378c = new d<>();
    public final d<h0> f28379d = new d<>();
    public final h<String, f0> f28380e = new h<>(true);
    public final d<j1> f28381f = new d<>(true);
    public final d<q1> f28382g = new d<>(true);
    public final d<b> f28383h = new d<>();
    public final d<l0> f28384i = new d<>(true);
    public final d<o0> f28385j = new d<>();
    public final d<c> f28386k = new d<>(true);
    public final d<j0> f28387l = new d<>(true);
    public final d<sb> f28388m = new d<>(true);
    public final d<n0> f28389n = new d<>(true);
    public final d<i0> f28390o = new d<>(true);
    public final d<m1> f28391p = new d<>();
    public final d<a0> f28392q = new d<>(true);
    public final d<o1> f28393r = new d<>(true);
    public final d<p0> f28394s = new d<>(true);
    public final d<a> f28395t = new d<>(true);
    public final f<h1> f28396u = new f<>();
    public final f<f1> f28397v = new f<>();
    public final f<h0> f28398w = new f<>();
    public final f<j1> f28399x = new f<>(true);
    public final c<q0> f28400y = new c<>();
    public final f<k1> f28401z = new f<>();

    public s9(o6 o6Var) {
        this.f28376a = o6Var;
    }

    public static void A2(TdApi.UpdateNewMessage updateNewMessage, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().y2(updateNewMessage.message);
            }
        }
    }

    public static void B0(TdApi.UpdateAnimatedEmojiMessageClicked updateAnimatedEmojiMessageClicked, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().b6(updateAnimatedEmojiMessageClicked.chatId, updateAnimatedEmojiMessageClicked.messageId, updateAnimatedEmojiMessageClicked.sticker);
            }
        }
    }

    public static void B1(TdApi.UpdateChatTitle updateChatTitle, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().f5(updateChatTitle.chatId, updateChatTitle.title);
            }
        }
    }

    public static void D(Iterator<j1> it, long j10) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().x1(j10);
            }
        }
    }

    public static void D1(long j10, int i10, boolean z10, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().l0(j10, i10, z10);
            }
        }
    }

    public static void E(Iterator<j1> it, TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().A5(notificationSettingsScope);
            }
        }
    }

    public static void F0(TdApi.Call call, Iterator<a0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().d(call);
            }
        }
    }

    public static void F1(long j10, int i10, boolean z10, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().B5(j10, i10, z10);
            }
        }
    }

    public static void H1(long j10, TdApi.VideoChat videoChat, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().k3(j10, videoChat);
            }
        }
    }

    public static void I0(TdApi.UpdateChatActionBar updateChatActionBar, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().X(updateChatActionBar.chatId, updateChatActionBar.actionBar);
            }
        }
    }

    public static void L(Iterator<j1> it, long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().Y3(j10, chatNotificationSettings);
            }
        }
    }

    public static void L0(TdApi.UpdateChatAvailableReactions updateChatAvailableReactions, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().t4(updateChatAvailableReactions.chatId, updateChatAvailableReactions.availableReactions);
            }
        }
    }

    public static void M(Iterator<j1> it, TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().x2(notificationSettingsScope, scopeNotificationSettings);
            }
        }
    }

    public static void O0(long j10, String str, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().f4(j10, str);
            }
        }
    }

    public static void Q2(TdApi.ChatNearby[] chatNearbyArr, Iterator<i0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().a(chatNearbyArr);
            }
        }
    }

    public static void R0(long j10, TdApi.DraftMessage draftMessage, List<o6.h> list, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                h0 next = it.next();
                next.b2(j10, draftMessage);
                if (list != null) {
                    for (o6.h hVar : list) {
                        o6.g gVar = hVar.f28139c;
                        next.w6(j10, gVar.f28135a, gVar.b(), gVar.d(), gVar.c());
                    }
                }
            }
        }
    }

    public static void S1(TdApi.GroupCall groupCall, Iterator<a0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().e(groupCall);
            }
        }
    }

    public static void U1(int i10, TdApi.GroupCallParticipant groupCallParticipant, Iterator<a0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().f(i10, groupCallParticipant);
            }
        }
    }

    public static void V0(TdApi.UpdateChatHasProtectedContent updateChatHasProtectedContent, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().p6(updateChatHasProtectedContent.chatId, updateChatHasProtectedContent.hasProtectedContent);
            }
        }
    }

    public static void X0(TdApi.UpdateChatHasScheduledMessages updateChatHasScheduledMessages, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().B3(updateChatHasScheduledMessages.chatId, updateChatHasScheduledMessages.hasScheduledMessages);
            }
        }
    }

    public static void Y0(long j10, boolean z10, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().w1(j10, z10);
            }
        }
    }

    public static void Y1(TdApi.UpdateMessageContent updateMessageContent, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().j0(updateMessageContent.chatId, updateMessageContent.messageId, updateMessageContent.newContent);
            }
        }
    }

    public static void a1(long j10, boolean z10, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().N1(j10, z10);
            }
        }
    }

    public static void a2(TdApi.UpdateMessageContentOpened updateMessageContentOpened, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().s5(updateMessageContentOpened.chatId, updateMessageContentOpened.messageId);
            }
        }
    }

    public static void c1(long j10, TdApi.Message message, List<o6.h> list, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                h0 next = it.next();
                next.Y(j10, message);
                if (list != null) {
                    for (o6.h hVar : list) {
                        o6.g gVar = hVar.f28139c;
                        next.w6(j10, gVar.f28135a, gVar.b(), gVar.d(), gVar.c());
                    }
                }
            }
        }
    }

    public static void c2(TdApi.UpdateMessageEdited updateMessageEdited, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().l5(updateMessageEdited.chatId, updateMessageEdited.messageId, updateMessageEdited.editDate, updateMessageEdited.replyMarkup);
            }
        }
    }

    public static void e2(TdApi.UpdateMessageInteractionInfo updateMessageInteractionInfo, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().T0(updateMessageInteractionInfo.chatId, updateMessageInteractionInfo.messageId, updateMessageInteractionInfo.interactionInfo);
            }
        }
    }

    public static void f1(long j10, int i10, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().e7(j10, i10);
            }
        }
    }

    public static void g2(TdApi.UpdateMessageIsPinned updateMessageIsPinned, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().S1(updateMessageIsPinned.chatId, updateMessageIsPinned.messageId, updateMessageIsPinned.isPinned);
            }
        }
    }

    public static void i1(long j10, int i10, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().N0(j10, i10);
            }
        }
    }

    public static void i2(TdApi.UpdateMessageLiveLocationViewed updateMessageLiveLocationViewed, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().D5(updateMessageLiveLocationViewed.chatId, updateMessageLiveLocationViewed.messageId);
            }
        }
    }

    public static void j2(TdApi.UpdateMessageMentionRead updateMessageMentionRead, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().W(updateMessageMentionRead.chatId, updateMessageMentionRead.messageId);
            }
        }
    }

    public static void k1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().c1(j10, chatJoinRequestsInfo);
            }
        }
    }

    public static void m1(long j10, TdApi.ChatPermissions chatPermissions, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().t7(j10, chatPermissions);
            }
        }
    }

    public static void m2(long j10, long j11, Iterator<f1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().g3(j10, j11);
            }
        }
    }

    public static void o2(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().J3(updateMessageSendAcknowledged.chatId, updateMessageSendAcknowledged.messageId);
            }
        }
    }

    public static void p1(TdApi.UpdateChatPhoto updateChatPhoto, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().R3(updateChatPhoto.chatId, updateChatPhoto.photo);
            }
        }
    }

    public static void q1(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().w6(j10, chatPosition, z10, z11, z12);
            }
        }
    }

    public static void q2(TdApi.UpdateMessageSendFailed updateMessageSendFailed, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().g5(updateMessageSendFailed.message, updateMessageSendFailed.oldMessageId, updateMessageSendFailed.errorCode, updateMessageSendFailed.errorMessage);
            }
        }
    }

    public static void r(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar, f0 f0Var) {
        f0Var.X2(e8Var, chat, i10, gVar);
        f0Var.U6(e8Var, 2);
    }

    public static void s(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar, f0 f0Var) {
        f0Var.i2(e8Var, chat, i10, gVar);
        f0Var.U6(e8Var, 1);
    }

    public static void s1(TdApi.UpdateChatReadInbox updateChatReadInbox, boolean z10, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().T5(updateChatReadInbox.chatId, updateChatReadInbox.lastReadInboxMessageId, updateChatReadInbox.unreadCount, z10);
            }
        }
    }

    public static void s2(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().X1(updateMessageSendSucceeded.message, updateMessageSendSucceeded.oldMessageId);
            }
        }
    }

    public static void t(o6.h hVar, f0 f0Var) {
        f0Var.R0(hVar.f28137a, hVar.f28138b, 3);
    }

    public static void u(o6.h hVar, f0 f0Var) {
        f0Var.R0(hVar.f28137a, hVar.f28138b, 2);
    }

    public static void u2(TdApi.UpdateMessageUnreadReactions updateMessageUnreadReactions, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().k1(updateMessageUnreadReactions.chatId, updateMessageUnreadReactions.messageId, updateMessageUnreadReactions.unreadReactions, updateMessageUnreadReactions.unreadReactionCount);
            }
        }
    }

    public static void v1(TdApi.UpdateChatReadOutbox updateChatReadOutbox, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().y1(updateChatReadOutbox.chatId, updateChatReadOutbox.lastReadOutboxMessageId);
            }
        }
    }

    public static void w(e8 e8Var, TdApi.Chat chat, int i10, int i11, o6.g gVar, f0 f0Var) {
        f0Var.G6(e8Var, chat, i10, i11, gVar);
        f0Var.U6(e8Var, 8);
    }

    public static void w2(TdApi.UpdateDeleteMessages updateDeleteMessages, Iterator<h1> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().H(updateDeleteMessages.chatId, updateDeleteMessages.messageIds);
            }
        }
    }

    public static void x(e8 e8Var, TdApi.Chat chat, boolean z10, f0 f0Var) {
        f0Var.R0(e8Var, chat, z10 ? 4 : 1);
    }

    public static void x2(int i10, byte[] bArr, Iterator<a0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().g(i10, bArr);
            }
        }
    }

    public static void y(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar, f0 f0Var) {
        f0Var.Y6(e8Var, chat, i10, gVar);
        f0Var.U6(e8Var, 4);
    }

    public static void y1(TdApi.UpdateChatReplyMarkup updateChatReplyMarkup, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().x5(updateChatReplyMarkup.chatId, updateChatReplyMarkup.replyMarkupMessageId);
            }
        }
    }

    public static void z1(TdApi.UpdateChatTheme updateChatTheme, Iterator<h0> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().H0(updateChatTheme.chatId, updateChatTheme.themeName);
            }
        }
    }

    public void A0(TdApi.UpdateAnimatedEmojiMessageClicked updateAnimatedEmojiMessageClicked) {
        B0(updateAnimatedEmojiMessageClicked, this.f28377b.iterator());
        B0(updateAnimatedEmojiMessageClicked, this.f28396u.d(Long.valueOf(updateAnimatedEmojiMessageClicked.chatId)));
    }

    public void A1(TdApi.UpdateChatTheme updateChatTheme, final TdApi.Chat chat, e8[] e8VarArr) {
        z1(updateChatTheme, this.f28379d.iterator());
        z1(updateChatTheme, this.f28398w.d(Long.valueOf(updateChatTheme.chatId)));
        if (e8VarArr != null) {
            for (final e8 e8Var : e8VarArr) {
                q(e8Var, new j() {
                    @Override
                    public final void a(Object obj) {
                        ((f0) obj).R0(e8.this, chat, 5);
                    }
                });
            }
        }
    }

    public void B(TdApi.Session session) {
        Iterator<o1> it = this.f28393r.iterator();
        while (it.hasNext()) {
            it.next().H5(this.f28376a, session);
        }
    }

    public void B2(long j10) {
        D(this.f28381f.iterator(), j10);
        D(this.f28399x.d(Long.valueOf(j10)), j10);
    }

    public void C(int i10) {
        Iterator<a> it = this.f28395t.iterator();
        while (it.hasNext()) {
            it.next().h(i10);
        }
    }

    public void C0(boolean z10) {
        Iterator<sb> it = this.f28388m.iterator();
        while (it.hasNext()) {
            it.next().G0(z10);
        }
    }

    public void C1(TdApi.UpdateChatTitle updateChatTitle, final TdApi.Chat chat, e8[] e8VarArr) {
        B1(updateChatTitle, this.f28379d.iterator());
        B1(updateChatTitle, this.f28398w.d(Long.valueOf(updateChatTitle.chatId)));
        if (e8VarArr != null) {
            for (final e8 e8Var : e8VarArr) {
                q(e8Var, new j() {
                    @Override
                    public final void a(Object obj) {
                        ((f0) obj).R0(e8.this, chat, 0);
                    }
                });
            }
        }
    }

    public void C2(TdApi.NotificationSettingsScope notificationSettingsScope) {
        E(this.f28381f.iterator(), notificationSettingsScope);
    }

    public void D0(String str) {
        Iterator<c> it = this.f28386k.iterator();
        while (it.hasNext()) {
            it.next().F2(str);
        }
    }

    public void D2() {
        Iterator<j1> it = this.f28381f.iterator();
        while (it.hasNext()) {
            it.next().z0();
        }
    }

    public void E0(TdApi.AuthorizationState authorizationState) {
        Iterator<c> it = this.f28386k.iterator();
        while (it.hasNext()) {
            it.next().Z6(authorizationState);
        }
    }

    public void E1(TdApi.UpdateChatUnreadMentionCount updateChatUnreadMentionCount, boolean z10) {
        D1(updateChatUnreadMentionCount.chatId, updateChatUnreadMentionCount.unreadMentionCount, z10, this.f28379d.iterator());
        long j10 = updateChatUnreadMentionCount.chatId;
        D1(j10, updateChatUnreadMentionCount.unreadMentionCount, z10, this.f28398w.d(Long.valueOf(j10)));
    }

    public void E2(TdApi.UpdateChatNotificationSettings updateChatNotificationSettings) {
        L(this.f28381f.iterator(), updateChatNotificationSettings.chatId, updateChatNotificationSettings.notificationSettings);
        L(this.f28399x.d(Long.valueOf(updateChatNotificationSettings.chatId)), updateChatNotificationSettings.chatId, updateChatNotificationSettings.notificationSettings);
    }

    public void F(TdApi.ChatList chatList, boolean z10, int i10, int i11, int i12) {
        Iterator<n0> it = this.f28389n.iterator();
        while (it.hasNext()) {
            it.next().a4(chatList, z10, i10, i11, i12);
        }
    }

    public void F2(TdApi.UpdateScopeNotificationSettings updateScopeNotificationSettings) {
        M(this.f28381f.iterator(), updateScopeNotificationSettings.scope, updateScopeNotificationSettings.notificationSettings);
    }

    public void G(int i10) {
        Iterator<o1> it = this.f28393r.iterator();
        while (it.hasNext()) {
            it.next().r0(this.f28376a, i10);
        }
    }

    public void G0(TdApi.UpdateCall updateCall) {
        F0(updateCall.call, this.f28392q.iterator());
    }

    public void G1(TdApi.UpdateChatUnreadReactionCount updateChatUnreadReactionCount, boolean z10) {
        F1(updateChatUnreadReactionCount.chatId, updateChatUnreadReactionCount.unreadReactionCount, z10, this.f28379d.iterator());
        long j10 = updateChatUnreadReactionCount.chatId;
        F1(j10, updateChatUnreadReactionCount.unreadReactionCount, z10, this.f28398w.d(Long.valueOf(j10)));
    }

    public void G2(TdApi.Poll poll) {
        Iterator<k1> d10 = this.f28401z.d(Long.valueOf(poll.f19954id));
        if (d10 != null) {
            while (d10.hasNext()) {
                d10.next().M6(poll);
            }
        }
    }

    public void H(TdApi.ChatList chatList, int i10, int i11) {
        Iterator<n0> it = this.f28389n.iterator();
        while (it.hasNext()) {
            it.next().R(chatList, i10, i11);
        }
    }

    public void H0(TdApi.UpdateChatActionBar updateChatActionBar) {
        I0(updateChatActionBar, this.f28379d.iterator());
        I0(updateChatActionBar, this.f28398w.d(Long.valueOf(updateChatActionBar.chatId)));
    }

    public void H2(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        Iterator<m1> it = this.f28391p.iterator();
        while (it.hasNext()) {
            it.next().Y1(userPrivacySetting, userPrivacySettingRules);
        }
    }

    public void I(TdApi.Session session) {
        Iterator<o1> it = this.f28393r.iterator();
        while (it.hasNext()) {
            it.next().F5(this.f28376a, session);
        }
    }

    public void I1(TdApi.UpdateChatVideoChat updateChatVideoChat) {
        H1(updateChatVideoChat.chatId, updateChatVideoChat.videoChat, this.f28379d.iterator());
        long j10 = updateChatVideoChat.chatId;
        H1(j10, updateChatVideoChat.videoChat, this.f28398w.d(Long.valueOf(j10)));
    }

    public void I2(TdApi.UpdateRecentStickers updateRecentStickers) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().z4(updateRecentStickers.stickerIds, updateRecentStickers.isAttached);
        }
    }

    public void J(boolean z10) {
        Iterator<o1> it = this.f28393r.iterator();
        while (it.hasNext()) {
            it.next().h1(this.f28376a, z10);
        }
    }

    public void J0(final e8 e8Var, final TdApi.Chat chat, final int i10, final o6.g gVar) {
        q(e8Var, new j() {
            @Override
            public final void a(Object obj) {
                s9.r(e8.this, chat, i10, gVar, (f0) obj);
            }
        });
    }

    public void J1(int i10, int i11) {
        Iterator<l0> it = this.f28384i.iterator();
        while (it.hasNext()) {
            it.next().e0(i10, i11);
        }
    }

    public void J2(TdApi.UpdateSavedAnimations updateSavedAnimations) {
        Iterator<b> it = this.f28383h.iterator();
        while (it.hasNext()) {
            it.next().D1(updateSavedAnimations.animationIds);
        }
    }

    public void K(TdApi.Session session) {
        Iterator<o1> it = this.f28393r.iterator();
        while (it.hasNext()) {
            it.next().r7(this.f28376a, session);
        }
    }

    public void K0(TdApi.UpdateChatAvailableReactions updateChatAvailableReactions) {
        L0(updateChatAvailableReactions, this.f28379d.iterator());
        L0(updateChatAvailableReactions, this.f28398w.d(Long.valueOf(updateChatAvailableReactions.chatId)));
    }

    public void K1(TdApi.NetworkType networkType) {
        Iterator<l0> it = this.f28384i.iterator();
        while (it.hasNext()) {
            it.next().d3(networkType);
        }
    }

    public void K2(TdApi.StickerSet stickerSet) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().Y4(stickerSet);
        }
    }

    public void L1(boolean z10) {
        Iterator<sb> it = this.f28388m.iterator();
        while (it.hasNext()) {
            it.next().f3(z10);
        }
    }

    public void L2(TdApi.UpdateSuggestedActions updateSuggestedActions) {
        Iterator<sb> it = this.f28388m.iterator();
        while (it.hasNext()) {
            it.next().G2(updateSuggestedActions.addedActions, updateSuggestedActions.removedActions);
        }
    }

    public void M0(final e8 e8Var, final TdApi.Chat chat, final int i10, final o6.g gVar) {
        q(e8Var, new j() {
            @Override
            public final void a(Object obj) {
                s9.s(e8.this, chat, i10, gVar, (f0) obj);
            }
        });
    }

    public void M1(TdApi.UpdateFavoriteStickers updateFavoriteStickers) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().Z2(updateFavoriteStickers.stickerIds);
        }
    }

    public void M2(String str, TdApi.LanguagePackInfo languagePackInfo) {
        Iterator<sb> it = this.f28388m.iterator();
        while (it.hasNext()) {
            it.next().e(str, languagePackInfo);
        }
    }

    public final void N(TdApi.StickerSetInfo stickerSetInfo) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().Z(stickerSetInfo);
        }
    }

    public void N0(long j10, String str) {
        O0(j10, str, this.f28379d.iterator());
        O0(j10, str, this.f28398w.d(Long.valueOf(j10)));
    }

    public void N1(TdApi.UpdateFile updateFile) {
        Iterator<q0> d10 = this.f28400y.d(Integer.valueOf(updateFile.file.f19913id));
        if (d10 != null) {
            while (d10.hasNext()) {
                d10.next().h2(updateFile);
            }
        }
    }

    public void N2(boolean z10) {
        Iterator<sb> it = this.f28388m.iterator();
        while (it.hasNext()) {
            it.next().q7(z10);
        }
    }

    public final void O(TdApi.StickerSetInfo stickerSetInfo) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().y0(stickerSetInfo);
        }
    }

    public void O1(TdApi.UpdateFileAddedToDownloads updateFileAddedToDownloads) {
        Iterator<p0> it = this.f28394s.iterator();
        while (it.hasNext()) {
            it.next().b(updateFileAddedToDownloads.fileDownload, updateFileAddedToDownloads.counts);
        }
    }

    public void O2(TdApi.UpdateTrendingStickerSets updateTrendingStickerSets, int i10) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().M3(updateTrendingStickerSets.stickerSets, i10);
        }
    }

    public final void P(TdApi.StickerSetInfo stickerSetInfo) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().e6(stickerSetInfo);
        }
    }

    public void P0(TdApi.UpdateChatDefaultDisableNotification updateChatDefaultDisableNotification) {
        Iterator<h0> it = this.f28379d.iterator();
        while (it.hasNext()) {
            it.next().q2(updateChatDefaultDisableNotification.chatId, updateChatDefaultDisableNotification.defaultDisableNotification);
        }
        Iterator<h0> d10 = this.f28398w.d(Long.valueOf(updateChatDefaultDisableNotification.chatId));
        if (d10 != null) {
            while (d10.hasNext()) {
                d10.next().q2(updateChatDefaultDisableNotification.chatId, updateChatDefaultDisableNotification.defaultDisableNotification);
            }
        }
    }

    public void P1(TdApi.UpdateFileDownload updateFileDownload) {
        Iterator<p0> it = this.f28394s.iterator();
        while (it.hasNext()) {
            it.next().c(updateFileDownload.fileId, updateFileDownload.completeDate, updateFileDownload.isPaused, updateFileDownload.counts);
        }
    }

    public void P2(TdApi.UpdateUsersNearby updateUsersNearby) {
        Q2(updateUsersNearby.usersNearby, this.f28390o.iterator());
    }

    public void Q() {
        Iterator<j0> it = this.f28387l.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public void Q0(TdApi.UpdateChatMessageSender updateChatMessageSender) {
        Iterator<h0> it = this.f28379d.iterator();
        while (it.hasNext()) {
            it.next().a0(updateChatMessageSender.chatId, updateChatMessageSender.messageSenderId);
        }
        Iterator<h0> d10 = this.f28398w.d(Long.valueOf(updateChatMessageSender.chatId));
        if (d10 != null) {
            while (d10.hasNext()) {
                d10.next().a0(updateChatMessageSender.chatId, updateChatMessageSender.messageSenderId);
            }
        }
    }

    public void Q1(TdApi.UpdateFileDownloads updateFileDownloads) {
        Iterator<p0> it = this.f28394s.iterator();
        while (it.hasNext()) {
            it.next().d(updateFileDownloads.totalSize, updateFileDownloads.totalCount, updateFileDownloads.downloadedSize);
        }
    }

    public void R() {
        Iterator<j0> it = this.f28387l.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void R1(TdApi.UpdateFileRemovedFromDownloads updateFileRemovedFromDownloads) {
        Iterator<p0> it = this.f28394s.iterator();
        while (it.hasNext()) {
            it.next().a(updateFileRemovedFromDownloads.fileId, updateFileRemovedFromDownloads.counts);
        }
    }

    public void R2(boolean z10) {
        Iterator<sb> it = this.f28388m.iterator();
        while (it.hasNext()) {
            it.next().k4(z10);
        }
    }

    public void S(boolean z10) {
        Iterator<j0> it = this.f28387l.iterator();
        while (it.hasNext()) {
            it.next().b(z10);
        }
    }

    public void S0(TdApi.UpdateChatDraftMessage updateChatDraftMessage, List<o6.h> list) {
        R0(updateChatDraftMessage.chatId, updateChatDraftMessage.draftMessage, list, this.f28379d.iterator());
        long j10 = updateChatDraftMessage.chatId;
        R0(j10, updateChatDraftMessage.draftMessage, list, this.f28398w.d(Long.valueOf(j10)));
        if (list != null) {
            for (final o6.h hVar : list) {
                hVar.f28137a.G(hVar.f28138b, hVar.f28139c);
                q(hVar.f28137a, new j() {
                    @Override
                    public final void a(Object obj) {
                        s9.t(o6.h.this, (f0) obj);
                    }
                });
            }
        }
    }

    public void T(c cVar) {
        this.f28386k.remove(cVar);
    }

    public void T0(TdApi.UpdateChatFilters updateChatFilters) {
    }

    public void T1(TdApi.UpdateGroupCall updateGroupCall) {
        S1(updateGroupCall.groupCall, this.f28392q.iterator());
    }

    public void U(int i10, q0 q0Var) {
        this.f28400y.g(Integer.valueOf(i10), q0Var);
    }

    public void U0(TdApi.UpdateChatHasProtectedContent updateChatHasProtectedContent) {
        V0(updateChatHasProtectedContent, this.f28379d.iterator());
        V0(updateChatHasProtectedContent, this.f28398w.d(Long.valueOf(updateChatHasProtectedContent.chatId)));
    }

    public void V(sb sbVar) {
        this.f28388m.remove(sbVar);
    }

    public void V1(TdApi.UpdateGroupCallParticipant updateGroupCallParticipant) {
        U1(updateGroupCallParticipant.groupCallId, updateGroupCallParticipant.participant, this.f28392q.iterator());
    }

    public void W(long j10, k1 k1Var) {
        this.f28401z.g(Long.valueOf(j10), k1Var);
    }

    public void W0(TdApi.UpdateChatHasScheduledMessages updateChatHasScheduledMessages) {
        X0(updateChatHasScheduledMessages, this.f28379d.iterator());
        X0(updateChatHasScheduledMessages, this.f28398w.d(Long.valueOf(updateChatHasScheduledMessages.chatId)));
    }

    public void W1(TdApi.UpdateInstalledStickerSets updateInstalledStickerSets) {
        Iterator<q1> it = this.f28382g.iterator();
        while (it.hasNext()) {
            it.next().h(updateInstalledStickerSets.stickerSetIds, updateInstalledStickerSets.isMasks);
        }
    }

    public void X(n0 n0Var) {
        this.f28389n.remove(n0Var);
    }

    public void X1(TdApi.UpdateMessageContent updateMessageContent) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> list = map.get(updateMessageContent.chatId + "_" + updateMessageContent.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.content = updateMessageContent.newContent;
            }
        }
        Y1(updateMessageContent, this.f28377b.iterator());
        Y1(updateMessageContent, this.f28396u.d(Long.valueOf(updateMessageContent.chatId)));
    }

    public final void Y(long j10, TdApi.Message message) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> remove = map.remove(message.chatId + "_" + j10);
        if (!(remove == null || remove.isEmpty())) {
            Map<String, List<TdApi.Message>> map2 = this.A;
            map2.put(message.chatId + "_" + message.f19946id, remove);
            for (TdApi.Message message2 : remove) {
                e.t(message, message2);
            }
        }
    }

    public void Z(b bVar) {
        this.f28383h.add(bVar);
    }

    public void Z0(TdApi.UpdateChatIsBlocked updateChatIsBlocked) {
        Y0(updateChatIsBlocked.chatId, updateChatIsBlocked.isBlocked, this.f28379d.iterator());
        long j10 = updateChatIsBlocked.chatId;
        Y0(j10, updateChatIsBlocked.isBlocked, this.f28398w.d(Long.valueOf(j10)));
    }

    public void Z1(TdApi.UpdateMessageContentOpened updateMessageContentOpened) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> list = map.get(updateMessageContentOpened.chatId + "_" + updateMessageContentOpened.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                t2.i5(message);
            }
        }
        a2(updateMessageContentOpened, this.f28377b.iterator());
        a2(updateMessageContentOpened, this.f28396u.d(Long.valueOf(updateMessageContentOpened.chatId)));
    }

    public void a0(Object obj) {
        synchronized (this) {
            if (obj instanceof h1) {
                this.f28377b.add((h1) obj);
            }
            if (obj instanceof f1) {
                this.f28378c.add((f1) obj);
            }
            if (obj instanceof h0) {
                this.f28379d.add((h0) obj);
            }
            if (obj instanceof j1) {
                this.f28381f.add((j1) obj);
            }
            if (obj instanceof q1) {
                this.f28382g.add((q1) obj);
            }
            if (obj instanceof b) {
                this.f28383h.add((b) obj);
            }
            if (obj instanceof l0) {
                this.f28384i.add((l0) obj);
            }
            if (obj instanceof o0) {
                this.f28385j.add((o0) obj);
            }
            if (obj instanceof sb) {
                this.f28388m.add((sb) obj);
            }
            if (obj instanceof n0) {
                this.f28389n.add((n0) obj);
            }
            if (obj instanceof i0) {
                this.f28390o.add((i0) obj);
            }
            if (obj instanceof a) {
                this.f28395t.add((a) obj);
            }
            if (obj instanceof m1) {
                this.f28391p.add((m1) obj);
            }
            if (obj instanceof a0) {
                this.f28392q.add((a0) obj);
            }
            if (obj instanceof o1) {
                this.f28393r.add((o1) obj);
            }
        }
    }

    public void b0(a aVar) {
        this.f28395t.add(aVar);
    }

    public void b1(TdApi.UpdateChatIsMarkedAsUnread updateChatIsMarkedAsUnread) {
        a1(updateChatIsMarkedAsUnread.chatId, updateChatIsMarkedAsUnread.isMarkedAsUnread, this.f28379d.iterator());
        long j10 = updateChatIsMarkedAsUnread.chatId;
        a1(j10, updateChatIsMarkedAsUnread.isMarkedAsUnread, this.f28398w.d(Long.valueOf(j10)));
    }

    public void b2(TdApi.UpdateMessageEdited updateMessageEdited) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> list = map.get(updateMessageEdited.chatId + "_" + updateMessageEdited.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.editDate = updateMessageEdited.editDate;
                message.replyMarkup = updateMessageEdited.replyMarkup;
            }
        }
        c2(updateMessageEdited, this.f28377b.iterator());
        c2(updateMessageEdited, this.f28396u.d(Long.valueOf(updateMessageEdited.chatId)));
    }

    public void c0(TdApi.ChatList chatList, f0 f0Var) {
        this.f28380e.b(t2.o4(chatList), f0Var);
    }

    public void d0(long j10, h0 h0Var) {
        this.f28398w.b(Long.valueOf(j10), h0Var);
    }

    public void d1(TdApi.UpdateChatLastMessage updateChatLastMessage, List<o6.h> list) {
        c1(updateChatLastMessage.chatId, updateChatLastMessage.lastMessage, list, this.f28379d.iterator());
        long j10 = updateChatLastMessage.chatId;
        c1(j10, updateChatLastMessage.lastMessage, list, this.f28398w.d(Long.valueOf(j10)));
        if (list != null) {
            for (final o6.h hVar : list) {
                hVar.f28137a.G(hVar.f28138b, hVar.f28139c);
                q(hVar.f28137a, new j() {
                    @Override
                    public final void a(Object obj) {
                        s9.u(o6.h.this, (f0) obj);
                    }
                });
            }
        }
    }

    public void d2(TdApi.UpdateMessageInteractionInfo updateMessageInteractionInfo) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> list = map.get(updateMessageInteractionInfo.chatId + "_" + updateMessageInteractionInfo.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.interactionInfo = updateMessageInteractionInfo.interactionInfo;
            }
        }
        e2(updateMessageInteractionInfo, this.f28377b.iterator());
        e2(updateMessageInteractionInfo, this.f28396u.d(Long.valueOf(updateMessageInteractionInfo.chatId)));
    }

    public void e0(l0 l0Var) {
        this.f28384i.add(l0Var);
    }

    public void e1(final e8 e8Var, final int i10, final int i11) {
        q(e8Var, new j() {
            @Override
            public final void a(Object obj) {
                ((f0) obj).i5(e8.this, i10, i11);
            }
        });
    }

    public void f0(long j10, f1 f1Var) {
        this.f28397v.b(Long.valueOf(j10), f1Var);
    }

    public void f2(TdApi.UpdateMessageIsPinned updateMessageIsPinned) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> list = map.get(updateMessageIsPinned.chatId + "_" + updateMessageIsPinned.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.isPinned = updateMessageIsPinned.isPinned;
            }
        }
        g2(updateMessageIsPinned, this.f28377b.iterator());
        g2(updateMessageIsPinned, this.f28396u.d(Long.valueOf(updateMessageIsPinned.chatId)));
    }

    public void g0(long j10, h1 h1Var) {
        this.f28396u.b(Long.valueOf(j10), h1Var);
    }

    public void g1(TdApi.UpdateChatMessageTtl updateChatMessageTtl) {
        f1(updateChatMessageTtl.chatId, updateChatMessageTtl.messageTtl, this.f28379d.iterator());
        long j10 = updateChatMessageTtl.chatId;
        f1(j10, updateChatMessageTtl.messageTtl, this.f28398w.d(Long.valueOf(j10)));
    }

    public void h0(m1 m1Var) {
        this.f28391p.add(m1Var);
    }

    public void h1(final e8 e8Var, final TdApi.Chat chat, final int i10, final int i11, final o6.g gVar) {
        q(e8Var, new j() {
            @Override
            public final void a(Object obj) {
                s9.w(e8.this, chat, i10, i11, gVar, (f0) obj);
            }
        });
    }

    public void h2(TdApi.UpdateMessageLiveLocationViewed updateMessageLiveLocationViewed) {
        i2(updateMessageLiveLocationViewed, this.f28377b.iterator());
        i2(updateMessageLiveLocationViewed, this.f28396u.d(Long.valueOf(updateMessageLiveLocationViewed.chatId)));
    }

    public void i0(o1 o1Var) {
        this.f28393r.add(o1Var);
    }

    public void j0(long j10, j1 j1Var) {
        this.f28399x.b(Long.valueOf(j10), j1Var);
    }

    public void j1(TdApi.UpdateChatOnlineMemberCount updateChatOnlineMemberCount) {
        i1(updateChatOnlineMemberCount.chatId, updateChatOnlineMemberCount.onlineMemberCount, this.f28379d.iterator());
        long j10 = updateChatOnlineMemberCount.chatId;
        i1(j10, updateChatOnlineMemberCount.onlineMemberCount, this.f28398w.d(Long.valueOf(j10)));
    }

    public void k(c cVar) {
        this.f28386k.add(cVar);
    }

    public void k0(j1 j1Var) {
        this.f28381f.add(j1Var);
    }

    public void k2(TdApi.UpdateMessageMentionRead updateMessageMentionRead, boolean z10, boolean z11) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> list = map.get(updateMessageMentionRead.chatId + "_" + updateMessageMentionRead.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.containsUnreadMention = false;
            }
        }
        j2(updateMessageMentionRead, this.f28377b.iterator());
        j2(updateMessageMentionRead, this.f28396u.d(Long.valueOf(updateMessageMentionRead.chatId)));
        if (z10) {
            D1(updateMessageMentionRead.chatId, updateMessageMentionRead.unreadMentionCount, z11, this.f28379d.iterator());
            long j10 = updateMessageMentionRead.chatId;
            D1(j10, updateMessageMentionRead.unreadMentionCount, z11, this.f28398w.d(Long.valueOf(j10)));
        }
    }

    public void l(j0 j0Var) {
        this.f28387l.add(j0Var);
        if (!this.f28376a.K6() || !this.f28376a.V6()) {
            if (this.f28376a.y7()) {
                j0Var.c();
            }
        } else if (this.f28376a.r7()) {
            j0Var.b(false);
        }
    }

    public void l0(q1 q1Var) {
        this.f28382g.add(q1Var);
    }

    public void l1(TdApi.UpdateChatPendingJoinRequests updateChatPendingJoinRequests) {
        k1(updateChatPendingJoinRequests.chatId, updateChatPendingJoinRequests.pendingJoinRequests, this.f28379d.iterator());
        long j10 = updateChatPendingJoinRequests.chatId;
        k1(j10, updateChatPendingJoinRequests.pendingJoinRequests, this.f28398w.d(Long.valueOf(j10)));
    }

    public void l2(long j10, long j11) {
        m2(j10, j11, this.f28378c.iterator());
        m2(j10, j11, this.f28397v.d(Long.valueOf(j10)));
    }

    public void m(int i10, q0 q0Var) {
        this.f28400y.b(Integer.valueOf(i10), q0Var);
    }

    public void m0(TdApi.Message message) {
        String str = message.chatId + "_" + message.f19946id;
        List<TdApi.Message> list = this.A.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.A.put(str, list);
        }
        list.add(message);
    }

    public void n(sb sbVar) {
        this.f28388m.add(sbVar);
    }

    public void n0(a aVar) {
        this.f28395t.remove(aVar);
    }

    public void n1(TdApi.UpdateChatPermissions updateChatPermissions) {
        m1(updateChatPermissions.chatId, updateChatPermissions.permissions, this.f28379d.iterator());
        long j10 = updateChatPermissions.chatId;
        m1(j10, updateChatPermissions.permissions, this.f28398w.d(Long.valueOf(j10)));
    }

    public void n2(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged) {
        o2(updateMessageSendAcknowledged, this.f28377b.iterator());
        o2(updateMessageSendAcknowledged, this.f28396u.d(Long.valueOf(updateMessageSendAcknowledged.chatId)));
    }

    public void o(long j10, k1 k1Var) {
        this.f28401z.b(Long.valueOf(j10), k1Var);
    }

    public void o0(Object obj) {
        synchronized (this) {
            if (obj instanceof h1) {
                this.f28377b.remove((h1) obj);
            }
            if (obj instanceof f1) {
                this.f28378c.remove((f1) obj);
            }
            if (obj instanceof h0) {
                this.f28379d.remove((h0) obj);
            }
            if (obj instanceof j1) {
                this.f28381f.remove((j1) obj);
            }
            if (obj instanceof q1) {
                this.f28382g.remove((q1) obj);
            }
            if (obj instanceof q1) {
                this.f28383h.remove((b) obj);
            }
            if (obj instanceof l0) {
                this.f28384i.remove((l0) obj);
            }
            if (obj instanceof o0) {
                this.f28385j.remove((o0) obj);
            }
            if (obj instanceof sb) {
                this.f28388m.remove((sb) obj);
            }
            if (obj instanceof n0) {
                this.f28389n.remove((n0) obj);
            }
            if (obj instanceof i0) {
                this.f28390o.remove((i0) obj);
            }
            if (obj instanceof a) {
                this.f28395t.remove((a) obj);
            }
            if (obj instanceof m1) {
                this.f28391p.remove((m1) obj);
            }
            if (obj instanceof a0) {
                this.f28392q.remove((a0) obj);
            }
            if (obj instanceof o1) {
                this.f28393r.remove((o1) obj);
            }
        }
    }

    public void o1(TdApi.UpdateChatPhoto updateChatPhoto) {
        p1(updateChatPhoto, this.f28379d.iterator());
        p1(updateChatPhoto, this.f28398w.d(Long.valueOf(updateChatPhoto.chatId)));
    }

    public void p(n0 n0Var) {
        this.f28389n.add(n0Var);
    }

    public void p0(TdApi.ChatList chatList, f0 f0Var) {
        this.f28380e.g(t2.o4(chatList), f0Var);
    }

    public void p2(TdApi.UpdateMessageSendFailed updateMessageSendFailed) {
        Y(updateMessageSendFailed.oldMessageId, updateMessageSendFailed.message);
        q2(updateMessageSendFailed, this.f28377b.iterator());
        q2(updateMessageSendFailed, this.f28396u.d(Long.valueOf(updateMessageSendFailed.message.chatId)));
    }

    public final void q(e8 e8Var, j<f0> jVar) {
        Iterator<f0> d10 = this.f28380e.d(t2.o4(e8Var.j()));
        if (d10 != null) {
            while (d10.hasNext()) {
                jVar.a(d10.next());
            }
        }
    }

    public void q0(long j10, h0 h0Var) {
        this.f28398w.g(Long.valueOf(j10), h0Var);
    }

    public void r0(l0 l0Var) {
        this.f28384i.remove(l0Var);
    }

    public void r1(TdApi.UpdateChatPosition updateChatPosition, o6.h hVar) {
        boolean b10 = hVar.f28139c.b();
        boolean d10 = hVar.f28139c.d();
        boolean c10 = hVar.f28139c.c();
        q1(updateChatPosition.chatId, updateChatPosition.position, b10, d10, c10, this.f28379d.iterator());
        long j10 = updateChatPosition.chatId;
        q1(j10, updateChatPosition.position, b10, d10, c10, this.f28398w.d(Long.valueOf(j10)));
        hVar.f28137a.G(hVar.f28138b, hVar.f28139c);
    }

    public void r2(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        Y(updateMessageSendSucceeded.oldMessageId, updateMessageSendSucceeded.message);
        s2(updateMessageSendSucceeded, this.f28377b.iterator());
        s2(updateMessageSendSucceeded, this.f28396u.d(Long.valueOf(updateMessageSendSucceeded.message.chatId)));
    }

    public void s0(long j10, f1 f1Var) {
        this.f28397v.g(Long.valueOf(j10), f1Var);
    }

    public void t0(long j10, h1 h1Var) {
        this.f28396u.g(Long.valueOf(j10), h1Var);
    }

    public void t1(TdApi.UpdateChatReadInbox updateChatReadInbox, final boolean z10, final TdApi.Chat chat, e8[] e8VarArr) {
        s1(updateChatReadInbox, z10, this.f28379d.iterator());
        s1(updateChatReadInbox, z10, this.f28398w.d(Long.valueOf(updateChatReadInbox.chatId)));
        if (e8VarArr != null) {
            for (final e8 e8Var : e8VarArr) {
                q(e8Var, new j() {
                    @Override
                    public final void a(Object obj) {
                        s9.x(e8.this, chat, z10, (f0) obj);
                    }
                });
            }
        }
    }

    public void t2(TdApi.UpdateMessageUnreadReactions updateMessageUnreadReactions) {
        Map<String, List<TdApi.Message>> map = this.A;
        List<TdApi.Message> list = map.get(updateMessageUnreadReactions.chatId + "_" + updateMessageUnreadReactions.messageId);
        if (list != null) {
            for (TdApi.Message message : list) {
                message.unreadReactions = updateMessageUnreadReactions.unreadReactions;
            }
        }
        u2(updateMessageUnreadReactions, this.f28377b.iterator());
        u2(updateMessageUnreadReactions, this.f28396u.d(Long.valueOf(updateMessageUnreadReactions.chatId)));
    }

    public void u0(m1 m1Var) {
        this.f28391p.remove(m1Var);
    }

    public void u1(TdApi.UpdateChatReadOutbox updateChatReadOutbox) {
        v1(updateChatReadOutbox, this.f28379d.iterator());
        v1(updateChatReadOutbox, this.f28398w.d(Long.valueOf(updateChatReadOutbox.chatId)));
    }

    public void v0(o1 o1Var) {
        this.f28393r.remove(o1Var);
    }

    public void v2(TdApi.UpdateDeleteMessages updateDeleteMessages) {
        w2(updateDeleteMessages, this.f28377b.iterator());
        w2(updateDeleteMessages, this.f28396u.d(Long.valueOf(updateDeleteMessages.chatId)));
    }

    public void w0(long j10, j1 j1Var) {
        this.f28399x.g(Long.valueOf(j10), j1Var);
    }

    public void w1(final e8 e8Var, final TdApi.Chat chat, final int i10, final o6.g gVar) {
        q(e8Var, new j() {
            @Override
            public final void a(Object obj) {
                s9.y(e8.this, chat, i10, gVar, (f0) obj);
            }
        });
    }

    public void x0(j1 j1Var) {
        this.f28381f.remove(j1Var);
    }

    public void x1(TdApi.UpdateChatReplyMarkup updateChatReplyMarkup) {
        y1(updateChatReplyMarkup, this.f28379d.iterator());
        y1(updateChatReplyMarkup, this.f28398w.d(Long.valueOf(updateChatReplyMarkup.chatId)));
    }

    public void y0(q1 q1Var) {
        this.f28382g.remove(q1Var);
    }

    public void y2(TdApi.UpdateNewCallSignalingData updateNewCallSignalingData) {
        x2(updateNewCallSignalingData.callId, updateNewCallSignalingData.data, this.f28392q.iterator());
    }

    public void z0(TdApi.Message message) {
        String str = message.chatId + "_" + message.f19946id;
        List<TdApi.Message> list = this.A.get(str);
        if (list != null && list.remove(message) && list.isEmpty()) {
            this.A.remove(str);
        }
    }

    public void z2(TdApi.UpdateNewMessage updateNewMessage) {
        A2(updateNewMessage, this.f28377b.iterator());
        A2(updateNewMessage, this.f28396u.d(Long.valueOf(updateNewMessage.message.chatId)));
    }
}
