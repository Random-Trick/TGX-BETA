package zd;

import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;

public final class c0 {

    public class a implements d0 {
        public final o6 f27305a;

        public a(o6 o6Var) {
            this.f27305a = o6Var;
        }

        @Override
        public int I3() {
            return R.string.xGroups;
        }

        @Override
        public int M(boolean z10) {
            return c0.c(this, z10);
        }

        @Override
        public int Y2() {
            return R.string.NoGroupsToShow;
        }

        public boolean a(TdApi.Chat chat) {
            return this.f27305a.c7(chat) && this.f27305a.A2(chat);
        }

        @Override
        public boolean k6() {
            return c0.a(this);
        }
    }

    public class b implements d0 {
        public final o6 f27306a;

        public b(o6 o6Var) {
            this.f27306a = o6Var;
        }

        @Override
        public int I3() {
            return R.string.xGroups;
        }

        @Override
        public int M(boolean z10) {
            return z10 ? R.string.MessagesArchiveGroups : R.string.MessagesGroups;
        }

        @Override
        public int Y2() {
            return R.string.NoGroups;
        }

        public boolean a(TdApi.Chat chat) {
            return this.f27306a.c7(chat);
        }

        @Override
        public boolean k6() {
            return true;
        }
    }

    public class c implements d0 {
        public final o6 f27307a;

        public c(o6 o6Var) {
            this.f27307a = o6Var;
        }

        @Override
        public int I3() {
            return R.string.xChannels;
        }

        @Override
        public int M(boolean z10) {
            return z10 ? R.string.MessagesArchiveChannels : R.string.MessagesChannels;
        }

        @Override
        public int Y2() {
            return R.string.NoChannels;
        }

        public boolean a(TdApi.Chat chat) {
            return this.f27307a.O6(chat.f19908id);
        }

        @Override
        public boolean k6() {
            return true;
        }
    }

    public class d implements d0 {
        public final o6 f27308a;

        public d(o6 o6Var) {
            this.f27308a = o6Var;
        }

        @Override
        public int I3() {
            return c0.d(this);
        }

        @Override
        public int M(boolean z10) {
            return z10 ? R.string.MessagesArchivePrivate : R.string.MessagesPrivate;
        }

        @Override
        public int Y2() {
            return R.string.NoPrivateChats;
        }

        public boolean a(TdApi.Chat chat) {
            return this.f27308a.B7(chat) && !this.f27308a.M6(chat);
        }

        @Override
        public boolean k6() {
            return true;
        }
    }

    public class e implements d0 {
        public final o6 f27309a;

        public e(o6 o6Var) {
            this.f27309a = o6Var;
        }

        @Override
        public int I3() {
            return R.string.xBots;
        }

        @Override
        public int M(boolean z10) {
            return z10 ? R.string.MessagesArchiveBots : R.string.MessagesBots;
        }

        @Override
        public int Y2() {
            return R.string.NoBotsChats;
        }

        public boolean a(TdApi.Chat chat) {
            return this.f27309a.M6(chat);
        }

        @Override
        public boolean k6() {
            return true;
        }
    }

    public class f implements d0 {
        @Override
        public int I3() {
            return c0.d(this);
        }

        @Override
        public int M(boolean z10) {
            return c0.c(this, z10);
        }

        @Override
        public int Y2() {
            return R.string.NoUnreadChats;
        }

        public boolean a(TdApi.Chat chat) {
            return chat.unreadCount > 0 || chat.isMarkedAsUnread;
        }

        @Override
        public boolean k6() {
            return c0.a(this);
        }
    }

    public static boolean a(d0 d0Var) {
        return false;
    }

    public static int b(d0 d0Var) {
        return R.string.NoChats;
    }

    public static int c(d0 d0Var, boolean z10) {
        return R.string.general_Messages;
    }

    public static int d(d0 d0Var) {
        return R.string.xChats;
    }

    public static d0 e(o6 o6Var) {
        return new e(o6Var);
    }

    public static d0 f(o6 o6Var) {
        return new c(o6Var);
    }

    public static d0 g(final o6 o6Var) {
        return new d0() {
            @Override
            public int I3() {
                return c0.d(this);
            }

            @Override
            public int M(boolean z10) {
                return c0.c(this, z10);
            }

            @Override
            public int Y2() {
                return c0.b(this);
            }

            @Override
            public final boolean a(TdApi.Chat chat) {
                return c0.j(o6.this, chat);
            }

            @Override
            public boolean k6() {
                return c0.a(this);
            }
        };
    }

    public static d0 h(o6 o6Var) {
        return new b(o6Var);
    }

    public static d0 i(o6 o6Var) {
        return new a(o6Var);
    }

    public static boolean j(o6 o6Var, TdApi.Chat chat) {
        return chat.type.getConstructor() != 862366513 && !o6Var.Q6(chat);
    }

    public static d0 k(o6 o6Var) {
        return new d(o6Var);
    }

    public static d0 l(o6 o6Var) {
        return new f();
    }
}
