package p350yd;

import ge.C4868i;
import me.vkryl.leveldb.LevelDB;

public class C10562b9 {
    public int f33876a;
    public int f33877b;
    public int f33878c;
    public int f33879d;
    public int f33880e;
    public int f33881f;
    public int f33882g;

    public C10562b9() {
    }

    public boolean m4535a() {
        return this.f33877b == 0 && this.f33878c == 0 && this.f33881f == 0 && this.f33882g == 0 && this.f33879d == 0 && this.f33880e == 0;
    }

    public void m4534b(C10562b9 b9Var) {
        this.f33877b = b9Var.f33877b;
        this.f33878c = b9Var.f33878c;
        this.f33879d = b9Var.f33879d;
        this.f33880e = b9Var.f33880e;
        this.f33881f = b9Var.f33881f;
        this.f33882g = b9Var.f33882g;
    }

    public void m4533c(String str) {
        for (LevelDB.C7052a aVar : C4868i.m24727c2().m24638n3().m17974g(str)) {
            String substring = aVar.m17943l().substring(str.length());
            substring.hashCode();
            char c = 65535;
            switch (substring.hashCode()) {
                case -1268243410:
                    if (substring.equals("messages_all")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1081306068:
                    if (substring.equals("marked")) {
                        c = 1;
                        break;
                    }
                    break;
                case -462094004:
                    if (substring.equals("messages")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94623771:
                    if (substring.equals("chats")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1102792462:
                    if (substring.equals("marked_all")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1637940093:
                    if (substring.equals("chats_all")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f33881f = aVar.m17947h();
                    break;
                case 1:
                    this.f33880e = aVar.m17947h();
                    break;
                case 2:
                    this.f33882g = aVar.m17947h();
                    break;
                case 3:
                    this.f33878c = aVar.m17947h();
                    break;
                case 4:
                    this.f33879d = aVar.m17947h();
                    break;
                case 5:
                    this.f33877b = aVar.m17947h();
                    break;
            }
        }
    }

    public void m4532d(String str, boolean z) {
        if (m4535a()) {
            C4868i.m24727c2().m24638n3().m17990N(str);
            return;
        }
        LevelDB W = C4868i.m24727c2().m24774W();
        if (z) {
            if (this.f33877b > 0) {
                W.putInt(str + "chats_all", this.f33877b);
            } else {
                W.remove(str + "chats_all");
            }
            if (this.f33878c > 0) {
                W.putInt(str + "chats", this.f33878c);
            } else {
                W.remove(str + "chats");
            }
            if (this.f33879d > 0) {
                W.putInt(str + "marked_all", this.f33879d);
            } else {
                W.remove(str + "marked_all");
            }
            if (this.f33880e > 0) {
                W.putInt(str + "marked", this.f33880e);
            } else {
                W.remove(str + "marked");
            }
        } else {
            if (this.f33881f > 0) {
                W.putInt(str + "messages_all", this.f33881f);
            } else {
                W.remove(str + "messages_all");
            }
            if (this.f33882g > 0) {
                W.putInt(str + "messages", this.f33882g);
            } else {
                W.remove(str + "messages");
            }
        }
        W.apply();
    }

    public boolean m4531e(int i, int i2, int i3, int i4, int i5) {
        if (this.f33876a == i && this.f33877b == i2 && this.f33878c == i3 && this.f33879d == i4 && this.f33880e == i5) {
            return false;
        }
        this.f33876a = i;
        this.f33877b = i2;
        this.f33878c = i3;
        this.f33879d = i4;
        this.f33880e = i5;
        return true;
    }

    public C10562b9(C10562b9 b9Var) {
        m4534b(b9Var);
    }

    public C10562b9(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f33876a = i;
        this.f33877b = i2;
        this.f33878c = i3;
        this.f33879d = i4;
        this.f33880e = i5;
        this.f33881f = i6;
        this.f33882g = i7;
    }
}
