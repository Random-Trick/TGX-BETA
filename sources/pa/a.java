package pa;

import ra.d;
import ra.k;
import ya.b;

public final class a {
    public static final <T> Class<T> a(b<T> bVar) {
        k.e(bVar, "<this>");
        Class<T> cls = (Class<T>) ((d) bVar).b();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? cls : Double.class;
            case 104431:
                return !name.equals("int") ? cls : Integer.class;
            case 3039496:
                return !name.equals("byte") ? cls : Byte.class;
            case 3052374:
                return !name.equals("char") ? cls : Character.class;
            case 3327612:
                return !name.equals("long") ? cls : Long.class;
            case 3625364:
                return !name.equals("void") ? cls : Void.class;
            case 64711720:
                return !name.equals("boolean") ? cls : Boolean.class;
            case 97526364:
                return !name.equals("float") ? cls : Float.class;
            case 109413500:
                return !name.equals("short") ? cls : Short.class;
            default:
                return cls;
        }
    }
}
