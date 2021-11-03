package com.flirtr.security.auth;

public enum ApplicationUserPermission {
    MOBILE_CLIENT_READ("mobile:read"),
    MOBILE_CLIENT_WRITE("mobile:write"),
    WEB_CLIENT_READ("web:read"),
    WEB_CLIENT_WRITE("web:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
