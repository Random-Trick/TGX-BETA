package zd;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import gd.w;
import hd.t2;
import ib.c;
import ib.i;
import java.util.ArrayList;
import java.util.List;
import ob.a;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;

public class bb implements Comparable<bb> {
    public fb M;
    public int N;
    public o6 f27285a;
    public final int f27286b;
    public TdApi.Notification f27287c;

    public bb(int i10) {
        this.f27286b = i10;
    }

    public static CharSequence F(CharSequence charSequence, boolean z10, boolean z11) {
        if (z10) {
            return w.k0(R.string.format_edited, charSequence);
        }
        return z11 ? w.k0(R.string.format_editedVisible, charSequence) : charSequence;
    }

    public void A(boolean z10) {
        D((z10 ? 1 : 2) | this.N);
    }

    public boolean B() {
        int constructor = this.f27287c.type.getConstructor();
        if (constructor != -711680462) {
            return constructor == 1885935159 && !t2.C3(((TdApi.NotificationTypeNewMessage) this.f27287c.type).message) && ((TdApi.NotificationTypeNewMessage) this.f27287c.type).message.ttl == 0;
        }
        TdApi.PushMessageContent pushMessageContent = ((TdApi.NotificationTypeNewPushMessage) this.f27287c.type).content;
        int constructor2 = pushMessageContent.getConstructor();
        if (constructor2 != 140631122) {
            return constructor2 == 1553513939 && ((TdApi.PushMessageContentSticker) pushMessageContent).sticker != null;
        }
        TdApi.PushMessageContentPhoto pushMessageContentPhoto = (TdApi.PushMessageContentPhoto) pushMessageContent;
        return pushMessageContentPhoto.photo != null && !pushMessageContentPhoto.isSecret;
    }

    public TdApi.Notification C() {
        return this.f27287c;
    }

    public final void D(int i10) {
        if (this.N != i10) {
            this.N = i10;
            this.f27285a.tc().o0(this.f27286b, i10);
        }
    }

    public CharSequence E(CharSequence charSequence) {
        return F(charSequence, p(), q());
    }

    public boolean a(zd.bb r8) {
        throw new UnsupportedOperationException("Method not decompiled: zd.bb.a(zd.bb):boolean");
    }

    public int compareTo(bb bbVar) {
        return Integer.compare(this.f27286b, bbVar.f27286b);
    }

    public TdApi.Message c() {
        if (this.f27287c.type.getConstructor() == 1885935159) {
            return ((TdApi.NotificationTypeNewMessage) this.f27287c.type).message;
        }
        return null;
    }

    public long d() {
        int constructor = this.f27287c.type.getConstructor();
        if (constructor == -711680462) {
            return ((TdApi.NotificationTypeNewPushMessage) this.f27287c.type).messageId;
        }
        if (constructor != 1885935159) {
            return 0L;
        }
        return ((TdApi.NotificationTypeNewMessage) this.f27287c.type).message.f19946id;
    }

    public long e() {
        int constructor = this.f27287c.type.getConstructor();
        if (constructor == -711680462) {
            return e.S0(((TdApi.NotificationTypeNewPushMessage) this.f27287c.type).senderId);
        }
        if (constructor == 1198638768) {
            return a.c(this.f27285a.h4(g()));
        }
        if (constructor != 1885935159) {
            return 0L;
        }
        return e.R0(((TdApi.NotificationTypeNewMessage) this.f27287c.type).message);
    }

    public String f() {
        int constructor = this.f27287c.type.getConstructor();
        if (constructor == -711680462) {
            TdApi.NotificationTypeNewPushMessage notificationTypeNewPushMessage = (TdApi.NotificationTypeNewPushMessage) this.f27287c.type;
            if (!i.i(notificationTypeNewPushMessage.senderName)) {
                return notificationTypeNewPushMessage.senderName;
            }
            return this.f27285a.Cb(notificationTypeNewPushMessage.senderId);
        } else if (constructor == 1198638768) {
            return this.f27285a.e2().J2(this.f27285a.h4(g()));
        } else {
            if (constructor != 1885935159) {
                return null;
            }
            return this.f27285a.Bb(((TdApi.NotificationTypeNewMessage) this.f27287c.type).message, true, false);
        }
    }

    public long g() {
        return this.M.v();
    }

    public String h() {
        int constructor = this.f27287c.type.getConstructor();
        if (constructor == -711680462) {
            return t2.l2(((TdApi.NotificationTypeNewPushMessage) this.f27287c.type).content);
        }
        if (constructor != 1885935159) {
            return null;
        }
        return t2.j2(((TdApi.NotificationTypeNewMessage) this.f27287c.type).message);
    }

    public int i() {
        return this.f27287c.date;
    }

    public int j() {
        return this.f27286b;
    }

    public TdApi.NotificationType k() {
        return this.f27287c.type;
    }

