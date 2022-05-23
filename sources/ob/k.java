package ob;

import ja.r;
import ja.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.drinkless.td.libcore.telegram.TdApi;

public final class k {

    public static final class a<T> implements Comparator {
        @Override
        public final int compare(T t10, T t11) {
            return ka.a.a(Integer.valueOf(((TdApi.TextEntity) t10).offset), Integer.valueOf(((TdApi.TextEntity) t11).offset));
        }
    }

    public static final class b<T> implements Comparator {
        @Override
        public final int compare(T t10, T t11) {
            return ka.a.a(Integer.valueOf(((TdApi.TextEntity) t10).offset), Integer.valueOf(((TdApi.TextEntity) t11).offset));
        }
    }

    public static final class c<T> implements Comparator {
        public final TdApi.ChatList f19348a;

        public c(TdApi.ChatList chatList) {
            this.f19348a = chatList;
        }

        @Override
        public final int compare(T t10, T t11) {
            return ka.a.a(Long.valueOf(ob.b.b((TdApi.Chat) t11, this.f19348a)), Long.valueOf(ob.b.b((TdApi.Chat) t10, this.f19348a)));
        }
    }

    public static final class d<T> implements Comparator {
        public final TdApi.ChatList f19349a;

        public d(TdApi.ChatList chatList) {
            this.f19349a = chatList;
        }

        @Override
        public final int compare(T t10, T t11) {
            return ka.a.a(Long.valueOf(ob.b.b((TdApi.Chat) t11, this.f19349a)), Long.valueOf(ob.b.b((TdApi.Chat) t10, this.f19349a)));
        }
    }

    public static final class e<T> implements Comparator {
        @Override
        public final int compare(T t10, T t11) {
            return ka.a.a(Boolean.valueOf(((TdApi.Session) t11).isCurrent), Boolean.valueOf(((TdApi.Session) t10).isCurrent));
        }
    }

    public static final class f<T> implements Comparator {
        @Override
        public final int compare(T t10, T t11) {
            return ka.a.a(Boolean.valueOf(ob.e.g1((TdApi.LanguagePackInfo) t11)), Boolean.valueOf(ob.e.g1((TdApi.LanguagePackInfo) t10)));
        }
    }

    public static final class g<T> implements Comparator {
        public final Comparator f19350a;

