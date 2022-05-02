package p345y8;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p269t2.AbstractC8950a;
import p269t2.AbstractC8951b;

public class C10454h {
    public static Pattern f33539a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static String m5092a(AbstractC8950a aVar) {
        return m5091b(aVar, "");
    }

    public static String m5091b(AbstractC8950a aVar, String str) {
        AbstractC8951b parent = aVar.getParent();
        int i = 0;
        for (AbstractC8950a aVar2 : parent.getBoxes()) {
            if (aVar2.getType().equals(aVar.getType())) {
                if (aVar2 == aVar) {
                    break;
                }
                i++;
            }
        }
        String str2 = String.valueOf(String.format("/%s[%d]", aVar.getType(), Integer.valueOf(i))) + str;
        return parent instanceof AbstractC8950a ? m5091b((AbstractC8950a) parent, str2) : str2;
    }

    public static <T extends AbstractC8950a> T m5090c(AbstractContainerBox abstractContainerBox, String str) {
        List d = m5089d(abstractContainerBox, str, true);
        if (d.isEmpty()) {
            return null;
        }
        return (T) d.get(0);
    }

    public static <T extends AbstractC8950a> List<T> m5089d(AbstractContainerBox abstractContainerBox, String str, boolean z) {
        return m5088e(abstractContainerBox, str, z);
    }

    public static <T extends AbstractC8950a> List<T> m5088e(Object obj, String str, boolean z) {
        String str2;
        if (str.startsWith("/")) {
            String substring = str.substring(1);
            while (obj instanceof AbstractC8950a) {
                obj = ((AbstractC8950a) obj).getParent();
            }
            str = substring;
        }
        if (str.length() != 0) {
            int i = 0;
            if (str.contains("/")) {
                str2 = str.substring(str.indexOf(47) + 1);
                str = str.substring(0, str.indexOf(47));
            } else {
                str2 = "";
            }
            Matcher matcher = f33539a.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                if ("..".equals(group)) {
                    if (obj instanceof AbstractC8950a) {
                        return m5084i(((AbstractC8950a) obj).getParent(), str2, z);
                    }
                    return Collections.emptyList();
                } else if (!(obj instanceof AbstractC8951b)) {
                    return Collections.emptyList();
                } else {
                    int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                    LinkedList linkedList = new LinkedList();
                    for (AbstractC8950a aVar : ((AbstractC8951b) obj).getBoxes()) {
                        if (aVar.getType().matches(group)) {
                            if (parseInt == -1 || parseInt == i) {
                                linkedList.addAll(m5086g(aVar, str2, z));
                            }
                            i++;
                        }
                        if (z || parseInt >= 0) {
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
        } else if (obj instanceof AbstractC8950a) {
            return Collections.singletonList((AbstractC8950a) obj);
        } else {
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
    }

    public static <T extends AbstractC8950a> List<T> m5087f(AbstractC8950a aVar, String str) {
        return m5086g(aVar, str, false);
    }

    public static <T extends AbstractC8950a> List<T> m5086g(AbstractC8950a aVar, String str, boolean z) {
        return m5088e(aVar, str, z);
    }

    public static <T extends AbstractC8950a> List<T> m5085h(AbstractC8951b bVar, String str) {
        return m5084i(bVar, str, false);
    }

    public static <T extends AbstractC8950a> List<T> m5084i(AbstractC8951b bVar, String str, boolean z) {
        return m5088e(bVar, str, z);
    }
}
