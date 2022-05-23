package ja;

public final class l {
    public static final l f15174a = new l();
    public static final boolean f15175b;

    static {
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        f15175b = property != null ? Boolean.parseBoolean(property) : false;
    }
}
