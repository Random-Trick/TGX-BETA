package gd;

import android.app.DownloadManager;
import android.graphics.Typeface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseIntArray;
import android.view.View;
import be.C1357a0;
import be.C1363c0;
import be.C1369e0;
import be.C1379j0;
import be.C1389o;
import be.C1405v;
import gd.C4779t2;
import ge.C4868i;
import id.AbstractC5333b;
import ie.AbstractC5411l0;
import ie.C5386e;
import ie.RunnableC5390g;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import lb.EnumC6459p;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.C2963r9;
import p038ce.x00;
import p039d.C3563j;
import p066eb.AbstractC4178a;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5065e;
import p108hb.C5067f;
import p108hb.C5068g;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.AbstractC5096a;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p124ib.C5322e;
import p139jb.AbstractC5913e;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p143k0.C6035e;
import p156kd.C6246h;
import p168ld.C6503j;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p193nb.C7322f;
import p350yd.AbstractC10664f9;
import p350yd.C10536ab;
import p350yd.C10862n1;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;
import vc.C9903a;

public class C4779t2 {
    public static final int[] f16239a = {R.id.theme_color_avatarRed, R.id.theme_color_avatarOrange, R.id.theme_color_avatarYellow, R.id.theme_color_avatarGreen, R.id.theme_color_avatarCyan, R.id.theme_color_avatarBlue, R.id.theme_color_avatarViolet, R.id.theme_color_avatarPink};
    public static final C4787f f16240b = new C4787f("🖼", R.drawable.baseline_camera_alt_16);
    public static final C4787f f16241c = new C4787f("🎥", R.drawable.baseline_videocam_16);
    public static final C4787f f16242d = new C4787f("📹", R.drawable.deproko_baseline_msg_video_16);
    public static final C4787f f16243e = new C4787f("🔥", R.drawable.deproko_baseline_whatshot_16);
    public static final C4787f f16244f = new C4787f("🔥", R.drawable.deproko_baseline_whatshot_16);
    public static final C4787f f16245g = new C4787f("🔗", R.drawable.baseline_link_16);
    public static final C4787f f16246h = new C4787f("🎮", R.drawable.baseline_videogame_asset_16);
    public static final C4787f f16247i = new C4787f("👥", R.drawable.baseline_group_16);
    public static final C4787f f16248j = new C4787f("🎨", R.drawable.baseline_palette_16);
    public static final C4787f f16249k = new C4787f("👥", R.drawable.baseline_group_add_16);
    public static final C4787f f16250l = new C4787f("📢", R.drawable.baseline_bullhorn_16);
    public static final C4787f f16251m = new C4787f("📎", R.drawable.baseline_insert_drive_file_16);
    public static final C4787f f16252n = new C4787f("🎵", R.drawable.baseline_music_note_16);
    public static final C4787f f16253o = new C4787f("👤", R.drawable.baseline_person_16);
    public static final C4787f f16254p = new C4787f("📊", R.drawable.baseline_poll_16);
    public static final C4787f f16255q = new C4787f("❓", R.drawable.baseline_help_16);
    public static final C4787f f16256r = new C4787f("🎤", R.drawable.baseline_mic_16);
    public static final C4787f f16257s = new C4787f("👾", R.drawable.deproko_baseline_gif_filled_16);
    public static final C4787f f16258t = new C4787f("📌", R.drawable.baseline_gps_fixed_16);
    public static final C4787f f16259u = new C4787f("💸", R.drawable.baseline_receipt_16);
    public static final C4787f f16260v = new C4787f("🎉", R.drawable.baseline_party_popper_16);
    public static final C4787f f16261w = new C4787f("📸", R.drawable.round_warning_16);
    public static final C4787f f16262x = new C4787f("📌", R.drawable.deproko_baseline_pin_16);
    public static final C4787f f16263y = new C4787f("🖼", R.drawable.baseline_collections_16);
    public static final C4787f f16264z = new C4787f("🖼", R.drawable.baseline_collections_16);
    public static final C4787f f16216A = new C4787f("🎵", R.drawable.ivanliana_baseline_audio_collections_16);
    public static final C4787f f16217B = new C4787f("📎", R.drawable.ivanliana_baseline_file_collections_16);
    public static final C4787f f16218C = new C4787f("🎥", R.drawable.ivanliana_baseline_video_collections_16);
    public static final C4787f f16219D = new C4787f("↩", R.drawable.baseline_share_arrow_16);
    public static final C4787f f16220E = new C4787f("\u1f9ee", R.drawable.baseline_bar_chart_24);
    public static final C4787f f16221F = new C4787f("🎯", R.drawable.baseline_gps_fixed_16);
    public static final C4787f f16222G = new C4787f("🎲", R.drawable.baseline_casino_16);
    public static final C4787f f16223H = new C4787f("🎲", R.drawable.belledeboheme_baseline_dice_1_16);
    public static final C4787f f16224I = new C4787f("🎲", R.drawable.belledeboheme_baseline_dice_2_16);
    public static final C4787f f16225J = new C4787f("🎲", R.drawable.belledeboheme_baseline_dice_3_16);
    public static final C4787f f16226K = new C4787f("🎲", R.drawable.belledeboheme_baseline_dice_4_16);
    public static final C4787f f16227L = new C4787f("🎲", R.drawable.belledeboheme_baseline_dice_5_16);
    public static final C4787f f16228M = new C4787f("🎲", R.drawable.belledeboheme_baseline_dice_6_16);
    public static final C4787f f16229N = new C4787f("📞", R.drawable.baseline_call_16);
    public static final C4787f f16230O = new C4787f("⏲", R.drawable.baseline_timer_16);
    public static final C4787f f16231P = new C4787f("⏲", R.drawable.baseline_timer_off_16);
    public static final C4787f f16232Q = new C4787f("📞", R.drawable.baseline_call_end_16);
    public static final C4787f f16233R = new C4787f("☎", R.drawable.baseline_call_missed_18);
    public static final C4787f f16234S = new C4787f("☎", R.drawable.baseline_call_received_18);
    public static final C4787f f16235T = new C4787f("⚠", R.drawable.baseline_warning_18);
    public static final C4787f f16236U = new C4787f("ℹ", R.drawable.baseline_info_18);
    public static final C4787f f16237V = new C4787f("ℹ", R.drawable.baseline_error_18);
    public static final C4787f f16238W = new C4787f("🔒", R.drawable.baseline_lock_16);

    public class C4780a extends ClickableSpan {
        public final C5132o f16265a;

        public C4780a(C5132o oVar) {
            this.f16265a = oVar;
        }

        @Override
        public void onClick(View view) {
            this.f16265a.m23859c().mo490a(view, this.f16265a);
        }
    }

    public class C4781b extends ClickableSpan {
        public final C5132o f16266a;

        public C4781b(C5132o oVar) {
            this.f16266a = oVar;
        }

        @Override
        public void onClick(View view) {
            this.f16266a.m23856f(view);
        }
    }

    public static class C4782c {
        public final int f16267a;
        public final int f16268b;

        public C4782c(int i, int i2) {
            this.f16267a = i;
            this.f16268b = i2;
        }
    }

    public static class C4783d {
        public final C4787f f16269a;
        public final C4787f f16270b;
        public final int f16271c;
        public final TdApi.FormattedText f16272d;
        public final boolean f16273e;
        public final boolean f16274f;
        public AbstractC4785b f16275g;
        public boolean f16276h;
        public C10930q6.C10936f f16277i;

        public interface AbstractC4784a {
            void mo7829a(long j, long j2, C4783d dVar);

            void mo7828b(long j, long j2, C4783d dVar, C4783d dVar2);
        }

        public interface AbstractC4785b {
            void mo25369a(C4783d dVar, AbstractC4784a aVar);
        }

        public C4783d(C4787f fVar, int i) {
            this(fVar, i, (TdApi.FormattedText) null);
        }

        public TdApi.FormattedText m25376b(boolean z) {
            String str;
            C4787f fVar = this.f16269a;
            if (fVar == null || (z && fVar.f16284b != 0)) {
                if (!C7321e.m16965a1(this.f16272d)) {
                    return this.f16272d;
                }
                int i = this.f16271c;
                return new TdApi.FormattedText(i != 0 ? C4403w.m27869i1(i) : "", null);
            } else if (C7321e.m16965a1(this.f16272d)) {
                if (this.f16271c != 0) {
                    str = this.f16269a.f16283a + " " + C4403w.m27869i1(this.f16271c);
                } else {
                    str = this.f16269a.f16283a;
                }
                return new TdApi.FormattedText(str, null);
            } else if (this.f16272d.text.startsWith(this.f16269a.f16283a)) {
                return this.f16272d;
            } else {
                return C4779t2.m25627O5(this.f16269a.f16283a + " ", this.f16272d);
            }
        }

        public String m25375c(boolean z) {
            C4787f fVar = this.f16269a;
            if (fVar == null || (z && fVar.f16284b != 0)) {
                if (!C7321e.m16965a1(this.f16272d)) {
                    return this.f16272d.text;
                }
                int i = this.f16271c;
                return i != 0 ? C4403w.m27869i1(i) : "";
            } else if (C7321e.m16965a1(this.f16272d)) {
                if (this.f16271c == 0) {
                    return this.f16269a.f16283a;
                }
                return this.f16269a.f16283a + " " + C4403w.m27869i1(this.f16271c);
            } else if (this.f16272d.text.startsWith(this.f16269a.f16283a)) {
                return this.f16272d.text;
            } else {
                return this.f16269a.f16283a + " " + this.f16272d.text;
            }
        }

        public C10930q6.C10936f m25374d() {
            return this.f16277i;
        }

        public boolean m25373e() {
            return this.f16275g != null;
        }

        public boolean m25372f() {
            return this.f16276h;
        }

        public void m25371g(AbstractC4784a aVar) {
            AbstractC4785b bVar = this.f16275g;
            if (bVar != null) {
                bVar.mo25369a(this, aVar);
            }
        }

        public C4783d m25370h(AbstractC4785b bVar, boolean z) {
            this.f16275g = bVar;
            this.f16276h = z;
            return this;
        }

        public String toString() {
            return m25375c(false);
        }

        public C4783d(C4787f fVar, int i, String str) {
            this(fVar, i, !C5070i.m24061i(str) ? new TdApi.FormattedText(str, null) : null, false);
        }

        public C4783d(C4787f fVar, int i, TdApi.FormattedText formattedText) {
            this(fVar, i, formattedText, false);
        }

        public C4783d(String str, boolean z) {
            this((C4787f) null, 0, str, z);
        }

        public C4783d(TdApi.FormattedText formattedText, boolean z) {
            this((C4787f) null, 0, formattedText, z);
        }

        public C4783d(C4787f fVar, int i, TdApi.FormattedText formattedText, boolean z) {
            this(fVar, i, formattedText, z, false, null);
        }

        public C4783d(C4787f fVar, int i, String str, boolean z) {
            this(fVar, i, C5070i.m24061i(str) ? null : new TdApi.FormattedText(str, null), z, false, null);
        }

        public C4783d(C4787f fVar, C4783d dVar) {
            this(dVar.f16269a, dVar.f16271c, dVar.f16272d, dVar.f16273e, dVar.f16274f, fVar);
        }

        public C4783d(C4787f fVar, int i, TdApi.FormattedText formattedText, boolean z, boolean z2, C4787f fVar2) {
            this.f16269a = fVar;
            this.f16271c = i;
            this.f16272d = formattedText;
            this.f16273e = z;
            this.f16274f = z2;
            this.f16270b = fVar2;
        }
    }

    public static class C4786e {
        public final TdApi.File f16278a;
        public final String f16279b;
        public final String f16280c;
        public final int f16281d;
        public final TdApi.FileType f16282e;

        public C4786e(TdApi.File file, String str, String str2, TdApi.FileType fileType) {
            this.f16278a = file;
            this.f16281d = file.size;
            this.f16279b = C7389v0.m16681T0(str);
            this.f16280c = str2;
            this.f16282e = fileType;
        }

        public static C4786e m25361h(TdApi.Animation animation) {
            return new C4786e(animation.animation, animation.fileName, animation.mimeType, new TdApi.FileTypeAnimation());
        }

        public static C4786e m25360i(TdApi.Audio audio) {
            return new C4786e(audio.audio, audio.fileName, audio.mimeType, new TdApi.FileTypeAudio());
        }

        public static C4786e m25359j(TdApi.Document document) {
            return new C4786e(document.document, document.fileName, document.mimeType, new TdApi.FileTypeDocument());
        }

        public static C4786e m25358k(TdApi.Video video) {
            return new C4786e(video.video, video.fileName, video.mimeType, new TdApi.FileTypeVideo());
        }

        public static C4786e m25357l(TdApi.VoiceNote voiceNote) {
            return new C4786e(voiceNote.voice, "voice.ogg", voiceNote.mimeType, new TdApi.FileTypeVoiceNote());
        }

        public static C4786e m25356m(TdApi.File file, boolean z) {
            return new C4786e(file, z ? "image.webp" : "image.jpg", z ? "image/webp" : "image/jpg", new TdApi.FileTypePhoto());
        }

        public TdApi.File m25366c() {
            return this.f16278a;
        }

        public int m25365d() {
            return this.f16278a.f25373id;
        }

        public String m25364e(int i) {
            String str;
            int lastIndexOf;
            if (!C5070i.m24061i(this.f16279b)) {
                str = this.f16279b;
            } else {
                str = !C5070i.m24061i(this.f16280c) ? C1369e0.m37398a(this.f16280c) : null;
            }
            if (C5070i.m24061i(str)) {
                str = "telegramdownload." + m25365d();
            }
            if (i == 0) {
                return str;
            }
            if (str.lastIndexOf(46) != -1) {
                return str.substring(0, lastIndexOf) + " (" + i + ")" + str.substring(lastIndexOf);
            }
            return str + " (" + i + ")";
        }

        public TdApi.FileType m25363f() {
            return this.f16282e;
        }

        public String m25362g() {
            return this.f16278a.local.path;
        }
    }

    public static final class C4787f {
        public final String f16283a;
        public final int f16284b;

        public C4787f(String str, int i) {
            this.f16283a = str;
            this.f16284b = i;
        }

        public String toString() {
            return this.f16283a;
        }
    }

    public static class C4788g {
        public long f16285a;
        public String f16286b;
        public String f16287c;
    }

    public static final class C4789h extends AbstractC4178a {
        @Override
        public boolean mo25355a(char c) {
            return C4779t2.m25414u4(c);
        }
    }

