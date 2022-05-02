package p193nb;

import java.util.Arrays;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p107ha.C5047g;
import p108hb.C5070i;
import qa.C8298k;

public final class C7326j {
    public static final boolean m16872A(TdApi.MessageSender messageSender, TdApi.MessageSender messageSender2) {
        if (messageSender != messageSender2) {
            if (messageSender == null || messageSender2 == null || messageSender.getConstructor() != messageSender2.getConstructor()) {
                return false;
            }
            int constructor = messageSender.getConstructor();
            if (constructor != -336109341) {
                if (constructor != -239660751) {
                    String object = messageSender.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
                } else if (((TdApi.MessageSenderChat) messageSender).chatId != ((TdApi.MessageSenderChat) messageSender2).chatId) {
                    return false;
                }
            } else if (((TdApi.MessageSenderUser) messageSender).userId != ((TdApi.MessageSenderUser) messageSender2).userId) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16871B(TdApi.Minithumbnail minithumbnail, TdApi.Minithumbnail minithumbnail2, boolean z) {
        if (minithumbnail != minithumbnail2) {
            if (minithumbnail == null || minithumbnail2 == null || minithumbnail.width != minithumbnail2.width || minithumbnail.height != minithumbnail2.height) {
                return false;
            }
            if (z && !Arrays.equals(minithumbnail.data, minithumbnail2.data)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16870C(TdApi.Photo photo, TdApi.Photo photo2) {
        boolean b0;
        if (photo == photo2) {
            return true;
        }
        if (!(photo == null || photo2 == null || photo.hasStickers != photo2.hasStickers)) {
            b0 = m16843b0(photo.minithumbnail, photo2.minithumbnail, false, 2, null);
            if (b0 && C7321e.m16915r0(photo.sizes, photo2.sizes)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m16869D(TdApi.PhotoSize photoSize, TdApi.PhotoSize photoSize2) {
        boolean Z;
        if (photoSize == photoSize2) {
            return true;
        }
        if (photoSize != null && photoSize2 != null && photoSize.width == photoSize2.width && photoSize.height == photoSize2.height && C8298k.m12936b(photoSize.type, photoSize2.type)) {
            Z = m16847Z(photoSize.photo, photoSize2.photo, false, 2, null);
            if (Z) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m16868E(TdApi.Point point, TdApi.Point point2) {
        if (point != point2) {
            Double d = null;
            if (C8298k.m12937a(point == null ? null : Double.valueOf(point.f25414x), point2 == null ? null : Double.valueOf(point2.f25414x))) {
                Double valueOf = point == null ? null : Double.valueOf(point.f25415y);
                if (point2 != null) {
                    d = Double.valueOf(point2.f25415y);
                }
                if (C8298k.m12937a(valueOf, d)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean m16867F(TdApi.RemoteFile remoteFile, TdApi.RemoteFile remoteFile2) {
        return remoteFile == remoteFile2 || (remoteFile != null && remoteFile2 != null && remoteFile.uploadedSize == remoteFile2.uploadedSize && remoteFile.isUploadingActive == remoteFile2.isUploadingActive && remoteFile.isUploadingCompleted == remoteFile2.isUploadingCompleted && C5070i.m24068c(remoteFile.f25420id, remoteFile2.f25420id) && C5070i.m24068c(remoteFile.uniqueId, remoteFile2.uniqueId));
    }

    public static final boolean m16866G(TdApi.ReplyMarkup replyMarkup, TdApi.ReplyMarkup replyMarkup2) {
        if (replyMarkup == replyMarkup2) {
            return true;
        }
        if (!(replyMarkup == null || replyMarkup2 == null || replyMarkup.getConstructor() != replyMarkup2.getConstructor())) {
            switch (replyMarkup.getConstructor()) {
                case TdApi.ReplyMarkupRemoveKeyboard.CONSTRUCTOR:
                    if (!((replyMarkup instanceof TdApi.ReplyMarkupRemoveKeyboard) && (replyMarkup2 instanceof TdApi.ReplyMarkupRemoveKeyboard))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ReplyMarkupRemoveKeyboard) replyMarkup).isPersonal == ((TdApi.ReplyMarkupRemoveKeyboard) replyMarkup2).isPersonal) {
                        return true;
                    }
                    break;
                case TdApi.ReplyMarkupInlineKeyboard.CONSTRUCTOR:
                    if ((replyMarkup instanceof TdApi.ReplyMarkupInlineKeyboard) && (replyMarkup2 instanceof TdApi.ReplyMarkupInlineKeyboard)) {
                        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard = (TdApi.ReplyMarkupInlineKeyboard) replyMarkup;
                        TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr = replyMarkupInlineKeyboard.rows;
                        int length = inlineKeyboardButtonArr == null ? 0 : inlineKeyboardButtonArr.length;
                        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard2 = (TdApi.ReplyMarkupInlineKeyboard) replyMarkup2;
                        TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr2 = replyMarkupInlineKeyboard2.rows;
                        if (length != (inlineKeyboardButtonArr2 == null ? 0 : inlineKeyboardButtonArr2.length)) {
                            return false;
                        }
                        if (inlineKeyboardButtonArr == null) {
                            return true;
                        }
                        int length2 = inlineKeyboardButtonArr.length;
                        int i = 0;
                        while (i < length2) {
                            i++;
                            TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr3 = replyMarkupInlineKeyboard.rows;
                            TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr4 = inlineKeyboardButtonArr3[i];
                            int length3 = inlineKeyboardButtonArr4 == null ? 0 : inlineKeyboardButtonArr4.length;
                            TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr5 = replyMarkupInlineKeyboard2.rows[i];
                            if (length3 != (inlineKeyboardButtonArr5 == null ? 0 : inlineKeyboardButtonArr5.length)) {
                                return false;
                            }
                            if (inlineKeyboardButtonArr3[i] != null) {
                                int length4 = inlineKeyboardButtonArr3[i].length;
                                int i2 = 0;
                                while (i2 < length4) {
                                    i2++;
                                    TdApi.InlineKeyboardButton inlineKeyboardButton = replyMarkupInlineKeyboard.rows[i][i2];
                                    C8298k.m12934d(inlineKeyboardButton, "this.rows[i][j]");
                                    TdApi.InlineKeyboardButton inlineKeyboardButton2 = replyMarkupInlineKeyboard2.rows[i][i2];
                                    C8298k.m12934d(inlineKeyboardButton2, "b.rows[i][j]");
                                    if (!C7321e.m16991O(inlineKeyboardButton, inlineKeyboardButton2)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.ReplyMarkupShowKeyboard.CONSTRUCTOR:
                    if ((replyMarkup instanceof TdApi.ReplyMarkupShowKeyboard) && (replyMarkup2 instanceof TdApi.ReplyMarkupShowKeyboard)) {
                        TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard = (TdApi.ReplyMarkupShowKeyboard) replyMarkup;
                        TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard2 = (TdApi.ReplyMarkupShowKeyboard) replyMarkup2;
                        if (replyMarkupShowKeyboard.isPersonal == replyMarkupShowKeyboard2.isPersonal && replyMarkupShowKeyboard.oneTime == replyMarkupShowKeyboard2.oneTime && replyMarkupShowKeyboard.resizeKeyboard == replyMarkupShowKeyboard2.resizeKeyboard) {
                            TdApi.KeyboardButton[][] keyboardButtonArr = replyMarkupShowKeyboard.rows;
                            int length5 = keyboardButtonArr == null ? 0 : keyboardButtonArr.length;
                            TdApi.KeyboardButton[][] keyboardButtonArr2 = replyMarkupShowKeyboard2.rows;
                            if (keyboardButtonArr2 != null && length5 == keyboardButtonArr2.length) {
                                if (keyboardButtonArr == null) {
                                    return true;
                                }
                                int length6 = keyboardButtonArr.length;
                                int i3 = 0;
                                while (i3 < length6) {
                                    i3++;
                                    TdApi.KeyboardButton[][] keyboardButtonArr3 = replyMarkupShowKeyboard.rows;
                                    TdApi.KeyboardButton[] keyboardButtonArr4 = keyboardButtonArr3[i3];
                                    int length7 = keyboardButtonArr4 == null ? 0 : keyboardButtonArr4.length;
                                    TdApi.KeyboardButton[] keyboardButtonArr5 = replyMarkupShowKeyboard2.rows[i3];
                                    if (length7 != (keyboardButtonArr5 == null ? 0 : keyboardButtonArr5.length)) {
                                        return false;
                                    }
                                    if (keyboardButtonArr3[i3] != null) {
                                        int length8 = keyboardButtonArr3[i3].length;
                                        int i4 = 0;
                                        while (i4 < length8) {
                                            i4++;
                                            TdApi.KeyboardButton keyboardButton = replyMarkupShowKeyboard.rows[i3][i4];
                                            C8298k.m12934d(keyboardButton, "this.rows[i][j]");
                                            TdApi.KeyboardButton keyboardButton2 = replyMarkupShowKeyboard2.rows[i3][i4];
                                            C8298k.m12934d(keyboardButton2, "b.rows[i][j]");
                                            if (!C7321e.m16985R(keyboardButton, keyboardButton2)) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.ReplyMarkupForceReply.CONSTRUCTOR:
                    if (!((replyMarkup instanceof TdApi.ReplyMarkupForceReply) && (replyMarkup2 instanceof TdApi.ReplyMarkupForceReply))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ReplyMarkupForceReply) replyMarkup).isPersonal == ((TdApi.ReplyMarkupForceReply) replyMarkup2).isPersonal) {
                        return true;
                    }
                    break;
                default:
                    String object = replyMarkup.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return false;
    }

    public static final boolean m16865H(TdApi.Sticker sticker, TdApi.Sticker sticker2) {
        boolean Z;
        if (sticker == sticker2) {
            return true;
        }
        if (sticker != null && sticker2 != null && sticker.width == sticker2.width && sticker.height == sticker2.height && C7321e.m16954e0(sticker.type, sticker2.type) && sticker.setId == sticker2.setId && C5070i.m24068c(sticker.emoji, sticker2.emoji)) {
            Z = m16847Z(sticker.sticker, sticker2.sticker, false, 2, null);
            if (Z && C7321e.m16918q0(sticker.outline, sticker2.outline) && C7321e.m16945h0(sticker.thumbnail, sticker2.thumbnail)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m16864I(TdApi.StickerType stickerType, TdApi.StickerType stickerType2) {
        boolean z = false;
        if (stickerType != stickerType2) {
            if (stickerType == null || stickerType2 == null || stickerType.getConstructor() != stickerType2.getConstructor()) {
                return false;
            }
            switch (stickerType.getConstructor()) {
                case TdApi.StickerTypeMask.CONSTRUCTOR:
                    if ((stickerType instanceof TdApi.StickerTypeMask) && (stickerType2 instanceof TdApi.StickerTypeMask)) {
                        z = true;
                    }
                    if (z) {
                        return C7321e.m16977V(((TdApi.StickerTypeMask) stickerType).maskPosition, ((TdApi.StickerTypeMask) stickerType2).maskPosition);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.StickerTypeVideo.CONSTRUCTOR:
                case TdApi.StickerTypeAnimated.CONSTRUCTOR:
                case TdApi.StickerTypeStatic.CONSTRUCTOR:
                    break;
                default:
                    String object = stickerType.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new C5047g(C8298k.m12928j("An operation is not implemented: ", object));
            }
        }
        return true;
    }

    public static final boolean m16863J(TdApi.TextEntity textEntity, TdApi.TextEntity textEntity2) {
        return textEntity == textEntity2 || (textEntity != null && textEntity2 != null && textEntity.offset == textEntity2.offset && textEntity.length == textEntity2.length && C7321e.m16948g0(textEntity.type, textEntity2.type));
    }

    public static final boolean m16862K(TdApi.TextEntityType textEntityType, TdApi.TextEntityType textEntityType2) {
        boolean z = false;
        if (textEntityType != textEntityType2) {
            if (textEntityType == null || textEntityType2 == null || textEntityType.getConstructor() != textEntityType2.getConstructor()) {
                return false;
            }
            switch (textEntityType.getConstructor()) {
                case TdApi.TextEntityTypeMediaTimestamp.CONSTRUCTOR:
                    if (!((textEntityType instanceof TdApi.TextEntityTypeMediaTimestamp) && (textEntityType2 instanceof TdApi.TextEntityTypeMediaTimestamp))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.TextEntityTypeMediaTimestamp) textEntityType).mediaTimestamp != ((TdApi.TextEntityTypeMediaTimestamp) textEntityType2).mediaTimestamp) {
                        return false;
                    }
                    break;
                case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                    if (!((textEntityType instanceof TdApi.TextEntityTypeMentionName) && (textEntityType2 instanceof TdApi.TextEntityTypeMentionName))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.TextEntityTypeMentionName) textEntityType).userId != ((TdApi.TextEntityTypeMentionName) textEntityType2).userId) {
                        return false;
                    }
                    break;
                case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
                case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                case TdApi.TextEntityTypeItalic.CONSTRUCTOR:
                case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
                case TdApi.TextEntityTypeSpoiler.CONSTRUCTOR:
                case TdApi.TextEntityTypeUnderline.CONSTRUCTOR:
                case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                case TdApi.TextEntityTypeStrikethrough.CONSTRUCTOR:
                case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                case TdApi.TextEntityTypePre.CONSTRUCTOR:
                    break;
                case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                    if ((textEntityType instanceof TdApi.TextEntityTypePreCode) && (textEntityType2 instanceof TdApi.TextEntityTypePreCode)) {
                        z = true;
                    }
                    if (z) {
                        return C5070i.m24068c(((TdApi.TextEntityTypePreCode) textEntityType).language, ((TdApi.TextEntityTypePreCode) textEntityType2).language);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                    if ((textEntityType instanceof TdApi.TextEntityTypeTextUrl) && (textEntityType2 instanceof TdApi.TextEntityTypeTextUrl)) {
                        z = true;
                    }
                    if (z) {
                        return C5070i.m24068c(((TdApi.TextEntityTypeTextUrl) textEntityType).url, ((TdApi.TextEntityTypeTextUrl) textEntityType2).url);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = textEntityType.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new C5047g(C8298k.m12928j("An operation is not implemented: ", object));
            }
        }
        return true;
    }

    public static final boolean m16861L(TdApi.Thumbnail thumbnail, TdApi.Thumbnail thumbnail2) {
        boolean Z;
        if (thumbnail == thumbnail2) {
            return true;
        }
        if (thumbnail != null && thumbnail2 != null && thumbnail.width == thumbnail2.width && thumbnail.height == thumbnail2.height) {
            Z = m16847Z(thumbnail.file, thumbnail2.file, false, 2, null);
            if (Z) {
                TdApi.ThumbnailFormat thumbnailFormat = thumbnail.format;
                C8298k.m12934d(thumbnailFormat, "this.format");
                TdApi.ThumbnailFormat thumbnailFormat2 = thumbnail2.format;
                C8298k.m12934d(thumbnailFormat2, "b.format");
                if (C7321e.m16942i0(thumbnailFormat, thumbnailFormat2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean m16860M(TdApi.ThumbnailFormat thumbnailFormat, TdApi.ThumbnailFormat thumbnailFormat2) {
        C8298k.m12933e(thumbnailFormat, "<this>");
        C8298k.m12933e(thumbnailFormat2, "b");
        return thumbnailFormat.getConstructor() == thumbnailFormat2.getConstructor();
    }

    public static final boolean m16859N(TdApi.UserPrivacySettingRule userPrivacySettingRule, TdApi.UserPrivacySettingRule userPrivacySettingRule2) {
        C8298k.m12933e(userPrivacySettingRule, "<this>");
        C8298k.m12933e(userPrivacySettingRule2, "b");
        boolean z = false;
        if (userPrivacySettingRule != userPrivacySettingRule2) {
            if (userPrivacySettingRule.getConstructor() != userPrivacySettingRule2.getConstructor()) {
                return false;
            }
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    if ((userPrivacySettingRule instanceof TdApi.UserPrivacySettingRuleAllowChatMembers) && (userPrivacySettingRule2 instanceof TdApi.UserPrivacySettingRuleAllowChatMembers)) {
                        z = true;
                    }
                    if (z) {
                        return Arrays.equals(((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule).chatIds, ((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule2).chatIds);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.UserPrivacySettingRuleAllowAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleAllowContacts.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictAll.CONSTRUCTOR:
                case TdApi.UserPrivacySettingRuleRestrictContacts.CONSTRUCTOR:
                    break;
                case TdApi.UserPrivacySettingRuleRestrictChatMembers.CONSTRUCTOR:
                    if ((userPrivacySettingRule instanceof TdApi.UserPrivacySettingRuleRestrictChatMembers) && (userPrivacySettingRule2 instanceof TdApi.UserPrivacySettingRuleRestrictChatMembers)) {
                        z = true;
                    }
                    if (z) {
                        return Arrays.equals(((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds, ((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule2).chatIds);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
                    if ((userPrivacySettingRule instanceof TdApi.UserPrivacySettingRuleRestrictUsers) && (userPrivacySettingRule2 instanceof TdApi.UserPrivacySettingRuleRestrictUsers)) {
                        z = true;
                    }
                    if (z) {
                        return Arrays.equals(((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule).userIds, ((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule2).userIds);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                    if ((userPrivacySettingRule instanceof TdApi.UserPrivacySettingRuleAllowUsers) && (userPrivacySettingRule2 instanceof TdApi.UserPrivacySettingRuleAllowUsers)) {
                        z = true;
                    }
                    if (z) {
                        return Arrays.equals(((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule).userIds, ((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule2).userIds);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = userPrivacySettingRule.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean m16858O(TdApi.UserStatus userStatus, TdApi.UserStatus userStatus2) {
        if (userStatus != userStatus2) {
            if (userStatus == null || userStatus2 == null || userStatus.getConstructor() != userStatus2.getConstructor()) {
                return false;
            }
            switch (userStatus.getConstructor()) {
                case TdApi.UserStatusOnline.CONSTRUCTOR:
                    if (!((userStatus instanceof TdApi.UserStatusOnline) && (userStatus2 instanceof TdApi.UserStatusOnline))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.UserStatusOnline) userStatus).expires != ((TdApi.UserStatusOnline) userStatus2).expires) {
                        return false;
                    }
                    break;
                case TdApi.UserStatusOffline.CONSTRUCTOR:
                    if (!((userStatus instanceof TdApi.UserStatusOffline) && (userStatus2 instanceof TdApi.UserStatusOffline))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.UserStatusOffline) userStatus).wasOnline != ((TdApi.UserStatusOffline) userStatus2).wasOnline) {
                        return false;
                    }
                    break;
                case TdApi.UserStatusRecently.CONSTRUCTOR:
                case TdApi.UserStatusLastWeek.CONSTRUCTOR:
                case TdApi.UserStatusEmpty.CONSTRUCTOR:
                case TdApi.UserStatusLastMonth.CONSTRUCTOR:
                    break;
                default:
                    String object = userStatus.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean m16857P(TdApi.VectorPathCommand vectorPathCommand, TdApi.VectorPathCommand vectorPathCommand2) {
        if (vectorPathCommand != vectorPathCommand2) {
            if (vectorPathCommand == null || vectorPathCommand2 == null) {
                return false;
            }
            int constructor = vectorPathCommand.getConstructor();
            if (constructor == -614056822) {
                return C7321e.m16966a0(((TdApi.VectorPathCommandLine) vectorPathCommand).endPoint, ((TdApi.VectorPathCommandLine) vectorPathCommand2).endPoint);
            }
            if (constructor == 1229733434) {
                TdApi.VectorPathCommandCubicBezierCurve vectorPathCommandCubicBezierCurve = (TdApi.VectorPathCommandCubicBezierCurve) vectorPathCommand;
                TdApi.VectorPathCommandCubicBezierCurve vectorPathCommandCubicBezierCurve2 = (TdApi.VectorPathCommandCubicBezierCurve) vectorPathCommand2;
                if (!C7321e.m16966a0(vectorPathCommandCubicBezierCurve.endPoint, vectorPathCommandCubicBezierCurve2.endPoint) || !C7321e.m16966a0(vectorPathCommandCubicBezierCurve.startControlPoint, vectorPathCommandCubicBezierCurve2.startControlPoint) || !C7321e.m16966a0(vectorPathCommandCubicBezierCurve.endControlPoint, vectorPathCommandCubicBezierCurve2.endControlPoint)) {
                    return false;
                }
            } else {
                String object = vectorPathCommand.toString();
                C8298k.m12934d(object, "this.toString()");
                throw new C5047g(C8298k.m12928j("An operation is not implemented: ", object));
            }
        }
        return true;
    }

    public static final boolean m16856Q(TdApi.Video video, TdApi.Video video2) {
        boolean Z;
        boolean b0;
        if (video == video2) {
            return true;
        }
        if (video != null && video2 != null && video.width == video2.width && video.height == video2.height && video.duration == video2.duration && video.supportsStreaming == video2.supportsStreaming && video.hasStickers == video2.hasStickers) {
            Z = m16847Z(video.video, video2.video, false, 2, null);
            if (Z && C5070i.m24068c(video.fileName, video2.fileName) && C5070i.m24068c(video.mimeType, video2.mimeType) && C7321e.m16945h0(video.thumbnail, video2.thumbnail)) {
                b0 = m16843b0(video.minithumbnail, video2.minithumbnail, false, 2, null);
                if (b0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean m16855R(TdApi.VideoNote videoNote, TdApi.VideoNote videoNote2) {
        boolean Z;
        boolean b0;
        if (videoNote == videoNote2) {
            return true;
        }
        if (videoNote != null && videoNote2 != null && videoNote.duration == videoNote2.duration && videoNote.length == videoNote2.length) {
            Z = m16847Z(videoNote.video, videoNote2.video, false, 2, null);
            if (Z && C7321e.m16945h0(videoNote.thumbnail, videoNote2.thumbnail)) {
                b0 = m16843b0(videoNote.minithumbnail, videoNote2.minithumbnail, false, 2, null);
                if (b0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean m16854S(TdApi.VoiceNote voiceNote, TdApi.VoiceNote voiceNote2, boolean z) {
        boolean Z;
        boolean z2;
        if (voiceNote == voiceNote2) {
            return true;
        }
        if (voiceNote != null && voiceNote2 != null && voiceNote.duration == voiceNote2.duration && C5070i.m24068c(voiceNote.mimeType, voiceNote2.mimeType)) {
            Z = m16847Z(voiceNote.voice, voiceNote2.voice, false, 2, null);
            if (Z) {
                byte[] bArr = voiceNote.waveform;
                if (z) {
                    z2 = Arrays.equals(bArr, voiceNote2.waveform);
                } else {
                    int length = bArr == null ? 0 : bArr.length;
                    byte[] bArr2 = voiceNote2.waveform;
                    z2 = length == (bArr2 == null ? 0 : bArr2.length);
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean m16853T(TdApi.WebPage webPage, TdApi.WebPage webPage2) {
        boolean a0;
        boolean c0;
        if (webPage == webPage2) {
            return true;
        }
        if (webPage != null && webPage2 != null && webPage.instantViewVersion == webPage2.instantViewVersion && webPage.duration == webPage2.duration && webPage.embedWidth == webPage2.embedWidth && webPage.embedHeight == webPage2.embedHeight && C5070i.m24068c(webPage.embedType, webPage2.embedType) && C5070i.m24068c(webPage.embedUrl, webPage2.embedUrl) && C5070i.m24068c(webPage.type, webPage2.type) && C5070i.m24068c(webPage.url, webPage2.url) && C5070i.m24068c(webPage.displayUrl, webPage2.displayUrl) && C5070i.m24068c(webPage.siteName, webPage2.siteName) && C5070i.m24068c(webPage.title, webPage2.title)) {
            a0 = m16845a0(webPage.description, webPage2.description, false, 2, null);
            if (a0 && C5070i.m24068c(webPage.author, webPage2.author) && C7321e.m16971Y(webPage.photo, webPage2.photo) && C7321e.m16901w(webPage.animation, webPage2.animation) && C7321e.m16898x(webPage.audio, webPage2.audio) && C7321e.m17003I(webPage.document, webPage2.document) && C7321e.m16930m0(webPage.video, webPage2.video) && C7321e.m16927n0(webPage.videoNote, webPage2.videoNote)) {
                c0 = m16841c0(webPage.voiceNote, webPage2.voiceNote, false, 2, null);
                if (c0 && C7321e.m16957d0(webPage.sticker, webPage2.sticker)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean m16852U(TdApi.ClosedVectorPath[] closedVectorPathArr, TdApi.ClosedVectorPath[] closedVectorPathArr2) {
        if (closedVectorPathArr != closedVectorPathArr2) {
            if (closedVectorPathArr == null || closedVectorPathArr2 == null || closedVectorPathArr.length != closedVectorPathArr2.length) {
                return false;
            }
            int length = closedVectorPathArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                TdApi.ClosedVectorPath closedVectorPath = closedVectorPathArr[i];
                i++;
                i2++;
                if (!C7321e.m17005H(closedVectorPath, closedVectorPathArr2[i2])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean m16851V(org.drinkless.p210td.libcore.telegram.TdApi.PhotoSize[] r8, org.drinkless.p210td.libcore.telegram.TdApi.PhotoSize[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: p193nb.C7326j.m16851V(org.drinkless.td.libcore.telegram.TdApi$PhotoSize[], org.drinkless.td.libcore.telegram.TdApi$PhotoSize[]):boolean");
    }

    public static final boolean m16850W(TdApi.TextEntity[] textEntityArr, TdApi.TextEntity[] textEntityArr2, boolean z) {
        boolean d0;
        if (textEntityArr == textEntityArr2) {
            return true;
        }
        if ((textEntityArr == null ? 0 : textEntityArr.length) != (textEntityArr2 == null ? 0 : textEntityArr2.length)) {
            return false;
        }
        if (!(textEntityArr == null || textEntityArr2 == null)) {
            if (z) {
                d0 = m16839d0(C7321e.m17012D0(textEntityArr), C7321e.m17012D0(textEntityArr2), false, 2, null);
                return d0;
            }
            int length = textEntityArr.length;
            int i = 0;
            while (i < length) {
                i++;
                if (!C7321e.m16951f0(textEntityArr[i], textEntityArr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean m16849X(TdApi.VectorPathCommand[] vectorPathCommandArr, TdApi.VectorPathCommand[] vectorPathCommandArr2) {
        if (vectorPathCommandArr != vectorPathCommandArr2) {
            if (vectorPathCommandArr == null || vectorPathCommandArr2 == null || vectorPathCommandArr.length != vectorPathCommandArr2.length) {
                return false;
            }
            int length = vectorPathCommandArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                TdApi.VectorPathCommand vectorPathCommand = vectorPathCommandArr[i];
                i++;
                i2++;
                if (!C7321e.m16933l0(vectorPathCommand, vectorPathCommandArr2[i2])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean m16848Y(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C7321e.m16999K(draftMessage, draftMessage2, z);
    }

    public static boolean m16847Z(TdApi.File file, TdApi.File file2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return C7321e.m16997L(file, file2, z);
    }

    public static final boolean m16846a(TdApi.Animation animation, TdApi.Animation animation2) {
        boolean Z;
        boolean b0;
        if (animation == animation2) {
            return true;
        }
        if (animation != null && animation2 != null && animation.width == animation2.width && animation.height == animation2.height && animation.duration == animation2.duration && animation.hasStickers == animation2.hasStickers) {
            Z = m16847Z(animation.animation, animation2.animation, false, 2, null);
            if (Z && C5070i.m24068c(animation.mimeType, animation2.mimeType) && C5070i.m24068c(animation.fileName, animation2.fileName)) {
                b0 = m16843b0(animation.minithumbnail, animation2.minithumbnail, false, 2, null);
                if (b0 && C7321e.m16945h0(animation.thumbnail, animation2.thumbnail)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m16845a0(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C7321e.m16993N(formattedText, formattedText2, z);
    }

    public static final boolean m16844b(TdApi.Audio audio, TdApi.Audio audio2) {
        boolean Z;
        boolean b0;
        if (audio == audio2) {
            return true;
        }
        if (audio != null && audio2 != null && audio.duration == audio2.duration && C5070i.m24068c(audio.title, audio2.title) && C5070i.m24068c(audio.performer, audio2.performer) && C5070i.m24068c(audio.mimeType, audio2.mimeType) && C5070i.m24068c(audio.fileName, audio2.fileName)) {
            Z = m16847Z(audio.audio, audio2.audio, false, 2, null);
            if (Z && C7321e.m16945h0(audio.albumCoverThumbnail, audio2.albumCoverThumbnail)) {
                b0 = m16843b0(audio.albumCoverMinithumbnail, audio2.albumCoverMinithumbnail, false, 2, null);
                if (b0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m16843b0(TdApi.Minithumbnail minithumbnail, TdApi.Minithumbnail minithumbnail2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C7321e.m16973X(minithumbnail, minithumbnail2, z);
    }

    public static final boolean m16842c(TdApi.BackgroundFill backgroundFill, TdApi.BackgroundFill backgroundFill2) {
        boolean z = false;
        if (backgroundFill != backgroundFill2) {
            if (backgroundFill == null || backgroundFill2 == null || backgroundFill.getConstructor() != backgroundFill2.getConstructor()) {
                return false;
            }
            int constructor = backgroundFill.getConstructor();
            if (constructor == -1839206017) {
                if ((backgroundFill instanceof TdApi.BackgroundFillGradient) && (backgroundFill2 instanceof TdApi.BackgroundFillGradient)) {
                    TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
                    TdApi.BackgroundFillGradient backgroundFillGradient2 = (TdApi.BackgroundFillGradient) backgroundFill2;
                    if (!(backgroundFillGradient.topColor == backgroundFillGradient2.topColor && backgroundFillGradient.bottomColor == backgroundFillGradient2.bottomColor && backgroundFillGradient.rotationAngle == backgroundFillGradient2.rotationAngle)) {
                        return false;
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (constructor == -1145469255) {
                if ((backgroundFill instanceof TdApi.BackgroundFillFreeformGradient) && (backgroundFill2 instanceof TdApi.BackgroundFillFreeformGradient)) {
                    z = true;
                }
                if (z) {
                    return Arrays.equals(((TdApi.BackgroundFillFreeformGradient) backgroundFill).colors, ((TdApi.BackgroundFillFreeformGradient) backgroundFill2).colors);
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (constructor == 1010678813) {
                if (!((backgroundFill instanceof TdApi.BackgroundFillSolid) && (backgroundFill2 instanceof TdApi.BackgroundFillSolid))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (((TdApi.BackgroundFillSolid) backgroundFill).color != ((TdApi.BackgroundFillSolid) backgroundFill2).color) {
                    return false;
                }
            } else {
                String object = backgroundFill.toString();
                C8298k.m12934d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static boolean m16841c0(TdApi.VoiceNote voiceNote, TdApi.VoiceNote voiceNote2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C7321e.m16924o0(voiceNote, voiceNote2, z);
    }

    public static final boolean m16840d(TdApi.BackgroundType backgroundType, TdApi.BackgroundType backgroundType2, boolean z) {
        boolean z2 = false;
        if (backgroundType != backgroundType2) {
            if (backgroundType == null || backgroundType2 == null || backgroundType.getConstructor() != backgroundType2.getConstructor()) {
                return false;
            }
            int constructor = backgroundType.getConstructor();
            if (constructor == 993008684) {
                if ((backgroundType instanceof TdApi.BackgroundTypeFill) && (backgroundType2 instanceof TdApi.BackgroundTypeFill)) {
                    z2 = true;
                }
                if (z2) {
                    return C7321e.m16895y(((TdApi.BackgroundTypeFill) backgroundType).fill, ((TdApi.BackgroundTypeFill) backgroundType2).fill);
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (constructor == 1290213117) {
                if ((backgroundType instanceof TdApi.BackgroundTypePattern) && (backgroundType2 instanceof TdApi.BackgroundTypePattern)) {
                    TdApi.BackgroundTypePattern backgroundTypePattern = (TdApi.BackgroundTypePattern) backgroundType;
                    TdApi.BackgroundTypePattern backgroundTypePattern2 = (TdApi.BackgroundTypePattern) backgroundType2;
                    if (!C7321e.m16895y(backgroundTypePattern.fill, backgroundTypePattern2.fill)) {
                        return false;
                    }
                    if (!z && (backgroundTypePattern.intensity != backgroundTypePattern2.intensity || backgroundTypePattern.isMoving != backgroundTypePattern2.isMoving)) {
                        return false;
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (constructor == 1972128891) {
                if (!((backgroundType instanceof TdApi.BackgroundTypeWallpaper) && (backgroundType2 instanceof TdApi.BackgroundTypeWallpaper))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (!z) {
                    TdApi.BackgroundTypeWallpaper backgroundTypeWallpaper = (TdApi.BackgroundTypeWallpaper) backgroundType;
                    TdApi.BackgroundTypeWallpaper backgroundTypeWallpaper2 = (TdApi.BackgroundTypeWallpaper) backgroundType2;
                    if (!(backgroundTypeWallpaper.isBlurred == backgroundTypeWallpaper2.isBlurred && backgroundTypeWallpaper.isMoving == backgroundTypeWallpaper2.isMoving)) {
                        return false;
                    }
                }
            } else {
                String object = backgroundType.toString();
                C8298k.m12934d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static boolean m16839d0(TdApi.TextEntity[] textEntityArr, TdApi.TextEntity[] textEntityArr2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C7321e.m16912s0(textEntityArr, textEntityArr2, z);
    }

    public static final boolean m16838e(TdApi.ChatAction chatAction, TdApi.ChatAction chatAction2) {
        C8298k.m12933e(chatAction, "<this>");
        C8298k.m12933e(chatAction2, "b");
        boolean z = false;
        if (chatAction != chatAction2) {
            if (chatAction.getConstructor() != chatAction2.getConstructor()) {
                return false;
            }
            switch (chatAction.getConstructor()) {
                case TdApi.ChatActionChoosingLocation.CONSTRUCTOR:
                case TdApi.ChatActionChoosingContact.CONSTRUCTOR:
                case TdApi.ChatActionStartPlayingGame.CONSTRUCTOR:
                case TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR:
                case TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR:
                case TdApi.ChatActionRecordingVideo.CONSTRUCTOR:
                case TdApi.ChatActionChoosingSticker.CONSTRUCTOR:
                case TdApi.ChatActionTyping.CONSTRUCTOR:
                case TdApi.ChatActionCancel.CONSTRUCTOR:
                    break;
                case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
                    if (!((chatAction instanceof TdApi.ChatActionUploadingVoiceNote) && (chatAction2 instanceof TdApi.ChatActionUploadingVoiceNote))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ChatActionUploadingVoiceNote) chatAction).progress != ((TdApi.ChatActionUploadingVoiceNote) chatAction2).progress) {
                        return false;
                    }
                    break;
                case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
                    if (!((chatAction instanceof TdApi.ChatActionUploadingDocument) && (chatAction2 instanceof TdApi.ChatActionUploadingDocument))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ChatActionUploadingDocument) chatAction).progress != ((TdApi.ChatActionUploadingDocument) chatAction2).progress) {
                        return false;
                    }
                    break;
                case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
                    if (!((chatAction instanceof TdApi.ChatActionUploadingPhoto) && (chatAction2 instanceof TdApi.ChatActionUploadingPhoto))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ChatActionUploadingPhoto) chatAction).progress != ((TdApi.ChatActionUploadingPhoto) chatAction2).progress) {
                        return false;
                    }
                    break;
                case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
                    if (!((chatAction instanceof TdApi.ChatActionUploadingVideoNote) && (chatAction2 instanceof TdApi.ChatActionUploadingVideoNote))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ChatActionUploadingVideoNote) chatAction).progress != ((TdApi.ChatActionUploadingVideoNote) chatAction2).progress) {
                        return false;
                    }
                    break;
                case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
                    if (!((chatAction instanceof TdApi.ChatActionUploadingVideo) && (chatAction2 instanceof TdApi.ChatActionUploadingVideo))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ChatActionUploadingVideo) chatAction).progress != ((TdApi.ChatActionUploadingVideo) chatAction2).progress) {
                        return false;
                    }
                    break;
                case TdApi.ChatActionWatchingAnimations.CONSTRUCTOR:
                    if ((chatAction instanceof TdApi.ChatActionWatchingAnimations) && (chatAction2 instanceof TdApi.ChatActionWatchingAnimations)) {
                        z = true;
                    }
                    if (z) {
                        return C8298k.m12936b(((TdApi.ChatActionWatchingAnimations) chatAction).emoji, ((TdApi.ChatActionWatchingAnimations) chatAction2).emoji);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = chatAction.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new C5047g(C8298k.m12928j("An operation is not implemented: ", object));
            }
        }
        return true;
    }

    public static final boolean m16837f(TdApi.ChatEventLogFilters chatEventLogFilters, TdApi.ChatEventLogFilters chatEventLogFilters2) {
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.messageEdits) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.messageEdits)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.messageDeletions) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.messageDeletions)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.messagePins) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.messagePins)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.memberJoins) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.memberJoins)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.memberLeaves) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.memberLeaves)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.memberInvites) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.memberInvites)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.memberPromotions) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.memberPromotions)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.memberRestrictions) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.memberRestrictions)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.infoChanges) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.infoChanges)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.settingChanges) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.settingChanges)) {
            return false;
        }
        if ((chatEventLogFilters == null ? false : chatEventLogFilters.inviteLinkChanges) != (chatEventLogFilters2 == null ? false : chatEventLogFilters2.inviteLinkChanges)) {
            return false;
        }
        return (chatEventLogFilters == null ? false : chatEventLogFilters.videoChatChanges) == (chatEventLogFilters2 == null ? false : chatEventLogFilters2.videoChatChanges);
    }

    public static final boolean m16836g(TdApi.ChatList chatList, TdApi.ChatList chatList2) {
        if (chatList != chatList2) {
            if (chatList == null || chatList2 == null || chatList.getConstructor() != chatList2.getConstructor()) {
                return false;
            }
            int constructor = chatList.getConstructor();
            if (constructor != -2022707655) {
                if (!(constructor == -400991316 || constructor == 362770115)) {
                    String object = chatList.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
                }
            } else if (((TdApi.ChatListFilter) chatList).chatFilterId != ((TdApi.ChatListFilter) chatList2).chatFilterId) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16835h(TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2) {
        C8298k.m12933e(chatMemberStatus, "<this>");
        C8298k.m12933e(chatMemberStatus2, "b");
        if (chatMemberStatus != chatMemberStatus2) {
            if (chatMemberStatus.getConstructor() != chatMemberStatus2.getConstructor()) {
                return false;
            }
            switch (chatMemberStatus.getConstructor()) {
                case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                    if (!((chatMemberStatus instanceof TdApi.ChatMemberStatusBanned) && (chatMemberStatus2 instanceof TdApi.ChatMemberStatusBanned))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else if (((TdApi.ChatMemberStatusBanned) chatMemberStatus).bannedUntilDate != ((TdApi.ChatMemberStatusBanned) chatMemberStatus2).bannedUntilDate) {
                        return false;
                    }
                    break;
                case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                    if ((chatMemberStatus instanceof TdApi.ChatMemberStatusCreator) && (chatMemberStatus2 instanceof TdApi.ChatMemberStatusCreator)) {
                        TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) chatMemberStatus;
                        TdApi.ChatMemberStatusCreator chatMemberStatusCreator2 = (TdApi.ChatMemberStatusCreator) chatMemberStatus2;
                        if (chatMemberStatusCreator.isMember != chatMemberStatusCreator2.isMember || !C5070i.m24068c(chatMemberStatusCreator.customTitle, chatMemberStatusCreator2.customTitle)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                    break;
                case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                    if ((chatMemberStatus instanceof TdApi.ChatMemberStatusAdministrator) && (chatMemberStatus2 instanceof TdApi.ChatMemberStatusAdministrator)) {
                        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) chatMemberStatus;
                        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator2 = (TdApi.ChatMemberStatusAdministrator) chatMemberStatus2;
                        if (!(chatMemberStatusAdministrator.canChangeInfo == chatMemberStatusAdministrator2.canChangeInfo && chatMemberStatusAdministrator.canPostMessages == chatMemberStatusAdministrator2.canPostMessages && chatMemberStatusAdministrator.canEditMessages == chatMemberStatusAdministrator2.canEditMessages && chatMemberStatusAdministrator.canDeleteMessages == chatMemberStatusAdministrator2.canDeleteMessages && chatMemberStatusAdministrator.canInviteUsers == chatMemberStatusAdministrator2.canInviteUsers && chatMemberStatusAdministrator.canRestrictMembers == chatMemberStatusAdministrator2.canRestrictMembers && chatMemberStatusAdministrator.canPinMessages == chatMemberStatusAdministrator2.canPinMessages && chatMemberStatusAdministrator.canPromoteMembers == chatMemberStatusAdministrator2.canPromoteMembers && chatMemberStatusAdministrator.isAnonymous == chatMemberStatusAdministrator2.isAnonymous && chatMemberStatusAdministrator.canManageChat == chatMemberStatusAdministrator2.canManageChat && chatMemberStatusAdministrator.canManageVideoChats == chatMemberStatusAdministrator2.canManageVideoChats && C5070i.m24068c(chatMemberStatusAdministrator.customTitle, chatMemberStatusAdministrator2.customTitle))) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                    if ((chatMemberStatus instanceof TdApi.ChatMemberStatusRestricted) && (chatMemberStatus2 instanceof TdApi.ChatMemberStatusRestricted)) {
                        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) chatMemberStatus;
                        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted2 = (TdApi.ChatMemberStatusRestricted) chatMemberStatus2;
                        if (chatMemberStatusRestricted.isMember != chatMemberStatusRestricted2.isMember || chatMemberStatusRestricted.restrictedUntilDate != chatMemberStatusRestricted2.restrictedUntilDate) {
                            return false;
                        }
                        TdApi.ChatPermissions chatPermissions = chatMemberStatusRestricted.permissions;
                        C8298k.m12934d(chatPermissions, "this.permissions");
                        TdApi.ChatPermissions chatPermissions2 = chatMemberStatusRestricted2.permissions;
                        C8298k.m12934d(chatPermissions2, "b.permissions");
                        if (!C7321e.m17011E(chatPermissions, chatPermissions2)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                default:
                    String object = chatMemberStatus.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean m16834i(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2) {
        C8298k.m12933e(chatPermissions, "<this>");
        C8298k.m12933e(chatPermissions2, "b");
        return chatPermissions == chatPermissions2 || (chatPermissions.canSendMessages == chatPermissions2.canSendMessages && chatPermissions.canSendMediaMessages == chatPermissions2.canSendMediaMessages && chatPermissions.canSendOtherMessages == chatPermissions2.canSendOtherMessages && chatPermissions.canAddWebPagePreviews == chatPermissions2.canAddWebPagePreviews && chatPermissions.canSendPolls == chatPermissions2.canSendPolls && chatPermissions.canInviteUsers == chatPermissions2.canInviteUsers && chatPermissions.canPinMessages == chatPermissions2.canPinMessages && chatPermissions.canChangeInfo == chatPermissions2.canChangeInfo);
    }

    public static final boolean m16833j(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2, TdApi.ChatPermissions chatPermissions3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        C8298k.m12933e(chatPermissions, "<this>");
        C8298k.m12933e(chatPermissions2, "old");
        C8298k.m12933e(chatPermissions3, "defaultPermissions");
        return chatPermissions == chatPermissions2 || (((z = chatPermissions.canSendMessages) == chatPermissions2.canSendMessages || (!z && !chatPermissions3.canSendMessages)) && (((z2 = chatPermissions.canSendMediaMessages) == chatPermissions2.canSendMediaMessages || (!z2 && !chatPermissions3.canSendMediaMessages)) && (((z3 = chatPermissions.canSendOtherMessages) == chatPermissions2.canSendOtherMessages || (!z3 && !chatPermissions3.canSendOtherMessages)) && (((z4 = chatPermissions.canAddWebPagePreviews) == chatPermissions2.canAddWebPagePreviews || (!z4 && !chatPermissions3.canAddWebPagePreviews)) && (((z5 = chatPermissions.canSendPolls) == chatPermissions2.canSendPolls || (!z5 && !chatPermissions3.canSendPolls)) && (((z6 = chatPermissions.canInviteUsers) == chatPermissions2.canInviteUsers || (!z6 && !chatPermissions3.canInviteUsers)) && (((z7 = chatPermissions.canPinMessages) == chatPermissions2.canPinMessages || (!z7 && !chatPermissions3.canPinMessages)) && ((z8 = chatPermissions.canChangeInfo) == chatPermissions2.canChangeInfo || (!z8 && !chatPermissions3.canChangeInfo)))))))));
    }

    public static final boolean m16832k(TdApi.ChatSource chatSource, TdApi.ChatSource chatSource2) {
        if (chatSource != chatSource2) {
            if (chatSource == null || chatSource2 == null || chatSource.getConstructor() != chatSource2.getConstructor()) {
                return false;
            }
            int constructor = chatSource.getConstructor();
            if (constructor == -328571244) {
                if ((chatSource instanceof TdApi.ChatSourcePublicServiceAnnouncement) && (chatSource2 instanceof TdApi.ChatSourcePublicServiceAnnouncement)) {
                    TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement = (TdApi.ChatSourcePublicServiceAnnouncement) chatSource;
                    TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement2 = (TdApi.ChatSourcePublicServiceAnnouncement) chatSource2;
                    if (!C5070i.m24068c(chatSourcePublicServiceAnnouncement.type, chatSourcePublicServiceAnnouncement2.type) || !C5070i.m24068c(chatSourcePublicServiceAnnouncement.text, chatSourcePublicServiceAnnouncement2.text)) {
                        return false;
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (constructor != 394074115) {
                String object = chatSource.toString();
                C8298k.m12934d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean m16831l(TdApi.ClosedVectorPath closedVectorPath, TdApi.ClosedVectorPath closedVectorPath2) {
        if (closedVectorPath != closedVectorPath2) {
            TdApi.VectorPathCommand[] vectorPathCommandArr = null;
            TdApi.VectorPathCommand[] vectorPathCommandArr2 = closedVectorPath == null ? null : closedVectorPath.commands;
            if (closedVectorPath2 != null) {
                vectorPathCommandArr = closedVectorPath2.commands;
            }
            if (!C7321e.m16909t0(vectorPathCommandArr2, vectorPathCommandArr)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16830m(TdApi.Document document, TdApi.Document document2) {
        boolean Z;
        boolean b0;
        if (document == document2) {
            return true;
        }
        if (!(document == null || document2 == null)) {
            Z = m16847Z(document.document, document2.document, false, 2, null);
            if (Z && C5070i.m24068c(document.mimeType, document2.mimeType) && C5070i.m24068c(document.fileName, document2.fileName)) {
                b0 = m16843b0(document.minithumbnail, document2.minithumbnail, false, 2, null);
                if (b0 && C7321e.m16945h0(document.thumbnail, document2.thumbnail)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean m16829n(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2) {
        boolean Y;
        Y = m16848Y(draftMessage, draftMessage2, false, 2, null);
        return Y;
    }

    public static final boolean m16828o(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2, boolean z) {
        if (draftMessage != draftMessage2) {
            if (draftMessage == null || draftMessage2 == null) {
                return false;
            }
            if ((draftMessage.date != draftMessage2.date && !z) || draftMessage.replyToMessageId != draftMessage2.replyToMessageId || !C7321e.m16987Q(draftMessage.inputMessageText, draftMessage2.inputMessageText)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16827p(TdApi.File file, TdApi.File file2, boolean z) {
        if (file != file2) {
            if (file == null || file2 == null) {
                return false;
            }
            if (z) {
                if (file.f25376id != file2.f25376id) {
                    return false;
                }
            } else if (!(file.f25376id == file2.f25376id && file.size == file2.size && file.expectedSize == file2.expectedSize && C7321e.m16981T(file.local, file2.local) && C7321e.m16963b0(file.remote, file2.remote))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16826q(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2) {
        boolean a0;
        a0 = m16845a0(formattedText, formattedText2, false, 2, null);
        return a0;
    }

    public static final boolean m16825r(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2, boolean z) {
        if (formattedText == formattedText2) {
            return true;
        }
        return C7321e.m16965a1(formattedText) ? C7321e.m16965a1(formattedText2) : !C7321e.m16965a1(formattedText2) && C5070i.m24068c(formattedText.text, formattedText2.text) && C7321e.m16912s0(formattedText.entities, formattedText2.entities, z);
    }

    public static final boolean m16824s(TdApi.InlineKeyboardButton inlineKeyboardButton, TdApi.InlineKeyboardButton inlineKeyboardButton2) {
        C8298k.m12933e(inlineKeyboardButton, "<this>");
        C8298k.m12933e(inlineKeyboardButton2, "b");
        if (inlineKeyboardButton != inlineKeyboardButton2) {
            if (C8298k.m12936b(inlineKeyboardButton.text, inlineKeyboardButton2.text)) {
                TdApi.InlineKeyboardButtonType inlineKeyboardButtonType = inlineKeyboardButton.type;
                C8298k.m12934d(inlineKeyboardButtonType, "this.type");
                TdApi.InlineKeyboardButtonType inlineKeyboardButtonType2 = inlineKeyboardButton2.type;
                C8298k.m12934d(inlineKeyboardButtonType2, "b.type");
                if (C7321e.m16989P(inlineKeyboardButtonType, inlineKeyboardButtonType2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean m16823t(TdApi.InlineKeyboardButtonType inlineKeyboardButtonType, TdApi.InlineKeyboardButtonType inlineKeyboardButtonType2) {
        C8298k.m12933e(inlineKeyboardButtonType, "<this>");
        C8298k.m12933e(inlineKeyboardButtonType2, "b");
        boolean z = false;
        if (inlineKeyboardButtonType != inlineKeyboardButtonType2) {
            if (inlineKeyboardButtonType.getConstructor() != inlineKeyboardButtonType2.getConstructor()) {
                return false;
            }
            switch (inlineKeyboardButtonType.getConstructor()) {
                case TdApi.InlineKeyboardButtonTypeSwitchInline.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeSwitchInline) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeSwitchInline)) {
                        TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline = (TdApi.InlineKeyboardButtonTypeSwitchInline) inlineKeyboardButtonType;
                        TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline2 = (TdApi.InlineKeyboardButtonTypeSwitchInline) inlineKeyboardButtonType2;
                        if (inlineKeyboardButtonTypeSwitchInline.inCurrentChat != inlineKeyboardButtonTypeSwitchInline2.inCurrentChat || !C8298k.m12936b(inlineKeyboardButtonTypeSwitchInline.query, inlineKeyboardButtonTypeSwitchInline2.query)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                case TdApi.InlineKeyboardButtonTypeLoginUrl.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeLoginUrl) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeLoginUrl)) {
                        TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl = (TdApi.InlineKeyboardButtonTypeLoginUrl) inlineKeyboardButtonType;
                        TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl2 = (TdApi.InlineKeyboardButtonTypeLoginUrl) inlineKeyboardButtonType2;
                        if (inlineKeyboardButtonTypeLoginUrl.f25381id != inlineKeyboardButtonTypeLoginUrl2.f25381id || !C8298k.m12936b(inlineKeyboardButtonTypeLoginUrl.url, inlineKeyboardButtonTypeLoginUrl2.url) || !C8298k.m12936b(inlineKeyboardButtonTypeLoginUrl.forwardText, inlineKeyboardButtonTypeLoginUrl2.forwardText)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                case TdApi.InlineKeyboardButtonTypeCallback.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeCallback) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeCallback)) {
                        z = true;
                    }
                    if (z) {
                        return Arrays.equals(((TdApi.InlineKeyboardButtonTypeCallback) inlineKeyboardButtonType).data, ((TdApi.InlineKeyboardButtonTypeCallback) inlineKeyboardButtonType2).data);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.InlineKeyboardButtonTypeCallbackGame.CONSTRUCTOR:
                case TdApi.InlineKeyboardButtonTypeBuy.CONSTRUCTOR:
                    break;
                case TdApi.InlineKeyboardButtonTypeCallbackWithPassword.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeCallbackWithPassword) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeCallbackWithPassword)) {
                        z = true;
                    }
                    if (z) {
                        return Arrays.equals(((TdApi.InlineKeyboardButtonTypeCallbackWithPassword) inlineKeyboardButtonType).data, ((TdApi.InlineKeyboardButtonTypeCallbackWithPassword) inlineKeyboardButtonType2).data);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.InlineKeyboardButtonTypeUrl.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeUrl) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeUrl)) {
                        z = true;
                    }
                    if (z) {
                        return C8298k.m12936b(((TdApi.InlineKeyboardButtonTypeUrl) inlineKeyboardButtonType).url, ((TdApi.InlineKeyboardButtonTypeUrl) inlineKeyboardButtonType2).url);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = inlineKeyboardButtonType.toString();
                    C8298k.m12934d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean m16822u(TdApi.InputMessageContent inputMessageContent, TdApi.InputMessageContent inputMessageContent2) {
        boolean a0;
        if (inputMessageContent == inputMessageContent2) {
            return true;
        }
        if (!(inputMessageContent == null || inputMessageContent2 == null || inputMessageContent.getConstructor() != inputMessageContent2.getConstructor())) {
            if (inputMessageContent.getConstructor() == 247050392) {
                TdApi.InputMessageText inputMessageText = (TdApi.InputMessageText) inputMessageContent;
                TdApi.InputMessageText inputMessageText2 = (TdApi.InputMessageText) inputMessageContent2;
                a0 = m16845a0(inputMessageText.text, inputMessageText2.text, false, 2, null);
                if (a0 && inputMessageText.clearDraft == inputMessageText2.clearDraft && inputMessageText.disableWebPagePreview == inputMessageText2.disableWebPagePreview) {
                    return true;
                }
            } else {
                String object = inputMessageContent.toString();
                C8298k.m12934d(object, "this.toString()");
                throw new C5047g(C8298k.m12928j("An operation is not implemented: ", object));
            }
        }
        return false;
    }

    public static final boolean m16821v(TdApi.KeyboardButton keyboardButton, TdApi.KeyboardButton keyboardButton2) {
        C8298k.m12933e(keyboardButton, "<this>");
        C8298k.m12933e(keyboardButton2, "b");
        if (keyboardButton != keyboardButton2) {
            if (C8298k.m12936b(keyboardButton.text, keyboardButton2.text)) {
                TdApi.KeyboardButtonType keyboardButtonType = keyboardButton.type;
                C8298k.m12934d(keyboardButtonType, "this.type");
                TdApi.KeyboardButtonType keyboardButtonType2 = keyboardButton2.type;
                C8298k.m12934d(keyboardButtonType2, "b.type");
                if (C7321e.m16983S(keyboardButtonType, keyboardButtonType2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean m16820w(TdApi.KeyboardButtonType keyboardButtonType, TdApi.KeyboardButtonType keyboardButtonType2) {
        C8298k.m12933e(keyboardButtonType, "<this>");
        C8298k.m12933e(keyboardButtonType2, "b");
        if (keyboardButtonType != keyboardButtonType2) {
            if (keyboardButtonType.getConstructor() == keyboardButtonType2.getConstructor()) {
                switch (keyboardButtonType.getConstructor()) {
                    case TdApi.KeyboardButtonTypeText.CONSTRUCTOR:
                    case TdApi.KeyboardButtonTypeRequestPhoneNumber.CONSTRUCTOR:
                    case TdApi.KeyboardButtonTypeRequestLocation.CONSTRUCTOR:
                        break;
                    default:
                        String object = keyboardButtonType.toString();
                        C8298k.m12934d(object, "this.toString()");
                        throw new IllegalStateException(object.toString());
                    case TdApi.KeyboardButtonTypeRequestPoll.CONSTRUCTOR:
                        if ((keyboardButtonType instanceof TdApi.KeyboardButtonTypeRequestPoll) && (keyboardButtonType2 instanceof TdApi.KeyboardButtonTypeRequestPoll)) {
                            TdApi.KeyboardButtonTypeRequestPoll keyboardButtonTypeRequestPoll = (TdApi.KeyboardButtonTypeRequestPoll) keyboardButtonType;
                            TdApi.KeyboardButtonTypeRequestPoll keyboardButtonTypeRequestPoll2 = (TdApi.KeyboardButtonTypeRequestPoll) keyboardButtonType2;
                            if (!(keyboardButtonTypeRequestPoll.forceQuiz == keyboardButtonTypeRequestPoll2.forceQuiz && keyboardButtonTypeRequestPoll.forceRegular == keyboardButtonTypeRequestPoll2.forceRegular)) {
                                return false;
                            }
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        break;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16819x(TdApi.LocalFile localFile, TdApi.LocalFile localFile2) {
        return localFile == localFile2 || (localFile != null && localFile2 != null && localFile.downloadedSize == localFile2.downloadedSize && localFile.downloadOffset == localFile2.downloadOffset && localFile.downloadedPrefixSize == localFile2.downloadedPrefixSize && localFile.isDownloadingActive == localFile2.isDownloadingActive && localFile.isDownloadingCompleted == localFile2.isDownloadingCompleted && localFile.canBeDeleted == localFile2.canBeDeleted && localFile.canBeDownloaded == localFile2.canBeDownloaded && C5070i.m24068c(localFile.path, localFile2.path));
    }

    public static final boolean m16818y(TdApi.MaskPoint maskPoint, TdApi.MaskPoint maskPoint2) {
        if (maskPoint == maskPoint2) {
            return true;
        }
        if (maskPoint == null || maskPoint2 == null || maskPoint.getConstructor() != maskPoint2.getConstructor()) {
            return false;
        }
        switch (maskPoint.getConstructor()) {
            case TdApi.MaskPointMouth.CONSTRUCTOR:
            case TdApi.MaskPointChin.CONSTRUCTOR:
            case TdApi.MaskPointForehead.CONSTRUCTOR:
            case TdApi.MaskPointEyes.CONSTRUCTOR:
                return true;
            default:
                String object = maskPoint.toString();
                C8298k.m12934d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
        }
    }

    public static final boolean m16817z(TdApi.MaskPosition maskPosition, TdApi.MaskPosition maskPosition2) {
        if (maskPosition != maskPosition2) {
            if (maskPosition == null || maskPosition2 == null) {
                return false;
            }
            if (!(maskPosition.scale == maskPosition2.scale)) {
                return false;
            }
            if (!(maskPosition.xShift == maskPosition2.xShift)) {
                return false;
            }
            if (!(maskPosition.yShift == maskPosition2.yShift) || !C7321e.m16979U(maskPosition.point, maskPosition2.point)) {
                return false;
            }
        }
        return true;
    }
}
