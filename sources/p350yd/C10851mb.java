package p350yd;

import gd.C4630f0;
import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p193nb.C7321e;

public class C10851mb {
    public final TdApi.File f34770a;
    public final int f34771b;
    public final boolean f34772c;
    public final int f34773d;
    public final int f34774e;

    public C10851mb(TdApi.File file, int i, boolean z, int i2, int i3) {
        this.f34770a = file;
        this.f34771b = i;
        this.f34772c = z;
        this.f34773d = i2;
        this.f34774e = i3;
    }

    public static C10851mb m3001b(C10930q6 q6Var, TdApi.Chat chat, TdApi.NotificationType notificationType) {
        int i;
        int i2;
        boolean z;
        int i3;
        TdApi.File file;
        TdApi.File file2;
        int i4;
        int i5;
        TdApi.Photo photo;
        int i6;
        TdApi.File file3;
        TdApi.PushMessageContentSticker pushMessageContentSticker;
        TdApi.Sticker sticker;
        TdApi.File file4;
        int i7;
        int i8;
        if (notificationType == null) {
            return null;
        }
        int constructor = notificationType.getConstructor();
        int i9 = 2;
        int i10 = 0;
        boolean z2 = true;
        if (constructor != -711680462) {
            if (constructor == 1885935159) {
                TdApi.Message message = ((TdApi.NotificationTypeNewMessage) notificationType).message;
                int constructor2 = message.content.getConstructor();
                if (constructor2 == -1851395174) {
                    TdApi.MessagePhoto messagePhoto = (TdApi.MessagePhoto) message.content;
                    if (!messagePhoto.isSecret) {
                        TdApi.PhotoSize n = C4630f0.m26734n(messagePhoto.photo);
                        if (n == null || (!C4779t2.m25598T2(n.photo) && !q6Var.m2413i5().m3985k(n.photo, 1, chat.type))) {
                            file4 = null;
                            i8 = 0;
                            i7 = 0;
                        } else {
                            TdApi.File file5 = n.photo;
                            i7 = n.width;
                            int i11 = n.height;
                            file4 = file5;
                            i8 = i11;
                        }
                        i = i8;
                        i2 = i7;
                        file = file4;
                        i3 = 0;
                        z = true;
                    }
                } else if (constructor2 != 1779022878) {
                    return null;
                } else {
                    TdApi.MessageSticker messageSticker = (TdApi.MessageSticker) message.content;
                    TdApi.Sticker sticker2 = messageSticker.sticker;
                    file = sticker2.sticker;
                    if (!C7321e.m16976V0(sticker2.type)) {
                        i9 = 1;
                    }
                    TdApi.Sticker sticker3 = messageSticker.sticker;
                    i2 = sticker3.width;
                    i = sticker3.height;
                    i3 = i9;
                    z = false;
                }
            }
            file = null;
            i3 = 0;
            z = false;
            i2 = 0;
            i = 0;
        } else {
            TdApi.PushMessageContent pushMessageContent = ((TdApi.NotificationTypeNewPushMessage) notificationType).content;
            int constructor3 = pushMessageContent.getConstructor();
            if (constructor3 != 140631122) {
                if (constructor3 == 1553513939 && (sticker = (pushMessageContentSticker = (TdApi.PushMessageContentSticker) pushMessageContent).sticker) != null) {
                    TdApi.File file6 = sticker.sticker;
                    if (!C7321e.m16976V0(sticker.type)) {
                        i9 = 1;
                    }
                    TdApi.Sticker sticker4 = pushMessageContentSticker.sticker;
                    i4 = sticker4.width;
                    i5 = sticker4.height;
                    i10 = i9;
                    z2 = false;
                    file2 = file6;
                    i = i5;
                    i2 = i4;
                    file = file2;
                    i3 = i10;
                    z = z2;
                }
                file2 = null;
                i5 = 0;
                i4 = 0;
                z2 = false;
                i = i5;
                i2 = i4;
                file = file2;
                i3 = i10;
                z = z2;
            } else {
                TdApi.PushMessageContentPhoto pushMessageContentPhoto = (TdApi.PushMessageContentPhoto) pushMessageContent;
                if (!pushMessageContentPhoto.isSecret && (photo = pushMessageContentPhoto.photo) != null) {
                    TdApi.PhotoSize n2 = C4630f0.m26734n(photo);
                    if (n2 == null || (!C4779t2.m25598T2(n2.photo) && !q6Var.m2413i5().m3985k(n2.photo, 1, chat.type))) {
                        file3 = null;
                        i4 = 0;
                        i6 = 0;
                    } else {
                        file3 = n2.photo;
                        i4 = n2.width;
                        i6 = n2.height;
                    }
                    i5 = i6;
                    file2 = file3;
                    i = i5;
                    i2 = i4;
                    file = file2;
                    i3 = i10;
                    z = z2;
                }
                file2 = null;
                i5 = 0;
                i4 = 0;
                z2 = false;
                i = i5;
                i2 = i4;
                file = file2;
                i3 = i10;
                z = z2;
            }
        }
        if (file != null) {
            return new C10851mb(file, i3, z, i2, i);
        }
        return null;
    }

    public boolean m3002a() {
        int i = this.f34771b;
        return i == 1 || i == 2;
    }
}
