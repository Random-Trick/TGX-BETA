package s8;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import s2.e;

public class l {
    public static Logger f22621a = Logger.getLogger(l.class.getName());
    public static Map<Integer, Map<Integer, Class<? extends b>>> f22622b = new HashMap();

    static {
        HashSet<Class<? extends b>> hashSet = new HashSet();
        hashSet.add(f.class);
        hashSet.add(n.class);
        hashSet.add(b.class);
        hashSet.add(i.class);
        hashSet.add(k.class);
        hashSet.add(m.class);
        hashSet.add(a.class);
        hashSet.add(j.class);
        hashSet.add(h.class);
        hashSet.add(e.class);
        for (Class<? extends b> cls : hashSet) {
            g gVar = (g) cls.getAnnotation(g.class);
            int[] tags = gVar.tags();
            int objectTypeIndication = gVar.objectTypeIndication();
            Map<Integer, Class<? extends b>> map = f22622b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i10 : tags) {
                map.put(Integer.valueOf(i10), cls);
            }
            f22622b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i10, ByteBuffer byteBuffer) {
        b bVar;
        int n10 = e.n(byteBuffer);
        Map<Integer, Class<? extends b>> map = f22622b.get(Integer.valueOf(i10));
        if (map == null) {
            map = f22622b.get(-1);
        }
        Class<? extends b> cls = map.get(Integer.valueOf(n10));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            Logger logger = f22621a;
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i10) + " and tag " + Integer.toHexString(n10) + " found: " + cls);
            bVar = new o();
        } else {
            try {
                bVar = cls.newInstance();
            } catch (Exception e10) {
                Logger logger2 = f22621a;
                Level level = Level.SEVERE;
                logger2.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + n10, (Throwable) e10);
                throw new RuntimeException(e10);
            }
        }
        bVar.d(n10, byteBuffer);
        return bVar;
    }
}
