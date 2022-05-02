package p350yd;

import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;

public final class C10619e0 {

    public class C10620a implements AbstractC10650f0 {
        public final C10930q6 f34023a;

        public C10620a(C10930q6 q6Var) {
            this.f34023a = q6Var;
        }

        @Override
        public int mo4380L(boolean z) {
            return C10619e0.m4443c(this, z);
        }

        @Override
        public int mo4379Q3() {
            return R.string.xGroups;
        }

        public boolean mo1511a(TdApi.Chat chat) {
            return this.f34023a.m2568Y6(chat) && this.f34023a.m2160y2(chat);
        }

        @Override
        public int mo4378i3() {
            return R.string.NoGroupsToShow;
        }

        @Override
        public boolean mo4377k6() {
            return C10619e0.m4445a(this);
        }
    }

    public class C10621b implements AbstractC10650f0 {
        public final C10930q6 f34024a;

        public C10621b(C10930q6 q6Var) {
            this.f34024a = q6Var;
        }

        @Override
        public int mo4380L(boolean z) {
            return z ? R.string.MessagesArchiveGroups : R.string.MessagesGroups;
        }

        @Override
        public int mo4379Q3() {
            return R.string.xGroups;
        }

        public boolean mo1511a(TdApi.Chat chat) {
            return this.f34024a.m2568Y6(chat);
        }

        @Override
        public int mo4378i3() {
            return R.string.NoGroups;
        }

        @Override
        public boolean mo4377k6() {
            return true;
        }
    }

    public class C10622c implements AbstractC10650f0 {
        public final C10930q6 f34025a;

        public C10622c(C10930q6 q6Var) {
            this.f34025a = q6Var;
        }

        @Override
        public int mo4380L(boolean z) {
            return z ? R.string.MessagesArchiveChannels : R.string.MessagesChannels;
        }

        @Override
        public int mo4379Q3() {
            return R.string.xChannels;
        }

        public boolean mo1511a(TdApi.Chat chat) {
            return this.f34025a.m2784K6(chat.f25367id);
        }

        @Override
        public int mo4378i3() {
            return R.string.NoChannels;
        }

        @Override
        public boolean mo4377k6() {
            return true;
        }
    }

    public class C10623d implements AbstractC10650f0 {
        public final C10930q6 f34026a;

        public C10623d(C10930q6 q6Var) {
            this.f34026a = q6Var;
        }

        @Override
        public int mo4380L(boolean z) {
            return z ? R.string.MessagesArchivePrivate : R.string.MessagesPrivate;
        }

        @Override
        public int mo4379Q3() {
            return C10619e0.m4442d(this);
        }

        public boolean mo1511a(TdApi.Chat chat) {
            return this.f34026a.m2171x7(chat) && !this.f34026a.m2816I6(chat);
        }

        @Override
        public int mo4378i3() {
            return R.string.NoPrivateChats;
        }

        @Override
        public boolean mo4377k6() {
            return true;
        }
    }

    public class C10624e implements AbstractC10650f0 {
        public final C10930q6 f34027a;

        public C10624e(C10930q6 q6Var) {
            this.f34027a = q6Var;
        }

        @Override
        public int mo4380L(boolean z) {
            return z ? R.string.MessagesArchiveBots : R.string.MessagesBots;
        }

        @Override
        public int mo4379Q3() {
            return R.string.xBots;
        }

        public boolean mo1511a(TdApi.Chat chat) {
            return this.f34027a.m2816I6(chat);
        }

        @Override
        public int mo4378i3() {
            return R.string.NoBotsChats;
        }

        @Override
        public boolean mo4377k6() {
            return true;
        }
    }

    public class C10625f implements AbstractC10650f0 {
        @Override
        public int mo4380L(boolean z) {
            return C10619e0.m4443c(this, z);
        }

        @Override
        public int mo4379Q3() {
            return C10619e0.m4442d(this);
        }

        public boolean mo1511a(TdApi.Chat chat) {
            return chat.unreadCount > 0 || chat.isMarkedAsUnread;
        }

        @Override
        public int mo4378i3() {
            return R.string.NoUnreadChats;
        }

        @Override
        public boolean mo4377k6() {
            return C10619e0.m4445a(this);
        }
    }

    public static boolean m4445a(AbstractC10650f0 f0Var) {
        return false;
    }

    public static int m4444b(AbstractC10650f0 f0Var) {
        return R.string.NoChats;
    }

    public static int m4443c(AbstractC10650f0 f0Var, boolean z) {
        return R.string.general_Messages;
    }

    public static int m4442d(AbstractC10650f0 f0Var) {
        return R.string.xChats;
    }

    public static AbstractC10650f0 m4440f(C10930q6 q6Var) {
        return new C10624e(q6Var);
    }

    public static AbstractC10650f0 m4439g(C10930q6 q6Var) {
        return new C10622c(q6Var);
    }

    public static AbstractC10650f0 m4438h(final C10930q6 q6Var) {
        return new AbstractC10650f0() {
            @Override
            public int mo4380L(boolean z) {
                return C10619e0.m4443c(this, z);
            }

            @Override
            public int mo4379Q3() {
                return C10619e0.m4442d(this);
            }

            @Override
            public final boolean mo1511a(TdApi.Chat chat) {
                boolean k;
                k = C10619e0.m4435k(C10930q6.this, chat);
                return k;
            }

            @Override
            public int mo4378i3() {
                return C10619e0.m4444b(this);
            }

            @Override
            public boolean mo4377k6() {
                return C10619e0.m4445a(this);
            }
        };
    }

    public static AbstractC10650f0 m4437i(C10930q6 q6Var) {
        return new C10621b(q6Var);
    }

    public static AbstractC10650f0 m4436j(C10930q6 q6Var) {
        return new C10620a(q6Var);
    }

    public static boolean m4435k(C10930q6 q6Var, TdApi.Chat chat) {
        return chat.type.getConstructor() != 862366513 && !q6Var.m2752M6(chat);
    }

    public static AbstractC10650f0 m4434l(C10930q6 q6Var) {
        return new C10623d(q6Var);
    }

    public static AbstractC10650f0 m4433m(C10930q6 q6Var) {
        return new C10625f();
    }
}
