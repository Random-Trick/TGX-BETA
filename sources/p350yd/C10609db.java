package p350yd;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5070i;
import p193nb.C7316a;
import p193nb.C7321e;
import p350yd.C10930q6;

public class C10609db implements Comparable<C10609db> {
    public C10711hb f34002M;
    public int f34003N;
    public C10930q6 f34004a;
    public final int f34005b;
    public TdApi.Notification f34006c;

    public C10609db(int i) {
        this.f34005b = i;
    }

    public static CharSequence m4472F(CharSequence charSequence, boolean z, boolean z2) {
        if (z) {
            return C4403w.m27864k0(R.string.format_edited, charSequence);
        }
        return z2 ? C4403w.m27864k0(R.string.format_editedVisible, charSequence) : charSequence;
    }

    public void m4477A(boolean z) {
        m4474D((z ? 1 : 2) | this.f34003N);
    }

    public boolean m4476B() {
        int constructor = this.f34006c.type.getConstructor();
        if (constructor != -711680462) {
            return constructor == 1885935159 && !C4779t2.m25714C3(((TdApi.NotificationTypeNewMessage) this.f34006c.type).message) && ((TdApi.NotificationTypeNewMessage) this.f34006c.type).message.ttl == 0;
        }
        TdApi.PushMessageContent pushMessageContent = ((TdApi.NotificationTypeNewPushMessage) this.f34006c.type).content;
        int constructor2 = pushMessageContent.getConstructor();
        if (constructor2 != 140631122) {
            return constructor2 == 1553513939 && ((TdApi.PushMessageContentSticker) pushMessageContent).sticker != null;
        }
        TdApi.PushMessageContentPhoto pushMessageContentPhoto = (TdApi.PushMessageContentPhoto) pushMessageContent;
        return pushMessageContentPhoto.photo != null && !pushMessageContentPhoto.isSecret;
    }

    public TdApi.Notification m4475C() {
        return this.f34006c;
    }

    public final void m4474D(int i) {
        if (this.f34003N != i) {
            this.f34003N = i;
            this.f34004a.m2294pc().m4104o0(this.f34005b, i);
        }
    }

    public CharSequence m4473E(CharSequence charSequence) {
        return m4472F(charSequence, m4456p(), m4455q());
    }

