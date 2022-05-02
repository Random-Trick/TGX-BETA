package p193nb;

import android.graphics.Path;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p107ha.C5047g;
import p108hb.C5070i;
import p123ia.C5276a0;
import p123ia.C5296i;
import qa.C8298k;
import za.C11439e;
import za.C11451n;

public final class C7345l {
    public static final String m16809A(TdApi.FormattedText formattedText) {
        if (formattedText != null) {
            String str = formattedText.text;
            if (!(str == null || str.length() == 0)) {
                return formattedText.text;
            }
        }
        return null;
    }

    public static final boolean m16808B(org.drinkless.p210td.libcore.telegram.TdApi.FormattedText r5) {
        throw new UnsupportedOperationException("Method not decompiled: p193nb.C7345l.m16808B(org.drinkless.td.libcore.telegram.TdApi$FormattedText):boolean");
    }

    public static final boolean m16807C(TdApi.StickerType stickerType) {
        Integer valueOf = stickerType == null ? null : Integer.valueOf(stickerType.getConstructor());
        if (valueOf != null && valueOf.intValue() == 1763255981) {
            return true;
        }
        return valueOf != null && valueOf.intValue() == 522366836;
    }

    public static final boolean m16806D(TdApi.ChatMemberStatus chatMemberStatus) {
        Integer valueOf = chatMemberStatus == null ? null : Integer.valueOf(chatMemberStatus.getConstructor());
        if (valueOf != null && valueOf.intValue() == -160019714) {
            Objects.requireNonNull(chatMemberStatus, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.ChatMemberStatusCreator");
            return ((TdApi.ChatMemberStatusCreator) chatMemberStatus).isAnonymous;
        } else if (valueOf == null || valueOf.intValue() != 82243562) {
            return false;
        } else {
            Objects.requireNonNull(chatMemberStatus, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.ChatMemberStatusAdministrator");
            return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).isAnonymous;
        }
    }

    public static final boolean m16805E(TdApi.LanguagePackInfo languagePackInfo) {
        if (languagePackInfo == null) {
            return false;
        }
        return languagePackInfo.isBeta;
    }

    public static final boolean m16804F(TdApi.InlineKeyboardButtonTypeCallbackWithPassword inlineKeyboardButtonTypeCallbackWithPassword) {
        C8298k.m12934e(inlineKeyboardButtonTypeCallbackWithPassword, "<this>");
        try {
            byte[] bArr = inlineKeyboardButtonTypeCallbackWithPassword.data;
            C8298k.m12935d(bArr, "this.data");
            return new C11439e("^bots/[0-9]+/trsf/.+$").m648a(new String(bArr, C5070i.f17083a));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static final boolean m16803G(TdApi.TextEntityType textEntityType) {
        Integer valueOf = textEntityType == null ? null : Integer.valueOf(textEntityType.getConstructor());
        return !((((((valueOf != null && valueOf.intValue() == 105986320) || (valueOf != null && valueOf.intValue() == -1023958307)) || (valueOf != null && valueOf.intValue() == 1222915915)) || (valueOf != null && valueOf.intValue() == 934535013)) || (valueOf != null && valueOf.intValue() == -1312762756)) || (valueOf != null && valueOf.intValue() == -1841898992)) && valueOf != null;
    }

    public static final boolean m16802H(TdApi.LanguagePackInfo languagePackInfo) {
        if (languagePackInfo != null && !languagePackInfo.isOfficial) {
            return languagePackInfo.isInstalled || C7321e.m16950f1(languagePackInfo);
        }
        return false;
    }

    public static final boolean m16801I(TdApi.LanguagePackInfo languagePackInfo) {
        String str = languagePackInfo == null ? null : languagePackInfo.f25405id;
        C8298k.m12936c(str);
        return C11451n.m621x(str, "X", false, 2, null);
    }

    public static final boolean m16800J(TdApi.MessageContent messageContent) {
        C8298k.m12934e(messageContent, "<this>");
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

    public static final boolean m16799K(TdApi.ChatInviteLink chatInviteLink) {
        C8298k.m12934e(chatInviteLink, "<this>");
        return (chatInviteLink.expirationDate == 0 && chatInviteLink.memberCount == 0 && chatInviteLink.memberLimit == 0) ? false : true;
    }

    public static final boolean m16798L(TdApi.Message message, TdApi.SearchMessagesFilter searchMessagesFilter) {
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
                if (C7321e.m16978U0(C7321e.m16899w1(message.content))) {
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
                C8298k.m12935d(object, "filter.toString()");
                throw new C5047g(C8298k.m12929j("An operation is not implemented: ", object));
        }
        return false;
    }

    public static final boolean m16797M(TdApi.ChatType chatType, TdApi.NotificationSettingsScope notificationSettingsScope) {
        C8298k.m12934e(chatType, "<this>");
        C8298k.m12934e(notificationSettingsScope, "scope");
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor != 548013448) {
            if (constructor != 937446759) {
                if (constructor != 1212142067) {
                    String object = notificationSettingsScope.toString();
                    C8298k.m12935d(object, "scope.toString()");
                    throw new C5047g(C8298k.m12929j("An operation is not implemented: ", object));
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

    public static final boolean m16796N(TdApi.FormattedText formattedText) {
        C8298k.m12934e(formattedText, "<this>");
        TdApi.Object e = Client.m14793e(new TdApi.ParseMarkdown(formattedText));
        if (e instanceof TdApi.FormattedText) {
            TdApi.FormattedText formattedText2 = (TdApi.FormattedText) e;
            if (!C7321e.m16993N(formattedText2, formattedText, true)) {
                formattedText.text = formattedText2.text;
                formattedText.entities = formattedText2.entities;
                return true;
            }
        }
        return false;
    }

    public static final String m16795O(String str, TdApi.TextEntity textEntity) {
        C8298k.m12934e(str, "<this>");
        if (textEntity == null) {
            return null;
        }
        int i = textEntity.offset;
        String substring = str.substring(i, textEntity.length + i);
        C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final TdApi.FormattedText m16794P(TdApi.FormattedText formattedText, int i) {
        TdApi.FormattedText R;
        C8298k.m12934e(formattedText, "<this>");
        R = m16792R(formattedText, i, 0, 2, null);
        return R;
    }

    public static final TdApi.FormattedText m16793Q(TdApi.FormattedText formattedText, int i, int i2) {
        C8298k.m12934e(formattedText, "<this>");
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        boolean z = true;
        if (textEntityArr != null) {
            if (!(textEntityArr.length == 0)) {
                z = false;
            }
        }
        TdApi.TextEntity[] textEntityArr2 = null;
        if (!z) {
            C8298k.m12935d(textEntityArr, "entities");
            int length = textEntityArr.length;
            ArrayList arrayList = null;
            int i3 = 0;
            while (i3 < length) {
                TdApi.TextEntity textEntity = textEntityArr[i3];
                i3++;
                int i4 = textEntity.offset;
                if (textEntity.length + i4 > i && i4 < i2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    int i5 = textEntity.offset - i;
                    int i6 = textEntity.length;
                    if (i5 < 0) {
                        i6 += i5;
                        i5 = 0;
                    }
                    int i7 = i5 + i6;
                    if (i7 > formattedText.text.length()) {
                        i6 -= i7 - formattedText.text.length();
                    }
                    arrayList.add(new TdApi.TextEntity(i5, i6, textEntity.type));
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
        C8298k.m12935d(str, "this.text");
        String substring = str.substring(i, i2);
        C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new TdApi.FormattedText(substring, textEntityArr2);
    }

    public static TdApi.FormattedText m16792R(TdApi.FormattedText formattedText, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = formattedText.text.length();
        }
        return C7321e.m16905u1(formattedText, i, i2);
    }

    public static final TdApi.FormattedText m16791S(TdApi.MessageContent messageContent) {
        Integer valueOf = messageContent == null ? null : Integer.valueOf(messageContent.getConstructor());
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

    public static final TdApi.FormattedText m16790T(TdApi.FormattedText formattedText) {
        if (formattedText == null || C7321e.m16965a1(formattedText)) {
            return formattedText;
        }
        boolean z = true;
        int length = formattedText.text.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            boolean isWhitespace = Character.isWhitespace(formattedText.text.charAt(!z2 ? i : length));
            if (!z2) {
                if (!isWhitespace) {
                    z2 = true;
                } else {
                    i++;
                }
            } else if (!isWhitespace) {
                break;
            } else {
                length--;
            }
        }
        int i2 = length + 1;
        if (i == 0 && i2 == formattedText.text.length()) {
            return formattedText;
        }
        String str = formattedText.text;
        C8298k.m12935d(str, "this.text");
        String substring = str.substring(i, i2);
        C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr != null) {
            if (!(textEntityArr.length == 0)) {
                z = false;
            }
        }
        if (!z) {
            int length2 = textEntityArr.length;
            textEntityArr = new TdApi.TextEntity[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                TdApi.TextEntity textEntity = formattedText.entities[i3];
                if (i != 0 || textEntity.offset + textEntity.length > i2) {
                    int i4 = textEntity.offset;
                    int i5 = textEntity.length;
                    textEntity = new TdApi.TextEntity(i4 - i, i5 - Math.max(0, (i4 + i5) - i2), textEntity.type);
                }
                textEntityArr[i3] = textEntity;
            }
        }
        return new TdApi.FormattedText(substring, textEntityArr);
    }

    public static final void m16789a(org.drinkless.p210td.libcore.telegram.TdApi.FormattedText r13) {
        throw new UnsupportedOperationException("Method not decompiled: p193nb.C7345l.m16789a(org.drinkless.td.libcore.telegram.TdApi$FormattedText):void");
    }

    public static final Path m16788b(TdApi.ClosedVectorPath[] closedVectorPathArr, float f) {
        Path d;
        d = m16786d(closedVectorPathArr, f, null, 4, null);
        return d;
    }

    public static final android.graphics.Path m16787c(org.drinkless.p210td.libcore.telegram.TdApi.ClosedVectorPath[] r19, float r20, android.graphics.Path r21) {
        throw new UnsupportedOperationException("Method not decompiled: p193nb.C7345l.m16787c(org.drinkless.td.libcore.telegram.TdApi$ClosedVectorPath[], float, android.graphics.Path):android.graphics.Path");
    }

    public static Path m16786d(TdApi.ClosedVectorPath[] closedVectorPathArr, float f, Path path, int i, Object obj) {
        if ((i & 4) != 0) {
            path = null;
        }
        return C7321e.m16961c(closedVectorPathArr, f, path);
    }

    public static final TdApi.FormattedText m16785e(TdApi.FormattedText formattedText, TdApi.FormattedText formattedText2) {
        TdApi.TextEntity textEntity;
        C8298k.m12934e(formattedText, "<this>");
        C8298k.m12934e(formattedText2, "text");
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        int length = textEntityArr == null ? 0 : textEntityArr.length;
        TdApi.TextEntity[] textEntityArr2 = formattedText2.entities;
        int length2 = textEntityArr2 == null ? 0 : textEntityArr2.length;
        if (length2 != 0) {
            int i = length2 + length;
            textEntityArr = new TdApi.TextEntity[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= length) {
                    TdApi.TextEntity textEntity2 = formattedText2.entities[i2 - length];
                    textEntity = new TdApi.TextEntity(textEntity2.offset + formattedText.text.length(), textEntity2.length, textEntity2.type);
                } else {
                    textEntity = formattedText.entities[i2];
                }
                C8298k.m12935d(textEntity, "when {\n        index >= …s.entities[index]\n      }");
                textEntityArr[i2] = textEntity;
            }
        }
        String str = formattedText.text;
        String str2 = formattedText2.text;
        return new TdApi.FormattedText(str + str2, textEntityArr);
    }

    public static final TdApi.FormattedText m16784f(TdApi.FormattedText... formattedTextArr) {
        C8298k.m12934e(formattedTextArr, "texts");
        int i = 0;
        TdApi.FormattedText formattedText = null;
        if (formattedTextArr.length == 0) {
            return null;
        }
        int length = formattedTextArr.length;
        while (i < length) {
            TdApi.FormattedText formattedText2 = formattedTextArr[i];
            i++;
            if (formattedText == null || (formattedText = C7321e.m16955e(formattedText, formattedText2)) == null) {
                formattedText = formattedText2;
            }
        }
        return formattedText;
    }

    public static final int m16783g(TdApi.ChatPermissions chatPermissions) {
        C8298k.m12934e(chatPermissions, "<this>");
        ?? r0 = chatPermissions.canSendMessages;
        int i = r0;
        if (chatPermissions.canSendMediaMessages) {
            i = r0 + 1;
        }
        int i2 = i;
        if (chatPermissions.canSendPolls) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (chatPermissions.canSendOtherMessages) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (chatPermissions.canAddWebPagePreviews) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (chatPermissions.canChangeInfo) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (chatPermissions.canInviteUsers) {
            i6 = i5 + 1;
        }
        return chatPermissions.canPinMessages ? i6 + 1 : i6;
    }

    public static final TdApi.PhotoSize m16782h(TdApi.Photo photo) {
        TdApi.PhotoSize[] photoSizeArr;
        if (photo == null || (photoSizeArr = photo.sizes) == null) {
            return null;
        }
        return C7321e.m17016B0(photoSizeArr);
    }

    public static final TdApi.PhotoSize m16781i(TdApi.PhotoSize[] photoSizeArr) {
        C8298k.m12934e(photoSizeArr, "<this>");
        int i = 1;
        if (!(!(photoSizeArr.length == 0))) {
            return null;
        }
        TdApi.PhotoSize photoSize = photoSizeArr[0];
        int length = photoSizeArr.length;
        while (i < length) {
            i++;
            TdApi.PhotoSize photoSize2 = photoSizeArr[i];
            if (photoSize2.width > photoSize.width || photoSize2.height > photoSize.height) {
                photoSize = photoSize2;
            }
        }
        return photoSize;
    }

    public static final TdApi.TextEntity[] m16780j(String str) {
        TdApi.Object e = Client.m14793e(new TdApi.GetTextEntities(str));
        if (!(e instanceof TdApi.TextEntities)) {
            return null;
        }
        TdApi.TextEntities textEntities = (TdApi.TextEntities) e;
        TdApi.TextEntity[] textEntityArr = textEntities.entities;
        C8298k.m12935d(textEntityArr, "result.entities");
        if (!(textEntityArr.length == 0)) {
            return textEntities.entities;
        }
        return null;
    }

    public static final TdApi.TextEntity[] m16779k(TdApi.TextEntity[] textEntityArr) {
        boolean z = true;
        if (textEntityArr != null) {
            if (!(textEntityArr.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return textEntityArr;
        }
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        for (C5276a0 a0Var : C5296i.m23395R(textEntityArr)) {
            int a = a0Var.m23467a();
            TdApi.TextEntity textEntity = (TdApi.TextEntity) a0Var.m23466b();
            if (C7321e.m16956d1(textEntity.type)) {
                i2++;
                if (arrayList == null && i > 0) {
                    arrayList = new ArrayList();
                    int i3 = 0;
                    while (i3 < a) {
                        i3++;
                        if (C7321e.m16956d1(textEntityArr[i3].type)) {
                            arrayList.add(textEntityArr[i3]);
                        }
                    }
                }
                if (arrayList != null) {
                    arrayList.add(textEntity);
                }
            } else {
                i++;
                if (arrayList == null && i2 > 0) {
                    arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < a) {
                        i4++;
                        if (C7321e.m16956d1(textEntityArr[i4].type)) {
                            arrayList.add(textEntityArr[i4]);
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            Object[] array = arrayList.toArray(new TdApi.TextEntity[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (TdApi.TextEntity[]) array;
        } else if (i == textEntityArr.length) {
            return null;
        } else {
            return textEntityArr;
        }
    }

    public static final TdApi.RichText m16778l(TdApi.PageBlock pageBlock, String str) {
        C8298k.m12934e(pageBlock, "<this>");
        C8298k.m12934e(str, "name");
        int i = 0;
        switch (pageBlock.getConstructor()) {
            case TdApi.PageBlockEmbedded.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption = ((TdApi.PageBlockEmbedded) pageBlock).caption;
                TdApi.RichText richText = pageBlockCaption.text;
                C8298k.m12935d(richText, "caption.text");
                TdApi.RichText F0 = C7321e.m17008F0(richText, str);
                if (F0 != null) {
                    return F0;
                }
                TdApi.RichText richText2 = pageBlockCaption.credit;
                C8298k.m12935d(richText2, "caption.credit");
                return C7321e.m17008F0(richText2, str);
            case TdApi.PageBlockRelatedArticles.CONSTRUCTOR:
                TdApi.RichText richText3 = ((TdApi.PageBlockRelatedArticles) pageBlock).header;
                C8298k.m12935d(richText3, "this as PageBlockRelatedArticles).header");
                return C7321e.m17008F0(richText3, str);
            case TdApi.PageBlockDetails.CONSTRUCTOR:
                TdApi.PageBlockDetails pageBlockDetails = (TdApi.PageBlockDetails) pageBlock;
                TdApi.RichText richText4 = pageBlockDetails.header;
                C8298k.m12935d(richText4, "details.header");
                TdApi.RichText F02 = C7321e.m17008F0(richText4, str);
                if (F02 != null) {
                    return F02;
                }
                TdApi.PageBlock[] pageBlockArr = pageBlockDetails.pageBlocks;
                C8298k.m12935d(pageBlockArr, "details.pageBlocks");
                int length = pageBlockArr.length;
                while (i < length) {
                    TdApi.PageBlock pageBlock2 = pageBlockArr[i];
                    i++;
                    C8298k.m12935d(pageBlock2, "pageBlock");
                    TdApi.RichText E0 = C7321e.m17010E0(pageBlock2, str);
                    if (E0 != null) {
                        return E0;
                    }
                }
                return null;
            case TdApi.PageBlockPreformatted.CONSTRUCTOR:
                TdApi.RichText richText5 = ((TdApi.PageBlockPreformatted) pageBlock).text;
                C8298k.m12935d(richText5, "this as PageBlockPreformatted).text");
                return C7321e.m17008F0(richText5, str);
            case TdApi.PageBlockList.CONSTRUCTOR:
                TdApi.PageBlockListItem[] pageBlockListItemArr = ((TdApi.PageBlockList) pageBlock).items;
                C8298k.m12935d(pageBlockListItemArr, "this as PageBlockList).items");
                int length2 = pageBlockListItemArr.length;
                int i2 = 0;
                while (i2 < length2) {
                    TdApi.PageBlockListItem pageBlockListItem = pageBlockListItemArr[i2];
                    i2++;
                    TdApi.PageBlock[] pageBlockArr2 = pageBlockListItem.pageBlocks;
                    C8298k.m12935d(pageBlockArr2, "pageBlockListItem.pageBlocks");
                    int length3 = pageBlockArr2.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        TdApi.PageBlock pageBlock3 = pageBlockArr2[i3];
                        i3++;
                        C8298k.m12935d(pageBlock3, "pageBlock");
                        TdApi.RichText E02 = C7321e.m17010E0(pageBlock3, str);
                        if (E02 != null) {
                            return E02;
                        }
                    }
                }
                return null;
            case TdApi.PageBlockTable.CONSTRUCTOR:
                TdApi.PageBlockTable pageBlockTable = (TdApi.PageBlockTable) pageBlock;
                TdApi.PageBlockTableCell[][] pageBlockTableCellArr = pageBlockTable.cells;
                C8298k.m12935d(pageBlockTableCellArr, "table.cells");
                int length4 = pageBlockTableCellArr.length;
                int i4 = 0;
                while (i4 < length4) {
                    TdApi.PageBlockTableCell[] pageBlockTableCellArr2 = pageBlockTableCellArr[i4];
                    i4++;
                    C8298k.m12935d(pageBlockTableCellArr2, "row");
                    int length5 = pageBlockTableCellArr2.length;
                    int i5 = 0;
                    while (i5 < length5) {
                        TdApi.PageBlockTableCell pageBlockTableCell = pageBlockTableCellArr2[i5];
                        i5++;
                        TdApi.RichText richText6 = pageBlockTableCell.text;
                        TdApi.RichText F03 = richText6 == null ? null : C7321e.m17008F0(richText6, str);
                        if (F03 != null) {
                            return F03;
                        }
                    }
                }
                TdApi.RichText richText7 = pageBlockTable.caption;
                C8298k.m12935d(richText7, "table.caption");
                return C7321e.m17008F0(richText7, str);
            case TdApi.PageBlockAnchor.CONSTRUCTOR:
            case TdApi.PageBlockDivider.CONSTRUCTOR:
            case TdApi.PageBlockChatLink.CONSTRUCTOR:
                return null;
            case TdApi.PageBlockAudio.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption2 = ((TdApi.PageBlockAudio) pageBlock).caption;
                TdApi.RichText richText8 = pageBlockCaption2.text;
                C8298k.m12935d(richText8, "caption.text");
                TdApi.RichText F04 = C7321e.m17008F0(richText8, str);
                if (F04 != null) {
                    return F04;
                }
                TdApi.RichText richText9 = pageBlockCaption2.credit;
                C8298k.m12935d(richText9, "caption.credit");
                return C7321e.m17008F0(richText9, str);
            case TdApi.PageBlockSubtitle.CONSTRUCTOR:
                TdApi.RichText richText10 = ((TdApi.PageBlockSubtitle) pageBlock).subtitle;
                C8298k.m12935d(richText10, "this as PageBlockSubtitle).subtitle");
                return C7321e.m17008F0(richText10, str);
            case TdApi.PageBlockEmbeddedPost.CONSTRUCTOR:
                TdApi.PageBlockEmbeddedPost pageBlockEmbeddedPost = (TdApi.PageBlockEmbeddedPost) pageBlock;
                TdApi.PageBlock[] pageBlockArr3 = pageBlockEmbeddedPost.pageBlocks;
                C8298k.m12935d(pageBlockArr3, "post.pageBlocks");
                int length6 = pageBlockArr3.length;
                while (i < length6) {
                    TdApi.PageBlock pageBlock4 = pageBlockArr3[i];
                    i++;
                    C8298k.m12935d(pageBlock4, "pageBlock");
                    TdApi.RichText E03 = C7321e.m17010E0(pageBlock4, str);
                    if (E03 != null) {
                        return E03;
                    }
                }
                TdApi.RichText richText11 = pageBlockEmbeddedPost.caption.text;
                C8298k.m12935d(richText11, "post.caption.text");
                TdApi.RichText F05 = C7321e.m17008F0(richText11, str);
                if (F05 != null) {
                    return F05;
                }
                TdApi.RichText richText12 = pageBlockEmbeddedPost.caption.credit;
                C8298k.m12935d(richText12, "post.caption.credit");
                return C7321e.m17008F0(richText12, str);
            case TdApi.PageBlockPhoto.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption3 = ((TdApi.PageBlockPhoto) pageBlock).caption;
                TdApi.RichText richText13 = pageBlockCaption3.text;
                C8298k.m12935d(richText13, "caption.text");
                TdApi.RichText F06 = C7321e.m17008F0(richText13, str);
                if (F06 != null) {
                    return F06;
                }
                TdApi.RichText richText14 = pageBlockCaption3.credit;
                C8298k.m12935d(richText14, "caption.credit");
                return C7321e.m17008F0(richText14, str);
            case TdApi.PageBlockPullQuote.CONSTRUCTOR:
                TdApi.PageBlockPullQuote pageBlockPullQuote = (TdApi.PageBlockPullQuote) pageBlock;
                TdApi.RichText richText15 = pageBlockPullQuote.text;
                C8298k.m12935d(richText15, "quote.text");
                TdApi.RichText F07 = C7321e.m17008F0(richText15, str);
                if (F07 != null) {
                    return F07;
                }
                TdApi.RichText richText16 = pageBlockPullQuote.credit;
                C8298k.m12935d(richText16, "quote.credit");
                return C7321e.m17008F0(richText16, str);
            case TdApi.PageBlockVideo.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption4 = ((TdApi.PageBlockVideo) pageBlock).caption;
                TdApi.RichText richText17 = pageBlockCaption4.text;
                C8298k.m12935d(richText17, "caption.text");
                TdApi.RichText F08 = C7321e.m17008F0(richText17, str);
                if (F08 != null) {
                    return F08;
                }
                TdApi.RichText richText18 = pageBlockCaption4.credit;
                C8298k.m12935d(richText18, "caption.credit");
                return C7321e.m17008F0(richText18, str);
            case TdApi.PageBlockSlideshow.CONSTRUCTOR:
                TdApi.PageBlockSlideshow pageBlockSlideshow = (TdApi.PageBlockSlideshow) pageBlock;
                TdApi.PageBlock[] pageBlockArr4 = pageBlockSlideshow.pageBlocks;
                C8298k.m12935d(pageBlockArr4, "slideshow.pageBlocks");
                int length7 = pageBlockArr4.length;
                while (i < length7) {
                    TdApi.PageBlock pageBlock5 = pageBlockArr4[i];
                    i++;
                    C8298k.m12935d(pageBlock5, "pageBlock");
                    TdApi.RichText E04 = C7321e.m17010E0(pageBlock5, str);
                    if (E04 != null) {
                        return E04;
                    }
                }
                TdApi.RichText richText19 = pageBlockSlideshow.caption.text;
                C8298k.m12935d(richText19, "slideshow.caption.text");
                TdApi.RichText F09 = C7321e.m17008F0(richText19, str);
                if (F09 != null) {
                    return F09;
                }
                TdApi.RichText richText20 = pageBlockSlideshow.caption.credit;
                C8298k.m12935d(richText20, "slideshow.caption.credit");
                return C7321e.m17008F0(richText20, str);
            case TdApi.PageBlockFooter.CONSTRUCTOR:
                TdApi.RichText richText21 = ((TdApi.PageBlockFooter) pageBlock).footer;
                C8298k.m12935d(richText21, "this as PageBlockFooter).footer");
                return C7321e.m17008F0(richText21, str);
            case TdApi.PageBlockCover.CONSTRUCTOR:
                TdApi.PageBlock pageBlock6 = ((TdApi.PageBlockCover) pageBlock).cover;
                C8298k.m12935d(pageBlock6, "this as PageBlockCover).cover");
                return C7321e.m17010E0(pageBlock6, str);
            case TdApi.PageBlockCollage.CONSTRUCTOR:
                TdApi.PageBlockCollage pageBlockCollage = (TdApi.PageBlockCollage) pageBlock;
                TdApi.PageBlock[] pageBlockArr5 = pageBlockCollage.pageBlocks;
                C8298k.m12935d(pageBlockArr5, "collage.pageBlocks");
                int length8 = pageBlockArr5.length;
                while (i < length8) {
                    TdApi.PageBlock pageBlock7 = pageBlockArr5[i];
                    i++;
                    C8298k.m12935d(pageBlock7, "pageBlock");
                    TdApi.RichText E05 = C7321e.m17010E0(pageBlock7, str);
                    if (E05 != null) {
                        return E05;
                    }
                }
                TdApi.RichText richText22 = pageBlockCollage.caption.text;
                C8298k.m12935d(richText22, "collage.caption.text");
                TdApi.RichText F010 = C7321e.m17008F0(richText22, str);
                if (F010 != null) {
                    return F010;
                }
                TdApi.RichText richText23 = pageBlockCollage.caption.credit;
                C8298k.m12935d(richText23, "collage.caption.credit");
                return C7321e.m17008F0(richText23, str);
            case TdApi.PageBlockParagraph.CONSTRUCTOR:
                TdApi.RichText richText24 = ((TdApi.PageBlockParagraph) pageBlock).text;
                C8298k.m12935d(richText24, "this as PageBlockParagraph).text");
                return C7321e.m17008F0(richText24, str);
            case TdApi.PageBlockSubheader.CONSTRUCTOR:
                TdApi.RichText richText25 = ((TdApi.PageBlockSubheader) pageBlock).subheader;
                C8298k.m12935d(richText25, "this as PageBlockSubheader).subheader");
                return C7321e.m17008F0(richText25, str);
            case TdApi.PageBlockAuthorDate.CONSTRUCTOR:
                TdApi.RichText richText26 = ((TdApi.PageBlockAuthorDate) pageBlock).author;
                C8298k.m12935d(richText26, "this as PageBlockAuthorDate).author");
                return C7321e.m17008F0(richText26, str);
            case TdApi.PageBlockAnimation.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption5 = ((TdApi.PageBlockAnimation) pageBlock).caption;
                TdApi.RichText richText27 = pageBlockCaption5.text;
                C8298k.m12935d(richText27, "caption.text");
                TdApi.RichText F011 = C7321e.m17008F0(richText27, str);
                if (F011 != null) {
                    return F011;
                }
                TdApi.RichText richText28 = pageBlockCaption5.credit;
                C8298k.m12935d(richText28, "caption.credit");
                return C7321e.m17008F0(richText28, str);
            case TdApi.PageBlockKicker.CONSTRUCTOR:
                TdApi.RichText richText29 = ((TdApi.PageBlockKicker) pageBlock).kicker;
                C8298k.m12935d(richText29, "this as PageBlockKicker).kicker");
                return C7321e.m17008F0(richText29, str);
            case TdApi.PageBlockHeader.CONSTRUCTOR:
                TdApi.RichText richText30 = ((TdApi.PageBlockHeader) pageBlock).header;
                C8298k.m12935d(richText30, "this as PageBlockHeader).header");
                return C7321e.m17008F0(richText30, str);
            case TdApi.PageBlockMap.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption6 = ((TdApi.PageBlockMap) pageBlock).caption;
                TdApi.RichText richText31 = pageBlockCaption6.text;
                C8298k.m12935d(richText31, "caption.text");
                TdApi.RichText F012 = C7321e.m17008F0(richText31, str);
                if (F012 != null) {
                    return F012;
                }
                TdApi.RichText richText32 = pageBlockCaption6.credit;
                C8298k.m12935d(richText32, "caption.credit");
                return C7321e.m17008F0(richText32, str);
            case TdApi.PageBlockTitle.CONSTRUCTOR:
                TdApi.RichText richText33 = ((TdApi.PageBlockTitle) pageBlock).title;
                C8298k.m12935d(richText33, "this as PageBlockTitle).title");
                return C7321e.m17008F0(richText33, str);
            case TdApi.PageBlockBlockQuote.CONSTRUCTOR:
                TdApi.PageBlockBlockQuote pageBlockBlockQuote = (TdApi.PageBlockBlockQuote) pageBlock;
                TdApi.RichText richText34 = pageBlockBlockQuote.text;
                C8298k.m12935d(richText34, "quote.text");
                TdApi.RichText F013 = C7321e.m17008F0(richText34, str);
                if (F013 != null) {
                    return F013;
                }
                TdApi.RichText richText35 = pageBlockBlockQuote.credit;
                C8298k.m12935d(richText35, "quote.credit");
                return C7321e.m17008F0(richText35, str);
            case TdApi.PageBlockVoiceNote.CONSTRUCTOR:
                TdApi.PageBlockCaption pageBlockCaption7 = ((TdApi.PageBlockVoiceNote) pageBlock).caption;
                TdApi.RichText richText36 = pageBlockCaption7.text;
                C8298k.m12935d(richText36, "caption.text");
                TdApi.RichText F014 = C7321e.m17008F0(richText36, str);
                if (F014 != null) {
                    return F014;
                }
                TdApi.RichText richText37 = pageBlockCaption7.credit;
                C8298k.m12935d(richText37, "caption.credit");
                return C7321e.m17008F0(richText37, str);
            default:
                String object = pageBlock.toString();
                C8298k.m12935d(object, "this.toString()");
                throw new C5047g(C8298k.m12929j("An operation is not implemented: ", object));
        }
    }

    public static final TdApi.RichText m16777m(TdApi.RichText richText, String str) {
        C8298k.m12934e(richText, "<this>");
        C8298k.m12934e(str, "name");
        switch (richText.getConstructor()) {
            case TdApi.RichTextAnchorLink.CONSTRUCTOR:
                TdApi.RichText richText2 = ((TdApi.RichTextAnchorLink) richText).text;
                C8298k.m12935d(richText2, "this as RichTextAnchorLink).text");
                return C7321e.m17008F0(richText2, str);
            case TdApi.RichTextIcon.CONSTRUCTOR:
            case TdApi.RichTextPlain.CONSTRUCTOR:
            case TdApi.RichTextAnchor.CONSTRUCTOR:
                return null;
            case TdApi.RichTextMarked.CONSTRUCTOR:
                TdApi.RichText richText3 = ((TdApi.RichTextMarked) richText).text;
                C8298k.m12935d(richText3, "this as RichTextMarked).text");
                return C7321e.m17008F0(richText3, str);
            case TdApi.RichTextFixed.CONSTRUCTOR:
                TdApi.RichText richText4 = ((TdApi.RichTextFixed) richText).text;
                C8298k.m12935d(richText4, "this as RichTextFixed).text");
                return C7321e.m17008F0(richText4, str);
            case TdApi.RichTextReference.CONSTRUCTOR:
                TdApi.RichText richText5 = ((TdApi.RichTextReference) richText).text;
                C8298k.m12935d(richText5, "this as RichTextReference).text");
                return C7321e.m17008F0(richText5, str);
            case TdApi.RichTextSubscript.CONSTRUCTOR:
                TdApi.RichText richText6 = ((TdApi.RichTextSubscript) richText).text;
                C8298k.m12935d(richText6, "this as RichTextSubscript).text");
                return C7321e.m17008F0(richText6, str);
            case TdApi.RichTextUnderline.CONSTRUCTOR:
                TdApi.RichText richText7 = ((TdApi.RichTextUnderline) richText).text;
                C8298k.m12935d(richText7, "this as RichTextUnderline).text");
                return C7321e.m17008F0(richText7, str);
            case TdApi.RichTextSuperscript.CONSTRUCTOR:
                TdApi.RichText richText8 = ((TdApi.RichTextSuperscript) richText).text;
                C8298k.m12935d(richText8, "this as RichTextSuperscript).text");
                return C7321e.m17008F0(richText8, str);
            case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                TdApi.RichText richText9 = ((TdApi.RichTextEmailAddress) richText).text;
                C8298k.m12935d(richText9, "this as RichTextEmailAddress).text");
                return C7321e.m17008F0(richText9, str);
            case TdApi.RichTextUrl.CONSTRUCTOR:
                TdApi.RichText richText10 = ((TdApi.RichTextUrl) richText).text;
                C8298k.m12935d(richText10, "this as RichTextUrl).text");
                return C7321e.m17008F0(richText10, str);
            case TdApi.RichTextPhoneNumber.CONSTRUCTOR:
                TdApi.RichText richText11 = ((TdApi.RichTextPhoneNumber) richText).text;
                C8298k.m12935d(richText11, "this as RichTextPhoneNumber).text");
                return C7321e.m17008F0(richText11, str);
            case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                TdApi.RichText richText12 = ((TdApi.RichTextStrikethrough) richText).text;
                C8298k.m12935d(richText12, "this as RichTextStrikethrough).text");
                return C7321e.m17008F0(richText12, str);
            case TdApi.RichTexts.CONSTRUCTOR:
                TdApi.RichTexts richTexts = (TdApi.RichTexts) richText;
                TdApi.RichText[] richTextArr = richTexts.texts;
                int i = 0;
                if (richTextArr.length == 2 && richTextArr[0].getConstructor() == 1316950068) {
                    TdApi.RichText richText13 = richTexts.texts[0];
                    Objects.requireNonNull(richText13, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.RichTextAnchor");
                    if (C8298k.m12937b(((TdApi.RichTextAnchor) richText13).name, str)) {
                        return richTexts.texts[1];
                    }
                }
                TdApi.RichText[] richTextArr2 = richTexts.texts;
                C8298k.m12935d(richTextArr2, "texts.texts");
                int length = richTextArr2.length;
                while (i < length) {
                    TdApi.RichText richText14 = richTextArr2[i];
                    i++;
                    C8298k.m12935d(richText14, "text");
                    TdApi.RichText F0 = C7321e.m17008F0(richText14, str);
                    if (F0 != null) {
                        return F0;
                    }
                }
                return null;
            case TdApi.RichTextBold.CONSTRUCTOR:
                TdApi.RichText richText15 = ((TdApi.RichTextBold) richText).text;
                C8298k.m12935d(richText15, "this as RichTextBold).text");
                return C7321e.m17008F0(richText15, str);
            case TdApi.RichTextItalic.CONSTRUCTOR:
                TdApi.RichText richText16 = ((TdApi.RichTextItalic) richText).text;
                C8298k.m12935d(richText16, "this as RichTextItalic).text");
                return C7321e.m17008F0(richText16, str);
            default:
                String object = richText.toString();
                C8298k.m12935d(object, "this.toString()");
                throw new C5047g(C8298k.m12929j("An operation is not implemented: ", object));
        }
    }

    public static final TdApi.RichText m16776n(TdApi.WebPageInstantView webPageInstantView, String str) {
        C8298k.m12934e(webPageInstantView, "<this>");
        int i = 0;
        if (str == null || str.length() == 0) {
            return null;
        }
        TdApi.PageBlock[] pageBlockArr = webPageInstantView.pageBlocks;
        C8298k.m12935d(pageBlockArr, "this.pageBlocks");
        int length = pageBlockArr.length;
        while (i < length) {
            TdApi.PageBlock pageBlock = pageBlockArr[i];
            i++;
            C8298k.m12935d(pageBlock, "pageBlock");
            TdApi.RichText E0 = C7321e.m17010E0(pageBlock, str);
            if (E0 != null) {
                return E0;
            }
        }
        return null;
    }

    public static final TdApi.PhotoSize m16775o(TdApi.Photo photo) {
        TdApi.PhotoSize[] photoSizeArr;
        if (photo == null || (photoSizeArr = photo.sizes) == null) {
            return null;
        }
        return C7321e.m17002I0(photoSizeArr);
    }

    public static final TdApi.PhotoSize m16774p(TdApi.PhotoSize[] photoSizeArr) {
        C8298k.m12934e(photoSizeArr, "<this>");
        int i = 1;
        if (!(!(photoSizeArr.length == 0))) {
            return null;
        }
        TdApi.PhotoSize photoSize = photoSizeArr[0];
        int length = photoSizeArr.length;
        while (i < length) {
            i++;
            TdApi.PhotoSize photoSize2 = photoSizeArr[i];
            if (photoSize2.width < photoSize.width || photoSize2.height < photoSize.height) {
                photoSize = photoSize2;
            }
        }
        return photoSize;
    }

    public static final String m16773q(TdApi.FormattedText formattedText, String str, boolean z) {
        Boolean bool;
        Uri H;
        TdApi.TextEntity[] textEntityArr;
        C8298k.m12934e(str, "lookupUrl");
        int i = 0;
        if (formattedText == null || (textEntityArr = formattedText.entities) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(textEntityArr.length == 0);
        }
        if (bool == null || bool.booleanValue() || (H = C5070i.m24070H(str)) == null) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
        C8298k.m12935d(textEntityArr2, "this.entities");
        int length = textEntityArr2.length;
        String str2 = null;
        int i2 = 0;
        while (i < length) {
            TdApi.TextEntity textEntity = textEntityArr2[i];
            i++;
            int constructor = textEntity.type.getConstructor();
            if (constructor == -1312762756) {
                String str3 = formattedText.text;
                C8298k.m12935d(str3, "this.text");
                str2 = C7321e.m16911s1(str3, textEntity);
            } else if (constructor != 445719651) {
                continue;
            } else {
                TdApi.TextEntityType textEntityType = textEntity.type;
                Objects.requireNonNull(textEntityType, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.TextEntityTypeTextUrl");
                str2 = ((TdApi.TextEntityTypeTextUrl) textEntityType).url;
            }
            i2++;
            Uri H2 = C5070i.m24070H(str2);
            if (H2 != null && C8298k.m12937b(H2.buildUpon().fragment(null).build(), H)) {
                return str2;
            }
        }
        if (!z) {
            return str;
        }
        if (i2 == 1) {
            return str2;
        }
        return null;
    }

    public static final String m16772r(TdApi.ChatMemberStatus chatMemberStatus) {
        C8298k.m12934e(chatMemberStatus, "<this>");
        int constructor = chatMemberStatus.getConstructor();
        if (constructor == -160019714) {
            return ((TdApi.ChatMemberStatusCreator) chatMemberStatus).customTitle;
        }
        if (constructor != 82243562) {
            return null;
        }
        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).customTitle;
    }

    public static final int m16771s(TdApi.File file) {
        if (file == null) {
            return 0;
        }
        return file.f25373id;
    }

    public static final long m16770t(TdApi.Message message) {
        long v;
        v = m16768v(message, false, 1, null);
        return v;
    }

    public static final long m16769u(TdApi.Message message, boolean z) {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (message == null) {
            return 0L;
        }
        if (!z || (messageForwardInfo = message.forwardInfo) == null) {
            int constructor = message.senderId.getConstructor();
            if (constructor == -336109341) {
                TdApi.MessageSender messageSender = message.senderId;
                Objects.requireNonNull(messageSender, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageSenderUser");
                return C7316a.m17058c(((TdApi.MessageSenderUser) messageSender).userId);
            } else if (constructor == -239660751) {
                TdApi.MessageSender messageSender2 = message.senderId;
                Objects.requireNonNull(messageSender2, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageSenderChat");
                return ((TdApi.MessageSenderChat) messageSender2).chatId;
            } else {
                String object = message.senderId.toString();
                C8298k.m12935d(object, "this.senderId.toString()");
                throw new C5047g(C8298k.m12929j("An operation is not implemented: ", object));
            }
        } else {
            switch (messageForwardInfo.origin.getConstructor()) {
                case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                    return 0L;
                case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                    TdApi.MessageForwardOrigin messageForwardOrigin = messageForwardInfo.origin;
                    Objects.requireNonNull(messageForwardOrigin, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageForwardOriginUser");
                    return C7316a.m17058c(((TdApi.MessageForwardOriginUser) messageForwardOrigin).senderUserId);
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
                    C8298k.m12935d(object2, "forwardInfo.origin.toString()");
                    throw new C5047g(C8298k.m12929j("An operation is not implemented: ", object2));
            }
        }
    }

    public static long m16768v(TdApi.Message message, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return C7321e.m16992N0(message, z);
    }

    public static final long m16767w(TdApi.Message message) {
        return C7321e.m16986Q0(message == null ? null : message.senderId);
    }

    public static final long m16766x(TdApi.MessageSender messageSender) {
        if (messageSender == null) {
            return 0L;
        }
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            return C7316a.m17058c(((TdApi.MessageSenderUser) messageSender).userId);
        }
        if (constructor == -239660751) {
            return ((TdApi.MessageSenderChat) messageSender).chatId;
        }
        String object = messageSender.toString();
        C8298k.m12935d(object, "this.toString()");
        throw new C5047g(C8298k.m12929j("An operation is not implemented: ", object));
    }

    public static final long m16765y(TdApi.Message message) {
        return C7321e.m16982S0(message == null ? null : message.senderId);
    }

    public static final long m16764z(TdApi.MessageSender messageSender) {
        boolean z = false;
        if (messageSender != null && messageSender.getConstructor() == -336109341) {
            z = true;
        }
        if (!z) {
            return 0L;
        }
        Objects.requireNonNull(messageSender, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.MessageSenderUser");
        return ((TdApi.MessageSenderUser) messageSender).userId;
    }
}
