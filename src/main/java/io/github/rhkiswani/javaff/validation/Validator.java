/*
 * Copyright 2016 Mohamed Kiswani.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.rhkiswani.javaff.validation;

import io.github.rhkiswani.javaff.validation.exceptions.ValidationException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Mohamed Kiswani
 * @since 0.0.23
 *
 */
public interface Validator<T> {
    void validate(T t) throws ValidationException;
    void validateList(List<T> t) throws ValidationException;
    void validateField(Field field, T t) throws ValidationException;
    void validateMethod(Method method, T t) throws ValidationException;
}