package hd;

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
import ce.a0;
import ce.c0;
import ce.e0;
import ce.j0;
import ce.v;
import de.r9;
import de.y00;
import gd.l;
import gd.w;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.o;
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
import je.l0;
import mb.p;
import md.j;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.d9;
import zd.hj;
import zd.l1;
import zd.o6;
import zd.ya;

public class t2 {
    public static final int[] f13537a = {R.id.theme_color_avatarRed, R.id.theme_color_avatarOrange, R.id.theme_color_avatarYellow, R.id.theme_color_avatarGreen, R.id.theme_color_avatarCyan, R.id.theme_color_avatarBlue, R.id.theme_color_avatarViolet, R.id.theme_color_avatarPink};
    public static final f f13538b = new f("🖼", R.drawable.baseline_camera_alt_16);
    public static final f f13539c = new f("🎥", R.drawable.baseline_videocam_16);
    public static final f f13540d = new f("📹", R.drawable.deproko_baseline_msg_video_16);
    public static final f f13541e = new f("🔥", R.drawable.deproko_baseline_whatshot_16);
    public static final f f13542f = new f("🔥", R.drawable.deproko_baseline_whatshot_16);
    public static final f f13543g = new f("🔗", R.drawable.baseline_link_16);
    public static final f f13544h = new f("🎮", R.drawable.baseline_videogame_asset_16);
    public static final f f13545i = new f("👥", R.drawable.baseline_group_16);
    public static final f f13546j = new f("🎨", R.drawable.baseline_palette_16);
    public static final f f13547k = new f("👥", R.drawable.baseline_group_add_16);
    public static final f f13548l = new f("📢", R.drawable.baseline_bullhorn_16);
    public static final f f13549m = new f("📎", R.drawable.baseline_insert_drive_file_16);
    public static final f f13550n = new f("🎵", R.drawable.baseline_music_note_16);
    public static final f f13551o = new f("👤", R.drawable.baseline_person_16);
    public static final f f13552p = new f("📊", R.drawable.baseline_poll_16);
    public static final f f13553q = new f("❓", R.drawable.baseline_help_16);
    public static final f f13554r = new f("🎤", R.drawable.baseline_mic_16);
    public static final f f13555s = new f("👾", R.drawable.deproko_baseline_gif_filled_16);
    public static final f f13556t = new f("📌", R.drawable.baseline_gps_fixed_16);
    public static final f f13557u = new f("💸", R.drawable.baseline_receipt_16);
    public static final f f13558v = new f("🎉", R.drawable.baseline_party_popper_16);
    public static final f f13559w = new f("📸", R.drawable.round_warning_16);
    public static final f f13560x = new f("📌", R.drawable.deproko_baseline_pin_16);
    public static final f f13561y = new f("🖼", R.drawable.baseline_collections_16);
    public static final f f13562z = new f("🖼", R.drawable.baseline_collections_16);
    public static final f A = new f("🎵", R.drawable.ivanliana_baseline_audio_collections_16);
    public static final f B = new f("📎", R.drawable.ivanliana_baseline_file_collections_16);
    public static final f C = new f("🎥", R.drawable.ivanliana_baseline_video_collections_16);
    public static final f D = new f("↩", R.drawable.baseline_share_arrow_16);
    public static final f E = new f("\u1f9ee", R.drawable.baseline_bar_chart_24);
    public static final f F = new f("🎯", R.drawable.baseline_gps_fixed_16);
    public static final f G = new f("🎲", R.drawable.baseline_casino_16);
    public static final f H = new f("🎲", R.drawable.belledeboheme_baseline_dice_1_16);
    public static final f I = new f("🎲", R.drawable.belledeboheme_baseline_dice_2_16);
    public static final f J = new f("🎲", R.drawable.belledeboheme_baseline_dice_3_16);
    public static final f K = new f("🎲", R.drawable.belledeboheme_baseline_dice_4_16);
    public static final f L = new f("🎲", R.drawable.belledeboheme_baseline_dice_5_16);
    public static final f M = new f("🎲", R.drawable.belledeboheme_baseline_dice_6_16);
    public static final f N = new f("📞", R.drawable.baseline_call_16);
    public static final f O = new f("⏲", R.drawable.baseline_timer_16);
    public static final f P = new f("⏲", R.drawable.baseline_timer_off_16);
    public static final f Q = new f("📞", R.drawable.baseline_call_end_16);
    public static final f R = new f("☎", R.drawable.baseline_call_missed_18);
    public static final f S = new f("☎", R.drawable.baseline_call_received_18);
    public static final f T = new f("⚠", R.drawable.baseline_warning_18);
    public static final f U = new f("ℹ", R.drawable.baseline_info_18);
    public static final f V = new f("ℹ", R.drawable.baseline_error_18);
    public static final f W = new f("🔒", R.drawable.baseline_lock_16);

    public class a extends ClickableSpan {
        public final o f13563a;

        public a(o oVar) {
            this.f13563a = oVar;
        }

        @Override
        public void onClick(View view) {
            this.f13563a.c().a(view, this.f13563a);
        }
    }

    public class b extends ClickableSpan {
        public final o f13564a;

        public b(o oVar) {
            this.f13564a = oVar;
        }

        @Override
        public void onClick(View view) {
            this.f13564a.f(view);
        }
    }

    public static class c {
        public final int f13565a;
        public final int f13566b;

        public c(int i10, int i11) {
            this.f13565a = i10;
            this.f13566b = i11;
        }
    }

    public static class d {
        public final f f13567a;
        public final f f13568b;
        public final int f13569c;
        public final TdApi.FormattedText f13570d;
        public final boolean f13571e;
        public final boolean f13572f;
        public b f13573g;
        public boolean f13574h;
        public o6.f f13575i;

        public interface a {
            void a(long j10, long j11, d dVar);

            void b(long j10, long j11, d dVar, d dVar2);
        }

        public interface b {
            void a(d dVar, a aVar);
        }

        public d(f fVar, int i10) {
            this(fVar, i10, (TdApi.FormattedText) null);
        }

        public TdApi.FormattedText b(boolean z10) {
            String str;
            f fVar = this.f13567a;
            if (fVar == null || (z10 && fVar.f13582b != 0)) {
                if (!ob.e.c1(this.f13570d)) {
                    return this.f13570d;
                }
                int i10 = this.f13569c;
                return new TdApi.FormattedText(i10 != 0 ? w.i1(i10) : "", null);
            } else if (ob.e.c1(this.f13570d)) {
                if (this.f13569c != 0) {
                    str = this.f13567a.f13581a + " " + w.i1(this.f13569c);
                } else {
                    str = this.f13567a.f13581a;
                }
                return new TdApi.FormattedText(str, null);
            } else if (this.f13570d.text.startsWith(this.f13567a.f13581a)) {
                return this.f13570d;
            } else {
                return t2.O5(this.f13567a.f13581a + " ", this.f13570d);
            }
        }

        public String c(boolean z10) {
            f fVar = this.f13567a;
            if (fVar == null || (z10 && fVar.f13582b != 0)) {
                if (!ob.e.c1(this.f13570d)) {
                    return this.f13570d.text;
                }
                int i10 = this.f13569c;
                return i10 != 0 ? w.i1(i10) : "";
            } else if (ob.e.c1(this.f13570d)) {
                if (this.f13569c == 0) {
                    return this.f13567a.f13581a;
                }
                return this.f13567a.f13581a + " " + w.i1(this.f13569c);
            } else if (this.f13570d.text.startsWith(this.f13567a.f13581a)) {
                return this.f13570d.text;
            } else {
                return this.f13567a.f13581a + " " + this.f13570d.text;
            }
        }

        public o6.f d() {
            return this.f13575i;
        }

        public boolean e() {
            return this.f13573g != null;
        }

        public boolean f() {
            return this.f13574h;
        }

        public void g(a aVar) {
            b bVar = this.f13573g;
            if (bVar != null) {
                bVar.a(this, aVar);
            }
        }

        public d h(b bVar, boolean z10) {
            this.f13573g = bVar;
            this.f13574h = z10;
            return this;
        }

        public String toString() {
            return c(false);
        }

        public d(f fVar, int i10, String str) {
            this(fVar, i10, !i.i(str) ? new TdApi.FormattedText(str, null) : null, false);
        }

        public d(f fVar, int i10, TdApi.FormattedText formattedText) {
            this(fVar, i10, formattedText, false);
        }

        public d(String str, boolean z10) {
            this((f) null, 0, str, z10);
        }

        public d(TdApi.FormattedText formattedText, boolean z10) {
            this((f) null, 0, formattedText, z10);
        }

        public d(f fVar, int i10, TdApi.FormattedText formattedText, boolean z10) {
            this(fVar, i10, formattedText, z10, false, null);
        }

        public d(f fVar, int i10, String str, boolean z10) {
            this(fVar, i10, i.i(str) ? null : new TdApi.FormattedText(str, null), z10, false, null);
        }

        public d(f fVar, d dVar) {
            this(dVar.f13567a, dVar.f13569c, dVar.f13570d, dVar.f13571e, dVar.f13572f, fVar);
        }

        public d(f fVar, int i10, TdApi.FormattedText formattedText, boolean z10, boolean z11, f fVar2) {
            this.f13567a = fVar;
            this.f13569c = i10;
            this.f13570d = formattedText;
            this.f13571e = z10;
            this.f13572f = z11;
            this.f13568b = fVar2;
        }
    }

    public static class e {
        public final TdApi.File f13576a;
        public final String f13577b;
        public final String f13578c;
        public final int f13579d;
        public final TdApi.FileType f13580e;

        public e(TdApi.File file, String str, String str2, TdApi.FileType fileType) {
            this.f13576a = file;
            this.f13579d = file.size;
            this.f13577b = v0.T0(str);
            this.f13578c = str2;
            this.f13580e = fileType;
        }

        public static e h(TdApi.Animation animation) {
            return new e(animation.animation, animation.fileName, animation.mimeType, new TdApi.FileTypeAnimation());
        }

        public static e i(TdApi.Audio audio) {
            return new e(audio.audio, audio.fileName, audio.mimeType, new TdApi.FileTypeAudio());
        }

        public static e j(TdApi.Document document) {
            return new e(document.document, document.fileName, document.mimeType, new TdApi.FileTypeDocument());
        }

        public static e k(TdApi.Video video) {
            return new e(video.video, video.fileName, video.mimeType, new TdApi.FileTypeVideo());
        }

        public static e l(TdApi.VoiceNote voiceNote) {
            return new e(voiceNote.voice, "voice.ogg", voiceNote.mimeType, new TdApi.FileTypeVoiceNote());
        }

        public static e m(TdApi.File file, boolean z10) {
            return new e(file, z10 ? "image.webp" : "image.jpg", z10 ? "image/webp" : "image/jpg", new TdApi.FileTypePhoto());
        }

        public TdApi.File c() {
            return this.f13576a;
        }

        public int d() {
            return this.f13576a.f19913id;
        }

        public String e(int i10) {
            String str;
            int lastIndexOf;
            if (!i.i(this.f13577b)) {
                str = this.f13577b;
            } else {
                str = !i.i(this.f13578c) ? e0.a(this.f13578c) : null;
            }
            if (i.i(str)) {
                str = "telegramdownload." + d();
            }
            if (i10 == 0) {
                return str;
            }
            if (str.lastIndexOf(46) != -1) {
                return str.substring(0, lastIndexOf) + " (" + i10 + ")" + str.substring(lastIndexOf);
            }
            return str + " (" + i10 + ")";
        }

        public TdApi.FileType f() {
            return this.f13580e;
        }

        public String g() {
            return this.f13576a.local.path;
        }
    }

    public static final class f {
        public final String f13581a;
        public final int f13582b;

        public f(String str, int i10) {
            this.f13581a = str;
            this.f13582b = i10;
        }

        public String toString() {
            return this.f13581a;
        }
    }

    public static class g {
        public long f13583a;
        public String f13584b;
        public String f13585c;
    }

    public static final class h extends fb.a {
        @Override
        public boolean a(char c10) {
            return t2.u4(c10);
        }
    }