        public g(Comparator comparator) {
            this.f19350a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19350a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Boolean.valueOf(((TdApi.LanguagePackInfo) t10).isBeta), Boolean.valueOf(((TdApi.LanguagePackInfo) t11).isBeta));
        }
    }

    public static final class h<T> implements Comparator {
        public final Comparator f19351a;

        public h(Comparator comparator) {
            this.f19351a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19351a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Long.valueOf(((TdApi.Chat) t11).f19908id), Long.valueOf(((TdApi.Chat) t10).f19908id));
        }
    }

    public static final class i<T> implements Comparator {
        public final Comparator f19352a;

        public i(Comparator comparator) {
            this.f19352a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19352a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Long.valueOf(((TdApi.Chat) t11).f19908id), Long.valueOf(((TdApi.Chat) t10).f19908id));
        }
    }

    public static final class j<T> implements Comparator {
        public final Comparator f19353a;

        public j(Comparator comparator) {
            this.f19353a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19353a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Integer.valueOf(((TdApi.TextEntity) t11).length), Integer.valueOf(((TdApi.TextEntity) t10).length));
        }
    }

    public static final class C0169k<T> implements Comparator {
        public final Comparator f19354a;

        public C0169k(Comparator comparator) {
            this.f19354a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19354a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Integer.valueOf(((TdApi.TextEntity) t11).length), Integer.valueOf(((TdApi.TextEntity) t10).length));
        }
    }

    public static final class l<T> implements Comparator {
        public final Comparator f19355a;

        public l(Comparator comparator) {
            this.f19355a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19355a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Boolean.valueOf(((TdApi.Session) t11).isPasswordPending), Boolean.valueOf(((TdApi.Session) t10).isPasswordPending));
        }
    }

    public static final class m<T> implements Comparator {
        public final Comparator f19356a;

        public m(Comparator comparator) {
            this.f19356a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19356a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Integer.valueOf(((TdApi.Session) t11).lastActiveDate), Integer.valueOf(((TdApi.Session) t10).lastActiveDate));
        }
    }

    public static final class n<T> implements Comparator {
        public final Comparator f19357a;

        public n(Comparator comparator) {
            this.f19357a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19357a.compare(t10, t11);
            return compare != 0 ? compare : ka.a.a(Boolean.valueOf(((TdApi.LanguagePackInfo) t11).isOfficial), Boolean.valueOf(((TdApi.LanguagePackInfo) t10).isOfficial));
        }
    }

    public static final class o<T> implements Comparator {
        public final Comparator f19358a;
        public final String f19359b;

        public o(Comparator comparator, String str) {
            this.f19358a = comparator;
            this.f19359b = str;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19358a.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) t11;
            boolean z10 = true;
            Boolean valueOf = Boolean.valueOf(!ob.e.g1(languagePackInfo) && ra.k.b(this.f19359b, languagePackInfo.f19945id));
            TdApi.LanguagePackInfo languagePackInfo2 = (TdApi.LanguagePackInfo) t10;
            if (ob.e.g1(languagePackInfo2) || !ra.k.b(this.f19359b, languagePackInfo2.f19945id)) {
                z10 = false;
            }
            return ka.a.a(valueOf, Boolean.valueOf(z10));
        }
    }

    public static final class p<T> implements Comparator {
        @Override
        public final int compare(T t10, T t11) {
            TdApi.MessageInteractionInfo messageInteractionInfo = ((TdApi.Message) t11).interactionInfo;
            ra.k.c(messageInteractionInfo);
            Integer valueOf = Integer.valueOf(messageInteractionInfo.viewCount);
            TdApi.MessageInteractionInfo messageInteractionInfo2 = ((TdApi.Message) t10).interactionInfo;
            ra.k.c(messageInteractionInfo2);
            return ka.a.a(valueOf, Integer.valueOf(messageInteractionInfo2.viewCount));
        }
    }

    public static final class q<T> implements Comparator {
        public final Comparator f19360a;

        public q(Comparator comparator) {
            this.f19360a = comparator;
        }

        @Override
        public final int compare(T t10, T t11) {
            int compare = this.f19360a.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            TdApi.MessageInteractionInfo messageInteractionInfo = ((TdApi.Message) t11).interactionInfo;
            ra.k.c(messageInteractionInfo);
            Integer valueOf = Integer.valueOf(messageInteractionInfo.forwardCount);
            TdApi.MessageInteractionInfo messageInteractionInfo2 = ((TdApi.Message) t10).interactionInfo;
            ra.k.c(messageInteractionInfo2);
            return ka.a.a(valueOf, Integer.valueOf(messageInteractionInfo2.forwardCount));
        }
    }

    public static final void a(List<TdApi.TextEntity> list) {
        ra.k.e(list, "<this>");
        r.q(list, new C0169k(new b()));
    }

    public static final void b(List<TdApi.Chat> list, TdApi.ChatList chatList) {
        ra.k.e(list, "<this>");
        r.q(list, new i(new d(chatList)));
    }

    public static final void c(TdApi.Chat[] chatArr, TdApi.ChatList chatList) {
        ra.k.e(chatArr, "<this>");
        ja.h.l(chatArr, new h(new c(chatList)));
    }

    public static final void d(TdApi.LanguagePackInfo[] languagePackInfoArr, String str) {
        ra.k.e(languagePackInfoArr, "<this>");
        ra.k.e(str, "activeLanguagePackId");
        ja.h.l(languagePackInfoArr, new o(new n(new g(new f())), str));
    }

    public static final void e(TdApi.Session[] sessionArr) {
        ra.k.e(sessionArr, "<this>");
        ja.h.l(sessionArr, new m(new l(new e())));
    }

    public static final void f(TdApi.TextEntity[] textEntityArr) {
        ra.k.e(textEntityArr, "<this>");
        ja.h.l(textEntityArr, new j(new a()));
    }

    public static final List<TdApi.Message> g(List<TdApi.Message> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TdApi.Message) obj).interactionInfo != null) {
                arrayList.add(obj);
            }
        }
        return v.O(arrayList, new q(new p()));
    }
}
