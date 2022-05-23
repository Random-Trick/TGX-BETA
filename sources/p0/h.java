package p0;

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
import p0.l;

public class h {

    public static class a {
        public final Bundle f20258a;
        public IconCompat f20259b;
        public final m[] f20260c;
        public final m[] f20261d;
        public boolean f20262e;
        public boolean f20263f;
        public final int f20264g;
        public final boolean f20265h;
        @Deprecated
        public int f20266i;
        public CharSequence f20267j;
        public PendingIntent f20268k;

        public static final class C0177a {
            public final IconCompat f20269a;
            public final CharSequence f20270b;
            public final PendingIntent f20271c;
            public boolean f20272d;
            public final Bundle f20273e;
            public ArrayList<m> f20274f;
            public int f20275g;
            public boolean f20276h;
            public boolean f20277i;

            public C0177a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            public C0177a a(m mVar) {
                if (this.f20274f == null) {
                    this.f20274f = new ArrayList<>();
                }
                if (mVar != null) {
                    this.f20274f.add(mVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<m> arrayList3 = this.f20274f;
                if (arrayList3 != null) {
                    Iterator<m> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        m next = it.next();
                        if (next.j()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                m[] mVarArr = null;
                m[] mVarArr2 = arrayList.isEmpty() ? null : (m[]) arrayList.toArray(new m[arrayList.size()]);
                if (!arrayList2.isEmpty()) {
                    mVarArr = (m[]) arrayList2.toArray(new m[arrayList2.size()]);
                }
                return new a(this.f20269a, this.f20270b, this.f20271c, this.f20273e, mVarArr, mVarArr2, this.f20272d, this.f20275g, this.f20276h, this.f20277i);
            }

            public final void c() {
                if (this.f20277i) {
                    Objects.requireNonNull(this.f20271c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0177a d(boolean z10) {
                this.f20272d = z10;
                return this;
            }

            public C0177a e(int i10) {
                this.f20275g = i10;
                return this;
            }

            public C0177a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m[] mVarArr, boolean z10, int i10, boolean z11, boolean z12) {
                this.f20272d = true;
                this.f20276h = true;
                this.f20269a = iconCompat;
                this.f20270b = e.h(charSequence);
                this.f20271c = pendingIntent;
                this.f20273e = bundle;
                this.f20274f = mVarArr == null ? null : new ArrayList<>(Arrays.asList(mVarArr));
                this.f20272d = z10;
                this.f20275g = i10;
                this.f20276h = z11;
                this.f20277i = z12;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f20268k;
        }

        public boolean b() {
            return this.f20262e;
        }

        public Bundle c() {
            return this.f20258a;
        }

        public IconCompat d() {
            int i10;
            if (this.f20259b == null && (i10 = this.f20266i) != 0) {
                this.f20259b = IconCompat.d(null, "", i10);
            }
            return this.f20259b;
        }

        public m[] e() {
            return this.f20260c;
        }

        public int f() {
            return this.f20264g;
        }

        public boolean g() {
            return this.f20263f;
        }

        public CharSequence h() {
            return this.f20267j;
        }

        public boolean i() {
            return this.f20265h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m[] mVarArr, m[] mVarArr2, boolean z10, int i10, boolean z11, boolean z12) {
            this.f20263f = true;
            this.f20259b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.f20266i = iconCompat.f();
            }
            this.f20267j = e.h(charSequence);
            this.f20268k = pendingIntent;
            this.f20258a = bundle == null ? new Bundle() : bundle;
            this.f20260c = mVarArr;
            this.f20261d = mVarArr2;
            this.f20262e = z10;
            this.f20264g = i10;
            this.f20263f = z11;
            this.f20265h = z12;
        }
    }

    public static class b extends j {
        public Bitmap f20278e;
        public IconCompat f20279f;
        public boolean f20280g;
        public boolean f20281h;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        public static class C0178b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class c {
            public static void a(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override
        public void b(p0.g gVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(gVar.a()).setBigContentTitle(this.f20337b).bigPicture(this.f20278e);
            if (this.f20280g) {
                IconCompat iconCompat = this.f20279f;
                Context context = null;
                if (iconCompat == null) {
                    a.a(bigPicture, null);
                } else if (i10 >= 23) {
                    if (gVar instanceof p0.i) {
                        context = ((p0.i) gVar).f();
                    }
                    C0178b.a(bigPicture, this.f20279f.s(context));
                } else if (iconCompat.j() == 1) {
                    a.a(bigPicture, this.f20279f.e());
                } else {
                    a.a(bigPicture, null);
                }
            }
            if (this.f20339d) {
                a.b(bigPicture, this.f20338c);
            }
            if (i10 >= 31) {
                c.a(bigPicture, this.f20281h);
            }
        }

        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f20279f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f20280g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f20278e = bitmap;
            return this;
        }
    }

    public static class c extends j {
        public CharSequence f20282e;

        @Override
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override
        public void b(p0.g gVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.a()).setBigContentTitle(this.f20337b).bigText(this.f20282e);
            if (this.f20339d) {
                bigText.setSummaryText(this.f20338c);
            }
        }

        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f20282e = e.h(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static final class f implements g {
        public Bitmap f20309a;
        public a f20310b;
        public int f20311c = 0;

        @Deprecated
        public static class a {
            public final String[] f20312a;
            public final m f20313b;
            public final PendingIntent f20314c;
            public final PendingIntent f20315d;
            public final String[] f20316e;
            public final long f20317f;

            public static class C0179a {
                public final List<String> f20318a = new ArrayList();
                public final String f20319b;
                public m f20320c;
                public PendingIntent f20321d;
                public PendingIntent f20322e;
                public long f20323f;

                public C0179a(String str) {
                    this.f20319b = str;
                }

                public C0179a a(String str) {
                    if (str != null) {
                        this.f20318a.add(str);
                    }
                    return this;
                }

                public a b() {
                    List<String> list = this.f20318a;
                    return new a((String[]) list.toArray(new String[list.size()]), this.f20320c, this.f20322e, this.f20321d, new String[]{this.f20319b}, this.f20323f);
                }

                public C0179a c(long j10) {
                    this.f20323f = j10;
                    return this;
                }

                public C0179a d(PendingIntent pendingIntent) {
                    this.f20321d = pendingIntent;
                    return this;
                }

                public C0179a e(PendingIntent pendingIntent, m mVar) {
                    this.f20320c = mVar;
                    this.f20322e = pendingIntent;
                    return this;
                }
            }

            public a(String[] strArr, m mVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j10) {
                this.f20312a = strArr;
                this.f20313b = mVar;
                this.f20315d = pendingIntent2;
                this.f20314c = pendingIntent;
                this.f20316e = strArr2;
                this.f20317f = j10;
            }

            public long a() {
                return this.f20317f;
            }

            public String[] b() {
                return this.f20312a;
            }

            public String[] c() {
                return this.f20316e;
            }

            public PendingIntent d() {
                return this.f20315d;
            }

            public m e() {
                return this.f20313b;
            }

            public PendingIntent f() {
                return this.f20314c;
            }
        }

        public static Bundle b(a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.c() == null || aVar.c().length <= 1) ? null : aVar.c()[0];
            int length = aVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i10 = 0; i10 < length; i10++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.b()[i10]);
                bundle2.putString("author", str);
                parcelableArr[i10] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            m e10 = aVar.e();
            if (e10 != null) {
                bundle.putParcelable("remote_input", new RemoteInput.Builder(e10.i()).setLabel(e10.h()).setChoices(e10.e()).setAllowFreeFormInput(e10.c()).addExtras(e10.g()).build());
            }
            bundle.putParcelable("on_reply", aVar.f());
            bundle.putParcelable("on_read", aVar.d());
            bundle.putStringArray("participants", aVar.c());
            bundle.putLong("timestamp", aVar.a());
            return bundle;
        }

        @Override
        public e a(e eVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f20309a;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i10 = this.f20311c;
            if (i10 != 0) {
                bundle.putInt("app_color", i10);
            }
            a aVar = this.f20310b;
            if (aVar != null) {
                bundle.putBundle("car_conversation", b(aVar));
            }
            eVar.g().putBundle("android.car.EXTENSIONS", bundle);
            return eVar;
        }

        @Deprecated
        public f c(a aVar) {
            this.f20310b = aVar;
            return this;
        }
    }

    public interface g {
        e a(e eVar);
    }

    public static class C0180h extends j {
        public ArrayList<CharSequence> f20324e = new ArrayList<>();

        @Override
        public void b(p0.g gVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(gVar.a()).setBigContentTitle(this.f20337b);
            if (this.f20339d) {
                bigContentTitle.setSummaryText(this.f20338c);
            }
            Iterator<CharSequence> it = this.f20324e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public C0180h h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f20324e.add(e.h(charSequence));
            }
            return this;
        }

        public C0180h i(CharSequence charSequence) {
            this.f20337b = e.h(charSequence);
            return this;
        }

        public C0180h j(CharSequence charSequence) {
            this.f20338c = e.h(charSequence);
            this.f20339d = true;
            return this;
        }
    }

    public static abstract class j {
        public e f20336a;
        public CharSequence f20337b;
        public CharSequence f20338c;
        public boolean f20339d = false;

        public void a(Bundle bundle) {
            if (this.f20339d) {
                bundle.putCharSequence("android.summaryText", this.f20338c);
            }
            CharSequence charSequence = this.f20337b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(p0.g gVar);

        public abstract String c();

        public RemoteViews d(p0.g gVar) {
            return null;
        }

        public RemoteViews e(p0.g gVar) {
            return null;
        }

        public RemoteViews f(p0.g gVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f20336a != eVar) {
                this.f20336a = eVar;
                if (eVar != null) {
                    eVar.I(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class i extends j {
        public final List<a> f20325e = new ArrayList();
        public final List<a> f20326f = new ArrayList();
        public l f20327g;
        public CharSequence f20328h;
        public Boolean f20329i;

        public static final class a {
            public final CharSequence f20330a;
            public final long f20331b;
            public final l f20332c;
            public Bundle f20333d = new Bundle();
            public String f20334e;
            public Uri f20335f;

            public a(CharSequence charSequence, long j10, l lVar) {
                this.f20330a = charSequence;
                this.f20331b = j10;
                this.f20332c = lVar;
            }

            public static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).i();
                }
                return bundleArr;
            }

            public String b() {
                return this.f20334e;
            }

            public Uri c() {
                return this.f20335f;
            }

            public l d() {
                return this.f20332c;
            }

            public CharSequence e() {
                return this.f20330a;
            }

            public long f() {
                return this.f20331b;
            }

            public a g(String str, Uri uri) {
                this.f20334e = str;
                this.f20335f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message h() {
                Notification.MessagingStyle.Message message;
                l d10 = d();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence e10 = e();
                    long f10 = f();
                    if (d10 != null) {
                        person = d10.h();
                    }
                    message = new Notification.MessagingStyle.Message(e10, f10, person);
                } else {
                    CharSequence e11 = e();
                    long f11 = f();
                    if (d10 != null) {
                        charSequence = d10.c();
                    }
                    message = new Notification.MessagingStyle.Message(e11, f11, charSequence);
                }
                if (b() != null) {
                    message.setData(b(), c());
                }
                return message;
            }

            public final Bundle i() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f20330a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f20331b);
                l lVar = this.f20332c;
                if (lVar != null) {
                    bundle.putCharSequence("sender", lVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f20332c.h());
                    } else {
                        bundle.putBundle("person", this.f20332c.j());
                    }
                }
                String str = this.f20334e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f20335f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f20333d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        @Deprecated
        public i(CharSequence charSequence) {
            this.f20327g = new l.a().e(charSequence).a();
        }

        @Override
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f20327g.c());
            bundle.putBundle("android.messagingStyleUser", this.f20327g.j());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f20328h);
            if (this.f20328h != null && this.f20329i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f20328h);
            }
            if (!this.f20325e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.f20325e));
            }
            if (!this.f20326f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.a(this.f20326f));
            }
            Boolean bool = this.f20329i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override
        public void b(p0.g gVar) {
            CharSequence charSequence;
            Notification.MessagingStyle messagingStyle;
            o(k());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                if (i10 >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.f20327g.h());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.f20327g.c());
                }
                for (a aVar : this.f20325e) {
                    messagingStyle.addMessage(aVar.h());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (a aVar2 : this.f20326f) {
                        messagingStyle.addHistoricMessage(aVar2.h());
                    }
                }
                if (this.f20329i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.f20328h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f20329i.booleanValue());
                }
                messagingStyle.setBuilder(gVar.a());
                return;
            }
            a i11 = i();
            if (this.f20328h != null && this.f20329i.booleanValue()) {
                gVar.a().setContentTitle(this.f20328h);
            } else if (i11 != null) {
                gVar.a().setContentTitle("");
                if (i11.d() != null) {
                    gVar.a().setContentTitle(i11.d().c());
                }
            }
            if (i11 != null) {
                Notification.Builder a10 = gVar.a();
                if (this.f20328h != null) {
                    charSequence = m(i11);
                } else {
                    charSequence = i11.e();
                }
                a10.setContentText(charSequence);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z10 = this.f20328h != null || j();
            for (int size = this.f20325e.size() - 1; size >= 0; size--) {
                a aVar3 = this.f20325e.get(size);
                CharSequence m10 = z10 ? m(aVar3) : aVar3.e();
                if (size != this.f20325e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, m10);
            }
            new Notification.BigTextStyle(gVar.a()).setBigContentTitle(null).bigText(spannableStringBuilder);
        }

        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public i h(a aVar) {
            if (aVar != null) {
                this.f20325e.add(aVar);
                if (this.f20325e.size() > 25) {
                    this.f20325e.remove(0);
                }
            }
            return this;
        }

        public final a i() {
            List<a> list;
            for (int size = this.f20325e.size() - 1; size >= 0; size--) {
                a aVar = this.f20325e.get(size);
                if (!(aVar.d() == null || TextUtils.isEmpty(aVar.d().c()))) {
                    return aVar;
                }
            }
            if (this.f20325e.isEmpty()) {
                return null;
            }
            return this.f20325e.get(list.size() - 1);
        }

        public final boolean j() {
            for (int size = this.f20325e.size() - 1; size >= 0; size--) {
                a aVar = this.f20325e.get(size);
                if (aVar.d() != null && aVar.d().c() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean k() {
            e eVar = this.f20336a;
            if (eVar != null && eVar.f20283a.getApplicationInfo().targetSdkVersion < 28 && this.f20329i == null) {
                return this.f20328h != null;
            }
            Boolean bool = this.f20329i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final TextAppearanceSpan l(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        public final CharSequence m(a aVar) {
            a1.a c10 = a1.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i10 = -16777216;
            CharSequence charSequence = "";
            CharSequence c11 = aVar.d() == null ? charSequence : aVar.d().c();
            if (TextUtils.isEmpty(c11)) {
                c11 = this.f20327g.c();
                if (this.f20336a.f() != 0) {
                    i10 = this.f20336a.f();
                }
            }
            CharSequence h10 = c10.h(c11);
            spannableStringBuilder.append(h10);
            spannableStringBuilder.setSpan(l(i10), spannableStringBuilder.length() - h10.length(), spannableStringBuilder.length(), 33);
            if (aVar.e() != null) {
                charSequence = aVar.e();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(c10.h(charSequence));
            return spannableStringBuilder;
        }

        public i n(CharSequence charSequence) {
            this.f20328h = charSequence;
            return this;
        }

        public i o(boolean z10) {
            this.f20329i = Boolean.valueOf(z10);
            return this;
        }

        public i(l lVar) {
            if (!TextUtils.isEmpty(lVar.c())) {
                this.f20327g = lVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    public static class e {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public q0.b N;
        public long O;
        public int P;
        public int Q;
        public boolean R;
        public Notification S;
        public boolean T;
        public Icon U;
        @Deprecated
        public ArrayList<String> V;
        public Context f20283a;
        public ArrayList<a> f20284b;
        public ArrayList<l> f20285c;
        public ArrayList<a> f20286d;
        public CharSequence f20287e;
        public CharSequence f20288f;
        public PendingIntent f20289g;
        public PendingIntent f20290h;
        public RemoteViews f20291i;
        public Bitmap f20292j;
        public CharSequence f20293k;
        public int f20294l;
        public int f20295m;
        public boolean f20296n;
        public boolean f20297o;
        public j f20298p;
        public CharSequence f20299q;
        public CharSequence f20300r;
        public CharSequence[] f20301s;
        public int f20302t;
        public int f20303u;
        public boolean f20304v;
        public String f20305w;
        public boolean f20306x;
        public String f20307y;
        public boolean f20308z;

        public e(Context context, String str) {
            this.f20284b = new ArrayList<>();
            this.f20285c = new ArrayList<>();
            this.f20286d = new ArrayList<>();
            this.f20296n = true;
            this.f20308z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f20283a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f20295m = 0;
            this.V = new ArrayList<>();
            this.R = true;
        }

        public static CharSequence h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i10) {
            this.f20294l = i10;
            return this;
        }

        public e B(boolean z10) {
            t(8, z10);
            return this;
        }

        public e C(int i10) {
            this.f20295m = i10;
            return this;
        }

        public e D(r0.b bVar) {
            if (bVar == null) {
                return this;
            }
            this.M = bVar.b();
            if (this.N == null) {
                if (bVar.c() != null) {
                    this.N = bVar.c();
                } else if (bVar.b() != null) {
                    this.N = new q0.b(bVar.b());
                }
            }
            if (this.f20287e == null) {
                q(bVar.e());
            }
            return this;
        }

        public e E(boolean z10) {
            this.f20296n = z10;
            return this;
        }

        public e F(int i10) {
            this.S.icon = i10;
            return this;
        }

        public e G(String str) {
            this.f20307y = str;
            return this;
        }

        public e H(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        public e I(j jVar) {
            if (this.f20298p != jVar) {
                this.f20298p = jVar;
                if (jVar != null) {
                    jVar.g(this);
                }
            }
            return this;
        }

        public e J(CharSequence charSequence) {
            this.f20299q = h(charSequence);
            return this;
        }

        public e K(CharSequence charSequence) {
            this.S.tickerText = h(charSequence);
            return this;
        }

        public e L(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        public e M(int i10) {
            this.F = i10;
            return this;
        }

        public e N(long j10) {
            this.S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f20284b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f20284b.add(aVar);
            }
            return this;
        }

        @Deprecated
        public e c(String str) {
            if (str != null && !str.isEmpty()) {
                this.V.add(str);
            }
            return this;
        }

        public Notification d() {
            return new p0.i(this).c();
        }

        public e e(g gVar) {
            gVar.a(this);
            return this;
        }

        public int f() {
            return this.E;
        }

        public Bundle g() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public final Bitmap i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f20283a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(o0.b.b_res_0x7f050056);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(o0.b.a_res_0x7f050055);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        public e j(boolean z10) {
            this.R = z10;
            return this;
        }

        public e k(boolean z10) {
            t(16, z10);
            return this;
        }

        public e l(String str) {
            this.C = str;
            return this;
        }

        public e m(String str) {
            this.K = str;
            return this;
        }

        public e n(int i10) {
            this.E = i10;
            return this;
        }

        public e o(PendingIntent pendingIntent) {
            this.f20289g = pendingIntent;
            return this;
        }

        public e p(CharSequence charSequence) {
            this.f20288f = h(charSequence);
            return this;
        }

        public e q(CharSequence charSequence) {
            this.f20287e = h(charSequence);
            return this;
        }

        public e r(int i10) {
            Notification notification = this.S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e s(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public final void t(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.S;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.S;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e u(String str) {
            this.f20305w = str;
            return this;
        }

        public e v(int i10) {
            this.P = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f20306x = z10;
            return this;
        }

        public e x(Bitmap bitmap) {
            this.f20292j = i(bitmap);
            return this;
        }

        public e y(int i10, int i11, int i12) {
            Notification notification = this.S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e z(boolean z10) {
            this.f20308z = z10;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