    public boolean m4471a(p350yd.C10609db r8) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10609db.m4471a(yd.db):boolean");
    }

    public int compareTo(C10609db dbVar) {
        return Integer.compare(this.f34005b, dbVar.f34005b);
    }

    public TdApi.Message m4469c() {
        if (this.f34006c.type.getConstructor() == 1885935159) {
            return ((TdApi.NotificationTypeNewMessage) this.f34006c.type).message;
        }
        return null;
    }

    public long m4468d() {
        int constructor = this.f34006c.type.getConstructor();
        if (constructor == -711680462) {
            return ((TdApi.NotificationTypeNewPushMessage) this.f34006c.type).messageId;
        }
        if (constructor != 1885935159) {
            return 0L;
        }
        return ((TdApi.NotificationTypeNewMessage) this.f34006c.type).message.f25409id;
    }

    public long m4467e() {
        int constructor = this.f34006c.type.getConstructor();
        if (constructor == -711680462) {
            return C7321e.m16986Q0(((TdApi.NotificationTypeNewPushMessage) this.f34006c.type).senderId);
        }
        if (constructor == 1198638768) {
            return C7316a.m17058c(this.f34004a.m2494d4(m4465g()));
        }
        if (constructor != 1885935159) {
            return 0L;
        }
        return C7321e.m16988P0(((TdApi.NotificationTypeNewMessage) this.f34006c.type).message);
    }

    public String m4466f() {
        int constructor = this.f34006c.type.getConstructor();
        if (constructor == -711680462) {
            TdApi.NotificationTypeNewPushMessage notificationTypeNewPushMessage = (TdApi.NotificationTypeNewPushMessage) this.f34006c.type;
            if (!C5070i.m24062i(notificationTypeNewPushMessage.senderName)) {
                return notificationTypeNewPushMessage.senderName;
            }
            return this.f34004a.m2151yb(notificationTypeNewPushMessage.senderId);
        } else if (constructor == 1198638768) {
            return this.f34004a.m2480e2().m1721K2(this.f34004a.m2494d4(m4465g()));
        } else {
            if (constructor != 1885935159) {
                return null;
            }
            return this.f34004a.m2167xb(((TdApi.NotificationTypeNewMessage) this.f34006c.type).message, true, false);
        }
    }

    public long m4465g() {
        return this.f34002M.m4220v();
    }

    public String m4464h() {
        int constructor = this.f34006c.type.getConstructor();
        if (constructor == -711680462) {
            return C4779t2.m25480l2(((TdApi.NotificationTypeNewPushMessage) this.f34006c.type).content);
        }
        if (constructor != 1885935159) {
            return null;
        }
        return C4779t2.m25494j2(((TdApi.NotificationTypeNewMessage) this.f34006c.type).message);
    }

    public int m4463i() {
        return this.f34006c.date;
    }

    public int m4462j() {
        return this.f34005b;
    }

    public TdApi.NotificationType m4461k() {
        return this.f34006c.type;
    }

    public final CharSequence m4460l(C4779t2.C4783d dVar) {
        CharSequence r5 = C4779t2.m25435r5(dVar.m25377b(false), false, false);
        if (r5 instanceof Spanned) {
            Spanned spanned = (Spanned) r5;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, r5.length(), URLSpan.class);
            if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                SpannableStringBuilder spannableStringBuilder = null;
                for (URLSpan uRLSpan : uRLSpanArr) {
                    int spanStart = spanned.getSpanStart(uRLSpan);
                    int spanEnd = spanned.getSpanEnd(uRLSpan);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder(r5);
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f34004a.m2205v5(R.id.theme_color_notificationLink)), spanStart, spanEnd, 33);
                    }
                }
                if (spannableStringBuilder != null) {
                    return spannableStringBuilder;
                }
            }
        }
        return r5;
    }

    public CharSequence m4459m(C10930q6 q6Var, boolean z, boolean z2, List<C10609db> list, boolean z3, boolean z4, boolean[] zArr) {
        C4779t2.C4783d dVar;
        ArrayList arrayList = new ArrayList(list.size());
        boolean z5 = false;
        for (C10609db dbVar : list) {
            TdApi.Message c = dbVar.m4469c();
            if (C7316a.m17051j(this.f34002M.m4220v()) && c.ttl != 0) {
                return C4403w.m27846o2(R.string.xNewMessages, list.size());
            }
            if (c.forwardInfo != null) {
                z5 = true;
            }
            arrayList.add(c);
        }
        if (z5) {
            dVar = new C4779t2.C4783d(C4779t2.f16219D, 0, C4403w.m27846o2(R.string.xForwards, list.size()), true);
        } else {
            dVar = C4779t2.m25731A0(q6Var, (TdApi.Message) arrayList.get(0), new C10930q6.C10936f(arrayList), z2);
        }
        if (zArr != null && !dVar.f16273e) {
            zArr[0] = true;
        }
        return m4472F(m4460l(dVar), z3, z4);
    }

    public CharSequence m4458n(C10930q6 q6Var, boolean z, boolean z2, boolean[] zArr) {
        int constructor = this.f34006c.type.getConstructor();
        if (constructor == -711680462) {
            TdApi.NotificationTypeNewPushMessage notificationTypeNewPushMessage = (TdApi.NotificationTypeNewPushMessage) this.f34006c.type;
            C4779t2.C4783d V1 = C4779t2.m25588V1(q6Var, m4465g(), notificationTypeNewPushMessage, z2);
            if (V1 != null) {
                if (zArr != null && !V1.f16273e) {
                    zArr[0] = true;
                }
                return m4473E(m4460l(V1));
            }
            throw new UnsupportedOperationException(Integer.toString(notificationTypeNewPushMessage.content.getConstructor()));
        } else if (constructor == 1198638768) {
            return C4403w.m27871i1(R.string.YouHaveNewMessage);
        } else {
            TdApi.Message message = null;
            if (constructor != 1885935159) {
                return null;
            }
            TdApi.Message message2 = ((TdApi.NotificationTypeNewMessage) this.f34006c.type).message;
            if (C7316a.m17051j(this.f34002M.m4220v()) && message2.ttl != 0) {
                return C4403w.m27871i1(R.string.YouHaveNewMessage);
            }
            if (message2.content.getConstructor() == 953503801) {
                long j = ((TdApi.MessagePinMessage) message2.content).messageId;
                if (j != 0) {
                    message = q6Var.m2833H5(message2.chatId, j);
                }
                if (!z) {
                    return m4473E(C4403w.m27948Q0(q6Var, message2.senderId, message, false));
                }
                if (message != null) {
                    message2 = message;
                }
            }
            C4779t2.C4783d U1 = C4779t2.m25594U1(q6Var, m4465g(), message2, z2);
            if (zArr != null && !U1.f16273e) {
                zArr[0] = true;
            }
            return m4473E(m4460l(U1));
        }
    }

    public C10711hb m4457o() {
        return this.f34002M;
    }

    public boolean m4456p() {
        return C5063c.m24145b(this.f34003N, 1);
    }

    public boolean m4455q() {
        return C5063c.m24145b(this.f34003N, 2);
    }

    public boolean m4454r() {
        return this.f34002M.m4248C(this.f34005b) && this.f34002M.m4236O();
    }

    public boolean m4453s() {
        return this.f34006c.type.getConstructor() == 1198638768;
    }

    public boolean m4452t() {
        int constructor = this.f34006c.type.getConstructor();
        if (constructor != -711680462) {
            return constructor == 1885935159 && ((TdApi.NotificationTypeNewMessage) this.f34006c.type).message.content.getConstructor() == 953503801;
        }
        return C4779t2.m25409v3(((TdApi.NotificationTypeNewPushMessage) this.f34006c.type).content);
    }

    public boolean m4451u(C10609db dbVar) {
        if (this == dbVar) {
            return true;
        }
        long e = m4467e();
        return e == dbVar.m4467e() && e != 0;
    }

    public boolean m4450v() {
        switch (this.f34006c.type.getConstructor()) {
            case TdApi.NotificationTypeNewPushMessage.CONSTRUCTOR:
                return ((TdApi.NotificationTypeNewPushMessage) this.f34006c.type).isOutgoing;
            case TdApi.NotificationTypeNewSecretChat.CONSTRUCTOR:
            case TdApi.NotificationTypeNewCall.CONSTRUCTOR:
                return false;
            case TdApi.NotificationTypeNewMessage.CONSTRUCTOR:
                return ((TdApi.NotificationTypeNewMessage) this.f34006c.type).message.isOutgoing;
            default:
                throw new UnsupportedOperationException(this.f34006c.type.toString());
        }
    }

    public boolean m4449w() {
        return this.f34002M.m4243H();
    }

    public boolean m4448x() {
        int constructor = this.f34006c.type.getConstructor();
        return constructor != -711680462 ? constructor == 1885935159 && ((TdApi.NotificationTypeNewMessage) this.f34006c.type).message.content.getConstructor() == 1779022878 : ((TdApi.NotificationTypeNewPushMessage) this.f34006c.type).content.getConstructor() == 1553513939;
    }

    public boolean m4447y() {
        return this.f34006c.type.getConstructor() != -711680462;
    }

    public boolean m4446z() {
        return this.f34006c.isSilent;
    }

    public C10609db(C10930q6 q6Var, TdApi.Notification notification, C10711hb hbVar) {
        this.f34004a = q6Var;
        int i = notification.f25410id;
        this.f34005b = i;
        this.f34006c = notification;
        this.f34002M = hbVar;
        this.f34003N = q6Var.m2294pc().m4087x(i);
    }
}
