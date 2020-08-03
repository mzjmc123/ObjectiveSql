package com.github.braisdom.funcsql.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface Queryable {

    String name() default "";

    /**
     * Support List, Array, Object(bean class)
     *
     * @return Returns the type for querying results
     */
    Class<?> returnType() default List.class;

}
