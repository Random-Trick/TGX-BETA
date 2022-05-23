package ob;

import ia.g;
import ib.i;
import java.util.Arrays;
import org.drinkless.td.libcore.telegram.TdApi;
import ra.k;

public final class j {
    public static final boolean A(TdApi.MaskPosition maskPosition, TdApi.MaskPosition maskPosition2) {
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
            if (!(maskPosition.yShift == maskPosition2.yShift) || !e.W(maskPosition.point, maskPosition2.point)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean B(TdApi.MessageSender messageSender, TdApi.MessageSender messageSender2) {
        if (messageSender != messageSender2) {
            if (messageSender == null || messageSender2 == null || messageSender.getConstructor() != messageSender2.getConstructor()) {
                return false;
            }
            int constructor = messageSender.getConstructor();
            if (constructor != -336109341) {
                if (constructor != -239660751) {
                    String object = messageSender.toString();
                    k.d(object, "this.toString()");
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

    public static final boolean C(TdApi.Minithumbnail minithumbnail, TdApi.Minithumbnail minithumbnail2, boolean z10) {
        if (minithumbnail != minithumbnail2) {
            if (minithumbnail == null || minithumbnail2 == null || minithumbnail.width != minithumbnail2.width || minithumbnail.height != minithumbnail2.height) {
                return false;
            }
            if (z10 && !Arrays.equals(minithumbnail.data, minithumbnail2.data)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean D(TdApi.Photo photo, TdApi.Photo photo2) {
        boolean c02;
        if (photo == photo2) {
            return true;
        }
        if (!(photo == null || photo2 == null || photo.hasStickers != photo2.hasStickers)) {
            c02 = c0(photo.minithumbnail, photo2.minithumbnail, false, 2, null);
            if (c02 && e.t0(photo.sizes, photo2.sizes)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean E(TdApi.PhotoSize photoSize, TdApi.PhotoSize photoSize2) {
        boolean a02;
        if (photoSize == photoSize2) {
            return true;
        }
        if (photoSize != null && photoSize2 != null && photoSize.width == photoSize2.width && photoSize.height == photoSize2.height && k.b(photoSize.type, photoSize2.type)) {
            a02 = a0(photoSize.photo, photoSize2.photo, false, 2, null);
            if (a02) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(TdApi.Point point, TdApi.Point point2) {
        if (point != point2) {
            Double d10 = null;
            if (k.a(point != null ? Double.valueOf(point.f19952x) : null, point2 != null ? Double.valueOf(point2.f19952x) : null)) {
                Double valueOf = point != null ? Double.valueOf(point.f19953y) : null;
                if (point2 != null) {
                    d10 = Double.valueOf(point2.f19953y);
                }
                if (k.a(valueOf, d10)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean G(TdApi.RemoteFile remoteFile, TdApi.RemoteFile remoteFile2) {
        return remoteFile == remoteFile2 || (remoteFile != null && remoteFile2 != null && remoteFile.uploadedSize == remoteFile2.uploadedSize && remoteFile.isUploadingActive == remoteFile2.isUploadingActive && remoteFile.isUploadingCompleted == remoteFile2.isUploadingCompleted && i.c(remoteFile.f19958id, remoteFile2.f19958id) && i.c(remoteFile.uniqueId, remoteFile2.uniqueId));
    }

    public static final boolean H(org.drinkless.td.libcore.telegram.TdApi.ReplyMarkup r11, org.drinkless.td.libcore.telegram.TdApi.ReplyMarkup r12) {
        throw new UnsupportedOperationException("Method not decompiled: ob.j.H(org.drinkless.td.libcore.telegram.TdApi$ReplyMarkup, org.drinkless.td.libcore.telegram.TdApi$ReplyMarkup):boolean");
    }

    public static final boolean I(TdApi.Sticker sticker, TdApi.Sticker sticker2) {
        boolean a02;
        if (sticker == sticker2) {
            return true;
        }
        if (sticker != null && sticker2 != null && sticker.width == sticker2.width && sticker.height == sticker2.height && e.g0(sticker.type, sticker2.type) && sticker.setId == sticker2.setId && i.c(sticker.emoji, sticker2.emoji)) {
            a02 = a0(sticker.sticker, sticker2.sticker, false, 2, null);
            if (a02 && e.s0(sticker.outline, sticker2.outline) && e.j0(sticker.thumbnail, sticker2.thumbnail)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean J(TdApi.StickerType stickerType, TdApi.StickerType stickerType2) {
        boolean z10 = false;
        if (stickerType != stickerType2) {
            if (stickerType == null || stickerType2 == null || stickerType.getConstructor() != stickerType2.getConstructor()) {
                return false;
            }
            switch (stickerType.getConstructor()) {
                case TdApi.StickerTypeMask.CONSTRUCTOR:
                    if ((stickerType instanceof TdApi.StickerTypeMask) && (stickerType2 instanceof TdApi.StickerTypeMask)) {
                        z10 = true;
                    }
                    if (z10) {
                        return e.X(((TdApi.StickerTypeMask) stickerType).maskPosition, ((TdApi.StickerTypeMask) stickerType2).maskPosition);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.StickerTypeVideo.CONSTRUCTOR:
                case TdApi.StickerTypeAnimated.CONSTRUCTOR:
                case TdApi.StickerTypeStatic.CONSTRUCTOR:
                    break;
                default:
                    String object = stickerType.toString();
                    k.d(object, "this.toString()");
                    throw new g("An operation is not implemented: " + object);
            }
        }
        return true;
    }

    public static final boolean K(TdApi.TextEntity textEntity, TdApi.TextEntity textEntity2) {
        return textEntity == textEntity2 || (textEntity != null && textEntity2 != null && textEntity.offset == textEntity2.offset && textEntity.length == textEntity2.length && e.i0(textEntity.type, textEntity2.type));
    }

    public static final boolean L(TdApi.TextEntityType textEntityType, TdApi.TextEntityType textEntityType2) {
        boolean z10 = false;
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
                        z10 = true;
                    }
                    if (z10) {
                        return i.c(((TdApi.TextEntityTypePreCode) textEntityType).language, ((TdApi.TextEntityTypePreCode) textEntityType2).language);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                    if ((textEntityType instanceof TdApi.TextEntityTypeTextUrl) && (textEntityType2 instanceof TdApi.TextEntityTypeTextUrl)) {
                        z10 = true;
                    }
                    if (z10) {
                        return i.c(((TdApi.TextEntityTypeTextUrl) textEntityType).url, ((TdApi.TextEntityTypeTextUrl) textEntityType2).url);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = textEntityType.toString();
                    k.d(object, "this.toString()");
                    throw new g("An operation is not implemented: " + object);
            }
        }
        return true;
    }

    public static final boolean M(TdApi.Thumbnail thumbnail, TdApi.Thumbnail thumbnail2) {
        boolean a02;
        if (thumbnail == thumbnail2) {
            return true;
        }
        if (thumbnail != null && thumbnail2 != null && thumbnail.width == thumbnail2.width && thumbnail.height == thumbnail2.height) {
            a02 = a0(thumbnail.file, thumbnail2.file, false, 2, null);
            if (a02) {
                TdApi.ThumbnailFormat thumbnailFormat = thumbnail.format;
                k.d(thumbnailFormat, "this.format");
                TdApi.ThumbnailFormat thumbnailFormat2 = thumbnail2.format;
                k.d(thumbnailFormat2, "b.format");
                if (e.k0(thumbnailFormat, thumbnailFormat2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean N(TdApi.ThumbnailFormat thumbnailFormat, TdApi.ThumbnailFormat thumbnailFormat2) {
        k.e(thumbnailFormat, "<this>");
        k.e(thumbnailFormat2, "b");
        return thumbnailFormat.getConstructor() == thumbnailFormat2.getConstructor();
    }

    public static final boolean O(TdApi.UserPrivacySettingRule userPrivacySettingRule, TdApi.UserPrivacySettingRule userPrivacySettingRule2) {
        k.e(userPrivacySettingRule, "<this>");
        k.e(userPrivacySettingRule2, "b");
        boolean z10 = false;
        if (userPrivacySettingRule != userPrivacySettingRule2) {
            if (userPrivacySettingRule.getConstructor() != userPrivacySettingRule2.getConstructor()) {
                return false;
            }
            switch (userPrivacySettingRule.getConstructor()) {
                case TdApi.UserPrivacySettingRuleAllowChatMembers.CONSTRUCTOR:
                    if ((userPrivacySettingRule instanceof TdApi.UserPrivacySettingRuleAllowChatMembers) && (userPrivacySettingRule2 instanceof TdApi.UserPrivacySettingRuleAllowChatMembers)) {
                        z10 = true;
                    }
                    if (z10) {
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
                        z10 = true;
                    }
                    if (z10) {
                        return Arrays.equals(((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds, ((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule2).chatIds);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.UserPrivacySettingRuleRestrictUsers.CONSTRUCTOR:
                    if ((userPrivacySettingRule instanceof TdApi.UserPrivacySettingRuleRestrictUsers) && (userPrivacySettingRule2 instanceof TdApi.UserPrivacySettingRuleRestrictUsers)) {
                        z10 = true;
                    }
                    if (z10) {
                        return Arrays.equals(((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule).userIds, ((TdApi.UserPrivacySettingRuleRestrictUsers) userPrivacySettingRule2).userIds);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.UserPrivacySettingRuleAllowUsers.CONSTRUCTOR:
                    if ((userPrivacySettingRule instanceof TdApi.UserPrivacySettingRuleAllowUsers) && (userPrivacySettingRule2 instanceof TdApi.UserPrivacySettingRuleAllowUsers)) {
                        z10 = true;
                    }
                    if (z10) {
                        return Arrays.equals(((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule).userIds, ((TdApi.UserPrivacySettingRuleAllowUsers) userPrivacySettingRule2).userIds);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = userPrivacySettingRule.toString();
                    k.d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean P(TdApi.UserStatus userStatus, TdApi.UserStatus userStatus2) {
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
                    k.d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean Q(TdApi.VectorPathCommand vectorPathCommand, TdApi.VectorPathCommand vectorPathCommand2) {
        if (vectorPathCommand != vectorPathCommand2) {
            if (vectorPathCommand == null || vectorPathCommand2 == null) {
                return false;
            }
            int constructor = vectorPathCommand.getConstructor();
            if (constructor == -614056822) {
                return e.c0(((TdApi.VectorPathCommandLine) vectorPathCommand).endPoint, ((TdApi.VectorPathCommandLine) vectorPathCommand2).endPoint);
            }
            if (constructor == 1229733434) {
                TdApi.VectorPathCommandCubicBezierCurve vectorPathCommandCubicBezierCurve = (TdApi.VectorPathCommandCubicBezierCurve) vectorPathCommand;
                TdApi.VectorPathCommandCubicBezierCurve vectorPathCommandCubicBezierCurve2 = (TdApi.VectorPathCommandCubicBezierCurve) vectorPathCommand2;
                if (!e.c0(vectorPathCommandCubicBezierCurve.endPoint, vectorPathCommandCubicBezierCurve2.endPoint) || !e.c0(vectorPathCommandCubicBezierCurve.startControlPoint, vectorPathCommandCubicBezierCurve2.startControlPoint) || !e.c0(vectorPathCommandCubicBezierCurve.endControlPoint, vectorPathCommandCubicBezierCurve2.endControlPoint)) {
                    return false;
                }
            } else {
                String object = vectorPathCommand.toString();
                k.d(object, "this.toString()");
                throw new g("An operation is not implemented: " + object);
            }
        }
        return true;
    }

    public static final boolean R(TdApi.Video video, TdApi.Video video2) {
        boolean a02;
        boolean c02;
        if (video == video2) {
            return true;
        }
        if (video != null && video2 != null && video.width == video2.width && video.height == video2.height && video.duration == video2.duration && video.supportsStreaming == video2.supportsStreaming && video.hasStickers == video2.hasStickers) {
            a02 = a0(video.video, video2.video, false, 2, null);
            if (a02 && i.c(video.fileName, video2.fileName) && i.c(video.mimeType, video2.mimeType) && e.j0(video.thumbnail, video2.thumbnail)) {
                c02 = c0(video.minithumbnail, video2.minithumbnail, false, 2, null);
                if (c02) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean S(TdApi.VideoNote videoNote, TdApi.VideoNote videoNote2) {
        boolean a02;
        boolean c02;
        if (videoNote == videoNote2) {
            return true;
        }
        if (videoNote != null && videoNote2 != null && videoNote.duration == videoNote2.duration && videoNote.length == videoNote2.length) {
            a02 = a0(videoNote.video, videoNote2.video, false, 2, null);
            if (a02 && e.j0(videoNote.thumbnail, videoNote2.thumbnail)) {
                c02 = c0(videoNote.minithumbnail, videoNote2.minithumbnail, false, 2, null);
                if (c02) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean T(TdApi.VoiceNote voiceNote, TdApi.VoiceNote voiceNote2, boolean z10) {
        boolean a02;
        boolean z11;
        if (voiceNote == voiceNote2) {
            return true;
        }
        if (voiceNote != null && voiceNote2 != null && voiceNote.duration == voiceNote2.duration && i.c(voiceNote.mimeType, voiceNote2.mimeType)) {
            a02 = a0(voiceNote.voice, voiceNote2.voice, false, 2, null);
            if (a02) {
                byte[] bArr = voiceNote.waveform;
                if (z10) {
                    z11 = Arrays.equals(bArr, voiceNote2.waveform);
                } else {
                    int length = bArr != null ? bArr.length : 0;
                    byte[] bArr2 = voiceNote2.waveform;
                    z11 = length == (bArr2 != null ? bArr2.length : 0);
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean U(TdApi.WebPage webPage, TdApi.WebPage webPage2) {
        boolean b02;
        boolean d02;
        if (webPage == webPage2) {
            return true;
        }
        if (webPage != null && webPage2 != null && webPage.instantViewVersion == webPage2.instantViewVersion && webPage.duration == webPage2.duration && webPage.embedWidth == webPage2.embedWidth && webPage.embedHeight == webPage2.embedHeight && i.c(webPage.embedType, webPage2.embedType) && i.c(webPage.embedUrl, webPage2.embedUrl) && i.c(webPage.type, webPage2.type) && i.c(webPage.url, webPage2.url) && i.c(webPage.displayUrl, webPage2.displayUrl) && i.c(webPage.siteName, webPage2.siteName) && i.c(webPage.title, webPage2.title)) {
            b02 = b0(webPage.description, webPage2.description, false, 2, null);
            if (b02 && i.c(webPage.author, webPage2.author) && e.a0(webPage.photo, webPage2.photo) && e.x(webPage.animation, webPage2.animation) && e.y(webPage.audio, webPage2.audio) && e.K(webPage.document, webPage2.document) && e.o0(webPage.video, webPage2.video) && e.p0(webPage.videoNote, webPage2.videoNote)) {
                d02 = d0(webPage.voiceNote, webPage2.voiceNote, false, 2, null);
                if (d02 && e.f0(webPage.sticker, webPage2.sticker)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean V(TdApi.ClosedVectorPath[] closedVectorPathArr, TdApi.ClosedVectorPath[] closedVectorPathArr2) {
        if (closedVectorPathArr != closedVectorPathArr2) {
            if (closedVectorPathArr == null || closedVectorPathArr2 == null || closedVectorPathArr.length != closedVectorPathArr2.length) {
                return false;
            }
            int i10 = 0;
            for (TdApi.ClosedVectorPath closedVectorPath : closedVectorPathArr) {
                i10++;
                if (!e.J(closedVectorPath, closedVectorPathArr2[i10])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean W(org.drinkless.td.libcore.telegram.TdApi.PhotoSize[] r8, org.drinkless.td.libcore.telegram.TdApi.PhotoSize[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: ob.j.W(org.drinkless.td.libcore.telegram.TdApi$PhotoSize[], org.drinkless.td.libcore.telegram.TdApi$PhotoSize[]):boolean");
    }

    public static final boolean X(TdApi.TextEntity[] textEntityArr, TdApi.TextEntity[] textEntityArr2, boolean z10) {
        boolean e02;
        if (textEntityArr == textEntityArr2) {
            return true;
        }
        if ((textEntityArr != null ? textEntityArr.length : 0) != (textEntityArr2 != null ? textEntityArr2.length : 0)) {
            return false;
        }
        if (!(textEntityArr == null || textEntityArr2 == null)) {
            if (z10) {
                e02 = e0(e.F0(textEntityArr), e.F0(textEntityArr2), false, 2, null);
                return e02;
            }
            int length = textEntityArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!e.h0(textEntityArr[i10], textEntityArr2[i10])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean Y(TdApi.VectorPathCommand[] vectorPathCommandArr, TdApi.VectorPathCommand[] vectorPathCommandArr2) {
        if (vectorPathCommandArr != vectorPathCommandArr2) {
            if (vectorPathCommandArr == null || vectorPathCommandArr2 == null || vectorPathCommandArr.length != vectorPathCommandArr2.length) {
                return false;
            }
            int i10 = 0;
            for (TdApi.VectorPathCommand vectorPathCommand : vectorPathCommandArr) {
                i10++;
                if (!e.n0(vectorPathCommand, vectorPathCommandArr2[i10])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Z(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e.M(draftMessage, draftMessage2, z10);
    }

    public static final boolean a(TdApi.Animation animation, TdApi.Animation animation2) {
        boolean a02;
        boolean c02;
        if (animation == animation2) {
            return true;
        }
        if (animation != null && animation2 != null && animation.width == animation2.width && animation.height == animation2.height && animation.duration == animation2.duration && animation.hasStickers == animation2.hasStickers) {
            a02 = a0(animation.animation, animation2.animation, false, 2, null);
            if (a02 && i.c(animation.mimeType, animation2.mimeType) && i.c(animation.fileName, animation2.fileName)) {
                c02 = c0(animation.minithumbnail, animation2.minithumbnail, false, 2, null);
                if (c02 && e.j0(animation.thumbnail, animation2.thumbnail)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a0(TdApi.File file, TdApi.File file2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return e.N(file, file2, z10);
    }

    public static final boolean b(TdApi.Audio audio, TdApi.Audio audio2) {
        boolean a02;
        boolean c02;
        if (audio == audio2) {
            return true;
        }
        if (audio != null && audio2 != null && audio.duration == audio2.duration && i.c(audio.title, audio2.title) && i.c(audio.performer, audio2.performer) && i.c(audio.mimeType, audio2.mimeType) && i.c(audio.fileName, audio2.fileName)) {
            a02 = a0(audio.audio, audio2.audio, false, 2, null);
            if (a02 && e.j0(audio.albumCoverThumbnail, audio2.albumCoverThumbnail)) {
                c02 = c0(audio.albumCoverMinithumbnail, audio2.albumCoverMinithumbnail, false, 2, null);
                if (c02) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b0(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e.P(formattedText, formattedText2, z10);
    }

    public static final boolean c(TdApi.BackgroundFill backgroundFill, TdApi.BackgroundFill backgroundFill2) {
        boolean z10 = false;
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
                    z10 = true;
                }
                if (z10) {
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
                k.d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static boolean c0(TdApi.Minithumbnail minithumbnail, TdApi.Minithumbnail minithumbnail2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e.Z(minithumbnail, minithumbnail2, z10);
    }

    public static final boolean d(TdApi.BackgroundType backgroundType, TdApi.BackgroundType backgroundType2, boolean z10) {
        boolean z11 = false;
        if (backgroundType != backgroundType2) {
            if (backgroundType == null || backgroundType2 == null || backgroundType.getConstructor() != backgroundType2.getConstructor()) {
                return false;
            }
            int constructor = backgroundType.getConstructor();
            if (constructor == 993008684) {
                if ((backgroundType instanceof TdApi.BackgroundTypeFill) && (backgroundType2 instanceof TdApi.BackgroundTypeFill)) {
                    z11 = true;
                }
                if (z11) {
                    return e.z(((TdApi.BackgroundTypeFill) backgroundType).fill, ((TdApi.BackgroundTypeFill) backgroundType2).fill);
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (constructor == 1290213117) {
                if ((backgroundType instanceof TdApi.BackgroundTypePattern) && (backgroundType2 instanceof TdApi.BackgroundTypePattern)) {
                    TdApi.BackgroundTypePattern backgroundTypePattern = (TdApi.BackgroundTypePattern) backgroundType;
                    TdApi.BackgroundTypePattern backgroundTypePattern2 = (TdApi.BackgroundTypePattern) backgroundType2;
                    if (!e.z(backgroundTypePattern.fill, backgroundTypePattern2.fill)) {
                        return false;
                    }
                    if (!z10 && (backgroundTypePattern.intensity != backgroundTypePattern2.intensity || backgroundTypePattern.isMoving != backgroundTypePattern2.isMoving)) {
                        return false;
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (constructor == 1972128891) {
                if (!((backgroundType instanceof TdApi.BackgroundTypeWallpaper) && (backgroundType2 instanceof TdApi.BackgroundTypeWallpaper))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (!z10) {
                    TdApi.BackgroundTypeWallpaper backgroundTypeWallpaper = (TdApi.BackgroundTypeWallpaper) backgroundType;
                    TdApi.BackgroundTypeWallpaper backgroundTypeWallpaper2 = (TdApi.BackgroundTypeWallpaper) backgroundType2;
                    if (!(backgroundTypeWallpaper.isBlurred == backgroundTypeWallpaper2.isBlurred && backgroundTypeWallpaper.isMoving == backgroundTypeWallpaper2.isMoving)) {
                        return false;
                    }
                }
            } else {
                String object = backgroundType.toString();
                k.d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static boolean d0(TdApi.VoiceNote voiceNote, TdApi.VoiceNote voiceNote2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e.q0(voiceNote, voiceNote2, z10);
    }

    public static final boolean e(TdApi.ChatAction chatAction, TdApi.ChatAction chatAction2) {
        k.e(chatAction, "<this>");
        k.e(chatAction2, "b");
        boolean z10 = false;
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
                        z10 = true;
                    }
                    if (z10) {
                        return k.b(((TdApi.ChatActionWatchingAnimations) chatAction).emoji, ((TdApi.ChatActionWatchingAnimations) chatAction2).emoji);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = chatAction.toString();
                    k.d(object, "this.toString()");
                    throw new g("An operation is not implemented: " + object);
            }
        }
        return true;
    }

    public static boolean e0(TdApi.TextEntity[] textEntityArr, TdApi.TextEntity[] textEntityArr2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e.u0(textEntityArr, textEntityArr2, z10);
    }

    public static final boolean f(TdApi.ChatAdministratorRights chatAdministratorRights, TdApi.ChatAdministratorRights chatAdministratorRights2) {
        return chatAdministratorRights == chatAdministratorRights2 || (chatAdministratorRights != null && chatAdministratorRights2 != null && chatAdministratorRights.canManageChat == chatAdministratorRights2.canManageChat && chatAdministratorRights.canChangeInfo == chatAdministratorRights2.canChangeInfo && chatAdministratorRights.canPostMessages == chatAdministratorRights2.canPostMessages && chatAdministratorRights.canEditMessages == chatAdministratorRights2.canEditMessages && chatAdministratorRights.canDeleteMessages == chatAdministratorRights2.canDeleteMessages && chatAdministratorRights.canInviteUsers == chatAdministratorRights2.canInviteUsers && chatAdministratorRights.canRestrictMembers == chatAdministratorRights2.canRestrictMembers && chatAdministratorRights.canPinMessages == chatAdministratorRights2.canPinMessages && chatAdministratorRights.canPromoteMembers == chatAdministratorRights2.canPromoteMembers && chatAdministratorRights.canManageVideoChats == chatAdministratorRights2.canManageVideoChats && chatAdministratorRights.isAnonymous == chatAdministratorRights2.isAnonymous);
    }

    public static final boolean g(TdApi.ChatEventLogFilters chatEventLogFilters, TdApi.ChatEventLogFilters chatEventLogFilters2) {
        if ((chatEventLogFilters != null ? chatEventLogFilters.messageEdits : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.messageEdits : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.messageDeletions : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.messageDeletions : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.messagePins : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.messagePins : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.memberJoins : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.memberJoins : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.memberLeaves : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.memberLeaves : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.memberInvites : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.memberInvites : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.memberPromotions : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.memberPromotions : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.memberRestrictions : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.memberRestrictions : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.infoChanges : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.infoChanges : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.settingChanges : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.settingChanges : false)) {
            return false;
        }
        if ((chatEventLogFilters != null ? chatEventLogFilters.inviteLinkChanges : false) != (chatEventLogFilters2 != null ? chatEventLogFilters2.inviteLinkChanges : false)) {
            return false;
        }
        return (chatEventLogFilters != null ? chatEventLogFilters.videoChatChanges : false) == (chatEventLogFilters2 != null ? chatEventLogFilters2.videoChatChanges : false);
    }

    public static final boolean h(TdApi.ChatList chatList, TdApi.ChatList chatList2) {
        if (chatList != chatList2) {
            if (chatList == null || chatList2 == null || chatList.getConstructor() != chatList2.getConstructor()) {
                return false;
            }
            int constructor = chatList.getConstructor();
            if (constructor != -2022707655) {
                if (!(constructor == -400991316 || constructor == 362770115)) {
                    String object = chatList.toString();
                    k.d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
                }
            } else if (((TdApi.ChatListFilter) chatList).chatFilterId != ((TdApi.ChatListFilter) chatList2).chatFilterId) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i(TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2) {
        k.e(chatMemberStatus, "<this>");
        k.e(chatMemberStatus2, "b");
        boolean z10 = false;
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
                        if (chatMemberStatusCreator.isMember != chatMemberStatusCreator2.isMember || !i.c(chatMemberStatusCreator.customTitle, chatMemberStatusCreator2.customTitle)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                    if ((chatMemberStatus instanceof TdApi.ChatMemberStatusAdministrator) && (chatMemberStatus2 instanceof TdApi.ChatMemberStatusAdministrator)) {
                        z10 = true;
                    }
                    if (z10) {
                        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) chatMemberStatus;
                        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator2 = (TdApi.ChatMemberStatusAdministrator) chatMemberStatus2;
                        e.C(chatMemberStatusAdministrator.rights, chatMemberStatusAdministrator2.rights);
                        return i.c(chatMemberStatusAdministrator.customTitle, chatMemberStatusAdministrator2.customTitle);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                    break;
                case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                    if ((chatMemberStatus instanceof TdApi.ChatMemberStatusRestricted) && (chatMemberStatus2 instanceof TdApi.ChatMemberStatusRestricted)) {
                        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) chatMemberStatus;
                        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted2 = (TdApi.ChatMemberStatusRestricted) chatMemberStatus2;
                        if (chatMemberStatusRestricted.isMember != chatMemberStatusRestricted2.isMember || chatMemberStatusRestricted.restrictedUntilDate != chatMemberStatusRestricted2.restrictedUntilDate) {
                            return false;
                        }
                        TdApi.ChatPermissions chatPermissions = chatMemberStatusRestricted.permissions;
                        k.d(chatPermissions, "this.permissions");
                        TdApi.ChatPermissions chatPermissions2 = chatMemberStatusRestricted2.permissions;
                        k.d(chatPermissions2, "b.permissions");
                        if (!e.G(chatPermissions, chatPermissions2)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                default:
                    String object = chatMemberStatus.toString();
                    k.d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean j(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2) {
        k.e(chatPermissions, "<this>");
        k.e(chatPermissions2, "b");
        return chatPermissions == chatPermissions2 || (chatPermissions.canSendMessages == chatPermissions2.canSendMessages && chatPermissions.canSendMediaMessages == chatPermissions2.canSendMediaMessages && chatPermissions.canSendOtherMessages == chatPermissions2.canSendOtherMessages && chatPermissions.canAddWebPagePreviews == chatPermissions2.canAddWebPagePreviews && chatPermissions.canSendPolls == chatPermissions2.canSendPolls && chatPermissions.canInviteUsers == chatPermissions2.canInviteUsers && chatPermissions.canPinMessages == chatPermissions2.canPinMessages && chatPermissions.canChangeInfo == chatPermissions2.canChangeInfo);
    }

    public static final boolean k(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2, TdApi.ChatPermissions chatPermissions3) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        k.e(chatPermissions, "<this>");
        k.e(chatPermissions2, "old");
        k.e(chatPermissions3, "defaultPermissions");
        return chatPermissions == chatPermissions2 || (((z10 = chatPermissions.canSendMessages) == chatPermissions2.canSendMessages || (!z10 && !chatPermissions3.canSendMessages)) && (((z11 = chatPermissions.canSendMediaMessages) == chatPermissions2.canSendMediaMessages || (!z11 && !chatPermissions3.canSendMediaMessages)) && (((z12 = chatPermissions.canSendOtherMessages) == chatPermissions2.canSendOtherMessages || (!z12 && !chatPermissions3.canSendOtherMessages)) && (((z13 = chatPermissions.canAddWebPagePreviews) == chatPermissions2.canAddWebPagePreviews || (!z13 && !chatPermissions3.canAddWebPagePreviews)) && (((z14 = chatPermissions.canSendPolls) == chatPermissions2.canSendPolls || (!z14 && !chatPermissions3.canSendPolls)) && (((z15 = chatPermissions.canInviteUsers) == chatPermissions2.canInviteUsers || (!z15 && !chatPermissions3.canInviteUsers)) && (((z16 = chatPermissions.canPinMessages) == chatPermissions2.canPinMessages || (!z16 && !chatPermissions3.canPinMessages)) && ((z17 = chatPermissions.canChangeInfo) == chatPermissions2.canChangeInfo || (!z17 && !chatPermissions3.canChangeInfo)))))))));
    }

    public static final boolean l(TdApi.ChatSource chatSource, TdApi.ChatSource chatSource2) {
        if (chatSource != chatSource2) {
            if (chatSource == null || chatSource2 == null || chatSource.getConstructor() != chatSource2.getConstructor()) {
                return false;
            }
            int constructor = chatSource.getConstructor();
            if (constructor == -328571244) {
                if ((chatSource instanceof TdApi.ChatSourcePublicServiceAnnouncement) && (chatSource2 instanceof TdApi.ChatSourcePublicServiceAnnouncement)) {
                    TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement = (TdApi.ChatSourcePublicServiceAnnouncement) chatSource;
                    TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement2 = (TdApi.ChatSourcePublicServiceAnnouncement) chatSource2;
                    if (!i.c(chatSourcePublicServiceAnnouncement.type, chatSourcePublicServiceAnnouncement2.type) || !i.c(chatSourcePublicServiceAnnouncement.text, chatSourcePublicServiceAnnouncement2.text)) {
                        return false;
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (constructor != 394074115) {
                String object = chatSource.toString();
                k.d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean m(TdApi.ClosedVectorPath closedVectorPath, TdApi.ClosedVectorPath closedVectorPath2) {
        if (closedVectorPath != closedVectorPath2) {
            TdApi.VectorPathCommand[] vectorPathCommandArr = null;
            TdApi.VectorPathCommand[] vectorPathCommandArr2 = closedVectorPath != null ? closedVectorPath.commands : null;
            if (closedVectorPath2 != null) {
                vectorPathCommandArr = closedVectorPath2.commands;
            }
            if (!e.v0(vectorPathCommandArr2, vectorPathCommandArr)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(TdApi.Document document, TdApi.Document document2) {
        boolean a02;
        boolean c02;
        if (document == document2) {
            return true;
        }
        if (!(document == null || document2 == null)) {
            a02 = a0(document.document, document2.document, false, 2, null);
            if (a02 && i.c(document.mimeType, document2.mimeType) && i.c(document.fileName, document2.fileName)) {
                c02 = c0(document.minithumbnail, document2.minithumbnail, false, 2, null);
                if (c02 && e.j0(document.thumbnail, document2.thumbnail)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean o(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2) {
        boolean Z;
        Z = Z(draftMessage, draftMessage2, false, 2, null);
        return Z;
    }

    public static final boolean p(TdApi.DraftMessage draftMessage, TdApi.DraftMessage draftMessage2, boolean z10) {
        if (draftMessage != draftMessage2) {
            if (draftMessage == null || draftMessage2 == null) {
                return false;
            }
            if ((draftMessage.date != draftMessage2.date && !z10) || draftMessage.replyToMessageId != draftMessage2.replyToMessageId || !e.S(draftMessage.inputMessageText, draftMessage2.inputMessageText)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean q(TdApi.File file, TdApi.File file2, boolean z10) {
        if (file != file2) {
            if (file == null || file2 == null) {
                return false;
            }
            if (z10) {
                if (file.f19913id != file2.f19913id) {
                    return false;
                }
            } else if (!(file.f19913id == file2.f19913id && file.size == file2.size && file.expectedSize == file2.expectedSize && e.V(file.local, file2.local) && e.d0(file.remote, file2.remote))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean r(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2) {
        boolean b02;
        b02 = b0(formattedText, formattedText2, false, 2, null);
        return b02;
    }

    public static final boolean s(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2, boolean z10) {
        if (formattedText == formattedText2) {
            return true;
        }
        return e.c1(formattedText) ? e.c1(formattedText2) : !e.c1(formattedText2) && i.c(formattedText.text, formattedText2.text) && e.u0(formattedText.entities, formattedText2.entities, z10);
    }

    public static final boolean t(TdApi.InlineKeyboardButton inlineKeyboardButton, TdApi.InlineKeyboardButton inlineKeyboardButton2) {
        k.e(inlineKeyboardButton, "<this>");
        k.e(inlineKeyboardButton2, "b");
        if (inlineKeyboardButton != inlineKeyboardButton2) {
            if (k.b(inlineKeyboardButton.text, inlineKeyboardButton2.text)) {
                TdApi.InlineKeyboardButtonType inlineKeyboardButtonType = inlineKeyboardButton.type;
                k.d(inlineKeyboardButtonType, "this.type");
                TdApi.InlineKeyboardButtonType inlineKeyboardButtonType2 = inlineKeyboardButton2.type;
                k.d(inlineKeyboardButtonType2, "b.type");
                if (e.R(inlineKeyboardButtonType, inlineKeyboardButtonType2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean u(TdApi.InlineKeyboardButtonType inlineKeyboardButtonType, TdApi.InlineKeyboardButtonType inlineKeyboardButtonType2) {
        k.e(inlineKeyboardButtonType, "<this>");
        k.e(inlineKeyboardButtonType2, "b");
        boolean z10 = false;
        if (inlineKeyboardButtonType != inlineKeyboardButtonType2) {
            if (inlineKeyboardButtonType.getConstructor() != inlineKeyboardButtonType2.getConstructor()) {
                return false;
            }
            switch (inlineKeyboardButtonType.getConstructor()) {
                case TdApi.InlineKeyboardButtonTypeSwitchInline.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeSwitchInline) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeSwitchInline)) {
                        TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline = (TdApi.InlineKeyboardButtonTypeSwitchInline) inlineKeyboardButtonType;
                        TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline2 = (TdApi.InlineKeyboardButtonTypeSwitchInline) inlineKeyboardButtonType2;
                        if (inlineKeyboardButtonTypeSwitchInline.inCurrentChat != inlineKeyboardButtonTypeSwitchInline2.inCurrentChat || !k.b(inlineKeyboardButtonTypeSwitchInline.query, inlineKeyboardButtonTypeSwitchInline2.query)) {
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
                        if (inlineKeyboardButtonTypeLoginUrl.f19918id != inlineKeyboardButtonTypeLoginUrl2.f19918id || !k.b(inlineKeyboardButtonTypeLoginUrl.url, inlineKeyboardButtonTypeLoginUrl2.url) || !k.b(inlineKeyboardButtonTypeLoginUrl.forwardText, inlineKeyboardButtonTypeLoginUrl2.forwardText)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    break;
                case TdApi.InlineKeyboardButtonTypeCallback.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeCallback) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeCallback)) {
                        z10 = true;
                    }
                    if (z10) {
                        return Arrays.equals(((TdApi.InlineKeyboardButtonTypeCallback) inlineKeyboardButtonType).data, ((TdApi.InlineKeyboardButtonTypeCallback) inlineKeyboardButtonType2).data);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.InlineKeyboardButtonTypeCallbackGame.CONSTRUCTOR:
                case TdApi.InlineKeyboardButtonTypeBuy.CONSTRUCTOR:
                    break;
                case TdApi.InlineKeyboardButtonTypeCallbackWithPassword.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeCallbackWithPassword) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeCallbackWithPassword)) {
                        z10 = true;
                    }
                    if (z10) {
                        return Arrays.equals(((TdApi.InlineKeyboardButtonTypeCallbackWithPassword) inlineKeyboardButtonType).data, ((TdApi.InlineKeyboardButtonTypeCallbackWithPassword) inlineKeyboardButtonType2).data);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                case TdApi.InlineKeyboardButtonTypeUrl.CONSTRUCTOR:
                    if ((inlineKeyboardButtonType instanceof TdApi.InlineKeyboardButtonTypeUrl) && (inlineKeyboardButtonType2 instanceof TdApi.InlineKeyboardButtonTypeUrl)) {
                        z10 = true;
                    }
                    if (z10) {
                        return k.b(((TdApi.InlineKeyboardButtonTypeUrl) inlineKeyboardButtonType).url, ((TdApi.InlineKeyboardButtonTypeUrl) inlineKeyboardButtonType2).url);
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                default:
                    String object = inlineKeyboardButtonType.toString();
                    k.d(object, "this.toString()");
                    throw new IllegalStateException(object.toString());
            }
        }
        return true;
    }

    public static final boolean v(TdApi.InputMessageContent inputMessageContent, TdApi.InputMessageContent inputMessageContent2) {
        boolean b02;
        if (inputMessageContent == inputMessageContent2) {
            return true;
        }
        if (!(inputMessageContent == null || inputMessageContent2 == null || inputMessageContent.getConstructor() != inputMessageContent2.getConstructor())) {
            if (inputMessageContent.getConstructor() == 247050392) {
                TdApi.InputMessageText inputMessageText = (TdApi.InputMessageText) inputMessageContent;
                TdApi.InputMessageText inputMessageText2 = (TdApi.InputMessageText) inputMessageContent2;
                b02 = b0(inputMessageText.text, inputMessageText2.text, false, 2, null);
                if (b02 && inputMessageText.clearDraft == inputMessageText2.clearDraft && inputMessageText.disableWebPagePreview == inputMessageText2.disableWebPagePreview) {
                    return true;
                }
            } else {
                String object = inputMessageContent.toString();
                k.d(object, "this.toString()");
                throw new g("An operation is not implemented: " + object);
            }
        }
        return false;
    }

    public static final boolean w(TdApi.KeyboardButton keyboardButton, TdApi.KeyboardButton keyboardButton2) {
        k.e(keyboardButton, "<this>");
        k.e(keyboardButton2, "b");
        if (keyboardButton != keyboardButton2) {
            if (k.b(keyboardButton.text, keyboardButton2.text)) {
                TdApi.KeyboardButtonType keyboardButtonType = keyboardButton.type;
                k.d(keyboardButtonType, "this.type");
                TdApi.KeyboardButtonType keyboardButtonType2 = keyboardButton2.type;
                k.d(keyboardButtonType2, "b.type");
                if (e.U(keyboardButtonType, keyboardButtonType2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean x(TdApi.KeyboardButtonType keyboardButtonType, TdApi.KeyboardButtonType keyboardButtonType2) {
        k.e(keyboardButtonType, "<this>");
        k.e(keyboardButtonType2, "b");
        if (keyboardButtonType != keyboardButtonType2) {
            if (keyboardButtonType.getConstructor() == keyboardButtonType2.getConstructor()) {
                switch (keyboardButtonType.getConstructor()) {
                    case TdApi.KeyboardButtonTypeText.CONSTRUCTOR:
                    case TdApi.KeyboardButtonTypeRequestPhoneNumber.CONSTRUCTOR:
                    case TdApi.KeyboardButtonTypeRequestLocation.CONSTRUCTOR:
                        break;
                    default:
                        String object = keyboardButtonType.toString();
                        k.d(object, "this.toString()");
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

    public static final boolean y(TdApi.LocalFile localFile, TdApi.LocalFile localFile2) {
        return localFile == localFile2 || (localFile != null && localFile2 != null && localFile.downloadedSize == localFile2.downloadedSize && localFile.downloadOffset == localFile2.downloadOffset && localFile.downloadedPrefixSize == localFile2.downloadedPrefixSize && localFile.isDownloadingActive == localFile2.isDownloadingActive && localFile.isDownloadingCompleted == localFile2.isDownloadingCompleted && localFile.canBeDeleted == localFile2.canBeDeleted && localFile.canBeDownloaded == localFile2.canBeDownloaded && i.c(localFile.path, localFile2.path));
    }

    public static final boolean z(TdApi.MaskPoint maskPoint, TdApi.MaskPoint maskPoint2) {
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
                k.d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
        }
    }
}
