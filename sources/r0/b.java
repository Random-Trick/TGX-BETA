package r0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p0.l;

public class b {
    public Context f21575a;
    public String f21576b;
    public Intent[] f21577c;
    public ComponentName f21578d;
    public CharSequence f21579e;
    public CharSequence f21580f;
    public CharSequence f21581g;
    public IconCompat f21582h;
    public l[] f21583i;
    public Set<String> f21584j;
    public q0.b f21585k;
    public boolean f21586l;
    public int f21587m;
    public PersistableBundle f21588n;
    public boolean f21589o = true;

    public static class a {
        public final b f21590a;
        public boolean f21591b;
        public Set<String> f21592c;
        public Map<String, Map<String, List<String>>> f21593d;
        public Uri f21594e;

        public a(Context context, String str) {
            b bVar = new b();
            this.f21590a = bVar;
            bVar.f21575a = context;
            bVar.f21576b = str;
        }

        public b a() {
            if (!TextUtils.isEmpty(this.f21590a.f21579e)) {
                b bVar = this.f21590a;
                Intent[] intentArr = bVar.f21577c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f21591b) {
                    if (bVar.f21585k == null) {
                        bVar.f21585k = new q0.b(bVar.f21576b);
                    }
                    this.f21590a.f21586l = true;
                }
                if (this.f21592c != null) {
                    b bVar2 = this.f21590a;
                    if (bVar2.f21584j == null) {
                        bVar2.f21584j = new HashSet();
                    }
                    this.f21590a.f21584j.addAll(this.f21592c);
                }
                if (this.f21593d != null) {
                    b bVar3 = this.f21590a;
                    if (bVar3.f21588n == null) {
                        bVar3.f21588n = new PersistableBundle();
                    }
                    for (String str : this.f21593d.keySet()) {
                        Map<String, List<String>> map = this.f21593d.get(str);
                        this.f21590a.f21588n.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                        for (String str2 : map.keySet()) {
                            List<String> list = map.get(str2);
                            PersistableBundle persistableBundle = this.f21590a.f21588n;
                            persistableBundle.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                        }
                    }
                }
                if (this.f21594e != null) {
                    b bVar4 = this.f21590a;
                    if (bVar4.f21588n == null) {
                        bVar4.f21588n = new PersistableBundle();
                    }
                    this.f21590a.f21588n.putString("extraSliceUri", x0.b.a(this.f21594e));
                }
                return this.f21590a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public a b(IconCompat iconCompat) {
            this.f21590a.f21582h = iconCompat;
            return this;
        }

        public a c(Intent intent) {
            return d(new Intent[]{intent});
        }

        public a d(Intent[] intentArr) {
            this.f21590a.f21577c = intentArr;
            return this;
        }

        public a e() {
            this.f21591b = true;
            return this;
        }

        public a f(boolean z10) {
            this.f21590a.f21586l = z10;
            return this;
        }

        public a g(l lVar) {
            return h(new l[]{lVar});
        }

        public a h(l[] lVarArr) {
            this.f21590a.f21583i = lVarArr;
            return this;
        }

        public a i(CharSequence charSequence) {
            this.f21590a.f21579e = charSequence;
            return this;
        }
    }

    public final PersistableBundle a() {
        if (this.f21588n == null) {
            this.f21588n = new PersistableBundle();
        }
        l[] lVarArr = this.f21583i;
        if (lVarArr != null && lVarArr.length > 0) {
            this.f21588n.putInt("extraPersonCount", lVarArr.length);
            int i10 = 0;
            while (i10 < this.f21583i.length) {
                PersistableBundle persistableBundle = this.f21588n;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f21583i[i10].k());
                i10 = i11;
            }
        }
        q0.b bVar = this.f21585k;
        if (bVar != null) {
            this.f21588n.putString("extraLocusId", bVar.a());
        }
        this.f21588n.putBoolean("extraLongLived", this.f21586l);
        return this.f21588n;
    }

    public String b() {
        return this.f21576b;
    }

    public q0.b c() {
        return this.f21585k;
    }

    public int d() {
        return this.f21587m;
    }

    public CharSequence e() {
        return this.f21579e;
    }

    public ShortcutInfo f() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f21575a, this.f21576b).setShortLabel(this.f21579e).setIntents(this.f21577c);
        IconCompat iconCompat = this.f21582h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.s(this.f21575a));
        }
        if (!TextUtils.isEmpty(this.f21580f)) {
            intents.setLongLabel(this.f21580f);
        }
        if (!TextUtils.isEmpty(this.f21581g)) {
            intents.setDisabledMessage(this.f21581g);
        }
        ComponentName componentName = this.f21578d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f21584j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f21587m);
        PersistableBundle persistableBundle = this.f21588n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            l[] lVarArr = this.f21583i;
            if (lVarArr != null && lVarArr.length > 0) {
                int length = lVarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f21583i[i10].h();
                }
                intents.setPersons(personArr);
            }
            q0.b bVar = this.f21585k;
            if (bVar != null) {
                intents.setLocusId(bVar.c());
            }
            intents.setLongLived(this.f21586l);
        } else {
            intents.setExtras(a());
        }
        return intents.build();
    }
}
