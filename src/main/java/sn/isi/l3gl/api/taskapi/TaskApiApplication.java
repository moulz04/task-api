package sn.isi.l3gl.api.taskapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"sn.isi.l3gl.api.taskapi", "sn.isi.l3gl.core.taskcore"})
@EntityScan(basePackages = "sn.isi.l3gl.core.taskcore.entity")
@EnableJpaRepositories(basePackages = "sn.isi.l3gl.core.taskcore.repository")
public class TaskApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApiApplication.class, args);
    }
}
