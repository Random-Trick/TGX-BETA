package ob;

import android.graphics.Path;
import java.util.List;
import org.drinkless.td.libcore.telegram.TdApi;

public final class e {
    public static final boolean A(TdApi.BackgroundType backgroundType, TdApi.BackgroundType backgroundType2, boolean z10) {
        return j.d(backgroundType, backgroundType2, z10);
    }

    public static final boolean B(TdApi.ChatAction chatAction, TdApi.ChatAction chatAction2) {
        return j.e(chatAction, chatAction2);
    }

    public static final boolean C(TdApi.ChatAdministratorRights chatAdministratorRights, TdApi.ChatAdministratorRights chatAdministratorRights2) {
        return j.f(chatAdministratorRights, chatAdministratorRights2);
    }

    public static final TdApi.PhotoSize C0(TdApi.Photo photo) {
        return l.h(photo);
    }

    public static final boolean D(TdApi.ChatEventLogFilters chatEventLogFilters, TdApi.ChatEventLogFilters chatEventLogFilters2) {
        return j.g(chatEventLogFilters, chatEventLogFilters2);
    }

    public static final TdApi.PhotoSize D0(TdApi.PhotoSize[] photoSizeArr) {
        return l.i(photoSizeArr);
    }

    public static final boolean E(TdApi.ChatList chatList, TdApi.ChatList chatList2) {
        return j.h(chatList, chatList2);
    }

    public static final TdApi.TextEntity[] E0(String str) {
        return l.j(str);
    }

    public static final boolean F(TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2) {
        return j.i(chatMemberStatus, chatMemberStatus2);
    }

    public static final TdApi.TextEntity[] F0(TdApi.TextEntity[] textEntityArr) {
        return l.k(textEntityArr);
    }

    public static final boolean G(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2) {
        return j.j(chatPermissions, chatPermissions2);
    }

    public static final TdApi.RichText G0(TdApi.PageBlock pageBlock, String str) {
        return l.l(pageBlock, str);
    }

    public static final boolean H(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2, TdApi.ChatPermissions chatPermissions3) {
        return j.k(chatPermissions, chatPermissions2, chatPermissions3);
    }

    public static final TdApi.RichText H0(TdApi.RichText richText, String str) {
        return l.m(richText, str);
    }

    public static final boolean I(TdApi.ChatSource chatSource, TdApi.ChatSource chatSource2) {
        return j.l(chatSource, chatSource2);
    }

    public static final TdApi.RichText I0(TdApi.WebPageInstantView webPageInstantView, String str) {
        return l.n(webPageInstantView, str);
    }

    public static final boolean J(TdApi.ClosedVectorPath closedVectorPath, TdApi.ClosedVectorPath closedVectorPath2) {
        return j.m(closedVectorPath, closedVectorPath2);
    }

    public static final TdApi.PhotoSize J0(TdApi.Photo photo) {
        return l.o(photo);
    }

    public static final boolean K(TdApi.Document document, TdApi.Document document2) {
        return j.n(document, document2);
    }

    public static final TdApi.PhotoSize K0(TdApi.PhotoSize[] photoSizeArr) {
        return l.p(photoSizeArr);
    }

    public static final boolean L(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2) {
        return j.o(draftMessage, draftMessage2);
    }

    public static final String L0(TdApi.FormattedText formattedText, String str, boolean z10) {
        return l.q(formattedText, str, z10);
    }

    public static final boolean M(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2, boolean z10) {
        return j.p(draftMessage, draftMessage2, z10);
    }

    public static final String M0(TdApi.ChatMemberStatus chatMemberStatus) {
        return l.r(chatMemberStatus);
    }

    public static final boolean N(TdApi.File file, TdApi.File file2, boolean z10) {
        return j.q(file, file2, z10);
    }

    public static final int N0(TdApi.File file) {
        return l.s(file);
    }

    public static final boolean O(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2) {
        return j.r(formattedText, formattedText2);
    }

    public static final long O0(TdApi.Message message) {
        return l.t(message);
    }

    public static final boolean P(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2, boolean z10) {
        return j.s(formattedText, formattedText2, z10);
    }

    public static final long P0(TdApi.Message message, boolean z10) {
        return l.u(message, z10);
    }

    public static final boolean Q(TdApi.InlineKeyboardButton inlineKeyboardButton, TdApi.InlineKeyboardButton inlineKeyboardButton2) {
        return j.t(inlineKeyboardButton, inlineKeyboardButton2);
    }

