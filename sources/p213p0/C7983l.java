package p213p0;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;

public class C7983l {
    public CharSequence f26003a;
    public IconCompat f26004b;
    public String f26005c;
    public String f26006d;
    public boolean f26007e;
    public boolean f26008f;

    public static class C7984a {
        public CharSequence f26009a;
        public IconCompat f26010b;
        public String f26011c;
        public String f26012d;
        public boolean f26013e;
        public boolean f26014f;

        public C7984a() {
        }

        public C7983l m13850a() {
            return new C7983l(this);
        }

        public C7984a m13849b(boolean z) {
            this.f26013e = z;
            return this;
        }

        public C7984a m13848c(IconCompat iconCompat) {
            this.f26010b = iconCompat;
            return this;
        }

        public C7984a m13847d(String str) {
            this.f26012d = str;
            return this;
        }

        public C7984a m13846e(CharSequence charSequence) {
            this.f26009a = charSequence;
            return this;
        }

        public C7984a(C7983l lVar) {
            this.f26009a = lVar.f26003a;
            this.f26010b = lVar.f26004b;
            this.f26011c = lVar.f26005c;
            this.f26012d = lVar.f26006d;
            this.f26013e = lVar.f26007e;
            this.f26014f = lVar.f26008f;
        }
    }

    public C7983l(C7984a aVar) {
        this.f26003a = aVar.f26009a;
        this.f26004b = aVar.f26010b;
        this.f26005c = aVar.f26011c;
        this.f26006d = aVar.f26012d;
        this.f26007e = aVar.f26013e;
        this.f26008f = aVar.f26014f;
    }

    public IconCompat m13861a() {
        return this.f26004b;
    }

    public String m13860b() {
        return this.f26006d;
    }

    public CharSequence m13859c() {
        return this.f26003a;
    }

    public String m13858d() {
        return this.f26005c;
    }

    public boolean m13857e() {
        return this.f26007e;
    }

    public boolean m13856f() {
        return this.f26008f;
    }

    public String m13855g() {
        String str = this.f26005c;
        if (str != null) {
            return str;
        }
        if (this.f26003a == null) {
            return "";
        }
        return "name:" + ((Object) this.f26003a);
    }

    public Person m13854h() {
        return new Person.Builder().setName(m13859c()).setIcon(m13861a() != null ? m13861a().m40306r() : null).setUri(m13858d()).setKey(m13860b()).setBot(m13857e()).setImportant(m13856f()).build();
    }

    public C7984a m13853i() {
        return new C7984a(this);
    }

    public Bundle m13852j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f26003a);
        IconCompat iconCompat = this.f26004b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m40307q() : null);
        bundle.putString("uri", this.f26005c);
        bundle.putString("key", this.f26006d);
        bundle.putBoolean("isBot", this.f26007e);
        bundle.putBoolean("isImportant", this.f26008f);
        return bundle;
    }

    public PersistableBundle m13851k() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f26003a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f26005c);
        persistableBundle.putString("key", this.f26006d);
        persistableBundle.putBoolean("isBot", this.f26007e);
        persistableBundle.putBoolean("isImportant", this.f26008f);
        return persistableBundle;
    }
}
