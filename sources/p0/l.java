package p0;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;

public class l {
    public CharSequence f20372a;
    public IconCompat f20373b;
    public String f20374c;
    public String f20375d;
    public boolean f20376e;
    public boolean f20377f;

    public static class a {
        public CharSequence f20378a;
        public IconCompat f20379b;
        public String f20380c;
        public String f20381d;
        public boolean f20382e;
        public boolean f20383f;

        public a() {
        }

        public a(l lVar) {
            this.f20378a = lVar.f20372a;
            this.f20379b = lVar.f20373b;
            this.f20380c = lVar.f20374c;
            this.f20381d = lVar.f20375d;
            this.f20382e = lVar.f20376e;
            this.f20383f = lVar.f20377f;
        }

        public l a() {
            return new l(this);
        }

        public a b(boolean z10) {
            this.f20382e = z10;
            return this;
        }

        public a c(IconCompat iconCompat) {
            this.f20379b = iconCompat;
            return this;
        }

        public a d(String str) {
            this.f20381d = str;
            return this;
        }

        public a e(CharSequence charSequence) {
            this.f20378a = charSequence;
            return this;
        }
    }

    public l(a aVar) {
        this.f20372a = aVar.f20378a;
        this.f20373b = aVar.f20379b;
        this.f20374c = aVar.f20380c;
        this.f20375d = aVar.f20381d;
        this.f20376e = aVar.f20382e;
        this.f20377f = aVar.f20383f;
    }

    public IconCompat a() {
        return this.f20373b;
    }

    public String b() {
        return this.f20375d;
    }

    public CharSequence c() {
        return this.f20372a;
    }

    public String d() {
        return this.f20374c;
    }

    public boolean e() {
        return this.f20376e;
    }

    public boolean f() {
        return this.f20377f;
    }

    public String g() {
        String str = this.f20374c;
        if (str != null) {
            return str;
        }
        if (this.f20372a == null) {
            return "";
        }
        return "name:" + ((Object) this.f20372a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().r() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }

    public a i() {
        return new a(this);
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f20372a);
        IconCompat iconCompat = this.f20373b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.q() : null);
        bundle.putString("uri", this.f20374c);
        bundle.putString("key", this.f20375d);
        bundle.putBoolean("isBot", this.f20376e);
        bundle.putBoolean("isImportant", this.f20377f);
        return bundle;
    }

    public PersistableBundle k() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f20372a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f20374c);
        persistableBundle.putString("key", this.f20375d);
        persistableBundle.putBoolean("isBot", this.f20376e);
        persistableBundle.putBoolean("isImportant", this.f20377f);
        return persistableBundle;
    }
}
