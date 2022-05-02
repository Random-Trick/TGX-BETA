package p249r8;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p258s2.C8632e;

public class C8390l {
    public static Logger f27254a = Logger.getLogger(C8390l.class.getName());
    public static Map<Integer, Map<Integer, Class<? extends AbstractC8380b>>> f27255b = new HashMap();

    static {
        HashSet<Class<? extends AbstractC8380b>> hashSet = new HashSet();
        hashSet.add(C8384f.class);
        hashSet.add(C8392n.class);
        hashSet.add(AbstractC8380b.class);
        hashSet.add(C8387i.class);
        hashSet.add(AbstractC8389k.class);
        hashSet.add(C8391m.class);
        hashSet.add(C8377a.class);
        hashSet.add(C8388j.class);
        hashSet.add(C8386h.class);
        hashSet.add(C8383e.class);
        for (Class<? extends AbstractC8380b> cls : hashSet) {
            AbstractC8385g gVar = (AbstractC8385g) cls.getAnnotation(AbstractC8385g.class);
            int[] tags = gVar.tags();
            int objectTypeIndication = gVar.objectTypeIndication();
            Map<Integer, Class<? extends AbstractC8380b>> map = f27255b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            f27255b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static AbstractC8380b m12593a(int i, ByteBuffer byteBuffer) {
        AbstractC8380b bVar;
        int n = C8632e.m11861n(byteBuffer);
        Map<Integer, Class<? extends AbstractC8380b>> map = f27255b.get(Integer.valueOf(i));
        if (map == null) {
            map = f27255b.get(-1);
        }
        Class<? extends AbstractC8380b> cls = map.get(Integer.valueOf(n));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            Logger logger = f27254a;
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(n) + " found: " + cls);
            bVar = new C8393o();
        } else {
            try {
                bVar = cls.newInstance();
            } catch (Exception e) {
                Logger logger2 = f27254a;
                Level level = Level.SEVERE;
                logger2.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + n, (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        bVar.m12633d(n, byteBuffer);
        return bVar;
    }
}
