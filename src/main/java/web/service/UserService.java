package web.service;

import web.model.User;
import web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService{

    private final UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Получение всех пользователей
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Получение пользователя по id
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Сохранение нового пользователя
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Обновление пользователя
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Удаление пользователя по id
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}