    public static final boolean R(TdApi.InlineKeyboardButtonType inlineKeyboardButtonType, TdApi.InlineKeyboardButtonType inlineKeyboardButtonType2) {
        return j.u(inlineKeyboardButtonType, inlineKeyboardButtonType2);
    }

    public static final long R0(TdApi.Message message) {
        return l.w(message);
    }

    public static final boolean S(TdApi.InputMessageContent inputMessageContent, TdApi.InputMessageContent inputMessageContent2) {
        return j.v(inputMessageContent, inputMessageContent2);
    }

    public static final long S0(TdApi.MessageSender messageSender) {
        return l.x(messageSender);
    }

    public static final boolean T(TdApi.KeyboardButton keyboardButton, TdApi.KeyboardButton keyboardButton2) {
        return j.w(keyboardButton, keyboardButton2);
    }

    public static final long T0(TdApi.Message message) {
        return l.y(message);
    }

    public static final boolean U(TdApi.KeyboardButtonType keyboardButtonType, TdApi.KeyboardButtonType keyboardButtonType2) {
        return j.x(keyboardButtonType, keyboardButtonType2);
    }

    public static final long U0(TdApi.MessageSender messageSender) {
        return l.z(messageSender);
    }

    public static final boolean V(TdApi.LocalFile localFile, TdApi.LocalFile localFile2) {
        return j.y(localFile, localFile2);
    }

    public static final String V0(TdApi.FormattedText formattedText) {
        return l.A(formattedText);
    }

    public static final boolean W(TdApi.MaskPoint maskPoint, TdApi.MaskPoint maskPoint2) {
        return j.z(maskPoint, maskPoint2);
    }

    public static final boolean W0(TdApi.FormattedText formattedText) {
        return l.B(formattedText);
    }

    public static final boolean X(TdApi.MaskPosition maskPosition, TdApi.MaskPosition maskPosition2) {
        return j.A(maskPosition, maskPosition2);
    }

    public static final boolean X0(TdApi.StickerType stickerType) {
        return l.C(stickerType);
    }

    public static final boolean Y(TdApi.MessageSender messageSender, TdApi.MessageSender messageSender2) {
        return j.B(messageSender, messageSender2);
    }

    public static final boolean Y0(TdApi.ChatMemberStatus chatMemberStatus) {
        return l.D(chatMemberStatus);
    }

    public static final boolean Z(TdApi.Minithumbnail minithumbnail, TdApi.Minithumbnail minithumbnail2, boolean z10) {
        return j.C(minithumbnail, minithumbnail2, z10);
    }

    public static final boolean Z0(TdApi.LanguagePackInfo languagePackInfo) {
        return l.E(languagePackInfo);
    }

    public static final void a(TdApi.FormattedText formattedText) {
        l.a(formattedText);
    }

    public static final boolean a0(TdApi.Photo photo, TdApi.Photo photo2) {
        return j.D(photo, photo2);
    }

    public static final boolean a1(TdApi.InlineKeyboardButtonTypeCallbackWithPassword inlineKeyboardButtonTypeCallbackWithPassword) {
        return l.F(inlineKeyboardButtonTypeCallbackWithPassword);
    }

    public static final Path b(TdApi.ClosedVectorPath[] closedVectorPathArr, float f10) {
        return l.b(closedVectorPathArr, f10);
    }

    public static final boolean b0(TdApi.PhotoSize photoSize, TdApi.PhotoSize photoSize2) {
        return j.E(photoSize, photoSize2);
    }

    public static final boolean b1(TdApi.DraftMessage draftMessage) {
        return i.a(draftMessage);
    }

    public static final Path c(TdApi.ClosedVectorPath[] closedVectorPathArr, float f10, Path path) {
        return l.c(closedVectorPathArr, f10, path);
    }

    public static final boolean c0(TdApi.Point point, TdApi.Point point2) {
        return j.F(point, point2);
    }

    public static final boolean c1(TdApi.FormattedText formattedText) {
        return i.b(formattedText);
    }

    public static final boolean d0(TdApi.RemoteFile remoteFile, TdApi.RemoteFile remoteFile2) {
        return j.G(remoteFile, remoteFile2);
    }

    public static final boolean d1(TdApi.RichText richText) {
        return i.c(richText);
    }

