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
        public final Bundle f25858a;
        public IconCompat f25859b;
        public final C7985m[] f25860c;
        public final C7985m[] f25861d;
        public boolean f25862e;
        public boolean f25863f;
        public final int f25864g;
        public final boolean f25865h;
        @Deprecated
        public int f25866i;
        public CharSequence f25867j;
        public PendingIntent f25868k;

        public static final class C7958a {
            public final IconCompat f25869a;
            public final CharSequence f25870b;
            public final PendingIntent f25871c;
            public boolean f25872d;
            public final Bundle f25873e;
            public ArrayList<C7985m> f25874f;
            public int f25875g;
            public boolean f25876h;
            public boolean f25877i;

            public C7958a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m40320d(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            public C7958a m13989a(C7985m mVar) {
                if (this.f25874f == null) {
                    this.f25874f = new ArrayList<>();
                }
                if (mVar != null) {
                    this.f25874f.add(mVar);
                }
                return this;
            }

            public C7957a m13988b() {
                m13987c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C7985m> arrayList3 = this.f25874f;
                if (arrayList3 != null) {
                    Iterator<C7985m> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C7985m next = it.next();
                        if (next.m13836j()) {
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
                return new C7957a(this.f25869a, this.f25870b, this.f25871c, this.f25873e, mVarArr, mVarArr2, this.f25872d, this.f25875g, this.f25876h, this.f25877i);
            }

            public final void m13987c() {
                if (this.f25877i) {
                    Objects.requireNonNull(this.f25871c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C7958a m13986d(boolean z) {
                this.f25872d = z;
                return this;
            }

            public C7958a m13985e(int i) {
                this.f25875g = i;
                return this;
            }

            public C7958a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7985m[] mVarArr, boolean z, int i, boolean z2, boolean z3) {
                this.f25872d = true;
                this.f25876h = true;
                this.f25869a = iconCompat;
                this.f25870b = C7965e.m13955h(charSequence);
                this.f25871c = pendingIntent;
                this.f25873e = bundle;
                this.f25874f = mVarArr == null ? null : new ArrayList<>(Arrays.asList(mVarArr));
                this.f25872d = z;
                this.f25875g = i;
                this.f25876h = z2;
                this.f25877i = z3;
            }
        }

        public C7957a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m40320d(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent m13999a() {
            return this.f25868k;
        }

        public boolean m13998b() {
            return this.f25862e;
        }

        public C7985m[] m13997c() {
            return this.f25861d;
        }

        public Bundle m13996d() {
            return this.f25858a;
        }

        public IconCompat m13995e() {
            int i;
            if (this.f25859b == null && (i = this.f25866i) != 0) {
                this.f25859b = IconCompat.m40320d(null, "", i);
            }
            return this.f25859b;
        }

        public C7985m[] m13994f() {
            return this.f25860c;
        }

        public int m13993g() {
            return this.f25864g;
        }

        public boolean m13992h() {
            return this.f25863f;
        }

        public CharSequence m13991i() {
            return this.f25867j;
        }

        public boolean m13990j() {
            return this.f25865h;
        }

        public C7957a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        public C7957a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7985m[] mVarArr, C7985m[] mVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f25863f = true;
            this.f25859b = iconCompat;
            if (iconCompat != null && iconCompat.m40314j() == 2) {
                this.f25866i = iconCompat.m40318f();
            }
            this.f25867j = C7965e.m13955h(charSequence);
            this.f25868k = pendingIntent;
            this.f25858a = bundle == null ? new Bundle() : bundle;
            this.f25860c = mVarArr;
            this.f25861d = mVarArr2;
            this.f25862e = z;
            this.f25864g = i;
            this.f25863f = z2;
            this.f25865h = z3;
        }
    }

    public static class C7959b extends AbstractC7973j {
        public Bitmap f25878e;
        public IconCompat f25879f;
        public boolean f25880g;
        public boolean f25881h;

        public static class C7960a {
            public static void m13982a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void m13981b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        public static class C7961b {
            public static void m13980a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class C7962c {
            public static void m13979a(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override
        public void mo13901b(AbstractC7955g gVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(gVar.mo13895a()).setBigContentTitle(this.f25960b).bigPicture(this.f25878e);
                if (this.f25880g) {
                    IconCompat iconCompat = this.f25879f;
                    Context context = null;
                    if (iconCompat == null) {
                        C7960a.m13982a(bigPicture, null);
                    } else if (i >= 23) {
                        if (gVar instanceof C7974i) {
                            context = ((C7974i) gVar).m13890f();
                        }
                        C7961b.m13980a(bigPicture, this.f25879f.m40305s(context));
                    } else if (iconCompat.m40314j() == 1) {
                        C7960a.m13982a(bigPicture, this.f25879f.m40319e());
                    } else {
                        C7960a.m13982a(bigPicture, null);
                    }
                }
                if (this.f25962d) {
                    C7960a.m13981b(bigPicture, this.f25961c);
                }
                if (i >= 31) {
                    C7962c.m13979a(bigPicture, this.f25881h);
                }
            }
        }

        @Override
        public String mo13900c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public C7959b m13984h(Bitmap bitmap) {
            this.f25879f = bitmap == null ? null : IconCompat.m40321c(bitmap);
            this.f25880g = true;
            return this;
        }

        public C7959b m13983i(Bitmap bitmap) {
            this.f25878e = bitmap;
            return this;
        }
    }

    public static class C7963c extends AbstractC7973j {
        public CharSequence f25882e;

        @Override
        public void mo13902a(Bundle bundle) {
            super.mo13902a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f25882e);
            }
        }

        @Override
        public void mo13901b(AbstractC7955g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.mo13895a()).setBigContentTitle(this.f25960b).bigText(this.f25882e);
                if (this.f25962d) {
                    bigText.setSummaryText(this.f25961c);
                }
            }
        }

        @Override
        public String mo13900c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public C7963c m13978h(CharSequence charSequence) {
            this.f25882e = C7965e.m13955h(charSequence);
            return this;
        }
    }

    public static final class C7964d {
        public static Notification.BubbleMetadata m13977a(C7964d dVar) {
            return null;
        }
    }

    public static final class C7966f implements AbstractC7969g {
        public Bitmap f25932a;
        public C7967a f25933b;
        public int f25934c = 0;

        @Deprecated
        public static class C7967a {
            public final String[] f25935a;
            public final C7985m f25936b;
            public final PendingIntent f25937c;
            public final PendingIntent f25938d;
            public final String[] f25939e;
            public final long f25940f;

            public static class C7968a {
                public final List<String> f25941a = new ArrayList();
                public final String f25942b;
                public C7985m f25943c;
                public PendingIntent f25944d;
                public PendingIntent f25945e;
                public long f25946f;

                public C7968a(String str) {
                    this.f25942b = str;
                }

                public C7968a m13928a(String str) {
                    if (str != null) {
                        this.f25941a.add(str);
                    }
                    return this;
                }

                public C7967a m13927b() {
                    List<String> list = this.f25941a;
                    return new C7967a((String[]) list.toArray(new String[list.size()]), this.f25943c, this.f25945e, this.f25944d, new String[]{this.f25942b}, this.f25946f);
                }

                public C7968a m13926c(long j) {
                    this.f25946f = j;
                    return this;
                }

                public C7968a m13925d(PendingIntent pendingIntent) {
                    this.f25944d = pendingIntent;
                    return this;
                }

                public C7968a m13924e(PendingIntent pendingIntent, C7985m mVar) {
                    this.f25943c = mVar;
                    this.f25945e = pendingIntent;
                    return this;
                }
            }

            public C7967a(String[] strArr, C7985m mVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f25935a = strArr;
                this.f25936b = mVar;
                this.f25938d = pendingIntent2;
                this.f25937c = pendingIntent;
                this.f25939e = strArr2;
                this.f25940f = j;
            }

            public long m13934a() {
                return this.f25940f;
            }

            public String[] m13933b() {
                return this.f25935a;
            }

            public String[] m13932c() {
                return this.f25939e;
            }

            public PendingIntent m13931d() {
                return this.f25938d;
            }

            public C7985m m13930e() {
                return this.f25936b;
            }

            public PendingIntent m13929f() {
                return this.f25937c;
            }
        }

        public static Bundle m13936b(C7967a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.m13932c() == null || aVar.m13932c().length <= 1) ? null : aVar.m13932c()[0];
            int length = aVar.m13933b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.m13933b()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            C7985m e = aVar.m13930e();
            if (e != null) {
                bundle.putParcelable("remote_input", new RemoteInput.Builder(e.m13837i()).setLabel(e.m13838h()).setChoices(e.m13841e()).setAllowFreeFormInput(e.m13843c()).addExtras(e.m13839g()).build());
            }
            bundle.putParcelable("on_reply", aVar.m13929f());
            bundle.putParcelable("on_read", aVar.m13931d());
            bundle.putStringArray("participants", aVar.m13932c());
            bundle.putLong("timestamp", aVar.m13934a());
            return bundle;
        }

        @Override
        public C7965e mo13923a(C7965e eVar) {
            if (Build.VERSION.SDK_INT < 21) {
                return eVar;
            }
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f25932a;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i = this.f25934c;
            if (i != 0) {
                bundle.putInt("app_color", i);
            }
            C7967a aVar = this.f25933b;
            if (aVar != null) {
                bundle.putBundle("car_conversation", m13936b(aVar));
            }
            eVar.m13956g().putBundle("android.car.EXTENSIONS", bundle);
            return eVar;
        }

        @Deprecated
        public C7966f m13935c(C7967a aVar) {
            this.f25933b = aVar;
            return this;
        }
    }

    public interface AbstractC7969g {
        C7965e mo13923a(C7965e eVar);
    }

    public static class C7970h extends AbstractC7973j {
        public ArrayList<CharSequence> f25947e = new ArrayList<>();

        @Override
        public void mo13901b(AbstractC7955g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(gVar.mo13895a()).setBigContentTitle(this.f25960b);
                if (this.f25962d) {
                    bigContentTitle.setSummaryText(this.f25961c);
                }
                Iterator<CharSequence> it = this.f25947e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        @Override
        public String mo13900c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public C7970h m13922h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f25947e.add(C7965e.m13955h(charSequence));
            }
            return this;
        }

        public C7970h m13921i(CharSequence charSequence) {
            this.f25960b = C7965e.m13955h(charSequence);
            return this;
        }

        public C7970h m13920j(CharSequence charSequence) {
            this.f25961c = C7965e.m13955h(charSequence);
            this.f25962d = true;
            return this;
        }
    }

    public static abstract class AbstractC7973j {
        public C7965e f25959a;
        public CharSequence f25960b;
        public CharSequence f25961c;
        public boolean f25962d = false;

        public void mo13902a(Bundle bundle) {
            if (this.f25962d) {
                bundle.putCharSequence("android.summaryText", this.f25961c);
            }
            CharSequence charSequence = this.f25960b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = mo13900c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        public abstract void mo13901b(AbstractC7955g gVar);

        public abstract String mo13900c();

        public RemoteViews m13899d(AbstractC7955g gVar) {
            return null;
        }

        public RemoteViews m13898e(AbstractC7955g gVar) {
            return null;
        }

        public RemoteViews m13897f(AbstractC7955g gVar) {
            return null;
        }

        public void m13896g(C7965e eVar) {
            if (this.f25959a != eVar) {
                this.f25959a = eVar;
                if (eVar != null) {
                    eVar.m13968I(this);
                }
            }
        }
    }

    public static Bundle m14000a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C7975j.m13885c(notification);
        }
        return null;
    }

    public static class C7971i extends AbstractC7973j {
        public final List<C7972a> f25948e = new ArrayList();
        public final List<C7972a> f25949f = new ArrayList();
        public C7983l f25950g;
        public CharSequence f25951h;
        public Boolean f25952i;

        public static final class C7972a {
            public final CharSequence f25953a;
            public final long f25954b;
            public final C7983l f25955c;
            public Bundle f25956d = new Bundle();
            public String f25957e;
            public Uri f25958f;

            public C7972a(CharSequence charSequence, long j, C7983l lVar) {
                this.f25953a = charSequence;
                this.f25954b = j;
                this.f25955c = lVar;
            }

            public static Bundle[] m13911a(List<C7972a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m13903i();
                }
                return bundleArr;
            }

            public String m13910b() {
                return this.f25957e;
            }

            public Uri m13909c() {
                return this.f25958f;
            }

            public C7983l m13908d() {
                return this.f25955c;
            }

            public CharSequence m13907e() {
                return this.f25953a;
            }

            public long m13906f() {
                return this.f25954b;
            }

            public C7972a m13905g(String str, Uri uri) {
                this.f25957e = str;
                this.f25958f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message m13904h() {
                Notification.MessagingStyle.Message message;
                C7983l d = m13908d();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence e = m13907e();
                    long f = m13906f();
                    if (d != null) {
                        person = d.m13854h();
                    }
                    message = new Notification.MessagingStyle.Message(e, f, person);
                } else {
                    CharSequence e2 = m13907e();
                    long f2 = m13906f();
                    if (d != null) {
                        charSequence = d.m13859c();
                    }
                    message = new Notification.MessagingStyle.Message(e2, f2, charSequence);
                }
                if (m13910b() != null) {
                    message.setData(m13910b(), m13909c());
                }
                return message;
            }

            public final Bundle m13903i() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f25953a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f25954b);
                C7983l lVar = this.f25955c;
                if (lVar != null) {
                    bundle.putCharSequence("sender", lVar.m13859c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f25955c.m13854h());
                    } else {
                        bundle.putBundle("person", this.f25955c.m13852j());
                    }
                }
                String str = this.f25957e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f25958f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f25956d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        @Deprecated
        public C7971i(CharSequence charSequence) {
            this.f25950g = new C7983l.C7984a().m13846e(charSequence).m13850a();
        }

        @Override
        public void mo13902a(Bundle bundle) {
            super.mo13902a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f25950g.m13859c());
            bundle.putBundle("android.messagingStyleUser", this.f25950g.m13852j());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f25951h);
            if (this.f25951h != null && this.f25952i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f25951h);
            }
            if (!this.f25948e.isEmpty()) {
                bundle.putParcelableArray("android.messages", C7972a.m13911a(this.f25948e));
            }
            if (!this.f25949f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", C7972a.m13911a(this.f25949f));
            }
            Boolean bool = this.f25952i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override
        public void mo13901b(AbstractC7955g gVar) {
            CharSequence charSequence;
            Notification.MessagingStyle messagingStyle;
            m13912o(m13916k());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.f25950g.m13854h());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.f25950g.m13859c());
                }
                for (C7972a aVar : this.f25948e) {
                    messagingStyle.addMessage(aVar.m13904h());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (C7972a aVar2 : this.f25949f) {
                        messagingStyle.addHistoricMessage(aVar2.m13904h());
                    }
                }
                if (this.f25952i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.f25951h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f25952i.booleanValue());
                }
                messagingStyle.setBuilder(gVar.mo13895a());
                return;
            }
            C7972a i2 = m13918i();
            if (this.f25951h != null && this.f25952i.booleanValue()) {
                gVar.mo13895a().setContentTitle(this.f25951h);
            } else if (i2 != null) {
                gVar.mo13895a().setContentTitle("");
                if (i2.m13908d() != null) {
                    gVar.mo13895a().setContentTitle(i2.m13908d().m13859c());
                }
            }
            if (i2 != null) {
                Notification.Builder a = gVar.mo13895a();
                if (this.f25951h != null) {
                    charSequence = m13914m(i2);
                } else {
                    charSequence = i2.m13907e();
                }
                a.setContentText(charSequence);
            }
            if (i >= 16) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z = this.f25951h != null || m13917j();
                for (int size = this.f25948e.size() - 1; size >= 0; size--) {
                    C7972a aVar3 = this.f25948e.get(size);
                    CharSequence m = z ? m13914m(aVar3) : aVar3.m13907e();
                    if (size != this.f25948e.size() - 1) {
                        spannableStringBuilder.insert(0, (CharSequence) "\n");
                    }
                    spannableStringBuilder.insert(0, m);
                }
                new Notification.BigTextStyle(gVar.mo13895a()).setBigContentTitle(null).bigText(spannableStringBuilder);
            }
        }

        @Override
        public String mo13900c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public C7971i m13919h(C7972a aVar) {
            if (aVar != null) {
                this.f25948e.add(aVar);
                if (this.f25948e.size() > 25) {
                    this.f25948e.remove(0);
                }
            }
            return this;
        }

        public final C7972a m13918i() {
            List<C7972a> list;
            for (int size = this.f25948e.size() - 1; size >= 0; size--) {
                C7972a aVar = this.f25948e.get(size);
                if (!(aVar.m13908d() == null || TextUtils.isEmpty(aVar.m13908d().m13859c()))) {
                    return aVar;
                }
            }
            if (this.f25948e.isEmpty()) {
                return null;
            }
            return this.f25948e.get(list.size() - 1);
        }

        public final boolean m13917j() {
            for (int size = this.f25948e.size() - 1; size >= 0; size--) {
                C7972a aVar = this.f25948e.get(size);
                if (aVar.m13908d() != null && aVar.m13908d().m13859c() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean m13916k() {
            C7965e eVar = this.f25959a;
            if (eVar != null && eVar.f25906a.getApplicationInfo().targetSdkVersion < 28 && this.f25952i == null) {
                return this.f25951h != null;
            }
            Boolean bool = this.f25952i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final TextAppearanceSpan m13915l(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        public final CharSequence m13914m(C7972a aVar) {
            C0020a c = C0020a.m42594c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int i = z ? -16777216 : -1;
            CharSequence charSequence = "";
            CharSequence c2 = aVar.m13908d() == null ? charSequence : aVar.m13908d().m13859c();
            if (TextUtils.isEmpty(c2)) {
                c2 = this.f25950g.m13859c();
                if (z && this.f25959a.m13957f() != 0) {
                    i = this.f25959a.m13957f();
                }
            }
            CharSequence h = c.m42589h(c2);
            spannableStringBuilder.append(h);
            spannableStringBuilder.setSpan(m13915l(i), spannableStringBuilder.length() - h.length(), spannableStringBuilder.length(), 33);
            if (aVar.m13907e() != null) {
                charSequence = aVar.m13907e();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(c.m42589h(charSequence));
            return spannableStringBuilder;
        }

        public C7971i m13913n(CharSequence charSequence) {
            this.f25951h = charSequence;
            return this;
        }

        public C7971i m13912o(boolean z) {
            this.f25952i = Boolean.valueOf(z);
            return this;
        }

        public C7971i(C7983l lVar) {
            if (!TextUtils.isEmpty(lVar.m13859c())) {
                this.f25950g = lVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    public static class C7965e {
        public boolean f25883A;
        public boolean f25884B;
        public String f25885C;
        public Bundle f25886D;
        public int f25887E;
        public int f25888F;
        public Notification f25889G;
        public RemoteViews f25890H;
        public RemoteViews f25891I;
        public RemoteViews f25892J;
        public String f25893K;
        public int f25894L;
        public String f25895M;
        public C8125b f25896N;
        public long f25897O;
        public int f25898P;
        public int f25899Q;
        public boolean f25900R;
        public C7964d f25901S;
        public Notification f25902T;
        public boolean f25903U;
        public Icon f25904V;
        @Deprecated
        public ArrayList<String> f25905W;
        public Context f25906a;
        public ArrayList<C7957a> f25907b;
        public ArrayList<C7983l> f25908c;
        public ArrayList<C7957a> f25909d;
        public CharSequence f25910e;
        public CharSequence f25911f;
        public PendingIntent f25912g;
        public PendingIntent f25913h;
        public RemoteViews f25914i;
        public Bitmap f25915j;
        public CharSequence f25916k;
        public int f25917l;
        public int f25918m;
        public boolean f25919n;
        public boolean f25920o;
        public AbstractC7973j f25921p;
        public CharSequence f25922q;
        public CharSequence f25923r;
        public CharSequence[] f25924s;
        public int f25925t;
        public int f25926u;
        public boolean f25927v;
        public String f25928w;
        public boolean f25929x;
        public String f25930y;
        public boolean f25931z;

        public C7965e(Context context, String str) {
            this.f25907b = new ArrayList<>();
            this.f25908c = new ArrayList<>();
            this.f25909d = new ArrayList<>();
            this.f25919n = true;
            this.f25931z = false;
            this.f25887E = 0;
            this.f25888F = 0;
            this.f25894L = 0;
            this.f25898P = 0;
            this.f25899Q = 0;
            Notification notification = new Notification();
            this.f25902T = notification;
            this.f25906a = context;
            this.f25893K = str;
            notification.when = System.currentTimeMillis();
            this.f25902T.audioStreamType = -1;
            this.f25918m = 0;
            this.f25905W = new ArrayList<>();
            this.f25900R = true;
        }

        public static CharSequence m13955h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public C7965e m13976A(int i) {
            this.f25917l = i;
            return this;
        }

        public C7965e m13975B(boolean z) {
            m13943t(8, z);
            return this;
        }

        public C7965e m13974C(int i) {
            this.f25918m = i;
            return this;
        }

        public C7965e m13973D(C8339b bVar) {
            if (bVar == null) {
                return this;
            }
            this.f25895M = bVar.m12775b();
            if (this.f25896N == null) {
                if (bVar.m12774c() != null) {
                    this.f25896N = bVar.m12774c();
                } else if (bVar.m12775b() != null) {
                    this.f25896N = new C8125b(bVar.m12775b());
                }
            }
            if (this.f25910e == null) {
                m13946q(bVar.m12772e());
            }
            return this;
        }

        public C7965e m13972E(boolean z) {
            this.f25919n = z;
            return this;
        }

        public C7965e m13971F(int i) {
            this.f25902T.icon = i;
            return this;
        }

        public C7965e m13970G(String str) {
            this.f25930y = str;
            return this;
        }

        public C7965e m13969H(Uri uri) {
            Notification notification = this.f25902T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public C7965e m13968I(AbstractC7973j jVar) {
            if (this.f25921p != jVar) {
                this.f25921p = jVar;
                if (jVar != null) {
                    jVar.m13896g(this);
                }
            }
            return this;
        }

        public C7965e m13967J(CharSequence charSequence) {
            this.f25922q = m13955h(charSequence);
            return this;
        }

        public C7965e m13966K(CharSequence charSequence) {
            this.f25902T.tickerText = m13955h(charSequence);
            return this;
        }

        public C7965e m13965L(long[] jArr) {
            this.f25902T.vibrate = jArr;
            return this;
        }

        public C7965e m13964M(int i) {
            this.f25888F = i;
            return this;
        }

        public C7965e m13963N(long j) {
            this.f25902T.when = j;
            return this;
        }

        public C7965e m13962a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f25907b.add(new C7957a(i, charSequence, pendingIntent));
            return this;
        }

        public C7965e m13961b(C7957a aVar) {
            if (aVar != null) {
                this.f25907b.add(aVar);
            }
            return this;
        }

        @Deprecated
        public C7965e m13960c(String str) {
            if (str != null && !str.isEmpty()) {
                this.f25905W.add(str);
            }
            return this;
        }

        public Notification m13959d() {
            return new C7974i(this).m13893c();
        }

        public C7965e m13958e(AbstractC7969g gVar) {
            gVar.mo13923a(this);
            return this;
        }

        public int m13957f() {
            return this.f25887E;
        }

        public Bundle m13956g() {
            if (this.f25886D == null) {
                this.f25886D = new Bundle();
            }
            return this.f25886D;
        }

        public final Bitmap m13954i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f25906a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7523b.b_res_0x7f050056);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7523b.a_res_0x7f050055);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        public C7965e m13953j(boolean z) {
            this.f25900R = z;
            return this;
        }

        public C7965e m13952k(boolean z) {
            m13943t(16, z);
            return this;
        }

        public C7965e m13951l(String str) {
            this.f25885C = str;
            return this;
        }

        public C7965e m13950m(String str) {
            this.f25893K = str;
            return this;
        }

        public C7965e m13949n(int i) {
            this.f25887E = i;
            return this;
        }

        public C7965e m13948o(PendingIntent pendingIntent) {
            this.f25912g = pendingIntent;
            return this;
        }

        public C7965e m13947p(CharSequence charSequence) {
            this.f25911f = m13955h(charSequence);
            return this;
        }

        public C7965e m13946q(CharSequence charSequence) {
            this.f25910e = m13955h(charSequence);
            return this;
        }

        public C7965e m13945r(int i) {
            Notification notification = this.f25902T;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public C7965e m13944s(PendingIntent pendingIntent) {
            this.f25902T.deleteIntent = pendingIntent;
            return this;
        }

        public final void m13943t(int i, boolean z) {
            if (z) {
                Notification notification = this.f25902T;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f25902T;
            notification2.flags = (~i) & notification2.flags;
        }

        public C7965e m13942u(String str) {
            this.f25928w = str;
            return this;
        }

        public C7965e m13941v(int i) {
            this.f25898P = i;
            return this;
        }

        public C7965e m13940w(boolean z) {
            this.f25929x = z;
            return this;
        }

        public C7965e m13939x(Bitmap bitmap) {
            this.f25915j = m13954i(bitmap);
            return this;
        }

        public C7965e m13938y(int i, int i2, int i3) {
            Notification notification = this.f25902T;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public C7965e m13937z(boolean z) {
            this.f25931z = z;
            return this;
        }

        @Deprecated
        public C7965e(Context context) {
            this(context, null);
        }
    }
}
