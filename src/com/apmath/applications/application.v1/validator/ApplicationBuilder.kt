package com.apmath.applications.application.v1.validator

import com.apmath.validation.builders.ObjectValidatorBuilder
import com.apmath.validation.simple.ComparableValidator
import com.apmath.validation.simple.RegexValidator

class ApplicationBuilder : ObjectValidatorBuilder() {

    init {

        append("clientId", ComparableValidator(min = 1))
        append("amount", ComparableValidator(min = 1L, max = 3000000000000000L))
        append("currency", RegexValidator("\\b[A-Z]{3}\\b"))
        append("loan", ComparableValidator(min = 1))

    }

}
