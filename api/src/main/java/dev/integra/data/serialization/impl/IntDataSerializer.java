package dev.integra.data.serialization.impl;

import dev.integra.api.data.IData;
import dev.integra.api.data.serialization.IDataSerializer;
import dev.integra.data.impl.IntData;

/**
 * Built-in serializer for {@link IntData}.
 *
 * @author milizm
 * @since 1.0.0
 */
public class IntDataSerializer implements IDataSerializer {
    @Override
    public Object serialize(IData object) {
        return object.getData();
    }

    @Override
    public IData deserialize(Object serialized) {
        return new IntData((int) serialized);
    }

    @Override
    public Class<?> getType() {
        return Integer.class;
    }
}