    public final CharSequence l(t2.d dVar) {
        CharSequence r52 = t2.r5(dVar.b(false), false, false);
        if (r52 instanceof Spanned) {
            Spanned spanned = (Spanned) r52;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, r52.length(), URLSpan.class);
            if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                SpannableStringBuilder spannableStringBuilder = null;
                for (URLSpan uRLSpan : uRLSpanArr) {
                    int spanStart = spanned.getSpanStart(uRLSpan);
                    int spanEnd = spanned.getSpanEnd(uRLSpan);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder(r52);
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f27285a.z5(R.id.theme_color_notificationLink)), spanStart, spanEnd, 33);
                    }
                }
                if (spannableStringBuilder != null) {
                    return spannableStringBuilder;
                }
            }
        }
        return r52;
    }

    public CharSequence m(o6 o6Var, boolean z10, boolean z11, List<bb> list, boolean z12, boolean z13, boolean[] zArr) {
        t2.d dVar;
        ArrayList arrayList = new ArrayList(list.size());
        boolean z14 = false;
        for (bb bbVar : list) {
            TdApi.Message c10 = bbVar.c();
            if (a.j(this.M.v()) && c10.ttl != 0) {
                return w.o2(R.string.xNewMessages, list.size());
            }
            if (c10.forwardInfo != null) {
                z14 = true;
            }
            arrayList.add(c10);
        }
        if (z14) {
            dVar = new t2.d(t2.D, 0, w.o2(R.string.xForwards, list.size()), true);
        } else {
            dVar = t2.A0(o6Var, (TdApi.Message) arrayList.get(0), new o6.f(arrayList), z11);
        }
        if (zArr != null && !dVar.f13571e) {
            zArr[0] = true;
        }
        return F(l(dVar), z12, z13);
    }

    public CharSequence n(o6 o6Var, boolean z10, boolean z11, boolean[] zArr) {
        int constructor = this.f27287c.type.getConstructor();
        if (constructor == -711680462) {
            TdApi.NotificationTypeNewPushMessage notificationTypeNewPushMessage = (TdApi.NotificationTypeNewPushMessage) this.f27287c.type;
            t2.d V1 = t2.V1(o6Var, g(), notificationTypeNewPushMessage, z11);
            if (V1 != null) {
                if (zArr != null && !V1.f13571e) {
                    zArr[0] = true;
                }
                return E(l(V1));
            }
            throw new UnsupportedOperationException(Integer.toString(notificationTypeNewPushMessage.content.getConstructor()));
        } else if (constructor == 1198638768) {
            return w.i1(R.string.YouHaveNewMessage);
        } else {
            TdApi.Message message = null;
            if (constructor != 1885935159) {
                return null;
            }
            TdApi.Message message2 = ((TdApi.NotificationTypeNewMessage) this.f27287c.type).message;
            if (a.j(this.M.v()) && message2.ttl != 0) {
                return w.i1(R.string.YouHaveNewMessage);
            }
            if (message2.content.getConstructor() == 953503801) {
                long j10 = ((TdApi.MessagePinMessage) message2.content).messageId;
                if (j10 != 0) {
                    message = o6Var.L5(message2.chatId, j10);
                }
                if (!z10) {
                    return E(w.Q0(o6Var, message2.senderId, message, false));
                }
                if (message != null) {
                    message2 = message;
                }
            }
            t2.d U1 = t2.U1(o6Var, g(), message2, z11);
            if (zArr != null && !U1.f13571e) {
                zArr[0] = true;
            }
            return E(l(U1));
        }
    }

    public fb o() {
        return this.M;
    }

    public boolean p() {
        return c.b(this.N, 1);
    }

    public boolean q() {
        return c.b(this.N, 2);
    }

    public boolean r() {
        return this.M.C(this.f27286b) && this.M.O();
    }

    public boolean s() {
        return this.f27287c.type.getConstructor() == 1198638768;
    }

    public boolean t() {
        int constructor = this.f27287c.type.getConstructor();
        if (constructor != -711680462) {
            return constructor == 1885935159 && ((TdApi.NotificationTypeNewMessage) this.f27287c.type).message.content.getConstructor() == 953503801;
        }
        return t2.v3(((TdApi.NotificationTypeNewPushMessage) this.f27287c.type).content);
    }

    public boolean u(bb bbVar) {
        if (this == bbVar) {
            return true;
        }
        long e10 = e();
        return e10 == bbVar.e() && e10 != 0;
    }

    public boolean v() {
        switch (this.f27287c.type.getConstructor()) {
            case TdApi.NotificationTypeNewPushMessage.CONSTRUCTOR:
                return ((TdApi.NotificationTypeNewPushMessage) this.f27287c.type).isOutgoing;
            case TdApi.NotificationTypeNewSecretChat.CONSTRUCTOR:
            case TdApi.NotificationTypeNewCall.CONSTRUCTOR:
                return false;
            case TdApi.NotificationTypeNewMessage.CONSTRUCTOR:
                return ((TdApi.NotificationTypeNewMessage) this.f27287c.type).message.isOutgoing;
            default:
                throw new UnsupportedOperationException(this.f27287c.type.toString());
        }
    }

    public boolean w() {
        return this.M.H();
    }

    public boolean x() {
        int constructor = this.f27287c.type.getConstructor();
        return constructor != -711680462 ? constructor == 1885935159 && ((TdApi.NotificationTypeNewMessage) this.f27287c.type).message.content.getConstructor() == 1779022878 : ((TdApi.NotificationTypeNewPushMessage) this.f27287c.type).content.getConstructor() == 1553513939;
    }

    public boolean y() {
        return this.f27287c.type.getConstructor() != -711680462;
    }

    public boolean z() {
        return this.f27287c.isSilent;
    }

    public bb(o6 o6Var, TdApi.Notification notification, fb fbVar) {
        this.f27285a = o6Var;
        int i10 = notification.f19947id;
        this.f27286b = i10;
        this.f27287c = notification;
        this.M = fbVar;
        this.N = o6Var.tc().x(i10);
    }
}
