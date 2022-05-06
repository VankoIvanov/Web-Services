package com.example.webservices.service.impl;

import com.example.webservices.model.entity.UserEntity;
import com.example.webservices.model.service.UserServiceModel;
import com.example.webservices.repository.UserRepository;
import com.example.webservices.service.RoleService;
import com.example.webservices.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final RoleService roleService;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, RoleService roleService) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    @Override
    public void registerUser(UserServiceModel user) {
       /* UserEntity newUser = modelMapper.map(user, UserEntity.class);

        newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        newUser.setImageUrl("/images/user_placeholder.jpg");

        RoleEntity userRole = findRole(RoleNameEnum.USER);

        newUser.addRole(userRole);

        userRepository.save(newUser);

        UserDetails principal = applicationUserService.loadUserByUsername(newUser.getEmail());

        Authentication authentication = new UsernamePasswordAuthenticationToken(
                principal,
                newUser.getPassword(),
                principal.getAuthorities()
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        */
    }
}
