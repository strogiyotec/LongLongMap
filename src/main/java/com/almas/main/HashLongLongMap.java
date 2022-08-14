package com.almas.main;

public final class HashLongLongMap implements LongLongMap{
    @Override
    public long put(final long key, final long value) {
        throw new UnsupportedOperationException("#put()");
    }

    @Override
    public long get(final long key) {
        throw new UnsupportedOperationException("#get()");
    }
}
