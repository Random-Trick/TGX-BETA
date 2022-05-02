package p213p0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p002a1.C0020a;
import p196o0.C7523b;
import p213p0.C7983l;
import p227q0.C8125b;
import p241r0.C8339b;

public class C7956h {

    public static class C7957a {
        public final Bundle f25861a;
        public IconCompat f25862b;
        public final C7985m[] f25863c;
        public final C7985m[] f25864d;
        public boolean f25865e;
        public boolean f25866f;
        public final int f25867g;
        public final boolean f25868h;
        @Deprecated
        public int f25869i;
        public CharSequence f25870j;
        public PendingIntent f25871k;

        public static final class C7958a {
            public final IconCompat f25872a;
            public final CharSequence f25873b;
            public final PendingIntent f25874c;
            public boolean f25875d;
            public final Bundle f25876e;
            public ArrayList<C7985m> f25877f;
            public int f25878g;
            public boolean f25879h;
            public boolean f25880i;

            public C7958a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m40323d(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            public C7958a m13988a(C7985m mVar) {
                if (this.f25877f == null) {
                    this.f25877f = new ArrayList<>();
                }
                if (mVar != null) {
                    this.f25877f.add(mVar);
                }
                return this;
            }

            public C7957a m13987b() {
                m13986c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C7985m> arrayList3 = this.f25877f;
                if (arrayList3 != null) {
                    Iterator<C7985m> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C7985m next = it.next();
                        if (next.m13835j()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C7985m[] mVarArr = null;
                C7985m[] mVarArr2 = arrayList.isEmpty() ? null : (C7985m[]) arrayList.toArray(new C7985m[arrayList.size()]);
                if (!arrayList2.isEmpty()) {
                    mVarArr = (C7985m[]) arrayList2.toArray(new C7985m[arrayList2.size()]);
                }
                return new C7957a(this.f25872a, this.f25873b, this.f25874c, this.f25876e, mVarArr, mVarArr2, this.f25875d, this.f25878g, this.f25879h, this.f25880i);
            }

            public final void m13986c() {
                if (this.f25880i) {
                    Objects.requireNonNull(this.f25874c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C7958a m13985d(boolean z) {
                this.f25875d = z;
                return this;
            }

            public C7958a m13984e(int i) {
                this.f25878g = i;
                return this;
            }

            public C7958a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7985m[] mVarArr, boolean z, int i, boolean z2, boolean z3) {
                this.f25875d = true;
                this.f25879h = true;
                this.f25872a = iconCompat;
                this.f25873b = C7965e.m13954h(charSequence);
                this.f25874c = pendingIntent;
                this.f25876e = bundle;
                this.f25877f = mVarArr == null ? null : new ArrayList<>(Arrays.asList(mVarArr));
                this.f25875d = z;
                this.f25878g = i;
                this.f25879h = z2;
                this.f25880i = z3;
            }
        }

        public C7957a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m40323d(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent m13998a() {
            return this.f25871k;
        }

        public boolean m13997b() {
            return this.f25865e;
        }

        public C7985m[] m13996c() {
            return this.f25864d;
        }

        public Bundle m13995d() {
            return this.f25861a;
        }

        public IconCompat m13994e() {
            int i;
            if (this.f25862b == null && (i = this.f25869i) != 0) {
                this.f25862b = IconCompat.m40323d(null, "", i);
            }
            return this.f25862b;
        }

        public C7985m[] m13993f() {
            return this.f25863c;
        }

        public int m13992g() {
            return this.f25867g;
        }

        public boolean m13991h() {
            return this.f25866f;
        }

        public CharSequence m13990i() {
            return this.f25870j;
        }

        public boolean m13989j() {
            return this.f25868h;
        }

        public C7957a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        public C7957a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7985m[] mVarArr, C7985m[] mVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f25866f = true;
            this.f25862b = iconCompat;
            if (iconCompat != null && iconCompat.m40317j() == 2) {
                this.f25869i = iconCompat.m40321f();
            }
            this.f25870j = C7965e.m13954h(charSequence);
            this.f25871k = pendingIntent;
            this.f25861a = bundle == null ? new Bundle() : bundle;
            this.f25863c = mVarArr;
            this.f25864d = mVarArr2;
            this.f25865e = z;
            this.f25867g = i;
            this.f25866f = z2;
            this.f25868h = z3;
        }
    }

    public static class C7959b extends AbstractC7973j {
        public Bitmap f25881e;
        public IconCompat f25882f;
        public boolean f25883g;
        public boolean f25884h;

        public static class C7960a {
            public static void m13981a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void m13980b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        public static class C7961b {
            public static void m13979a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class C7962c {
            public static void m13978a(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override
        public void mo13900b(AbstractC7955g gVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(gVar.mo13894a()).setBigContentTitle(this.f25963b).bigPicture(this.f25881e);
                if (this.f25883g) {
                    IconCompat iconCompat = this.f25882f;
                    Context context = null;
                    if (iconCompat == null) {
                        C7960a.m13981a(bigPicture, null);
                    } else if (i >= 23) {
                        if (gVar instanceof C7974i) {
                            context = ((C7974i) gVar).m13889f();
                        }
                        C7961b.m13979a(bigPicture, this.f25882f.m40308s(context));
                    } else if (iconCompat.m40317j() == 1) {
                        C7960a.m13981a(bigPicture, this.f25882f.m40322e());
                    } else {
                        C7960a.m13981a(bigPicture, null);
                    }
                }
                if (this.f25965d) {
                    C7960a.m13980b(bigPicture, this.f25964c);
                }
                if (i >= 31) {
                    C7962c.m13978a(bigPicture, this.f25884h);
                }
            }
        }

        @Override
        public String mo13899c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public C7959b m13983h(Bitmap bitmap) {
            this.f25882f = bitmap == null ? null : IconCompat.m40324c(bitmap);
            this.f25883g = true;
            return this;
        }

        public C7959b m13982i(Bitmap bitmap) {
            this.f25881e = bitmap;
            return this;
        }
    }

    public static class C7963c extends AbstractC7973j {
        public CharSequence f25885e;

        @Override
        public void mo13901a(Bundle bundle) {
            super.mo13901a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f25885e);
            }
        }

        @Override
        public void mo13900b(AbstractC7955g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.mo13894a()).setBigContentTitle(this.f25963b).bigText(this.f25885e);
                if (this.f25965d) {
                    bigText.setSummaryText(this.f25964c);
                }
            }
        }

        @Override
        public String mo13899c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public C7963c m13977h(CharSequence charSequence) {
            this.f25885e = C7965e.m13954h(charSequence);
            return this;
        }
    }

    public static final class C7964d {
        public static Notification.BubbleMetadata m13976a(C7964d dVar) {
            return null;
        }
    }

    public static final class C7966f implements AbstractC7969g {
        public Bitmap f25935a;
        public C7967a f25936b;
        public int f25937c = 0;

        @Deprecated
        public static class C7967a {
            public final String[] f25938a;
            public final C7985m f25939b;
            public final PendingIntent f25940c;
            public final PendingIntent f25941d;
            public final String[] f25942e;
            public final long f25943f;

            public static class C7968a {
                public final List<String> f25944a = new ArrayList();
                public final String f25945b;
                public C7985m f25946c;
                public PendingIntent f25947d;
                public PendingIntent f25948e;
                public long f25949f;

                public C7968a(String str) {
                    this.f25945b = str;
                }

                public C7968a m13927a(String str) {
                    if (str != null) {
                        this.f25944a.add(str);
                    }
                    return this;
                }

                public C7967a m13926b() {
                    List<String> list = this.f25944a;
                    return new C7967a((String[]) list.toArray(new String[list.size()]), this.f25946c, this.f25948e, this.f25947d, new String[]{this.f25945b}, this.f25949f);
                }

                public C7968a m13925c(long j) {
                    this.f25949f = j;
                    return this;
                }

                public C7968a m13924d(PendingIntent pendingIntent) {
                    this.f25947d = pendingIntent;
                    return this;
                }

                public C7968a m13923e(PendingIntent pendingIntent, C7985m mVar) {
                    this.f25946c = mVar;
                    this.f25948e = pendingIntent;
                    return this;
                }
            }

            public C7967a(String[] strArr, C7985m mVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f25938a = strArr;
                this.f25939b = mVar;
                this.f25941d = pendingIntent2;
                this.f25940c = pendingIntent;
                this.f25942e = strArr2;
                this.f25943f = j;
            }

            public long m13933a() {
                return this.f25943f;
            }

            public String[] m13932b() {
                return this.f25938a;
            }

            public String[] m13931c() {
                return this.f25942e;
            }

            public PendingIntent m13930d() {
                return this.f25941d;
            }

            public C7985m m13929e() {
                return this.f25939b;
            }

            public PendingIntent m13928f() {
                return this.f25940c;
            }
        }

        public static Bundle m13935b(C7967a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.m13931c() == null || aVar.m13931c().length <= 1) ? null : aVar.m13931c()[0];
            int length = aVar.m13932b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.m13932b()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            C7985m e = aVar.m13929e();
            if (e != null) {
                bundle.putParcelable("remote_input", new RemoteInput.Builder(e.m13836i()).setLabel(e.m13837h()).setChoices(e.m13840e()).setAllowFreeFormInput(e.m13842c()).addExtras(e.m13838g()).build());
            }
            bundle.putParcelable("on_reply", aVar.m13928f());
            bundle.putParcelable("on_read", aVar.m13930d());
            bundle.putStringArray("participants", aVar.m13931c());
            bundle.putLong("timestamp", aVar.m13933a());
            return bundle;
        }

        @Override
        public C7965e mo13922a(C7965e eVar) {
            if (Build.VERSION.SDK_INT < 21) {
                return eVar;
            }
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f25935a;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i = this.f25937c;
            if (i != 0) {
                bundle.putInt("app_color", i);
            }
            C7967a aVar = this.f25936b;
            if (aVar != null) {
                bundle.putBundle("car_conversation", m13935b(aVar));
            }
            eVar.m13955g().putBundle("android.car.EXTENSIONS", bundle);
            return eVar;
        }

        @Deprecated
        public C7966f m13934c(C7967a aVar) {
            this.f25936b = aVar;
            return this;
        }
    }

    public interface AbstractC7969g {
        C7965e mo13922a(C7965e eVar);
    }

    public static class C7970h extends AbstractC7973j {
        public ArrayList<CharSequence> f25950e = new ArrayList<>();

        @Override
        public void mo13900b(AbstractC7955g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(gVar.mo13894a()).setBigContentTitle(this.f25963b);
                if (this.f25965d) {
                    bigContentTitle.setSummaryText(this.f25964c);
                }
                Iterator<CharSequence> it = this.f25950e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        @Override
        public String mo13899c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public C7970h m13921h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f25950e.add(C7965e.m13954h(charSequence));
            }
            return this;
        }

        public C7970h m13920i(CharSequence charSequence) {
            this.f25963b = C7965e.m13954h(charSequence);
            return this;
        }

        public C7970h m13919j(CharSequence charSequence) {
            this.f25964c = C7965e.m13954h(charSequence);
            this.f25965d = true;
            return this;
        }
    }

