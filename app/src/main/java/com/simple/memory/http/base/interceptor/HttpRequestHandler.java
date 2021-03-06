package com.simple.memory.http.base.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public interface HttpRequestHandler {

    Response onHttpResultResponse(String httpResult, Interceptor.Chain chain, Response response);

    Request onHttpRequestBefore(Interceptor.Chain chain, Request request);

    HttpRequestHandler EMPTY = new HttpRequestHandler() {
        @Override
        public Response onHttpResultResponse(String httpResult, Interceptor.Chain chain, Response response) {
            return response;
        }

        @Override
        public Request onHttpRequestBefore(Interceptor.Chain chain, Request request) {
            return request;
        }
    };
}
