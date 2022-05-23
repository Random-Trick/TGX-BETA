package zd;

import he.i;
import me.vkryl.leveldb.LevelDB;

public class z8 {
    public int f28793a;
    public int f28794b;
    public int f28795c;
    public int f28796d;
    public int f28797e;
    public int f28798f;
    public int f28799g;

    public z8() {
    }

    public z8(z8 z8Var) {
        b(z8Var);
    }

    public boolean a() {
        return this.f28794b == 0 && this.f28795c == 0 && this.f28798f == 0 && this.f28799g == 0 && this.f28796d == 0 && this.f28797e == 0;
    }

    public void b(z8 z8Var) {
        this.f28794b = z8Var.f28794b;
        this.f28795c = z8Var.f28795c;
        this.f28796d = z8Var.f28796d;
        this.f28797e = z8Var.f28797e;
        this.f28798f = z8Var.f28798f;
        this.f28799g = z8Var.f28799g;
    }

    public void c(String str) {
        for (LevelDB.a aVar : i.c2().n3().g(str)) {
            String substring = aVar.l().substring(str.length());
            substring.hashCode();
            char c10 = 65535;
            switch (substring.hashCode()) {
                case -1268243410:
                    if (substring.equals("messages_all")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1081306068:
                    if (substring.equals("marked")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -462094004:
                    if (substring.equals("messages")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 94623771:
                    if (substring.equals("chats")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1102792462:
                    if (substring.equals("marked_all")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1637940093:
                    if (substring.equals("chats_all")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.f28798f = aVar.h();
                    break;
                case 1:
                    this.f28797e = aVar.h();
                    break;
                case 2:
                    this.f28799g = aVar.h();
                    break;
                case 3:
                    this.f28795c = aVar.h();
                    break;
                case 4:
                    this.f28796d = aVar.h();
                    break;
                case 5:
                    this.f28794b = aVar.h();
                    break;
            }
        }
    }

    public void d(String str, boolean z10) {
        if (a()) {
            i.c2().n3().N(str);
            return;
        }
        LevelDB W = i.c2().W();
        if (z10) {
            if (this.f28794b > 0) {
                W.putInt(str + "chats_all", this.f28794b);
            } else {
                W.remove(str + "chats_all");
            }
            if (this.f28795c > 0) {
                W.putInt(str + "chats", this.f28795c);
            } else {
                W.remove(str + "chats");
            }
            if (this.f28796d > 0) {
                W.putInt(str + "marked_all", this.f28796d);
            } else {
                W.remove(str + "marked_all");
            }
            if (this.f28797e > 0) {
                W.putInt(str + "marked", this.f28797e);
            } else {
                W.remove(str + "marked");
            }
        } else {
            if (this.f28798f > 0) {
                W.putInt(str + "messages_all", this.f28798f);
            } else {
                W.remove(str + "messages_all");
            }
            if (this.f28799g > 0) {
                W.putInt(str + "messages", this.f28799g);
            } else {
                W.remove(str + "messages");
            }
        }
        W.apply();
    }

    public boolean e(int i10, int i11, int i12, int i13, int i14) {
        if (this.f28793a == i10 && this.f28794b == i11 && this.f28795c == i12 && this.f28796d == i13 && this.f28797e == i14) {
            return false;
        }
        this.f28793a = i10;
        this.f28794b = i11;
        this.f28795c = i12;
        this.f28796d = i13;
        this.f28797e = i14;
        return true;
    }

    public z8(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f28793a = i10;
        this.f28794b = i11;
        this.f28795c = i12;
        this.f28796d = i13;
        this.f28797e = i14;
        this.f28798f = i15;
        this.f28799g = i16;
    }
}
