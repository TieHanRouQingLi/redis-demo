package com.redis.test;

import com.redis.model.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class RoleTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);

        Role role = new Role();
        role.setId(1L);
        role.setRolename("role_name-1");
        role.setNote("note_1");

        redisTemplate.opsForValue().set("role_1", role);

        Role role1 = (Role) redisTemplate.opsForValue().get("role_1");

        System.out.println(role1);
    }
}