    public static abstract class AbstractC7973j {
        public C7965e f25962a;
        public CharSequence f25963b;
        public CharSequence f25964c;
        public boolean f25965d = false;

        public void mo13901a(Bundle bundle) {
            if (this.f25965d) {
                bundle.putCharSequence("android.summaryText", this.f25964c);
            }
            CharSequence charSequence = this.f25963b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = mo13899c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        public abstract void mo13900b(AbstractC7955g gVar);

        public abstract String mo13899c();

        public RemoteViews m13898d(AbstractC7955g gVar) {
            return null;
        }

        public RemoteViews m13897e(AbstractC7955g gVar) {
            return null;
        }

        public RemoteViews m13896f(AbstractC7955g gVar) {
            return null;
        }

        public void m13895g(C7965e eVar) {
            if (this.f25962a != eVar) {
                this.f25962a = eVar;
                if (eVar != null) {
                    eVar.m13967I(this);
                }
            }
        }
    }

    public static Bundle m13999a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C7975j.m13884c(notification);
        }
        return null;
    }

    public static class C7971i extends AbstractC7973j {
        public final List<C7972a> f25951e = new ArrayList();
        public final List<C7972a> f25952f = new ArrayList();
        public C7983l f25953g;
        public CharSequence f25954h;
        public Boolean f25955i;