    public static C4783d m25730A0(final C10930q6 q6Var, final TdApi.Message message, final C10930q6.C10936f fVar, final boolean z) {
        C4787f fVar2;
        int i;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (TdApi.Message message2 : fVar.f35133a) {
            C5062b.m24155q(sparseIntArray, message2.content.getConstructor());
        }
        switch (sparseIntArray.size() == 1 ? sparseIntArray.keyAt(0) : 0) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                i = R.string.xPhotos;
                fVar2 = f16264z;
                break;
            case TdApi.MessageAudio.CONSTRUCTOR:
                i = R.string.xAudios;
                fVar2 = f16216A;
                break;
            case TdApi.MessageDocument.CONSTRUCTOR:
                i = R.string.xFiles;
                fVar2 = f16217B;
                break;
            case TdApi.MessageVideo.CONSTRUCTOR:
                i = R.string.xVideos;
                fVar2 = f16218C;
                break;
            default:
                i = R.string.xMedia;
                fVar2 = f16263y;
                break;
        }
        TdApi.Message z0 = z ? m25383z0(q6Var, fVar.f35133a) : null;
        TdApi.FormattedText w1 = z0 != null ? C7321e.m16899w1(z0.content) : null;
        C4783d dVar = new C4783d(fVar2, 0, C7321e.m16965a1(w1) ? new TdApi.FormattedText(C4403w.m27844o2(i, fVar.f35133a.size()), null) : w1, C7321e.m16965a1(w1));
        dVar.f16277i = fVar;
        if (fVar.m2131a()) {
            dVar.m25370h(new C4783d.AbstractC4785b() {
                @Override
                public final void mo25369a(C4779t2.C4783d dVar2, C4779t2.C4783d.AbstractC4784a aVar) {
                    C4779t2.m25579W3(C10930q6.this, message, fVar, z, dVar2, aVar);
                }
            }, true);
        }
        return dVar;
    }

    public static C5386e m25729A1() {
        return m25708D1(null, null, "?");
    }

    public static boolean m25728A2(TdApi.User user) {
        return user != null && !C5070i.m24061i(user.phoneNumber);
    }

    public static boolean m25727A3(TdApi.Message message) {
        return (message == null || message.schedulingState == null) ? false : true;
    }

    public static C5132o m25726A4(String str) {
        boolean M0 = RunnableC5390g.m22983M0(str);
        return new C5132o(M0 ? null : C1389o.m37260i(), 0).m23851k(M0).m23852j(new TdApi.TextEntityTypeBold());
    }

    public static TdApi.FormattedText m25725A5(CharSequence charSequence, boolean z) {
        return new TdApi.FormattedText(charSequence.toString(), m25392x5(charSequence, z));
    }

    public static int m25723B0(int i) {
        return m25716C0(i, true);
    }

    public static C5386e m25722B1(String str) {
        return m25708D1(str, null, null);
    }

    public static boolean m25721B2(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2) {
        boolean z = chatPermissions.canSendMessages;
        boolean z2 = chatPermissions2.canSendMessages;
        if (z == z2 || !z2) {
            boolean z3 = chatPermissions.canSendMediaMessages;
            boolean z4 = chatPermissions2.canSendMediaMessages;
            if (z3 == z4 || !z4) {
                boolean z5 = chatPermissions.canSendOtherMessages;
                boolean z6 = chatPermissions2.canSendOtherMessages;
                if (z5 == z6 || !z6) {
                    boolean z7 = chatPermissions.canAddWebPagePreviews;
                    boolean z8 = chatPermissions2.canAddWebPagePreviews;
                    if (z7 == z8 || !z8) {
                        boolean z9 = chatPermissions.canSendPolls;
                        boolean z10 = chatPermissions2.canSendPolls;
                        if (z9 == z10 || !z10) {
                            boolean z11 = chatPermissions.canInviteUsers;
                            boolean z12 = chatPermissions2.canInviteUsers;
                            if (z11 == z12 || !z12) {
                                boolean z13 = chatPermissions.canPinMessages;
                                boolean z14 = chatPermissions2.canPinMessages;
                                if (z13 == z14 || !z14) {
                                    boolean z15 = chatPermissions.canChangeInfo;
                                    boolean z16 = chatPermissions2.canChangeInfo;
                                    if (z15 == z16 || !z16) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean m25720B3(TdApi.InputMessageContent inputMessageContent) {
        int i;
        int constructor = inputMessageContent.getConstructor();
        if (constructor != -2108486755) {
            i = constructor != 1648801584 ? 0 : ((TdApi.InputMessagePhoto) inputMessageContent).ttl;
        } else {
            i = ((TdApi.InputMessageVideo) inputMessageContent).ttl;
        }
        return i != 0 && i <= 60;
    }

    public static TdApi.Audio m25719B4(TdApi.Document document) {
        String str = document.fileName;
        return new TdApi.Audio(0, str, "", str, document.mimeType, document.minithumbnail, document.thumbnail, document.document);
    }

    public static List<TdApi.Function> m25718B5(long j, long j2, long j3, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageContent[] inputMessageContentArr, boolean z) {
        TdApi.InputMessageContent[] inputMessageContentArr2;
        if (inputMessageContentArr.length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = inputMessageContentArr.length;
        boolean z2 = z && inputMessageContentArr.length <= 10;
        int i = 0;
        do {
            int min = z ? Math.min(length, 10) : 1;
            int Z0 = m25564Z0(inputMessageContentArr[i + 0]);
            int i2 = 0;
            while (Z0 != 0 && m25564Z0(inputMessageContentArr[i + i2]) == Z0) {
                i2++;
                min--;
                if (min <= 0) {
                    break;
                }
            }
            if (i2 == 0) {
                i2 = 1;
            }
            if (!z2 || i2 != inputMessageContentArr.length) {
                TdApi.InputMessageContent[] inputMessageContentArr3 = new TdApi.InputMessageContent[i2];
                System.arraycopy(inputMessageContentArr, i, inputMessageContentArr3, 0, i2);
                inputMessageContentArr2 = inputMessageContentArr3;
            } else {
                inputMessageContentArr2 = inputMessageContentArr;
            }
            if (i2 == 1) {
                arrayList.add(new TdApi.SendMessage(j, j2, arrayList.isEmpty() ? j3 : 0L, messageSendOptions, null, inputMessageContentArr2[0]));
            } else {
                arrayList.add(new TdApi.SendMessageAlbum(j, j2, arrayList.isEmpty() ? j3 : 0L, messageSendOptions, inputMessageContentArr2, false));
            }
            length -= i2;
            i += i2;
        } while (length > 0);
        return arrayList;
    }

    public static String m25717C(C10930q6 q6Var, TdApi.Message message, boolean z) {
        return m25710D(q6Var, message, z, false, null);
    }

    public static int m25716C0(int i, boolean z) {
        if (z && C5067f.m24112h(i)) {
            return 11;
        }
        if (!C5067f.m24105o(i)) {
            return 0;
        }
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (C5067f.m24107m(j, timeUnit)) {
            return 1;
        }
        if (C5067f.m24104p(j, timeUnit)) {
            return 2;
        }
        return C5067f.m24117c(i) + 3;
    }

    public static C5386e m25715C1(String str, String str2) {
        return m25708D1(str, str2, null);
    }

    public static boolean m25714C2(TdApi.Poll poll) {
        for (TdApi.PollOption pollOption : poll.options) {
            if (pollOption.isBeingChosen) {
                return true;
            }
        }
        return false;
    }

    public static boolean m25713C3(TdApi.Message message) {
        return C7321e.m16947g1(message.content);
    }

    public static TdApi.Message m25712C4(long j, TdApi.MessageSender messageSender, TdApi.MessageContent messageContent) {
        TdApi.Message message = new TdApi.Message();
        message.chatId = j;
        message.senderId = messageSender;
        message.content = messageContent;
        return message;
    }

    public static C6503j m25711C5(C10930q6 q6Var, TdApi.Thumbnail thumbnail) {
        if (thumbnail == null) {
            return null;
        }
        int constructor = thumbnail.format.getConstructor();
        if (constructor == -660084953 || constructor == 278616062) {
            TdApi.File file = thumbnail.file;
            thumbnail.format.getConstructor();
            C6503j jVar = new C6503j(q6Var, file, 2);
            jVar.m20300F(true);
            return jVar;
        } else if (constructor != 1315522642) {
            return null;
        } else {
            C6503j jVar2 = new C6503j(q6Var, thumbnail.file, 3);
            jVar2.m20300F(true);
            return jVar2;
        }
    }

    public static String m25710D(C10930q6 q6Var, TdApi.Message message, boolean z, boolean z2, AbstractC5917i iVar) {
        String E = m25703E(q6Var, message, z ? 1 : 0, iVar);
        return (C5070i.m24061i(E) || z2) ? E : C1363c0.m37436f0(E);
    }

    public static C6246h m25709D0(C10930q6 q6Var, TdApi.Chat chat) {
        if (chat != null) {
            return m25702E0(q6Var, chat.photo);
        }
        return null;
    }

    public static C5386e m25708D1(String str, String str2, String str3) {
        int n4;
        String Q4 = m25614Q4(str2, false, false);
        if (C5070i.m24061i(Q4) && !C5070i.m24061i(str) && str.length() > 2 && (n4 = m25463n4(str, false)) != -1) {
            Q4 = m25614Q4(str.substring(n4 + 1), false, false);
        }
        String Q42 = m25614Q4(str, false, true);
        if (!C5070i.m24061i(Q42) && !C5070i.m24061i(Q4)) {
            Q42 = Q42 + Q4;
        } else if (C5070i.m24061i(Q42)) {
            if (!C5070i.m24061i(Q4)) {
                int n42 = m25463n4(str2, false);
                if (n42 != -1) {
                    Q42 = m25614Q4(str2.substring(n42 + 1), false, false);
                }
                if (!C5070i.m24061i(Q42)) {
                    Q4 = Q4 + Q42;
                }
                Q42 = Q4;
            } else {
                if (C5070i.m24061i(str3)) {
                    str3 = "…";
                }
                Q42 = str3;
            }
        }
        return new C5386e(Q42);
    }

    public static boolean m25707D2(TdApi.Audio audio) {
        return !C5070i.m24061i(audio.performer) || (!C5070i.m24061i(audio.fileName) && !C5070i.m24067c(audio.fileName, audio.title));
    }

    public static boolean m25706D3(TdApi.SecretChat secretChat) {
        return secretChat != null && secretChat.state.getConstructor() == -1611352087;
    }

    public static TdApi.Message m25705D4(TdApi.Audio audio) {
        return m25712C4(0L, null, new TdApi.MessageAudio(audio, new TdApi.FormattedText("", null)));
    }

    public static C6246h m25704D5(C10930q6 q6Var, TdApi.Thumbnail thumbnail) {
        if (thumbnail == null) {
            return null;
        }
        switch (thumbnail.format.getConstructor()) {
            case TdApi.ThumbnailFormatJpeg.CONSTRUCTOR:
            case TdApi.ThumbnailFormatGif.CONSTRUCTOR:
            case TdApi.ThumbnailFormatPng.CONSTRUCTOR:
                return new C6246h(q6Var, thumbnail.file);
            case TdApi.ThumbnailFormatWebp.CONSTRUCTOR:
                C6246h hVar = new C6246h(q6Var, thumbnail.file);
                hVar.m20889x0();
                return hVar;
            default:
                return null;
        }
    }

    public static String m25703E(C10930q6 q6Var, TdApi.Message message, int i, AbstractC5917i iVar) {
        String str;
        if (message == null || message.content == null) {
            C7389v0.m16731G2(iVar, true);
            return C4403w.m27869i1(R.string.DeletedMessage);
        } else if (!C5070i.m24061i(message.restrictionReason) && C4868i.m24726c2().m24819P2()) {
            return message.restrictionReason;
        } else {
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            int constructor = message.content.getConstructor();
            int i2 = R.string.YouCreatedGroup;
            String str2 = null;
            TdApi.Sticker sticker = null;
            str2 = null;
            int i3 = R.string.Location;
            switch (constructor) {
                case TdApi.MessageVenue.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.Location);
                case TdApi.MessageInvoice.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, false);
                    return ((TdApi.MessageInvoice) message.content).title;
                case TdApi.MessagePhoto.CONSTRUCTOR:
                    String str3 = ((TdApi.MessagePhoto) message.content).caption.text;
                    if (!z || C5070i.m24061i(str3)) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27869i1(R.string.ChatContentPhoto);
                    } else if (z2) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27865j1(R.string.ChatContentWithCaption, C4403w.m27869i1(R.string.ChatContentPhoto), str3);
                    } else {
                        C7389v0.m16731G2(iVar, false);
                        return str3;
                    }
                case TdApi.MessageUnsupported.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.UnsupportedMessageType);
                case TdApi.MessageScreenshotTaken.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return m25429s3(message) ? C4403w.m27869i1(R.string.YouTookAScreenshot) : C4403w.m27865j1(R.string.XTookAScreenshot, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageContactRegistered.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27865j1(R.string.NotificationContactJoined, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageExpiredPhoto.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.AttachPhotoExpired);
                case TdApi.MessageExpiredVideo.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.AttachVideoExpired);
                case TdApi.MessageWebsiteConnected.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27865j1(R.string.BotWebsiteAllowed, ((TdApi.MessageWebsiteConnected) message.content).domainName);
                case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    if (message.isChannelPost) {
                        return C4403w.m27869i1(R.string.ActionChannelChangedPhoto);
                    }
                    return m25429s3(message) ? C4403w.m27869i1(R.string.group_photo_changed_you) : C4403w.m27865j1(R.string.group_photo_changed, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessagePoll.CONSTRUCTOR:
                    String str4 = ((TdApi.MessagePoll) message.content).poll.question;
                    C7389v0.m16731G2(iVar, false);
                    return str4;
                case TdApi.MessageContact.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.AttachContact);
                case TdApi.MessageSupergroupChatCreate.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    if (!m25429s3(message)) {
                        return message.isChannelPost ? C4403w.m27869i1(R.string.ActionCreateChannel) : C4403w.m27865j1(R.string.XCreatedGroup, q6Var.m2135zb(message.senderId, true));
                    }
                    if (message.isChannelPost) {
                        i2 = R.string.YouCreatedChannel;
                    }
                    return C4403w.m27869i1(i2);
                case TdApi.MessageChatDeletePhoto.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    if (message.isChannelPost) {
                        return C4403w.m27869i1(R.string.ActionChannelRemovedPhoto);
                    }
                    return m25429s3(message) ? C4403w.m27869i1(R.string.group_photo_deleted_you) : C4403w.m27865j1(R.string.group_photo_deleted, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageGame.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, false);
                    return m25403w1(((TdApi.MessageGame) message.content).game, false);
                case TdApi.MessageChatUpgradeTo.CONSTRUCTOR:
                case TdApi.MessageChatUpgradeFrom.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.GroupUpgraded);
                case TdApi.MessageAudio.CONSTRUCTOR:
                    TdApi.MessageContent messageContent = message.content;
                    TdApi.Audio audio = ((TdApi.MessageAudio) messageContent).audio;
                    String str5 = ((TdApi.MessageAudio) messageContent).caption.text;
                    String j1 = C4403w.m27865j1(R.string.ChatContentSong, m25472m2(audio), m25521f2(audio));
                    if (!z || C5070i.m24061i(str5)) {
                        C7389v0.m16731G2(iVar, true);
                        return j1;
                    } else if (z2) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27865j1(R.string.ChatContentWithCaption, j1, str5);
                    } else {
                        C7389v0.m16731G2(iVar, false);
                        return str5;
                    }
                case TdApi.MessageLocation.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    if (((TdApi.MessageLocation) message.content).livePeriod > 0) {
                        i3 = R.string.AttachLiveLocation;
                    }
                    return C4403w.m27869i1(i3);
                case TdApi.MessageVoiceNote.CONSTRUCTOR:
                    String str6 = ((TdApi.MessageVoiceNote) message.content).caption.text;
                    if (!z || C5070i.m24061i(str6)) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27869i1(R.string.ChatContentVoice);
                    } else if (z2) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27865j1(R.string.ChatContentWithCaption, C4403w.m27869i1(R.string.ChatContentVoice), str6);
                    } else {
                        C7389v0.m16731G2(iVar, false);
                        return str6;
                    }
                case TdApi.MessageCall.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    TdApi.MessageCall messageCall = (TdApi.MessageCall) message.content;
                    boolean s3 = m25429s3(message);
                    int constructor2 = messageCall.discardReason.getConstructor();
                    if (constructor2 == -1729926094) {
                        str = C4403w.m27869i1(s3 ? R.string.OutgoingCallBusy : R.string.CallMessageIncomingDeclined);
                    } else if (constructor2 != 1680358012) {
                        str = C4403w.m27869i1(s3 ? R.string.OutgoingCall : R.string.IncomingCall);
                    } else {
                        str = C4403w.m27869i1(s3 ? R.string.CallMessageOutgoingMissed : R.string.MissedCall);
                    }
                    int i4 = messageCall.duration;
                    return i4 > 0 ? C4403w.m27865j1(R.string.ChatContentCallWithDuration, str, C4403w.m27810x0(i4)) : str;
                case TdApi.MessageDocument.CONSTRUCTOR:
                    TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
                    String str7 = messageDocument.caption.text;
                    TdApi.Document document = messageDocument.document;
                    if (document != null && !C5070i.m24061i(document.fileName)) {
                        str2 = messageDocument.document.fileName;
                    }
                    if (!z || C5070i.m24061i(str7)) {
                        if (str2 != null) {
                            C7389v0.m16731G2(iVar, false);
                            return str2;
                        }
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27869i1(R.string.ChatContentFile);
                    } else if (z2) {
                        if (str2 == null) {
                            str2 = C4403w.m27869i1(R.string.ChatContentFile);
                        }
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27865j1(R.string.ChatContentWithCaption, str2, str7);
                    } else {
                        C7389v0.m16731G2(iVar, false);
                        return str7;
                    }
                case TdApi.MessageChatChangeTitle.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return message.isChannelPost ? C4403w.m27869i1(R.string.ActionChannelChangedTitle) : C4403w.m27865j1(R.string.XChangedGroupTitle, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageBasicGroupChatCreate.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return m25429s3(message) ? C4403w.m27869i1(R.string.YouCreatedGroup) : C4403w.m27865j1(R.string.XCreatedGroup, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageChatDeleteMember.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    long j = ((TdApi.MessageChatDeleteMember) message.content).userId;
                    return (!message.isChannelPost || C7321e.m16984R0(message) != j) ? C7321e.m16984R0(message) == j ? q6Var.m2379k7(j) ? C4403w.m27869i1(R.string.group_user_remove_self) : C4403w.m27865j1(R.string.group_user_remove, q6Var.m2480e2().m1749D2(j)) : q6Var.m2411i7(message) ? C4403w.m27865j1(R.string.group_user_self_removed, q6Var.m2480e2().m1749D2(j)) : q6Var.m2379k7(j) ? C4403w.m27865j1(R.string.group_user_removed_self, q6Var.m2135zb(message.senderId, true)) : C4403w.m27865j1(R.string.group_user_removed, q6Var.m2135zb(message.senderId, true), q6Var.m2480e2().m1749D2(j)) : q6Var.m2379k7(j) ? C4403w.m27869i1(R.string.channel_user_remove_self) : C4403w.m27865j1(R.string.channel_user_remove, q6Var.m2480e2().m1749D2(j));
                case TdApi.MessagePinMessage.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return message.isChannelPost ? C5070i.m24061i(message.authorSignature) ? C4403w.m27869i1(R.string.PinnedMessageAction) : C4403w.m27865j1(R.string.NotificationActionPinnedNoTextChannel, message.authorSignature) : C4403w.m27865j1(R.string.NotificationActionPinnedNoTextChannel, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageVideoNote.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.ChatContentRoundVideo);
                case TdApi.MessagePassportDataSent.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return C4403w.m27869i1(R.string.UnsupportedMessage);
                case TdApi.MessageDice.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    TdApi.MessageContent messageContent2 = message.content;
                    String str8 = ((TdApi.MessageDice) messageContent2).emoji;
                    int i5 = ((TdApi.MessageDice) messageContent2).value;
                    if (f16221F.f16283a.equals(str8)) {
                        return C4403w.m27869i1(m25536d1(i5));
                    }
                    if (!f16222G.f16283a.equals(str8)) {
                        return str8;
                    }
                    if (i5 != 0) {
                        return C4403w.m27844o2(R.string.ChatContentDiceRolled, i5);
                    }
                    return C4403w.m27869i1(R.string.ChatContentDice);
                case TdApi.MessageChatJoinByRequest.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    if (m25429s3(message)) {
                        return C4403w.m27869i1(message.isChannelPost ? R.string.YouAcceptedToChannel : R.string.YouAcceptedToGroup);
                    }
                    return C4403w.m27865j1(message.isChannelPost ? R.string.XAcceptedToChannel : R.string.XAcceptedToGroup, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageAnimation.CONSTRUCTOR:
                    String str9 = ((TdApi.MessageAnimation) message.content).caption.text;
                    if (!z || C5070i.m24061i(str9)) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27869i1(R.string.ChatContentAnimation);
                    } else if (z2) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27865j1(R.string.ChatContentWithCaption, C4403w.m27869i1(R.string.ChatContentAnimation), str9);
                    } else {
                        C7389v0.m16731G2(iVar, false);
                        return str9;
                    }
                case TdApi.MessageGameScore.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    int i6 = ((TdApi.MessageGameScore) message.content).score;
                    return q6Var.m2411i7(message) ? C4403w.m27844o2(R.string.game_ActionYouScored, i6) : C4403w.m27840p2(R.string.game_ActionUserScored, i6, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageCustomServiceAction.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, false);
                    return ((TdApi.MessageCustomServiceAction) message.content).text;
                case TdApi.MessagePaymentSuccessful.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    TdApi.MessagePaymentSuccessful messagePaymentSuccessful = (TdApi.MessagePaymentSuccessful) message.content;
                    return C4403w.m27865j1(R.string.PaymentSuccessfullyPaidNoItem, C5065e.m24123a(messagePaymentSuccessful.currency, messagePaymentSuccessful.totalAmount), q6Var.m2691Q3(message.chatId));
                case TdApi.MessageChatAddMembers.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    TdApi.MessageChatAddMembers messageChatAddMembers = (TdApi.MessageChatAddMembers) message.content;
                    if (message.isChannelPost) {
                        long[] jArr = messageChatAddMembers.memberUserIds;
                        if (jArr.length == 1) {
                            return q6Var.m2379k7(jArr[0]) ? C4403w.m27869i1(R.string.channel_user_add_self) : C4403w.m27865j1(R.string.channel_user_add, q6Var.m2480e2().m1749D2(messageChatAddMembers.memberUserIds[0]));
                        }
                        return C4403w.m27844o2(R.string.xPeopleJoinedChannel, jArr.length);
                    }
                    long[] jArr2 = messageChatAddMembers.memberUserIds;
                    if (jArr2.length != 1) {
                        return C4403w.m27844o2(R.string.xPeopleJoinedGroup, jArr2.length);
                    }
                    long j2 = jArr2[0];
                    return j2 != C7321e.m16984R0(message) ? q6Var.m2379k7(j2) ? C4403w.m27865j1(R.string.group_user_added_self, q6Var.m2135zb(message.senderId, true)) : q6Var.m2395j7(message.senderId) ? C4403w.m27865j1(R.string.group_user_self_added, q6Var.m2480e2().m1749D2(j2)) : C4403w.m27865j1(R.string.group_user_added, q6Var.m2135zb(message.senderId, true), q6Var.m2480e2().m1749D2(j2)) : q6Var.m2379k7(j2) ? C4403w.m27869i1(R.string.group_user_add_self) : C4403w.m27865j1(R.string.group_user_add, q6Var.m2480e2().m1749D2(j2));
                case TdApi.MessageSticker.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    TdApi.MessageContent messageContent3 = message.content;
                    if (messageContent3 != null) {
                        sticker = ((TdApi.MessageSticker) messageContent3).sticker;
                    }
                    return (sticker == null || C5070i.m24061i(sticker.emoji)) ? C4403w.m27869i1(R.string.Sticker) : C4403w.m27865j1(R.string.sticker, sticker.emoji);
                case TdApi.MessageChatSetTtl.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    TdApi.MessageChatSetTtl messageChatSetTtl = (TdApi.MessageChatSetTtl) message.content;
                    if (C7316a.m17049l(message.chatId)) {
                        if (messageChatSetTtl.ttl == 0) {
                            return m25429s3(message) ? C4403w.m27869i1(R.string.YouDisabledTimer) : C4403w.m27865j1(R.string.XDisabledTimer, q6Var.m2135zb(message.senderId, true));
                        }
                        if (m25429s3(message)) {
                            return C4403w.m27820u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.YouSetTimerSeconds, R.string.YouSetTimerMinutes, R.string.YouSetTimerHours, R.string.YouSetTimerDays, R.string.YouSetTimerWeeks, R.string.YouSetTimerMonths, new Object[0]).toString();
                        }
                        return C4403w.m27820u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.XSetTimerSeconds, R.string.XSetTimerMinutes, R.string.XSetTimerHours, R.string.XSetTimerDays, R.string.XSetTimerWeeks, R.string.XSetTimerMonths, q6Var.m2135zb(message.senderId, true)).toString();
                    } else if (messageChatSetTtl.ttl == 0) {
                        if (m25429s3(message)) {
                            return C4403w.m27869i1(R.string.YouDisabledAutoDelete);
                        }
                        return C4403w.m27865j1(message.isChannelPost ? R.string.XDisabledAutoDeletePosts : R.string.XDisabledAutoDelete, q6Var.m2135zb(message.senderId, true));
                    } else if (message.isChannelPost) {
                        if (m25429s3(message)) {
                            return C4403w.m27820u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.YouSetAutoDeletePostsSeconds, R.string.YouSetAutoDeletePostsMinutes, R.string.YouSetAutoDeletePostsHours, R.string.YouSetAutoDeletePostsDays, R.string.YouSetAutoDeletePostsWeeks, R.string.YouSetAutoDeletePostsMonths, new Object[0]).toString();
                        }
                        return C4403w.m27820u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.XSetAutoDeletePostsSeconds, R.string.XSetAutoDeletePostsMinutes, R.string.XSetAutoDeletePostsHours, R.string.XSetAutoDeletePostsDays, R.string.XSetAutoDeletePostsWeeks, R.string.XSetAutoDeletePostsMonths, q6Var.m2135zb(message.senderId, true)).toString();
                    } else if (m25429s3(message)) {
                        return C4403w.m27820u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.YouSetAutoDeleteSeconds, R.string.YouSetAutoDeleteMinutes, R.string.YouSetAutoDeleteHours, R.string.YouSetAutoDeleteDays, R.string.YouSetAutoDeleteWeeks, R.string.YouSetAutoDeleteMonths, new Object[0]).toString();
                    } else {
                        return C4403w.m27820u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.XSetAutoDeleteSeconds, R.string.XSetAutoDeleteMinutes, R.string.XSetAutoDeleteHours, R.string.XSetAutoDeleteDays, R.string.XSetAutoDeleteWeeks, R.string.XSetAutoDeleteMonths, q6Var.m2135zb(message.senderId, true)).toString();
                    }
                case TdApi.MessageChatJoinByLink.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, true);
                    return m25429s3(message) ? C4403w.m27869i1(R.string.YouJoinedByLink) : C4403w.m27865j1(R.string.XJoinedByLink, q6Var.m2135zb(message.senderId, true));
                case TdApi.MessageText.CONSTRUCTOR:
                    C7389v0.m16731G2(iVar, false);
                    return ((TdApi.MessageText) message.content).text.text;
                case TdApi.MessageVideo.CONSTRUCTOR:
                    String str10 = ((TdApi.MessageVideo) message.content).caption.text;
                    if (!z || C5070i.m24061i(str10)) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27869i1(R.string.ChatContentVideo);
                    } else if (z2) {
                        C7389v0.m16731G2(iVar, true);
                        return C4403w.m27865j1(R.string.ChatContentWithCaption, C4403w.m27869i1(R.string.ChatContentVideo), str10);
                    } else {
                        C7389v0.m16731G2(iVar, false);
                        return str10;
                    }
                default:
                    C7389v0.m16731G2(iVar, false);
                    return "(null)";
            }
        }
    }

    public static C6246h m25702E0(C10930q6 q6Var, TdApi.ChatPhotoInfo chatPhotoInfo) {
        if (chatPhotoInfo == null) {
            return null;
        }
        C6246h hVar = new C6246h(q6Var, chatPhotoInfo.small);
        hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public static C5386e m25701E1(TdApi.User user) {
        TdApi.UserType userType;
        if (user == null || (userType = user.type) == null) {
            return new C5386e("…");
        }
        if (userType.getConstructor() != -1807729372) {
            return m25708D1(user.firstName, user.lastName, "?");
        }
        return m25722B1(C4403w.m27869i1(R.string.HiddenName));
    }

    public static boolean m25700E2(TdApi.Audio audio) {
        return !C5070i.m24061i(audio.title);
    }

    public static boolean m25699E3(TdApi.ChatType chatType) {
        return chatType != null && chatType.getConstructor() == -1472570774 && !((TdApi.ChatTypeSupergroup) chatType).isChannel;
    }

    public static TdApi.Message m25698E4(TdApi.VoiceNote voiceNote) {
        return m25712C4(0L, null, new TdApi.MessageVoiceNote(voiceNote, new TdApi.FormattedText("", null), true));
    }

    public static TdApi.InputMessageAnimation m25697E5(TdApi.Animation animation) {
        return new TdApi.InputMessageAnimation(new TdApi.InputFileId(animation.animation.f25373id), null, null, animation.duration, animation.width, animation.height, null);
    }

    public static SparseIntArray m25696F(Map<String, TdApi.Message> map) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (TdApi.Message message : map.values()) {
            int constructor = message.content.getConstructor();
            sparseIntArray.put(constructor, sparseIntArray.get(constructor) + 1);
        }
        return sparseIntArray;
    }

    public static C6246h m25695F0(C10930q6 q6Var, TdApi.ProfilePhoto profilePhoto) {
        if (profilePhoto == null) {
            return null;
        }
        C6246h hVar = new C6246h(q6Var, profilePhoto.small);
        hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public static String m25694F1(String str) {
        return "https://" + m25514g2() + "/" + str;
    }

    public static boolean m25693F2(TdApi.Call call) {
        return call != null && call.state.getConstructor() == -190853167 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == -1258917949;
    }

    public static boolean m25692F3(TdApi.Document document) {
        if (!C5070i.m24061i(document.mimeType) && m25678H3(document.mimeType)) {
            return true;
        }
        String v0 = C7389v0.m16573v0(document.fileName);
        String g = C1369e0.m37392g(v0);
        if (C5070i.m24061i(g) || !m25678H3(g)) {
            return !C5070i.m24061i(v0) && m25685G3(v0);
        }
        return true;
    }

    public static TdApi.User m25691F4(long j, String str, String str2) {
        return new TdApi.User(j, str, str2, "", "", new TdApi.UserStatusEmpty(), null, false, false, false, false, null, false, false, true, new TdApi.UserTypeRegular(), null);
    }

    public static TdApi.InputMessageAudio m25690F5(TdApi.Audio audio) {
        return new TdApi.InputMessageAudio(new TdApi.InputFileId(audio.audio.f25373id), null, audio.duration, audio.title, audio.performer, null);
    }

    public static int m25689G(TdApi.StickerSets stickerSets) {
        int i = 0;
        for (TdApi.StickerSetInfo stickerSetInfo : stickerSets.sets) {
            if (!stickerSetInfo.isViewed) {
                i++;
            }
        }
        return i;
    }

    public static C6246h m25688G0(C10930q6 q6Var, TdApi.User user) {
        if (user != null) {
            return m25695F0(q6Var, user.profilePhoto);
        }
        return null;
    }

    public static String m25687G1(TdApi.LanguagePackInfo languagePackInfo) {
        return "https://" + m25514g2() + "/setlanguage/" + languagePackInfo.f25405id;
    }

    public static boolean m25686G2(TdApi.Call call) {
        return !m25562Z2(call) && (call.isOutgoing || call.state.getConstructor() == -1848149403 || call.state.getConstructor() == -2000107571);
    }

    public static boolean m25685G3(String str) {
        return str.equals("opus") || str.equals("mp3") || str.equals("flac") || str.equals("m4a");
    }

    public static TdApi.File m25684G4(int i, String str, String str2, int i2) {
        return new TdApi.File(i, i2, i2, new TdApi.LocalFile(str2, false, false, false, true, 0, i2, i2), new TdApi.RemoteFile(str, "", false, false, 0));
    }

    public static TdApi.InputMessageContent m25683G5(String str, TdApi.InputFile inputFile, C4788g gVar, TdApi.FormattedText formattedText) {
        int i;
        int i2;
        MediaMetadataRetriever mediaMetadataRetriever;
        String str2;
        String str3;
        int i3;
        if (!C5070i.m24061i(gVar.f16287c)) {
            if (gVar.f16287c.startsWith("audio/") && !gVar.f16287c.equals("audio/ogg")) {
                try {
                    mediaMetadataRetriever = C7389v0.m16595p2(str);
                } catch (Throwable unused) {
                    mediaMetadataRetriever = null;
                }
                if (mediaMetadataRetriever != null) {
                    try {
                        i3 = C5070i.m24051s(mediaMetadataRetriever.extractMetadata(9));
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(7);
                        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(2);
                        if (C5070i.m24061i(extractMetadata2)) {
                            extractMetadata2 = mediaMetadataRetriever.extractMetadata(3);
                        }
                        C7389v0.m16730H(mediaMetadataRetriever);
                        str2 = extractMetadata2;
                        str3 = extractMetadata;
                    } catch (Throwable th) {
                        C7389v0.m16730H(mediaMetadataRetriever);
                        throw th;
                    }
                } else {
                    str3 = null;
                    str2 = null;
                    i3 = 0;
                }
                return new TdApi.InputMessageAudio(inputFile, null, i3, str3, str2, formattedText);
            } else if (gVar.f16287c.startsWith("video/")) {
                try {
                    C7389v0.C7390a L0 = C7389v0.m16713L0(str);
                    if (L0 != null) {
                        int a = (int) L0.m16554a(TimeUnit.SECONDS);
                        if (L0.f23336f) {
                            int i4 = L0.f23331a;
                            int i5 = L0.f23332b;
                            if (C7389v0.m16564x1(L0.f23333c)) {
                                i = i4;
                                i2 = i5;
                            } else {
                                i2 = i4;
                                i = i5;
                            }
                            if (a < 30 && gVar.f16285a < EnumC6459p.f20144Q.mo20395b(10.0d) && !L0.f23337g) {
                                return new TdApi.InputMessageAnimation(inputFile, null, null, a, i2, i, null);
                            }
                            if (a > 0) {
                                return new TdApi.InputMessageVideo(inputFile, null, null, a, i2, i, C7389v0.m16746D(inputFile), formattedText, 0);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Log.m14710w("Cannot extract media metadata", th2, new Object[0]);
                }
            }
        }
        return new TdApi.InputMessageDocument(inputFile, null, false, formattedText);
    }

    public static boolean m25682H(TdApi.User user) {
        return user != null && user.type.getConstructor() == -598644325;
    }

    public static int m25681H0(long j, long j2) {
        return j == -1 ? R.id.theme_color_avatarInactive : f16239a[m25570Y0(j2, j)];
    }

    public static String m25680H1(TdApi.User user) {
        return "https://" + m25514g2() + "/" + user.username;
    }

    public static boolean m25679H2(TdApi.ChatMemberStatus chatMemberStatus) {
        int constructor = chatMemberStatus.getConstructor();
        return constructor == -160019714 || constructor == 82243562;
    }

    public static boolean m25678H3(String str) {
        return str.equals("application/ogg") || str.equals("audio/ogg") || str.equals("audio/mpeg") || str.equals("audio/mp4") || str.equals("audio/flac");
    }

    public static TdApi.File m25677H4(File file) {
        String path = file.getPath();
        return m25684G4(0, path, path, (int) file.length());
    }

    public static CharSequence m25676H5(TdApi.FormattedText formattedText) {
        if (formattedText == null) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return formattedText.text;
        }
        TdApi.Object e = Client.m14793e(new TdApi.GetMarkdownText(formattedText));
        if (e instanceof TdApi.FormattedText) {
            return m25434r5((TdApi.FormattedText) e, true, true);
        }
        Log.m14709w("getMarkdownText: %s", e);
        return formattedText.text;
    }

    public static boolean m25675I(TdApi.MessageContent messageContent) {
        switch (messageContent.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
            case TdApi.MessageAudio.CONSTRUCTOR:
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
            case TdApi.MessageDocument.CONSTRUCTOR:
            case TdApi.MessageAnimatedEmoji.CONSTRUCTOR:
            case TdApi.MessageAnimation.CONSTRUCTOR:
            case TdApi.MessageText.CONSTRUCTOR:
            case TdApi.MessageVideo.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public static int m25674I0(TdApi.User user, long j) {
        return m25681H0(m25671I3(user) ? -1L : user == null ? 0L : user.f25439id, j);
    }

    public static int m25673I1(TdApi.Poll poll) {
        if (poll.totalVoterCount == 0) {
            return 0;
        }
        int i = 0;
        for (TdApi.PollOption pollOption : poll.options) {
            i = Math.max(pollOption.voterCount, i);
        }
        return i;
    }

    public static boolean m25672I2(TdApi.ChatEventLogFilters chatEventLogFilters) {
        return chatEventLogFilters == null || (chatEventLogFilters.messageEdits && chatEventLogFilters.messageDeletions && chatEventLogFilters.messagePins && chatEventLogFilters.memberJoins && chatEventLogFilters.memberLeaves && chatEventLogFilters.memberInvites && chatEventLogFilters.memberPromotions && chatEventLogFilters.memberRestrictions && chatEventLogFilters.infoChanges && chatEventLogFilters.settingChanges && chatEventLogFilters.inviteLinkChanges && chatEventLogFilters.videoChatChanges);
    }

    public static boolean m25671I3(TdApi.User user) {
        return user != null && user.type.getConstructor() == -1807729372;
    }

    public static TdApi.InputFileGenerated m25670I4(String str, String str2, int i, long j) {
        return new TdApi.InputFileGenerated(str, str2 + "," + i + "_" + j, i);
    }

    public static CharacterStyle m25669I5(TdApi.TextEntityType textEntityType) {
        return m25662J5(textEntityType, true);
    }

    public static boolean m25668J(CharacterStyle characterStyle) {
        if (characterStyle instanceof C5132o) {
            return ((C5132o) characterStyle).m23860b() != null;
        }
        if (characterStyle instanceof URLSpan) {
            return C1363c0.m37457Q(((URLSpan) characterStyle).getURL());
        }
        if (characterStyle instanceof StyleSpan) {
            int style = ((StyleSpan) characterStyle).getStyle();
            return style == 1 || style == 2 || style == 3;
        } else if (characterStyle instanceof TypefaceSpan) {
            return "monospace".equals(((TypefaceSpan) characterStyle).getFamily());
        } else {
            return ((characterStyle instanceof BackgroundColorSpan) && ((BackgroundColorSpan) characterStyle).getBackgroundColor() == -5658199) || (characterStyle instanceof StrikethroughSpan) || (characterStyle instanceof UnderlineSpan);
        }
    }

    public static File m25667J0(boolean z) {
        File externalCacheDir = (!z || !"mounted".equals(Environment.getExternalStorageState()) || Environment.isExternalStorageEmulated()) ? null : C1379j0.m37315n().getExternalCacheDir();
        return externalCacheDir == null ? C1379j0.m37315n().getCacheDir() : externalCacheDir;
    }

    public static CharSequence m25666J1(AbstractC10664f9 f9Var, TdApi.ChatMember chatMember, boolean z) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        switch (chatMember.status.getConstructor()) {
            case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                charSequence = m25659K1(f9Var, chatMember.inviterUserId, chatMember.joinedChatDate, R.string.BannedByXOnDate, R.string.BannedByX, R.string.Banned);
                break;
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                charSequence = C4403w.m27869i1(R.string.ChannelOwner);
                break;
            case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                charSequence = m25659K1(f9Var, chatMember.inviterUserId, 0, R.string.PromotedByXOnDate, R.string.PromotedByX, R.string.Administrator);
                break;
            case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                long j = chatMember.inviterUserId;
                if (j != 0) {
                    charSequence = m25659K1(f9Var, j, 0, R.string.InvitedByXOnDate, R.string.InvitedByX, 0);
                    break;
                }
                charSequence = null;
                break;
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                charSequence = m25659K1(f9Var, chatMember.inviterUserId, ((TdApi.ChatMemberStatusRestricted) chatMember.status).isMember ? 0 : chatMember.joinedChatDate, R.string.RestrictedByXOnDate, R.string.RestrictedByX, R.string.Restricted);
                break;
            default:
                charSequence = null;
                break;
        }
        if (z) {
            charSequence2 = m25652L1(chatMember);
        }
        return (charSequence2 == null || charSequence == null) ? charSequence2 != null ? charSequence2 : charSequence : C4403w.m27862k0(R.string.format_statusAndDate, C5078d.m23986z().m24024I(charSequence), charSequence2);
    }

    public static boolean m25665J2(String str) {
        return "application/x-tgsticker".equals(str);
    }

    public static boolean m25664J3(int i) {
        switch (i) {
            case R.id.right_addNewAdmins:
            case R.id.right_banUsers:
            case R.id.right_changeChatInfo:
            case R.id.right_deleteMessages:
            case R.id.right_editMessages:
            case R.id.right_embedLinks:
            case R.id.right_inviteUsers:
            case R.id.right_pinMessages:
            case R.id.right_readMessages:
            case R.id.right_sendMedia:
            case R.id.right_sendMessages:
            case R.id.right_sendPolls:
            case R.id.right_sendStickersAndGifs:
                return true;
            case R.id.right_icon:
            case R.id.right_manageVideoChats:
            case R.id.right_remainAnonymous:
            default:
                return false;
        }
    }

    public static byte[] m25663J4() {
        return new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
    }

    public static CharacterStyle m25662J5(TdApi.TextEntityType textEntityType, boolean z) {
        if (textEntityType == null) {
            return null;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                if (z) {
                    return new C5132o(null, R.id.theme_color_textLink).m23852j(textEntityType);
                }
                return null;
            case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                return new StyleSpan(1);
            case TdApi.TextEntityTypeCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePre.CONSTRUCTOR:
                return C1389o.f5043m ? new TypefaceSpan(C1389o.m37259j()) : new TypefaceSpan("monospace");
            case TdApi.TextEntityTypeItalic.CONSTRUCTOR:
                return new StyleSpan(2);
            case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                return new URLSpan(((TdApi.TextEntityTypeTextUrl) textEntityType).url);
            case TdApi.TextEntityTypeSpoiler.CONSTRUCTOR:
                return new BackgroundColorSpan(-5658199);
            case TdApi.TextEntityTypeUnderline.CONSTRUCTOR:
                return new UnderlineSpan();
            case TdApi.TextEntityTypeStrikethrough.CONSTRUCTOR:
                return new StrikethroughSpan();
            default:
                return null;
        }
    }

    public static boolean m25661K(TdApi.Document document) {
        return false;
    }

    public static int m25660K0(TdApi.MessageCall messageCall, boolean z, boolean z2) {
        int constructor = messageCall.discardReason.getConstructor();
        return constructor != -1729926094 ? constructor != 1680358012 ? z2 ? z ? R.string.OutgoingCall : R.string.IncomingCall : z ? R.string.Outgoing : R.string.Incoming : z2 ? z ? R.string.CallMessageOutgoingMissed : R.string.MissedCall : z ? R.string.Cancelled : R.string.Missed : z2 ? z ? R.string.OutgoingCall : R.string.CallMessageIncomingDeclined : z ? R.string.Busy : R.string.Declined;
    }

    public static CharSequence m25659K1(final AbstractC10664f9 f9Var, final long j, int i, int i2, int i3, int i4) {
        C4403w.AbstractC4409f fVar = null;
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 != 0 && i != 0) {
            if (f9Var.mo4347s() != null) {
                fVar = new C4403w.AbstractC4409f() {
                    @Override
                    public final Object mo379a(CharSequence charSequence, int i6, int i7, int i8, boolean z) {
                        Object d4;
                        d4 = C4779t2.m25533d4(AbstractC10664f9.this, j, charSequence, i6, i7, i8, z);
                        return d4;
                    }
                };
            }
            return m25449p4(C4403w.m27873h1(i2, fVar, f9Var.mo4348c().m2480e2().m1721K2(j), C4403w.m27910Z0(i, TimeUnit.SECONDS)));
        } else if (i5 != 0) {
            if (f9Var.mo4347s() != null) {
                fVar = new C4403w.AbstractC4409f() {
                    @Override
                    public final Object mo379a(CharSequence charSequence, int i6, int i7, int i8, boolean z) {
                        Object e4;
                        e4 = C4779t2.m25526e4(AbstractC10664f9.this, j, charSequence, i6, i7, i8, z);
                        return e4;
                    }
                };
            }
            return m25449p4(C4403w.m27873h1(i3, fVar, f9Var.mo4348c().m2480e2().m1721K2(j)));
        } else if (i != 0) {
            return C4403w.m27910Z0(i, TimeUnit.SECONDS);
        } else {
            return C4403w.m27869i1(i4);
        }
    }

    public static boolean m25658K2(TdApi.User user) {
        return user != null && user.type.getConstructor() == 1262387765;
    }

    public static boolean m25657K3(TdApi.TextEntityType textEntityType, boolean z) {
        if (textEntityType == null) {
            return false;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                return z;
            case TdApi.TextEntityTypeBold.CONSTRUCTOR:
            case TdApi.TextEntityTypeCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
            case TdApi.TextEntityTypeItalic.CONSTRUCTOR:
            case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
            case TdApi.TextEntityTypeSpoiler.CONSTRUCTOR:
            case TdApi.TextEntityTypeUnderline.CONSTRUCTOR:
            case TdApi.TextEntityTypeStrikethrough.CONSTRUCTOR:
            case TdApi.TextEntityTypePre.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public static C5132o m25656K4(TdApi.TextEntityType textEntityType) {
        return new C5132o(null, 0).m23852j(textEntityType);
    }

    public static TdApi.Thumbnail m25655K5(TdApi.PhotoSize photoSize) {
        if (photoSize == null) {
            return null;
        }
        return new TdApi.Thumbnail(new TdApi.ThumbnailFormatJpeg(), photoSize.width, photoSize.height, photoSize.photo);
    }

    public static boolean m25654L(TdApi.Message message) {
        String j2 = m25493j2(message);
        return j2 != null && j2.trim().length() > 0;
    }

    public static boolean m25653L0(TdApi.Call call) {
        return !m25562Z2(call) && call.state.getConstructor() != -2000107571;
    }

    public static CharSequence m25652L1(TdApi.ChatMember chatMember) {
        if (chatMember.joinedChatDate == 0 || !m25499i3(chatMember.status, false)) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return C4403w.m27865j1(R.string.MemberSince, C4403w.m27846o0(chatMember.joinedChatDate, timeUnit), C4403w.m27932T2(chatMember.joinedChatDate, timeUnit));
    }

    public static boolean m25651L2(TdApi.CallDiscardReason callDiscardReason) {
        return callDiscardReason.getConstructor() == -1729926094 || callDiscardReason.getConstructor() == 1680358012;
    }

    public static int m25650L3(AbstractC5411l0 l0Var, AbstractC5411l0 l0Var2) {
        return Integer.compare(l0Var.m22785i(), l0Var2.m22785i());
    }

    public static TdApi.FormattedText m25649L4(CharSequence charSequence) {
        return new TdApi.FormattedText(charSequence.toString(), m25392x5(charSequence, false));
    }

    public static TdApi.Thumbnail m25648L5(TdApi.Sticker sticker) {
        if (sticker == null) {
            return null;
        }
        TdApi.Thumbnail thumbnail = sticker.thumbnail;
        if (thumbnail != null) {
            return thumbnail;
        }
        if (C7321e.m16976V0(sticker.type)) {
            return null;
        }
        return new TdApi.Thumbnail(new TdApi.ThumbnailFormatWebp(), sticker.width, sticker.height, sticker.sticker);
    }

    public static boolean m25647M(TdApi.Message message) {
        return m25640N(message, m25494j1(message));
    }

    public static String m25646M0(TdApi.Call call, long j, boolean z) {
        switch (call.state.getConstructor()) {
            case TdApi.CallStateHangingUp.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.VoipEnded);
            case TdApi.CallStateReady.CONSTRUCTOR:
                if (j < 0) {
                    return C4403w.m27869i1(R.string.VoipEstablishing);
                }
                return C1363c0.m37433h(j);
            case TdApi.CallStateExchangingKeys.CONSTRUCTOR:
                return C4403w.m27869i1(z ? R.string.VoipExchangingKeysShort : R.string.VoipExchangingKeys);
            case TdApi.CallStateError.CONSTRUCTOR:
                if (((TdApi.CallStateError) call.state).error.code == 4005000) {
                    return C4403w.m27869i1(R.string.VoipMissedOutgoing);
                }
                return C4403w.m27869i1(R.string.VoipFailed);
            case TdApi.CallStateDiscarded.CONSTRUCTOR:
                switch (((TdApi.CallStateDiscarded) call.state).reason.getConstructor()) {
                    case TdApi.CallDiscardReasonDeclined.CONSTRUCTOR:
                        return C4403w.m27869i1(call.isOutgoing ? R.string.VoipBusy : R.string.VoipDeclined);
                    case TdApi.CallDiscardReasonDisconnected.CONSTRUCTOR:
                        return C4403w.m27869i1(R.string.VoipDisconnect);
                    case TdApi.CallDiscardReasonEmpty.CONSTRUCTOR:
                        return C4403w.m27869i1(R.string.VoipUnknown);
                    case TdApi.CallDiscardReasonHungUp.CONSTRUCTOR:
                        return C4403w.m27869i1(R.string.VoipEnded);
                    case TdApi.CallDiscardReasonMissed.CONSTRUCTOR:
                        return C4403w.m27869i1(call.isOutgoing ? R.string.VoipCancelled : R.string.VoipMissed);
                    default:
                        return C4403w.m27869i1(R.string.Busy);
                }
            case TdApi.CallStatePending.CONSTRUCTOR:
                TdApi.CallStatePending callStatePending = (TdApi.CallStatePending) call.state;
                if (!call.isOutgoing) {
                    return C4403w.m27869i1(R.string.IncomingCall);
                }
                if (!callStatePending.isCreated) {
                    return C4403w.m27869i1(R.string.VoipConnecting);
                }
                if (!callStatePending.isReceived) {
                    return C4403w.m27869i1(R.string.VoipWaiting);
                }
                return C4403w.m27869i1(R.string.VoipRinging);
            default:
                throw new IllegalArgumentException("call.state == " + call.state);
        }
    }

    public static C6035e<long[]> m25645M1(TdApi.Message[] messageArr) {
        C6035e eVar = new C6035e();
        int length = messageArr.length;
        C5322e eVar2 = null;
        long j = 0;
        for (TdApi.Message message : messageArr) {
            long j2 = message.chatId;
            if (j2 != j) {
                eVar2 = (C5322e) eVar.m21505f(j2);
                if (eVar2 == null) {
                    eVar2 = new C5322e(length);
                    eVar.m21500k(j2, eVar2);
                }
                j = j2;
            }
            eVar2.m23275a(message.f25406id);
        }
        C6035e<long[]> eVar3 = new C6035e<>(eVar.m21496p());
        for (int i = 0; i < eVar.m21496p(); i++) {
            eVar3.m21510a(eVar.m21501j(i), ((C5322e) eVar.m21495q(i)).m23269g());
        }
        return eVar3;
    }

    public static boolean m25644M2(TdApi.Call call) {
        return call != null && call.isOutgoing && call.state.getConstructor() == -190853167 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == 1680358012;
    }

    public static void m25643M3(int[] iArr, TdApi.File[] fileArr, long j, TdApi.Object object) {
        iArr[0] = iArr[0] + 1;
        if (iArr[0] == fileArr.length) {
            C1379j0.m37290z0(C4403w.m27865j1(R.string.FreedX, C1363c0.m37423m(j)), 0);
        }
    }

    public static String m25642M4(String str) {
        if (C5070i.m24061i(str) || str.charAt(str.length() - 1) == '/') {
            return str;
        }
        return str + '/';
    }

    public static TdApi.PhotoSize m25641M5(TdApi.Thumbnail thumbnail) {
        if (thumbnail == null) {
            return null;
        }
        int constructor = thumbnail.format.getConstructor();
        if (constructor != -653503352 && constructor != -53588974 && constructor != 1577490421) {
            return null;
        }
        int max = Math.max(thumbnail.width, thumbnail.height);
        return new TdApi.PhotoSize(max <= 100 ? "s" : max <= 320 ? "m" : "x", thumbnail.file, thumbnail.width, thumbnail.height, null);
    }

    public static boolean m25640N(TdApi.Message message, TdApi.File file) {
        TdApi.LocalFile localFile;
        return m25541c3(message) && file != null && (localFile = file.local) != null && localFile.canBeDeleted && localFile.downloadedPrefixSize > 0;
    }

    public static String m25639N0(TdApi.Call call, TdApi.CallState callState, long j, boolean z) {
        int constructor = callState.getConstructor();
        if (constructor == -2000107571 || constructor == -1848149403) {
            return C4403w.m27869i1(R.string.VoipEnded);
        }
        if (constructor != 1073048620) {
            return m25646M0(call, j, z);
        }
        return C4403w.m27869i1(call.isOutgoing ? R.string.VoipCancelled : R.string.VoipDeclined);
    }

    public static long[] m25638N1(TdApi.Message[] messageArr, int i, int i2) {
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = messageArr[i + i3].f25406id;
        }
        return jArr;
    }

    public static boolean m25637N2(TdApi.ChatType chatType) {
        return chatType != null && chatType.getConstructor() == -1472570774 && ((TdApi.ChatTypeSupergroup) chatType).isChannel;
    }

    public static boolean m25636N3(final TdApi.File[] fileArr, AbstractC9323v4 v4Var, final long j, Runnable runnable, View view, int i) {
        if (i == R.id.btn_deleteFile) {
            C10536ab.m4667o1().m4636w2().m7055f1(fileArr);
            v4Var.mo4347s().m14444s0(fileArr);
            for (TdApi.File file : fileArr) {
                final int[] iArr = new int[1];
                v4Var.mo4348c().m2270r4().m14783o(new TdApi.DeleteFile(file.f25373id), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C4779t2.m25643M3(iArr, fileArr, j, object);
                    }
                });
            }
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }

    public static C4782c m25635N4(TdApi.InlineKeyboardButtonTypeCallbackWithPassword inlineKeyboardButtonTypeCallbackWithPassword) {
        String str = new String(inlineKeyboardButtonTypeCallbackWithPassword.data, C5070i.f17083a);
        if (!str.matches("^bots/[0-9]+/trsf/[0-9]+/c$")) {
            return null;
        }
        String[] split = str.split("/");
        return new C4782c(C5070i.m24051s(split[1]), C5070i.m24051s(split[3]));
    }

    public static String m25634N5(int i, String str) {
        char c;
        String y0;
        if (C5070i.m24061i(str) || str.equalsIgnoreCase("request aborted")) {
            return null;
        }
        switch (str.hashCode()) {
            case -2120721660:
                if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2076245302:
                if (str.equals("PASSWORD_HASH_INVALID")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -2037365853:
                if (str.equals("PHONE_NUMBER_BANNED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2012133105:
                if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1915107375:
                if (str.equals("INPUT_USER_DEACTIVATED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1763467626:
                if (str.equals("USERS_TOO_FEW")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1654434962:
                if (str.equals("Message must be non-empty")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1274174503:
                if (str.equals("FRESH_RESET_AUTHORISATION_FORBIDDEN")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1049881117:
                if (str.equals("PHONE_NUMBER_OCCUPIED")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -936268941:
                if (str.equals("USERNAME_NOT_OCCUPIED")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -830531122:
                if (str.equals("Not enough rights to invite members to the group chat")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -732054030:
                if (str.equals("PHONE_NUMBER_INVALID")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -687975521:
                if (str.equals("The maximum number of pinned chats exceeded")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -531026660:
                if (str.equals("INVITE_HASH_INVALID")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -512775857:
                if (str.equals("USER_RESTRICTED")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -499602090:
                if (str.equals("APP_UPGRADE_NEEDED")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -454039871:
                if (str.equals("PEER_FLOOD")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -446466679:
                if (str.equals("CHAT_SEND_POLL_FORBIDDEN")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -422508131:
                if (str.equals("STICKERSET_INVALID")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -420079733:
                if (str.equals("BOTS_TOO_MUCH")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -141887186:
                if (str.equals("USERNAMES_UNAVAILABLE")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -120967562:
                if (str.equals("CHAT_ADMIN_REQUIRED")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 112805161:
                if (str.equals("Top chats computation is disabled")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 288843630:
                if (str.equals("USERNAME_INVALID")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 321063201:
                if (str.equals("LANG_CODE_NOT_SUPPORTED")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 494920266:
                if (str.equals("INVITE_HASH_EXPIRED")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 533175271:
                if (str.equals("USERNAME_OCCUPIED")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 785969592:
                if (str.equals("Invalid chat identifier specified")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1167301807:
                if (str.equals("USERS_TOO_MUCH")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1253103379:
                if (str.equals("ADMINS_TOO_MUCH")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1355367367:
                if (str.equals("CHANNELS_TOO_MUCH")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1377621075:
                if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1623167701:
                if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1786305461:
                if (str.equals("Not Found")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1916725894:
                if (str.equals("USER_PRIVACY_RESTRICTED")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i2 = R.string.error_CHANNELS_TOO_MUCH;
        switch (c) {
            case 0:
                i2 = R.string.error_CHANNELS_ADMIN_LOCATED_TOO_MUCH;
                break;
            case 1:
                i2 = R.string.PasswordIsInvalid;
                break;
            case 2:
                i2 = R.string.login_PHONE_NUMBER_BANNED;
                break;
            case 3:
                i2 = R.string.TooManyPublicChannels;
                break;
            case 4:
                i2 = R.string.ErrorUserDeleted;
                break;
            case 5:
                i2 = R.string.ErrorUsersTooFew;
                break;
            case 6:
                i2 = R.string.MessageInputEmpty;
                break;
            case 7:
                i2 = R.string.TerminateSessionFreshError;
                break;
            case '\b':
                i2 = R.string.PhoneNumberInUse;
                break;
            case '\t':
                i2 = R.string.UsernameNotOccupiedUnknown;
                break;
            case '\n':
                i2 = R.string.YouCantInviteMembers;
                break;
            case 11:
                i2 = R.string.login_InvalidPhone;
                break;
            case '\f':
                return C4403w.m27844o2(R.string.ErrorPinnedChatsLimit, C10536ab.m4667o1().m4684j0().m2844Ga());
            case '\r':
            case 25:
                i2 = R.string.InviteLinkInvalid;
                break;
            case 14:
                i2 = R.string.UserRestricted;
                break;
            case 15:
                i2 = R.string.error_APP_UPGRADE_NEEDED;
                break;
            case 16:
                i2 = R.string.NobodyLikesSpam2;
                break;
            case 17:
                i2 = R.string.error_CHAT_SEND_POLL_FORBIDDEN;
                break;
            case 18:
                i2 = R.string.error_STICKERSET_INVALID;
                break;
            case 19:
                i2 = R.string.error_BOTS_TOO_MUCH;
                break;
            case 20:
                i2 = R.string.FeatureUnavailable;
                break;
            case 21:
                i2 = R.string.error_CHAT_ADMIN_REQUIRED;
                break;
            case 22:
                i2 = R.string.ChatSuggestionsDisabled;
                break;
            case 23:
                i2 = R.string.UsernameInvalid;
                break;
            case C3563j.f11955K3:
                i2 = R.string.error_LANG_CODE_NOT_SUPPORTED;
                break;
            case 26:
                i2 = R.string.UsernameInUse;
                break;
            case 27:
                i2 = R.string.error_ChatInfoNotFound;
                break;
            case 28:
                i2 = R.string.GroupIsFull;
                break;
            case C3563j.f11980P3:
                i2 = R.string.error_ADMINS_TOO_MUCH;
                break;
            case 30:
            case 31:
                break;
            case Log.TAG_IMAGE_LOADER:
                i2 = R.string.error_USER_NOT_MUTUAL_CONTACT;
                break;
            case '!':
                i2 = R.string.error_NotFound;
                break;
            case '\"':
                i2 = R.string.UserPrivacyRestricted;
                break;
            default:
                String C = C5070i.m24075C(str);
                if (!C.matches("^[A-Za-z0-9_]+$") || (y0 = C4403w.m27806y0(C)) == null) {
                    i2 = 0;
                    break;
                } else {
                    return y0;
                }
        }
        if (i2 != 0) {
            return C4403w.m27869i1(i2);
        }
        int v1 = m25410v1(i, str, -1);
        if (v1 > 0) {
            return C4403w.m27865j1(R.string.format_TooManyRequests, C4403w.m27801z1(v1));
        }
        return "#" + i + ": " + str;
    }

    public static boolean m25633O(TdApi.MessageContent messageContent) {
        return m25675I(messageContent) && messageContent.getConstructor() != 303973492;
    }

    public static int m25632O0(TdApi.Call call) {
        switch (call.state.getConstructor()) {
            case TdApi.CallStateHangingUp.CONSTRUCTOR:
            case TdApi.CallStateReady.CONSTRUCTOR:
                return 0;
            case TdApi.CallStateExchangingKeys.CONSTRUCTOR:
                if (call.isOutgoing) {
                    return R.raw.voip_connecting;
                }
                return 0;
            case TdApi.CallStateError.CONSTRUCTOR:
                if (((TdApi.CallStateError) call.state).error.code == 4005000) {
                    return 0;
                }
                return R.raw.voip_fail;
            case TdApi.CallStateDiscarded.CONSTRUCTOR:
                switch (((TdApi.CallStateDiscarded) call.state).reason.getConstructor()) {
                    case TdApi.CallDiscardReasonDeclined.CONSTRUCTOR:
                        if (call.isOutgoing) {
                            return R.raw.voip_busy;
                        }
                        return 0;
                    case TdApi.CallDiscardReasonDisconnected.CONSTRUCTOR:
                        return R.raw.voip_fail;
                    case TdApi.CallDiscardReasonEmpty.CONSTRUCTOR:
                        return 0;
                    case TdApi.CallDiscardReasonHungUp.CONSTRUCTOR:
                        return R.raw.voip_end;
                    case TdApi.CallDiscardReasonMissed.CONSTRUCTOR:
                        if (call.isOutgoing) {
                            return 0;
                        }
                        return R.raw.voip_end;
                    default:
                        return R.raw.voip_busy;
                }
            case TdApi.CallStatePending.CONSTRUCTOR:
                TdApi.CallStatePending callStatePending = (TdApi.CallStatePending) call.state;
                if (!call.isOutgoing) {
                    return 0;
                }
                return (callStatePending.isCreated && callStatePending.isReceived) ? R.raw.voip_ringback : R.raw.voip_connecting;
            default:
                throw new IllegalArgumentException("call.state == " + call.state);
        }
    }

    public static String m25631O1(TdApi.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        if (webPage.sticker != null) {
            return "image/webp";
        }
        TdApi.Video video = webPage.video;
        if (video != null) {
            String str = video.mimeType;
            return (C5070i.m24061i(str) || !str.startsWith("video/")) ? "video/*" : str;
        }
        TdApi.Animation animation = webPage.animation;
        if (animation != null) {
            String str2 = animation.mimeType;
            return !C5070i.m24061i(str2) ? (str2.startsWith("video/") || str2.equals("image/gif")) ? str2 : "video/*" : "video/*";
        }
        TdApi.Audio audio = webPage.audio;
        if (audio != null) {
            String str3 = audio.mimeType;
            return (C5070i.m24061i(str3) || !str3.startsWith("audio/")) ? "audio/*" : str3;
        }
        TdApi.Document document = webPage.document;
        if (document != null) {
            String str4 = document.mimeType;
            if (C5070i.m24061i(str4)) {
                str4 = C1369e0.m37392g(C7389v0.m16573v0(webPage.document.fileName));
            }
            return C5070i.m24061i(str4) ? "application/octet-stream" : str4;
        } else if (webPage.photo != null) {
            return "image/jpeg";
        } else {
            return null;
        }
    }

    public static boolean m25630O2(TdApi.User user) {
        return user != null && user.isContact;
    }

    public static boolean m25629O3(C5132o.AbstractC5133a aVar, AbstractC10664f9 f9Var, String str, View view, C5132o oVar) {
        if ((aVar != null && aVar.mo490a(view, oVar)) || f9Var == null) {
            return true;
        }
        C2963r9 r9Var = new C2963r9(f9Var.mo4347s(), f9Var.mo4348c());
        r9Var.m9476Ad(str);
        f9Var.mo4347s().m14552P1().m9719h0(r9Var);
        return true;
    }

    public static boolean m25628O4(TdApi.FormattedText formattedText) {
        TdApi.TextEntity[] textEntityArr;
        TdApi.TextEntity[] C0;
        if (C7321e.m16965a1(formattedText)) {
            return false;
        }
        TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
        if (textEntityArr2 == null || textEntityArr2.length == 0) {
            TdApi.TextEntity[] C02 = C7321e.m17014C0(formattedText.text);
            if (C02 == null) {
                return false;
            }
            formattedText.entities = C02;
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (TdApi.TextEntity textEntity : formattedText.entities) {
            switch (textEntity.type.getConstructor()) {
                case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                case TdApi.TextEntityTypePre.CONSTRUCTOR:
                    int i2 = textEntity.offset;
                    if (i2 > i && (C0 = C7321e.m17014C0(formattedText.text.substring(i, i2))) != null) {
                        Collections.addAll(arrayList, C0);
                    }
                    i = textEntity.offset + textEntity.length;
                    break;
            }
        }
        if (i < formattedText.text.length()) {
            String str = formattedText.text;
            if (i != 0) {
                str = str.substring(i);
            }
            TdApi.TextEntity[] C03 = C7321e.m17014C0(str);
            if (C03 != null) {
                Collections.addAll(arrayList, C03);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Collections.addAll(arrayList, formattedText.entities);
        TdApi.TextEntity[] textEntityArr3 = (TdApi.TextEntity[]) arrayList.toArray(new TdApi.TextEntity[0]);
        formattedText.entities = textEntityArr3;
        C7321e.m16917q1(textEntityArr3);
        return true;
    }

    public static TdApi.FormattedText m25627O5(String str, TdApi.FormattedText formattedText) {
        if (C5070i.m24061i(str)) {
            return formattedText;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return new TdApi.FormattedText(str + formattedText.text, formattedText.entities);
        }
        TdApi.FormattedText formattedText2 = new TdApi.FormattedText(str + formattedText.text, new TdApi.TextEntity[formattedText.entities.length]);
        int length = str.length();
        int i = 0;
        while (true) {
            TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
            if (i >= textEntityArr2.length) {
                return formattedText2;
            }
            TdApi.TextEntity textEntity = textEntityArr2[i];
            formattedText2.entities[i] = new TdApi.TextEntity(textEntity.offset + length, textEntity.length, textEntity.type);
            i++;
        }
    }

    public static int m25626P(TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2) {
        if (chatMemberStatus2.getConstructor() == -160019714) {
            return 3;
        }
        int constructor = chatMemberStatus.getConstructor();
        return constructor != -160019714 ? constructor != 82243562 ? chatMemberStatus2.getConstructor() == 82243562 ? 3 : 0 : chatMemberStatus2.getConstructor() == 82243562 ? ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus2).canBeEdited ? 2 : 3 : ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).canPromoteMembers ? 1 : 0 : chatMemberStatus2.getConstructor() != 82243562 ? 1 : 2;
    }

    public static long m25625P0(TdApi.Object object) {
        if (object.getConstructor() != -1601123095) {
            return 0L;
        }
        return ((TdApi.Chat) object).f25367id;
    }

    public static int m25624P1(int i) {
        switch (i) {
            case R.id.theme_color_avatarBlue:
                return R.id.theme_color_nameBlue;
            case R.id.theme_color_avatarCyan:
                return R.id.theme_color_nameCyan;
            case R.id.theme_color_avatarGreen:
                return R.id.theme_color_nameGreen;
            case R.id.theme_color_avatarInactive:
                return R.id.theme_color_nameInactive;
            case R.id.theme_color_avatarOrange:
                return R.id.theme_color_nameOrange;
            case R.id.theme_color_avatarPink:
                return R.id.theme_color_namePink;
            case R.id.theme_color_avatarRed:
                return R.id.theme_color_nameRed;
            case R.id.theme_color_avatarViolet:
                return R.id.theme_color_nameViolet;
            case R.id.theme_color_avatarYellow:
                return R.id.theme_color_nameYellow;
            default:
                return R.id.theme_color_messageAuthor;
        }
    }

    public static boolean m25623P2(TdApi.ChatMemberStatus chatMemberStatus) {
        return chatMemberStatus != null && chatMemberStatus.getConstructor() == -160019714;
    }

    public static boolean m25622P3(C5132o.AbstractC5133a aVar, String str, View view, C5132o oVar) {
        if (aVar != null && aVar.mo490a(view, oVar)) {
            return true;
        }
        C1405v.m37132K(str);
        return true;
    }

    public static boolean m25621P4(TdApi.FormattedText formattedText) {
        if (C7321e.m16965a1(formattedText)) {
            return false;
        }
        return m25628O4(formattedText) || C7321e.m16935k1(formattedText);
    }

    public static boolean m25620P5(TdApi.File file, int i) {
        TdApi.LocalFile localFile = file.local;
        int i2 = localFile.downloadOffset;
        return i >= i2 && ((long) i) <= ((long) (i2 + localFile.downloadedPrefixSize)) + EnumC6459p.f20156b.mo20395b(512.0d);
    }

    public static boolean m25619Q(TdApi.Message message) {
        return message != null && message.sendingState == null && !m25727A3(message);
    }

    public static long m25618Q0(TdApi.Message[] messageArr) {
        if (messageArr == null || messageArr.length <= 0) {
            return 0L;
        }
        long j = messageArr[0].chatId;
        for (TdApi.Message message : messageArr) {
            if (message.chatId != j) {
                return 0L;
            }
        }
        return j;
    }

    public static C4783d m25617Q1(int i, int i2, C10930q6 q6Var, long j, TdApi.MessageSender messageSender, String str, String str2, int i3) {
        return m25611R1(i, i2, q6Var, j, messageSender, str2, str, false, i3);
    }

    public static boolean m25616Q2(TdApi.Call call) {
        return call != null && !call.isOutgoing && call.state.getConstructor() == -190853167 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == -1729926094;
    }

    public static boolean m25615Q3(C5132o.AbstractC5133a aVar, AbstractC10664f9 f9Var, String str, View view, C5132o oVar) {
        if ((aVar != null && aVar.mo490a(view, oVar)) || f9Var == null) {
            return true;
        }
        f9Var.mo4348c().m2485dd().m3399y7(f9Var, str, null);
        return true;
    }

    public static java.lang.String m25614Q4(java.lang.String r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4779t2.m25614Q4(java.lang.String, boolean, boolean):java.lang.String");
    }

    public static int m25613R(TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2) {
        if (chatMemberStatus2.getConstructor() == -160019714) {
            return 0;
        }
        int constructor = chatMemberStatus.getConstructor();
        if (constructor != -160019714) {
            if (constructor != 82243562) {
                if (chatMemberStatus2.getConstructor() == 1661432998) {
                    return 3;
                }
            } else if (((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).canRestrictMembers) {
                switch (chatMemberStatus2.getConstructor()) {
                    case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                    case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                        return 2;
                    case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                    case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                        return 1;
                    case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus2).canBeEdited ? 1 : 0;
                }
            }
            return 0;
        }
        int constructor2 = chatMemberStatus2.getConstructor();
        return (constructor2 == -1653518666 || constructor2 == 1661432998) ? 2 : 1;
    }

    public static C4783d m25612R0(C10930q6 q6Var, long j, TdApi.Message message) {
        return m25543c1(q6Var, j, message, true, true);
    }

    public static C4783d m25611R1(int i, int i2, C10930q6 q6Var, long j, TdApi.MessageSender messageSender, String str, String str2, boolean z, int i3) {
        String i1;
        if (C5070i.m24061i(str2)) {
            try {
                i1 = C4403w.m27935T(C1363c0.m37449Y(C4403w.m27869i1(i)).toString(), null, m25535d2(q6Var, messageSender, str)).toString();
            } catch (Throwable unused) {
                i1 = C4403w.m27869i1(i);
            }
        } else {
            C4783d T1 = m25599T1(i2, q6Var, j, messageSender, str, str2, z, i3);
            String dVar = T1 != null ? T1.toString() : null;
            if (!C5070i.m24061i(dVar)) {
                str2 = dVar;
            }
            try {
                i1 = C4403w.m27935T(C1363c0.m37449Y(C4403w.m27869i1(R.string.ActionPinnedText)).toString(), null, m25535d2(q6Var, messageSender, str), str2).toString();
            } catch (Throwable unused2) {
                i1 = C4403w.m27869i1(R.string.ActionPinnedText);
            }
        }
        return new C4783d(null, 0, new TdApi.FormattedText(i1, null), true, true, f16262x);
    }

    public static boolean m25610R2(TdApi.Message message) {
        TdApi.MessageSendingState messageSendingState;
        return (message == null || (messageSendingState = message.sendingState) == null || messageSendingState.getConstructor() != -1741887228) ? false : true;
    }

    public static boolean m25609R3(C5132o.AbstractC5133a aVar, AbstractC10664f9 f9Var, String str, View view, C5132o oVar) {
        if ((aVar != null && aVar.mo490a(view, oVar)) || f9Var == null) {
            return true;
        }
        f9Var.mo4348c().m2485dd().m3589f7(f9Var, str);
        return true;
    }

    public static void m25608R4(C10930q6 q6Var, long j, TdApi.MessageSendOptions messageSendOptions, List<TdApi.Function> list, List<TdApi.InputMessageContent> list2) {
        if (list2 != null && !list2.isEmpty()) {
            if (list2.size() == 1) {
                m25602S4(q6Var, j, messageSendOptions, list, list2.get(0));
            } else {
                TdApi.InputMessageContent[] inputMessageContentArr = new TdApi.InputMessageContent[list2.size()];
                list2.toArray(inputMessageContentArr);
                list.add(new TdApi.SendMessageAlbum(j, 0L, 0L, messageSendOptions, inputMessageContentArr, false));
            }
            list2.clear();
        }
    }

    public static boolean m25607S(TdApi.Poll poll) {
        if (poll.type.getConstructor() == 641265698) {
            for (TdApi.PollOption pollOption : poll.options) {
                if (pollOption.isChosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String m25606S0(C10930q6 q6Var, long j, TdApi.User user, boolean z) {
        long c = C7316a.m17058c(j);
        if (q6Var.m2363l7(c)) {
            return C4403w.m27869i1(R.string.ServiceNotifications);
        }
        if (q6Var.m2475e7(c)) {
            return C4403w.m27869i1(R.string.ReplyNotifications);
        }
        if (q6Var.m2379k7(j)) {
            return C4403w.m27869i1(R.string.status_Online);
        }
        if (user == null) {
            return C4403w.m27869i1(R.string.UserUnavailable);
        }
        int constructor = user.type.getConstructor();
        if (constructor == -1807729372) {
            return C4403w.m27869i1(R.string.deletedUser);
        }
        if (constructor == -724541123) {
            return C4403w.m27869i1(R.string.unknownUser);
        }
        if (constructor != 1262387765) {
            return C4403w.m27997D1(q6Var, user.status, true);
        }
        if (!z) {
            return "@" + user.username;
        } else if (((TdApi.UserTypeBot) user.type).canReadAllGroupMessages) {
            return C4403w.m27869i1(R.string.BotStatusRead);
        } else {
            return C4403w.m27869i1(R.string.BotStatusCantRead);
        }
    }

    public static C4783d m25605S1(int i, C10930q6 q6Var, long j, TdApi.MessageSender messageSender, String str, String str2, int i2) {
        return m25550b1(i, q6Var, j, messageSender, str, q6Var.m2395j7(messageSender), false, new TdApi.FormattedText(str2, null), false, i2);
    }

    public static boolean m25604S2(TdApi.File file) {
        return file == null || file.f25373id == 0;
    }

    public static boolean m25603S3(C5132o.AbstractC5133a aVar, String str, View view, C5132o oVar) {
        if (aVar != null && aVar.mo490a(view, oVar)) {
            return true;
        }
        C1405v.m37141B(str);
        return true;
    }

    public static void m25602S4(C10930q6 q6Var, long j, TdApi.MessageSendOptions messageSendOptions, List<TdApi.Function> list, TdApi.InputMessageContent inputMessageContent) {
        list.add(new TdApi.SendMessage(j, 0L, 0L, messageSendOptions, null, inputMessageContent));
    }

    public static boolean m25601T(TdApi.ChatMemberStatus chatMemberStatus) {
        if (chatMemberStatus == null) {
            return false;
        }
        int constructor = chatMemberStatus.getConstructor();
        if (constructor == -160019714) {
            return !((TdApi.ChatMemberStatusCreator) chatMemberStatus).isMember;
        }
        if (constructor == -5815259) {
            return true;
        }
        if (constructor != 1661432998) {
            return false;
        }
        return !((TdApi.ChatMemberStatusRestricted) chatMemberStatus).isMember;
    }

    public static int m25600T0(TdApi.AuthenticationCodeType authenticationCodeType) {
        switch (authenticationCodeType.getConstructor()) {
            case TdApi.AuthenticationCodeTypeMissedCall.CONSTRUCTOR:
                return ((TdApi.AuthenticationCodeTypeMissedCall) authenticationCodeType).length;
            case TdApi.AuthenticationCodeTypeSms.CONSTRUCTOR:
                return ((TdApi.AuthenticationCodeTypeSms) authenticationCodeType).length;
            case TdApi.AuthenticationCodeTypeCall.CONSTRUCTOR:
                return ((TdApi.AuthenticationCodeTypeCall) authenticationCodeType).length;
            case TdApi.AuthenticationCodeTypeTelegramMessage.CONSTRUCTOR:
                return ((TdApi.AuthenticationCodeTypeTelegramMessage) authenticationCodeType).length;
            default:
                return 5;
        }
    }

    public static C4783d m25599T1(int i, C10930q6 q6Var, long j, TdApi.MessageSender messageSender, String str, String str2, boolean z, int i2) {
        return m25550b1(i, q6Var, j, messageSender, str, q6Var.m2395j7(messageSender), false, new TdApi.FormattedText(str2, null), z, i2);
    }

    public static boolean m25598T2(TdApi.File file) {
        TdApi.LocalFile localFile;
        return (file == null || (localFile = file.local) == null || !localFile.isDownloadingCompleted) ? false : true;
    }

    public static boolean m25597T3(C5132o.AbstractC5133a aVar, AbstractC10664f9 f9Var, String str, View view, C5132o oVar) {
        if ((aVar != null && aVar.mo490a(view, oVar)) || f9Var == null) {
            return true;
        }
        f9Var.mo4348c().m2485dd().m3858E7(f9Var, str, null);
        return true;
    }

    public static TdApi.Message m25596T4(TdApi.Message message) {
        TdApi.MessageContent U4 = m25590U4(message.content);
        if (U4 == message.content) {
            return message;
        }
        TdApi.Message o = C7321e.m16925o(message);
        o.content = U4;
        return o;
    }

    public static boolean m25595U(TdApi.MessageContent messageContent) {
        int constructor = messageContent.getConstructor();
        return (constructor == -662130099 || constructor == -69441162) ? false : true;
    }

    public static int m25594U0(TdApi.AuthorizationState authorizationState) {
        if (authorizationState == null || authorizationState.getConstructor() != 52643073) {
            return 5;
        }
        return m25600T0(((TdApi.AuthorizationStateWaitCode) authorizationState).codeInfo.type);
    }

    public static C4783d m25593U1(C10930q6 q6Var, long j, TdApi.Message message, boolean z) {
        return m25543c1(q6Var, j, message, z, false);
    }

    public static boolean m25592U2(TdApi.Message message) {
        return message != null && m25598T2(m25494j1(message));
    }

    public static boolean m25591U3(C5132o.AbstractC5133a aVar, AbstractC10664f9 f9Var, String str, View view, C5132o oVar) {
        if ((aVar != null && aVar.mo490a(view, oVar)) || f9Var == null) {
            return true;
        }
        f9Var.mo4348c().m2485dd().m3858E7(f9Var, str, null);
        return true;
    }

    public static TdApi.MessageContent m25590U4(TdApi.MessageContent messageContent) {
        if (messageContent == null || messageContent.getConstructor() != 1989037971) {
            return messageContent;
        }
        TdApi.MessageText messageText = (TdApi.MessageText) messageContent;
        if (messageText.webPage == null) {
            return messageText;
        }
        TdApi.FormattedText formattedText = new TdApi.FormattedText();
        int length = messageText.text.text.length() + 1;
        formattedText.text = messageText.text.text + "\n[" + C4403w.m27869i1(R.string.LinkPreview) + "]";
        TdApi.TextEntity[] textEntityArr = messageText.text.entities;
        if (textEntityArr != null) {
            formattedText.entities = (TdApi.TextEntity[]) C5062b.m24179C(textEntityArr, textEntityArr.length + 1, null);
        } else {
            formattedText.entities = new TdApi.TextEntity[1];
        }
        TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
        textEntityArr2[textEntityArr2.length - 1] = new TdApi.TextEntity(length, formattedText.text.length() - length, new TdApi.TextEntityTypeItalic());
        return new TdApi.MessageText(formattedText, null);
    }

    public static boolean m25589V(TdApi.Poll poll) {
        return !m25386y4(poll);
    }

    public static int m25588V0(TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo) {
        int i = emailAddressAuthenticationCodeInfo.length;
        if (i == 0) {
            return 6;
        }
        return i;
    }

    public static C4783d m25587V1(C10930q6 q6Var, long j, TdApi.NotificationTypeNewPushMessage notificationTypeNewPushMessage, boolean z) {
        TdApi.VoiceNote voiceNote;
        String str = null;
        boolean z2 = false;
        switch (notificationTypeNewPushMessage.content.getConstructor()) {
            case TdApi.PushMessageContentBasicGroupChatCreate.CONSTRUCTOR:
                return m25605S1(TdApi.MessageBasicGroupChatCreate.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentChatChangeTitle.CONSTRUCTOR:
                return m25605S1(TdApi.MessageChatChangeTitle.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentChatChangeTitle) notificationTypeNewPushMessage.content).title, 0);
            case TdApi.PushMessageContentMessageForwards.CONSTRUCTOR:
                return new C4783d(C4403w.m27844o2(R.string.xForwards, ((TdApi.PushMessageContentMessageForwards) notificationTypeNewPushMessage.content).totalCount), true);
            case TdApi.PushMessageContentInvoice.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentInvoice) pushMessageContent).isPinned ? m25617Q1(R.string.ActionPinnedNoText, TdApi.MessageInvoice.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0) : m25605S1(TdApi.MessageInvoice.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentInvoice) pushMessageContent).price, 0);
            case TdApi.PushMessageContentLocation.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent2 = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentLocation) pushMessageContent2).isLive ? ((TdApi.PushMessageContentLocation) pushMessageContent2).isPinned ? m25617Q1(R.string.ActionPinnedGeoLive, TdApi.MessageLocation.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0) : m25605S1(TdApi.MessageLocation.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, "live", 0) : ((TdApi.PushMessageContentLocation) pushMessageContent2).isPinned ? m25617Q1(R.string.ActionPinnedGeo, TdApi.MessageLocation.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0) : m25605S1(TdApi.MessageLocation.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentVideoNote.CONSTRUCTOR:
                TdApi.VideoNote videoNote = ((TdApi.PushMessageContentVideoNote) notificationTypeNewPushMessage.content).videoNote;
                if (videoNote != null && videoNote.duration > 0) {
                    str = C4403w.m27865j1(R.string.ChatContentVoiceDuration, C4403w.m27869i1(R.string.ChatContentRoundVideo), C1363c0.m37433h(videoNote.duration));
                    z2 = true;
                }
                return ((TdApi.PushMessageContentVideoNote) notificationTypeNewPushMessage.content).isPinned ? m25611R1(R.string.ActionPinnedRound, TdApi.MessageVideoNote.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z2, 0) : m25599T1(TdApi.MessageVideoNote.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z2, 0);
            case TdApi.PushMessageContentChatChangePhoto.CONSTRUCTOR:
                return m25605S1(TdApi.MessageChatChangePhoto.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentChatAddMembers.CONSTRUCTOR:
                TdApi.PushMessageContentChatAddMembers pushMessageContentChatAddMembers = (TdApi.PushMessageContentChatAddMembers) notificationTypeNewPushMessage.content;
                if (pushMessageContentChatAddMembers.isReturned) {
                    return new C4783d(f16247i, (int) R.string.ChatContentGroupReturn);
                }
                if (pushMessageContentChatAddMembers.isCurrentUser) {
                    return new C4783d(f16247i, (int) R.string.ChatContentGroupAddYou);
                }
                return new C4783d(f16247i, 0, C4403w.m27865j1(R.string.ChatContentGroupAdd, pushMessageContentChatAddMembers.memberName), true);
            case TdApi.PushMessageContentMediaAlbum.CONSTRUCTOR:
                TdApi.PushMessageContentMediaAlbum pushMessageContentMediaAlbum = (TdApi.PushMessageContentMediaAlbum) notificationTypeNewPushMessage.content;
                ?? r1 = pushMessageContentMediaAlbum.hasPhotos;
                boolean z3 = pushMessageContentMediaAlbum.hasVideos;
                int i = r1;
                if (z3) {
                    i = r1 + 1;
                }
                boolean z4 = pushMessageContentMediaAlbum.hasAudios;
                int i2 = i;
                if (z4) {
                    i2 = i + 1;
                }
                boolean z5 = pushMessageContentMediaAlbum.hasDocuments;
                int i3 = i2;
                if (z5) {
                    i3 = i2 + 1;
                }
                if (i3 > 1 || i3 == 0) {
                    return new C4783d(f16263y, 0, C4403w.m27844o2(R.string.xMedia, pushMessageContentMediaAlbum.totalCount), true);
                }
                if (z5) {
                    return new C4783d(f16217B, 0, C4403w.m27844o2(R.string.xFiles, pushMessageContentMediaAlbum.totalCount), true);
                }
                if (z4) {
                    return new C4783d(f16216A, 0, C4403w.m27844o2(R.string.xAudios, pushMessageContentMediaAlbum.totalCount), true);
                }
                if (z3) {
                    return new C4783d(f16218C, 0, C4403w.m27844o2(R.string.xVideos, pushMessageContentMediaAlbum.totalCount), true);
                }
                return new C4783d(f16264z, 0, C4403w.m27844o2(R.string.xPhotos, pushMessageContentMediaAlbum.totalCount), true);
            case TdApi.PushMessageContentGame.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent3 = notificationTypeNewPushMessage.content;
                if (!((TdApi.PushMessageContentGame) pushMessageContent3).isPinned) {
                    return m25605S1(TdApi.MessageGame.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentGame) pushMessageContent3).title, 0);
                }
                String str2 = ((TdApi.PushMessageContentGame) pushMessageContent3).title;
                return m25617Q1(C5070i.m24061i(str2) ? R.string.ActionPinnedGameNoName : R.string.ActionPinnedGame, TdApi.MessageGame.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, C5070i.m24061i(str2) ? null : str2, 0);
            case TdApi.PushMessageContentDocument.CONSTRUCTOR:
                TdApi.Document document = ((TdApi.PushMessageContentDocument) notificationTypeNewPushMessage.content).document;
                if (C5070i.m24061i(null) && document != null) {
                    str = document.fileName;
                }
                return ((TdApi.PushMessageContentDocument) notificationTypeNewPushMessage.content).isPinned ? m25617Q1(R.string.ActionPinnedFile, TdApi.MessageDocument.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, 0) : m25605S1(TdApi.MessageDocument.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, 0);
            case TdApi.PushMessageContentHidden.CONSTRUCTOR:
                if (((TdApi.PushMessageContentHidden) notificationTypeNewPushMessage.content).isPinned) {
                    return m25617Q1(R.string.ActionPinnedNoText, TdApi.MessageText.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
                }
                return new C4783d(C4403w.m27844o2(R.string.xNewMessages, 1L), true);
            case TdApi.PushMessageContentContactRegistered.CONSTRUCTOR:
                return m25605S1(TdApi.MessageContactRegistered.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentPoll.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent4 = notificationTypeNewPushMessage.content;
                if (!((TdApi.PushMessageContentPoll) pushMessageContent4).isPinned) {
                    return m25605S1(TdApi.MessagePoll.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentPoll) pushMessageContent4).question, !((TdApi.PushMessageContentPoll) pushMessageContent4).isRegular ? 1 : 0);
                }
                return m25617Q1(((TdApi.PushMessageContentPoll) pushMessageContent4).isRegular ? R.string.ActionPinnedPoll : R.string.ActionPinnedQuiz, TdApi.MessagePoll.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentPoll) pushMessageContent4).question, !((TdApi.PushMessageContentPoll) pushMessageContent4).isRegular ? 1 : 0);
            case TdApi.PushMessageContentContact.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent5 = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentContact) pushMessageContent5).isPinned ? m25617Q1(R.string.ActionPinnedContact, TdApi.MessageContact.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentContact) pushMessageContent5).name, 0) : m25605S1(TdApi.MessageContact.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentContact) pushMessageContent5).name, 0);
            case TdApi.PushMessageContentVoiceNote.CONSTRUCTOR:
                if (C5070i.m24061i(null) && (voiceNote = ((TdApi.PushMessageContentVoiceNote) notificationTypeNewPushMessage.content).voiceNote) != null && voiceNote.duration > 0) {
                    str = C4403w.m27865j1(R.string.ChatContentVoiceDuration, C4403w.m27869i1(R.string.ChatContentVoice), C1363c0.m37433h(voiceNote.duration));
                    z2 = true;
                }
                return ((TdApi.PushMessageContentVoiceNote) notificationTypeNewPushMessage.content).isPinned ? m25611R1(R.string.ActionPinnedVoice, TdApi.MessageVoiceNote.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z2, 0) : m25599T1(TdApi.MessageVoiceNote.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z2, 0);
            case TdApi.PushMessageContentPhoto.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent6 = notificationTypeNewPushMessage.content;
                String str3 = ((TdApi.PushMessageContentPhoto) pushMessageContent6).caption;
                if (((TdApi.PushMessageContentPhoto) pushMessageContent6).isPinned) {
                    return m25617Q1(R.string.ActionPinnedPhoto, TdApi.MessagePhoto.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str3, 0);
                }
                if (((TdApi.PushMessageContentPhoto) pushMessageContent6).isSecret) {
                    return new C4783d(f16243e, (int) R.string.SelfDestructPhoto, str3, false);
                }
                return m25605S1(TdApi.MessagePhoto.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str3, 0);
            case TdApi.PushMessageContentChatSetTheme.CONSTRUCTOR:
                return m25605S1(TdApi.MessageChatSetTheme.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentChatSetTheme) notificationTypeNewPushMessage.content).themeName, 0);
            case TdApi.PushMessageContentScreenshotTaken.CONSTRUCTOR:
                return m25605S1(TdApi.MessageScreenshotTaken.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentText.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent7 = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentText) pushMessageContent7).isPinned ? m25617Q1(R.string.ActionPinnedNoText, TdApi.MessageText.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentText) pushMessageContent7).text, 0) : m25605S1(TdApi.MessageText.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentText) pushMessageContent7).text, 0);
            case TdApi.PushMessageContentVideo.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent8 = notificationTypeNewPushMessage.content;
                String str4 = ((TdApi.PushMessageContentVideo) pushMessageContent8).caption;
                if (((TdApi.PushMessageContentVideo) pushMessageContent8).isPinned) {
                    return m25617Q1(R.string.ActionPinnedVideo, TdApi.MessageVideo.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str4, 0);
                }
                if (((TdApi.PushMessageContentVideo) pushMessageContent8).isSecret) {
                    return new C4783d(f16244f, (int) R.string.SelfDestructVideo, str4);
                }
                return m25605S1(TdApi.MessageVideo.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str4, 0);
            case TdApi.PushMessageContentAudio.CONSTRUCTOR:
                TdApi.Audio audio = ((TdApi.PushMessageContentAudio) notificationTypeNewPushMessage.content).audio;
                if (C5070i.m24061i(null) && audio != null) {
                    str = C4403w.m27865j1(R.string.ChatContentSong, m25472m2(audio), m25521f2(audio));
                    if (!m25700E2(audio) || !m25707D2(audio)) {
                        z2 = true;
                    }
                }
                return ((TdApi.PushMessageContentAudio) notificationTypeNewPushMessage.content).isPinned ? m25611R1(R.string.ActionPinnedMusic, TdApi.MessageAudio.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z2, 0) : m25599T1(TdApi.MessageAudio.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z2, 0);
            case TdApi.PushMessageContentChatDeleteMember.CONSTRUCTOR:
                TdApi.PushMessageContentChatDeleteMember pushMessageContentChatDeleteMember = (TdApi.PushMessageContentChatDeleteMember) notificationTypeNewPushMessage.content;
                if (pushMessageContentChatDeleteMember.isLeft) {
                    return new C4783d(f16247i, (int) R.string.ChatContentGroupLeft);
                }
                if (pushMessageContentChatDeleteMember.isCurrentUser) {
                    return new C4783d(f16247i, (int) R.string.ChatContentGroupKickYou);
                }
                return new C4783d(f16247i, 0, C4403w.m27865j1(R.string.ChatContentGroupKick, pushMessageContentChatDeleteMember.memberName), true);
            case TdApi.PushMessageContentGameScore.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent9 = notificationTypeNewPushMessage.content;
                if (((TdApi.PushMessageContentGameScore) pushMessageContent9).isPinned) {
                    return m25617Q1(R.string.ActionPinnedNoText, TdApi.MessageGameScore.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
                }
                TdApi.PushMessageContentGameScore pushMessageContentGameScore = (TdApi.PushMessageContentGameScore) pushMessageContent9;
                String str5 = pushMessageContentGameScore.title;
                if (!C5070i.m24061i(str5)) {
                    return new C4783d(f16246h, 0, C4403w.m27840p2(R.string.game_ActionScoredInGame, pushMessageContentGameScore.score, str5), true);
                }
                return new C4783d(f16246h, 0, C4403w.m27844o2(R.string.game_ActionScored, pushMessageContentGameScore.score), true);
            case TdApi.PushMessageContentAnimation.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent10 = notificationTypeNewPushMessage.content;
                String str6 = ((TdApi.PushMessageContentAnimation) pushMessageContent10).caption;
                return ((TdApi.PushMessageContentAnimation) pushMessageContent10).isPinned ? m25617Q1(R.string.ActionPinnedGif, TdApi.MessageAnimation.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str6, 0) : m25605S1(TdApi.MessageAnimation.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str6, 0);
            case TdApi.PushMessageContentSticker.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent11 = notificationTypeNewPushMessage.content;
                if (((TdApi.PushMessageContentSticker) pushMessageContent11).isPinned) {
                    return m25617Q1(R.string.ActionPinnedSticker, TdApi.MessageSticker.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentSticker) pushMessageContent11).emoji, 0);
                }
                if (((TdApi.PushMessageContentSticker) pushMessageContent11).sticker == null || !C7321e.m16976V0(((TdApi.PushMessageContentSticker) pushMessageContent11).sticker.type)) {
                    return m25605S1(TdApi.MessageSticker.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentSticker) notificationTypeNewPushMessage.content).emoji, 0);
                }
                TdApi.MessageSender messageSender = notificationTypeNewPushMessage.senderId;
                String str7 = notificationTypeNewPushMessage.senderName;
                return m25605S1(TdApi.MessageSticker.CONSTRUCTOR, q6Var, j, messageSender, str7, "animated" + ((TdApi.PushMessageContentSticker) notificationTypeNewPushMessage.content).emoji, 0);
            case TdApi.PushMessageContentChatJoinByLink.CONSTRUCTOR:
                return m25605S1(TdApi.MessageChatJoinByLink.CONSTRUCTOR, q6Var, j, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            default:
                throw new AssertionError(notificationTypeNewPushMessage.content);
        }
    }

    public static boolean m25586V2(TdApi.File file) {
        return m25598T2(file) && !m25574X2(file);
    }

    public static void m25585V3(C10930q6.C10936f fVar, C4783d.AbstractC4784a aVar, TdApi.Message message, C10930q6 q6Var, boolean z, C4783d dVar, C10930q6.C10936f fVar2) {
        if (fVar2.f35133a.size() > fVar.f35133a.size()) {
            aVar.mo7828b(message.chatId, message.f25406id, m25730A0(q6Var, message, fVar2, z), dVar);
        } else {
            aVar.mo7829a(message.chatId, message.f25406id, dVar);
        }
    }

    public static TdApi.SearchMessagesFilter m25584V4(Bundle bundle, String str) {
        int i = bundle.getInt(str + "type", 0);
        if (i == 0) {
            return null;
        }
        switch (i) {
            case 1:
                return new TdApi.SearchMessagesFilterAnimation();
            case 2:
                return new TdApi.SearchMessagesFilterAudio();
            case 3:
                return new TdApi.SearchMessagesFilterDocument();
            case 4:
                return new TdApi.SearchMessagesFilterPhoto();
            case 5:
                return new TdApi.SearchMessagesFilterVideo();
            case 6:
                return new TdApi.SearchMessagesFilterVoiceNote();
            case 7:
                return new TdApi.SearchMessagesFilterPhotoAndVideo();
            case 8:
                return new TdApi.SearchMessagesFilterUrl();
            case 9:
                return new TdApi.SearchMessagesFilterChatPhoto();
            case 10:
            case 11:
            default:
                return null;
            case 12:
                return new TdApi.SearchMessagesFilterVideoNote();
            case 13:
                return new TdApi.SearchMessagesFilterVoiceAndVideoNote();
            case 14:
                return new TdApi.SearchMessagesFilterMention();
            case 15:
                return new TdApi.SearchMessagesFilterUnreadMention();
            case 16:
                return new TdApi.SearchMessagesFilterFailedToSend();
            case 17:
                return new TdApi.SearchMessagesFilterPinned();
        }
    }

    public static TdApi.ChatList m25583W(String str) {
        if (C5070i.m24061i(str)) {
            return null;
        }
        str.hashCode();
        if (str.equals("archive")) {
            return new TdApi.ChatListArchive();
        }
        if (str.equals("main")) {
            return new TdApi.ChatListMain();
        }
        if (str.startsWith("filter")) {
            return new TdApi.ChatListFilter(C5070i.m24051s(str.substring(6)));
        }
        return null;
    }

    public static int m25582W0(String str) {
        int[] iArr = f16239a;
        return iArr[C5069h.m24080m(iArr.length, str)];
    }

    public static String m25581W1(String str) {
        if (C5070i.m24061i(str) || str.startsWith("+")) {
            return str;
        }
        return "+" + str;
    }

    public static boolean m25580W2(TdApi.File file) {
        TdApi.RemoteFile remoteFile;
        TdApi.LocalFile localFile;
        return file != null && (((remoteFile = file.remote) != null && remoteFile.isUploadingActive && !m25568Y2(file)) || ((localFile = file.local) != null && localFile.isDownloadingActive && !m25598T2(file)));
    }

    public static void m25579W3(final C10930q6 q6Var, final TdApi.Message message, final C10930q6.C10936f fVar, final boolean z, final C4783d dVar, final C4783d.AbstractC4784a aVar) {
        q6Var.m2253s5(message, false, fVar, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C4779t2.m25585V3(C10930q6.C10936f.this, aVar, message, q6Var, z, dVar, (C10930q6.C10936f) obj);
            }
        });
    }

    public static C7319d m25578W4(Bundle bundle, String str) {
        long j = bundle.getLong(str + "_id");
        if (j == 0) {
            return null;
        }
        long j2 = bundle.getLong(str + "_chatId");
        return new C7319d(j2, j, bundle.getLongArray(str + "_otherIds"));
    }

    public static boolean m25577X(TdApi.ChatPermissions chatPermissions, int i) {
        switch (i) {
            case R.id.right_changeChatInfo:
                return chatPermissions.canChangeInfo;
            case R.id.right_deleteMessages:
            case R.id.right_editMessages:
            case R.id.right_icon:
            case R.id.right_manageVideoChats:
            case R.id.right_remainAnonymous:
            default:
                throw new IllegalArgumentException(C4403w.m27885e1(i));
            case R.id.right_embedLinks:
                return chatPermissions.canAddWebPagePreviews;
            case R.id.right_inviteUsers:
                return chatPermissions.canInviteUsers;
            case R.id.right_pinMessages:
                return chatPermissions.canPinMessages;
            case R.id.right_readMessages:
                return true;
            case R.id.right_sendMedia:
                return chatPermissions.canSendMediaMessages;
            case R.id.right_sendMessages:
                return chatPermissions.canSendMessages;
            case R.id.right_sendPolls:
                return chatPermissions.canSendPolls;
            case R.id.right_sendStickersAndGifs:
                return chatPermissions.canSendOtherMessages;
        }
    }

    public static int m25576X0(String str) {
        int abs = Math.abs(str.hashCode()) % 3;
        return abs != 0 ? abs != 1 ? abs != 2 ? R.id.theme_color_file : R.id.theme_color_fileGreen : R.id.theme_color_fileRed : R.id.theme_color_fileYellow;
    }

    public static TdApi.File m25575X1(TdApi.Chat chat) {
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        if (chatPhotoInfo == null || m25604S2(chatPhotoInfo.small)) {
            return null;
        }
        return chat.photo.small;
    }

    public static boolean m25574X2(TdApi.File file) {
        if (!m25598T2(file)) {
            return false;
        }
        File file2 = new File(file.local.path);
        if (!file2.exists()) {
            return true;
        }
        long length = file2.length();
        return length < ((long) file.local.downloadedSize) && length > 0;
    }

    public static void m25573X3(C4783d.AbstractC4784a aVar, long j, TdApi.Message message, C10930q6 q6Var, boolean z, boolean z2, C4783d dVar, TdApi.Message message2) {
        if (message2 != null) {
            aVar.mo7828b(j, message.f25406id, new C4783d(f16262x, m25543c1(q6Var, j, message2, z, z2)), dVar);
        } else {
            aVar.mo7829a(j, message.f25406id, dVar);
        }
    }

    public static TdApi.MessageSender m25572X4(Bundle bundle, String str) {
        long j = bundle.getLong(str + "chat_id");
        if (j != 0) {
            return new TdApi.MessageSenderChat(j);
        }
        long j2 = bundle.getLong(str + "user_id");
        if (j2 != 0) {
            return new TdApi.MessageSenderUser(j2);
        }
        return null;
    }

    public static AbstractC5411l0[] m25571Y(AbstractC9323v4<?> v4Var, C10930q6 q6Var, CharSequence charSequence, boolean z, HandlerC10770jj.C10788q qVar) {
        ArrayList arrayList;
        if (C5070i.m24061i(charSequence)) {
            return null;
        }
        AbstractC5411l0[] E = AbstractC5411l0.m22790E(q6Var, charSequence.toString(), m25392x5(charSequence, z), qVar);
        if (E == null || E.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(E.length);
            arrayList.addAll(Arrays.asList(E));
        }
        if (arrayList == null) {
            return null;
        }
        AbstractC5411l0[] l0VarArr = (AbstractC5411l0[]) arrayList.toArray(new AbstractC5411l0[0]);
        Arrays.sort(l0VarArr, C4622e2.f15342a);
        return l0VarArr;
    }

    public static int m25570Y0(long j, long j2) {
        String str;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i >= 0 && j2 < f16239a.length) {
            return (int) j2;
        }
        try {
            if (i < 0 || j == 0) {
                str = String.format(Locale.US, "%d", Long.valueOf(j2));
            } else {
                str = String.format(Locale.US, "%d%d", Long.valueOf(j2), Long.valueOf(j));
            }
            if (str.length() > 15) {
                str = str.substring(0, 15);
            }
            int i2 = MessageDigest.getInstance("MD5").digest(str.getBytes(C5070i.f17083a))[(int) Math.abs(j2 % 16)];
            if (i2 < 0) {
                i2 += Log.TAG_CRASH;
            }
            return Math.abs(i2) % f16239a.length;
        } catch (Throwable th) {
            Log.m14725e("Cannot calculate user color", th, new Object[0]);
            return (int) Math.abs(j2 % f16239a.length);
        }
    }

    public static String m25569Y1(C10930q6 q6Var, int i, C10862n1 n1Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        int m = n1Var.m2982m();
        int k = n1Var.m2984k(q6Var);
        int o = n1Var.m2980o(q6Var);
        switch (i) {
            case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                i3 = R.string.PrivacyAllowFindingContactsExcept;
                i2 = R.string.PrivacyAllowFindingContacts;
                i5 = R.string.PrivacyAllowFindingEverybodyExcept;
                i4 = R.string.PrivacyAllowFindingEverybody;
                i7 = R.string.PrivacyAllowFindingContactsExcept;
                i6 = R.string.PrivacyAllowFindingContacts;
                break;
            case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                i3 = R.string.PrivacyCallsNobodyExcept;
                i2 = R.string.PrivacyCallsNobody;
                i7 = R.string.PrivacyCallsContactsExcept;
                i6 = R.string.PrivacyCallsContacts;
                i5 = R.string.PrivacyCallsEverybodyExcept;
                i4 = R.string.PrivacyCallsEverybody;
                break;
            case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                i3 = R.string.PrivacyShowNumberNobodyExcept;
                i2 = R.string.PrivacyShowNumberNobody;
                i7 = R.string.PrivacyShowNumberContactsExcept;
                i6 = R.string.PrivacyShowNumberContacts;
                i5 = R.string.PrivacyShowNumberEverybodyExcept;
                i4 = R.string.PrivacyShowNumberEverybody;
                break;
            case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                i3 = R.string.PrivacyP2PNobodyExcept;
                i2 = R.string.PrivacyP2PNobody;
                i7 = R.string.PrivacyP2PContactsExcept;
                i6 = R.string.PrivacyP2PContacts;
                i5 = R.string.PrivacyP2PEverybodyExcept;
                i4 = R.string.PrivacyP2PEverybody;
                break;
            case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                i3 = R.string.PrivacyForwardLinkNobodyExcept;
                i2 = R.string.PrivacyForwardLinkNobody;
                i7 = R.string.PrivacyForwardLinkContactsExcept;
                i6 = R.string.PrivacyForwardLinkContacts;
                i5 = R.string.PrivacyForwardLinkEverybodyExcept;
                i4 = R.string.PrivacyForwardLinkEverybody;
                break;
            case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                i3 = R.string.PrivacyAddToGroupsNobodyExcept;
                i2 = R.string.PrivacyAddToGroupsNobody;
                i7 = R.string.PrivacyAddToGroupsContactsExcept;
                i6 = R.string.PrivacyAddToGroupsContacts;
                i5 = R.string.PrivacyAddToGroupsEverybodyExcept;
                i4 = R.string.PrivacyAddToGroupsEverybody;
                break;
            case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                i3 = R.string.PrivacyPhotoNobodyExcept;
                i2 = R.string.PrivacyPhotoNobody;
                i7 = R.string.PrivacyPhotoContactsExcept;
                i6 = R.string.PrivacyPhotoContacts;
                i5 = R.string.PrivacyPhotoEverybodyExcept;
                i4 = R.string.PrivacyPhotoEverybody;
                break;
            case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                i3 = R.string.PrivacyLastSeenNobodyExcept;
                i2 = R.string.PrivacyLastSeenNobody;
                i7 = R.string.PrivacyLastSeenContactsExcept;
                i6 = R.string.PrivacyLastSeenContacts;
                i5 = R.string.PrivacyLastSeenEverybodyExcept;
                i4 = R.string.PrivacyLastSeenEverybody;
                break;
            default:
                throw new IllegalArgumentException("privacyKey == " + i);
        }
        if (m != 0) {
            if (m == 1) {
                i3 = i7;
                i2 = i6;
            } else if (m == 2) {
                i3 = i5;
                i2 = i4;
            } else {
                throw new IllegalArgumentException("ruleType == " + m);
            }
        }
        if (o > 0 && k > 0) {
            str = C4403w.m27865j1(R.string.format_minusPlus, Integer.valueOf(k), Integer.valueOf(o));
        } else if (k > 0) {
            str = C4403w.m27865j1(R.string.format_minus, Integer.valueOf(k));
        } else {
            str = o > 0 ? C4403w.m27865j1(R.string.format_plus, Integer.valueOf(o)) : null;
        }
        if (str == null) {
            return C4403w.m27869i1(i2);
        }
        if (i3 != 0) {
            return C4403w.m27865j1(i3, str);
        }
        return C4403w.m27869i1(i2) + " " + str;
    }

    public static boolean m25568Y2(TdApi.File file) {
        TdApi.RemoteFile remoteFile;
        return (file == null || (remoteFile = file.remote) == null || !remoteFile.isUploadingCompleted) ? false : true;
    }

    public static void m25567Y3(final C10930q6 q6Var, final long j, long j2, final TdApi.Message message, final boolean z, final boolean z2, final C4783d dVar, final C4783d.AbstractC4784a aVar) {
        q6Var.m2865F5(j, j2, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C4779t2.m25573X3(C4779t2.C4783d.AbstractC4784a.this, j, message, q6Var, z, z2, dVar, (TdApi.Message) obj);
            }
        });
    }

    public static void m25566Y4(C4786e eVar) {
        int constructor = eVar.m25363f().getConstructor();
        if (constructor == -1718914651) {
            C7389v0.m16706N(eVar.m25362g(), 0);
        } else if (constructor == -290816582) {
            C7389v0.m16706N(eVar.m25362g(), 2);
        } else if (constructor != 1430816539) {
            m25532d5(eVar);
        } else {
            C7389v0.m16706N(eVar.m25362g(), 1);
        }
    }

    public static boolean m25565Z(TdApi.Poll poll, TdApi.Poll poll2) {
        if (poll.options.length != poll2.options.length || !C5070i.m24067c(poll.question, poll2.question)) {
            return false;
        }
        int i = 0;
        for (TdApi.PollOption pollOption : poll.options) {
            if (!C5070i.m24067c(pollOption.text, poll2.options[i].text)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int m25564Z0(TdApi.InputMessageContent inputMessageContent) {
        if (inputMessageContent == null) {
            return 0;
        }
        switch (inputMessageContent.getConstructor()) {
            case TdApi.InputMessageVideo.CONSTRUCTOR:
                return ((TdApi.InputMessageVideo) inputMessageContent).ttl == 0 ? 1 : 0;
            case TdApi.InputMessageAudio.CONSTRUCTOR:
                return 2;
            case TdApi.InputMessageAnimation.CONSTRUCTOR:
                return 1;
            case TdApi.InputMessageDocument.CONSTRUCTOR:
                return 3;
            case TdApi.InputMessagePhoto.CONSTRUCTOR:
                return ((TdApi.InputMessagePhoto) inputMessageContent).ttl == 0 ? 1 : 0;
            default:
                return 0;
        }
    }

    public static int m25563Z1(TdApi.ChatAction chatAction) {
        switch (chatAction.getConstructor()) {
            case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
                return ((TdApi.ChatActionUploadingVoiceNote) chatAction).progress;
            case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
                return ((TdApi.ChatActionUploadingDocument) chatAction).progress;
            case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
                return ((TdApi.ChatActionUploadingPhoto) chatAction).progress;
            case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
                return ((TdApi.ChatActionUploadingVideoNote) chatAction).progress;
            case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
                return ((TdApi.ChatActionUploadingVideo) chatAction).progress;
            default:
                return -1;
        }
    }

    public static boolean m25562Z2(TdApi.Call call) {
        int constructor;
        return call == null || (constructor = call.state.getConstructor()) == -2133790038 || constructor == -975215467 || constructor == -190853167;
    }

    public static void m25561Z3(C4783d.AbstractC4784a aVar, TdApi.Message message, TdApi.MessageGameScore messageGameScore, C4783d dVar, TdApi.Message message2) {
        if (message2 != null && message2.content.getConstructor() == -69441162) {
            String w1 = m25403w1(((TdApi.MessageGame) message2.content).game, false);
            if (!C5070i.m24061i(w1)) {
                aVar.mo7828b(message.chatId, message.f25406id, new C4783d(f16246h, 0, C4403w.m27840p2(message.isOutgoing ? R.string.game_ActionYouScoredInGame : R.string.game_ActionScoredInGame, messageGameScore.score, w1), true), dVar);
                return;
            }
        }
        aVar.mo7829a(message.chatId, message.f25406id, dVar);
    }

    public static void m25560Z4(final List<C4786e> list) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
            if (E != null) {
                if (E.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    E.m14575J2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new AbstractC5096a() {
                        @Override
                        public final void mo4252o1(int i, boolean z) {
                            C4779t2.m25519f4(list, i, z);
                        }
                    });
                    return;
                }
            } else {
                return;
            }
        }
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                C4779t2.m25512g4(list);
            }
        });
    }

    public static int m25558a0(TdApi.WebPage webPage) {
        if (webPage == null) {
            return TdApi.MessageText.CONSTRUCTOR;
        }
        return webPage.sticker != null ? TdApi.MessageSticker.CONSTRUCTOR : webPage.video != null ? TdApi.MessageVideo.CONSTRUCTOR : webPage.animation != null ? TdApi.MessageAnimation.CONSTRUCTOR : webPage.audio != null ? TdApi.MessageAudio.CONSTRUCTOR : webPage.document != null ? TdApi.MessageDocument.CONSTRUCTOR : webPage.photo != null ? TdApi.MessagePhoto.CONSTRUCTOR : TdApi.MessageText.CONSTRUCTOR;
    }

    public static int m25557a1(TdApi.Message message) {
        if (message == null || m25713C3(message)) {
            return 0;
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
            case TdApi.MessageAnimation.CONSTRUCTOR:
            case TdApi.MessageVideo.CONSTRUCTOR:
                return 1;
            case TdApi.MessageAudio.CONSTRUCTOR:
                return 2;
            case TdApi.MessageDocument.CONSTRUCTOR:
                return 3;
            default:
                return 0;
        }
    }

    public static String m25556a2(TdApi.User user, int i) {
        if (i == -160019714) {
            return C4403w.m27869i1(R.string.ChannelOwner);
        }
        if (i == 82243562) {
            return C4403w.m27869i1(R.string.Administrator);
        }
        if (i != 844723285 || user == null || user.type.getConstructor() != 1262387765) {
            return null;
        }
        return C4403w.m27869i1(((TdApi.UserTypeBot) user.type).canReadAllGroupMessages ? R.string.BotStatusRead : R.string.BotStatusCantRead);
    }

    public static boolean m25555a3(TdApi.User user) {
        return user != null && user.type.getConstructor() == -598644325;
    }

    public static void m25554a4(C10930q6 q6Var, final TdApi.Message message, final TdApi.MessageGameScore messageGameScore, final C4783d dVar, final C4783d.AbstractC4784a aVar) {
        q6Var.m2865F5(message.chatId, messageGameScore.gameMessageId, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C4779t2.m25561Z3(C4779t2.C4783d.AbstractC4784a.this, message, messageGameScore, dVar, (TdApi.Message) obj);
            }
        });
    }

    public static void m25553a5(Bundle bundle, String str, TdApi.SearchMessagesFilter searchMessagesFilter) {
        int i;
        if (searchMessagesFilter != null) {
            switch (searchMessagesFilter.getConstructor()) {
                case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                    i = 8;
                    break;
                case TdApi.SearchMessagesFilterChatPhoto.CONSTRUCTOR:
                    i = 9;
                    break;
                case TdApi.SearchMessagesFilterFailedToSend.CONSTRUCTOR:
                    i = 16;
                    break;
                case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                    i = 1;
                    break;
                case TdApi.SearchMessagesFilterUnreadMention.CONSTRUCTOR:
                    i = 15;
                    break;
                case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                    i = 5;
                    break;
                case TdApi.SearchMessagesFilterPinned.CONSTRUCTOR:
                    i = 17;
                    break;
                case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                    i = 12;
                    break;
                case TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR:
                    i = 13;
                    break;
                case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                    i = 2;
                    break;
                case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                    i = 4;
                    break;
                case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                    i = 7;
                    break;
                case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                    i = 3;
                    break;
                case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                    i = 6;
                    break;
                case TdApi.SearchMessagesFilterMention.CONSTRUCTOR:
                    i = 14;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                bundle.putInt(str + "type", i);
            }
        }
    }

    public static TdApi.Photo m25551b0(TdApi.Sticker sticker) {
        TdApi.PhotoSize M5 = m25641M5(sticker.thumbnail);
        TdApi.PhotoSize[] photoSizeArr = new TdApi.PhotoSize[M5 != null ? 2 : 1];
        if (M5 != null) {
            photoSizeArr[0] = M5;
            photoSizeArr[1] = new TdApi.PhotoSize("w", sticker.sticker, sticker.width, sticker.height, null);
        } else {
            photoSizeArr[0] = new TdApi.PhotoSize("w", sticker.sticker, sticker.width, sticker.height, null);
        }
        return new TdApi.Photo(false, null, photoSizeArr);
    }

    public static C4783d m25550b1(int i, C10930q6 q6Var, long j, TdApi.MessageSender messageSender, String str, boolean z, boolean z2, TdApi.FormattedText formattedText, boolean z3, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = R.string.ChatContentGroupCreate_outgoing;
        String str2 = null;
        C4787f fVar = null;
        C4787f fVar2 = null;
        boolean z4 = true;
        switch (i) {
            case TdApi.MessageInvoice.CONSTRUCTOR:
                C4787f fVar3 = f16259u;
                if (!C7321e.m16965a1(formattedText)) {
                    str2 = C4403w.m27865j1(R.string.InvoiceFor, C7321e.m16980T0(formattedText));
                }
                return new C4783d(fVar3, (int) R.string.Invoice, str2, true);
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return new C4783d(f16240b, (int) R.string.ChatContentPhoto, formattedText, z3);
            case TdApi.MessageChatSetTheme.CONSTRUCTOR:
                if (z) {
                    return new C4783d(f16248j, 0, m25725A5(C4403w.m27853m1(R.string.ChatContentThemeSet_outgoing, formattedText.text), true));
                }
                return new C4783d(f16248j, 0, m25725A5(C4403w.m27853m1(R.string.ChatContentThemeSet, formattedText.text), true));
            case TdApi.MessageScreenshotTaken.CONSTRUCTOR:
                if (z) {
                    return new C4783d(f16261w, (int) R.string.YouTookAScreenshot);
                }
                if (z2) {
                    return new C4783d(f16261w, (int) R.string.ChatContentScreenshot);
                }
                return new C4783d(f16261w, 0, C4403w.m27865j1(R.string.XTookAScreenshot, m25535d2(q6Var, messageSender, str)), true);
            case TdApi.MessageContactRegistered.CONSTRUCTOR:
                return new C4783d(f16260v, 0, C4403w.m27865j1(R.string.NotificationContactJoined, m25535d2(q6Var, messageSender, str)), true);
            case TdApi.MessageExpiredPhoto.CONSTRUCTOR:
                return new C4783d(f16243e, (int) R.string.AttachPhotoExpired);
            case TdApi.MessageExpiredVideo.CONSTRUCTOR:
                return new C4783d(f16244f, (int) R.string.AttachVideoExpired);
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                if (q6Var.m2784K6(j)) {
                    return new C4783d(f16240b, (int) R.string.ActionChannelChangedPhoto);
                }
                return new C4783d(f16240b, z ? R.string.ChatContentGroupPhoto_outgoing : R.string.ChatContentGroupPhoto);
            case TdApi.MessagePoll.CONSTRUCTOR:
                if (i2 == 1) {
                    return new C4783d(f16255q, (int) R.string.Quiz, formattedText, z3);
                }
                return new C4783d(f16254p, (int) R.string.Poll, formattedText, z3);
            case TdApi.MessageContact.CONSTRUCTOR:
                return new C4783d(f16253o, (int) R.string.AttachContact, formattedText, z3);
            case TdApi.MessageSupergroupChatCreate.CONSTRUCTOR:
                if (q6Var.m2784K6(j)) {
                    return new C4783d(f16250l, (int) R.string.ActionCreateChannel);
                }
                C4787f fVar4 = f16247i;
                if (!z) {
                    i10 = R.string.ChatContentGroupCreate;
                }
                return new C4783d(fVar4, i10);
            case TdApi.MessageChatDeletePhoto.CONSTRUCTOR:
                if (q6Var.m2784K6(j)) {
                    return new C4783d(f16250l, (int) R.string.ActionChannelRemovedPhoto);
                }
                return new C4783d(f16247i, z ? R.string.ChatContentGroupPhotoRemove_outgoing : R.string.ChatContentGroupPhotoRemove);
            case TdApi.MessageGame.CONSTRUCTOR:
                return new C4783d(f16246h, 0, C4403w.m27865j1(C7316a.m17053h(j) ? z ? R.string.NotificationGame_group_outgoing : R.string.NotificationGame_group : z ? R.string.NotificationGame_outgoing : R.string.NotificationGame, C7321e.m16980T0(formattedText)), true);
            case TdApi.MessageAudio.CONSTRUCTOR:
                return new C4783d(f16252n, 0, formattedText, z3);
            case TdApi.MessageLocation.CONSTRUCTOR:
                return new C4783d(f16258t, "live".equals(C7321e.m16980T0(formattedText)) ? R.string.AttachLiveLocation : R.string.Location);
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                return new C4783d(f16256r, (int) R.string.ChatContentVoice, formattedText, z3);
            case TdApi.MessageCall.CONSTRUCTOR:
                if (i2 != -2) {
                    int i11 = R.string.OutgoingCall;
                    if (i2 == -1) {
                        C4787f fVar5 = f16234S;
                        if (!z) {
                            i11 = R.string.CallMessageIncomingDeclined;
                        }
                        return new C4783d(fVar5, i11);
                    } else if (i2 > 0) {
                        C4787f fVar6 = f16229N;
                        Object[] objArr = new Object[2];
                        if (!z) {
                            i11 = R.string.IncomingCall;
                        }
                        objArr[0] = C4403w.m27869i1(i11);
                        objArr[1] = C4403w.m27810x0(i2);
                        return new C4783d(fVar6, 0, C4403w.m27865j1(R.string.ChatContentCallWithDuration, objArr), true);
                    } else {
                        C4787f fVar7 = f16229N;
                        if (!z) {
                            i11 = R.string.IncomingCall;
                        }
                        return new C4783d(fVar7, i11);
                    }
                } else {
                    return new C4783d(f16233R, z ? R.string.CallMessageOutgoingMissed : R.string.MissedCall);
                }
            case TdApi.MessageDocument.CONSTRUCTOR:
                return new C4783d(f16251m, (int) R.string.ChatContentFile, formattedText, z3);
            case TdApi.MessageChatChangeTitle.CONSTRUCTOR:
                if (q6Var.m2784K6(j)) {
                    return new C4783d(f16250l, 0, C4403w.m27865j1(R.string.ActionChannelChangedTitleTo, C7321e.m16980T0(formattedText)), true);
                }
                return new C4783d(f16247i, 0, C4403w.m27865j1(z ? R.string.ChatContentGroupName_outgoing : R.string.ChatContentGroupName, C7321e.m16980T0(formattedText)), true);
            case TdApi.MessageBasicGroupChatCreate.CONSTRUCTOR:
                C4787f fVar8 = f16247i;
                if (!z) {
                    i10 = R.string.ChatContentGroupCreate;
                }
                return new C4783d(fVar8, i10);
            case TdApi.MessageAnimatedEmoji.CONSTRUCTOR:
                return new C4783d((C4787f) null, (int) R.string.YouHaveNewMessage, formattedText, z3);
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return new C4783d(f16242d, (int) R.string.ChatContentRoundVideo, formattedText, z3);
            case TdApi.MessageDice.CONSTRUCTOR:
                String str3 = (C7321e.m16965a1(formattedText) || !q6Var.m2643T6(formattedText.text)) ? f16222G.f16283a : formattedText.text;
                C4787f fVar9 = f16221F;
                if (fVar9.f16283a.equals(str3)) {
                    return new C4783d(fVar9, m25536d1(i2));
                }
                C4787f fVar10 = f16222G;
                if (!fVar10.f16283a.equals(str3)) {
                    return new C4783d(new C4787f(str3, 0), 0);
                }
                if (i2 >= 1 && i2 <= 6) {
                    switch (i2) {
                        case 1:
                            return new C4783d(f16223H, 0, C4403w.m27844o2(R.string.ChatContentDiceRolled, i2), true);
                        case 2:
                            return new C4783d(f16224I, 0, C4403w.m27844o2(R.string.ChatContentDiceRolled, i2), true);
                        case 3:
                            return new C4783d(f16225J, 0, C4403w.m27844o2(R.string.ChatContentDiceRolled, i2), true);
                        case 4:
                            return new C4783d(f16226K, 0, C4403w.m27844o2(R.string.ChatContentDiceRolled, i2), true);
                        case 5:
                            return new C4783d(f16227L, 0, C4403w.m27844o2(R.string.ChatContentDiceRolled, i2), true);
                        case 6:
                            return new C4783d(f16228M, 0, C4403w.m27844o2(R.string.ChatContentDiceRolled, i2), true);
                    }
                }
                return new C4783d(fVar10, (int) R.string.ChatContentDice);
            case TdApi.MessageChatJoinByRequest.CONSTRUCTOR:
            case TdApi.MessageChatJoinByLink.CONSTRUCTOR:
                return new C4783d(f16247i, z ? R.string.ChatContentGroupJoin_outgoing : R.string.ChatContentGroupJoin);
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return new C4783d(f16257s, (int) R.string.ChatContentAnimation, formattedText, z3);
            case TdApi.MessageSticker.CONSTRUCTOR:
                String T0 = C7321e.m16980T0(formattedText);
                if (T0 == null || !T0.startsWith("animated")) {
                    z4 = false;
                } else {
                    T0 = T0.substring(8);
                }
                if (!C5070i.m24061i(T0)) {
                    fVar2 = new C4787f(T0, 0);
                }
                return new C4783d(fVar2, (!z4 || z2) ? R.string.Sticker : R.string.AnimatedSticker);
            case TdApi.MessageChatSetTtl.CONSTRUCTOR:
                if (i2 > 0) {
                    if (C7316a.m17049l(j)) {
                        i9 = R.string.ChatContentTtlSeconds;
                        i8 = R.string.ChatContentTtlMinutes;
                        i7 = R.string.ChatContentTtlHours;
                        i6 = R.string.ChatContentTtlDays;
                        i5 = R.string.ChatContentTtlWeeks;
                        i4 = R.string.ChatContentTtlMonths;
                    } else if (q6Var.m2784K6(j)) {
                        i9 = R.string.ChatContentChannelTtlSeconds;
                        i8 = R.string.ChatContentChannelTtlMinutes;
                        i7 = R.string.ChatContentChannelTtlHours;
                        i6 = R.string.ChatContentChannelTtlDays;
                        i5 = R.string.ChatContentChannelTtlWeeks;
                        i4 = R.string.ChatContentChannelTtlMonths;
                    } else {
                        i9 = R.string.ChatContentGroupTtlSeconds;
                        i8 = R.string.ChatContentGroupTtlMinutes;
                        i7 = R.string.ChatContentGroupTtlHours;
                        i6 = R.string.ChatContentGroupTtlDays;
                        i5 = R.string.ChatContentGroupTtlWeeks;
                        i4 = R.string.ChatContentGroupTtlMonths;
                    }
                    return new C4783d(f16230O, 0, m25725A5(C4403w.m27820u2(i2, TimeUnit.SECONDS, i9, i8, i7, i6, i5, i4, new Object[0]), false), true);
                }
                if (C7316a.m17049l(j)) {
                    i3 = R.string.ChatContentTtlOff;
                } else {
                    i3 = q6Var.m2784K6(j) ? R.string.ChatContentChannelTtlOff : R.string.ChatContentGroupTtlOff;
                }
                return new C4783d(f16231P, i3);
            case TdApi.MessageText.CONSTRUCTOR:
                if (i2 == 1) {
                    fVar = f16245g;
                }
                return new C4783d(fVar, (int) R.string.YouHaveNewMessage, formattedText, z3);
            case TdApi.MessageVideo.CONSTRUCTOR:
                return new C4783d(f16241c, (int) R.string.ChatContentVideo, formattedText, z3);
            default:
                return null;
        }
    }

    public static int m25549b2(TdApi.Chat chat) {
        if (chat == null || chat.type.getConstructor() != 862366513) {
            return 0;
        }
        return ((TdApi.ChatTypeSecret) chat.type).secretChatId;
    }

    public static boolean m25548b3(int i, int i2) {
        if (i2 == 12 || i2 == 29 || i2 == 30) {
            return false;
        }
        switch (i2) {
            case 20:
            case 21:
            case 22:
            case 23:
            case C3563j.f11955K3:
                return false;
            default:
                return true;
        }
    }

    public static void m25547b4(C4783d.AbstractC4784a aVar, TdApi.Message message, C4783d dVar, C10930q6 q6Var, boolean z, C10930q6.C10936f fVar) {
        if (fVar.f35133a.size() != 1 || fVar.m2131a()) {
            C4783d A0 = m25730A0(q6Var, message, fVar, z);
            if (fVar.f35133a.size() != 1) {
                aVar.mo7828b(message.chatId, message.f25406id, A0, dVar);
            } else if (A0.m25373e()) {
                A0.m25371g(aVar);
            } else {
                aVar.mo7829a(message.chatId, message.f25406id, dVar);
            }
        } else {
            aVar.mo7829a(message.chatId, message.f25406id, dVar);
        }
    }

    public static void m25546b5(Bundle bundle, String str, C7319d dVar) {
        if (dVar != null) {
            bundle.putLong(str + "_chatId", dVar.m17027c());
            bundle.putLong(str + "_id", dVar.m17026d());
            bundle.putLongArray(str + "_otherIds", dVar.m17025e());
        }
    }

    public static TdApi.InputFileGenerated m25544c0(TdApi.File file) {
        String str = file.local.path;
        return new TdApi.InputFileGenerated(str, "copy" + AbstractC5333b.m23223h(), file.size);
    }

    public static gd.C4779t2.C4783d m25543c1(final p350yd.C10930q6 r17, final long r18, final org.drinkless.p210td.libcore.telegram.TdApi.Message r20, final boolean r21, final boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4779t2.m25543c1(yd.q6, long, org.drinkless.td.libcore.telegram.TdApi$Message, boolean, boolean):gd.t2$d");
    }

    public static TdApi.MessageSender m25542c2(TdApi.Message[] messageArr) {
        if (messageArr == null || messageArr.length <= 0) {
            return null;
        }
        TdApi.MessageSender messageSender = messageArr[0].senderId;
        for (TdApi.Message message : messageArr) {
            if (!C7321e.m16975W(messageSender, message.senderId)) {
                return null;
            }
        }
        return messageSender;
    }

    public static boolean m25541c3(TdApi.Message message) {
        if (message == null) {
            return false;
        }
        int constructor = message.content.getConstructor();
        if (constructor == 1989037971) {
            constructor = m25558a0(((TdApi.MessageText) message.content).webPage);
        }
        switch (constructor) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
            case TdApi.MessageAudio.CONSTRUCTOR:
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
            case TdApi.MessageDocument.CONSTRUCTOR:
            case TdApi.MessageVideoNote.CONSTRUCTOR:
            case TdApi.MessageAnimation.CONSTRUCTOR:
            case TdApi.MessageVideo.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public static void m25540c4(final C10930q6 q6Var, final TdApi.Message message, final boolean z, final C4783d dVar, final C4783d.AbstractC4784a aVar) {
        q6Var.m2253s5(message, true, null, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C4779t2.m25547b4(C4779t2.C4783d.AbstractC4784a.this, message, dVar, q6Var, z, (C10930q6.C10936f) obj);
            }
        });
    }

    public static void m25539c5(Bundle bundle, String str, TdApi.MessageSender messageSender) {
        if (messageSender != null) {
            int constructor = messageSender.getConstructor();
            if (constructor == -336109341) {
                bundle.putLong(str + "user_id", ((TdApi.MessageSenderUser) messageSender).userId);
            } else if (constructor == -239660751) {
                bundle.putLong(str + "chat_id", ((TdApi.MessageSenderChat) messageSender).chatId);
            } else {
                throw new RuntimeException(messageSender.toString());
            }
        }
    }

    public static TdApi.InputFile m25537d0(String str) {
        return m25523f0(str, null, null);
    }

    public static int m25536d1(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? R.string.ChatContentDart5 : R.string.ChatContentDart6 : R.string.ChatContentDart4 : R.string.ChatContentDart3 : R.string.ChatContentDart2 : R.string.ChatContentDart1 : R.string.ChatContentDart;
    }

    public static String m25535d2(C10930q6 q6Var, TdApi.MessageSender messageSender, String str) {
        return C5070i.m24061i(str) ? q6Var.m2135zb(messageSender, true) : str;
    }

    public static boolean m25534d3(TdApi.ChatMemberStatus chatMemberStatus) {
        return chatMemberStatus != null && chatMemberStatus.getConstructor() == -1653518666;
    }

    public static Object m25533d4(AbstractC10664f9 f9Var, long j, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27872h2(f9Var, j);
        }
        return null;
    }

    public static void m25532d5(final C4786e eVar) {
        if (eVar != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
                if (E != null) {
                    if (E.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        E.m14575J2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new AbstractC5096a() {
                            @Override
                            public final void mo4252o1(int i, boolean z) {
                                C4779t2.m25491j4(C4779t2.C4786e.this, i, z);
                            }
                        });
                        return;
                    }
                } else {
                    return;
                }
            }
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    C4779t2.m25484k4(C4779t2.C4786e.this);
                }
            });
        }
    }

    public static TdApi.InputFile m25530e0(String str, String str2) {
        return m25523f0(str, str2, null);
    }

    public static C4786e m25529e1(C4666i7 i7Var) {
        TdApi.Document document;
        TdApi.VoiceNote voiceNote;
        TdApi.Audio audio;
        if (i7Var == null) {
            return null;
        }
        TdApi.WebPage J = i7Var.m26583J();
        C4707n y = i7Var.m26531y();
        if (y != null) {
            if (y.m26413Q() && (audio = J.audio) != null) {
                return C4786e.m25360i(audio);
            }
            if (y.m26411S() && (voiceNote = J.voiceNote) != null) {
                return C4786e.m25357l(voiceNote);
            }
            if (y.m26412R() && (document = J.document) != null) {
                return C4786e.m25359j(document);
            }
        }
        C4630f0 G = i7Var.m26586G();
        boolean z = false;
        if (G != null) {
            if (G.m26762U()) {
                return C4786e.m25361h(G.m26718v());
            }
            if (G.m26757Z()) {
                return C4786e.m25358k(G.m26764S());
            }
            if (G.m26759X()) {
                TdApi.File P = G.m26767P();
                if (J.sticker != null) {
                    z = true;
                }
                return C4786e.m25356m(P, z);
            }
        }
        int I = i7Var.m26584I();
        if (I == 1) {
            TdApi.Video video = J.video;
            if (video != null) {
                return C4786e.m25358k(video);
            }
        } else if (I == 18) {
            TdApi.Document document2 = J.document;
            if (document2 != null) {
                return C4786e.m25359j(document2);
            }
            return null;
        } else if (I == 3) {
            TdApi.Animation animation = J.animation;
            if (animation != null) {
                return C4786e.m25361h(animation);
            }
            return null;
        } else if (I == 4) {
            if (J.photo != null) {
                return C4786e.m25356m(i7Var.m26585H(), false);
            }
            if (J.sticker != null) {
                return C4786e.m25356m(i7Var.m26585H(), true);
            }
        }
        return null;
    }

    public static String m25528e2(String str) {
        return "https://" + m25514g2() + "/addstickers/" + str;
    }

    public static boolean m25527e3(Uri uri) {
        String host = uri.getHost();
        if (host != null) {
            for (String str : C7322f.f23232c) {
                if (C5070i.m24067c(str, host)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object m25526e4(AbstractC10664f9 f9Var, long j, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27872h2(f9Var, j);
        }
        return null;
    }

    public static void m25525e5(final File file, final String str) {
        if (file != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
                if (E != null) {
                    if (E.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        E.m14575J2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new AbstractC5096a() {
                            @Override
                            public final void mo4252o1(int i, boolean z) {
                                C4779t2.m25505h4(file, str, i, z);
                            }
                        });
                        return;
                    }
                } else {
                    return;
                }
            }
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    C4779t2.m25511g5(file, str);
                }
            });
        }
    }

    public static org.drinkless.p210td.libcore.telegram.TdApi.InputFile m25523f0(java.lang.String r17, java.lang.String r18, gd.C4779t2.C4788g r19) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4779t2.m25523f0(java.lang.String, java.lang.String, gd.t2$g):org.drinkless.td.libcore.telegram.TdApi$InputFile");
    }

    public static C4786e m25522f1(TdApi.Message message) {
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                TdApi.PhotoSize n = C4630f0.m26734n(((TdApi.MessagePhoto) message.content).photo);
                if (n == null || !m25598T2(n.photo)) {
                    return null;
                }
                return C4786e.m25356m(n.photo, false);
            case TdApi.MessageAudio.CONSTRUCTOR:
                TdApi.Audio audio = ((TdApi.MessageAudio) message.content).audio;
                if (audio == null || !m25598T2(audio.audio)) {
                    return null;
                }
                return C4786e.m25360i(audio);
            case TdApi.MessageDocument.CONSTRUCTOR:
                TdApi.Document document = ((TdApi.MessageDocument) message.content).document;
                if (document == null || !m25598T2(document.document)) {
                    return null;
                }
                return C4786e.m25359j(document);
            case TdApi.MessageAnimation.CONSTRUCTOR:
                TdApi.Animation animation = ((TdApi.MessageAnimation) message.content).animation;
                if (animation == null || !m25598T2(animation.animation)) {
                    return null;
                }
                return C4786e.m25361h(animation);
            case TdApi.MessageVideo.CONSTRUCTOR:
                TdApi.Video video = ((TdApi.MessageVideo) message.content).video;
                if (video == null || !m25598T2(video.video)) {
                    return null;
                }
                return C4786e.m25358k(video);
            default:
                return null;
        }
    }

    public static String m25521f2(TdApi.Audio audio) {
        return !C5070i.m24061i(audio.performer) ? audio.performer : (C5070i.m24061i(audio.fileName) || C5070i.m24067c(audio.fileName, audio.title)) ? C4403w.m27869i1(R.string.AudioUnknownArtist) : audio.fileName;
    }

    public static boolean m25520f3(TdApi.ChatMemberStatus chatMemberStatus) {
        return chatMemberStatus.getConstructor() == -5815259;
    }

    public static void m25519f4(List list, int i, boolean z) {
        if (z) {
            m25560Z4(list);
        }
    }

    public static File m25518f5(C4786e eVar) {
        File file;
        File file2;
        File file3 = new File(eVar.m25362g());
        if (!file3.exists()) {
            return null;
        }
        int constructor = eVar.f16282e.getConstructor();
        if (constructor == -709112160 || constructor == -588681661) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
        } else {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        int i = 0;
        while (true) {
            i++;
            file2 = new File(file, eVar.m25364e(i));
            if (!file2.exists()) {
                break;
            }
        }
        if (!C5068g.m24102a(file3, file2)) {
            return null;
        }
        C7389v0.m16735F2(file2);
        if (eVar.f16282e.getConstructor() == -709112160) {
            C7389v0.m16610m(file2);
            return file2;
        }
        DownloadManager downloadManager = (DownloadManager) C1379j0.m37315n().getSystemService("download");
        String name = file2.getName();
        String str = eVar.f16280c;
        if (C5070i.m24061i(str)) {
            String v0 = C7389v0.m16573v0(name);
            if (!C5070i.m24061i(v0)) {
                str = C1369e0.m37392g(v0);
            }
        }
        String str2 = str;
        if (C5070i.m24061i(name)) {
            if (C5070i.m24061i(str2)) {
                name = "file";
            } else {
                name = "file." + C1369e0.m37398a(str2);
            }
        }
        String str3 = name;
        if (downloadManager != null) {
            try {
                downloadManager.addCompletedDownload(str3, str3, true, str2, file2.getAbsolutePath(), file2.length(), true);
            } catch (Throwable th) {
                Log.m14710w("Failed to notify about saved download", th, new Object[0]);
            }
        }
        return file2;
    }

    public static int m25516g0(TdApi.User user, TdApi.User user2) {
        int compareToIgnoreCase = user.firstName.compareToIgnoreCase(user2.firstName);
        if (compareToIgnoreCase != 0) {
            return compareToIgnoreCase;
        }
        int compareToIgnoreCase2 = user.lastName.compareToIgnoreCase(user2.lastName);
        return compareToIgnoreCase2 != 0 ? compareToIgnoreCase2 : Long.compare(user.f25439id, user2.f25439id);
    }

    public static List<C4786e> m25515g1(TdApi.Message[] messageArr) {
        ArrayList arrayList = new ArrayList();
        for (TdApi.Message message : messageArr) {
            C4786e f1 = m25522f1(message);
            if (f1 != null) {
                arrayList.add(f1);
            }
        }
        return arrayList;
    }

    public static String m25514g2() {
        return C7322f.f23232c[0];
    }

    public static boolean m25513g3(String str) {
        return str.startsWith("X");
    }

    public static void m25512g4(List list) {
        char c;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        loop0: while (true) {
            c = 65535;
            while (true) {
                char c2 = 3;
                if (!it.hasNext()) {
                    break loop0;
                }
                C4786e eVar = (C4786e) it.next();
                int constructor = eVar.m25363f().getConstructor();
                if (constructor == -1718914651) {
                    z = C7389v0.m16698P(eVar.m25362g(), 0, null);
                    c2 = 0;
                } else if (constructor == -290816582) {
                    z = C7389v0.m16698P(eVar.m25362g(), 2, null);
                    c2 = 2;
                } else if (constructor != 1430816539) {
                    File f5 = m25518f5(eVar);
                    if (f5 != null) {
                        arrayList.add(f5.getPath());
                    }
                    z = f5 != null;
                } else {
                    z = C7389v0.m16698P(eVar.m25362g(), 1, null);
                    c2 = 1;
                }
                if (z) {
                    i++;
                    if (i == 1) {
                        c = c2;
                    } else if (c != c2) {
                        break;
                    }
                }
            }
        }
        if (i <= 0) {
            return;
        }
        if (c == 65535) {
            C1379j0.m37290z0(C4403w.m27836q2(R.string.SavedXFiles, i), 0);
        } else if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        if (i == 1) {
                            C1379j0.m37290z0(C4403w.m27853m1(R.string.DownloadedToPath, arrayList.get(0)), 1);
                        } else {
                            C1379j0.m37290z0(C4403w.m27832r2(R.string.DownloadedXFiles, i, C1363c0.m37454T("\n", arrayList)), 1);
                        }
                    }
                } else if (i == 1) {
                    C1379j0.m37292y0(R.string.GifHasBeenSavedToGallery, 0);
                } else {
                    C1379j0.m37290z0(C4403w.m27836q2(R.string.SavedXGifToGallery, i), 0);
                }
            } else if (i == 1) {
                C1379j0.m37292y0(R.string.VideoHasBeenSavedToGallery, 0);
            } else {
                C1379j0.m37290z0(C4403w.m27836q2(R.string.XVideoSaved, i), 0);
            }
        } else if (i == 1) {
            C1379j0.m37292y0(R.string.PhotoHasBeenSavedToGallery, 0);
        } else {
            C1379j0.m37290z0(C4403w.m27836q2(R.string.XPhotoSaved, i), 0);
        }
    }

    public static void m25511g5(File file, final String str) {
        if (file.exists()) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdir()) {
                String v0 = C7389v0.m16573v0(file.getName());
                final File d2 = C5070i.m24061i(v0) ? C7389v0.m16643d2(externalStoragePublicDirectory, file.getName(), C1369e0.m37392g(v0)) : C7389v0.m16647c2(externalStoragePublicDirectory, file.getName());
                if (C5068g.m24102a(file, d2)) {
                    C1379j0.m37334d0(new Runnable() {
                        @Override
                        public final void run() {
                            C4779t2.m25470m4(d2, str);
                        }
                    });
                }
            }
        }
    }

    public static TdApi.PhoneNumberAuthenticationSettings m25509h0() {
        return new TdApi.PhoneNumberAuthenticationSettings(false, true, false, false, C4868i.m24726c2().m24696g0());
    }

    public static TdApi.FormattedText m25508h1(TdApi.Poll poll) {
        if (poll.type.getConstructor() == 657013913) {
            return ((TdApi.PollTypeQuiz) poll.type).explanation;
        }
        return null;
    }

    public static String m25507h2(TdApi.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        m25500i2(richText, sb2);
        return sb2.toString();
    }

    public static boolean m25506h3(TdApi.ChatMemberStatus chatMemberStatus) {
        return m25499i3(chatMemberStatus, true);
    }

    public static void m25505h4(File file, String str, int i, boolean z) {
        if (z) {
            m25525e5(file, str);
        }
    }

    public static List<TdApi.SendMessage> m25504h5(long j, long j2, long j3, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageContent inputMessageContent, int i) {
        int i2;
        if (inputMessageContent.getConstructor() != 247050392) {
            return Collections.singletonList(new TdApi.SendMessage(j, j2, j3, messageSendOptions, null, inputMessageContent));
        }
        TdApi.InputMessageText inputMessageText = (TdApi.InputMessageText) inputMessageContent;
        TdApi.FormattedText formattedText = inputMessageText.text;
        int length = formattedText.text.length();
        ArrayList arrayList = new ArrayList();
        if (length <= i) {
            arrayList.add(new TdApi.SendMessage(j, j2, j3, messageSendOptions, null, inputMessageText));
            return arrayList;
        }
        int i3 = 0;
        while (i3 < length) {
            int min = Math.min(i, length - i3);
            int i4 = i3 + min;
            if (min != i || (i2 = RunnableC5390g.m22997F0(formattedText.text, i4 - (min / 4), i4, null)) == -1 || i2 <= i3 || i2 >= i4) {
                i2 = i4;
            }
            TdApi.FormattedText u1 = C7321e.m16905u1(formattedText, i3, i2);
            boolean z = true;
            boolean z2 = i3 == 0;
            boolean z3 = z2 && inputMessageText.disableWebPagePreview;
            if (!z2 || !inputMessageText.clearDraft) {
                z = false;
            }
            arrayList.add(new TdApi.SendMessage(j, j2, j3, messageSendOptions, null, new TdApi.InputMessageText(u1, z3, z)));
            i3 = i4;
        }
        return arrayList;
    }

    public static TdApi.MessageSendOptions m25502i0() {
        return new TdApi.MessageSendOptions(false, false, false, null);
    }

    public static TdApi.File m25501i1(AbstractC4761s4 s4Var) {
        TdApi.File j1 = m25494j1(s4Var.m25993Z3());
        if (j1 != null) {
            return j1;
        }
        int constructor = s4Var.m25993Z3().content.getConstructor();
        if (constructor == -1851395174) {
            return ((C4714n5) s4Var).m26371oa();
        }
        if (constructor != 1989037971) {
            return null;
        }
        return ((C4656h6) s4Var).m26618la();
    }

    public static void m25500i2(TdApi.RichText richText, StringBuilder sb2) {
        if (richText != null) {
            switch (richText.getConstructor()) {
                case TdApi.RichTextFixed.CONSTRUCTOR:
                    m25500i2(((TdApi.RichTextFixed) richText).text, sb2);
                    return;
                case TdApi.RichTextUnderline.CONSTRUCTOR:
                    m25500i2(((TdApi.RichTextUnderline) richText).text, sb2);
                    return;
                case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                    m25500i2(((TdApi.RichTextEmailAddress) richText).text, sb2);
                    return;
                case TdApi.RichTextUrl.CONSTRUCTOR:
                    m25500i2(((TdApi.RichTextUrl) richText).text, sb2);
                    return;
                case TdApi.RichTextPlain.CONSTRUCTOR:
                    sb2.append(((TdApi.RichTextPlain) richText).text);
                    return;
                case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                    m25500i2(((TdApi.RichTextStrikethrough) richText).text, sb2);
                    return;
                case TdApi.RichTexts.CONSTRUCTOR:
                    for (TdApi.RichText richText2 : ((TdApi.RichTexts) richText).texts) {
                        m25500i2(richText2, sb2);
                    }
                    return;
                case TdApi.RichTextBold.CONSTRUCTOR:
                    m25500i2(((TdApi.RichTextBold) richText).text, sb2);
                    return;
                case TdApi.RichTextItalic.CONSTRUCTOR:
                    m25500i2(((TdApi.RichTextItalic) richText).text, sb2);
                    return;
                default:
                    return;
            }
        }
    }

    public static boolean m25499i3(TdApi.ChatMemberStatus chatMemberStatus, boolean z) {
        if (chatMemberStatus == null) {
            return false;
        }
        switch (chatMemberStatus.getConstructor()) {
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                return z || ((TdApi.ChatMemberStatusCreator) chatMemberStatus).isMember;
            case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
            case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                return true;
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                return ((TdApi.ChatMemberStatusRestricted) chatMemberStatus).isMember;
            default:
                return false;
        }
    }

    public static void m25497i5(TdApi.Message message) {
        int constructor = message.content.getConstructor();
        if (constructor == 527777781) {
            ((TdApi.MessageVoiceNote) message.content).isListened = true;
        } else if (constructor == 963323014) {
            ((TdApi.MessageVideoNote) message.content).isViewed = true;
        }
    }

    public static void m25495j0(AbstractC9323v4<?> v4Var, List<C4786e> list, Runnable runnable) {
        int size = list.size();
        TdApi.File[] fileArr = new TdApi.File[size];
        for (int i = 0; i < size; i++) {
            fileArr[i] = list.get(i).m25366c();
        }
        m25488k0(v4Var, fileArr, runnable);
    }

    public static TdApi.File m25494j1(TdApi.Message message) {
        if (message == null) {
            return null;
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return m25487k1(((TdApi.MessagePhoto) message.content).photo);
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                return C7321e.m17016B0(((TdApi.MessageChatChangePhoto) message.content).photo.sizes).photo;
            case TdApi.MessageAudio.CONSTRUCTOR:
                return ((TdApi.MessageAudio) message.content).audio.audio;
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                return ((TdApi.MessageVoiceNote) message.content).voiceNote.voice;
            case TdApi.MessageDocument.CONSTRUCTOR:
                return ((TdApi.MessageDocument) message.content).document.document;
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return ((TdApi.MessageVideoNote) message.content).videoNote.video;
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return ((TdApi.MessageAnimation) message.content).animation.animation;
            case TdApi.MessageText.CONSTRUCTOR:
                return m25480l1(((TdApi.MessageText) message.content).webPage);
            case TdApi.MessageVideo.CONSTRUCTOR:
                return ((TdApi.MessageVideo) message.content).video.video;
            default:
                return null;
        }
    }

    public static String m25493j2(TdApi.Message message) {
        if (message != null) {
            return m25486k2(message.content);
        }
        return null;
    }

    public static boolean m25492j3(TdApi.Message message) {
        int constructor = message.content.getConstructor();
        if (constructor == 527777781) {
            return ((TdApi.MessageVoiceNote) message.content).isListened;
        }
        if (constructor != 963323014) {
            return false;
        }
        return ((TdApi.MessageVideoNote) message.content).isViewed;
    }

    public static void m25491j4(C4786e eVar, int i, boolean z) {
        if (z) {
            m25532d5(eVar);
        }
    }

    public static void m25490j5(AbstractC10664f9 f9Var, String str) {
        x00 x00Var = new x00(f9Var.mo4347s(), f9Var.mo4348c());
        x00.C3281m mVar = new x00.C3281m(str);
        if (C1363c0.m37457Q(str)) {
            mVar.m30886C(str);
        }
        x00Var.m30994Vi(mVar);
        x00Var.m30960ej();
    }

    public static void m25488k0(final AbstractC9323v4<?> v4Var, final TdApi.File[] fileArr, final Runnable runnable) {
        if (!(fileArr == null || fileArr.length == 0)) {
            long j = 0;
            for (TdApi.File file : fileArr) {
                j += file.local.downloadedSize;
            }
            final long j2 = j;
            v4Var.m9261ee(C4403w.m27869i1(fileArr.length == 1 ? R.string.DeleteFileHint : R.string.DeleteMultipleFilesHint), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{C4403w.m27865j1(R.string.ClearX, C1363c0.m37423m(j)), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean N3;
                    N3 = C4779t2.m25636N3(fileArr, v4Var, j2, runnable, view, i);
                    return N3;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    public static TdApi.File m25487k1(TdApi.Photo photo) {
        TdApi.PhotoSize n = C4630f0.m26734n(photo);
        if (n != null) {
            return n.photo;
        }
        return null;
    }

    public static String m25486k2(TdApi.MessageContent messageContent) {
        TdApi.FormattedText w1 = C7321e.m16899w1(messageContent);
        if (w1 != null) {
            return w1.text;
        }
        return null;
    }

    public static boolean m25485k3(TdApi.Call call) {
        return call != null && !call.isOutgoing && call.state.getConstructor() == -190853167 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == 1680358012;
    }

    public static void m25484k4(C4786e eVar) {
        File f5 = m25518f5(eVar);
        if (f5 != null) {
            C1379j0.m37290z0(C4403w.m27865j1(R.string.DownloadedToPath, f5.getPath()), 1);
        }
    }

    public static boolean m25483k5(String str) {
        return str.startsWith("instagram.com/") || str.startsWith("twitter.com/") || (str.startsWith("t.me/") && !str.startsWith("t.me/iv?"));
    }

    public static int m25481l0(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            return ((TdApi.Error) object).code;
        }
        return 0;
    }

    public static TdApi.File m25480l1(TdApi.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        TdApi.Sticker sticker = webPage.sticker;
        if (sticker != null) {
            return sticker.sticker;
        }
        TdApi.Video video = webPage.video;
        if (video != null) {
            return video.video;
        }
        TdApi.Animation animation = webPage.animation;
        if (animation != null) {
            return animation.animation;
        }
        TdApi.Audio audio = webPage.audio;
        if (audio != null) {
            return audio.audio;
        }
        TdApi.Document document = webPage.document;
        if (document != null) {
            return document.document;
        }
        TdApi.Photo photo = webPage.photo;
        if (photo != null) {
            return m25487k1(photo);
        }
        return null;
    }

    public static String m25479l2(TdApi.PushMessageContent pushMessageContent) {
        switch (pushMessageContent.getConstructor()) {
            case TdApi.PushMessageContentPhoto.CONSTRUCTOR:
                return ((TdApi.PushMessageContentPhoto) pushMessageContent).caption;
            case TdApi.PushMessageContentText.CONSTRUCTOR:
                return ((TdApi.PushMessageContentText) pushMessageContent).text;
            case TdApi.PushMessageContentVideo.CONSTRUCTOR:
                return ((TdApi.PushMessageContentVideo) pushMessageContent).caption;
            case TdApi.PushMessageContentAnimation.CONSTRUCTOR:
                return ((TdApi.PushMessageContentAnimation) pushMessageContent).caption;
            default:
                return null;
        }
    }

    public static boolean m25478l3(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return constructor == 973884508;
        }
        return !((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public static void m25477l4(DownloadManager downloadManager, File file, String str) {
        try {
            downloadManager.addCompletedDownload(file.getName(), file.getName(), true, str, file.getAbsolutePath(), file.length(), true);
        } catch (Throwable th) {
            Log.m14710w("Failed to notify about saved download", th, new Object[0]);
            C1379j0.m37290z0("File added to downloads: " + file.getPath(), 0);
        }
    }

    public static boolean m25476l5(TdApi.WebPage webPage) {
        return "telegram_album".equals(webPage.type) || m25483k5(webPage.displayUrl);
    }

    public static TdApi.PhotoSize m25474m0(TdApi.Photo photo, int i, int i2) {
        if (photo != null) {
            return m25467n0(photo.sizes, i, i2);
        }
        return null;
    }

    public static int m25473m1(String str, String str2, boolean z) {
        String lowerCase = str2 != null ? str2.toLowerCase() : null;
        int lastIndexOf = str.lastIndexOf(46);
        String lowerCase2 = lastIndexOf != -1 ? str.substring(lastIndexOf + 1).toLowerCase() : "";
        return ("application/vnd.android.package-archive".equals(lowerCase) || "apk".equals(lowerCase2)) ? R.id.theme_color_fileGreen : ("7z".equals(lowerCase2) || "application/x-7z-compressed".equals(lowerCase) || "zip".equals(lowerCase2) || "application/zip".equals(lowerCase) || "rar".equals(lowerCase2) || "application/x-rar-compressed".equals(lowerCase)) ? R.id.theme_color_fileYellow : ("pdf".equals(lowerCase2) || "application/pdf".equals(lowerCase)) ? R.id.theme_color_fileRed : z ? R.id.theme_color_bubbleOut_file : R.id.theme_color_file;
    }

    public static String m25472m2(TdApi.Audio audio) {
        return C5070i.m24061i(audio.title) ? C4403w.m27869i1(R.string.UnknownTrack) : audio.title;
    }

    public static boolean m25471m3(TdApi.Poll poll) {
        return poll.type.getConstructor() == 641265698 && ((TdApi.PollTypeRegular) poll.type).allowMultipleAnswers;
    }

    public static void m25470m4(final File file, final String str) {
        final DownloadManager downloadManager = (DownloadManager) C1379j0.m37315n().getSystemService("download");
        if (downloadManager != null) {
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    C4779t2.m25477l4(downloadManager, file, str);
                }
            });
        }
    }

    public static boolean m25469m5(int i, int i2, int i3) {
        return i == 0 && !C5067f.m24111i(i3, i2);
    }

    public static TdApi.PhotoSize m25467n0(TdApi.PhotoSize[] photoSizeArr, int i, int i2) {
        TdApi.PhotoSize photoSize = null;
        if (photoSizeArr == null) {
            return null;
        }
        boolean z = true;
        if (photoSizeArr.length == 1) {
            return photoSizeArr[0];
        }
        int i3 = i * i2;
        int i4 = 0;
        for (TdApi.PhotoSize photoSize2 : photoSizeArr) {
            int abs = Math.abs(i3 - (Math.min(photoSize2.width, photoSize2.height) * Math.max(photoSize2.width, photoSize2.height)));
            if (z || abs < i4) {
                photoSize = photoSize2;
                i4 = abs;
                z = false;
            }
        }
        return photoSize;
    }

    public static int m25466n1(TdApi.Document document, boolean z) {
        return m25473m1(document.fileName, document.mimeType, z);
    }

    public static long m25465n2(TdApi.Chat chat) {
        if (chat != null) {
            return m25458o2(chat.type);
        }
        return 0L;
    }

    public static boolean m25464n3(int i) {
        return TimeUnit.SECONDS.toDays((long) i) / 365 > 0;
    }

    public static int m25463n4(String str, boolean z) {
        int i = -1;
        if (C5070i.m24061i(str)) {
            return -1;
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            int charCount = Character.charCount(codePointAt);
            if (codePointAt != 10 && ((z || i2 + charCount != length) && Character.getType(codePointAt) == 12)) {
                i = i2;
            }
            i2 += charCount;
        }
        return i;
    }

    public static boolean m25462n5(int i, int i2, int i3) {
        return i == 0 && !C5067f.m24109k(i3, i2);
    }

    public static String m25460o0(TdApi.FormattedText formattedText) {
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        String str = null;
        if (textEntityArr == null) {
            return null;
        }
        for (TdApi.TextEntity textEntity : textEntityArr) {
            int constructor = textEntity.type.getConstructor();
            if (constructor != -1312762756) {
                if (constructor == 445719651) {
                    str = ((TdApi.TextEntityTypeTextUrl) textEntity.type).url;
                }
            } else {
                String str2 = formattedText.text;
                int i = textEntity.offset;
                return str2.substring(i, textEntity.length + i);
            }
        }
        return str;
    }

    public static int m25459o1(TdApi.Message message) {
        TdApi.File j1 = m25494j1(message);
        if (j1 != null) {
            return j1.f25373id;
        }
        return 0;
    }

    public static long m25458o2(TdApi.ChatType chatType) {
        int constructor = chatType.getConstructor();
        if (constructor == 862366513) {
            return ((TdApi.ChatTypeSecret) chatType).userId;
        }
        if (constructor != 1579049844) {
            return 0L;
        }
        return ((TdApi.ChatTypePrivate) chatType).userId;
    }

    public static boolean m25457o3(TdApi.ChatMemberStatus chatMemberStatus) {
        if (chatMemberStatus == null) {
            return false;
        }
        switch (chatMemberStatus.getConstructor()) {
            case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
            case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                return true;
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                return !((TdApi.ChatMemberStatusCreator) chatMemberStatus).isMember;
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                return !((TdApi.ChatMemberStatusRestricted) chatMemberStatus).isMember;
            default:
                return false;
        }
    }

    public static String m25456o4(TdApi.ChatList chatList) {
        int constructor = chatList.getConstructor();
        if (constructor == -2022707655) {
            return "filter" + ((TdApi.ChatListFilter) chatList).chatFilterId;
        } else if (constructor == -400991316) {
            return "main";
        } else {
            if (constructor == 362770115) {
                return "archive";
            }
            throw new UnsupportedOperationException(chatList.toString());
        }
    }

    public static int m25455o5(List<TdApi.TextEntity> list, int i) {
        for (int max = Math.max(i, 1); max < list.size(); max++) {
            for (int i2 = max - 1; i2 >= 0; i2--) {
                TdApi.TextEntity textEntity = list.get(i2);
                TdApi.TextEntity textEntity2 = list.get(max);
                int i3 = textEntity2.offset;
                int i4 = textEntity.offset;
                int i5 = textEntity.length;
                if (i3 < i4 + i5 && textEntity2.length + i3 > i4 + i5) {
                    int i6 = (i4 + i5) - i3;
                    list.remove(max);
                    list.addAll(max, Arrays.asList(new TdApi.TextEntity(textEntity2.offset, i6, textEntity2.type), new TdApi.TextEntity(textEntity.offset + textEntity.length, textEntity2.length - i6, textEntity2.type)));
                    return max;
                }
            }
        }
        return -1;
    }

    public static String m25453p0(Map<String, TdApi.LanguagePackString> map, String str, AbstractC5913e<String> eVar) {
        TdApi.LanguagePackString languagePackString = map.get(str);
        if (languagePackString != null) {
            TdApi.LanguagePackStringValue languagePackStringValue = languagePackString.value;
            if (languagePackStringValue instanceof TdApi.LanguagePackStringValueOrdinary) {
                return ((TdApi.LanguagePackStringValueOrdinary) languagePackStringValue).value;
            }
        }
        if (eVar != null) {
            return eVar.get();
        }
        return null;
    }

    public static float m25452p1(TdApi.File file) {
        TdApi.LocalFile localFile;
        int i;
        if (file == null || (localFile = file.local) == null || (i = localFile.downloadOffset) == 0) {
            return 0.0f;
        }
        int i2 = file.expectedSize;
        if (i2 != 0.0f) {
            return i / i2;
        }
        return 0.0f;
    }

    public static String m25451p2(long j, TdApi.User user) {
        if (j == 777000) {
            return "Telegram";
        }
        if (user == null) {
            return "User#" + j;
        }
        TdApi.UserType userType = user.type;
        if (userType == null || userType.getConstructor() != -1807729372) {
            return m25444q2(user.firstName, user.lastName);
        }
        return C4403w.m27869i1(R.string.HiddenName);
    }

    public static boolean m25450p3(TdApi.Object object) {
        return object != null && object.getConstructor() == -722616727;
    }

    public static CharSequence m25449p4(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        C5132o[] oVarArr = (C5132o[]) spanned.getSpans(0, spanned.length(), C5132o.class);
        if (oVarArr == null || oVarArr.length <= 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        for (C5132o oVar : oVarArr) {
            int spanStart = spanned.getSpanStart(oVar);
            int spanEnd = spanned.getSpanEnd(oVar);
            if (oVar.m23857e()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = spanned instanceof SpannableStringBuilder ? (SpannableStringBuilder) spanned : new SpannableStringBuilder(spanned);
                }
                spannableStringBuilder.removeSpan(oVar);
                spannableStringBuilder.setSpan(new C4781b(oVar), spanStart, spanEnd, 33);
                spannableStringBuilder.setSpan(oVar, spanStart, spanEnd, 33);
                oVar.m23844r(true);
            }
        }
        return spannableStringBuilder != null ? spannableStringBuilder : charSequence;
    }

    public static boolean m25448p5(TdApi.User user) {
        return false;
    }

    public static TdApi.PhotoSize m25446q0(TdApi.PhotoSize[] photoSizeArr, int i, int i2, int i3, String str) {
        int max = Math.max(800, Math.min(1280, (int) (C1357a0.m37550E() * Math.min(C1357a0.m37542h(), 2.0f))));
        if (Math.max(i, i2) != max) {
            float f = max;
            float f2 = i;
            float f3 = i2;
            float min = Math.min(f / f2, f / f3);
            i = (int) (f2 * min);
            i2 = (int) (f3 * min);
        }
        TdApi.PhotoSize photoSize = null;
        int i4 = 0;
        for (TdApi.PhotoSize photoSize2 : photoSizeArr) {
            if (photoSize2.photo.f25373id != i3) {
                if (str == null || !str.equals(photoSize2.type)) {
                    int max2 = Math.max(Math.abs(photoSize2.width - i), Math.abs(photoSize2.height - i2));
                    if (photoSize == null || i4 > max2) {
                        photoSize = photoSize2;
                        i4 = max2;
                    }
                } else {
                    TdApi.File file = photoSize2.photo;
                    if (file.local.canBeDownloaded || m25586V2(file)) {
                        return photoSize2;
                    }
                }
            }
        }
        return photoSize;
    }

    public static String m25445q1(TdApi.File file) {
        if (file != null && m25586V2(file)) {
            return file.local.path;
        }
        return null;
    }

    public static String m25444q2(String str, String str2) {
        if (C5070i.m24061i(str)) {
            return str2;
        }
        if (C5070i.m24061i(str2)) {
            return str;
        }
        return str + ' ' + str2;
    }

    public static boolean m25443q3(TdApi.User user) {
        return user != null && user.type.getConstructor() == -598644325 && m25436r3(user.status);
    }

    public static TdApi.SearchMessagesFilter m25442q4(TdApi.Message message, boolean z) {
        Objects.requireNonNull(message);
        if (m25727A3(message)) {
            return null;
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterPhoto();
            case TdApi.MessageAudio.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterAudio();
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                return z ? new TdApi.SearchMessagesFilterVoiceAndVideoNote() : new TdApi.SearchMessagesFilterVoiceNote();
            case TdApi.MessageDocument.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterDocument();
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return z ? new TdApi.SearchMessagesFilterVoiceAndVideoNote() : new TdApi.SearchMessagesFilterVideoNote();
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterAnimation();
            case TdApi.MessageVideo.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterVideo();
            default:
                return null;
        }
    }

    public static CharSequence m25441q5(TdApi.FormattedText formattedText) {
        return m25434r5(formattedText, true, true);
    }

    public static TdApi.PhotoSize m25439r0(TdApi.PhotoSize[] photoSizeArr, String str) {
        for (TdApi.PhotoSize photoSize : photoSizeArr) {
            if (photoSize.type.equals(str)) {
                return photoSize;
            }
        }
        return null;
    }

    public static float m25438r1(TdApi.File file) {
        TdApi.LocalFile localFile;
        if (file == null || (localFile = file.local) == null || localFile.downloadOffset == 0) {
            return m25424t1(file, true);
        }
        int i = file.expectedSize;
        if (i != 0) {
            return localFile.downloadedPrefixSize / i;
        }
        return 0.0f;
    }

    public static String m25437r2(TdApi.User user) {
        return user == null ? "NULL" : m25451p2(user.f25439id, user);
    }

    public static boolean m25436r3(TdApi.UserStatus userStatus) {
        return userStatus != null && userStatus.getConstructor() == -1529460876;
    }

    public static int m25435r4(TdApi.Message message, boolean z) {
        Objects.requireNonNull(message);
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR;
            case TdApi.MessageAudio.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterAudio.CONSTRUCTOR;
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                return z ? TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR : TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR;
            case TdApi.MessageDocument.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterDocument.CONSTRUCTOR;
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return z ? TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR : TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR;
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR;
            case TdApi.MessageVideo.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterVideo.CONSTRUCTOR;
            default:
                return TdApi.SearchMessagesFilterEmpty.CONSTRUCTOR;
        }
    }

    public static CharSequence m25434r5(TdApi.FormattedText formattedText, boolean z, boolean z2) {
        CharacterStyle characterStyle;
        StringBuilder sb2 = null;
        if (formattedText == null) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return formattedText.text;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        boolean z3 = false;
        for (TdApi.TextEntity textEntity : textEntityArr) {
            boolean z4 = textEntity.type.getConstructor() == 544019899;
            if (z4) {
                z3 = true;
            }
            if (!z4 || z2) {
                characterStyle = m25662J5(textEntity.type, z);
            } else {
                characterStyle = null;
            }
            if (characterStyle != null) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(formattedText.text);
                }
                int i = textEntity.offset;
                spannableStringBuilder.setSpan(characterStyle, i, textEntity.length + i, 33);
            }
        }
        if (!z2 && z3) {
            if (spannableStringBuilder == null) {
                sb2 = new StringBuilder(formattedText.text);
            }
            for (int length = formattedText.entities.length - 1; length >= 0; length--) {
                TdApi.TextEntity textEntity2 = formattedText.entities[length];
                if (textEntity2.type.getConstructor() == 544019899) {
                    String r = C5070i.m24052r("▒", textEntity2.length);
                    if (spannableStringBuilder != null) {
                        int i2 = textEntity2.offset;
                        spannableStringBuilder.delete(i2, textEntity2.length + i2);
                        spannableStringBuilder.insert(textEntity2.offset, (CharSequence) r);
                    } else {
                        int i3 = textEntity2.offset;
                        sb2.delete(i3, textEntity2.length + i3);
                        sb2.insert(textEntity2.offset, r);
                    }
                }
            }
            if (sb2 != null) {
                return sb2.toString();
            }
        }
        return spannableStringBuilder != null ? SpannableString.valueOf(spannableStringBuilder) : formattedText.text;
    }

    public static TdApi.PhotoSize m25432s0(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        return m25425t0(photo.sizes, photoSize);
    }

    public static float m25431s1(TdApi.File file) {
        return m25424t1(file, false);
    }

    public static String m25430s2(long j, TdApi.User user) {
        if (j == 0 || user != null) {
            return m25417u1(user);
        }
        return "User#" + j;
    }

    public static boolean m25429s3(TdApi.Message message) {
        return message != null && message.isOutgoing;
    }

    public static boolean m25428s4(char c) {
        return (c == '.' || c == ',' || c == '/' || Character.getType(c) == 12) ? false : true;
    }

    public static CharSequence m25427s5(TdApi.FormattedText formattedText) {
        return m25441q5(formattedText);
    }

    public static TdApi.PhotoSize m25425t0(TdApi.PhotoSize[] photoSizeArr, TdApi.PhotoSize photoSize) {
        TdApi.PhotoSize photoSize2 = null;
        boolean z = true;
        if (photoSizeArr.length != 1) {
            int i = 0;
            int i2 = 0;
            for (TdApi.PhotoSize photoSize3 : photoSizeArr) {
                int i3 = photoSize3.width;
                if (!(i3 == photoSize.width && photoSize3.height == photoSize.height && photoSize3.photo.f25373id == photoSize.photo.f25373id) && (z || i3 < i || photoSize3.height < i2)) {
                    i2 = photoSize3.height;
                    photoSize2 = photoSize3;
                    i = i3;
                    z = false;
                }
            }
            return photoSize2;
        } else if (photoSize.width == photoSizeArr[0].width && photoSize.height == photoSizeArr[0].height && photoSize.photo.f25373id == photoSizeArr[0].photo.f25373id) {
            return null;
        } else {
            return photoSizeArr[0];
        }
    }

    public static float m25424t1(TdApi.File file, boolean z) {
        if (file == null) {
            return 0.0f;
        }
        TdApi.RemoteFile remoteFile = file.remote;
        if (remoteFile == null || !remoteFile.isUploadingActive) {
            TdApi.LocalFile localFile = file.local;
            if (localFile == null || (!localFile.isDownloadingActive && (localFile.downloadedSize <= 0 || !z))) {
                return m25598T2(file) ? 1.0f : 0.0f;
            }
            int i = file.expectedSize;
            if (i != 0) {
                return localFile.downloadedSize / i;
            }
            return 0.0f;
        }
        int i2 = file.expectedSize;
        if (i2 != 0) {
            return remoteFile.uploadedSize / i2;
        }
        return 0.0f;
    }

    public static int m25423t2(TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (messageInteractionInfo != null) {
            return messageInteractionInfo.viewCount;
        }
        return 0;
    }

    public static boolean m25422t3(TdApi.Photo photo) {
        TdApi.PhotoSize[] photoSizeArr;
        return photo == null || (photoSizeArr = photo.sizes) == null || photoSizeArr.length == 0;
    }

    public static boolean m25421t4(char c) {
        return (Character.getType(c) == 12 || c == '#') ? false : true;
    }

    public static CharSequence m25420t5(TdApi.FormattedText formattedText) {
        return m25413u5(formattedText, null);
    }

    public static List<String> m25418u0(String str, List<String> list) {
        TdApi.TextEntity[] C0 = C7321e.m17014C0(str);
        if (C0 != null) {
            for (TdApi.TextEntity textEntity : C0) {
                if (textEntity.type.getConstructor() == -1312762756) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    int i = textEntity.offset;
                    list.add(str.substring(i, textEntity.length + i));
                }
            }
        }
        return list;
    }

    public static String m25417u1(TdApi.User user) {
        if (user == null) {
            return "null";
        }
        if (user.type.getConstructor() == -1807729372) {
            return C4403w.m27869i1(R.string.HiddenNameShort);
        }
        String trim = user.firstName.trim();
        return C5070i.m24061i(trim) ? user.lastName.trim() : trim;
    }

    public static TdApi.File m25416u2(TdApi.WebPage webPage) {
        int i;
        TdApi.PhotoSize m0;
        if (!m25422t3(webPage.photo) && (m0 = m25474m0(webPage.photo, (i = C1357a0.m37541i(34.0f)), i)) != null) {
            return m0.photo;
        }
        return null;
    }

    public static boolean m25415u3(TdApi.ProfilePhoto profilePhoto) {
        return profilePhoto == null || m25604S2(profilePhoto.small);
    }

    public static boolean m25414u4(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '_');
    }

    public static CharSequence m25413u5(TdApi.FormattedText formattedText, Typeface typeface) {
        SpannableStringBuilder spannableStringBuilder = null;
        if (formattedText == null) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return formattedText.text;
        }
        for (TdApi.TextEntity textEntity : textEntityArr) {
            TdApi.TextEntityType textEntityType = textEntity.type;
            String str = formattedText.text;
            int i = textEntity.offset;
            C5132o w5 = m25399w5(textEntityType, typeface, RunnableC5390g.m22981N0(str, i, textEntity.length + i));
            if (w5 != null) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(formattedText.text);
                }
                int i2 = textEntity.offset;
                spannableStringBuilder.setSpan(w5, i2, textEntity.length + i2, 33);
            }
        }
        return spannableStringBuilder != null ? SpannableString.valueOf(spannableStringBuilder) : formattedText.text;
    }

    public static List<String> m25411v0(TdApi.FormattedText formattedText) {
        List<String> list = null;
        if (C7321e.m16965a1(formattedText)) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length <= 0) {
            return m25418u0(formattedText.text, null);
        }
        int i = 0;
        for (TdApi.TextEntity textEntity : textEntityArr) {
            switch (textEntity.type.getConstructor()) {
                case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypePre.CONSTRUCTOR:
                    int i2 = textEntity.offset;
                    if (i2 > i) {
                        list = m25418u0(formattedText.text.substring(i, i2), list);
                    }
                    if (textEntity.type.getConstructor() == 445719651) {
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        list.add(((TdApi.TextEntityTypeTextUrl) textEntity.type).url);
                    }
                    i = textEntity.offset + textEntity.length;
                    break;
            }
        }
        return i < formattedText.text.length() ? m25418u0(formattedText.text.substring(i), list) : list;
    }

    public static int m25410v1(int i, String str, int i2) {
        return (i != 429 || !str.startsWith("Too Many Requests: retry after ")) ? i2 : C5070i.m24051s(str.substring(31));
    }

    public static boolean m25409v2(TdApi.Poll poll) {
        for (TdApi.PollOption pollOption : poll.options) {
            if (pollOption.isChosen) {
                return true;
            }
        }
        return false;
    }

    public static boolean m25408v3(TdApi.PushMessageContent pushMessageContent) {
        switch (pushMessageContent.getConstructor()) {
            case TdApi.PushMessageContentInvoice.CONSTRUCTOR:
                return ((TdApi.PushMessageContentInvoice) pushMessageContent).isPinned;
            case TdApi.PushMessageContentLocation.CONSTRUCTOR:
                return ((TdApi.PushMessageContentLocation) pushMessageContent).isPinned;
            case TdApi.PushMessageContentVideoNote.CONSTRUCTOR:
                return ((TdApi.PushMessageContentVideoNote) pushMessageContent).isPinned;
            case TdApi.PushMessageContentGame.CONSTRUCTOR:
                return ((TdApi.PushMessageContentGame) pushMessageContent).isPinned;
            case TdApi.PushMessageContentDocument.CONSTRUCTOR:
                return ((TdApi.PushMessageContentDocument) pushMessageContent).isPinned;
            case TdApi.PushMessageContentHidden.CONSTRUCTOR:
                return ((TdApi.PushMessageContentHidden) pushMessageContent).isPinned;
            case TdApi.PushMessageContentPoll.CONSTRUCTOR:
                return ((TdApi.PushMessageContentPoll) pushMessageContent).isPinned;
            case TdApi.PushMessageContentContact.CONSTRUCTOR:
                return ((TdApi.PushMessageContentContact) pushMessageContent).isPinned;
            case TdApi.PushMessageContentVoiceNote.CONSTRUCTOR:
                return ((TdApi.PushMessageContentVoiceNote) pushMessageContent).isPinned;
            case TdApi.PushMessageContentPhoto.CONSTRUCTOR:
                return ((TdApi.PushMessageContentPhoto) pushMessageContent).isPinned;
            case TdApi.PushMessageContentText.CONSTRUCTOR:
                return ((TdApi.PushMessageContentText) pushMessageContent).isPinned;
            case TdApi.PushMessageContentVideo.CONSTRUCTOR:
                return ((TdApi.PushMessageContentVideo) pushMessageContent).isPinned;
            case TdApi.PushMessageContentAudio.CONSTRUCTOR:
                return ((TdApi.PushMessageContentAudio) pushMessageContent).isPinned;
            case TdApi.PushMessageContentGameScore.CONSTRUCTOR:
                return ((TdApi.PushMessageContentGameScore) pushMessageContent).isPinned;
            case TdApi.PushMessageContentAnimation.CONSTRUCTOR:
                return ((TdApi.PushMessageContentAnimation) pushMessageContent).isPinned;
            case TdApi.PushMessageContentSticker.CONSTRUCTOR:
                return ((TdApi.PushMessageContentSticker) pushMessageContent).isPinned;
            default:
                return false;
        }
    }

    public static boolean m25407v4(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!m25414u4(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static C5132o m25406v5(TdApi.TextEntityType textEntityType) {
        return m25399w5(textEntityType, null, false);
    }

    public static void m25404w0(List<TdApi.TextEntity> list) {
        if (list != null && !list.isEmpty()) {
            int i = 0;
            do {
                C7321e.m16932l1(list);
                i = m25455o5(list, i);
            } while (i != -1);
        }
    }

    public static String m25403w1(TdApi.Game game, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "\u200e🎮 " : "");
        sb2.append(C5070i.m24061i(game.title) ? game.shortName : game.title);
        return sb2.toString();
    }

    public static boolean m25402w2(TdApi.SecretChat secretChat) {
        byte[] bArr;
        return secretChat != null && secretChat.state.getConstructor() == -1611352087 && (bArr = secretChat.keyHash) != null && bArr.length > 0;
    }

    public static boolean m25401w3(TdApi.ChatType chatType) {
        return chatType.getConstructor() == 1579049844;
    }

    public static boolean m25400w4(TdApi.SupergroupMembersFilter supergroupMembersFilter, TdApi.ChatMemberStatus chatMemberStatus) {
        switch (supergroupMembersFilter.getConstructor()) {
            case TdApi.SupergroupMembersFilterAdministrators.CONSTRUCTOR:
                int constructor = chatMemberStatus.getConstructor();
                return constructor == -160019714 || constructor == 82243562;
            case TdApi.SupergroupMembersFilterBanned.CONSTRUCTOR:
                return chatMemberStatus.getConstructor() == -1653518666;
            case TdApi.SupergroupMembersFilterRestricted.CONSTRUCTOR:
                return chatMemberStatus.getConstructor() == 1661432998;
            case TdApi.SupergroupMembersFilterRecent.CONSTRUCTOR:
                return m25506h3(chatMemberStatus);
            default:
                return false;
        }
    }

    public static C5132o m25399w5(TdApi.TextEntityType textEntityType, Typeface typeface, boolean z) {
        C5132o oVar;
        if (textEntityType == null) {
            return null;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
            case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                oVar = new C5132o(typeface, R.id.theme_color_textLink);
                break;
            case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                if (!z) {
                    oVar = new C5132o(C1389o.m37260i(), 0);
                    break;
                } else {
                    oVar = new C5132o(null, 0).m23851k(true);
                    break;
                }
            case TdApi.TextEntityTypeCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePre.CONSTRUCTOR:
                oVar = new C5132o(C1389o.m37259j(), 0);
                break;
            case TdApi.TextEntityTypeItalic.CONSTRUCTOR:
                oVar = new C5132o(C1389o.m37261h(), 0);
                break;
            case TdApi.TextEntityTypeSpoiler.CONSTRUCTOR:
            case TdApi.TextEntityTypeUnderline.CONSTRUCTOR:
            case TdApi.TextEntityTypeStrikethrough.CONSTRUCTOR:
                oVar = new C5132o(typeface, 0);
                break;
            default:
                return null;
        }
        oVar.m23852j(textEntityType);
        return oVar;
    }

    public static CharSequence m25397x0(final AbstractC10664f9 f9Var, String str, TdApi.TextEntity[] textEntityArr, Typeface typeface, final C5132o.AbstractC5133a aVar) {
        C5132o oVar;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return str;
        }
        int length = textEntityArr.length;
        Typeface typeface2 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        while (i < length) {
            TdApi.TextEntity textEntity = textEntityArr[i];
            switch (textEntity.type.getConstructor()) {
                case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                    final String s1 = C7321e.m16911s1(str, textEntity);
                    oVar = new C5132o(typeface, R.id.theme_color_textLink).m23845q(new C5132o.AbstractC5133a() {
                        @Override
                        public final boolean mo490a(View view, C5132o oVar2) {
                            boolean T3;
                            T3 = C4779t2.m25597T3(C5132o.AbstractC5133a.this, f9Var, s1, view, oVar2);
                            return T3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                    final String s12 = C7321e.m16911s1(str, textEntity);
                    oVar = new C5132o(typeface, R.id.theme_color_textLink).m23845q(new C5132o.AbstractC5133a() {
                        @Override
                        public final boolean mo490a(View view, C5132o oVar2) {
                            boolean S3;
                            S3 = C4779t2.m25603S3(C5132o.AbstractC5133a.this, s12, view, oVar2);
                            return S3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
                    oVar = typeface2;
                    break;
                case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                    int i2 = textEntity.offset;
                    if (!RunnableC5390g.m22981N0(str, i2, textEntity.length + i2)) {
                        oVar = new C5132o(C1389o.m37260i(), 0);
                        break;
                    } else {
                        oVar = new C5132o(typeface2, 0).m23851k(true);
                        break;
                    }
                case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                    final String s13 = C7321e.m16911s1(str, textEntity);
                    oVar = new C5132o(typeface, R.id.theme_color_textLink).m23845q(new C5132o.AbstractC5133a() {
                        @Override
                        public final boolean mo490a(View view, C5132o oVar2) {
                            boolean O3;
                            O3 = C4779t2.m25629O3(C5132o.AbstractC5133a.this, f9Var, s13, view, oVar2);
                            return O3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
                    final String s14 = C7321e.m16911s1(str, textEntity);
                    oVar = new C5132o(typeface, R.id.theme_color_textLink).m23845q(new C5132o.AbstractC5133a() {
                        @Override
                        public final boolean mo490a(View view, C5132o oVar2) {
                            boolean R3;
                            R3 = C4779t2.m25609R3(C5132o.AbstractC5133a.this, f9Var, s14, view, oVar2);
                            return R3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                    final String str2 = ((TdApi.TextEntityTypeTextUrl) textEntity.type).url;
                    oVar = new C5132o(typeface, R.id.theme_color_textLink).m23845q(new C5132o.AbstractC5133a() {
                        @Override
                        public final boolean mo490a(View view, C5132o oVar2) {
                            boolean U3;
                            U3 = C4779t2.m25591U3(C5132o.AbstractC5133a.this, f9Var, str2, view, oVar2);
                            return U3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                    final String s15 = C7321e.m16911s1(str, textEntity);
                    oVar = new C5132o(typeface, R.id.theme_color_textLink).m23845q(new C5132o.AbstractC5133a() {
                        @Override
                        public final boolean mo490a(View view, C5132o oVar2) {
                            boolean Q3;
                            Q3 = C4779t2.m25615Q3(C5132o.AbstractC5133a.this, f9Var, s15, view, oVar2);
                            return Q3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                    final String s16 = C7321e.m16911s1(str, textEntity);
                    oVar = new C5132o(typeface, R.id.theme_color_textLink).m23845q(new C5132o.AbstractC5133a() {
                        @Override
                        public final boolean mo490a(View view, C5132o oVar2) {
                            boolean P3;
                            P3 = C4779t2.m25622P3(C5132o.AbstractC5133a.this, s16, view, oVar2);
                            return P3;
                        }
                    });
                    break;
                default:
                    oVar = m25399w5(textEntity.type, typeface, false);
                    break;
            }
            if (oVar != null) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                }
                if (oVar.m23859c() != null) {
                    C4780a aVar2 = new C4780a(oVar);
                    int i3 = textEntity.offset;
                    spannableStringBuilder.setSpan(aVar2, i3, textEntity.length + i3, 33);
                }
                oVar.m23852j(textEntity.type).m23844r(true);
                int i4 = textEntity.offset;
                spannableStringBuilder.setSpan(oVar, i4, textEntity.length + i4, 33);
            }
            i++;
            typeface2 = null;
        }
        return spannableStringBuilder != null ? spannableStringBuilder : str;
    }

    public static String m25396x1(TdApi.Venue venue) {
        if (!"foursquare".equals(venue.provider) || C5070i.m24061i(venue.type)) {
            return null;
        }
        return "https://ss3.4sqi.net/img/categories_v2/" + venue.type + "_88.png";
    }

    public static boolean m25395x2(TdApi.FormattedText formattedText, String str) {
        TdApi.TextEntity[] textEntityArr;
        if (!C7321e.m16965a1(formattedText) && (textEntityArr = formattedText.entities) != null) {
            for (TdApi.TextEntity textEntity : textEntityArr) {
                if (textEntity.type.getConstructor() == -1023958307 && str.equals(C7321e.m16911s1(formattedText.text, textEntity))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static boolean m25394x3(String str) {
        return !str.startsWith("X") && str.endsWith("-raw");
    }

    public static boolean m25393x4(TdApi.ChatNotificationSettings chatNotificationSettings, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        return chatNotificationSettings != null && !chatNotificationSettings.useDefaultMuteFor && chatNotificationSettings.muteFor > 0;
    }

    public static TdApi.TextEntity[] m25392x5(CharSequence charSequence, boolean z) {
        CharacterStyle[] characterStyleArr;
        if (!(!(charSequence instanceof Spanned) || (characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), CharacterStyle.class)) == null || characterStyleArr.length == 0)) {
            ArrayList arrayList = null;
            for (CharacterStyle characterStyle : characterStyleArr) {
                TdApi.TextEntityType[] y5 = m25385y5(characterStyle);
                if (!(y5 == null || y5.length == 0)) {
                    Spanned spanned = (Spanned) charSequence;
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyle);
                    for (TdApi.TextEntityType textEntityType : y5) {
                        if (!z || textEntityType.getConstructor() == 445719651) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new TdApi.TextEntity(spanStart, spanEnd - spanStart, textEntityType));
                        }
                    }
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                m25404w0(arrayList);
                return (TdApi.TextEntity[]) arrayList.toArray(new TdApi.TextEntity[0]);
            }
        }
        return null;
    }

    public static boolean m25390y0(long j, TdApi.Message[] messageArr, boolean z, boolean z2, TdApi.MessageSendOptions messageSendOptions, ArrayList<TdApi.Function> arrayList) {
        int i;
        TdApi.Message message;
        int i2;
        TdApi.Message[] messageArr2 = messageArr;
        if (messageArr2.length == 0) {
            return false;
        }
        long j2 = 0;
        int length = messageArr2.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            TdApi.Message message2 = messageArr2[i3];
            if (message2.chatId != j2) {
                if (i4 > 0) {
                    long[] N1 = m25638N1(messageArr2, i5, i4);
                    i = length;
                    message = message2;
                    i2 = i5;
                    arrayList.add(new TdApi.ForwardMessages(j, j2, N1, messageSendOptions, z, z2, false));
                } else {
                    i = length;
                    message = message2;
                    i2 = i5;
                }
                i5 = i2 + i4;
                j2 = message.chatId;
                i4 = 0;
            } else {
                i = length;
            }
            i4++;
            i3++;
            messageArr2 = messageArr;
            length = i;
        }
        int i6 = i5;
        if (i4 > 0) {
            arrayList.add(new TdApi.ForwardMessages(j, j2, m25638N1(messageArr, i6, i4), messageSendOptions, z, z2, false));
        }
        return true;
    }

    public static String m25389y1(String str) {
        return C4403w.m27869i1(R.string.url_translationsPrefix) + str;
    }

    public static boolean m25388y2(int i) {
        return i > 0 && i <= 2;
    }

    public static boolean m25387y3(TdApi.ChatMemberStatus chatMemberStatus) {
        int constructor = chatMemberStatus.getConstructor();
        return constructor == -1653518666 || constructor == 1661432998;
    }

    public static boolean m25386y4(TdApi.Poll poll) {
        if (poll.isClosed) {
            return true;
        }
        for (TdApi.PollOption pollOption : poll.options) {
            if (pollOption.isChosen) {
                return true;
            }
        }
        return false;
    }

    public static TdApi.TextEntityType[] m25385y5(CharacterStyle characterStyle) {
        if (!m25668J(characterStyle)) {
            return null;
        }
        if (characterStyle instanceof C5132o) {
            return new TdApi.TextEntityType[]{((C5132o) characterStyle).m23860b()};
        }
        if (characterStyle instanceof URLSpan) {
            String url = ((URLSpan) characterStyle).getURL();
            if (!C1363c0.m37457Q(url)) {
                return null;
            }
            return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeTextUrl(url)};
        } else if (characterStyle instanceof StyleSpan) {
            int style = ((StyleSpan) characterStyle).getStyle();
            if (style == 1) {
                return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeBold()};
            }
            if (style == 2) {
                return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeItalic()};
            }
            if (style != 3) {
                return null;
            }
            return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeBold(), new TdApi.TextEntityTypeItalic()};
        } else if ((characterStyle instanceof TypefaceSpan) && "monospace".equals(((TypefaceSpan) characterStyle).getFamily())) {
            return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeCode()};
        } else {
            if (characterStyle instanceof BackgroundColorSpan) {
                if (((BackgroundColorSpan) characterStyle).getBackgroundColor() == -5658199) {
                    return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeSpoiler()};
                }
                return null;
            } else if (characterStyle instanceof StrikethroughSpan) {
                return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeStrikethrough()};
            } else {
                if (characterStyle instanceof UnderlineSpan) {
                    return new TdApi.TextEntityType[]{new TdApi.TextEntityTypeUnderline()};
                }
                return null;
            }
        }
    }

    public static TdApi.Message m25383z0(C10930q6 q6Var, List<TdApi.Message> list) {
        TdApi.Message message = null;
        for (TdApi.Message message2 : list) {
            if (!C7321e.m16965a1(q6Var.m2141z5(message2))) {
                if (message != null) {
                    return null;
                }
                message = message2;
            }
        }
        return message;
    }

    public static int m25382z1(TdApi.User user) {
        if (user.type.getConstructor() == 1262387765) {
            return 0;
        }
        switch (user.status.getConstructor()) {
            case TdApi.UserStatusOnline.CONSTRUCTOR:
                return ((TdApi.UserStatusOnline) user.status).expires;
            case TdApi.UserStatusOffline.CONSTRUCTOR:
                return ((TdApi.UserStatusOffline) user.status).wasOnline;
            case TdApi.UserStatusRecently.CONSTRUCTOR:
                return ((int) (System.currentTimeMillis() / 1000)) - 259200;
            case TdApi.UserStatusLastWeek.CONSTRUCTOR:
                return ((int) (System.currentTimeMillis() / 1000)) - 518400;
            case TdApi.UserStatusLastMonth.CONSTRUCTOR:
                return ((int) (System.currentTimeMillis() / 1000)) - 1209600;
            default:
                return 0;
        }
    }

    public static boolean m25381z2(TdApi.WebPage webPage) {
        return webPage != null && m25388y2(webPage.instantViewVersion);
    }

    public static boolean m25380z3(TdApi.Message message, TdApi.Message message2, boolean z) {
        if (!(message == null || message2 == null)) {
            TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
            if ((messageForwardInfo == null) == (message2.forwardInfo != null)) {
                return false;
            }
            if (messageForwardInfo == null) {
                return message.chatId == message2.chatId;
            }
            if (messageForwardInfo.origin.getConstructor() == message2.forwardInfo.origin.getConstructor()) {
                TdApi.MessageForwardInfo messageForwardInfo2 = message.forwardInfo;
                if (messageForwardInfo2.fromChatId == message2.forwardInfo.fromChatId && z) {
                    switch (messageForwardInfo2.origin.getConstructor()) {
                        case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                            return C5070i.m24067c(((TdApi.MessageForwardOriginMessageImport) message.forwardInfo.origin).senderName, ((TdApi.MessageForwardOriginMessageImport) message2.forwardInfo.origin).senderName);
                        case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                            return ((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId == ((TdApi.MessageForwardOriginUser) message2.forwardInfo.origin).senderUserId;
                        case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                            return ((TdApi.MessageForwardOriginHiddenUser) message.forwardInfo.origin).senderName.equals(((TdApi.MessageForwardOriginHiddenUser) message2.forwardInfo.origin).senderName);
                        case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                            TdApi.MessageForwardOrigin messageForwardOrigin = message.forwardInfo.origin;
                            long j = ((TdApi.MessageForwardOriginChannel) messageForwardOrigin).chatId;
                            TdApi.MessageForwardOrigin messageForwardOrigin2 = message2.forwardInfo.origin;
                            return j == ((TdApi.MessageForwardOriginChannel) messageForwardOrigin2).chatId && C5070i.m24067c(((TdApi.MessageForwardOriginChannel) messageForwardOrigin).authorSignature, ((TdApi.MessageForwardOriginChannel) messageForwardOrigin2).authorSignature);
                        case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                            TdApi.MessageForwardOrigin messageForwardOrigin3 = message.forwardInfo.origin;
                            long j2 = ((TdApi.MessageForwardOriginChat) messageForwardOrigin3).senderChatId;
                            TdApi.MessageForwardOrigin messageForwardOrigin4 = message2.forwardInfo.origin;
                            return j2 == ((TdApi.MessageForwardOriginChat) messageForwardOrigin4).senderChatId && C5070i.m24067c(((TdApi.MessageForwardOriginChat) messageForwardOrigin3).authorSignature, ((TdApi.MessageForwardOriginChat) messageForwardOrigin4).authorSignature);
                    }
                }
            }
        }
        return false;
    }

    public static boolean m25379z4(TdApi.ChatMemberStatus chatMemberStatus) {
        switch (chatMemberStatus.getConstructor()) {
            case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                return true;
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) chatMemberStatus;
                return !C5070i.m24061i(chatMemberStatusCreator.customTitle) || chatMemberStatusCreator.isAnonymous;
            case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) chatMemberStatus;
                return !chatMemberStatusAdministrator.canChangeInfo || !chatMemberStatusAdministrator.canDeleteMessages || !chatMemberStatusAdministrator.canInviteUsers || !chatMemberStatusAdministrator.canRestrictMembers || !chatMemberStatusAdministrator.canPinMessages || !chatMemberStatusAdministrator.canManageVideoChats || chatMemberStatusAdministrator.canPromoteMembers || !C5070i.m24061i(chatMemberStatusAdministrator.customTitle) || chatMemberStatusAdministrator.isAnonymous;
            default:
                return false;
        }
    }

    public static String m25378z5(TdApi.Object object) {
        if (object == null) {
            return "Unknown error (null)";
        }
        if (object.getConstructor() != -1679978726) {
            return "not an error";
        }
        TdApi.Error error = (TdApi.Error) object;
        return m25634N5(error.code, error.message);
    }
}
