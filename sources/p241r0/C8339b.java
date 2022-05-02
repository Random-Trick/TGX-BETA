package p241r0;

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
import p213p0.C7983l;
import p227q0.C8125b;
import p322x0.C10064b;

public class C8339b {
    public Context f27000a;
    public String f27001b;
    public Intent[] f27002c;
    public ComponentName f27003d;
    public CharSequence f27004e;
    public CharSequence f27005f;
    public CharSequence f27006g;
    public IconCompat f27007h;
    public C7983l[] f27008i;
    public Set<String> f27009j;
    public C8125b f27010k;
    public boolean f27011l;
    public int f27012m;
    public PersistableBundle f27013n;
    public boolean f27014o = true;

    public static class C8340a {
        public final C8339b f27015a;
        public boolean f27016b;
        public Set<String> f27017c;
        public Map<String, Map<String, List<String>>> f27018d;
        public Uri f27019e;

        public C8340a(Context context, String str) {
            C8339b bVar = new C8339b();
            this.f27015a = bVar;
            bVar.f27000a = context;
            bVar.f27001b = str;
        }

        public C8339b m12770a() {
            if (!TextUtils.isEmpty(this.f27015a.f27004e)) {
                C8339b bVar = this.f27015a;
                Intent[] intentArr = bVar.f27002c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f27016b) {
                    if (bVar.f27010k == null) {
                        bVar.f27010k = new C8125b(bVar.f27001b);
                    }
                    this.f27015a.f27011l = true;
                }
                if (this.f27017c != null) {
                    C8339b bVar2 = this.f27015a;
                    if (bVar2.f27009j == null) {
                        bVar2.f27009j = new HashSet();
                    }
                    this.f27015a.f27009j.addAll(this.f27017c);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    if (this.f27018d != null) {
                        C8339b bVar3 = this.f27015a;
                        if (bVar3.f27013n == null) {
                            bVar3.f27013n = new PersistableBundle();
                        }
                        for (String str : this.f27018d.keySet()) {
                            Map<String, List<String>> map = this.f27018d.get(str);
                            this.f27015a.f27013n.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                            for (String str2 : map.keySet()) {
                                List<String> list = map.get(str2);
                                PersistableBundle persistableBundle = this.f27015a.f27013n;
                                persistableBundle.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                            }
                        }
                    }
                    if (this.f27019e != null) {
                        C8339b bVar4 = this.f27015a;
                        if (bVar4.f27013n == null) {
                            bVar4.f27013n = new PersistableBundle();
                        }
                        this.f27015a.f27013n.putString("extraSliceUri", C10064b.m6086a(this.f27019e));
                    }
                }
                return this.f27015a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public C8340a m12769b(IconCompat iconCompat) {
            this.f27015a.f27007h = iconCompat;
            return this;
        }

        public C8340a m12768c(Intent intent) {
            return m12767d(new Intent[]{intent});
        }

        public C8340a m12767d(Intent[] intentArr) {
            this.f27015a.f27002c = intentArr;
            return this;
        }

        public C8340a m12766e() {
            this.f27016b = true;
            return this;
        }

        public C8340a m12765f(boolean z) {
            this.f27015a.f27011l = z;
            return this;
        }

        public C8340a m12764g(C7983l lVar) {
            return m12763h(new C7983l[]{lVar});
        }

        public C8340a m12763h(C7983l[] lVarArr) {
            this.f27015a.f27008i = lVarArr;
            return this;
        }

        public C8340a m12762i(CharSequence charSequence) {
            this.f27015a.f27004e = charSequence;
            return this;
        }
    }

    public final PersistableBundle m12776a() {
        if (this.f27013n == null) {
            this.f27013n = new PersistableBundle();
        }
        C7983l[] lVarArr = this.f27008i;
        if (lVarArr != null && lVarArr.length > 0) {
            this.f27013n.putInt("extraPersonCount", lVarArr.length);
            int i = 0;
            while (i < this.f27008i.length) {
                PersistableBundle persistableBundle = this.f27013n;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i2 = i + 1;
                sb2.append(i2);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f27008i[i].m13851k());
                i = i2;
            }
        }
        C8125b bVar = this.f27010k;
        if (bVar != null) {
            this.f27013n.putString("extraLocusId", bVar.m13414a());
        }
        this.f27013n.putBoolean("extraLongLived", this.f27011l);
        return this.f27013n;
    }

    public String m12775b() {
        return this.f27001b;
    }

    public C8125b m12774c() {
        return this.f27010k;
    }

    public int m12773d() {
        return this.f27012m;
    }

    public CharSequence m12772e() {
        return this.f27004e;
    }

    public ShortcutInfo m12771f() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f27000a, this.f27001b).setShortLabel(this.f27004e).setIntents(this.f27002c);
        IconCompat iconCompat = this.f27007h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m40305s(this.f27000a));
        }
        if (!TextUtils.isEmpty(this.f27005f)) {
            intents.setLongLabel(this.f27005f);
        }
        if (!TextUtils.isEmpty(this.f27006g)) {
            intents.setDisabledMessage(this.f27006g);
        }
        ComponentName componentName = this.f27003d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f27009j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f27012m);
        PersistableBundle persistableBundle = this.f27013n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C7983l[] lVarArr = this.f27008i;
            if (lVarArr != null && lVarArr.length > 0) {
                int length = lVarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f27008i[i].m13854h();
                }
                intents.setPersons(personArr);
            }
            C8125b bVar = this.f27010k;
            if (bVar != null) {
                intents.setLocusId(bVar.m13412c());
            }
            intents.setLongLived(this.f27011l);
        } else {
            intents.setExtras(m12776a());
        }
        return intents.build();
    }
}