        public static final class C7972a {
            public final CharSequence f25956a;
            public final long f25957b;
            public final C7983l f25958c;
            public Bundle f25959d = new Bundle();
            public String f25960e;
            public Uri f25961f;

            public C7972a(CharSequence charSequence, long j, C7983l lVar) {
                this.f25956a = charSequence;
                this.f25957b = j;
                this.f25958c = lVar;
            }

            public static Bundle[] m13910a(List<C7972a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m13902i();
                }
                return bundleArr;
            }

            public String m13909b() {
                return this.f25960e;
            }

            public Uri m13908c() {
                return this.f25961f;
            }

            public C7983l m13907d() {
                return this.f25958c;
            }

            public CharSequence m13906e() {
                return this.f25956a;
            }

            public long m13905f() {
                return this.f25957b;
            }

            public C7972a m13904g(String str, Uri uri) {
                this.f25960e = str;
                this.f25961f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message m13903h() {
                Notification.MessagingStyle.Message message;
                C7983l d = m13907d();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence e = m13906e();
                    long f = m13905f();
                    if (d != null) {
                        person = d.m13853h();
                    }
                    message = new Notification.MessagingStyle.Message(e, f, person);
                } else {
                    CharSequence e2 = m13906e();
                    long f2 = m13905f();
                    if (d != null) {
                        charSequence = d.m13858c();
                    }
                    message = new Notification.MessagingStyle.Message(e2, f2, charSequence);
                }
                if (m13909b() != null) {
                    message.setData(m13909b(), m13908c());
                }
                return message;
            }

