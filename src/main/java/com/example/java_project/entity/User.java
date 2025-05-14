package com.example.java_project.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Data
@Entity
@Table(name = "users")  // Указание имени таблицы
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)  // Указание уникальности и обязательности
    private String email;

    @Column(nullable = false)  // Обязательное поле
    private String password;

    @Column(name = "first_name")  // Имя столбца в БД
    private String firstName;

    @Column(name = "last_name")  // Имя столбца в БД
    private String lastName;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();  // Возвращает пустой список, можно настроить роли в будущем
    }

    @Override
    public String getUsername() {
        return email;  // Для UserDetails используется email в качестве имени пользователя
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;  // Учетная запись не истекла
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;  // Учетная запись не заблокирована
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;  // Учетные данные не истекли
    }

    @Override
    public boolean isEnabled() {
        return true;  // Пользователь включен
    }
}
