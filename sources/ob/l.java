package ob;

import ab.e;
import ab.n;
import android.graphics.Path;
import android.net.Uri;
import ia.g;
import ib.i;
import ja.a0;
import java.util.ArrayList;
import java.util.Objects;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import ra.k;

public final class l {
    public static final String A(TdApi.FormattedText formattedText) {
        if (formattedText != null) {
            String str = formattedText.text;
            if (!(str == null || str.length() == 0)) {
                return formattedText.text;
            }
        }
        return null;
    }

    public static final boolean B(TdApi.FormattedText formattedText) {
        if ((formattedText != null ? formattedText.entities : null) != null) {
            TdApi.TextEntity[] textEntityArr = formattedText.entities;
            k.d(textEntityArr, "this.entities");
            for (TdApi.TextEntity textEntity : textEntityArr) {
                int constructor = textEntity.type.getConstructor();
                if (constructor == -1312762756 || constructor == 445719651 || constructor == 1425545249) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean C(TdApi.StickerType stickerType) {
        Integer valueOf = stickerType != null ? Integer.valueOf(stickerType.getConstructor()) : null;
        if (valueOf != null && valueOf.intValue() == 1763255981) {
            return true;
        }
        return valueOf != null && valueOf.intValue() == 522366836;
    }

    public static final boolean D(TdApi.ChatMemberStatus chatMemberStatus) {
        Integer valueOf = chatMemberStatus != null ? Integer.valueOf(chatMemberStatus.getConstructor()) : null;
        if (valueOf != null && valueOf.intValue() == -160019714) {
            Objects.requireNonNull(chatMemberStatus, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.ChatMemberStatusCreator");
            return ((TdApi.ChatMemberStatusCreator) chatMemberStatus).isAnonymous;
        } else if (valueOf == null || valueOf.intValue() != -70024163) {
            return false;
        } else {
            Objects.requireNonNull(chatMemberStatus, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.ChatMemberStatusAdministrator");
            return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).rights.isAnonymous;
        }
    }

    public static final boolean E(TdApi.LanguagePackInfo languagePackInfo) {
        if (languagePackInfo != null) {
            return languagePackInfo.isBeta;
        }
        return false;
    }

    public static final boolean F(TdApi.InlineKeyboardButtonTypeCallbackWithPassword inlineKeyboardButtonTypeCallbackWithPassword) {
        k.e(inlineKeyboardButtonTypeCallbackWithPassword, "<this>");
        try {
            byte[] bArr = inlineKeyboardButtonTypeCallbackWithPassword.data;
            k.d(bArr, "this.data");
            return new e("^bots/[0-9]+/trsf/.+$").a(new String(bArr, i.f14176a));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static final boolean G(TdApi.TextEntityType textEntityType) {
        Integer valueOf = textEntityType != null ? Integer.valueOf(textEntityType.getConstructor()) : null;
        return !((((((valueOf != null && valueOf.intValue() == 105986320) || (valueOf != null && valueOf.intValue() == -1023958307)) || (valueOf != null && valueOf.intValue() == 1222915915)) || (valueOf != null && valueOf.intValue() == 934535013)) || (valueOf != null && valueOf.intValue() == -1312762756)) || (valueOf != null && valueOf.intValue() == -1841898992)) && valueOf != null;
    }

    public static final boolean H(TdApi.LanguagePackInfo languagePackInfo) {
        if (languagePackInfo == null || languagePackInfo.isOfficial) {
            return false;
        }
        return languagePackInfo.isInstalled || e.h1(languagePackInfo);
    }

    public static final boolean I(TdApi.LanguagePackInfo languagePackInfo) {
        String str = languagePackInfo != null ? languagePackInfo.f19945id : null;
        k.c(str);
        return n.x(str, "X", false, 2, null);
    }

    public static final boolean J(TdApi.MessageContent messageContent) {
        k.e(messageContent, "<this>");
        switch (messageContent.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return ((TdApi.MessagePhoto) messageContent).isSecret;
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return ((TdApi.MessageVideoNote) messageContent).isSecret;
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return ((TdApi.MessageAnimation) messageContent).isSecret;
            case TdApi.MessageVideo.CONSTRUCTOR:
                return ((TdApi.MessageVideo) messageContent).isSecret;
            default:
                return false;
        }
    }

    public static final boolean K(TdApi.ChatInviteLink chatInviteLink) {
        k.e(chatInviteLink, "<this>");
        return (chatInviteLink.expirationDate == 0 && chatInviteLink.memberCount == 0 && chatInviteLink.memberLimit == 0) ? false : true;
    }

    public static final boolean L(TdApi.Message message, TdApi.SearchMessagesFilter searchMessagesFilter) {
        if (message == null || searchMessagesFilter == null) {
            return true;
        }
        switch (searchMessagesFilter.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                if (message.content.getConstructor() == 1989037971) {
                    TdApi.MessageContent messageContent = message.content;
                    Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageText");
                    if (((TdApi.MessageText) messageContent).webPage != null) {
                        return true;
                    }
                }
                if (e.W0(e.y1(message.content))) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterChatPhoto.CONSTRUCTOR:
                if (message.content.getConstructor() == -813415093) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterEmpty.CONSTRUCTOR:
                return true;
            case TdApi.SearchMessagesFilterFailedToSend.CONSTRUCTOR:
                TdApi.MessageSendingState messageSendingState = message.sendingState;
                if (messageSendingState != null && messageSendingState.getConstructor() == -1741887228) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                if (message.content.getConstructor() == 1306939396) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterUnreadMention.CONSTRUCTOR:
                return message.containsUnreadMention;
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                if (message.content.getConstructor() == 2021281344) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterPinned.CONSTRUCTOR:
                return message.isPinned;
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                if (message.content.getConstructor() == 963323014) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR:
                int constructor = message.content.getConstructor();
                if (constructor == 527777781 || constructor == 963323014) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                if (message.content.getConstructor() == 276722716) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                if (message.content.getConstructor() == -1851395174) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                int constructor2 = message.content.getConstructor();
                if (constructor2 == -1851395174 || constructor2 == 2021281344) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                if (message.content.getConstructor() == 596945783) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                if (message.content.getConstructor() == 527777781) {
                    return true;
                }
                break;
            case TdApi.SearchMessagesFilterMention.CONSTRUCTOR:
                break;
            default:
                String object = searchMessagesFilter.toString();
                k.d(object, "filter.toString()");
                throw new g("An operation is not implemented: " + object);
        }
        return false;
    }

    public static final boolean M(TdApi.ChatType chatType, TdApi.NotificationSettingsScope notificationSettingsScope) {
        k.e(chatType, "<this>");
        k.e(notificationSettingsScope, "scope");
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor != 548013448) {
            if (constructor != 937446759) {
                if (constructor != 1212142067) {
                    String object = notificationSettingsScope.toString();
                    k.d(object, "scope.toString()");
                    throw new g("An operation is not implemented: " + object);
                } else if (chatType.getConstructor() == 973884508) {
                    return true;
                } else {
                    if (chatType.getConstructor() == -1472570774 && !((TdApi.ChatTypeSupergroup) chatType).isChannel) {
                        return true;
                    }
                }
            } else if (chatType.getConstructor() == 1579049844 || chatType.getConstructor() == 862366513) {
                return true;
            }
        } else if (chatType.getConstructor() == -1472570774 && ((TdApi.ChatTypeSupergroup) chatType).isChannel) {
            return true;
        }
        return false;
    }

    public static final boolean N(TdApi.FormattedText formattedText) {
        k.e(formattedText, "<this>");
        TdApi.Object e10 = Client.e(new TdApi.ParseMarkdown(formattedText));
        if (e10 instanceof TdApi.FormattedText) {
            TdApi.FormattedText formattedText2 = (TdApi.FormattedText) e10;
            if (!e.P(formattedText2, formattedText, true)) {
                formattedText.text = formattedText2.text;
                formattedText.entities = formattedText2.entities;
                return true;
            }
        }
        return false;
    }

    public static final String O(String str, TdApi.TextEntity textEntity) {
        k.e(str, "<this>");
        if (textEntity == null) {
            return null;
        }
        int i10 = textEntity.offset;
        String substring = str.substring(i10, textEntity.length + i10);
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final TdApi.FormattedText P(TdApi.FormattedText formattedText, int i10) {
        TdApi.FormattedText R;
        k.e(formattedText, "<this>");
        R = R(formattedText, i10, 0, 2, null);
        return R;
    }

    public static final TdApi.FormattedText Q(TdApi.FormattedText formattedText, int i10, int i11) {
        k.e(formattedText, "<this>");
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        boolean z10 = true;
        if (textEntityArr != null) {
            if (!(textEntityArr.length == 0)) {
                z10 = false;
            }
        }
        TdApi.TextEntity[] textEntityArr2 = null;
        if (!z10) {
            k.d(textEntityArr, "entities");
            ArrayList arrayList = null;
            for (TdApi.TextEntity textEntity : textEntityArr) {
                int i12 = textEntity.offset;
                if (textEntity.length + i12 > i10 && i12 < i11) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    int i13 = textEntity.offset - i10;
                    int i14 = textEntity.length;
                    if (i13 < 0) {
                        i14 += i13;
                        i13 = 0;
                    }
                    int i15 = i13 + i14;
                    if (i15 > formattedText.text.length()) {
                        i14 -= i15 - formattedText.text.length();
                    }
                    arrayList.add(new TdApi.TextEntity(i13, i14, textEntity.type));
                }
            }
            if (arrayList != null) {
                Object[] array = arrayList.toArray(new TdApi.TextEntity[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textEntityArr2 = (TdApi.TextEntity[]) array;
            }
        } else {
            textEntityArr2 = new TdApi.TextEntity[0];
        }
        String str = formattedText.text;
        k.d(str, "this.text");
        String substring = str.substring(i10, i11);
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new TdApi.FormattedText(substring, textEntityArr2);
    }

    public static TdApi.FormattedText R(TdApi.FormattedText formattedText, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = formattedText.text.length();
        }
        return e.w1(formattedText, i10, i11);
    }

    public static final TdApi.FormattedText S(TdApi.MessageContent messageContent) {
        Integer valueOf = messageContent != null ? Integer.valueOf(messageContent.getConstructor()) : null;
        if (valueOf != null && valueOf.intValue() == 1989037971) {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageText");
            return ((TdApi.MessageText) messageContent).text;
        } else if (valueOf != null && valueOf.intValue() == 908195298) {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageAnimatedEmoji");
            return new TdApi.FormattedText(((TdApi.MessageAnimatedEmoji) messageContent).emoji, new TdApi.TextEntity[0]);
        } else if (valueOf != null && valueOf.intValue() == -1851395174) {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessagePhoto");
            return ((TdApi.MessagePhoto) messageContent).caption;
        } else if (valueOf != null && valueOf.intValue() == 2021281344) {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageVideo");
            return ((TdApi.MessageVideo) messageContent).caption;
        } else if (valueOf != null && valueOf.intValue() == 596945783) {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageDocument");
            return ((TdApi.MessageDocument) messageContent).caption;
        } else if (valueOf != null && valueOf.intValue() == 1306939396) {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageAnimation");
            return ((TdApi.MessageAnimation) messageContent).caption;
        } else if (valueOf != null && valueOf.intValue() == 527777781) {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageVoiceNote");
            return ((TdApi.MessageVoiceNote) messageContent).caption;
        } else if (valueOf == null || valueOf.intValue() != 276722716) {
            return null;
        } else {
            Objects.requireNonNull(messageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageAudio");
            return ((TdApi.MessageAudio) messageContent).caption;
        }
    }

    public static final TdApi.FormattedText T(TdApi.FormattedText formattedText) {
        if (formattedText == null || e.c1(formattedText)) {
            return formattedText;
        }
        boolean z10 = true;
        int length = formattedText.text.length() - 1;
        int i10 = 0;
        boolean z11 = false;
        while (i10 <= length) {
            boolean isWhitespace = Character.isWhitespace(formattedText.text.charAt(!z11 ? i10 : length));
            if (!z11) {
                if (!isWhitespace) {
                    z11 = true;
                } else {
                    i10++;
                }
            } else if (!isWhitespace) {
                break;
            } else {
                length--;
            }
        }
        int i11 = length + 1;
        if (i10 == 0 && i11 == formattedText.text.length()) {
            return formattedText;
        }
        String str = formattedText.text;
        k.d(str, "this.text");
        String substring = str.substring(i10, i11);
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr != null) {
            if (!(textEntityArr.length == 0)) {
                z10 = false;
            }
        }
        if (!z10) {
            int length2 = textEntityArr.length;
            textEntityArr = new TdApi.TextEntity[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                TdApi.TextEntity textEntity = formattedText.entities[i12];
                if (i10 != 0 || textEntity.offset + textEntity.length > i11) {
                    int i13 = textEntity.offset;
                    int i14 = textEntity.length;
                    textEntity = new TdApi.TextEntity(i13 - i10, i14 - Math.max(0, (i13 + i14) - i11), textEntity.type);
                }
                textEntityArr[i12] = textEntity;
            }
        }
        return new TdApi.FormattedText(substring, textEntityArr);
    }

    public static final void a(org.drinkless.td.libcore.telegram.TdApi.FormattedText r13) {
        throw new UnsupportedOperationException("Method not decompiled: ob.l.a(org.drinkless.td.libcore.telegram.TdApi$FormattedText):void");
    }

    public static final Path b(TdApi.ClosedVectorPath[] closedVectorPathArr, float f10) {
        Path d10;
        d10 = d(closedVectorPathArr, f10, null, 4, null);
        return d10;
    }

    public static final android.graphics.Path c(org.drinkless.td.libcore.telegram.TdApi.ClosedVectorPath[] r18, float r19, android.graphics.Path r20) {
        throw new UnsupportedOperationException("Method not decompiled: ob.l.c(org.drinkless.td.libcore.telegram.TdApi$ClosedVectorPath[], float, android.graphics.Path):android.graphics.Path");
    }

    public static Path d(TdApi.ClosedVectorPath[] closedVectorPathArr, float f10, Path path, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            path = null;
        }
        return e.c(closedVectorPathArr, f10, path);
    }

    public static final TdApi.FormattedText e(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2) {
        TdApi.TextEntity textEntity;
        k.e(formattedText, "<this>");
        k.e(formattedText2, "text");
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        int length = textEntityArr != null ? textEntityArr.length : 0;
        TdApi.TextEntity[] textEntityArr2 = formattedText2.entities;
        int length2 = textEntityArr2 != null ? textEntityArr2.length : 0;
        if (length2 != 0) {
            int i10 = length2 + length;
            textEntityArr = new TdApi.TextEntity[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 >= length) {
                    TdApi.TextEntity textEntity2 = formattedText2.entities[i11 - length];
                    textEntity = new TdApi.TextEntity(textEntity2.offset + formattedText.text.length(), textEntity2.length, textEntity2.type);
                } else {
                    textEntity = formattedText.entities[i11];
                }
                k.d(textEntity, "when {\n        index >= …s.entities[index]\n      }");
                textEntityArr[i11] = textEntity;
            }
        }
        String str = formattedText.text;
        String str2 = formattedText2.text;
        return new TdApi.FormattedText(str + str2, textEntityArr);
    }

    public static final TdApi.FormattedText f(TdApi.FormattedText... formattedTextArr) {
        k.e(formattedTextArr, "texts");
        TdApi.FormattedText formattedText = null;
        if (formattedTextArr.length == 0) {
            return null;
        }
        for (TdApi.FormattedText formattedText2 : formattedTextArr) {
            if (formattedText == null || (formattedText = e.e(formattedText, formattedText2)) == null) {
                formattedText = formattedText2;
            }
        }
        return formattedText;
    }

    public static final int g(TdApi.ChatPermissions chatPermissions) {
        k.e(chatPermissions, "<this>");
        ?? r02 = chatPermissions.canSendMessages;
        int i10 = r02;
        if (chatPermissions.canSendMediaMessages) {
            i10 = r02 + 1;
        }
        int i11 = i10;
        if (chatPermissions.canSendPolls) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (chatPermissions.canSendOtherMessages) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (chatPermissions.canAddWebPagePreviews) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (chatPermissions.canChangeInfo) {
            i14 = i13 + 1;
        }
        int i15 = i14;
        if (chatPermissions.canInviteUsers) {
            i15 = i14 + 1;
        }
        return chatPermissions.canPinMessages ? i15 + 1 : i15;
    }

    public static final TdApi.PhotoSize h(TdApi.Photo photo) {
        TdApi.PhotoSize[] photoSizeArr;
        if (photo == null || (photoSizeArr = photo.sizes) == null) {
            return null;
        }
        return e.D0(photoSizeArr);
    }

    public static final TdApi.PhotoSize i(TdApi.PhotoSize[] photoSizeArr) {
        k.e(photoSizeArr, "<this>");
        if (!(!(photoSizeArr.length == 0))) {
            return null;
        }
        TdApi.PhotoSize photoSize = photoSizeArr[0];
        int length = photoSizeArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            TdApi.PhotoSize photoSize2 = photoSizeArr[i10];
            if (photoSize2.width > photoSize.width || photoSize2.height > photoSize.height) {
                photoSize = photoSize2;
            }
        }
        return photoSize;
    }

    public static final TdApi.TextEntity[] j(String str) {
        TdApi.Object e10 = Client.e(new TdApi.GetTextEntities(str));
        if (!(e10 instanceof TdApi.TextEntities)) {
            return null;
        }
        TdApi.TextEntities textEntities = (TdApi.TextEntities) e10;
        TdApi.TextEntity[] textEntityArr = textEntities.entities;
        k.d(textEntityArr, "result.entities");
        if (!(textEntityArr.length == 0)) {
            return textEntities.entities;
        }
        return null;
    }

    public static final TdApi.TextEntity[] k(TdApi.TextEntity[] textEntityArr) {
        boolean z10 = true;
        if (textEntityArr != null) {
            if (!(textEntityArr.length == 0)) {
                z10 = false;
            }
        }
        if (z10) {
            return textEntityArr;
        }
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        for (a0 a0Var : ja.i.R(textEntityArr)) {
            int a10 = a0Var.a();
            TdApi.TextEntity textEntity = (TdApi.TextEntity) a0Var.b();
            if (e.f1(textEntity.type)) {
                i11++;
                if (arrayList == null && i10 > 0) {
                    arrayList = new ArrayList();
                    for (int i12 = 0; i12 < a10; i12++) {
                        if (e.f1(textEntityArr[i12].type)) {
                            arrayList.add(textEntityArr[i12]);
                        }
                    }
                }
                if (arrayList != null) {
                    arrayList.add(textEntity);
                }
            } else {
                i10++;
                if (arrayList == null && i11 > 0) {
                    arrayList = new ArrayList();
                    for (int i13 = 0; i13 < a10; i13++) {
                        if (e.f1(textEntityArr[i13].type)) {
                            arrayList.add(textEntityArr[i13]);
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            Object[] array = arrayList.toArray(new TdApi.TextEntity[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (TdApi.TextEntity[]) array;
        } else if (i10 == textEntityArr.length) {
            return null;
        } else {
            return textEntityArr;
        }
    }

    public static final TdApi.RichText l(TdApi.PageBlock pageBlock, String str) {
        k.e(pageBlock, "<this>");
        k.e(str, "name");
        int i10 = 0;
        switch (pageBlock.getConstructor()) {
            case TdApi.PageBlockEmbedded.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption = ((TdApi.PageBlockEmbedded) pageBlock).caption;
                TdApi.RichText richText = pageBlockCaption.text;
                k.d(richText, "caption.text");
                TdApi.RichText H0 = e.H0(richText, str);
                if (H0 != null) {
                    return H0;
                }
                TdApi.RichText richText2 = pageBlockCaption.credit;
                k.d(richText2, "caption.credit");
                return e.H0(richText2, str);
            case TdApi.PageBlockRelatedArticles.CONSTRUCTOR:
                TdApi.RichText richText3 = ((TdApi.PageBlockRelatedArticles) pageBlock).header;
                k.d(richText3, "this as PageBlockRelatedArticles).header");
                return e.H0(richText3, str);
            case TdApi.PageBlockDetails.CONSTRUCTOR:
                TdApi.PageBlockDetails pageBlockDetails = (TdApi.PageBlockDetails) pageBlock;
                TdApi.RichText richText4 = pageBlockDetails.header;
                k.d(richText4, "details.header");
                TdApi.RichText H02 = e.H0(richText4, str);
                if (H02 != null) {
                    return H02;
                }
                TdApi.PageBlock[] pageBlockArr = pageBlockDetails.pageBlocks;
                k.d(pageBlockArr, "details.pageBlocks");
                int length = pageBlockArr.length;
                while (i10 < length) {
                    TdApi.PageBlock pageBlock2 = pageBlockArr[i10];
                    k.d(pageBlock2, "pageBlock");
                    TdApi.RichText G0 = e.G0(pageBlock2, str);
                    if (G0 != null) {
                        return G0;
                    }
                    i10++;
                }
                return null;
            case TdApi.PageBlockPreformatted.CONSTRUCTOR:
                TdApi.RichText richText5 = ((TdApi.PageBlockPreformatted) pageBlock).text;
                k.d(richText5, "this as PageBlockPreformatted).text");
                return e.H0(richText5, str);
            case TdApi.PageBlockList.CONSTRUCTOR:
                TdApi.PageBlockListItem[] pageBlockListItemArr = ((TdApi.PageBlockList) pageBlock).items;
                k.d(pageBlockListItemArr, "this as PageBlockList).items");
                for (TdApi.PageBlockListItem pageBlockListItem : pageBlockListItemArr) {
                    TdApi.PageBlock[] pageBlockArr2 = pageBlockListItem.pageBlocks;
                    k.d(pageBlockArr2, "pageBlockListItem.pageBlocks");
                    for (TdApi.PageBlock pageBlock3 : pageBlockArr2) {
                        k.d(pageBlock3, "pageBlock");
                        TdApi.RichText G02 = e.G0(pageBlock3, str);
                        if (G02 != null) {
                            return G02;
                        }
                    }
                }
                return null;
            case TdApi.PageBlockTable.CONSTRUCTOR:
                TdApi.PageBlockTable pageBlockTable = (TdApi.PageBlockTable) pageBlock;
                TdApi.PageBlockTableCell[][] pageBlockTableCellArr = pageBlockTable.cells;
                k.d(pageBlockTableCellArr, "table.cells");
                for (TdApi.PageBlockTableCell[] pageBlockTableCellArr2 : pageBlockTableCellArr) {
                    k.d(pageBlockTableCellArr2, "row");
                    for (TdApi.PageBlockTableCell pageBlockTableCell : pageBlockTableCellArr2) {
                        TdApi.RichText richText6 = pageBlockTableCell.text;
                        TdApi.RichText H03 = richText6 != null ? e.H0(richText6, str) : null;
                        if (H03 != null) {
                            return H03;
                        }
                    }
                }
                TdApi.RichText richText7 = pageBlockTable.caption;
                k.d(richText7, "table.caption");
                return e.H0(richText7, str);
            case TdApi.PageBlockAnchor.CONSTRUCTOR:
            case TdApi.PageBlockDivider.CONSTRUCTOR:
            case TdApi.PageBlockChatLink.CONSTRUCTOR:
                return null;
            case TdApi.PageBlockAudio.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption2 = ((TdApi.PageBlockAudio) pageBlock).caption;
                TdApi.RichText richText8 = pageBlockCaption2.text;
                k.d(richText8, "caption.text");
                TdApi.RichText H04 = e.H0(richText8, str);
                if (H04 != null) {
                    return H04;
                }
                TdApi.RichText richText9 = pageBlockCaption2.credit;
                k.d(richText9, "caption.credit");
                return e.H0(richText9, str);
            case TdApi.PageBlockSubtitle.CONSTRUCTOR:
                TdApi.RichText richText10 = ((TdApi.PageBlockSubtitle) pageBlock).subtitle;
                k.d(richText10, "this as PageBlockSubtitle).subtitle");
                return e.H0(richText10, str);
            case TdApi.PageBlockEmbeddedPost.CONSTRUCTOR:
                TdApi.PageBlockEmbeddedPost pageBlockEmbeddedPost = (TdApi.PageBlockEmbeddedPost) pageBlock;
                TdApi.PageBlock[] pageBlockArr3 = pageBlockEmbeddedPost.pageBlocks;
                k.d(pageBlockArr3, "post.pageBlocks");
                int length2 = pageBlockArr3.length;
                while (i10 < length2) {
                    TdApi.PageBlock pageBlock4 = pageBlockArr3[i10];
                    k.d(pageBlock4, "pageBlock");
                    TdApi.RichText G03 = e.G0(pageBlock4, str);
                    if (G03 != null) {
                        return G03;
                    }
                    i10++;
                }
                TdApi.RichText richText11 = pageBlockEmbeddedPost.caption.text;
                k.d(richText11, "post.caption.text");
                TdApi.RichText H05 = e.H0(richText11, str);
                if (H05 != null) {
                    return H05;
                }
                TdApi.RichText richText12 = pageBlockEmbeddedPost.caption.credit;
                k.d(richText12, "post.caption.credit");
                return e.H0(richText12, str);
            case TdApi.PageBlockPhoto.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption3 = ((TdApi.PageBlockPhoto) pageBlock).caption;
                TdApi.RichText richText13 = pageBlockCaption3.text;
                k.d(richText13, "caption.text");
                TdApi.RichText H06 = e.H0(richText13, str);
                if (H06 != null) {
                    return H06;
                }
                TdApi.RichText richText14 = pageBlockCaption3.credit;
                k.d(richText14, "caption.credit");
                return e.H0(richText14, str);
            case TdApi.PageBlockPullQuote.CONSTRUCTOR:
                TdApi.PageBlockPullQuote pageBlockPullQuote = (TdApi.PageBlockPullQuote) pageBlock;
                TdApi.RichText richText15 = pageBlockPullQuote.text;
                k.d(richText15, "quote.text");
                TdApi.RichText H07 = e.H0(richText15, str);
                if (H07 != null) {
                    return H07;
                }
                TdApi.RichText richText16 = pageBlockPullQuote.credit;
                k.d(richText16, "quote.credit");
                return e.H0(richText16, str);
            case TdApi.PageBlockVideo.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption4 = ((TdApi.PageBlockVideo) pageBlock).caption;
                TdApi.RichText richText17 = pageBlockCaption4.text;
                k.d(richText17, "caption.text");
                TdApi.RichText H08 = e.H0(richText17, str);
                if (H08 != null) {
                    return H08;
                }
                TdApi.RichText richText18 = pageBlockCaption4.credit;
                k.d(richText18, "caption.credit");
                return e.H0(richText18, str);
            case TdApi.PageBlockSlideshow.CONSTRUCTOR:
                TdApi.PageBlockSlideshow pageBlockSlideshow = (TdApi.PageBlockSlideshow) pageBlock;
                TdApi.PageBlock[] pageBlockArr4 = pageBlockSlideshow.pageBlocks;
                k.d(pageBlockArr4, "slideshow.pageBlocks");
                int length3 = pageBlockArr4.length;
                while (i10 < length3) {
                    TdApi.PageBlock pageBlock5 = pageBlockArr4[i10];
                    k.d(pageBlock5, "pageBlock");
                    TdApi.RichText G04 = e.G0(pageBlock5, str);
                    if (G04 != null) {
                        return G04;
                    }
                    i10++;
                }
                TdApi.RichText richText19 = pageBlockSlideshow.caption.text;
                k.d(richText19, "slideshow.caption.text");
                TdApi.RichText H09 = e.H0(richText19, str);
                if (H09 != null) {
                    return H09;
                }
                TdApi.RichText richText20 = pageBlockSlideshow.caption.credit;
                k.d(richText20, "slideshow.caption.credit");
                return e.H0(richText20, str);
            case TdApi.PageBlockFooter.CONSTRUCTOR:
                TdApi.RichText richText21 = ((TdApi.PageBlockFooter) pageBlock).footer;
                k.d(richText21, "this as PageBlockFooter).footer");
                return e.H0(richText21, str);
            case TdApi.PageBlockCover.CONSTRUCTOR:
                TdApi.PageBlock pageBlock6 = ((TdApi.PageBlockCover) pageBlock).cover;
                k.d(pageBlock6, "this as PageBlockCover).cover");
                return e.G0(pageBlock6, str);
            case TdApi.PageBlockCollage.CONSTRUCTOR:
                TdApi.PageBlockCollage pageBlockCollage = (TdApi.PageBlockCollage) pageBlock;
                TdApi.PageBlock[] pageBlockArr5 = pageBlockCollage.pageBlocks;
                k.d(pageBlockArr5, "collage.pageBlocks");
                int length4 = pageBlockArr5.length;
                while (i10 < length4) {
                    TdApi.PageBlock pageBlock7 = pageBlockArr5[i10];
                    k.d(pageBlock7, "pageBlock");
                    TdApi.RichText G05 = e.G0(pageBlock7, str);
                    if (G05 != null) {
                        return G05;
                    }
                    i10++;
                }
                TdApi.RichText richText22 = pageBlockCollage.caption.text;
                k.d(richText22, "collage.caption.text");
                TdApi.RichText H010 = e.H0(richText22, str);
                if (H010 != null) {
                    return H010;
                }
                TdApi.RichText richText23 = pageBlockCollage.caption.credit;
                k.d(richText23, "collage.caption.credit");
                return e.H0(richText23, str);
            case TdApi.PageBlockParagraph.CONSTRUCTOR:
                TdApi.RichText richText24 = ((TdApi.PageBlockParagraph) pageBlock).text;
                k.d(richText24, "this as PageBlockParagraph).text");
                return e.H0(richText24, str);
            case TdApi.PageBlockSubheader.CONSTRUCTOR:
                TdApi.RichText richText25 = ((TdApi.PageBlockSubheader) pageBlock).subheader;
                k.d(richText25, "this as PageBlockSubheader).subheader");
                return e.H0(richText25, str);
            case TdApi.PageBlockAuthorDate.CONSTRUCTOR:
                TdApi.RichText richText26 = ((TdApi.PageBlockAuthorDate) pageBlock).author;
                k.d(richText26, "this as PageBlockAuthorDate).author");
                return e.H0(richText26, str);
            case TdApi.PageBlockAnimation.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption5 = ((TdApi.PageBlockAnimation) pageBlock).caption;
                TdApi.RichText richText27 = pageBlockCaption5.text;
                k.d(richText27, "caption.text");
                TdApi.RichText H011 = e.H0(richText27, str);
                if (H011 != null) {
                    return H011;
                }
                TdApi.RichText richText28 = pageBlockCaption5.credit;
                k.d(richText28, "caption.credit");
                return e.H0(richText28, str);
            case TdApi.PageBlockKicker.CONSTRUCTOR:
                TdApi.RichText richText29 = ((TdApi.PageBlockKicker) pageBlock).kicker;
                k.d(richText29, "this as PageBlockKicker).kicker");
                return e.H0(richText29, str);
            case TdApi.PageBlockHeader.CONSTRUCTOR:
                TdApi.RichText richText30 = ((TdApi.PageBlockHeader) pageBlock).header;
                k.d(richText30, "this as PageBlockHeader).header");
                return e.H0(richText30, str);
            case TdApi.PageBlockMap.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption6 = ((TdApi.PageBlockMap) pageBlock).caption;
                TdApi.RichText richText31 = pageBlockCaption6.text;
                k.d(richText31, "caption.text");
                TdApi.RichText H012 = e.H0(richText31, str);
                if (H012 != null) {
                    return H012;
                }
                TdApi.RichText richText32 = pageBlockCaption6.credit;
                k.d(richText32, "caption.credit");
                return e.H0(richText32, str);
            case TdApi.PageBlockTitle.CONSTRUCTOR:
                TdApi.RichText richText33 = ((TdApi.PageBlockTitle) pageBlock).title;
                k.d(richText33, "this as PageBlockTitle).title");
                return e.H0(richText33, str);
            case TdApi.PageBlockBlockQuote.CONSTRUCTOR:
                TdApi.PageBlockBlockQuote pageBlockBlockQuote = (TdApi.PageBlockBlockQuote) pageBlock;
                TdApi.RichText richText34 = pageBlockBlockQuote.text;
                k.d(richText34, "quote.text");
                TdApi.RichText H013 = e.H0(richText34, str);
                if (H013 != null) {
                    return H013;
                }
                TdApi.RichText richText35 = pageBlockBlockQuote.credit;
                k.d(richText35, "quote.credit");
                return e.H0(richText35, str);
            case TdApi.PageBlockVoiceNote.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption7 = ((TdApi.PageBlockVoiceNote) pageBlock).caption;
                TdApi.RichText richText36 = pageBlockCaption7.text;
                k.d(richText36, "caption.text");
                TdApi.RichText H014 = e.H0(richText36, str);
                if (H014 != null) {
                    return H014;
                }
                TdApi.RichText richText37 = pageBlockCaption7.credit;
                k.d(richText37, "caption.credit");
                return e.H0(richText37, str);
            default:
                String object = pageBlock.toString();
                k.d(object, "this.toString()");
                throw new g("An operation is not implemented: " + object);
        }
    }

    public static final TdApi.RichText m(TdApi.RichText richText, String str) {
        k.e(richText, "<this>");
        k.e(str, "name");
        switch (richText.getConstructor()) {
            case TdApi.RichTextAnchorLink.CONSTRUCTOR:
                TdApi.RichText richText2 = ((TdApi.RichTextAnchorLink) richText).text;
                k.d(richText2, "this as RichTextAnchorLink).text");
                return e.H0(richText2, str);
            case TdApi.RichTextIcon.CONSTRUCTOR:
            case TdApi.RichTextPlain.CONSTRUCTOR:
            case TdApi.RichTextAnchor.CONSTRUCTOR:
                return null;
            case TdApi.RichTextMarked.CONSTRUCTOR:
                TdApi.RichText richText3 = ((TdApi.RichTextMarked) richText).text;
                k.d(richText3, "this as RichTextMarked).text");
                return e.H0(richText3, str);
            case TdApi.RichTextFixed.CONSTRUCTOR:
                TdApi.RichText richText4 = ((TdApi.RichTextFixed) richText).text;
                k.d(richText4, "this as RichTextFixed).text");
                return e.H0(richText4, str);
            case TdApi.RichTextReference.CONSTRUCTOR:
                TdApi.RichText richText5 = ((TdApi.RichTextReference) richText).text;
                k.d(richText5, "this as RichTextReference).text");
                return e.H0(richText5, str);
            case TdApi.RichTextSubscript.CONSTRUCTOR:
                TdApi.RichText richText6 = ((TdApi.RichTextSubscript) richText).text;
                k.d(richText6, "this as RichTextSubscript).text");
                return e.H0(richText6, str);
            case TdApi.RichTextUnderline.CONSTRUCTOR:
                TdApi.RichText richText7 = ((TdApi.RichTextUnderline) richText).text;
                k.d(richText7, "this as RichTextUnderline).text");
                return e.H0(richText7, str);
            case TdApi.RichTextSuperscript.CONSTRUCTOR:
                TdApi.RichText richText8 = ((TdApi.RichTextSuperscript) richText).text;
                k.d(richText8, "this as RichTextSuperscript).text");
                return e.H0(richText8, str);
            case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                TdApi.RichText richText9 = ((TdApi.RichTextEmailAddress) richText).text;
                k.d(richText9, "this as RichTextEmailAddress).text");
                return e.H0(richText9, str);
            case TdApi.RichTextUrl.CONSTRUCTOR:
                TdApi.RichText richText10 = ((TdApi.RichTextUrl) richText).text;
                k.d(richText10, "this as RichTextUrl).text");
                return e.H0(richText10, str);
            case TdApi.RichTextPhoneNumber.CONSTRUCTOR:
                TdApi.RichText richText11 = ((TdApi.RichTextPhoneNumber) richText).text;
                k.d(richText11, "this as RichTextPhoneNumber).text");
                return e.H0(richText11, str);
            case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                TdApi.RichText richText12 = ((TdApi.RichTextStrikethrough) richText).text;
                k.d(richText12, "this as RichTextStrikethrough).text");
                return e.H0(richText12, str);
            case TdApi.RichTexts.CONSTRUCTOR:
                TdApi.RichTexts richTexts = (TdApi.RichTexts) richText;
                TdApi.RichText[] richTextArr = richTexts.texts;
                if (richTextArr.length == 2 && richTextArr[0].getConstructor() == 1316950068) {
                    TdApi.RichText richText13 = richTexts.texts[0];
                    Objects.requireNonNull(richText13, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.RichTextAnchor");
                    if (k.b(((TdApi.RichTextAnchor) richText13).name, str)) {
                        return richTexts.texts[1];
                    }
                }
                TdApi.RichText[] richTextArr2 = richTexts.texts;
                k.d(richTextArr2, "texts.texts");
                for (TdApi.RichText richText14 : richTextArr2) {
                    k.d(richText14, "text");
                    TdApi.RichText H0 = e.H0(richText14, str);
                    if (H0 != null) {
                        return H0;
                    }
                }
                return null;
            case TdApi.RichTextBold.CONSTRUCTOR:
                TdApi.RichText richText15 = ((TdApi.RichTextBold) richText).text;
                k.d(richText15, "this as RichTextBold).text");
                return e.H0(richText15, str);
            case TdApi.RichTextItalic.CONSTRUCTOR:
                TdApi.RichText richText16 = ((TdApi.RichTextItalic) richText).text;
                k.d(richText16, "this as RichTextItalic).text");
                return e.H0(richText16, str);
            default:
                String object = richText.toString();
                k.d(object, "this.toString()");
                throw new g("An operation is not implemented: " + object);
        }
    }

    public static final TdApi.RichText n(TdApi.WebPageInstantView webPageInstantView, String str) {
        k.e(webPageInstantView, "<this>");
        if (str == null || str.length() == 0) {
            return null;
        }
        TdApi.PageBlock[] pageBlockArr = webPageInstantView.pageBlocks;
        k.d(pageBlockArr, "this.pageBlocks");
        for (TdApi.PageBlock pageBlock : pageBlockArr) {
            k.d(pageBlock, "pageBlock");
            TdApi.RichText G0 = e.G0(pageBlock, str);
            if (G0 != null) {
                return G0;
            }
        }
        return null;
    }

    public static final TdApi.PhotoSize o(TdApi.Photo photo) {
        TdApi.PhotoSize[] photoSizeArr;
        if (photo == null || (photoSizeArr = photo.sizes) == null) {
            return null;
        }
        return e.K0(photoSizeArr);
    }

    public static final TdApi.PhotoSize p(TdApi.PhotoSize[] photoSizeArr) {
        k.e(photoSizeArr, "<this>");
        if (!(!(photoSizeArr.length == 0))) {
            return null;
        }
        TdApi.PhotoSize photoSize = photoSizeArr[0];
        int length = photoSizeArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            TdApi.PhotoSize photoSize2 = photoSizeArr[i10];
            if (photoSize2.width < photoSize.width || photoSize2.height < photoSize.height) {
                photoSize = photoSize2;
            }
        }
        return photoSize;
    }

    public static final String q(TdApi.FormattedText formattedText, String str, boolean z10) {
        TdApi.TextEntity[] textEntityArr;
        Uri H;
        k.e(str, "lookupUrl");
        if (formattedText == null || (textEntityArr = formattedText.entities) == null) {
            return null;
        }
        if ((textEntityArr.length == 0) || (H = i.H(str)) == null) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
        k.d(textEntityArr2, "this.entities");
        String str2 = null;
        int i10 = 0;
        for (TdApi.TextEntity textEntity : textEntityArr2) {
            int constructor = textEntity.type.getConstructor();
            if (constructor == -1312762756) {
                String str3 = formattedText.text;
                k.d(str3, "this.text");
                str2 = e.u1(str3, textEntity);
            } else if (constructor != 445719651) {
                continue;
            } else {
                TdApi.TextEntityType textEntityType = textEntity.type;
                Objects.requireNonNull(textEntityType, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.TextEntityTypeTextUrl");
                str2 = ((TdApi.TextEntityTypeTextUrl) textEntityType).url;
            }
            i10++;
            Uri H2 = i.H(str2);
            if (H2 != null && k.b(H2.buildUpon().fragment(null).build(), H)) {
                return str2;
            }
        }
        if (!z10) {
            return str;
        }
        if (i10 == 1) {
            return str2;
        }
        return null;
    }

    public static final String r(TdApi.ChatMemberStatus chatMemberStatus) {
        k.e(chatMemberStatus, "<this>");
        int constructor = chatMemberStatus.getConstructor();
        if (constructor == -160019714) {
            return ((TdApi.ChatMemberStatusCreator) chatMemberStatus).customTitle;
        }
        if (constructor != -70024163) {
            return null;
        }
        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).customTitle;
    }

    public static final int s(TdApi.File file) {
        if (file != null) {
            return file.f19913id;
        }
        return 0;
    }

    public static final long t(TdApi.Message message) {
        long v10;
        v10 = v(message, false, 1, null);
        return v10;
    }

    public static final long u(TdApi.Message message, boolean z10) {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (message == null) {
            return 0L;
        }
        if (!z10 || (messageForwardInfo = message.forwardInfo) == null) {
            int constructor = message.senderId.getConstructor();
            if (constructor == -336109341) {
                TdApi.MessageSender messageSender = message.senderId;
                Objects.requireNonNull(messageSender, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageSenderUser");
                return a.c(((TdApi.MessageSenderUser) messageSender).userId);
            } else if (constructor == -239660751) {
                TdApi.MessageSender messageSender2 = message.senderId;
                Objects.requireNonNull(messageSender2, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageSenderChat");
                return ((TdApi.MessageSenderChat) messageSender2).chatId;
            } else {
                String object = message.senderId.toString();
                k.d(object, "this.senderId.toString()");
                throw new g("An operation is not implemented: " + object);
            }
        } else {
            switch (messageForwardInfo.origin.getConstructor()) {
                case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                    return 0L;
                case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                    TdApi.MessageForwardOrigin messageForwardOrigin = messageForwardInfo.origin;
                    Objects.requireNonNull(messageForwardOrigin, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageForwardOriginUser");
                    return a.c(((TdApi.MessageForwardOriginUser) messageForwardOrigin).senderUserId);
                case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                    TdApi.MessageForwardOrigin messageForwardOrigin2 = messageForwardInfo.origin;
                    Objects.requireNonNull(messageForwardOrigin2, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageForwardOriginChannel");
                    return ((TdApi.MessageForwardOriginChannel) messageForwardOrigin2).chatId;
                case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                    TdApi.MessageForwardOrigin messageForwardOrigin3 = messageForwardInfo.origin;
                    Objects.requireNonNull(messageForwardOrigin3, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageForwardOriginChat");
                    return ((TdApi.MessageForwardOriginChat) messageForwardOrigin3).senderChatId;
                default:
                    String object2 = messageForwardInfo.origin.toString();
                    k.d(object2, "forwardInfo.origin.toString()");
                    throw new g("An operation is not implemented: " + object2);
            }
        }
    }

    public static long v(TdApi.Message message, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return e.P0(message, z10);
    }

    public static final long w(TdApi.Message message) {
        return e.S0(message != null ? message.senderId : null);
    }

    public static final long x(TdApi.MessageSender messageSender) {
        if (messageSender == null) {
            return 0L;
        }
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            return a.c(((TdApi.MessageSenderUser) messageSender).userId);
        }
        if (constructor == -239660751) {
            return ((TdApi.MessageSenderChat) messageSender).chatId;
        }
        String object = messageSender.toString();
        k.d(object, "this.toString()");
        throw new g("An operation is not implemented: " + object);
    }

    public static final long y(TdApi.Message message) {
        return e.U0(message != null ? message.senderId : null);
    }

    public static final long z(TdApi.MessageSender messageSender) {
        boolean z10 = false;
        if (messageSender != null && messageSender.getConstructor() == -336109341) {
            z10 = true;
        }
        if (!z10) {
            return 0L;
        }
        Objects.requireNonNull(messageSender, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageSenderUser");
        return ((TdApi.MessageSenderUser) messageSender).userId;
    }
}
