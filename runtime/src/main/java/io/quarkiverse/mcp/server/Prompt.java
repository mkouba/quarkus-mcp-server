package io.quarkiverse.mcp.server;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotates a business method of a CDI bean as an exposed prompt template.
 * <p>
 * The method return type must be one of the following list:
 * <ul>
 * <li>{@code PromptResponse}</li>
 * <li>{@code PromptMessage}</li>
 * <li>{@code List<PromptMessage>}</li>
 * <li>{@code Uni<PromptResponse>}</li>
 * <li>{@code Uni<PromptMessage>}</li>
 * <li>{@code Uni<List<PromptMessage>>}</li>
 * </ul>
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Prompt {

    /**
     * Constant value for {@link #name()} indicating that the annotated element's name should be used as-is.
     */
    String ELEMENT_NAME = "<<element name>>";

    /**
     *
     */
    String name() default ELEMENT_NAME;

    /**
     *
     */
    String description() default "";

}
