package com.almas.main;

import java.lang.reflect.Field;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sun.misc.Unsafe;

/**
 * {@link HashLongLongMap} test cases.
 */
public class HashLongLongTestCase {

    private static Unsafe unsafe;

    @BeforeAll
    public static void init() throws Exception {
        HashLongLongTestCase.unsafe = HashLongLongTestCase.fetchInstance();
    }

    @Test
    @Disabled("TODO::")
    public void testPut() {
        final HashLongLongMap hashLongLongMap = new HashLongLongMap(unsafe, 0, 0);
        hashLongLongMap.put(0L, 0L);
    }

    private static Unsafe fetchInstance() throws Exception {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        unsafe = (Unsafe) theUnsafe.get(null);
        return unsafe;
    }
}