    public static final TdApi.FormattedText e(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2) {
        return l.e(formattedText, formattedText2);
    }

    public static final boolean e0(TdApi.ReplyMarkup replyMarkup, TdApi.ReplyMarkup replyMarkup2) {
        return j.H(replyMarkup, replyMarkup2);
    }

    public static final boolean e1(TdApi.StatisticalValue statisticalValue) {
        return i.d(statisticalValue);
    }

    public static final TdApi.FormattedText f(TdApi.FormattedText... formattedTextArr) {
        return l.f(formattedTextArr);
    }

    public static final boolean f0(TdApi.Sticker sticker, TdApi.Sticker sticker2) {
        return j.I(sticker, sticker2);
    }

    public static final boolean f1(TdApi.TextEntityType textEntityType) {
        return l.G(textEntityType);
    }

    public static final TdApi.ChatAction g(int i10) {
        return g.a(i10);
    }

    public static final boolean g0(TdApi.StickerType stickerType, TdApi.StickerType stickerType2) {
        return j.J(stickerType, stickerType2);
    }

    public static final boolean g1(TdApi.LanguagePackInfo languagePackInfo) {
        return l.H(languagePackInfo);
    }

    public static final TdApi.NotificationSettingsScope h(int i10) {
        return g.b(i10);
    }

    public static final boolean h0(TdApi.TextEntity textEntity, TdApi.TextEntity textEntity2) {
        return j.K(textEntity, textEntity2);
    }

    public static final boolean h1(TdApi.LanguagePackInfo languagePackInfo) {
        return l.I(languagePackInfo);
    }

    public static final TdApi.SearchMessagesFilter i(int i10) {
        return g.c(i10);
    }

    public static final boolean i0(TdApi.TextEntityType textEntityType, TdApi.TextEntityType textEntityType2) {
        return j.L(textEntityType, textEntityType2);
    }

    public static final boolean i1(TdApi.MessageContent messageContent) {
        return l.J(messageContent);
    }

    public static final TdApi.Chat j(TdApi.Chat chat) {
        return h.a(chat);
    }

    public static final boolean j0(TdApi.Thumbnail thumbnail, TdApi.Thumbnail thumbnail2) {
        return j.M(thumbnail, thumbnail2);
    }

    public static final boolean j1(TdApi.ChatInviteLink chatInviteLink) {
        return l.K(chatInviteLink);
    }

    public static final TdApi.ChatAdministratorRights k(TdApi.ChatAdministratorRights chatAdministratorRights) {
        return h.b(chatAdministratorRights);
    }

    public static final boolean k0(TdApi.ThumbnailFormat thumbnailFormat, TdApi.ThumbnailFormat thumbnailFormat2) {
        return j.N(thumbnailFormat, thumbnailFormat2);
    }

    public static final boolean k1(TdApi.Message message, TdApi.SearchMessagesFilter searchMessagesFilter) {
        return l.L(message, searchMessagesFilter);
    }

    public static final TdApi.ChatMemberStatus l(TdApi.ChatMemberStatus chatMemberStatus) {
        return h.c(chatMemberStatus);
    }

    public static final boolean l0(TdApi.UserPrivacySettingRule userPrivacySettingRule, TdApi.UserPrivacySettingRule userPrivacySettingRule2) {
        return j.O(userPrivacySettingRule, userPrivacySettingRule2);
    }

    public static final boolean l1(TdApi.ChatType chatType, TdApi.NotificationSettingsScope notificationSettingsScope) {
        return l.M(chatType, notificationSettingsScope);
    }

    public static final TdApi.ChatPermissions m(TdApi.ChatPermissions chatPermissions) {
        return h.d(chatPermissions);
    }

    public static final boolean m0(TdApi.UserStatus userStatus, TdApi.UserStatus userStatus2) {
        return j.P(userStatus, userStatus2);
    }

    public static final boolean m1(TdApi.FormattedText formattedText) {
        return l.N(formattedText);
    }

    public static final TdApi.File n(TdApi.File file) {
        return h.e(file);
    }

    public static final boolean n0(TdApi.VectorPathCommand vectorPathCommand, TdApi.VectorPathCommand vectorPathCommand2) {
        return j.Q(vectorPathCommand, vectorPathCommand2);
    }

    public static final void n1(List<TdApi.TextEntity> list) {
        k.a(list);
    }

