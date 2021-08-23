package com.trian.data.utils

import com.trian.common.utils.network.*
import io.ktor.client.features.*
import io.ktor.http.cio.*
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

suspend fun <T : Any> safeApiCall(call: suspend () -> Any): NetworkStatus<T> {
//    try {
//        val response = call.invoke()
//        if (response.isSuccessful) {
//            if (response.body() != null) {
//                return NetworkStatus.Success(response.body())
//            }
//        }
//        return NetworkStatus.Error(response.message())
//    } catch (e: Exception) {
//        return when (e) {
//            is ConnectException -> {
//                NetworkStatus.Error(CONNECT_EXCEPTION)
//            }
//            is UnknownHostException -> {
//                NetworkStatus.Error(UNKNOWN_HOST_EXCEPTION)
//            }
//            is SocketTimeoutException -> {
//                NetworkStatus.Error(SOCKET_TIME_OUT_EXCEPTION)
//            }
//            is ResponseException -> {
//                NetworkStatus.Error(UNKNOWN_NETWORK_EXCEPTION)
//            }
//            else -> {
//                NetworkStatus.Error(UNKNOWN_NETWORK_EXCEPTION)
//            }
//        }
//    }
    return NetworkStatus.Error(UNKNOWN_HOST_EXCEPTION)
}