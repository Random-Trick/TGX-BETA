package vc;

import android.graphics.Canvas;
import android.view.View;
import eb.n;
import eb.o;
import hd.t2;
import ie.t;
import java.io.File;
import java.util.List;
import ld.b;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public abstract class n0 implements n.d {
    public final int f25128a;
    public int f25129b;

    public n0(int i10, int i11) {
        this.f25128a = i10;
        this.f25129b = i11;
    }

    public static n0 i(o6 o6Var, File file, String str, int i10, int i11) {
        try {
            return new o0(o6Var, i10, i11, file, str);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public static n0 j(o6 o6Var, TdApi.Audio audio, int i10, int i11) {
        TdApi.Thumbnail thumbnail = audio.albumCoverThumbnail;
        if (thumbnail == null && audio.albumCoverMinithumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, thumbnail, audio.albumCoverMinithumbnail);
    }

    public static n0 k(o6 o6Var, TdApi.ChatPhotoInfo chatPhotoInfo, int i10, int i11) {
        if (chatPhotoInfo != null) {
            return new o0(o6Var, i10, i11, chatPhotoInfo);
        }
        return null;
    }

    public static n0 l(o6 o6Var, TdApi.Document document, int i10, int i11) {
        TdApi.Minithumbnail minithumbnail = document.minithumbnail;
        if (minithumbnail == null && document.thumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, document.thumbnail, minithumbnail);
    }

    public static n0 m(o6 o6Var, TdApi.Game game, int i10, int i11) {
        TdApi.Animation animation = game.animation;
        if (animation != null) {
            TdApi.Minithumbnail minithumbnail = animation.minithumbnail;
            if (minithumbnail == null && animation.thumbnail == null) {
                return null;
            }
            return new o0(o6Var, i10, i11, animation.thumbnail, minithumbnail);
        }
        TdApi.Photo photo = game.photo;
        if (photo == null) {
            return null;
        }
        TdApi.PhotoSize J0 = e.J0(photo);
        if (J0 == null && game.photo.minithumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, t2.K5(J0), game.photo.minithumbnail);
    }

    public static n0 n(o6 o6Var, TdApi.Location location, TdApi.Thumbnail thumbnail, int i10, int i11) {
        if (location == null && thumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, location, thumbnail);
    }

    public static n0 o(o6 o6Var, TdApi.Message message, t2.d dVar, int i10, int i11) {
        TdApi.PhotoSize J0;
        o6.f d10 = dVar != null ? dVar.d() : null;
        if (d10 != null) {
            List<TdApi.Message> list = d10.f28132a;
            TdApi.Message message2 = list.get(list.size() - 1);
            if (message2 != message) {
                return o(o6Var, message2, null, i10, i11);
            }
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessageVenue.CONSTRUCTOR:
                return r(o6Var, ((TdApi.MessageVenue) message.content).venue, null, i10, i11);
            case TdApi.MessagePhoto.CONSTRUCTOR:
                TdApi.Photo photo = ((TdApi.MessagePhoto) message.content).photo;
                TdApi.PhotoSize J02 = e.J0(photo);
                if (!(J02 == null && photo.minithumbnail == null)) {
                    return new o0(o6Var, i10, i11, t2.K5(J02), photo.minithumbnail);
                }
                break;
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                TdApi.ChatPhoto chatPhoto = ((TdApi.MessageChatChangePhoto) message.content).photo;
                TdApi.PhotoSize K0 = e.K0(chatPhoto.sizes);
                if (!(K0 == null && chatPhoto.minithumbnail == null)) {
                    return new o0(o6Var, i10, i11, t2.K5(K0), chatPhoto.minithumbnail);
                }
                break;
            case TdApi.MessageGame.CONSTRUCTOR:
                return m(o6Var, ((TdApi.MessageGame) message.content).game, i10, i11);
            case TdApi.MessageAudio.CONSTRUCTOR:
                TdApi.Audio audio = ((TdApi.MessageAudio) message.content).audio;
                TdApi.Thumbnail thumbnail = audio.albumCoverThumbnail;
                if (!(thumbnail == null && audio.albumCoverMinithumbnail == null)) {
                    return new o0(o6Var, i10, i11, thumbnail, audio.albumCoverMinithumbnail);
                }
                break;
            case TdApi.MessageLocation.CONSTRUCTOR:
                return n(o6Var, ((TdApi.MessageLocation) message.content).location, null, i10, i11);
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                TdApi.VoiceNote voiceNote = ((TdApi.MessageVoiceNote) message.content).voiceNote;
                break;
            case TdApi.MessageDocument.CONSTRUCTOR:
                return l(o6Var, ((TdApi.MessageDocument) message.content).document, i10, i11);
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                TdApi.VideoNote videoNote = ((TdApi.MessageVideoNote) message.content).videoNote;
                return new o0(o6Var, i10, i10 / 2, videoNote.thumbnail, videoNote.minithumbnail);
            case TdApi.MessageAnimation.CONSTRUCTOR:
                TdApi.Animation animation = ((TdApi.MessageAnimation) message.content).animation;
                TdApi.Minithumbnail minithumbnail = animation.minithumbnail;
                if (!(minithumbnail == null && animation.thumbnail == null)) {
                    return new o0(o6Var, i10, i11, animation.thumbnail, minithumbnail);
                }
                break;
            case TdApi.MessageSticker.CONSTRUCTOR:
                return new o0(o6Var, i10, i11, ((TdApi.MessageSticker) message.content).sticker);
            case TdApi.MessageText.CONSTRUCTOR:
                TdApi.WebPage webPage = ((TdApi.MessageText) message.content).webPage;
                if (webPage != null) {
                    TdApi.Video video = webPage.video;
                    if (video != null) {
                        return s(o6Var, video, i10, i11);
                    }
                    TdApi.Sticker sticker = webPage.sticker;
                    if (sticker != null) {
                        return new o0(o6Var, i11, i10, sticker);
                    }
                    TdApi.Animation animation2 = webPage.animation;
                    if (animation2 != null) {
                        TdApi.Thumbnail thumbnail2 = animation2.thumbnail;
                        if (!(thumbnail2 == null && animation2.minithumbnail == null)) {
                            return new o0(o6Var, i10, i11, thumbnail2, animation2.minithumbnail);
                        }
                    } else {
                        TdApi.VideoNote videoNote2 = webPage.videoNote;
                        if (videoNote2 != null) {
                            return new o0(o6Var, i10, i10 / 2, videoNote2.thumbnail, videoNote2.minithumbnail);
                        }
                        if (webPage.voiceNote == null) {
                            TdApi.Document document = webPage.document;
                            if (document != null) {
                                return l(o6Var, document, i10, i11);
                            }
                            TdApi.Photo photo2 = webPage.photo;
                            if (!(photo2 == null || ((J0 = e.J0(photo2)) == null && webPage.photo.minithumbnail == null))) {
                                return new o0(o6Var, i10, i11, t2.K5(J0), webPage.photo.minithumbnail);
                            }
                        }
                    }
                }
                break;
            case TdApi.MessageVideo.CONSTRUCTOR:
                return s(o6Var, ((TdApi.MessageVideo) message.content).video, i10, i11);
        }
        return null;
    }

    public static n0 p(o6 o6Var, TdApi.ProfilePhoto profilePhoto, TdApi.Thumbnail thumbnail, int i10, int i11) {
        if (profilePhoto == null && thumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, profilePhoto, thumbnail);
    }

    public static n0 q(o6 o6Var, TdApi.Thumbnail thumbnail, TdApi.Minithumbnail minithumbnail, int i10, int i11) {
        if (thumbnail == null && minithumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, thumbnail, minithumbnail);
    }

    public static n0 r(o6 o6Var, TdApi.Venue venue, TdApi.Thumbnail thumbnail, int i10, int i11) {
        if (venue == null && thumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, venue, thumbnail);
    }

    public static n0 s(o6 o6Var, TdApi.Video video, int i10, int i11) {
        TdApi.Thumbnail thumbnail = video.thumbnail;
        if (thumbnail == null && video.minithumbnail == null) {
            return null;
        }
        return new o0(o6Var, i10, i11, thumbnail, video.minithumbnail);
    }

    public final <T extends View & t> void a(T t10, Canvas canvas, b bVar, float f10, float f11, float f12) {
        b(t10, canvas, bVar, f10, f11, getWidth(), getHeight(), this.f25129b, f12);
    }

    public abstract <T extends View & t> void b(T t10, Canvas canvas, b bVar, float f10, float f11, float f12, float f13, int i10, float f14);

    public final int c() {
        return this.f25129b;
    }

    @Override
    public int d(boolean z10) {
        return o.a(this, z10);
    }

    public abstract boolean e(b bVar);

    public void f(b bVar, boolean z10) {
        bVar.d();
    }

    @Override
    public int g(boolean z10) {
        return o.b(this, z10);
    }

    @Override
    public int getHeight() {
        return this.f25128a;
    }

    @Override
    public int getWidth() {
        return this.f25128a;
    }

    public void h(int i10) {
        this.f25129b = i10;
    }
}
