package com.codeup.deimosspringblog.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

//@Entity
//@Table(name = "user_roles")
public class UserWithRoles extends User implements UserDetails {

    public UserWithRoles(User user) {
        super(user);  // Call the copy constructor defined in User
    }
//
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private long id;
//
////        @Column(name = "user_id")
//        private long userId;
//
////        @Column(name = "role")
//        private String role;
//
//        public long getUserId() {
//            return userId;
//        }
//
//        public void setUserId(long userId) {
//            this.userId = userId;
//        }
//
//        public String getRole() {
//            return role;
//        }
//
//        public void setRole(String role) {
//            this.role = role;
//        }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String roles = ""; // Since we're not using the authorization part of the component
        return AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}