            public final Bundle m13902i() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f25956a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f25957b);
                C7983l lVar = this.f25958c;
                if (lVar != null) {
                    bundle.putCharSequence("sender", lVar.m13858c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f25958c.m13853h());
                    } else {
                        bundle.putBundle("person", this.f25958c.m13851j());
                    }
                }
                String str = this.f25960e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f25961f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f25959d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        @Deprecated
        public C7971i(CharSequence charSequence) {
            this.f25953g = new C7983l.C7984a().m13845e(charSequence).m13849a();
        }

        @Override
        public void mo13901a(Bundle bundle) {
            super.mo13901a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f25953g.m13858c());
            bundle.putBundle("android.messagingStyleUser", this.f25953g.m13851j());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f25954h);
            if (this.f25954h != null && this.f25955i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f25954h);
            }
            if (!this.f25951e.isEmpty()) {
                bundle.putParcelableArray("android.messages", C7972a.m13910a(this.f25951e));
            }
            if (!this.f25952f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", C7972a.m13910a(this.f25952f));
            }
            Boolean bool = this.f25955i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override
        public void mo13900b(AbstractC7955g gVar) {
            CharSequence charSequence;
            Notification.MessagingStyle messagingStyle;
            m13911o(m13915k());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.f25953g.m13853h());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.f25953g.m13858c());
                }
                for (C7972a aVar : this.f25951e) {
                    messagingStyle.addMessage(aVar.m13903h());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (C7972a aVar2 : this.f25952f) {
                        messagingStyle.addHistoricMessage(aVar2.m13903h());
                    }
                }
                if (this.f25955i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.f25954h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f25955i.booleanValue());
                }
                messagingStyle.setBuilder(gVar.mo13894a());
                return;
            }
            C7972a i2 = m13917i();
            if (this.f25954h != null && this.f25955i.booleanValue()) {
                gVar.mo13894a().setContentTitle(this.f25954h);
            } else if (i2 != null) {
                gVar.mo13894a().setContentTitle("");
                if (i2.m13907d() != null) {
                    gVar.mo13894a().setContentTitle(i2.m13907d().m13858c());
                }
            }
            if (i2 != null) {
                Notification.Builder a = gVar.mo13894a();
                if (this.f25954h != null) {
                    charSequence = m13913m(i2);
                } else {
                    charSequence = i2.m13906e();
                }
                a.setContentText(charSequence);
            }
            if (i >= 16) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z = this.f25954h != null || m13916j();
                for (int size = this.f25951e.size() - 1; size >= 0; size--) {
                    C7972a aVar3 = this.f25951e.get(size);
                    CharSequence m = z ? m13913m(aVar3) : aVar3.m13906e();
                    if (size != this.f25951e.size() - 1) {
                        spannableStringBuilder.insert(0, (CharSequence) "\n");
                    }
                    spannableStringBuilder.insert(0, m);
                }
                new Notification.BigTextStyle(gVar.mo13894a()).setBigContentTitle(null).bigText(spannableStringBuilder);
            }
        }

        @Override
        public String mo13899c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public C7971i m13918h(C7972a aVar) {
            if (aVar != null) {
                this.f25951e.add(aVar);
                if (this.f25951e.size() > 25) {
                    this.f25951e.remove(0);
                }
            }
            return this;
        }

        public final C7972a m13917i() {
            List<C7972a> list;
            for (int size = this.f25951e.size() - 1; size >= 0; size--) {
                C7972a aVar = this.f25951e.get(size);
                if (!(aVar.m13907d() == null || TextUtils.isEmpty(aVar.m13907d().m13858c()))) {
                    return aVar;
                }
            }
            if (this.f25951e.isEmpty()) {
                return null;
            }
            return this.f25951e.get(list.size() - 1);
        }

        public final boolean m13916j() {
            for (int size = this.f25951e.size() - 1; size >= 0; size--) {
                C7972a aVar = this.f25951e.get(size);
                if (aVar.m13907d() != null && aVar.m13907d().m13858c() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean m13915k() {
            C7965e eVar = this.f25962a;
            if (eVar != null && eVar.f25909a.getApplicationInfo().targetSdkVersion < 28 && this.f25955i == null) {
                return this.f25954h != null;
            }
            Boolean bool = this.f25955i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final TextAppearanceSpan m13914l(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        public final CharSequence m13913m(C7972a aVar) {
            C0020a c = C0020a.m42597c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int i = z ? -16777216 : -1;
            CharSequence charSequence = "";
            CharSequence c2 = aVar.m13907d() == null ? charSequence : aVar.m13907d().m13858c();
            if (TextUtils.isEmpty(c2)) {
                c2 = this.f25953g.m13858c();
                if (z && this.f25962a.m13956f() != 0) {
                    i = this.f25962a.m13956f();
                }
            }
            CharSequence h = c.m42592h(c2);
            spannableStringBuilder.append(h);
            spannableStringBuilder.setSpan(m13914l(i), spannableStringBuilder.length() - h.length(), spannableStringBuilder.length(), 33);
            if (aVar.m13906e() != null) {
                charSequence = aVar.m13906e();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(c.m42592h(charSequence));
            return spannableStringBuilder;
        }

        public C7971i m13912n(CharSequence charSequence) {
            this.f25954h = charSequence;
            return this;
        }

        public C7971i m13911o(boolean z) {
            this.f25955i = Boolean.valueOf(z);
            return this;
        }

        public C7971i(C7983l lVar) {
            if (!TextUtils.isEmpty(lVar.m13858c())) {
                this.f25953g = lVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    public static class C7965e {
        public boolean f25886A;
        public boolean f25887B;
        public String f25888C;
        public Bundle f25889D;
        public int f25890E;
        public int f25891F;
        public Notification f25892G;
        public RemoteViews f25893H;
        public RemoteViews f25894I;
        public RemoteViews f25895J;
        public String f25896K;
        public int f25897L;
        public String f25898M;
        public C8125b f25899N;
        public long f25900O;
        public int f25901P;
        public int f25902Q;
        public boolean f25903R;
        public C7964d f25904S;
        public Notification f25905T;
        public boolean f25906U;
        public Icon f25907V;
        @Deprecated
        public ArrayList<String> f25908W;
        public Context f25909a;
        public ArrayList<C7957a> f25910b;
        public ArrayList<C7983l> f25911c;
        public ArrayList<C7957a> f25912d;
        public CharSequence f25913e;
        public CharSequence f25914f;
        public PendingIntent f25915g;
        public PendingIntent f25916h;
        public RemoteViews f25917i;
        public Bitmap f25918j;
        public CharSequence f25919k;
        public int f25920l;
        public int f25921m;
        public boolean f25922n;
        public boolean f25923o;
        public AbstractC7973j f25924p;
        public CharSequence f25925q;
        public CharSequence f25926r;
        public CharSequence[] f25927s;
        public int f25928t;
        public int f25929u;
        public boolean f25930v;
        public String f25931w;
        public boolean f25932x;
        public String f25933y;
        public boolean f25934z;

        public C7965e(Context context, String str) {
            this.f25910b = new ArrayList<>();
            this.f25911c = new ArrayList<>();
            this.f25912d = new ArrayList<>();
            this.f25922n = true;
            this.f25934z = false;
            this.f25890E = 0;
            this.f25891F = 0;
            this.f25897L = 0;
            this.f25901P = 0;
            this.f25902Q = 0;
            Notification notification = new Notification();
            this.f25905T = notification;
            this.f25909a = context;
            this.f25896K = str;
            notification.when = System.currentTimeMillis();
            this.f25905T.audioStreamType = -1;
            this.f25921m = 0;
            this.f25908W = new ArrayList<>();
            this.f25903R = true;
        }

        public static CharSequence m13954h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public C7965e m13975A(int i) {
            this.f25920l = i;
            return this;
        }

        public C7965e m13974B(boolean z) {
            m13942t(8, z);
            return this;
        }

        public C7965e m13973C(int i) {
            this.f25921m = i;
            return this;
        }

        public C7965e m13972D(C8339b bVar) {
            if (bVar == null) {
                return this;
            }
            this.f25898M = bVar.m12774b();
            if (this.f25899N == null) {
                if (bVar.m12773c() != null) {
                    this.f25899N = bVar.m12773c();
                } else if (bVar.m12774b() != null) {
                    this.f25899N = new C8125b(bVar.m12774b());
                }
            }
            if (this.f25913e == null) {
                m13945q(bVar.m12771e());
            }
            return this;
        }

        public C7965e m13971E(boolean z) {
            this.f25922n = z;
            return this;
        }

        public C7965e m13970F(int i) {
            this.f25905T.icon = i;
            return this;
        }

        public C7965e m13969G(String str) {
            this.f25933y = str;
            return this;
        }

        public C7965e m13968H(Uri uri) {
            Notification notification = this.f25905T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public C7965e m13967I(AbstractC7973j jVar) {
            if (this.f25924p != jVar) {
                this.f25924p = jVar;
                if (jVar != null) {
                    jVar.m13895g(this);
                }
            }
            return this;
        }

        public C7965e m13966J(CharSequence charSequence) {
            this.f25925q = m13954h(charSequence);
            return this;
        }

        public C7965e m13965K(CharSequence charSequence) {
            this.f25905T.tickerText = m13954h(charSequence);
            return this;
        }

        public C7965e m13964L(long[] jArr) {
            this.f25905T.vibrate = jArr;
            return this;
        }

        public C7965e m13963M(int i) {
            this.f25891F = i;
            return this;
        }

        public C7965e m13962N(long j) {
            this.f25905T.when = j;
            return this;
        }

        public C7965e m13961a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f25910b.add(new C7957a(i, charSequence, pendingIntent));
            return this;
        }

        public C7965e m13960b(C7957a aVar) {
            if (aVar != null) {
                this.f25910b.add(aVar);
            }
            return this;
        }

        @Deprecated
        public C7965e m13959c(String str) {
            if (str != null && !str.isEmpty()) {
                this.f25908W.add(str);
            }
            return this;
        }

        public Notification m13958d() {
            return new C7974i(this).m13892c();
        }

        public C7965e m13957e(AbstractC7969g gVar) {
            gVar.mo13922a(this);
            return this;
        }

        public int m13956f() {
            return this.f25890E;
        }

        public Bundle m13955g() {
            if (this.f25889D == null) {
                this.f25889D = new Bundle();
            }
            return this.f25889D;
        }

        public final Bitmap m13953i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f25909a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7523b.b_res_0x7f050056);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7523b.a_res_0x7f050055);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        public C7965e m13952j(boolean z) {
            this.f25903R = z;
            return this;
        }

        public C7965e m13951k(boolean z) {
            m13942t(16, z);
            return this;
        }

        public C7965e m13950l(String str) {
            this.f25888C = str;
            return this;
        }

        public C7965e m13949m(String str) {
            this.f25896K = str;
            return this;
        }

        public C7965e m13948n(int i) {
            this.f25890E = i;
            return this;
        }

        public C7965e m13947o(PendingIntent pendingIntent) {
            this.f25915g = pendingIntent;
            return this;
        }

        public C7965e m13946p(CharSequence charSequence) {
            this.f25914f = m13954h(charSequence);
            return this;
        }

        public C7965e m13945q(CharSequence charSequence) {
            this.f25913e = m13954h(charSequence);
            return this;
        }

        public C7965e m13944r(int i) {
            Notification notification = this.f25905T;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public C7965e m13943s(PendingIntent pendingIntent) {
            this.f25905T.deleteIntent = pendingIntent;
            return this;
        }

        public final void m13942t(int i, boolean z) {
            if (z) {
                Notification notification = this.f25905T;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f25905T;
            notification2.flags = (~i) & notification2.flags;
        }

        public C7965e m13941u(String str) {
            this.f25931w = str;
            return this;
        }

        public C7965e m13940v(int i) {
            this.f25901P = i;
            return this;
        }

        public C7965e m13939w(boolean z) {
            this.f25932x = z;
            return this;
        }

        public C7965e m13938x(Bitmap bitmap) {
            this.f25918j = m13953i(bitmap);
            return this;
        }

        public C7965e m13937y(int i, int i2, int i3) {
            Notification notification = this.f25905T;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public C7965e m13936z(boolean z) {
            this.f25934z = z;
            return this;
        }

        @Deprecated
        public C7965e(Context context) {
            this(context, null);
        }
    }
}
