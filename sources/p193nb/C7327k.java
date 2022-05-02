package p193nb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p123ia.C5294h;
import p123ia.C5308r;
import p123ia.C5312v;
import p138ja.C5906a;
import qa.C8298k;

public final class C7327k {

    public static final class C7328a<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return C5906a.m21863a(Integer.valueOf(((TdApi.TextEntity) t).offset), Integer.valueOf(((TdApi.TextEntity) t2).offset));
        }
    }

    public static final class C7329b<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return C5906a.m21863a(Integer.valueOf(((TdApi.TextEntity) t).offset), Integer.valueOf(((TdApi.TextEntity) t2).offset));
        }
    }

    public static final class C7330c<T> implements Comparator {
        public final TdApi.ChatList f23237a;

        public C7330c(TdApi.ChatList chatList) {
            this.f23237a = chatList;
        }

        @Override
        public final int compare(T t, T t2) {
            return C5906a.m21863a(Long.valueOf(C7317b.m17042b((TdApi.Chat) t2, this.f23237a)), Long.valueOf(C7317b.m17042b((TdApi.Chat) t, this.f23237a)));
        }
    }

    public static final class C7331d<T> implements Comparator {
        public final TdApi.ChatList f23238a;

        public C7331d(TdApi.ChatList chatList) {
            this.f23238a = chatList;
        }

        @Override
        public final int compare(T t, T t2) {
            return C5906a.m21863a(Long.valueOf(C7317b.m17042b((TdApi.Chat) t2, this.f23238a)), Long.valueOf(C7317b.m17042b((TdApi.Chat) t, this.f23238a)));
        }
    }

    public static final class C7332e<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return C5906a.m21863a(Boolean.valueOf(((TdApi.Session) t2).isCurrent), Boolean.valueOf(((TdApi.Session) t).isCurrent));
        }
    }

    public static final class C7333f<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return C5906a.m21863a(Boolean.valueOf(C7321e.m16953e1((TdApi.LanguagePackInfo) t2)), Boolean.valueOf(C7321e.m16953e1((TdApi.LanguagePackInfo) t)));
        }
    }

    public static final class C7334g<T> implements Comparator {
        public final Comparator f23239a;

        public C7334g(Comparator comparator) {
            this.f23239a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23239a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Boolean.valueOf(((TdApi.LanguagePackInfo) t).isBeta), Boolean.valueOf(((TdApi.LanguagePackInfo) t2).isBeta));
        }
    }

    public static final class C7335h<T> implements Comparator {
        public final Comparator f23240a;

        public C7335h(Comparator comparator) {
            this.f23240a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23240a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Long.valueOf(((TdApi.Chat) t2).f25370id), Long.valueOf(((TdApi.Chat) t).f25370id));
        }
    }

    public static final class C7336i<T> implements Comparator {
        public final Comparator f23241a;

        public C7336i(Comparator comparator) {
            this.f23241a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23241a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Long.valueOf(((TdApi.Chat) t2).f25370id), Long.valueOf(((TdApi.Chat) t).f25370id));
        }
    }

    public static final class C7337j<T> implements Comparator {
        public final Comparator f23242a;

        public C7337j(Comparator comparator) {
            this.f23242a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23242a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Integer.valueOf(((TdApi.TextEntity) t2).length), Integer.valueOf(((TdApi.TextEntity) t).length));
        }
    }

    public static final class C7338k<T> implements Comparator {
        public final Comparator f23243a;

        public C7338k(Comparator comparator) {
            this.f23243a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23243a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Integer.valueOf(((TdApi.TextEntity) t2).length), Integer.valueOf(((TdApi.TextEntity) t).length));
        }
    }

    public static final class C7339l<T> implements Comparator {
        public final Comparator f23244a;

        public C7339l(Comparator comparator) {
            this.f23244a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23244a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Boolean.valueOf(((TdApi.Session) t2).isPasswordPending), Boolean.valueOf(((TdApi.Session) t).isPasswordPending));
        }
    }

    public static final class C7340m<T> implements Comparator {
        public final Comparator f23245a;

        public C7340m(Comparator comparator) {
            this.f23245a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23245a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Integer.valueOf(((TdApi.Session) t2).lastActiveDate), Integer.valueOf(((TdApi.Session) t).lastActiveDate));
        }
    }

    public static final class C7341n<T> implements Comparator {
        public final Comparator f23246a;

        public C7341n(Comparator comparator) {
            this.f23246a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23246a.compare(t, t2);
            return compare != 0 ? compare : C5906a.m21863a(Boolean.valueOf(((TdApi.LanguagePackInfo) t2).isOfficial), Boolean.valueOf(((TdApi.LanguagePackInfo) t).isOfficial));
        }
    }

    public static final class C7342o<T> implements Comparator {
        public final Comparator f23247a;
        public final String f23248b;

        public C7342o(Comparator comparator, String str) {
            this.f23247a = comparator;
            this.f23248b = str;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23247a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) t2;
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(!C7321e.m16953e1(languagePackInfo) && C8298k.m12936b(this.f23248b, languagePackInfo.f25408id));
            TdApi.LanguagePackInfo languagePackInfo2 = (TdApi.LanguagePackInfo) t;
            if (C7321e.m16953e1(languagePackInfo2) || !C8298k.m12936b(this.f23248b, languagePackInfo2.f25408id)) {
                z = false;
            }
            return C5906a.m21863a(valueOf, Boolean.valueOf(z));
        }
    }

    public static final class C7343p<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            TdApi.MessageInteractionInfo messageInteractionInfo = ((TdApi.Message) t2).interactionInfo;
            C8298k.m12935c(messageInteractionInfo);
            Integer valueOf = Integer.valueOf(messageInteractionInfo.viewCount);
            TdApi.MessageInteractionInfo messageInteractionInfo2 = ((TdApi.Message) t).interactionInfo;
            C8298k.m12935c(messageInteractionInfo2);
            return C5906a.m21863a(valueOf, Integer.valueOf(messageInteractionInfo2.viewCount));
        }
    }

    public static final class C7344q<T> implements Comparator {
        public final Comparator f23249a;

        public C7344q(Comparator comparator) {
            this.f23249a = comparator;
        }

        @Override
        public final int compare(T t, T t2) {
            int compare = this.f23249a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            TdApi.MessageInteractionInfo messageInteractionInfo = ((TdApi.Message) t2).interactionInfo;
            C8298k.m12935c(messageInteractionInfo);
            Integer valueOf = Integer.valueOf(messageInteractionInfo.forwardCount);
            TdApi.MessageInteractionInfo messageInteractionInfo2 = ((TdApi.Message) t).interactionInfo;
            C8298k.m12935c(messageInteractionInfo2);
            return C5906a.m21863a(valueOf, Integer.valueOf(messageInteractionInfo2.forwardCount));
        }
    }

    public static final void m16816a(List<TdApi.TextEntity> list) {
        C8298k.m12933e(list, "<this>");
        C5308r.m23356q(list, new C7338k(new C7329b()));
    }

    public static final void m16815b(List<TdApi.Chat> list, TdApi.ChatList chatList) {
        C8298k.m12933e(list, "<this>");
        C5308r.m23356q(list, new C7336i(new C7331d(chatList)));
    }

    public static final void m16814c(TdApi.Chat[] chatArr, TdApi.ChatList chatList) {
        C8298k.m12933e(chatArr, "<this>");
        C5294h.m23425l(chatArr, new C7335h(new C7330c(chatList)));
    }

    public static final void m16813d(TdApi.LanguagePackInfo[] languagePackInfoArr, String str) {
        C8298k.m12933e(languagePackInfoArr, "<this>");
        C8298k.m12933e(str, "activeLanguagePackId");
        C5294h.m23425l(languagePackInfoArr, new C7342o(new C7341n(new C7334g(new C7333f())), str));
    }

    public static final void m16812e(TdApi.Session[] sessionArr) {
        C8298k.m12933e(sessionArr, "<this>");
        C5294h.m23425l(sessionArr, new C7340m(new C7339l(new C7332e())));
    }

    public static final void m16811f(TdApi.TextEntity[] textEntityArr) {
        C8298k.m12933e(textEntityArr, "<this>");
        C5294h.m23425l(textEntityArr, new C7337j(new C7328a()));
    }

    public static final List<TdApi.Message> m16810g(List<TdApi.Message> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TdApi.Message) obj).interactionInfo != null) {
                arrayList.add(obj);
            }
        }
        return C5312v.m23334O(arrayList, new C7344q(new C7343p()));
    }
}
