package com.almas.main;

import sun.misc.Unsafe;

/**
 * This class allocates a contiguous block of memory and stores two longs there
 * <p>
 * --------------|----------|------------|-------
 * key           |  value   |  key       | value
 * --------------|----------|------------|-------
 * <p>
 * The entry size is two longs
 * TODO: create hashing algorithm for open addressing
 */
public final class HashLongLongMap implements LongLongMap {

    /**
     * One entry can contain 2 longs.
     */
    private static final long ENTRY_SIZE = (long) (Long.BYTES << 1);

    private final Unsafe unsafe;

    /**
     *
     */
    private final long startAddress;

    /**
     * How many entries this map can handle
     */
    private final long maxEntries;

    public HashLongLongMap(final Unsafe unsafe, final long startAddress, final long capacity) {
        this.unsafe = unsafe;
        this.startAddress = startAddress;
        this.maxEntries = capacity / HashLongLongMap.ENTRY_SIZE;
        //clean up the memory
        this.unsafe.setMemory(startAddress, capacity, (byte) 0);

    }

    @Override
    public long put(final long key, final long value) {
        throw new UnsupportedOperationException("TODO implement");
    }

    @Override
    public long get(final long key) {
        throw new UnsupportedOperationException("TODO implement");
    }
}
