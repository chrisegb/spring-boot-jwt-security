package com.flirtr.security.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.flirtr.security.auth.ApplicationUserRole.MOBILE_CLIENT;

@Repository("fake")
public class FakeApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        List<ApplicationUser> applicationUsers = List.of(
                new ApplicationUser(
                        MOBILE_CLIENT.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "iosclient",
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        MOBILE_CLIENT.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "androidclient",
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        MOBILE_CLIENT.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "webclient",
                        true,
                        true,
                        true,
                        true
                )
        );

        return applicationUsers;
    }
}
