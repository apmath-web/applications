package com.apmath.applications.application.v1

import com.apmath.applications.application.v1.actions.v1LoanRequest
import com.apmath.applications.application.v1.actions.v1Info
import io.ktor.application.call
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route

internal fun Routing.v1() {

    v1Info()
    // other route groups here
    v1Application()
}

private fun Routing.v1Info() {

    route("v1") {
        get("info") {
            call.v1Info()
        }
    }
}

private fun Routing.v1Application() {

    route("v1") {
        post("{clientId}/{applicationId}") {
            val parameters = call.parameters
            call.v1LoanRequest(parameters["clientId"]!!, parameters["applicationId"]!!)
        }
    }
}
