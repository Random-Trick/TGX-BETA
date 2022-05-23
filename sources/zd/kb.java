package zd;

import hd.f0;
import hd.t2;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;

public class kb {
    public final TdApi.File f27874a;
    public final int f27875b;
    public final boolean f27876c;
    public final int f27877d;
    public final int f27878e;

    public kb(TdApi.File file, int i10, boolean z10, int i11, int i12) {
        this.f27874a = file;
        this.f27875b = i10;
        this.f27876c = z10;
        this.f27877d = i11;
        this.f27878e = i12;
    }

    public static kb b(o6 o6Var, TdApi.Chat chat, TdApi.NotificationType notificationType) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        TdApi.File file;
        TdApi.File file2;
        int i13;
        int i14;
        TdApi.Photo photo;
        int i15;
        TdApi.File file3;
        TdApi.PushMessageContentSticker pushMessageContentSticker;
        TdApi.Sticker sticker;
        TdApi.File file4;
        int i16;
        int i17;
        if (notificationType == null) {
            return null;
        }
        int constructor = notificationType.getConstructor();
        int i18 = 2;
        int i19 = 0;
        boolean z11 = true;
        if (constructor != -711680462) {
            if (constructor == 1885935159) {
                TdApi.Message message = ((TdApi.NotificationTypeNewMessage) notificationType).message;
                int constructor2 = message.content.getConstructor();
                if (constructor2 == -1851395174) {
                    TdApi.MessagePhoto messagePhoto = (TdApi.MessagePhoto) message.content;
                    if (!messagePhoto.isSecret) {
                        TdApi.PhotoSize n10 = f0.n(messagePhoto.photo);
                        if (n10 == null || (!t2.T2(n10.photo) && !o6Var.m5().k(n10.photo, 1, chat.type))) {
                            file4 = null;
                            i17 = 0;
                            i16 = 0;
                        } else {
                            TdApi.File file5 = n10.photo;
                            i16 = n10.width;
                            int i20 = n10.height;
                            file4 = file5;
                            i17 = i20;
                        }
                        i10 = i17;
                        i11 = i16;
                        file = file4;
                        i12 = 0;
                        z10 = true;
                    }
                } else if (constructor2 != 1779022878) {
                    return null;
                } else {
                    TdApi.MessageSticker messageSticker = (TdApi.MessageSticker) message.content;
                    TdApi.Sticker sticker2 = messageSticker.sticker;
                    file = sticker2.sticker;
                    if (!e.X0(sticker2.type)) {
                        i18 = 1;
                    }
                    TdApi.Sticker sticker3 = messageSticker.sticker;
                    i11 = sticker3.width;
                    i10 = sticker3.height;
                    i12 = i18;
                    z10 = false;
                }
            }
            file = null;
            i12 = 0;
            z10 = false;
            i11 = 0;
            i10 = 0;
        } else {
            TdApi.PushMessageContent pushMessageContent = ((TdApi.NotificationTypeNewPushMessage) notificationType).content;
            int constructor3 = pushMessageContent.getConstructor();
            if (constructor3 != 140631122) {
                if (constructor3 == 1553513939 && (sticker = (pushMessageContentSticker = (TdApi.PushMessageContentSticker) pushMessageContent).sticker) != null) {
                    TdApi.File file6 = sticker.sticker;
                    if (!e.X0(sticker.type)) {
                        i18 = 1;
                    }
                    TdApi.Sticker sticker4 = pushMessageContentSticker.sticker;
                    i13 = sticker4.width;
                    i14 = sticker4.height;
                    i19 = i18;
                    z11 = false;
                    file2 = file6;
                    i10 = i14;
                    i11 = i13;
                    file = file2;
                    i12 = i19;
                    z10 = z11;
                }
                file2 = null;
                i14 = 0;
                i13 = 0;
                z11 = false;
                i10 = i14;
                i11 = i13;
                file = file2;
                i12 = i19;
                z10 = z11;
            } else {
                TdApi.PushMessageContentPhoto pushMessageContentPhoto = (TdApi.PushMessageContentPhoto) pushMessageContent;
                if (!pushMessageContentPhoto.isSecret && (photo = pushMessageContentPhoto.photo) != null) {
                    TdApi.PhotoSize n11 = f0.n(photo);
                    if (n11 == null || (!t2.T2(n11.photo) && !o6Var.m5().k(n11.photo, 1, chat.type))) {
                        file3 = null;
                        i13 = 0;
                        i15 = 0;
                    } else {
                        file3 = n11.photo;
                        i13 = n11.width;
                        i15 = n11.height;
                    }
                    i14 = i15;
                    file2 = file3;
                    i10 = i14;
                    i11 = i13;
                    file = file2;
                    i12 = i19;
                    z10 = z11;
                }
                file2 = null;
                i14 = 0;
                i13 = 0;
                z11 = false;
                i10 = i14;
                i11 = i13;
                file = file2;
                i12 = i19;
                z10 = z11;
            }
        }
        if (file != null) {
            return new kb(file, i12, z10, i11, i10);
        }
        return null;
    }

    public boolean a() {
        int i10 = this.f27875b;
        return i10 == 1 || i10 == 2;
    }
}