    public static final TdApi.LocalFile o(TdApi.LocalFile localFile) {
        return h.f(localFile);
    }

    public static final boolean o0(TdApi.Video video, TdApi.Video video2) {
        return j.R(video, video2);
    }

    public static final void o1(List<TdApi.Chat> list, TdApi.ChatList chatList) {
        k.b(list, chatList);
    }

    public static final TdApi.Message p(TdApi.Message message) {
        return h.g(message);
    }

    public static final boolean p0(TdApi.VideoNote videoNote, TdApi.VideoNote videoNote2) {
        return j.S(videoNote, videoNote2);
    }

    public static final void p1(TdApi.Chat[] chatArr, TdApi.ChatList chatList) {
        k.c(chatArr, chatList);
    }

    public static final TdApi.RemoteFile q(TdApi.RemoteFile remoteFile) {
        return h.h(remoteFile);
    }

    public static final boolean q0(TdApi.VoiceNote voiceNote, TdApi.VoiceNote voiceNote2, boolean z10) {
        return j.T(voiceNote, voiceNote2, z10);
    }

    public static final void q1(TdApi.LanguagePackInfo[] languagePackInfoArr, String str) {
        k.d(languagePackInfoArr, str);
    }

    public static final void r(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2) {
        h.i(chatPermissions, chatPermissions2);
    }

    public static final boolean r0(TdApi.WebPage webPage, TdApi.WebPage webPage2) {
        return j.U(webPage, webPage2);
    }

    public static final void r1(TdApi.Session[] sessionArr) {
        k.e(sessionArr);
    }

    public static final void s(TdApi.ChatPosition chatPosition, TdApi.ChatPosition chatPosition2) {
        h.j(chatPosition, chatPosition2);
    }

    public static final boolean s0(TdApi.ClosedVectorPath[] closedVectorPathArr, TdApi.ClosedVectorPath[] closedVectorPathArr2) {
        return j.V(closedVectorPathArr, closedVectorPathArr2);
    }

    public static final void s1(TdApi.TextEntity[] textEntityArr) {
        k.f(textEntityArr);
    }

    public static final void t(TdApi.Message message, TdApi.Message message2) {
        h.k(message, message2);
    }

    public static final boolean t0(TdApi.PhotoSize[] photoSizeArr, TdApi.PhotoSize[] photoSizeArr2) {
        return j.W(photoSizeArr, photoSizeArr2);
    }

    public static final List<TdApi.Message> t1(List<TdApi.Message> list) {
        return k.g(list);
    }

    public static final void u(TdApi.User user, TdApi.User user2) {
        h.l(user, user2);
    }

    public static final boolean u0(TdApi.TextEntity[] textEntityArr, TdApi.TextEntity[] textEntityArr2, boolean z10) {
        return j.X(textEntityArr, textEntityArr2, z10);
    }

    public static final String u1(String str, TdApi.TextEntity textEntity) {
        return l.O(str, textEntity);
    }

    public static final boolean v(TdApi.File file, TdApi.File file2) {
        return h.m(file, file2);
    }

    public static final boolean v0(TdApi.VectorPathCommand[] vectorPathCommandArr, TdApi.VectorPathCommand[] vectorPathCommandArr2) {
        return j.Y(vectorPathCommandArr, vectorPathCommandArr2);
    }

    public static final TdApi.FormattedText v1(TdApi.FormattedText formattedText, int i10) {
        return l.P(formattedText, i10);
    }

    public static final int w(TdApi.ChatPermissions chatPermissions) {
        return l.g(chatPermissions);
    }

    public static final TdApi.FormattedText w1(TdApi.FormattedText formattedText, int i10, int i11) {
        return l.Q(formattedText, i10, i11);
    }

    public static final boolean x(TdApi.Animation animation, TdApi.Animation animation2) {
        return j.a(animation, animation2);
    }

    public static final boolean y(TdApi.Audio audio, TdApi.Audio audio2) {
        return j.b(audio, audio2);
    }

    public static final TdApi.FormattedText y1(TdApi.MessageContent messageContent) {
        return l.S(messageContent);
    }

    public static final boolean z(TdApi.BackgroundFill backgroundFill, TdApi.BackgroundFill backgroundFill2) {
        return j.c(backgroundFill, backgroundFill2);
    }

    public static final TdApi.FormattedText z1(TdApi.FormattedText formattedText) {
        return l.T(formattedText);
    }
}
