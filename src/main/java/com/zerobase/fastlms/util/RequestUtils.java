package com.zerobase.fastlms.util;

import lombok.extern.log4j.Log4j2;

import javax.servlet.http.HttpServletRequest;

@Log4j2
public class RequestUtils {
    public static String getUserAgent(HttpServletRequest request) {

        String agent = request.getHeader("USER-AGENT");
        log.info("Agent : " + agent);

        return agent;
    }

    public static String getClientIP(HttpServletRequest request) {

        String ip = request.getHeader("X-Forwarded-For");
        log.info("X-FORWARDED-FOR: " + ip);

        if (ip == null) {
            ip = request.getHeader("Proxy-Client-IP");
            log.info("Proxy-Client-IP: " + ip);
        }
        if (ip == null) {
            ip = request.getHeader("WL-Proxy-Client-IP");
            log.info("WL-Proxy-Client-IP: " + ip);
        }
        if (ip == null) {
            ip = request.getHeader("HTTP_CLIENT_IP");
            log.info("HTTP_CLIENT_IP: " + ip);
        }
        if (ip == null) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            log.info("HTTP_X_FORWARDED_FOR: " + ip);
        }
        if (ip == null) {
            ip = request.getRemoteAddr();
            log.info("getRemoteAddr: " + ip);
        }

        return ip;
    }
}
