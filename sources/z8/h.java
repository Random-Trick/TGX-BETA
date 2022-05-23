package z8;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t2.a;
import t2.b;

public class h {
    public static Pattern f27047a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static String a(a aVar) {
        return b(aVar, "");
    }

    public static String b(a aVar, String str) {
        b parent = aVar.getParent();
        int i10 = 0;
        for (a aVar2 : parent.getBoxes()) {
            if (aVar2.getType().equals(aVar.getType())) {
                if (aVar2 == aVar) {
                    break;
                }
                i10++;
            }
        }
        String str2 = String.valueOf(String.format("/%s[%d]", aVar.getType(), Integer.valueOf(i10))) + str;
        return parent instanceof a ? b((a) parent, str2) : str2;
    }

    public static <T extends a> T c(AbstractContainerBox abstractContainerBox, String str) {
        List d10 = d(abstractContainerBox, str, true);
        if (d10.isEmpty()) {
            return null;
        }
        return (T) d10.get(0);
    }

    public static <T extends a> List<T> d(AbstractContainerBox abstractContainerBox, String str, boolean z10) {
        return e(abstractContainerBox, str, z10);
    }

    public static <T extends a> List<T> e(Object obj, String str, boolean z10) {
        String str2;
        if (str.startsWith("/")) {
            String substring = str.substring(1);
            while (obj instanceof a) {
                obj = ((a) obj).getParent();
            }
            str = substring;
        }
        if (str.length() != 0) {
            int i10 = 0;
            if (str.contains("/")) {
                str2 = str.substring(str.indexOf(47) + 1);
                str = str.substring(0, str.indexOf(47));
            } else {
                str2 = "";
            }
            Matcher matcher = f27047a.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                if ("..".equals(group)) {
                    if (obj instanceof a) {
                        return i(((a) obj).getParent(), str2, z10);
                    }
                    return Collections.emptyList();
                } else if (!(obj instanceof b)) {
                    return Collections.emptyList();
                } else {
                    int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                    LinkedList linkedList = new LinkedList();
                    for (a aVar : ((b) obj).getBoxes()) {
                        if (aVar.getType().matches(group)) {
                            if (parseInt == -1 || parseInt == i10) {
                                linkedList.addAll(g(aVar, str2, z10));
                            }
                            i10++;
                        }
                        if (z10 || parseInt >= 0) {
                            if (!linkedList.isEmpty()) {
                                return linkedList;
                            }
                        }
                    }
                    return linkedList;
                }
            } else {
                throw new RuntimeException(String.valueOf(str) + " is invalid path.");
            }
        } else if (obj instanceof a) {
            return Collections.singletonList((a) obj);
        } else {
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
    }

    public static <T extends a> List<T> f(a aVar, String str) {
        return g(aVar, str, false);
    }

    public static <T extends a> List<T> g(a aVar, String str, boolean z10) {
        return e(aVar, str, z10);
    }

    public static <T extends a> List<T> h(b bVar, String str) {
        return i(bVar, str, false);
    }

    public static <T extends a> List<T> i(b bVar, String str, boolean z10) {
        return e(bVar, str, z10);
    }
}
