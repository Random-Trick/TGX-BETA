package p350yd;

import ge.C4868i;
import me.vkryl.leveldb.LevelDB;

public class C10562b9 {
    public int f33873a;
    public int f33874b;
    public int f33875c;
    public int f33876d;
    public int f33877e;
    public int f33878f;
    public int f33879g;

    public C10562b9() {
    }

    public boolean m4535a() {
        return this.f33874b == 0 && this.f33875c == 0 && this.f33878f == 0 && this.f33879g == 0 && this.f33876d == 0 && this.f33877e == 0;
    }

    public void m4534b(C10562b9 b9Var) {
        this.f33874b = b9Var.f33874b;
        this.f33875c = b9Var.f33875c;
        this.f33876d = b9Var.f33876d;
        this.f33877e = b9Var.f33877e;
        this.f33878f = b9Var.f33878f;
        this.f33879g = b9Var.f33879g;
    }

    public void m4533c(String str) {
        for (LevelDB.C7052a aVar : C4868i.m24726c2().m24637n3().m17974g(str)) {
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
                    this.f33878f = aVar.m17947h();
                    break;
                case 1:
                    this.f33877e = aVar.m17947h();
                    break;
                case 2:
                    this.f33879g = aVar.m17947h();
                    break;
                case 3:
                    this.f33875c = aVar.m17947h();
                    break;
                case 4:
                    this.f33876d = aVar.m17947h();
                    break;
                case 5:
                    this.f33874b = aVar.m17947h();
                    break;
            }
        }
    }

    public void m4532d(String str, boolean z) {
        if (m4535a()) {
            C4868i.m24726c2().m24637n3().m17990N(str);
            return;
        }
        LevelDB W = C4868i.m24726c2().m24773W();
        if (z) {
            if (this.f33874b > 0) {
                W.putInt(str + "chats_all", this.f33874b);
            } else {
                W.remove(str + "chats_all");
            }
            if (this.f33875c > 0) {
                W.putInt(str + "chats", this.f33875c);
            } else {
                W.remove(str + "chats");
            }
            if (this.f33876d > 0) {
                W.putInt(str + "marked_all", this.f33876d);
            } else {
                W.remove(str + "marked_all");
            }
            if (this.f33877e > 0) {
                W.putInt(str + "marked", this.f33877e);
            } else {
                W.remove(str + "marked");
            }
        } else {
            if (this.f33878f > 0) {
                W.putInt(str + "messages_all", this.f33878f);
            } else {
                W.remove(str + "messages_all");
            }
            if (this.f33879g > 0) {
                W.putInt(str + "messages", this.f33879g);
            } else {
                W.remove(str + "messages");
            }
        }
        W.apply();
    }

    public boolean m4531e(int i, int i2, int i3, int i4, int i5) {
        if (this.f33873a == i && this.f33874b == i2 && this.f33875c == i3 && this.f33876d == i4 && this.f33877e == i5) {
            return false;
        }
        this.f33873a = i;
        this.f33874b = i2;
        this.f33875c = i3;
        this.f33876d = i4;
        this.f33877e = i5;
        return true;
    }

    public C10562b9(C10562b9 b9Var) {
        m4534b(b9Var);
    }

    public C10562b9(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f33873a = i;
        this.f33874b = i2;
        this.f33875c = i3;
        this.f33876d = i4;
        this.f33877e = i5;
        this.f33878f = i6;
        this.f33879g = i7;
    }
}
