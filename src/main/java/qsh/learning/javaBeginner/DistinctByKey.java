package qsh.learning.javaBeginner;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class DistinctByKey<T> implements Predicate<T> {
    private final Function<T, Object> function;
    private final Set<Object> seenObjects = new HashSet<>();

    public static <T> Predicate<T> uniqueBy(Function<T, Object> mapToField) {
        return new DistinctByKey<>(mapToField);
    }

    private DistinctByKey(Function<T, Object> function) {
        this.function = function;
    }

    @Override
    public boolean test(T t) {
        return seenObjects.add(function.apply(t));
    }
}
