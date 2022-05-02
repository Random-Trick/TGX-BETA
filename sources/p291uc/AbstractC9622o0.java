package p291uc;

import android.graphics.Canvas;
import android.view.View;
import gd.C4779t2;
import java.io.File;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p051db.C3955n;
import p051db.C3962o;
import p111he.AbstractC5143t;
import p156kd.C6238b;
import p193nb.C7321e;
import p350yd.C10930q6;

public abstract class AbstractC9622o0 implements C3955n.AbstractC3959d {
    public final int f31200a;
    public int f31201b;

    public AbstractC9622o0(int i, int i2) {
        this.f31200a = i;
        this.f31201b = i2;
    }

    public static AbstractC9622o0 m7988i(C10930q6 q6Var, File file, String str, int i, int i2) {
        try {
            return new C9629p0(q6Var, i, i2, file, str);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public static AbstractC9622o0 m7987j(C10930q6 q6Var, TdApi.Audio audio, int i, int i2) {
        TdApi.Thumbnail thumbnail = audio.albumCoverThumbnail;
        if (thumbnail == null && audio.albumCoverMinithumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, thumbnail, audio.albumCoverMinithumbnail);
    }

    public static AbstractC9622o0 m7986k(C10930q6 q6Var, TdApi.ChatPhotoInfo chatPhotoInfo, int i, int i2) {
        if (chatPhotoInfo != null) {
            return new C9629p0(q6Var, i, i2, chatPhotoInfo);
        }
        return null;
    }

    public static AbstractC9622o0 m7985l(C10930q6 q6Var, TdApi.Document document, int i, int i2) {
        TdApi.Minithumbnail minithumbnail = document.minithumbnail;
        if (minithumbnail == null && document.thumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, document.thumbnail, minithumbnail);
    }

    public static AbstractC9622o0 m7984m(C10930q6 q6Var, TdApi.Game game, int i, int i2) {
        TdApi.Animation animation = game.animation;
        if (animation != null) {
            TdApi.Minithumbnail minithumbnail = animation.minithumbnail;
            if (minithumbnail == null && animation.thumbnail == null) {
                return null;
            }
            return new C9629p0(q6Var, i, i2, animation.thumbnail, minithumbnail);
        }
        TdApi.Photo photo = game.photo;
        if (photo == null) {
            return null;
        }
        TdApi.PhotoSize H0 = C7321e.m17004H0(photo);
        if (H0 == null && game.photo.minithumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, C4779t2.m25656K5(H0), game.photo.minithumbnail);
    }

    public static AbstractC9622o0 m7983n(C10930q6 q6Var, TdApi.Location location, TdApi.Thumbnail thumbnail, int i, int i2) {
        if (location == null && thumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, location, thumbnail);
    }

    public static AbstractC9622o0 m7982o(C10930q6 q6Var, TdApi.Message message, C4779t2.C4783d dVar, int i, int i2) {
        TdApi.PhotoSize H0;
        C10930q6.C10936f d = dVar != null ? dVar.m25375d() : null;
        if (d != null) {
            List<TdApi.Message> list = d.f35136a;
            TdApi.Message message2 = list.get(list.size() - 1);
            if (message2 != message) {
                return m7982o(q6Var, message2, null, i, i2);
            }
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessageVenue.CONSTRUCTOR:
                return m7979r(q6Var, ((TdApi.MessageVenue) message.content).venue, null, i, i2);
            case TdApi.MessagePhoto.CONSTRUCTOR:
                TdApi.Photo photo = ((TdApi.MessagePhoto) message.content).photo;
                TdApi.PhotoSize H02 = C7321e.m17004H0(photo);
                if (!(H02 == null && photo.minithumbnail == null)) {
                    return new C9629p0(q6Var, i, i2, C4779t2.m25656K5(H02), photo.minithumbnail);
                }
                break;
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                TdApi.ChatPhoto chatPhoto = ((TdApi.MessageChatChangePhoto) message.content).photo;
                TdApi.PhotoSize I0 = C7321e.m17002I0(chatPhoto.sizes);
                if (!(I0 == null && chatPhoto.minithumbnail == null)) {
                    return new C9629p0(q6Var, i, i2, C4779t2.m25656K5(I0), chatPhoto.minithumbnail);
                }
                break;
            case TdApi.MessageGame.CONSTRUCTOR:
                return m7984m(q6Var, ((TdApi.MessageGame) message.content).game, i, i2);
            case TdApi.MessageAudio.CONSTRUCTOR:
                TdApi.Audio audio = ((TdApi.MessageAudio) message.content).audio;
                TdApi.Thumbnail thumbnail = audio.albumCoverThumbnail;
                if (!(thumbnail == null && audio.albumCoverMinithumbnail == null)) {
                    return new C9629p0(q6Var, i, i2, thumbnail, audio.albumCoverMinithumbnail);
                }
                break;
            case TdApi.MessageLocation.CONSTRUCTOR:
                return m7983n(q6Var, ((TdApi.MessageLocation) message.content).location, null, i, i2);
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                TdApi.VoiceNote voiceNote = ((TdApi.MessageVoiceNote) message.content).voiceNote;
                break;
            case TdApi.MessageDocument.CONSTRUCTOR:
                return m7985l(q6Var, ((TdApi.MessageDocument) message.content).document, i, i2);
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                TdApi.VideoNote videoNote = ((TdApi.MessageVideoNote) message.content).videoNote;
                return new C9629p0(q6Var, i, i / 2, videoNote.thumbnail, videoNote.minithumbnail);
            case TdApi.MessageAnimation.CONSTRUCTOR:
                TdApi.Animation animation = ((TdApi.MessageAnimation) message.content).animation;
                TdApi.Minithumbnail minithumbnail = animation.minithumbnail;
                if (!(minithumbnail == null && animation.thumbnail == null)) {
                    return new C9629p0(q6Var, i, i2, animation.thumbnail, minithumbnail);
                }
                break;
            case TdApi.MessageSticker.CONSTRUCTOR:
                return new C9629p0(q6Var, i, i2, ((TdApi.MessageSticker) message.content).sticker);
            case TdApi.MessageText.CONSTRUCTOR:
                TdApi.WebPage webPage = ((TdApi.MessageText) message.content).webPage;
                if (webPage != null) {
                    TdApi.Video video = webPage.video;
                    if (video != null) {
                        return m7978s(q6Var, video, i, i2);
                    }
                    TdApi.Sticker sticker = webPage.sticker;
                    if (sticker != null) {
                        return new C9629p0(q6Var, i2, i, sticker);
                    }
                    TdApi.Animation animation2 = webPage.animation;
                    if (animation2 != null) {
                        TdApi.Thumbnail thumbnail2 = animation2.thumbnail;
                        if (!(thumbnail2 == null && animation2.minithumbnail == null)) {
                            return new C9629p0(q6Var, i, i2, thumbnail2, animation2.minithumbnail);
                        }
                    } else {
                        TdApi.VideoNote videoNote2 = webPage.videoNote;
                        if (videoNote2 != null) {
                            return new C9629p0(q6Var, i, i / 2, videoNote2.thumbnail, videoNote2.minithumbnail);
                        }
                        if (webPage.voiceNote == null) {
                            TdApi.Document document = webPage.document;
                            if (document != null) {
                                return m7985l(q6Var, document, i, i2);
                            }
                            TdApi.Photo photo2 = webPage.photo;
                            if (!(photo2 == null || ((H0 = C7321e.m17004H0(photo2)) == null && webPage.photo.minithumbnail == null))) {
                                return new C9629p0(q6Var, i, i2, C4779t2.m25656K5(H0), webPage.photo.minithumbnail);
                            }
                        }
                    }
                }
                break;
            case TdApi.MessageVideo.CONSTRUCTOR:
                return m7978s(q6Var, ((TdApi.MessageVideo) message.content).video, i, i2);
        }
        return null;
    }

    public static AbstractC9622o0 m7981p(C10930q6 q6Var, TdApi.ProfilePhoto profilePhoto, TdApi.Thumbnail thumbnail, int i, int i2) {
        if (profilePhoto == null && thumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, profilePhoto, thumbnail);
    }

    public static AbstractC9622o0 m7980q(C10930q6 q6Var, TdApi.Thumbnail thumbnail, TdApi.Minithumbnail minithumbnail, int i, int i2) {
        if (thumbnail == null && minithumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, thumbnail, minithumbnail);
    }

    public static AbstractC9622o0 m7979r(C10930q6 q6Var, TdApi.Venue venue, TdApi.Thumbnail thumbnail, int i, int i2) {
        if (venue == null && thumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, venue, thumbnail);
    }

    public static AbstractC9622o0 m7978s(C10930q6 q6Var, TdApi.Video video, int i, int i2) {
        TdApi.Thumbnail thumbnail = video.thumbnail;
        if (thumbnail == null && video.minithumbnail == null) {
            return null;
        }
        return new C9629p0(q6Var, i, i2, thumbnail, video.minithumbnail);
    }

    public final <T extends View & AbstractC5143t> void m7993a(T t, Canvas canvas, C6238b bVar, float f, float f2, float f3) {
        mo7957b(t, canvas, bVar, f, f2, getWidth(), getHeight(), this.f31201b, f3);
    }

    public abstract <T extends View & AbstractC5143t> void mo7957b(T t, Canvas canvas, C6238b bVar, float f, float f2, float f3, float f4, int i, float f5);

    public final int m7992c() {
        return this.f31201b;
    }

    @Override
    public int mo7991d(boolean z) {
        return C3962o.m29472a(this, z);
    }

    public abstract boolean mo7956e(C6238b bVar);

    public void mo7955f(C6238b bVar, boolean z) {
        bVar.m21000d();
    }

    @Override
    public int mo7990g(boolean z) {
        return C3962o.m29471b(this, z);
    }

    @Override
    public int getHeight() {
        return this.f31200a;
    }

    @Override
    public int getWidth() {
        return this.f31200a;
    }

    public void m7989h(int i) {
        this.f31201b = i;
    }
}