    public static d A0(final o6 o6Var, final TdApi.Message message, final o6.f fVar, final boolean z10) {
        f fVar2;
        int i10;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (TdApi.Message message2 : fVar.f28132a) {
            ib.b.q(sparseIntArray, message2.content.getConstructor());
        }
        switch (sparseIntArray.size() == 1 ? sparseIntArray.keyAt(0) : 0) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                i10 = R.string.xPhotos;
                fVar2 = f13562z;
                break;
            case TdApi.MessageAudio.CONSTRUCTOR:
                i10 = R.string.xAudios;
                fVar2 = A;
                break;
            case TdApi.MessageDocument.CONSTRUCTOR:
                i10 = R.string.xFiles;
                fVar2 = B;
                break;
            case TdApi.MessageVideo.CONSTRUCTOR:
                i10 = R.string.xVideos;
                fVar2 = C;
                break;
            default:
                i10 = R.string.xMedia;
                fVar2 = f13561y;
                break;
        }
        TdApi.Message z02 = z10 ? z0(o6Var, fVar.f28132a) : null;
        TdApi.FormattedText y12 = z02 != null ? ob.e.y1(z02.content) : null;
        d dVar = new d(fVar2, 0, ob.e.c1(y12) ? new TdApi.FormattedText(w.o2(i10, fVar.f28132a.size()), null) : y12, ob.e.c1(y12));
        dVar.f13575i = fVar;
        if (fVar.a()) {
            dVar.h(new d.b() {
                @Override
                public final void a(t2.d dVar2, t2.d.a aVar) {
                    t2.W3(o6.this, message, fVar, z10, dVar2, aVar);
                }
            }, true);
        }
        return dVar;
    }

    public static je.e A1() {
        return D1(null, null, "?");
    }

    public static boolean A2(TdApi.User user) {
        return user != null && !i.i(user.phoneNumber);
    }

    public static boolean A3(TdApi.Message message) {
        return (message == null || message.schedulingState == null) ? false : true;
    }

    public static o A4(String str) {
        boolean M0 = je.g.M0(str);
        return new o(M0 ? null : ce.o.i(), 0).k(M0).j(new TdApi.TextEntityTypeBold());
    }

    public static TdApi.FormattedText A5(CharSequence charSequence, boolean z10) {
        return new TdApi.FormattedText(charSequence.toString(), x5(charSequence, z10));
    }

    public static int B0(int i10) {
        return C0(i10, true);
    }

    public static je.e B1(String str) {
        return D1(str, null, null);
    }

    public static boolean B2(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2) {
        boolean z10 = chatPermissions.canSendMessages;
        boolean z11 = chatPermissions2.canSendMessages;
        if (z10 == z11 || !z11) {
            boolean z12 = chatPermissions.canSendMediaMessages;
            boolean z13 = chatPermissions2.canSendMediaMessages;
            if (z12 == z13 || !z13) {
                boolean z14 = chatPermissions.canSendOtherMessages;
                boolean z15 = chatPermissions2.canSendOtherMessages;
                if (z14 == z15 || !z15) {
                    boolean z16 = chatPermissions.canAddWebPagePreviews;
                    boolean z17 = chatPermissions2.canAddWebPagePreviews;
                    if (z16 == z17 || !z17) {
                        boolean z18 = chatPermissions.canSendPolls;
                        boolean z19 = chatPermissions2.canSendPolls;
                        if (z18 == z19 || !z19) {
                            boolean z20 = chatPermissions.canInviteUsers;
                            boolean z21 = chatPermissions2.canInviteUsers;
                            if (z20 == z21 || !z21) {
                                boolean z22 = chatPermissions.canPinMessages;
                                boolean z23 = chatPermissions2.canPinMessages;
                                if (z22 == z23 || !z23) {
                                    boolean z24 = chatPermissions.canChangeInfo;
                                    boolean z25 = chatPermissions2.canChangeInfo;
                                    if (z24 == z25 || !z25) {
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

    public static boolean B3(TdApi.InputMessageContent inputMessageContent) {
        int i10;
        int constructor = inputMessageContent.getConstructor();
        if (constructor != -2108486755) {
            i10 = constructor != 1648801584 ? 0 : ((TdApi.InputMessagePhoto) inputMessageContent).ttl;
        } else {
            i10 = ((TdApi.InputMessageVideo) inputMessageContent).ttl;
        }
        return i10 != 0 && i10 <= 60;
    }

    public static TdApi.Audio B4(TdApi.Document document) {
        String str = document.fileName;
        return new TdApi.Audio(0, str, "", str, document.mimeType, document.minithumbnail, document.thumbnail, document.document);
    }

    public static List<TdApi.Function> B5(long j10, long j11, long j12, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageContent[] inputMessageContentArr, boolean z10) {
        TdApi.InputMessageContent[] inputMessageContentArr2;
        if (inputMessageContentArr.length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = inputMessageContentArr.length;
        boolean z11 = z10 && inputMessageContentArr.length <= 10;
        int i10 = 0;
        do {
            int min = z10 ? Math.min(length, 10) : 1;
            int Z0 = Z0(inputMessageContentArr[i10 + 0]);
            int i11 = 0;
            while (Z0 != 0 && Z0(inputMessageContentArr[i10 + i11]) == Z0) {
                i11++;
                min--;
                if (min <= 0) {
                    break;
                }
            }
            if (i11 == 0) {
                i11 = 1;
            }
            if (!z11 || i11 != inputMessageContentArr.length) {
                TdApi.InputMessageContent[] inputMessageContentArr3 = new TdApi.InputMessageContent[i11];
                System.arraycopy(inputMessageContentArr, i10, inputMessageContentArr3, 0, i11);
                inputMessageContentArr2 = inputMessageContentArr3;
            } else {
                inputMessageContentArr2 = inputMessageContentArr;
            }
            if (i11 == 1) {
                arrayList.add(new TdApi.SendMessage(j10, j11, arrayList.isEmpty() ? j12 : 0L, messageSendOptions, null, inputMessageContentArr2[0]));
            } else {
                arrayList.add(new TdApi.SendMessageAlbum(j10, j11, arrayList.isEmpty() ? j12 : 0L, messageSendOptions, inputMessageContentArr2, false));
            }
            length -= i11;
            i10 += i11;
        } while (length > 0);
        return arrayList;
    }

    public static String C(o6 o6Var, TdApi.Message message, boolean z10) {
        return D(o6Var, message, z10, false, null);
    }

    public static int C0(int i10, boolean z10) {
        if (z10 && ib.f.h(i10)) {
            return 11;
        }
        if (!ib.f.o(i10)) {
            return 0;
        }
        long j10 = i10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (ib.f.m(j10, timeUnit)) {
            return 1;
        }
        if (ib.f.p(j10, timeUnit)) {
            return 2;
        }
        return ib.f.c(i10) + 3;
    }

    public static je.e C1(String str, String str2) {
        return D1(str, str2, null);
    }

    public static boolean C2(TdApi.Poll poll) {
        for (TdApi.PollOption pollOption : poll.options) {
            if (pollOption.isBeingChosen) {
                return true;
            }
        }
        return false;
    }

    public static boolean C3(TdApi.Message message) {
        return ob.e.i1(message.content);
    }

    public static TdApi.Message C4(long j10, TdApi.MessageSender messageSender, TdApi.MessageContent messageContent) {
        TdApi.Message message = new TdApi.Message();
        message.chatId = j10;
        message.senderId = messageSender;
        message.content = messageContent;
        return message;
    }

    public static j C5(o6 o6Var, TdApi.Thumbnail thumbnail) {
        if (thumbnail == null) {
            return null;
        }
        int constructor = thumbnail.format.getConstructor();
        if (constructor == -660084953 || constructor == 278616062) {
            TdApi.File file = thumbnail.file;
            thumbnail.format.getConstructor();
            j jVar = new j(o6Var, file, 2);
            jVar.F(true);
            return jVar;
        } else if (constructor != 1315522642) {
            return null;
        } else {
            j jVar2 = new j(o6Var, thumbnail.file, 3);
            jVar2.F(true);
            return jVar2;
        }
    }

    public static String D(o6 o6Var, TdApi.Message message, boolean z10, boolean z11, kb.i iVar) {
        String E2 = E(o6Var, message, z10 ? 1 : 0, iVar);
        return (i.i(E2) || z11) ? E2 : c0.f0(E2);
    }

    public static ld.h D0(o6 o6Var, TdApi.Chat chat) {
        if (chat != null) {
            return E0(o6Var, chat.photo);
        }
        return null;
    }

    public static je.e D1(String str, String str2, String str3) {
        int n42;
        String Q4 = Q4(str2, false, false);
        if (i.i(Q4) && !i.i(str) && str.length() > 2 && (n42 = n4(str, false)) != -1) {
            Q4 = Q4(str.substring(n42 + 1), false, false);
        }
        String Q42 = Q4(str, false, true);
        if (!i.i(Q42) && !i.i(Q4)) {
            Q42 = Q42 + Q4;
        } else if (i.i(Q42)) {
            if (!i.i(Q4)) {
                int n43 = n4(str2, false);
                if (n43 != -1) {
                    Q42 = Q4(str2.substring(n43 + 1), false, false);
                }
                if (!i.i(Q42)) {
                    Q4 = Q4 + Q42;
                }
                Q42 = Q4;
            } else {
                if (i.i(str3)) {
                    str3 = "…";
                }
                Q42 = str3;
            }
        }
        return new je.e(Q42);
    }

    public static boolean D2(TdApi.Audio audio) {
        return !i.i(audio.performer) || (!i.i(audio.fileName) && !i.c(audio.fileName, audio.title));
    }

    public static boolean D3(TdApi.SecretChat secretChat) {
        return secretChat != null && secretChat.state.getConstructor() == -1611352087;
    }

    public static TdApi.Message D4(TdApi.Audio audio) {
        return C4(0L, null, new TdApi.MessageAudio(audio, new TdApi.FormattedText("", null)));
    }

    public static ld.h D5(o6 o6Var, TdApi.Thumbnail thumbnail) {
        if (thumbnail == null) {
            return null;
        }
        switch (thumbnail.format.getConstructor()) {
            case TdApi.ThumbnailFormatJpeg.CONSTRUCTOR:
            case TdApi.ThumbnailFormatGif.CONSTRUCTOR:
            case TdApi.ThumbnailFormatPng.CONSTRUCTOR:
                return new ld.h(o6Var, thumbnail.file);
            case TdApi.ThumbnailFormatWebp.CONSTRUCTOR:
                ld.h hVar = new ld.h(o6Var, thumbnail.file);
                hVar.x0();
                return hVar;
            default:
                return null;
        }
    }

    public static String E(o6 o6Var, TdApi.Message message, int i10, kb.i iVar) {
        String str;
        if (message == null || message.content == null) {
            v0.G2(iVar, true);
            return w.i1(R.string.DeletedMessage);
        } else if (!i.i(message.restrictionReason) && he.i.c2().P2()) {
            return message.restrictionReason;
        } else {
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            int constructor = message.content.getConstructor();
            int i11 = R.string.YouCreatedGroup;
            String str2 = null;
            TdApi.Sticker sticker = null;
            str2 = null;
            int i12 = R.string.Location;
            switch (constructor) {
                case TdApi.MessageVenue.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.Location);
                case TdApi.MessageInvoice.CONSTRUCTOR:
                    v0.G2(iVar, false);
                    return ((TdApi.MessageInvoice) message.content).title;
                case TdApi.MessagePhoto.CONSTRUCTOR:
                    String str3 = ((TdApi.MessagePhoto) message.content).caption.text;
                    if (!z10 || i.i(str3)) {
                        v0.G2(iVar, true);
                        return w.i1(R.string.ChatContentPhoto);
                    } else if (z11) {
                        v0.G2(iVar, true);
                        return w.j1(R.string.ChatContentWithCaption, w.i1(R.string.ChatContentPhoto), str3);
                    } else {
                        v0.G2(iVar, false);
                        return str3;
                    }
                case TdApi.MessageUnsupported.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.UnsupportedMessageType);
                case TdApi.MessageScreenshotTaken.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return s3(message) ? w.i1(R.string.YouTookAScreenshot) : w.j1(R.string.XTookAScreenshot, o6Var.Db(message.senderId, true));
                case TdApi.MessageContactRegistered.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.j1(R.string.NotificationContactJoined, o6Var.Db(message.senderId, true));
                case TdApi.MessageExpiredPhoto.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.AttachPhotoExpired);
                case TdApi.MessageExpiredVideo.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.AttachVideoExpired);
                case TdApi.MessageWebsiteConnected.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.j1(R.string.BotWebsiteAllowed, ((TdApi.MessageWebsiteConnected) message.content).domainName);
                case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    if (message.isChannelPost) {
                        return w.i1(R.string.ActionChannelChangedPhoto);
                    }
                    return s3(message) ? w.i1(R.string.group_photo_changed_you) : w.j1(R.string.group_photo_changed, o6Var.Db(message.senderId, true));
                case TdApi.MessagePoll.CONSTRUCTOR:
                    String str4 = ((TdApi.MessagePoll) message.content).poll.question;
                    v0.G2(iVar, false);
                    return str4;
                case TdApi.MessageContact.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.AttachContact);
                case TdApi.MessageSupergroupChatCreate.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    if (!s3(message)) {
                        return message.isChannelPost ? w.i1(R.string.ActionCreateChannel) : w.j1(R.string.XCreatedGroup, o6Var.Db(message.senderId, true));
                    }
                    if (message.isChannelPost) {
                        i11 = R.string.YouCreatedChannel;
                    }
                    return w.i1(i11);
                case TdApi.MessageChatDeletePhoto.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    if (message.isChannelPost) {
                        return w.i1(R.string.ActionChannelRemovedPhoto);
                    }
                    return s3(message) ? w.i1(R.string.group_photo_deleted_you) : w.j1(R.string.group_photo_deleted, o6Var.Db(message.senderId, true));
                case TdApi.MessageGame.CONSTRUCTOR:
                    v0.G2(iVar, false);
                    return w1(((TdApi.MessageGame) message.content).game, false);
                case TdApi.MessageChatUpgradeTo.CONSTRUCTOR:
                case TdApi.MessageChatUpgradeFrom.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.GroupUpgraded);
                case TdApi.MessageAudio.CONSTRUCTOR:
                    TdApi.MessageContent messageContent = message.content;
                    TdApi.Audio audio = ((TdApi.MessageAudio) messageContent).audio;
                    String str5 = ((TdApi.MessageAudio) messageContent).caption.text;
                    String j12 = w.j1(R.string.ChatContentSong, m2(audio), f2(audio));
                    if (!z10 || i.i(str5)) {
                        v0.G2(iVar, true);
                        return j12;
                    } else if (z11) {
                        v0.G2(iVar, true);
                        return w.j1(R.string.ChatContentWithCaption, j12, str5);
                    } else {
                        v0.G2(iVar, false);
                        return str5;
                    }
                case TdApi.MessageLocation.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    if (((TdApi.MessageLocation) message.content).livePeriod > 0) {
                        i12 = R.string.AttachLiveLocation;
                    }
                    return w.i1(i12);
                case TdApi.MessageVoiceNote.CONSTRUCTOR:
                    String str6 = ((TdApi.MessageVoiceNote) message.content).caption.text;
                    if (!z10 || i.i(str6)) {
                        v0.G2(iVar, true);
                        return w.i1(R.string.ChatContentVoice);
                    } else if (z11) {
                        v0.G2(iVar, true);
                        return w.j1(R.string.ChatContentWithCaption, w.i1(R.string.ChatContentVoice), str6);
                    } else {
                        v0.G2(iVar, false);
                        return str6;
                    }
                case TdApi.MessageCall.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    TdApi.MessageCall messageCall = (TdApi.MessageCall) message.content;
                    boolean s32 = s3(message);
                    int constructor2 = messageCall.discardReason.getConstructor();
                    if (constructor2 == -1729926094) {
                        str = w.i1(s32 ? R.string.OutgoingCallBusy : R.string.CallMessageIncomingDeclined);
                    } else if (constructor2 != 1680358012) {
                        str = w.i1(s32 ? R.string.OutgoingCall : R.string.IncomingCall);
                    } else {
                        str = w.i1(s32 ? R.string.CallMessageOutgoingMissed : R.string.MissedCall);
                    }
                    int i13 = messageCall.duration;
                    return i13 > 0 ? w.j1(R.string.ChatContentCallWithDuration, str, w.x0(i13)) : str;
                case TdApi.MessageDocument.CONSTRUCTOR:
                    TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
                    String str7 = messageDocument.caption.text;
                    TdApi.Document document = messageDocument.document;
                    if (document != null && !i.i(document.fileName)) {
                        str2 = messageDocument.document.fileName;
                    }
                    if (!z10 || i.i(str7)) {
                        if (str2 != null) {
                            v0.G2(iVar, false);
                            return str2;
                        }
                        v0.G2(iVar, true);
                        return w.i1(R.string.ChatContentFile);
                    } else if (z11) {
                        if (str2 == null) {
                            str2 = w.i1(R.string.ChatContentFile);
                        }
                        v0.G2(iVar, true);
                        return w.j1(R.string.ChatContentWithCaption, str2, str7);
                    } else {
                        v0.G2(iVar, false);
                        return str7;
                    }
                case TdApi.MessageChatChangeTitle.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return message.isChannelPost ? w.i1(R.string.ActionChannelChangedTitle) : w.j1(R.string.XChangedGroupTitle, o6Var.Db(message.senderId, true));
                case TdApi.MessageBasicGroupChatCreate.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return s3(message) ? w.i1(R.string.YouCreatedGroup) : w.j1(R.string.XCreatedGroup, o6Var.Db(message.senderId, true));
                case TdApi.MessageChatDeleteMember.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    long j10 = ((TdApi.MessageChatDeleteMember) message.content).userId;
                    return (!message.isChannelPost || ob.e.T0(message) != j10) ? ob.e.T0(message) == j10 ? o6Var.o7(j10) ? w.i1(R.string.group_user_remove_self) : w.j1(R.string.group_user_remove, o6Var.e2().C2(j10)) : o6Var.m7(message) ? w.j1(R.string.group_user_self_removed, o6Var.e2().C2(j10)) : o6Var.o7(j10) ? w.j1(R.string.group_user_removed_self, o6Var.Db(message.senderId, true)) : w.j1(R.string.group_user_removed, o6Var.Db(message.senderId, true), o6Var.e2().C2(j10)) : o6Var.o7(j10) ? w.i1(R.string.channel_user_remove_self) : w.j1(R.string.channel_user_remove, o6Var.e2().C2(j10));
                case TdApi.MessagePinMessage.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return message.isChannelPost ? i.i(message.authorSignature) ? w.i1(R.string.PinnedMessageAction) : w.j1(R.string.NotificationActionPinnedNoTextChannel, message.authorSignature) : w.j1(R.string.NotificationActionPinnedNoTextChannel, o6Var.Db(message.senderId, true));
                case TdApi.MessageVideoNote.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.ChatContentRoundVideo);
                case TdApi.MessagePassportDataSent.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return w.i1(R.string.UnsupportedMessage);
                case TdApi.MessageDice.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    TdApi.MessageContent messageContent2 = message.content;
                    String str8 = ((TdApi.MessageDice) messageContent2).emoji;
                    int i14 = ((TdApi.MessageDice) messageContent2).value;
                    if (F.f13581a.equals(str8)) {
                        return w.i1(d1(i14));
                    }
                    if (!G.f13581a.equals(str8)) {
                        return str8;
                    }
                    if (i14 != 0) {
                        return w.o2(R.string.ChatContentDiceRolled, i14);
                    }
                    return w.i1(R.string.ChatContentDice);
                case TdApi.MessageChatJoinByRequest.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    if (s3(message)) {
                        return w.i1(message.isChannelPost ? R.string.YouAcceptedToChannel : R.string.YouAcceptedToGroup);
                    }
                    return w.j1(message.isChannelPost ? R.string.XAcceptedToChannel : R.string.XAcceptedToGroup, o6Var.Db(message.senderId, true));
                case TdApi.MessageAnimation.CONSTRUCTOR:
                    String str9 = ((TdApi.MessageAnimation) message.content).caption.text;
                    if (!z10 || i.i(str9)) {
                        v0.G2(iVar, true);
                        return w.i1(R.string.ChatContentAnimation);
                    } else if (z11) {
                        v0.G2(iVar, true);
                        return w.j1(R.string.ChatContentWithCaption, w.i1(R.string.ChatContentAnimation), str9);
                    } else {
                        v0.G2(iVar, false);
                        return str9;
                    }
                case TdApi.MessageGameScore.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    int i15 = ((TdApi.MessageGameScore) message.content).score;
                    return o6Var.m7(message) ? w.o2(R.string.game_ActionYouScored, i15) : w.p2(R.string.game_ActionUserScored, i15, o6Var.Db(message.senderId, true));
                case TdApi.MessageCustomServiceAction.CONSTRUCTOR:
                    v0.G2(iVar, false);
                    return ((TdApi.MessageCustomServiceAction) message.content).text;
                case TdApi.MessagePaymentSuccessful.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    TdApi.MessagePaymentSuccessful messagePaymentSuccessful = (TdApi.MessagePaymentSuccessful) message.content;
                    return w.j1(R.string.PaymentSuccessfullyPaidNoItem, ib.e.a(messagePaymentSuccessful.currency, messagePaymentSuccessful.totalAmount), o6Var.U3(message.chatId));
                case TdApi.MessageChatAddMembers.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    TdApi.MessageChatAddMembers messageChatAddMembers = (TdApi.MessageChatAddMembers) message.content;
                    if (message.isChannelPost) {
                        long[] jArr = messageChatAddMembers.memberUserIds;
                        if (jArr.length == 1) {
                            return o6Var.o7(jArr[0]) ? w.i1(R.string.channel_user_add_self) : w.j1(R.string.channel_user_add, o6Var.e2().C2(messageChatAddMembers.memberUserIds[0]));
                        }
                        return w.o2(R.string.xPeopleJoinedChannel, jArr.length);
                    }
                    long[] jArr2 = messageChatAddMembers.memberUserIds;
                    if (jArr2.length != 1) {
                        return w.o2(R.string.xPeopleJoinedGroup, jArr2.length);
                    }
                    long j11 = jArr2[0];
                    return j11 != ob.e.T0(message) ? o6Var.o7(j11) ? w.j1(R.string.group_user_added_self, o6Var.Db(message.senderId, true)) : o6Var.n7(message.senderId) ? w.j1(R.string.group_user_self_added, o6Var.e2().C2(j11)) : w.j1(R.string.group_user_added, o6Var.Db(message.senderId, true), o6Var.e2().C2(j11)) : o6Var.o7(j11) ? w.i1(R.string.group_user_add_self) : w.j1(R.string.group_user_add, o6Var.e2().C2(j11));
                case TdApi.MessageSticker.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    TdApi.MessageContent messageContent3 = message.content;
                    if (messageContent3 != null) {
                        sticker = ((TdApi.MessageSticker) messageContent3).sticker;
                    }
                    return (sticker == null || i.i(sticker.emoji)) ? w.i1(R.string.Sticker) : w.j1(R.string.sticker, sticker.emoji);
                case TdApi.MessageChatSetTtl.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    TdApi.MessageChatSetTtl messageChatSetTtl = (TdApi.MessageChatSetTtl) message.content;
                    if (ob.a.l(message.chatId)) {
                        if (messageChatSetTtl.ttl == 0) {
                            return s3(message) ? w.i1(R.string.YouDisabledTimer) : w.j1(R.string.XDisabledTimer, o6Var.Db(message.senderId, true));
                        }
                        if (s3(message)) {
                            return w.u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.YouSetTimerSeconds, R.string.YouSetTimerMinutes, R.string.YouSetTimerHours, R.string.YouSetTimerDays, R.string.YouSetTimerWeeks, R.string.YouSetTimerMonths, new Object[0]).toString();
                        }
                        return w.u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.XSetTimerSeconds, R.string.XSetTimerMinutes, R.string.XSetTimerHours, R.string.XSetTimerDays, R.string.XSetTimerWeeks, R.string.XSetTimerMonths, o6Var.Db(message.senderId, true)).toString();
                    } else if (messageChatSetTtl.ttl == 0) {
                        if (s3(message)) {
                            return w.i1(R.string.YouDisabledAutoDelete);
                        }
                        return w.j1(message.isChannelPost ? R.string.XDisabledAutoDeletePosts : R.string.XDisabledAutoDelete, o6Var.Db(message.senderId, true));
                    } else if (message.isChannelPost) {
                        if (s3(message)) {
                            return w.u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.YouSetAutoDeletePostsSeconds, R.string.YouSetAutoDeletePostsMinutes, R.string.YouSetAutoDeletePostsHours, R.string.YouSetAutoDeletePostsDays, R.string.YouSetAutoDeletePostsWeeks, R.string.YouSetAutoDeletePostsMonths, new Object[0]).toString();
                        }
                        return w.u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.XSetAutoDeletePostsSeconds, R.string.XSetAutoDeletePostsMinutes, R.string.XSetAutoDeletePostsHours, R.string.XSetAutoDeletePostsDays, R.string.XSetAutoDeletePostsWeeks, R.string.XSetAutoDeletePostsMonths, o6Var.Db(message.senderId, true)).toString();
                    } else if (s3(message)) {
                        return w.u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.YouSetAutoDeleteSeconds, R.string.YouSetAutoDeleteMinutes, R.string.YouSetAutoDeleteHours, R.string.YouSetAutoDeleteDays, R.string.YouSetAutoDeleteWeeks, R.string.YouSetAutoDeleteMonths, new Object[0]).toString();
                    } else {
                        return w.u2(messageChatSetTtl.ttl, TimeUnit.SECONDS, R.string.XSetAutoDeleteSeconds, R.string.XSetAutoDeleteMinutes, R.string.XSetAutoDeleteHours, R.string.XSetAutoDeleteDays, R.string.XSetAutoDeleteWeeks, R.string.XSetAutoDeleteMonths, o6Var.Db(message.senderId, true)).toString();
                    }
                case TdApi.MessageChatJoinByLink.CONSTRUCTOR:
                    v0.G2(iVar, true);
                    return s3(message) ? w.i1(R.string.YouJoinedByLink) : w.j1(R.string.XJoinedByLink, o6Var.Db(message.senderId, true));
                case TdApi.MessageText.CONSTRUCTOR:
                    v0.G2(iVar, false);
                    return ((TdApi.MessageText) message.content).text.text;
                case TdApi.MessageVideo.CONSTRUCTOR:
                    String str10 = ((TdApi.MessageVideo) message.content).caption.text;
                    if (!z10 || i.i(str10)) {
                        v0.G2(iVar, true);
                        return w.i1(R.string.ChatContentVideo);
                    } else if (z11) {
                        v0.G2(iVar, true);
                        return w.j1(R.string.ChatContentWithCaption, w.i1(R.string.ChatContentVideo), str10);
                    } else {
                        v0.G2(iVar, false);
                        return str10;
                    }
                default:
                    v0.G2(iVar, false);
                    return "(null)";
            }
        }
    }

    public static ld.h E0(o6 o6Var, TdApi.ChatPhotoInfo chatPhotoInfo) {
        if (chatPhotoInfo == null) {
            return null;
        }
        ld.h hVar = new ld.h(o6Var, chatPhotoInfo.small);
        hVar.t0(wc.a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public static je.e E1(TdApi.User user) {
        TdApi.UserType userType;
        if (user == null || (userType = user.type) == null) {
            return new je.e("…");
        }
        if (userType.getConstructor() != -1807729372) {
            return D1(user.firstName, user.lastName, "?");
        }
        return B1(w.i1(R.string.HiddenName));
    }

    public static boolean E2(TdApi.Audio audio) {
        return !i.i(audio.title);
    }

    public static boolean E3(TdApi.ChatType chatType) {
        return chatType != null && chatType.getConstructor() == -1472570774 && !((TdApi.ChatTypeSupergroup) chatType).isChannel;
    }

    public static TdApi.Message E4(TdApi.VoiceNote voiceNote) {
        return C4(0L, null, new TdApi.MessageVoiceNote(voiceNote, new TdApi.FormattedText("", null), true));
    }

    public static TdApi.InputMessageAnimation E5(TdApi.Animation animation) {
        return new TdApi.InputMessageAnimation(new TdApi.InputFileId(animation.animation.f19913id), null, null, animation.duration, animation.width, animation.height, null);
    }

    public static SparseIntArray F(Map<String, TdApi.Message> map) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (TdApi.Message message : map.values()) {
            int constructor = message.content.getConstructor();
            sparseIntArray.put(constructor, sparseIntArray.get(constructor) + 1);
        }
        return sparseIntArray;
    }

    public static ld.h F0(o6 o6Var, TdApi.ProfilePhoto profilePhoto) {
        if (profilePhoto == null) {
            return null;
        }
        ld.h hVar = new ld.h(o6Var, profilePhoto.small);
        hVar.t0(wc.a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public static String F1(String str) {
        return "https://" + g2() + "/" + str;
    }

    public static boolean F2(TdApi.Call call) {
        return call != null && call.state.getConstructor() == 1394310213 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == -1258917949;
    }

    public static boolean F3(TdApi.Document document) {
        if (!i.i(document.mimeType) && H3(document.mimeType)) {
            return true;
        }
        String v02 = v0.v0(document.fileName);
        String g10 = e0.g(v02);
        if (i.i(g10) || !H3(g10)) {
            return !i.i(v02) && G3(v02);
        }
        return true;
    }

    public static TdApi.User F4(long j10, String str, String str2) {
        return new TdApi.User(j10, str, str2, "", "", new TdApi.UserStatusEmpty(), null, false, false, false, false, null, false, false, true, new TdApi.UserTypeRegular(), null);
    }

    public static TdApi.InputMessageAudio F5(TdApi.Audio audio) {
        return new TdApi.InputMessageAudio(new TdApi.InputFileId(audio.audio.f19913id), null, audio.duration, audio.title, audio.performer, null);
    }

    public static int G(TdApi.StickerSets stickerSets) {
        int i10 = 0;
        for (TdApi.StickerSetInfo stickerSetInfo : stickerSets.sets) {
            if (!stickerSetInfo.isViewed) {
                i10++;
            }
        }
        return i10;
    }

    public static ld.h G0(o6 o6Var, TdApi.User user) {
        if (user != null) {
            return F0(o6Var, user.profilePhoto);
        }
        return null;
    }

    public static String G1(TdApi.LanguagePackInfo languagePackInfo) {
        return "https://" + g2() + "/setlanguage/" + languagePackInfo.f19945id;
    }

    public static boolean G2(TdApi.Call call) {
        return !Z2(call) && (call.isOutgoing || call.state.getConstructor() == -1848149403 || call.state.getConstructor() == -2000107571);
    }

    public static boolean G3(String str) {
        return str.equals("opus") || str.equals("mp3") || str.equals("flac") || str.equals("m4a");
    }

    public static TdApi.File G4(int i10, String str, String str2, int i11) {
        return new TdApi.File(i10, i11, i11, new TdApi.LocalFile(str2, false, false, false, true, 0, i11, i11), new TdApi.RemoteFile(str, "", false, false, 0));
    }

    public static TdApi.InputMessageContent G5(String str, TdApi.InputFile inputFile, g gVar, TdApi.FormattedText formattedText) {
        int i10;
        int i11;
        MediaMetadataRetriever mediaMetadataRetriever;
        String str2;
        String str3;
        int i12;
        if (!i.i(gVar.f13585c)) {
            if (gVar.f13585c.startsWith("audio/") && !gVar.f13585c.equals("audio/ogg")) {
                try {
                    mediaMetadataRetriever = v0.p2(str);
                } catch (Throwable unused) {
                    mediaMetadataRetriever = null;
                }
                if (mediaMetadataRetriever != null) {
                    try {
                        i12 = i.s(mediaMetadataRetriever.extractMetadata(9));
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(7);
                        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(2);
                        if (i.i(extractMetadata2)) {
                            extractMetadata2 = mediaMetadataRetriever.extractMetadata(3);
                        }
                        v0.H(mediaMetadataRetriever);
                        str2 = extractMetadata2;
                        str3 = extractMetadata;
                    } catch (Throwable th) {
                        v0.H(mediaMetadataRetriever);
                        throw th;
                    }
                } else {
                    str3 = null;
                    str2 = null;
                    i12 = 0;
                }
                return new TdApi.InputMessageAudio(inputFile, null, i12, str3, str2, formattedText);
            } else if (gVar.f13585c.startsWith("video/")) {
                try {
                    v0.a L0 = v0.L0(str);
                    if (L0 != null) {
                        int a10 = (int) L0.a(TimeUnit.SECONDS);
                        if (L0.f19447f) {
                            int i13 = L0.f19442a;
                            int i14 = L0.f19443b;
                            if (v0.x1(L0.f19444c)) {
                                i10 = i13;
                                i11 = i14;
                            } else {
                                i11 = i13;
                                i10 = i14;
                            }
                            if (a10 < 30 && gVar.f13583a < p.Q.b(10.0d) && !L0.f19448g) {
                                return new TdApi.InputMessageAnimation(inputFile, null, null, a10, i11, i10, null);
                            }
                            if (a10 > 0) {
                                return new TdApi.InputMessageVideo(inputFile, null, null, a10, i11, i10, v0.D(inputFile), formattedText, 0);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Log.w("Cannot extract media metadata", th2, new Object[0]);
                }
            }
        }
        return new TdApi.InputMessageDocument(inputFile, null, false, formattedText);
    }

    public static boolean H(TdApi.User user) {
        return user != null && user.type.getConstructor() == -598644325;
    }

    public static int H0(long j10, long j11) {
        return j10 == -1 ? R.id.theme_color_avatarInactive : f13537a[Y0(j11, j10)];
    }

    public static String H1(TdApi.User user) {
        return "https://" + g2() + "/" + user.username;
    }

    public static boolean H2(TdApi.ChatMemberStatus chatMemberStatus) {
        int constructor = chatMemberStatus.getConstructor();
        return constructor == -160019714 || constructor == -70024163;
    }

    public static boolean H3(String str) {
        return str.equals("application/ogg") || str.equals("audio/ogg") || str.equals("audio/mpeg") || str.equals("audio/mp4") || str.equals("audio/flac");
    }

    public static TdApi.File H4(File file) {
        String path = file.getPath();
        return G4(0, path, path, (int) file.length());
    }

    public static CharSequence H5(TdApi.FormattedText formattedText) {
        if (formattedText == null) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return formattedText.text;
        }
        TdApi.Object e10 = Client.e(new TdApi.GetMarkdownText(formattedText));
        if (e10 instanceof TdApi.FormattedText) {
            return r5((TdApi.FormattedText) e10, true, true);
        }
        Log.w("getMarkdownText: %s", e10);
        return formattedText.text;
    }

    public static boolean I(TdApi.MessageContent messageContent) {
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

    public static int I0(TdApi.User user, long j10) {
        return H0(I3(user) ? -1L : user == null ? 0L : user.f19979id, j10);
    }

    public static int I1(TdApi.Poll poll) {
        if (poll.totalVoterCount == 0) {
            return 0;
        }
        int i10 = 0;
        for (TdApi.PollOption pollOption : poll.options) {
            i10 = Math.max(pollOption.voterCount, i10);
        }
        return i10;
    }

    public static boolean I2(TdApi.ChatEventLogFilters chatEventLogFilters) {
        return chatEventLogFilters == null || (chatEventLogFilters.messageEdits && chatEventLogFilters.messageDeletions && chatEventLogFilters.messagePins && chatEventLogFilters.memberJoins && chatEventLogFilters.memberLeaves && chatEventLogFilters.memberInvites && chatEventLogFilters.memberPromotions && chatEventLogFilters.memberRestrictions && chatEventLogFilters.infoChanges && chatEventLogFilters.settingChanges && chatEventLogFilters.inviteLinkChanges && chatEventLogFilters.videoChatChanges);
    }

    public static boolean I3(TdApi.User user) {
        return user != null && user.type.getConstructor() == -1807729372;
    }

    public static TdApi.InputFileGenerated I4(String str, String str2, int i10, long j10) {
        return new TdApi.InputFileGenerated(str, str2 + "," + i10 + "_" + j10, i10);
    }

    public static CharacterStyle I5(TdApi.TextEntityType textEntityType) {
        return J5(textEntityType, true);
    }

    public static boolean J(CharacterStyle characterStyle) {
        if (characterStyle instanceof o) {
            return ((o) characterStyle).b() != null;
        }
        if (characterStyle instanceof URLSpan) {
            return c0.Q(((URLSpan) characterStyle).getURL());
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

    public static File J0(boolean z10) {
        File externalCacheDir = (!z10 || !"mounted".equals(Environment.getExternalStorageState()) || Environment.isExternalStorageEmulated()) ? null : j0.n().getExternalCacheDir();
        return externalCacheDir == null ? j0.n().getCacheDir() : externalCacheDir;
    }

    public static CharSequence J1(d9 d9Var, TdApi.ChatMember chatMember, boolean z10) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        switch (chatMember.status.getConstructor()) {
            case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                charSequence = K1(d9Var, chatMember.inviterUserId, chatMember.joinedChatDate, R.string.BannedByXOnDate, R.string.BannedByX, R.string.Banned);
                break;
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                charSequence = w.i1(R.string.ChannelOwner);
                break;
            case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                charSequence = K1(d9Var, chatMember.inviterUserId, 0, R.string.PromotedByXOnDate, R.string.PromotedByX, R.string.Administrator);
                break;
            case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                long j10 = chatMember.inviterUserId;
                if (j10 != 0) {
                    charSequence = K1(d9Var, j10, 0, R.string.InvitedByXOnDate, R.string.InvitedByX, 0);
                    break;
                }
                charSequence = null;
                break;
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                charSequence = K1(d9Var, chatMember.inviterUserId, ((TdApi.ChatMemberStatusRestricted) chatMember.status).isMember ? 0 : chatMember.joinedChatDate, R.string.RestrictedByXOnDate, R.string.RestrictedByX, R.string.Restricted);
                break;
            default:
                charSequence = null;
                break;
        }
        if (z10) {
            charSequence2 = L1(chatMember);
        }
        return (charSequence2 == null || charSequence == null) ? charSequence2 != null ? charSequence2 : charSequence : w.k0(R.string.format_statusAndDate, id.d.z().I(charSequence), charSequence2);
    }

    public static boolean J2(String str) {
        return "application/x-tgsticker".equals(str);
    }

    public static boolean J3(int i10) {
        switch (i10) {
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

    public static byte[] J4() {
        return new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
    }

    public static CharacterStyle J5(TdApi.TextEntityType textEntityType, boolean z10) {
        if (textEntityType == null) {
            return null;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                if (z10) {
                    return new o(null, R.id.theme_color_textLink).j(textEntityType);
                }
                return null;
            case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                return new StyleSpan(1);
            case TdApi.TextEntityTypeCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePre.CONSTRUCTOR:
                return ce.o.f5309m ? new TypefaceSpan(ce.o.j()) : new TypefaceSpan("monospace");
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

    public static boolean K(TdApi.Document document) {
        return false;
    }

    public static int K0(TdApi.MessageCall messageCall, boolean z10, boolean z11) {
        int constructor = messageCall.discardReason.getConstructor();
        return constructor != -1729926094 ? constructor != 1680358012 ? z11 ? z10 ? R.string.OutgoingCall : R.string.IncomingCall : z10 ? R.string.Outgoing : R.string.Incoming : z11 ? z10 ? R.string.CallMessageOutgoingMissed : R.string.MissedCall : z10 ? R.string.Cancelled : R.string.Missed : z11 ? z10 ? R.string.OutgoingCall : R.string.CallMessageIncomingDeclined : z10 ? R.string.Busy : R.string.Declined;
    }

    public static CharSequence K1(final d9 d9Var, final long j10, int i10, int i11, int i12, int i13) {
        w.f fVar = null;
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 != 0 && i10 != 0) {
            if (d9Var.t() != null) {
                fVar = new w.f() {
                    @Override
                    public final Object a(CharSequence charSequence, int i15, int i16, int i17, boolean z10) {
                        Object d42;
                        d42 = t2.d4(d9.this, j10, charSequence, i15, i16, i17, z10);
                        return d42;
                    }
                };
            }
            return p4(w.h1(i11, fVar, d9Var.c().e2().J2(j10), w.Z0(i10, TimeUnit.SECONDS)));
        } else if (i14 != 0) {
            if (d9Var.t() != null) {
                fVar = new w.f() {
                    @Override
                    public final Object a(CharSequence charSequence, int i15, int i16, int i17, boolean z10) {
                        Object e42;
                        e42 = t2.e4(d9.this, j10, charSequence, i15, i16, i17, z10);
                        return e42;
                    }
                };
            }
            return p4(w.h1(i12, fVar, d9Var.c().e2().J2(j10)));
        } else if (i10 != 0) {
            return w.Z0(i10, TimeUnit.SECONDS);
        } else {
            return w.i1(i13);
        }
    }

    public static boolean K2(TdApi.User user) {
        return user != null && user.type.getConstructor() == -970625144;
    }

    public static boolean K3(TdApi.TextEntityType textEntityType, boolean z10) {
        if (textEntityType == null) {
            return false;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                return z10;
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

    public static o K4(TdApi.TextEntityType textEntityType) {
        return new o(null, 0).j(textEntityType);
    }

    public static TdApi.Thumbnail K5(TdApi.PhotoSize photoSize) {
        if (photoSize == null) {
            return null;
        }
        return new TdApi.Thumbnail(new TdApi.ThumbnailFormatJpeg(), photoSize.width, photoSize.height, photoSize.photo);
    }

    public static boolean L(TdApi.Message message) {
        String j22 = j2(message);
        return j22 != null && j22.trim().length() > 0;
    }

    public static boolean L0(TdApi.Call call) {
        return !Z2(call) && call.state.getConstructor() != -2000107571;
    }

    public static CharSequence L1(TdApi.ChatMember chatMember) {
        if (chatMember.joinedChatDate == 0 || !i3(chatMember.status, false)) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return w.j1(R.string.MemberSince, w.o0(chatMember.joinedChatDate, timeUnit), w.T2(chatMember.joinedChatDate, timeUnit));
    }

    public static boolean L2(TdApi.CallDiscardReason callDiscardReason) {
        return callDiscardReason.getConstructor() == -1729926094 || callDiscardReason.getConstructor() == 1680358012;
    }

    public static int L3(l0 l0Var, l0 l0Var2) {
        return Integer.compare(l0Var.i(), l0Var2.i());
    }

    public static TdApi.FormattedText L4(CharSequence charSequence) {
        return new TdApi.FormattedText(charSequence.toString(), x5(charSequence, false));
    }

    public static TdApi.Thumbnail L5(TdApi.Sticker sticker) {
        if (sticker == null) {
            return null;
        }
        TdApi.Thumbnail thumbnail = sticker.thumbnail;
        if (thumbnail != null) {
            return thumbnail;
        }
        if (ob.e.X0(sticker.type)) {
            return null;
        }
        return new TdApi.Thumbnail(new TdApi.ThumbnailFormatWebp(), sticker.width, sticker.height, sticker.sticker);
    }

    public static boolean M(TdApi.Message message) {
        return N(message, j1(message));
    }

    public static String M0(TdApi.Call call, long j10, boolean z10) {
        switch (call.state.getConstructor()) {
            case TdApi.CallStateHangingUp.CONSTRUCTOR:
                return w.i1(R.string.VoipEnded);
            case TdApi.CallStateReady.CONSTRUCTOR:
                if (j10 < 0) {
                    return w.i1(R.string.VoipEstablishing);
                }
                return c0.h(j10);
            case TdApi.CallStateExchangingKeys.CONSTRUCTOR:
                return w.i1(z10 ? R.string.VoipExchangingKeysShort : R.string.VoipExchangingKeys);
            case TdApi.CallStateError.CONSTRUCTOR:
                if (((TdApi.CallStateError) call.state).error.code == 4005000) {
                    return w.i1(R.string.VoipMissedOutgoing);
                }
                return w.i1(R.string.VoipFailed);
            case TdApi.CallStatePending.CONSTRUCTOR:
                TdApi.CallStatePending callStatePending = (TdApi.CallStatePending) call.state;
                if (!call.isOutgoing) {
                    return w.i1(R.string.IncomingCall);
                }
                if (!callStatePending.isCreated) {
                    return w.i1(R.string.VoipConnecting);
                }
                if (!callStatePending.isReceived) {
                    return w.i1(R.string.VoipWaiting);
                }
                return w.i1(R.string.VoipRinging);
            case TdApi.CallStateDiscarded.CONSTRUCTOR:
                switch (((TdApi.CallStateDiscarded) call.state).reason.getConstructor()) {
                    case TdApi.CallDiscardReasonDeclined.CONSTRUCTOR:
                        return w.i1(call.isOutgoing ? R.string.VoipBusy : R.string.VoipDeclined);
                    case TdApi.CallDiscardReasonDisconnected.CONSTRUCTOR:
                        return w.i1(R.string.VoipDisconnect);
                    case TdApi.CallDiscardReasonEmpty.CONSTRUCTOR:
                        return w.i1(R.string.VoipUnknown);
                    case TdApi.CallDiscardReasonHungUp.CONSTRUCTOR:
                        return w.i1(R.string.VoipEnded);
                    case TdApi.CallDiscardReasonMissed.CONSTRUCTOR:
                        return w.i1(call.isOutgoing ? R.string.VoipCancelled : R.string.VoipMissed);
                    default:
                        return w.i1(R.string.Busy);
                }
            default:
                throw new IllegalArgumentException("call.state == " + call.state);
        }
    }

    public static k0.e<long[]> M1(TdApi.Message[] messageArr) {
        k0.e eVar = new k0.e();
        int length = messageArr.length;
        jb.e eVar2 = null;
        long j10 = 0;
        for (TdApi.Message message : messageArr) {
            long j11 = message.chatId;
            if (j11 != j10) {
                eVar2 = (jb.e) eVar.f(j11);
                if (eVar2 == null) {
                    eVar2 = new jb.e(length);
                    eVar.k(j11, eVar2);
                }
                j10 = j11;
            }
            eVar2.a(message.f19946id);
        }
        k0.e<long[]> eVar3 = new k0.e<>(eVar.p());
        for (int i10 = 0; i10 < eVar.p(); i10++) {
            eVar3.a(eVar.j(i10), ((jb.e) eVar.q(i10)).g());
        }
        return eVar3;
    }

    public static boolean M2(TdApi.Call call) {
        return call != null && call.isOutgoing && call.state.getConstructor() == 1394310213 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == 1680358012;
    }

    public static void M3(int[] iArr, TdApi.File[] fileArr, long j10, TdApi.Object object) {
        iArr[0] = iArr[0] + 1;
        if (iArr[0] == fileArr.length) {
            j0.z0(w.j1(R.string.FreedX, c0.m(j10)), 0);
        }
    }

    public static String M4(String str) {
        if (i.i(str) || str.charAt(str.length() - 1) == '/') {
            return str;
        }
        return str + '/';
    }

    public static TdApi.PhotoSize M5(TdApi.Thumbnail thumbnail) {
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

    public static boolean N(TdApi.Message message, TdApi.File file) {
        TdApi.LocalFile localFile;
        return c3(message) && file != null && (localFile = file.local) != null && localFile.canBeDeleted && localFile.downloadedPrefixSize > 0;
    }

    public static String N0(TdApi.Call call, TdApi.CallState callState, long j10, boolean z10) {
        int constructor = callState.getConstructor();
        if (constructor == -2000107571 || constructor == -1848149403) {
            return w.i1(R.string.VoipEnded);
        }
        if (constructor != 1073048620) {
            return M0(call, j10, z10);
        }
        return w.i1(call.isOutgoing ? R.string.VoipCancelled : R.string.VoipDeclined);
    }

    public static long[] N1(TdApi.Message[] messageArr, int i10, int i11) {
        long[] jArr = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = messageArr[i10 + i12].f19946id;
        }
        return jArr;
    }

    public static boolean N2(TdApi.ChatType chatType) {
        return chatType != null && chatType.getConstructor() == -1472570774 && ((TdApi.ChatTypeSupergroup) chatType).isChannel;
    }

    public static boolean N3(final TdApi.File[] fileArr, v4 v4Var, final long j10, Runnable runnable, View view, int i10) {
        if (i10 == R.id.btn_deleteFile) {
            ya.o1().w2().f1(fileArr);
            v4Var.t().u0(fileArr);
            for (TdApi.File file : fileArr) {
                final int[] iArr = new int[1];
                v4Var.c().v4().o(new TdApi.DeleteFile(file.f19913id), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        t2.M3(iArr, fileArr, j10, object);
                    }
                });
            }
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }

    public static c N4(TdApi.InlineKeyboardButtonTypeCallbackWithPassword inlineKeyboardButtonTypeCallbackWithPassword) {
        String str = new String(inlineKeyboardButtonTypeCallbackWithPassword.data, i.f14176a);
        if (!str.matches("^bots/[0-9]+/trsf/[0-9]+/c$")) {
            return null;
        }
        String[] split = str.split("/");
        return new c(i.s(split[1]), i.s(split[3]));
    }

    public static String N5(int i10, String str) {
        char c10;
        String y02;
        if (i.i(str) || str.equalsIgnoreCase("request aborted")) {
            return null;
        }
        switch (str.hashCode()) {
            case -2120721660:
                if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -2076245302:
                if (str.equals("PASSWORD_HASH_INVALID")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -2037365853:
                if (str.equals("PHONE_NUMBER_BANNED")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -2012133105:
                if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1915107375:
                if (str.equals("INPUT_USER_DEACTIVATED")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1763467626:
                if (str.equals("USERS_TOO_FEW")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1654434962:
                if (str.equals("Message must be non-empty")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1274174503:
                if (str.equals("FRESH_RESET_AUTHORISATION_FORBIDDEN")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1049881117:
                if (str.equals("PHONE_NUMBER_OCCUPIED")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -936268941:
                if (str.equals("USERNAME_NOT_OCCUPIED")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -830531122:
                if (str.equals("Not enough rights to invite members to the group chat")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -732054030:
                if (str.equals("PHONE_NUMBER_INVALID")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -687975521:
                if (str.equals("The maximum number of pinned chats exceeded")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case -531026660:
                if (str.equals("INVITE_HASH_INVALID")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case -512775857:
                if (str.equals("USER_RESTRICTED")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -499602090:
                if (str.equals("APP_UPGRADE_NEEDED")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -454039871:
                if (str.equals("PEER_FLOOD")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case -446466679:
                if (str.equals("CHAT_SEND_POLL_FORBIDDEN")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case -422508131:
                if (str.equals("STICKERSET_INVALID")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -420079733:
                if (str.equals("BOTS_TOO_MUCH")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case -141887186:
                if (str.equals("USERNAMES_UNAVAILABLE")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case -120967562:
                if (str.equals("CHAT_ADMIN_REQUIRED")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 112805161:
                if (str.equals("Top chats computation is disabled")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 288843630:
                if (str.equals("USERNAME_INVALID")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 321063201:
                if (str.equals("LANG_CODE_NOT_SUPPORTED")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 494920266:
                if (str.equals("INVITE_HASH_EXPIRED")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 533175271:
                if (str.equals("USERNAME_OCCUPIED")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 785969592:
                if (str.equals("Invalid chat identifier specified")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 1167301807:
                if (str.equals("USERS_TOO_MUCH")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 1253103379:
                if (str.equals("ADMINS_TOO_MUCH")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 1355367367:
                if (str.equals("CHANNELS_TOO_MUCH")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case 1377621075:
                if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 1623167701:
                if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case 1786305461:
                if (str.equals("Not Found")) {
                    c10 = '!';
                    break;
                }
                c10 = 65535;
                break;
            case 1916725894:
                if (str.equals("USER_PRIVACY_RESTRICTED")) {
                    c10 = '\"';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        int i11 = R.string.error_CHANNELS_TOO_MUCH;
        switch (c10) {
            case 0:
                i11 = R.string.error_CHANNELS_ADMIN_LOCATED_TOO_MUCH;
                break;
            case 1:
                i11 = R.string.PasswordIsInvalid;
                break;
            case 2:
                i11 = R.string.login_PHONE_NUMBER_BANNED;
                break;
            case 3:
                i11 = R.string.TooManyPublicChannels;
                break;
            case 4:
                i11 = R.string.ErrorUserDeleted;
                break;
            case 5:
                i11 = R.string.ErrorUsersTooFew;
                break;
            case 6:
                i11 = R.string.MessageInputEmpty;
                break;
            case 7:
                i11 = R.string.TerminateSessionFreshError;
                break;
            case '\b':
                i11 = R.string.PhoneNumberInUse;
                break;
            case '\t':
                i11 = R.string.UsernameNotOccupiedUnknown;
                break;
            case '\n':
                i11 = R.string.YouCantInviteMembers;
                break;
            case 11:
                i11 = R.string.login_InvalidPhone;
                break;
            case '\f':
                return w.o2(R.string.ErrorPinnedChatsLimit, ya.o1().j0().Ka());
            case '\r':
            case 25:
                i11 = R.string.InviteLinkInvalid;
                break;
            case 14:
                i11 = R.string.UserRestricted;
                break;
            case 15:
                i11 = R.string.error_APP_UPGRADE_NEEDED;
                break;
            case 16:
                i11 = R.string.NobodyLikesSpam2;
                break;
            case 17:
                i11 = R.string.error_CHAT_SEND_POLL_FORBIDDEN;
                break;
            case 18:
                i11 = R.string.error_STICKERSET_INVALID;
                break;
            case 19:
                i11 = R.string.error_BOTS_TOO_MUCH;
                break;
            case 20:
                i11 = R.string.FeatureUnavailable;
                break;
            case 21:
                i11 = R.string.error_CHAT_ADMIN_REQUIRED;
                break;
            case 22:
                i11 = R.string.ChatSuggestionsDisabled;
                break;
            case 23:
                i11 = R.string.UsernameInvalid;
                break;
            case d.j.K3:
                i11 = R.string.error_LANG_CODE_NOT_SUPPORTED;
                break;
            case 26:
                i11 = R.string.UsernameInUse;
                break;
            case 27:
                i11 = R.string.error_ChatInfoNotFound;
                break;
            case 28:
                i11 = R.string.GroupIsFull;
                break;
            case d.j.P3:
                i11 = R.string.error_ADMINS_TOO_MUCH;
                break;
            case 30:
            case 31:
                break;
            case Log.TAG_IMAGE_LOADER:
                i11 = R.string.error_USER_NOT_MUTUAL_CONTACT;
                break;
            case '!':
                i11 = R.string.error_NotFound;
                break;
            case '\"':
                i11 = R.string.UserPrivacyRestricted;
                break;
            default:
                String C2 = i.C(str);
                if (!C2.matches("^[A-Za-z0-9_]+$") || (y02 = w.y0(C2)) == null) {
                    i11 = 0;
                    break;
                } else {
                    return y02;
                }
        }
        if (i11 != 0) {
            return w.i1(i11);
        }
        int v12 = v1(i10, str, -1);
        if (v12 > 0) {
            return w.j1(R.string.format_TooManyRequests, w.z1(v12));
        }
        return "#" + i10 + ": " + str;
    }

    public static boolean O(TdApi.MessageContent messageContent) {
        return I(messageContent) && messageContent.getConstructor() != 303973492;
    }

    public static int O0(TdApi.Call call) {
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
            case TdApi.CallStatePending.CONSTRUCTOR:
                TdApi.CallStatePending callStatePending = (TdApi.CallStatePending) call.state;
                if (!call.isOutgoing) {
                    return 0;
                }
                return (callStatePending.isCreated && callStatePending.isReceived) ? R.raw.voip_ringback : R.raw.voip_connecting;
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
            default:
                throw new IllegalArgumentException("call.state == " + call.state);
        }
    }

    public static String O1(TdApi.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        if (webPage.sticker != null) {
            return "image/webp";
        }
        TdApi.Video video = webPage.video;
        if (video != null) {
            String str = video.mimeType;
            return (i.i(str) || !str.startsWith("video/")) ? "video/*" : str;
        }
        TdApi.Animation animation = webPage.animation;
        if (animation != null) {
            String str2 = animation.mimeType;
            return !i.i(str2) ? (str2.startsWith("video/") || str2.equals("image/gif")) ? str2 : "video/*" : "video/*";
        }
        TdApi.Audio audio = webPage.audio;
        if (audio != null) {
            String str3 = audio.mimeType;
            return (i.i(str3) || !str3.startsWith("audio/")) ? "audio/*" : str3;
        }
        TdApi.Document document = webPage.document;
        if (document != null) {
            String str4 = document.mimeType;
            if (i.i(str4)) {
                str4 = e0.g(v0.v0(webPage.document.fileName));
            }
            return i.i(str4) ? "application/octet-stream" : str4;
        } else if (webPage.photo != null) {
            return "image/jpeg";
        } else {
            return null;
        }
    }

    public static boolean O2(TdApi.User user) {
        return user != null && user.isContact;
    }

    public static boolean O3(o.a aVar, d9 d9Var, String str, View view, o oVar) {
        if ((aVar != null && aVar.a(view, oVar)) || d9Var == null) {
            return true;
        }
        r9 r9Var = new r9(d9Var.t(), d9Var.c());
        r9Var.Ad(str);
        d9Var.t().Q1().h0(r9Var);
        return true;
    }

    public static boolean O4(TdApi.FormattedText formattedText) {
        TdApi.TextEntity[] textEntityArr;
        TdApi.TextEntity[] E0;
        if (ob.e.c1(formattedText)) {
            return false;
        }
        TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
        if (textEntityArr2 == null || textEntityArr2.length == 0) {
            TdApi.TextEntity[] E02 = ob.e.E0(formattedText.text);
            if (E02 == null) {
                return false;
            }
            formattedText.entities = E02;
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
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
                    int i11 = textEntity.offset;
                    if (i11 > i10 && (E0 = ob.e.E0(formattedText.text.substring(i10, i11))) != null) {
                        Collections.addAll(arrayList, E0);
                    }
                    i10 = textEntity.offset + textEntity.length;
                    break;
            }
        }
        if (i10 < formattedText.text.length()) {
            String str = formattedText.text;
            if (i10 != 0) {
                str = str.substring(i10);
            }
            TdApi.TextEntity[] E03 = ob.e.E0(str);
            if (E03 != null) {
                Collections.addAll(arrayList, E03);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Collections.addAll(arrayList, formattedText.entities);
        TdApi.TextEntity[] textEntityArr3 = (TdApi.TextEntity[]) arrayList.toArray(new TdApi.TextEntity[0]);
        formattedText.entities = textEntityArr3;
        ob.e.s1(textEntityArr3);
        return true;
    }

    public static TdApi.FormattedText O5(String str, TdApi.FormattedText formattedText) {
        if (i.i(str)) {
            return formattedText;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return new TdApi.FormattedText(str + formattedText.text, formattedText.entities);
        }
        TdApi.FormattedText formattedText2 = new TdApi.FormattedText(str + formattedText.text, new TdApi.TextEntity[formattedText.entities.length]);
        int length = str.length();
        int i10 = 0;
        while (true) {
            TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
            if (i10 >= textEntityArr2.length) {
                return formattedText2;
            }
            TdApi.TextEntity textEntity = textEntityArr2[i10];
            formattedText2.entities[i10] = new TdApi.TextEntity(textEntity.offset + length, textEntity.length, textEntity.type);
            i10++;
        }
    }

    public static int P(TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2) {
        if (chatMemberStatus2.getConstructor() == -160019714) {
            return 3;
        }
        int constructor = chatMemberStatus.getConstructor();
        return constructor != -160019714 ? constructor != -70024163 ? chatMemberStatus2.getConstructor() == -70024163 ? 3 : 0 : chatMemberStatus2.getConstructor() == -70024163 ? ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus2).canBeEdited ? 2 : 3 : ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).rights.canPromoteMembers ? 1 : 0 : chatMemberStatus2.getConstructor() != -70024163 ? 1 : 2;
    }

    public static long P0(TdApi.Object object) {
        if (object.getConstructor() != -1601123095) {
            return 0L;
        }
        return ((TdApi.Chat) object).f19908id;
    }

    public static int P1(int i10) {
        switch (i10) {
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

    public static boolean P2(TdApi.ChatMemberStatus chatMemberStatus) {
        return chatMemberStatus != null && chatMemberStatus.getConstructor() == -160019714;
    }

    public static boolean P3(o.a aVar, String str, View view, o oVar) {
        if (aVar != null && aVar.a(view, oVar)) {
            return true;
        }
        v.J(str);
        return true;
    }

    public static boolean P4(TdApi.FormattedText formattedText) {
        if (ob.e.c1(formattedText)) {
            return false;
        }
        return O4(formattedText) || ob.e.m1(formattedText);
    }

    public static boolean P5(TdApi.File file, int i10) {
        TdApi.LocalFile localFile = file.local;
        int i11 = localFile.downloadOffset;
        return i10 >= i11 && ((long) i10) <= ((long) (i11 + localFile.downloadedPrefixSize)) + p.f17345b.b(512.0d);
    }

    public static boolean Q(TdApi.Message message) {
        return message != null && message.sendingState == null && !A3(message);
    }

    public static long Q0(TdApi.Message[] messageArr) {
        if (messageArr == null || messageArr.length <= 0) {
            return 0L;
        }
        long j10 = messageArr[0].chatId;
        for (TdApi.Message message : messageArr) {
            if (message.chatId != j10) {
                return 0L;
            }
        }
        return j10;
    }

    public static d Q1(int i10, int i11, o6 o6Var, long j10, TdApi.MessageSender messageSender, String str, String str2, int i12) {
        return R1(i10, i11, o6Var, j10, messageSender, str2, str, false, i12);
    }

    public static boolean Q2(TdApi.Call call) {
        return call != null && !call.isOutgoing && call.state.getConstructor() == 1394310213 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == -1729926094;
    }

    public static boolean Q3(o.a aVar, d9 d9Var, String str, View view, o oVar) {
        if ((aVar != null && aVar.a(view, oVar)) || d9Var == null) {
            return true;
        }
        d9Var.c().hd().y7(d9Var, str, null);
        return true;
    }

    public static java.lang.String Q4(java.lang.String r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: hd.t2.Q4(java.lang.String, boolean, boolean):java.lang.String");
    }

    public static int R(TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2) {
        if (chatMemberStatus2.getConstructor() == -160019714) {
            return 0;
        }
        int constructor = chatMemberStatus.getConstructor();
        if (constructor != -160019714) {
            if (constructor != -70024163) {
                if (chatMemberStatus2.getConstructor() == 1661432998) {
                    return 3;
                }
            } else if (((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).rights.canRestrictMembers) {
                switch (chatMemberStatus2.getConstructor()) {
                    case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                    case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                        return 2;
                    case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus2).canBeEdited ? 1 : 0;
                    case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                    case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                        return 1;
                }
            }
            return 0;
        }
        int constructor2 = chatMemberStatus2.getConstructor();
        return (constructor2 == -1653518666 || constructor2 == 1661432998) ? 2 : 1;
    }

    public static d R0(o6 o6Var, long j10, TdApi.Message message) {
        return c1(o6Var, j10, message, true, true);
    }

    public static d R1(int i10, int i11, o6 o6Var, long j10, TdApi.MessageSender messageSender, String str, String str2, boolean z10, int i12) {
        String i13;
        if (i.i(str2)) {
            try {
                i13 = w.T(c0.Y(w.i1(i10)).toString(), null, d2(o6Var, messageSender, str)).toString();
            } catch (Throwable unused) {
                i13 = w.i1(i10);
            }
        } else {
            d T1 = T1(i11, o6Var, j10, messageSender, str, str2, z10, i12);
            String dVar = T1 != null ? T1.toString() : null;
            if (!i.i(dVar)) {
                str2 = dVar;
            }
            try {
                i13 = w.T(c0.Y(w.i1(R.string.ActionPinnedText)).toString(), null, d2(o6Var, messageSender, str), str2).toString();
            } catch (Throwable unused2) {
                i13 = w.i1(R.string.ActionPinnedText);
            }
        }
        return new d(null, 0, new TdApi.FormattedText(i13, null), true, true, f13560x);
    }

    public static boolean R2(TdApi.Message message) {
        TdApi.MessageSendingState messageSendingState;
        return (message == null || (messageSendingState = message.sendingState) == null || messageSendingState.getConstructor() != -1741887228) ? false : true;
    }

    public static boolean R3(o.a aVar, d9 d9Var, String str, View view, o oVar) {
        if ((aVar != null && aVar.a(view, oVar)) || d9Var == null) {
            return true;
        }
        d9Var.c().hd().f7(d9Var, str);
        return true;
    }

    public static void R4(o6 o6Var, long j10, TdApi.MessageSendOptions messageSendOptions, List<TdApi.Function> list, List<TdApi.InputMessageContent> list2) {
        if (list2 != null && !list2.isEmpty()) {
            if (list2.size() == 1) {
                S4(o6Var, j10, messageSendOptions, list, list2.get(0));
            } else {
                TdApi.InputMessageContent[] inputMessageContentArr = new TdApi.InputMessageContent[list2.size()];
                list2.toArray(inputMessageContentArr);
                list.add(new TdApi.SendMessageAlbum(j10, 0L, 0L, messageSendOptions, inputMessageContentArr, false));
            }
            list2.clear();
        }
    }

    public static boolean S(TdApi.Poll poll) {
        if (poll.type.getConstructor() == 641265698) {
            for (TdApi.PollOption pollOption : poll.options) {
                if (pollOption.isChosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String S0(o6 o6Var, long j10, TdApi.User user, boolean z10) {
        long c10 = ob.a.c(j10);
        if (o6Var.p7(c10)) {
            return w.i1(R.string.ServiceNotifications);
        }
        if (o6Var.i7(c10)) {
            return w.i1(R.string.ReplyNotifications);
        }
        if (o6Var.o7(j10)) {
            return w.i1(R.string.status_Online);
        }
        if (user == null) {
            return w.i1(R.string.UserUnavailable);
        }
        int constructor = user.type.getConstructor();
        if (constructor == -1807729372) {
            return w.i1(R.string.deletedUser);
        }
        if (constructor != -970625144) {
            if (constructor != -724541123) {
                return w.D1(o6Var, user.status, true);
            }
            return w.i1(R.string.unknownUser);
        } else if (!z10) {
            return "@" + user.username;
        } else if (((TdApi.UserTypeBot) user.type).canReadAllGroupMessages) {
            return w.i1(R.string.BotStatusRead);
        } else {
            return w.i1(R.string.BotStatusCantRead);
        }
    }

    public static d S1(int i10, o6 o6Var, long j10, TdApi.MessageSender messageSender, String str, String str2, int i11) {
        return b1(i10, o6Var, j10, messageSender, str, o6Var.n7(messageSender), false, new TdApi.FormattedText(str2, null), false, i11);
    }

    public static boolean S2(TdApi.File file) {
        return file == null || file.f19913id == 0;
    }

    public static boolean S3(o.a aVar, String str, View view, o oVar) {
        if (aVar != null && aVar.a(view, oVar)) {
            return true;
        }
        v.B(str);
        return true;
    }

    public static void S4(o6 o6Var, long j10, TdApi.MessageSendOptions messageSendOptions, List<TdApi.Function> list, TdApi.InputMessageContent inputMessageContent) {
        list.add(new TdApi.SendMessage(j10, 0L, 0L, messageSendOptions, null, inputMessageContent));
    }

    public static boolean T(TdApi.ChatMemberStatus chatMemberStatus) {
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

    public static int T0(TdApi.AuthenticationCodeType authenticationCodeType) {
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

    public static d T1(int i10, o6 o6Var, long j10, TdApi.MessageSender messageSender, String str, String str2, boolean z10, int i11) {
        return b1(i10, o6Var, j10, messageSender, str, o6Var.n7(messageSender), false, new TdApi.FormattedText(str2, null), z10, i11);
    }

    public static boolean T2(TdApi.File file) {
        TdApi.LocalFile localFile;
        return (file == null || (localFile = file.local) == null || !localFile.isDownloadingCompleted) ? false : true;
    }

    public static boolean T3(o.a aVar, d9 d9Var, String str, View view, o oVar) {
        if ((aVar != null && aVar.a(view, oVar)) || d9Var == null) {
            return true;
        }
        d9Var.c().hd().E7(d9Var, str, null);
        return true;
    }

    public static TdApi.Message T4(TdApi.Message message) {
        TdApi.MessageContent U4 = U4(message.content);
        if (U4 == message.content) {
            return message;
        }
        TdApi.Message p10 = ob.e.p(message);
        p10.content = U4;
        return p10;
    }

    public static boolean U(TdApi.MessageContent messageContent) {
        int constructor = messageContent.getConstructor();
        return (constructor == -662130099 || constructor == -69441162) ? false : true;
    }

    public static int U0(TdApi.AuthorizationState authorizationState) {
        if (authorizationState == null || authorizationState.getConstructor() != 52643073) {
            return 5;
        }
        return T0(((TdApi.AuthorizationStateWaitCode) authorizationState).codeInfo.type);
    }

    public static d U1(o6 o6Var, long j10, TdApi.Message message, boolean z10) {
        return c1(o6Var, j10, message, z10, false);
    }

    public static boolean U2(TdApi.Message message) {
        return message != null && T2(j1(message));
    }

    public static boolean U3(o.a aVar, d9 d9Var, String str, View view, o oVar) {
        if ((aVar != null && aVar.a(view, oVar)) || d9Var == null) {
            return true;
        }
        d9Var.c().hd().E7(d9Var, str, null);
        return true;
    }

    public static TdApi.MessageContent U4(TdApi.MessageContent messageContent) {
        if (messageContent == null || messageContent.getConstructor() != 1989037971) {
            return messageContent;
        }
        TdApi.MessageText messageText = (TdApi.MessageText) messageContent;
        if (messageText.webPage == null) {
            return messageText;
        }
        TdApi.FormattedText formattedText = new TdApi.FormattedText();
        int length = messageText.text.text.length() + 1;
        formattedText.text = messageText.text.text + "\n[" + w.i1(R.string.LinkPreview) + "]";
        TdApi.TextEntity[] textEntityArr = messageText.text.entities;
        if (textEntityArr != null) {
            formattedText.entities = (TdApi.TextEntity[]) ib.b.C(textEntityArr, textEntityArr.length + 1, null);
        } else {
            formattedText.entities = new TdApi.TextEntity[1];
        }
        TdApi.TextEntity[] textEntityArr2 = formattedText.entities;
        textEntityArr2[textEntityArr2.length - 1] = new TdApi.TextEntity(length, formattedText.text.length() - length, new TdApi.TextEntityTypeItalic());
        return new TdApi.MessageText(formattedText, null);
    }

    public static boolean V(TdApi.Poll poll) {
        return !y4(poll);
    }

    public static int V0(TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo) {
        int i10 = emailAddressAuthenticationCodeInfo.length;
        if (i10 == 0) {
            return 6;
        }
        return i10;
    }

    public static d V1(o6 o6Var, long j10, TdApi.NotificationTypeNewPushMessage notificationTypeNewPushMessage, boolean z10) {
        TdApi.VoiceNote voiceNote;
        String str = null;
        boolean z11 = false;
        switch (notificationTypeNewPushMessage.content.getConstructor()) {
            case TdApi.PushMessageContentBasicGroupChatCreate.CONSTRUCTOR:
                return S1(TdApi.MessageBasicGroupChatCreate.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentChatChangeTitle.CONSTRUCTOR:
                return S1(TdApi.MessageChatChangeTitle.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentChatChangeTitle) notificationTypeNewPushMessage.content).title, 0);
            case TdApi.PushMessageContentMessageForwards.CONSTRUCTOR:
                return new d(w.o2(R.string.xForwards, ((TdApi.PushMessageContentMessageForwards) notificationTypeNewPushMessage.content).totalCount), true);
            case TdApi.PushMessageContentInvoice.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentInvoice) pushMessageContent).isPinned ? Q1(R.string.ActionPinnedNoText, TdApi.MessageInvoice.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0) : S1(TdApi.MessageInvoice.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentInvoice) pushMessageContent).price, 0);
            case TdApi.PushMessageContentLocation.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent2 = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentLocation) pushMessageContent2).isLive ? ((TdApi.PushMessageContentLocation) pushMessageContent2).isPinned ? Q1(R.string.ActionPinnedGeoLive, TdApi.MessageLocation.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0) : S1(TdApi.MessageLocation.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, "live", 0) : ((TdApi.PushMessageContentLocation) pushMessageContent2).isPinned ? Q1(R.string.ActionPinnedGeo, TdApi.MessageLocation.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0) : S1(TdApi.MessageLocation.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentVideoNote.CONSTRUCTOR:
                TdApi.VideoNote videoNote = ((TdApi.PushMessageContentVideoNote) notificationTypeNewPushMessage.content).videoNote;
                if (videoNote != null && videoNote.duration > 0) {
                    str = w.j1(R.string.ChatContentVoiceDuration, w.i1(R.string.ChatContentRoundVideo), c0.h(videoNote.duration));
                    z11 = true;
                }
                return ((TdApi.PushMessageContentVideoNote) notificationTypeNewPushMessage.content).isPinned ? R1(R.string.ActionPinnedRound, TdApi.MessageVideoNote.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z11, 0) : T1(TdApi.MessageVideoNote.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z11, 0);
            case TdApi.PushMessageContentChatChangePhoto.CONSTRUCTOR:
                return S1(TdApi.MessageChatChangePhoto.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentChatAddMembers.CONSTRUCTOR:
                TdApi.PushMessageContentChatAddMembers pushMessageContentChatAddMembers = (TdApi.PushMessageContentChatAddMembers) notificationTypeNewPushMessage.content;
                if (pushMessageContentChatAddMembers.isReturned) {
                    return new d(f13545i, (int) R.string.ChatContentGroupReturn);
                }
                if (pushMessageContentChatAddMembers.isCurrentUser) {
                    return new d(f13545i, (int) R.string.ChatContentGroupAddYou);
                }
                return new d(f13545i, 0, w.j1(R.string.ChatContentGroupAdd, pushMessageContentChatAddMembers.memberName), true);
            case TdApi.PushMessageContentMediaAlbum.CONSTRUCTOR:
                TdApi.PushMessageContentMediaAlbum pushMessageContentMediaAlbum = (TdApi.PushMessageContentMediaAlbum) notificationTypeNewPushMessage.content;
                ?? r12 = pushMessageContentMediaAlbum.hasPhotos;
                boolean z12 = pushMessageContentMediaAlbum.hasVideos;
                int i10 = r12;
                if (z12) {
                    i10 = r12 + 1;
                }
                boolean z13 = pushMessageContentMediaAlbum.hasAudios;
                int i11 = i10;
                if (z13) {
                    i11 = i10 + 1;
                }
                boolean z14 = pushMessageContentMediaAlbum.hasDocuments;
                int i12 = i11;
                if (z14) {
                    i12 = i11 + 1;
                }
                if (i12 > 1 || i12 == 0) {
                    return new d(f13561y, 0, w.o2(R.string.xMedia, pushMessageContentMediaAlbum.totalCount), true);
                }
                if (z14) {
                    return new d(B, 0, w.o2(R.string.xFiles, pushMessageContentMediaAlbum.totalCount), true);
                }
                if (z13) {
                    return new d(A, 0, w.o2(R.string.xAudios, pushMessageContentMediaAlbum.totalCount), true);
                }
                if (z12) {
                    return new d(C, 0, w.o2(R.string.xVideos, pushMessageContentMediaAlbum.totalCount), true);
                }
                return new d(f13562z, 0, w.o2(R.string.xPhotos, pushMessageContentMediaAlbum.totalCount), true);
            case TdApi.PushMessageContentGame.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent3 = notificationTypeNewPushMessage.content;
                if (!((TdApi.PushMessageContentGame) pushMessageContent3).isPinned) {
                    return S1(TdApi.MessageGame.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentGame) pushMessageContent3).title, 0);
                }
                String str2 = ((TdApi.PushMessageContentGame) pushMessageContent3).title;
                return Q1(i.i(str2) ? R.string.ActionPinnedGameNoName : R.string.ActionPinnedGame, TdApi.MessageGame.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, i.i(str2) ? null : str2, 0);
            case TdApi.PushMessageContentDocument.CONSTRUCTOR:
                TdApi.Document document = ((TdApi.PushMessageContentDocument) notificationTypeNewPushMessage.content).document;
                if (i.i(null) && document != null) {
                    str = document.fileName;
                }
                return ((TdApi.PushMessageContentDocument) notificationTypeNewPushMessage.content).isPinned ? Q1(R.string.ActionPinnedFile, TdApi.MessageDocument.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, 0) : S1(TdApi.MessageDocument.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, 0);
            case TdApi.PushMessageContentHidden.CONSTRUCTOR:
                if (((TdApi.PushMessageContentHidden) notificationTypeNewPushMessage.content).isPinned) {
                    return Q1(R.string.ActionPinnedNoText, TdApi.MessageText.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
                }
                return new d(w.o2(R.string.xNewMessages, 1L), true);
            case TdApi.PushMessageContentContactRegistered.CONSTRUCTOR:
                return S1(TdApi.MessageContactRegistered.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentPoll.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent4 = notificationTypeNewPushMessage.content;
                if (!((TdApi.PushMessageContentPoll) pushMessageContent4).isPinned) {
                    return S1(TdApi.MessagePoll.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentPoll) pushMessageContent4).question, !((TdApi.PushMessageContentPoll) pushMessageContent4).isRegular ? 1 : 0);
                }
                return Q1(((TdApi.PushMessageContentPoll) pushMessageContent4).isRegular ? R.string.ActionPinnedPoll : R.string.ActionPinnedQuiz, TdApi.MessagePoll.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentPoll) pushMessageContent4).question, !((TdApi.PushMessageContentPoll) pushMessageContent4).isRegular ? 1 : 0);
            case TdApi.PushMessageContentContact.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent5 = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentContact) pushMessageContent5).isPinned ? Q1(R.string.ActionPinnedContact, TdApi.MessageContact.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentContact) pushMessageContent5).name, 0) : S1(TdApi.MessageContact.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentContact) pushMessageContent5).name, 0);
            case TdApi.PushMessageContentVoiceNote.CONSTRUCTOR:
                if (i.i(null) && (voiceNote = ((TdApi.PushMessageContentVoiceNote) notificationTypeNewPushMessage.content).voiceNote) != null && voiceNote.duration > 0) {
                    str = w.j1(R.string.ChatContentVoiceDuration, w.i1(R.string.ChatContentVoice), c0.h(voiceNote.duration));
                    z11 = true;
                }
                return ((TdApi.PushMessageContentVoiceNote) notificationTypeNewPushMessage.content).isPinned ? R1(R.string.ActionPinnedVoice, TdApi.MessageVoiceNote.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z11, 0) : T1(TdApi.MessageVoiceNote.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z11, 0);
            case TdApi.PushMessageContentPhoto.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent6 = notificationTypeNewPushMessage.content;
                String str3 = ((TdApi.PushMessageContentPhoto) pushMessageContent6).caption;
                if (((TdApi.PushMessageContentPhoto) pushMessageContent6).isPinned) {
                    return Q1(R.string.ActionPinnedPhoto, TdApi.MessagePhoto.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str3, 0);
                }
                if (((TdApi.PushMessageContentPhoto) pushMessageContent6).isSecret) {
                    return new d(f13541e, (int) R.string.SelfDestructPhoto, str3, false);
                }
                return S1(TdApi.MessagePhoto.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str3, 0);
            case TdApi.PushMessageContentChatSetTheme.CONSTRUCTOR:
                return S1(TdApi.MessageChatSetTheme.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentChatSetTheme) notificationTypeNewPushMessage.content).themeName, 0);
            case TdApi.PushMessageContentScreenshotTaken.CONSTRUCTOR:
                return S1(TdApi.MessageScreenshotTaken.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            case TdApi.PushMessageContentText.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent7 = notificationTypeNewPushMessage.content;
                return ((TdApi.PushMessageContentText) pushMessageContent7).isPinned ? Q1(R.string.ActionPinnedNoText, TdApi.MessageText.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentText) pushMessageContent7).text, 0) : S1(TdApi.MessageText.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentText) pushMessageContent7).text, 0);
            case TdApi.PushMessageContentVideo.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent8 = notificationTypeNewPushMessage.content;
                String str4 = ((TdApi.PushMessageContentVideo) pushMessageContent8).caption;
                if (((TdApi.PushMessageContentVideo) pushMessageContent8).isPinned) {
                    return Q1(R.string.ActionPinnedVideo, TdApi.MessageVideo.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str4, 0);
                }
                if (((TdApi.PushMessageContentVideo) pushMessageContent8).isSecret) {
                    return new d(f13542f, (int) R.string.SelfDestructVideo, str4);
                }
                return S1(TdApi.MessageVideo.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str4, 0);
            case TdApi.PushMessageContentAudio.CONSTRUCTOR:
                TdApi.Audio audio = ((TdApi.PushMessageContentAudio) notificationTypeNewPushMessage.content).audio;
                if (i.i(null) && audio != null) {
                    str = w.j1(R.string.ChatContentSong, m2(audio), f2(audio));
                    if (!E2(audio) || !D2(audio)) {
                        z11 = true;
                    }
                }
                return ((TdApi.PushMessageContentAudio) notificationTypeNewPushMessage.content).isPinned ? R1(R.string.ActionPinnedMusic, TdApi.MessageAudio.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z11, 0) : T1(TdApi.MessageAudio.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str, z11, 0);
            case TdApi.PushMessageContentChatDeleteMember.CONSTRUCTOR:
                TdApi.PushMessageContentChatDeleteMember pushMessageContentChatDeleteMember = (TdApi.PushMessageContentChatDeleteMember) notificationTypeNewPushMessage.content;
                if (pushMessageContentChatDeleteMember.isLeft) {
                    return new d(f13545i, (int) R.string.ChatContentGroupLeft);
                }
                if (pushMessageContentChatDeleteMember.isCurrentUser) {
                    return new d(f13545i, (int) R.string.ChatContentGroupKickYou);
                }
                return new d(f13545i, 0, w.j1(R.string.ChatContentGroupKick, pushMessageContentChatDeleteMember.memberName), true);
            case TdApi.PushMessageContentGameScore.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent9 = notificationTypeNewPushMessage.content;
                if (((TdApi.PushMessageContentGameScore) pushMessageContent9).isPinned) {
                    return Q1(R.string.ActionPinnedNoText, TdApi.MessageGameScore.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
                }
                TdApi.PushMessageContentGameScore pushMessageContentGameScore = (TdApi.PushMessageContentGameScore) pushMessageContent9;
                String str5 = pushMessageContentGameScore.title;
                if (!i.i(str5)) {
                    return new d(f13544h, 0, w.p2(R.string.game_ActionScoredInGame, pushMessageContentGameScore.score, str5), true);
                }
                return new d(f13544h, 0, w.o2(R.string.game_ActionScored, pushMessageContentGameScore.score), true);
            case TdApi.PushMessageContentAnimation.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent10 = notificationTypeNewPushMessage.content;
                String str6 = ((TdApi.PushMessageContentAnimation) pushMessageContent10).caption;
                return ((TdApi.PushMessageContentAnimation) pushMessageContent10).isPinned ? Q1(R.string.ActionPinnedGif, TdApi.MessageAnimation.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str6, 0) : S1(TdApi.MessageAnimation.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, str6, 0);
            case TdApi.PushMessageContentSticker.CONSTRUCTOR:
                TdApi.PushMessageContent pushMessageContent11 = notificationTypeNewPushMessage.content;
                if (((TdApi.PushMessageContentSticker) pushMessageContent11).isPinned) {
                    return Q1(R.string.ActionPinnedSticker, TdApi.MessageSticker.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentSticker) pushMessageContent11).emoji, 0);
                }
                if (((TdApi.PushMessageContentSticker) pushMessageContent11).sticker == null || !ob.e.X0(((TdApi.PushMessageContentSticker) pushMessageContent11).sticker.type)) {
                    return S1(TdApi.MessageSticker.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, ((TdApi.PushMessageContentSticker) notificationTypeNewPushMessage.content).emoji, 0);
                }
                TdApi.MessageSender messageSender = notificationTypeNewPushMessage.senderId;
                String str7 = notificationTypeNewPushMessage.senderName;
                return S1(TdApi.MessageSticker.CONSTRUCTOR, o6Var, j10, messageSender, str7, "animated" + ((TdApi.PushMessageContentSticker) notificationTypeNewPushMessage.content).emoji, 0);
            case TdApi.PushMessageContentChatJoinByLink.CONSTRUCTOR:
                return S1(TdApi.MessageChatJoinByLink.CONSTRUCTOR, o6Var, j10, notificationTypeNewPushMessage.senderId, notificationTypeNewPushMessage.senderName, null, 0);
            default:
                throw new AssertionError(notificationTypeNewPushMessage.content);
        }
    }

    public static boolean V2(TdApi.File file) {
        return T2(file) && !X2(file);
    }

    public static void V3(o6.f fVar, d.a aVar, TdApi.Message message, o6 o6Var, boolean z10, d dVar, o6.f fVar2) {
        if (fVar2.f28132a.size() > fVar.f28132a.size()) {
            aVar.b(message.chatId, message.f19946id, A0(o6Var, message, fVar2, z10), dVar);
        } else {
            aVar.a(message.chatId, message.f19946id, dVar);
        }
    }

    public static TdApi.SearchMessagesFilter V4(Bundle bundle, String str) {
        int i10 = bundle.getInt(str + "type", 0);
        if (i10 == 0) {
            return null;
        }
        switch (i10) {
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

    public static TdApi.ChatList W(String str) {
        if (i.i(str)) {
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
            return new TdApi.ChatListFilter(i.s(str.substring(6)));
        }
        return null;
    }

    public static int W0(String str) {
        int[] iArr = f13537a;
        return iArr[ib.h.m(iArr.length, str)];
    }

    public static String W1(String str) {
        if (i.i(str) || str.startsWith("+")) {
            return str;
        }
        return "+" + str;
    }

    public static boolean W2(TdApi.File file) {
        TdApi.RemoteFile remoteFile;
        TdApi.LocalFile localFile;
        return file != null && (((remoteFile = file.remote) != null && remoteFile.isUploadingActive && !Y2(file)) || ((localFile = file.local) != null && localFile.isDownloadingActive && !T2(file)));
    }

    public static void W3(final o6 o6Var, final TdApi.Message message, final o6.f fVar, final boolean z10, final d dVar, final d.a aVar) {
        o6Var.w5(message, false, fVar, new kb.j() {
            @Override
            public final void a(Object obj) {
                t2.V3(o6.f.this, aVar, message, o6Var, z10, dVar, (o6.f) obj);
            }
        });
    }

    public static ob.d W4(Bundle bundle, String str) {
        long j10 = bundle.getLong(str + "_id");
        if (j10 == 0) {
            return null;
        }
        long j11 = bundle.getLong(str + "_chatId");
        return new ob.d(j11, j10, bundle.getLongArray(str + "_otherIds"));
    }

    public static boolean X(TdApi.ChatPermissions chatPermissions, int i10) {
        switch (i10) {
            case R.id.right_changeChatInfo:
                return chatPermissions.canChangeInfo;
            case R.id.right_deleteMessages:
            case R.id.right_editMessages:
            case R.id.right_icon:
            case R.id.right_manageVideoChats:
            case R.id.right_remainAnonymous:
            default:
                throw new IllegalArgumentException(w.e1(i10));
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

    public static int X0(String str) {
        int abs = Math.abs(str.hashCode()) % 3;
        return abs != 0 ? abs != 1 ? abs != 2 ? R.id.theme_color_file : R.id.theme_color_fileGreen : R.id.theme_color_fileRed : R.id.theme_color_fileYellow;
    }

    public static TdApi.File X1(TdApi.Chat chat) {
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        if (chatPhotoInfo == null || S2(chatPhotoInfo.small)) {
            return null;
        }
        return chat.photo.small;
    }

    public static boolean X2(TdApi.File file) {
        if (!T2(file)) {
            return false;
        }
        File file2 = new File(file.local.path);
        if (!file2.exists()) {
            return true;
        }
        long length = file2.length();
        return length < ((long) file.local.downloadedSize) && length > 0;
    }

    public static void X3(d.a aVar, long j10, TdApi.Message message, o6 o6Var, boolean z10, boolean z11, d dVar, TdApi.Message message2) {
        if (message2 != null) {
            aVar.b(j10, message.f19946id, new d(f13560x, c1(o6Var, j10, message2, z10, z11)), dVar);
        } else {
            aVar.a(j10, message.f19946id, dVar);
        }
    }

    public static TdApi.MessageSender X4(Bundle bundle, String str) {
        long j10 = bundle.getLong(str + "chat_id");
        if (j10 != 0) {
            return new TdApi.MessageSenderChat(j10);
        }
        long j11 = bundle.getLong(str + "user_id");
        if (j11 != 0) {
            return new TdApi.MessageSenderUser(j11);
        }
        return null;
    }

    public static l0[] Y(v4<?> v4Var, o6 o6Var, CharSequence charSequence, boolean z10, hj.q qVar) {
        ArrayList arrayList;
        if (i.i(charSequence)) {
            return null;
        }
        l0[] E2 = l0.E(o6Var, charSequence.toString(), x5(charSequence, z10), qVar);
        if (E2 == null || E2.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(E2.length);
            arrayList.addAll(Arrays.asList(E2));
        }
        if (arrayList == null) {
            return null;
        }
        l0[] l0VarArr = (l0[]) arrayList.toArray(new l0[0]);
        Arrays.sort(l0VarArr, e2.f12933a);
        return l0VarArr;
    }

    public static int Y0(long j10, long j11) {
        String str;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 >= 0 && j11 < f13537a.length) {
            return (int) j11;
        }
        try {
            if (i10 < 0 || j10 == 0) {
                str = String.format(Locale.US, "%d", Long.valueOf(j11));
            } else {
                str = String.format(Locale.US, "%d%d", Long.valueOf(j11), Long.valueOf(j10));
            }
            if (str.length() > 15) {
                str = str.substring(0, 15);
            }
            int i11 = MessageDigest.getInstance("MD5").digest(str.getBytes(i.f14176a))[(int) Math.abs(j11 % 16)];
            if (i11 < 0) {
                i11 += Log.TAG_CRASH;
            }
            return Math.abs(i11) % f13537a.length;
        } catch (Throwable th) {
            Log.e("Cannot calculate user color", th, new Object[0]);
            return (int) Math.abs(j11 % f13537a.length);
        }
    }

    public static String Y1(o6 o6Var, int i10, l1 l1Var) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        int m10 = l1Var.m();
        int k10 = l1Var.k(o6Var);
        int o10 = l1Var.o(o6Var);
        switch (i10) {
            case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                i12 = R.string.PrivacyAllowFindingContactsExcept;
                i11 = R.string.PrivacyAllowFindingContacts;
                i14 = R.string.PrivacyAllowFindingEverybodyExcept;
                i13 = R.string.PrivacyAllowFindingEverybody;
                i16 = R.string.PrivacyAllowFindingContactsExcept;
                i15 = R.string.PrivacyAllowFindingContacts;
                break;
            case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                i12 = R.string.PrivacyCallsNobodyExcept;
                i11 = R.string.PrivacyCallsNobody;
                i16 = R.string.PrivacyCallsContactsExcept;
                i15 = R.string.PrivacyCallsContacts;
                i14 = R.string.PrivacyCallsEverybodyExcept;
                i13 = R.string.PrivacyCallsEverybody;
                break;
            case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                i12 = R.string.PrivacyShowNumberNobodyExcept;
                i11 = R.string.PrivacyShowNumberNobody;
                i16 = R.string.PrivacyShowNumberContactsExcept;
                i15 = R.string.PrivacyShowNumberContacts;
                i14 = R.string.PrivacyShowNumberEverybodyExcept;
                i13 = R.string.PrivacyShowNumberEverybody;
                break;
            case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                i12 = R.string.PrivacyP2PNobodyExcept;
                i11 = R.string.PrivacyP2PNobody;
                i16 = R.string.PrivacyP2PContactsExcept;
                i15 = R.string.PrivacyP2PContacts;
                i14 = R.string.PrivacyP2PEverybodyExcept;
                i13 = R.string.PrivacyP2PEverybody;
                break;
            case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                i12 = R.string.PrivacyForwardLinkNobodyExcept;
                i11 = R.string.PrivacyForwardLinkNobody;
                i16 = R.string.PrivacyForwardLinkContactsExcept;
                i15 = R.string.PrivacyForwardLinkContacts;
                i14 = R.string.PrivacyForwardLinkEverybodyExcept;
                i13 = R.string.PrivacyForwardLinkEverybody;
                break;
            case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                i12 = R.string.PrivacyAddToGroupsNobodyExcept;
                i11 = R.string.PrivacyAddToGroupsNobody;
                i16 = R.string.PrivacyAddToGroupsContactsExcept;
                i15 = R.string.PrivacyAddToGroupsContacts;
                i14 = R.string.PrivacyAddToGroupsEverybodyExcept;
                i13 = R.string.PrivacyAddToGroupsEverybody;
                break;
            case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                i12 = R.string.PrivacyPhotoNobodyExcept;
                i11 = R.string.PrivacyPhotoNobody;
                i16 = R.string.PrivacyPhotoContactsExcept;
                i15 = R.string.PrivacyPhotoContacts;
                i14 = R.string.PrivacyPhotoEverybodyExcept;
                i13 = R.string.PrivacyPhotoEverybody;
                break;
            case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                i12 = R.string.PrivacyLastSeenNobodyExcept;
                i11 = R.string.PrivacyLastSeenNobody;
                i16 = R.string.PrivacyLastSeenContactsExcept;
                i15 = R.string.PrivacyLastSeenContacts;
                i14 = R.string.PrivacyLastSeenEverybodyExcept;
                i13 = R.string.PrivacyLastSeenEverybody;
                break;
            default:
                throw new IllegalArgumentException("privacyKey == " + i10);
        }
        if (m10 != 0) {
            if (m10 == 1) {
                i12 = i16;
                i11 = i15;
            } else if (m10 == 2) {
                i12 = i14;
                i11 = i13;
            } else {
                throw new IllegalArgumentException("ruleType == " + m10);
            }
        }
        if (o10 > 0 && k10 > 0) {
            str = w.j1(R.string.format_minusPlus, Integer.valueOf(k10), Integer.valueOf(o10));
        } else if (k10 > 0) {
            str = w.j1(R.string.format_minus, Integer.valueOf(k10));
        } else {
            str = o10 > 0 ? w.j1(R.string.format_plus, Integer.valueOf(o10)) : null;
        }
        if (str == null) {
            return w.i1(i11);
        }
        if (i12 != 0) {
            return w.j1(i12, str);
        }
        return w.i1(i11) + " " + str;
    }

    public static boolean Y2(TdApi.File file) {
        TdApi.RemoteFile remoteFile;
        return (file == null || (remoteFile = file.remote) == null || !remoteFile.isUploadingCompleted) ? false : true;
    }

    public static void Y3(final o6 o6Var, final long j10, long j11, final TdApi.Message message, final boolean z10, final boolean z11, final d dVar, final d.a aVar) {
        o6Var.J5(j10, j11, new kb.j() {
            @Override
            public final void a(Object obj) {
                t2.X3(t2.d.a.this, j10, message, o6Var, z10, z11, dVar, (TdApi.Message) obj);
            }
        });
    }

    public static void Y4(e eVar) {
        int constructor = eVar.f().getConstructor();
        if (constructor == -1718914651) {
            v0.N(eVar.g(), 0);
        } else if (constructor == -290816582) {
            v0.N(eVar.g(), 2);
        } else if (constructor != 1430816539) {
            d5(eVar);
        } else {
            v0.N(eVar.g(), 1);
        }
    }

    public static boolean Z(TdApi.Poll poll, TdApi.Poll poll2) {
        if (poll.options.length != poll2.options.length || !i.c(poll.question, poll2.question)) {
            return false;
        }
        int i10 = 0;
        for (TdApi.PollOption pollOption : poll.options) {
            if (!i.c(pollOption.text, poll2.options[i10].text)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static int Z0(TdApi.InputMessageContent inputMessageContent) {
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

    public static int Z1(TdApi.ChatAction chatAction) {
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

    public static boolean Z2(TdApi.Call call) {
        int constructor;
        return call == null || (constructor = call.state.getConstructor()) == -2133790038 || constructor == -975215467 || constructor == 1394310213;
    }

    public static void Z3(d.a aVar, TdApi.Message message, TdApi.MessageGameScore messageGameScore, d dVar, TdApi.Message message2) {
        if (message2 != null && message2.content.getConstructor() == -69441162) {
            String w12 = w1(((TdApi.MessageGame) message2.content).game, false);
            if (!i.i(w12)) {
                aVar.b(message.chatId, message.f19946id, new d(f13544h, 0, w.p2(message.isOutgoing ? R.string.game_ActionYouScoredInGame : R.string.game_ActionScoredInGame, messageGameScore.score, w12), true), dVar);
                return;
            }
        }
        aVar.a(message.chatId, message.f19946id, dVar);
    }

    public static void Z4(final List<e> list) {
        if (Build.VERSION.SDK_INT >= 23) {
            org.thunderdog.challegram.a E2 = j0.E();
            if (E2 != null) {
                if (E2.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    E2.K2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new ie.a() {
                        @Override
                        public final void l1(int i10, boolean z10) {
                            t2.f4(list, i10, z10);
                        }
                    });
                    return;
                }
            } else {
                return;
            }
        }
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                t2.g4(list);
            }
        });
    }

    public static int a0(TdApi.WebPage webPage) {
        if (webPage == null) {
            return TdApi.MessageText.CONSTRUCTOR;
        }
        return webPage.sticker != null ? TdApi.MessageSticker.CONSTRUCTOR : webPage.video != null ? TdApi.MessageVideo.CONSTRUCTOR : webPage.animation != null ? TdApi.MessageAnimation.CONSTRUCTOR : webPage.audio != null ? TdApi.MessageAudio.CONSTRUCTOR : webPage.document != null ? TdApi.MessageDocument.CONSTRUCTOR : webPage.photo != null ? TdApi.MessagePhoto.CONSTRUCTOR : TdApi.MessageText.CONSTRUCTOR;
    }

    public static int a1(TdApi.Message message) {
        if (message == null || C3(message)) {
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

    public static String a2(TdApi.User user, int i10) {
        if (i10 == -160019714) {
            return w.i1(R.string.ChannelOwner);
        }
        if (i10 == -70024163) {
            return w.i1(R.string.Administrator);
        }
        if (i10 != 844723285 || user == null || user.type.getConstructor() != -970625144) {
            return null;
        }
        return w.i1(((TdApi.UserTypeBot) user.type).canReadAllGroupMessages ? R.string.BotStatusRead : R.string.BotStatusCantRead);
    }

    public static boolean a3(TdApi.User user) {
        return user != null && user.type.getConstructor() == -598644325;
    }

    public static void a4(o6 o6Var, final TdApi.Message message, final TdApi.MessageGameScore messageGameScore, final d dVar, final d.a aVar) {
        o6Var.J5(message.chatId, messageGameScore.gameMessageId, new kb.j() {
            @Override
            public final void a(Object obj) {
                t2.Z3(t2.d.a.this, message, messageGameScore, dVar, (TdApi.Message) obj);
            }
        });
    }

    public static void a5(Bundle bundle, String str, TdApi.SearchMessagesFilter searchMessagesFilter) {
        int i10;
        if (searchMessagesFilter != null) {
            switch (searchMessagesFilter.getConstructor()) {
                case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                    i10 = 8;
                    break;
                case TdApi.SearchMessagesFilterChatPhoto.CONSTRUCTOR:
                    i10 = 9;
                    break;
                case TdApi.SearchMessagesFilterFailedToSend.CONSTRUCTOR:
                    i10 = 16;
                    break;
                case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                    i10 = 1;
                    break;
                case TdApi.SearchMessagesFilterUnreadMention.CONSTRUCTOR:
                    i10 = 15;
                    break;
                case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                    i10 = 5;
                    break;
                case TdApi.SearchMessagesFilterPinned.CONSTRUCTOR:
                    i10 = 17;
                    break;
                case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                    i10 = 12;
                    break;
                case TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR:
                    i10 = 13;
                    break;
                case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                    i10 = 2;
                    break;
                case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                    i10 = 4;
                    break;
                case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                    i10 = 7;
                    break;
                case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                    i10 = 3;
                    break;
                case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                    i10 = 6;
                    break;
                case TdApi.SearchMessagesFilterMention.CONSTRUCTOR:
                    i10 = 14;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            if (i10 != 0) {
                bundle.putInt(str + "type", i10);
            }
        }
    }

    public static TdApi.Photo b0(TdApi.Sticker sticker) {
        TdApi.PhotoSize M5 = M5(sticker.thumbnail);
        TdApi.PhotoSize[] photoSizeArr = new TdApi.PhotoSize[M5 != null ? 2 : 1];
        if (M5 != null) {
            photoSizeArr[0] = M5;
            photoSizeArr[1] = new TdApi.PhotoSize("w", sticker.sticker, sticker.width, sticker.height, null);
        } else {
            photoSizeArr[0] = new TdApi.PhotoSize("w", sticker.sticker, sticker.width, sticker.height, null);
        }
        return new TdApi.Photo(false, null, photoSizeArr);
    }

    public static d b1(int i10, o6 o6Var, long j10, TdApi.MessageSender messageSender, String str, boolean z10, boolean z11, TdApi.FormattedText formattedText, boolean z12, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = R.string.ChatContentGroupCreate_outgoing;
        String str2 = null;
        f fVar = null;
        f fVar2 = null;
        boolean z13 = true;
        switch (i10) {
            case TdApi.MessageInvoice.CONSTRUCTOR:
                f fVar3 = f13557u;
                if (!ob.e.c1(formattedText)) {
                    str2 = w.j1(R.string.InvoiceFor, ob.e.V0(formattedText));
                }
                return new d(fVar3, (int) R.string.Invoice, str2, true);
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return new d(f13538b, (int) R.string.ChatContentPhoto, formattedText, z12);
            case TdApi.MessageChatSetTheme.CONSTRUCTOR:
                if (z10) {
                    return new d(f13546j, 0, A5(w.m1(R.string.ChatContentThemeSet_outgoing, formattedText.text), true));
                }
                return new d(f13546j, 0, A5(w.m1(R.string.ChatContentThemeSet, formattedText.text), true));
            case TdApi.MessageScreenshotTaken.CONSTRUCTOR:
                if (z10) {
                    return new d(f13559w, (int) R.string.YouTookAScreenshot);
                }
                if (z11) {
                    return new d(f13559w, (int) R.string.ChatContentScreenshot);
                }
                return new d(f13559w, 0, w.j1(R.string.XTookAScreenshot, d2(o6Var, messageSender, str)), true);
            case TdApi.MessageContactRegistered.CONSTRUCTOR:
                return new d(f13558v, 0, w.j1(R.string.NotificationContactJoined, d2(o6Var, messageSender, str)), true);
            case TdApi.MessageExpiredPhoto.CONSTRUCTOR:
                return new d(f13541e, (int) R.string.AttachPhotoExpired);
            case TdApi.MessageExpiredVideo.CONSTRUCTOR:
                return new d(f13542f, (int) R.string.AttachVideoExpired);
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                if (o6Var.O6(j10)) {
                    return new d(f13538b, (int) R.string.ActionChannelChangedPhoto);
                }
                return new d(f13538b, z10 ? R.string.ChatContentGroupPhoto_outgoing : R.string.ChatContentGroupPhoto);
            case TdApi.MessagePoll.CONSTRUCTOR:
                if (i11 == 1) {
                    return new d(f13553q, (int) R.string.Quiz, formattedText, z12);
                }
                return new d(f13552p, (int) R.string.Poll, formattedText, z12);
            case TdApi.MessageContact.CONSTRUCTOR:
                return new d(f13551o, (int) R.string.AttachContact, formattedText, z12);
            case TdApi.MessageSupergroupChatCreate.CONSTRUCTOR:
                if (o6Var.O6(j10)) {
                    return new d(f13548l, (int) R.string.ActionCreateChannel);
                }
                f fVar4 = f13545i;
                if (!z10) {
                    i19 = R.string.ChatContentGroupCreate;
                }
                return new d(fVar4, i19);
            case TdApi.MessageChatDeletePhoto.CONSTRUCTOR:
                if (o6Var.O6(j10)) {
                    return new d(f13548l, (int) R.string.ActionChannelRemovedPhoto);
                }
                return new d(f13545i, z10 ? R.string.ChatContentGroupPhotoRemove_outgoing : R.string.ChatContentGroupPhotoRemove);
            case TdApi.MessageGame.CONSTRUCTOR:
                return new d(f13544h, 0, w.j1(ob.a.h(j10) ? z10 ? R.string.NotificationGame_group_outgoing : R.string.NotificationGame_group : z10 ? R.string.NotificationGame_outgoing : R.string.NotificationGame, ob.e.V0(formattedText)), true);
            case TdApi.MessageAudio.CONSTRUCTOR:
                return new d(f13550n, 0, formattedText, z12);
            case TdApi.MessageLocation.CONSTRUCTOR:
                return new d(f13556t, "live".equals(ob.e.V0(formattedText)) ? R.string.AttachLiveLocation : R.string.Location);
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                return new d(f13554r, (int) R.string.ChatContentVoice, formattedText, z12);
            case TdApi.MessageCall.CONSTRUCTOR:
                if (i11 != -2) {
                    int i20 = R.string.OutgoingCall;
                    if (i11 == -1) {
                        f fVar5 = S;
                        if (!z10) {
                            i20 = R.string.CallMessageIncomingDeclined;
                        }
                        return new d(fVar5, i20);
                    } else if (i11 > 0) {
                        f fVar6 = N;
                        Object[] objArr = new Object[2];
                        if (!z10) {
                            i20 = R.string.IncomingCall;
                        }
                        objArr[0] = w.i1(i20);
                        objArr[1] = w.x0(i11);
                        return new d(fVar6, 0, w.j1(R.string.ChatContentCallWithDuration, objArr), true);
                    } else {
                        f fVar7 = N;
                        if (!z10) {
                            i20 = R.string.IncomingCall;
                        }
                        return new d(fVar7, i20);
                    }
                } else {
                    return new d(R, z10 ? R.string.CallMessageOutgoingMissed : R.string.MissedCall);
                }
            case TdApi.MessageDocument.CONSTRUCTOR:
                return new d(f13549m, (int) R.string.ChatContentFile, formattedText, z12);
            case TdApi.MessageChatChangeTitle.CONSTRUCTOR:
                if (o6Var.O6(j10)) {
                    return new d(f13548l, 0, w.j1(R.string.ActionChannelChangedTitleTo, ob.e.V0(formattedText)), true);
                }
                return new d(f13545i, 0, w.j1(z10 ? R.string.ChatContentGroupName_outgoing : R.string.ChatContentGroupName, ob.e.V0(formattedText)), true);
            case TdApi.MessageBasicGroupChatCreate.CONSTRUCTOR:
                f fVar8 = f13545i;
                if (!z10) {
                    i19 = R.string.ChatContentGroupCreate;
                }
                return new d(fVar8, i19);
            case TdApi.MessageAnimatedEmoji.CONSTRUCTOR:
                return new d((f) null, (int) R.string.YouHaveNewMessage, formattedText, z12);
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return new d(f13540d, (int) R.string.ChatContentRoundVideo, formattedText, z12);
            case TdApi.MessageDice.CONSTRUCTOR:
                String str3 = (ob.e.c1(formattedText) || !o6Var.X6(formattedText.text)) ? G.f13581a : formattedText.text;
                f fVar9 = F;
                if (fVar9.f13581a.equals(str3)) {
                    return new d(fVar9, d1(i11));
                }
                f fVar10 = G;
                if (!fVar10.f13581a.equals(str3)) {
                    return new d(new f(str3, 0), 0);
                }
                if (i11 >= 1 && i11 <= 6) {
                    switch (i11) {
                        case 1:
                            return new d(H, 0, w.o2(R.string.ChatContentDiceRolled, i11), true);
                        case 2:
                            return new d(I, 0, w.o2(R.string.ChatContentDiceRolled, i11), true);
                        case 3:
                            return new d(J, 0, w.o2(R.string.ChatContentDiceRolled, i11), true);
                        case 4:
                            return new d(K, 0, w.o2(R.string.ChatContentDiceRolled, i11), true);
                        case 5:
                            return new d(L, 0, w.o2(R.string.ChatContentDiceRolled, i11), true);
                        case 6:
                            return new d(M, 0, w.o2(R.string.ChatContentDiceRolled, i11), true);
                    }
                }
                return new d(fVar10, (int) R.string.ChatContentDice);
            case TdApi.MessageChatJoinByRequest.CONSTRUCTOR:
            case TdApi.MessageChatJoinByLink.CONSTRUCTOR:
                return new d(f13545i, z10 ? R.string.ChatContentGroupJoin_outgoing : R.string.ChatContentGroupJoin);
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return new d(f13555s, (int) R.string.ChatContentAnimation, formattedText, z12);
            case TdApi.MessageSticker.CONSTRUCTOR:
                String V0 = ob.e.V0(formattedText);
                if (V0 == null || !V0.startsWith("animated")) {
                    z13 = false;
                } else {
                    V0 = V0.substring(8);
                }
                if (!i.i(V0)) {
                    fVar2 = new f(V0, 0);
                }
                return new d(fVar2, (!z13 || z11) ? R.string.Sticker : R.string.AnimatedSticker);
            case TdApi.MessageChatSetTtl.CONSTRUCTOR:
                if (i11 > 0) {
                    if (ob.a.l(j10)) {
                        i18 = R.string.ChatContentTtlSeconds;
                        i17 = R.string.ChatContentTtlMinutes;
                        i16 = R.string.ChatContentTtlHours;
                        i15 = R.string.ChatContentTtlDays;
                        i14 = R.string.ChatContentTtlWeeks;
                        i13 = R.string.ChatContentTtlMonths;
                    } else if (o6Var.O6(j10)) {
                        i18 = R.string.ChatContentChannelTtlSeconds;
                        i17 = R.string.ChatContentChannelTtlMinutes;
                        i16 = R.string.ChatContentChannelTtlHours;
                        i15 = R.string.ChatContentChannelTtlDays;
                        i14 = R.string.ChatContentChannelTtlWeeks;
                        i13 = R.string.ChatContentChannelTtlMonths;
                    } else {
                        i18 = R.string.ChatContentGroupTtlSeconds;
                        i17 = R.string.ChatContentGroupTtlMinutes;
                        i16 = R.string.ChatContentGroupTtlHours;
                        i15 = R.string.ChatContentGroupTtlDays;
                        i14 = R.string.ChatContentGroupTtlWeeks;
                        i13 = R.string.ChatContentGroupTtlMonths;
                    }
                    return new d(O, 0, A5(w.u2(i11, TimeUnit.SECONDS, i18, i17, i16, i15, i14, i13, new Object[0]), false), true);
                }
                if (ob.a.l(j10)) {
                    i12 = R.string.ChatContentTtlOff;
                } else {
                    i12 = o6Var.O6(j10) ? R.string.ChatContentChannelTtlOff : R.string.ChatContentGroupTtlOff;
                }
                return new d(P, i12);
            case TdApi.MessageText.CONSTRUCTOR:
                if (i11 == 1) {
                    fVar = f13543g;
                }
                return new d(fVar, (int) R.string.YouHaveNewMessage, formattedText, z12);
            case TdApi.MessageVideo.CONSTRUCTOR:
                return new d(f13539c, (int) R.string.ChatContentVideo, formattedText, z12);
            default:
                return null;
        }
    }

    public static int b2(TdApi.Chat chat) {
        if (chat == null || chat.type.getConstructor() != 862366513) {
            return 0;
        }
        return ((TdApi.ChatTypeSecret) chat.type).secretChatId;
    }

    public static boolean b3(int i10, int i11) {
        if (i11 == 12 || i11 == 29 || i11 == 30) {
            return false;
        }
        switch (i11) {
            case 20:
            case 21:
            case 22:
            case 23:
            case d.j.K3:
                return false;
            default:
                return true;
        }
    }

    public static void b4(d.a aVar, TdApi.Message message, d dVar, o6 o6Var, boolean z10, o6.f fVar) {
        if (fVar.f28132a.size() != 1 || fVar.a()) {
            d A0 = A0(o6Var, message, fVar, z10);
            if (fVar.f28132a.size() != 1) {
                aVar.b(message.chatId, message.f19946id, A0, dVar);
            } else if (A0.e()) {
                A0.g(aVar);
            } else {
                aVar.a(message.chatId, message.f19946id, dVar);
            }
        } else {
            aVar.a(message.chatId, message.f19946id, dVar);
        }
    }

    public static void b5(Bundle bundle, String str, ob.d dVar) {
        if (dVar != null) {
            bundle.putLong(str + "_chatId", dVar.c());
            bundle.putLong(str + "_id", dVar.d());
            bundle.putLongArray(str + "_otherIds", dVar.e());
        }
    }

    public static TdApi.InputFileGenerated c0(TdApi.File file) {
        String str = file.local.path;
        return new TdApi.InputFileGenerated(str, "copy" + jd.b.h(), file.size);
    }

    public static hd.t2.d c1(final zd.o6 r17, final long r18, final org.drinkless.td.libcore.telegram.TdApi.Message r20, final boolean r21, final boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: hd.t2.c1(zd.o6, long, org.drinkless.td.libcore.telegram.TdApi$Message, boolean, boolean):hd.t2$d");
    }

    public static TdApi.MessageSender c2(TdApi.Message[] messageArr) {
        if (messageArr == null || messageArr.length <= 0) {
            return null;
        }
        TdApi.MessageSender messageSender = messageArr[0].senderId;
        for (TdApi.Message message : messageArr) {
            if (!ob.e.Y(messageSender, message.senderId)) {
                return null;
            }
        }
        return messageSender;
    }

    public static boolean c3(TdApi.Message message) {
        if (message == null) {
            return false;
        }
        int constructor = message.content.getConstructor();
        if (constructor == 1989037971) {
            constructor = a0(((TdApi.MessageText) message.content).webPage);
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

    public static void c4(final o6 o6Var, final TdApi.Message message, final boolean z10, final d dVar, final d.a aVar) {
        o6Var.w5(message, true, null, new kb.j() {
            @Override
            public final void a(Object obj) {
                t2.b4(t2.d.a.this, message, dVar, o6Var, z10, (o6.f) obj);
            }
        });
    }

    public static void c5(Bundle bundle, String str, TdApi.MessageSender messageSender) {
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

    public static TdApi.InputFile d0(String str) {
        return f0(str, null, null);
    }

    public static int d1(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 6 ? R.string.ChatContentDart5 : R.string.ChatContentDart6 : R.string.ChatContentDart4 : R.string.ChatContentDart3 : R.string.ChatContentDart2 : R.string.ChatContentDart1 : R.string.ChatContentDart;
    }

    public static String d2(o6 o6Var, TdApi.MessageSender messageSender, String str) {
        return i.i(str) ? o6Var.Db(messageSender, true) : str;
    }

    public static boolean d3(TdApi.ChatMemberStatus chatMemberStatus) {
        return chatMemberStatus != null && chatMemberStatus.getConstructor() == -1653518666;
    }

    public static Object d4(d9 d9Var, long j10, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return w.h2(d9Var, j10);
        }
        return null;
    }

    public static void d5(final e eVar) {
        if (eVar != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                org.thunderdog.challegram.a E2 = j0.E();
                if (E2 != null) {
                    if (E2.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        E2.K2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new ie.a() {
                            @Override
                            public final void l1(int i10, boolean z10) {
                                t2.j4(t2.e.this, i10, z10);
                            }
                        });
                        return;
                    }
                } else {
                    return;
                }
            }
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    t2.k4(t2.e.this);
                }
            });
        }
    }

    public static TdApi.InputFile e0(String str, String str2) {
        return f0(str, str2, null);
    }

    public static e e1(i7 i7Var) {
        TdApi.Document document;
        TdApi.VoiceNote voiceNote;
        TdApi.Audio audio;
        if (i7Var == null) {
            return null;
        }
        TdApi.WebPage J2 = i7Var.J();
        n y10 = i7Var.y();
        if (y10 != null) {
            if (y10.R() && (audio = J2.audio) != null) {
                return e.i(audio);
            }
            if (y10.T() && (voiceNote = J2.voiceNote) != null) {
                return e.l(voiceNote);
            }
            if (y10.S() && (document = J2.document) != null) {
                return e.j(document);
            }
        }
        f0 G2 = i7Var.G();
        boolean z10 = false;
        if (G2 != null) {
            if (G2.U()) {
                return e.h(G2.v());
            }
            if (G2.a0()) {
                return e.k(G2.S());
            }
            if (G2.X()) {
                TdApi.File P2 = G2.P();
                if (J2.sticker != null) {
                    z10 = true;
                }
                return e.m(P2, z10);
            }
        }
        int I2 = i7Var.I();
        if (I2 == 1) {
            TdApi.Video video = J2.video;
            if (video != null) {
                return e.k(video);
            }
        } else if (I2 == 18) {
            TdApi.Document document2 = J2.document;
            if (document2 != null) {
                return e.j(document2);
            }
            return null;
        } else if (I2 == 3) {
            TdApi.Animation animation = J2.animation;
            if (animation != null) {
                return e.h(animation);
            }
            return null;
        } else if (I2 == 4) {
            if (J2.photo != null) {
                return e.m(i7Var.H(), false);
            }
            if (J2.sticker != null) {
                return e.m(i7Var.H(), true);
            }
        }
        return null;
    }

    public static String e2(String str) {
        return "https://" + g2() + "/addstickers/" + str;
    }

    public static boolean e3(Uri uri) {
        String host = uri.getHost();
        if (host != null) {
            for (String str : ob.f.f19346c) {
                if (i.c(str, host)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object e4(d9 d9Var, long j10, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return w.h2(d9Var, j10);
        }
        return null;
    }

    public static void e5(final File file, final String str) {
        if (file != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                org.thunderdog.challegram.a E2 = j0.E();
                if (E2 != null) {
                    if (E2.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        E2.K2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new ie.a() {
                            @Override
                            public final void l1(int i10, boolean z10) {
                                t2.h4(file, str, i10, z10);
                            }
                        });
                        return;
                    }
                } else {
                    return;
                }
            }
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    t2.g5(file, str);
                }
            });
        }
    }

    public static org.drinkless.td.libcore.telegram.TdApi.InputFile f0(java.lang.String r17, java.lang.String r18, hd.t2.g r19) {
        throw new UnsupportedOperationException("Method not decompiled: hd.t2.f0(java.lang.String, java.lang.String, hd.t2$g):org.drinkless.td.libcore.telegram.TdApi$InputFile");
    }

    public static e f1(TdApi.Message message) {
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                TdApi.PhotoSize n10 = f0.n(((TdApi.MessagePhoto) message.content).photo);
                if (n10 == null || !T2(n10.photo)) {
                    return null;
                }
                return e.m(n10.photo, false);
            case TdApi.MessageAudio.CONSTRUCTOR:
                TdApi.Audio audio = ((TdApi.MessageAudio) message.content).audio;
                if (audio == null || !T2(audio.audio)) {
                    return null;
                }
                return e.i(audio);
            case TdApi.MessageDocument.CONSTRUCTOR:
                TdApi.Document document = ((TdApi.MessageDocument) message.content).document;
                if (document == null || !T2(document.document)) {
                    return null;
                }
                return e.j(document);
            case TdApi.MessageAnimation.CONSTRUCTOR:
                TdApi.Animation animation = ((TdApi.MessageAnimation) message.content).animation;
                if (animation == null || !T2(animation.animation)) {
                    return null;
                }
                return e.h(animation);
            case TdApi.MessageVideo.CONSTRUCTOR:
                TdApi.Video video = ((TdApi.MessageVideo) message.content).video;
                if (video == null || !T2(video.video)) {
                    return null;
                }
                return e.k(video);
            default:
                return null;
        }
    }

    public static String f2(TdApi.Audio audio) {
        return !i.i(audio.performer) ? audio.performer : (i.i(audio.fileName) || i.c(audio.fileName, audio.title)) ? w.i1(R.string.AudioUnknownArtist) : audio.fileName;
    }

    public static boolean f3(TdApi.ChatMemberStatus chatMemberStatus) {
        return chatMemberStatus.getConstructor() == -5815259;
    }

    public static void f4(List list, int i10, boolean z10) {
        if (z10) {
            Z4(list);
        }
    }

    public static File f5(e eVar) {
        File file;
        File file2;
        File file3 = new File(eVar.g());
        if (!file3.exists()) {
            return null;
        }
        int constructor = eVar.f13580e.getConstructor();
        if (constructor == -709112160 || constructor == -588681661) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
        } else {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        int i10 = 0;
        while (true) {
            i10++;
            file2 = new File(file, eVar.e(i10));
            if (!file2.exists()) {
                break;
            }
        }
        if (!ib.g.a(file3, file2)) {
            return null;
        }
        v0.F2(file2);
        if (eVar.f13580e.getConstructor() == -709112160) {
            v0.m(file2);
            return file2;
        }
        DownloadManager downloadManager = (DownloadManager) j0.n().getSystemService("download");
        String name = file2.getName();
        String str = eVar.f13578c;
        if (i.i(str)) {
            String v02 = v0.v0(name);
            if (!i.i(v02)) {
                str = e0.g(v02);
            }
        }
        String str2 = str;
        if (i.i(name)) {
            if (i.i(str2)) {
                name = "file";
            } else {
                name = "file." + e0.a(str2);
            }
        }
        String str3 = name;
        if (downloadManager != null) {
            try {
                downloadManager.addCompletedDownload(str3, str3, true, str2, file2.getAbsolutePath(), file2.length(), true);
            } catch (Throwable th) {
                Log.w("Failed to notify about saved download", th, new Object[0]);
            }
        }
        return file2;
    }

    public static int g0(TdApi.User user, TdApi.User user2) {
        int compareToIgnoreCase = user.firstName.compareToIgnoreCase(user2.firstName);
        if (compareToIgnoreCase != 0) {
            return compareToIgnoreCase;
        }
        int compareToIgnoreCase2 = user.lastName.compareToIgnoreCase(user2.lastName);
        return compareToIgnoreCase2 != 0 ? compareToIgnoreCase2 : Long.compare(user.f19979id, user2.f19979id);
    }

    public static List<e> g1(TdApi.Message[] messageArr) {
        ArrayList arrayList = new ArrayList();
        for (TdApi.Message message : messageArr) {
            e f12 = f1(message);
            if (f12 != null) {
                arrayList.add(f12);
            }
        }
        return arrayList;
    }

    public static String g2() {
        return ob.f.f19346c[0];
    }

    public static boolean g3(String str) {
        return str.startsWith("X");
    }

    public static void g4(List list) {
        char c10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        loop0: while (true) {
            c10 = 65535;
            while (true) {
                char c11 = 3;
                if (!it.hasNext()) {
                    break loop0;
                }
                e eVar = (e) it.next();
                int constructor = eVar.f().getConstructor();
                if (constructor == -1718914651) {
                    z10 = v0.P(eVar.g(), 0, null);
                    c11 = 0;
                } else if (constructor == -290816582) {
                    z10 = v0.P(eVar.g(), 2, null);
                    c11 = 2;
                } else if (constructor != 1430816539) {
                    File f52 = f5(eVar);
                    if (f52 != null) {
                        arrayList.add(f52.getPath());
                    }
                    z10 = f52 != null;
                } else {
                    z10 = v0.P(eVar.g(), 1, null);
                    c11 = 1;
                }
                if (z10) {
                    i10++;
                    if (i10 == 1) {
                        c10 = c11;
                    } else if (c10 != c11) {
                        break;
                    }
                }
            }
        }
        if (i10 <= 0) {
            return;
        }
        if (c10 == 65535) {
            j0.z0(w.q2(R.string.SavedXFiles, i10), 0);
        } else if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        if (i10 == 1) {
                            j0.z0(w.m1(R.string.DownloadedToPath, arrayList.get(0)), 1);
                        } else {
                            j0.z0(w.r2(R.string.DownloadedXFiles, i10, c0.T("\n", arrayList)), 1);
                        }
                    }
                } else if (i10 == 1) {
                    j0.y0(R.string.GifHasBeenSavedToGallery, 0);
                } else {
                    j0.z0(w.q2(R.string.SavedXGifToGallery, i10), 0);
                }
            } else if (i10 == 1) {
                j0.y0(R.string.VideoHasBeenSavedToGallery, 0);
            } else {
                j0.z0(w.q2(R.string.XVideoSaved, i10), 0);
            }
        } else if (i10 == 1) {
            j0.y0(R.string.PhotoHasBeenSavedToGallery, 0);
        } else {
            j0.z0(w.q2(R.string.XPhotoSaved, i10), 0);
        }
    }

    public static void g5(File file, final String str) {
        if (file.exists()) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdir()) {
                String v02 = v0.v0(file.getName());
                final File d22 = i.i(v02) ? v0.d2(externalStoragePublicDirectory, file.getName(), e0.g(v02)) : v0.c2(externalStoragePublicDirectory, file.getName());
                if (ib.g.a(file, d22)) {
                    j0.d0(new Runnable() {
                        @Override
                        public final void run() {
                            t2.m4(d22, str);
                        }
                    });
                }
            }
        }
    }

    public static TdApi.PhoneNumberAuthenticationSettings h0() {
        return new TdApi.PhoneNumberAuthenticationSettings(false, true, false, false, he.i.c2().g0());
    }

    public static TdApi.FormattedText h1(TdApi.Poll poll) {
        if (poll.type.getConstructor() == 657013913) {
            return ((TdApi.PollTypeQuiz) poll.type).explanation;
        }
        return null;
    }

    public static String h2(TdApi.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        i2(richText, sb2);
        return sb2.toString();
    }

    public static boolean h3(TdApi.ChatMemberStatus chatMemberStatus) {
        return i3(chatMemberStatus, true);
    }

    public static void h4(File file, String str, int i10, boolean z10) {
        if (z10) {
            e5(file, str);
        }
    }

    public static List<TdApi.SendMessage> h5(long j10, long j11, long j12, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageContent inputMessageContent, int i10) {
        int i11;
        if (inputMessageContent.getConstructor() != 247050392) {
            return Collections.singletonList(new TdApi.SendMessage(j10, j11, j12, messageSendOptions, null, inputMessageContent));
        }
        TdApi.InputMessageText inputMessageText = (TdApi.InputMessageText) inputMessageContent;
        TdApi.FormattedText formattedText = inputMessageText.text;
        int length = formattedText.text.length();
        ArrayList arrayList = new ArrayList();
        if (length <= i10) {
            arrayList.add(new TdApi.SendMessage(j10, j11, j12, messageSendOptions, null, inputMessageText));
            return arrayList;
        }
        int i12 = 0;
        while (i12 < length) {
            int min = Math.min(i10, length - i12);
            int i13 = i12 + min;
            if (min != i10 || (i11 = je.g.F0(formattedText.text, i13 - (min / 4), i13, null)) == -1 || i11 <= i12 || i11 >= i13) {
                i11 = i13;
            }
            TdApi.FormattedText w12 = ob.e.w1(formattedText, i12, i11);
            boolean z10 = true;
            boolean z11 = i12 == 0;
            boolean z12 = z11 && inputMessageText.disableWebPagePreview;
            if (!z11 || !inputMessageText.clearDraft) {
                z10 = false;
            }
            arrayList.add(new TdApi.SendMessage(j10, j11, j12, messageSendOptions, null, new TdApi.InputMessageText(w12, z12, z10)));
            i12 = i13;
        }
        return arrayList;
    }

    public static TdApi.MessageSendOptions i0() {
        return new TdApi.MessageSendOptions(false, false, false, null);
    }

    public static TdApi.File i1(s4 s4Var) {
        TdApi.File j12 = j1(s4Var.X3());
        if (j12 != null) {
            return j12;
        }
        int constructor = s4Var.X3().content.getConstructor();
        if (constructor == -1851395174) {
            return ((n5) s4Var).oa();
        }
        if (constructor != 1989037971) {
            return null;
        }
        return ((h6) s4Var).la();
    }

    public static void i2(TdApi.RichText richText, StringBuilder sb2) {
        if (richText != null) {
            switch (richText.getConstructor()) {
                case TdApi.RichTextFixed.CONSTRUCTOR:
                    i2(((TdApi.RichTextFixed) richText).text, sb2);
                    return;
                case TdApi.RichTextUnderline.CONSTRUCTOR:
                    i2(((TdApi.RichTextUnderline) richText).text, sb2);
                    return;
                case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                    i2(((TdApi.RichTextEmailAddress) richText).text, sb2);
                    return;
                case TdApi.RichTextUrl.CONSTRUCTOR:
                    i2(((TdApi.RichTextUrl) richText).text, sb2);
                    return;
                case TdApi.RichTextPlain.CONSTRUCTOR:
                    sb2.append(((TdApi.RichTextPlain) richText).text);
                    return;
                case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                    i2(((TdApi.RichTextStrikethrough) richText).text, sb2);
                    return;
                case TdApi.RichTexts.CONSTRUCTOR:
                    for (TdApi.RichText richText2 : ((TdApi.RichTexts) richText).texts) {
                        i2(richText2, sb2);
                    }
                    return;
                case TdApi.RichTextBold.CONSTRUCTOR:
                    i2(((TdApi.RichTextBold) richText).text, sb2);
                    return;
                case TdApi.RichTextItalic.CONSTRUCTOR:
                    i2(((TdApi.RichTextItalic) richText).text, sb2);
                    return;
                default:
                    return;
            }
        }
    }

    public static boolean i3(TdApi.ChatMemberStatus chatMemberStatus, boolean z10) {
        if (chatMemberStatus == null) {
            return false;
        }
        switch (chatMemberStatus.getConstructor()) {
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                return z10 || ((TdApi.ChatMemberStatusCreator) chatMemberStatus).isMember;
            case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
            case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                return true;
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                return ((TdApi.ChatMemberStatusRestricted) chatMemberStatus).isMember;
            default:
                return false;
        }
    }

    public static void i5(TdApi.Message message) {
        int constructor = message.content.getConstructor();
        if (constructor == 527777781) {
            ((TdApi.MessageVoiceNote) message.content).isListened = true;
        } else if (constructor == 963323014) {
            ((TdApi.MessageVideoNote) message.content).isViewed = true;
        }
    }

    public static void j0(v4<?> v4Var, List<e> list, Runnable runnable) {
        int size = list.size();
        TdApi.File[] fileArr = new TdApi.File[size];
        for (int i10 = 0; i10 < size; i10++) {
            fileArr[i10] = list.get(i10).c();
        }
        k0(v4Var, fileArr, runnable);
    }

    public static TdApi.File j1(TdApi.Message message) {
        if (message == null) {
            return null;
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return k1(((TdApi.MessagePhoto) message.content).photo);
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                return ob.e.D0(((TdApi.MessageChatChangePhoto) message.content).photo.sizes).photo;
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
                return l1(((TdApi.MessageText) message.content).webPage);
            case TdApi.MessageVideo.CONSTRUCTOR:
                return ((TdApi.MessageVideo) message.content).video.video;
            default:
                return null;
        }
    }

    public static String j2(TdApi.Message message) {
        if (message != null) {
            return k2(message.content);
        }
        return null;
    }

    public static boolean j3(TdApi.Message message) {
        int constructor = message.content.getConstructor();
        if (constructor == 527777781) {
            return ((TdApi.MessageVoiceNote) message.content).isListened;
        }
        if (constructor != 963323014) {
            return false;
        }
        return ((TdApi.MessageVideoNote) message.content).isViewed;
    }

    public static void j4(e eVar, int i10, boolean z10) {
        if (z10) {
            d5(eVar);
        }
    }

    public static void j5(d9 d9Var, String str) {
        y00 y00Var = new y00(d9Var.t(), d9Var.c());
        y00.m mVar = new y00.m(str);
        if (c0.Q(str)) {
            mVar.C(str);
        }
        y00Var.Vi(mVar);
        y00Var.ej();
    }

    public static void k0(final v4<?> v4Var, final TdApi.File[] fileArr, final Runnable runnable) {
        if (!(fileArr == null || fileArr.length == 0)) {
            long j10 = 0;
            for (TdApi.File file : fileArr) {
                j10 += file.local.downloadedSize;
            }
            final long j11 = j10;
            v4Var.ee(w.i1(fileArr.length == 1 ? R.string.DeleteFileHint : R.string.DeleteMultipleFilesHint), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{w.j1(R.string.ClearX, c0.m(j10)), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean N3;
                    N3 = t2.N3(fileArr, v4Var, j11, runnable, view, i10);
                    return N3;
                }
            });
        }
    }

    public static TdApi.File k1(TdApi.Photo photo) {
        TdApi.PhotoSize n10 = f0.n(photo);
        if (n10 != null) {
            return n10.photo;
        }
        return null;
    }

    public static String k2(TdApi.MessageContent messageContent) {
        TdApi.FormattedText y12 = ob.e.y1(messageContent);
        if (y12 != null) {
            return y12.text;
        }
        return null;
    }

    public static boolean k3(TdApi.Call call) {
        return call != null && !call.isOutgoing && call.state.getConstructor() == 1394310213 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == 1680358012;
    }

    public static void k4(e eVar) {
        File f52 = f5(eVar);
        if (f52 != null) {
            j0.z0(w.j1(R.string.DownloadedToPath, f52.getPath()), 1);
        }
    }

    public static boolean k5(String str) {
        return str.startsWith("instagram.com/") || str.startsWith("twitter.com/") || (str.startsWith("t.me/") && !str.startsWith("t.me/iv?"));
    }

    public static int l0(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            return ((TdApi.Error) object).code;
        }
        return 0;
    }

    public static TdApi.File l1(TdApi.WebPage webPage) {
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
            return k1(photo);
        }
        return null;
    }

    public static String l2(TdApi.PushMessageContent pushMessageContent) {
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

    public static boolean l3(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return constructor == 973884508;
        }
        return !((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public static void l4(DownloadManager downloadManager, File file, String str) {
        try {
            downloadManager.addCompletedDownload(file.getName(), file.getName(), true, str, file.getAbsolutePath(), file.length(), true);
        } catch (Throwable th) {
            Log.w("Failed to notify about saved download", th, new Object[0]);
            j0.z0("File added to downloads: " + file.getPath(), 0);
        }
    }

    public static boolean l5(TdApi.WebPage webPage) {
        return "telegram_album".equals(webPage.type) || k5(webPage.displayUrl);
    }

    public static TdApi.PhotoSize m0(TdApi.Photo photo, int i10, int i11) {
        if (photo != null) {
            return n0(photo.sizes, i10, i11);
        }
        return null;
    }

    public static int m1(String str, String str2, boolean z10) {
        String lowerCase = str2 != null ? str2.toLowerCase() : null;
        int lastIndexOf = str.lastIndexOf(46);
        String lowerCase2 = lastIndexOf != -1 ? str.substring(lastIndexOf + 1).toLowerCase() : "";
        return ("application/vnd.android.package-archive".equals(lowerCase) || "apk".equals(lowerCase2)) ? R.id.theme_color_fileGreen : ("7z".equals(lowerCase2) || "application/x-7z-compressed".equals(lowerCase) || "zip".equals(lowerCase2) || "application/zip".equals(lowerCase) || "rar".equals(lowerCase2) || "application/x-rar-compressed".equals(lowerCase)) ? R.id.theme_color_fileYellow : ("pdf".equals(lowerCase2) || "application/pdf".equals(lowerCase)) ? R.id.theme_color_fileRed : z10 ? R.id.theme_color_bubbleOut_file : R.id.theme_color_file;
    }

    public static String m2(TdApi.Audio audio) {
        return i.i(audio.title) ? w.i1(R.string.UnknownTrack) : audio.title;
    }

    public static boolean m3(TdApi.Poll poll) {
        return poll.type.getConstructor() == 641265698 && ((TdApi.PollTypeRegular) poll.type).allowMultipleAnswers;
    }

    public static void m4(final File file, final String str) {
        final DownloadManager downloadManager = (DownloadManager) j0.n().getSystemService("download");
        if (downloadManager != null) {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    t2.l4(downloadManager, file, str);
                }
            });
        }
    }

    public static boolean m5(int i10, int i11, int i12) {
        return i10 == 0 && !ib.f.i(i12, i11);
    }

    public static TdApi.PhotoSize n0(TdApi.PhotoSize[] photoSizeArr, int i10, int i11) {
        TdApi.PhotoSize photoSize = null;
        if (photoSizeArr == null) {
            return null;
        }
        boolean z10 = true;
        if (photoSizeArr.length == 1) {
            return photoSizeArr[0];
        }
        int i12 = i10 * i11;
        int i13 = 0;
        for (TdApi.PhotoSize photoSize2 : photoSizeArr) {
            int abs = Math.abs(i12 - (Math.min(photoSize2.width, photoSize2.height) * Math.max(photoSize2.width, photoSize2.height)));
            if (z10 || abs < i13) {
                photoSize = photoSize2;
                i13 = abs;
                z10 = false;
            }
        }
        return photoSize;
    }

    public static int n1(TdApi.Document document, boolean z10) {
        return m1(document.fileName, document.mimeType, z10);
    }

    public static long n2(TdApi.Chat chat) {
        if (chat != null) {
            return o2(chat.type);
        }
        return 0L;
    }

    public static boolean n3(int i10) {
        return TimeUnit.SECONDS.toDays((long) i10) / 365 > 0;
    }

    public static int n4(String str, boolean z10) {
        int i10 = -1;
        if (i.i(str)) {
            return -1;
        }
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            int charCount = Character.charCount(codePointAt);
            if (codePointAt != 10 && ((z10 || i11 + charCount != length) && Character.getType(codePointAt) == 12)) {
                i10 = i11;
            }
            i11 += charCount;
        }
        return i10;
    }

    public static boolean n5(int i10, int i11, int i12) {
        return i10 == 0 && !ib.f.k(i12, i11);
    }

    public static String o0(TdApi.FormattedText formattedText) {
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
                int i10 = textEntity.offset;
                return str2.substring(i10, textEntity.length + i10);
            }
        }
        return str;
    }

    public static int o1(TdApi.Message message) {
        TdApi.File j12 = j1(message);
        if (j12 != null) {
            return j12.f19913id;
        }
        return 0;
    }

    public static long o2(TdApi.ChatType chatType) {
        int constructor = chatType.getConstructor();
        if (constructor == 862366513) {
            return ((TdApi.ChatTypeSecret) chatType).userId;
        }
        if (constructor != 1579049844) {
            return 0L;
        }
        return ((TdApi.ChatTypePrivate) chatType).userId;
    }

    public static boolean o3(TdApi.ChatMemberStatus chatMemberStatus) {
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

    public static String o4(TdApi.ChatList chatList) {
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

    public static int o5(List<TdApi.TextEntity> list, int i10) {
        for (int max = Math.max(i10, 1); max < list.size(); max++) {
            for (int i11 = max - 1; i11 >= 0; i11--) {
                TdApi.TextEntity textEntity = list.get(i11);
                TdApi.TextEntity textEntity2 = list.get(max);
                int i12 = textEntity2.offset;
                int i13 = textEntity.offset;
                int i14 = textEntity.length;
                if (i12 < i13 + i14 && textEntity2.length + i12 > i13 + i14) {
                    int i15 = (i13 + i14) - i12;
                    list.remove(max);
                    list.addAll(max, Arrays.asList(new TdApi.TextEntity(textEntity2.offset, i15, textEntity2.type), new TdApi.TextEntity(textEntity.offset + textEntity.length, textEntity2.length - i15, textEntity2.type)));
                    return max;
                }
            }
        }
        return -1;
    }

    public static String p0(Map<String, TdApi.LanguagePackString> map, String str, kb.e<String> eVar) {
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

    public static float p1(TdApi.File file) {
        TdApi.LocalFile localFile;
        int i10;
        if (file == null || (localFile = file.local) == null || (i10 = localFile.downloadOffset) == 0) {
            return 0.0f;
        }
        int i11 = file.expectedSize;
        if (i11 != 0.0f) {
            return i10 / i11;
        }
        return 0.0f;
    }

    public static String p2(long j10, TdApi.User user) {
        if (j10 == 777000) {
            return "Telegram";
        }
        if (user == null) {
            return "User#" + j10;
        }
        TdApi.UserType userType = user.type;
        if (userType == null || userType.getConstructor() != -1807729372) {
            return q2(user.firstName, user.lastName);
        }
        return w.i1(R.string.HiddenName);
    }

    public static boolean p3(TdApi.Object object) {
        return object != null && object.getConstructor() == -722616727;
    }

    public static CharSequence p4(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        o[] oVarArr = (o[]) spanned.getSpans(0, spanned.length(), o.class);
        if (oVarArr == null || oVarArr.length <= 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        for (o oVar : oVarArr) {
            int spanStart = spanned.getSpanStart(oVar);
            int spanEnd = spanned.getSpanEnd(oVar);
            if (oVar.e()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = spanned instanceof SpannableStringBuilder ? (SpannableStringBuilder) spanned : new SpannableStringBuilder(spanned);
                }
                spannableStringBuilder.removeSpan(oVar);
                spannableStringBuilder.setSpan(new b(oVar), spanStart, spanEnd, 33);
                spannableStringBuilder.setSpan(oVar, spanStart, spanEnd, 33);
                oVar.r(true);
            }
        }
        return spannableStringBuilder != null ? spannableStringBuilder : charSequence;
    }

    public static boolean p5(TdApi.User user) {
        return false;
    }

    public static TdApi.PhotoSize q0(TdApi.PhotoSize[] photoSizeArr, int i10, int i11, int i12, String str) {
        int max = Math.max(800, Math.min(1280, (int) (a0.E() * Math.min(a0.h(), 2.0f))));
        if (Math.max(i10, i11) != max) {
            float f10 = max;
            float f11 = i10;
            float f12 = i11;
            float min = Math.min(f10 / f11, f10 / f12);
            i10 = (int) (f11 * min);
            i11 = (int) (f12 * min);
        }
        TdApi.PhotoSize photoSize = null;
        int i13 = 0;
        for (TdApi.PhotoSize photoSize2 : photoSizeArr) {
            if (photoSize2.photo.f19913id != i12) {
                if (str == null || !str.equals(photoSize2.type)) {
                    int max2 = Math.max(Math.abs(photoSize2.width - i10), Math.abs(photoSize2.height - i11));
                    if (photoSize == null || i13 > max2) {
                        photoSize = photoSize2;
                        i13 = max2;
                    }
                } else {
                    TdApi.File file = photoSize2.photo;
                    if (file.local.canBeDownloaded || V2(file)) {
                        return photoSize2;
                    }
                }
            }
        }
        return photoSize;
    }

    public static String q1(TdApi.File file) {
        if (file != null && V2(file)) {
            return file.local.path;
        }
        return null;
    }

    public static String q2(String str, String str2) {
        if (i.i(str)) {
            return str2;
        }
        if (i.i(str2)) {
            return str;
        }
        return str + ' ' + str2;
    }

    public static boolean q3(TdApi.User user) {
        return user != null && user.type.getConstructor() == -598644325 && r3(user.status);
    }

    public static TdApi.SearchMessagesFilter q4(TdApi.Message message, boolean z10) {
        Objects.requireNonNull(message);
        if (A3(message)) {
            return null;
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterPhoto();
            case TdApi.MessageAudio.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterAudio();
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                return z10 ? new TdApi.SearchMessagesFilterVoiceAndVideoNote() : new TdApi.SearchMessagesFilterVoiceNote();
            case TdApi.MessageDocument.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterDocument();
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return z10 ? new TdApi.SearchMessagesFilterVoiceAndVideoNote() : new TdApi.SearchMessagesFilterVideoNote();
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterAnimation();
            case TdApi.MessageVideo.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterVideo();
            default:
                return null;
        }
    }

    public static CharSequence q5(TdApi.FormattedText formattedText) {
        return r5(formattedText, true, true);
    }

    public static TdApi.PhotoSize r0(TdApi.PhotoSize[] photoSizeArr, String str) {
        for (TdApi.PhotoSize photoSize : photoSizeArr) {
            if (photoSize.type.equals(str)) {
                return photoSize;
            }
        }
        return null;
    }

    public static float r1(TdApi.File file) {
        TdApi.LocalFile localFile;
        if (file == null || (localFile = file.local) == null || localFile.downloadOffset == 0) {
            return t1(file, true);
        }
        int i10 = file.expectedSize;
        if (i10 != 0) {
            return localFile.downloadedPrefixSize / i10;
        }
        return 0.0f;
    }

    public static String r2(TdApi.User user) {
        return user == null ? "NULL" : p2(user.f19979id, user);
    }

    public static boolean r3(TdApi.UserStatus userStatus) {
        return userStatus != null && userStatus.getConstructor() == -1529460876;
    }

    public static int r4(TdApi.Message message, boolean z10) {
        Objects.requireNonNull(message);
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR;
            case TdApi.MessageAudio.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterAudio.CONSTRUCTOR;
            case TdApi.MessageVoiceNote.CONSTRUCTOR:
                return z10 ? TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR : TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR;
            case TdApi.MessageDocument.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterDocument.CONSTRUCTOR;
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                return z10 ? TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR : TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR;
            case TdApi.MessageAnimation.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR;
            case TdApi.MessageVideo.CONSTRUCTOR:
                return TdApi.SearchMessagesFilterVideo.CONSTRUCTOR;
            default:
                return TdApi.SearchMessagesFilterEmpty.CONSTRUCTOR;
        }
    }

    public static CharSequence r5(TdApi.FormattedText formattedText, boolean z10, boolean z11) {
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
        boolean z12 = false;
        for (TdApi.TextEntity textEntity : textEntityArr) {
            boolean z13 = textEntity.type.getConstructor() == 544019899;
            if (z13) {
                z12 = true;
            }
            if (!z13 || z11) {
                characterStyle = J5(textEntity.type, z10);
            } else {
                characterStyle = null;
            }
            if (characterStyle != null) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(formattedText.text);
                }
                int i10 = textEntity.offset;
                spannableStringBuilder.setSpan(characterStyle, i10, textEntity.length + i10, 33);
            }
        }
        if (!z11 && z12) {
            if (spannableStringBuilder == null) {
                sb2 = new StringBuilder(formattedText.text);
            }
            for (int length = formattedText.entities.length - 1; length >= 0; length--) {
                TdApi.TextEntity textEntity2 = formattedText.entities[length];
                if (textEntity2.type.getConstructor() == 544019899) {
                    String r10 = i.r("▒", textEntity2.length);
                    if (spannableStringBuilder != null) {
                        int i11 = textEntity2.offset;
                        spannableStringBuilder.delete(i11, textEntity2.length + i11);
                        spannableStringBuilder.insert(textEntity2.offset, (CharSequence) r10);
                    } else {
                        int i12 = textEntity2.offset;
                        sb2.delete(i12, textEntity2.length + i12);
                        sb2.insert(textEntity2.offset, r10);
                    }
                }
            }
            if (sb2 != null) {
                return sb2.toString();
            }
        }
        return spannableStringBuilder != null ? SpannableString.valueOf(spannableStringBuilder) : formattedText.text;
    }

    public static TdApi.PhotoSize s0(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        return t0(photo.sizes, photoSize);
    }

    public static float s1(TdApi.File file) {
        return t1(file, false);
    }

    public static String s2(long j10, TdApi.User user) {
        if (j10 == 0 || user != null) {
            return u1(user);
        }
        return "User#" + j10;
    }

    public static boolean s3(TdApi.Message message) {
        return message != null && message.isOutgoing;
    }

    public static boolean s4(char c10) {
        return (c10 == '.' || c10 == ',' || c10 == '/' || Character.getType(c10) == 12) ? false : true;
    }

    public static CharSequence s5(TdApi.FormattedText formattedText) {
        return q5(formattedText);
    }

    public static TdApi.PhotoSize t0(TdApi.PhotoSize[] photoSizeArr, TdApi.PhotoSize photoSize) {
        TdApi.PhotoSize photoSize2 = null;
        boolean z10 = true;
        if (photoSizeArr.length != 1) {
            int i10 = 0;
            int i11 = 0;
            for (TdApi.PhotoSize photoSize3 : photoSizeArr) {
                int i12 = photoSize3.width;
                if (!(i12 == photoSize.width && photoSize3.height == photoSize.height && photoSize3.photo.f19913id == photoSize.photo.f19913id) && (z10 || i12 < i10 || photoSize3.height < i11)) {
                    i11 = photoSize3.height;
                    photoSize2 = photoSize3;
                    i10 = i12;
                    z10 = false;
                }
            }
            return photoSize2;
        } else if (photoSize.width == photoSizeArr[0].width && photoSize.height == photoSizeArr[0].height && photoSize.photo.f19913id == photoSizeArr[0].photo.f19913id) {
            return null;
        } else {
            return photoSizeArr[0];
        }
    }

    public static float t1(TdApi.File file, boolean z10) {
        if (file == null) {
            return 0.0f;
        }
        TdApi.RemoteFile remoteFile = file.remote;
        if (remoteFile == null || !remoteFile.isUploadingActive) {
            TdApi.LocalFile localFile = file.local;
            if (localFile == null || (!localFile.isDownloadingActive && (localFile.downloadedSize <= 0 || !z10))) {
                return T2(file) ? 1.0f : 0.0f;
            }
            int i10 = file.expectedSize;
            if (i10 != 0) {
                return localFile.downloadedSize / i10;
            }
            return 0.0f;
        }
        int i11 = file.expectedSize;
        if (i11 != 0) {
            return remoteFile.uploadedSize / i11;
        }
        return 0.0f;
    }

    public static int t2(TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (messageInteractionInfo != null) {
            return messageInteractionInfo.viewCount;
        }
        return 0;
    }

    public static boolean t3(TdApi.Photo photo) {
        TdApi.PhotoSize[] photoSizeArr;
        return photo == null || (photoSizeArr = photo.sizes) == null || photoSizeArr.length == 0;
    }

    public static boolean t4(char c10) {
        return (Character.getType(c10) == 12 || c10 == '#') ? false : true;
    }

    public static CharSequence t5(TdApi.FormattedText formattedText) {
        return u5(formattedText, null);
    }

    public static List<String> u0(String str, List<String> list) {
        TdApi.TextEntity[] E0 = ob.e.E0(str);
        if (E0 != null) {
            for (TdApi.TextEntity textEntity : E0) {
                if (textEntity.type.getConstructor() == -1312762756) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    int i10 = textEntity.offset;
                    list.add(str.substring(i10, textEntity.length + i10));
                }
            }
        }
        return list;
    }

    public static String u1(TdApi.User user) {
        if (user == null) {
            return "null";
        }
        if (user.type.getConstructor() == -1807729372) {
            return w.i1(R.string.HiddenNameShort);
        }
        String trim = user.firstName.trim();
        return i.i(trim) ? user.lastName.trim() : trim;
    }

    public static TdApi.File u2(TdApi.WebPage webPage) {
        int i10;
        TdApi.PhotoSize m02;
        if (!t3(webPage.photo) && (m02 = m0(webPage.photo, (i10 = a0.i(34.0f)), i10)) != null) {
            return m02.photo;
        }
        return null;
    }

    public static boolean u3(TdApi.ProfilePhoto profilePhoto) {
        return profilePhoto == null || S2(profilePhoto.small);
    }

    public static boolean u4(char c10) {
        return (c10 >= 'A' && c10 <= 'Z') || (c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '_');
    }

    public static CharSequence u5(TdApi.FormattedText formattedText, Typeface typeface) {
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
            int i10 = textEntity.offset;
            o w52 = w5(textEntityType, typeface, je.g.N0(str, i10, textEntity.length + i10));
            if (w52 != null) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(formattedText.text);
                }
                int i11 = textEntity.offset;
                spannableStringBuilder.setSpan(w52, i11, textEntity.length + i11, 33);
            }
        }
        return spannableStringBuilder != null ? SpannableString.valueOf(spannableStringBuilder) : formattedText.text;
    }

    public static List<String> v0(TdApi.FormattedText formattedText) {
        List<String> list = null;
        if (ob.e.c1(formattedText)) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr == null || textEntityArr.length <= 0) {
            return u0(formattedText.text, null);
        }
        int i10 = 0;
        for (TdApi.TextEntity textEntity : textEntityArr) {
            switch (textEntity.type.getConstructor()) {
                case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypePre.CONSTRUCTOR:
                    int i11 = textEntity.offset;
                    if (i11 > i10) {
                        list = u0(formattedText.text.substring(i10, i11), list);
                    }
                    if (textEntity.type.getConstructor() == 445719651) {
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        list.add(((TdApi.TextEntityTypeTextUrl) textEntity.type).url);
                    }
                    i10 = textEntity.offset + textEntity.length;
                    break;
            }
        }
        return i10 < formattedText.text.length() ? u0(formattedText.text.substring(i10), list) : list;
    }

    public static int v1(int i10, String str, int i11) {
        return (i10 != 429 || !str.startsWith("Too Many Requests: retry after ")) ? i11 : i.s(str.substring(31));
    }

    public static boolean v2(TdApi.Poll poll) {
        for (TdApi.PollOption pollOption : poll.options) {
            if (pollOption.isChosen) {
                return true;
            }
        }
        return false;
    }

    public static boolean v3(TdApi.PushMessageContent pushMessageContent) {
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

    public static boolean v4(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!u4(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static o v5(TdApi.TextEntityType textEntityType) {
        return w5(textEntityType, null, false);
    }

    public static void w0(List<TdApi.TextEntity> list) {
        if (list != null && !list.isEmpty()) {
            int i10 = 0;
            do {
                ob.e.n1(list);
                i10 = o5(list, i10);
            } while (i10 != -1);
        }
    }

    public static String w1(TdApi.Game game, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "\u200e🎮 " : "");
        sb2.append(i.i(game.title) ? game.shortName : game.title);
        return sb2.toString();
    }

    public static boolean w2(TdApi.SecretChat secretChat) {
        byte[] bArr;
        return secretChat != null && secretChat.state.getConstructor() == -1611352087 && (bArr = secretChat.keyHash) != null && bArr.length > 0;
    }

    public static boolean w3(TdApi.ChatType chatType) {
        return chatType.getConstructor() == 1579049844;
    }

    public static boolean w4(TdApi.SupergroupMembersFilter supergroupMembersFilter, TdApi.ChatMemberStatus chatMemberStatus) {
        switch (supergroupMembersFilter.getConstructor()) {
            case TdApi.SupergroupMembersFilterAdministrators.CONSTRUCTOR:
                int constructor = chatMemberStatus.getConstructor();
                return constructor == -160019714 || constructor == -70024163;
            case TdApi.SupergroupMembersFilterBanned.CONSTRUCTOR:
                return chatMemberStatus.getConstructor() == -1653518666;
            case TdApi.SupergroupMembersFilterRestricted.CONSTRUCTOR:
                return chatMemberStatus.getConstructor() == 1661432998;
            case TdApi.SupergroupMembersFilterRecent.CONSTRUCTOR:
                return h3(chatMemberStatus);
            default:
                return false;
        }
    }

    public static o w5(TdApi.TextEntityType textEntityType, Typeface typeface, boolean z10) {
        o oVar;
        if (textEntityType == null) {
            return null;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
            case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                oVar = new o(typeface, R.id.theme_color_textLink);
                break;
            case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                if (!z10) {
                    oVar = new o(ce.o.i(), 0);
                    break;
                } else {
                    oVar = new o(null, 0).k(true);
                    break;
                }
            case TdApi.TextEntityTypeCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePre.CONSTRUCTOR:
                oVar = new o(ce.o.j(), 0);
                break;
            case TdApi.TextEntityTypeItalic.CONSTRUCTOR:
                oVar = new o(ce.o.h(), 0);
                break;
            case TdApi.TextEntityTypeSpoiler.CONSTRUCTOR:
            case TdApi.TextEntityTypeUnderline.CONSTRUCTOR:
            case TdApi.TextEntityTypeStrikethrough.CONSTRUCTOR:
                oVar = new o(typeface, 0);
                break;
            default:
                return null;
        }
        oVar.j(textEntityType);
        return oVar;
    }

    public static CharSequence x0(final d9 d9Var, String str, TdApi.TextEntity[] textEntityArr, Typeface typeface, final o.a aVar) {
        o oVar;
        if (textEntityArr == null || textEntityArr.length == 0) {
            return str;
        }
        int length = textEntityArr.length;
        Typeface typeface2 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        while (i10 < length) {
            TdApi.TextEntity textEntity = textEntityArr[i10];
            switch (textEntity.type.getConstructor()) {
                case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                    final String u12 = ob.e.u1(str, textEntity);
                    oVar = new o(typeface, R.id.theme_color_textLink).q(new o.a() {
                        @Override
                        public final boolean a(View view, o oVar2) {
                            boolean T3;
                            T3 = t2.T3(o.a.this, d9Var, u12, view, oVar2);
                            return T3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                    final String u13 = ob.e.u1(str, textEntity);
                    oVar = new o(typeface, R.id.theme_color_textLink).q(new o.a() {
                        @Override
                        public final boolean a(View view, o oVar2) {
                            boolean S3;
                            S3 = t2.S3(o.a.this, u13, view, oVar2);
                            return S3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
                    oVar = typeface2;
                    break;
                case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                    int i11 = textEntity.offset;
                    if (!je.g.N0(str, i11, textEntity.length + i11)) {
                        oVar = new o(ce.o.i(), 0);
                        break;
                    } else {
                        oVar = new o(typeface2, 0).k(true);
                        break;
                    }
                case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                    final String u14 = ob.e.u1(str, textEntity);
                    oVar = new o(typeface, R.id.theme_color_textLink).q(new o.a() {
                        @Override
                        public final boolean a(View view, o oVar2) {
                            boolean O3;
                            O3 = t2.O3(o.a.this, d9Var, u14, view, oVar2);
                            return O3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
                    final String u15 = ob.e.u1(str, textEntity);
                    oVar = new o(typeface, R.id.theme_color_textLink).q(new o.a() {
                        @Override
                        public final boolean a(View view, o oVar2) {
                            boolean R3;
                            R3 = t2.R3(o.a.this, d9Var, u15, view, oVar2);
                            return R3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                    final String str2 = ((TdApi.TextEntityTypeTextUrl) textEntity.type).url;
                    oVar = new o(typeface, R.id.theme_color_textLink).q(new o.a() {
                        @Override
                        public final boolean a(View view, o oVar2) {
                            boolean U3;
                            U3 = t2.U3(o.a.this, d9Var, str2, view, oVar2);
                            return U3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                    final String u16 = ob.e.u1(str, textEntity);
                    oVar = new o(typeface, R.id.theme_color_textLink).q(new o.a() {
                        @Override
                        public final boolean a(View view, o oVar2) {
                            boolean Q3;
                            Q3 = t2.Q3(o.a.this, d9Var, u16, view, oVar2);
                            return Q3;
                        }
                    });
                    break;
                case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                    final String u17 = ob.e.u1(str, textEntity);
                    oVar = new o(typeface, R.id.theme_color_textLink).q(new o.a() {
                        @Override
                        public final boolean a(View view, o oVar2) {
                            boolean P3;
                            P3 = t2.P3(o.a.this, u17, view, oVar2);
                            return P3;
                        }
                    });
                    break;
                default:
                    oVar = w5(textEntity.type, typeface, false);
                    break;
            }
            if (oVar != null) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                }
                if (oVar.c() != null) {
                    a aVar2 = new a(oVar);
                    int i12 = textEntity.offset;
                    spannableStringBuilder.setSpan(aVar2, i12, textEntity.length + i12, 33);
                }
                oVar.j(textEntity.type).r(true);
                int i13 = textEntity.offset;
                spannableStringBuilder.setSpan(oVar, i13, textEntity.length + i13, 33);
            }
            i10++;
            typeface2 = null;
        }
        return spannableStringBuilder != null ? spannableStringBuilder : str;
    }

    public static String x1(TdApi.Venue venue) {
        if (!"foursquare".equals(venue.provider) || i.i(venue.type)) {
            return null;
        }
        return "https://ss3.4sqi.net/img/categories_v2/" + venue.type + "_88.png";
    }

    public static boolean x2(TdApi.FormattedText formattedText, String str) {
        TdApi.TextEntity[] textEntityArr;
        if (!ob.e.c1(formattedText) && (textEntityArr = formattedText.entities) != null) {
            for (TdApi.TextEntity textEntity : textEntityArr) {
                if (textEntity.type.getConstructor() == -1023958307 && str.equals(ob.e.u1(formattedText.text, textEntity))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static boolean x3(String str) {
        return !str.startsWith("X") && str.endsWith("-raw");
    }

    public static boolean x4(TdApi.ChatNotificationSettings chatNotificationSettings, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        return chatNotificationSettings != null && !chatNotificationSettings.useDefaultMuteFor && chatNotificationSettings.muteFor > 0;
    }

    public static TdApi.TextEntity[] x5(CharSequence charSequence, boolean z10) {
        CharacterStyle[] characterStyleArr;
        if (!(!(charSequence instanceof Spanned) || (characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), CharacterStyle.class)) == null || characterStyleArr.length == 0)) {
            ArrayList arrayList = null;
            for (CharacterStyle characterStyle : characterStyleArr) {
                TdApi.TextEntityType[] y52 = y5(characterStyle);
                if (!(y52 == null || y52.length == 0)) {
                    Spanned spanned = (Spanned) charSequence;
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyle);
                    for (TdApi.TextEntityType textEntityType : y52) {
                        if (!z10 || textEntityType.getConstructor() == 445719651) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new TdApi.TextEntity(spanStart, spanEnd - spanStart, textEntityType));
                        }
                    }
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                w0(arrayList);
                return (TdApi.TextEntity[]) arrayList.toArray(new TdApi.TextEntity[0]);
            }
        }
        return null;
    }

    public static boolean y0(long j10, TdApi.Message[] messageArr, boolean z10, boolean z11, TdApi.MessageSendOptions messageSendOptions, ArrayList<TdApi.Function> arrayList) {
        int i10;
        TdApi.Message message;
        int i11;
        TdApi.Message[] messageArr2 = messageArr;
        if (messageArr2.length == 0) {
            return false;
        }
        long j11 = 0;
        int length = messageArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            TdApi.Message message2 = messageArr2[i12];
            if (message2.chatId != j11) {
                if (i13 > 0) {
                    long[] N1 = N1(messageArr2, i14, i13);
                    i10 = length;
                    message = message2;
                    i11 = i14;
                    arrayList.add(new TdApi.ForwardMessages(j10, j11, N1, messageSendOptions, z10, z11, false));
                } else {
                    i10 = length;
                    message = message2;
                    i11 = i14;
                }
                i14 = i11 + i13;
                j11 = message.chatId;
                i13 = 0;
            } else {
                i10 = length;
            }
            i13++;
            i12++;
            messageArr2 = messageArr;
            length = i10;
        }
        int i15 = i14;
        if (i13 > 0) {
            arrayList.add(new TdApi.ForwardMessages(j10, j11, N1(messageArr, i15, i13), messageSendOptions, z10, z11, false));
        }
        return true;
    }

    public static String y1(String str) {
        return w.i1(R.string.url_translationsPrefix) + str;
    }

    public static boolean y2(int i10) {
        return i10 > 0 && i10 <= 2;
    }

    public static boolean y3(TdApi.ChatMemberStatus chatMemberStatus) {
        int constructor = chatMemberStatus.getConstructor();
        return constructor == -1653518666 || constructor == 1661432998;
    }

    public static boolean y4(TdApi.Poll poll) {
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

    public static TdApi.TextEntityType[] y5(CharacterStyle characterStyle) {
        if (!J(characterStyle)) {
            return null;
        }
        if (characterStyle instanceof o) {
            return new TdApi.TextEntityType[]{((o) characterStyle).b()};
        }
        if (characterStyle instanceof URLSpan) {
            String url = ((URLSpan) characterStyle).getURL();
            if (!c0.Q(url)) {
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

    public static TdApi.Message z0(o6 o6Var, List<TdApi.Message> list) {
        TdApi.Message message = null;
        for (TdApi.Message message2 : list) {
            if (!ob.e.c1(o6Var.D5(message2))) {
                if (message != null) {
                    return null;
                }
                message = message2;
            }
        }
        return message;
    }

    public static int z1(TdApi.User user) {
        if (user.type.getConstructor() == -970625144) {
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

    public static boolean z2(TdApi.WebPage webPage) {
        return webPage != null && y2(webPage.instantViewVersion);
    }

    public static boolean z3(TdApi.Message message, TdApi.Message message2, boolean z10) {
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
                if (messageForwardInfo2.fromChatId == message2.forwardInfo.fromChatId && z10) {
                    switch (messageForwardInfo2.origin.getConstructor()) {
                        case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                            return i.c(((TdApi.MessageForwardOriginMessageImport) message.forwardInfo.origin).senderName, ((TdApi.MessageForwardOriginMessageImport) message2.forwardInfo.origin).senderName);
                        case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                            return ((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId == ((TdApi.MessageForwardOriginUser) message2.forwardInfo.origin).senderUserId;
                        case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                            return ((TdApi.MessageForwardOriginHiddenUser) message.forwardInfo.origin).senderName.equals(((TdApi.MessageForwardOriginHiddenUser) message2.forwardInfo.origin).senderName);
                        case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                            TdApi.MessageForwardOrigin messageForwardOrigin = message.forwardInfo.origin;
                            long j10 = ((TdApi.MessageForwardOriginChannel) messageForwardOrigin).chatId;
                            TdApi.MessageForwardOrigin messageForwardOrigin2 = message2.forwardInfo.origin;
                            return j10 == ((TdApi.MessageForwardOriginChannel) messageForwardOrigin2).chatId && i.c(((TdApi.MessageForwardOriginChannel) messageForwardOrigin).authorSignature, ((TdApi.MessageForwardOriginChannel) messageForwardOrigin2).authorSignature);
                        case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                            TdApi.MessageForwardOrigin messageForwardOrigin3 = message.forwardInfo.origin;
                            long j11 = ((TdApi.MessageForwardOriginChat) messageForwardOrigin3).senderChatId;
                            TdApi.MessageForwardOrigin messageForwardOrigin4 = message2.forwardInfo.origin;
                            return j11 == ((TdApi.MessageForwardOriginChat) messageForwardOrigin4).senderChatId && i.c(((TdApi.MessageForwardOriginChat) messageForwardOrigin3).authorSignature, ((TdApi.MessageForwardOriginChat) messageForwardOrigin4).authorSignature);
                    }
                }
            }
        }
        return false;
    }

    public static boolean z4(TdApi.ChatMemberStatus chatMemberStatus) {
        switch (chatMemberStatus.getConstructor()) {
            case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                return true;
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) chatMemberStatus;
                return !i.i(chatMemberStatusCreator.customTitle) || chatMemberStatusCreator.isAnonymous;
            case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) chatMemberStatus;
                TdApi.ChatAdministratorRights chatAdministratorRights = chatMemberStatusAdministrator.rights;
                return !chatAdministratorRights.canChangeInfo || !chatAdministratorRights.canDeleteMessages || !chatAdministratorRights.canInviteUsers || !chatAdministratorRights.canRestrictMembers || !chatAdministratorRights.canPinMessages || !chatAdministratorRights.canManageVideoChats || chatAdministratorRights.canPromoteMembers || !i.i(chatMemberStatusAdministrator.customTitle) || chatAdministratorRights.isAnonymous;
            default:
                return false;
        }
    }

    public static String z5(TdApi.Object object) {
        if (object == null) {
            return "Unknown error (null)";
        }
        if (object.getConstructor() != -1679978726) {
            return "not an error";
        }
        TdApi.Error error = (TdApi.Error) object;
        return N5(error.code, error.message);
    }
}
