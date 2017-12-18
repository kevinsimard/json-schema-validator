package com.kevinsimard.schema.validator.input;

import com.kevinsimard.schema.validator.AbstractValidator;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;

public class UserV1Validator extends AbstractValidator {

    private static JsonSchema schema;

    @Override
    protected JsonSchema getJsonSchema() {
        if (schema == null) {
            schema = JsonSchemaFactory.getInstance().getSchema(this.getClass()
                .getResourceAsStream("/schemas/input/user/v1.json"));
        }

        return schema;
    }
}
