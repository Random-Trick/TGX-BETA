package p213p0;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;

public class C7983l {
    public CharSequence f26006a;
    public IconCompat f26007b;
    public String f26008c;
    public String f26009d;
    public boolean f26010e;
    public boolean f26011f;

    public static class C7984a {
        public CharSequence f26012a;
        public IconCompat f26013b;
        public String f26014c;
        public String f26015d;
        public boolean f26016e;
        public boolean f26017f;

        public C7984a() {
        }

        public C7983l m13849a() {
            return new C7983l(this);
        }

        public C7984a m13848b(boolean z) {
            this.f26016e = z;
            return this;
        }

        public C7984a m13847c(IconCompat iconCompat) {
            this.f26013b = iconCompat;
            return this;
        }

        public C7984a m13846d(String str) {
            this.f26015d = str;
            return this;
        }

        public C7984a m13845e(CharSequence charSequence) {
            this.f26012a = charSequence;
            return this;
        }

        public C7984a(C7983l lVar) {
            this.f26012a = lVar.f26006a;
            this.f26013b = lVar.f26007b;
            this.f26014c = lVar.f26008c;
            this.f26015d = lVar.f26009d;
            this.f26016e = lVar.f26010e;
            this.f26017f = lVar.f26011f;
        }
    }

    public C7983l(C7984a aVar) {
        this.f26006a = aVar.f26012a;
        this.f26007b = aVar.f26013b;
        this.f26008c = aVar.f26014c;
        this.f26009d = aVar.f26015d;
        this.f26010e = aVar.f26016e;
        this.f26011f = aVar.f26017f;
    }

    public IconCompat m13860a() {
        return this.f26007b;
    }

    public String m13859b() {
        return this.f26009d;
    }

    public CharSequence m13858c() {
        return this.f26006a;
    }

    public String m13857d() {
        return this.f26008c;
    }

    public boolean m13856e() {
        return this.f26010e;
    }

    public boolean m13855f() {
        return this.f26011f;
    }

    public String m13854g() {
        String str = this.f26008c;
        if (str != null) {
            return str;
        }
        if (this.f26006a == null) {
            return "";
        }
        return "name:" + ((Object) this.f26006a);
    }

    public Person m13853h() {
        return new Person.Builder().setName(m13858c()).setIcon(m13860a() != null ? m13860a().m40309r() : null).setUri(m13857d()).setKey(m13859b()).setBot(m13856e()).setImportant(m13855f()).build();
    }

    public C7984a m13852i() {
        return new C7984a(this);
    }

    public Bundle m13851j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f26006a);
        IconCompat iconCompat = this.f26007b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m40310q() : null);
        bundle.putString("uri", this.f26008c);
        bundle.putString("key", this.f26009d);
        bundle.putBoolean("isBot", this.f26010e);
        bundle.putBoolean("isImportant", this.f26011f);
        return bundle;
    }

    public PersistableBundle m13850k() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f26006a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f26008c);
        persistableBundle.putString("key", this.f26009d);
        persistableBundle.putBoolean("isBot", this.f26010e);
        persistableBundle.putBoolean("isImportant", this.f26011f);
        return persistableBundle;
    }
}
